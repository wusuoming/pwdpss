package com.elongway.pss.ui.control.maintenance;
/**
 *线路用户对应信息维护 Action <br>
 * 查询
 * 
 * @author 王荣佳
 * @version 1.0 2008-10-07
 */

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.ui.view.maintenance.LWUserLineForm;

public class UIQueryLWUserLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		Collection UserLinecollection=new ArrayList();
		LWUserLineForm  lWUserLineForm=(LWUserLineForm)actionForm;
		/*String UserNo=lWUserLineForm.getUserNo();
		String UserName=lWUserLineForm.getUserName();
		String LineCode=lWUserLineForm.getLineCode();
		String ValidStatus=lWUserLineForm.getValidStatus();*/

		String UserNo=httpServletRequest.getParameter("UserNo");
		String UserName=httpServletRequest.getParameter("UserName");
		String LineCode=httpServletRequest.getParameter("LineCode");
		String ValidStatus=httpServletRequest.getParameter("ValidStatus");
		String condition=" 1=1";
		if(UserNo==null||"".equals(UserNo)){
			
		}else{
			condition+=" and UserNo'"+UserNo+"'";
		}
		if(UserName==null||"".equals(UserName)){
			
		}else{
			condition+=" and UserName='"+UserName+"'";
		}
		if(LineCode==null||"".equals(LineCode)){
			
		}else{
			condition+=" and LineCode='"+LineCode+"'";
		}
		if(ValidStatus==null||"".equals(ValidStatus)){
			
		}else{
			condition+=" and ValidStatus='"+ValidStatus+"'";
		}
		System.out.println("condition========"+condition);
		BLLwUserLineFacade  blLwUserLineFacade=new BLLwUserLineFacade();
		UserLinecollection=blLwUserLineFacade.findByConditions(condition);
		httpServletRequest.setAttribute("powerLine", UserLinecollection);
		return actionMapping.findForward("viewLineUser");
	}

}
