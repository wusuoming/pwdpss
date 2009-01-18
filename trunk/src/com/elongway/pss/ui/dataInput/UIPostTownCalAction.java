package com.elongway.pss.ui.dataInput;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.dto.domain.LwindicatorDto;
import com.elongway.pss.ui.view.datainput.UITownCalForm;


/**
 * 直供乡批量计算电费 Action <br>
 * 计算、保存
 * 
 * @author 乔有良 add
 * @version 1.0 2008-10-25
 */
public class UIPostTownCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		

		/***********************************************************************
		 *    【0 -- 声明变量】
		 **********************************************************************/
		UITownCalForm uiTownCalForm = new UITownCalForm();
		BLLwTownPriceSummaryFacade bLwTownPriceSummaryFacade  = new BLLwTownPriceSummaryFacade();
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwindicatorFacade bLwindicatorFacade = new BLLwindicatorFacade();
		LwindicatorDto lwindicatorDto = new LwindicatorDto();
		BLLwLineAmmeterFacade blLwLineAmmeterFacade = new BLLwLineAmmeterFacade();
		/***********************************************************************
		 *    【1 -- 取得表单的值】
		 **********************************************************************/
		// 用电用户
		String userNo = httpServletRequest.getParameter("userNo");
		// 线路代码
		String lineCode = httpServletRequest.getParameter("lineCode");
		// 有功指针
		String thisWorkNum = httpServletRequest.getParameter("thisWorkNum");
		// 无功指针
		String thisIdleNum = httpServletRequest.getParameter("thisIdleNum");
		// 录入日期
		String inputDate = httpServletRequest.getParameter("inputDate");
		// 第一次查询
		String firstquery = httpServletRequest.getParameter("firstquery");
		// 倍率
		String rate = httpServletRequest.getParameter("rate");
		
		if (thisIdleNum == null||"".equals(thisIdleNum)) {
			thisIdleNum = "0";
		}
		/***********************************************************************
		 *    【2 -- 计算电费】
		 **********************************************************************/
		// 计算电费
//		LwTownPriceSummaryDto lwTownPriceSummaryDto = blCalPowerFeeCustomFacade.calTownFee(thisWorkNum, thisIdleNum, lineCode, userNo, inputDate);
		
		/***********************************************************************
		 *    【3 -- 保存】
		 **********************************************************************/
//		Collection collection = blLwLineAmmeterFacade.findByConditions(" lineCode = '"+lineCode+"' and validstatus = '1'");
//		LwLineAmmeterDto lwLineAmmeterDto = null;
//		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
//			lwLineAmmeterDto = (LwLineAmmeterDto) iterator.next();			
//		}
//		String ammeterNo = lwLineAmmeterDto.getAmmeterNo();
		
		
		// 保存当月有功指针数
//		lwindicatorDto.setAmmeterNo(ammeterNo);
//		lwindicatorDto.setInputDate(inputDate);
//		lwindicatorDto.setLineCode(lineCode);
//		lwindicatorDto.setRate(Double.parseDouble(rate));
//		lwindicatorDto.setStatMonth(inputDate);
//		lwindicatorDto.setThisIdleNum(Integer.parseInt(thisIdleNum));
//		
//		bLwindicatorFacade.insert(lwindicatorDto);
		// 避免重复计算，先删除后插入
//		bLwTownPriceSummaryFacade.deleteAndInsert(lwTownPriceSummaryDto);
//		
//		/***********************************************************************
//		 *    【4 -- 为页面展现赋值】
//		 **********************************************************************/
//		uiTownCalForm.setUserNo(userNo);
//		uiTownCalForm.setLineCode(lineCode);
//		uiTownCalForm.setThisWorkNum(thisWorkNum);
//		uiTownCalForm.setThisIdleNum(thisIdleNum);
//		uiTownCalForm.setInputDate(inputDate);
//		
//		httpServletRequest.setAttribute("lwTownPriceSummaryDto", lwTownPriceSummaryDto);
//		httpServletRequest.setAttribute("uiTownCalForm", uiTownCalForm);
		return actionMapping.findForward("Success");
	}
	
}
