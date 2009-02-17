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
		httpServletRequest.setAttribute("inputDate", inputDate);
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
		lwAllWholeFeeDtogy = bLLwAllWholeFeeFacade.findByPrimaryKey("gy",inputDate);
		lwAllWholeFeeDtodm = bLLwAllWholeFeeFacade.findByPrimaryKey("dm",inputDate);
		lwAllWholeFeeDtojy = bLLwAllWholeFeeFacade.findByPrimaryKey("jy",inputDate);
		lwAllWholeFeeDtoty = bLLwAllWholeFeeFacade.findByPrimaryKey("ty",inputDate);
		
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
		String dianfeigy = lwAllWholeFeeDtogy.getDianfei();
		String dianfeity = lwAllWholeFeeDtoty.getDianfei();
		String dianfeijy = lwAllWholeFeeDtojy.getDianfei();
		String dianfeidm = lwAllWholeFeeDtodm.getDianfei();
		if(lwAllWholeFeeDtogy.getDianfei().equals("")||lwAllWholeFeeDtogy.getDianfei()==null){
			dianfeigy="0";
		}
		if(lwAllWholeFeeDtoty.getDianfei().equals("")||lwAllWholeFeeDtoty.getDianfei()==null){
			dianfeity="0";
		}
		if(lwAllWholeFeeDtojy.getDianfei().equals("")||lwAllWholeFeeDtojy.getDianfei()==null){
			dianfeijy="0";
		}
		if(lwAllWholeFeeDtodm.getDianfei().equals("")||lwAllWholeFeeDtodm.getDianfei()==null){
			dianfeidm="0";
		}
		String sumFeegy = lwAllWholeFeeDtogy.getSumfee();
		String sumFeety = lwAllWholeFeeDtoty.getSumfee();
		String sumFeejy = lwAllWholeFeeDtojy.getSumfee();
		String sumFeedm = lwAllWholeFeeDtodm.getSumfee();
		if(lwAllWholeFeeDtogy.getSumfee().equals("")||lwAllWholeFeeDtogy.getSumfee()==null){
			sumFeegy="0";
		}
		if(lwAllWholeFeeDtoty.getSumfee().equals("")||lwAllWholeFeeDtoty.getSumfee()==null){
			sumFeety="0";
		}
		if(lwAllWholeFeeDtojy.getSumfee().equals("")||lwAllWholeFeeDtojy.getSumfee()==null){
			sumFeejy="0";
		}
		if(lwAllWholeFeeDtodm.getSumfee().equals("")||lwAllWholeFeeDtodm.getSumfee()==null){
			sumFeedm="0";
		}
		
		String sumwpowergy = lwAllWholeFeeDtogy.getPower1();
		String sumpowerty = lwAllWholeFeeDtoty.getPower1();
		String sumpowerdm = lwAllWholeFeeDtodm.getPower1();
		String sumpowerjy = lwAllWholeFeeDtojy.getPower1();
		if(lwAllWholeFeeDtogy.getPower1().equals("")||lwAllWholeFeeDtogy.getPower1()==null){
			sumwpowergy="0";
		}
		if(lwAllWholeFeeDtoty.getPower1().equals("")||lwAllWholeFeeDtoty.getPower1()==null){
			sumpowerty="0";
		}
		if(lwAllWholeFeeDtodm.getPower1().equals("")||lwAllWholeFeeDtodm.getPower1()==null){
			sumpowerdm="0";
		}
		if(lwAllWholeFeeDtojy.getPower1().equals("")||lwAllWholeFeeDtojy.getPower1()==null){
			sumpowerjy="0";
		}
		
		String sumwtaxgy = lwAllWholeFeeDtogy.getDianfeitax();
		String sumwtaxty = lwAllWholeFeeDtoty.getDianfeitax();
		String sumwtaxdm = lwAllWholeFeeDtodm.getDianfeitax();
		String sumwtaxjy = lwAllWholeFeeDtojy.getDianfeitax();
		if(lwAllWholeFeeDtogy.getDianfeitax().equals("")||lwAllWholeFeeDtogy.getDianfeitax()==null){
			sumwtaxgy="0";
		}
		if(lwAllWholeFeeDtoty.getDianfeitax().equals("")||lwAllWholeFeeDtoty.getDianfeitax()==null){
			sumwtaxty="0";
		}
		if(lwAllWholeFeeDtodm.getDianfeitax().equals("")||lwAllWholeFeeDtodm.getDianfeitax()==null){
			sumwtaxdm="0";
		}
		if(lwAllWholeFeeDtojy.getDianfeitax().equals("")||lwAllWholeFeeDtojy.getDianfeitax()==null){
			sumwtaxjy="0";
		}
		
		String summwdianjingy = lwAllWholeFeeDtogy.getDianjin();
		String summwdianjinty = lwAllWholeFeeDtoty.getDianjin();
		String summwdianjindm = lwAllWholeFeeDtodm.getDianjin();
		String summwdianjinjy = lwAllWholeFeeDtojy.getDianjin();
		if(lwAllWholeFeeDtogy.getDianjin().equals("")||lwAllWholeFeeDtogy.getDianjin()==null){
			summwdianjingy="0";
		}
		if(lwAllWholeFeeDtoty.getDianjin().equals("")||lwAllWholeFeeDtoty.getDianjin()==null){
			summwdianjinty="0";
		}
		if(lwAllWholeFeeDtodm.getDianjin().equals("")||lwAllWholeFeeDtodm.getDianjin()==null){
			summwdianjindm="0";
		}
		if(lwAllWholeFeeDtojy.getDianjin().equals("")||lwAllWholeFeeDtojy.getDianjin()==null){
			summwdianjinjy="0";
		}
		
		String sumwdianjintaxgy = lwAllWholeFeeDtogy.getDianjintax();
		String sumwdianjintaxty = lwAllWholeFeeDtoty.getDianjintax();
		String sumwdianjintaxdm = lwAllWholeFeeDtodm.getDianjintax();
		String sumwdianjintaxjy = lwAllWholeFeeDtojy.getDianjintax();
		if(lwAllWholeFeeDtogy.getDianjintax().equals("")||lwAllWholeFeeDtogy.getDianjintax()==null){
			sumwdianjintaxgy="0";
		}
		if(lwAllWholeFeeDtoty.getDianjintax().equals("")||lwAllWholeFeeDtoty.getDianjintax()==null){
			sumwdianjintaxty="0";
		}
		if(lwAllWholeFeeDtodm.getDianjintax().equals("")||lwAllWholeFeeDtodm.getDianjintax()==null){
			sumwdianjintaxdm="0";
		}
		if(lwAllWholeFeeDtojy.getDianjintax().equals("")||lwAllWholeFeeDtojy.getDianjintax()==null){
			sumwdianjintaxjy="0";
		}
		
		String sumwsanxiagy = lwAllWholeFeeDtogy.getSanxia();
		String sumwsanxiaty = lwAllWholeFeeDtoty.getSanxia();
		String sumwsanxiadm = lwAllWholeFeeDtodm.getSanxia();
		String sumwsanxiajy = lwAllWholeFeeDtojy.getSanxia();
		if(lwAllWholeFeeDtogy.getSanxia().equals("")||lwAllWholeFeeDtogy.getSanxia()==null){
			sumwsanxiagy="0";
		}
		if(lwAllWholeFeeDtoty.getSanxia().equals("")||lwAllWholeFeeDtoty.getSanxia()==null){
			sumwsanxiaty="0";
		}
		if(lwAllWholeFeeDtodm.getSanxia().equals("")||lwAllWholeFeeDtodm.getSanxia()==null){
			sumwsanxiadm="0";
		}
		if(lwAllWholeFeeDtojy.getSanxia().equals("")||lwAllWholeFeeDtojy.getSanxia()==null){
			sumwsanxiajy="0";
		}
		String sumwsanxiataxgy = lwAllWholeFeeDtogy.getSanxiatax();
		String sumwsanxiataxty = lwAllWholeFeeDtoty.getSanxiatax();
		String sumwsanxiataxdm = lwAllWholeFeeDtodm.getSanxiatax();
		String sumwsanxiataxjy = lwAllWholeFeeDtojy.getSanxiatax();
		if(lwAllWholeFeeDtogy.getSanxiatax().equals("")|| lwAllWholeFeeDtogy.getSanxiatax()==null){
			sumwsanxiataxgy="0";
		}
		if(lwAllWholeFeeDtoty.getSanxiatax().equals("")|| lwAllWholeFeeDtoty.getSanxiatax()==null){
			sumwsanxiataxty="0";
		}
		
		if(lwAllWholeFeeDtodm.getSanxiatax().equals("")|| lwAllWholeFeeDtodm.getSanxiatax()==null){
			sumwsanxiataxdm="0";
		}
		
		if(lwAllWholeFeeDtojy.getSanxiatax().equals("")|| lwAllWholeFeeDtojy.getSanxiatax()==null){
			sumwsanxiataxjy="0";
		}
		
		String sumwjijingy = lwAllWholeFeeDtogy.getJijin();
		String sumwjijinty = lwAllWholeFeeDtoty.getJijin();
		String sumwjijindm = lwAllWholeFeeDtodm.getJijin();
		String sumwjijinjy = lwAllWholeFeeDtojy.getJijin();
		if(lwAllWholeFeeDtogy.getJijin().equals("")||lwAllWholeFeeDtogy.getJijin()==null){
			sumwjijingy="0";
		}
		if(lwAllWholeFeeDtoty.getJijin().equals("")||lwAllWholeFeeDtoty.getJijin()==null){
			sumwjijinty="0";
		}
		if(lwAllWholeFeeDtodm.getJijin().equals("")||lwAllWholeFeeDtodm.getJijin()==null){
			sumwjijindm="0";
		}
		if(lwAllWholeFeeDtojy.getJijin().equals("")||lwAllWholeFeeDtojy.getJijin()==null){
			sumwjijinjy="0";
		}
		String sumwjijintaxgy = lwAllWholeFeeDtogy.getFujia1();
		String sumwjijintaxty = lwAllWholeFeeDtoty.getFujia1();
		String sumwjijintaxdm = lwAllWholeFeeDtodm.getFujia1();
		String sumwjijintaxjy = lwAllWholeFeeDtojy.getFujia1();
		if(lwAllWholeFeeDtogy.getFujia1().equals("")||lwAllWholeFeeDtogy.getFujia1()==null){
			sumwjijintaxgy="0";
		}
		if( lwAllWholeFeeDtoty.getFujia1().equals("")|| lwAllWholeFeeDtoty.getFujia1()==null){
			sumwjijintaxty="0";
		}
		if(lwAllWholeFeeDtodm.getFujia1().equals("")||lwAllWholeFeeDtodm.getFujia1()==null){
			sumwjijintaxdm="0";
		}
		if(lwAllWholeFeeDtojy.getFujia1().equals("")||lwAllWholeFeeDtojy.getFujia1()==null){
			sumwjijintaxjy="0";
		}
		DecimalFormat df = new DecimalFormat("###0.00");
		 sumwc=(Double.parseDouble(dianfeigy)+Double.parseDouble(dianfeity)+Double.parseDouble(dianfeijy)+Double.parseDouble(dianfeidm))/1.17;
		 sumwfee=Double.parseDouble(sumFeegy)+Double.parseDouble(sumFeety)+Double.parseDouble(sumFeejy)+Double.parseDouble(sumFeedm);
		 sumwpower=Double.parseDouble(sumwpowergy)+Double.parseDouble(sumpowerty)+Double.parseDouble(sumpowerdm)+Double.parseDouble(sumpowerjy);
		 sumwtax=Double.parseDouble(sumwtaxgy)+Double.parseDouble(sumwtaxty)+Double.parseDouble(sumwtaxdm)+Double.parseDouble(sumwtaxjy);
		 summwdianjin=Double.parseDouble(summwdianjingy)+Double.parseDouble(summwdianjinty)+Double.parseDouble(summwdianjindm)+Double.parseDouble(summwdianjinjy);
		 sumwdianjintax=Double.parseDouble(sumwdianjintaxgy)+Double.parseDouble(sumwdianjintaxty)+Double.parseDouble(sumwdianjintaxdm)+Double.parseDouble(sumwdianjintaxjy);
		 sumwsanxia=Double.parseDouble(sumwsanxiagy)+Double.parseDouble(sumwsanxiaty)+Double.parseDouble(sumwsanxiadm)+Double.parseDouble(sumwsanxiajy);
		 sumwsanxiatax=Double.parseDouble(sumwsanxiataxgy)+Double.parseDouble(sumwsanxiataxty)+Double.parseDouble(sumwsanxiataxdm)+Double.parseDouble(sumwsanxiataxjy);
		 sumwjijin=Double.parseDouble(sumwjijingy)+Double.parseDouble(sumwjijinty)+Double.parseDouble(sumwjijindm)+Double.parseDouble(sumwjijinjy);
		 sumwjijintax=Double.parseDouble(sumwjijintaxgy)+Double.parseDouble(sumwjijintaxty)+Double.parseDouble(sumwjijintaxdm)+Double.parseDouble(sumwjijintaxjy);
		 httpServletRequest.setAttribute("sumwc", df.format(sumwc));
		 httpServletRequest.setAttribute("sumwfee", df.format(sumwfee));
		 httpServletRequest.setAttribute("sumwpower",Math.round(sumwpower));
		 httpServletRequest.setAttribute("sumwtax", df.format(sumwtax));
		 httpServletRequest.setAttribute("summwdianjin", df.format(summwdianjin));
		 httpServletRequest.setAttribute("sumwdianjintax", sumwdianjintax);
		 httpServletRequest.setAttribute("sumwsanxia", df.format(sumwsanxia));
		 httpServletRequest.setAttribute("sumwsanxiatax", df.format(sumwsanxiatax));
		 httpServletRequest.setAttribute("sumwjijin", df.format(sumwjijin));
		 httpServletRequest.setAttribute("sumwjijintax", df.format(sumwjijintax));
		
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
