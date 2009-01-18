package com.elongway.pss.ui.control.common.pub;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.custom.BLPwdEncodeAction;
import com.elongway.pss.bl.facade.BLLwSysUserFacade;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.elongway.pss.ui.view.common.UpdatePasswordForm;
import com.elongway.pss.util.AppConst;
import com.sinosoft.sysframework.exceptionlog.UserException;

/**
 * �޸ĵ�ǰ��¼�û������롣
 * 
 * @author yangfuqiang
 * @version 1.0 2006-08-26
 */
public class UIPostPasswordAction extends Action {

	private String modelName = "UIPostPasswordAction";
	
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		BLLwSysUserFacade blLwSysUserFacade = new BLLwSysUserFacade();
		// ��¼�û�
        HttpSession session = httpServletRequest.getSession();
        SysUser sysUser = (SysUser)(session.getAttribute(AppConst.SYSUSER_SESSION));
        if((sysUser == null)){
            return actionMapping.findForward(AppConst.LOGON_FORWARD);
        }
        
		// ��֤�û�		
		UpdatePasswordForm updatePasswordForm = (UpdatePasswordForm) actionForm;
		
		String userCode = sysUser.getUserCode();
		String areaCode = sysUser.getAreaCode();
		
		String oldPassword = updatePasswordForm.getOldPassword().trim();
		String newPassword = updatePasswordForm.getNewPassword().trim();
		String confirmPassword = updatePasswordForm.getConfirmPassword().trim();
		
		// -- ȷ��������
		if (!newPassword.equals(confirmPassword)){
			throw new UserException(-98,-1019, modelName); // �µ������ȷ�����벻һ�¡�
		}
		
		// -- �ҵ����û�
		LwSysUserDto lwSysUserDto = blLwSysUserFacade.findByPrimaryKey(userCode);
		if (lwSysUserDto==null){
			throw new UserException(-98, -904, modelName); // �޴��û�
		}
		
		// -- ��֤������
		if (! new BLPwdEncodeAction().fenCode(oldPassword).equals(lwSysUserDto.getPassword() )){
			throw new UserException(-98, -1020, modelName); // ������������������롣
		}
		
		// -- �����û�
		lwSysUserDto.setPassword(new BLPwdEncodeAction().fenCode(newPassword));
		
		blLwSysUserFacade.update(lwSysUserDto);

		return actionMapping.findForward(AppConst.SUCCESS_FORWARD);
	}

}