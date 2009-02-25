package com.elongway.pss.ui.count;

import java.text.DecimalFormat;
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
import com.elongway.pss.bl.facade.BLLwAllWholeFeeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.custom.TownSataDto;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;

public class UIThisMonthAllCountAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		
		String counttype = httpServletRequest.getParameter("counttype");
		double sumffee = 0;
		double sumfpower = 0;
		double sumfdianfee = 0;
		double sumftax = 0;
		double sumfc = 0;
		double summfdianjinall = 0;
		double summfdianjin = 0;
		double sumfdianjintax = 0;
		double sumfsanxiaall = 0;
		double sumfsanxia = 0;
		double sumfsanxiatax = 0;
		double sumfjijinall = 0;
		double sumfjijin = 0;
		double sumfjijintax = 0;
		double sumallffee = 0;

		double sumtfee = 0;
		double sumtpower = 0;
		double sumtdianfee = 0;
		double sumttax = 0;
		double sumtc = 0;
		double summtdianjinall = 0;
		double summtdianjin = 0;
		double sumtdianjintax = 0;
		double sumtsanxiaall = 0;
		double sumtsanxia = 0;
		double sumtsanxiatax = 0;
		double sumtjijinall = 0;
		double sumtjijin = 0;
		double sumtjijintax = 0;
		double sumalltfee = 0;

		double sumwfee = 0;
		double sumwpower = 0;
		double sumwdianfee = 0;
		double sumwtax = 0;
		double sumwc = 0;
		double summwdianjinall = 0;
		double summwdianjin = 0;
		double sumwdianjintax = 0;
		double sumwsanxiaall = 0;
		double sumwsanxia = 0;
		double sumwsanxiatax = 0;
		double sumwjijinall = 0;
		double sumwjijin = 0;
		double sumwjijintax = 0;
		double pepolepowergd = 0;
		double notpepolepowergd = 0;
		double bizpowergd = 0;
		double productpowergd = 0;
		double industrypowergd = 0;
		double farmpowergd = 0;
		double pepolepowerjt = 0;
		double notpepolepowerjt = 0;
		double bizpowerjt = 0;
		double productpowerjt = 0;
		double industrypowerjt = 0;
		double farmpowerjt = 0;
		double sumallwfee = 0;

		double sumallfee = 0;
		double sumallpower = 0;
		double sumallc = 0;
		double sumalltax = 0;
		double sumallall = 0;
		double sumalldianjin = 0;
		double sumalldianjintax = 0;
		double sumallsanxia = 0;
		double sumallsanxiatax = 0;
		double sumalljijin = 0;

		double sumalljijintax = 0;
		// 差别电量
		double differenceQuantity = 0;
		double differenceQuantitygy = 0;
		double differenceQuantitydm = 0;
		double differenceQuantityjy = 0;
		double differenceQuantityty = 0;
		String conditions = null;
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade = new BLLwWholeSaleSummaryFacade();
		BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
		String company = null;
		Collection userList = null;
		String condition = null;
		Collection priceSummaryList = null;
		Collection resultList = new ArrayList();
		TownSataDto townSataDto = new TownSataDto();
		BLLwTownPriceSummaryFacade blLwTownPriceSummaryFacade = new BLLwTownPriceSummaryFacade();
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		// 当月统计
		if("1".equals(counttype)){
		
		
		String inputDate = httpServletRequest.getParameter("inputDate");
		httpServletRequest.setAttribute("inputDate", inputDate);
		String statmonth = inputDate.substring(0, 7);
		

		DecimalFormat df = new DecimalFormat("###0.00");

		conditions = " 1=1 and statmonth ='" + statmonth + "'";

		String conditionsgy = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='gy' ";
		String conditionsdm = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='dm' ";

		String conditionsjy = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='jy' ";

		String conditionsty = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='ty' ";

		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();
		// 查找当月所有大工业的计算结果
		Collection colf = blLwCorporationSummaryFacade
				.findByConditions(conditions);
		LwCorporationSummaryDto lwCorporationSummaryDto = new LwCorporationSummaryDto();
		Iterator itf = colf.iterator();
		// 遍历结构，得出电量、电费、电金、三峡、基金、
		while (itf.hasNext()) {
			lwCorporationSummaryDto = (LwCorporationSummaryDto) itf.next();
			sumfpower += lwCorporationSummaryDto.getSumPointerQuantity()
					+ lwCorporationSummaryDto.getBeforPower()
					+ lwCorporationSummaryDto.getLastPower();
			sumfdianfee += lwCorporationSummaryDto.getPointerFee()
					+ lwCorporationSummaryDto.getPowerRateFee()
					+ lwCorporationSummaryDto.getPeakFee()
					+ lwCorporationSummaryDto.getContentFee()
					+ lwCorporationSummaryDto.getNeedFee()
					+ lwCorporationSummaryDto.getUnDenizenFee();
			summfdianjinall += lwCorporationSummaryDto.getPowerFee();
			sumfsanxiaall += lwCorporationSummaryDto.getSanXiaFee();
			sumfjijinall += lwCorporationSummaryDto.getSurcharge();
			sumffee += PowerFeeCal.getValue(lwCorporationSummaryDto.getSumFee(), AppConst.TWO_DOT_FLAG);

		}

		// 四个局分别统计

		
		
		// 当月趸售计算结果
		Collection col = blLwWholeSaleSummaryFacade
				.findByConditions(conditions);
		Iterator it = col.iterator();
		while (it.hasNext()) {
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) it
					.next();
			// 得到各个局的差别电量
			differenceQuantity += Double
					.parseDouble("".equals(lwWholeSaleSummaryDto
							.getDifferenceQuantity()) ? "0"
							: lwWholeSaleSummaryDto.getDifferenceQuantity());
		}

		Collection colgy = blLwWholeSaleSummaryFacade
				.findByConditions(conditionsgy);
		Iterator itgy = colgy.iterator();
		while (itgy.hasNext()) {
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itgy
					.next();
			differenceQuantitygy += Double.parseDouble(lwWholeSaleSummaryDto
					.getDifferenceQuantity());
		}

		Collection coldm = blLwWholeSaleSummaryFacade
				.findByConditions(conditionsdm);
		Iterator itdm = coldm.iterator();
		while (itdm.hasNext()) {
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itdm
					.next();
			differenceQuantitydm += Double.parseDouble(lwWholeSaleSummaryDto
					.getDifferenceQuantity());
		}

		Collection coljy = blLwWholeSaleSummaryFacade
				.findByConditions(conditionsjy);
		Iterator itjy = coljy.iterator();
		while (itjy.hasNext()) {
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itjy
					.next();
			differenceQuantityjy += Double.parseDouble(lwWholeSaleSummaryDto
					.getDifferenceQuantity());
		}

		Collection colty = blLwWholeSaleSummaryFacade
				.findByConditions(conditionsty);
		Iterator itty = colty.iterator();
		while (itty.hasNext()) {
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itty
					.next();
			differenceQuantityty += Double.parseDouble(lwWholeSaleSummaryDto
					.getDifferenceQuantity());
		}

		BLLwAllWholeFeeFacade blLwAllWholeFeeFacade = new BLLwAllWholeFeeFacade();
		LwAllWholeFeeDto lwAllWholeFeeDtogy = blLwAllWholeFeeFacade
				.findByPrimaryKey("gy", statmonth);
		LwAllWholeFeeDto lwAllWholeFeeDtodm = blLwAllWholeFeeFacade
				.findByPrimaryKey("dm", statmonth);
		LwAllWholeFeeDto lwAllWholeFeeDtoty = blLwAllWholeFeeFacade
				.findByPrimaryKey("ty", statmonth);
		LwAllWholeFeeDto lwAllWholeFeeDtojy = blLwAllWholeFeeFacade
				.findByPrimaryKey("jy", statmonth);

		double sanxiagy = 0;
		double jijingy = 0;
		double dianjingy = 0;
		double sumpowergy = 0;
		double sumdianfeegy = 0;
		double pepolegy = 0;
		double notpepolegy = 0;
		double bizgy = 0;
		double industrygy = 0;
		double farmgy = 0;
		double productgy = 0;
		double sumallfeegy = 0;

		double sumpowerdm = 0;
		double sumdianfeedm = 0;
		double pepoledm = 0;
		double notpepoledm = 0;
		double bizdm = 0;
		double industrydm = 0;
		double farmdm = 0;
		double productdm = 0;
		double sanxiadm = 0;
		double jijindm = 0;
		double dianjindm = 0;
		double sumallfeedm = 0;

		double sumpowerjy = 0;
		double sumdianfeejy = 0;
		double pepolejy = 0;
		double notpepolejy = 0;
		double bizjy = 0;
		double industryjy = 0;
		double farmjy = 0;
		double productjy = 0;
		double sanxiajy = 0;
		double jijinjy = 0;
		double dianjinjy = 0;
		double sumallfeejy = 0;

		double sumpowerty = 0;
		double sumdianfeety = 0;
		double pepolety = 0;
		double notpepolety = 0;
		double bizty = 0;
		double industryty = 0;
		double farmty = 0;
		double productty = 0;
		double sanxiaty = 0;
		double jijinty = 0;
		double dianjinty = 0;
		double sumallfeety = 0;

		sumfc = sumfdianfee / 1.17;
		sumftax = sumfdianfee / 1.17 * 0.17;
		sumfdianjintax = summfdianjinall / 1.17 * 0.17;
		sumfsanxiatax = sumfsanxiaall / 1.17 * 0.17;
		sumfjijintax = sumfjijinall / 1.17 * 0.17;

		summfdianjin = summfdianjinall / 1.17;
		sumfsanxia = sumfsanxiaall / 1.17;
		sumfjijin = sumfjijinall / 1.17;

		sumwfee = sumwdianfee + summwdianjinall + sumwsanxiaall + sumwjijinall;
		/**
		 * 直供乡按局统计
		 */

		// 得到四个局的几个代码
		Collection<LwDcodeDto> comList = blLwDcodeFacade
				.findByConditions(" codetype = 'SupplyCom'");
		// 得到四个局的统计数据
		for (Iterator iterator = comList.iterator(); iterator.hasNext();) {
			LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
			company = lwDcodeDto.getCodeCode();
			inputDate = httpServletRequest.getParameter("inputDate");
			inputDate = new DateTime(inputDate, DateTime.YEAR_TO_MONTH)
					.toString();
			userList = blLwPowerUserFacade.findByConditions("superclass = '"
					+ company + "'");
			condition = PowerFeeCal.getUserCondition(userList);
			priceSummaryList = blLwTownPriceSummaryFacade
					.findByConditions(" 1=1  and statmonth = '" + inputDate
							+ "' " + condition);
			townSataDto = blCalPowerFeeCustomFacade.townStatByCompany(
					priceSummaryList, inputDate);
			townSataDto.setComCode(company);
			townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
			resultList.add(townSataDto);
		}
		// 四个局的统计汇总
		townSataDto = PowerFeeCal.getSumCompanyStat(resultList, inputDate);
		townSataDto.setCompanyName("小计");
		resultList.add(townSataDto);
		httpServletRequest.setAttribute("resultList", resultList);

		for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
			TownSataDto townSataDto1 = (TownSataDto) iterator.next();

			// sumtfee += ;
			sumtpower += townSataDto1.getSumPower();
			sumtdianfee += townSataDto1.getPurePowerFee();
			sumttax += townSataDto1.getPowerFeeTax();
			sumtc += townSataDto1.getPurePowerFee();
			summtdianjinall += townSataDto1.getSumJiJin();
			summtdianjin += townSataDto1.getPureDianJin();
			sumtdianjintax += townSataDto1.getDianJinTax();
			sumtsanxiaall += townSataDto1.getSumSanXia();
			sumtsanxia += townSataDto1.getPureSanXia();
			sumtsanxiatax += townSataDto1.getSanXiaTax();
			sumtjijinall += townSataDto1.getSumJiJin();
			sumtjijin += townSataDto1.getPureJiJin();
			sumtjijintax += townSataDto1.getJiJinTax();
			sumalltfee += townSataDto1.getSumPowerFee();
		}
		sumwc = ((Double.parseDouble(lwAllWholeFeeDtogy.getSumfee())
				- Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())
				- Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())
				- Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())
				- Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())
				- Double.parseDouble(lwAllWholeFeeDtogy.getJijin()) - Double
				.parseDouble(lwAllWholeFeeDtogy.getFujia1()))
				+ (Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())
						- Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())
						- Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())
						- Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())
						- Double
								.parseDouble(lwAllWholeFeeDtodm.getDianjintax())
						- Double.parseDouble(lwAllWholeFeeDtodm.getJijin()) - Double
						.parseDouble(lwAllWholeFeeDtodm.getFujia1()))
				+ (Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())
						- Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())
						- Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())
						- Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())
						- Double
								.parseDouble(lwAllWholeFeeDtoty.getDianjintax())
						- Double.parseDouble(lwAllWholeFeeDtoty.getJijin()) - Double
						.parseDouble(lwAllWholeFeeDtoty.getFujia1()))
				+ (Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())
						- Double.parseDouble(lwAllWholeFeeDtojy.getSanxia())
						- Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax())
						- Double.parseDouble(lwAllWholeFeeDtojy.getDianjin())
						- Double
								.parseDouble(lwAllWholeFeeDtojy.getDianjintax())
						- Double.parseDouble(lwAllWholeFeeDtojy.getJijin()) - Double
						.parseDouble(lwAllWholeFeeDtojy.getFujia1())) - differenceQuantity * 0.2) / 1.17;
		sumwfee = Double.parseDouble(lwAllWholeFeeDtogy.getSumfee())
				+ Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())
				+ Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())
				+ Double.parseDouble(lwAllWholeFeeDtojy.getSumfee());
		sumwpower = Double.parseDouble(lwAllWholeFeeDtogy.getPower1())
				+ Double.parseDouble(lwAllWholeFeeDtoty.getPower1())
				+ Double.parseDouble(lwAllWholeFeeDtodm.getPower1())
				+ Double.parseDouble(lwAllWholeFeeDtojy.getPower1());
		sumwtax = ((Double.parseDouble(lwAllWholeFeeDtogy.getSumfee())
				- Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())
				- Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())
				- Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())
				- Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())
				- Double.parseDouble(lwAllWholeFeeDtogy.getJijin()) - Double
				.parseDouble(lwAllWholeFeeDtogy.getFujia1()))
				+ (Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())
						- Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())
						- Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())
						- Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())
						- Double
								.parseDouble(lwAllWholeFeeDtodm.getDianjintax())
						- Double.parseDouble(lwAllWholeFeeDtodm.getJijin()) - Double
						.parseDouble(lwAllWholeFeeDtodm.getFujia1()))
				+ (Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())
						- Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())
						- Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())
						- Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())
						- Double
								.parseDouble(lwAllWholeFeeDtoty.getDianjintax())
						- Double.parseDouble(lwAllWholeFeeDtoty.getJijin()) - Double
						.parseDouble(lwAllWholeFeeDtoty.getFujia1()))
				+ (Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())
						- Double.parseDouble(lwAllWholeFeeDtojy.getSanxia())
						- Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax())
						- Double.parseDouble(lwAllWholeFeeDtojy.getDianjin())
						- Double
								.parseDouble(lwAllWholeFeeDtojy.getDianjintax())
						- Double.parseDouble(lwAllWholeFeeDtojy.getJijin()) - Double
						.parseDouble(lwAllWholeFeeDtojy.getFujia1())) - differenceQuantity * 0.2) / 1.17 * 0.17;
		summwdianjin = Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())
				+ Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())
				+ Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())
				+ Double.parseDouble(lwAllWholeFeeDtojy.getDianjin());
		sumwdianjintax = Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())
				+ Double.parseDouble(lwAllWholeFeeDtoty.getDianjintax())
				+ Double.parseDouble(lwAllWholeFeeDtodm.getDianjintax())
				+ Double.parseDouble(lwAllWholeFeeDtojy.getDianjintax());
		sumwsanxia = Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())
				+ Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())
				+ Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())
				+ Double.parseDouble(lwAllWholeFeeDtojy.getSanxia());
		sumwsanxiatax = Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())
				+ Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())
				+ Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())
				+ Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax());
		sumwjijin = Double.parseDouble(lwAllWholeFeeDtogy.getJijin())
				+ Double.parseDouble(lwAllWholeFeeDtoty.getJijin())
				+ Double.parseDouble(lwAllWholeFeeDtodm.getJijin())
				+ Double.parseDouble(lwAllWholeFeeDtojy.getJijin());
		sumwjijintax = Double.parseDouble(lwAllWholeFeeDtogy.getFujia1())
				+ Double.parseDouble(lwAllWholeFeeDtoty.getFujia1())
				+ Double.parseDouble(lwAllWholeFeeDtodm.getFujia1())
				+ Double.parseDouble(lwAllWholeFeeDtojy.getFujia1());

		sumallfee = sumfdianfee + sumwdianfee + townSataDto.getPowerFee();
		sumallpower = sumfpower + sumwpower + townSataDto.getSumPower();
		sumallc = sumwc + sumfc + townSataDto.getPurePowerFee();
		sumalltax = sumwtax + sumftax + townSataDto.getPowerFeeTax();
		sumallall = sumwfee + sumffee + townSataDto.getSumPowerFee();
		sumalldianjin = summwdianjin + summfdianjin + townSataDto.getPureDianJin();
		sumalldianjintax = sumwdianjintax + sumfdianjintax + townSataDto.getDianJinTax();
		sumallsanxia = sumwsanxia + sumfsanxia + townSataDto.getPureSanXia();
		sumallsanxiatax = sumwsanxiatax + sumfsanxiatax + townSataDto.getSanXiaTax();
		sumalljijin = sumwjijin + sumfjijin + townSataDto.getPureJiJin();
		sumalljijintax = sumwjijintax + sumfjijintax + townSataDto.getJiJinTax();

		httpServletRequest.setAttribute("sumffee", df.format(sumffee));
		httpServletRequest.setAttribute("sumfpower", Math.round(sumfpower));
		httpServletRequest.setAttribute("sumfdianfee", df.format(sumfdianfee));
		httpServletRequest.setAttribute("sumftax", df.format(sumftax));
		httpServletRequest.setAttribute("sumfc", df.format(sumfc));
		httpServletRequest
				.setAttribute("summfdianjin", df.format(summfdianjin));
		httpServletRequest.setAttribute("sumfdianjintax", df
				.format(sumfdianjintax));
		httpServletRequest.setAttribute("sumfsanxia", df.format(sumfsanxia));
		httpServletRequest.setAttribute("sumfsanxiatax", df
				.format(sumfsanxiatax));
		httpServletRequest.setAttribute("sumfjijin", df.format(sumfjijin));
		httpServletRequest
				.setAttribute("sumfjijintax", df.format(sumfjijintax));
		httpServletRequest.setAttribute("sumwfee", df.format(sumwfee));
		httpServletRequest.setAttribute("sumwpower", Math.round(sumwpower));
		httpServletRequest.setAttribute("sumwdianfee", df.format(sumwdianfee));
		httpServletRequest.setAttribute("sumwtax", df.format(sumwtax));
		httpServletRequest.setAttribute("sumwc", df.format(sumwc));
		httpServletRequest
				.setAttribute("summwdianjin", df.format(summwdianjin));
		httpServletRequest.setAttribute("sumwdianjintax", df
				.format(sumwdianjintax));

		httpServletRequest.setAttribute("sumwsanxia", df.format(sumwsanxia));
		httpServletRequest.setAttribute("sumwsanxiatax", df
				.format(sumwsanxiatax));
		httpServletRequest.setAttribute("sumwjijin", df.format(sumwjijin));
		httpServletRequest
				.setAttribute("sumwjijintax", df.format(sumwjijintax));

		httpServletRequest.setAttribute("sumallfee", df.format(sumallfee));
		httpServletRequest.setAttribute("sumallpower", Math.round(sumallpower));
		httpServletRequest.setAttribute("sumallc", df.format(sumallc));
		httpServletRequest.setAttribute("sumalltax", df.format(sumalltax));
		httpServletRequest.setAttribute("sumallall", df.format(sumallall));
		httpServletRequest.setAttribute("sumalldianjin", df
				.format(sumalldianjin));
		httpServletRequest.setAttribute("sumalldianjintax", df
				.format(sumalldianjintax));
		httpServletRequest
				.setAttribute("sumallsanxia", df.format(sumallsanxia));
		httpServletRequest.setAttribute("sumallsanxiatax", df
				.format(sumallsanxiatax));
		httpServletRequest.setAttribute("sumalljijin", df.format(sumalljijin));
		httpServletRequest.setAttribute("sumalljijintax", df
				.format(sumalljijintax));

		httpServletRequest.setAttribute("sanxiagy", df.format(sanxiagy / 1.17));
		httpServletRequest.setAttribute("jijingy", df.format(jijingy / 1.17));
		httpServletRequest.setAttribute("dianjingy", df
				.format(dianjingy / 1.17));
		httpServletRequest.setAttribute("sumpowergy", Math.round(sumpowergy));
		httpServletRequest.setAttribute("sumdianfeegy", df
				.format(sumdianfeegy / 1.17));

		httpServletRequest.setAttribute("sanxiajy", df.format(sanxiajy / 1.17));
		httpServletRequest.setAttribute("jijinjy", df.format(jijinjy / 1.17));
		httpServletRequest.setAttribute("dianjinjy", df
				.format(dianjinjy / 1.17));
		httpServletRequest.setAttribute("sumpowerjy", Math.round(sumpowerjy));
		httpServletRequest.setAttribute("sumdianfeejy", df
				.format(sumdianfeejy / 1.17));

		httpServletRequest.setAttribute("sanxiadm", df.format(sanxiadm / 1.17));
		httpServletRequest.setAttribute("jijindm", df.format(jijindm / 1.17));
		httpServletRequest.setAttribute("dianjindm", df
				.format(dianjindm / 1.17));
		httpServletRequest.setAttribute("sumpowerdm", Math.round(sumpowerdm));
		httpServletRequest.setAttribute("sumdianfeedm", df
				.format(sumdianfeedm / 1.17));

		httpServletRequest.setAttribute("sanxiaty", df.format(sanxiaty / 1.17));
		httpServletRequest.setAttribute("jijinty", df.format(jijinty / 1.17));
		httpServletRequest.setAttribute("dianjinty", df
				.format(dianjinty / 1.17));
		httpServletRequest.setAttribute("sumpowerty", Math.round(sumpowerty));
		httpServletRequest.setAttribute("sumdianfeety", df
				.format(sumdianfeety / 1.17));

		httpServletRequest.setAttribute("sumallfeejy", df.format(sumallfeejy));
		httpServletRequest.setAttribute("sumallfeegy", df.format(sumallfeegy));
		httpServletRequest.setAttribute("sumallfeedm", df.format(sumallfeedm));
		httpServletRequest.setAttribute("sumallfeety", df.format(sumallfeety));

		httpServletRequest.setAttribute("colf", colf);

		httpServletRequest.setAttribute("differenceQuantity",
				differenceQuantity * 0.2);
		httpServletRequest.setAttribute("differenceQuantitygy",
				differenceQuantitygy * 0.2);
		httpServletRequest.setAttribute("differenceQuantitydm",
				differenceQuantitydm * 0.2);
		httpServletRequest.setAttribute("differenceQuantityjy",
				differenceQuantityjy * 0.2);
		httpServletRequest.setAttribute("differenceQuantityty",
				differenceQuantityty * 0.2);

		httpServletRequest.setAttribute("lwAllWholeFeeDtogy",
				lwAllWholeFeeDtogy);
		httpServletRequest.setAttribute("lwAllWholeFeeDtodm",
				lwAllWholeFeeDtodm);
		httpServletRequest.setAttribute("lwAllWholeFeeDtojy",
				lwAllWholeFeeDtojy);
		httpServletRequest.setAttribute("lwAllWholeFeeDtoty",
				lwAllWholeFeeDtoty);

		return actionMapping.findForward("viewthisallcount");
		// 累计
		}else{
			String inputDate = httpServletRequest.getParameter("inputDate");
			inputDate = new DateTime(inputDate,DateTime.YEAR_TO_MONTH).toString();
			BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();
			// 组织累计条件
			conditions = this.getAddMonthCondition("2009-01", inputDate, "statMonth");
			/**
			 * 0 -- 得到累计所有大工业的计算结果
			 */
			Collection colf = getCorporationSumStat(conditions);
			// 趸售各个局累计计算条件
//			String tempCondition =  this.getAddMonthCondition("2009-01", inputDate, "inputdate");
//			String conditionsgy =tempCondition+" and upcompany='gy' ";
//			String conditionsdm = tempCondition+ " and upcompany='dm' ";
//			String conditionsjy = tempCondition+ " and upcompany='jy' ";
//			String conditionsty = tempCondition+ " and upcompany='ty' ";
//			
//			LwCorporationSummaryDto lwCorporationSummaryDto = null;
//			Iterator itf = colf.iterator();
//			// 遍历结构，得出电量、电费、电金、三峡、基金、
//			while (itf.hasNext()) {
//				lwCorporationSummaryDto = (LwCorporationSummaryDto) itf.next();
//				sumfpower += lwCorporationSummaryDto.getSumPointerQuantity()
//						+ lwCorporationSummaryDto.getBeforPower()
//						+ lwCorporationSummaryDto.getLastPower();
//				sumfdianfee += lwCorporationSummaryDto.getPointerFee()
//						+ lwCorporationSummaryDto.getPowerRateFee()
//						+ lwCorporationSummaryDto.getPeakFee()
//						+ lwCorporationSummaryDto.getContentFee()
//						+ lwCorporationSummaryDto.getNeedFee()
//						+ lwCorporationSummaryDto.getUnDenizenFee();
//				summfdianjinall += lwCorporationSummaryDto.getSurcharge();
//				sumfsanxiaall += lwCorporationSummaryDto.getPowerFee();
//				sumfjijinall += lwCorporationSummaryDto.getSurcharge();
//				sumffee += PowerFeeCal.getValue(lwCorporationSummaryDto.getSumFee(), AppConst.TWO_DOT_FLAG);
//			}		
			/**
			 * 1 -- 得到累计所有趸售的计算结果
			 */
//			Collection col = blLwWholeSaleSummaryFacade
//			.findByConditions(conditions);
//	Iterator it = col.iterator();
//	while (it.hasNext()) {
//		LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) it
//				.next();
//		// 得到各个局的差别电量
//		differenceQuantity += Double
//				.parseDouble("".equals(lwWholeSaleSummaryDto
//						.getDifferenceQuantity()) ? "0"
//						: lwWholeSaleSummaryDto.getDifferenceQuantity());
//	}
//
//	Collection colgy = blLwWholeSaleSummaryFacade
//			.findByConditions(conditionsgy);
//	Iterator itgy = colgy.iterator();
//	while (itgy.hasNext()) {
//		LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itgy
//				.next();
//		differenceQuantitygy += Double.parseDouble(lwWholeSaleSummaryDto
//				.getDifferenceQuantity());
//	}
//
//	Collection coldm = blLwWholeSaleSummaryFacade
//			.findByConditions(conditionsdm);
//	Iterator itdm = coldm.iterator();
//	while (itdm.hasNext()) {
//		LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itdm
//				.next();
//		differenceQuantitydm += Double.parseDouble(lwWholeSaleSummaryDto
//				.getDifferenceQuantity());
//	}
//
//	Collection coljy = blLwWholeSaleSummaryFacade
//			.findByConditions(conditionsjy);
//	Iterator itjy = coljy.iterator();
//	while (itjy.hasNext()) {
//		LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itjy
//				.next();
//		differenceQuantityjy += Double.parseDouble(lwWholeSaleSummaryDto
//				.getDifferenceQuantity());
//	}
//
//	Collection colty = blLwWholeSaleSummaryFacade
//			.findByConditions(conditionsty);
//	Iterator itty = colty.iterator();
//	while (itty.hasNext()) {
//		LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itty
//				.next();
//		differenceQuantityty += Double.parseDouble(lwWholeSaleSummaryDto
//				.getDifferenceQuantity());
//	}
//	
//	BLLwAllWholeFeeFacade blLwAllWholeFeeFacade = new BLLwAllWholeFeeFacade();
//	
//	Collection<LwAllWholeFeeDto> allWholeFeeListgy =blLwAllWholeFeeFacade.findByConditions(tempCondition+" and company = 'gy'");
//	LwAllWholeFeeDto lwAllWholeFeeDtogy = this.getAllWholeFee(allWholeFeeListgy, "gy", inputDate);
//	Collection allWholeFeeListdm =blLwAllWholeFeeFacade.findByConditions(tempCondition+" and company = 'dm'");
//	LwAllWholeFeeDto lwAllWholeFeeDtodm = this.getAllWholeFee(allWholeFeeListgy, "dm", inputDate);
//	Collection allWholeFeeListty =blLwAllWholeFeeFacade.findByConditions(tempCondition+" and company = 'ty'");
//	LwAllWholeFeeDto lwAllWholeFeeDtoty = this.getAllWholeFee(allWholeFeeListgy, "ty", inputDate);
//	Collection allWholeFeeListjy =blLwAllWholeFeeFacade.findByConditions(tempCondition+" and company = 'jy'");
//	LwAllWholeFeeDto lwAllWholeFeeDtojy = this.getAllWholeFee(allWholeFeeListgy, "jy", inputDate);
//	
//	Collection<LwDcodeDto> comList = blLwDcodeFacade
//	.findByConditions(" codetype = 'SupplyCom'");
//	// 得到四个局的统计数据
//			for (Iterator iterator = comList.iterator(); iterator.hasNext();) {
//				LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
//				company = lwDcodeDto.getCodeCode();
//				
//				userList = blLwPowerUserFacade
//						.findByConditions("superclass = '" + company + "'");
//				condition = PowerFeeCal.getUserCondition(userList);
//				priceSummaryList = blLwTownPriceSummaryFacade
//						.findByConditions(this.getAddMonthCondition("2009-01", inputDate, "statMonth")+ condition);
//				townSataDto = blCalPowerFeeCustomFacade.townStatByCompany(
//						priceSummaryList, inputDate);
//				townSataDto.setComCode(company);
//				townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
//				resultList.add(townSataDto);
//			}
//			// 四个局的统计汇总
//			townSataDto = PowerFeeCal.getSumCompanyStat(resultList, inputDate);
//			townSataDto.setCompanyName("小计");
//			resultList.add(townSataDto);
			httpServletRequest.setAttribute("resultList", resultList);
			httpServletRequest.setAttribute("inputDate", inputDate);
			
			
			return actionMapping.findForward("viewthisallcount");
		}
	}

	public String getAddMonthCondition(String startMonth, String endMonth,
			String column) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("1=1 and ").append(column).append(" between '").append(
				startMonth).append("' and '").append(endMonth).append("'");
		return buffer.toString();
	}
	public Collection<LwCorporationSummaryDto> getCorporationSumStat(String conditions) throws Exception{
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();
		String userNo = null;
		String userNotemp =  null;
		 String lineCode = "";
	    /** 属性统计年月 */
	     String statMonth = "";
	    /** 属性用电分类 */
	     String powerClass = "";
	    /** 属性总电量 */
	     double electricQuantity = 0D;
	    /** 属性三峡 */
	     double sanXiaFee = 0D;
	    /** 属性基金 */
	     double surcharge = 0D;
	    /** 属性电金 */
	     double powerFee = 0D;
	    /** 属性非居民电量 */
	     double unDenizenQuantity = 0D;
	    /** 属性有功电量 */
	     double pointerQuantity = 0D;
	    /** 属性有功电价 */
	     double pointerPrice = 0D;
	    /** 属性有功电费 */
	     double pointerFee = 0D;
	    /** 属性非居民电价 */
	     double unDenizenPrice = 0D;
	    /** 属性非居民电费 */
	     double unDenizenFee = 0D;
	    /** 属性调整值 */
	     double ajustRate = 0D;
	    /** 属性力率电费 */
	     double powerRateFee = 0D;
	    /** 属性功率因素 */
	     double rateCode = 0D;
	    /** 属性需量电量 */
	     double needQuantity = 0D;
	    /** 属性需量电价 */
	     double needPrice = 0D;
	    /** 属性需量电费 */
	     double needFee = 0D;
	    /** 属性容量电量 */
	     double contentQuantity = 0D;
	    /** 属性容量电价 */
	     double contentPrice = 0D;
	    /** 属性容量电费 */
	     double contentFee = 0D;
	    /** 属性无功电量 */
	     double unPointerQuantity = 0D;
	    /** 属性基金电价 */
	     double surchargePrice = 0D;
	    /** 属性三峡金电价 */
	     double sanXiaPrice = 0D;
	    /** 属性电金电价 */
	     double powerPrice = 0D;
	    /** 属性谷段电量 */
	     double valleyQuantity = 0D;
	    /** 属性峰段电量 */
	     double peakQuantity = 0D;
	    /** 属性峰段电价 */
	     double peakPrice = 0D;
	    /** 属性谷段电j价 */
	     double valleyPrice = 0D;
	    /** 属性峰段电费 */
	     double peakFee = 0D;
	    /** 属性古段电费 */
	     double valleyFee = 0D;
	    /** 属性变损电量 */
	     double lossQuantity = 0D;
	    /** 属性标志位 */
	     String flag = "";
	    /** 属性注释 */
	     String remark = "";
	    /** 属性电费合计 */
	     double sumFee = 0D;
	    /** 属性录入日期 */
	     String inputDate = "";
	    /** 属性抄见电量 */
	     double sumPointerQuantity = 0D;
	    /** 属性电量类型 */
	     String quantityStyle = "";
	    /** 属性改变前电价 */
	     double beforPrice = 0D;
	    /** 属性改变后电价 */
	     double lastPrice = 0D;
	    /** 属性改变前电量 */
	     double beforPower = 0D;
	    /** 属性改变后电量 */
	     double lastPower = 0D;
	    /** 属性改变前电费 */
	     double beforFee = 0D;
	    /** 属性改变后电费 */
	     double lastFee = 0D;
	    /** 属性是否发生改变 */
	     String ifchange = "";
	    /** 属性需量指针 */
	     double needPointer = 0D;
	    /** 属性有功线损电量 */
	     double lineLoss = 0D;
	    /** 属性无功线损电量 */
	     double unLineLoss = 0D;
	    /** 属性无功变损电量 */
	     double unLossQuantity = 0D;
		Collection <LwCoporationUserInfoDto>userList = blLwCoporationUserInfoFacade.findByConditions("1=1");
		Collection<LwCorporationSummaryDto> priceList = blLwCorporationSummaryFacade.findByConditions(conditions);
		Collection<LwCorporationSummaryDto> resultList = new ArrayList<LwCorporationSummaryDto>();
		LwCorporationSummaryDto summary = null;
		for (Iterator iterator = userList.iterator(); iterator.hasNext();) {
			LwCoporationUserInfoDto user = (LwCoporationUserInfoDto) iterator.next();
			userNo = user.getUserNo();
			for (Iterator iterator2 = priceList.iterator(); iterator2.hasNext();) {
				LwCorporationSummaryDto lwCorporationSummaryDto = (LwCorporationSummaryDto) iterator2
						.next();
				userNotemp = lwCorporationSummaryDto.getLineCode();
				summary = new LwCorporationSummaryDto();
				if(userNo.equals(userNotemp)){
					electricQuantity += lwCorporationSummaryDto.getElectricQuantity();				
				      sanXiaFee +=lwCorporationSummaryDto.getSanXiaFee();
				    /** 属性基金 */
				      surcharge +=lwCorporationSummaryDto.getSurcharge();
				    /** 属性电金 */
				      powerFee +=lwCorporationSummaryDto.getPowerFee();
				    /** 属性非居民电量 */
				      unDenizenQuantity +=lwCorporationSummaryDto.getUnDenizenQuantity();
				    /** 属性有功电量 */
				      pointerQuantity +=lwCorporationSummaryDto.getPointerQuantity();
				    /** 属性有功电价 */
				      pointerPrice +=lwCorporationSummaryDto.getPointerPrice();
				    /** 属性有功电费 */
				      pointerFee +=lwCorporationSummaryDto.getPointerFee();
				    /** 属性非居民电价 */
				      unDenizenPrice +=lwCorporationSummaryDto.getUnDenizenFee();
				    /** 属性非居民电费 */
				      unDenizenFee +=lwCorporationSummaryDto.getUnDenizenFee();				    
				    /** 属性力率电费 */
				      powerRateFee +=lwCorporationSummaryDto.getPowerRateFee();
				    /** 属性需量电量 */
				      needQuantity +=lwCorporationSummaryDto.getNeedQuantity();
				   
				    /** 属性需量电费 */
				      needFee +=lwCorporationSummaryDto.getNeedFee();
				    /** 属性容量电量 */
				      contentQuantity +=lwCorporationSummaryDto.getContentQuantity();
				    /** 属性容量电价 */
				      contentPrice +=lwCorporationSummaryDto.getContentPrice();
				    /** 属性容量电费 */
				      contentFee +=lwCorporationSummaryDto.getContentFee();
				    /** 属性无功电量 */
				      unPointerQuantity +=lwCorporationSummaryDto.getUnPointerQuantity();
				    /** 属性基金电价 */
				      surchargePrice +=lwCorporationSummaryDto.getSurchargePrice();
				    /** 属性三峡金电价 */
				      sanXiaPrice +=lwCorporationSummaryDto.getSanXiaPrice();
				    /** 属性电金电价 */
				      powerPrice +=lwCorporationSummaryDto.getPowerPrice();
				    /** 属性谷段电量 */
				      valleyQuantity +=lwCorporationSummaryDto.getValleyQuantity();
				    /** 属性峰段电量 */
				      peakQuantity +=lwCorporationSummaryDto.getPeakQuantity();
				    /** 属性峰段电价 */
				      peakPrice +=lwCorporationSummaryDto.getPeakPrice();
				    /** 属性谷段电j价 */
				      valleyPrice +=lwCorporationSummaryDto.getValleyPrice();
				    /** 属性峰段电费 */
				      peakFee +=lwCorporationSummaryDto.getPeakFee();
				    /** 属性古段电费 */
				      valleyFee +=lwCorporationSummaryDto.getValleyFee();
				    /** 属性变损电量 */
				      lossQuantity +=lwCorporationSummaryDto.getLossQuantity();
				   
				    /** 属性电费合计 */
				      sumFee +=lwCorporationSummaryDto.getSumFee();
				    
				    /** 属性抄见电量 */
				      sumPointerQuantity +=lwCorporationSummaryDto.getSumPointerQuantity();
				
				    
				    /** 属性改变前电量 */
				      beforPower +=lwCorporationSummaryDto.getBeforPower();
				    /** 属性改变后电量 */
				      lastPower +=lwCorporationSummaryDto.getLastPower();
				    /** 属性改变前电费 */
				      beforFee +=lwCorporationSummaryDto.getBeforFee();
				    /** 属性改变后电费 */
				      lastFee +=lwCorporationSummaryDto.getLastFee();
				 
				    /** 属性需量指针 */
				      needPointer +=lwCorporationSummaryDto.getNeedPointer();
				    /** 属性有功线损电量 */
				      lineLoss +=lwCorporationSummaryDto.getLineLoss();
				    /** 属性无功线损电量 */
				      unLineLoss +=lwCorporationSummaryDto.getUnLineLoss();
				    /** 属性无功变损电量 */
				      unLossQuantity +=lwCorporationSummaryDto.getUnLossQuantity();
				      
				            

				}
				
			}
			  summary.setUserNo(userNo);
			  summary.setSanXiaFee(sanXiaFee);
		      summary.setPowerFee(powerFee);               
		      summary.setUnDenizenQuantity(unDenizenQuantity);      
		      summary.setPointerQuantity(pointerQuantity);        
		      summary.setPointerPrice(pointerPrice);           
		      summary.setPointerFee(pointerFee);             
		      summary.setUnDenizenPrice(unDenizenPrice);         
		      summary.setUnDenizenFee(unDenizenFee);           
		      summary.setPowerRateFee(powerRateFee);           
		      summary.setNeedQuantity(needQuantity);           
		      summary.setNeedFee(needFee);                
		      summary.setContentQuantity(contentQuantity);        
		      summary.setContentPrice(contentPrice);           
		      summary.setContentFee(contentFee);             
		      summary.setUnPointerQuantity(unPointerQuantity);      
		      summary.setSurchargePrice(surchargePrice);         
		      summary.setSanXiaPrice(sanXiaPrice);            
		      summary.setPowerPrice(powerPrice);             
		      summary.setValleyQuantity(valleyQuantity);         
		      summary.setPeakQuantity(peakQuantity);           
		      summary.setPeakPrice(peakPrice);              
		      summary.setValleyPrice(valleyPrice);            
		      summary.setPeakFee(peakFee);                
		      summary.setValleyFee(valleyFee);              
		      summary.setLossQuantity(lossQuantity);           
		      summary.setSumFee(sumFee);                 
		      summary.setSumPointerQuantity(sumPointerQuantity);     
		      summary.setBeforPower(beforPower);             
		      summary.setLastPower(lastPower);              
		      summary.setBeforFee(beforFee);               
		      summary.setLastFee(lastFee);               
		      summary.setNeedPointer(needPointer);           
		      summary.setLineLoss(lineLoss);              
		      summary.setUnLineLoss(unLineLoss);            
		      summary.setUnLossQuantity(unLossQuantity);
		      resultList.add(summary);
			
		}
		return resultList;
	}
	
	public LwAllWholeFeeDto getAllWholeFee(Collection <LwAllWholeFeeDto> collection,String company,String statMonth){
		LwAllWholeFeeDto lwAllWholeFeeDto2 = new LwAllWholeFeeDto();
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwAllWholeFeeDto lwAllWholeFeeDto = (LwAllWholeFeeDto) iterator.next();
			 double power1 =0D; 
		    /** 属性电费 */
		     double dianfei =0D;
		    /** 属性三峡 */
		     double sanxia =0D;
		    /** 属性电力资金 */
		     double dianjin =0D;
		    /** 属性基金 */
		     double jijin =0D;
		    /** 属性电费税 */
		     double dianfeitax =0D;
		    /** 属性三峡税 */
		     double sanxiatax =0D;
		    /** 属性电金税 */
		     double dianjintax =0D;
		    /** 属性总计 */
		     double sumfee =0D;
		    /** 属性海明炉 */
		     double haiminglu =0D;
		    /** 属性多边 */
		     double duobian =0D;
		    /** 属性追加 */
		     double zhuijia =0D;
		    /** 属性附加1 */
		     double fujia1 =0D;
		    /** 属性附加2 */
		     double fujia2 =0D;
		    /** 属性附加3 */
		     double fujia3 =0D;
		    /** 属性附加4 */
		     double fujia4 =0D;
		     
		     
		      power1 += Double.parseDouble(lwAllWholeFeeDto.getPower1());
			    /** 属性电费 */
			      dianfei +=Double.parseDouble(lwAllWholeFeeDto.getDianfei());
			    /** 属性三峡 */
			      sanxia +=Double.parseDouble(lwAllWholeFeeDto.getSanxia());
			    /** 属性电力资金 */
			      dianjin +=Double.parseDouble(lwAllWholeFeeDto.getDianfei());
			    /** 属性基金 */
			      jijin +=Double.parseDouble(lwAllWholeFeeDto.getJijin());
			    /** 属性电费税 */
			      dianfeitax +=Double.parseDouble(lwAllWholeFeeDto.getDianfeitax());
			    /** 属性三峡税 */
			      sanxiatax +=Double.parseDouble(lwAllWholeFeeDto.getSanxiatax());
			    /** 属性电金税 */
			      dianjintax +=Double.parseDouble(lwAllWholeFeeDto.getDianjintax());
			    /** 属性总计 */
			      sumfee +=Double.parseDouble(lwAllWholeFeeDto.getSumfee());
			    /** 属性海明炉 */
			      haiminglu +=Double.parseDouble(lwAllWholeFeeDto.getHaiminglu());
			    /** 属性多边 */
			      duobian +=Double.parseDouble(lwAllWholeFeeDto.getDuobian());
			    /** 属性追加 */
			      zhuijia +=Double.parseDouble(lwAllWholeFeeDto.getZhuijia());
			    /** 属性附加1 */
			      fujia1 +=Double.parseDouble(lwAllWholeFeeDto.getFujia1());
			    /** 属性附加2 */
			      fujia2 +=Double.parseDouble(lwAllWholeFeeDto.getFujia2());
			    /** 属性附加3 */
			      fujia3 +=Double.parseDouble(lwAllWholeFeeDto.getFujia3());
			    /** 属性附加4 */
			      fujia4 +=Double.parseDouble(lwAllWholeFeeDto.getFujia4());
		     
			      lwAllWholeFeeDto2.setCompany(company);
			      lwAllWholeFeeDto2.setPower1(new Double(power1).toString());
			      lwAllWholeFeeDto2.setDianfei(new Double(dianfei).toString());
			      lwAllWholeFeeDto2.setSanxia(new Double(sanxia).toString());
			      lwAllWholeFeeDto2.setDianjin(new Double(dianjin).toString());
			      lwAllWholeFeeDto2.setJijin(new Double(jijin).toString());
			      lwAllWholeFeeDto2.setDianfeitax(new Double(dianfeitax).toString());
			      lwAllWholeFeeDto2.setSanxiatax(new Double(sanxiatax).toString());
			      lwAllWholeFeeDto2.setDianjintax(new Double(dianjintax).toString());
			      lwAllWholeFeeDto2.setSumfee(new Double(sumfee).toString());
			      lwAllWholeFeeDto2.setHaiminglu(new Double(haiminglu).toString());
			      lwAllWholeFeeDto2.setDuobian(new Double(duobian).toString());
			      lwAllWholeFeeDto2.setZhuijia(new Double(zhuijia).toString());
			      lwAllWholeFeeDto2.setFujia1(new Double(fujia1).toString());
			      lwAllWholeFeeDto2.setFujia2(new Double(fujia2).toString());
			      lwAllWholeFeeDto2.setFujia3(new Double(fujia3).toString());
			      lwAllWholeFeeDto2.setFujia4(new Double(fujia4).toString());   
		}
		return lwAllWholeFeeDto2;
	}
}
