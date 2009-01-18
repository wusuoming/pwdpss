package com.elongway.pss.ui.control.iacontact;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.ui.control.common.pub.SysUser;
import com.elongway.pss.ui.view.iacontact.IAContactForm;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PubFun;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.log.Logger;

/**
 * 投保信息查询 - 主要查询IATMain数据。
 * 
 * @author yangfuqiang
 * @version 1.0 2006-08-30
 */
public class UIGetIAContactListAction extends Action {
	private String modelName = "UIGetIAContactListAction";

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

		// 参数处理
		String firstQuery = httpServletRequest.getParameter("firstquery"); // 区分大小写
		String menuFlag = httpServletRequest.getParameter("menuflag");
		bizLogger.info(userCode, "firstQuery=" + firstQuery);
		bizLogger.info(userCode, "menuFlag=" + menuFlag);

		// 主要变量
		IAContactForm iaContactForm = (IAContactForm) actionForm;
		iaContactForm.setCompanyCode(sysUser.getCompanyCode());
		iaContactForm.setUserCode(sysUser.getUserCode());
		iaContactForm.setUserGrade(sysUser.getUserGrade());
		if (firstQuery != null) {
			if (sysUser.getUserGrade().equals("1")) {
				iaContactForm.setQueryContactStatus("01");
			}
			if (sysUser.getUserGrade().equals("2")) {
				iaContactForm.setQueryContactStatus("04");
			}
			if (sysUser.getUserGrade().equals("3")) {
				iaContactForm.setQueryContactStatus("05");
			}
		}
		// 处理查询
		Collection collection = new ArrayList();
	
		// 返回信息
		collection.toString();
		iaContactForm.setCompanyCode(iaContactForm.getCompanyCode());
		iaContactForm.setCreator(iaContactForm.getCreator());
		iaContactForm.setConfirmName(iaContactForm.getConfirmName());
		iaContactForm.setDealName(iaContactForm.getDealName());
		iaContactForm.setDealDate(iaContactForm.getDealDate());
		iaContactForm.setApplyDate(iaContactForm.getApplyDate());
		iaContactForm.setConfirmDate(iaContactForm.getConfirmDate());
		iaContactForm.setDealDate(iaContactForm.getDealDate());
		iaContactForm.setMakeCode(iaContactForm.getMakeCode());
		iaContactForm.setContactNo(iaContactForm.getContactNo());
		httpServletRequest.setAttribute("menuflag", menuFlag);
		httpServletRequest.setAttribute("firstquery", firstQuery);
//		httpServletRequest.setAttribute("contactStatus", UICommonInfo
//				.getCodeInfo("ContactStatus", true));
//		httpServletRequest.setAttribute("dealTypes", UICommonInfo.getCodeInfo(
//				"DealType", true));
//		httpServletRequest.setAttribute("iaContactForm", iaContactForm);
//		httpServletRequest.setAttribute("iaContactOverview", collection);
//		httpServletRequest.setAttribute("questionTypes", UICommonInfo
//				.getCodeInfo("QuestionType", true));

		bizLogger.info(userCode, "结束:" + modelName);

