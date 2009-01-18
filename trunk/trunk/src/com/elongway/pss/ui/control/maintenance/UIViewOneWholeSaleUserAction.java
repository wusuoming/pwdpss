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

import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwUserAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;

public class UIViewOneWholeSaleUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String UserId=httpServletRequest.getParameter("UserId");
		String[] UserIdtmp=UserId.split(",");
		BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
		LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto=new LwWholeSaleUserInfoDto();
		lwWholeSaleUserInfoDto=blLwWholeSaleUserInfoFacade.findByPrimaryKey(UserIdtmp[0]);
		String userNo=lwWholeSaleUserInfoDto.getUserNo() ;
		String conditions="1=1 and flag=1 and userno='"+userNo+"'";
		BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
		LwAmmeterChangeDto  lwAmmeterChangeDto=new LwAmmeterChangeDto();
		Collection ua=new ArrayList();
		ua=blLwAmmeterChangeFacade.findByConditions(conditions);
		Iterator itua=ua.iterator();
		while(itua.hasNext()){
			lwAmmeterChangeDto=(LwAmmeterChangeDto)itua.next();
			
		}
		String condition="1=1 and userno='"+userNo+"'";
	/*	Collection  ul=new ArrayList();
		BLLwUserLineFacade  blLwUserLineFacade=new BLLwUserLineFacade();
		ul=blLwUserLineFacade.findByConditions(condition);*/
/*		httpServletRequest.setAttribute("ul", ul);*/
		httpServletRequest.setAttribute("ua", ua);
		httpServletRequest.setAttribute("lwWholeSaleUserInfoDto", lwWholeSaleUserInfoDto);
		return actionMapping.findForward("viewOneLWWholeSaleUser");
		

}
}
