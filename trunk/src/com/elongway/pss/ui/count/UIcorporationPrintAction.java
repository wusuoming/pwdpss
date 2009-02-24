package com.elongway.pss.ui.count;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorBakFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIcorporationPrintAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String corporationName=httpServletRequest.getParameter("corporationName");
		String exends1 = httpServletRequest.getParameter("exends1");
		String exends2 = httpServletRequest.getParameter("exends2");
		String exends3 = httpServletRequest.getParameter("exends3");
		String exends4 = httpServletRequest.getParameter("exends4");
		String exends5 = httpServletRequest.getParameter("exends5");
		String exends6 = httpServletRequest.getParameter("exends6");
		String exends7 = httpServletRequest.getParameter("exends7");
		String exends8 = httpServletRequest.getParameter("exends8");
		String exends9 = httpServletRequest.getParameter("exends9");
		String exends10 = httpServletRequest.getParameter("exends10");
		String exends11 = httpServletRequest.getParameter("exends11");
		String exends12 = httpServletRequest.getParameter("exends12");
		httpServletRequest.setAttribute("exends1", exends1);
		httpServletRequest.setAttribute("exends2", exends2);
		httpServletRequest.setAttribute("exends3", exends3);
		httpServletRequest.setAttribute("exends4", exends4);
		httpServletRequest.setAttribute("exends5", exends5);
		httpServletRequest.setAttribute("exends6", exends6);
		httpServletRequest.setAttribute("exends7", exends7);
		httpServletRequest.setAttribute("exends8", exends8);
		httpServletRequest.setAttribute("exends9", exends9);
		httpServletRequest.setAttribute("exends10", exends10);
		httpServletRequest.setAttribute("exends11", exends11);
		httpServletRequest.setAttribute("exends12", exends12);
		
		
		String condition=" 1=1";
	
			String serchDate=inputDate.substring(0, 7);
			condition+=" and StatMonth = '"+serchDate+"'";
		BLLwCoporationUserInfoFacade  blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto  lwCoporationUserInfoDto=blLwCoporationUserInfoFacade.findByPrimaryKey(corporationName);
		condition+=" and linecode='"+corporationName+"'";
		String conditions="1=1 and userNo ='"+corporationName+"' and StatMonth = '"+serchDate+"'";
		BLLwNewFactoryIndicatorBakFacade  blLwNewFactoryIndicatorBakFacade=new BLLwNewFactoryIndicatorBakFacade();
		Collection colpointbak=blLwNewFactoryIndicatorBakFacade.findByConditions(conditions);
		BLLwNewFactoryIndicatorFacade  blLwNewFactoryIndicatorFacade=new BLLwNewFactoryIndicatorFacade();
		Collection colpoint=blLwNewFactoryIndicatorFacade.findByConditions(conditions);
		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade=new BLLwCorporationSummaryFacade();
		LwCorporationSummaryDto LwCorporationSummaryDto2=blLwCorporationSummaryFacade.findByPrimaryKey(corporationName, serchDate);
		if(LwCorporationSummaryDto2==null){
			throw new UserException(-6, -706, this.getClass().getName(),
			"该用户还没有算过费！");
		}
		
		DecimalFormat df = new DecimalFormat("###0.00");
		double tax=0;
		
		tax=LwCorporationSummaryDto2.getSumFee()/1.17*0.17;
		httpServletRequest.setAttribute("colpointbak", colpointbak);
		
		httpServletRequest.setAttribute("LwCorporationSummaryDto2", LwCorporationSummaryDto2);
		httpServletRequest.setAttribute("lwCoporationUserInfoDto", lwCoporationUserInfoDto);
		httpServletRequest.setAttribute("colpoint", colpoint);
		httpServletRequest.setAttribute("tax", df.format(tax));
		return actionMapping.findForward("corporationprint");
		
		
		
}

}
