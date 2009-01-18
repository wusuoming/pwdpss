package com.elongway.pss.ui.control.datainit.corporation;

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
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.custom.BLDataInitCustomAction;
import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwBookUserFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.util.PowerFeeCal;

public class UIFactoryMonthDataInitAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		String forward = null;
		String statMonth = PowerFeeCal.getCurrentBillMonth();

		String type = httpServletRequest.getParameter("type");
		BLDataInitCustomAction blDataInitCustomAction = new BLDataInitCustomAction();
		if(type.equals("town")){
		// 初始化直供乡当月数据
		blDataInitCustomAction.initTownMonthData(statMonth);
		}else if(type.equals("sale")){
		// 初始化趸售当月数据
		blDataInitCustomAction.initWholeSaleMonthData(statMonth);
		}else  if(type.equals("factory")){
		// 初始化大工业当月数据
		blDataInitCustomAction.initFactoryMonthData(statMonth);
		}
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
