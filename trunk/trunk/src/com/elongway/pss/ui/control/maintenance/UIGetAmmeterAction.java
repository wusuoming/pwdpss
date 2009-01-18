package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.action.domain.BLLwAmmeterAction;
import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.DataUtils;

/**
 * 电表信息维护 Action <br>
 * 查询
 * 
 * @author 乔有良
 * @version 1.0 2008-10-09
 */
public class UIGetAmmeterAction extends DispatchAction {
	/**
	 * 查询电表
	 */
	public ActionForward queryAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {		
				
		// -- 声明变量
		BLLwAmmeterFacade bLwAmmeterFacade = new BLLwAmmeterFacade();
		String conditions = "";
			
		// -- 生成条件
		conditions = generateCondition(httpServletRequest,actionForm);
		System.out.println(conditions);
		
		// -- 分页查询
		PageRecord pageRecord = bLwAmmeterFacade.findByConditions(conditions, 0, 0);
		
		httpServletRequest.setAttribute("ammeterList", pageRecord.getResult());
		
		// -- 成功跳转
		return (actionMapping.findForward("Success"));
	}
	
	/**
	 * 生成查询条件
	 */
	public String generateCondition(HttpServletRequest httpServletRequest,ActionForm actionForm){
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm)actionForm;
		
		// -- 取得表单
		String ammeterNo = uiGetAmmeterForm.getAmmeterNo();
		
		StringBuffer conditions = new StringBuffer();
		conditions.append(" 1=1 ");
		if (!"".equals(ammeterNo)) {
			conditions.append(" and ").append("ammeterNo = '").append(ammeterNo).append("'");
		}
			
		return conditions.toString();
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
}
