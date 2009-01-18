package com.elongway.pss.ui.control.maintenance;

/**
 *直供乡用电用户信息维护 Action <br>
 * 增加
 * 
 * @author 王荣佳
 * 
 * @version 1.0 2008-10-07
 * @version 1.1 2008-11-03 update by qiaoyouliang
 */

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.domain.BLLwDcodeAction;
import com.elongway.pss.bl.facade.BLLWUserCustomFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;
import com.elongway.pss.util.AppConst;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIAddLWPowerUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		AddLWPowerUserForm addLWPowerUserForm = (AddLWPowerUserForm) actionForm;
		BLLwUserLineFacade blLwUserLineFacade = new BLLwUserLineFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		// 用户信息
		String userNo = httpServletRequest.getParameter("UserNo");
		String userName = httpServletRequest.getParameter("UserName");
		String Address = httpServletRequest.getParameter("Address");
		String ValidStatus = httpServletRequest.getParameter("ValidStatus");
		String TownCode = httpServletRequest.getParameter("TownCode");
		String saleVoltLevel = httpServletRequest.getParameter("voltLevel");
		String company = httpServletRequest.getParameter("company");
		// 表本信息
		String bookNo = httpServletRequest.getParameter("bookNo");
		LwAmmeterBookDto lwAmmeterBookDto = blLwAmmeterBookFacade
				.findByPrimaryKey(bookNo);
		LwBookUserDto lwBookUserDto = new LwBookUserDto();
		lwBookUserDto.setBookNo(bookNo);
		lwBookUserDto.setBookName(lwAmmeterBookDto.getBookName());
		lwBookUserDto.setSerialNo(0);
		lwBookUserDto.setUserNo(userNo);

		if (blLwPowerUserFacade.findByPrimaryKey(userNo) != null) {
			throw new UserException(-98, -1101, this.getClass().getName());
		}

		// 比例分摊信息
		String people = httpServletRequest.getParameter("people");
		String notPeople = httpServletRequest.getParameter("notPeople");
		String business = httpServletRequest.getParameter("business");
		String notFactory = httpServletRequest.getParameter("notFactory");
		String produce = httpServletRequest.getParameter("produce");
		String farm = httpServletRequest.getParameter("farm");

		// 电表信息
		String ammeterNo = httpServletRequest.getParameter("ammeterNo");
		String ammeterV = httpServletRequest.getParameter("ammeterV");
		String ammeterA = httpServletRequest.getParameter("ammeterA");
		String ammeterX = httpServletRequest.getParameter("ammeterX");
		String ammeterType = httpServletRequest.getParameter("ammeterType");
		String factoryName = httpServletRequest.getParameter("factoryName");
		String coust = httpServletRequest.getParameter("coust");
		String precision = httpServletRequest.getParameter("precision");
		String rate = httpServletRequest.getParameter("rate");
		String installDate = httpServletRequest.getParameter("installDate");

		// 线路信息
		String lineCode = httpServletRequest.getParameter("lineCode");

		// 换表
		LwAmmeterChangeDto lwAmmeterChangeDto = new LwAmmeterChangeDto();
		lwAmmeterChangeDto.setUserNo(userNo);
		lwAmmeterChangeDto.setUserName(userName);
		lwAmmeterChangeDto.setAmmeterA(ammeterA);
		lwAmmeterChangeDto.setAmmeterV(ammeterV);
		lwAmmeterChangeDto.setAmmeterX(ammeterX);
		lwAmmeterChangeDto.setAmmeterNo(ammeterNo);
		lwAmmeterChangeDto.setAmmeterType(ammeterType);
		lwAmmeterChangeDto.setCoust(coust);
		lwAmmeterChangeDto.setFactoryName(factoryName);
		lwAmmeterChangeDto.setPrecision(precision);
		lwAmmeterChangeDto.setRate(rate);
		lwAmmeterChangeDto.setId(new Long(System.currentTimeMillis())
				.toString());
		lwAmmeterChangeDto.setFlag(AppConst.CURRENT_AMMETER_FLAG);
		lwAmmeterChangeDto.setInstallDate(installDate);

		// 用户信息DTO
		LwPowerUserDto lwPowerUserDto = new LwPowerUserDto();
		lwPowerUserDto.setUserNo(userNo);
		lwPowerUserDto.setUserName(userName);
		lwPowerUserDto.setAddress(Address);
		lwPowerUserDto.setValidStatus(ValidStatus);
		lwPowerUserDto.setTownCode(TownCode);
		lwPowerUserDto.setSaleVoltLevel(saleVoltLevel);
		lwPowerUserDto.setLineCode(lineCode);
		lwPowerUserDto.setSuperClass(company);

		// 比例分摊DTO
		LwProrateDto lwProrateDto = new LwProrateDto();
		lwProrateDto.setUserNo(userNo);
		lwProrateDto.setAgricultural(Double.parseDouble(farm));
		lwProrateDto.setResident(Double.parseDouble(people));
		lwProrateDto.setIndecisive(Double.parseDouble(notPeople));
		lwProrateDto.setIndustry(Double.parseDouble(notFactory));
		lwProrateDto.setBusiness(Double.parseDouble(business));
		lwProrateDto.setProduce(Double.parseDouble(produce));
		lwProrateDto.setValidStatus("1");

		new BLLWUserCustomFacade().saveUserInfo(lwPowerUserDto, lwProrateDto,
				lwAmmeterChangeDto, lwBookUserDto);
		Collection townList = blLwDcodeFacade
				.findByConditions(" codetype = 'TownCode'");
		Collection<LwPowerUserDto> powerUserList = blLwPowerUserFacade
				.findByConditions(" towncode = '" + TownCode + "'");
		for (Iterator iterator = powerUserList.iterator(); iterator.hasNext();) {
			LwPowerUserDto lwPowerUserDto1 = (LwPowerUserDto) iterator.next();
			for (Iterator iterator2 = townList.iterator(); iterator2.hasNext();) {
				LwDcodeDto o = (LwDcodeDto) iterator2.next();
				if (lwPowerUserDto1.getTownCode().equals(o.getCodeCode())) {
					lwPowerUserDto1.setTownName(o.getCodeCName());
					break;
				}
			}
		}
		httpServletRequest.setAttribute("powerUser", powerUserList);

		return actionMapping.findForward("Success");
	}

	public void orgnizeUserLine(HttpServletRequest httpServletRequest,
			LwUserLineDto lwUserLineDto) {

	}

}
