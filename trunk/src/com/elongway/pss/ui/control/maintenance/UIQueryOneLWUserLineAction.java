package com.elongway.pss.ui.control.maintenance;
/**
 *单条线路用户对应信息维护 Action <br>
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

import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;
import com.elongway.pss.ui.view.maintenance.LWUserLineForm;

public class UIQueryOneLWUserLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		Collection UserLinecollection=new ArrayList();
		LWUserLineForm  lwUserLineForm=(LWUserLineForm)actionForm;
		/*String UserNo=addLWPowerUserForm.getUserNo();
		String UserName=addLWPowerUserForm.getUserName();
		String Address=addLWPowerUserForm.getAddress();
		String ValidStatus=addLWPowerUserForm.getValidStatus();
		String TownCode=addLWPowerUserForm.getTownCode();*/
		String UserLineId=httpServletRequest.getParameter("UserLineId");
		String[]  UserLine=UserLineId.split(";");
		//String UserName=httpServletRequest.getParameter("UserName");
		//String Address=httpServletRequest.getParameter("Address");
		//String ValidStatus=httpServletRequest.getParameter("ValidStatus");
		//String TownCode=httpServletRequest.getParameter("TownCode");
		String condition="1=1 ";
		String UserNo=UserLine[0];
		String LineCode=UserLine[1];
	
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
		
		BLLwUserLineFacade  blLwUserLineFacade=new BLLwUserLineFacade();
		LwUserLineDto lwUserLineDto=blLwUserLineFacade.findByPrimaryKey(UserNo, LineCode);
		httpServletRequest.setAttribute("powerUser", lwUserLineDto);
		return actionMapping.findForward("viewOneUserLine");
	}


}
