package com.elongway.pss.ui.control.iacontact;

//import java.util.ArrayList;
//import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.dto.domain.IAContactDto;
import com.elongway.pss.ui.control.common.pub.SysUser;
import com.elongway.pss.ui.view.iacontact.IAContactForm;
import com.elongway.pss.util.AppConst;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.common.datatype.DateTime;

/**
 * 理赔信息 --> 结案信息(明细) QueryEditIALEndCase.jsp
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-17
 */
public class UIUpdateStatusAction extends Action {
	private String modelName = UIUpdateStatusAction.class.getSimpleName();

	/**
	 * 执行方法，由Struts主动调用
	 * 
	 * @param actionMapping
	 * @param actionForm
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return ActionForward
	 * @throws Exception
	 */
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,
			Exception {

		// 登录用户
		HttpSession session = httpServletRequest.getSession();
		SysUser sysUser = (SysUser) (session.getAttribute("sysUser"));
		if ((sysUser == null)) {
			return actionMapping.findForward("logon");
		}
		String userCode = sysUser.getUserCode();
		Logger bizLogger = Logger.getLogger(AppConst.BIZINF_LOG + "."
				+ modelName);
		bizLogger.info(userCode, "开始:" + modelName);

		// 是否取消
		if (isCancelled(httpServletRequest))
			return (actionMapping.findForward("Cancel"));
		// 处理数据
		IAContactDto dto = generateDto(actionForm, httpServletRequest);
		//new IAContactUpdateStatusCommand(dto).execute();

		bizLogger.info(userCode, "结束:" + modelName);

		return (actionMapping.findForward("CreateSuccess"));
	}

	public IAContactDto generateDto(ActionForm actionForm,
			HttpServletRequest httpServletRequest) throws Exception {
		HttpSession session = httpServletRequest.getSession();
		SysUser sysUser = (SysUser) (session.getAttribute("sysUser"));

		// 获取表表单
		IAContactForm form = (IAContactForm) actionForm;
		DateTime currentDate = new DateTime();
		// 生成Dto
		IAContactDto dto = new IAContactDto();
		dto.setContactNo(form.getContactNo());

		if (sysUser.getUserGrade().equals("1")) {
			dto.setStatus("01");
		}

		return dto;
	}
}
