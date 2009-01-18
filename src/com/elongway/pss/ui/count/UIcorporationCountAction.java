package com.elongway.pss.ui.count;

import java.text.DecimalFormat;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIcorporationCountAction extends Action {

	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String corporationName=httpServletRequest.getParameter("corporationName");
		
		String condition=" 1=1";
	
			String serchDate=inputDate.substring(0, 7);
			condition+=" and StatMonth = '"+serchDate+"'";
		BLLwCoporationUserInfoFacade  blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto  lwCoporationUserInfoDto=blLwCoporationUserInfoFacade.findByPrimaryKey(corporationName);
		condition+=" and linecode='"+corporationName+"'";
		String conditions="1=1 and userNo ='"+corporationName+"'";
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
		
		
		httpServletRequest.setAttribute("LwCorporationSummaryDto2", LwCorporationSummaryDto2);
		httpServletRequest.setAttribute("lwCoporationUserInfoDto", lwCoporationUserInfoDto);
		httpServletRequest.setAttribute("colpoint", colpoint);
		httpServletRequest.setAttribute("tax", df.format(tax));
		return actionMapping.findForward("viewCorporationCount");
		
		
		
}
}
