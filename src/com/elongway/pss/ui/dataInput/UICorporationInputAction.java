package com.elongway.pss.ui.dataInput;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwSalePriceFacade;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UICorporationInputAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String UserNo=httpServletRequest.getParameter("UserNo");
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto lwCoporationUserInfoDto=blLwCoporationUserInfoFacade.findByPrimaryKey(UserNo);
		String conditions="1=1 and UserNo='"+UserNo+"'";
		//BLLwFactoryIndicatorFacade blLwFactoryIndicatorFacade=new BLLwFactoryIndicatorFacade();
		BLLwNewFactoryIndicatorFacade  blLwNewFactoryIndicatorFacade=new BLLwNewFactoryIndicatorFacade();
		Collection factiory=blLwNewFactoryIndicatorFacade.findByConditions(conditions);
		if(factiory == null||factiory.size()==0){
			throw new UserException(-6,-710,this.getClass().getName(),"请先对用户电表指针进行初始化");
		}
		BLLwSalePriceFacade blLwSalePriceFacade=new BLLwSalePriceFacade();
		LwSalePriceDto  lwSalePriceDtodianjin=blLwSalePriceFacade.findByPrimaryKey("8", "0", 0, 0, "0");
		//LwSalePriceDto  lwSalePriceDtosanxia=blLwSalePriceFacade.findByPrimaryKey("9", "0", 0, 0, "0");
		//LwSalePriceDto  lwSalePriceDtojijin=blLwSalePriceFacade.findByPrimaryKey("10", "0", 0, 0, "0");
		//double dianjinPrice=lwSalePriceDtodianjin.getPrice();
		//double sanxiaPrice=lwSalePriceDtosanxia.getPrice();
		//double jijinPrice=lwSalePriceDtojijin.getPrice();
		String conditionone="1=1 and UserNo='"+UserNo+"'"+" and AMMETERSTYLE=0";
		Collection colone=blLwNewFactoryIndicatorFacade.findByConditions(conditionone);
		Iterator one=colone.iterator();
		LwNewFactoryIndicatorDto  lwNewFactoryIndicatorDto2=new LwNewFactoryIndicatorDto();
		double needPower=0;
		while(one.hasNext()){
			lwNewFactoryIndicatorDto2=(LwNewFactoryIndicatorDto)one.next();
			needPower+=lwNewFactoryIndicatorDto2.getNeedQuantity();
		}
		PowerFeeCal  powerFeeCal=new PowerFeeCal();
		double  contentPrice=powerFeeCal.rongliangFee(lwCoporationUserInfoDto.getUserNo());
		httpServletRequest.setAttribute("lwCoporationUserInfoDto", lwCoporationUserInfoDto);
		httpServletRequest.setAttribute("lwNewFactoryIndicatorDto2", lwNewFactoryIndicatorDto2);
		httpServletRequest.setAttribute("factiory", factiory);
		httpServletRequest.setAttribute("contentPrice", contentPrice);
		httpServletRequest.setAttribute("needPower", needPower);
		//httpServletRequest.setAttribute("dianjinPrice", dianjinPrice);
		return actionMapping.findForward("corporationInput");
		
	}
}
