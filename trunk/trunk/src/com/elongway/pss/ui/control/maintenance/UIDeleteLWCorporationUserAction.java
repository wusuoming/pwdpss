package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;

public class UIDeleteLWCorporationUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		//String[] UserNo=httpServletRequest.getParameterValues("chooseUser");
		String UserId=httpServletRequest.getParameter("UserId");
		String[] Userno=UserId.split(",");
		//System.out.println(UserNo.length);
	
		BLLwCoporationUserInfoFacade  blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		for(int i=0;i<Userno.length;i++){
			blLwCoporationUserInfoFacade.delete(Userno[i]);
			BLLwAmmeterChangeFacade blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
			blLwAmmeterChangeFacade.deleteByConditions("Userno='"+Userno[i]+"'");
		/*	BLLwUserLineFacade blLwUserLineFacade=new BLLwUserLineFacade();
			blLwUserLineFacade.deleteByConditions("Userno='"+Userno[i]+"'");*/
			BLLwNewFactoryIndicatorFacade  blLwNewFactoryIndicatorFacade=new BLLwNewFactoryIndicatorFacade();
			blLwNewFactoryIndicatorFacade.deleteByConditions("Userno='"+Userno[i]+"'");
		
		}
		
		return actionMapping.findForward("Success");
		
	}

}
