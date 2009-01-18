package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.domain.BLLwAmmeterChangeAction;
import com.elongway.pss.bl.action.domain.BLLwCoporationUserInfoAction;
import com.elongway.pss.bl.action.domain.BLLwWholeSaleUserInfoAction;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.reference.DBManager;

public class UIAddLWCorporationAction extends Action {
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
		if(xuliangRate.equals("") || xuliangRate==null){
			xuliangRate = "0";
		}
		String rongliangPower = httpServletRequest.getParameter("rongliangPower");
		if(rongliangPower.equals("") || rongliangPower==null){
			rongliangPower = "0";
		}
		String shengChanpriceStyle	=httpServletRequest.getParameter("shengChanpriceStyle");
		String shengChanKV	=httpServletRequest.getParameter("shengChanKV");
		String tingChanpriceStyle	=httpServletRequest.getParameter("tingChanpriceStyle");
		String tingChanKV	=httpServletRequest.getParameter("tingChanKV");
		String shengChanPrice	=httpServletRequest.getParameter("shengChanPrice");
		String tingChanRongliangPrice	=httpServletRequest.getParameter("tingChanRongliangPrice");
		if(tingChanRongliangPrice.equals("") || tingChanRongliangPrice==null){
			tingChanRongliangPrice = "0";
		}
		String shengChanRongliangPrice	=httpServletRequest.getParameter("shengChanRongliangPrice");
		if(shengChanRongliangPrice.equals("") || shengChanRongliangPrice == null){
			shengChanRongliangPrice = "0";
		}
		String tingChanDianJinPrice	=httpServletRequest.getParameter("tingChanDianJinPrice");
		if(tingChanDianJinPrice.equals("") || tingChanDianJinPrice==null){
			tingChanDianJinPrice = "0";
		}
		String shengChanDianJinPrice	=httpServletRequest.getParameter("shengChanDianJinPrice");
		if(shengChanDianJinPrice.equals("") || shengChanDianJinPrice == null){
			shengChanDianJinPrice = "0";
		}
		String dianJinPower	=httpServletRequest.getParameter("dianJinPower");
		
		String pepoleFlag	=httpServletRequest.getParameter("pepoleFlag");
		String pepolePower	=httpServletRequest.getParameter("pepolePower");
		String lineLossScale	=httpServletRequest.getParameter("lineLossScale");
		if(lineLossScale.equals("") || lineLossScale == null){
			lineLossScale = "0";
		}
		
		
		String[] ammeterNo = httpServletRequest.getParameterValues("ammeterNo");
		String[] ammeterX = httpServletRequest.getParameterValues("ammeterX");
		String[] ammeterV = httpServletRequest.getParameterValues("ammeterV");
		String[] ammeterA = httpServletRequest.getParameterValues("ammeterA");
		String[] ammeterType = httpServletRequest.getParameterValues("ammeterType");
		String[] factoryName = httpServletRequest.getParameterValues("factoryName");
		String[] factoryCcode = httpServletRequest.getParameterValues("factoryCcode");
		String[] coust = httpServletRequest.getParameterValues("coust");
		String[] PT = httpServletRequest.getParameterValues("PT");
		String[] CT = httpServletRequest.getParameterValues("CT");
		String[] rate = httpServletRequest.getParameterValues("rate");
		String[] ammeterStyle = httpServletRequest.getParameterValues("ammeterStyle");
		String[] inputdate = httpServletRequest.getParameterValues("inputdate");
		
		 DBManager dbManager = new DBManager();
		 try{
	            dbManager.open("pssDataSource");
	            dbManager.beginTransaction();
		LwCoporationUserInfoDto lwCoporationUserInfoDto = new LwCoporationUserInfoDto();
		lwCoporationUserInfoDto.setUserNo(userNo);
		lwCoporationUserInfoDto.setUserName(userName);
		lwCoporationUserInfoDto.setAddress(address);
		lwCoporationUserInfoDto.setAccountBank(accountBank);
		lwCoporationUserInfoDto.setTaxNo(taxNo);
		lwCoporationUserInfoDto.setIndustryType(industryType);
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
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		if(blLwCoporationUserInfoFacade.findByPrimaryKey(userNo)==null){
		new BLLwCoporationUserInfoAction().insert(dbManager, lwCoporationUserInfoDto);
		}
		if(blLwCoporationUserInfoFacade.findByPrimaryKey(userNo)!=null){
			new BLLwCoporationUserInfoAction().update(dbManager, lwCoporationUserInfoDto);
		}
		
		LwAmmeterChangeDto lwAmmeterChangeDto=new LwAmmeterChangeDto();
		
		BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
		for(int i=1;i<ammeterNo.length;i++){
		lwAmmeterChangeDto.setId(new Long(System.currentTimeMillis()).toString())	;
		lwAmmeterChangeDto.setUserNo(userNo);
		lwAmmeterChangeDto.setUserName(userName);
		lwAmmeterChangeDto.setAmmeterA(ammeterA[i]);
		lwAmmeterChangeDto.setAmmeterNo(ammeterNo[i]);
		lwAmmeterChangeDto.setAmmeterV(ammeterV[i]);
		lwAmmeterChangeDto.setAmmeterX(ammeterX[i]);
		lwAmmeterChangeDto.setCoust(coust[i]);
		lwAmmeterChangeDto.setFactoryCcode(factoryCcode[i]);
		lwAmmeterChangeDto.setFactoryName(factoryName[i]);
		lwAmmeterChangeDto.setFlag("1");
		lwAmmeterChangeDto.setRemark("0");
		
		lwAmmeterChangeDto.setInstallDate(inputdate[i]);
	
		lwAmmeterChangeDto.setPt(PT[i]);
		lwAmmeterChangeDto.setCt(CT[i]);
		lwAmmeterChangeDto.setRate(rate[i]);
		lwAmmeterChangeDto.setUseStyle(ammeterStyle[i]);
		new BLLwAmmeterChangeAction().insert(dbManager, lwAmmeterChangeDto);

		}	
		 
		 
			
		 dbManager.commitTransaction();
		 }catch(Exception exception){
	            dbManager.rollbackTransaction();
	            throw exception;
	        }finally{
	            dbManager.close();
	        }
		
		return actionMapping.findForward("Success");

	}
}
