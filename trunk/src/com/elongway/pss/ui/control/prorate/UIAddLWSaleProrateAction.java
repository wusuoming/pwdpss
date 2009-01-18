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
import com.sinosoft.sysframework.exceptionlog.UserException;
/**
 * 增加趸售比例分摊
 * @author goodluck
 *
 */
public class UIAddLWSaleProrateAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		/** 0-声明变量 */
		LwWholeSaleProrateDto lwWholeSaleProrateDto = new LwWholeSaleProrateDto();
		BLLwWholeSaleProrateFacade saleProrate = new BLLwWholeSaleProrateFacade();
		/** 1-组织DTO */
		genDto(httpServletRequest, lwWholeSaleProrateDto);
		
		/** 2-插入 */		
		saleProrate.insert(lwWholeSaleProrateDto);
		Collection saleProrateList = saleProrate.findByConditions("1=1");
		httpServletRequest.setAttribute("saleProrateList", saleProrateList);
		return actionMapping.findForward("queryWholeProrateList");

	}
	public void genDto(HttpServletRequest httpServletRequest,LwWholeSaleProrateDto lwWholeSaleProrateDto) throws Exception{
		String comCode = httpServletRequest.getParameter("comCode");
		String voltLevel = httpServletRequest.getParameter("voltLevel");
		String people = httpServletRequest.getParameter("people");
		String notPeople = httpServletRequest.getParameter("notPeople");
		String farm = httpServletRequest.getParameter("farm");
		String produce = httpServletRequest.getParameter("produce");
		String business = httpServletRequest.getParameter("business");
		String industry = httpServletRequest.getParameter("industry");
		
		BLLwWholeSaleProrateFacade bllWholeSaleProrateFacade = new BLLwWholeSaleProrateFacade();
		LwWholeSaleProrateDto o1 = bllWholeSaleProrateFacade.findByPrimaryKey(comCode, voltLevel);
		if(o1!=null){
			throw new UserException(-98, -1101, this.getClass().getName(),"该公司已经配置了相应电压等级的比例分摊！");
		}
		
		if(people==null||people.equals("")){
			people = AppConst.ZERO_VALUE;
		}
		if(notPeople==null||notPeople.equals("")){
			notPeople = AppConst.ZERO_VALUE;
		}
		if(farm==null||farm.equals("")){
			farm = AppConst.ZERO_VALUE;
		}
		if(produce==null||produce.equals("")){
			produce = AppConst.ZERO_VALUE;
		}
		if(business==null||business.equals("")){
			business = AppConst.ZERO_VALUE;
		}
		if(industry==null||industry.equals("")){
			industry = AppConst.ZERO_VALUE;
		}
		
		BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
		Collection collection = blLwDcodeFacade.findByConditions(" codecode='WholeSaleCom'");
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwDcodeDto o = (LwDcodeDto) iterator.next();
			if(o.equals(comCode))
				lwWholeSaleProrateDto.setCompanyName(o.getCodeCName());
		}
		
		lwWholeSaleProrateDto.setComCode(comCode);
		lwWholeSaleProrateDto.setVoltLevel(voltLevel);
		lwWholeSaleProrateDto.setPeople(Double.parseDouble(people));
		lwWholeSaleProrateDto.setNotPeople(Double.parseDouble(notPeople));
		lwWholeSaleProrateDto.setFarm(Double.parseDouble(farm));
		lwWholeSaleProrateDto.setProduce(Double.parseDouble(produce));
		lwWholeSaleProrateDto.setBusiness(Double.parseDouble(business));
		lwWholeSaleProrateDto.setIndustry(Double.parseDouble(industry));
	}
}
