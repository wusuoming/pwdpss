package com.elongway.pss.ui.control.feeappend.town;

/**
 * ֱ���������̯������������
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
		// ��ǰ�·�
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
		 * ��ѯ��֧
		 **********************************************************************/
		if (query != null) {
			// 1 -- ��֯�������ҵ������޸ı������û�
			Collection prorateAppendList = blLwTownProrateAppendFacade
					.findByConditions("inputdate = '" + curMonth + "'");
			// ��֯����
			condition.append(this.getUserCondition(prorateAppendList)).append(
					" and statmonth = '" + "2009-01" + "'");
			condition.insert(0, "1=1 ");
			// 2 -- ����ָ����Ϣ
			// -- �����ָ�뱸�ݱ����ָ����н��в��ҡ�
			indicatorList = new ArrayList<LwTownIndicatorDto>();
			this.getIndicatorList(condition.toString(), indicatorList);
			httpServletRequest.setAttribute("indicatorList", indicatorList);
			forward = "queryAppend";
			/*******************************************************************
			 * �����֧
			 ******************************************************************/
		} else {

			String appendDate = (String) httpServletRequest
					.getParameter("appendDate");
			// ��������
			/** 1 -- ��ѯ���������֮����и��ı������û� */
			Collection prorateAppendList = blLwTownProrateAppendFacade
					.findByConditions("inputdate = '" + curMonth + "'");
			// ��֯����:"�����û����б�+׷�յ�ѵ�����"
			condition.append(this.getUserCondition(prorateAppendList)).append(
					" and statmonth = '" + appendDate + "'");
			condition.insert(0, "1=1 ");
			/** 2 -- ��ѯ���������֮����и��ı������û����õ�ָ���б� */
			indicatorList = new ArrayList<LwTownIndicatorDto>();
			this.getIndicatorList(condition.toString(), indicatorList);
			priceSummaryList = new ArrayList<LwTownPriceSummaryDto>();
			priceSummaryAppendList = new ArrayList<LwTownPriceSummaryProratAppendDto>();
			calFeeList = new ArrayList<CalFeeCustomDto>();
			for (Iterator iterator = indicatorList.iterator(); iterator
					.hasNext();) {
				LwTownIndicatorDto o = (LwTownIndicatorDto) iterator.next();
				// ������
				lwTownPriceSummaryDto = blCalPowerFeeCustomFacade.calTownFee(o);
				// ��֯��ѱ�List
				priceSummaryList.add(lwTownPriceSummaryDto);
				appendDto = new LwTownPriceSummaryProratAppendDto();
				DataUtils.copySimpleObject(appendDto, lwTownPriceSummaryDto);
				// �趨��־
				appendDto.setFlag(AppConst.NEW_CAL_FLAG);

				// ��֯׷�ӱ�List
				priceSummaryAppendList.add(appendDto);

				calFeeCustomDto = new CalFeeCustomDto();
				
				calFeeCustomDto.setNewFeeDto(appendDto);
				oldPriceDto = blLwTownPriceSummaryFacade.findByPrimaryKey(o
						.getUserNo(), appendDate);
				calFeeCustomDto.setHistoryFeeDto(oldPriceDto);
				chaFeeDto = this.calCha(appendDto, oldPriceDto);
				calFeeCustomDto.setChaFeeDto(chaFeeDto);
				calFeeList.add(calFeeCustomDto);
				// ����Ѽ�¼
				priceSummaryAppendList.add(chaFeeDto);
			}

			/** 4 -- ��֯�����ϢDTO */

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
	 * ��֯����
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
	 * ��ָ�뱸�ݱ�Dto��֯��ָ���DTo
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

			// ��lwTownIndicatorBakDto��֯��lwTownIndicatorDto
			lwTownIndicatorDto = new LwTownIndicatorDto();
			DataUtils.copySimpleObject(lwTownIndicatorDto, bak);
			indicatorList.add(lwTownIndicatorDto);
		}
	}

	/**
	 * �õ�ָ���¼
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
	 * ��������
	 * @param newCalFeeDto
	 * @param historyCalFeeDto
	 * @return
	 */
	public LwTownPriceSummaryProratAppendDto calCha(
			LwTownPriceSummaryProratAppendDto newCalFeeDto,
			LwTownPriceSummaryDto historyCalFeeDto) {
		// ������
		double sumPeopleFee = 0D;
		// �Ǿ�����
		double sumNotPeopleFee = 0D; 
		// ũ����
		double sumFarmFee = 0D; 
		// �������
		double sumProduceFee = 0D; 
		// ��ҵ���
		double sumIndustryFee = 0D; 
		// ��ҵ���
		double sumBizFee = 0D; 
		// �����
		double sumDianJin = 0D; 
		// ��Ͽ���
		double sumSanXia = 0D; 
		// ������
		double remark = 0D; 
		// ����
		double sumQuantity = 0D; 
		// ��Ѻϼ�
		double sumFee = 0D; 
		// �ʽ�ϼ�
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
		 // ��֯�����DTO
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
		 // �趨��־Ϊ���
		 cha.setFlag(AppConst.CHA_CAL_FLAG);
		 
		

		return cha;
	}

}
