package com.elongway.pss.ui.control.price;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwSalePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePriceFacade;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.ui.view.price.UIPriceForm;
import com.elongway.pss.util.AppConst;

/**
 * 电价信息维护 Action <br>
 * 查询
 * 
 * @author 乔有良
 * @version 1.0 2008-10-09
 */
public class UIGetPriceAction extends DispatchAction {
	
	public static Map a = new HashMap();
	
	/**
	 * 查询电价
	 */
	public ActionForward salePriceQuery(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// -- 声明变量
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
		String tempPowerClass = null;
		String query = httpServletRequest.getParameter("query");
		this.initMap();
		// -- 查找销售电价表
		Collection<LwSalePriceDto> salePriceList = bLwSalePriceFacade
				.findByConditions(" 1=1 ");
		Collection<LwSalePriceDto> industryPriceList = bLwSalePriceFacade
		.findByConditions("  PowerClass = '7' ");
		// -- 查找基础代码表取得电价分类基础代码
		Collection<LwDcodeDto> codeList = bLwDcodeFacade
				.findByConditions("codetype = 'PowerClass' Order By codeename asc ,codecode Asc ");
		// -- 得到材料类型
		Collection<LwDcodeDto> materialList = bLwDcodeFacade
				.findByConditions("codetype = 'MaterialType' Order By codecode Asc ");
		Collection<UIPriceForm> priceFormList = new ArrayList<UIPriceForm>();
		UIPriceForm form = null;
		for (Iterator<LwDcodeDto> iterator = codeList.iterator(); iterator
				.hasNext();) {
			lwDcodeDto = iterator.next();
			form = new UIPriceForm();
			// 基础代码表中用电分类代码
			codePowerClass = lwDcodeDto.getCodeCode();
			form.setPowerClassName(lwDcodeDto.getCodeCName());
			form.setPowerClasscode(codePowerClass);
			if(AppConst.POWERCLASS_7.equals(codePowerClass)||AppConst.POWERCLASS_8.equals(codePowerClass)||AppConst.POWERCLASS_9.equals(codePowerClass)||AppConst.POWERCLASS_10.equals(codePowerClass)){
				tempPowerClass = (String)a.get(codePowerClass);
			}
			
			for (Iterator iterator2 = salePriceList.iterator(); iterator2
					.hasNext();) {
				lwSalePriceDto = (LwSalePriceDto) iterator2.next();
				// 电价表中的用电分类代码
				pricePowerClass = lwSalePriceDto.getPowerClass();
				// 电价分类 3-普通电价，4-基本电价
				priceCategroy = lwSalePriceDto.getPriceCategory();
				// 终止电压
				voltageEnd = lwSalePriceDto.getVoltageEnd();
				// 起始电压
				voltageBegin = lwSalePriceDto.getVoltageBegin();
				// 原料类型
				materialsType = lwSalePriceDto.getMaterialsType();
				// 电价
				price = new Double(lwSalePriceDto.getPrice()).toString();
				// 先判断大工业电价

				// 按照用电分类取电价
				if (!("7".equals(codePowerClass) || "8".equals(codePowerClass)
						|| "9".equals(codePowerClass) || "10"
						.equals(codePowerClass))) {

					if (codePowerClass.equals(pricePowerClass)) {
						// 电价分类
						if ("3".equals(priceCategroy)) {
							// 不满1KV
							if (1 == voltageEnd) {
								form.setKV1(price);
								// 1-10KV
							} else if (10 == voltageEnd) {
								form.setKV10(price);
								// 35-110KV以下
							} else if (110 == voltageEnd) {
								form.setKV110(price);
								// 110-220KV及以下
							} else if (220 == voltageEnd) {
								form.setKv220(price);
								// 220KV及以上
							} else if (220 == voltageBegin) {
								form.setKv220More(price);
							}
						} else if ("4".equals(priceCategroy)) {
							// 最大需量
							if (1 == voltageBegin) {
								form.setMaxXuLiang(price);
								// 变压器容量
							} else if (2 == voltageBegin) {
								form.setRongLiang(price);
							}
						}

					}
				} //not industry
				else{
					if (tempPowerClass.equals(materialsType)) {
						// 电价分类
						if ("3".equals(priceCategroy)) {
							// 不满1KV
							if (1 == voltageEnd) {
								form.setKV1(price);
								// 1-10KV
							} else if (10 == voltageEnd) {
								form.setKV10(price);
								// 35-110KV以下
							} else if (110 == voltageEnd) {
								form.setKV110(price);
								// 110-220KV及以下
							} else if (220 == voltageEnd) {
								form.setKv220(price);
								// 220KV及以上
							} else if (220 == voltageBegin) {
								form.setKv220More(price);
							}
						} else if ("4".equals(priceCategroy)) {
							// 最大需量
							if (1 == voltageBegin) {
								form.setMaxXuLiang(price);
								// 变压器容量
							} else if (2 == voltageBegin) {
								form.setRongLiang(price);
							}
						}

					}
				}
			}
			
			priceFormList.add(form);
		}
		httpServletRequest.setAttribute("priceFormList", priceFormList);
		httpServletRequest.setAttribute("query", query);
		return (actionMapping.findForward("firstSuccess"));
	}

