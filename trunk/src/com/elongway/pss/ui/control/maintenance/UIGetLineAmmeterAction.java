package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.action.domain.BLLwAmmeterAction;
import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.elongway.pss.ui.view.maintenance.UILineAmmeterForm;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.DataUtils;

/**
 * 线路电表配置信息维护 Action <br>
 * 
 * @author 乔有良
 * @version 1.0 2008-10-14
 */
public class UIGetLineAmmeterAction extends DispatchAction {
	/**
	 * 查询电表
	 */
	public ActionForward queryLineAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {		
				
		// -- 声明变量
		BLLwLineAmmeterFacade bLwLineAmmeterFacade =  new BLLwLineAmmeterFacade();
		String conditions = "";
			
		// -- 生成条件
		conditions = generateCondition(httpServletRequest,actionForm);
		System.out.println(conditions);
		
		// -- 分页查询
		PageRecord pageRecord = bLwLineAmmeterFacade.findByConditions(conditions, 0, 0);
		
		httpServletRequest.setAttribute("lineAmmeterList", pageRecord.getResult());
		
		// -- 成功跳转
		return (actionMapping.findForward("Success"));
	}
	
	/**
	 * 生成查询条件
	 */
	public String generateCondition(HttpServletRequest httpServletRequest,ActionForm actionForm){
		UILineAmmeterForm uiLineAmmeterForm = (UILineAmmeterForm)actionForm;
		
		// -- 取得表单
		String ammeterNo = uiLineAmmeterForm.getAmmeterNo();
		String lineCode = uiLineAmmeterForm.getLineCode();
		
		StringBuffer conditions = new StringBuffer();
		conditions.append(" 1=1 ");
		if (!"".equals(ammeterNo)) {
			conditions.append(" and ").append("ammeterNo = '").append(ammeterNo).append("'");
		}
		if (!"".equals(lineCode)) {
			conditions.append(" and ").append("lineCode = '").append(lineCode).append("'");
		}
		
		return conditions.toString();
	}
	
	/**
	 * 控制线路电表配置管理的跳转
	 */
	public ActionForward forwordLineAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		
		// -- 取得 form
		UILineAmmeterForm uiLineAmmeterForm = (UILineAmmeterForm) actionForm;
		String firstquery = httpServletRequest.getParameter("firstquery");
		String action = httpServletRequest.getParameter("action");
		
		// -- 第一次成功跳转
		if(firstquery!=null){
			
			return (actionMapping.findForward("firstSuccess"));
		}
		// -- 添加的跳转页面
		if("Create".equals(action)){
			uiLineAmmeterForm.setAction(action);
			httpServletRequest.setAttribute("uiLineAmmeterForm", uiLineAmmeterForm);
			return (actionMapping.findForward("addFirstSuccess"));
		}
		else
			return (actionMapping.findForward("addFirstSuccess"));
	}
}
