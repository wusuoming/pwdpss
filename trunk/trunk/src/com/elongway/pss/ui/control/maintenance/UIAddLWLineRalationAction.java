package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwLineCTFacade;
import com.elongway.pss.bl.facade.BLLwLineCTPTAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwLinePTFacade;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.dto.domain.LwLineCTDto;
import com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto;
import com.elongway.pss.dto.domain.LwLinePTDto;

public class UIAddLWLineRalationAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String LineCode=httpServletRequest.getParameter("LineCode");
		String CTModus=httpServletRequest.getParameter("CTModus");
		String PTModus=httpServletRequest.getParameter("PTModus");
		String AmmeterNo=httpServletRequest.getParameter("AmmeterNo");
		String inputDate=httpServletRequest.getParameter("inputDate");
/*		BLLwLineCTFacade blLwLineCTFacade=new BLLwLineCTFacade();
		LwLineCTDto lwLineCTDto=new LwLineCTDto();
		lwLineCTDto.setCtModus(CTModus);
		lwLineCTDto.setLineCode(LineCode);
		lwLineCTDto.setFlag("1");
		lwLineCTDto.setInputDate(inputDate);
		BLLwLinePTFacade   blLwLinePTFacade=new BLLwLinePTFacade();
		LwLinePTDto lwLinePTDto=new LwLinePTDto();
		lwLinePTDto.setPtModus(CTModus);
		lwLinePTDto.setLineCode(LineCode);
		lwLinePTDto.setFlag("1");
		lwLinePTDto.setInputDate(inputDate);
		blLwLinePTFacade.insert(lwLinePTDto);
		blLwLineCTFacade.insert(lwLineCTDto);
		BLLwLineAmmeterFacade  blLwLineAmmeterFacade=new BLLwLineAmmeterFacade();
		LwLineAmmeterDto lwLineAmmeterDto=new LwLineAmmeterDto();
		lwLineAmmeterDto.setLineCode(LineCode);
		lwLineAmmeterDto.setAmmeterNo(AmmeterNo);
		lwLineAmmeterDto.setFlag("1");
		lwLineAmmeterDto.setInputDate(inputDate);
		blLwLineAmmeterFacade.insert(lwLineAmmeterDto);*/
		
		BLLwLineCTPTAmmeterFacade blLwLineCTPTAmmeterFacade=new BLLwLineCTPTAmmeterFacade();
		LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto=new LwLineCTPTAmmeterDto();
		lwLineCTPTAmmeterDto.setLineCode(LineCode);
		lwLineCTPTAmmeterDto.setCtModus(CTModus);
		lwLineCTPTAmmeterDto.setPtModus(PTModus);
		lwLineCTPTAmmeterDto.setAmmeterNo(AmmeterNo);
		lwLineCTPTAmmeterDto.setInputDate(inputDate);
		lwLineCTPTAmmeterDto.setFlag("1");
		blLwLineCTPTAmmeterFacade.insert(lwLineCTPTAmmeterDto);
		return actionMapping.findForward("Success");
		
	}

}
