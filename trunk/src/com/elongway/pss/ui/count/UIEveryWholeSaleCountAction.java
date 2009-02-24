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
		if(dianfeigy.equals("")||dianfeigy==null){
			dianfeigy="0";
		}
		if(dianfeity.equals("")||dianfeity==null){
			dianfeity="0";
		}
		if(dianfeijy.equals("")||dianfeijy==null){
			dianfeijy="0";
		}
		if(dianfeidm.equals("")||dianfeidm==null){
			dianfeidm="0";
		}
		String sumFeegy = lwAllWholeFeeDtogy.getSumfee();
		String sumFeety = lwAllWholeFeeDtoty.getSumfee();
		String sumFeejy = lwAllWholeFeeDtojy.getSumfee();
		String sumFeedm = lwAllWholeFeeDtodm.getSumfee();
		if(sumFeegy.equals("")||sumFeegy==null){
			sumFeegy="0";
		}
		if(sumFeety.equals("")||sumFeety==null){
			sumFeety="0";
		}
		if(sumFeejy.equals("")||sumFeejy==null){
			sumFeejy="0";
		}
		if(sumFeedm.equals("")||sumFeedm==null){
			sumFeedm="0";
		}
		
		String sumwpowergy = lwAllWholeFeeDtogy.getPower1();
		String sumpowerty = lwAllWholeFeeDtoty.getPower1();
		String sumpowerdm = lwAllWholeFeeDtodm.getPower1();
		String sumpowerjy = lwAllWholeFeeDtojy.getPower1();
		if(sumwpowergy.equals("")||sumwpowergy==null){
			sumwpowergy="0";
		}
		if(sumpowerty.equals("")||sumpowerty==null){
			sumpowerty="0";
		}
		if(sumpowerdm.equals("")||sumpowerdm==null){
			sumpowerdm="0";
		}
		if(sumpowerjy.equals("")||sumpowerjy==null){
			sumpowerjy="0";
		}
		
		String sumwtaxgy = lwAllWholeFeeDtogy.getDianfeitax();
		String sumwtaxty = lwAllWholeFeeDtoty.getDianfeitax();
		String sumwtaxdm = lwAllWholeFeeDtodm.getDianfeitax();
		String sumwtaxjy = lwAllWholeFeeDtojy.getDianfeitax();
		if(sumwtaxgy.equals("")||sumwtaxgy==null){
			sumwtaxgy="0";
		}
		if(sumwtaxty.equals("")||sumwtaxty==null){
			sumwtaxty="0";
		}
		if(sumwtaxdm.equals("")||sumwtaxdm==null){
			sumwtaxdm="0";
		}
		if(sumwtaxjy.equals("")||sumwtaxjy==null){
			sumwtaxjy="0";
		}
		
		String summwdianjingy = lwAllWholeFeeDtogy.getDianjin();
		String summwdianjinty = lwAllWholeFeeDtoty.getDianjin();
		String summwdianjindm = lwAllWholeFeeDtodm.getDianjin();
		String summwdianjinjy = lwAllWholeFeeDtojy.getDianjin();
		if(summwdianjingy.equals("")||summwdianjingy==null){
			summwdianjingy="0";
		}
		if(summwdianjinty.equals("")||summwdianjinty==null){
			summwdianjinty="0";
		}
		if(summwdianjindm.equals("")||summwdianjindm==null){
			summwdianjindm="0";
		}
		if(summwdianjinjy.equals("")||summwdianjinjy==null){
			summwdianjinjy="0";
		}
		
		String sumwdianjintaxgy = lwAllWholeFeeDtogy.getDianjintax();
		String sumwdianjintaxty = lwAllWholeFeeDtoty.getDianjintax();
		String sumwdianjintaxdm = lwAllWholeFeeDtodm.getDianjintax();
		String sumwdianjintaxjy = lwAllWholeFeeDtojy.getDianjintax();
		if(sumwdianjintaxgy.equals("")||sumwdianjintaxgy==null){
			sumwdianjintaxgy="0";
		}
		if(sumwdianjintaxty.equals("")||sumwdianjintaxty==null){
			sumwdianjintaxty="0";
		}
		if(sumwdianjintaxdm.equals("")||sumwdianjintaxdm==null){
			sumwdianjintaxdm="0";
		}
		if(sumwdianjintaxjy.equals("")||sumwdianjintaxjy==null){
			sumwdianjintaxjy="0";
		}
		
		String sumwsanxiagy = lwAllWholeFeeDtogy.getSanxia();
		String sumwsanxiaty = lwAllWholeFeeDtoty.getSanxia();
		String sumwsanxiadm = lwAllWholeFeeDtodm.getSanxia();
		String sumwsanxiajy = lwAllWholeFeeDtojy.getSanxia();
		if(sumwsanxiagy.equals("")||sumwsanxiagy==null){
			sumwsanxiagy="0";
		}
		if(sumwsanxiaty.equals("")||sumwsanxiaty==null){
			sumwsanxiaty="0";
		}
		if(sumwsanxiadm.equals("")||sumwsanxiadm==null){
			sumwsanxiadm="0";
		}
		if(sumwsanxiajy.equals("")||sumwsanxiajy==null){
			sumwsanxiajy="0";
		}
		
		
	
		String sumwsanxiataxgy = lwAllWholeFeeDtogy.getSanxiatax();
		String sumwsanxiataxty = lwAllWholeFeeDtoty.getSanxiatax();
		String sumwsanxiataxdm = lwAllWholeFeeDtodm.getSanxiatax();
		String sumwsanxiataxjy = lwAllWholeFeeDtojy.getSanxiatax();
		if(sumwsanxiataxgy.equals("")|| sumwsanxiataxgy==null){
			sumwsanxiataxgy="0";
		}
		if(sumwsanxiataxty.equals("")|| sumwsanxiataxty==null){
			sumwsanxiataxty="0";
		}
		
		if(sumwsanxiataxdm.equals("")|| sumwsanxiataxdm==null){
			sumwsanxiataxdm="0";
		}
		
		if(sumwsanxiataxjy.equals("")|| sumwsanxiataxjy==null){
			sumwsanxiataxjy="0";
		}
		
		String sumwjijingy = lwAllWholeFeeDtogy.getJijin();
		String sumwjijinty = lwAllWholeFeeDtoty.getJijin();
		String sumwjijindm = lwAllWholeFeeDtodm.getJijin();
		String sumwjijinjy = lwAllWholeFeeDtojy.getJijin();
		if(sumwjijingy.equals("")||sumwjijingy==null){
			sumwjijingy="0";
		}
		if(sumwjijinty.equals("")||sumwjijinty==null){
			sumwjijinty="0";
		}
		if(sumwjijindm.equals("")||sumwjijindm==null){
			sumwjijindm="0";
		}
		if(sumwjijinjy.equals("")||sumwjijinjy==null){
			sumwjijinjy="0";
		}
		String sumwjijintaxgy = lwAllWholeFeeDtogy.getFujia1();
		String sumwjijintaxty = lwAllWholeFeeDtoty.getFujia1();
		String sumwjijintaxdm = lwAllWholeFeeDtodm.getFujia1();
		String sumwjijintaxjy = lwAllWholeFeeDtojy.getFujia1();
		if(sumwjijintaxgy.equals("")||sumwjijintaxgy==null){
			sumwjijintaxgy="0";
		}
		if( sumwjijintaxty.equals("")|| sumwjijintaxty==null){
			sumwjijintaxty="0";
		}
		if(sumwjijintaxdm.equals("")||sumwjijintaxdm==null){
			sumwjijintaxdm="0";
		}
		if(sumwjijintaxjy.equals("")||sumwjijintaxjy==null){
			sumwjijintaxjy="0";
		}
		String fuJia3ty = lwAllWholeFeeDtoty.getFujia3();
		String fuJia3jy = lwAllWholeFeeDtojy.getFujia3();
		String fuJia3dm = lwAllWholeFeeDtodm.getFujia3();
		String fuJia3gy = lwAllWholeFeeDtogy.getFujia3();
		if(fuJia3ty.equals("")||fuJia3ty==null){
			fuJia3ty = "0";
		}
		if(fuJia3gy.equals("")||fuJia3gy==null){
			fuJia3gy = "0";
		}
		if(fuJia3dm.equals("")||fuJia3dm==null){
			fuJia3dm = "0";
		}
		if(fuJia3jy.equals("")||fuJia3jy==null){
			fuJia3jy = "0";
		}
		DecimalFormat df = new DecimalFormat("###0.00");
		 sumwc=(Double.parseDouble(dianfeigy)+Double.parseDouble(dianfeity)+Double.parseDouble(dianfeijy)+Double.parseDouble(dianfeidm))/1.17;
		 sumwfee=Double.parseDouble(sumFeegy)+Double.parseDouble(sumFeety)+Double.parseDouble(sumFeejy)+Double.parseDouble(sumFeedm);
		 sumwpower=Double.parseDouble(sumwpowergy)+Double.parseDouble(sumpowerty)+Double.parseDouble(sumpowerdm)+Double.parseDouble(sumpowerjy);
		 sumwtax=Double.parseDouble(sumwtaxgy)+Double.parseDouble(sumwtaxty)+Double.parseDouble(sumwtaxdm)+Double.parseDouble(sumwtaxjy);
		 //summwdianjin=Double.parseDouble(summwdianjingy)+Double.parseDouble(summwdianjinty)+Double.parseDouble(summwdianjindm)+Double.parseDouble(summwdianjinjy);
		 //sumwdianjintax=Double.parseDouble(sumwdianjintaxgy)+Double.parseDouble(sumwdianjintaxty)+Double.parseDouble(sumwdianjintaxdm)+Double.parseDouble(sumwdianjintaxjy);
		 //sumwsanxia=Double.parseDouble(sumwsanxiagy)+Double.parseDouble(sumwsanxiaty)+Double.parseDouble(sumwsanxiadm)+Double.parseDouble(sumwsanxiajy);
		 //sumwsanxiatax=Double.parseDouble(sumwsanxiataxgy)+Double.parseDouble(sumwsanxiataxty)+Double.parseDouble(sumwsanxiataxdm)+Double.parseDouble(sumwsanxiataxjy);
		 //sumwjijin=Double.parseDouble(sumwjijingy)+Double.parseDouble(sumwjijinty)+Double.parseDouble(sumwjijindm)+Double.parseDouble(sumwjijinjy);
		 //sumwjijintax=Double.parseDouble(sumwjijintaxgy)+Double.parseDouble(sumwjijintaxty)+Double.parseDouble(sumwjijintaxdm)+Double.parseDouble(sumwjijintaxjy);
		 double Sumlilv = Double.parseDouble(fuJia3ty)+Double.parseDouble(fuJia3dm)+Double.parseDouble(fuJia3jy)+Double.parseDouble(fuJia3gy);
		 LwWholeSaleDetailDto  lwWholeSaleDetailDto=new LwWholeSaleDetailDto();
		 lwWholeSaleDetailDto.setDenizenQuantity10kv(lwWholeSaleDetailDtodm.getDenizenQuantity10kv()+lwWholeSaleDetailDtogy.getDenizenQuantity10kv()+lwWholeSaleDetailDtojy.getDenizenQuantity10kv()+lwWholeSaleDetailDtoty.getDenizenQuantity10kv());
		 lwWholeSaleDetailDto.setDenizenMoney10kv(lwWholeSaleDetailDtodm.getBizMoney10kv()+lwWholeSaleDetailDtogy.getBizMoney10kv()+lwWholeSaleDetailDtojy.getBizMoney10kv()+lwWholeSaleDetailDtoty.getBizMoney10kv());
		 

		 lwWholeSaleDetailDto.setDenizenQuantity35kv(lwWholeSaleDetailDtodm.getDenizenQuantity35kv()+lwWholeSaleDetailDtogy.getDenizenQuantity35kv()+lwWholeSaleDetailDtojy.getDenizenQuantity35kv()+lwWholeSaleDetailDtoty.getDenizenQuantity35kv());
		 		 lwWholeSaleDetailDto.setDenizenMoney35kv(lwWholeSaleDetailDtodm.getBizMoney35kv()+lwWholeSaleDetailDtogy.getBizMoney35kv()+lwWholeSaleDetailDtojy.getBizMoney35kv()+lwWholeSaleDetailDtoty.getBizMoney35kv());
		 		lwWholeSaleDetailDto.setUnDenizenQuantity10kv(lwWholeSaleDetailDtodm.getUnDenizenQuantity10kv()+lwWholeSaleDetailDtogy.getUnDenizenQuantity10kv()+lwWholeSaleDetailDtojy.getUnDenizenQuantity10kv()+lwWholeSaleDetailDtoty.getUnDenizenQuantity10kv());
		 		lwWholeSaleDetailDto.setUnDenizenQuantity35kv(lwWholeSaleDetailDtodm.getUnDenizenQuantity35kv()+lwWholeSaleDetailDtogy.getUnDenizenQuantity35kv()+lwWholeSaleDetailDtojy.getUnDenizenQuantity35kv()+lwWholeSaleDetailDtoty.getUnDenizenQuantity35kv());
		 		lwWholeSaleDetailDto.setUnDenizenMoney10kv(lwWholeSaleDetailDtodm.getUnDenizenMoney10kv()+lwWholeSaleDetailDtogy.getUnDenizenMoney10kv()+lwWholeSaleDetailDtojy.getUnDenizenMoney10kv()+lwWholeSaleDetailDtoty.getUnDenizenMoney10kv());
		 		lwWholeSaleDetailDto.setUnDenizenMoney35kv(lwWholeSaleDetailDtodm.getUnDenizenMoney35kv()+lwWholeSaleDetailDtogy.getUnDenizenMoney35kv()+lwWholeSaleDetailDtojy.getUnDenizenMoney35kv()+lwWholeSaleDetailDtoty.getUnDenizenMoney35kv());
		 		 
		 		lwWholeSaleDetailDto.setProductQuantity10kv(lwWholeSaleDetailDtodm.getProductQuantity10kv()+lwWholeSaleDetailDtogy.getProductQuantity10kv()+lwWholeSaleDetailDtojy.getProductQuantity10kv()+lwWholeSaleDetailDtoty.getProductQuantity10kv());
		 		lwWholeSaleDetailDto.setProductMoney10kv(lwWholeSaleDetailDtodm.getProductMoney10kv()+lwWholeSaleDetailDtogy.getProductMoney10kv()+lwWholeSaleDetailDtojy.getProductMoney10kv()+lwWholeSaleDetailDtoty.getProductMoney10kv());
		 		lwWholeSaleDetailDto.setProductQuantity35kv(lwWholeSaleDetailDtodm.getProductQuantity35kv()+lwWholeSaleDetailDtogy.getProductQuantity35kv()+lwWholeSaleDetailDtojy.getProductQuantity35kv()+lwWholeSaleDetailDtoty.getProductQuantity35kv());
		 		lwWholeSaleDetailDto.setProductMoney35kv(lwWholeSaleDetailDtodm.getProductMoney35kv()+lwWholeSaleDetailDtogy.getProductMoney35kv()+lwWholeSaleDetailDtojy.getProductMoney35kv()+lwWholeSaleDetailDtoty.getProductMoney35kv());
		 		
		 		
		 		lwWholeSaleDetailDto.setFarmUseQuantity10kv(lwWholeSaleDetailDtodm.getFarmUseQuantity10kv()+lwWholeSaleDetailDtogy.getFarmUseQuantity10kv()+lwWholeSaleDetailDtojy.getFarmUseQuantity10kv()+lwWholeSaleDetailDtoty.getFarmUseQuantity10kv());
		 		lwWholeSaleDetailDto.setFarmUseMoney10kv(lwWholeSaleDetailDtodm.getFarmUseMoney10kv()+lwWholeSaleDetailDtogy.getFarmUseMoney10kv()+lwWholeSaleDetailDtojy.getFarmUseMoney10kv()+lwWholeSaleDetailDtoty.getFarmUseMoney10kv());
		 		lwWholeSaleDetailDto.setFarmUseQuantity35kv(lwWholeSaleDetailDtodm.getFarmUseQuantity35kv()+lwWholeSaleDetailDtogy.getFarmUseQuantity35kv()+lwWholeSaleDetailDtojy.getFarmUseQuantity35kv()+lwWholeSaleDetailDtoty.getFarmUseQuantity35kv());
		 		lwWholeSaleDetailDto.setFarmUseMoney35kv(lwWholeSaleDetailDtodm.getFarmUseMoney35kv()+lwWholeSaleDetailDtogy.getFarmUseMoney35kv()+lwWholeSaleDetailDtojy.getFarmUseMoney35kv()+lwWholeSaleDetailDtoty.getFarmUseMoney35kv());
		 		
		 		lwWholeSaleDetailDto.setBizQuantity10kv(lwWholeSaleDetailDtodm.getBizQuantity10kv()+lwWholeSaleDetailDtogy.getBizQuantity10kv()+lwWholeSaleDetailDtojy.getBizQuantity10kv()+lwWholeSaleDetailDtoty.getBizQuantity10kv());
		 		lwWholeSaleDetailDto.setBizMoney10kv(lwWholeSaleDetailDtodm.getBizMoney10kv()+lwWholeSaleDetailDtogy.getBizMoney10kv()+lwWholeSaleDetailDtojy.getBizMoney10kv()+lwWholeSaleDetailDtoty.getBizMoney10kv());
		 		lwWholeSaleDetailDto.setBizQuantity35kv(lwWholeSaleDetailDtodm.getBizQuantity35kv()+lwWholeSaleDetailDtogy.getBizQuantity35kv()+lwWholeSaleDetailDtojy.getBizQuantity35kv()+lwWholeSaleDetailDtoty.getBizQuantity35kv());
		 		lwWholeSaleDetailDto.setBizMoney35kv(lwWholeSaleDetailDtodm.getBizMoney35kv()+lwWholeSaleDetailDtogy.getBizMoney35kv()+lwWholeSaleDetailDtojy.getBizMoney35kv()+lwWholeSaleDetailDtoty.getBizMoney35kv());
		 		
		 		lwWholeSaleDetailDto.setUnIndustryQuantity10kv(lwWholeSaleDetailDtodm.getUnIndustryQuantity10kv()+lwWholeSaleDetailDtogy.getUnIndustryQuantity10kv()+lwWholeSaleDetailDtojy.getUnIndustryQuantity10kv()+lwWholeSaleDetailDtoty.getUnIndustryQuantity10kv());
		 		lwWholeSaleDetailDto.setUnIndustryMoney10kv(lwWholeSaleDetailDtodm.getUnIndustryMoney10kv()+lwWholeSaleDetailDtogy.getUnIndustryMoney10kv()+lwWholeSaleDetailDtojy.getUnIndustryMoney10kv()+lwWholeSaleDetailDtoty.getUnIndustryMoney10kv());
		 		lwWholeSaleDetailDto.setUnIndustryQuantity35kv(lwWholeSaleDetailDtodm.getUnIndustryQuantity35kv()+lwWholeSaleDetailDtogy.getUnIndustryQuantity35kv()+lwWholeSaleDetailDtojy.getUnIndustryQuantity35kv()+lwWholeSaleDetailDtoty.getUnIndustryQuantity35kv());
		 		lwWholeSaleDetailDto.setUnIndustryMoney35kv(lwWholeSaleDetailDtodm.getUnIndustryMoney35kv()+lwWholeSaleDetailDtogy.getUnIndustryMoney35kv()+lwWholeSaleDetailDtojy.getUnIndustryMoney35kv()+lwWholeSaleDetailDtoty.getUnIndustryMoney35kv());
		 		String tuibudianfeegy=lwAllWholeFeeDtogy.getFujia5();
		 		String tuibudianfeety=lwAllWholeFeeDtoty.getFujia5();
		 		String tuibudianfeedm=lwAllWholeFeeDtodm.getFujia5();
		 		String tuibudianfeejy=lwAllWholeFeeDtojy.getFujia5();
		 		if(tuibudianfeegy.equals("")||tuibudianfeegy==null){
		 			tuibudianfeegy="0";
				}
		 		
		 		if(tuibudianfeety.equals("")||tuibudianfeety==null){
		 			tuibudianfeety="0";
				}
		 		
		 		if(tuibudianfeedm.equals("")||tuibudianfeedm==null){
		 			tuibudianfeedm="0";
				}
		 		
		 		if(tuibudianfeejy.equals("")||tuibudianfeejy==null){
		 			tuibudianfeejy="0";
				}
		 		
		 		LwAllWholeFeeDto  lwAllWholeFeeDto=new LwAllWholeFeeDto();
		 		
		 		lwAllWholeFeeDto.setFujia11(String.valueOf(Double.parseDouble(lwAllWholeFeeDtodm.getFujia11())+Double.parseDouble(lwAllWholeFeeDtogy.getFujia11())+Double.parseDouble(lwAllWholeFeeDtoty.getFujia11())+Double.parseDouble(lwAllWholeFeeDtojy.getFujia11())));

		 		lwAllWholeFeeDto.setFujia12(String.valueOf(Double.parseDouble(lwAllWholeFeeDtodm.getFujia12())+Double.parseDouble(lwAllWholeFeeDtogy.getFujia12())+Double.parseDouble(lwAllWholeFeeDtoty.getFujia12())+Double.parseDouble(lwAllWholeFeeDtojy.getFujia12())));
		 		
		 		lwAllWholeFeeDto.setPower1(String.valueOf(Double.parseDouble(lwAllWholeFeeDtodm.getPower1())+Double.parseDouble(lwAllWholeFeeDtogy.getPower1())+Double.parseDouble(lwAllWholeFeeDtoty.getPower1())+Double.parseDouble(lwAllWholeFeeDtojy.getPower1())));
		 		
		 		lwAllWholeFeeDto.setDianfei(String.valueOf(Double.parseDouble(lwAllWholeFeeDtodm.getDianfei())+Double.parseDouble(lwAllWholeFeeDtogy.getDianfei())+Double.parseDouble(lwAllWholeFeeDtoty.getDianfei())+Double.parseDouble(lwAllWholeFeeDtojy.getDianfei())));
		 		
		 		lwAllWholeFeeDto.setDianfeitax(String.valueOf(Double.parseDouble(lwAllWholeFeeDtodm.getDianfeitax())+Double.parseDouble(lwAllWholeFeeDtogy.getDianfeitax())+Double.parseDouble(lwAllWholeFeeDtoty.getDianfeitax())+Double.parseDouble(lwAllWholeFeeDtojy.getDianfeitax())));
		 		
		 		lwAllWholeFeeDto.setHaiminglu(String.valueOf(Double.parseDouble(lwAllWholeFeeDtodm.getHaiminglu())+Double.parseDouble(lwAllWholeFeeDtogy.getHaiminglu())+Double.parseDouble(lwAllWholeFeeDtoty.getHaiminglu())+Double.parseDouble(lwAllWholeFeeDtojy.getHaiminglu())));
		 		
		 		lwAllWholeFeeDto.setFujia2(String.valueOf(Double.parseDouble(lwAllWholeFeeDtodm.getFujia2())+Double.parseDouble(lwAllWholeFeeDtogy.getFujia2())+Double.parseDouble(lwAllWholeFeeDtoty.getFujia2())+Double.parseDouble(lwAllWholeFeeDtojy.getFujia2())));
		 		
		 		lwAllWholeFeeDto.setFujia3(String.valueOf(Double.parseDouble(lwAllWholeFeeDtodm.getFujia3())+Double.parseDouble(lwAllWholeFeeDtogy.getFujia3())+Double.parseDouble(lwAllWholeFeeDtoty.getFujia3())+Double.parseDouble(lwAllWholeFeeDtojy.getFujia3())));
		 		
		 		lwAllWholeFeeDto.setDuobian(String.valueOf(Double.parseDouble(lwAllWholeFeeDtodm.getDuobian())+Double.parseDouble(lwAllWholeFeeDtogy.getDuobian())+Double.parseDouble(lwAllWholeFeeDtoty.getDuobian())+Double.parseDouble(lwAllWholeFeeDtojy.getDuobian())));
		 		
		 		lwAllWholeFeeDto.setFujia5(String.valueOf(Double.parseDouble(tuibudianfeejy)+Double.parseDouble(tuibudianfeety)+Double.parseDouble(tuibudianfeedm)+Double.parseDouble(tuibudianfeegy)));
		 		httpServletRequest.setAttribute("sumwc", df.format(sumwc));
		 httpServletRequest.setAttribute("sumwfee", df.format(sumwfee));
		 httpServletRequest.setAttribute("sumwpower",Math.round(sumwpower));
		 httpServletRequest.setAttribute("sumwtax", df.format(sumwtax));
		 httpServletRequest.setAttribute("summwdianjin", df.format(summwdianjin));
		 httpServletRequest.setAttribute("sumwdianjintax", df.format(sumwdianjintax));
		 httpServletRequest.setAttribute("sumwsanxia", df.format(sumwsanxia));
		 httpServletRequest.setAttribute("sumwsanxiatax", df.format(sumwsanxiatax));
		 httpServletRequest.setAttribute("sumwjijin", df.format(sumwjijin));
		 httpServletRequest.setAttribute("sumwjijintax", df.format(sumwjijintax));
		 httpServletRequest.setAttribute("Sumlilv", df.format(Sumlilv));
		httpServletRequest.setAttribute("lwAllWholeFeeDtogy", lwAllWholeFeeDtogy);
		httpServletRequest.setAttribute("lwAllWholeFeeDtodm", lwAllWholeFeeDtodm);
		httpServletRequest.setAttribute("lwAllWholeFeeDtojy", lwAllWholeFeeDtojy);
		httpServletRequest.setAttribute("lwAllWholeFeeDtoty", lwAllWholeFeeDtoty);
		httpServletRequest.setAttribute("lwAllWholeFeeDto", lwAllWholeFeeDto);
		
		httpServletRequest.setAttribute("lwWholeSaleDetailDtogy", lwWholeSaleDetailDtogy);
		httpServletRequest.setAttribute("lwWholeSaleDetailDtodm", lwWholeSaleDetailDtodm);
		httpServletRequest.setAttribute("lwWholeSaleDetailDtojy", lwWholeSaleDetailDtojy);
		httpServletRequest.setAttribute("lwWholeSaleDetailDtoty", lwWholeSaleDetailDtoty);
		httpServletRequest.setAttribute("lwWholeSaleDetailDto", lwWholeSaleDetailDto);
		return actionMapping.findForward("everywholesale");
	}

}
