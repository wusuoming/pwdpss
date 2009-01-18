package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;

public class UISaveCorporationPointerinitializeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String[] UserName= httpServletRequest.getParameterValues("UserName");
		String[] LastWorkNum= httpServletRequest.getParameterValues("LastWorkNum");
		String[] LastIdleNum= httpServletRequest.getParameterValues("LastIdleNum");
		String[] Rate= httpServletRequest.getParameterValues("Rate");
		String[] AmmeterNo=httpServletRequest.getParameterValues("AmmeterNo");
		String[] UserNo= httpServletRequest.getParameterValues("UserNo");
		String[] AmmeterStyle= httpServletRequest.getParameterValues("AmmeterStyle");
		String inputdate=httpServletRequest.getParameter("inputdate");
		/*String[] UserNo= httpServletRequest.getParameterValues("UserNo");
		String[] UserNo= httpServletRequest.getParameterValues("UserNo");
		String[] UserNo= httpServletRequest.getParameterValues("UserNo");*/
		
		String conditions="1=1 and STATMONTH='"+inputdate+"'";
		Collection coltmp=new ArrayList();
		//BLLwFactoryIndicatorFacade  blLwFactoryIndicatorFacade=new BLLwFactoryIndicatorFacade();
		//LwFactoryIndicatorDto lwFactoryIndicatorDto=new LwFactoryIndicatorDto();
		BLLwNewFactoryIndicatorFacade  blLwNewFactoryIndicatorFacade=new BLLwNewFactoryIndicatorFacade();
		LwNewFactoryIndicatorDto  lwNewFactoryIndicatorDto=new LwNewFactoryIndicatorDto();
		for(int i=0;i<UserName.length;i++){
			if(!LastWorkNum[i].equals("")&&LastWorkNum[i]!=null){
			
				if(LastIdleNum[i].equals("")||LastIdleNum[i]==null){
					LastIdleNum[i]="0";
				}
			
				lwNewFactoryIndicatorDto.setUserNo(UserNo[i]);
				lwNewFactoryIndicatorDto.setAmmeterNo(AmmeterNo[i]);
				lwNewFactoryIndicatorDto.setUsername(UserName[i]);
				lwNewFactoryIndicatorDto.setLastWorkNum(Double.parseDouble(LastWorkNum[i]));
				lwNewFactoryIndicatorDto.setLastIdleNum(Double.parseDouble(LastIdleNum[i]));
				lwNewFactoryIndicatorDto.setRate(Double.parseDouble(Rate[i]));
				lwNewFactoryIndicatorDto.setAmmeterStyle(AmmeterStyle[i]);
				lwNewFactoryIndicatorDto.setStatMonth(inputdate);
				lwNewFactoryIndicatorDto.setThisWorkNum(Double.parseDouble(LastWorkNum[i]));
				lwNewFactoryIndicatorDto.setThisIdleNum(Double.parseDouble(LastIdleNum[i]));
			//lwWholeSaleIndicatorDto.setInputDate(new Date().toString().substring(0, arg1));
			
			coltmp=blLwNewFactoryIndicatorFacade.findByConditions(conditions+" and UserNo='"+UserNo[i]+"'"+"and AmmeterNo='"+AmmeterNo[i]+"'");
			System.out.println("size="+coltmp);
			if(coltmp.size()==0){
				blLwNewFactoryIndicatorFacade.insert(lwNewFactoryIndicatorDto);
			}
			else{
				blLwNewFactoryIndicatorFacade.update(lwNewFactoryIndicatorDto);
			}
			}
		}
	    Collection allPointer=new ArrayList();
		allPointer=blLwNewFactoryIndicatorFacade.findByConditions(conditions);
		httpServletRequest.setAttribute("allPointer", allPointer);
		return actionMapping.findForward("corporationPointerinitialize");
	}
}
