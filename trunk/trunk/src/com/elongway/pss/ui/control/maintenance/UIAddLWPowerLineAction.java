package com.elongway.pss.ui.control.maintenance;
/**
 *线路信息维护 Action <br>
 * 增加
 * 
 * @author 王荣佳
 * @version 1.0 2008-10-07
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.ui.view.maintenance.LWPowerLineForm;

public class UIAddLWPowerLineAction extends Action {

	@Override
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		httpServletRequest.setCharacterEncoding("GBK");
		LWPowerLineForm  lWPowerLineForm=(LWPowerLineForm)actionForm;
		String LineCode=httpServletRequest.getParameter("LineCode");
		System.out.println("+++++++++++++++"+LineCode);
		//String LineCName=httpServletRequest.getParameter("LineCName");
		//String LineEName=httpServletRequest.getParameter("LineEName");
		//String FeeCom=httpServletRequest.getParameter("FeeCom");
		//String ComCode=httpServletRequest.getParameter("ComCode");
		//String TargetCode=httpServletRequest.getParameter("TargetCode");
		//String SupplyType=httpServletRequest.getParameter("SupplyType");
		//String CT=httpServletRequest.getParameter("CT");
		//String PT=httpServletRequest.getParameter("PT");
		String VoltLevel=httpServletRequest.getParameter("VoltLevel");
		//String SiFeLoss=httpServletRequest.getParameter("SiFeLoss");
		//String SanXiaLoss=httpServletRequest.getParameter("SanXiaLoss");
		//String LossProp=httpServletRequest.getParameter("LossProp");
		//String PriceCategory=httpServletRequest.getParameter("PriceCategory");
		//String LossFlag=httpServletRequest.getParameter("LossFlag");
		//String Rate=httpServletRequest.getParameter("Rate");
		//String Remark=httpServletRequest.getParameter("Remark");
		/*String LineCName=lWPowerLineForm.getLineCName();
		String LineEName=lWPowerLineForm.getLineEName();
		String FeeCom=lWPowerLineForm.getFeeCom();
		String ComCode=lWPowerLineForm.getComCode();
		String TargetCode=lWPowerLineForm.getTargetCode();
		String SupplyType=lWPowerLineForm.getSupplyType();
		String CT=lWPowerLineForm.getCT();
		System.out.println("-----------------="+CT);
		String PT=lWPowerLineForm.getPT();
		String VoltLevel=lWPowerLineForm.getVoltLevel();
		String SiFeLoss=lWPowerLineForm.getSiFeLoss();
		String SanXiaLoss=lWPowerLineForm.getSanXiaLoss();
		String LossProp=lWPowerLineForm.getLossProp();
		String PriceCategory=lWPowerLineForm.getPriceCategory();
		String LossFlag=lWPowerLineForm.getLossFlag();
		String Rate=lWPowerLineForm.getRate();

		String Remark=lWPowerLineForm.getRemark();*/
		
		BLLwPowerLineFacade blLwPowerLineFacade=new BLLwPowerLineFacade();
		LwPowerLineDto lwPowerLineDto=new LwPowerLineDto();
		lwPowerLineDto.setLineCode(LineCode);
		//lwPowerLineDto.setLineCName(LineCName);
		//lwPowerLineDto.setLineEName(LineEName);
		//lwPowerLineDto.setFeeCom(FeeCom);
		//lwPowerLineDto.setComCode(ComCode);
		//lwPowerLineDto.setTargetCode(TargetCode);
	//	lwPowerLineDto.setSupplyType(SupplyType);
		//lwPowerLineDto.setCt(Double.parseDouble(CT));
		//lwPowerLineDto.setPt(Double.parseDouble(PT));
		lwPowerLineDto.setVoltLevel(Double.parseDouble(VoltLevel));
		//lwPowerLineDto.setSiFeLoss(Double.parseDouble(SiFeLoss));
		//lwPowerLineDto.setSanXiaLoss(Double.parseDouble(SanXiaLoss));
		//lwPowerLineDto.setLossProp(Double.parseDouble(LossProp));
		//lwPowerLineDto.setPriceCategory(PriceCategory);
		//lwPowerLineDto.setLossFlag(LossFlag);
		//lwPowerLineDto.setRate(Double.parseDouble(Rate));
		//lwPowerLineDto.setRemark(Remark);
		

		blLwPowerLineFacade.insert(lwPowerLineDto);
		return actionMapping.findForward("Success");
	}

}
