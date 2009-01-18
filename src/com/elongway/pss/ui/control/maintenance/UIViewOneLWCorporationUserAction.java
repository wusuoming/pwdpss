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
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.bl.facade.BLLwctFacade;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.dto.domain.LwctDto;

public class UIViewOneLWCorporationUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String UserId=httpServletRequest.getParameter("UserId");
		String[] UserIdtmp=UserId.split(",");
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto lwCoporationUserInfoDto=new LwCoporationUserInfoDto();
		lwCoporationUserInfoDto=blLwCoporationUserInfoFacade.findByPrimaryKey(UserIdtmp[0]);
		String conditons="1=1 and flag=1 and USERNO='"+UserIdtmp[0]+"'";
		String condtions="1=1  and USERNO='"+UserIdtmp[0]+"'";
		
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
		Collection au=blLwAmmeterChangeFacade.findByConditions(conditons);
		System.out.println("ssss"+au.size());
		//BLLwUserLineFacade blLwUserLineFacade=new BLLwUserLineFacade();
		/*LwUserLineDto lwUserLineDto=new LwUserLineDto();
		Collection ul=blLwUserLineFacade.findByConditions(condtions);
		httpServletRequest.setAttribute("ul", ul);*/
		httpServletRequest.setAttribute("au", au);
		httpServletRequest.setAttribute("lwCoporationUserInfoDto", lwCoporationUserInfoDto);
		return actionMapping.findForward("viewOneLWCorporation");
		

}
}
