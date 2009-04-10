package com.elongway.pss.ui.count;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import antlr.collections.List;

import com.elongway.pss.bl.action.domain.BLLwWholeSaleStatDetailAction;
import com.elongway.pss.bl.facade.BLLwWholeSaleStatDetailFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwWholeSaleStatDetailDto;
import com.elongway.pss.util.AppConst;

/**
 * 趸售按电价统计
 * 
 * @author qiaoyouliang 2009-04-09
 * 
 */
public class UIWholeSalePriceCountAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		/** 1 - 组织表单数据
		 * 各个局的当月和汇总
		 *  */
		Collection collection = this.getWholeSaleStatList(httpServletRequest);

		/** 2 - 插入数据		 */
		BLLwWholeSaleStatDetailAction bllWholeSaleStatDetailAction = new BLLwWholeSaleStatDetailAction();
		bllWholeSaleStatDetailAction.insertAll(collection);
		return actionMapping.findForward("forward");

	}

	/**
	 * 得到统计数据，组织List
	 * 
	 * @param httpServletRequest
	 * @return
	 */
	public Collection<LwWholeSaleStatDetailDto> getWholeSaleStatList(
			HttpServletRequest httpServletRequest) {
		String inputDate = httpServletRequest.getParameter("inputDate");
		String[] comCode = httpServletRequest.getParameterValues("comCode");
		String[] comName = httpServletRequest.getParameterValues("comName");
		String[] sumQuantity10 = httpServletRequest
				.getParameterValues("sumQuantity10");
		String[] peopleQuantity10 = httpServletRequest
				.getParameterValues("peopleQuantity10");
		String[] peopleFee10 = httpServletRequest
				.getParameterValues("peopleFee10");
		String[] notPeopleQuantity10 = httpServletRequest
				.getParameterValues("notPeopleQuantity10");
		String[] notPeopleFee10 = httpServletRequest
				.getParameterValues("notPeopleFee10");
		String[] produceQuantity10 = httpServletRequest
				.getParameterValues("produceQuantity10");
		String[] produceFee10 = httpServletRequest
				.getParameterValues("produceFee10");
		String[] farmQuantity10 = httpServletRequest
				.getParameterValues("farmQuantity10");
		String[] farmFee10 = httpServletRequest.getParameterValues("farmFee10");
		String[] bizQuantity10 = httpServletRequest
				.getParameterValues("bizQuantity10");
		String[] bizFee10 = httpServletRequest.getParameterValues("bizFee10");
		String[] industryQuantity10 = httpServletRequest
				.getParameterValues("industryQuantity10");
		String[] industryFee10 = httpServletRequest
				.getParameterValues("industryFee10");
		String[] sumQuantity35 = httpServletRequest
				.getParameterValues("sumQuantity35");
		String[] peopleQuantity35 = httpServletRequest
				.getParameterValues("peopleQuantity35");
		String[] peopleFee35 = httpServletRequest
				.getParameterValues("peopleFee35");
		String[] notPeopleQuantity35 = httpServletRequest
				.getParameterValues("notPeopleQuantity35");
		String[] notPeopleFee35 = httpServletRequest
				.getParameterValues("notPeopleFee35");
		String[] produceQuantity35 = httpServletRequest
				.getParameterValues("produceQuantity35");
		String[] produceFee35 = httpServletRequest
				.getParameterValues("produceFee35");
		String[] farmQuantity35 = httpServletRequest
				.getParameterValues("farmQuantity35");
		String[] farmFee35 = httpServletRequest.getParameterValues("farmFee35");
		String[] bizQuantity35 = httpServletRequest
				.getParameterValues("bizQuantity35");
		String[] bizFee35 = httpServletRequest.getParameterValues("bizFee35");
		String[] industryQuantity35 = httpServletRequest
				.getParameterValues("industryQuantity35");
		String[] industryFee35 = httpServletRequest
				.getParameterValues("industryFee35");
		String[] sumQuantity = httpServletRequest
				.getParameterValues("sumQuantity");
		String[] powerFee = httpServletRequest.getParameterValues("powerFee");
		String[] feeTax = httpServletRequest.getParameterValues("feeTax");
		String[] lilvFee = httpServletRequest.getParameterValues("lilvFee");
		String[] broadFee = httpServletRequest.getParameterValues("broadFee");
		String[] haiminglu = httpServletRequest.getParameterValues("haiminglu");
		String[] duobian = httpServletRequest.getParameterValues("duobian");
		String[] tuibu = httpServletRequest.getParameterValues("tuibu");
		String[] sumFee = httpServletRequest.getParameterValues("sumFee");

		Collection<LwWholeSaleStatDetailDto> collection = new ArrayList<LwWholeSaleStatDetailDto>();
		LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto = null;
		for (int i = 0; i < sumFee.length; i++) {
			lwWholeSaleStatDetailDto = new LwWholeSaleStatDetailDto();
			lwWholeSaleStatDetailDto.setSumQuantity10KV(Integer
					.parseInt(sumQuantity10[i]));
			lwWholeSaleStatDetailDto.setDenizenQuantity10kv(Integer
					.parseInt(peopleQuantity10[i]));
			lwWholeSaleStatDetailDto.setDenizenMoney10kv(Double
					.parseDouble(peopleFee10[i]));
			lwWholeSaleStatDetailDto.setUnDenizenQuantity10kv(Integer
					.parseInt(notPeopleQuantity10[i]));
			lwWholeSaleStatDetailDto.setUnDenizenMoney10kv(Double
					.parseDouble(notPeopleFee10[i]));
			lwWholeSaleStatDetailDto.setProductQuantity10kv(Integer
					.parseInt(produceQuantity10[i]));
			lwWholeSaleStatDetailDto.setProductMoney10kv(Double
					.parseDouble(produceFee10[i]));
			lwWholeSaleStatDetailDto.setFarmUseQuantity10kv(Integer
					.parseInt(farmQuantity10[i]));
			lwWholeSaleStatDetailDto.setFarmUseMoney10kv(Double
					.parseDouble(farmFee10[i]));
			lwWholeSaleStatDetailDto.setBizQuantity10kv(Integer
					.parseInt(bizQuantity10[i]));
			lwWholeSaleStatDetailDto.setBizMoney10kv(Double
					.parseDouble(bizFee10[i]));
			lwWholeSaleStatDetailDto.setUnIndustryQuantity10kv(Integer
					.parseInt(industryQuantity10[i]));
			lwWholeSaleStatDetailDto.setUnIndustryMoney10kv(Double
					.parseDouble(industryFee10[i]));
			lwWholeSaleStatDetailDto.setSumQuantity35KV(Integer
					.parseInt(sumQuantity35[i]));
			lwWholeSaleStatDetailDto.setDenizenQuantity35kv(Integer
					.parseInt(peopleQuantity35[i]));
			lwWholeSaleStatDetailDto.setDenizenMoney35kv(Double
					.parseDouble(peopleFee35[i]));
			lwWholeSaleStatDetailDto.setUnDenizenQuantity35kv(Integer
					.parseInt(notPeopleQuantity35[i]));
			lwWholeSaleStatDetailDto.setUnDenizenMoney35kv(Double
					.parseDouble(notPeopleFee35[i]));
			lwWholeSaleStatDetailDto.setProductQuantity35kv(Integer
					.parseInt(produceQuantity35[i]));
			lwWholeSaleStatDetailDto.setProductMoney35kv(Double
					.parseDouble(produceFee35[i]));
			lwWholeSaleStatDetailDto.setFarmUseQuantity35kv(Integer
					.parseInt(farmQuantity35[i]));
			lwWholeSaleStatDetailDto.setFarmUseMoney35kv(Double
					.parseDouble(farmFee35[i]));
			lwWholeSaleStatDetailDto.setBizQuantity35kv(Integer
					.parseInt(bizQuantity35[i]));
			lwWholeSaleStatDetailDto.setBizMoney35kv(Double
					.parseDouble(bizFee35[i]));
			lwWholeSaleStatDetailDto.setUnIndustryQuantity35kv(Integer
					.parseInt(industryQuantity35[i]));
			lwWholeSaleStatDetailDto.setUnIndustryMoney35kv(Double
					.parseDouble(industryFee35[i]));
			lwWholeSaleStatDetailDto.setSumQuantity(Integer
					.parseInt(sumQuantity[i]));
			lwWholeSaleStatDetailDto.setPowerFee(Double
					.parseDouble(powerFee[i]));
			lwWholeSaleStatDetailDto.setPowerFeeTax(Double
					.parseDouble(feeTax[i]));
			lwWholeSaleStatDetailDto.setLilvFee(Double.parseDouble(lilvFee[i]));
			lwWholeSaleStatDetailDto.setBroadFee(Double
					.parseDouble(broadFee[i]));
			lwWholeSaleStatDetailDto.setHaiminglu(Double
					.parseDouble(haiminglu[i]));
			lwWholeSaleStatDetailDto.setDuobianFee(Double
					.parseDouble(duobian[i]));
			lwWholeSaleStatDetailDto.setTuibuFee(Double.parseDouble(tuibu[i]));
			lwWholeSaleStatDetailDto.setSumPowerFee(Double
					.parseDouble(sumFee[i]));

			lwWholeSaleStatDetailDto.setCompanyCode(comCode[i]);
			lwWholeSaleStatDetailDto.setCompanyName(comName[i]);
			lwWholeSaleStatDetailDto.setStatStyle(AppConst.STAT_CURRENT_FLAG);
			lwWholeSaleStatDetailDto.setInputDate(inputDate);

			collection.add(lwWholeSaleStatDetailDto);
		}

		return collection;
	}
	/**
	 * 累计
	*/
	public Collection<LwWholeSaleStatDetailDto> getSumStatList(String statMonth) throws Exception{
		BLLwWholeSaleStatDetailFacade bllWholeSaleStatDetailFacade = new BLLwWholeSaleStatDetailFacade();
		Collection<LwWholeSaleStatDetailDto> collection = null;
		String tempCode = null;
		collection = bllWholeSaleStatDetailFacade.findByConditions("statmonth = '2009-03'");
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto = (LwWholeSaleStatDetailDto) iterator
					.next();
			tempCode = lwWholeSaleStatDetailDto.getCompanyCode();
		}
		return null;
	}

}
