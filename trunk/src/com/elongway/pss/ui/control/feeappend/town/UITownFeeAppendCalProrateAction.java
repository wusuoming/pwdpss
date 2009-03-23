package com.elongway.pss.ui.control.feeappend.town;

/**
 * 直供乡比例分摊调整计算差额电费
 * 
 * 
 * @author qiaoyouliang
 * @version 1.0 2009-03-05
 */

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

import com.elongway.pss.bl.action.domain.BLLwTownPriceSummaryProratAppendAction;
import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorAppendFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorBakFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryProratAppendFacade;
import com.elongway.pss.bl.facade.BLLwTownProrateAppendFacade;
import com.elongway.pss.dto.custom.CalFeeCustomDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;
import com.elongway.pss.dto.domain.LwTownIndicatorBakDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryAppendDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;
import com.elongway.pss.dto.domain.LwTownProrateAppendDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.DataUtils;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UITownFeeAppendCalProrateAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		String query = (String) httpServletRequest.getParameter("query");
		String appendMonth = (String) httpServletRequest
				.getParameter("appendMonth");
		appendMonth = "2009-02";
		String forward = null;
		forward = "forward";
		// 当前月份
		String curMonth = PowerFeeCal.getCurrentBillMonth();
		String userNo = null;
		StringBuffer condition = new StringBuffer();
		Collection<LwTownIndicatorDto> indicatorList = null;
		Collection<LwTownPriceSummaryDto> priceSummaryList = null;
		Collection<LwTownPriceSummaryDto> oldFeeList = null;
		Collection<LwTownPriceSummaryProratAppendDto> priceSummaryAppendList = null;
		Collection<CalFeeCustomDto> calFeeList = null;
		LwTownPriceSummaryDto lwTownPriceSummaryDto = null;
		LwTownPriceSummaryDto oldPriceDto = null;
		LwTownPriceSummaryProratAppendDto appendDto = null;
		LwTownPriceSummaryProratAppendDto chaFeeDto = null;

		BLLwTownProrateAppendFacade blLwTownProrateAppendFacade = new BLLwTownProrateAppendFacade();
		BLLwTownPriceSummaryProratAppendFacade blLwTownPriceSummaryProratAppendFacade = new BLLwTownPriceSummaryProratAppendFacade();
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwTownPriceSummaryFacade blLwTownPriceSummaryFacade = new BLLwTownPriceSummaryFacade();
		CalFeeCustomDto calFeeCustomDto = null;
		/***********************************************************************
		 * 查询分支
		 **********************************************************************/
		if (query != null) {
			// 1 -- 组织条件，找到当月修改比例的用户
			Collection prorateAppendList = blLwTownProrateAppendFacade
					.findByConditions("inputdate = '" + curMonth + "'");
			// 组织条件
			condition.append(this.getUserCondition(prorateAppendList)).append(
					" and statmonth = '" + "2009-01" + "'");
			condition.insert(0, "1=1 ");
			// 2 -- 查找指针信息
			// -- 如果从指针备份表或者指针表中进行查找。
			indicatorList = new ArrayList<LwTownIndicatorDto>();
			this.getIndicatorList(condition.toString(), indicatorList);
			httpServletRequest.setAttribute("indicatorList", indicatorList);
			forward = "queryAppend";
			/*******************************************************************
			 * 计算分支
			 ******************************************************************/
		} else {

			String appendDate = (String) httpServletRequest
					.getParameter("appendDate");
			// 声明变量
			/** 1 -- 查询当月在算费之后进行更改比例的用户 */
			Collection prorateAppendList = blLwTownProrateAppendFacade
					.findByConditions("inputdate = '" + curMonth + "'");
			// 组织条件:"所有用户的列表+追收电费的年月"
			condition.append(this.getUserCondition(prorateAppendList)).append(
					" and statmonth = '" + appendDate + "'");
			condition.insert(0, "1=1 ");
			/** 2 -- 查询当月在算费之后进行更改比例的用户，得到指针列表 */
			indicatorList = new ArrayList<LwTownIndicatorDto>();
			this.getIndicatorList(condition.toString(), indicatorList);
			priceSummaryList = new ArrayList<LwTownPriceSummaryDto>();
			priceSummaryAppendList = new ArrayList<LwTownPriceSummaryProratAppendDto>();
			calFeeList = new ArrayList<CalFeeCustomDto>();
			for (Iterator iterator = indicatorList.iterator(); iterator
					.hasNext();) {
				LwTownIndicatorDto o = (LwTownIndicatorDto) iterator.next();
				// 计算电费
				lwTownPriceSummaryDto = blCalPowerFeeCustomFacade.calTownFee(o);
				// 组织算费表List
				priceSummaryList.add(lwTownPriceSummaryDto);
				appendDto = new LwTownPriceSummaryProratAppendDto();
				DataUtils.copySimpleObject(appendDto, lwTownPriceSummaryDto);
				// 设定标志
				appendDto.setFlag(AppConst.NEW_CAL_FLAG);

				// 组织追加表List
				priceSummaryAppendList.add(appendDto);

				calFeeCustomDto = new CalFeeCustomDto();
				
				calFeeCustomDto.setNewFeeDto(appendDto);
				oldPriceDto = blLwTownPriceSummaryFacade.findByPrimaryKey(o
						.getUserNo(), appendDate);
				calFeeCustomDto.setHistoryFeeDto(oldPriceDto);
				chaFeeDto = this.calCha(appendDto, oldPriceDto);
				calFeeCustomDto.setChaFeeDto(chaFeeDto);
				calFeeList.add(calFeeCustomDto);
				// 差额电费记录
				priceSummaryAppendList.add(chaFeeDto);
			}

			/** 4 -- 组织算费信息DTO */

			String deleteCondition = "statMonth like '%" + appendMonth + "%'";
			blCalPowerFeeCustomFacade.deleteInsertAppend(
					priceSummaryAppendList, deleteCondition);
			// httpServletRequest.setAttribute("patchFee", priceSummaryList);
			httpServletRequest.setAttribute("patchFee", calFeeList);
			forward = "calTownChaFeeForward";
		}
		return actionMapping.findForward(forward);
	}

	/**
	 * 组织条件
	 * 
	 * @param prorateAppendList
	 * @return
	 */
	public String getUserCondition(
			Collection<LwTownProrateAppendDto> prorateAppendList) {
		StringBuffer buffer = new StringBuffer();
		String userNo = null;
		if (prorateAppendList != null && prorateAppendList.size() != 0) {
			for (Iterator iterator = prorateAppendList.iterator(); iterator
					.hasNext();) {
				LwTownProrateAppendDto append = (LwTownProrateAppendDto) iterator
						.next();

				userNo = append.getUserNo();
				buffer.append("'").append(userNo).append("',");

			}
			buffer.deleteCharAt(buffer.length() - 1);
			buffer.insert(0, "and userNo in(");
			buffer.append(")");
		} else {
			buffer.append("and 1=0");
		}
		return buffer.toString();
	}

	/**
	 * 将指针备份表Dto组织成指针表DTo
	 * 
	 * @param indicatorList
	 * @param indicatorBakList
	 */
	public void covertIndicator(Collection<LwTownIndicatorDto> indicatorList,
			Collection<LwTownIndicatorBakDto> indicatorBakList) {
		LwTownIndicatorDto lwTownIndicatorDto = null;

		for (Iterator iterator = indicatorBakList.iterator(); iterator
				.hasNext();) {
			LwTownIndicatorBakDto bak = (LwTownIndicatorBakDto) iterator.next();

			// 将lwTownIndicatorBakDto组织成lwTownIndicatorDto
			lwTownIndicatorDto = new LwTownIndicatorDto();
			DataUtils.copySimpleObject(lwTownIndicatorDto, bak);
			indicatorList.add(lwTownIndicatorDto);
		}
	}

	/**
	 * 得到指针记录
	 * 
	 * @param indicatorList
	 * @param indicatorBakList
	 * @throws Exception
	 */
	public void getIndicatorList(String condition,
			Collection<LwTownIndicatorDto> indicatorList) throws Exception {
		BLLwTownIndicatorBakFacade blLwTownIndicatorBakFacade = new BLLwTownIndicatorBakFacade();
		BLLwTownIndicatorFacade blLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		Collection<LwTownIndicatorBakDto> indicatorBakList = null;
		indicatorBakList = blLwTownIndicatorBakFacade
				.findByConditions(condition.toString());
		if (indicatorBakList == null || indicatorBakList.size() == 0) {
			indicatorList.addAll(blLwTownIndicatorFacade
					.findByConditions(condition.toString()));
		} else {
			this.covertIndicator(indicatorList, indicatorBakList);
		}
	}

	/**
	 * 计算差额电费
	 * @param newCalFeeDto
	 * @param historyCalFeeDto
	 * @return
	 */
	public LwTownPriceSummaryProratAppendDto calCha(
			LwTownPriceSummaryProratAppendDto newCalFeeDto,
			LwTownPriceSummaryDto historyCalFeeDto) {
		// 居民电费
		double sumPeopleFee = 0D;
		// 非居民电费
		double sumNotPeopleFee = 0D; 
		// 农灌电费
		double sumFarmFee = 0D; 
		// 生产电费
		double sumProduceFee = 0D; 
		// 工业电费
		double sumIndustryFee = 0D; 
		// 商业电费
		double sumBizFee = 0D; 
		// 电金电费
		double sumDianJin = 0D; 
		// 三峡电费
		double sumSanXia = 0D; 
		// 基金电费
		double remark = 0D; 
		// 电量
		double sumQuantity = 0D; 
		// 电费合计
		double sumFee = 0D; 
		// 资金合计
		double electricFee = 0D; 		
		
		 sumPeopleFee = newCalFeeDto.getSumPeopleFee()-historyCalFeeDto.getSumPeopleFee();
		 sumNotPeopleFee = newCalFeeDto.getSumNotPeopleFee()-historyCalFeeDto.getSumNotPeopleFee();
		 sumFarmFee = newCalFeeDto.getSumFarmFee()-historyCalFeeDto.getSumFarmFee();
		 sumProduceFee = newCalFeeDto.getSumProduceFee ()-historyCalFeeDto.getSumProduceFee();
		 sumIndustryFee = newCalFeeDto.getSumIndustryFee()-historyCalFeeDto.getSumIndustryFee();
		 sumBizFee = newCalFeeDto.getSumBizFee()-historyCalFeeDto.getSumBizFee();
		 sumDianJin = newCalFeeDto.getSumDianJin()-historyCalFeeDto.getSumDianJin();
		 sumSanXia = newCalFeeDto.getSumSanXia()-historyCalFeeDto.getSumSanXia();
		 remark = Double.parseDouble("".equals(newCalFeeDto.getRemark())?"0":newCalFeeDto.getRemark())-Double.parseDouble("".equals(historyCalFeeDto.getRemark())?"0":historyCalFeeDto.getRemark());
		 sumQuantity = newCalFeeDto.getSumQuantity()-historyCalFeeDto.getSumQuantity();
		 sumFee = newCalFeeDto.getSumFee()-historyCalFeeDto.getSumFee();
		 electricFee = newCalFeeDto.getElectricFee()-historyCalFeeDto.getElectricFee();
		 
		 LwTownPriceSummaryProratAppendDto cha = new LwTownPriceSummaryProratAppendDto();
		 // 组织差额电费DTO
		 cha.setSumPeopleFee(PowerFeeCal.getValue(sumPeopleFee, AppConst.TWO_DOT_FLAG));
		 cha.setSumNotPeopleFee(PowerFeeCal.getValue(sumNotPeopleFee, AppConst.TWO_DOT_FLAG));
		 cha.setSumFarmFee(PowerFeeCal.getValue(sumFarmFee, AppConst.TWO_DOT_FLAG));
		 cha.setSumProduceFee(PowerFeeCal.getValue(sumProduceFee, AppConst.TWO_DOT_FLAG));
		 cha.setSumIndustryFee(PowerFeeCal.getValue(sumIndustryFee, AppConst.TWO_DOT_FLAG));
		 cha.setSumBizFee(PowerFeeCal.getValue(sumBizFee, AppConst.TWO_DOT_FLAG));
		 cha.setSumDianJin(PowerFeeCal.getValue(sumDianJin, AppConst.TWO_DOT_FLAG));
		 cha.setSumSanXia(PowerFeeCal.getValue(sumSanXia, AppConst.TWO_DOT_FLAG));
		 cha.setSumJiJin(PowerFeeCal.getValue(remark, AppConst.TWO_DOT_FLAG));
		 cha.setSumQuantity(PowerFeeCal.getValue(sumQuantity, AppConst.TWO_DOT_FLAG));
		 cha.setSumFee(PowerFeeCal.getValue(sumFee, AppConst.TWO_DOT_FLAG));
		 cha.setElectricFee(PowerFeeCal.getValue(electricFee, AppConst.TWO_DOT_FLAG));
		 
		 cha.setUserNo(newCalFeeDto.getUserNo());
		 cha.setStatMonth(new DateTime(newCalFeeDto.getStatMonth()+"-01",DateTime.YEAR_TO_DAY).toString());
		 // 设定标志为差额
		 cha.setFlag(AppConst.CHA_CAL_FLAG);
		 
		

		return cha;
	}

}
