package com.elongway.pss.ui.count;

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
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIcountWholeSaleAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String wholesaleStyle=httpServletRequest.getParameter("wholesaleStyle");
		String inputDate=httpServletRequest.getParameter("inputDate"); 
		String company=httpServletRequest.getParameter("company");
		String StatMonth=inputDate.substring(0, 7);
		String conditions=" ";
		double  sumMoney=0;
		double  sanxia=0;
		double  dianjin=0;
		double  jijin=0;
		long dianliang=0;
		

	
	conditions="1=1 and UpCompany='"+company+"'"+" and StatMonth = '"+StatMonth+"'";

	BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
	LwWholeSaleSummaryDto lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
	Collection col=blLwWholeSaleSummaryFacade.findByConditions(conditions);
	
	if(col.size()==0){
		
		throw new UserException(-6, -706, this.getClass().getName(),
		"该月还没有算费！");
	}
	Iterator it=col.iterator();
	while(it.hasNext()){
		lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it.next();
		  sumMoney+=lwWholeSaleSummaryDto.getSumFee();
		  sanxia+=lwWholeSaleSummaryDto.getSanXiaFee();
		  dianjin+=lwWholeSaleSummaryDto.getPowerFee();
		  jijin+=lwWholeSaleSummaryDto.getSurcharge();
		 dianliang+=lwWholeSaleSummaryDto.getElectricQuantity();
	}
	sumMoney=Math.round(sumMoney*100)/100;
	sanxia=Math.round(sanxia*100)/100;
	dianjin=Math.round(dianjin*100)/100;
	jijin=Math.round(jijin*100)/100;
	httpServletRequest.setAttribute("company",company );
	httpServletRequest.setAttribute("sumMoney",sumMoney );
	httpServletRequest.setAttribute("sanxia",sanxia );
	httpServletRequest.setAttribute("dianjin",dianjin );
	httpServletRequest.setAttribute("jijin",jijin );
	httpServletRequest.setAttribute("dianliang", dianliang);
	return actionMapping.findForward("showCount");
	}
	
}
