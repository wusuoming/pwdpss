package com.elongway.pss.ui.control.maintenance;

/**
 * 表本信息维护 Action <br>
 * 增加
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

public class UIModifyLWAmmeterBookAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		String forward = null;
		LwAmmeterBookDto lwAmmeterBookDto = null;
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		String check[] = httpServletRequest.getParameterValues("checkboxSelect");
		String flag = httpServletRequest.getParameter("flag");
		

		lwAmmeterBookDto = blLwAmmeterBookFacade.findByPrimaryKey(check[0]);
		
		httpServletRequest.setAttribute("bookDto", lwAmmeterBookDto);
		
		forward = "forward";

		return actionMapping.findForward(forward);
	}

	/**
	 * 组织查询条件
	 * qiaoyouliang add 2008-11-03
	 * 支持模糊查询
	 * @param httpServletRequest
	 * @return
	 */
	public void generateDto(HttpServletRequest httpServletRequest,
			LwAmmeterBookDto lwAmmeterBookDto) {
		String bookNo = httpServletRequest.getParameter("BookNo");
		String bookName = httpServletRequest.getParameter("BookName");
		String remark = httpServletRequest.getParameter("Remark");
		String validStatus = httpServletRequest.getParameter("ValidStatus");
		String bookType = httpServletRequest.getParameter("BookType");

		lwAmmeterBookDto.setBookNo(bookNo);
		lwAmmeterBookDto.setBookName(bookName);
		lwAmmeterBookDto.setBookType(bookType);
		lwAmmeterBookDto.setRemark(remark);
		lwAmmeterBookDto.setValidStatus(validStatus);

	}
}
