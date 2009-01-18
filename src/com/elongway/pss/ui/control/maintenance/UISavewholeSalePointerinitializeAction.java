package com.elongway.pss.ui.control.maintenance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDtoBase;
import com.sun.java_cup.internal.internal_error;

public class UISavewholeSalePointerinitializeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String[] UserName= httpServletRequest.getParameterValues("UserName");
		String[] LastWorkNum= httpServletRequest.getParameterValues("LastWorkNum");
		String[] LastIdleNum= httpServletRequest.getParameterValues("LastIdleNum");
		String[] ThisWorkNum= httpServletRequest.getParameterValues("ThisWorkNum");
		String[] ThisIdleNum= httpServletRequest.getParameterValues("ThisIdleNum");
		String[] Rate= httpServletRequest.getParameterValues("Rate");
		String[] flag= httpServletRequest.getParameterValues("flag");
		String[] ifCal= httpServletRequest.getParameterValues("ifCal");
		String inputdate=httpServletRequest.getParameter("inputdate");
		String  comcode=httpServletRequest.getParameter("comcode");
		
		String conditions="1=1 and STATMONTH='"+inputdate+"'"+"and flag='"+comcode+"'"+" order by userno";
		String conditiona="flag=1 and  userNo='"+UserName+"'";
		BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
		//LwAmmeterChangeDto  lwAmmeterChangeDto=new LwAmmeterChangeDto();
		Collection coltmp=new ArrayList();
		BLLwWholeSaleIndicatorFacade  blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
		LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto=new LwWholeSaleIndicatorDto();
		for(int i=0;i<UserName.length;i++){
			if(!LastWorkNum[i].equals("")&&LastWorkNum[i]!=null&&!LastIdleNum[i].equals("")&&LastIdleNum[i]!=null){
			if(ThisWorkNum[i].equals("")||ThisWorkNum[i]==null){
				ThisWorkNum[i]="0";
				
			}
			if(ThisIdleNum[i].equals("")||ThisIdleNum[i]==null){
			
				ThisIdleNum[i]="0";
			}
			
			lwWholeSaleIndicatorDto.setUserNo(UserName[i]);
			lwWholeSaleIndicatorDto.setLastWorkNum(Double.parseDouble(LastWorkNum[i]));
			lwWholeSaleIndicatorDto.setLastIdleNum(Double.parseDouble(LastIdleNum[i]));
			lwWholeSaleIndicatorDto.setThisWorkNum(Double.parseDouble(LastWorkNum[i]));
			lwWholeSaleIndicatorDto.setThisIdleNum(Double.parseDouble(LastIdleNum[i]));
			lwWholeSaleIndicatorDto.setRate(Double.parseDouble(Rate[i]));
			lwWholeSaleIndicatorDto.setFlag(flag[i]);
			lwWholeSaleIndicatorDto.setStatMonth(inputdate);
			lwWholeSaleIndicatorDto.setIfCal(ifCal[i]);
			
			//lwWholeSaleIndicatorDto.setInputDate(new Date().toString().substring(0, arg1));
			
			coltmp=blLwWholeSaleIndicatorFacade.findByConditions("1=1 and STATMONTH='"+inputdate+"'"+"and flag='"+comcode+"'"+" and UserNo='"+UserName[i]+"'");
	
			if(coltmp.size()==0){
			blLwWholeSaleIndicatorFacade.insert(lwWholeSaleIndicatorDto);
			}
			else{
				blLwWholeSaleIndicatorFacade.update(lwWholeSaleIndicatorDto);
			}
		
			Collection faca=blLwAmmeterChangeFacade.findByConditions(conditiona);
			Iterator fa=faca.iterator();
			while(fa.hasNext()){
				LwAmmeterChangeDto lwAmmeterChangeDto=(LwAmmeterChangeDto)fa.next();
				lwAmmeterChangeDto.setRate(Rate[i]);
				blLwAmmeterChangeFacade.update(lwAmmeterChangeDto);
			}
			}
		}
		String s=flag[0];
		Collection allPointer=new ArrayList();
		allPointer=blLwWholeSaleIndicatorFacade.findByConditions(conditions);
		httpServletRequest.setAttribute("allPointer", allPointer);
		httpServletRequest.setAttribute("s", s);
		return actionMapping.findForward("wholeSalePointerinitializeList");
	}
public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("###0.000");

	double m1 = 668880;
	double m2 = 668880;
	double n1 = 2156040;
	double n2 = 2156040;
	double m3 = m1*m2;
	double n3 = n1*n2;
	double n8 = m3/n3;
	double n9=Math.sqrt(1+n8);
	double n10=1/n9;
	System.out.println(df.format(n10));
}
}
