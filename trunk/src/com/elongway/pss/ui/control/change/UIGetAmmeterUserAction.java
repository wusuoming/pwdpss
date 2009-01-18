package com.elongway.pss.ui.control.change;

/**
 * 换表查询 Action <br>
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
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwUserAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIGetAmmeterUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		// 销售类型
		String saleType = httpServletRequest.getParameter("saleType");
		// 户号
		String userNo = httpServletRequest.getParameter("userNo");
		// 跳转
		String forward = null;
		Collection collection = null;
		// 直供乡
		if(AppConst.TOWN_SALE_FLAG.equals(saleType)){			
			collection = new BLLwPowerUserFacade().findByConditions(" userNo like '%"+userNo+"%'");
			forward = "forward";
		// 趸售
		}else if(AppConst.WHOLE_SALE_FLAG.equals(saleType)){			
			collection = new BLLwWholeSaleUserInfoFacade().findByConditions(" userNo like '%"+userNo+"%'");
			forward = "forward1";
		// 大工业
		}else {
			collection = new BLLwCoporationUserInfoFacade().findByConditions(" userNo like '%"+userNo+"%'");
			
			forward = "forward2";
		}
		httpServletRequest.setAttribute("userList", collection);

		httpServletRequest.setAttribute("saleType", saleType);
		return actionMapping.findForward(forward);
	}

	
}
