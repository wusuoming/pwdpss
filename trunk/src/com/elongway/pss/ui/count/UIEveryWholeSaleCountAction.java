package com.elongway.pss.ui.count;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import antlr.collections.List;

import com.elongway.pss.bl.facade.BLLwAllWholeFeeFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleDetailFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.custom.WholeSaleFee;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.sinosoft.sysframework.common.datatype.DateTime;

public class UIEveryWholeSaleCountAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		String inputDate = httpServletRequest.getParameter("inputDate");
		inputDate = new DateTime(inputDate,DateTime.YEAR_TO_MONTH).toString();
		LwWholeSaleDetailDto lwWholeSaleDetailDtogy = new LwWholeSaleDetailDto();
		LwWholeSaleDetailDto lwWholeSaleDetailDtodm = new LwWholeSaleDetailDto();
		LwWholeSaleDetailDto lwWholeSaleDetailDtojy = new LwWholeSaleDetailDto();
		LwWholeSaleDetailDto lwWholeSaleDetailDtoty = new LwWholeSaleDetailDto();
		BLLwWholeSaleDetailFacade bLLwWholeSaleDetailFacade = new BLLwWholeSaleDetailFacade();
		lwWholeSaleDetailDtogy = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"gy", inputDate);
		lwWholeSaleDetailDtodm = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"dm", inputDate);
		lwWholeSaleDetailDtojy = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"jy", inputDate);
		lwWholeSaleDetailDtoty = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"ty", inputDate);
		BLLwAllWholeFeeFacade bLLwAllWholeFeeFacade = new BLLwAllWholeFeeFacade();
		LwAllWholeFeeDto lwAllWholeFeeDtogy = new LwAllWholeFeeDto();
		LwAllWholeFeeDto lwAllWholeFeeDtodm = new LwAllWholeFeeDto();
		LwAllWholeFeeDto lwAllWholeFeeDtojy = new LwAllWholeFeeDto();
		LwAllWholeFeeDto lwAllWholeFeeDtoty = new LwAllWholeFeeDto();
		
		double sumwfee = 0;
		double sumwpower = 0;
		double sumwtax = 0;
		double sumwc = 0;
		double summwdianjin = 0;
		double sumwdianjintax = 0;
		double sumwsanxia = 0;
		double sumwsanxiatax = 0;
		double sumwjijin = 0;
		double sumwjijintax = 0;

		
		 sumwc=(Double.parseDouble(lwAllWholeFeeDtogy.getDianfei())+Double.parseDouble(lwAllWholeFeeDtoty.getDianfei())+Double.parseDouble(lwAllWholeFeeDtodm.getDianfei())+Double.parseDouble(lwAllWholeFeeDtojy.getDianfei()))/1.17;
		 sumwfee=Double.parseDouble(lwAllWholeFeeDtogy.getSumfee())+Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())+Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())+Double.parseDouble(lwAllWholeFeeDtojy.getSumfee());
		 sumwpower=Double.parseDouble(lwAllWholeFeeDtogy.getPower1())+Double.parseDouble(lwAllWholeFeeDtoty.getPower1())+Double.parseDouble(lwAllWholeFeeDtodm.getPower1())+Double.parseDouble(lwAllWholeFeeDtojy.getPower1());
		 sumwtax=Double.parseDouble(lwAllWholeFeeDtogy.getDianfeitax())+Double.parseDouble(lwAllWholeFeeDtoty.getDianfeitax())+Double.parseDouble(lwAllWholeFeeDtodm.getDianfeitax())+Double.parseDouble(lwAllWholeFeeDtojy.getDianfeitax());
		 summwdianjin=Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())+Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())+Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())+Double.parseDouble(lwAllWholeFeeDtojy.getDianjin());
		 sumwdianjintax=Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())+Double.parseDouble(lwAllWholeFeeDtoty.getDianjintax())+Double.parseDouble(lwAllWholeFeeDtodm.getDianjintax())+Double.parseDouble(lwAllWholeFeeDtojy.getDianjintax());
		 sumwsanxia=Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())+Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())+Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())+Double.parseDouble(lwAllWholeFeeDtojy.getSanxia());
		 sumwsanxiatax=Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())+Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())+Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())+Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax());
		 sumwjijin=Double.parseDouble(lwAllWholeFeeDtogy.getJijin())+Double.parseDouble(lwAllWholeFeeDtoty.getJijin())+Double.parseDouble(lwAllWholeFeeDtodm.getJijin())+Double.parseDouble(lwAllWholeFeeDtojy.getJijin());
		 sumwjijintax=Double.parseDouble(lwAllWholeFeeDtogy.getFujia1())+Double.parseDouble(lwAllWholeFeeDtoty.getFujia1())+Double.parseDouble(lwAllWholeFeeDtodm.getFujia1())+Double.parseDouble(lwAllWholeFeeDtojy.getFujia1());
		 httpServletRequest.setAttribute("sumwc", sumwc);
		 httpServletRequest.setAttribute("sumwfee", sumwfee);
		 httpServletRequest.setAttribute("sumwpower",sumwpower);
		 httpServletRequest.setAttribute("sumwtax", sumwtax);
		 httpServletRequest.setAttribute("summwdianjin", summwdianjin);
		 httpServletRequest.setAttribute("sumwdianjintax", sumwdianjintax);
		 httpServletRequest.setAttribute("sumwsanxia", sumwsanxia);
		 httpServletRequest.setAttribute("sumwsanxiatax", sumwsanxiatax);
		 httpServletRequest.setAttribute("sumwjijin", sumwjijin);
		 httpServletRequest.setAttribute("sumwjijintax", sumwjijintax);
		
		
		lwAllWholeFeeDtogy = bLLwAllWholeFeeFacade.findByPrimaryKey("gy",inputDate);
		lwAllWholeFeeDtodm = bLLwAllWholeFeeFacade.findByPrimaryKey("dm",inputDate);
		lwAllWholeFeeDtojy = bLLwAllWholeFeeFacade.findByPrimaryKey("jy",inputDate);
		lwAllWholeFeeDtoty = bLLwAllWholeFeeFacade.findByPrimaryKey("ty",inputDate);
		httpServletRequest.setAttribute("lwAllWholeFeeDtogy", lwAllWholeFeeDtogy);
		httpServletRequest.setAttribute("lwAllWholeFeeDtodm", lwAllWholeFeeDtodm);
		httpServletRequest.setAttribute("lwAllWholeFeeDtojy", lwAllWholeFeeDtojy);
		httpServletRequest.setAttribute("lwAllWholeFeeDtoty", lwAllWholeFeeDtoty);
		
		httpServletRequest.setAttribute("lwWholeSaleDetailDtogy", lwWholeSaleDetailDtogy);
		httpServletRequest.setAttribute("lwWholeSaleDetailDtodm", lwWholeSaleDetailDtodm);
		httpServletRequest.setAttribute("lwWholeSaleDetailDtojy", lwWholeSaleDetailDtojy);
		httpServletRequest.setAttribute("lwWholeSaleDetailDtoty", lwWholeSaleDetailDtoty);
		return actionMapping.findForward("everywholesale");
	}

}
