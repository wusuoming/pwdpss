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
 * 修改当前登录用户的密码。
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
		// 登录用户
        HttpSession session = httpServletRequest.getSession();
        SysUser sysUser = (SysUser)(session.getAttribute(AppConst.SYSUSER_SESSION));
        if((sysUser == null)){
            return actionMapping.findForward(AppConst.LOGON_FORWARD);
        }
        
		// 验证用户		
		UpdatePasswordForm updatePasswordForm = (UpdatePasswordForm) actionForm;
		
		String userCode = sysUser.getUserCode();
		String areaCode = sysUser.getAreaCode();
		
		String oldPassword = updatePasswordForm.getOldPassword().trim();
		String newPassword = updatePasswordForm.getNewPassword().trim();
		String confirmPassword = updatePasswordForm.getConfirmPassword().trim();
		
		// -- 确认新密码
		if (!newPassword.equals(confirmPassword)){
			throw new UserException(-98,-1019, modelName); // 新的密码和确认密码不一致。
		}
		
		// -- 找到该用户
		LwSysUserDto lwSysUserDto = blLwSysUserFacade.findByPrimaryKey(userCode);
		if (lwSysUserDto==null){
			throw new UserException(-98, -904, modelName); // 无此用户
		}
		
		// -- 验证旧密码
		if (! new BLPwdEncodeAction().fenCode(oldPassword).equals(lwSysUserDto.getPassword() )){
			throw new UserException(-98, -1020, modelName); // 旧密码错误，请重新输入。
		}
		
		// -- 保存用户
		lwSysUserDto.setPassword(new BLPwdEncodeAction().fenCode(newPassword));
		
		blLwSysUserFacade.update(lwSysUserDto);

		return actionMapping.findForward(AppConst.SUCCESS_FORWARD);
	}

}