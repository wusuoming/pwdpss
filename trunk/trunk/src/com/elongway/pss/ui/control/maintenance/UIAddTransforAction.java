package com.elongway.pss.ui.control.maintenance;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLTransforFacade;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.dto.domain.TransforDto;

public class UIAddTransforAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
	String transforName=httpServletRequest.getParameter("transforName");
	String phone=httpServletRequest.getParameter("phone");
	String kongzaiLoss=httpServletRequest.getParameter("kongzaiLoss");
	if(kongzaiLoss.equals("") || kongzaiLoss==null){
		kongzaiLoss = "0";
	}
	String duanluLoss=httpServletRequest.getParameter("duanluLoss");
	if(duanluLoss.equals("") || duanluLoss==null){
		duanluLoss = "0";
	}
	String contentPower=httpServletRequest.getParameter("contentPower");
	if(contentPower.equals("") || contentPower==null){
		contentPower = "0";
	}
	String useHour=httpServletRequest.getParameter("useHour");
	if(useHour.equals("") || useHour==null){
		useHour = "0";
	}
	String kongzaiCT=httpServletRequest.getParameter("kongzaiCT");
	if(kongzaiCT.equals("") || kongzaiCT==null){
		kongzaiCT = "0";
	}
	String duanluPT=httpServletRequest.getParameter("duanluPT");
	if(duanluPT.equals("") || duanluPT==null){
		duanluPT = "0";
	}
	String suplyHour=httpServletRequest.getParameter("suplyHour");
	if(suplyHour.equals("") || suplyHour==null){
		suplyHour = "0";
	}
	TransforDto transforDto=new TransforDto();
	BLTransforFacade blTransforFacade=new BLTransforFacade();
	transforDto.setTransforName(transforName);
	transforDto.setPhone(phone);
	transforDto.setKongzaiLoss(Double.parseDouble(kongzaiLoss));
	transforDto.setDuanluLoss(Double.parseDouble(duanluLoss));
	transforDto.setContentPower(Double.parseDouble(contentPower));
	transforDto.setUseHour(Double.parseDouble(useHour));
	transforDto.setKongzaiCT(Double.parseDouble(kongzaiCT));
	transforDto.setDuanluPT(Double.parseDouble(duanluPT));
	transforDto.setSuplyHour(Double.parseDouble(suplyHour));
	blTransforFacade.insert(transforDto);
	
	Collection transforcollection=blTransforFacade.findByConditions("");
	httpServletRequest.setAttribute("transfor", transforcollection);
	return actionMapping.findForward("showTransfor");
	

	

	

}

}
