package com.elongway.pss.ui.control.statistic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownGouDianFaxingFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.dto.custom.SalePriceDto;
import com.elongway.pss.dto.custom.TownSataDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownGouDianFaxingDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;

/**
 * �������۱�����̯
 * 
 * @author goodluck
 * 
 */
public class UIQueryTownStatFaxingAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		/** 0-�������� */
		BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
		Collection<LwDcodeDto> comList = blLwDcodeFacade
				.findByConditions(" codetype = 'SupplyCom'");
		String firstquery = httpServletRequest.getParameter("firstquery");
		String flag = httpServletRequest.getParameter("flag");
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwTownPriceSummaryFacade blLwTownPriceSummaryFacade = new BLLwTownPriceSummaryFacade();
		BLLwTownIndicatorFacade blLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		Collection<LwTownIndicatorDto> indicatorList = null;
		String condition = null;
		String forward = null;
		String company = null;
		String statMonth = null;
		Collection<LwPowerUserDto> userList = null;
		TownSataDto townSataDto = null;
		Collection<TownSataDto> resultList = null;
		Collection<LwTownGouDianFaxingDto> queryResult = null;
		resultList = new ArrayList<TownSataDto>();
		LwTownGouDianFaxingDto lwTownGouDianFaxingDto = null;
		BLLwTownGouDianFaxingFacade blLwTownGouDianFaxingFacade = new BLLwTownGouDianFaxingFacade();
		/** 1-�����ѯҳ�� */
		if ("1".equals(firstquery)) {
			httpServletRequest.setAttribute("supplycom", comList);
			httpServletRequest.setAttribute("flag", flag);
			forward = "Success";
		} else if(firstquery == null) {

			
				// ���ѡ��������
				for (Iterator iterator = comList.iterator(); iterator.hasNext();) {
					LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
					company = lwDcodeDto.getCodeCode();
					statMonth = PowerFeeCal.getCurrentBillMonth();
					statMonth = new DateTime(statMonth, DateTime.YEAR_TO_MONTH)
							.toString();
					userList = blLwPowerUserFacade
							.findByConditions("superclass = '" + company + "'");
					condition = PowerFeeCal.getUserCondition(userList);
					indicatorList = blLwTownIndicatorFacade
							.findByConditions(" 1=1  and statmonth = '"
									+ statMonth + "' " + condition);
					townSataDto = blCalPowerFeeCustomFacade
							.townFaxingStatByCompany(indicatorList, statMonth);
					townSataDto.setComCode(company);
					townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
					resultList.add(townSataDto);

				}
				townSataDto = PowerFeeCal.getSumCompanyStat(resultList,
						statMonth);
				townSataDto.setComCode("sum");
				resultList.add(townSataDto);
				httpServletRequest.setAttribute("resultList", resultList);
				httpServletRequest.setAttribute("statMonth", statMonth);
				forward = "statSuccess";

			}
		else{
			// �õ���������
			company = httpServletRequest.getParameter("company");
			statMonth = httpServletRequest.getParameter("inputDate");
			statMonth = new DateTime(statMonth, DateTime.YEAR_TO_MONTH)
					.toString();
			// ���ѡ��һ������
			if ((!"".equals(company)) && (!"sum".equals(company))) {
				
				lwTownGouDianFaxingDto = blLwTownGouDianFaxingFacade.findByPrimaryKey(company, statMonth);
				queryResult = new ArrayList<LwTownGouDianFaxingDto>();
				queryResult.add(lwTownGouDianFaxingDto);
			}else if ("sum".equals(company)) {
				lwTownGouDianFaxingDto = blLwTownGouDianFaxingFacade.findByPrimaryKey(company, statMonth);
				queryResult = new ArrayList<LwTownGouDianFaxingDto>();
				queryResult.add(lwTownGouDianFaxingDto);
			} else {
				queryResult  = blLwTownGouDianFaxingFacade.findByConditions("statMonth = '"+statMonth+"'");
			}
			httpServletRequest.setAttribute("statMonth", statMonth);
			httpServletRequest.setAttribute("company", company);
			httpServletRequest.setAttribute("queryResult", queryResult);
			forward = "queryGouDian";
		}
		
		return actionMapping.findForward(forward);

	}

}
