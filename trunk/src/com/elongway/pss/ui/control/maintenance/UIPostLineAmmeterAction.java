package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.elongway.pss.ui.view.maintenance.UILineAmmeterForm;
import com.sinosoft.sysframework.common.util.DataUtils;

/**
 * 线路电表信息维护 Action <br>
 * 增加、修改、删除
 * 
 * @author 乔有良
 * @version 1.0 2008-10-07
 */
public class UIPostLineAmmeterAction extends DispatchAction {
	/**
	 * 增加电表
	 */
	public ActionForward addLineAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {				
		
		UILineAmmeterForm uiLineAmmeterForm = (UILineAmmeterForm)actionForm;
		String ammeterNo = uiLineAmmeterForm.getAmmeterNo();
		// -- 声明变量
		BLLwLineAmmeterFacade bLwLineAmmeterFacade = new BLLwLineAmmeterFacade();
		LwLineAmmeterDto lwLineAmmeterDto = new LwLineAmmeterDto();
		
		// -- 对象转换
		formToDto(httpServletRequest, lwLineAmmeterDto);
		
		// -- 增加操作
		bLwLineAmmeterFacade.insert(lwLineAmmeterDto);
		
		// -- 成功跳转
		return (actionMapping.findForward("Success"));
	}
	/**
	 * 电表的UIform 转换成 DTO
	 */
	public void formToDto(HttpServletRequest httpServletRequest,LwLineAmmeterDto lwLineAmmeterDto){
		String ammeterNo = httpServletRequest.getParameter("ammeterNo");
		String lineCode = httpServletRequest.getParameter("lineCode");
		String validStatus = httpServletRequest.getParameter("validStatus");
		
		lwLineAmmeterDto.setAmmeterNo(ammeterNo);
		lwLineAmmeterDto.setLineCode(lineCode);
		lwLineAmmeterDto.setValidStatus(validStatus);
	}
	
	/**
	 * 控制电表管理的跳转
	 */
	public ActionForward forwordAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		
		// -- 取得 form
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm) actionForm;
		String firstquery = httpServletRequest.getParameter("firstquery");
		String action = httpServletRequest.getParameter("action");
		
		// -- 第一次成功跳转
		if(firstquery!=null){
			httpServletRequest.setAttribute("firstquery", firstquery);
			return (actionMapping.findForward("firstSuccess"));
		}
		// -- 添加的跳转页面
		if("Create".equals(action)){
			uiGetAmmeterForm.setAction(action);
			httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
			return (actionMapping.findForward("addFirstSuccess"));
		}
		else
			return (actionMapping.findForward("addFirstSuccess"));
	}
	/**
	 * 修改电表
	 */
	public ActionForward updateLineAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {				
		UILineAmmeterForm uiLineAmmeterForm = (UILineAmmeterForm)actionForm;
		// -- 声明变量
		BLLwLineAmmeterFacade blLwLineAmmeterFacade = new BLLwLineAmmeterFacade();
		LwLineAmmeterDto lwLineAmmeterDto  = null;
		String forwardStr = "";
		// -- 第一次查询
		String firstquery = httpServletRequest.getParameter("firstquery");
		// -- 多选框
		String[] checkboxSelect =  httpServletRequest.getParameterValues("checkboxSelect");
		// -- 表号
		String[] ammeterNo = httpServletRequest.getParameterValues("ammeterNo");
		// -- 线路代码
		String[] lineCode = httpServletRequest.getParameterValues("lineCode");
		    // -- 如果第一次查询
		if("1".equals(firstquery)){			
			lwLineAmmeterDto = blLwLineAmmeterFacade.findByPrimaryKey(lineCode[Integer.parseInt(checkboxSelect[0])],ammeterNo[Integer.parseInt(checkboxSelect[0])]);
			// -- 对象转换
			dtoToForm(lwLineAmmeterDto, uiLineAmmeterForm);
			// -- 跳转
			forwardStr = "Success";
		}else{
			// -- 表号
			String ammeterNo1 = uiLineAmmeterForm.getAmmeterNo();
			String lineCode1 = uiLineAmmeterForm.getLineCode();
			// -- 查找现有表的记录
			lwLineAmmeterDto = blLwLineAmmeterFacade.findByPrimaryKey(lineCode1, ammeterNo1);
			// -- 为DTO赋值
			updateOrgDto(uiLineAmmeterForm, lwLineAmmeterDto);
			// -- 更新
			blLwLineAmmeterFacade.update(lwLineAmmeterDto);
			forwardStr = "UpdateSuccess";
		}		
		
		// -- 成功跳转
		return (actionMapping.findForward(forwardStr));
	}
	
	public void updateOrgDto(UILineAmmeterForm uiLineAmmeterForm,LwLineAmmeterDto lwLineAmmeterDto){

		// 是否有效
		String validStatus = uiLineAmmeterForm.getValidStatus();
		
		lwLineAmmeterDto.setValidStatus(validStatus);
	}
	/**
	 * 线路电表配置的 DTO 转换成 form
	 */
	public void dtoToForm(LwLineAmmeterDto lwLineAmmeterDto,UILineAmmeterForm uiLineAmmeterForm){
		DataUtils.copySimpleObject(uiLineAmmeterForm,lwLineAmmeterDto );
	}
	/**
	 * 删除电表信息
	 * 
	 */
	public ActionForward deleteLineAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {		
		// -- 取得 form
		UILineAmmeterForm uiLineAmmeterForm = (UILineAmmeterForm)actionForm;
		// -- 声明变量
		BLLwLineAmmeterFacade blLwLineAmmeterFacade = new BLLwLineAmmeterFacade();
		String action = httpServletRequest.getParameter("action");
		
		// -- 第一次成功跳转
		if("many".equals(action)){
			
			// -- 取得删除的电表个数
			String[] checkboxSelect =  httpServletRequest.getParameterValues("checkboxSelect");
			String[] ammeterNo = httpServletRequest.getParameterValues("ammeterNo");
			String[] lineCode = httpServletRequest.getParameterValues("lineCode");
			for (int i = 0; i < checkboxSelect.length; i++) {
				// -- 批量删除
				blLwLineAmmeterFacade.delete(lineCode[Integer.parseInt(checkboxSelect[i])],ammeterNo[Integer.parseInt(checkboxSelect[i])]);
			}			
			return (actionMapping.findForward("manySuccess"));
		}		
		else{
			// -- 表号
			String ammeterNo = uiLineAmmeterForm.getAmmeterNo();
			String lineCode = uiLineAmmeterForm.getLineCode();
			// -- 单条删除
			blLwLineAmmeterFacade.delete(lineCode, ammeterNo);
			return (actionMapping.findForward("oneSuccess"));
		}
	}
}
