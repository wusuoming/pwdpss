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
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;

public class UISaveWholeSalePointerInputAction extends Action {
	
	
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String[] UserName= httpServletRequest.getParameterValues("UserName");
		String[] ThisWorkNum= httpServletRequest.getParameterValues("ThisWorkNum");
		String[] ThisIdleNum= httpServletRequest.getParameterValues("ThisIdleNum");
		String[] LastWorkNum= httpServletRequest.getParameterValues("LastWorkNum");
		String[] LastIdleNum= httpServletRequest.getParameterValues("LastIdleNum");
		String[] Rate= httpServletRequest.getParameterValues("Rate");
		String[] workQuantity= httpServletRequest.getParameterValues("workQuantity");
		String[] unworkQuantity= httpServletRequest.getParameterValues("unworkQuantity");
		String[] LineLossQuantity= httpServletRequest.getParameterValues("LineLossQuantity");
		String[] TransLossQuantity= httpServletRequest.getParameterValues("TransLossQuantity");
		String[] unTransLossQuantity= httpServletRequest.getParameterValues("unTransLossQuantity");
		String[] ChgAmmeterQuantity= httpServletRequest.getParameterValues("ChgAmmeterQuantity");
		
		String[] UnChgAmmeterQuantity= httpServletRequest.getParameterValues("UnChgAmmeterQuantity");
		String[] LossRate= httpServletRequest.getParameterValues("LossRate");
		String[] ifCal= httpServletRequest.getParameterValues("ifCal");
		/*String[] ExcepQuantity= httpServletRequest.getParameterValues("ExcepQuantity");*/
		String[] CompensateQuantity= httpServletRequest.getParameterValues("CompensateQuantity");
		String[] rateCode=httpServletRequest.getParameterValues("rateCode");
		String[] flag= httpServletRequest.getParameterValues("flag");
		String inputdate=httpServletRequest.getParameter("inputdate");
		String[] Remark= httpServletRequest.getParameterValues("Remark");
		String[] differenceQuantity= httpServletRequest.getParameterValues("differenceQuantity"); 
		String[] UnCompensateQuantity= httpServletRequest.getParameterValues("UnCompensateQuantity");
		String conditions="1=1 and flag='"+flag[0]+"'"+"order by userno";
		Collection coltmp=new ArrayList();
		BLLwWholeSaleIndicatorFacade  blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
		LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto=new LwWholeSaleIndicatorDto();
		BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
		for(int i=0;i<UserName.length;i++){
			if(UnChgAmmeterQuantity[i].equals("")||UnChgAmmeterQuantity[i]==null){
				UnChgAmmeterQuantity[i]="0";
			}
			if(UnCompensateQuantity[i].equals("")||UnCompensateQuantity[i]==null){
				UnCompensateQuantity[i]="0";
			}
			if(ThisWorkNum[i].equals("")||ThisWorkNum[i]==null){
				ThisWorkNum[i]="0";
			}
			if(ThisIdleNum[i].equals("")||ThisIdleNum[i]==null){
				ThisIdleNum[i]="0";
			}
			if(Rate[i].equals("")||Rate[i]==null){
				Rate[i]="0";
			}
			if(LastWorkNum[i].equals("")||LastWorkNum[i]==null){
				LastWorkNum[i]="0";
			}
			if(LastIdleNum[i].equals("")||LastIdleNum[i]==null){
				LastIdleNum[i]="0";
			}
			if(workQuantity[i].equals("")||workQuantity[i]==null){
				workQuantity[i]="0";
			}
			if(unworkQuantity[i].equals("")||unworkQuantity[i]==null){
				unworkQuantity[i]="0";
			}
			if(LineLossQuantity[i].equals("")||LineLossQuantity[i]==null){
				LineLossQuantity[i]="0";
			}
			if(TransLossQuantity[i].equals("")||TransLossQuantity[i]==null){
				TransLossQuantity[i]="0";
			}
			if(unTransLossQuantity[i].equals("")||unTransLossQuantity[i]==null){
				unTransLossQuantity[i]="0";
			}
			if(ChgAmmeterQuantity[i].equals("")||ChgAmmeterQuantity[i]==null){
				ChgAmmeterQuantity[i]="0";
			}
			/*if(ExcepQuantity[i].equals("")||ExcepQuantity[i]==null){
				ExcepQuantity[i]="0";
			}*/
			if(CompensateQuantity[i].equals("")||CompensateQuantity[i]==null){
				CompensateQuantity[i]="0";
			}
			if(LossRate[i].equals("")||LossRate[i]==null){
				LossRate[i]="0";
			}
			if(differenceQuantity[i].equals("")||differenceQuantity[i]==null){
				differenceQuantity[i]="0";
			}
			
			
			lwWholeSaleIndicatorDto.setUserNo(UserName[i]);
			lwWholeSaleIndicatorDto.setIfCal(ifCal[i]);
			lwWholeSaleIndicatorDto.setThisWorkNum(Double.parseDouble(ThisWorkNum[i]));
			lwWholeSaleIndicatorDto.setLastWorkNum(Double.parseDouble(LastWorkNum[i]));
			lwWholeSaleIndicatorDto.setThisIdleNum(Double.parseDouble(ThisIdleNum[i]));
			lwWholeSaleIndicatorDto.setLastIdleNum(Double.parseDouble(LastIdleNum[i]));
			lwWholeSaleIndicatorDto.setUnChgAmmeterQuantity(Double.parseDouble(UnChgAmmeterQuantity[i]));
			lwWholeSaleIndicatorDto.setUnCompensateQuantity(Double.parseDouble(UnCompensateQuantity[i]));
			lwWholeSaleIndicatorDto.setRate(Double.parseDouble(Rate[i]));
			lwWholeSaleIndicatorDto.setWorkQuantity(workQuantity[i]);
			lwWholeSaleIndicatorDto.setUnworkQuantity(unworkQuantity[i]);
			lwWholeSaleIndicatorDto.setChgAmmeterQuantity(Double.parseDouble(ChgAmmeterQuantity[i]));
			lwWholeSaleIndicatorDto.setLineLossQuantity(Double.parseDouble(LineLossQuantity[i]));
			lwWholeSaleIndicatorDto.setUnTransLossQuantity(Double.parseDouble(unTransLossQuantity[i]));
		/*	lwWholeSaleIndicatorDto.setExcepQuantity(Double.parseDouble(ExcepQuantity[i]));*/
			lwWholeSaleIndicatorDto.setFlag(flag[i]);
			lwWholeSaleIndicatorDto.setStatMonth(inputdate);
			lwWholeSaleIndicatorDto.setTransLossQuantity(Double.parseDouble(TransLossQuantity[i]));
			lwWholeSaleIndicatorDto.setChgAmmeterQuantity(Double.parseDouble(ChgAmmeterQuantity[i]));
			lwWholeSaleIndicatorDto.setCompensateQuantity(Double.parseDouble(CompensateQuantity[i]));
			lwWholeSaleIndicatorDto.setPowerCode(Double.parseDouble(rateCode[i]));
			lwWholeSaleIndicatorDto.setRemark(Remark[i]);
			lwWholeSaleIndicatorDto.setDifferenceQuantity(differenceQuantity[i]);
			//lwWholeSaleIndicatorDto.setInputDate(new Date().toString().substring(0, arg1));
			
			
			String conditiona="flag=1 and  userNo='"+UserName[i]+"'";
			Collection faca=blLwAmmeterChangeFacade.findByConditions(conditiona);
			Iterator fa=faca.iterator();
			while(fa.hasNext()){
				LwAmmeterChangeDto lwAmmeterChangeDto=(LwAmmeterChangeDto)fa.next();
				lwAmmeterChangeDto.setRate(Rate[i]);
				blLwAmmeterChangeFacade.update(lwAmmeterChangeDto);
			}
			
		
				blLwWholeSaleIndicatorFacade.update(lwWholeSaleIndicatorDto);
			
		}
		Collection allPointer=new ArrayList();
		allPointer=blLwWholeSaleIndicatorFacade.findByConditions(conditions);
		httpServletRequest.setAttribute("allPointer", allPointer);
		return actionMapping.findForward("pathWholeSaleInput");
	}

}
