package com.elongway.pss.ui.control.maintenance;
/**
 * 表本信息维护 Action <br>
 * 增加
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
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;

public class UIQueryLWAmmeterBookAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        // 声明变量
		String condition = null;
		String forward = null;
		LwAmmeterBookDto lwAmmeterBookDto = null;
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
				
		// -- 组织条件
		condition = this.generateCondition(httpServletRequest);
		// -- 查询
		Collection  <LwAmmeterBookDto>bookList=blLwAmmeterBookFacade.findByConditions(condition);
		httpServletRequest.setAttribute("bookList", bookList);
		forward = "queryBookList";
	
		return actionMapping.findForward(forward);
	}
	/**
	 * 组织查询条件
	 * qiaoyouliang add 2008-11-03
	 * 支持模糊查询
	 * @param httpServletRequest
	 * @return
	 */
	public String generateCondition(HttpServletRequest httpServletRequest){
		String bookNo=httpServletRequest.getParameter("BookNo");
		String bookName=httpServletRequest.getParameter("BookName");
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(" 1=1 ");
		// 支持模糊查询
		if(bookNo!=null&&!"".equals(bookNo)){
			buffer.append(" and ").append(" BookNo like '%").append(bookNo.trim()).append("%'");
		}
		if(bookName!=null&&!"".equals(bookName)){
			buffer.append(" and ").append(" BookName like '%").append(bookName.trim()).append("%'");
		}
		
		return buffer.toString();
		
	}
	/**
	 * 组织查询条件
	 * qiaoyouliang add 2008-11-03
	 * 支持模糊查询
	 * @param httpServletRequest
	 * @return
	 */
	public void generateDto(HttpServletRequest httpServletRequest,LwAmmeterBookDto lwAmmeterBookDto){
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
