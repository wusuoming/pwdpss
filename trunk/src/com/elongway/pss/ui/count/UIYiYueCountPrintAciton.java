package com.elongway.pss.ui.count;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwShouShuTableFacade;
import com.elongway.pss.dto.domain.LwShouShuTableDto;

public class UIYiYueCountPrintAciton extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		
		BLLwShouShuTableFacade  blLwShouShuTableFacade=new BLLwShouShuTableFacade();
		LwShouShuTableDto lwShouShuTableDtocorporation=new LwShouShuTableDto();
		LwShouShuTableDto lwShouShuTableDtowholesale=new LwShouShuTableDto();
		lwShouShuTableDtocorporation=blLwShouShuTableFacade.findByPrimaryKey("2009-01", "ducorporation");
		lwShouShuTableDtowholesale=blLwShouShuTableFacade.findByPrimaryKey("2009-01", "duwholesale");
		LwShouShuTableDto lwShouShuTableDtoalldu=new LwShouShuTableDto();
		lwShouShuTableDtoalldu.setChunDianFei(lwShouShuTableDtocorporation.getChunDianFei()+lwShouShuTableDtowholesale.getChunDianFei());
		lwShouShuTableDtoalldu.setDianFeiTax(lwShouShuTableDtocorporation.getDianFeiTax()+lwShouShuTableDtowholesale.getDianFeiTax());
		lwShouShuTableDtoalldu.setSumDianFee(lwShouShuTableDtocorporation.getSumDianFee()+lwShouShuTableDtowholesale.getSumDianFee());
		lwShouShuTableDtoalldu.setDiffrentFei(lwShouShuTableDtocorporation.getDiffrentFei()+lwShouShuTableDtowholesale.getDiffrentFei());
		lwShouShuTableDtoalldu.setDiffrentFeiTax(lwShouShuTableDtocorporation.getDiffrentFeiTax()+lwShouShuTableDtowholesale.getDiffrentFeiTax());
		lwShouShuTableDtoalldu.setSanXia(lwShouShuTableDtocorporation.getSanXia()+lwShouShuTableDtowholesale.getSanXia());
		lwShouShuTableDtoalldu.setSanXiaTax(lwShouShuTableDtocorporation.getSanXiaTax()+lwShouShuTableDtowholesale.getSanXiaTax());
		lwShouShuTableDtoalldu.setDianJin(lwShouShuTableDtocorporation.getDianJin()+lwShouShuTableDtowholesale.getDianJin());
		lwShouShuTableDtoalldu.setDianJinTax(lwShouShuTableDtocorporation.getDianJinTax()+lwShouShuTableDtowholesale.getDianJinTax());
		lwShouShuTableDtoalldu.setJijin(lwShouShuTableDtocorporation.getJijin()+lwShouShuTableDtowholesale.getJijin());
		lwShouShuTableDtoalldu.setJinjinTax(lwShouShuTableDtocorporation.getJinjinTax()+lwShouShuTableDtowholesale.getJinjinTax());
		lwShouShuTableDtoalldu.setPower(lwShouShuTableDtocorporation.getPower()+lwShouShuTableDtowholesale.getPower());
		lwShouShuTableDtoalldu.setSumFee(lwShouShuTableDtocorporation.getSumFee()+lwShouShuTableDtowholesale.getSumFee());
		httpServletRequest.setAttribute("lwShouShuTableDtocorporation", lwShouShuTableDtocorporation);
		httpServletRequest.setAttribute("lwShouShuTableDtowholesale", lwShouShuTableDtowholesale);
		httpServletRequest.setAttribute("lwShouShuTableDtoalldu", lwShouShuTableDtoalldu);
		return actionMapping.findForward("yiyuecountprint");
		
		
	}

}
