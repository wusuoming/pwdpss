package com.elongway.pss.ui.allSerch;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.custom.BLSelectOptionsNameValueAction;
import com.elongway.pss.bl.facade.BLLwWholeSalePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIWholeSaleSearchAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String wholeSaleName=httpServletRequest.getParameter("wholeSaleName");
		String StatMonth=inputDate.substring(0, 7);
		
		String condition=" 1=1";
	
			
			condition+=" and StatMonth = '"+StatMonth+"'";
		
		condition+=" and linecode='"+wholeSaleName+"'";
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		LwWholeSaleSummaryDto lwWholeSaleSummaryDto=blLwWholeSaleSummaryFacade.findByPrimaryKey(wholeSaleName, StatMonth);
		if(lwWholeSaleSummaryDto == null){
			throw new UserException(-6,-709,this.getClass().getName(), "本月还没有算费");
		}
		httpServletRequest.setAttribute("lwWholeSaleSummaryDto", lwWholeSaleSummaryDto);
		return actionMapping.findForward("wholeSale");
		
		
		
}
	public static void main(String[] args) {
		String s="2008-01-01";
		System.out.print(s.substring(0, 7));
	}
}