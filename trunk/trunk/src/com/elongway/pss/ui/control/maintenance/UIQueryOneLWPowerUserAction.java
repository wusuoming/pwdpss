package com.elongway.pss.ui.control.maintenance;
/**
 *�����û���Ϣά�� Action <br>
 * ��ѯ
 * 
 * @author ���ټ�
 * @version 1.0 2008-10-07
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

import com.elongway.pss.bl.action.domain.BLLwProrateAction;
import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwBookUserFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;
import com.elongway.pss.util.AppConst;

public class UIQueryOneLWPowerUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		// ��������
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		BLLwBookUserFacade blLwBookUserFacade = new BLLwBookUserFacade();
		BLLwUserLineFacade blLwUserLineFacade = new BLLwUserLineFacade();
		BLLwPowerUserFacade  blLwPowerUserFacade=new BLLwPowerUserFacade();
		BLLwProrateFacade blLwProrateFacade = new BLLwProrateFacade();
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		LwBookUserDto lwBookUserDto = null;		
	//	LwUserLineDto lwUserLineDto = null;
		LwProrateDto lwProrateDto = null;
		LwAmmeterChangeDto lwAmmeterChangeDto = null;
		// �õ��û�����		
		String userNo=httpServletRequest.getParameter("UserId");
		String[]userNoArray = userNo.split(",");

		// �����û�������Ϣ
		LwPowerUserDto lwPowerUserDto=blLwPowerUserFacade.findByPrimaryKey(userNoArray[0]);
		// ��·����
//		Collection <LwUserLineDto>userLine = blLwUserLineFacade.findByConditions(" userNo = '"+userNoArray[0]+"'");
//		if (userLine!=null) {
//			Iterator it = userLine.iterator();
//			lwUserLineDto = (LwUserLineDto) it.next();
//		}
		// ����Ϣ
		Collection<LwAmmeterBookDto> bookList = blLwAmmeterBookFacade.findByConditions(" 1=1 ");
	    // ���ڱ�
		Collection <LwBookUserDto>colleciton = blLwBookUserFacade.findByConditions(" userNo = '"+userNoArray[0]+"'");
		if (colleciton!=null) {
			Iterator<LwBookUserDto>it = colleciton.iterator();
		 lwBookUserDto = (LwBookUserDto) it.next();
		}
		// ������̯
		lwProrateDto = blLwProrateFacade.findByPrimaryKey(userNoArray[0]);
		// �����Ϣ
		Collection ammeterList = blLwAmmeterChangeFacade.findByConditions("userNo = '"+userNoArray[0]+"' and flag = '"+AppConst.CURRENT_AMMETER_FLAG+"'");
		if (ammeterList!=null) {
			Iterator<LwAmmeterChangeDto>it = ammeterList.iterator();
			lwAmmeterChangeDto = (LwAmmeterChangeDto) it.next();
		}
		httpServletRequest.setAttribute("lwBookUserDto", lwBookUserDto);
		httpServletRequest.setAttribute("lwPowerUserDto", lwPowerUserDto);
	//	httpServletRequest.setAttribute("lwUserLineDto", lwUserLineDto);
		httpServletRequest.setAttribute("bookList", bookList);
		httpServletRequest.setAttribute("lwProrateDto", lwProrateDto);
		httpServletRequest.setAttribute("lwAmmeterChangeDto", lwAmmeterChangeDto);
		return actionMapping.findForward("viewOnePowerUser");
	}

}
