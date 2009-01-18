package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;
import com.elongway.pss.ui.view.maintenance.LWPowerLineForm;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class BLLWPowerLine extends Action{
	/**
	 * 查询方法
	 * 
	 * @param actionMapping
	 * @param actionForm
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return
	 * @throws Exception
	 */

	
	/*public ActionForward getLWPowerLineInfo(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		Collection PowerLinecollection=new ArrayList();
		LWPowerLineForm  lWPowerLineForm=(LWPowerLineForm)actionForm;
		String LineCode=lWPowerLineForm.getLineCode();
		String LineCName=lWPowerLineForm.getLineCName();
		String FeeCom=lWPowerLineForm.getFeeCom();
		String ComCode=lWPowerLineForm.getComCode();
		
		String condition="select * from LWPowerLine where 1=1";
		if(LineCode==null||"".equals(LineCode)){
			condition+="and LineCode is null";
		}else{
			condition+="and LineCode="+LineCode;
		}
		if(LineCName==null||"".equals(LineCName)){
			condition+="and LineCName is null";
		}else{
			condition+="and LineCName="+LineCName;
		}
		if(FeeCom==null||"".equals(FeeCom)){
			condition+="and FeeCom is null";
		}else{
			condition+="and FeeCom="+FeeCom;
		}
		if(ComCode==null||"".equals(ComCode)){
			condition+="and ComCode is null";
		}else{
			condition+="and ComCode="+ComCode;
		}
		
		BLLwPowerLineFacade  blLwPowerLineFacade=new BLLwPowerLineFacade();
		PowerLinecollection=blLwPowerLineFacade.findByConditions(condition);
		httpServletRequest.setAttribute("powerLine", PowerLinecollection);
		return actionMapping.findForward("");
		
		
		
	}*/
	/**
	 * 新增方法
	 * 
	 * @param actionMapping
	 * @param actionForm
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return
	 * @throws Exception
	 */
	//public ActionForward addLWPowerLine(ActionMapping actionMapping,
			//ActionForm actionForm, HttpServletRequest httpServletRequest,
			//HttpServletResponse httpServletResponse) throws UserException,Exception {
		public ActionForward execute(ActionMapping actionMapping,
				ActionForm actionForm, HttpServletRequest httpServletRequest,
				HttpServletResponse httpServletResponse) throws UserException,
				Exception {
		LWPowerLineForm  lWPowerLineForm=(LWPowerLineForm)actionForm;
		String LineCode=lWPowerLineForm.getLineCode();
		String LineCName=lWPowerLineForm.getLineCName();
		String LineEName=lWPowerLineForm.getLineEName();
		String FeeCom=lWPowerLineForm.getFeeCom();
		String ComCode=lWPowerLineForm.getComCode();
		String TargetCode=lWPowerLineForm.getTargetCode();
		String SupplyType=lWPowerLineForm.getSupplyType();
		String CT=lWPowerLineForm.getCT();
		String PT=lWPowerLineForm.getPT();
		String VoltLevel=lWPowerLineForm.getVoltLevel();
		String SiFeLoss=lWPowerLineForm.getSiFeLoss();
		String SanXiaLoss=lWPowerLineForm.getSanXiaLoss();
		String LossProp=lWPowerLineForm.getLossProp();
		String PriceCategory=lWPowerLineForm.getPriceCategory();
		String LossFlag=lWPowerLineForm.getLossFlag();
		String Rate=lWPowerLineForm.getRate();

		String Remark=lWPowerLineForm.getRemark();
		
		BLLwPowerLineFacade blLwPowerLineFacade=new BLLwPowerLineFacade();
		LwPowerLineDto lwPowerLineDto=new LwPowerLineDto();
		lwPowerLineDto.setLineCode(LineCode);
		lwPowerLineDto.setLineCName(LineCName);
		lwPowerLineDto.setLineEName(LineEName);
		//lwPowerLineDto.setFeeCom(FeeCom);
		lwPowerLineDto.setComCode(ComCode);
		lwPowerLineDto.setTargetCode(TargetCode);
		lwPowerLineDto.setSupplyType(SupplyType);
		lwPowerLineDto.setCt(Double.parseDouble(CT));
		lwPowerLineDto.setPt(Double.parseDouble(PT));
		lwPowerLineDto.setVoltLevel(Double.parseDouble(VoltLevel));
		lwPowerLineDto.setSiFeLoss(Double.parseDouble(SiFeLoss));
	
		lwPowerLineDto.setLossProp(Double.parseDouble(LossProp));
		lwPowerLineDto.setPriceCategory(PriceCategory);
		lwPowerLineDto.setLossFlag(LossFlag);
		lwPowerLineDto.setRate(Double.parseDouble(Rate));
		lwPowerLineDto.setRemark(Remark);
		

		blLwPowerLineFacade.insert(lwPowerLineDto);
		return actionMapping.findForward("Success");
		
		
		
		
}
	/**
	 * 删除方法
	 * 
	 * @param actionMapping
	 * @param actionForm
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return
	 * @throws Exception
	 *//*
	public ActionForward deleteLWPowerLine(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		String LineCode=httpServletRequest.getParameter("LineCode");
		BLLwPowerLineFacade  blLwPowerLineFacade=new BLLwPowerLineFacade();
		blLwPowerLineFacade.delete(LineCode);
		//其余的相关表的及联删除
		//LWindicator表
		//LWTownPriceSummary表
		//LWPriceSummary表
		//LWUserLine表
		//LWLineAmmeter表
		return actionMapping.findForward("");
		
		
}
	*//**
	 * 修改方法
	 * 
	 * @param actionMapping
	 * @param actionForm
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return
	 * @throws Exception
	 *//*
	public ActionForward modifyLWPowerLine(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		LWPowerLineForm  lWPowerLineForm=(LWPowerLineForm)actionForm;
		String LineCode=lWPowerLineForm.getLineCode();
		String LineCName=lWPowerLineForm.getLineCName();
		String LineEName=lWPowerLineForm.getLineEName();
		String FeeCom=lWPowerLineForm.getFeeCom();
		String ComCode=lWPowerLineForm.getComCode();
		String TargetCode=lWPowerLineForm.getTargetCode();
		String SupplyType=lWPowerLineForm.getSupplyType();
		String CT=lWPowerLineForm.getCT();
		String PT=lWPowerLineForm.getPT();
		String VoltLevel=lWPowerLineForm.getVoltLevel();
		String SiFeLoss=lWPowerLineForm.getSiFeLoss();
		String SanXiaLoss=lWPowerLineForm.getSanXiaLoss();
		String LossProp=lWPowerLineForm.getLossProp();
		String PriceCategory=lWPowerLineForm.getPriceCategory();
		String LossFlag=lWPowerLineForm.getLossFlag();
		String Rate=lWPowerLineForm.getRate();

		String Remark=lWPowerLineForm.getRemark();
		
		BLLwPowerLineFacade blLwPowerLineFacade=new BLLwPowerLineFacade();
		LwPowerLineDto lwPowerLineDto=new LwPowerLineDto();
		lwPowerLineDto.setLineCode(LineCode);
		lwPowerLineDto.setLineCName(LineCName);
		lwPowerLineDto.setLineEName(LineEName);
		lwPowerLineDto.setFeeCom(FeeCom);
		lwPowerLineDto.setComCode(ComCode);
		lwPowerLineDto.setTargetCode(TargetCode);
		lwPowerLineDto.setSupplyType(SupplyType);
		lwPowerLineDto.setCt(Double.parseDouble(CT));
		lwPowerLineDto.setPt(Double.parseDouble(PT));
		lwPowerLineDto.setVoltLevel(Double.parseDouble(VoltLevel));
		lwPowerLineDto.setSiFeLoss(Double.parseDouble(SiFeLoss));
		lwPowerLineDto.setSanXiaLoss(Double.parseDouble(SanXiaLoss));
		lwPowerLineDto.setLossProp(Double.parseDouble(LossProp));
		lwPowerLineDto.setPriceCategory(PriceCategory);
		lwPowerLineDto.setLossFlag(LossFlag);
		lwPowerLineDto.setRate(Double.parseDouble(Rate));
		lwPowerLineDto.setRemark(Remark);
		
		
		blLwPowerLineFacade.update(lwPowerLineDto);
		return actionMapping.findForward("");
		
		
		
		
		
	}*/
		

}
