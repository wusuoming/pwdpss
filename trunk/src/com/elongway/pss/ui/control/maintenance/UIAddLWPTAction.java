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

public class UIAddLWPTAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String Modus=httpServletRequest.getParameter("Modus");
		String PT=httpServletRequest.getParameter("PT");
		String FactoryName=httpServletRequest.getParameter("FactoryName");
		String PTRate=httpServletRequest.getParameter("PTRate");
		String Exact=httpServletRequest.getParameter("Exact");
		String FctoryCodeA=httpServletRequest.getParameter("FctoryCodeA");
		String FctoryCodeB=httpServletRequest.getParameter("FctoryCodeB");
		String FctoryCodeC=httpServletRequest.getParameter("FctoryCodeC");
		String ImportDate=httpServletRequest.getParameter("ImportDate");
		String ValidStatus=httpServletRequest.getParameter("ValidStatus");
		LwptDto  lwptDto=new LwptDto();
		lwptDto.setModus(Modus);
		lwptDto.setPt(PT);
		lwptDto.setFactoryName(FactoryName);
		if(PTRate==null||PTRate.equals("")){
		
		}
		else{
			lwptDto.setPtRate(Double.parseDouble(PTRate));
		}
		if(Exact==null||Exact.equals("")){
		
		}else{
			
			lwptDto.setExact(Double.parseDouble(Exact));
		}
		lwptDto.setFctoryCodeA(FctoryCodeA);
		lwptDto.setFctoryCodeB(FctoryCodeB);
		lwptDto.setFctoryCodeC(FctoryCodeC);
		lwptDto.setImportDate(ImportDate);
		lwptDto.setValidStatus(ValidStatus);
		BLLwptFacade blLwptFacade=new BLLwptFacade();
		blLwptFacade.insert(lwptDto);
		return actionMapping.findForward("Success");

}
}