package com.elongway.pss.ui.control.change;

/**
 * 趸售换表确认 Action <br>
 * 
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-11-07
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLWUserCustomFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.dto.custom.ChangeAmmeterDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIWholePostChangeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLWUserCustomFacade bllwCustomFacade = new BLLWUserCustomFacade();
		BLLwWholeSaleIndicatorFacade blLwWholeSaleIndicatorFacade = new BLLwWholeSaleIndicatorFacade();
		String forward = null;
		String rate  = null;
		// 换表有功电量
		double chgWorkQuantity = 0D;
		// 换表无功电量
		double chgIdleQuantity = 0D;
		LwAmmeterChangeDto errorAmmeter = null;
		LwAmmeterChangeDto newAmmeter = null;
		
		String transformerName = (String)httpServletRequest.getParameter("transformerName");	
		
		// 1-得到故障电表主键
		String []id = httpServletRequest.getParameterValues("id");
		if(id == null){
		 throw new UserException(-6,-703,this.getClass().getName(),"该用户还没有配置电表！");
		}
		// 故障有功指针
		String errorWorkNum = (String)httpServletRequest.getParameter("errorWorkNum");
		// 故障无功指针
		String errorIdleNum = (String)httpServletRequest.getParameter("errorIdleNum");	
		// 上月有功指针
		String lastWorkNum = (String)httpServletRequest.getParameter("lastWorkNum");
		// 上月无功指针
		String lastIdleNum = (String)httpServletRequest.getParameter("lastIdleNum"); 

		
		// 2-查找电表信息
		
		int count = id.length;
		// -- 取得故障电表
		errorAmmeter = blLwAmmeterChangeFacade.findByPrimaryKey(id[count-1]);
		rate  = errorAmmeter.getRate();
		// -- 换表有功电量
		chgWorkQuantity = (Double.parseDouble(errorWorkNum) - Double.parseDouble(lastWorkNum))*Double.parseDouble(rate);
		// -- 换表无功电量
		chgIdleQuantity = (Double.parseDouble(errorIdleNum) - Double.parseDouble(lastIdleNum))*Double.parseDouble(rate);
		
		// 3-更新故障有功指针、故障无功、上月有功指针、上月无功指针、换表有功电量、换表无功电量、并把电表状态更新为不被使用状态。
		errorAmmeter.setErrorWorkNum(Double.parseDouble(errorWorkNum));
		errorAmmeter.setErrorIdleNum(Double.parseDouble(errorIdleNum));
		errorAmmeter.setFlag(AppConst.NOTUSE_AMMETER_FLAG);
		errorAmmeter.setLastWorkNum(Double.parseDouble(lastWorkNum));
		errorAmmeter.setLastIdleNum(Double.parseDouble(lastIdleNum));
		errorAmmeter.setChgWorkNum(chgWorkQuantity);
		errorAmmeter.setChgIdleQuantity(chgIdleQuantity);
		
		// 4-得到新表信息
		String ammeterNo = httpServletRequest.getParameter("ammeterNo");
		String ammeterV = httpServletRequest.getParameter("ammeterV");
		String ammeterA = httpServletRequest.getParameter("ammeterA");
		String ammeterX = httpServletRequest.getParameter("ammeterX");
		String ammeterType = httpServletRequest.getParameter("ammeterType");
		String factoryName = httpServletRequest.getParameter("factoryName");
		String coust = httpServletRequest.getParameter("coust");
		String precision = httpServletRequest.getParameter("precision");
		rate = httpServletRequest.getParameter("rate");
		String installWorkNum = httpServletRequest.getParameter("installWorkNum");
		String installIdleNum = httpServletRequest.getParameter("installIdleNum");
		String installDate = httpServletRequest.getParameter("installDate");
		
		newAmmeter = new LwAmmeterChangeDto();
		newAmmeter.setUserNo(transformerName);
		newAmmeter.setUserName(transformerName);
		newAmmeter.setAmmeterA(ammeterA);
		newAmmeter.setAmmeterV(ammeterV);
		newAmmeter.setAmmeterX(ammeterX);
		newAmmeter.setAmmeterNo(ammeterNo);
		newAmmeter.setAmmeterType(ammeterType);
		newAmmeter.setCoust(coust);
		newAmmeter.setFactoryName(factoryName);
		newAmmeter.setPrecision(precision);
		newAmmeter.setRate(rate);
		newAmmeter.setId(new Long(System.currentTimeMillis()).toString());
		newAmmeter.setFlag(AppConst.CURRENT_AMMETER_FLAG);
		newAmmeter.setInstallDate(installDate);
		newAmmeter.setInstallIdleNum(Double.parseDouble(installIdleNum));
		newAmmeter.setInstallWorkNum(Double.parseDouble(installWorkNum));
		
		ChangeAmmeterDto changeAmmeterDto = PowerFeeCal.checkChgAmmeter(transformerName);
		
		// 5-将新表的上表指针更新到该用户的上月指针字段。		
		LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = blLwWholeSaleIndicatorFacade.findByPrimaryKey(transformerName, PowerFeeCal.getCurrentBillMonth());
		lwWholeSaleIndicatorDto.setLastWorkNum(Double.parseDouble(installWorkNum));
		lwWholeSaleIndicatorDto.setThisWorkNum(Double.parseDouble(installWorkNum));
		lwWholeSaleIndicatorDto.setLastIdleNum(Double.parseDouble(installIdleNum));


		// -- 将换表有功电量、无功电量付给趸售指针表
		lwWholeSaleIndicatorDto.setChgAmmeterQuantity(chgWorkQuantity+lwWholeSaleIndicatorDto.getChgAmmeterQuantity());
		lwWholeSaleIndicatorDto.setUnChgAmmeterQuantity(chgIdleQuantity+lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity());
		
		lwWholeSaleIndicatorDto.setRate(Double.parseDouble(rate));

		bllwCustomFacade.saveWholeChangeAmmeter(errorAmmeter, newAmmeter,lwWholeSaleIndicatorDto);
		
		forward = "forward";
		return actionMapping.findForward(forward);
	}

	
}