	/**
	 * 查询电价
	 */
	public ActionForward wholeSalePriceQuery(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		// -- 声明变量
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
		// -- 查找趸售电价表
		Collection<LwSalePriceDto> salePriceList = blLwWholeSalePriceFacade
				.findByConditions(" 1=1 ");
		// -- 查找基础代码表取得电价分类基础代码
		Collection<LwDcodeDto> codeList = bLwDcodeFacade
				.findByConditions("  codetype = 'PowerClass' and codecode <> '7' And codecode <> '8'  And codecode <> '9'  And codecode <> '10'  Order By codecode Asc ");
		Collection<UIPriceForm> priceFormList = new ArrayList<UIPriceForm>();
		UIPriceForm form = null;
		for (Iterator<LwDcodeDto> iterator = codeList.iterator(); iterator
				.hasNext();) {
			lwDcodeDto = iterator.next();
			form = new UIPriceForm();
			// 基础代码表中用电分类代码
			codePowerClass = lwDcodeDto.getCodeCode();
			form.setPowerClassName(lwDcodeDto.getCodeCName());
			for (Iterator iterator2 = salePriceList.iterator(); iterator2
					.hasNext();) {
				lwWholeSalePriceDto = (LwWholeSalePriceDto) iterator2.next();
				// 电价表中的用电分类代码
				pricePowerClass = lwWholeSalePriceDto.getPowerClass();
				// 销售区域
				saleArea = lwWholeSalePriceDto.getSaleArea();
				// 终止电压
				voltageEnd = lwWholeSalePriceDto.getVoltageEnd();
				// 起始电压
				voltageBegin = lwWholeSalePriceDto.getVoltageBegin();
				// 电价
				price = new Double(lwWholeSalePriceDto.getPrice()).toString();
				// 按照用电分类取电价
				if (codePowerClass.equals(pricePowerClass)) {
					// 县级趸售
					if ("1".equals(saleArea)) {
						// 1-10KV
						if (10 == voltageEnd) {
							form.setKV10Xian(price);
							// 35KV以上
						} else if (35 == voltageBegin) {
							form.setKV35MoreXian(price);
						}
					} else // 县级以下趸售
					if ("2".equals(saleArea)) {
						// 1-10KV
						if (10 == voltageEnd) {
							form.setKV10Xia(price);
							// 35KV以上
						} else if (35 == voltageBegin) {
							form.setKV35MoreXia(price);
						}
					}

				}
			}
			priceFormList.add(form);
		}
		httpServletRequest.setAttribute("priceFormList", priceFormList);
		httpServletRequest.setAttribute("query", query);
		return (actionMapping.findForward("wholeSuccess"));
	}
	public  void  initMap(){
		a.put(AppConst.POWERCLASS_7, AppConst.METERIALS_TYPE_0);
		a.put(AppConst.POWERCLASS_8, AppConst.METERIALS_TYPE_1);
		a.put(AppConst.POWERCLASS_9, AppConst.METERIALS_TYPE_2);
		a.put(AppConst.POWERCLASS_10, AppConst.METERIALS_TYPE_3);
		
	}
}
