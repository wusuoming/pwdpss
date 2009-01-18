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

public class UIaddLWAmmeterBookAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        // 声明变量
		String forward = null;
		LwAmmeterBookDto lwAmmeterBookDto = null;
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		
		
			lwAmmeterBookDto = new LwAmmeterBookDto();
			// 组织DTO
			this.generateDto(httpServletRequest, lwAmmeterBookDto);
			// 插入操作
			blLwAmmeterBookFacade.insert(lwAmmeterBookDto);
			forward = "addSuccess";
		
		return actionMapping.findForward(forward);
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
