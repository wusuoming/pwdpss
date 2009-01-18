package com.elongway.pss.ui.control.maintenance;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Collection;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLineLossFacade;
import com.elongway.pss.bl.facade.BLTransforFacade;
import com.elongway.pss.dto.domain.TransforDto;

public class UIEditTransforAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String transforName=httpServletRequest.getParameter("transforName");
		String phone=httpServletRequest.getParameter("phone");
		String kongzaiLoss=httpServletRequest.getParameter("kongzaiLoss");
		String duanluLoss=httpServletRequest.getParameter("duanluLoss");
		String contentPower=httpServletRequest.getParameter("contentPower");
		String useHour=httpServletRequest.getParameter("useHour");
		String kongzaiCT=httpServletRequest.getParameter("kongzaiCT");
		String duanluPT=httpServletRequest.getParameter("duanluPT");
		String suplyHour=httpServletRequest.getParameter("suplyHour");
		TransforDto transforDto=new TransforDto();
		BLTransforFacade blTransforFacade=new BLTransforFacade();
		transforDto.setTransforName(transforName);
		transforDto.setPhone(phone);
		transforDto.setKongzaiLoss(Double.parseDouble(kongzaiLoss)/100);
		transforDto.setDuanluLoss(Double.parseDouble(duanluLoss)/100);
		transforDto.setContentPower(Double.parseDouble(contentPower));
		transforDto.setUseHour(Double.parseDouble(useHour));
		transforDto.setKongzaiCT(Double.parseDouble(kongzaiCT)/100);
		transforDto.setDuanluPT(Double.parseDouble(duanluPT)/100);
		transforDto.setSuplyHour(Double.parseDouble(suplyHour));
		blTransforFacade.update(transforDto);
		
		String condition="1=1 ";
		BLLineLossFacade  blLineLossFacade=new BLLineLossFacade();
		Collection lineLoss=blLineLossFacade.findByConditions(condition);
		httpServletRequest.setAttribute("lineLoss",lineLoss);
		
		return actionMapping.findForward("Success");
		

	}
}
