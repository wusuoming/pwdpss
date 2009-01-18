package com.elongway.pss.ui.control.maintenance;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.bl.facade.BLSubjoinFeeFacade;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.dto.domain.SubjoinFeeDto;

public class UISaveWholeSalePurAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String[]  ComCode=httpServletRequest.getParameterValues("ComCode");
		String[]  ComName=httpServletRequest.getParameterValues("ComName");
		String[]  PeoplePrice=httpServletRequest.getParameterValues("PeoplePrice");
		String[]  NotPeoplePrice=httpServletRequest.getParameterValues("NotPeoplePrice");
		String[]  ProducePrice=httpServletRequest.getParameterValues("ProducePrice");
		String[]  BusinessPrice=httpServletRequest.getParameterValues("BusinessPrice");
		
		String[]  VoltLevel=httpServletRequest.getParameterValues("VoltLevel");
		String[]  IndustryPrice=httpServletRequest.getParameterValues("IndustryPrice");
		String[]  FarmPrice=httpServletRequest.getParameterValues("FarmPrice");
		BLLwWholeSalePurePriceFacade  blLwWholeSalePurePriceFacade=new BLLwWholeSalePurePriceFacade();
		LwWholeSalePurePriceDto  lwWholeSalePurePriceDto=new LwWholeSalePurePriceDto();
		
		
		for( int i=0;i<ComCode.length;i++){
			lwWholeSalePurePriceDto.setComCode(ComCode[i]);
			lwWholeSalePurePriceDto.setComName(ComName[i]);
			lwWholeSalePurePriceDto.setPeoplePrice(Double.parseDouble(PeoplePrice[i]));
			lwWholeSalePurePriceDto.setNotPeoplePrice(Double.parseDouble(NotPeoplePrice[i]));
			lwWholeSalePurePriceDto.setProducePrice(Double.parseDouble(ProducePrice[i]));
			lwWholeSalePurePriceDto.setBusinessPrice(Double.parseDouble(BusinessPrice[i]));
			lwWholeSalePurePriceDto.setIndustryPrice(Double.parseDouble(IndustryPrice[i]));
			lwWholeSalePurePriceDto.setFarmPrice(Double.parseDouble(FarmPrice[i]));
			lwWholeSalePurePriceDto.setVoltLevel(VoltLevel[i]);
			blLwWholeSalePurePriceFacade.update(lwWholeSalePurePriceDto);
		}
		String conditions="";
		
		Collection col=blLwWholeSalePurePriceFacade.findByConditions(conditions);
		
		httpServletRequest.setAttribute("price", col);
		return  actionMapping.findForward("editwholeSalePur");
	}


}
