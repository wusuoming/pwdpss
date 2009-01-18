package com.elongway.pss.ui.control.maintenance;

/**
 * 表本信息维护 Action <br>
 * 删除
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
		// 声明变量
		String forward = null;
		LwAmmeterBookDto lwAmmeterBookDto = null;
		LwBookUserDto lwBookUserDto = null;
		BLLwBookUserFacade blLwBookUserFacade = new BLLwBookUserFacade();
		Collection<LwBookUserDto> bookUserList = new ArrayList<LwBookUserDto>();	
		
		// 接受选择的表本
		String bookNo = httpServletRequest.getParameter("BookNo");		
		String userNo[] = httpServletRequest.getParameterValues("checkboxSelect");
		String serialNo[] = httpServletRequest.getParameterValues("SerialNo");
		String bookName = httpServletRequest.getParameter("BookName");
		
		
		// 删除已有表本的配置
		blLwBookUserFacade.deleteByConditions(" bookNo = '"+bookNo+"'");
		
		// 组织新的表本配置
		for (int i = 0; i < userNo.length; i++) {
			lwBookUserDto = new LwBookUserDto();
			lwBookUserDto.setBookName(bookName);
			lwBookUserDto.setBookNo(bookNo);
			lwBookUserDto.setSerialNo(Integer.parseInt(serialNo[i]));
			lwBookUserDto.setUserNo(userNo[i]);
			bookUserList.add(lwBookUserDto);
		}
		// 批量进行删除
		blLwBookUserFacade.insertAll(bookUserList);
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
