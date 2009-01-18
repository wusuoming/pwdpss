package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwctFacade;
import com.elongway.pss.bl.facade.BLLwptFacade;
import com.elongway.pss.dto.domain.LwctDto;
import com.elongway.pss.dto.domain.LwptDto;

public class UIAddLWCTAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String Modus=httpServletRequest.getParameter("Modus");
		String CT=httpServletRequest.getParameter("CT");
		String FactoryName=httpServletRequest.getParameter("FactoryName");
		String CTRate=httpServletRequest.getParameter("CTRate");
		String Exact=httpServletRequest.getParameter("Exact");
		String FctoryCodeA=httpServletRequest.getParameter("FctoryCodeA");
		String FctoryCodeB=httpServletRequest.getParameter("FctoryCodeB");
		String FctoryCodeC=httpServletRequest.getParameter("FctoryCodeC");
		String ImportDate=httpServletRequest.getParameter("ImportDate");
		String ValidStatus=httpServletRequest.getParameter("ValidStatus");
		LwctDto  lwctDto=new LwctDto();
		lwctDto.setModus(Modus);
		lwctDto.setCt(CT);
		lwctDto.setFactoryName(FactoryName);
		if(CTRate==null||CTRate.equals("")){
		
		}
		else{
			lwctDto.setCtRate(Double.parseDouble(CTRate));
		}
		if(Exact==null||Exact.equals("")){
		
		}else{
			
			lwctDto.setExact(Double.parseDouble(Exact));
		}
		lwctDto.setFctoryCodeA(FctoryCodeA);
		lwctDto.setFctoryCodeB(FctoryCodeB);
		lwctDto.setFctoryCodeC(FctoryCodeC);
		lwctDto.setImportDate(ImportDate);
		lwctDto.setValidStatus(ValidStatus);
		BLLwctFacade blLwctFacade=new BLLwctFacade();
		blLwctFacade.insert(lwctDto);
		return actionMapping.findForward("Success");
		
}

}
