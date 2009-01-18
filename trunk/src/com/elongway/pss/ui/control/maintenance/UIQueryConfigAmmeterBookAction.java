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

public class UIQueryConfigAmmeterBookAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// ��������
		String forward = null;
		LwAmmeterBookDto lwAmmeterBookDto = null;
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		BLLwPowerUserFacade bLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwBookUserFacade blLwBookUserFacade = new BLLwBookUserFacade();
		Collection checkUserList = null;
		Collection notCheckUserList = null;
		Collection allUserList = null;
		Collection allList = new ArrayList<LwPowerUserDto>();
		String userNo1 = null;
		String userNo2=  null;
		
		// ����ѡ��ı�
		String check[] = httpServletRequest.getParameterValues("checkboxSelect");
		String bookNo = check[0];
		// ��ѯ����Ϣ
		lwAmmeterBookDto = blLwAmmeterBookFacade.findByPrimaryKey(bookNo);
		// ��ѯ����Ӧ�Ļ�����Ϣ
		if ("1".equals(lwAmmeterBookDto.getBookType())) {
			allUserList = bLwPowerUserFacade.findByConditions(" 1=1 ");
		}
		// ѡ���Ѿ����ñ����û�
		checkUserList = blLwBookUserFacade.findByConditions(" bookNo = '"+bookNo+"'");
		for (Iterator iterator = allUserList.iterator(); iterator.hasNext();) {
			LwPowerUserDto dto1 = (LwPowerUserDto) iterator.next();
			userNo1 = dto1.getUserNo();
			for (Iterator iterator2 = checkUserList.iterator(); iterator2
					.hasNext();) {
				LwBookUserDto dto2 = (LwBookUserDto) iterator2.next();
				userNo2 = dto2.getUserNo();
				if(userNo1.equals(userNo2)){
					dto1.setFlag("1");	
					dto1.setSerialNo(dto2.getSerialNo());
					break;
				}			
			}
			allList.add(dto1);
		}
		httpServletRequest.setAttribute("allList", allList);
		httpServletRequest.setAttribute("bookDto", lwAmmeterBookDto);
		
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
