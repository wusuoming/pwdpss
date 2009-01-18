package com.elongway.pss.ui.control.change;

/**
 * 大工业换表确认 Action <br>
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
import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.dto.custom.ChangeAmmeterDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIFactoryPostChangeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLWUserCustomFacade bllwCustomFacade = new BLLWUserCustomFacade();
		BLLwNewFactoryIndicatorFacade blLwNewFactoryIndicatorFacade = new BLLwNewFactoryIndicatorFacade();
		String forward = null;
		String rate  = null;
		// 换表有功电量
		double chgWorkQuantity = 0D;
		// 换表无功电量
		double chgIdleQuantity = 0D;
		LwAmmeterChangeDto errorAmmeter = null;
		LwAmmeterChangeDto newAmmeter = null;
		
		String userNo = (String)httpServletRequest.getParameter("UserNo");	
		String UserName = (String)httpServletRequest.getParameter("UserName");	
		String useStyle = (String)httpServletRequest.getParameter("useStyle");
		
		String AmmeterNo = (String)httpServletRequest.getParameter("AmmeterNo");
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
		// 上表有功指针
		String installWorkNum = httpServletRequest.getParameter("installWorkNum");
		// 上表无功指针
		String installIdleNum = httpServletRequest.getParameter("installIdleNum");
		String installDate = httpServletRequest.getParameter("installDate");

		
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
		String newammeterNo = httpServletRequest.getParameter("newammeterNo");
		String ammeterV = httpServletRequest.getParameter("ammeterV");
		String ammeterA = httpServletRequest.getParameter("ammeterA");
		String ammeterX = httpServletRequest.getParameter("ammeterX");
		String ammeterType = httpServletRequest.getParameter("ammeterType");
		 String factoryCcode = httpServletRequest.getParameter("factoryCcode");
		String factoryName = httpServletRequest.getParameter("factoryName");
		String coust = httpServletRequest.getParameter("coust");
		String precision = httpServletRequest.getParameter("precision");
		rate = httpServletRequest.getParameter("rate");

		
		newAmmeter = new LwAmmeterChangeDto();
		newAmmeter.setUserNo(userNo);
		newAmmeter.setUserName(UserName);
		newAmmeter.setAmmeterA(ammeterA);
		newAmmeter.setAmmeterV(ammeterV);
		newAmmeter.setAmmeterX(ammeterX);
		newAmmeter.setAmmeterNo(newammeterNo);
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
		newAmmeter.setUseStyle(useStyle);
		
		ChangeAmmeterDto changeAmmeterDto = PowerFeeCal.checkChgAmmeter(userNo,AmmeterNo);
		
		// 5-将新表的上表指针更新到该用户的上月指针字段。		
		LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = blLwNewFactoryIndicatorFacade.findByPrimaryKey(userNo, PowerFeeCal.getCurrentBillMonth(),AmmeterNo);
		LwNewFactoryIndicatorDto newlwNewFactoryIndicatorDto=new LwNewFactoryIndicatorDto();
		// -- 如果是居民表
		
		newlwNewFactoryIndicatorDto.setLastWorkNum(Integer.parseInt(installWorkNum));
		newlwNewFactoryIndicatorDto.setStatMonth(lwNewFactoryIndicatorDto.getStatMonth());
		
			// 大工业上月无功
		newlwNewFactoryIndicatorDto.setLastIdleNum(Integer.parseInt(installIdleNum));
			// 换表电量
		newlwNewFactoryIndicatorDto.setChgAmmeterQuantity(chgWorkQuantity+changeAmmeterDto.getChgWorkQuantity());
		newlwNewFactoryIndicatorDto.setAmmeterNo(newammeterNo);
		String s=lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity();
		if(lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity().equals("")||lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity()==null){
			s="0";
		}
		newlwNewFactoryIndicatorDto.setUnChgAmmeterQuantity(String.valueOf((chgIdleQuantity+Double.parseDouble(s))));
		newlwNewFactoryIndicatorDto.setRate(Double.parseDouble(rate));
		
		newlwNewFactoryIndicatorDto.setAmmeterStyle(lwNewFactoryIndicatorDto.getAmmeterStyle());
		newlwNewFactoryIndicatorDto.setUserNo(lwNewFactoryIndicatorDto.getUserNo());
		newlwNewFactoryIndicatorDto.setUsername(lwNewFactoryIndicatorDto.getUsername());
		
		bllwCustomFacade.saveWholeChangeAmmeter(errorAmmeter, newAmmeter,lwNewFactoryIndicatorDto,newlwNewFactoryIndicatorDto);		
		forward = "forward";
		return actionMapping.findForward(forward);
	}

	
}
