package com.elongway.pss.ui.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.struts.action.Action;

import com.elongway.pss.ui.control.common.pub.SysUser;
import com.elongway.pss.ui.control.common.pub.User;
import com.elongway.pss.ui.view.AbstractForm;
import com.elongway.pss.util.AppConst;

/**
 * 
 * @author xmj
 * @version 1.0 xmj 2004-11-4
 * @version 1.1 yangfuqiang 2006-09-14　使用的地方很少．
 */
public abstract class UIBaseAction extends Action {
	
	public UIBaseAction() {
		super();
	}

	protected DataSource findDataSource() {
		return (DataSource) (servlet.getServletContext().getAttribute("DATASOURCE"));
	}
	
	protected SysUser checkSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		SysUser sysUser = (SysUser)(session.getAttribute(AppConst.SYSUSER_SESSION));
		return sysUser;
	}

	protected void checkPermission(AbstractForm form, HttpServletRequest request) {
		String rgrade = request.getParameter("rgrade");
		String wgrade = request.getParameter("wgrade");
		String xgrade = request.getParameter("xgrade");
		if (rgrade == null) {
			rgrade = form.getRgrade();
			wgrade = form.getWgrade();
			xgrade = form.getXgrade();
		}
		form.setRgrade(rgrade);
		form.setWgrade(wgrade);
		form.setXgrade(xgrade);
		request.setAttribute("rgrade", rgrade);
		request.setAttribute("wgrade", wgrade);
		request.setAttribute("xgrade", xgrade);
	}

	protected void checkPermission(User user, String model, AbstractForm form,
			HttpServletRequest request) {
		//        Power power = new Power();
		//		Collection checklist = user.getCheckList();
		//		BLUserGradeAction userGradeBL = new BLUserGradeAction();
		//		power = userGradeBL.checkPower(model, checklist);
		//		if(power.getRgrade() != null && power.getRgrade() != "")
		//		{
		//            form.setRgrade(power.getRgrade());
		//            form.setWgrade(power.getWgrade());
		//            form.setXgrade(power.getXgrade());
		//        }
		request.setAttribute("rgrade", form.getRgrade());
		request.setAttribute("wgrade", form.getWgrade());
		request.setAttribute("xgrade", form.getXgrade());
	}

	protected void setResponseNoCache(HttpServletResponse response) {
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
	}
}