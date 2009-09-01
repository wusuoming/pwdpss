package com.elongway.pss.ui.control.statistic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownGouDianFaxingFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.dto.custom.SalePriceDto;
import com.elongway.pss.dto.custom.TownSataDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownGouDianFaxingDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;

/**
 * 增加趸售比例分摊
 * 
 * @author goodluck
 * 
 */
public class UIPostTownStatFaxingAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		/** 0-声明变量 */	
		String forward = "";
		LwTownGouDianFaxingDto gouDianDto = null;
		BLLwTownGouDianFaxingFacade blLwTownGouDianFaxingFacade = new BLLwTownGouDianFaxingFacade();
		String statMonth = (String)httpServletRequest.getParameter("statMonth");
		
		String []comCode = httpServletRequest.getParameterValues("comCode");
		String []company = httpServletRequest.getParameterValues("company");
		String []sumPower = httpServletRequest.getParameterValues("sumPower");
		String []pureFee = httpServletRequest.getParameterValues("pureFee");
		String []feeTax = httpServletRequest.getParameterValues("feeTax");
		String []dianjin = httpServletRequest.getParameterValues("dianjin");
		String []dianjinTax = httpServletRequest.getParameterValues("dianjinTax");
		String []sanxia = httpServletRequest.getParameterValues("sanxia");
		String []sanxiaTax = httpServletRequest.getParameterValues("sanxiaTax");
		String []jijin = httpServletRequest.getParameterValues("jijin");
		String []jijinTax = httpServletRequest.getParameterValues("jijinTax");
		String []sumFee = httpServletRequest.getParameterValues("sumFee");
		
		blLwTownGouDianFaxingFacade.deleteByConditions("statMonth = '"+statMonth.substring(0, 7)+"'");
		
		for (int i = 0; i < sumFee.length; i++) {
			gouDianDto = new LwTownGouDianFaxingDto();
			gouDianDto.setStatMonth(statMonth.substring(0, 7));
			gouDianDto.setTownCode(comCode[i]);
			gouDianDto.setTownName(company[i]);
			gouDianDto.setPowerQuantity(Double.parseDouble(sumPower[i]));
			gouDianDto.setSumFee(Double.parseDouble(sumFee[i]));
			gouDianDto.setPureFee(Double.parseDouble(pureFee[i]));
			gouDianDto.setPowerFeeTax(Double.parseDouble(feeTax[i]));
			gouDianDto.setPureDianJin(Double.parseDouble(dianjin[i]));
			gouDianDto.setDianJinTax(Double.parseDouble(dianjinTax[i]));
			gouDianDto.setPureSanXia(Double.parseDouble(sanxia[i]));
			gouDianDto.setSanXiaTax(Double.parseDouble(sanxiaTax[i]));
			gouDianDto.setPureJiJin(Double.parseDouble(jijin[i]));
			gouDianDto.setJiJinTax(Double.parseDouble(jijinTax[i]));
			gouDianDto.setSumFee(Double.parseDouble(sumFee[i]));
			
			blLwTownGouDianFaxingFacade.insert(gouDianDto);					
		}
		forward = "success";
		
		return actionMapping.findForward(forward);

	}

}
