package com.elongway.pss.ui.count;

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

import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.custom.WholeSaleFee;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;

public class UIEveryWholeSaleCountAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		double allfee=0;
		double alllilv=0;
		double alltax=0;
		double allsanxia=0;
		double allsanxiatax=0;
		double jijin=0;
		double alljijintax=0;
		double alldianjin=0;
		double alldianjintax=0;
		double alldianfee=0;
		double alldianliang=0;
		String inputDate = httpServletRequest.getParameter("inputDate");
		String statmonth = inputDate.substring(0, 7);
		BLLwDcodeFacade  blLwDcodeFacade=new BLLwDcodeFacade();
		Collection colall=blLwDcodeFacade.findByConditions(" CODETYPE='WholeSaleCom'");
		LwDcodeDto  lwDcodeDto=new LwDcodeDto();
		Iterator itall=colall.iterator();
		Collection list=new ArrayList();
		LwWholeSaleSummaryDto  lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
		BLLwWholeSaleSummaryFacade  blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		while(itall.hasNext()){
			lwDcodeDto=(LwDcodeDto)itall.next();
			Collection colone=blLwWholeSaleSummaryFacade.findByConditions(" statMonth='"+statmonth+"' and upCompany='"+lwDcodeDto.getCodeCode()+"' and kv=10");
			Collection colone35=blLwWholeSaleSummaryFacade.findByConditions(" statMonth='"+statmonth+"' and upCompany='"+lwDcodeDto.getCodeCode()+"' and kv=35");
			WholeSaleFee  wholeSaleFee=new WholeSaleFee();
			double sanxiatax=0;
			double sanxiafee=0;
			double dianjintax=0;
			double dianjinfee=0;
			double jijintax=0;
			double jijinfee=0;
			
			double jumindianliang=0;
			double jumindianfee=0;
			double feijumindianliang=0;
			double feijumindianfee=0;
			double shengchandianliang=0;
			double shengchandianfee=0;
			double shangyedianliang=0;
			double shangyedianfee=0;
			double gongyedianliang=0;
			double gongyedianfee=0;
			double nongguandianliang=0;
			double nongguandianfee=0;
			
			double jumindianliang35=0;
			double jumindianfee35=0;
			double feijumindianliang35=0;
			double feijumindianfee35=0;
			double shengchandianliang35=0;
			double shengchandianfee35=0;
			double shangyedianliang35=0;
			double shangyedianfee35=0;
			double gongyedianliang35=0;
			double gongyedianfee35=0;
			double nongguandianliang35=0;
			double nongguandianfee35=0;
			double sumpower=0;
			double sumfee=0;
			double sumpower10=0;
			double sumfee10=0;
			double sumpower35=0;
			double sumfee35=0;
			double lilv=0;
			Iterator itone=colone.iterator();
			while(itone.hasNext()){
				
				lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)itone.next();
				jumindianliang += lwWholeSaleSummaryDto.getDenizenQuantity();
				jumindianfee+=lwWholeSaleSummaryDto.getDenizenFee();
				feijumindianliang += lwWholeSaleSummaryDto.getUnDenizenQuantity();
				feijumindianfee+=lwWholeSaleSummaryDto.getUnDenizenFee();
				shangyedianliang += lwWholeSaleSummaryDto.getBizQuantity();
				shangyedianfee+=lwWholeSaleSummaryDto.getProductFee();
				if (lwWholeSaleSummaryDto.getWholesaletype().equals("0")) {
					gongyedianliang += lwWholeSaleSummaryDto
							.getIndustryQuantity();
					gongyedianfee+=lwWholeSaleSummaryDto.getIndustryFee();
				}
				if (lwWholeSaleSummaryDto.getWholesaletype().equals("1")) {
					gongyedianliang += lwWholeSaleSummaryDto
							.getElectricQuantity();
					gongyedianfee+=lwWholeSaleSummaryDto.getSumFee()-lwWholeSaleSummaryDto.getPowerRateFee();
				}
				nongguandianliang += lwWholeSaleSummaryDto.getFarmUseQuantity();
				nongguandianfee+=lwWholeSaleSummaryDto.getFarmUseFee();
				shengchandianliang += lwWholeSaleSummaryDto.getProductQuantity();
				shengchandianfee+=lwWholeSaleSummaryDto.getProductFee();
				alllilv+=lwWholeSaleSummaryDto.getPowerRateFee();
				alldianfee += lwWholeSaleSummaryDto.getElectricQuantity();
				alldianliang += lwWholeSaleSummaryDto.getSumFee();
				sumpower10 += lwWholeSaleSummaryDto.getElectricQuantity();
				sumfee10 += lwWholeSaleSummaryDto.getSumFee();
				sumpower += lwWholeSaleSummaryDto.getElectricQuantity();
				sumfee += lwWholeSaleSummaryDto.getSumFee();
				lilv+=lwWholeSaleSummaryDto.getPowerRateFee();
			}
			
			Iterator itone35=colone35.iterator();
			while(itone35.hasNext()){
				
				lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)itone.next();
				jumindianliang35 += lwWholeSaleSummaryDto.getDenizenQuantity();
				jumindianfee35+=lwWholeSaleSummaryDto.getDenizenFee();
				feijumindianliang35 += lwWholeSaleSummaryDto.getUnDenizenQuantity();
				feijumindianfee35+=lwWholeSaleSummaryDto.getUnDenizenFee();
				shangyedianliang35 += lwWholeSaleSummaryDto.getBizQuantity();
				shangyedianfee35+=lwWholeSaleSummaryDto.getProductFee();
				if (lwWholeSaleSummaryDto.getWholesaletype().equals("0")) {
					gongyedianliang35 += lwWholeSaleSummaryDto
							.getIndustryQuantity();
					gongyedianfee35+=lwWholeSaleSummaryDto.getIndustryFee();
				}
				if (lwWholeSaleSummaryDto.getWholesaletype().equals("1")) {
					gongyedianliang35 += lwWholeSaleSummaryDto
							.getElectricQuantity();
					gongyedianfee35+=lwWholeSaleSummaryDto.getSumFee()-lwWholeSaleSummaryDto.getPowerRateFee();
				}
				nongguandianliang35 += lwWholeSaleSummaryDto.getFarmUseQuantity();
				nongguandianfee35+=lwWholeSaleSummaryDto.getFarmUseFee();
				shengchandianliang35 += lwWholeSaleSummaryDto.getProductQuantity();
				shengchandianfee35+=lwWholeSaleSummaryDto.getProductFee();
				alllilv+=lwWholeSaleSummaryDto.getPowerRateFee();
				alldianfee += lwWholeSaleSummaryDto.getElectricQuantity();
				alldianliang += lwWholeSaleSummaryDto.getSumFee();
				sumpower35 += lwWholeSaleSummaryDto.getElectricQuantity();
				sumfee35 += lwWholeSaleSummaryDto.getSumFee();
				sumpower += lwWholeSaleSummaryDto.getElectricQuantity();
				sumfee += lwWholeSaleSummaryDto.getSumFee();
				lilv+=lwWholeSaleSummaryDto.getPowerRateFee();
			}
			wholeSaleFee.setJumindianfee(jumindianfee);
			wholeSaleFee.setJumindianliang(jumindianliang);
			wholeSaleFee.setFeijumindianliang(feijumindianliang);
			wholeSaleFee.setFeijunmindianfee(feijumindianfee);
			wholeSaleFee.setShangyedianfee(shangyedianfee);
			wholeSaleFee.setShangyedianliang(shangyedianliang);
			wholeSaleFee.setShengchandianfee(shengchandianfee);
			wholeSaleFee.setShangyedianliang(shangyedianliang);
			wholeSaleFee.setGongyedianfee(gongyedianfee);
			wholeSaleFee.setGongyedianliang(gongyedianliang);
			wholeSaleFee.setNongguandianliang(nongguandianliang);
			wholeSaleFee.setNongguandianfee(nongguandianfee);
			
			
			wholeSaleFee.setJumindianfee35(jumindianfee35);
			wholeSaleFee.setJumindianliang35(jumindianliang35);
			wholeSaleFee.setFeijumindianliang35(feijumindianliang35);
			wholeSaleFee.setFeijunmindianfee35(feijumindianfee35);
			wholeSaleFee.setShangyedianfee35(shangyedianfee35);
			wholeSaleFee.setShangyedianliang35(shangyedianliang35);
			wholeSaleFee.setShengchandianfee35(shengchandianfee35);
			wholeSaleFee.setShangyedianliang35(shangyedianliang35);
			wholeSaleFee.setGongyedianfee35(gongyedianfee35);
			wholeSaleFee.setGongyedianliang35(gongyedianliang35);
			wholeSaleFee.setNongguandianliang35(nongguandianliang35);
			wholeSaleFee.setNongguandianfee35(nongguandianfee35);
			
			wholeSaleFee.setSumfee(sumfee);
			wholeSaleFee.setSumpower(sumpower);
			wholeSaleFee.setSumpower10(sumpower10);
			wholeSaleFee.setSumfee10(sumfee10);
			wholeSaleFee.setSumpower35(sumpower35);
			wholeSaleFee.setSumfee35(sumfee35);
			wholeSaleFee.setSumpower(sumpower);
			wholeSaleFee.setLilvdianfee(lilv);
			if(lwWholeSaleSummaryDto.getUpCompany().equals("gy")||lwWholeSaleSummaryDto.getUpCompany().equals("dm")){
				sanxiafee = (wholeSaleFee.getJumindianliang()+wholeSaleFee.getJumindianliang35() + wholeSaleFee.getFeijumindianliang()+wholeSaleFee.getFeijumindianliang35() + wholeSaleFee.getShangyedianliang()+wholeSaleFee.getShangyedianliang35() + wholeSaleFee.getShengchandianliang()+wholeSaleFee.getShengchandianliang35() + wholeSaleFee.getGongyedianliang()+wholeSaleFee.getGongyedianliang35()) * 0.004 * 0.88/1.17;
				dianjinfee = (wholeSaleFee.getJumindianliang()+wholeSaleFee.getJumindianliang35() + wholeSaleFee.getFeijumindianliang()+wholeSaleFee.getFeijumindianliang35() + wholeSaleFee.getShangyedianliang()+wholeSaleFee.getShangyedianliang35() + wholeSaleFee.getShengchandianliang()+wholeSaleFee.getShengchandianliang35() + wholeSaleFee.getGongyedianliang()+wholeSaleFee.getGongyedianliang35()) * 0.02 * 0.88/1.17;
				jijinfee = (wholeSaleFee.getJumindianliang()+wholeSaleFee.getJumindianliang35()) * 0.001 * 0.88/1.17 + (wholeSaleFee.getFeijumindianliang()+wholeSaleFee.getFeijumindianliang35() + wholeSaleFee.getShangyedianliang()+wholeSaleFee.getShangyedianliang35() + wholeSaleFee.getShengchandianliang()+wholeSaleFee.getShengchandianliang35())
						* 0.002 * 0.88/1.17 + (wholeSaleFee.getJumindianliang()+wholeSaleFee.getJumindianliang35() + wholeSaleFee.getFeijumindianliang()+wholeSaleFee.getFeijumindianliang35() + wholeSaleFee.getShangyedianliang()+wholeSaleFee.getShangyedianliang35() + wholeSaleFee.getShengchandianliang()+wholeSaleFee.getShengchandianliang35())
						* 0.0031 * 0.88/1.17;
				sanxiatax=sanxiafee*0.17;
				dianjintax=dianjinfee*0.17;
				jijintax=jijinfee*0.17;
				 allsanxia+=sanxiafee;
				 allsanxiatax+=sanxiatax;
				 jijin+=jijinfee;
				 alljijintax+=dianjintax;
				 alldianjin+=dianjinfee;
				 alldianjintax+=dianjintax;
				
			}
			
			if(lwWholeSaleSummaryDto.getUpCompany().equals("jy")||lwWholeSaleSummaryDto.getUpCompany().equals("ty")){
				sanxiafee = (wholeSaleFee.getJumindianliang()+wholeSaleFee.getJumindianliang35() + wholeSaleFee.getFeijumindianliang()+wholeSaleFee.getFeijumindianliang35() + wholeSaleFee.getShangyedianliang()+wholeSaleFee.getShangyedianliang35() + wholeSaleFee.getShengchandianliang()+wholeSaleFee.getShengchandianliang35() + wholeSaleFee.getGongyedianliang()+wholeSaleFee.getGongyedianliang35()+wholeSaleFee.getNongguandianliang()+wholeSaleFee.getNongguandianliang35()) * 0.004 * 0.88/1.17;
				dianjinfee = (wholeSaleFee.getJumindianliang()+wholeSaleFee.getJumindianliang35() + wholeSaleFee.getFeijumindianliang()+wholeSaleFee.getFeijumindianliang35() + wholeSaleFee.getShangyedianliang()+wholeSaleFee.getShangyedianliang35() + wholeSaleFee.getShengchandianliang()+wholeSaleFee.getShengchandianliang35() + wholeSaleFee.getGongyedianliang()+wholeSaleFee.getGongyedianliang35()) * 0.02 * 0.88/1.17;
				jijinfee = (wholeSaleFee.getJumindianliang()+wholeSaleFee.getJumindianliang35()) * 0.001 * 0.88/1.17 + (wholeSaleFee.getFeijumindianliang()+wholeSaleFee.getFeijumindianliang35() + wholeSaleFee.getShangyedianliang()+wholeSaleFee.getShangyedianliang35() + wholeSaleFee.getShengchandianliang()+wholeSaleFee.getShengchandianliang35())
						* 0.002 * 0.88/1.17 + (wholeSaleFee.getJumindianliang()+wholeSaleFee.getJumindianliang35() + wholeSaleFee.getFeijumindianliang()+wholeSaleFee.getFeijumindianliang35() + wholeSaleFee.getShangyedianliang()+wholeSaleFee.getShangyedianliang35() + wholeSaleFee.getShengchandianliang()+wholeSaleFee.getShengchandianliang35())
						* 0.0031 * 0.88/1.17;
				sanxiatax=sanxiafee*0.17;
				dianjintax=dianjinfee*0.17;
				jijintax=jijinfee*0.17;
				 allsanxia+=sanxiafee;
				 allsanxiatax+=sanxiatax;
				 jijin+=jijinfee;
				 alljijintax+=dianjintax;
				 alldianjin+=dianjinfee;
				 alldianjintax+=dianjintax;
				
			}
		}
		
		
		return null;
	}

}
