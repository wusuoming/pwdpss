package com.elongway.pss.ui.dataInput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.ui.view.datainput.UITownCalForm;
import com.elongway.pss.ui.view.datainput.UITownCalForm1;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.sinosoft.sysframework.common.util.DataUtils;


/**
 * 电表信息维护 Action <br>
 * 查询
 * 
 * @author 乔有良
 * @version 1.0 2008-10-09
 */
public class UIGetTownCalAction extends DispatchAction {
	
	
	
	/**
	 * 控制电表管理的跳转
	 */
	public ActionForward forwordTownCal(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		UITownCalForm1 uiTownCalForm = (UITownCalForm1)actionForm;
		// 乡镇代码
		String town = httpServletRequest.getParameter("town");
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		// 得到用电用户列表
		Collection userList = blLwPowerUserFacade.findByConditions(" towncode = '"+town+"'");
		Collection formList = new ArrayList();
		this.copyUserInfo(userList, formList);
		Collection<LwDcodeDto> townList = bLwDcodeFacade
				.findByConditions(" codetype = 'TownCode'");
		httpServletRequest.setAttribute("userList", userList);
		return (actionMapping.findForward("townInputSuccess"));

	}
	/**
	 * 控制直供乡的统计
	 */
	public ActionForward forwordTownStat(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		UITownCalForm1 uiTownCalForm = (UITownCalForm1)actionForm;
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		Collection<LwDcodeDto> townList = bLwDcodeFacade
				.findByConditions(" codetype = 'TownCode'");
		httpServletRequest.setAttribute("townList", townList);
		String firstquery = httpServletRequest.getParameter("firstquery");
		httpServletRequest.setAttribute("firstquery", firstquery);
		return (actionMapping.findForward("firstSuccess"));

	}
	/**
	 * 拷贝用户信息到FORM中
	 * @author 乔有良 2008-10-28 太原
	 * @param userList
	 * @param formList
	 */
	public void copyUserInfo(Collection<LwPowerUserDto> userList,Collection<UITownCalForm> formList){
		UITownCalForm form = null;
		for (Iterator iterator = userList.iterator(); iterator.hasNext();) {
			LwPowerUserDto dto = (LwPowerUserDto) iterator.next();
			form = new UITownCalForm();
			DataUtils.copySimpleObject(form, dto);
			formList.add(form);
		}
		
	}
	
}
