package com.elongway.pss.ui.control.maintenance;
/**
 *用户信息维护 Action <br>
 * 修改
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

import com.elongway.pss.bl.facade.BLLWUserCustomFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;
import com.elongway.pss.util.AppConst;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIEditLWPowerUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		AddLWPowerUserForm  addLWPowerUserForm=(AddLWPowerUserForm)actionForm;
		BLLwPowerUserFacade  blLwPowerUserFacade=new BLLwPowerUserFacade();
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		BLLwProrateFacade blLwProrateFacade = new BLLwProrateFacade();
		// 用户信息
		String userNo=httpServletRequest.getParameter("userNo");
		String userName=httpServletRequest.getParameter("userName");
		String address=httpServletRequest.getParameter("address");
		String townCode=httpServletRequest.getParameter("townCode");
		String lineCode=httpServletRequest.getParameter("lineCode");
		String company = httpServletRequest.getParameter("company");
		String voltLevel = httpServletRequest.getParameter("voltLevel");

		LwPowerUserDto lwPowerUserDto=blLwPowerUserFacade.findByPrimaryKey(userNo);
		lwPowerUserDto.setUserName(userName);
		lwPowerUserDto.setAddress(address);
		lwPowerUserDto.setTownCode(townCode);
		lwPowerUserDto.setLineCode(lineCode);
		lwPowerUserDto.setSuperClass(company);
		lwPowerUserDto.setSaleVoltLevel(voltLevel);
		
		// 表本信息
		String bookNo = httpServletRequest.getParameter("bookNo");
		LwAmmeterBookDto lwAmmeterBookDto = blLwAmmeterBookFacade.findByPrimaryKey(bookNo);
		LwBookUserDto lwBookUserDto = new LwBookUserDto();
		lwBookUserDto.setBookNo(bookNo);
		lwBookUserDto.setBookName(lwAmmeterBookDto.getBookName());
		lwBookUserDto.setSerialNo(0);
		lwBookUserDto.setUserNo(userNo);
		
		
		
		// 比例分摊信息
		String people=httpServletRequest.getParameter("people");
		String notPeople=httpServletRequest.getParameter("notPeople");
		String business=httpServletRequest.getParameter("business");
		String notFactory=httpServletRequest.getParameter("notFactory");
		String produce=httpServletRequest.getParameter("produce");
		String farm=httpServletRequest.getParameter("farm");		
		
		// 比例分摊DTO
		LwProrateDto lwProrateDto = blLwProrateFacade.findByPrimaryKey(userNo);
		lwProrateDto.setAgricultural(Double.parseDouble(farm));
		lwProrateDto.setResident(Double.parseDouble(people));
		lwProrateDto.setIndecisive(Double.parseDouble(notPeople));
		lwProrateDto.setIndustry(Double.parseDouble(notFactory));
		lwProrateDto.setBusiness(Double.parseDouble(business));
		lwProrateDto.setProduce(Double.parseDouble(produce));
		lwProrateDto.setValidStatus("1");
		

		new BLLWUserCustomFacade().updateUserInfo(lwPowerUserDto, lwProrateDto, lwBookUserDto);	
		
		return actionMapping.findForward("Success");
	
	}

}
