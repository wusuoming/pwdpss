package com.elongway.pss.ui.control.common.pub;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.ui.view.common.UpdatePasswordForm;
import com.elongway.pss.util.AppConst;

/**
 * ����������û���Ϣ��
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */
public class UIGetUpdatePasswordAction extends Action {

	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		// ��¼�û�
		HttpSession session = httpServletRequest.getSession();
		SysUser sysUser = (SysUser) (session.getAttribute(AppConst.SYSUSER_SESSION));
		if ((sysUser == null)) {
			return actionMapping.findForward(AppConst.LOGON_FORWARD);
		}
		
		// ������Ϣ
		UpdatePasswordForm updatePasswordForm = (UpdatePasswordForm) actionForm;
		
		updatePasswordForm.setUpdUserCode(sysUser.getUserCode());
		updatePasswordForm.setUpdUserName(sysUser.getUserName());

		httpServletRequest.setAttribute("updatePasswordForm", updatePasswordForm);
		
		// ������Ϣ
		return actionMapping.findForward(AppConst.SUCCESS_FORWARD);
	}
}