package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;

public class UIDeleteLWWholeSaleUserAction extends Action {
	
		public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
			//String[] UserNo=httpServletRequest.getParameterValues("chooseUser");
			String UserId=httpServletRequest.getParameter("UserId");
			String[] Userno=UserId.split(",");
			//System.out.println(UserNo.length);
			
			BLLwWholeSaleUserInfoFacade  blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
			for(int i=0;i<Userno.length;i++){
				blLwWholeSaleUserInfoFacade.delete(Userno[i]);
				BLLwAmmeterChangeFacade blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
				blLwAmmeterChangeFacade.deleteByConditions("Userno='"+Userno[i]+"'");
			
				BLLwProrateFacade blLwProrateFacade=new BLLwProrateFacade();
				blLwProrateFacade.delete(Userno[i]);
				BLLwWholeSaleIndicatorFacade blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
				blLwWholeSaleIndicatorFacade.deleteByConditions("Userno='"+Userno[i]+"'");
				
			}
			
			return actionMapping.findForward("Success");
			
		}
	}