		return (actionMapping.findForward("Success"));
	}

	/**
	 * 生成查询条件
	 * 
	 * @param actionForm
	 *            actionForm
	 * @param httpServletRequest
	 *            http请求
	 * @return condtions 查询条件
	 * @throws Exception
	 */
	private String generateConditions(ActionForm actionForm,
			HttpServletRequest httpServletRequest) throws Exception {
		IAContactForm iaContactForm = (IAContactForm) actionForm;
		// 查询条件：
		HttpSession session = httpServletRequest.getSession();
		SysUser sysUser = (SysUser) (session.getAttribute("sysUser"));
		iaContactForm.setUserGrade(sysUser.getUserGrade());
		String companyCode = "";
		if (sysUser.getUserGrade().equals("2")
				|| sysUser.getUserGrade().equals("3")) {
			companyCode = httpServletRequest.getParameter("companyCode2");
		} else {
			companyCode = httpServletRequest.getParameter("companyCode");
		}
		String creator = httpServletRequest.getParameter("creator");
		String confirmName = httpServletRequest.getParameter("confirmName");
		String dealName = httpServletRequest.getParameter("dealName");
		String applyDateStart = httpServletRequest
				.getParameter("applyDateStart");
		String applyDateEnd = httpServletRequest.getParameter("applyDateEnd");
		String confirmDateStart = httpServletRequest
				.getParameter("confirmDateStart");
		String confirmDateEnd = httpServletRequest
				.getParameter("confirmDateEnd");
		String dealConfirmDateStart = httpServletRequest
				.getParameter("dealConfirmDateStart");
		String dealConfirmDateEnd = httpServletRequest
				.getParameter("dealConfirmDateEnd");
		String dealDateStart = httpServletRequest.getParameter("dealDateStart");
		String dealDateEnd = httpServletRequest.getParameter("dealDateEnd");
		String contactNo = httpServletRequest.getParameter("contactNo");
		String makeCode = httpServletRequest.getParameter("makeCode");
		String status = httpServletRequest.getParameter("queryContactStatus");
		String dealType = httpServletRequest.getParameter("queryDealType");
		String questionType = httpServletRequest.getParameter("questionType");

		String conditions = "1=1 ";
		conditions += PubFun.buildCondition("companyCode", companyCode);
		conditions += PubFun.buildCondition("creator", creator);
		conditions += PubFun.buildCondition("confirmName", confirmName);
		conditions += PubFun.buildCondition("dealName", dealName);
		// 申请日期
		applyDateEnd = new DateTime(applyDateEnd, DateTime.YEAR_TO_DAY).addDay(
				1).toString(DateTime.YEAR_TO_DAY);

		if ((applyDateStart == null || applyDateStart.equals(""))
				&& (applyDateEnd == null || applyDateEnd.equals(""))) {
		} else if ((applyDateStart == null || applyDateStart.equals(""))
				&& (applyDateEnd != null && !applyDateEnd.equals(""))) {
			conditions += SqlUtils.convertDate("ApplyDate", "<" + applyDateEnd
					+ " 00:00:00");
		} else if ((applyDateStart != null && !applyDateStart.equals(""))
				&& (applyDateEnd == null || applyDateEnd.equals(""))) {
			conditions += SqlUtils.convertDate("ApplyDate", ">="
					+ applyDateStart + " 00:00:00");
		} else {
			conditions += SqlUtils.convertDate("ApplyDate", ">="
					+ applyDateStart + " 00:00:00");
			conditions += SqlUtils.convertDate("ApplyDate", "<" + applyDateEnd
					+ " 00:00:00");
		}
		// 审核日期
		confirmDateEnd = new DateTime(confirmDateEnd, DateTime.YEAR_TO_DAY)
				.addDay(1).toString(DateTime.YEAR_TO_DAY);

		if ((confirmDateStart == null || confirmDateStart.equals(""))
				&& (confirmDateEnd == null || confirmDateEnd.equals(""))) {
		} else if ((confirmDateStart == null || confirmDateStart.equals(""))
				&& (confirmDateEnd != null && !confirmDateEnd.equals(""))) {
			conditions += SqlUtils.convertDate("ConfirmDate", "<"
					+ confirmDateEnd + " 00:00:00");
		} else if ((confirmDateStart != null && !confirmDateStart.equals(""))
				&& (confirmDateEnd == null || confirmDateEnd.equals(""))) {
			conditions += SqlUtils.convertDate("ConfirmDate", ">="
					+ confirmDateStart + " 00:00:00");
		} else {
			conditions += SqlUtils.convertDate("ConfirmDate", ">="
					+ confirmDateStart + " 00:00:00");
			conditions += SqlUtils.convertDate("ConfirmDate", "<"
					+ confirmDateEnd + " 00:00:00");
		}
		// 审批日期
		dealConfirmDateEnd = new DateTime(dealConfirmDateEnd,
				DateTime.YEAR_TO_DAY).addDay(1).toString(DateTime.YEAR_TO_DAY);

		if ((dealConfirmDateStart == null || dealConfirmDateStart.equals(""))
				&& (dealConfirmDateEnd == null || dealConfirmDateEnd.equals(""))) {
		} else if ((dealConfirmDateStart == null || dealConfirmDateStart
				.equals(""))
				&& (dealConfirmDateEnd != null && !dealConfirmDateEnd
						.equals(""))) {
			conditions += SqlUtils.convertDate("DealConfirmDate", "<"
					+ dealConfirmDateEnd + " 00:00:00");
		} else if ((dealConfirmDateStart != null && !dealConfirmDateStart
				.equals(""))
				&& (dealConfirmDateEnd == null || dealConfirmDateEnd.equals(""))) {
			conditions += SqlUtils.convertDate("DealConfirmDate", ">="
					+ dealConfirmDateStart + " 00:00:00");
		} else {
			conditions += SqlUtils.convertDate("DealConfirmDate", ">="
					+ dealConfirmDateStart + " 00:00:00");
			conditions += SqlUtils.convertDate("DealConfirmDate", "<"
					+ dealConfirmDateEnd + " 00:00:00");
		}
		// 处理日期
		dealDateEnd = new DateTime(dealDateEnd, DateTime.YEAR_TO_DAY).addDay(1)
				.toString(DateTime.YEAR_TO_DAY);

		if ((dealDateStart == null || dealDateStart.equals(""))
				&& (dealDateEnd == null || dealDateEnd.equals(""))) {
		} else if ((dealDateStart == null || dealDateStart.equals(""))
				&& (dealDateEnd != null && !dealDateEnd.equals(""))) {
			conditions += SqlUtils.convertDate("DealDate", "<" + dealDateEnd
					+ " 00:00:00");
		} else if ((dealDateStart != null && !dealDateStart.equals(""))
				&& (dealDateEnd == null || dealDateEnd.equals(""))) {
			conditions += SqlUtils.convertDate("DealDate", ">=" + dealDateStart
					+ " 00:00:00");
		} else {
			conditions += SqlUtils.convertDate("DealDate", ">=" + dealDateStart
					+ " 00:00:00");
			conditions += SqlUtils.convertDate("DealDate", "<" + dealDateEnd
					+ " 00:00:00");
		}
		conditions += PubFun.buildCondition("contactNo", contactNo);
		conditions += PubFun.buildCondition("makeCode", makeCode);
		conditions += PubFun.buildCondition("status", status);
		conditions += PubFun.buildCondition("dealType", dealType);
		conditions += PubFun.buildCondition("questionType", questionType);
		UICommonInfo.debug(this, conditions);
		return conditions;
	}

}
