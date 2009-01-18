package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.custom.BLPwdEncodeAction;
import com.elongway.pss.bl.facade.BLLwSysUserFacade;
import com.elongway.pss.bl.facade.BLLwctFacade;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.elongway.pss.dto.domain.LwctDto;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIEditUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		/**
		 * modify by qiaoyouliang 2008-12-31 begin �޸Ķ��û���Ϣ�޸ĵĴ��룬��ʽ������
		 */
		/** 1-�������� */
		BLLwSysUserFacade blLwSysUserFacade = new BLLwSysUserFacade();
		// ԭ����
		String oldpassword = "";
		// ������
		String newpassword = "";
		// ȷ��������
		String confirmPwd = "";
		// �û�Ȩ�޴���
		String USERGRADE = "";
		// �Ƿ���Ч
		String VALIDSTATUS = "";
		// �û�����
		String userCode = null;
		// �û�����
		String userName = "";
		// �û�DTO
		LwSysUserDto lwSysUserDto = null;
		/** 2-��ȡ������ */

		userCode = httpServletRequest.getParameter("userCode");
		userName = httpServletRequest.getParameter("userName");
		oldpassword = httpServletRequest.getParameter("oldpassword");
		newpassword = httpServletRequest.getParameter("newpassword");
		confirmPwd = httpServletRequest.getParameter("confirmPwd");
		USERGRADE = httpServletRequest.getParameter("USERGRADE");
		VALIDSTATUS = httpServletRequest.getParameter("VALIDSTATUS");

		lwSysUserDto = blLwSysUserFacade.findByPrimaryKey(userCode);
		/** 3-ȷ���������� */
		// ԭ����У��
		if (!new BLPwdEncodeAction().fenCode(oldpassword).equals(
				lwSysUserDto.getPassword())) {
			throw new UserException(-98, -1020, this.getClass().getName());
		}
		// ������ȷ��У��
		if (!confirmPwd.equals(newpassword)) {
			throw new UserException(-98, -1019, this.getClass().getName());
		}
		/** 4-���� */
		/**
		 * modify by qiaoyouliang 2008-12-31 end �޸Ķ��û���Ϣ�޸ĵĴ��룬��ʽ������
		 */

		lwSysUserDto.setUserGrade(USERGRADE);
		lwSysUserDto.setUserName(userName);
		lwSysUserDto.setValidStatus(VALIDSTATUS);
		lwSysUserDto.setPassword(newpassword);
		blLwSysUserFacade.update(lwSysUserDto);

		return actionMapping.findForward("Success");

	}

}
