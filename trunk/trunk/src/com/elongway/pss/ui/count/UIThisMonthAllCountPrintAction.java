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

public class UIThisMonthAllCountPrintAction extends Action {
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
		// ������
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
		// ����ͳ��
		if ("1".equals(counttype)) {

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
			// ���ҵ������д�ҵ�ļ�����
			Collection colf = blLwCorporationSummaryFacade
					.findByConditions(conditions);
			LwCorporationSummaryDto lwCorporationSummaryDto = new LwCorporationSummaryDto();
			Iterator itf = colf.iterator();

			// �����ṹ���ó���������ѡ������Ͽ������
			while (itf.hasNext()) {
				lwCorporationSummaryDto = (LwCorporationSummaryDto) itf.next();

				if (lwCorporationSummaryDto.getLineCode().equals("20699999065")
						|| lwCorporationSummaryDto.getLineCode().equals(
								"20699999072")) {
					sumfpower += lwCorporationSummaryDto.getElectricQuantity()
							+ lwCorporationSummaryDto.getBeforPower()
							+ lwCorporationSummaryDto.getLastPower();
				} else {
					sumfpower += lwCorporationSummaryDto.getElectricQuantity()
							+ lwCorporationSummaryDto.getBeforPower()
							+ lwCorporationSummaryDto.getLastPower();
				}
				if (lwCorporationSummaryDto.getLineCode().equals("20699999065")
						|| lwCorporationSummaryDto.getLineCode().equals(
								"20699999072")) {

					sumfdianfee += lwCorporationSummaryDto.getPeakFee()
							+ lwCorporationSummaryDto.getPowerRateFee()

							+ lwCorporationSummaryDto.getContentFee()
							+ lwCorporationSummaryDto.getNeedFee()
							+ lwCorporationSummaryDto.getUnDenizenFee()
							+ lwCorporationSummaryDto.getBeforFee()
							+ lwCorporationSummaryDto.getLastFee()
							+lwCorporationSummaryDto.getUnLineLoss()

					;
				} else {
					sumfdianfee += lwCorporationSummaryDto.getPointerFee()
							+ lwCorporationSummaryDto.getPowerRateFee()

							+ lwCorporationSummaryDto.getContentFee()
							+ lwCorporationSummaryDto.getNeedFee()
							+ lwCorporationSummaryDto.getUnDenizenFee()
							+lwCorporationSummaryDto.getUnLineLoss();
				}
				summfdianjinall += lwCorporationSummaryDto.getPowerFee();
				sumfsanxiaall += lwCorporationSummaryDto.getSanXiaFee();
				sumfjijinall += lwCorporationSummaryDto.getSurcharge();
				sumffee += PowerFeeCal.getValue(lwCorporationSummaryDto
						.getSumFee(), AppConst.TWO_DOT_FLAG);

			}

			// �ĸ��ֱַ�ͳ��

			// �������ۼ�����
			Collection col = blLwWholeSaleSummaryFacade
					.findByConditions(conditions);
			Iterator it = col.iterator();
			while (it.hasNext()) {
				LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) it
						.next();
				// �õ������ֵĲ�����
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

			sumwfee = sumwdianfee + summwdianjinall + sumwsanxiaall
					+ sumwjijinall;
			/**
			 * ֱ���簴��ͳ��
			 */

			// �õ��ĸ��ֵļ�������
			Collection<LwDcodeDto> comList = blLwDcodeFacade
					.findByConditions(" codetype = 'SupplyCom'");
			// �õ��ĸ��ֵ�ͳ������
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
						.findByConditions(" 1=1  and statmonth = '" + inputDate
								+ "' " + condition);
				townSataDto = blCalPowerFeeCustomFacade.townStatByCompany(
						priceSummaryList, inputDate);
				townSataDto.setComCode(company);
				townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
				resultList.add(townSataDto);
			}
			// �ĸ��ֵ�ͳ�ƻ���
			townSataDto = PowerFeeCal.getSumCompanyStat(resultList, inputDate);
			townSataDto.setCompanyName("С��");
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
							- Double
									.parseDouble(lwAllWholeFeeDtodm.getSanxia())
							- Double.parseDouble(lwAllWholeFeeDtodm
									.getSanxiatax())
							- Double.parseDouble(lwAllWholeFeeDtodm
									.getDianjin())
							- Double.parseDouble(lwAllWholeFeeDtodm
									.getDianjintax())
							- Double.parseDouble(lwAllWholeFeeDtodm.getJijin()) - Double
							.parseDouble(lwAllWholeFeeDtodm.getFujia1()))
					+ (Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())
							- Double
									.parseDouble(lwAllWholeFeeDtoty.getSanxia())
							- Double.parseDouble(lwAllWholeFeeDtoty
									.getSanxiatax())
							- Double.parseDouble(lwAllWholeFeeDtoty
									.getDianjin())
							- Double.parseDouble(lwAllWholeFeeDtoty
									.getDianjintax())
							- Double.parseDouble(lwAllWholeFeeDtoty.getJijin()) - Double
							.parseDouble(lwAllWholeFeeDtoty.getFujia1()))
					+ (Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())
							- Double
									.parseDouble(lwAllWholeFeeDtojy.getSanxia())
							- Double.parseDouble(lwAllWholeFeeDtojy
									.getSanxiatax())
							- Double.parseDouble(lwAllWholeFeeDtojy
									.getDianjin())
							- Double.parseDouble(lwAllWholeFeeDtojy
									.getDianjintax())
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
							- Double
									.parseDouble(lwAllWholeFeeDtodm.getSanxia())
							- Double.parseDouble(lwAllWholeFeeDtodm
									.getSanxiatax())
							- Double.parseDouble(lwAllWholeFeeDtodm
									.getDianjin())
							- Double.parseDouble(lwAllWholeFeeDtodm
									.getDianjintax())
							- Double.parseDouble(lwAllWholeFeeDtodm.getJijin()) - Double
							.parseDouble(lwAllWholeFeeDtodm.getFujia1()))
					+ (Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())
							- Double
									.parseDouble(lwAllWholeFeeDtoty.getSanxia())
							- Double.parseDouble(lwAllWholeFeeDtoty
									.getSanxiatax())
							- Double.parseDouble(lwAllWholeFeeDtoty
									.getDianjin())
							- Double.parseDouble(lwAllWholeFeeDtoty
									.getDianjintax())
							- Double.parseDouble(lwAllWholeFeeDtoty.getJijin()) - Double
							.parseDouble(lwAllWholeFeeDtoty.getFujia1()))
					+ (Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())
							- Double
									.parseDouble(lwAllWholeFeeDtojy.getSanxia())
							- Double.parseDouble(lwAllWholeFeeDtojy
									.getSanxiatax())
							- Double.parseDouble(lwAllWholeFeeDtojy
									.getDianjin())
							- Double.parseDouble(lwAllWholeFeeDtojy
									.getDianjintax())
							- Double.parseDouble(lwAllWholeFeeDtojy.getJijin()) - Double
							.parseDouble(lwAllWholeFeeDtojy.getFujia1())) - differenceQuantity * 0.2) / 1.17 * 0.17;
			summwdianjin = Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())
					+ Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())
					+ Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())
					+ Double.parseDouble(lwAllWholeFeeDtojy.getDianjin());
			sumwdianjintax = Double.parseDouble(lwAllWholeFeeDtogy
					.getDianjintax())
					+ Double.parseDouble(lwAllWholeFeeDtoty.getDianjintax())
					+ Double.parseDouble(lwAllWholeFeeDtodm.getDianjintax())
					+ Double.parseDouble(lwAllWholeFeeDtojy.getDianjintax());
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
			sumwjijintax = Double.parseDouble(lwAllWholeFeeDtogy.getFujia1())
					+ Double.parseDouble(lwAllWholeFeeDtoty.getFujia1())
					+ Double.parseDouble(lwAllWholeFeeDtodm.getFujia1())
					+ Double.parseDouble(lwAllWholeFeeDtojy.getFujia1());

			sumallfee = sumfdianfee + sumwdianfee + townSataDto.getPowerFee();
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
			sumalljijin = sumwjijin + sumfjijin + townSataDto.getPureJiJin();
			sumalljijintax = sumwjijintax + sumfjijintax
					+ townSataDto.getJiJinTax();

			httpServletRequest.setAttribute("sumffee", df.format(sumffee));
			httpServletRequest.setAttribute("sumfpower", Math.round(sumfpower));
			httpServletRequest.setAttribute("sumfdianfee", df
					.format(sumfdianfee));
			httpServletRequest.setAttribute("sumftax", df.format(sumftax));
			httpServletRequest.setAttribute("sumfc", df.format(sumfc));
			httpServletRequest.setAttribute("summfdianjin", df
					.format(summfdianjin));
			httpServletRequest.setAttribute("sumfdianjintax", df
					.format(sumfdianjintax));
			httpServletRequest
					.setAttribute("sumfsanxia", df.format(sumfsanxia));
			httpServletRequest.setAttribute("sumfsanxiatax", df
					.format(sumfsanxiatax));
			httpServletRequest.setAttribute("sumfjijin", df.format(sumfjijin));
			httpServletRequest.setAttribute("sumfjijintax", df
					.format(sumfjijintax));
			httpServletRequest.setAttribute("sumwfee", df.format(sumwfee));
			httpServletRequest.setAttribute("sumwpower", Math.round(sumwpower));
			httpServletRequest.setAttribute("sumwdianfee", df
					.format(sumwdianfee));
			httpServletRequest.setAttribute("sumwtax", df.format(sumwtax));
			httpServletRequest.setAttribute("sumwc", df.format(sumwc));
			httpServletRequest.setAttribute("summwdianjin", df
					.format(summwdianjin));
			httpServletRequest.setAttribute("sumwdianjintax", df
					.format(sumwdianjintax));

			httpServletRequest
					.setAttribute("sumwsanxia", df.format(sumwsanxia));
			httpServletRequest.setAttribute("sumwsanxiatax", df
					.format(sumwsanxiatax));
			httpServletRequest.setAttribute("sumwjijin", df.format(sumwjijin));
			httpServletRequest.setAttribute("sumwjijintax", df
					.format(sumwjijintax));

			httpServletRequest.setAttribute("sumallfee", df.format(sumallfee));
			httpServletRequest.setAttribute("sumallpower", Math
					.round(sumallpower));
			httpServletRequest.setAttribute("sumallc", df.format(sumallc));
			httpServletRequest.setAttribute("sumalltax", df.format(sumalltax));
			httpServletRequest.setAttribute("sumallall", df.format(sumallall));
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

			return actionMapping.findForward("viewthisallcount");
			// �ۼ�
		} else {
			String inputDate = httpServletRequest.getParameter("inputDate");
			inputDate = new DateTime(inputDate, DateTime.YEAR_TO_MONTH)
					.toString();
			BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();
			// ��֯�ۼ�����
			conditions = this.getAddMonthCondition("2009-01", inputDate,
					"statMonth");
			/**
			 * 0 -- �õ��ۼ����д�ҵ�ļ�����
			 */
			Collection colf = getCorporationSumStat(conditions);
			// ���۸������ۼƼ�������
			String tempCondition = this.getAddMonthCondition("2009-01",
					inputDate, "inputdate");
			String conditionsgy = tempCondition + " and upcompany='gy' ";
			String conditionsdm = tempCondition + " and upcompany='dm' ";
			String conditionsjy = tempCondition + " and upcompany='jy' ";
			String conditionsty = tempCondition + " and upcompany='ty' ";

			TownSataDto townSataDto2 = null;
			Iterator itf = colf.iterator();
			double pureDianFee = 0;
			double dianFeeTax = 0;
			double pureSanXia = 0;
			double pureDianJin = 0;
			double sanXiaTax = 0;
			double pureJiJin = 0;
			double jiJinTax = 0;
			double sumPowerFee = 0;
			// �����ṹ���ó���������ѡ������Ͽ������
			while (itf.hasNext()) {
				townSataDto2 = (TownSataDto) itf.next();
				sumfpower += townSataDto2.getSumPower();
				sumPowerFee += townSataDto2.getSumPowerFee();
				pureDianFee += townSataDto2.getPurePowerFee();
				pureDianJin += townSataDto2.getPureDianJin();
				dianFeeTax += townSataDto2.getDianJinTax();
				pureSanXia += townSataDto2.getPureSanXia();

				sanXiaTax += townSataDto2.getSanXiaTax();
				pureJiJin += townSataDto2.getPureJiJin();
				jiJinTax += townSataDto2.getJiJinTax();
			}
			townSataDto2 = new TownSataDto();
			townSataDto2.setSumPower(sumfpower);
			townSataDto2.setPurePowerFee(pureDianFee);
			townSataDto2.setPowerFeeTax(PowerFeeCal.getValue(dianFeeTax,
					AppConst.TWO_DOT_FLAG));
			townSataDto2.setPureDianJin(PowerFeeCal.getValue(pureDianJin,
					AppConst.TWO_DOT_FLAG));
			townSataDto2.setDianJinTax(PowerFeeCal.getValue(dianFeeTax,
					AppConst.TWO_DOT_FLAG));
			townSataDto2.setPureSanXia(PowerFeeCal.getValue(pureSanXia,
					AppConst.TWO_DOT_FLAG));
			townSataDto2.setSanXiaTax(PowerFeeCal.getValue(sanXiaTax,
					AppConst.TWO_DOT_FLAG));
			townSataDto2.setPureJiJin(PowerFeeCal.getValue(pureJiJin,
					AppConst.TWO_DOT_FLAG));
			townSataDto2.setJiJinTax(PowerFeeCal.getValue(jiJinTax,
					AppConst.TWO_DOT_FLAG));

			townSataDto2.setSumPowerFee(PowerFeeCal.getValue(sumPowerFee,
					AppConst.TWO_DOT_FLAG));
			townSataDto2.setCompanyName("С��");
			colf.add(townSataDto2);

			/**
			 * 1 -- �õ��ۼ��������۵ļ�����
			 */

			BLLwAllWholeFeeFacade blLwAllWholeFeeFacade = new BLLwAllWholeFeeFacade();

			Collection<LwAllWholeFeeDto> allWholeFeeListgy = blLwAllWholeFeeFacade
					.findByConditions(tempCondition + " and company = 'gy'");
			LwAllWholeFeeDto lwAllWholeFeeDtogy = this.getAllWholeFee(
					allWholeFeeListgy, "gy", inputDate);
			Collection allWholeFeeListdm = blLwAllWholeFeeFacade
					.findByConditions(tempCondition + " and company = 'dm'");
			LwAllWholeFeeDto lwAllWholeFeeDtodm = this.getAllWholeFee(
					allWholeFeeListdm, "dm", inputDate);
			Collection allWholeFeeListty = blLwAllWholeFeeFacade
					.findByConditions(tempCondition + " and company = 'ty'");
			LwAllWholeFeeDto lwAllWholeFeeDtoty = this.getAllWholeFee(
					allWholeFeeListty, "ty", inputDate);
			Collection allWholeFeeListjy = blLwAllWholeFeeFacade
					.findByConditions(tempCondition + " and company = 'jy'");
			LwAllWholeFeeDto lwAllWholeFeeDtojy = this.getAllWholeFee(
					allWholeFeeListjy, "jy", inputDate);

			Collection<LwAllWholeFeeDto> wholeResultList = new ArrayList<LwAllWholeFeeDto>();
			wholeResultList.add(lwAllWholeFeeDtogy);
			wholeResultList.add(lwAllWholeFeeDtodm);
			wholeResultList.add(lwAllWholeFeeDtoty);
			wholeResultList.add(lwAllWholeFeeDtojy);
			double power1 = 0D;
			/** ���Ե�� */
			double dianfei = 0D;
			/** ������Ͽ */
			double sanxia = 0D;
			/** ���Ե����ʽ� */
			double dianjin = 0D;
			/** ���Ի��� */
			double jijin = 0D;
			/** ���Ե��˰ */
			double dianfeitax = 0D;
			/** ������Ͽ˰ */
			double sanxiatax = 0D;
			/** ���Ե��˰ */
			double dianjintax = 0D;
			/** �����ܼ� */
			double sumfee = 0D;
			/** ���Ժ���¯ */
			double haiminglu = 0D;
			/** ���Զ�� */
			double duobian = 0D;
			/** ����׷�� */
			double zhuijia = 0D;
			/** ���Ը���1 */
			double fujia1 = 0D;
			/** ���Ը���2 */
			double fujia2 = 0D;
			/** ���Ը���3 */
			double fujia3 = 0D;
			/** ���Ը���5 */
			double fujia5 = 0D;
			/** ���Ը���9 */
			double fujia9 = 0D;
			LwAllWholeFeeDto o = new LwAllWholeFeeDto();
			for (Iterator iterator = wholeResultList.iterator(); iterator
					.hasNext();) {
				LwAllWholeFeeDto lwAllWholeFeeDto = (LwAllWholeFeeDto) iterator
						.next();
				power1 += Double.parseDouble(lwAllWholeFeeDto.getPower1());
				/** ���Ե�� */
				dianfei += Double.parseDouble(lwAllWholeFeeDto.getDianfei());
				/** ������Ͽ */
				sanxia += Double.parseDouble(lwAllWholeFeeDto.getDianfei());
				/** ���Ե����ʽ� */
				dianjin += Double.parseDouble(lwAllWholeFeeDto.getDianjin());
				/** ���Ի��� */
				jijin += Double.parseDouble(lwAllWholeFeeDto.getJijin());
				/** ���Ե��˰ */
				dianfeitax += Double.parseDouble(lwAllWholeFeeDto
						.getDianfeitax());
				/** ������Ͽ˰ */
				sanxiatax += Double
						.parseDouble(lwAllWholeFeeDto.getSanxiatax());
				/** ���Ե��˰ */
				dianjintax += Double.parseDouble(lwAllWholeFeeDto
						.getDianjintax());
				/** �����ܼ� */
				sumfee += Double.parseDouble(lwAllWholeFeeDto.getSumfee());
				/** ���Ժ���¯ */
				haiminglu += Double
						.parseDouble(lwAllWholeFeeDto.getHaiminglu());
				/** ���Զ�� */
				duobian += Double.parseDouble(lwAllWholeFeeDto.getDuobian());
				/** ����׷�� */
				zhuijia += Double.parseDouble(lwAllWholeFeeDto.getZhuijia());
				/** ���Ը���1 */
				fujia1 += Double.parseDouble(lwAllWholeFeeDto.getFujia1());
				/** ���Ը���2 */
				fujia2 += Double.parseDouble(lwAllWholeFeeDto.getFujia2());
				/** ���Ը���3 */
				fujia3 += Double.parseDouble(lwAllWholeFeeDto.getFujia3());
				/** ���Ը���5 */
				fujia5 += Double.parseDouble(lwAllWholeFeeDto.getFujia5());
				/** ���Ը���9 */
				fujia9 += Double.parseDouble(lwAllWholeFeeDto.getFujia9());
			}
			double puredianFei = sumfee - sanxia - sanxiatax - jijin - fujia1
					- dianjin - dianjintax - fujia9;
			o.setPower1(new Double(power1).toString());
			o.setDianfei(new Double(puredianFei / 1.17).toString());
			o.setSanxia(new Double(sanxia).toString());
			o.setDianjin(new Double(dianjin).toString());
			o.setJijin(new Double(jijin).toString());
			o.setDianfeitax(new Double(puredianFei / 1.17 * 0.17).toString());
			o.setSanxiatax(new Double(sanxiatax).toString());
			o.setDianjintax(new Double(dianjintax).toString());
			o.setSumfee(new Double(sumfee).toString());
			o.setHaiminglu(new Double(haiminglu).toString());
			o.setDuobian(new Double(duobian).toString());
			o.setZhuijia(new Double(zhuijia).toString());
			o.setFujia1(new Double(fujia1).toString());
			o.setFujia2(new Double(fujia2).toString());
			o.setFujia3(new Double(fujia3).toString());
			o.setFujia5(new Double(fujia5).toString());
			o.setFujia9(new Double(fujia9).toString());
			o.setCompany("С��");
			wholeResultList.add(o);
			httpServletRequest.setAttribute("wholeResultList", wholeResultList);
			Collection<LwDcodeDto> comList = blLwDcodeFacade
					.findByConditions(" codetype = 'SupplyCom'");
			// �õ��ĸ��ֵ�ͳ������
			for (Iterator iterator = comList.iterator(); iterator.hasNext();) {
				LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
				company = lwDcodeDto.getCodeCode();

				userList = blLwPowerUserFacade
						.findByConditions("superclass = '" + company + "'");
				condition = PowerFeeCal.getUserCondition(userList);
				priceSummaryList = blLwTownPriceSummaryFacade
						.findByConditions(this.getAddMonthCondition("2009-01",
								inputDate, "statMonth")
								+ condition);
				townSataDto = blCalPowerFeeCustomFacade.townStatByCompany(
						priceSummaryList, inputDate);
				townSataDto.setComCode(company);
				townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
				resultList.add(townSataDto);
			}
			// �ĸ��ֵ�ͳ�ƻ���
			townSataDto = PowerFeeCal.getSumCompanyStat(resultList, inputDate);
			townSataDto.setCompanyName("С��");
			resultList.add(townSataDto);
			
			TownSataDto sum = this.getAllSumStat(townSataDto2, townSataDto, o);
			httpServletRequest.setAttribute("sum", sum);
			httpServletRequest.setAttribute("resultList", resultList);
			httpServletRequest.setAttribute("colf", colf);
			httpServletRequest.setAttribute("inputDate", inputDate);
			httpServletRequest.setAttribute("counttype", counttype);
			

			return actionMapping.findForward("sumStatPrint");
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
		double pureDianJin = 0;
		double dianJinTax = 0;
		double sanXiaTax = 0;
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
		townSataDto.setCompanyName("�ܼ�");
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
	 * ��ҵ�ۼ�
	 * 
	 * @param conditions
	 * @return
	 * @throws Exception
	 */
	public Collection<TownSataDto> getCorporationSumStat(String conditions)
			throws Exception {
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();

		Collection<LwCoporationUserInfoDto> userList = blLwCoporationUserInfoFacade
				.findByConditions("1=1");
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
			/** ����ͳ������ */
			String statMonth = "";
			/** �����õ���� */
			String powerClass = "";
			/** �����ܵ��� */
			double electricQuantity = 0D;
			/** ������Ͽ */
			double sanXiaFee = 0D;
			/** ���Ի��� */
			double surcharge = 0D;
			/** ���Ե�� */
			double powerFee = 0D;
			/** ���ԷǾ������ */
			double unDenizenQuantity = 0D;
			/** �����й����� */
			double pointerQuantity = 0D;
			/** �����й���� */
			double pointerPrice = 0D;
			/** �����й���� */
			double pointerFee = 0D;
			/** ���ԷǾ����� */
			double unDenizenPrice = 0D;
			/** ���ԷǾ����� */
			double unDenizenFee = 0D;
			/** ���Ե���ֵ */
			double ajustRate = 0D;
			/** �������ʵ�� */
			double powerRateFee = 0D;
			/** ���Թ������� */
			double rateCode = 0D;
			/** ������������ */
			double needQuantity = 0D;
			/** ����������� */
			double needPrice = 0D;
			/** ����������� */
			double needFee = 0D;
			/** ������������ */
			double contentQuantity = 0D;
			/** ����������� */
			double contentPrice = 0D;
			/** ����������� */
			double contentFee = 0D;
			/** �����޹����� */
			double unPointerQuantity = 0D;
			/** ���Ի����� */
			double surchargePrice = 0D;
			/** ������Ͽ���� */
			double sanXiaPrice = 0D;
			/** ���Ե���� */
			double powerPrice = 0D;
			/** ���Թȶε��� */
			double valleyQuantity = 0D;
			/** ���Է�ε��� */
			double peakQuantity = 0D;
			/** ���Է�ε�� */
			double peakPrice = 0D;
			/** ���Թȶε�j�� */
			double valleyPrice = 0D;
			/** ���Է�ε�� */
			double peakFee = 0D;
			/** ���ԹŶε�� */
			double valleyFee = 0D;
			/** ���Ա������ */
			double lossQuantity = 0D;
			/** ���Ա�־λ */
			String flag = "";
			/** ����ע�� */
			String remark = "";
			/** ���Ե�Ѻϼ� */
			double sumFee = 0D;
			/** ����¼������ */
			String inputDate = "";
			/** ���Գ������� */
			double sumPointerQuantity = 0D;
			/** ���Ե������� */
			String quantityStyle = "";
			/** ���Ըı�ǰ��� */
			double beforPrice = 0D;
			/** ���Ըı���� */
			double lastPrice = 0D;
			/** ���Ըı�ǰ���� */
			double beforPower = 0D;
			/** ���Ըı����� */
			double lastPower = 0D;
			/** ���Ըı�ǰ��� */
			double beforFee = 0D;
			/** ���Ըı���� */
			double lastFee = 0D;
			/** �����Ƿ����ı� */
			String ifchange = "";
			/** ��������ָ�� */
			double needPointer = 0D;
			/** �����й�������� */
			double lineLoss = 0D;
			/** �����޹�������� */
			double unLineLoss = 0D;
			/** �����޹�������� */
			double unLossQuantity = 0D;
			userNo = user.getUserNo();
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
					/** ���Ի��� */
					surcharge += lwCorporationSummaryDto.getSurcharge();
					/** ���Ե�� */
					powerFee += lwCorporationSummaryDto.getPowerFee();
					/** ���ԷǾ������ */
					unDenizenQuantity += lwCorporationSummaryDto
							.getUnDenizenQuantity();
					/** �����й����� */
					pointerQuantity += lwCorporationSummaryDto
							.getPointerQuantity();
					/** �����й���� */
					pointerPrice += lwCorporationSummaryDto.getPointerPrice();
					/** �����й���� */
					pointerFee += lwCorporationSummaryDto.getPointerFee();
					/** ���ԷǾ����� */
					unDenizenPrice += lwCorporationSummaryDto.getUnDenizenFee();
					/** ���ԷǾ����� */
					unDenizenFee += lwCorporationSummaryDto.getUnDenizenFee();
					/** �������ʵ�� */
					powerRateFee += lwCorporationSummaryDto.getPowerRateFee();
					/** ������������ */
					needQuantity += lwCorporationSummaryDto.getNeedQuantity();

					/** ����������� */
					needFee += lwCorporationSummaryDto.getNeedFee();
					/** ������������ */
					contentQuantity += lwCorporationSummaryDto
							.getContentQuantity();
					/** ����������� */
					contentPrice += lwCorporationSummaryDto.getContentPrice();
					/** ����������� */
					contentFee += lwCorporationSummaryDto.getContentFee();
					/** �����޹����� */
					unPointerQuantity += lwCorporationSummaryDto
							.getUnPointerQuantity();

					/** ���Թȶε��� */
					valleyQuantity += lwCorporationSummaryDto
							.getValleyQuantity();
					/** ���Է�ε��� */
					peakQuantity += lwCorporationSummaryDto.getPeakQuantity();
					/** ���Է�ε�� */
					peakPrice += lwCorporationSummaryDto.getPeakPrice();
					/** ���Թȶε�j�� */
					valleyPrice += lwCorporationSummaryDto.getValleyPrice();
					/** ���Է�ε�� */
					peakFee += lwCorporationSummaryDto.getPeakFee();
					/** ���ԹŶε�� */
					valleyFee += lwCorporationSummaryDto.getValleyFee();
					/** ���Ա������ */
					lossQuantity += lwCorporationSummaryDto.getLossQuantity();

					/** ���Ե�Ѻϼ� */
					sumFee += lwCorporationSummaryDto.getSumFee();

					/** ���Գ������� */
					sumPointerQuantity += lwCorporationSummaryDto
							.getSumPointerQuantity();

					/** ���Ըı�ǰ���� */
					beforPower += lwCorporationSummaryDto.getBeforPower();
					/** ���Ըı����� */
					lastPower += lwCorporationSummaryDto.getLastPower();
					/** ���Ըı�ǰ��� */
					beforFee += lwCorporationSummaryDto.getBeforFee();
					/** ���Ըı���� */
					lastFee += lwCorporationSummaryDto.getLastFee();

					/** ��������ָ�� */
					needPointer += lwCorporationSummaryDto.getNeedPointer();
					/** �����й�������� */
					lineLoss += lwCorporationSummaryDto.getLineLoss();
					/** �����޹�������� */
					unLineLoss += lwCorporationSummaryDto.getUnLineLoss();
					/** �����޹�������� */
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

			} else {
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
		/** ���Ե�� */
		double dianfei = 0D;
		/** ������Ͽ */
		double sanxia = 0D;
		/** ���Ե����ʽ� */
		double dianjin = 0D;
		/** ���Ի��� */
		double jijin = 0D;
		/** ���Ե��˰ */
		double dianfeitax = 0D;
		/** ������Ͽ˰ */
		double sanxiatax = 0D;
		/** ���Ե��˰ */
		double dianjintax = 0D;
		/** �����ܼ� */
		double sumfee = 0D;
		/** ���Ժ���¯ */
		double haiminglu = 0D;
		/** ���Զ�� */
		double duobian = 0D;
		/** ����׷�� */
		double zhuijia = 0D;
		/** ���Ը���1 */
		double fujia1 = 0D;
		/** ���Ը���2 */
		double fujia2 = 0D;
		/** ���Ը���3 */
		double fujia3 = 0D;
		/** ���Ը���5 */
		double fujia5 = 0D;
		/** ���Ը���9 */
		double fujia9 = 0D;

		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwAllWholeFeeDto lwAllWholeFeeDto = (LwAllWholeFeeDto) iterator
					.next();

			power1 += Double.parseDouble(lwAllWholeFeeDto.getPower1());
			/** ���Ե�� */
			dianfei += Double.parseDouble(lwAllWholeFeeDto.getDianfei());
			/** ������Ͽ */
			sanxia += Double.parseDouble(lwAllWholeFeeDto.getSanxia());
			/** ���Ե����ʽ� */
			dianjin += Double.parseDouble(lwAllWholeFeeDto.getDianfei());
			/** ���Ի��� */
			jijin += Double.parseDouble(lwAllWholeFeeDto.getJijin());
			/** ���Ե��˰ */
			dianfeitax += Double.parseDouble(lwAllWholeFeeDto.getDianfeitax());
			/** ������Ͽ˰ */
			sanxiatax += Double.parseDouble(lwAllWholeFeeDto.getSanxiatax());
			/** ���Ե��˰ */
			dianjintax += Double.parseDouble(lwAllWholeFeeDto.getDianjintax());
			/** �����ܼ� */
			sumfee += Double.parseDouble(lwAllWholeFeeDto.getSumfee());
			/** ���Ժ���¯ */
			haiminglu += Double.parseDouble(lwAllWholeFeeDto.getHaiminglu());
			/** ���Զ�� */
			duobian += Double.parseDouble(lwAllWholeFeeDto.getDuobian());
			/** ���Ը���1 */
			fujia1 += Double.parseDouble(lwAllWholeFeeDto.getFujia1());
			/** ���Ը���2 */
			fujia2 += Double.parseDouble(lwAllWholeFeeDto.getFujia2());
			/** ���Ը���3 */
			fujia3 += Double.parseDouble(lwAllWholeFeeDto.getFujia3());
			/** ���Ը���5 */
			String tempFujia5 = lwAllWholeFeeDto.getFujia5();
			fujia5 += Double.parseDouble((tempFujia5 == null || ""
					.equals(tempFujia5)) ? "0" : tempFujia5);
			/** ���Ը���9 ��� */
			String tempFujia9 = lwAllWholeFeeDto.getFujia9();
			fujia9 += Double.parseDouble((tempFujia9 == null || ""
					.equals(tempFujia9)) ? "0" : tempFujia9);

		}
		if ("gy".equals(company)) {
			lwAllWholeFeeDto2.setCompany("����");
		}
		if ("dm".equals(company)) {
			lwAllWholeFeeDto2.setCompany("��ó");
		}
		if ("ty".equals(company)) {
			lwAllWholeFeeDto2.setCompany("����");
		}
		if ("jy".equals(company)) {
			lwAllWholeFeeDto2.setCompany("��ԭ");
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