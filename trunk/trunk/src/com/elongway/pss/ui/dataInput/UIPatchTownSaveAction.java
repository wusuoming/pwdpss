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
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;


/**
 * 直供乡计算电费 Action <br>
 * 计算、保存
 * 
 * @author 乔有良 add
 * @version 1.0 2008-10-16
 */
public class UIPatchTownSaveAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		
		
		BLLwTownIndicatorFacade bLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		LwTownIndicatorDto lwTownIndicatorDto = null;
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLCalPowerFeeCustomFacade bllwCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		Collection collection = new ArrayList();
		LwPowerUserDto lwPowerUserDto = null;
		String voltLevel = null;
		Collection priceList = null;
		/***********************************************************************
		 *    【1 -- 取得表单的值】
		 **********************************************************************/
		// 用电用户
		String []userNo = httpServletRequest.getParameterValues("userNo");
		// 线路代码
		String []lineCode = httpServletRequest.getParameterValues("lineCode");		
		// 本月有功指针
		String []thisWorkNum = httpServletRequest.getParameterValues("thisWorkNum");		
		// 上月有功指针
		String []lastWorkNum = httpServletRequest.getParameterValues("lastWorkNum");	
		// 倍率
		String []rate = httpServletRequest.getParameterValues("rate");
		// 抄见电量
		String []readQuantity = httpServletRequest.getParameterValues("readQuantity");
		// 变损电量
		String []tranferLoss = httpServletRequest.getParameterValues("tranferLossQuantity");
		// 换表电量
		String []chgAmmeterQuantity = httpServletRequest.getParameterValues("chgAmmeterQuantity");
		// 总电量
		String []excepQuantity = httpServletRequest.getParameterValues("excepQuantity");
		// 退补电量
		String []compensateQuantity = httpServletRequest.getParameterValues("compensateQuantity");
		// 结帐日期
		String statMonth = httpServletRequest.getParameter("statMonth");
		// 录入日期
		String readDate = httpServletRequest.getParameter("readDate");
		LwAmmeterChangeDto dto =  null;	
		if (userNo!=null) {
			for (int i = 0; i < userNo.length; i++) {
				lwTownIndicatorDto = bLwTownIndicatorFacade.findByPrimaryKey(userNo[i], statMonth);
				Collection ammeterList = blLwAmmeterChangeFacade.findByConditions(" userNo = '"+userNo[i]+"' and flag = '"+AppConst.CURRENT_AMMETER_FLAG+"'");
				if(ammeterList==null||ammeterList.size()==0){
					throw new UserException(-6,-703,this.getClass().getName());
				}
				Iterator iterator = ammeterList.iterator();
				if(iterator.hasNext())
				{
					dto = (LwAmmeterChangeDto)iterator.next();
				}
				dto.setRate(rate[i]);
				// 更新电表的倍率
				blLwAmmeterChangeFacade.update(dto);
				lwPowerUserDto = blLwPowerUserFacade.findByPrimaryKey(userNo[i]);
				voltLevel = lwPowerUserDto.getSaleVoltLevel();
				// 得到电价
				priceList = bllwCalPowerFeeCustomFacade.getTownPrice(voltLevel);
				// 组织电价
				bllwCalPowerFeeCustomFacade.orgTownIndicatorPrice(priceList, lwTownIndicatorDto);
				lwTownIndicatorDto.setThisWorkNum(Double.parseDouble(thisWorkNum[i]));
				lwTownIndicatorDto.setLastWorkNum(Double.parseDouble(lastWorkNum[i]));
				lwTownIndicatorDto.setRate(Double.parseDouble(rate[i]));
				lwTownIndicatorDto.setTranferLossQuantity(Long.parseLong(tranferLoss[i]));
				lwTownIndicatorDto.setReadQuantity(Double.parseDouble(readQuantity[i]));
				lwTownIndicatorDto.setExcepQuantity(Double.parseDouble(excepQuantity[i]));
				lwTownIndicatorDto.setChgAmmeterQuantity(Double.parseDouble(chgAmmeterQuantity[i]));
				lwTownIndicatorDto.setCompensateQuantity(Double.parseDouble(compensateQuantity[i]));
				lwTownIndicatorDto.setInputDate(new DateTime(new java.util.Date(),DateTime.YEAR_TO_DAY).toString());
				lwTownIndicatorDto.setReadDate(readDate);
				bLwTownIndicatorFacade.update(lwTownIndicatorDto);
			}
		}
		// 批量插入
		//bLwTownIndicatorFacade.insertAll(collection);		
		return actionMapping.findForward("Success");
	}
	
}
