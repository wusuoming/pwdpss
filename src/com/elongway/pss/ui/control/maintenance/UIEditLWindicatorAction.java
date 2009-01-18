package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwindicatorFacade;
import com.elongway.pss.dto.domain.LwindicatorDto;

public class UIEditLWindicatorAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String LineCode=httpServletRequest.getParameter("LineCode");
		String AmmeterNo=httpServletRequest.getParameter("AmmeterNo");
		String StatMonth=httpServletRequest.getParameter("StatMonth");
		
		String ThisWorkNum=httpServletRequest.getParameter("ThisWorkNum");
		String ThisIdleNum=httpServletRequest.getParameter("ThisIdleNum");
	
		BLLwindicatorFacade blLwindicatorFacade=new BLLwindicatorFacade();
		LwindicatorDto lwindicatorDto=new LwindicatorDto();
		lwindicatorDto.setLineCode(LineCode);
		lwindicatorDto.setAmmeterNo(AmmeterNo);
		lwindicatorDto.setStatMonth(StatMonth);
		
	
	
		lwindicatorDto.setThisIdleNum(Integer.parseInt(ThisIdleNum));
		lwindicatorDto.setThisWorkNum(Integer.parseInt(ThisWorkNum));
		blLwindicatorFacade.update(lwindicatorDto);
		return actionMapping.findForward("Success");
	}


}
