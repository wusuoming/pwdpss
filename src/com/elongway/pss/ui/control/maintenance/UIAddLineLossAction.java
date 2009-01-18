package com.elongway.pss.ui.control.maintenance;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLineLossFacade;
import com.elongway.pss.bl.facade.BLTransforFacade;
import com.elongway.pss.dto.domain.LineLossDto;
import com.elongway.pss.dto.domain.TransforDto;

public class UIAddLineLossAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String LineCode=httpServletRequest.getParameter("LineCode");
		String R=httpServletRequest.getParameter("R");
		String lineLong=httpServletRequest.getParameter("lineLong");
		String volt=httpServletRequest.getParameter("volt");
		String t=httpServletRequest.getParameter("t");
		BLLineLossFacade  blLineLossFacade=new BLLineLossFacade();
		LineLossDto  lineLossDto=new LineLossDto();
		lineLossDto.setLineCode(LineCode);
		lineLossDto.setR(Double.parseDouble(R));
		lineLossDto.setLineLong(Double.parseDouble(lineLong));
		lineLossDto.setVolt(Double.parseDouble(volt));
		lineLossDto.setT(Double.parseDouble(t));
		blLineLossFacade.insert(lineLossDto);
		
		String condition="1=1 ";
		Collection lineLoss=blLineLossFacade.findByConditions(condition);
		httpServletRequest.setAttribute("lineLoss", lineLoss);
		
		return actionMapping.findForward("showLineLoss");
	
	}
}
