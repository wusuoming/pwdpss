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
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;

public class UISaveCorporationPointerInputAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String userName= httpServletRequest.getParameter("UserName");
		String userNo= httpServletRequest.getParameter("UserNo");
		String[] ammeterNo= httpServletRequest.getParameterValues("AmmeterNo");
		String[] ThisWorkNum= httpServletRequest.getParameterValues("ThisWorkNum");
		String[] ThisIdleNum= httpServletRequest.getParameterValues("ThisIdleNum");
		String[] LastWorkNum= httpServletRequest.getParameterValues("LastWorkNum");
		String[] LastIdleNum= httpServletRequest.getParameterValues("LastIdleNum");
		String[] Rate= httpServletRequest.getParameterValues("Rate");
		String[] workQuantity= httpServletRequest.getParameterValues("workQuantity");
		String[] unworkQuantity= httpServletRequest.getParameterValues("unworkQuantity");
		String[] AmmeterStyle= httpServletRequest.getParameterValues("useStyle");
		String[] LineLossQuantity= httpServletRequest.getParameterValues("LineLossQuantity");
		String[] TransLossQuantity= httpServletRequest.getParameterValues("TransLossQuantity");
		String[] ChgAmmeterQuantity= httpServletRequest.getParameterValues("ChgAmmeterQuantity");
		String[] LossRate= httpServletRequest.getParameterValues("LossRate");
		//String[] ifCal= httpServletRequest.getParameterValues("ifCal");
		/*String[] ExcepQuantity= httpServletRequest.getParameterValues("ExcepQuantity");*/
		String stopProduce=httpServletRequest.getParameter("stopProduce");
		String[] CompensateQuantity= httpServletRequest.getParameterValues("CompensateQuantity");
		String[] rateCode=httpServletRequest.getParameterValues("rateCode");
		String[] flag= httpServletRequest.getParameterValues("flag");
		String needPointer= httpServletRequest.getParameter("NeedPointer");
		String inputdate=httpServletRequest.getParameter("inputDate");
		String NeedPointer=httpServletRequest.getParameter("NeedPointer");
		String state=httpServletRequest.getParameter("state");
		String day=httpServletRequest.getParameter("day");
		String changeLastWorkNum=httpServletRequest.getParameter("changeLastWorkNum");
		String changeThisWorkNum=httpServletRequest.getParameter("changeThisWorkNum");
		String changeLastIdleNum=httpServletRequest.getParameter("changeLastIdleNum");
		String changeThisIdleNum=httpServletRequest.getParameter("changeThisIdleNum");
		String changeworkQuantity=httpServletRequest.getParameter("changeworkQuantity");
		String changeunworkQuantity=httpServletRequest.getParameter("changeunworkQuantity");
		String changeChgAmmeterQuantity=httpServletRequest.getParameter("changeChgAmmeterQuantity");
		String changeUnChgAmmeterQuantity=httpServletRequest.getParameter("changeUnChgAmmeterQuantity");
		String changeCompensateQuantity=httpServletRequest.getParameter("changeCompensateQuantity");
		String changeUnCompensateQuantity=httpServletRequest.getParameter("changeUnCompensateQuantity");
		String changestate=httpServletRequest.getParameter("changestate");
		String changeday=httpServletRequest.getParameter("changeday");
		String changeDate=httpServletRequest.getParameter("changeDate");
		 
		
		
		String conditions="1=1 and userno='"+userNo+"'";
		BLLwCoporationUserInfoFacade   blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto  lwCoporationUserInfoDto=new LwCoporationUserInfoDto();
		lwCoporationUserInfoDto=blLwCoporationUserInfoFacade.findByPrimaryKey(userNo);
		Collection coltmp=new ArrayList();
		BLLwNewFactoryIndicatorFacade  blLwNewFactoryIndicatorFacade=new BLLwNewFactoryIndicatorFacade();
		LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto=new LwNewFactoryIndicatorDto();
		String conditionone="1=1 and UserNo='"+userNo+"'"+" and AMMETERSTYLE=0";
		Collection colone=blLwNewFactoryIndicatorFacade.findByConditions(conditionone);
		Iterator one=colone.iterator();
		LwNewFactoryIndicatorDto  lwNewFactoryIndicatorDto2=new LwNewFactoryIndicatorDto();
		double needPower=0;
		while(one.hasNext()){
			lwNewFactoryIndicatorDto2=(LwNewFactoryIndicatorDto)one.next();
			needPower+=lwNewFactoryIndicatorDto2.getNeedQuantity();
		}
		BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
		for(int i=0;i<ammeterNo.length;i++){
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
/*			if(LineLossQuantity[i].equals("")||LineLossQuantity[i]==null){
				LineLossQuantity[i]="0";
			}*/
			/*if(TransLossQuantity[i].equals("")||TransLossQuantity[i]==null){
				TransLossQuantity[i]="0";
			}*/
			if(ChgAmmeterQuantity[i].equals("")||ChgAmmeterQuantity[i]==null){
				ChgAmmeterQuantity[i]="0";
			}
			/*if(ExcepQuantity[i].equals("")||ExcepQuantity[i]==null){
				ExcepQuantity[i]="0";
			}*/
			if(CompensateQuantity[i].equals("")||CompensateQuantity[i]==null){
				CompensateQuantity[i]="0";
			}
			/*if(changeThisIdleNum.equals("")||changeThisIdleNum==null){
				changeThisIdleNum="0";
			}*/
		
			
			
			lwNewFactoryIndicatorDto.setUserNo(userNo);
			lwNewFactoryIndicatorDto.setUsername(userName);
			lwNewFactoryIndicatorDto.setAmmeterNo(ammeterNo[i]);
			lwNewFactoryIndicatorDto.setLastWorkNum(Double.parseDouble(LastWorkNum[i]));
			lwNewFactoryIndicatorDto.setLastIdleNum(Double.parseDouble(LastIdleNum[i]));
			lwNewFactoryIndicatorDto.setRate(Double.parseDouble(Rate[i]));
			lwNewFactoryIndicatorDto.setWorkQuantity(workQuantity[i]);
			lwNewFactoryIndicatorDto.setUnworkQuantity(unworkQuantity[i]);
			lwNewFactoryIndicatorDto.setChgAmmeterQuantity(Double.parseDouble(ChgAmmeterQuantity[i]));
			lwNewFactoryIndicatorDto.setAmmeterStyle(AmmeterStyle[i]);
			lwNewFactoryIndicatorDto.setChangeBefore(state);
			
			if(AmmeterStyle[i].equals("0")){
				lwNewFactoryIndicatorDto.setIfChange(stopProduce);
			}
			if(AmmeterStyle[i].equals("0")&&lwCoporationUserInfoDto.getIndustryType().equals("2")){
			lwNewFactoryIndicatorDto.setNeedQuantity(Double.parseDouble(NeedPointer));
			
			}
			if(stopProduce.equals("0")){
				lwNewFactoryIndicatorDto.setThisWorkNum(Double.parseDouble(ThisWorkNum[i]));
				lwNewFactoryIndicatorDto.setThisIdleNum(Double.parseDouble(ThisIdleNum[i]));
			}
			if(stopProduce.equals("1")){
				lwNewFactoryIndicatorDto.setThisWorkNum(Double.parseDouble(changeThisWorkNum));
				lwNewFactoryIndicatorDto.setThisIdleNum(Double.parseDouble(changeThisIdleNum));
				lwNewFactoryIndicatorDto.setDay(day);
				lwNewFactoryIndicatorDto.setChangeDate(changeDate);
				
				lwNewFactoryIndicatorDto.setChangeAfter(changestate);
				lwNewFactoryIndicatorDto.setChangeday(changeday);
				lwNewFactoryIndicatorDto.setChangeWorkPointer(Double.parseDouble(changeLastWorkNum));
				lwNewFactoryIndicatorDto.setChangeunWorkPointer(Double.parseDouble(changeLastIdleNum));
				lwNewFactoryIndicatorDto.setChangeworkQuantity(changeworkQuantity);
				lwNewFactoryIndicatorDto.setChangeUnworkQuantity(changeunworkQuantity);
				lwNewFactoryIndicatorDto.setChageChgAmmeterQuantity(changeChgAmmeterQuantity);
				lwNewFactoryIndicatorDto.setChangeunChgAmmeterQuantity(changeUnChgAmmeterQuantity);
				lwNewFactoryIndicatorDto.setChangeCompensateQuantity(changeCompensateQuantity);
				lwNewFactoryIndicatorDto.setChangeunCompensateQuantity(changeUnCompensateQuantity);
			}
			//lwNewFactoryIndicatorDto.setLineLossQuantity(Double.parseDouble(LineLossQuantity[i]));
		/*	lwWholeSaleIndicatorDto.setExcepQuantity(Double.parseDouble(ExcepQuantity[i]));*/
			
			//lwNewFactoryIndicatorDto.setStatMonth(inputdate);
			//lwNewFactoryIndicatorDto.setTransLossQuantity(Double.parseDouble(TransLossQuantity[i]));
			lwNewFactoryIndicatorDto.setChgAmmeterQuantity(Double.parseDouble(ChgAmmeterQuantity[i]));
			lwNewFactoryIndicatorDto.setCompensateQuantity(Double.parseDouble(CompensateQuantity[i]));
			lwNewFactoryIndicatorDto.setStatMonth(inputdate);
			
			//lwWholeSaleIndicatorDto.setInputDate(new Date().toString().substring(0, arg1));
			
			
			String conditiona="flag=1 and  userNo='"+userNo+"'"+" and AmmeterNo='"+ammeterNo[i]+"'";
			Collection faca=blLwAmmeterChangeFacade.findByConditions(conditiona);
			Iterator fa=faca.iterator();
			while(fa.hasNext()){
				LwAmmeterChangeDto lwAmmeterChangeDto=(LwAmmeterChangeDto)fa.next();
				lwAmmeterChangeDto.setRate(Rate[i]);
				blLwAmmeterChangeFacade.update(lwAmmeterChangeDto);
			}
			
		
			blLwNewFactoryIndicatorFacade.update(lwNewFactoryIndicatorDto);
			
		}
		
		Collection allPointer=new ArrayList();
		allPointer=blLwNewFactoryIndicatorFacade.findByConditions(conditions);
		httpServletRequest.setAttribute("statMonth", inputdate);
		httpServletRequest.setAttribute("allPointer", allPointer);
		httpServletRequest.setAttribute("lwCoporationUserInfoDto", lwCoporationUserInfoDto);
		httpServletRequest.setAttribute("lwNewFactoryIndicatorDto2", lwNewFactoryIndicatorDto2);
		httpServletRequest.setAttribute("needPower", NeedPointer);
		return actionMapping.findForward("Success");
	}

}
