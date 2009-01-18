package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.domain.BLLwWholeSaleUserInfoAction;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.reference.DBManager;

public class UIEditLWWholeSaleUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String transformerName=httpServletRequest.getParameter("transformerName");
		String voltage=httpServletRequest.getParameter("voltage");
		String company=httpServletRequest.getParameter("company");
		String wholeSaleType=httpServletRequest.getParameter("wholeSaleType");
		String phoneNo=httpServletRequest.getParameter("phoneNo");
		String ifCal=httpServletRequest.getParameter("ifCal");
//		比例分摊信息
		String people=httpServletRequest.getParameter("people");
		String notPeople=httpServletRequest.getParameter("notPeople");
		String business=httpServletRequest.getParameter("business");
		String notFactory=httpServletRequest.getParameter("notFactory");
		String produce=httpServletRequest.getParameter("produce");
		String farm=httpServletRequest.getParameter("farm");
		String lineCode=httpServletRequest.getParameter("lineCode");
		 DBManager dbManager = new DBManager();
		 try{
	            dbManager.open("pssDataSource");
	            dbManager.beginTransaction();
	            //插入记录
		LwWholeSaleUserInfoDto  lwWholeSaleUserInfoDto=new LwWholeSaleUserInfoDto();
		BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
		lwWholeSaleUserInfoDto.setUserNo(transformerName);
		lwWholeSaleUserInfoDto.setVoltage(voltage);
		lwWholeSaleUserInfoDto.setCompany(company);
		lwWholeSaleUserInfoDto.setWholesaletype(wholeSaleType);
		lwWholeSaleUserInfoDto.setPhoneNo(phoneNo);
		lwWholeSaleUserInfoDto.setLineCode(lineCode);
		lwWholeSaleUserInfoDto.setIfCal(ifCal);
		new BLLwWholeSaleUserInfoAction().update(dbManager, lwWholeSaleUserInfoDto);
		
		 dbManager.commitTransaction();
		 }catch(Exception exception){
	            dbManager.rollbackTransaction();
	            throw exception;
	        }finally{
	            dbManager.close();
	        }
		/*String conditions="1=1 and userno='"+transformerName+"'";
		BLLwUserLineFacade  blLwUserLineFacade=new BLLwUserLineFacade();
		blLwUserLineFacade.deleteByConditions(conditions);
		LwUserLineDto  lwUserLineDto=new LwUserLineDto();
		lwUserLineDto.setUserName(transformerName);
		lwUserLineDto.setLineCode(lineCode);*/
		
		return actionMapping.findForward("Success");
		
	}

}
