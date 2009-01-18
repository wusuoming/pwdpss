package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;

public class UIEditPLWPowerUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		AddLWPowerUserForm  addLWPowerUserForm=(AddLWPowerUserForm)actionForm;
		/*String UserNo=addLWPowerUserForm.getUserNo();
		String UserName=addLWPowerUserForm.getUserName();
		String Address=addLWPowerUserForm.getAddress();
		String ValidStatus=addLWPowerUserForm.getValidStatus();
		String TownCode=addLWPowerUserForm.getTownCode();
		String Remark=addLWPowerUserForm.getRemark();*/
		String UserNo=httpServletRequest.getParameter("UserNo");
		String UserName=httpServletRequest.getParameter("UserName");
		String Address=httpServletRequest.getParameter("Address");
		String ValidStatus=httpServletRequest.getParameter("ValidStatus");
		String TownCode=httpServletRequest.getParameter("TownCode");
		String Remark=httpServletRequest.getParameter("Remark");
		BLLwPowerUserFacade  blLwPowerUserFacade=new BLLwPowerUserFacade();
		LwPowerUserDto lwPowerUserDto=new LwPowerUserDto();
		lwPowerUserDto.setUserNo(UserNo);
		lwPowerUserDto.setUserName(UserName);
		lwPowerUserDto.setAddress(Address);
		lwPowerUserDto.setValidStatus(ValidStatus);
		lwPowerUserDto.setTownCode(TownCode);
		//lwPowerUserDto.setRemark(Remark);
		blLwPowerUserFacade.insert(lwPowerUserDto);
		return actionMapping.findForward("");
	
	}

}
