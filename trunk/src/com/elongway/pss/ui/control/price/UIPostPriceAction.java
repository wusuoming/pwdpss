package com.elongway.pss.ui.control.price;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sun.rmi.transport.proxy.HttpReceiveSocket;

import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwSalePriceFacade;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.elongway.pss.ui.view.price.UIPriceForm;
import com.sinosoft.sysframework.common.datatype.PageRecord;

/**
 * 电价信息维护 Action <br>
 * 查询
 * 
 * @author 乔有良
 * @version 1.0 2008-10-09
 */
public class UIPostPriceAction extends DispatchAction {
	/**
	 * 查询电价
	 */
	public ActionForward salePriceUpdate(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		BLLwSalePriceFacade bLwSalePriceFacade = new BLLwSalePriceFacade();
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		Collection<LwSalePriceDto> salePriceList = null;
		String codePowerClass = null;
		String pricePowerClass = null;
		LwSalePriceDto lwSalePriceDto2 = null;
		LwSalePriceDto lwSalePriceDto = null;
		LwDcodeDto lwDcodeDto = null;
		String priceCategroy = null;
		double voltageBegin = 0D;
		double voltageEnd = 0D;
		String materialsType = null;
		String price = "";
		// 电价分类
		String []powerClassCode = httpServletRequest.getParameterValues("powerClassCode");
		// 不满1KV 
		String []kv1  = httpServletRequest.getParameterValues("kv1"); 
		// 1-10KV 
	    String []kv10  =httpServletRequest.getParameterValues("kv10");         
	    // 35-110KV以下
	    String []kv110 =httpServletRequest.getParameterValues("kv110");      
	    // 110-220KV及以下
	    String []kv220 =httpServletRequest.getParameterValues("kv220");        
	    // 220KV及以上
	    String []kvMore220 =httpServletRequest.getParameterValues("kvMore220");
	    // 最大需量
	    String []xuliang =httpServletRequest.getParameterValues("xuliang");    
	    // 变压器容量
	    String []rongliang =httpServletRequest.getParameterValues("rongliang");
	    String query = httpServletRequest.getParameter("query");
	    UIPriceForm form =  new UIPriceForm();
	    for (int i = 0; i < powerClassCode.length; i++) {
			pricePowerClass = powerClassCode[i];
			salePriceList = bLwSalePriceFacade.findByConditions("powerclass = '"+pricePowerClass+"'");
			Iterator iterator = salePriceList.iterator();
			while ( iterator.hasNext()) {
				 lwSalePriceDto2 = (LwSalePriceDto) iterator
						.next();
				priceCategroy = lwSalePriceDto2.getPriceCategory();
				voltageEnd = lwSalePriceDto2.getVoltageEnd();
				voltageBegin = lwSalePriceDto2.getVoltageBegin();
				 price = new Double(lwSalePriceDto2.getPrice()).toString();
				if ("3".equals(priceCategroy)) {
					if(1==voltageEnd){
						form.setKV1(price);
						lwSalePriceDto2.setPrice(Double.parseDouble(price));
					}else if(10==voltageEnd){
						form.setKV10(price);
						lwSalePriceDto2.setPrice(Double.parseDouble(price));
					}else if(110==voltageEnd){
						form.setKV110(price);
						lwSalePriceDto2.setPrice(Double.parseDouble(price));
					}else if(220==voltageEnd){
						form.setKv220(price);
						lwSalePriceDto2.setPrice(Double.parseDouble(price));
					}else if(220==voltageBegin){
						form.setKv220More(price);
						lwSalePriceDto2.setPrice(Double.parseDouble(price));
					}
				}else  if ("4".equals(priceCategroy)) {
					if(1==voltageBegin){
						form.setMaxXuLiang(price);
						lwSalePriceDto2.setPrice(Double.parseDouble(price));
					}else if(0==voltageEnd){
						form.setRongLiang(price);
						lwSalePriceDto2.setPrice(Double.parseDouble(price));
					}
			 }
			}
			bLwSalePriceFacade.update(lwSalePriceDto2);
		}
		Collection<LwDcodeDto> codeList = bLwDcodeFacade.findByConditions("codetype = 'PowerClass' Order By codeename Desc ,codecode Asc");
		Collection <UIPriceForm>priceFormList = new ArrayList<UIPriceForm>();
		for (Iterator<LwDcodeDto> iterator = codeList.iterator(); iterator.hasNext();) {
			 lwDcodeDto = iterator.next();
			 form = new UIPriceForm();
			 codePowerClass = lwDcodeDto.getCodeCode();			
			 form.setPowerClassName(lwDcodeDto.getCodeCName());
			for (Iterator iterator2 = salePriceList.iterator(); iterator2.hasNext();) {
				 lwSalePriceDto = (LwSalePriceDto) iterator2.next();
				 pricePowerClass = lwSalePriceDto.getPowerClass();
				 priceCategroy = lwSalePriceDto.getPriceCategory();
				 voltageEnd = lwSalePriceDto.getVoltageEnd();
				 voltageBegin = lwSalePriceDto.getVoltageBegin();
				 materialsType = lwSalePriceDto.getMaterialsType();
				 price = new Double(lwSalePriceDto.getPrice()).toString();
				 if(codePowerClass.equals(pricePowerClass)){	
					if ("3".equals(priceCategroy)) {
						if(1==voltageEnd){
							form.setKV1(price);
						}else if(10==voltageEnd){
							form.setKV10(price);
						}else if(110==voltageEnd){
							form.setKV110(price);
						}else if(220==voltageEnd){
							form.setKv220(price);
						}else if(220==voltageBegin){
							form.setKv220More(price);
						}
					}else  if ("4".equals(priceCategroy)) {
						if(1==voltageBegin){
							form.setMaxXuLiang(price);
						}else if(0==voltageEnd){
							form.setRongLiang(price);
						}
				 }
				
			}
		}
			priceFormList.add(form);
		}
		httpServletRequest.setAttribute("priceFormList", priceFormList);
		httpServletRequest.setAttribute("query",query);
		return (actionMapping.findForward("firstSuccess"));
	}
}
