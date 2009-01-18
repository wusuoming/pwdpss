package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.custom.BLPwdEncodeAction;
import com.elongway.pss.bl.facade.BLLwSysUserFacade;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIAddUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String USERCODE=httpServletRequest.getParameter("USERCODE");
		String USERNAME=httpServletRequest.getParameter("USERNAME");
		String PASSWORD=httpServletRequest.getParameter("PASSWORD");
		String PASSWORD1=httpServletRequest.getParameter("PASSWORD1");
		String USERGRADE=httpServletRequest.getParameter("USERGRADE");
		String VALIDSTATUS=httpServletRequest.getParameter("VALIDSTATUS");
		String oldpassword=httpServletRequest.getParameter("oldpassword");
		LwSysUserDto lwSysUserDto=new LwSysUserDto();
		lwSysUserDto.setUserCode(USERCODE);
		lwSysUserDto.setUserGrade(USERGRADE);
		lwSysUserDto.setUserName(USERNAME);
		lwSysUserDto.setValidStatus(VALIDSTATUS);
		
	
		
			lwSysUserDto.setPassword(new BLPwdEncodeAction().fenCode(PASSWORD));
		
		BLLwSysUserFacade  blLwSysUserFacade=new BLLwSysUserFacade();
		Collection user=new ArrayList();
		user=blLwSysUserFacade.findByConditions("");
		Iterator it =user.iterator();
		if(it.hasNext()){
			
			LwSysUserDto lwSysUserDto1=new LwSysUserDto();
			if(USERCODE.equals(lwSysUserDto1.getUserCode())){
				throw new UserException(-6,-710,this.getClass().getName(),"用户已存在");
			}
		}
		blLwSysUserFacade.insert(lwSysUserDto);
		return actionMapping.findForward("Success");
		
}
}
