package com.elongway.pss.ui.control.maintenance;

/**
 * ������Ϣά�� Action <br>
 * ɾ��
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-11-03
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;

public class UIDeleteLWAmmeterBookAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// ��������
		String forward = null;
		LwAmmeterBookDto lwAmmeterBookDto = null;
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		
		String []bookNo = httpServletRequest.getParameterValues("checkboxSelect");
		for (int i = 0; i < bookNo.length; i++) {
			blLwAmmeterBookFacade.delete(bookNo[i]);
		}
		
		forward = "success";

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