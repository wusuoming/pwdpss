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
import com.elongway.pss.bl.facade.BLLwWholeSalePriceFacade;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.elongway.pss.ui.view.price.UIPriceForm;
import com.elongway.pss.util.AppConst;
import com.sinosoft.sysframework.common.datatype.PageRecord;

/**
 * �����Ϣά�� Action <br>
 * ��ѯ
 * 
 * @author ������
 * @version 1.0 2008-10-09
 */
public class UIGetPriceAction extends DispatchAction {
	
	
	/**
	 * ��ѯ���
	 */
	public ActionForward salePriceQuery(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// -- ��������
		BLLwSalePriceFacade bLwSalePriceFacade = new BLLwSalePriceFacade();
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		String codePowerClass = null;
		String pricePowerClass = null;
		LwSalePriceDto lwSalePriceDto = null;
		LwDcodeDto lwDcodeDto = null;
		String priceCategroy = null;
		double voltageBegin = 0D;
		double voltageEnd = 0D;
		String materialsType = null;
		String price = "";
		String query = httpServletRequest.getParameter("query");
		// -- �������۵�۱�
		Collection <LwSalePriceDto>salePriceList = bLwSalePriceFacade.findByConditions(" 1=1 ");
		// -- ���һ��������ȡ�õ�۷����������
		Collection<LwDcodeDto> codeList = bLwDcodeFacade.findByConditions("codetype = 'PowerClass' Order By codeename Desc ,codecode Asc ");
		// -- �õ���������
		Collection<LwDcodeDto> materialList = bLwDcodeFacade.findByConditions("codetype = 'MaterialType' Order By codecode Asc ");
		Collection <UIPriceForm>priceFormList = new ArrayList<UIPriceForm>();
		UIPriceForm form = null;
		for (Iterator<LwDcodeDto> iterator = codeList.iterator(); iterator.hasNext();) {
			 lwDcodeDto = iterator.next();
			 form = new UIPriceForm();
			// ������������õ�������
			 codePowerClass = lwDcodeDto.getCodeCode();			
			 form.setPowerClassName(lwDcodeDto.getCodeCName());
			 form.setPowerClasscode(codePowerClass);
			for (Iterator iterator2 = salePriceList.iterator(); iterator2.hasNext();) {
				 lwSalePriceDto = (LwSalePriceDto) iterator2.next();
				 // ��۱��е��õ�������
				 pricePowerClass = lwSalePriceDto.getPowerClass();
				 // ��۷��� 3-��ͨ��ۣ�4-�������
				 priceCategroy = lwSalePriceDto.getPriceCategory();
				 // ��ֹ��ѹ
				 voltageEnd = lwSalePriceDto.getVoltageEnd();
				 // ��ʼ��ѹ
				 voltageBegin = lwSalePriceDto.getVoltageBegin();
				 // ԭ������
				 materialsType = lwSalePriceDto.getMaterialsType();
				 // ���
				 price = new Double(lwSalePriceDto.getPrice()).toString();		
				 // ���жϴ�ҵ���
				 if(AppConst.INDUSTRY_PRICE_CODE.equals(pricePowerClass)){
					 if()
				 }else{
				 // �����õ����ȡ���
				 if(codePowerClass.equals(pricePowerClass)){	
					 // ��۷���
					if ("3".equals(priceCategroy)) {
						// ����1KV
						if(1==voltageEnd){
							form.setKV1(price);
						// 1-10KV
						}else if(10==voltageEnd){
							form.setKV10(price);
						// 35-110KV����
						}else if(110==voltageEnd){
							form.setKV110(price);
						// 110-220KV������
						}else if(220==voltageEnd){
							form.setKv220(price);
						// 220KV������
						}else if(220==voltageBegin){
							form.setKv220More(price);
						}
					}else  if ("4".equals(priceCategroy)) {
						// �������
						if(1==voltageBegin){
							form.setMaxXuLiang(price);
						// ��ѹ������
						}else if(2==voltageBegin){
							form.setRongLiang(price);
						}
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
	/**
	 * ��ѯ���
	 */
	public ActionForward wholeSalePriceQuery(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		
		// -- ��������
		BLLwWholeSalePriceFacade blLwWholeSalePriceFacade = new BLLwWholeSalePriceFacade();
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		String codePowerClass = null;
		String pricePowerClass = null;
		LwWholeSalePriceDto lwWholeSalePriceDto = null;
		LwDcodeDto lwDcodeDto = null;
		String saleArea = null;
		double voltageBegin = 0D;
		double voltageEnd = 0D;
		String price = "";
		String query = httpServletRequest.getParameter("query");
		// -- �������۵�۱�
		Collection <LwSalePriceDto>salePriceList = blLwWholeSalePriceFacade.findByConditions(" 1=1 ");
		// -- ���һ��������ȡ�õ�۷����������
		Collection<LwDcodeDto> codeList = bLwDcodeFacade.findByConditions("  codetype = 'PowerClass' and codecode <> '7' And codecode <> '8'  And codecode <> '9'  And codecode <> '10'  Order By codecode Asc ");
		Collection <UIPriceForm>priceFormList = new ArrayList<UIPriceForm>();
		UIPriceForm form = null;
		for (Iterator<LwDcodeDto> iterator = codeList.iterator(); iterator.hasNext();) {
			 lwDcodeDto = iterator.next();
			 form = new UIPriceForm();
			// ������������õ�������
			 codePowerClass = lwDcodeDto.getCodeCode();			
			 form.setPowerClassName(lwDcodeDto.getCodeCName());
			for (Iterator iterator2 = salePriceList.iterator(); iterator2.hasNext();) {
				 lwWholeSalePriceDto = (LwWholeSalePriceDto) iterator2.next();
				 // ��۱��е��õ�������
				 pricePowerClass = lwWholeSalePriceDto.getPowerClass();
				 // ��������
				 saleArea = lwWholeSalePriceDto.getSaleArea();
				 // ��ֹ��ѹ
				 voltageEnd = lwWholeSalePriceDto.getVoltageEnd();
				 // ��ʼ��ѹ
				 voltageBegin = lwWholeSalePriceDto.getVoltageBegin();
				 // ���
				 price = new Double(lwWholeSalePriceDto.getPrice()).toString();
				 // �����õ����ȡ���
				 if(codePowerClass.equals(pricePowerClass)){						 
					 // �ؼ�����
					if ("1".equals(saleArea)) {						
						// 1-10KV
						if(10==voltageEnd){
							form.setKV10Xian(price);
						// 35KV����
						}else if(35==voltageBegin){
							form.setKV35MoreXian(price);
						}						
					}else // �ؼ���������
						if ("2".equals(saleArea)) {
							// 1-10KV
							if(10==voltageEnd){
								form.setKV10Xia(price);
							// 35KV����
							}else if(35==voltageBegin){
								form.setKV35MoreXia(price);
							}
				 }
				
			}
		}
			priceFormList.add(form);
		}
		httpServletRequest.setAttribute("priceFormList", priceFormList);
		httpServletRequest.setAttribute("query",query);
		return (actionMapping.findForward("wholeSuccess"));
	}
}
