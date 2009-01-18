package com.elongway.pss.ui.control.maintenance;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;

public class UIlwCorporationUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String UserId=httpServletRequest.getParameter("UserId");
		String[] UserIdtmp=UserId.split(",");
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto lwCoporationUserInfoDto=new LwCoporationUserInfoDto();
		lwCoporationUserInfoDto=blLwCoporationUserInfoFacade.findByPrimaryKey(UserIdtmp[0]);
		String conditons="1=1 and flag=1 and USERNO='"+UserId+"'";
		String condtions="1=1  and USERNO='"+UserId+"'";
		
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
		Collection au=blLwAmmeterChangeFacade.findByConditions(conditons);
		httpServletRequest.setAttribute("au", au);
		httpServletRequest.setAttribute("lwCoporationUserInfoDto", lwCoporationUserInfoDto);
		return actionMapping.findForward("lwCorporation");
		

}
}
