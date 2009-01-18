package com.elongway.pss.ui.count;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;

public class UIwholeSaleKVCount extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String wholesaleKV=httpServletRequest.getParameter("wholesaleKV");
		String company=httpServletRequest.getParameter("company");
		BLLwPowerLineFacade blLwPowerLineFacade=new BLLwPowerLineFacade();
		String lineSql;
		double countPower=0;
		double SumFee=0;
		String lastMonth=inputDate.substring(4,6);
		if(lastMonth.length()==1){
			lastMonth="0"+lastMonth;
		}
		String lastInputDate=inputDate.substring(0, 4)+lastMonth;
		String serchSql="1=1 and  STATMONTH like'"+lastInputDate+"%'";
		if(company.equals("")||company==null){
			 lineSql="1=1 and VoltLevel='"+wholesaleKV+"'"+"SupplyType=3 or SupplyType=4 ";
		}else{
			lineSql=lineSql="1=1 and VoltLevel='"+wholesaleKV+"'"+"SupplyType=3 or SupplyType=4 and comcode = '"+company+"'";
		}
		
		LwWholeSaleSummaryDto lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
		LwPowerLineDto lwPowerLineDto=new LwPowerLineDto();
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		Collection lincol=blLwPowerLineFacade.findByConditions(lineSql);
		Iterator  wholeSale=lincol.iterator();
		if(wholeSale.hasNext()){
			lwPowerLineDto=(LwPowerLineDto)wholeSale.next();
			String lineCode=lwPowerLineDto.getLineCode();
			Collection wholesale=blLwWholeSaleSummaryFacade.findByConditions(serchSql+"LineCode='"+lineCode+"'");
			Iterator whole=wholesale.iterator();
			if(whole.hasNext()){
				lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)whole.next();
				 countPower+=lwWholeSaleSummaryDto.getElectricQuantity();
				 SumFee+=lwWholeSaleSummaryDto.getSumFee();
			}
		}
		return actionMapping.findForward("Success");

}
}