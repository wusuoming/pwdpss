package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.sinosoft.sysframework.common.util.DataUtils;

/**
 * 电表信息维护 Action <br>
 * 增加、修改、删除
 * 
 * @author 乔有良
 * @version 1.0 2008-10-07
 */
public class UIPostAmmeterAction extends DispatchAction {
	/**
	 * 增加电表
	 */
	public ActionForward addAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {				
		
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm)actionForm;
		String ammeterNo = uiGetAmmeterForm.getAmmeterNo();
		// -- 声明变量
		BLLwAmmeterFacade bLwAmmeterFacade = new BLLwAmmeterFacade();
		LwAmmeterDto lwAmmeterDto = new LwAmmeterDto();	
		
		// -- 对象转换
		formToDto(httpServletRequest, lwAmmeterDto);
		
		// -- 增加操作
		bLwAmmeterFacade.insert(lwAmmeterDto);
		
		// -- 成功跳转
		return (actionMapping.findForward("CreateSuccess"));
	}
	/**
	 * 电表的UIform 转换成 DTO
	 */
	public void formToDto(HttpServletRequest httpServletRequest,LwAmmeterDto lwAmmeterDto){
		String ammeterNo = httpServletRequest.getParameter("ammeterNo");
		String ammeterX = httpServletRequest.getParameter("ammeterX");
		String ammeterV = httpServletRequest.getParameter("ammeterV");
		String ammeterA = httpServletRequest.getParameter("ammeterA");
		String factoryName = httpServletRequest.getParameter("factoryName");
		String ammeterType = httpServletRequest.getParameter("ammeterType");
		String coust = httpServletRequest.getParameter("coust");
		String precision = httpServletRequest.getParameter("precision");
		String rate = httpServletRequest.getParameter("rate");
		String allowDate = httpServletRequest.getParameter("allowDate");
		String validStatus = httpServletRequest.getParameter("validStatus");
		String maxnum = httpServletRequest.getParameter("maxnum");

		lwAmmeterDto.setAmmeterNo(ammeterNo);
		lwAmmeterDto.setAmmeterX(ammeterX);
		lwAmmeterDto.setAmmeterV(ammeterV);
		lwAmmeterDto.setAmmeterA(ammeterA);
		lwAmmeterDto.setFactoryName(factoryName);
		lwAmmeterDto.setAmmeterType(ammeterType);
		lwAmmeterDto.setCoust(coust);
		lwAmmeterDto.setPrecision(precision);
		lwAmmeterDto.setRate(rate);
		lwAmmeterDto.setMaxnum(Integer.parseInt(maxnum));
		lwAmmeterDto.setAllowDate(allowDate);
		lwAmmeterDto.setValidStatus(validStatus);
		
		lwAmmeterDto.setValidStatus(validStatus);
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
	public ActionForward updateAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {				
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm)actionForm;
		// -- 声明变量
		BLLwAmmeterFacade bLwAmmeterFacade = new BLLwAmmeterFacade();
		LwAmmeterDto lwAmmeterDto  = null;
		String forwardStr = "";
		String firstquery = httpServletRequest.getParameter("firstquery");
		String[] checkboxSelect =  httpServletRequest.getParameterValues("checkboxSelect");
		String[] ammeterNo = httpServletRequest.getParameterValues("ammeterNo");
		    // -- 如果第一次查询
		if("1".equals(firstquery)){			
			lwAmmeterDto = bLwAmmeterFacade.findByPrimaryKey(ammeterNo[Integer.parseInt(checkboxSelect[0])]);
			// -- 对象转换
			dtoToForm(lwAmmeterDto, uiGetAmmeterForm);
			// -- 跳转
			forwardStr = "Success";
		}else{
			// -- 表号
			String ammeterNo1 = uiGetAmmeterForm.getAmmeterNo();
			// -- 查找现有表的记录
			lwAmmeterDto = bLwAmmeterFacade.findByPrimaryKey(ammeterNo1);
			// -- 为DTO赋值
			updateOrgDto(uiGetAmmeterForm, lwAmmeterDto);
			// -- 更新
			bLwAmmeterFacade.update(lwAmmeterDto);
			System.out.println(ammeterNo1);
			forwardStr = "UpdateSuccess";
		}		
		
		
		// -- 成功跳转
		return (actionMapping.findForward(forwardStr));
	}
	
	public void updateOrgDto(UIGetAmmeterForm uiGetAmmeterForm,LwAmmeterDto lwAmmeterDto){
		// 表号
		String ammeterNo1 = uiGetAmmeterForm.getAmmeterNo();
		String ammeterX = uiGetAmmeterForm.getAmmeterX();
		String ammeterV = uiGetAmmeterForm.getAmmeterV();
		String ammeterA = uiGetAmmeterForm.getAmmeterA();
		String factoryName = uiGetAmmeterForm.getFactoryName();
		String coust = uiGetAmmeterForm.getCoust();
		String precision = uiGetAmmeterForm.getPrecision();
		String rate = uiGetAmmeterForm.getRate();
		int maxnum = uiGetAmmeterForm.getMaxnum();
		String allowDate = uiGetAmmeterForm.getAllowDate();
		String validStatus = uiGetAmmeterForm.getValidStatus();
		
		lwAmmeterDto.setAmmeterNo(ammeterNo1);
		lwAmmeterDto.setAmmeterX(ammeterX);
		lwAmmeterDto.setAmmeterV(ammeterV);
		lwAmmeterDto.setAmmeterA(ammeterA);
		lwAmmeterDto.setFactoryName(factoryName);
		lwAmmeterDto.setCoust(coust);
		lwAmmeterDto.setPrecision(precision);
		lwAmmeterDto.setRate(rate);
		lwAmmeterDto.setMaxnum(maxnum);
		lwAmmeterDto.setAllowDate(allowDate);
		lwAmmeterDto.setValidStatus(validStatus);
	}
	/**
	 * 电表的 DTO 转换成 form
	 */
	public void dtoToForm(LwAmmeterDto lwAmmeterDto,UIGetAmmeterForm uiGetAmmeterForm){
		DataUtils.copySimpleObject(uiGetAmmeterForm,lwAmmeterDto );
	}
	/**
	 * 删除电表信息
	 * 
	 */
	public ActionForward deleteAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {		
		// -- 取得 form
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm) actionForm;
		String action = httpServletRequest.getParameter("action");
		BLLwAmmeterFacade bLwAmmeterFacade = new BLLwAmmeterFacade();
		
		// -- 第一次成功跳转
		if("many".equals(action)){
			
			// -- 取得删除的电表个数
			String[] checkboxSelect =  httpServletRequest.getParameterValues("checkboxSelect");
			String[] ammeterNo = httpServletRequest.getParameterValues("ammeterNo");
			for (int i = 0; i < checkboxSelect.length; i++) {
				// -- 批量删除
				bLwAmmeterFacade.delete(ammeterNo[Integer.parseInt(checkboxSelect[i])]);
			}			
			return (actionMapping.findForward("manySuccess"));
		}		
		else{
			// -- 表号
			String ammeterNo1 = uiGetAmmeterForm.getAmmeterNo();
			// -- 单条删除
			bLwAmmeterFacade.delete(ammeterNo1);
			return (actionMapping.findForward("oneSuccess"));
		}
	}
}
