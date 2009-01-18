package com.elongway.pss.ui.control.change;

/**
 * ���ۻ����ѯ Action <br>
 * 
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-11-07
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.custom.BLDataInitCustomAction;
import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwBookUserFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwUserAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIGetWholeChangeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// ��������
		BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade = new BLLwWholeSaleUserInfoFacade();
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLwWholeSaleIndicatorFacade blLwWholeSaleIndicatorFacade = new BLLwWholeSaleIndicatorFacade();
		BLLwUserLineFacade blLwUserLineFacade = new BLLwUserLineFacade();
		String forward = null;
		String condition = null;
		Collection ammeterList = null;
		LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = null;
		LwUserLineDto lwUserLineDto = null;
		LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = null;
		String statMonth = PowerFeeCal.getCurrentBillMonth();
		// �õ��û�����
		String userNo = httpServletRequest.getParameter("chooseUser");
		// �����û���Ϣ
		lwWholeSaleUserInfoDto = blLwWholeSaleUserInfoFacade
				.findByPrimaryKey(userNo);
		// �����û�����ָ����Ϣ
		Collection saleIndicatorList = blLwWholeSaleIndicatorFacade
				.findByConditions(" 1=1 and userNo = '" + userNo
						+ "' and statMonth = '" + statMonth + "'");
		if (saleIndicatorList != null && saleIndicatorList.size() != 0) {
			Iterator<LwWholeSaleIndicatorDto> it = saleIndicatorList.iterator();
			lwWholeSaleIndicatorDto = (LwWholeSaleIndicatorDto) it.next();
		} else {
			throw new UserException(-6, -705, this.getClass().getName());
		}
		// �����û�����Ӧ�����Ϣ
		ammeterList = blLwAmmeterChangeFacade.findByConditions(" userNo = '"
				+ userNo + "' and flag=1 order by installDate asc");
		int i = 0;
		if (ammeterList == null || ammeterList.size() == 0) {
			throw new UserException(-7, -703, this.getClass().getName(),
					"���û�û�����õ����Ϣ");
		} else {
			for (Iterator iterator = ammeterList.iterator(); iterator.hasNext();) {

				LwAmmeterChangeDto o = (LwAmmeterChangeDto) iterator.next();
				// �������й����޹�ָ�������
				if (AppConst.CURRENT_AMMETER_FLAG.equals(o.getFlag())) {
					o.setLastWorkNum(lwWholeSaleIndicatorDto.getLastWorkNum());
					o.setLastIdleNum(lwWholeSaleIndicatorDto.getLastIdleNum());
					blLwAmmeterChangeFacade.update(o);
					break;
				}
				i++;
			}
		}

		// ��·����
		/*
		 * Collection <LwUserLineDto>userLine =
		 * blLwUserLineFacade.findByConditions(" userNo = '"+userNo+"'"); if
		 * (userLine!=null&&userLine.size()!=0) { Iterator it =
		 * userLine.iterator(); lwUserLineDto = (LwUserLineDto) it.next(); }
		 * else{ throw new UserException(-6,-711,this.getClass().getName()); }
		 */
		httpServletRequest.setAttribute("lwWholeSaleUserInfoDto",
				lwWholeSaleUserInfoDto);
		httpServletRequest.setAttribute("ammeter", ammeterList);
		httpServletRequest.setAttribute("lwUserLineDto", lwUserLineDto);
		forward = "forward";
		return actionMapping.findForward(forward);
	}

}
