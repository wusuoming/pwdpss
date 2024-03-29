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
import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.custom.TownSataDto;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;

public class UIThisMonthAllCount extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
		String company = null;		
		Collection userList = null;
		String condition = null;
		Collection priceSummaryList =null;
		Collection resultList = new ArrayList();
		TownSataDto townSataDto = new TownSataDto();
		BLLwTownPriceSummaryFacade blLwTownPriceSummaryFacade = new BLLwTownPriceSummaryFacade();
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		String inputDate = httpServletRequest.getParameter("inputDate");
		String statmonth = inputDate.substring(0, 7);
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

		DecimalFormat df = new DecimalFormat("###0.00");

		String conditions = " 1=1 and statmonth ='" + statmonth + "'";
		String conditionwgd = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='gy' or upcompany='dm'";
		String conditionwtj = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='ty' or upcompany='jy'";
		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();
		Collection colf = blLwCorporationSummaryFacade
				.findByConditions(conditions);
		LwCorporationSummaryDto lwCorporationSummaryDto = new LwCorporationSummaryDto();
		Iterator itf = colf.iterator();
		while (itf.hasNext()) {
			lwCorporationSummaryDto = (LwCorporationSummaryDto) itf.next();
			sumfpower += lwCorporationSummaryDto.getSumPointerQuantity()
					+ lwCorporationSummaryDto.getBeforPower()
					+ lwCorporationSummaryDto.getLastPower();
			sumfdianfee += lwCorporationSummaryDto.getPointerFee()
					+ lwCorporationSummaryDto.getPowerRateFee();
			summfdianjinall += lwCorporationSummaryDto.getSurcharge();
			sumfsanxiaall += lwCorporationSummaryDto.getPowerFee();
			sumfjijinall += lwCorporationSummaryDto.getSurcharge();

		}
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade = new BLLwWholeSaleSummaryFacade();
		Collection colwgd = blLwWholeSaleSummaryFacade
				.findByConditions(conditionwgd);

		LwWholeSaleSummaryDto lwWholeSaleSummaryDtogd = new LwWholeSaleSummaryDto();
		Iterator itwgd = colwgd.iterator();
		while (itwgd.hasNext()) {
			lwWholeSaleSummaryDtogd = (LwWholeSaleSummaryDto) itwgd.next();

			pepolepowergd += lwWholeSaleSummaryDtogd.getDenizenQuantity();
			notpepolepowergd += lwWholeSaleSummaryDtogd.getUnDenizenQuantity();
			bizpowergd += lwWholeSaleSummaryDtogd.getBizQuantity();
			productpowergd += lwWholeSaleSummaryDtogd.getProductQuantity();
			if (lwWholeSaleSummaryDtogd.getWholesaletype().equals("0")) {
				industrypowergd += lwWholeSaleSummaryDtogd
						.getIndustryQuantity();
			}
			if (lwWholeSaleSummaryDtogd.getWholesaletype().equals("1")) {
				industrypowergd += lwWholeSaleSummaryDtogd
						.getElectricQuantity();
			}
			farmpowergd += lwWholeSaleSummaryDtogd.getFarmUseQuantity();
			sumwpower += lwWholeSaleSummaryDtogd.getElectricQuantity();
			sumwdianfee += lwWholeSaleSummaryDtogd.getSumFee();

		}

		Collection colwtj = blLwWholeSaleSummaryFacade
				.findByConditions(conditionwtj);
		LwWholeSaleSummaryDto lwWholeSaleSummaryDtotj = new LwWholeSaleSummaryDto();
		Iterator itwtj = colwtj.iterator();
		while (itwtj.hasNext()) {
			lwWholeSaleSummaryDtotj = (LwWholeSaleSummaryDto) itwtj.next();

			pepolepowerjt += lwWholeSaleSummaryDtotj.getDenizenQuantity();
			notpepolepowerjt += lwWholeSaleSummaryDtotj.getUnDenizenQuantity();
			bizpowerjt += lwWholeSaleSummaryDtotj.getBizQuantity();
			productpowerjt += lwWholeSaleSummaryDtotj.getProductQuantity();
			if (lwWholeSaleSummaryDtotj.getWholesaletype().equals("0")) {
				industrypowerjt += lwWholeSaleSummaryDtotj
						.getIndustryQuantity();
			}
			if (lwWholeSaleSummaryDtotj.getWholesaletype().equals("1")) {
				industrypowerjt += lwWholeSaleSummaryDtotj
						.getElectricQuantity();
			}
			farmpowerjt += lwWholeSaleSummaryDtotj.getFarmUseQuantity();
			sumwpower += lwWholeSaleSummaryDtotj.getElectricQuantity();
			sumwdianfee += lwWholeSaleSummaryDtotj.getSumFee();

		}
		sumwsanxiaall = (pepolepowergd + notpepolepowergd + bizpowergd
				+ productpowergd + industrypowergd + pepolepowerjt
				+ notpepolepowerjt + bizpowerjt + productpowerjt
				+ industrypowerjt + farmpowerjt) * 0.004 * 0.88;
		summwdianjinall = (pepolepowerjt + notpepolepowerjt + bizpowerjt
				+ productpowerjt + industrypowerjt + pepolepowergd
				+ notpepolepowergd + bizpowergd + productpowergd + industrypowergd) * 0.02 * 0.88;
		sumwjijinall = (pepolepowerjt + pepolepowergd)
				* 0.001
				* 0.88
				+ (notpepolepowerjt + bizpowerjt + industrypowerjt
						+ notpepolepowergd + bizpowergd + industrypowergd)
				* 0.002
				* 0.88
				+ (pepolepowerjt + notpepolepowerjt + bizpowerjt + industrypowerjt)
				* 0.0031 * 0.88;
		sumwc = sumwdianfee / 1.17;
		sumwtax = sumwdianfee / 1.17 * 0.17;
		sumwdianjintax = summwdianjinall / 1.17 * 0.17;
		sumwsanxiatax = sumwsanxiaall / 1.17 * 0.17;
		sumwjijintax = sumwjijinall / 1.17 * 0.17;

		summwdianjin = summwdianjinall / 1.17;
		sumwsanxia = sumwsanxiaall / 1.17;
		sumwjijin = sumwjijinall / 1.17;
		sumfc = sumfdianfee / 1.17;
		sumftax = sumfdianfee / 1.17 * 0.17;
		sumfdianjintax = summfdianjinall / 1.17 * 0.17;
		sumfsanxiatax = sumfsanxiaall / 1.17 * 0.17;
		sumfjijintax = sumfjijinall / 1.17 * 0.17;

		summfdianjin = summfdianjinall / 1.17;
		sumfsanxia = sumfsanxiaall / 1.17;
		sumfjijin = sumfjijinall / 1.17;
		sumffee = sumfdianfee + summfdianjinall + sumfsanxiaall + sumfjijinall;
		sumwfee = sumwdianfee + summwdianjinall + sumwsanxiaall + sumwjijinall;

		// 四个局分别统计
		String conditionwgy = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='gy'";
		String conditionwdm = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='dm'";
		String conditionwty = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='ty'";
		String conditionwjy = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='jy'";
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
		LwWholeSaleSummaryDto lwWholeSaleSummaryDto = new LwWholeSaleSummaryDto();
		Collection gy = blLwWholeSaleSummaryFacade
				.findByConditions(conditionwgy);

		Iterator itgy = gy.iterator();
		while (itgy.hasNext()) {
			lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itgy.next();
			pepolegy += lwWholeSaleSummaryDto.getDenizenQuantity();
			notpepolegy += lwWholeSaleSummaryDto.getUnDenizenQuantity();
			bizgy += lwWholeSaleSummaryDto.getBizQuantity();
			if (lwWholeSaleSummaryDto.getWholesaletype().equals("0")) {
				industrygy += lwWholeSaleSummaryDto
						.getIndustryQuantity();
			}
			if (lwWholeSaleSummaryDto.getWholesaletype().equals("1")) {
				industrygy += lwWholeSaleSummaryDto
						.getElectricQuantity();
			}
			farmgy += lwWholeSaleSummaryDto.getFarmUseQuantity();
			productgy += lwWholeSaleSummaryDto.getProductQuantity();
			sumpowergy += lwWholeSaleSummaryDto.getElectricQuantity();
			sumdianfeegy += lwWholeSaleSummaryDto.getSumFee();

		}
		sanxiagy = (pepolegy + notpepolegy + bizgy + productgy + industrygy) * 0.004 * 0.88;
		dianjingy = (pepolegy + notpepolegy + bizgy + productgy + industrygy) * 0.02 * 0.88;
		jijingy = pepolegy * 0.001 * 0.88 + (notpepolegy + bizgy + industrygy)
				* 0.002 * 0.88 + (pepolegy + notpepolegy + bizgy + industrygy)
				* 0.0031 * 0.88;
		sumallfeegy = sumdianfeegy + sanxiagy + dianjingy + jijingy;

		Collection dm = blLwWholeSaleSummaryFacade
				.findByConditions(conditionwdm);

		Iterator itdm = dm.iterator();
		while (itdm.hasNext()) {
			lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itdm.next();
			pepoledm += lwWholeSaleSummaryDto.getDenizenQuantity();
			notpepoledm += lwWholeSaleSummaryDto.getUnDenizenQuantity();
			bizdm += lwWholeSaleSummaryDto.getBizQuantity();
			if (lwWholeSaleSummaryDto.getWholesaletype().equals("0")) {
				industrydm += lwWholeSaleSummaryDto
						.getIndustryQuantity();
			}
			if (lwWholeSaleSummaryDto.getWholesaletype().equals("1")) {
				industrydm += lwWholeSaleSummaryDto
						.getElectricQuantity();
			}
			farmdm += lwWholeSaleSummaryDto.getFarmUseQuantity();
			productdm += lwWholeSaleSummaryDto.getProductQuantity();
			sumpowerdm += lwWholeSaleSummaryDto.getElectricQuantity();
			sumdianfeedm += lwWholeSaleSummaryDto.getSumFee();

		}
		sanxiadm = (pepoledm + notpepoledm + bizdm + productdm + industrydm) * 0.004 * 0.88;
		dianjindm = (pepoledm + notpepoledm + bizdm + productdm + industrydm) * 0.02 * 0.88;
		jijindm = pepoledm * 0.001 * 0.88 + (notpepoledm + bizgy + industrydm)
				* 0.002 * 0.88 + (pepoledm + notpepoledm + bizdm + industrydm)
				* 0.0031 * 0.88;
		sumallfeedm = sumdianfeegy + sanxiagy + dianjingy + jijindm;

		Collection jy = blLwWholeSaleSummaryFacade
				.findByConditions(conditionwjy);

		Iterator itjy = jy.iterator();
		while (itjy.hasNext()) {
			lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itjy.next();
			pepolejy += lwWholeSaleSummaryDto.getDenizenQuantity();
			notpepolejy += lwWholeSaleSummaryDto.getUnDenizenQuantity();
			bizjy += lwWholeSaleSummaryDto.getBizQuantity();
			if (lwWholeSaleSummaryDto.getWholesaletype().equals("0")) {
				industryjy += lwWholeSaleSummaryDto
						.getIndustryQuantity();
			}
			if (lwWholeSaleSummaryDto.getWholesaletype().equals("1")) {
				industryjy += lwWholeSaleSummaryDto
						.getElectricQuantity();
			}
			farmjy += lwWholeSaleSummaryDto.getFarmUseQuantity();
			productjy += lwWholeSaleSummaryDto.getProductQuantity();
			sumpowerjy += lwWholeSaleSummaryDto.getElectricQuantity();
			sumdianfeejy += lwWholeSaleSummaryDto.getSumFee();

		}
		sanxiajy = (pepolejy + notpepolejy + bizjy + productjy + industryjy + farmjy) * 0.004 * 0.88;
		dianjinjy = (pepolejy + notpepolejy + bizjy + productjy + industryjy) * 0.02 * 0.88;
		jijinjy = pepolejy * 0.001 * 0.88 + (notpepolejy + bizjy + industryjy)
				* 0.002 * 0.88 + (pepolejy + notpepolejy + bizjy + industryjy)
				* 0.0031 * 0.88;
		sumallfeejy = sumdianfeegy + sanxiagy + dianjingy + jijinjy;

		Collection ty = blLwWholeSaleSummaryFacade
				.findByConditions(conditionwty);

		Iterator itty = ty.iterator();
		while (itty.hasNext()) {
			lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itty.next();
			pepolety += lwWholeSaleSummaryDto.getDenizenQuantity();
			notpepolety += lwWholeSaleSummaryDto.getUnDenizenQuantity();
			bizty += lwWholeSaleSummaryDto.getBizQuantity();
			if (lwWholeSaleSummaryDto.getWholesaletype().equals("0")) {
				industryty += lwWholeSaleSummaryDto
						.getIndustryQuantity();
			}
			if (lwWholeSaleSummaryDto.getWholesaletype().equals("1")) {
				industryty += lwWholeSaleSummaryDto
						.getElectricQuantity();
			}
			farmty += lwWholeSaleSummaryDto.getFarmUseQuantity();
			productty += lwWholeSaleSummaryDto.getProductQuantity();
			sumpowerty += lwWholeSaleSummaryDto.getElectricQuantity();
			sumdianfeety += lwWholeSaleSummaryDto.getSumFee();

		}
		sanxiaty = (pepolety + notpepolety + bizty + productty + industryty + farmty) * 0.004 * 0.88;
		dianjinty = (pepolety + notpepolety + bizty + productty + industryty) * 0.02 * 0.88;
		jijinty = pepolety * 0.001 * 0.88 + (notpepolety + bizty + industryty)
				* 0.002 * 0.88 + (pepolety + notpepolety + bizty + industryty)
				* 0.0031 * 0.88;
		sumallfeety = sumdianfeegy + sanxiagy + dianjingy + jijinty;

		/**
		 * 直供乡按局统计
		 */
	
		// 得到四个局的几个代码
		Collection<LwDcodeDto> comList = blLwDcodeFacade
		.findByConditions(" codetype = 'SupplyCom'");
		// 得到四个局的统计数据
		 for (Iterator iterator = comList.iterator(); iterator.hasNext();) {
				LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator
						.next();
			 company = lwDcodeDto.getCodeCode();
			 inputDate = httpServletRequest.getParameter("inputDate");
			 inputDate = new DateTime(inputDate,DateTime.YEAR_TO_MONTH).toString();
			 userList =  blLwPowerUserFacade.findByConditions("superclass = '"+company+"'");
			 condition = PowerFeeCal.getUserCondition(userList);
			 priceSummaryList = blLwTownPriceSummaryFacade.findByConditions(" 1=1  and statmonth = '"+inputDate+"' "+condition);
			 townSataDto = blCalPowerFeeCustomFacade.townStatByCompany(priceSummaryList, inputDate);
			 townSataDto.setComCode(company);
			 townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
			 resultList.add(townSataDto);			 
			}
		 // 四个局的统计汇总
		 PowerFeeCal.getSumCompanyStat(resultList, inputDate);
		 
		 resultList.add(townSataDto);
		 httpServletRequest.setAttribute("resultList", resultList);
		 
		 for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
				TownSataDto townSataDto1 = (TownSataDto) iterator
						.next();
				
				
				 //sumtfee += ;
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
		 
		
		 sumallfee=sumfdianfee+sumwdianfee+sumalltfee; sumallpower=sumfpower+sumwpower+sumtpower;
		 sumallc=sumwc+sumfc+sumtc; sumalltax=sumwtax+sumftax+sumttax;
		 sumallall=sumwfee+sumffee+sumttax; sumalldianjin=summwdianjin+summfdianjin+summtdianjin;
		 sumalldianjintax=sumwdianjintax+sumfdianjintax+sumtdianjintax;
		 sumallsanxia=sumwsanxia+sumfsanxia+sumtsanxia;
		 sumallsanxiatax=sumwsanxiatax+sumfsanxiatax+sumtsanxiatax;
		 sumalljijin=sumwjijin+sumfjijin+sumtjijin;
		 sumalljijintax=sumwjijintax+sumfjijintax+sumtjijintax;
		 

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
		  httpServletRequest.setAttribute("sumallpower",
		  Math.round(sumallpower)); httpServletRequest.setAttribute("sumallc",
		  df.format(sumallc)); httpServletRequest.setAttribute("sumalltax",
		 df.format(sumalltax)); httpServletRequest.setAttribute("sumallall",
		  df.format(sumallall));
		  httpServletRequest.setAttribute("sumalldianjin",
		 df.format(sumalldianjin));
		 httpServletRequest.setAttribute("sumalldianjintax",
		  df.format(sumalldianjintax));
		  httpServletRequest.setAttribute("sumallsanxia",
		  df.format(sumallsanxia));
		  httpServletRequest.setAttribute("sumallsanxiatax",df.format(sumallsanxiatax));
		 httpServletRequest.setAttribute("sumalljijin",df.format(sumalljijin));
		  httpServletRequest.setAttribute("sumalljijintax",df.format(sumalljijintax));
		 

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
		return actionMapping.findForward("viewthisallcount");
	}

	

}
