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

import com.elongway.pss.bl.facade.BLLwAllWholeFeeFacade;
import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwPowerFeeFaxingFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIAllCountAction extends Action {

	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		String inputDate = httpServletRequest.getParameter("inputDate");
		httpServletRequest.setAttribute("inputDate", inputDate);
		String statmonth = inputDate.substring(0, 7);
		BLLwPowerFeeFaxingFacade blLwPowerFeeFaxingFacade = new BLLwPowerFeeFaxingFacade();
		/**
		 * modify by qiaoyouliang 2009-06-29 begin
		 * 修改报表数据来源
		 */
		LwPowerFeeFaxingDto wholeSaleFaXingDto = null;
		wholeSaleFaXingDto = blLwPowerFeeFaxingFacade.findByPrimaryKey("sumwhole", statmonth, "1");
		
		if(wholeSaleFaXingDto==null){
			throw new UserException(-6, -706, this.getClass().getName(),
			"本月电量电费报表还没有进行保存。");
		}
		LwPowerFeeFaxingDto corporationXingDto = null;
		corporationXingDto = blLwPowerFeeFaxingFacade.findByPrimaryKey("sumcorp", statmonth, "1");
		Collection<LwPowerFeeFaxingDto> list = new ArrayList<LwPowerFeeFaxingDto>();
		LwPowerFeeFaxingDto  sumFaXingDto = new LwPowerFeeFaxingDto();
		
		list.add(corporationXingDto);
		list.add(wholeSaleFaXingDto);
		
		double sumallfee = 0;
		double sumallpower = 0;
		double sumallc = 0;
		double sumalltax = 0;
		double sumallall = 0;
		double sumalldianjin = 0;
		double sumalldianjintax = 0;
		double sumallsanxia = 0;
		double sumallsanxiatax = 0;
		double sumalljijin = 0;
		double sumalljijintax = 0;
		double differenceQuantity = 0;
		double differenceFee = 0.2;
		double differenceTax = 0;
		
		sumallfee = corporationXingDto.getSumFee()+wholeSaleFaXingDto.getSumFee();
		 sumallpower = corporationXingDto.getQuantity()+wholeSaleFaXingDto.getQuantity();
		 sumallc = corporationXingDto.getPurePowerFee()+wholeSaleFaXingDto.getPurePowerFee();
		 sumalltax = corporationXingDto.getPowerFeeTax() + wholeSaleFaXingDto.getPowerFeeTax();
		 sumalldianjin = corporationXingDto.getPureDianJin()+wholeSaleFaXingDto.getPureDianJin();
		 sumalldianjintax = corporationXingDto.getDianJinTax()+wholeSaleFaXingDto.getDianJinTax();
		 sumallsanxia = corporationXingDto.getSanXiaFee()+wholeSaleFaXingDto.getSanXiaFee();
		 sumallsanxiatax = corporationXingDto.getSanXiaTax()+wholeSaleFaXingDto.getSanXiaFee();
		 sumalljijin = corporationXingDto.getPureJiJin()+wholeSaleFaXingDto.getPureJiJin();
		 sumalljijintax = corporationXingDto.getJiJinTax()+wholeSaleFaXingDto.getJiJinTax();
		 differenceFee = corporationXingDto.getChaBieFee()+wholeSaleFaXingDto.getChaBieFee();
		 differenceTax = corporationXingDto.getChaBieTax()+wholeSaleFaXingDto.getChaBieTax();
		 
		 sumFaXingDto.setUserNo("sumFaXing");
		 sumFaXingDto.setQuantity(new Double(sumallpower).longValue()); 
		 sumFaXingDto.setPurePowerFee(sumallc);
		 sumFaXingDto.setPowerFeeTax(sumalltax);
		 sumFaXingDto.setPureDianJin(sumalldianjin);
		 sumFaXingDto.setDianJinTax(sumalldianjintax);
		 sumFaXingDto.setSanXiaFee(sumallsanxiatax);
		 sumFaXingDto.setSanXiaTax(sumallsanxiatax);
		 sumFaXingDto.setPureJiJin(sumalljijin);
		 sumFaXingDto.setJiJinTax(sumalljijintax);
		 sumFaXingDto.setChaBieFee(differenceFee);
		 sumFaXingDto.setChaBieTax(differenceTax);
		 sumFaXingDto.setSumFee(sumallfee);
		  list.add(sumFaXingDto);
		  
		  httpServletRequest.setAttribute("list", list);
		  httpServletRequest.setAttribute("statMonth", statmonth);
		  
		 String flag = httpServletRequest.getParameter("flag");
		 if(flag == null){
			 return actionMapping.findForward("viewallcount");
		 }else{
			 return actionMapping.findForward("viewallcount1");
		 }
//		
//		/**
//		 * Modify by qiaoyouliang 2009-06-29 end
//		 * 
//		 */
//		
//		
//		double sumffee = 0;
//		double sumfpower = 0;
//		double sumfdianfee = 0;
//		double sumftax = 0;
//		double sumfc = 0;
//		double summfdianjinall = 0;
//		double summfdianjin = 0;
//		double sumfdianjintax = 0;
//		double sumfsanxiaall = 0;
//		double sumfsanxia = 0;
//		double sumfsanxiatax = 0;
//		double sumfjijinall = 0;
//		double sumfjijin = 0;
//		double sumfjijintax = 0;
//		double sumallffee = 0;
//
//		double sumwfee = 0;
//		double sumwpower = 0;
//		double sumwdianfee = 0;
//		double sumwtax = 0;
//		double sumwc = 0;
//		double summwdianjinall = 0;
//		double summwdianjin = 0;
//		double sumwdianjintax = 0;
//		double sumwsanxiaall = 0;
//		double sumwsanxia = 0;
//		double sumwsanxiatax = 0;
//		double sumwjijinall = 0;
//		double sumwjijin = 0;
//		double sumwjijintax = 0;
//		double pepolepowergd = 0;
//		double notpepolepowergd = 0;
//		double bizpowergd = 0;
//		double productpowergd = 0;
//		double industrypowergd = 0;
//		double farmpowergd = 0;
//		double pepolepowerjt = 0;
//		double notpepolepowerjt = 0;
//		double bizpowerjt = 0;
//		double productpowerjt = 0;
//		double industrypowerjt = 0;
//		double farmpowerjt = 0;
//		double sumallwfee = 0;
//
////		double sumallfee = 0;
////		double sumallpower = 0;
////		double sumallc = 0;
////		double sumalltax = 0;
////		double sumallall = 0;
////		double sumalldianjin = 0;
////		double sumalldianjintax = 0;
////		double sumallsanxia = 0;
////		double sumallsanxiatax = 0;
////		double sumalljijin = 0;
////		double sumalljijintax = 0;
////		double differenceQuantity = 0;
//		double differencePrice = 0.2;
//		double differenceQuantityFee = 0;
//
//		String conditions = " 1=1 and statmonth ='" + statmonth + "'";
//		String conditionwgy = " 1=1 and statmonth ='" + statmonth
//				+ "' and upcompany='gy' ";
//		String conditionwdm = " 1=1 and statmonth ='" + statmonth
//				+ "' and upcompany='dm' ";
//
//		String conditionwjy = " 1=1 and statmonth ='" + statmonth
//				+ "' and upcompany='jy' ";
//
//		String conditionwty = " 1=1 and statmonth ='" + statmonth
//				+ "' and upcompany='ty' ";
//		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade = new BLLwWholeSaleSummaryFacade();
//		Collection col = blLwWholeSaleSummaryFacade
//				.findByConditions(conditions);
//		
//		LwWholeSaleSummaryDto lwWholeSaleSummaryDto = new LwWholeSaleSummaryDto();
//		Iterator it = col.iterator();
//		while (it.hasNext()) {
//			lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto) it.next();
//			differenceQuantity += Double.parseDouble("".equals(lwWholeSaleSummaryDto.getDifferenceQuantity()) ? "0"
//					:lwWholeSaleSummaryDto.getDifferenceQuantity());
//		}
//
//		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();
//		Collection colf = blLwCorporationSummaryFacade
//				.findByConditions(conditions);
//		
//		if(colf==null){
//			throw new UserException(-6, -706, this.getClass().getName(),
//			"该月还没有算过费！");
//		}
//		PowerFeeCal powerFeeCal=new PowerFeeCal();
//		LwCorporationSummaryDto lwCorporationSummaryDto = new LwCorporationSummaryDto();
//		Iterator itf = colf.iterator();
//		while (itf.hasNext()) {
//			lwCorporationSummaryDto = (LwCorporationSummaryDto) itf.next();
//
//			if(lwCorporationSummaryDto.getLineCode().equals("20699999065")||lwCorporationSummaryDto.getLineCode().equals("20699999072")){
//				sumfpower +=lwCorporationSummaryDto.getElectricQuantity()+lwCorporationSummaryDto.getBeforPower()+lwCorporationSummaryDto.getLastPower();
//				}else{
//					sumfpower+=lwCorporationSummaryDto.getElectricQuantity();
//				}
//				if(lwCorporationSummaryDto.getLineCode().equals("20699999065")||lwCorporationSummaryDto.getLineCode().equals("20699999072")){
//				
//					sumfdianfee += lwCorporationSummaryDto.getPeakFee()
//					+ lwCorporationSummaryDto.getPowerRateFee()
//					
//					+ lwCorporationSummaryDto.getContentFee()
//					+ lwCorporationSummaryDto.getNeedFee()
//					+ lwCorporationSummaryDto.getUnDenizenFee()
//					+lwCorporationSummaryDto.getBeforFee()
//					+lwCorporationSummaryDto.getLastFee()
//					+lwCorporationSummaryDto.getUnLineLoss();
//					sumfc+=powerFeeCal.getValue((lwCorporationSummaryDto.getPeakFee()
//							+ lwCorporationSummaryDto.getPowerRateFee()							
//							+ lwCorporationSummaryDto.getContentFee()
//							+ lwCorporationSummaryDto.getNeedFee()
//							+ lwCorporationSummaryDto.getUnDenizenFee()
//							+lwCorporationSummaryDto.getBeforFee()
//							+lwCorporationSummaryDto.getLastFee()
//							+lwCorporationSummaryDto.getUnLineLoss())/1.17, AppConst.TWO_DOT_FLAG);
//					sumftax+=powerFeeCal.getValue((lwCorporationSummaryDto.getPeakFee()
//							+ lwCorporationSummaryDto.getPowerRateFee()							
//							+ lwCorporationSummaryDto.getContentFee()
//							+ lwCorporationSummaryDto.getNeedFee()
//							+ lwCorporationSummaryDto.getUnDenizenFee()
//							+lwCorporationSummaryDto.getBeforFee()
//							+lwCorporationSummaryDto.getLastFee()
//							+lwCorporationSummaryDto.getUnLineLoss())/1.17*0.17, AppConst.TWO_DOT_FLAG);
//
//				}else{sumfdianfee += lwCorporationSummaryDto.getPointerFee()
//						+ lwCorporationSummaryDto.getPowerRateFee()
//						+ lwCorporationSummaryDto.getContentFee()
//						+ lwCorporationSummaryDto.getNeedFee()
//						+ lwCorporationSummaryDto.getUnDenizenFee()
//						+lwCorporationSummaryDto.getUnLineLoss();
//				sumfc += PowerFeeCal
//				.getValue(
//						(lwCorporationSummaryDto
//								.getPointerFee()
//								+ lwCorporationSummaryDto
//										.getContentFee()
//								+ lwCorporationSummaryDto
//										.getNeedFee()
//								+ lwCorporationSummaryDto
//										.getPowerRateFee()
//								+ lwCorporationSummaryDto
//										.getUnDenizenFee() + lwCorporationSummaryDto
//								.getUnLineLoss()+lwCorporationSummaryDto.getTaobiaoFee()+lwCorporationSummaryDto.getLastFee()) / 1.17,
//						AppConst.TWO_DOT_FLAG);
//				sumftax+=PowerFeeCal
//				.getValue(
//						(lwCorporationSummaryDto
//								.getPointerFee()
//								+ lwCorporationSummaryDto
//										.getContentFee()
//								+ lwCorporationSummaryDto
//										.getNeedFee()
//								+ lwCorporationSummaryDto
//										.getPowerRateFee()
//								+ lwCorporationSummaryDto
//										.getUnDenizenFee() + lwCorporationSummaryDto
//								.getUnLineLoss()+lwCorporationSummaryDto.getTaobiaoFee()+lwCorporationSummaryDto.getLastFee()) / 1.17*0.17,
//						AppConst.TWO_DOT_FLAG);
//				
//				}
//			summfdianjinall += lwCorporationSummaryDto.getPowerFee();
//			summfdianjin+=powerFeeCal.getValue(lwCorporationSummaryDto.getPowerFee()/1.17, AppConst.TWO_DOT_FLAG);
//			sumfdianjintax+=powerFeeCal.getValue((lwCorporationSummaryDto.getPowerFee()-lwCorporationSummaryDto.getPowerFee()/1.17), AppConst.TWO_DOT_FLAG);
//			sumfsanxiaall += lwCorporationSummaryDto.getSanXiaFee();
//			sumfsanxia+=powerFeeCal.getValue(lwCorporationSummaryDto.getSanXiaFee()/1.17, AppConst.TWO_DOT_FLAG);
//			sumfsanxiatax+=powerFeeCal.getValue((lwCorporationSummaryDto.getSanXiaFee()-lwCorporationSummaryDto.getSanXiaFee()/1.17), AppConst.TWO_DOT_FLAG);
//			sumfjijinall += lwCorporationSummaryDto.getSurcharge();
//			sumfjijin+=powerFeeCal.getValue(lwCorporationSummaryDto.getSurcharge()/1.17, AppConst.TWO_DOT_FLAG);
//			sumfjijintax+=powerFeeCal.getValue((lwCorporationSummaryDto.getSurcharge()-lwCorporationSummaryDto.getSurcharge()/1.17), AppConst.TWO_DOT_FLAG);
//			sumffee += PowerFeeCal.getValue(lwCorporationSummaryDto.getSumFee(),AppConst.TWO_DOT_FLAG);
//
//		}
//
//		DecimalFormat df = new DecimalFormat("###0.00");
//
//		BLLwAllWholeFeeFacade blLwAllWholeFeeFacade = new BLLwAllWholeFeeFacade();
//		LwAllWholeFeeDto lwAllWholeFeeDtogy = blLwAllWholeFeeFacade
//				.findByPrimaryKey("gy", statmonth);
//		if(lwAllWholeFeeDtogy==null){
//			throw new UserException(-6, -706, this.getClass().getName(),
//			"该月还没有算过费！");
//		}
//		LwAllWholeFeeDto lwAllWholeFeeDtodm = blLwAllWholeFeeFacade
//				.findByPrimaryKey("dm", statmonth);
//		if(lwAllWholeFeeDtodm==null){
//			throw new UserException(-6, -706, this.getClass().getName(),
//			"该月还没有算过费！");
//		}
//		LwAllWholeFeeDto lwAllWholeFeeDtoty = blLwAllWholeFeeFacade
//				.findByPrimaryKey("ty", statmonth);
//		if(lwAllWholeFeeDtoty==null){
//			throw new UserException(-6, -706, this.getClass().getName(),
//			"该月还没有算过费！");
//		}
//		
//		LwAllWholeFeeDto lwAllWholeFeeDtojy = blLwAllWholeFeeFacade
//				.findByPrimaryKey("jy", statmonth);
//		if(lwAllWholeFeeDtojy==null){
//			throw new UserException(-6, -706, this.getClass().getName(),
//			"该月还没有算过费！");
//		}
//	
//		 sumwc=((Double.parseDouble(lwAllWholeFeeDtogy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtogy.getJijin())-Double.parseDouble(lwAllWholeFeeDtogy.getFujia1()))+
//					(Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtodm.getJijin())-Double.parseDouble(lwAllWholeFeeDtodm.getFujia1()))+
//					(Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtoty.getJijin())-Double.parseDouble(lwAllWholeFeeDtoty.getFujia1()))+
//					(Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtojy.getJijin())-Double.parseDouble(lwAllWholeFeeDtojy.getFujia1()))-differenceQuantity*0.2)/1.17;
//
//		sumwfee = Double
//				.parseDouble("".equals(lwAllWholeFeeDtogy.getSumfee()) ? "0"
//						: lwAllWholeFeeDtogy.getSumfee())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtoty.getSumfee()) ? "0"
//								: lwAllWholeFeeDtoty.getSumfee())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtodm.getSumfee()) ? "0"
//								: lwAllWholeFeeDtodm.getSumfee())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtojy.getSumfee()) ? "0"
//								: lwAllWholeFeeDtojy.getSumfee());
//		sumwpower = Double.parseDouble(""
//				.equals(lwAllWholeFeeDtogy.getPower1()) ? "0"
//				: lwAllWholeFeeDtogy.getPower1())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtoty.getPower1()) ? "0"
//								: lwAllWholeFeeDtoty.getPower1())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtodm.getPower1()) ? "0"
//								: lwAllWholeFeeDtodm.getPower1())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtojy.getPower1()) ? "0"
//								: lwAllWholeFeeDtojy.getPower1());
//		sumwtax = ((Double.parseDouble("".equals(lwAllWholeFeeDtogy.getSumfee()) ? "0"
//				:lwAllWholeFeeDtogy.getSumfee())
//				- Double.parseDouble("".equals(lwAllWholeFeeDtogy.getSanxia()) ? "0" :lwAllWholeFeeDtogy.getSanxia())
//				- Double.parseDouble("".equals(lwAllWholeFeeDtogy.getSanxiatax())? "0" :lwAllWholeFeeDtogy.getSanxiatax())
//				- Double.parseDouble("".equals(lwAllWholeFeeDtogy.getDianjin())? "0" :lwAllWholeFeeDtogy.getDianjin())
//				- Double.parseDouble("".equals(lwAllWholeFeeDtogy.getDianjintax())? "0" :lwAllWholeFeeDtogy.getDianjintax())
//				- Double.parseDouble("".equals(lwAllWholeFeeDtogy.getJijin())? "0" :lwAllWholeFeeDtogy.getJijin()) - Double
//				.parseDouble("".equals(lwAllWholeFeeDtogy.getFujia1())? "0" :lwAllWholeFeeDtogy.getFujia1()))
//				+ (Double.parseDouble("".equals(lwAllWholeFeeDtodm.getSumfee())? "0" :lwAllWholeFeeDtodm.getSumfee())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtodm.getSanxia())? "0" :lwAllWholeFeeDtodm.getSanxia())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtodm.getSanxiatax())? "0" :lwAllWholeFeeDtodm.getSanxiatax())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtodm.getDianjin())? "0" :lwAllWholeFeeDtodm.getDianjin())
//						- Double
//								.parseDouble("".equals(lwAllWholeFeeDtodm.getDianjintax())? "0" :lwAllWholeFeeDtodm.getDianjintax())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtodm.getJijin())? "0" :lwAllWholeFeeDtodm.getJijin()) - Double
//						.parseDouble("".equals(lwAllWholeFeeDtodm.getFujia1())? "0" :lwAllWholeFeeDtodm.getFujia1()))
//				+ (Double.parseDouble("".equals(lwAllWholeFeeDtoty.getSumfee())? "0" :lwAllWholeFeeDtoty.getSumfee())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtoty.getSanxia())? "0" :lwAllWholeFeeDtoty.getSanxia())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtoty.getSanxiatax())? "0" :lwAllWholeFeeDtoty.getSanxiatax())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtoty.getDianjin())? "0" :lwAllWholeFeeDtoty.getDianjin())
//						- Double
//								.parseDouble("".equals(lwAllWholeFeeDtoty.getDianjintax())? "0" :lwAllWholeFeeDtoty.getDianjintax())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtoty.getJijin())? "0" :lwAllWholeFeeDtoty.getJijin()) - Double
//						.parseDouble("".equals(lwAllWholeFeeDtoty.getFujia1())? "0" :lwAllWholeFeeDtoty.getFujia1()))
//				+ (Double.parseDouble("".equals(lwAllWholeFeeDtojy.getSumfee())? "0" :lwAllWholeFeeDtojy.getSumfee())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtojy.getSanxia())? "0" :lwAllWholeFeeDtojy.getSanxia())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtojy.getSanxiatax())? "0" :lwAllWholeFeeDtojy.getSanxiatax())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtojy.getDianjin())? "0" :lwAllWholeFeeDtojy.getDianjin())
//						- Double
//								.parseDouble("".equals(lwAllWholeFeeDtojy.getDianjintax())? "0" :lwAllWholeFeeDtojy.getDianjintax())
//						- Double.parseDouble("".equals(lwAllWholeFeeDtojy.getJijin())? "0" :lwAllWholeFeeDtojy.getJijin()) - Double
//						.parseDouble("".equals(lwAllWholeFeeDtojy.getFujia1())? "0" :lwAllWholeFeeDtojy.getFujia1())) - differenceQuantity * 0.2) / 1.17 * 0.17;
//		summwdianjin = Double.parseDouble("".equals(lwAllWholeFeeDtogy
//				.getDianjin()) ? "0" : lwAllWholeFeeDtogy.getDianjin())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtoty.getDianjin()) ? "0"
//								: lwAllWholeFeeDtoty.getDianjin())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtodm.getDianjin()) ? "0"
//								: lwAllWholeFeeDtodm.getDianjin())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtojy.getDianjin()) ? "0"
//								: lwAllWholeFeeDtojy.getDianjin());
//		sumwdianjintax = Double.parseDouble("".equals(lwAllWholeFeeDtogy
//				.getDianjintax()) ? "0" : lwAllWholeFeeDtogy.getDianjintax())
//				+ Double.parseDouble("".equals(lwAllWholeFeeDtoty
//						.getDianjintax()) ? "0" : lwAllWholeFeeDtoty
//						.getDianjintax())
//				+ Double.parseDouble("".equals(lwAllWholeFeeDtodm
//						.getDianjintax()) ? "0" : lwAllWholeFeeDtodm
//						.getDianjintax())
//				+ Double.parseDouble("".equals(lwAllWholeFeeDtojy
//						.getDianjintax()) ? "0" : lwAllWholeFeeDtojy
//						.getDianjintax());
//		sumwsanxia = Double.parseDouble("".equals(lwAllWholeFeeDtogy
//				.getSanxia()) ? "0" : lwAllWholeFeeDtogy.getSanxia())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtoty.getSanxia()) ? "0"
//								: lwAllWholeFeeDtoty.getSanxia())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtodm.getSanxia()) ? "0"
//								: lwAllWholeFeeDtodm.getSanxia())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtojy.getSanxia()) ? "0"
//								: lwAllWholeFeeDtojy.getSanxia());
//		sumwsanxiatax = Double.parseDouble("".equals(lwAllWholeFeeDtogy
//				.getSanxiatax()) ? "0" : lwAllWholeFeeDtogy.getSanxiatax())
//				+ Double.parseDouble("".equals(lwAllWholeFeeDtoty
//						.getSanxiatax()) ? "0" : lwAllWholeFeeDtoty
//						.getSanxiatax())
//				+ Double.parseDouble("".equals(lwAllWholeFeeDtodm
//						.getSanxiatax()) ? "0" : lwAllWholeFeeDtodm
//						.getSanxiatax())
//				+ Double.parseDouble("".equals(lwAllWholeFeeDtojy
//						.getSanxiatax()) ? "0" : lwAllWholeFeeDtojy
//						.getSanxiatax());
//		sumwjijin = Double
//				.parseDouble("".equals(lwAllWholeFeeDtogy.getJijin()) ? "0"
//						: lwAllWholeFeeDtogy.getJijin())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtoty.getJijin()) ? "0"
//								: lwAllWholeFeeDtoty.getJijin())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtodm.getJijin()) ? "0"
//								: lwAllWholeFeeDtodm.getJijin())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtojy.getJijin()) ? "0"
//								: lwAllWholeFeeDtojy.getJijin());
//		sumwjijintax = Double.parseDouble("".equals(lwAllWholeFeeDtogy
//				.getFujia1()) ? "0" : lwAllWholeFeeDtogy.getFujia1())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtoty.getFujia1()) ? "0"
//								: lwAllWholeFeeDtoty.getFujia1())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtodm.getFujia1()) ? "0"
//								: lwAllWholeFeeDtodm.getFujia1())
//				+ Double
//						.parseDouble("".equals(lwAllWholeFeeDtojy.getFujia1()) ? "0"
//								: lwAllWholeFeeDtojy.getFujia1());
//		sumwdianfee = sumwc + sumwtax;
//		
//		sumfdianfee =  sumftax+sumfc;
//		sumallfee = sumfdianfee + sumwdianfee;
//		sumallpower = sumfpower + sumwpower;
//		sumallc = sumwc + sumfc;
//		sumalltax = sumwtax + sumftax;
//		sumallall = sumwfee + sumffee;
//		sumalldianjin = summwdianjin + summfdianjin;
//		sumalldianjintax = sumwdianjintax + sumfdianjintax;
//		sumallsanxia = sumwsanxia + sumfsanxia;
//		sumallsanxiatax = sumwsanxiatax + sumfsanxiatax;
//		sumalljijin = sumwjijin + sumfjijin;
//		sumalljijintax = sumwjijintax + sumfjijintax;
//		httpServletRequest.setAttribute("sumffee", df.format(sumffee));
//		httpServletRequest.setAttribute("sumfpower", Math.round(sumfpower));
//		httpServletRequest.setAttribute("sumfdianfee", df.format(sumfdianfee));
//		httpServletRequest.setAttribute("sumftax", df.format(sumftax));
//		httpServletRequest.setAttribute("sumfc", df.format(sumfc));
//		httpServletRequest
//				.setAttribute("summfdianjin", df.format(summfdianjin));
//		httpServletRequest.setAttribute("sumfdianjintax", df
//				.format(sumfdianjintax));
//		httpServletRequest.setAttribute("sumfsanxia", df.format(sumfsanxia));
//		httpServletRequest.setAttribute("sumfsanxiatax", df
//				.format(sumfsanxiatax));
//		httpServletRequest.setAttribute("sumfjijin", df.format(sumfjijin));
//		httpServletRequest
//				.setAttribute("sumfjijintax", df.format(sumfjijintax));
//		httpServletRequest.setAttribute("sumwfee", df.format(sumwfee));
//		httpServletRequest.setAttribute("sumwpower", Math.round(sumwpower));
//		httpServletRequest.setAttribute("sumwdianfee", df.format(sumwdianfee));
//		httpServletRequest.setAttribute("sumwtax", df.format(sumwtax));
//		httpServletRequest.setAttribute("sumwc", df.format(sumwc));
//		httpServletRequest
//				.setAttribute("summwdianjin", df.format(summwdianjin));
//		httpServletRequest.setAttribute("sumwdianjintax", df
//				.format(sumwdianjintax));
//
//		httpServletRequest.setAttribute("sumwsanxia", df.format(sumwsanxia));
//		httpServletRequest.setAttribute("sumwsanxiatax", df
//				.format(sumwsanxiatax));
//		httpServletRequest.setAttribute("sumwjijin", df.format(sumwjijin));
//		httpServletRequest
//				.setAttribute("sumwjijintax", df.format(sumwjijintax));
//		httpServletRequest.setAttribute("sumallfee", df.format(sumallfee));
//		httpServletRequest.setAttribute("sumallpower", Math.round(sumallpower));
//		httpServletRequest.setAttribute("sumallc", df.format(sumallc));
//		httpServletRequest.setAttribute("sumalltax", df.format(sumalltax));
//		httpServletRequest.setAttribute("sumallall", df.format(sumallall));
//		httpServletRequest.setAttribute("sumalldianjin", df
//				.format(sumalldianjin));
//		httpServletRequest.setAttribute("sumalldianjintax", df
//				.format(sumalldianjintax));
//
//		httpServletRequest.setAttribute("differenceQuantityFee", df
//				.format(differenceQuantity * 0.2));
//		httpServletRequest
//				.setAttribute("sumallsanxia", df.format(sumallsanxia));
//		httpServletRequest.setAttribute("sumallsanxiatax", df
//				.format(sumallsanxiatax));
//		httpServletRequest.setAttribute("sumalljijin", df.format(sumalljijin));
//		httpServletRequest.setAttribute("sumalljijintax", df
//				.format(sumalljijintax));
		
		
	}
}
