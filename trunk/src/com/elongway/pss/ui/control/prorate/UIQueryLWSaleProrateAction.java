package com.elongway.pss.ui.control.prorate;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;
/**
 * 查询趸售比例分摊
 * 
 * @author goodluck
 *
 */
public class UIQueryLWSaleProrateAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		BLLwWholeSalePurePriceFacade blLwWholeSalePurePriceFacade = new BLLwWholeSalePurePriceFacade();
		BLLwWholeSaleProrateFacade saleProrate = new BLLwWholeSaleProrateFacade();
		Collection saleProrateList = saleProrate.findByConditions("1=1 order by comcode,voltlevel");
	
		Collection comList = new BLLwDcodeFacade().findByConditions(" codetype = 'WholeSaleCom'");
		Collection voltList = new BLLwDcodeFacade().findByConditions(" codetype = 'WholeSaleLevel'");
		for (Iterator iterator = saleProrateList.iterator(); iterator.hasNext();) {
			LwWholeSaleProrateDto dto = (LwWholeSaleProrateDto) iterator.next();
			String comCode = dto.getComCode();
			String voltCode = dto.getVoltLevel();
			dto.setBusiness(dto.getBusiness());
			dto.setIndustry(dto.getIndustry());
			dto.setPeople(dto.getPeople());
			dto.setProduce(dto.getProduce());
			dto.setNotPeople(dto.getNotPeople());
			dto.setFarm(dto.getFarm());
			for (Iterator iterator2 = comList.iterator(); iterator2.hasNext();) {
				LwDcodeDto dto2 = (LwDcodeDto) iterator2.next();
				if(comCode.equals(dto2.getCodeCode())){
					dto.setCompanyName(dto2.getCodeCName());
				}
				
			}
			for (Iterator iterator3 = voltList.iterator(); iterator3.hasNext();) {
				LwDcodeDto dto2 = (LwDcodeDto) iterator3.next();
				if(voltCode.equals(dto2.getCodeCode())){
					dto.setVoltName(dto2.getCodeCName());
				}
				
			}
		}
		httpServletRequest.setAttribute("saleProrateList", saleProrateList);
		return actionMapping.findForward("queryWholeProrateList");
	}
}

