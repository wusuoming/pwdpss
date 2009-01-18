package com.elongway.pss.ui.control.maintenance;

/**
 * ����Ϣά�� Action <br>
 * ɾ��
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-11-03
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

import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwBookUserFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;

public class UIConfigSaveAmmeterBookAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// ��������
		String forward = null;
		LwAmmeterBookDto lwAmmeterBookDto = null;
		LwBookUserDto lwBookUserDto = null;
		BLLwBookUserFacade blLwBookUserFacade = new BLLwBookUserFacade();
		Collection<LwBookUserDto> bookUserList = new ArrayList<LwBookUserDto>();	
		
		// ����ѡ��ı�
		String bookNo = httpServletRequest.getParameter("BookNo");		
		String userNo[] = httpServletRequest.getParameterValues("checkboxSelect");
		String serialNo[] = httpServletRequest.getParameterValues("SerialNo");
		String bookName = httpServletRequest.getParameter("BookName");
		
		
		// ɾ�����б�������
		blLwBookUserFacade.deleteByConditions(" bookNo = '"+bookNo+"'");
		
		// ��֯�µı�����
		for (int i = 0; i < userNo.length; i++) {
			lwBookUserDto = new LwBookUserDto();
			lwBookUserDto.setBookName(bookName);
			lwBookUserDto.setBookNo(bookNo);
			lwBookUserDto.setSerialNo(Integer.parseInt(serialNo[i]));
			lwBookUserDto.setUserNo(userNo[i]);
			bookUserList.add(lwBookUserDto);
		}
		// ��������ɾ��
		blLwBookUserFacade.insertAll(bookUserList);
		forward = "forward";
		return actionMapping.findForward(forward);
	}

	/**
	 * ��֯��ѯ����
	 * qiaoyouliang add 2008-11-03
	 * ֧��ģ����ѯ
	 * @param httpServletRequest
	 * @return
	 */
	public void generateDto(HttpServletRequest httpServletRequest,
			LwAmmeterBookDto lwAmmeterBookDto) {
	
		String bookName = httpServletRequest.getParameter("BookName");
		String remark = httpServletRequest.getParameter("Remark");
		String validStatus = httpServletRequest.getParameter("ValidStatus");
		String bookType = httpServletRequest.getParameter("BookType");

		lwAmmeterBookDto.setBookName(bookName);
		lwAmmeterBookDto.setBookType(bookType);
		lwAmmeterBookDto.setRemark(remark);
		lwAmmeterBookDto.setValidStatus(validStatus);

	}
}
