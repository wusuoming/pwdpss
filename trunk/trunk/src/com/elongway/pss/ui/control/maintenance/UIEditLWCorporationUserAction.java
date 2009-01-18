package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.domain.BLLwCoporationUserInfoAction;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.reference.DBManager;

public class UIEditLWCorporationUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String userNo = httpServletRequest.getParameter("UserNo");
		
		String userName = httpServletRequest.getParameter("UserName");
		String address = httpServletRequest.getParameter("Address");
		String accountBank = httpServletRequest.getParameter("accountBank");
		String taxNo = httpServletRequest.getParameter("taxNo");
		String accountNo = httpServletRequest.getParameter("accountNo");
		String industryType = httpServletRequest.getParameter("industryType");
		String voltage = httpServletRequest.getParameter("voltage");
		String lineNo = httpServletRequest.getParameter("lineCode");
		String xuliangRate = httpServletRequest.getParameter("xuliangRate");
		String rongliangPower = httpServletRequest.getParameter("rongliangPower");
		
		String shengChanpriceStyle	=httpServletRequest.getParameter("shengChanpriceStyle");
		String shengChanKV	=httpServletRequest.getParameter("shengChanKV");
		String tingChanpriceStyle	=httpServletRequest.getParameter("tingChanpriceStyle");
		String tingChanKV	=httpServletRequest.getParameter("tingChanKV");
		String shengChanPrice	=httpServletRequest.getParameter("shengChanPrice");
		String tingChanRongliangPrice	=httpServletRequest.getParameter("tingChanRongliangPrice");
		String shengChanRongliangPrice	=httpServletRequest.getParameter("shengChanRongliangPrice");
		String tingChanDianJinPrice	=httpServletRequest.getParameter("tingChanDianJinPrice");
		String shengChanDianJinPrice	=httpServletRequest.getParameter("shengChanDianJinPrice");
		String dianJinPower	=httpServletRequest.getParameter("dianJinPower");
		
		String pepoleFlag	=httpServletRequest.getParameter("pepoleFlag");
		String pepolePower	=httpServletRequest.getParameter("pepolePower");
		String lineLossScale	=httpServletRequest.getParameter("lineLossScale");
		

		 DBManager dbManager = new DBManager();
		 try{
	            dbManager.open("pssDataSource");
	            dbManager.beginTransaction();
	            //²åÈë¼ÇÂ¼
		LwCoporationUserInfoDto lwCoporationUserInfoDto = new LwCoporationUserInfoDto();
		lwCoporationUserInfoDto.setUserNo(userNo);
		lwCoporationUserInfoDto.setUserName(userName);
		lwCoporationUserInfoDto.setAddress(address);
		lwCoporationUserInfoDto.setAccountBank(accountBank);
		lwCoporationUserInfoDto.setTaxNo(taxNo);
		lwCoporationUserInfoDto.setIndustryType(industryType);
		lwCoporationUserInfoDto.setAccountNo(accountNo);
		lwCoporationUserInfoDto.setVoltage(voltage);
		lwCoporationUserInfoDto.setLineNo(lineNo);
		if(industryType.equals("1")){
		lwCoporationUserInfoDto.setRongliangPower(Integer.parseInt(rongliangPower));
		}
		if(industryType.equals("2")){
		lwCoporationUserInfoDto.setNeedRate(Integer.parseInt(xuliangRate));
		}
		lwCoporationUserInfoDto.setShengChanPrice(shengChanpriceStyle);
		lwCoporationUserInfoDto.setShengChanKV(shengChanKV);
		lwCoporationUserInfoDto.setTingChanPrice(tingChanpriceStyle);
		lwCoporationUserInfoDto.setTingChanKV(tingChanKV);
		lwCoporationUserInfoDto.setShengChandianJinPrice(Double.parseDouble(shengChanDianJinPrice));
		lwCoporationUserInfoDto.setTingChandianJinPrice(Double.parseDouble(tingChanDianJinPrice));
		lwCoporationUserInfoDto.setShengChanrongLiangPrice(Double.parseDouble(shengChanRongliangPrice));
		lwCoporationUserInfoDto.setTingChanrongLiangPrice(Double.parseDouble(tingChanRongliangPrice));
		lwCoporationUserInfoDto.setPepoleFlag(pepoleFlag);
		lwCoporationUserInfoDto.setPepolePower(pepolePower);
		lwCoporationUserInfoDto.setLineLossScale(Double.parseDouble(lineLossScale));	
		lwCoporationUserInfoDto.setDianJinPower(dianJinPower);
		BLLwCoporationUserInfoFacade  blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		new BLLwCoporationUserInfoAction().update(dbManager, lwCoporationUserInfoDto);
		/*LwUserLineDto lwUserLineDto=new LwUserLineDto();
		BLLwUserLineFacade blLwUserLineFacade=new BLLwUserLineFacade();*/
		//LwAmmeterChangeDto plwAmmeterChangeDto=new LwAmmeterChangeDto();
		//BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
		dbManager.commitTransaction();
		 }catch(Exception exception){
	            dbManager.rollbackTransaction();
	            throw exception;
	        }finally{
	            dbManager.close();
	        }
		String condtions="1=1 and  and USERNO='"+userNo+"'";
	/*	blLwUserLineFacade.deleteByConditions(condtions);
		lwUserLineDto.setUserNo(userNo);
		lwUserLineDto.setLineCode(lineNo);
		blLwUserLineFacade.insert(lwUserLineDto);*/
		
		return actionMapping.findForward("Success");

	}
}
