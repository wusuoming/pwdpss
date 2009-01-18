package com.elongway.pss.ui.allSerch;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorBakFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorBakDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;

public class UIFinalBookTwoAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

		String linecode=httpServletRequest.getParameter("userno");
		String date=httpServletRequest.getParameter("date");
		httpServletRequest.setAttribute("date", date);
		httpServletRequest.setAttribute("linecode", linecode);
		double sumPower=0;
		DecimalFormat df = new DecimalFormat("###0.00");
		double sumFee=0;
		BLLwWholeSaleIndicatorBakFacade  blLwWholeSaleIndicatorBakFacade=new BLLwWholeSaleIndicatorBakFacade();
		BLLwWholeSaleIndicatorFacade  blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
		String conditions="1=1 and userno='"+linecode+"' and statmonth like '"+date+"%'";
		//LwWholeSaleIndicatorBakDto  lwWholeSaleIndicatorBakDto=new LwWholeSaleIndicatorBakDto();
		//LwWholeSaleIndicatorDto  lwWholeSaleIndicatorDto=new LwWholeSaleIndicatorDto();
		Collection col=blLwWholeSaleIndicatorFacade.findByConditions(conditions);
		Collection colbak=blLwWholeSaleIndicatorBakFacade.findByConditions(conditions);
		BLLwWholeSaleUserInfoFacade  blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
		LwWholeSaleUserInfoDto  lwWholeSaleUserInfoDto=blLwWholeSaleUserInfoFacade.findByPrimaryKey(linecode);
		String ammeter=" 1=1 and userno='"+linecode+"' and flag=1";
		BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
		Collection cola=blLwAmmeterChangeFacade.findByConditions(ammeter);
		Iterator it=col.iterator();
		Iterator itbak=colbak.iterator();
		String conditionfee="1=1 and linecode='"+linecode+"' and statmonth like '"+date+"%'";
		LwWholeSaleIndicatorDto  lwWholeSaleIndicatorDto=new LwWholeSaleIndicatorDto();
		LwWholeSaleIndicatorBakDto  lwWholeSaleIndicatorBakDto=new LwWholeSaleIndicatorBakDto();
		LwWholeSaleSummaryDto lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
		if(col!=null){
		while(it.hasNext()){ 
			lwWholeSaleIndicatorDto=(LwWholeSaleIndicatorDto)it.next();
			sumPower+=Double.parseDouble(lwWholeSaleIndicatorDto.getUnworkQuantity());
			
			
		}
		}
		if(colbak!=null){
			while(itbak.hasNext()){
				lwWholeSaleIndicatorBakDto=(LwWholeSaleIndicatorBakDto)itbak.next();
				sumPower+=Double.parseDouble(lwWholeSaleIndicatorBakDto.getUnworkQuantity());
			}
		}
		BLLwWholeSaleSummaryFacade  blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		Collection  colfee=blLwWholeSaleSummaryFacade.findByConditions(conditionfee);
		if(colfee!=null){
		Iterator itfee=colfee.iterator();
		while(itfee.hasNext()){
			lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)itfee.next();
			sumFee+=lwWholeSaleSummaryDto.getSumFee();
		}
		}
		httpServletRequest.setAttribute("col", col);
		httpServletRequest.setAttribute("colbak", colbak);
		httpServletRequest.setAttribute("cola", cola);
		httpServletRequest.setAttribute("lwWholeSaleUserInfoDto", lwWholeSaleUserInfoDto);
		httpServletRequest.setAttribute("date", date);
		httpServletRequest.setAttribute("sumPower", Math.round(sumPower));
		httpServletRequest.setAttribute("sumFee", df.format(sumFee));
		return actionMapping.findForward("viewbookTwo");
}
}
