package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIAddLWCorporationUser extends Action {
	public ActionForward getLWPowerUserInfo(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		String userNo = httpServletRequest.getParameter("UserNo");
		System.out.println("ssssssssssssssssssssssssss");
		String userName = httpServletRequest.getParameter("UserName");
		String address = httpServletRequest.getParameter("Address");
		String accountBank = httpServletRequest.getParameter("accountBank");
		String taxNo = httpServletRequest.getParameter("taxNo");
		String accountNo = httpServletRequest.getParameter("accountNo");
		String industryType = httpServletRequest.getParameter("industryType");
		String voltage = httpServletRequest.getParameter("voltage");
		String lineNo = httpServletRequest.getParameter("lineNo");
		LwCoporationUserInfoDto lwCoporationUserInfoDto = new LwCoporationUserInfoDto();
		lwCoporationUserInfoDto.setUserNo(userNo);
		lwCoporationUserInfoDto.setUserName(userName);
		lwCoporationUserInfoDto.setAddress(address);
		lwCoporationUserInfoDto.setAccountBank(accountBank);
		lwCoporationUserInfoDto.setTaxNo(taxNo);
		lwCoporationUserInfoDto.setIndustryType(industryType);
		lwCoporationUserInfoDto.setVoltage(voltage);
		lwCoporationUserInfoDto.setLineNo(lineNo);
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		blLwCoporationUserInfoFacade.insert(lwCoporationUserInfoDto);
		return actionMapping.findForward("Success");

	}
}
