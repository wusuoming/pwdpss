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
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.ui.view.datainput.UITownCalForm;


/**
 * 直供乡按乡统计打印 Action <br>
 * 计算、保存
 * 
 * @author 乔有良 add
 * @version 1.0 2008-10-16
 */
public class UIPostTownStatPringAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		

		/***********************************************************************
		 *    【0 -- 声明变量】
		 **********************************************************************/
		StringBuffer condition = new StringBuffer();
		UITownCalForm uiTownCalForm = new UITownCalForm();
		BLLwTownPriceSummaryFacade bLwTownPriceSummaryFacade  = new BLLwTownPriceSummaryFacade();
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwTownPriceSummaryFacade blLwTownPriceSummaryFacade = new BLLwTownPriceSummaryFacade();
		LwTownPriceSummaryDto lwTownPriceSummaryDto = new LwTownPriceSummaryDto();
		
		/***********************************************************************
		 *    【1 -- 取得表单的值】
		 **********************************************************************/
		// 统计年月
		String statMonth = httpServletRequest.getParameter("statMonth");
		// 乡镇代码
		String townCode = httpServletRequest.getParameter("townCode");	
		// 第一次查询
		String firstquery = httpServletRequest.getParameter("firstquery");
		/***********************************************************************
		 *    【2 -- 获取该乡镇的所有用户】
		 **********************************************************************/
		// -- 组织条件
		Collection <LwPowerUserDto>userList = blLwPowerUserFacade.findByConditions(" townCode = '"+townCode+"'");		
		condition.append(" 1=1 ").append(getUserCondition(userList));
		
		Collection townPriceList = blLwTownPriceSummaryFacade.findByConditions(condition.toString());	
		lwTownPriceSummaryDto = blCalPowerFeeCustomFacade.statTownFee(townPriceList, statMonth,townCode);
		
		
		 /**    【3 -- 保存】
		 **********************************************************************/
		// 避免重复计算，先删除后插入
		//bLwTownPriceSummaryFacade.deleteAndInsert(lwTownPriceSummaryDto);
		
		/***********************************************************************
		 *    【4 -- 为页面展现赋值】
		 **********************************************************************/		
		httpServletRequest.setAttribute("lwTownPriceSummaryDto",lwTownPriceSummaryDto);
		httpServletRequest.setAttribute("uiTownCalForm", uiTownCalForm);
		httpServletRequest.setAttribute("townCode", townCode);
		return actionMapping.findForward("Success");
	}
	
		/**
		 * 组织取得电价分类的条件。
		 * @param collection
		 * @return
		 */	
		public String getUserCondition(Collection <LwPowerUserDto>collection){
			StringBuffer buffer = new StringBuffer();
			// 
			buffer.append(" and (");
			buffer.append(" 1=0 ");
			for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
				LwPowerUserDto lwPowerUserDto = (LwPowerUserDto) iterator.next();			
				buffer.append(" or userNo = '").append(lwPowerUserDto.getUserNo()).append("'");
			}
			buffer.append(")");
			return buffer.toString();
		}
		public static void main(String []args){
			UIPostTownStatPringAction ui = new UIPostTownStatPringAction();
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
