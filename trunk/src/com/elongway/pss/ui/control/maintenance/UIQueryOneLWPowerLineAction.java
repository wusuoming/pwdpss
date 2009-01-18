package com.elongway.pss.ui.control.maintenance;
/**
 *单条线路信息维护 Action <br>
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
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;
import com.elongway.pss.ui.view.maintenance.LWPowerLineForm;

public class UIQueryOneLWPowerLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		Collection PowerLinecollection=new ArrayList();
		LWPowerLineForm  lwPowerLineForm=(LWPowerLineForm)actionForm;
		/*String UserNo=addLWPowerUserForm.getUserNo();
		String UserName=addLWPowerUserForm.getUserName();
		String Address=addLWPowerUserForm.getAddress();
		String ValidStatus=addLWPowerUserForm.getValidStatus();
		String TownCode=addLWPowerUserForm.getTownCode();*/
		String UserLineNo=httpServletRequest.getParameter("UserLineNo");
		String[] UserLineNo1=UserLineNo.split(",");
		//String UserName=httpServletRequest.getParameter("UserName");
		//String Address=httpServletRequest.getParameter("Address");
		//String ValidStatus=httpServletRequest.getParameter("ValidStatus");
		//String TownCode=httpServletRequest.getParameter("TownCode");
		String condition="1=1 ";
		
		//if(UserName==null||"".equals(UserName)){
			
		//}else{
		//	condition+="and UserName="+UserName ;
		//}
		//if(Address==null||"".equals(Address)){
			
		//}else{
		//	condition+="and Address="+Address ;
		//}
		//if(ValidStatus==null||"".equals(ValidStatus)){
		//	
		//}else{
		//	condition+="and ValidStatus="+ValidStatus ;
	//	}
		//if(TownCode==null||"".equals(TownCode)){
			
		//}else{
		//	condition+="and TownCode="+TownCode ;
		//}
	
		BLLwPowerLineFacade  blLwPowerLineFacade=new BLLwPowerLineFacade();
		LwPowerLineDto lwPowerLineDto=blLwPowerLineFacade.findByPrimaryKey(UserLineNo1[0]);
		httpServletRequest.setAttribute("powerLine", lwPowerLineDto);
		return actionMapping.findForward("viewOnePowerLine");
	}

}
