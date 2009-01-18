package com.elongway.pss.ui.dataInput;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIShowWholeSaleAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		String UserName=httpServletRequest.getParameter("UserName");
		String flag=httpServletRequest.getParameter("flag");
		String inputdate=httpServletRequest.getParameter("inputdate");
		LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto=new LwWholeSaleIndicatorDto();
		BLLwWholeSaleIndicatorFacade  blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
		lwWholeSaleIndicatorDto=blLwWholeSaleIndicatorFacade.findByPrimaryKey(UserName, inputdate);
		if(lwWholeSaleIndicatorDto==null){
			
				throw new UserException(-6,-710,this.getClass().getName(),"没没有对用户进行指针录入");
			
		}
		httpServletRequest.setAttribute("lwWholeSaleIndicatorDto", lwWholeSaleIndicatorDto);
		return actionMapping.findForward("wholeSaleUserinput");
	}

}
