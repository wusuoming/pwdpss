package com.elongway.pss.ui.dataInput;

import java.util.ArrayList;
import java.util.Collection;
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
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.ui.view.datainput.UITownCalForm;
import com.elongway.pss.ui.view.price.UITownBill;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;


/**
 * 直供乡按乡统计打印
 * 
 * @author 乔有良 add
 * @version 1.0 2008-10-16
 */
public class UIPostTownBillPrintAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		

		/***********************************************************************
		 *    【0 -- 声明变量】
		 **********************************************************************/
		StringBuffer condition = null;
		BLLwTownPriceSummaryFacade bLwTownPriceSummaryFacade  = new BLLwTownPriceSummaryFacade();
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwTownPriceSummaryFacade blLwTownPriceSummaryFacade = new BLLwTownPriceSummaryFacade();
		LwTownPriceSummaryDto lwTownPriceSummaryDto = new LwTownPriceSummaryDto();
		BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
		UITownBill uiTownBill = null;
		String townCode = null;
		String townName = null;
		/***********************************************************************
		 *    【1 -- 取得表单的值】
		 **********************************************************************/
		// 统计年月
		String statMonth = PowerFeeCal.getCurrentBillMonth();
		// 
		Collection<LwDcodeDto> collection = blLwDcodeFacade.findByConditions(" codetype = 'TownCode'");
		Collection<UITownBill> billList = new ArrayList<UITownBill>();
		double sumQuantity = 0.0;
		double sumFee  = 0.0;
		/***********************************************************************
		 *    【2 -- 遍历所有的乡】
		 **********************************************************************/
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
			townCode = lwDcodeDto.getCodeCode();
			townName = lwDcodeDto.getCodeCName();
			condition = new StringBuffer();
			// -- 组织条件，查询该乡的所有用户
			Collection <LwPowerUserDto>userList = blLwPowerUserFacade.findByConditions(" townCode = '"+townCode+"'");	
//			if(userList!=null&&userList.size()!=0){
			condition.append(" 1=1 ").append(getUserCondition(userList)).append(" and statmonth = '").append(statMonth).append("'");
			// -- 查询已经结算的该乡的所有的用户
			Collection townPriceList = blLwTownPriceSummaryFacade.findByConditions(condition.toString());	
			
			lwTownPriceSummaryDto = blCalPowerFeeCustomFacade.statTownFee(townPriceList, statMonth,townCode);
			uiTownBill = new UITownBill();
			uiTownBill.setTownCode(townCode);
			uiTownBill.setTownName(townName);
			uiTownBill.setPowerQuantity(new Long(Math.round(lwTownPriceSummaryDto.getSumQuantity())).toString());
			uiTownBill.setPowerFee(new Double(PowerFeeCal.getValue(lwTownPriceSummaryDto.getElectricFee(), AppConst.TWO_DOT_FLAG)).toString());
			uiTownBill.setBillDate(statMonth);
			sumQuantity += Math.round(lwTownPriceSummaryDto.getSumQuantity());
			sumFee +=PowerFeeCal.getValue(lwTownPriceSummaryDto.getElectricFee(), AppConst.TWO_DOT_FLAG);
			billList.add(uiTownBill);
			
		//	}
		}
		uiTownBill = new UITownBill();
		uiTownBill.setBillDate(statMonth);
		uiTownBill.setTownName("合计");
		uiTownBill.setPowerFee(new Double(PowerFeeCal.getValue(sumFee, AppConst.TWO_DOT_FLAG)).toString());
		uiTownBill.setPowerQuantity(new Double(sumQuantity).toString());
		billList.add(uiTownBill);
		
		/***********************************************************************
		 *    【3 -- 为页面展现赋值】
		 **********************************************************************/		
		httpServletRequest.setAttribute("billList", billList);
		httpServletRequest.setAttribute("statMonth", statMonth);
		return actionMapping.findForward("Success");
	}
	
		/**
		 * 组织取得电价分类的条件。
		 * @param collection
		 * @return
		 */	
		public String getUserCondition(Collection <LwPowerUserDto>collection){
			StringBuffer buffer = new StringBuffer();
			if(collection ==null||collection.size()==0) {
				buffer.append(" and 1=0 ");
			}else{
			buffer.append(" and (");
			buffer.append(" 1=0 ");
			for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
				LwPowerUserDto lwPowerUserDto = (LwPowerUserDto) iterator.next();	
				buffer.append(" or userNo = '").append(lwPowerUserDto.getUserNo()).append("'");
				
			}
			buffer.append(")");
			}
			return buffer.toString();
		}
		public static void main(String []args){
			UIPostTownBillPrintAction ui = new UIPostTownBillPrintAction();
			Collection a = new ArrayList();
			LwPowerUserDto lwPowerUserDto1 = new LwPowerUserDto();
			LwPowerUserDto lwPowerUserDto2 = new LwPowerUserDto();
			lwPowerUserDto1.setUserNo("00088201");
			lwPowerUserDto2.setUserNo("25267181");
			a.add(lwPowerUserDto1);
			a.add(lwPowerUserDto2);
			System.out.println(ui.getUserCondition(a));
		}
	
	
}
