package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UICorporationPointerInputAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		// 声明变量
		Collection coltmp = new ArrayList();
		BLLwNewFactoryIndicatorFacade blLwNewFactoryIndicatorFacade = new BLLwNewFactoryIndicatorFacade();
		LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = new LwNewFactoryIndicatorDto();
		
		Collection userIndicatorList = new ArrayList();
		Collection userList = null;
		String statMonth = PowerFeeCal.getCurrentBillMonth();

		
		String conditions = "1=1 order by userno";
		
		userIndicatorList = blLwNewFactoryIndicatorFacade
				.findByConditions(conditions);
		if (userIndicatorList == null || userIndicatorList.size() == 0) {
			throw new UserException(-6, -710, this.getClass().getName(),
					"请先对用户电表指针进行初始化");
		}
	/*	// 查找该公司的所有用户
		userList = bllWholeSaleUserInfoFacade.findByConditions(" company = '"
				+ flag + "'");
		if (userIndicatorList.size() < userList.size()) {
			throw new UserException(-6, -706, this.getClass().getName(),
					"新增的用户或线路还没有进行指针初始化！");
		}*/
		
		for (Iterator iterator = userIndicatorList.iterator(); iterator
				.hasNext();) {
			LwNewFactoryIndicatorDto o1 = (LwNewFactoryIndicatorDto) iterator.next();
			if (!statMonth.equals(o1.getStatMonth())) {
				throw new UserException(-6, -706, this.getClass().getName(),
						"本月数据还没有进行初始化,请先执行月数据初始化功能");
			}
		}
		httpServletRequest.setAttribute("statMonth", statMonth);
		httpServletRequest.setAttribute("allPointer", userIndicatorList);
		return actionMapping.findForward("corporationPointerInput");
	}
}
