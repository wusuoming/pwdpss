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
import com.sinosoft.sysframework.exceptionlog.UserException;
/**
 * 保存趸售比例分摊的修改
 * 
 * @author qiaoyouliang
 *
 */
public class UIModifySaveLWSaleProrateAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		BLLwWholeSalePurePriceFacade blLwWholeSalePurePriceFacade = new BLLwWholeSalePurePriceFacade();
		BLLwWholeSaleProrateFacade saleProrate = new BLLwWholeSaleProrateFacade();
		LwWholeSaleProrateDto lwWholeSaleProrateDto = null;
		
		String []comCode = httpServletRequest.getParameterValues("comCode");
	 	String []voltLevel = httpServletRequest.getParameterValues("voltLevel");
		String []people = httpServletRequest.getParameterValues("people");
		String []notPeople = httpServletRequest.getParameterValues("notPeople");
		String []farm = httpServletRequest.getParameterValues("farm");
		String []produce = httpServletRequest.getParameterValues("produce");
		String []business = httpServletRequest.getParameterValues("business");
		String []industry = httpServletRequest.getParameterValues("industry");
		
		for (int i = 0; i < comCode.length; i++) {
			lwWholeSaleProrateDto = saleProrate.findByPrimaryKey(comCode[i], voltLevel[i]);
			lwWholeSaleProrateDto.setBusiness(Double.parseDouble(business[i]));
			lwWholeSaleProrateDto.setFarm(Double.parseDouble(farm[i]));
			lwWholeSaleProrateDto.setIndustry(Double.parseDouble(industry[i]));
			lwWholeSaleProrateDto.setNotPeople(Double.parseDouble(notPeople[i]));
			lwWholeSaleProrateDto.setPeople(Double.parseDouble(people[i]));
			lwWholeSaleProrateDto.setProduce(Double.parseDouble(produce[i]));
			saleProrate.update(lwWholeSaleProrateDto);
		}
		Collection saleProrateList = saleProrate.findByConditions("1=1");
		
		Collection comList = new BLLwDcodeFacade().findByConditions(" codetype = 'WholeSaleCom'");
		Collection voltList = new BLLwDcodeFacade().findByConditions(" codetype = 'WholeSaleLevel'");
		for (Iterator iterator = saleProrateList.iterator(); iterator.hasNext();) {
			LwWholeSaleProrateDto dto = (LwWholeSaleProrateDto) iterator.next();
			String comCode1 = dto.getComCode();
			String voltCode = dto.getVoltLevel();
			dto.setBusiness(dto.getBusiness());
			dto.setIndustry(dto.getIndustry());
			dto.setPeople(dto.getPeople());
			dto.setProduce(dto.getProduce());
			dto.setNotPeople(dto.getNotPeople());
			dto.setFarm(dto.getFarm());
			for (Iterator iterator2 = comList.iterator(); iterator2.hasNext();) {
				LwDcodeDto dto2 = (LwDcodeDto) iterator2.next();
				String comCode2 = dto2.getCodeCode();
				if(comCode1.equals(comCode2)){
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

