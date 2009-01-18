package com.elongway.pss.ui.control.feeappend.town;

/**
 * 追收电费查询 Action <br>
 * 
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-12-16
 */

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwDcodeFacade;

public class UIFeeAppendFirstQueryAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		String flag = null;
		String forward = null;
		flag = httpServletRequest.getParameter("flag");
		if("town".equals(flag)){
			BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
            Collection collection = blLwDcodeFacade.findByConditions(" codetype = 'TownCode'");       
            httpServletRequest.setAttribute("collection", collection);
			forward = "queryTownFeeAppendFirst";
		}
		else if ("whole".equals(flag)){
			
		}else {
			
		}
		return actionMapping.findForward(forward);
	}

	
}
