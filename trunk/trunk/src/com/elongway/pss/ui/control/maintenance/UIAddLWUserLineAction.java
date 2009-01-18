package com.elongway.pss.ui.control.maintenance;
/**
 *线路用户对应信息维护 Action <br>
 * 增加
 * 
 * @author 王荣佳
 * @version 1.0 2008-10-07
 */

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.ui.view.maintenance.LWUserLineForm;

public class UIAddLWUserLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		LWUserLineForm  lWUserLineForm=(LWUserLineForm)actionForm;
		/*String UserNo=lWUserLineForm.getUserNo();
		String UserName=lWUserLineForm.getUserName();
		String LineCode=lWUserLineForm.getLineCode();
		String ValidStatus=lWUserLineForm.getValidStatus();
		String Remark=lWUserLineForm.getRemark();*/
		String UserNo=httpServletRequest.getParameter("UserNo");
		String UserName=httpServletRequest.getParameter("UserName");
		String LineCode=httpServletRequest.getParameter("LineCode");
		String ValidStatus=httpServletRequest.getParameter("ValidStatus");
		
		String Remark=httpServletRequest.getParameter("Remark");
		BLLwUserLineFacade  blLwUserLineFacade=new BLLwUserLineFacade();
		LwUserLineDto lwUserLineDto=new LwUserLineDto();
		lwUserLineDto.setUserNo(UserNo);
		lwUserLineDto.setUserName(UserName);
		lwUserLineDto.setLineCode(LineCode);
		lwUserLineDto.setValidStatus(ValidStatus);
		lwUserLineDto.setRemark(Remark);
		blLwUserLineFacade.insert(lwUserLineDto);
		
		return actionMapping.findForward("Success");
	}

}
