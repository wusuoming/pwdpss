package com.elongway.pss.ui.control.feeappend.town;

/**
 * 直供乡追收电费列表 Action <br>
 * 
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-12-16
 */

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorAppendFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;

public class UIFeeAppendListAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		String townCode = null;
		String forward = null;
		String inputDate = null;
		Collection<LwPowerUserDto> userList = null;
		Collection<LwTownIndicatorDto> indicatorList = null;
		Collection<LwTownIndicatorAppendDto> indicatorAppendList = null;
		StringBuffer conditions = new StringBuffer();
		String statMonth = null;
		String firstquery = null;
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwTownIndicatorFacade blLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		BLLwTownIndicatorAppendFacade blLwTownIndicatorAppendFacade = new BLLwTownIndicatorAppendFacade();
		// 接收表单数据
		townCode = httpServletRequest.getParameter("townCode");
		inputDate = httpServletRequest.getParameter("inputDate");
		firstquery = httpServletRequest.getParameter("firstquery");
		// 统计时间
		statMonth = new DateTime(inputDate,DateTime.YEAR_TO_MONTH).toString();
		userList = blLwPowerUserFacade.findByConditions("towncode = '"+townCode+"'");
		// 组织查询条件
		conditions.append(" 1=1 ").append(PowerFeeCal.getUserCondition(userList));
		conditions.append(" and ").append(" statmonth = '").append(statMonth).append("'");
		// 查询当月指针记录信息
		indicatorList = blLwTownIndicatorFacade.findByConditions(conditions.toString());
	
		
		httpServletRequest.setAttribute("indicatorList", indicatorList);
		httpServletRequest.setAttribute("statMonth", statMonth);
		httpServletRequest.setAttribute("firstquery", firstquery);
		httpServletRequest.setAttribute("townCode", townCode);
		forward = "queryTownFeeAppendList";
		return actionMapping.findForward(forward);
	}

	
}
