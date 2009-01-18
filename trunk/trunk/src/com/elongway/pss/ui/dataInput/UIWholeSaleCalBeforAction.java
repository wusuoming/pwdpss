package com.elongway.pss.ui.dataInput;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIWholeSaleCalBeforAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

		String comcode=httpServletRequest.getParameter("comcode");
		String conditions="1=1 and ifCal=0 and flag = '"+comcode+"'"+"order by userno";

		BLLwWholeSaleIndicatorFacade blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
		Collection allPointer=new ArrayList();
		allPointer=blLwWholeSaleIndicatorFacade.findByConditions(conditions);
		if(allPointer == null||allPointer.size()==0){
			throw new UserException(-6,-710,this.getClass().getName(),"还没有初始化指针");
		}
		httpServletRequest.setAttribute("allPointer", allPointer);
		return actionMapping.findForward("pathWholeSaleCal");
	}
}
	
