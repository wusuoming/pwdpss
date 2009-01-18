package com.elongway.pss.ui.control.feeappend.town;

/**
 * ֱ����׷�յ���б��� Action <br>
 * 
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-12-16
 */

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorAppendFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UITownFeeAppendCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// ��������
		String townCode = null;
		String forward = null;
		String inputDate = null;
		Collection<LwPowerUserDto> userList = null;
		Collection<LwTownIndicatorDto> indicatorList = null;
		StringBuffer conditions = new StringBuffer();
		String statMonth = null;
		String appendDate = null;
		LwPowerUserDto lwPowerUserDto = null;
		LwTownIndicatorAppendDto lwTownIndicatorAppendDto = null;
		String voltLevel = null;
		Collection priceList = null;
		LwTownIndicatorDto lwTownIndicatorDto = null;
		BLCalPowerFeeCustomFacade bllwCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwTownIndicatorAppendFacade blLwTownIndicatorAppendFacade = new BLLwTownIndicatorAppendFacade();
		BLLwTownIndicatorFacade blLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		/***********************************************************************
		 * ��1 -- ȡ�ñ���ֵ��
		 **********************************************************************/
		// �õ��û�
		String[] userNo = httpServletRequest.getParameterValues("userNo");
		// �����й�ָ��
		String[] thisWorkNum = httpServletRequest
				.getParameterValues("thisWorkNum");
		// �����й�ָ��
		String[] lastWorkNum = httpServletRequest
				.getParameterValues("lastWorkNum");
		// ���г���ָ��
		String[] midWorkNum = httpServletRequest
				.getParameterValues("midWorkNum");
		// ����
		String[] rate = httpServletRequest.getParameterValues("rate");
		// ׷�Ӽ������
		String[] appendQuantity = httpServletRequest
				.getParameterValues("appendQuantity");
		// ͳ������
		statMonth = PowerFeeCal.getCurrentBillMonth();
		// ׷������
		appendDate = httpServletRequest.getParameter("statMonth");
		LwAmmeterChangeDto dto = null;
		bllwCalPowerFeeCustomFacade.calAppendTownFee(lwTownIndicatorAppendDto);
		
		forward = "forward";
		return actionMapping.findForward(forward);
	}

}
