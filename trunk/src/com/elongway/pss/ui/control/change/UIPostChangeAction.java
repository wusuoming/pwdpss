package com.elongway.pss.ui.control.change;

/**
 * 换表确认 Action <br>
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
import com.elongway.pss.dto.custom.ChangeAmmeterDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIPostChangeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLWUserCustomFacade bllwCustomFacade = new BLLWUserCustomFacade();
		BLLwTownIndicatorFacade blLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		String forward = null;
		LwAmmeterChangeDto errorAmmeter = null;
		LwAmmeterChangeDto newAmmeter = null;
		
		String userNo = (String)httpServletRequest.getParameter("userNo");	
		String userName = (String)httpServletRequest.getParameter("userName");	
		
		// 1-得到故障电表主键
		String []id = httpServletRequest.getParameterValues("id");
		if(id == null){
		 throw new UserException(-6,-703,this.getClass().getName(),"该用户还没有配置电表！");
		}
		// 故障有功指针
		String errorWorkNum = (String)httpServletRequest.getParameter("errorWorkNum");
		// 故障无功指针
	//	String errorIdleNum = (String)httpServletRequest.getParameter("errorIdleNum");	
		// 上月有功指针
		String lastWorkNum = (String)httpServletRequest.getParameter("lastWorkNum");
		// 换表有功电量
		String chgWorkNum = (String)httpServletRequest.getParameter("chgWorkNum");	
		
		// 2-查找电表信息
		
		int count = id.length;
		// -- 取得故障电表
		errorAmmeter = blLwAmmeterChangeFacade.findByPrimaryKey(id[count-1]);
		
		// 3-更新故障有功指针、上月有功指针、换表电量、并把电表状态更新为不被使用状态。
		errorAmmeter.setErrorWorkNum(Double.parseDouble(errorWorkNum));
	//	errorAmmeter.setErrorIdleNum(Double.parseDouble(errorIdleNum));
		errorAmmeter.setFlag(AppConst.NOTUSE_AMMETER_FLAG);
		errorAmmeter.setLastWorkNum(Double.parseDouble(lastWorkNum));
		errorAmmeter.setChgWorkNum(Double.parseDouble(chgWorkNum));
		
		// 4-得到新表信息
		String ammeterNo = httpServletRequest.getParameter("ammeterNo");
		String ammeterV = httpServletRequest.getParameter("ammeterV");
		String ammeterA = httpServletRequest.getParameter("ammeterA");
		String ammeterX = httpServletRequest.getParameter("ammeterX");
		String ammeterType = httpServletRequest.getParameter("ammeterType");
		String factoryName = httpServletRequest.getParameter("factoryName");
		String coust = httpServletRequest.getParameter("coust");
		String precision = httpServletRequest.getParameter("precision");
		String rate = httpServletRequest.getParameter("rate");
		String installWorkNum = httpServletRequest.getParameter("installWorkNum");
		String installIdleNum = httpServletRequest.getParameter("installIdleNum");
		String installDate = httpServletRequest.getParameter("installDate");
		
		newAmmeter = new LwAmmeterChangeDto();
		newAmmeter.setUserNo(userNo);
		newAmmeter.setUserName(userName);
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
//		newAmmeter.setInstallIdleNum(Double.parseDouble(installIdleNum));
		newAmmeter.setInstallWorkNum(Double.parseDouble(installWorkNum));
		
		ChangeAmmeterDto changeAmmeterDto = PowerFeeCal.checkChgAmmeter(userNo);
		
		// 5-将新表的上表指针更新到该用户的上月指针字段。		
		LwTownIndicatorDto lwTownIndicatorDto = blLwTownIndicatorFacade.findByPrimaryKey(userNo, PowerFeeCal.getCurrentBillMonth());
		lwTownIndicatorDto.setLastWorkNum(Double.parseDouble(installWorkNum));
		lwTownIndicatorDto.setThisWorkNum(Double.parseDouble(installWorkNum));
		
		double chgWorkQuantity = changeAmmeterDto.getChgWorkQuantity();

		lwTownIndicatorDto.setChgAmmeterQuantity(Double.parseDouble(chgWorkNum)+changeAmmeterDto.getChgWorkQuantity());

		lwTownIndicatorDto.setRate(Double.parseDouble(rate));

		bllwCustomFacade.saveTownChangeAmmeter(errorAmmeter, newAmmeter,lwTownIndicatorDto);
		
		forward = "forward";
		return actionMapping.findForward(forward);
	}

	
}
