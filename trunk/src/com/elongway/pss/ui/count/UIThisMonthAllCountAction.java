package com.elongway.pss.ui.count;

import java.text.DecimalFormat;
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
import com.elongway.pss.bl.facade.BLLwAllWholeFeeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerFeeFaxingFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.custom.TownSataDto;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIThisMonthAllCountAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		String counttype = httpServletRequest.getParameter("counttype");
		BLLwPowerFeeFaxingFacade blLwPowerFeeFaxingFacade = new BLLwPowerFeeFaxingFacade();
		String print = httpServletRequest.getParameter("print");
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
		StringBuffer buffer = new StringBuffer();
		Collection<LwPowerFeeFaxingDto>faXingList =  null;
		// 当月统计
		if ("1".equals(counttype)) {

			String inputDate = httpServletRequest.getParameter("inputDate");
			
			httpServletRequest.setAttribute("inputDate", inputDate);
			String statmonth = inputDate.substring(0, 7);
			String forward = "";
			buffer.append("statMonth = '").append(statmonth).append("' order by remark,userno");
			faXingList = blLwPowerFeeFaxingFacade.findByConditions(buffer.toString());
			if(faXingList!=null&&faXingList.size()==18){
				faXingList = blLwPowerFeeFaxingFacade.findByConditions(buffer.toString());
				httpServletRequest.setAttribute("faXingList", faXingList);
				httpServletRequest.setAttribute("counttype", counttype);
				if(AppConst.PRINT_FLAG.equals(print)){
					forward = "storetableprint";
				}else{
					forward = "storetable";
				}
				
				return actionMapping.findForward(forward);
			} else {

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
					lwCorporationSummaryDto = (LwCorporationSummaryDto) itf
							.next();

					if (lwCorporationSummaryDto.getLineCode().equals(
							"20699999065")
							|| lwCorporationSummaryDto.getLineCode().equals(
									"20699999072")) {
						sumfpower += lwCorporationSummaryDto
								.getElectricQuantity()
								+ lwCorporationSummaryDto.getBeforPower()
								+ lwCorporationSummaryDto.getLastPower();
					} else {
						sumfpower += lwCorporationSummaryDto
								.getElectricQuantity()
								+ lwCorporationSummaryDto.getBeforPower()
								+ lwCorporationSummaryDto.getLastPower();
					}
					if (lwCorporationSummaryDto.getLineCode().equals(
							"20699999065")
							|| lwCorporationSummaryDto.getLineCode().equals(
									"20699999072")) {

						sumfdianfee += lwCorporationSummaryDto.getPeakFee()
								+ lwCorporationSummaryDto.getPowerRateFee()

								+ lwCorporationSummaryDto.getContentFee()
								+ lwCorporationSummaryDto.getNeedFee()
								+ lwCorporationSummaryDto.getUnDenizenFee()
								+ lwCorporationSummaryDto.getBeforFee()
								+ lwCorporationSummaryDto.getLastFee()
								+ lwCorporationSummaryDto.getUnLineLoss()

						;
					} else {
						sumfdianfee += lwCorporationSummaryDto.getPointerFee()
								+ lwCorporationSummaryDto.getPowerRateFee()

								+ lwCorporationSummaryDto.getContentFee()
								+ lwCorporationSummaryDto.getNeedFee()
								+ lwCorporationSummaryDto.getUnDenizenFee()
								+ lwCorporationSummaryDto.getUnLineLoss();
					}
					summfdianjinall += lwCorporationSummaryDto.getPowerFee();
					sumfsanxiaall += lwCorporationSummaryDto.getSanXiaFee();
					sumfjijinall += lwCorporationSummaryDto.getSurcharge();
					sumffee += PowerFeeCal.getValue(lwCorporationSummaryDto
							.getSumFee(), AppConst.TWO_DOT_FLAG);

				}
				System.out.println(sumfsanxiaall);

				// 四个局分别统计

				// 当月趸售计算结果
				Collection col = blLwWholeSaleSummaryFacade
						.findByConditions(conditions);
				Iterator it = col.iterator();
				while (it.hasNext()) {
					LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) it
							.next();
					// 得到各个局的差别电量
					differenceQuantity += Double.parseDouble(""
							.equals(lwWholeSaleSummaryDto
									.getDifferenceQuantity()) ? "0"
							: lwWholeSaleSummaryDto.getDifferenceQuantity());
				}

				Collection colgy = blLwWholeSaleSummaryFacade
						.findByConditions(conditionsgy);
				Iterator itgy = colgy.iterator();
				while (itgy.hasNext()) {
					LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itgy
							.next();
					differenceQuantitygy += Double
							.parseDouble(lwWholeSaleSummaryDto
									.getDifferenceQuantity());
				}

				Collection coldm = blLwWholeSaleSummaryFacade
						.findByConditions(conditionsdm);
				Iterator itdm = coldm.iterator();
				while (itdm.hasNext()) {
					LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itdm
							.next();
					differenceQuantitydm += Double
							.parseDouble(lwWholeSaleSummaryDto
									.getDifferenceQuantity());
				}

				Collection coljy = blLwWholeSaleSummaryFacade
						.findByConditions(conditionsjy);
				Iterator itjy = coljy.iterator();
				while (itjy.hasNext()) {
					LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itjy
							.next();
					differenceQuantityjy += Double
							.parseDouble(lwWholeSaleSummaryDto
									.getDifferenceQuantity());
				}

				Collection colty = blLwWholeSaleSummaryFacade
						.findByConditions(conditionsty);
				Iterator itty = colty.iterator();
				while (itty.hasNext()) {
					LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) itty
							.next();
					differenceQuantityty += Double
							.parseDouble(lwWholeSaleSummaryDto
									.getDifferenceQuantity());
				}

				BLLwAllWholeFeeFacade blLwAllWholeFeeFacade = new BLLwAllWholeFeeFacade();
				LwAllWholeFeeDto lwAllWholeFeeDtogy = blLwAllWholeFeeFacade
						.findByPrimaryKey("gy", statmonth);
				if (lwAllWholeFeeDtogy == null) {
					throw new UserException(-6, -706,
							this.getClass().getName(), "固阳该月还没有算过费！");
				}
				LwAllWholeFeeDto lwAllWholeFeeDtodm = blLwAllWholeFeeFacade
						.findByPrimaryKey("dm", statmonth);

				if (lwAllWholeFeeDtodm == null) {
					throw new UserException(-6, -706,
							this.getClass().getName(), "达茂该月还没有算过费！");
				}
				LwAllWholeFeeDto lwAllWholeFeeDtoty = blLwAllWholeFeeFacade
						.findByPrimaryKey("ty", statmonth);

				if (lwAllWholeFeeDtoty == null) {
					throw new UserException(-6, -706,
							this.getClass().getName(), "土佑该月还没有算过费！");
				}
				LwAllWholeFeeDto lwAllWholeFeeDtojy = blLwAllWholeFeeFacade
						.findByPrimaryKey("jy", statmonth);
				if (lwAllWholeFeeDtojy == null) {
					throw new UserException(-6, -706,
							this.getClass().getName(), "九原该月还没有算过费！");
				}

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

				sumwfee = sumwdianfee + summwdianjinall + sumwsanxiaall
						+ sumwjijinall;
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
					userList = blLwPowerUserFacade
							.findByConditions("superclass = '" + company + "'");
					condition = PowerFeeCal.getUserCondition(userList);
					priceSummaryList = blLwTownPriceSummaryFacade
							.findByConditions(" 1=1  and statmonth = '"
									+ inputDate + "' " + condition);
					townSataDto = blCalPowerFeeCustomFacade.townStatByCompany(
							priceSummaryList, inputDate);
					townSataDto.setComCode(company);
					townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
					resultList.add(townSataDto);
				}
				// 四个局的统计汇总
				townSataDto = PowerFeeCal.getSumCompanyStat(resultList,
						inputDate);
				townSataDto.setCompanyName("小计");
				townSataDto.setComCode("sumtown");
				resultList.add(townSataDto);
				httpServletRequest.setAttribute("resultList", resultList);

				for (Iterator iterator = resultList.iterator(); iterator
						.hasNext();) {
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
						- Double
								.parseDouble(lwAllWholeFeeDtogy.getDianjintax())
						- Double.parseDouble(lwAllWholeFeeDtogy.getJijin()) - Double
						.parseDouble(lwAllWholeFeeDtogy.getFujia1()))
						+ (Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())
								- Double.parseDouble(lwAllWholeFeeDtodm
										.getSanxia())
								- Double.parseDouble(lwAllWholeFeeDtodm
										.getSanxiatax())
								- Double.parseDouble(lwAllWholeFeeDtodm
										.getDianjin())
								- Double.parseDouble(lwAllWholeFeeDtodm
										.getDianjintax())
								- Double.parseDouble(lwAllWholeFeeDtodm
										.getJijin()) - Double
								.parseDouble(lwAllWholeFeeDtodm.getFujia1()))
						+ (Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())
								- Double.parseDouble(lwAllWholeFeeDtoty
										.getSanxia())
								- Double.parseDouble(lwAllWholeFeeDtoty
										.getSanxiatax())
								- Double.parseDouble(lwAllWholeFeeDtoty
										.getDianjin())
								- Double.parseDouble(lwAllWholeFeeDtoty
										.getDianjintax())
								- Double.parseDouble(lwAllWholeFeeDtoty
										.getJijin()) - Double
								.parseDouble(lwAllWholeFeeDtoty.getFujia1()))
						+ (Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())
								- Double.parseDouble(lwAllWholeFeeDtojy
										.getSanxia())
								- Double.parseDouble(lwAllWholeFeeDtojy
										.getSanxiatax())
								- Double.parseDouble(lwAllWholeFeeDtojy
										.getDianjin())
								- Double.parseDouble(lwAllWholeFeeDtojy
										.getDianjintax())
								- Double.parseDouble(lwAllWholeFeeDtojy
										.getJijin()) - Double
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
						- Double
								.parseDouble(lwAllWholeFeeDtogy.getDianjintax())
						- Double.parseDouble(lwAllWholeFeeDtogy.getJijin()) - Double
						.parseDouble(lwAllWholeFeeDtogy.getFujia1()))
						+ (Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())
								- Double.parseDouble(lwAllWholeFeeDtodm
										.getSanxia())
								- Double.parseDouble(lwAllWholeFeeDtodm
										.getSanxiatax())
								- Double.parseDouble(lwAllWholeFeeDtodm
										.getDianjin())
								- Double.parseDouble(lwAllWholeFeeDtodm
										.getDianjintax())
								- Double.parseDouble(lwAllWholeFeeDtodm
										.getJijin()) - Double
								.parseDouble(lwAllWholeFeeDtodm.getFujia1()))
						+ (Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())
								- Double.parseDouble(lwAllWholeFeeDtoty
										.getSanxia())
								- Double.parseDouble(lwAllWholeFeeDtoty
										.getSanxiatax())
								- Double.parseDouble(lwAllWholeFeeDtoty
										.getDianjin())
								- Double.parseDouble(lwAllWholeFeeDtoty
										.getDianjintax())
								- Double.parseDouble(lwAllWholeFeeDtoty
										.getJijin()) - Double
								.parseDouble(lwAllWholeFeeDtoty.getFujia1()))
						+ (Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())
								- Double.parseDouble(lwAllWholeFeeDtojy
										.getSanxia())
								- Double.parseDouble(lwAllWholeFeeDtojy
										.getSanxiatax())
								- Double.parseDouble(lwAllWholeFeeDtojy
										.getDianjin())
								- Double.parseDouble(lwAllWholeFeeDtojy
										.getDianjintax())
								- Double.parseDouble(lwAllWholeFeeDtojy
										.getJijin()) - Double
								.parseDouble(lwAllWholeFeeDtojy.getFujia1())) - differenceQuantity * 0.2) / 1.17 * 0.17;
				summwdianjin = Double.parseDouble(lwAllWholeFeeDtogy
						.getDianjin())
						+ Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())
						+ Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())
						+ Double.parseDouble(lwAllWholeFeeDtojy.getDianjin());
				sumwdianjintax = Double.parseDouble(lwAllWholeFeeDtogy
						.getDianjintax())
						+ Double
								.parseDouble(lwAllWholeFeeDtoty.getDianjintax())
						+ Double
								.parseDouble(lwAllWholeFeeDtodm.getDianjintax())
						+ Double
								.parseDouble(lwAllWholeFeeDtojy.getDianjintax());
				sumwsanxia = Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())
						+ Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())
						+ Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())
						+ Double.parseDouble(lwAllWholeFeeDtojy.getSanxia());
				sumwsanxiatax = Double.parseDouble(lwAllWholeFeeDtogy
						.getSanxiatax())
						+ Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())
						+ Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())
						+ Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax());
				sumwjijin = Double.parseDouble(lwAllWholeFeeDtogy.getJijin())
						+ Double.parseDouble(lwAllWholeFeeDtoty.getJijin())
						+ Double.parseDouble(lwAllWholeFeeDtodm.getJijin())
						+ Double.parseDouble(lwAllWholeFeeDtojy.getJijin());
				sumwjijintax = Double.parseDouble(lwAllWholeFeeDtogy
						.getFujia1())
						+ Double.parseDouble(lwAllWholeFeeDtoty.getFujia1())
						+ Double.parseDouble(lwAllWholeFeeDtodm.getFujia1())
						+ Double.parseDouble(lwAllWholeFeeDtojy.getFujia1());

				sumallfee = sumfdianfee + sumwdianfee
						+ townSataDto.getPowerFee();
				sumallpower = sumfpower + sumwpower + townSataDto.getSumPower();
				sumallc = sumwc + sumfc + townSataDto.getPurePowerFee();
				sumalltax = sumwtax + sumftax + townSataDto.getPowerFeeTax();
				sumallall = sumwfee + sumffee + townSataDto.getSumPowerFee();
				sumalldianjin = summwdianjin + summfdianjin
						+ townSataDto.getPureDianJin();
				sumalldianjintax = sumwdianjintax + sumfdianjintax
						+ townSataDto.getDianJinTax();
				sumallsanxia = sumwsanxia + sumfsanxia
						+ townSataDto.getPureSanXia();
				sumallsanxiatax = sumwsanxiatax + sumfsanxiatax
						+ townSataDto.getSanXiaTax();
				sumalljijin = sumwjijin + sumfjijin
						+ townSataDto.getPureJiJin();
				sumalljijintax = sumwjijintax + sumfjijintax
						+ townSataDto.getJiJinTax();

				httpServletRequest.setAttribute("sumffee", df.format(sumffee));
				httpServletRequest.setAttribute("sumtownSataDto", townSataDto);

				httpServletRequest.setAttribute("sumfpower", Math
						.round(sumfpower));
				httpServletRequest.setAttribute("sumfdianfee", df
						.format(sumfdianfee));
				httpServletRequest.setAttribute("sumftax", df.format(sumftax));
				httpServletRequest.setAttribute("sumfc", df.format(sumfc));
				httpServletRequest.setAttribute("summfdianjin", df
						.format(summfdianjin));
				httpServletRequest.setAttribute("sumfdianjintax", df
						.format(sumfdianjintax));
				httpServletRequest.setAttribute("sumfsanxia", df
						.format(sumfsanxia));
				httpServletRequest.setAttribute("sumfsanxiatax", df
						.format(sumfsanxiatax));
				httpServletRequest.setAttribute("sumfjijin", df
						.format(sumfjijin));
				httpServletRequest.setAttribute("sumfjijintax", df
						.format(sumfjijintax));
				httpServletRequest.setAttribute("sumwfee", df.format(sumwfee));
				httpServletRequest.setAttribute("sumwpower", Math
						.round(sumwpower));
				httpServletRequest.setAttribute("sumwdianfee", df
						.format(sumwdianfee));
				httpServletRequest.setAttribute("sumwtax", df.format(sumwtax));
				httpServletRequest.setAttribute("sumwc", df.format(sumwc));
				httpServletRequest.setAttribute("summwdianjin", df
						.format(summwdianjin));
				httpServletRequest.setAttribute("sumwdianjintax", df
						.format(sumwdianjintax));

				httpServletRequest.setAttribute("sumwsanxia", df
						.format(sumwsanxia));
				httpServletRequest.setAttribute("sumwsanxiatax", df
						.format(sumwsanxiatax));
				httpServletRequest.setAttribute("sumwjijin", df
						.format(sumwjijin));
				httpServletRequest.setAttribute("sumwjijintax", df
						.format(sumwjijintax));

				httpServletRequest.setAttribute("sumallfee", df
						.format(sumallfee));
				httpServletRequest.setAttribute("sumallpower", Math
						.round(sumallpower));
				httpServletRequest.setAttribute("sumallc", df.format(sumallc));
				httpServletRequest.setAttribute("sumalltax", df
						.format(sumalltax));
				httpServletRequest.setAttribute("sumallall", df
						.format(sumallall));
				httpServletRequest.setAttribute("sumalldianjin", df
						.format(sumalldianjin));
				httpServletRequest.setAttribute("sumalldianjintax", df
						.format(sumalldianjintax));
				httpServletRequest.setAttribute("sumallsanxia", df
						.format(sumallsanxia));
				httpServletRequest.setAttribute("sumallsanxiatax", df
						.format(sumallsanxiatax));
				httpServletRequest.setAttribute("sumalljijin", df
						.format(sumalljijin));
				httpServletRequest.setAttribute("sumalljijintax", df
						.format(sumalljijintax));

				httpServletRequest.setAttribute("sanxiagy", df
						.format(sanxiagy / 1.17));
				httpServletRequest.setAttribute("jijingy", df
						.format(jijingy / 1.17));
				httpServletRequest.setAttribute("dianjingy", df
						.format(dianjingy / 1.17));
				httpServletRequest.setAttribute("sumpowergy", Math
						.round(sumpowergy));
				httpServletRequest.setAttribute("sumdianfeegy", df
						.format(sumdianfeegy / 1.17));

				httpServletRequest.setAttribute("sanxiajy", df
						.format(sanxiajy / 1.17));
				httpServletRequest.setAttribute("jijinjy", df
						.format(jijinjy / 1.17));
				httpServletRequest.setAttribute("dianjinjy", df
						.format(dianjinjy / 1.17));
				httpServletRequest.setAttribute("sumpowerjy", Math
						.round(sumpowerjy));
				httpServletRequest.setAttribute("sumdianfeejy", df
						.format(sumdianfeejy / 1.17));

				httpServletRequest.setAttribute("sanxiadm", df
						.format(sanxiadm / 1.17));
				httpServletRequest.setAttribute("jijindm", df
						.format(jijindm / 1.17));
				httpServletRequest.setAttribute("dianjindm", df
						.format(dianjindm / 1.17));
				httpServletRequest.setAttribute("sumpowerdm", Math
						.round(sumpowerdm));
				httpServletRequest.setAttribute("sumdianfeedm", df
						.format(sumdianfeedm / 1.17));

				httpServletRequest.setAttribute("sanxiaty", df
						.format(sanxiaty / 1.17));
				httpServletRequest.setAttribute("jijinty", df
						.format(jijinty / 1.17));
				httpServletRequest.setAttribute("dianjinty", df
						.format(dianjinty / 1.17));
				httpServletRequest.setAttribute("sumpowerty", Math
						.round(sumpowerty));
				httpServletRequest.setAttribute("sumdianfeety", df
						.format(sumdianfeety / 1.17));

				httpServletRequest.setAttribute("sumallfeejy", df
						.format(sumallfeejy));
				httpServletRequest.setAttribute("sumallfeegy", df
						.format(sumallfeegy));
				httpServletRequest.setAttribute("sumallfeedm", df
						.format(sumallfeedm));
				httpServletRequest.setAttribute("sumallfeety", df
						.format(sumallfeety));

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
				httpServletRequest.setAttribute("counttype", counttype);
				return actionMapping.findForward("viewthisallcount");

			}
			// 累计
		} else {
			/** 属性录入日期 */
		     String inputDate = "";
		     /** 属性统计年月 */
		     String statMonth = httpServletRequest.getParameter("inputDate");
			statMonth = new DateTime(statMonth, DateTime.YEAR_TO_MONTH)
					.toString();
			Collection <LwPowerFeeFaxingDto> currentList = null;
			Collection <LwPowerFeeFaxingDto> allList = null;
			buffer.append("statMonth = '").append(statMonth).append("'").append("  order by remark");
			currentList = blLwPowerFeeFaxingFacade.findByConditions(buffer.toString());
			buffer.delete(0, buffer.length());
			buffer.append(PowerFeeCal.getAddMonthCondition("2009-01", statMonth, "statMonth"));
			
			allList = blLwPowerFeeFaxingFacade.findByConditions(buffer.toString());
			String tempUserNo = "";
			String tempNo = "";
			LwPowerFeeFaxingDto faXingDto = null; 
			faXingList = new ArrayList<LwPowerFeeFaxingDto>();
			for (Iterator iterator = currentList.iterator(); iterator.hasNext();) {
				LwPowerFeeFaxingDto lwPowerFeeFaxingDto = (LwPowerFeeFaxingDto) iterator
						.next();
			   	  tempUserNo = lwPowerFeeFaxingDto.getUserNo();
			   	    String userNo = "";
				    /** 属性户名 */
				     String userName = "";
				
				    /** 属性统计方式 */
				     String statStyle = "";
				    
				    /** 属性电量 */
				     long quantity = 0L;
				    /** 属性电费 */
				     double purePowerFee = 0D;
				    /** 属性电费税 */
				     double powerFeeTax = 0D;
				    /** 属性三峡 */
				     double sanXiaFee = 0D;
				    /** 属性三峡税 */
				     double sanXiaTax = 0D;
				    /** 属性电金 */
				     double pureDianJin = 0D;
				    /** 属性电金税 */
				     double dianJinTax = 0D;
				    /** 属性基金 */
				     double pureJiJin = 0D;
				    /** 属性基金税 */
				     double jiJinTax = 0D;
				    /** 属性差别电费 */
				     double chaBieFee = 0D;
				    /** 属性差别电费税 */
				     double chaBieTax = 0D;
				    /** 属性总计 */
				     double sumFee = 0D;
				    /** 属性注释 */
				     String remark = "";
			   	  for (Iterator iterator2 = allList.iterator(); iterator2
						.hasNext();) {
					LwPowerFeeFaxingDto lwPowerFeeFaxingDto1 = (LwPowerFeeFaxingDto) iterator2
							.next();
					    tempNo = lwPowerFeeFaxingDto1.getUserNo();
				 if(tempNo.equals(tempUserNo)){
			      userName = lwPowerFeeFaxingDto1.getUserName();
			   
			      inputDate = new DateTime(new Date(),DateTime.YEAR_TO_DAY).toString();
			      
			      quantity += lwPowerFeeFaxingDto1.getQuantity();
			      purePowerFee += lwPowerFeeFaxingDto1.getPurePowerFee();
			      powerFeeTax += lwPowerFeeFaxingDto1.getPowerFeeTax();
			      sanXiaFee += lwPowerFeeFaxingDto1.getSanXiaFee();
			      sanXiaTax += lwPowerFeeFaxingDto1.getSanXiaTax();
			      pureDianJin += lwPowerFeeFaxingDto1.getPureDianJin();
			      dianJinTax += lwPowerFeeFaxingDto1.getDianJinTax();
			      pureJiJin += lwPowerFeeFaxingDto1.getPureJiJin();
			      jiJinTax += lwPowerFeeFaxingDto1.getJiJinTax();
			      chaBieFee += lwPowerFeeFaxingDto1.getChaBieFee();
			      chaBieTax += lwPowerFeeFaxingDto1.getChaBieTax();
			      sumFee += lwPowerFeeFaxingDto1.getSumFee();
			    
			      remark = lwPowerFeeFaxingDto1.getRemark();
				 }
			   	  }
			      faXingDto = new LwPowerFeeFaxingDto();
			      faXingDto.setUserName(userName);
			      faXingDto.setUserNo(userNo);
			      faXingDto.setInputDate(inputDate);
			      faXingDto.setStatMonth(statMonth);
			      faXingDto.setQuantity(quantity);
			      faXingDto.setPurePowerFee(purePowerFee);
			      faXingDto.setPowerFeeTax(powerFeeTax);
			      faXingDto.setSanXiaFee(sanXiaFee);
			      faXingDto.setSanXiaTax(sanXiaTax);
			      faXingDto.setPureDianJin(pureDianJin);
			      faXingDto.setDianJinTax(dianJinTax);
			      faXingDto.setPureJiJin(pureJiJin);
			      faXingDto.setJiJinTax(jiJinTax);
			      faXingDto.setChaBieFee(chaBieFee);
			      faXingDto.setChaBieTax(chaBieTax);
			      faXingDto.setSumFee(sumFee);
			      faXingList.add(faXingDto);
			}
		        String forward = null;
				httpServletRequest.setAttribute("faXingList", faXingList);
				httpServletRequest.setAttribute("counttype", counttype);
				httpServletRequest.setAttribute("inputDate", statMonth);
				if(AppConst.PRINT_FLAG.equals(print)){
					forward = "leijistoretableprint";
				}else{
					forward = "leijistoretable";
				}
				
				
				return actionMapping.findForward(forward);
			
			}
	}
	
	public String getAddMonthCondition(String startMonth, String endMonth,
			String column) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("1=1 and ").append(column).append(" between '").append(
				startMonth).append("' and '").append(endMonth).append("'");
		return buffer.toString();
	}

	public TownSataDto getAllSumStat(TownSataDto factoryDto, TownSataDto townDto,
			LwAllWholeFeeDto o) {
		
		double pureDianFee = 0;
		double dianFeeTax = 0;
		double pureSanXia = 0;
		double sanXiaTax = 0;
		double pureDianJin = 0;
		double dianJinTax = 0;
		
		double pureJiJin = 0;
		double jiJinTax = 0;
		double sumPowerFee = 0;
		double sumPower = 0;
		double chaBie = 0;
		double chabieTax = 0;
		sumPower = factoryDto.getSumPower() + factoryDto.getSumPower()
				+ Double.parseDouble(o.getPower1());
		pureDianFee = factoryDto.getPurePowerFee() + townDto.getPurePowerFee()
				+ Double.parseDouble(o.getDianfei());
		dianFeeTax = factoryDto.getPowerFeeTax() + townDto.getPowerFeeTax()
				+ Double.parseDouble(o.getDianfeitax());
		pureSanXia = factoryDto.getPureSanXia() + townDto.getPureSanXia()
				+ Double.parseDouble(o.getSanxia());
		pureDianJin = factoryDto.getPureDianJin() + townDto.getPureDianJin()
				+ Double.parseDouble(o.getDianjin());
		dianJinTax = factoryDto.getDianJinTax()+townDto.getDianJinTax()+Double.parseDouble(o.getDianjintax());
		sanXiaTax = factoryDto.getSanXiaTax() + townDto.getSanXiaTax()
				+ Double.parseDouble(o.getSanxiatax());
		pureJiJin = factoryDto.getPureJiJin() + townDto.getPureJiJin()
				+ Double.parseDouble(o.getJijin());
		jiJinTax = factoryDto.getJiJinTax() + townDto.getJiJinTax()
				+ Double.parseDouble(o.getFujia1());
		sumPowerFee = factoryDto.getSumPowerFee() + townDto.getSumPowerFee()
				+ Double.parseDouble(o.getSumfee());
		chaBie = Double.parseDouble(o.getFujia9())/1.17;
		chabieTax = Double.parseDouble(o.getFujia9())/1.17*0.17;
		
		TownSataDto townSataDto = new TownSataDto();
		townSataDto.setCompanyName("总计");
		townSataDto.setSumPower(sumPower);
		townSataDto.setPurePowerFee(pureDianFee);
		townSataDto.setPowerFeeTax(dianFeeTax);
		townSataDto.setPureSanXia(pureSanXia);
		townSataDto.setSanXiaTax(sanXiaTax);
		townSataDto.setPureJiJin(pureJiJin);
		townSataDto.setJiJinTax(jiJinTax);
		townSataDto.setSumPowerFee(sumPowerFee);
		townSataDto.setPureDianJin(pureDianJin);
		townSataDto.setDianJinTax(dianJinTax);
		townSataDto.setPureDianJin(pureDianJin);
		townSataDto.setPureChaBie(chaBie);
		townSataDto.setChaBieTax(chabieTax);		

		return townSataDto;
	}

	/**
	 * 大工业累计
	 * 
	 * @param conditions
	 * @return
	 * @throws Exception
	 */
	public Collection<TownSataDto> getCorporationSumStat(String conditions)
			throws Exception {
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();
		
		// 查询所有大工业用户
		Collection<LwCoporationUserInfoDto> userList = blLwCoporationUserInfoFacade
				.findByConditions("1=1");
		// 查询出大工业用户的算费信息。
		Collection<LwCorporationSummaryDto> priceList = blLwCorporationSummaryFacade
				.findByConditions(conditions);
		Collection<TownSataDto> resultList = new ArrayList<TownSataDto>();
		LwCorporationSummaryDto summary = null;
		String userName = null;
		for (Iterator iterator = userList.iterator(); iterator.hasNext();) {
			LwCoporationUserInfoDto user = (LwCoporationUserInfoDto) iterator
					.next();
			String userNo = null;
			String userNotemp = null;
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
			// 用户代码
			userNo = user.getUserNo();
			// 用户名称
			userName = user.getUserName();
			TownSataDto townSataDto = null;
			for (Iterator iterator2 = priceList.iterator(); iterator2.hasNext();) {
				LwCorporationSummaryDto lwCorporationSummaryDto = (LwCorporationSummaryDto) iterator2
						.next();
				userNotemp = lwCorporationSummaryDto.getLineCode();
				summary = new LwCorporationSummaryDto();
				if (userNo.equals(userNotemp)) {
					electricQuantity += lwCorporationSummaryDto
							.getElectricQuantity();
					sanXiaFee += lwCorporationSummaryDto.getSanXiaFee();
					/** 属性基金 */
					surcharge += lwCorporationSummaryDto.getSurcharge();
					/** 属性电金 */
					powerFee += lwCorporationSummaryDto.getPowerFee();
					/** 属性非居民电量 */
					unDenizenQuantity += lwCorporationSummaryDto
							.getUnDenizenQuantity();
					/** 属性有功电量 */
					pointerQuantity += lwCorporationSummaryDto
							.getPointerQuantity();
					/** 属性有功电价 */
					pointerPrice += lwCorporationSummaryDto.getPointerPrice();
					/** 属性有功电费 */
					pointerFee += lwCorporationSummaryDto.getPointerFee();
					/** 属性非居民电价 */
					unDenizenPrice += lwCorporationSummaryDto.getUnDenizenFee();
					/** 属性非居民电费 */
					unDenizenFee += lwCorporationSummaryDto.getUnDenizenFee();
					/** 属性力率电费 */
					powerRateFee += lwCorporationSummaryDto.getPowerRateFee();
					/** 属性需量电量 */
					needQuantity += lwCorporationSummaryDto.getNeedQuantity();
					/** 属性需量电费 */
					needFee += lwCorporationSummaryDto.getNeedFee();
					/** 属性容量电量 */
					contentQuantity += lwCorporationSummaryDto
							.getContentQuantity();
					/** 属性容量电价 */
					contentPrice += lwCorporationSummaryDto.getContentPrice();
					/** 属性容量电费 */
					contentFee += lwCorporationSummaryDto.getContentFee();
					/** 属性无功电量 */
					unPointerQuantity += lwCorporationSummaryDto
							.getUnPointerQuantity();

					/** 属性谷段电量 */
					valleyQuantity += lwCorporationSummaryDto
							.getValleyQuantity();
					/** 属性峰段电量 */
					peakQuantity += lwCorporationSummaryDto.getPeakQuantity();
					/** 属性峰段电价 */
					peakPrice += lwCorporationSummaryDto.getPeakPrice();
					/** 属性谷段电j价 */
					valleyPrice += lwCorporationSummaryDto.getValleyPrice();
					/** 属性峰段电费 */
					peakFee += lwCorporationSummaryDto.getPeakFee();
					/** 属性古段电费 */
					valleyFee += lwCorporationSummaryDto.getValleyFee();
					/** 属性变损电量 */
					lossQuantity += lwCorporationSummaryDto.getLossQuantity();

					/** 属性电费合计 */
					sumFee += lwCorporationSummaryDto.getSumFee();

					/** 属性抄见电量 */
					sumPointerQuantity += lwCorporationSummaryDto
							.getSumPointerQuantity();

					/** 属性改变前电量 */
					beforPower += lwCorporationSummaryDto.getBeforPower();
					/** 属性改变后电量 */
					lastPower += lwCorporationSummaryDto.getLastPower();
					/** 属性改变前电费 */
					beforFee += lwCorporationSummaryDto.getBeforFee();
					/** 属性改变后电费 */
					lastFee += lwCorporationSummaryDto.getLastFee();

					/** 属性需量指针 */
					needPointer += lwCorporationSummaryDto.getNeedPointer();
					/** 属性有功线损电量 */
					lineLoss += lwCorporationSummaryDto.getLineLoss();
					/** 属性无功线损电量 */
					unLineLoss += lwCorporationSummaryDto.getUnLineLoss();
					/** 属性无功变损电量 */
					unLossQuantity += lwCorporationSummaryDto
							.getUnLossQuantity();

				}

			}
			double purePowerFee = 0;
			townSataDto = new TownSataDto();
			if (("20699999065".equals(userNo)) || "20699999072".equals(userNo)) {
				townSataDto.setSumPower(PowerFeeCal.getValue(electricQuantity,
						AppConst.TWO_DOT_FLAG));
				purePowerFee = (peakFee + contentFee + needFee + powerRateFee + unDenizenFee) / 1.17;
				townSataDto.setPurePowerFee(PowerFeeCal.getValue(purePowerFee,
						AppConst.TWO_DOT_FLAG));

			}else {
				townSataDto.setSumPower(PowerFeeCal.getValue(electricQuantity,
						AppConst.TWO_DOT_FLAG));
				purePowerFee = (pointerFee + contentFee + needFee
						+ powerRateFee + unDenizenFee) / 1.17;
				townSataDto.setPurePowerFee(PowerFeeCal.getValue(purePowerFee,
						AppConst.TWO_DOT_FLAG));
			}
			townSataDto.setCompanyName(userName);
			townSataDto.setPowerFeeTax(PowerFeeCal.getValue(
					purePowerFee * 0.17, AppConst.TWO_DOT_FLAG));
			townSataDto.setPureDianJin(PowerFeeCal.getValue(powerFee / 1.17,
					AppConst.TWO_DOT_FLAG));
			townSataDto.setDianJinTax(PowerFeeCal.getValue(
					((powerFee / 1.17) * 0.17), AppConst.TWO_DOT_FLAG));
			townSataDto.setPureSanXia(PowerFeeCal.getValue(sanXiaFee / 1.17,
					AppConst.TWO_DOT_FLAG));
			townSataDto.setSanXiaTax(PowerFeeCal.getValue(
					((sanXiaFee / 1.17) * 0.17), AppConst.TWO_DOT_FLAG));
			townSataDto.setPureJiJin(PowerFeeCal.getValue(surcharge / 1.17,
					AppConst.TWO_DOT_FLAG));
			townSataDto.setJiJinTax(PowerFeeCal.getValue(
					((surcharge / 1.17) * 0.17), AppConst.TWO_DOT_FLAG));

			townSataDto.setSumPowerFee(PowerFeeCal.getValue(sumFee,
					AppConst.TWO_DOT_FLAG));

			townSataDto.setStatMonth(statMonth);

			resultList.add(townSataDto);

		}
		return resultList;
	}

	public LwAllWholeFeeDto getAllWholeFee(
			Collection<LwAllWholeFeeDto> collection, String company,
			String statMonth) {
		LwAllWholeFeeDto lwAllWholeFeeDto2 = new LwAllWholeFeeDto();
		double power1 = 0D;
		/** 属性电费 */
		double dianfei = 0D;
		/** 属性三峡 */
		double sanxia = 0D;
		/** 属性电力资金 */
		double dianjin = 0D;
		/** 属性基金 */
		double jijin = 0D;
		/** 属性电费税 */
		double dianfeitax = 0D;
		/** 属性三峡税 */
		double sanxiatax = 0D;
		/** 属性电金税 */
		double dianjintax = 0D;
		/** 属性总计 */
		double sumfee = 0D;
		/** 属性海明炉 */
		double haiminglu = 0D;
		/** 属性多边 */
		double duobian = 0D;
		/** 属性追加 */
		double zhuijia = 0D;
		/** 属性附加1 */
		double fujia1 = 0D;
		/** 属性附加2 */
		double fujia2 = 0D;
		/** 属性附加3 */
		double fujia3 = 0D;
		/** 属性附加5 */
		double fujia5 = 0D;
		/** 属性附加9 */
		double fujia9 = 0D;

		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwAllWholeFeeDto lwAllWholeFeeDto = (LwAllWholeFeeDto) iterator
					.next();

			power1 += Double.parseDouble(lwAllWholeFeeDto.getPower1());
			/** 属性电费 */
			dianfei += Double.parseDouble(lwAllWholeFeeDto.getDianfei());
			/** 属性三峡 */
			sanxia += Double.parseDouble(lwAllWholeFeeDto.getSanxia());
			/** 属性电力资金 */
			dianjin += Double.parseDouble(lwAllWholeFeeDto.getDianfei());
			/** 属性基金 */
			jijin += Double.parseDouble(lwAllWholeFeeDto.getJijin());
			/** 属性电费税 */
			dianfeitax += Double.parseDouble(lwAllWholeFeeDto.getDianfeitax());
			/** 属性三峡税 */
			sanxiatax += Double.parseDouble(lwAllWholeFeeDto.getSanxiatax());
			/** 属性电金税 */
			dianjintax += Double.parseDouble(lwAllWholeFeeDto.getDianjintax());
			/** 属性总计 */
			sumfee += Double.parseDouble(lwAllWholeFeeDto.getSumfee());
			/** 属性海明炉 */
			haiminglu += Double.parseDouble(lwAllWholeFeeDto.getHaiminglu());
			/** 属性多边 */
			duobian += Double.parseDouble(lwAllWholeFeeDto.getDuobian());
			/** 属性附加1 */
			fujia1 += Double.parseDouble(lwAllWholeFeeDto.getFujia1());
			/** 属性附加2 */
			fujia2 += Double.parseDouble(lwAllWholeFeeDto.getFujia2());
			/** 属性附加3 */
			fujia3 += Double.parseDouble(lwAllWholeFeeDto.getFujia3());
			/** 属性附加5 */
			String tempFujia5 = lwAllWholeFeeDto.getFujia5();
			fujia5 += Double.parseDouble((tempFujia5 == null || ""
					.equals(tempFujia5)) ? "0" : tempFujia5);
			/** 属性附加9 差别 */
			String tempFujia9 = lwAllWholeFeeDto.getFujia9();
			fujia9 += Double.parseDouble((tempFujia9 == null || ""
					.equals(tempFujia9)) ? "0" : tempFujia9);

		}
		if ("gy".equals(company)) {
			lwAllWholeFeeDto2.setCompany("固阳");
		}
		if ("dm".equals(company)) {
			lwAllWholeFeeDto2.setCompany("达贸");
		}
		if ("ty".equals(company)) {
			lwAllWholeFeeDto2.setCompany("土佑");
		}
		if ("jy".equals(company)) {
			lwAllWholeFeeDto2.setCompany("九原");
		}

		double puredianFei = sumfee - sanxia - sanxiatax - jijin - fujia1
				- dianjin - dianjintax - fujia9;
		lwAllWholeFeeDto2.setPower1(new Double(power1).toString());
		lwAllWholeFeeDto2.setDianfei(new Double(puredianFei / 1.17).toString());
		lwAllWholeFeeDto2.setSanxia(new Double(sanxia).toString());
		lwAllWholeFeeDto2.setDianjin(new Double(dianjin).toString());
		lwAllWholeFeeDto2.setJijin(new Double(jijin).toString());
		lwAllWholeFeeDto2.setDianfeitax(new Double(puredianFei / 1.17 * 0.17)
				.toString());
		lwAllWholeFeeDto2.setSanxiatax(new Double(sanxiatax).toString());
		lwAllWholeFeeDto2.setDianjintax(new Double(dianjintax).toString());
		lwAllWholeFeeDto2.setSumfee(new Double(sumfee).toString());
		lwAllWholeFeeDto2.setHaiminglu(new Double(haiminglu).toString());
		lwAllWholeFeeDto2.setDuobian(new Double(duobian).toString());
		lwAllWholeFeeDto2.setZhuijia(new Double(zhuijia).toString());
		lwAllWholeFeeDto2.setFujia1(new Double(fujia1).toString());
		lwAllWholeFeeDto2.setFujia2(new Double(fujia2).toString());
		lwAllWholeFeeDto2.setFujia3(new Double(fujia3).toString());
		lwAllWholeFeeDto2.setFujia5(new Double(fujia5).toString());
		lwAllWholeFeeDto2.setFujia9(new Double(fujia9).toString());
		return lwAllWholeFeeDto2;
	}

}
