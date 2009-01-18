package com.elongway.pss.ui.control.maintenance;
/**
 *用户信息维护 Action <br>
 * 删除
 * 
 * @author 王荣佳
 * @version 1.0 2008-10-07
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerUserFacade;

public class UIDeleteLWPowerUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

		BLLwPowerUserFacade  blLwPowerUserFacade=new BLLwPowerUserFacade();
		String UserId=httpServletRequest.getParameter("UserId");
		String[] Userno=UserId.split(",");
	

		for(int i=0;i<Userno.length;i++){
		blLwPowerUserFacade.delete(Userno[i]);
		}
		
		return actionMapping.findForward("Success");
		
	}
	
	}


