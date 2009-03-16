package com.elongway.pss.ui.control.statistic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.dto.custom.TownFeeSumCustomDto;
import com.elongway.pss.dto.custom.TownSataDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;

/**
 * 增加趸售比例分摊
 * 
 * @author goodluck
 * 
 */
public class UIQueryTownStatAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		/** 0-声明变量 */
		BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
		Collection<LwDcodeDto> dcodeList = null;
			dcodeList = blLwDcodeFacade
				.findByConditions(" codetype = 'SupplyCom'");

		String firstquery = httpServletRequest.getParameter("firstquery");
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwTownPriceSummaryFacade blLwTownPriceSummaryFacade = new BLLwTownPriceSummaryFacade();
		Collection<LwTownPriceSummaryDto> priceSummaryList = null;
		String condition = null;
		String forward = null;
		String company = null;
		String statMonth = null;
		Collection<LwPowerUserDto> userList = null;
		TownSataDto townSataDto = null;
		Collection<TownSataDto> resultList = null;
		resultList = new ArrayList<TownSataDto>();
		Collection allList = new ArrayList<TownSataDto>();
		String countStyle = (String)httpServletRequest.getParameter("countStyle");
		
		
		

		/** 1-进入查询页面 */
		if (firstquery != null) {
			httpServletRequest.setAttribute("supplycom", dcodeList);
			forward = "Success";
		} else {
			
			/***********************************************************************************
			 * 	按局进行统计
			 **********************************************************************************/
			if("1".equals(countStyle)){
			/** 2-统计 */
			// 得到机构代码
			company = httpServletRequest.getParameter("company");
			httpServletRequest.setAttribute("company", company);
			// 如果选择一个机构
			if ((!"".equals(company)) && (!"sum".equals(company))) {
				statMonth = httpServletRequest.getParameter("inputDate");
				statMonth = new DateTime(statMonth, DateTime.YEAR_TO_MONTH)
						.toString();
				userList = blLwPowerUserFacade
						.findByConditions("superclass = '" + company + "'");
				condition = PowerFeeCal.getUserCondition(userList);
				priceSummaryList = blLwTownPriceSummaryFacade
						.findByConditions(" 1=1 and statmonth = '" + statMonth
								+ "' " + condition);
				townSataDto = blCalPowerFeeCustomFacade.townStatByCompany(
						priceSummaryList, statMonth);
				for (Iterator iterator = dcodeList.iterator(); iterator.hasNext();) {
					LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
					if (lwDcodeDto.getCodeCode().equals(company)) {
						townSataDto.setComCode(lwDcodeDto.getCodeCode());
						townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
					}
				}
				resultList.add(townSataDto);
				httpServletRequest.setAttribute("resultList", resultList);
				httpServletRequest.setAttribute("statMonth", statMonth);
				forward = "statSuccess";
			} else if ("sum".equals(company)) {

				for (Iterator iterator = dcodeList.iterator(); iterator.hasNext();) {
					LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
					company = lwDcodeDto.getCodeCode();
					statMonth = httpServletRequest.getParameter("inputDate");
					statMonth = new DateTime(statMonth, DateTime.YEAR_TO_MONTH)
							.toString();
					userList = blLwPowerUserFacade
							.findByConditions("superclass = '" + company + "'");
					condition = PowerFeeCal.getUserCondition(userList);
					priceSummaryList = blLwTownPriceSummaryFacade
							.findByConditions(" 1=1  and statmonth = '"
									+ statMonth + "' " + condition);
					townSataDto = blCalPowerFeeCustomFacade.townStatByCompany(
							priceSummaryList, statMonth);
					townSataDto.setComCode(company);
					townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
					resultList.add(townSataDto);

				}
				townSataDto = PowerFeeCal.getSumCompanyStat(resultList,
						statMonth);
				townSataDto.setComCode("sum");
				allList.add(townSataDto);

				httpServletRequest.setAttribute("resultList", allList);
				httpServletRequest.setAttribute("statMonth", statMonth);
				forward = "statSuccess";
			} else {
				// 如果选择多个机构
				for (Iterator iterator = dcodeList.iterator(); iterator.hasNext();) {
					LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
					statMonth = httpServletRequest.getParameter("inputDate");
					statMonth = new DateTime(statMonth, DateTime.YEAR_TO_MONTH)
							.toString();
					company = lwDcodeDto.getCodeCode();
					userList = blLwPowerUserFacade
							.findByConditions("superclass = '" + company + "'");

					condition = PowerFeeCal.getUserCondition(userList);
					priceSummaryList = blLwTownPriceSummaryFacade
							.findByConditions(" 1=1  and statmonth = '"
									+ statMonth + "' " + condition);
					townSataDto = blCalPowerFeeCustomFacade.townStatByCompany(
							priceSummaryList, statMonth);
					townSataDto.setComCode(company);
					townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
					resultList.add(townSataDto);

				}
				townSataDto = PowerFeeCal.getSumCompanyStat(resultList,
						statMonth);
				resultList.add(townSataDto);
				httpServletRequest.setAttribute("resultList", resultList);
				httpServletRequest.setAttribute("statMonth", statMonth);
				forward = "statSuccess";
			}
			}/***********************************************************************************
			 * 	按电价进行统计
			 **********************************************************************************/
			else{		
				List<TownFeeSumCustomDto>feeList = new ArrayList<TownFeeSumCustomDto>();
				statMonth = httpServletRequest.getParameter("inputDate");
				statMonth = new DateTime(statMonth, DateTime.YEAR_TO_MONTH)
						.toString();
				String codeCondition = null;
				
				dcodeList = blLwDcodeFacade.findByConditions("codetype = 'SaleLevel'");
				for (Iterator iterator = dcodeList.iterator(); iterator.hasNext();) {
					LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator
							.next();
					String levelCode = lwDcodeDto.getCodeCode();
					String levelName = lwDcodeDto.getCodeCName();
					codeCondition = "salevoltlevel = '"+levelCode+"'";
					userList = blLwPowerUserFacade.findByConditions(codeCondition);
					if(userList!=null&&userList.size()!=0){
						condition = PowerFeeCal.getUserCondition(userList);						
						priceSummaryList = blLwTownPriceSummaryFacade.findByConditions("statMonth = '"+statMonth+"'"+condition);
						if(priceSummaryList != null&&priceSummaryList.size()!=0){
							// 按照比例分摊分电压等级进行计算
							feeList.addAll(this.getTownFeeListByClass(priceSummaryList,levelCode,levelName));
						}
					}
				}
				
				Collections.sort(feeList,new TownFeeSumCustomDto.ListComparator());
				httpServletRequest.setAttribute("feeList", feeList);
				httpServletRequest.setAttribute("statMonth", statMonth);
				forward = "priceStat";
			}
		}
		
	
		return actionMapping.findForward(forward);

	}
	/**
	 * 分类别分电压等级得到直供乡统计信息
	 * @param priceSummaryList
	 * @return 统计结果
	 */
	public Collection<TownFeeSumCustomDto>getTownFeeListByClass(Collection<LwTownPriceSummaryDto>priceSummaryList,String levelCode,String levelName){
		/** 居民电费*/
		double peopleFee = 0D;
		/** 非居电费*/
		double notPeopleFee = 0D;
		/** 工业电费*/
		double industryFee = 0D;
		/** 生产电费*/
		double produceFee = 0D;
		/** 农灌电费*/
		double farmFee = 0D;
		/** 商业电费*/
		double bizFee = 0D;
		
		/** 居民电量*/
		double peopleQuantity = 0D;
		/** 非居电量*/
		double notPeopleQuantity = 0D;
		/** 工业电量*/
		double industryQuantity = 0D;
		/** 生产电量*/
		double produceQuantity = 0D;
		/** 农灌电量*/
		double farmQuantity = 0D;
		/** 商业电量*/
		double bizQuantity = 0D;
		
		Collection<TownFeeSumCustomDto> feeList = new ArrayList<TownFeeSumCustomDto>();
		
		TownFeeSumCustomDto peopleFeeDto = new TownFeeSumCustomDto();
		TownFeeSumCustomDto notPeopleFeeDto = new TownFeeSumCustomDto();
		TownFeeSumCustomDto industryFeeDto = new TownFeeSumCustomDto();
		TownFeeSumCustomDto produceFeeDto = new TownFeeSumCustomDto();
		TownFeeSumCustomDto farmFeeDto = new TownFeeSumCustomDto();
		TownFeeSumCustomDto bizFeeDto = new TownFeeSumCustomDto();
		for (Iterator iterator = priceSummaryList.iterator(); iterator.hasNext();) {
			LwTownPriceSummaryDto o = (LwTownPriceSummaryDto) iterator.next();
			peopleFee += o.getSumPeopleFee();
			notPeopleFee += o.getSumNotPeopleFee();
			industryFee += o.getSumIndustryFee();
			produceFee += o.getSumProduceFee();
			farmFee += o.getSumFarmFee();
			bizFee += o.getSumBizFee();
			
			peopleQuantity += o.getPeopleQuantity();
			notPeopleQuantity += o.getNotPeopleQuantity();
			industryQuantity += o.getIndustryQuantity();
			produceQuantity += o.getProduceQuantity();
			farmQuantity += o.getFarmQuantity();
			bizQuantity += o.getBizQuantity();
			
		}
		// 居民
		peopleFeeDto.setVoltLevel(levelCode);
		peopleFeeDto.setVoltLevelName(levelName);
		peopleFeeDto.setClassId("居民");
		peopleFeeDto.setPowerFee(PowerFeeCal.getValue(peopleFee,AppConst.TWO_DOT_FLAG));
		peopleFeeDto.setQuantity(PowerFeeCal.getValue(peopleQuantity,AppConst.TWO_DOT_FLAG));
		peopleFeeDto.setSumFee(PowerFeeCal.getValue(peopleFee,AppConst.TWO_DOT_FLAG));	
		peopleFeeDto.setSerialNo("1");
		// 非居
		notPeopleFeeDto.setVoltLevel(levelCode);
		notPeopleFeeDto.setVoltLevelName(levelName);
		notPeopleFeeDto.setClassId("非居");
		notPeopleFeeDto.setPowerFee(PowerFeeCal.getValue(notPeopleFee,AppConst.TWO_DOT_FLAG));
		notPeopleFeeDto.setQuantity(PowerFeeCal.getValue(notPeopleQuantity,AppConst.TWO_DOT_FLAG));
		notPeopleFeeDto.setSumFee(PowerFeeCal.getValue(notPeopleFee,AppConst.TWO_DOT_FLAG));
		notPeopleFeeDto.setSerialNo("2");
		// 工业
		industryFeeDto.setVoltLevel(levelCode);
		industryFeeDto.setVoltLevelName(levelName);
		industryFeeDto.setClassId("工业");
		industryFeeDto.setPowerFee(PowerFeeCal.getValue(industryFee,AppConst.TWO_DOT_FLAG));
		industryFeeDto.setQuantity(PowerFeeCal.getValue(industryQuantity,AppConst.TWO_DOT_FLAG));
		industryFeeDto.setSumFee(PowerFeeCal.getValue(industryFee,AppConst.TWO_DOT_FLAG));	
		industryFeeDto.setSerialNo("3");
		// 生产
		produceFeeDto.setVoltLevel(levelCode);
		produceFeeDto.setVoltLevelName(levelName);
		produceFeeDto.setClassId("生产");
		produceFeeDto.setPowerFee(PowerFeeCal.getValue(produceFee,AppConst.TWO_DOT_FLAG));
		produceFeeDto.setQuantity(PowerFeeCal.getValue(produceQuantity,AppConst.TWO_DOT_FLAG));
		produceFeeDto.setSumFee(PowerFeeCal.getValue(produceFee,AppConst.TWO_DOT_FLAG));
		produceFeeDto.setSerialNo("4");
		// 农业
		farmFeeDto.setVoltLevel(levelCode);
		farmFeeDto.setVoltLevelName(levelName);
		farmFeeDto.setClassId("农业");
		farmFeeDto.setPowerFee(PowerFeeCal.getValue(farmFee,AppConst.TWO_DOT_FLAG));
		farmFeeDto.setQuantity(PowerFeeCal.getValue(farmQuantity,AppConst.TWO_DOT_FLAG));
		farmFeeDto.setSumFee(PowerFeeCal.getValue(farmFee,AppConst.TWO_DOT_FLAG));	
		farmFeeDto.setSerialNo("5");
		// 商产
		bizFeeDto.setVoltLevel(levelCode);
		bizFeeDto.setVoltLevelName(levelName);
		bizFeeDto.setClassId("商业");
		bizFeeDto.setPowerFee(PowerFeeCal.getValue(bizFee,AppConst.TWO_DOT_FLAG));
		bizFeeDto.setQuantity(PowerFeeCal.getValue(bizQuantity,AppConst.TWO_DOT_FLAG));
		bizFeeDto.setSumFee(PowerFeeCal.getValue(bizFee,AppConst.TWO_DOT_FLAG));
		bizFeeDto.setSerialNo("6");
		

		feeList.add(peopleFeeDto);
		feeList.add(notPeopleFeeDto);
		feeList.add(industryFeeDto);
		feeList.add(farmFeeDto);
		feeList.add(produceFeeDto);
		feeList.add(bizFeeDto);
		return feeList;
	}
	/**
	 * 按电压等级得到统计结果的单条记录
	 * @param priceSummaryList
	 * @return 
	 */
	public TownFeeSumCustomDto getTownFeeRecord(Collection<LwTownPriceSummaryDto>priceSummaryList){ 
		
		return null;
	}
}
