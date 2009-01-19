package com.elongway.pss.ui.dataInput;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIWholeSaleCalBeforAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

		String comcode=httpServletRequest.getParameter("comcode");
		String conditions="1=1 and ifCal=0 and flag = '"+comcode+"'"+"order by userno";
		String statMonth = null;
		statMonth = PowerFeeCal.getCurrentBillMonth();
		String tempCondition = "";
		StringBuffer condition = new StringBuffer();
		Collection calList = null;
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		BLLwWholeSaleIndicatorFacade blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
		Collection allPointer=new ArrayList();
		allPointer=blLwWholeSaleIndicatorFacade.findByConditions(conditions);
		if(allPointer == null||allPointer.size()==0){
			throw new UserException(-6,-710,this.getClass().getName(),"还没有初始化指针");
		}
		
		condition.append(" 1=1 ").append(tempCondition).append(" and ").append(" statmonth = '").append(statMonth).append("' and ").append("upcompany='").append(comcode).append("'");
		calList = blLwWholeSaleSummaryFacade.findByConditions(condition.toString());			
		
		if(calList.size()>0){
			throw new UserException(-6, -712, this.getClass().getName(),"该局已经算过费");
		}
		httpServletRequest.setAttribute("allPointer", allPointer);
		return actionMapping.findForward("pathWholeSaleCal");
	}
}
	
