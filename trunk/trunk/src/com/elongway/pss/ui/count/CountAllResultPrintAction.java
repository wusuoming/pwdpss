package com.elongway.pss.ui.count;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAllWholeFeeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwShouShuTableFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleDetailFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.dto.domain.LwShouShuTableDto;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class CountAllResultPrintAction extends Action {

	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		String inputDate = httpServletRequest.getParameter("inputDate");
		httpServletRequest.setAttribute("inputDate", inputDate);
		String statmonth = inputDate.substring(0, 7);
		
		//向手输表里输入数据start
		String lwsumfpower = httpServletRequest.getParameter("lwsumfpower");
		String lwsumfc = httpServletRequest.getParameter("lwsumfc");
		String lwsumftax = httpServletRequest.getParameter("lwsumftax");
		String lwsumfdianfee = httpServletRequest.getParameter("lwsumfdianfee");
		String lwdiffrentfee = httpServletRequest.getParameter("lwdiffrentfee");
		String lwdiffrentfeetax = httpServletRequest.getParameter("lwdiffrentfeetax");
		String lwsummfdianjin = httpServletRequest.getParameter("lwsummfdianjin");
		String lwsumfdianjintax = httpServletRequest.getParameter("lwsumfdianjintax");
		String lwsumfsanxia = httpServletRequest.getParameter("lwsumfsanxia");
		String lwsumfsanxiatax = httpServletRequest.getParameter("lwsumfsanxiatax");
		String lwsumfjijin = httpServletRequest.getParameter("lwsumfjijin");
		String lwsumfjijintax = httpServletRequest.getParameter("lwsumfjijintax");
		String lwsumffee = httpServletRequest.getParameter("lwsumffee");
		String lwsumwpower = httpServletRequest.getParameter("lwsumwpower");
		String lwsumwc = httpServletRequest.getParameter("lwsumwc");
		String lwsumwtax = httpServletRequest.getParameter("lwsumwtax");
		String lwsumwdianfee = httpServletRequest.getParameter("lwsumwdianfee");
		String lwdiffrentwfee = httpServletRequest.getParameter("lwdiffrentwfee");
		String lwdiffrentwfeetax = httpServletRequest.getParameter("lwdiffrentwfeetax");
		String lwsummwdianjin = httpServletRequest.getParameter("lwsummwdianjin");
		String lwsumwdianjintax = httpServletRequest.getParameter("lwsumwdianjintax");
		String lwsumwsanxia = httpServletRequest.getParameter("lwsumwsanxia");
		String lwsumwsanxiatax = httpServletRequest.getParameter("lwsumwsanxiatax");
		String lwsumwjijin = httpServletRequest.getParameter("lwsumwjijin");
		String lwsumwjijintax = httpServletRequest.getParameter("lwsumwjijintax");
		String lwsumwfee = httpServletRequest.getParameter("lwsumwfee");
		if(lwdiffrentfee.equals("")||lwdiffrentfee==null||lwdiffrentfeetax.equals("")||lwdiffrentfeetax==null){
			
			lwdiffrentfee="0";
			lwdiffrentfeetax="0";
		}
if(lwdiffrentwfee.equals("")||lwdiffrentwfee==null||lwdiffrentwfeetax.equals("")||lwdiffrentwfeetax==null){
			
			lwdiffrentwfee="0";
			lwdiffrentwfeetax="0";
		}
		BLLwShouShuTableFacade  blLwShouShuTableFacade=new BLLwShouShuTableFacade();
		LwShouShuTableDto  lwShouShuTableDto=new LwShouShuTableDto();
		lwShouShuTableDto.setMonth(statmonth);
		lwShouShuTableDto.setFeeType("ducorporation");
		lwShouShuTableDto.setPower(Double.parseDouble(lwsumfpower));
		lwShouShuTableDto.setChunDianFei(Double.parseDouble(lwsumfc));
		lwShouShuTableDto.setDianFeiTax(Double.parseDouble(lwsumftax));
		lwShouShuTableDto.setSumDianFee(Double.parseDouble(lwsumfdianfee));
		lwShouShuTableDto.setDiffrentFei(Double.parseDouble(lwdiffrentfee));
		lwShouShuTableDto.setDiffrentFeiTax(Double.parseDouble(lwdiffrentfeetax));
		lwShouShuTableDto.setJijin(Double.parseDouble(lwsumfjijin));
		lwShouShuTableDto.setJinjinTax(Double.parseDouble(lwsumfjijintax));
		lwShouShuTableDto.setSanXia(Double.parseDouble(lwsumfsanxia));
		lwShouShuTableDto.setSanXiaTax(Double.parseDouble(lwsumfsanxiatax));
		lwShouShuTableDto.setDianJin(Double.parseDouble(lwsummfdianjin));
		lwShouShuTableDto.setDianJinTax(Double.parseDouble(lwsumfdianjintax));
		lwShouShuTableDto.setSumFee(Double.parseDouble(lwsumffee));
		blLwShouShuTableFacade.delete(statmonth, "ducorporation");
		blLwShouShuTableFacade.insert(lwShouShuTableDto);
		
		
		
		LwShouShuTableDto  lwwShouShuTableDto=new LwShouShuTableDto();
		lwwShouShuTableDto.setMonth(statmonth);
		lwwShouShuTableDto.setFeeType("duwholesale");
		lwwShouShuTableDto.setPower(Double.parseDouble(lwsumwpower));
		lwwShouShuTableDto.setChunDianFei(Double.parseDouble(lwsumwc));
		lwwShouShuTableDto.setDianFeiTax(Double.parseDouble(lwsumwtax));
		lwwShouShuTableDto.setSumDianFee(Double.parseDouble(lwsumwdianfee));
		lwwShouShuTableDto.setDiffrentFei(Double.parseDouble(lwdiffrentwfee));
		lwwShouShuTableDto.setDiffrentFeiTax(Double.parseDouble(lwdiffrentwfeetax));
		lwwShouShuTableDto.setJijin(Double.parseDouble(lwsumwjijin));
		lwwShouShuTableDto.setJinjinTax(Double.parseDouble(lwsumwjijintax));
		lwwShouShuTableDto.setSanXia(Double.parseDouble(lwsumwsanxia));
		lwwShouShuTableDto.setSanXiaTax(Double.parseDouble(lwsumwsanxiatax));
		lwwShouShuTableDto.setDianJin(Double.parseDouble(lwsummwdianjin));
		lwwShouShuTableDto.setDianJinTax(Double.parseDouble(lwsumwdianjintax));
		lwwShouShuTableDto.setSumFee(Double.parseDouble(lwsumwfee));
		blLwShouShuTableFacade.delete(statmonth, "duwholesale");
		blLwShouShuTableFacade.insert(lwwShouShuTableDto);
		
		
		
		
		
		

		LwShouShuTableDto wholesaleshoushulwShouShuTableDto=new LwShouShuTableDto();
		wholesaleshoushulwShouShuTableDto=blLwShouShuTableFacade.findByPrimaryKey(statmonth, "shoushuwholesale");
		if(wholesaleshoushulwShouShuTableDto==null){
			LwShouShuTableDto wholesaleshoushulwShouShuTableDto1=new LwShouShuTableDto();
		wholesaleshoushulwShouShuTableDto1.setMonth(statmonth);
		wholesaleshoushulwShouShuTableDto1.setFeeType("shoushuwholesale");
			wholesaleshoushulwShouShuTableDto1.setPower(0);
			wholesaleshoushulwShouShuTableDto1.setChunDianFei(0);
			wholesaleshoushulwShouShuTableDto1.setDianFeiTax(0);
			wholesaleshoushulwShouShuTableDto1.setSumDianFee(0);
			wholesaleshoushulwShouShuTableDto1.setDiffrentFei(0);
			wholesaleshoushulwShouShuTableDto1.setDiffrentFeiTax(0);
			wholesaleshoushulwShouShuTableDto1.setJijin(0);
			wholesaleshoushulwShouShuTableDto1.setJinjinTax(0);
			wholesaleshoushulwShouShuTableDto1.setSanXia(0);
			wholesaleshoushulwShouShuTableDto1.setSanXiaTax(0);
			wholesaleshoushulwShouShuTableDto1.setDianJin(0);
			wholesaleshoushulwShouShuTableDto1.setDianJinTax(0);
			wholesaleshoushulwShouShuTableDto1.setSumFee(0);
			
			blLwShouShuTableFacade.insert(wholesaleshoushulwShouShuTableDto1);
		}
			
		
		
		LwShouShuTableDto  corporationshoushulwShouShuTableDto=new LwShouShuTableDto();
		corporationshoushulwShouShuTableDto=blLwShouShuTableFacade.findByPrimaryKey(statmonth, "shoushucorporation");
			if(corporationshoushulwShouShuTableDto==null){
				LwShouShuTableDto  corporationshoushulwShouShuTableDto1=new LwShouShuTableDto();
		corporationshoushulwShouShuTableDto1.setMonth(statmonth)	;
		corporationshoushulwShouShuTableDto1.setFeeType("shoushucorporation");
		corporationshoushulwShouShuTableDto1.setPower(0);
			corporationshoushulwShouShuTableDto1.setChunDianFei(0);
			corporationshoushulwShouShuTableDto1.setDianFeiTax(0);
			corporationshoushulwShouShuTableDto1.setSumDianFee(0);
			corporationshoushulwShouShuTableDto1.setDiffrentFei(0);
			corporationshoushulwShouShuTableDto1.setDiffrentFeiTax(0);
			corporationshoushulwShouShuTableDto1.setJijin(0);
			corporationshoushulwShouShuTableDto1.setJinjinTax(0);
			corporationshoushulwShouShuTableDto1.setSanXia(0);
			corporationshoushulwShouShuTableDto1.setSanXiaTax(0);
			corporationshoushulwShouShuTableDto1.setDianJin(0);
			corporationshoushulwShouShuTableDto1.setDianJinTax(0);
			corporationshoushulwShouShuTableDto1.setSumFee(0);
			blLwShouShuTableFacade.insert(corporationshoushulwShouShuTableDto1);
			}
			
			
		
		
		
		
		
		
		
		
		
		//end
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		double sumffee = 0;
		double sumfpower = 0;
		double sumfdianfee = 0;
		double sumftax = 0;
		double sumfc = 0;
		double summfdianjinall = 0;
		double summfdianjin = 0;
		double sumfdianjintax = 0;
		double sumfsanxiaall = 0;
		double sumfsanxia = 0;
		double sumfsanxiatax = 0;
		double sumfjijinall = 0;
		double sumfjijin = 0;
		double sumfjijintax = 0;
		double sumallffee = 0;

		double sumwfee = 0;
		double sumwpower = 0;
		double sumwdianfee = 0;
		double sumwtax = 0;
		double sumwc = 0;
		double summwdianjinall = 0;
		double summwdianjin = 0;
		double sumwdianjintax = 0;
		double sumwsanxiaall = 0;
		double sumwsanxia = 0;
		double sumwsanxiatax = 0;
		double sumwjijinall = 0;
		double sumwjijin = 0;
		double sumwjijintax = 0;
		double pepolepowergd = 0;
		double notpepolepowergd = 0;
		double bizpowergd = 0;
		double productpowergd = 0;
		double industrypowergd = 0;
		double farmpowergd = 0;
		double pepolepowerjt = 0;
		double notpepolepowerjt = 0;
		double bizpowerjt = 0;
		double productpowerjt = 0;
		double industrypowerjt = 0;
		double farmpowerjt = 0;
		double sumallwfee = 0;

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
		
		
		double differenceQuantity=0;
		double differencePrice=0.2;
		double differenceQuantityFee=0;

		String conditions = " 1=1 and statmonth ='" + statmonth + "'";
		String conditionwgd = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='gy' or upcompany='dm'";
		String conditionwtj = " 1=1 and statmonth ='" + statmonth
				+ "' and upcompany='ty' or upcompany='jy'";
		
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		Collection col=blLwWholeSaleSummaryFacade.findByConditions(conditions);
		LwWholeSaleSummaryDto  lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
		Iterator it=col.iterator();
		while(it.hasNext()){
			lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it.next();
			differenceQuantity+=Double.parseDouble(lwWholeSaleSummaryDto.getDifferenceQuantity());
		}
		
		
		
		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();
		Collection colf = blLwCorporationSummaryFacade
				.findByConditions(conditions);
		LwCorporationSummaryDto lwCorporationSummaryDto = new LwCorporationSummaryDto();
		Iterator itf = colf.iterator();
		while (itf.hasNext()) {
			lwCorporationSummaryDto = (LwCorporationSummaryDto) itf.next();
			if(lwCorporationSummaryDto.getLineCode().equals("20699999065")||lwCorporationSummaryDto.getLineCode().equals("20699999072")){
				sumfpower +=lwCorporationSummaryDto.getElectricQuantity()+lwCorporationSummaryDto.getBeforPower()+lwCorporationSummaryDto.getLastPower();
				}else{
					sumfpower+=lwCorporationSummaryDto.getElectricQuantity()+lwCorporationSummaryDto.getBeforPower()+lwCorporationSummaryDto.getLastPower();
				}
				if(lwCorporationSummaryDto.getLineCode().equals("20699999065")||lwCorporationSummaryDto.getLineCode().equals("20699999072")){
				
					sumfdianfee += lwCorporationSummaryDto.getPeakFee()
					+ lwCorporationSummaryDto.getPowerRateFee()
					
					+ lwCorporationSummaryDto.getContentFee()
					+ lwCorporationSummaryDto.getNeedFee()
					+ lwCorporationSummaryDto.getUnDenizenFee()
					+lwCorporationSummaryDto.getBeforFee()
					+lwCorporationSummaryDto.getLastFee()
					+lwCorporationSummaryDto.getUnLineLoss()
					
					;
				}else{sumfdianfee += lwCorporationSummaryDto.getPointerFee()
						+ lwCorporationSummaryDto.getPowerRateFee()
						+ lwCorporationSummaryDto.getContentFee()
						+ lwCorporationSummaryDto.getNeedFee()
						+ lwCorporationSummaryDto.getUnDenizenFee()
						+lwCorporationSummaryDto.getUnLineLoss();
				
				}
			summfdianjinall += lwCorporationSummaryDto.getPowerFee();
			sumfsanxiaall += lwCorporationSummaryDto.getSanXiaFee();
			sumfjijinall += lwCorporationSummaryDto.getSurcharge();
			sumffee += PowerFeeCal.getValue(lwCorporationSummaryDto.getSumFee(), AppConst.TWO_DOT_FLAG) ;

		}

		DecimalFormat df = new DecimalFormat("###0.00");

		BLLwAllWholeFeeFacade blLwAllWholeFeeFacade = new BLLwAllWholeFeeFacade();
		LwAllWholeFeeDto lwAllWholeFeeDtogy = blLwAllWholeFeeFacade
				.findByPrimaryKey("gy", statmonth);
		LwAllWholeFeeDto lwAllWholeFeeDtodm = blLwAllWholeFeeFacade
				.findByPrimaryKey("dm", statmonth);
		LwAllWholeFeeDto lwAllWholeFeeDtoty = blLwAllWholeFeeFacade
				.findByPrimaryKey("ty", statmonth);
		LwAllWholeFeeDto lwAllWholeFeeDtojy = blLwAllWholeFeeFacade
				.findByPrimaryKey("jy", statmonth);

		sumwc=((Double.parseDouble(lwAllWholeFeeDtogy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtogy.getJijin())-Double.parseDouble(lwAllWholeFeeDtogy.getFujia1()))+
				(Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtodm.getJijin())-Double.parseDouble(lwAllWholeFeeDtodm.getFujia1()))+
				(Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtoty.getJijin())-Double.parseDouble(lwAllWholeFeeDtoty.getFujia1()))+
				(Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtojy.getJijin())-Double.parseDouble(lwAllWholeFeeDtojy.getFujia1()))-differenceQuantity*0.2)/1.17;
		sumwfee = Double.parseDouble("".equals(lwAllWholeFeeDtogy.getSumfee())?"0":lwAllWholeFeeDtogy.getSumfee())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtoty.getSumfee())?"0":lwAllWholeFeeDtoty.getSumfee())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtodm.getSumfee())?"0":lwAllWholeFeeDtodm.getSumfee())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtojy.getSumfee())?"0":lwAllWholeFeeDtojy.getSumfee());
		sumwpower = Double.parseDouble("".equals(lwAllWholeFeeDtogy.getPower1())?"0":lwAllWholeFeeDtogy.getPower1())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtoty.getPower1())?"0":lwAllWholeFeeDtoty.getPower1())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtodm.getPower1())?"0":lwAllWholeFeeDtodm.getPower1())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtojy.getPower1())?"0":lwAllWholeFeeDtojy.getPower1());
		sumwtax = ((Double.parseDouble(lwAllWholeFeeDtogy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtogy.getJijin())-Double.parseDouble(lwAllWholeFeeDtogy.getFujia1()))+
				(Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtodm.getJijin())-Double.parseDouble(lwAllWholeFeeDtodm.getFujia1()))+
				(Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtoty.getJijin())-Double.parseDouble(lwAllWholeFeeDtoty.getFujia1()))+
				(Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtojy.getJijin())-Double.parseDouble(lwAllWholeFeeDtojy.getFujia1()))-differenceQuantity*0.2)/1.17*0.17;
		summwdianjin = Double.parseDouble("".equals(lwAllWholeFeeDtogy.getDianjin())?"0":lwAllWholeFeeDtogy.getDianjin())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtoty.getDianjin())?"0":lwAllWholeFeeDtoty.getDianjin())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtodm.getDianjin())?"0":lwAllWholeFeeDtodm.getDianjin())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtojy.getDianjin())?"0":lwAllWholeFeeDtojy.getDianjin());
		sumwdianjintax = Double.parseDouble("".equals(lwAllWholeFeeDtogy.getDianjintax())?"0":lwAllWholeFeeDtogy.getDianjintax())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtoty.getDianjintax())?"0":lwAllWholeFeeDtoty.getDianjintax())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtodm.getDianjintax())?"0":lwAllWholeFeeDtodm.getDianjintax())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtojy.getDianjintax())?"0":lwAllWholeFeeDtojy.getDianjintax());
		sumwsanxia = Double.parseDouble("".equals(lwAllWholeFeeDtogy.getSanxia())?"0":lwAllWholeFeeDtogy.getSanxia())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtoty.getSanxia())?"0":lwAllWholeFeeDtoty.getSanxia())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtodm.getSanxia())?"0":lwAllWholeFeeDtodm.getSanxia())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtojy.getSanxia())?"0":lwAllWholeFeeDtojy.getSanxia());
		sumwsanxiatax = Double.parseDouble("".equals(lwAllWholeFeeDtogy.getSanxiatax())?"0":lwAllWholeFeeDtogy.getSanxiatax())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtoty.getSanxiatax())?"0":lwAllWholeFeeDtoty.getSanxiatax())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtodm.getSanxiatax())?"0":lwAllWholeFeeDtodm.getSanxiatax())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtojy.getSanxiatax())?"0":lwAllWholeFeeDtojy.getSanxiatax());
		sumwjijin = Double.parseDouble("".equals(lwAllWholeFeeDtogy.getJijin())?"0":lwAllWholeFeeDtogy.getJijin())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtoty.getJijin())?"0":lwAllWholeFeeDtoty.getJijin())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtodm.getJijin())?"0":lwAllWholeFeeDtodm.getJijin())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtojy.getJijin())?"0":lwAllWholeFeeDtojy.getJijin());
		sumwjijintax = Double.parseDouble("".equals(lwAllWholeFeeDtogy.getFujia1())?"0":lwAllWholeFeeDtogy.getFujia1())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtoty.getFujia1())?"0":lwAllWholeFeeDtoty.getFujia1())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtodm.getFujia1())?"0":lwAllWholeFeeDtodm.getFujia1())
				+ Double.parseDouble("".equals(lwAllWholeFeeDtojy.getFujia1())?"0":lwAllWholeFeeDtojy.getFujia1());
		sumwdianfee = sumwc+sumwtax;
		sumfc = sumfdianfee / 1.17;
		sumftax = sumfdianfee / 1.17 * 0.17;
		sumfdianjintax = summfdianjinall / 1.17 * 0.17;
		sumfsanxiatax = sumfsanxiaall / 1.17 * 0.17;
		sumfjijintax = sumfjijinall / 1.17 * 0.17;

		summfdianjin = summfdianjinall / 1.17;
		sumfsanxia = sumfsanxiaall / 1.17;
		sumfjijin = sumfjijinall / 1.17;

		sumallfee = sumfdianfee + sumwdianfee;
		sumallpower = sumfpower + sumwpower;
		sumallc = sumwc + sumfc;
		sumalltax = sumwtax + sumftax;
		sumallall = sumwfee + sumffee;
		sumalldianjin = summwdianjin + summfdianjin;
		sumalldianjintax = sumwdianjintax + sumfdianjintax;
		sumallsanxia = sumwsanxia + sumfsanxia;
		sumallsanxiatax = sumwsanxiatax + sumfsanxiatax;
		sumalljijin = sumwjijin + sumfjijin;
		sumalljijintax = sumwjijintax + sumfjijintax;

		httpServletRequest.setAttribute("sumffee", df.format(sumffee));
		httpServletRequest.setAttribute("sumfpower", Math.round(sumfpower));
		httpServletRequest.setAttribute("sumfdianfee", df.format(sumfdianfee));
		httpServletRequest.setAttribute("sumftax", df.format(sumftax));
		httpServletRequest.setAttribute("sumfc", df.format(sumfc));
		httpServletRequest
				.setAttribute("summfdianjin", df.format(summfdianjin));
		httpServletRequest.setAttribute("sumfdianjintax", df
				.format(sumfdianjintax));
		httpServletRequest.setAttribute("sumfsanxia", df.format(sumfsanxia));
		httpServletRequest.setAttribute("sumfsanxiatax", df
				.format(sumfsanxiatax));
		httpServletRequest.setAttribute("sumfjijin", df.format(sumfjijin));
		httpServletRequest
				.setAttribute("sumfjijintax", df.format(sumfjijintax));
		httpServletRequest.setAttribute("sumwfee", df.format(sumwfee));
		httpServletRequest.setAttribute("sumwpower", Math.round(sumwpower));
		httpServletRequest.setAttribute("sumwdianfee", df.format(sumwdianfee));
		httpServletRequest.setAttribute("sumwtax", df.format(sumwtax));
		httpServletRequest.setAttribute("sumwc", df.format(sumwc));
		httpServletRequest
				.setAttribute("summwdianjin", df.format(summwdianjin));
		httpServletRequest.setAttribute("sumwdianjintax", df
				.format(sumwdianjintax));

		httpServletRequest.setAttribute("sumwsanxia", df.format(sumwsanxia));
		httpServletRequest.setAttribute("sumwsanxiatax", df
				.format(sumwsanxiatax));
		httpServletRequest.setAttribute("sumwjijin", df.format(sumwjijin));
		httpServletRequest
				.setAttribute("sumwjijintax", df.format(sumwjijintax));
		httpServletRequest.setAttribute("sumallfee", df.format(sumallfee));
		httpServletRequest.setAttribute("sumallpower", Math.round(sumallpower));
		httpServletRequest.setAttribute("sumallc", df.format(sumallc));
		httpServletRequest.setAttribute("sumalltax", df.format(sumalltax));
		httpServletRequest.setAttribute("sumallall", df.format(sumallall));
		httpServletRequest.setAttribute("sumalldianjin", df
				.format(sumalldianjin));
		httpServletRequest.setAttribute("sumalldianjintax", df
				.format(sumalldianjintax));
		httpServletRequest
				.setAttribute("sumallsanxia", df.format(sumallsanxia));
		httpServletRequest.setAttribute("sumallsanxiatax", df
				.format(sumallsanxiatax));
		httpServletRequest.setAttribute("sumalljijin", df.format(sumalljijin));
		httpServletRequest.setAttribute("sumalljijintax", df
				.format(sumalljijintax));
		
		httpServletRequest.setAttribute("differenceQuantityFee", df
				.format(differenceQuantity*0.2));
		httpServletRequest.setAttribute("statMonth", statmonth);
		return actionMapping.findForward("viewallcount");
	}
}
