package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwLineCTFacade;
import com.elongway.pss.bl.facade.BLLwLineCTPTAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwLinePTFacade;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.dto.domain.LwLineCTDto;
import com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto;
import com.elongway.pss.dto.domain.LwLinePTDto;

public class UIEditLWLineRalationAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String LineCode=httpServletRequest.getParameter("LineCode");
		String CTModus=httpServletRequest.getParameter("CTModus");
		String PTModus=httpServletRequest.getParameter("PTModus");
		String AmmeterNo=httpServletRequest.getParameter("AmmeterNo");
		String CTModusOld=httpServletRequest.getParameter("CTModusOld");
		String PTModusOld=httpServletRequest.getParameter("PTModusOld");
		String AmmeterNoOld=httpServletRequest.getParameter("AmmeterNoOld");
		String inputDate=httpServletRequest.getParameter("inputDate");
		if(!CTModus.equals("CTModusOld")){
			
			BLLwLineCTFacade blLwLineCTFacade=new BLLwLineCTFacade();
			LwLineCTDto lwLineCTDtoOld=new LwLineCTDto();
			lwLineCTDtoOld=blLwLineCTFacade.findByPrimaryKey(LineCode, CTModusOld);
			lwLineCTDtoOld.setFlag("0");
			blLwLineCTFacade.update(lwLineCTDtoOld);
			LwLineCTDto lwLineCTDto=new LwLineCTDto();
			lwLineCTDto.setLineCode(LineCode);
			lwLineCTDto.setCtModus(CTModus);
			lwLineCTDto.setFlag("1");
			lwLineCTDto.setInputDate(inputDate);
			blLwLineCTFacade.insert(lwLineCTDto);
			
			
		}
     if(!PTModus.equals("PTModusOld")){
			
			BLLwLinePTFacade blLwLinePTFacade=new BLLwLinePTFacade();
			LwLinePTDto lwLinePTDtoOld=new LwLinePTDto();
			lwLinePTDtoOld=blLwLinePTFacade.findByPrimaryKey(LineCode, PTModusOld);
			lwLinePTDtoOld.setFlag("0");
			blLwLinePTFacade.update(lwLinePTDtoOld);
			LwLinePTDto lwLinePTDto=new LwLinePTDto();
			lwLinePTDto.setLineCode(LineCode);
			lwLinePTDto.setPtModus(CTModus);
			lwLinePTDto.setFlag("1");
			lwLinePTDto.setInputDate(inputDate);
			blLwLinePTFacade.insert(lwLinePTDto);
			
			
		}
		if(!AmmeterNoOld.equals("AmmeterNo")){
			BLLwLineAmmeterFacade blLwLineAmmeterFacade=new BLLwLineAmmeterFacade();
			LwLineAmmeterDto lwLineAmmeteOld=new LwLineAmmeterDto();
			lwLineAmmeteOld=blLwLineAmmeterFacade.findByPrimaryKey(LineCode, AmmeterNoOld);
			lwLineAmmeteOld.setFlag("0");
			blLwLineAmmeterFacade.update(lwLineAmmeteOld);
			LwLineAmmeterDto lwLineAmmeterDto=new LwLineAmmeterDto();
			lwLineAmmeterDto.setLineCode(LineCode);
			lwLineAmmeterDto.setAmmeterNo(AmmeterNo);
			lwLineAmmeterDto.setFlag("1");
			lwLineAmmeterDto.setInputDate(inputDate);
			blLwLineAmmeterFacade.insert(lwLineAmmeterDto);
			
		}
		BLLwLineCTPTAmmeterFacade blLwLineCTPTAmmeterFacade=new BLLwLineCTPTAmmeterFacade();
		
		LwLineCTPTAmmeterDto  lwLineCTPTAmmeterOld=new LwLineCTPTAmmeterDto();
		lwLineCTPTAmmeterOld.setFlag("0");
		blLwLineCTPTAmmeterFacade.update(lwLineCTPTAmmeterOld);
		LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto=new LwLineCTPTAmmeterDto();
		lwLineCTPTAmmeterDto.setLineCode(LineCode);
		lwLineCTPTAmmeterDto.setCtModus(CTModus);
		lwLineCTPTAmmeterDto.setPtModus(PTModus);
		lwLineCTPTAmmeterDto.setAmmeterNo(AmmeterNo);
		lwLineCTPTAmmeterDto.setFlag("1");
		lwLineCTPTAmmeterDto.setInputDate(inputDate);
		blLwLineCTPTAmmeterFacade.insert(lwLineCTPTAmmeterDto);
		return actionMapping.findForward("Success");
		
	}
	

}
