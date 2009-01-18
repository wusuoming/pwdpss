package com.elongway.pss.ui.control.maintenance;
/**
 *线路用户对应信息维护 Action <br>
 * 删除
 * 
 * @author 王荣佳
 * @version 1.0 2008-10-07
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwUserLineFacade;

public class UIDeleteLWUserLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String UserLineNo=httpServletRequest.getParameter("UserLineId");
		String[] UserLine=UserLineNo.split(",");
		
		for(int i=0;i<=UserLine.length;i++){
			String[]  condition=UserLine[i].split(";");
			String UserNo=condition[0];
			String LineCode=condition[1];
			
			BLLwUserLineFacade  blLwUserLineFacade=new BLLwUserLineFacade();
			blLwUserLineFacade.delete(UserNo, LineCode);
		}
		
		return actionMapping.findForward("Success");
}
}