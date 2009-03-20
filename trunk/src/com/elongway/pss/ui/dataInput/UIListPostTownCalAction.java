package com.elongway.pss.ui.dataInput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwBookUserFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;
import com.elongway.pss.dto.custom.SalePriceDto;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.ui.view.datainput.UITownCalForm;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.util.DataUtils;
import com.sinosoft.sysframework.exceptionlog.UserException;

/**
 * 直供乡指针初始化 Action <br>
 * 计算、保存
 * 
 * @author 乔有良 add
 * @version 1.0 2008-10-25
 */
public class UIListPostTownCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		// 声明变量
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		// 跳转
		String forword = "";
		// 查找乡的条件
		String townCondition = "";
		String promoteStr = null;
		String cal = "";
		Collection changeList = null;
		LwAmmeterChangeDto lwAmmeterChangeDto = null;
		LwAmmeterBookDto lwAmmeterBookDto = null;
		// 统计年月
		String statMonth = null;
		LwPowerUserDto userDto = null;
		String price = null;
		SalePriceDto salePriceDto = null;
		String tempCondition = null;
		StringBuffer condition = new StringBuffer();
		Collection calList = null;
		
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwBookUserFacade blLwBookUserFacade = new BLLwBookUserFacade();
		BLLwTownIndicatorFacade blLWTownIndicatorFacade = new BLLwTownIndicatorFacade();
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		BLLwTownPriceSummaryFacade blLwTownPriceSummaryFacade = new BLLwTownPriceSummaryFacade();
		// 乡镇代码
		cal = httpServletRequest.getParameter("calculation");
		String town = httpServletRequest.getParameter("town");
		String bookNo = httpServletRequest.getParameter("bookNo");
		Collection<UITownCalForm> formList = new ArrayList();
	
		

		lwAmmeterBookDto = blLwAmmeterBookFacade.findByPrimaryKey(bookNo);
		// 组织条件
		if (cal == null) {
			townCondition = "";
			String userNo = "";
			String userName = "";
			String address = "";
			httpServletRequest.setAttribute("query", "1");
			statMonth = PowerFeeCal.getCurrentBillMonth();
			// 得到该表本的用电用户列表
			Collection<LwBookUserDto> bookUserList = blLwBookUserFacade
					.findByConditions(" bookNo = '" + bookNo
							+ "' order by serialNo asc");
			tempCondition = PowerFeeCal.getBookNoCondition(bookUserList);
			condition.append(" 1=1 ").append(tempCondition).append(" and ").append(" statmonth = '").append(statMonth).append("'");
			calList = blLwTownPriceSummaryFacade.findByConditions(condition.toString());			
			promoteStr = lwAmmeterBookDto.getBookName()+"表本已经计算过 "+statMonth+" 的电费。";
			if(calList.size()>0){
				throw new UserException(-6, -712, this.getClass().getName(),promoteStr);
			}
			Collection<LwTownIndicatorDto> indicatorList = blLWTownIndicatorFacade
					.findByConditions(condition.toString());
			for (Iterator iterator = indicatorList.iterator(); iterator
					.hasNext();) {
				LwTownIndicatorDto lwTownIndicatorDto = (LwTownIndicatorDto) iterator
						.next();
				userNo = lwTownIndicatorDto.getUserNo();
				userDto = blLwPowerUserFacade.findByPrimaryKey(userNo);
				userName = userDto.getUserName();
				address = userDto.getAddress();
				lwTownIndicatorDto.setUserName(userName);
				lwTownIndicatorDto.setAddress(address);
				salePriceDto = blCalPowerFeeCustomFacade
						.getIndicatorPrice(userDto.getSaleVoltLevel());
				changeList = blLwAmmeterChangeFacade
						.findByConditions(" userNo = '" + userNo
								+ "' and flag = '1'");
				if (changeList != null & changeList.size() != 0) {
					Iterator it = changeList.iterator();
					lwAmmeterChangeDto = (LwAmmeterChangeDto) it.next();
					lwTownIndicatorDto.setAmmeterNo(lwAmmeterChangeDto
							.getAmmeterNo());
				}
				blCalPowerFeeCustomFacade.getIndicatorPrice(salePriceDto,
						lwTownIndicatorDto);
			}
			forword = "listSuccess";
			httpServletRequest.setAttribute("lwAmmeterBookDto",
					lwAmmeterBookDto);
			httpServletRequest.setAttribute("indicatorList", indicatorList);
			// 按乡查询
		} else {

			townCondition = " towncode = '" + town + "'";
			// 得到用电用户列表
			Collection<LwPowerUserDto> userList = blLwPowerUserFacade
					.findByConditions(townCondition);
			Collection townList = bLwDcodeFacade
					.findByConditions(" codetype = 'TownCode' And codecode = '"
							+ town + "'");
			LwDcodeDto lwDcodeDto = null;
			if (townList != null) {
				Iterator iterator = townList.iterator();
				lwDcodeDto = (LwDcodeDto) iterator.next();
			}

			this.copyUserInfo(userList, formList);
			httpServletRequest.setAttribute("formList", formList);
			httpServletRequest.setAttribute("townName", lwDcodeDto
					.getCodeCName());
			forword = "townInputSuccess";
			httpServletRequest.setAttribute("formList", formList);
		}

		return actionMapping.findForward(forword);
	}

	/**
	 * 拷贝用户信息到FORM中
	 * 
	 * @author 乔有良 2008-10-28 太原
	 * @param userList
	 * @param formList
	 */
	public void copyUserInfo(Collection<LwPowerUserDto> userList,
			Collection<UITownCalForm> formList) {
		UITownCalForm form = null;
		for (Iterator iterator = userList.iterator(); iterator.hasNext();) {
			LwPowerUserDto dto = (LwPowerUserDto) iterator.next();
			form = new UITownCalForm();
			DataUtils.copySimpleObject(form, dto);
			formList.add(form);
		}

	}

	/**
	 * 拷贝指针信息
	 * 
	 * @author 乔有良 2008-10-28 太原
	 * @param
	 * @param formList
	 */
	public void copyIndicatorInfo(Collection<LwTownIndicatorDto> indicatorList,
			Collection<UITownCalForm> formList) {
		UITownCalForm form = null;
		for (Iterator iterator = indicatorList.iterator(); iterator.hasNext();) {
			LwTownIndicatorDto dto = (LwTownIndicatorDto) iterator.next();
			form = new UITownCalForm();
			DataUtils.copySimpleObject(dto, form);
			formList.add(form);
		}

	}
}
