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

import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.ui.view.datainput.UITownCalForm;
import com.sinosoft.sysframework.common.util.DataUtils;


/**
 * ֱ����ָ���ʼ�� Action <br>
 * ���㡢����
 * 
 * @author ������ add
 * @version 1.0 2008-10-25
 */
public class UIGetTownCalFeeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		
		// ��������
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		String forword = "";
		// �����������
		String townCondition = "";
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwTownIndicatorFacade blLWTownIndicatorFacade = new BLLwTownIndicatorFacade();
		// �������
		String cal = httpServletRequest.getParameter("calculation");
		String town = httpServletRequest.getParameter("town");
		String bookNo = httpServletRequest.getParameter("bookNo");
		Collection <UITownCalForm>formList = new ArrayList();
		// ��֯����
		if (cal==null) {
			townCondition = "";
			httpServletRequest.setAttribute("query", "1");
			Collection<LwTownIndicatorDto> indicatorList = blLWTownIndicatorFacade.findByConditions("");	
			forword = "listSuccess";
			httpServletRequest.setAttribute("indicatorList", indicatorList);
			// �����ѯ
		}else{
			
			townCondition = " towncode = '"+town+"'";
			// �õ��õ��û��б�
			Collection <LwPowerUserDto>userList = blLwPowerUserFacade.findByConditions(townCondition);
			Collection townList = bLwDcodeFacade.findByConditions(" codetype = 'TownCode' And codecode = '"+town+"'");
			LwDcodeDto lwDcodeDto = null;
			if (townList!=null) {
				Iterator iterator = townList.iterator(); 
				lwDcodeDto = (LwDcodeDto)iterator.next();
			}
			
			this.copyUserInfo(userList, formList);
			httpServletRequest.setAttribute("formList", formList);
			httpServletRequest.setAttribute("townName", lwDcodeDto.getCodeCName());
			forword = "townInputSuccess";
			httpServletRequest.setAttribute("formList", formList);
		}
		
		
		return actionMapping.findForward(forword);
	}
	/**
	 * �����û���Ϣ��FORM��
	 * @author ������ 2008-10-28 ̫ԭ
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
		
	}/**
	 * ����ָ����Ϣ
	 * @author ������ 2008-10-28 ̫ԭ
	 * @param 
	 * @param formList
	 */
	public void copyIndicatorInfo(Collection<LwTownIndicatorDto> indicatorList,Collection<UITownCalForm> formList){
		UITownCalForm form = null;
		for (Iterator iterator = indicatorList.iterator(); iterator.hasNext();) {
			LwTownIndicatorDto dto = (LwTownIndicatorDto) iterator.next();
			form = new UITownCalForm();
			DataUtils.copySimpleObject(dto, form);
			formList.add(form);
		}
		
	}
}
