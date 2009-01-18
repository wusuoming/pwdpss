package com.elongway.pss.ui.count;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;

public class UIPriceCountAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		String inputDate = httpServletRequest.getParameter("inputDate");

		DecimalFormat df = new DecimalFormat("###0.00");
		String serchDate = inputDate.substring(0, 7);
		String conditions10 = " 1=1 and KV=10 and StatMonth='" + serchDate
				+ "'";
		String conditions35 = " 1=1 and KV=35 and StatMonth='" + serchDate
				+ "'";
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade = new BLLwWholeSaleSummaryFacade();
		double sumJuminPower10 = 0;
		double sumFactoryPower10 = 0;
		double sumNotJuminPower10 = 0;
		double sumBusinessPower10 = 0;
		double sumFarmPower10 = 0;
		double sumProducePower10 = 0;

		double sumJuminFee10 = 0;
		double sumFactoryFee10 = 0;
		double sumNotJuminFee10 = 0;
		double sumBusinessFee10 = 0;
		double sumFarmFee10 = 0;
		double sumProduceFee10 = 0;
		double loss=0;
		double sumJuminPower35 = 0;
		double sumFactoryPower35 = 0;
		double sumNotJuminPower35 = 0;
		double sumBusinessPower35 = 0;
		double sumFarmPower35 = 0;
		double sumProducePower35 = 0;

		double sumJuminFee35 = 0;
		double sumFactoryFee35 = 0;
		double sumNotJuminFee35 = 0;
		double sumBusinessFee35 = 0;
		double sumFarmFee35 = 0;
		double sumProduceFee35 = 0;

		double sanxiaPower = 0;
		double nongwanghaidaiPower = 0;
		double kezaishengpepolePower = 0;
		double kezaishengnotpepolePower = 0;
		double kuquPower = 0;

		double sanxiaFee = 0;
		double dianjinFee = 0;
		double kezaishengpepoleFee = 0;
		double kezaishengnotpepoleFee = 0;
		double kuquFee = 0;
		double jijinFee = 0;

		double jumintax10 = 0;
		double notjumintax10 = 0;
		double shengchantax10 = 0;
		double gongyetax10 = 0;
		double shangyetax10 = 0;
		double nongguantax10 = 0;

		double juminchun10 = 0;
		double notjuminchun10 = 0;
		double shengchanchun10 = 0;
		double gongyechun10 = 0;
		double shangyechun10 = 0;
		double nongguanchun10 = 0;

		double jumintax35 = 0;
		double notjumintax35 = 0;
		double shengchantax35 = 0;
		double gongyetax35 = 0;
		double shangyetax35 = 0;
		double nongguantax35 = 0;

		double juminchun35 = 0;
		double notjuminchun35 = 0;
		double shengchanchun35 = 0;
		double gongyechun35 = 0;
		double shangyechun35 = 0;
		double nongguanchun35 = 0;

		double sumAllPower = 0;
		double sumAllFee = 0;
		double sumAllTax = 0;
		double sumAllChunFee = 0;

		double sumCountFee = 0;

		double sanxiatax = 0;
		double jijintax = 0;
		double dianjintax = 0;

		double sanxiachun = 0;
		double jijinchun = 0;
		double dianjinchun = 0;

		LwWholeSaleSummaryDto lwWholeSaleSummaryDto35 = new LwWholeSaleSummaryDto();
		Collection col35 = blLwWholeSaleSummaryFacade
				.findByConditions(conditions35);
		Iterator it35 = col35.iterator();
		while (it35.hasNext()) {
			lwWholeSaleSummaryDto35 = (LwWholeSaleSummaryDto) it35.next();
			sumJuminPower35 += lwWholeSaleSummaryDto35.getDenizenQuantity();
			sumJuminFee35 += lwWholeSaleSummaryDto35.getDenizenFee();
			
			sumNotJuminPower35 += lwWholeSaleSummaryDto35.getUnDenizenQuantity()
					;
			sumNotJuminFee35 += lwWholeSaleSummaryDto35.getUnDenizenFee();
			sumBusinessPower35 += lwWholeSaleSummaryDto35.getBizQuantity();
			sumBusinessFee35 += lwWholeSaleSummaryDto35.getBizFee();
			sumFarmPower35 += lwWholeSaleSummaryDto35.getFarmUseQuantity();
			sumFarmFee35 += lwWholeSaleSummaryDto35.getFarmUseFee();
			sumProducePower35 += lwWholeSaleSummaryDto35.getProductQuantity();
			sumAllPower+=lwWholeSaleSummaryDto35.getElectricQuantity();
			sumProduceFee35 += lwWholeSaleSummaryDto35.getProductFee();
			sumAllFee+=lwWholeSaleSummaryDto35.getSumFee();
			if (lwWholeSaleSummaryDto35.getWholesaletype().equals("1")) {
				sumFactoryPower35 += lwWholeSaleSummaryDto35
						.getElectricQuantity();
				sumFactoryFee35 += lwWholeSaleSummaryDto35.getSumFee()-lwWholeSaleSummaryDto35.getPowerRateFee();
			}else{
				
				sumFactoryPower35 += lwWholeSaleSummaryDto35.getIndustryQuantity();
				sumFactoryFee35 += lwWholeSaleSummaryDto35.getIndustryFee();
			}
			if (lwWholeSaleSummaryDto35.getUpCompany().equals("gy")
					|| lwWholeSaleSummaryDto35.getUpCompany().equals("dm")) {
				sanxiaPower += sumProducePower35 + sumJuminPower35
						+ sumNotJuminPower35 + sumFactoryPower35
						+ sumBusinessPower35;
			} else {
				sanxiaPower += sumProducePower35 + sumJuminPower35
						+ sumNotJuminPower35 + sumFactoryPower35
						+ sumBusinessPower35 + sumFarmPower35;
			}
			nongwanghaidaiPower += sumJuminPower35 + sumNotJuminPower35
					+ sumFactoryPower35 + sumBusinessPower35;
			kezaishengpepolePower += sumJuminPower35;
			kezaishengnotpepolePower += sumJuminPower35;
			kezaishengnotpepolePower += sumNotJuminPower35 + sumFactoryPower35
					+ sumBusinessPower35;
			kuquPower += sumJuminPower35 + sumNotJuminPower35
					+ sumFactoryPower35 + sumBusinessPower35 + sumFarmPower35;
		}

		LwWholeSaleSummaryDto lwWholeSaleSummaryDto10 = new LwWholeSaleSummaryDto();
		Collection col10 = blLwWholeSaleSummaryFacade
				.findByConditions(conditions10);
		Iterator it10 = col10.iterator();
		while (it10.hasNext()) {
			lwWholeSaleSummaryDto10 = (LwWholeSaleSummaryDto) it10.next();
			sumJuminPower10 += lwWholeSaleSummaryDto10.getDenizenQuantity();
			sumJuminFee10 += lwWholeSaleSummaryDto10.getDenizenFee();
			
			sumNotJuminPower10 += lwWholeSaleSummaryDto10.getUnDenizenQuantity()
					;
			sumAllPower+=lwWholeSaleSummaryDto10.getElectricQuantity();
			sumNotJuminFee10 += lwWholeSaleSummaryDto10.getUnDenizenFee();
			sumBusinessPower10 += lwWholeSaleSummaryDto10.getBizQuantity();
			sumBusinessFee10 += lwWholeSaleSummaryDto10.getBizFee();
			sumFarmPower10 += lwWholeSaleSummaryDto10.getFarmUseQuantity();
			sumFarmFee10 += lwWholeSaleSummaryDto10.getFarmUseFee();
			sumProducePower10 += lwWholeSaleSummaryDto10.getProductQuantity();
			sumAllFee+=lwWholeSaleSummaryDto10.getSumFee();
			sumProduceFee10 += lwWholeSaleSummaryDto10.getIndustryFee();
			if (lwWholeSaleSummaryDto10.getWholesaletype().equals("1")) {
				sumFactoryPower10 += lwWholeSaleSummaryDto10
						.getElectricQuantity();
				
				sumFactoryFee10+=lwWholeSaleSummaryDto10.getSumFee()-lwWholeSaleSummaryDto10.getPowerRateFee();
			}else{
				
				sumFactoryPower10 += lwWholeSaleSummaryDto10.getIndustryQuantity();
				sumFactoryFee10 += lwWholeSaleSummaryDto10.getIndustryFee() ;
			}
			if (lwWholeSaleSummaryDto10.getUpCompany().equals("gy")
					|| lwWholeSaleSummaryDto10.getUpCompany().equals("dm")) {
				sanxiaPower += sumProducePower10 + sumJuminPower10
						+ sumNotJuminPower10 + sumFactoryPower10
						+ sumBusinessPower10;
			} else {
				sanxiaPower += sumProducePower10 + sumJuminPower10
						+ sumNotJuminPower10 + sumFactoryPower10
						+ sumBusinessPower10 + sumFarmPower10;
			}
			nongwanghaidaiPower += sumJuminPower10 + sumNotJuminPower10
					+ sumFactoryPower10 + sumBusinessPower10;
			kezaishengpepolePower += sumJuminPower10;
			kezaishengnotpepolePower += sumJuminPower10;
			kezaishengnotpepolePower += sumNotJuminPower10 + sumFactoryPower35
					+ sumBusinessPower10;
			kuquPower += sumJuminPower10 + sumNotJuminPower10
					+ sumFactoryPower10 + sumBusinessPower10 + sumFarmPower10;
		}

		sanxiaFee = sanxiaPower * 0.004 * 0.88;
		dianjinFee = nongwanghaidaiPower * 0.02 * 0.88;
		jijinFee = kezaishengpepolePower * 0.001 + kuquPower * 0.0031
				+ kezaishengnotpepolePower * 0.002;

		jumintax10 = sumJuminFee10 / 1.17 * 0.17;
		notjumintax10 = sumNotJuminFee10 / 1.17 * 0.17;
		shengchantax10 = sumProduceFee10 / 1.17 * 0.17;
		gongyetax10 = sumFactoryFee10 / 1.17 * 0.17;
		shangyetax10 = sumBusinessFee10 / 1.17 * 0.17;
		nongguantax10 = sumFarmFee10 / 1.17 * 0.17;

		juminchun10 = sumJuminFee10 / 1.17;
		notjuminchun10 = sumNotJuminFee10 / 1.17;
		shengchanchun10 = sumProduceFee10 / 1.17;
		gongyechun10 = sumFactoryFee10 / 1.17;
		shangyechun10 = sumBusinessFee10 / 1.17;
		nongguanchun10 = sumFarmFee10 / 1.17;

		jumintax35 = sumJuminFee35 / 1.17 * 0.17;
		notjumintax35 = sumNotJuminFee35 / 1.17 * 0.17;
		shengchantax35 = sumProduceFee35 / 1.17 * 0.17;
		gongyetax35 = sumFactoryFee35 / 1.17 * 0.17;
		shangyetax35 = sumBusinessFee35 / 1.17 * 0.17;
		nongguantax35 = sumFarmFee35 / 1.17 * 0.17;

		juminchun35 = sumJuminFee35 / 1.17;
		notjuminchun35 = sumNotJuminFee35 / 1.17;
		shengchanchun35 = sumProduceFee35 / 1.17;
		gongyechun35 = sumFactoryFee35 / 1.17;
		shangyechun35 = sumBusinessFee35 / 1.17;
		nongguanchun35 = sumFarmFee35 / 1.17;

		/*sumAllPower = sumProducePower10 + sumJuminPower10 + sumNotJuminPower10
				+ sumFactoryPower10 + sumBusinessPower10 + sumFarmPower10
				+ sumProducePower35 + sumJuminPower35 + sumNotJuminPower35
				+ sumFactoryPower35 + sumBusinessPower35 + sumFarmPower35;*/
		/*sumAllFee = sumProduceFee10 + sumJuminFee10 + sumNotJuminFee10
				+ sumFactoryFee10 + sumBusinessFee10 + sumFarmFee10
				+ sumProduceFee35 + sumJuminFee35 + sumNotJuminFee35
				+ sumFactoryFee35 + sumBusinessFee35 + sumFarmFee35;*/
		sumAllTax = jumintax10 + notjumintax10 + shengchantax10 + gongyetax10
				+ shangyetax10 + nongguantax10 + jumintax35 + notjumintax35
				+ shengchantax35 + gongyetax35 + shangyetax35 + nongguantax35;
		sumAllChunFee = juminchun10 + notjuminchun10 + shengchanchun10
				+ gongyechun10 + shangyechun10 + nongguanchun10 + juminchun35
				+ notjuminchun35 + shengchanchun35 + gongyechun35
				+ shangyechun35 + nongguanchun35;
		sanxiatax = sanxiaFee / 1.17 * 0.17;
		jijintax = jijinFee / 1.17 * 0.17;
		dianjintax = dianjinFee / 1.17 * 0.17;
		
		sanxiachun = sanxiaFee / 1.17;
		jijinchun = jijinFee / 1.17;
		dianjinchun = dianjinFee / 1.17;
		sumCountFee = sumAllFee + sanxiaFee + dianjinFee + jijinFee;

		httpServletRequest.setAttribute("sumJuminPower10", Math
				.round(sumJuminPower10));
		httpServletRequest.setAttribute("sumFactoryPower10", Math
				.round(sumFactoryPower10));
		httpServletRequest.setAttribute("sumNotJuminPower10", Math
				.round(sumNotJuminPower10));
		httpServletRequest.setAttribute("sumBusinessPower10", Math
				.round(sumBusinessPower10));
		httpServletRequest.setAttribute("sumFarmPower10", Math
				.round(sumFarmPower10));
		httpServletRequest.setAttribute("sumProducePower10", Math
				.round(sumProducePower10));
		httpServletRequest.setAttribute("sumJuminPower35", Math
				.round(sumJuminPower35));
		httpServletRequest.setAttribute("sumFactoryPower35", Math
				.round(sumFactoryPower35));
		httpServletRequest.setAttribute("sumNotJuminPower35", Math
				.round(sumNotJuminPower35));
		httpServletRequest.setAttribute("sumBusinessPower35", Math
				.round(sumBusinessPower35));
		httpServletRequest.setAttribute("sumFarmPower35", Math
				.round(sumFarmPower35));
		httpServletRequest.setAttribute("sumProducePower35", Math
				.round(sumProducePower35));
		httpServletRequest.setAttribute("sumProducePower35", Math
				.round(sumProducePower35));
		httpServletRequest.setAttribute("sumAllPower", Math.round(sumAllPower));
		httpServletRequest.setAttribute("sumJuminFee10", df
				.format(sumJuminFee10));
		httpServletRequest.setAttribute("sumFactoryFee10", df
				.format(sumFactoryFee10));
		httpServletRequest.setAttribute("sumNotJuminFee10", df
				.format(sumNotJuminFee10));
		httpServletRequest.setAttribute("sumBusinessFee10", df
				.format(sumBusinessFee10));
		httpServletRequest
				.setAttribute("sumFarmFee10", df.format(sumFarmFee10));
		httpServletRequest.setAttribute("sumProduceFee10", df
				.format(sumProduceFee10));
		httpServletRequest.setAttribute("sumJuminFee35", df
				.format(sumJuminFee35));
		httpServletRequest.setAttribute("sumFactoryFee35", df
				.format(sumFactoryFee35));
		httpServletRequest.setAttribute("sumNotJuminFee35", df
				.format(sumNotJuminFee35));
		httpServletRequest.setAttribute("sumBusinessFee35", df
				.format(sumBusinessFee35));
		httpServletRequest
				.setAttribute("sumFarmFee35", df.format(sumFarmFee35));
		httpServletRequest.setAttribute("sumProduceFee35", df
				.format(sumProduceFee35));
		httpServletRequest.setAttribute("sanxiaFee", df.format(sanxiaFee));
		httpServletRequest.setAttribute("dianjinFee", df.format(dianjinFee));
		httpServletRequest.setAttribute("jijinFee", df.format(jijinFee));
		httpServletRequest.setAttribute("jumintax10", df.format(jumintax10));
		httpServletRequest.setAttribute("notjumintax10", df
				.format(notjumintax10));
		httpServletRequest.setAttribute("shengchantax10", df
				.format(shengchantax10));
		httpServletRequest.setAttribute("gongyetax10", df.format(gongyetax10));
		httpServletRequest
				.setAttribute("shangyetax10", df.format(shangyetax10));
		httpServletRequest.setAttribute("nongguantax10", df
				.format(nongguantax10));
		httpServletRequest.setAttribute("juminchun10", df.format(juminchun10));
		httpServletRequest.setAttribute("notjuminchun10", df
				.format(notjuminchun10));

		httpServletRequest.setAttribute("shengchanchun10", df
				.format(shengchanchun10));
		httpServletRequest
				.setAttribute("gongyechun10", df.format(gongyechun10));
		httpServletRequest.setAttribute("shangyechun10", df
				.format(shangyechun10));
		httpServletRequest.setAttribute("nongguanchun10", df
				.format(nongguanchun10));
		httpServletRequest.setAttribute("jumintax35", df.format(jumintax35));
		httpServletRequest.setAttribute("notjumintax35", df
				.format(notjumintax35));
		httpServletRequest.setAttribute("shengchantax35", df
				.format(shengchantax35));
		httpServletRequest.setAttribute("gongyetax35", df.format(gongyetax35));
		httpServletRequest
				.setAttribute("shangyetax35", df.format(shangyetax35));
		httpServletRequest.setAttribute("nongguantax35", df
				.format(nongguantax35));
		httpServletRequest.setAttribute("juminchun35", df.format(juminchun35));
		httpServletRequest.setAttribute("notjuminchun35", df
				.format(notjuminchun35));
		httpServletRequest.setAttribute("shengchanchun35", df
				.format(shengchanchun35));
		httpServletRequest
				.setAttribute("gongyechun35", df.format(gongyechun35));
		httpServletRequest.setAttribute("shangyechun35", df
				.format(shangyechun35));

		httpServletRequest.setAttribute("nongguanchun35", df
				.format(nongguanchun35));
		httpServletRequest.setAttribute("sumAllFee", df.format(sumAllFee));
		httpServletRequest.setAttribute("sumAllTax", df.format(sumAllTax));
		httpServletRequest.setAttribute("sumAllChunFee", df
				.format(sumAllChunFee));
		httpServletRequest.setAttribute("sumCountFee", df.format(sumCountFee));

		httpServletRequest.setAttribute("sanxiatax", df.format(sanxiatax));
		httpServletRequest.setAttribute("jijintax", df.format(jijintax));
		httpServletRequest.setAttribute("dianjintax", df.format(dianjintax));
		httpServletRequest.setAttribute("sanxiachun", df.format(sanxiachun));
		httpServletRequest.setAttribute("jijinchun", df.format(jijinchun));
		httpServletRequest.setAttribute("dianjinchun", df.format(dianjinchun));
		return actionMapping.findForward("priceCount");
	}

}
