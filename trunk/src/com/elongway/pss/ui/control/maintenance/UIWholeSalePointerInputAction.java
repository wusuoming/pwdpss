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

import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIWholeSalePointerInputAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		// ��������
		Collection coltmp = new ArrayList();
		BLLwWholeSaleIndicatorFacade blLwWholeSaleIndicatorFacade = new BLLwWholeSaleIndicatorFacade();
		LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = new LwWholeSaleIndicatorDto();
		BLLwWholeSaleUserInfoFacade bllWholeSaleUserInfoFacade = new BLLwWholeSaleUserInfoFacade();
		Collection userIndicatorList = new ArrayList();
		Collection userList = null;
		String statMonth = PowerFeeCal.getCurrentBillMonth();

		// ���۹�˾ gy�����ȹ�˾
		String flag = httpServletRequest.getParameter("flag");
		String conditions = "1=1 and flag='" + flag + "'"+"order by userno";

		userIndicatorList = blLwWholeSaleIndicatorFacade
				.findByConditions(conditions);
		if (userIndicatorList == null || userIndicatorList.size() == 0) {
			throw new UserException(-6, -710, this.getClass().getName(),
					"���ȶ��û����ָ����г�ʼ��");
		}
	/*	// ���Ҹù�˾�������û�
		userList = bllWholeSaleUserInfoFacade.findByConditions(" company = '"
				+ flag + "'");
		if (userIndicatorList.size() < userList.size()) {
			throw new UserException(-6, -706, this.getClass().getName(),
					"�������û�����·��û�н���ָ���ʼ����");
		}*/
		
		for (Iterator iterator = userIndicatorList.iterator(); iterator
				.hasNext();) {
			LwWholeSaleIndicatorDto o1 = (LwWholeSaleIndicatorDto) iterator.next();
			if (!statMonth.equals(o1.getStatMonth())) {
				throw new UserException(-6, -706, this.getClass().getName(),
						"�������ݻ�û�н��г�ʼ��,����ִ�������ݳ�ʼ������");
			}
		}

		httpServletRequest.setAttribute("allPointer", userIndicatorList);
		return actionMapping.findForward("pathWholeSaleInput");
	}

}
