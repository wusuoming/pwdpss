package com.elongway.pss.ui.control.maintenance;
/**
 *�û���Ϣά�� Action <br>
 * ����
 * 
 * @author ���ټ�
 * @version 1.0 2008-10-07
 */

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
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;

public class UIQueryLWChangeAmmeterAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        // ��������
		BLLwPowerUserFacade  blLwPowerUserFacade=new BLLwPowerUserFacade();
		String condition = null;
		// ��֯����
		condition = this.generateCondition(httpServletRequest);
		// ��ѯ

		BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
		Collection townList  = blLwDcodeFacade.findByConditions(" codetype = 'TownCode'");
		Collection  <LwPowerUserDto>powerUserList=blLwPowerUserFacade.findByConditions(condition);
		for (Iterator iterator = powerUserList.iterator(); iterator.hasNext();) {
			LwPowerUserDto lwPowerUserDto = (LwPowerUserDto) iterator.next();
			for (Iterator iterator2 = townList.iterator(); iterator2
					.hasNext();) {
				LwDcodeDto o = (LwDcodeDto) iterator2.next();
				if (lwPowerUserDto.getTownCode().equals(o.getCodeCode())) {
					lwPowerUserDto.setTownName(o.getCodeCName());
					break;
				}
			}
		}
		httpServletRequest.setAttribute("powerUser", powerUserList);
		return actionMapping.findForward("QueryLWPowerUser");
	}
	/**
	 * ��֯��ѯ����
	 * qiaoyouliang add 2008-11-03
	 * ֧��ģ����ѯ
	 * @param httpServletRequest
	 * @return
	 */
	public String generateCondition(HttpServletRequest httpServletRequest){
		String userNo=httpServletRequest.getParameter("UserNo");
		String userName=httpServletRequest.getParameter("UserName");
		String address=httpServletRequest.getParameter("Address");
		String townCode=httpServletRequest.getParameter("TownCode");
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(" 1=1 ");
		// ֧��ģ����ѯ
		if(userNo!=null&&!"".equals(userNo)){
			buffer.append(" and ").append(" UserNo like '%").append(userNo.trim()).append("%'");
		}
		if(userName!=null&&!"".equals(userName)){
			buffer.append(" and ").append(" UserName like '%").append(userName.trim()).append("%'");
		}
		if(address!=null&&!"".equals(address)){
			buffer.append(" and ").append(" address like '%").append(address.trim()).append("%'");
		}
		if(townCode!=null&&!"".equals(townCode)){
			buffer.append(" and ").append(" TownCode = '").append(townCode.trim()).append("'");
		}
		
		return buffer.toString();
		
	}
}
