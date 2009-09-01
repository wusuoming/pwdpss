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

import com.elongway.pss.bl.action.domain.BLLwSalePriceAction;
import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.util.PowerFeeCal;

public class UICorporationPriceCountAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String condition=" 1=1";
		
		String serchDate=inputDate.substring(0, 7);
		condition+=" and StatMonth = '"+serchDate+"'";
		
		DecimalFormat df = new DecimalFormat("###0.00");
		DecimalFormat df1 = new DecimalFormat("###0");
		
		double  dagongye10sumfee=0;
		double dagongye10lilv=0;
		double dagongye10contentfee=0;
		double dagongye10needfee=0;
		double   guitie10sumfee=0;
		double  guitie10lilv=0;
		double guitie10contentfee=0;
		double guitie10needfee=0;
		double   huafei35sumfee=0;
		double huafei35contentfee=0;
		double huafei35needfee=0;
		double huafei35lilv=0;
		
		double contentfee=0;
		double needfee=0;
		double lilv=0;
		double  dagongye10power=0;
		double   guitie10power=0;
		double   huafei35power=0; 
		double sumallall=0;
		double juminpower=0;
		double juminfee=0;
		double sumallpower=0;
		
		// qiaoyouliang 添加
	
		
		double dagongye10=PowerFeeCal.getCountPrice("1","0");
		 /*dagongye35=PowerFeeCal.getCountPrice("35","0");*/
		double guitie10=PowerFeeCal.getCountPrice("1","1");
		/* guitie35=PowerFeeCal.getCountPrice("35","1");
		 dianshi10=PowerFeeCal.getCountPrice("1","2");
		 dianshi35=PowerFeeCal.getCountPrice("35","2");
		 huafei10=PowerFeeCal.getCountPrice("1","3");*/
		double huafei35=PowerFeeCal.getCountPrice("1","3");
		
		String condition10=" 1=1 and PointerPrice= '"+dagongye10+"' and StatMonth= '"+serchDate+"' and peakprice=0";
		String condition102=" 1=1 and PeakPrice= '"+dagongye10+"' and StatMonth= '"+serchDate+"'";
		String condition103=" 1=1 and beforPrice= '"+dagongye10+"' and StatMonth= '"+serchDate+"'";
		String condition104=" 1=1 and lastPrice= '"+dagongye10+"' and StatMonth= '"+serchDate+"'";
		//10kv普通打工
		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade=new BLLwCorporationSummaryFacade();
		Collection  col10=blLwCorporationSummaryFacade.findByConditions(condition10);
		Iterator it10=col10.iterator();
		while(it10.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)it10.next();
			if(lwCorporationSummaryDto.getLineCode().equals("20699999065")||lwCorporationSummaryDto.getLineCode().equals("20699999072")){
				dagongye10sumfee+=lwCorporationSummaryDto.getPeakFee()+lwCorporationSummaryDto.getBeforFee()+lwCorporationSummaryDto.getLastFee();
			}else{dagongye10sumfee+=lwCorporationSummaryDto.getPointerFee();
			}
			dagongye10power+=lwCorporationSummaryDto.getElectricQuantity();
			dagongye10lilv+=lwCorporationSummaryDto.getPowerRateFee();
			dagongye10contentfee+=lwCorporationSummaryDto.getContentFee();
			dagongye10needfee+=lwCorporationSummaryDto.getNeedFee();
			
			
		}
		//10KV普通
		Collection  col102=blLwCorporationSummaryFacade.findByConditions(condition102);
		Iterator it102=col102.iterator();
		while(it102.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)it102.next();
			if(lwCorporationSummaryDto.getLineCode().equals("20699999065")||lwCorporationSummaryDto.getLineCode().equals("20699999072")){
				dagongye10sumfee+=lwCorporationSummaryDto.getPeakFee()+lwCorporationSummaryDto.getBeforFee()+lwCorporationSummaryDto.getLastFee();
			}else{dagongye10sumfee+=lwCorporationSummaryDto.getPointerFee();
			}
			dagongye10power+=lwCorporationSummaryDto.getElectricQuantity();
			dagongye10lilv+=lwCorporationSummaryDto.getPowerRateFee();
			dagongye10contentfee+=lwCorporationSummaryDto.getContentFee();
			dagongye10needfee+=lwCorporationSummaryDto.getNeedFee();
			
		}
		//10kv普通
		
		Collection  col103=blLwCorporationSummaryFacade.findByConditions(condition103);
		Iterator it103=col103.iterator();
		while(it103.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)it103.next();
			dagongye10sumfee+=lwCorporationSummaryDto.getPointerFee();
			dagongye10power+=lwCorporationSummaryDto.getElectricQuantity();
			dagongye10lilv+=lwCorporationSummaryDto.getPowerRateFee();
			dagongye10contentfee+=lwCorporationSummaryDto.getContentFee();
			dagongye10needfee+=lwCorporationSummaryDto.getNeedFee();
		}
		//10kv普通
		
		Collection  col104=blLwCorporationSummaryFacade.findByConditions(condition104);
		Iterator it104=col104.iterator();
		while(it104.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)it104.next();
			dagongye10sumfee+=lwCorporationSummaryDto.getPointerFee();
			dagongye10power+=lwCorporationSummaryDto.getElectricQuantity();
		}
		
		
		//硅铁10kv
		
		String conditionguitie10=" 1=1 and PointerPrice= '"+guitie10+"' and StatMonth= '"+serchDate+"'";
		String conditionguitie102=" 1=1 and PeakPrice= '"+guitie10+"' and StatMonth= '"+serchDate+"'";
		String conditionguitie103=" 1=1 and beforPrice= '"+guitie10+"' and StatMonth= '"+serchDate+"'";
		String conditionguitie104=" 1=1 and lastPrice= '"+guitie10+"' and StatMonth= '"+serchDate+"'";
		//10kv硅铁打工
		
		Collection  colguitie10=blLwCorporationSummaryFacade.findByConditions(conditionguitie10);
		Iterator itguitie10=colguitie10.iterator();
		while(itguitie10.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie10.next();
			if(lwCorporationSummaryDto.getLineCode().equals("20699999065")||lwCorporationSummaryDto.getLineCode().equals("20699999072")){
				guitie10sumfee+=lwCorporationSummaryDto.getPeakFee()+lwCorporationSummaryDto.getBeforFee()+lwCorporationSummaryDto.getLastFee();
			}else{guitie10sumfee+=lwCorporationSummaryDto.getPointerFee();
			}
			guitie10power+=lwCorporationSummaryDto.getElectricQuantity();
			guitie10lilv+=lwCorporationSummaryDto.getPowerRateFee();
			guitie10contentfee+=lwCorporationSummaryDto.getContentFee();
			guitie10needfee+=lwCorporationSummaryDto.getNeedFee();
		}
		Collection  colguitie102=blLwCorporationSummaryFacade.findByConditions(conditionguitie102);
		Iterator itguitie102=colguitie102.iterator();
		while(itguitie102.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie102.next();
			guitie10sumfee+=lwCorporationSummaryDto.getPeakFee();
			guitie10power+=lwCorporationSummaryDto.getElectricQuantity();
			guitie10lilv+=lwCorporationSummaryDto.getPowerRateFee();
			guitie10contentfee+=lwCorporationSummaryDto.getContentFee();
			guitie10needfee+=lwCorporationSummaryDto.getNeedFee();
		}
		Collection  colguitie103=blLwCorporationSummaryFacade.findByConditions(conditionguitie103);
		Iterator itguitie103=colguitie103.iterator();
		while(itguitie103.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie103.next();
			guitie10sumfee+=lwCorporationSummaryDto.getPointerFee();
			guitie10power+=lwCorporationSummaryDto.getElectricQuantity();
		}
		Collection  colguitie104=blLwCorporationSummaryFacade.findByConditions(conditionguitie104);
		Iterator itguitie104=colguitie104.iterator();
		while(itguitie104.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie104.next();
			guitie10sumfee+=lwCorporationSummaryDto.getPointerFee();
			guitie10power+=lwCorporationSummaryDto.getElectricQuantity();
		}
		//35化肥
		String conditionhuafei10=" 1=1 and PointerPrice= '"+huafei35+"' and StatMonth= '"+serchDate+"'";
		String conditionhuafei102=" 1=1 and PeakPrice= '"+huafei35+"' and StatMonth= '"+serchDate+"'";
		String conditionhuafei103=" 1=1 and beforPrice= '"+huafei35+"' and StatMonth= '"+serchDate+"'";
		String conditionhuafei104=" 1=1 and lastPrice= '"+huafei35+"' and StatMonth= '"+serchDate+"'";
		
		//10kv普通打工		
		Collection  colhuafei10=blLwCorporationSummaryFacade.findByConditions(conditionhuafei10);
		Iterator ithuafei10=colhuafei10.iterator();
		while(ithuafei10.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei10.next();
			huafei35sumfee+=lwCorporationSummaryDto.getPointerFee();
			huafei35power+=lwCorporationSummaryDto.getElectricQuantity();
			huafei35lilv+=lwCorporationSummaryDto.getPowerRateFee();
			huafei35contentfee+=lwCorporationSummaryDto.getContentFee();
			huafei35needfee+=lwCorporationSummaryDto.getNeedFee();
		}
		Collection  colhuafei102=blLwCorporationSummaryFacade.findByConditions(conditionhuafei102);
		Iterator ithuafei102=colhuafei102.iterator();
		while(ithuafei102.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei102.next();
			huafei35sumfee+=lwCorporationSummaryDto.getPeakFee();
			huafei35power+=lwCorporationSummaryDto.getElectricQuantity();
			huafei35lilv+=lwCorporationSummaryDto.getPowerRateFee();
			huafei35contentfee+=lwCorporationSummaryDto.getContentFee();
			huafei35needfee+=lwCorporationSummaryDto.getNeedFee();
		}
		Collection  colhuafei103=blLwCorporationSummaryFacade.findByConditions(conditionhuafei103);
		Iterator ithuafei103=colhuafei102.iterator();
		while(ithuafei103.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei103.next();
			huafei35sumfee+=lwCorporationSummaryDto.getPointerFee();
			huafei35power+=lwCorporationSummaryDto.getElectricQuantity();
		}
		Collection  colhuafei104=blLwCorporationSummaryFacade.findByConditions(conditionhuafei104);
		Iterator ithuafei104=colhuafei104.iterator();
		while(ithuafei104.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei104.next();
			huafei35sumfee+=lwCorporationSummaryDto.getPointerFee();
			huafei35power+=lwCorporationSummaryDto.getElectricQuantity();
		}
		Collection allcol=blLwCorporationSummaryFacade.findByConditions(condition);
		Iterator itall=allcol.iterator();
		while(itall.hasNext()){
			LwCorporationSummaryDto lwCorporationSummaryDto=(LwCorporationSummaryDto)itall.next();
			lilv+=lwCorporationSummaryDto.getPowerRateFee();
			contentfee+=lwCorporationSummaryDto.getContentFee();
			needfee+=lwCorporationSummaryDto.getNeedFee();
			juminpower+=lwCorporationSummaryDto.getUnDenizenQuantity();
			juminfee+=lwCorporationSummaryDto.getUnDenizenFee();
			sumallall+=lwCorporationSummaryDto.getSumFee()-lwCorporationSummaryDto.getSanXiaFee()-lwCorporationSummaryDto.getPowerFee()-lwCorporationSummaryDto.getSurcharge();
			sumallpower+=lwCorporationSummaryDto.getElectricQuantity();
		}
		
		// qiaoyouliang 2009-04-23添加
		StringBuffer buffer = new StringBuffer();
		Collection factoryList = null;
		buffer.append("statmonth = '").append(serchDate).append("'");
		double pointerPrice = 0.0;
		double peakPrice = 0.0;
		double taobiaoPrice = 0.0;
		double taobiaoFee = 0.0;
		double unLineLoss = 0.0;
		double factoryPower =0.0;
		double factoryFee = 0.0;
		double tiePower =0.0;
		double tieFee = 0.0;
		
		double huafeiPower =0.0;
		double huafeiFee = 0.0;
		guitie10needfee = 0.0;
		guitie10contentfee = 0.0;
		String lineCode = "";
		 dagongye10=PowerFeeCal.getCountPrice("1","0");
		 guitie10=PowerFeeCal.getCountPrice("1","1");
		 huafei35=PowerFeeCal.getCountPrice("1","3");
		factoryList = blLwCorporationSummaryFacade.findByConditions(buffer.toString());
		for (Iterator iterator = factoryList.iterator(); iterator.hasNext();) {
			LwCorporationSummaryDto o = (LwCorporationSummaryDto) iterator.next();
			lineCode = o.getLineCode();
			pointerPrice = o.getPointerPrice();
			peakPrice = o.getPeakPrice();
			taobiaoPrice = o.getTaobiaoPrice();			
			if(dagongye10==pointerPrice){
				factoryPower+=o.getPointerQuantity();
				factoryFee+=o.getPointerFee();
			}
			if(dagongye10==peakPrice){
				factoryPower+=o.getPeakQuantity();
				factoryFee+=o.getPeakFee();
			}
			if(dagongye10==taobiaoPrice){
				factoryPower+=o.getTaobiaoQuantity();
				factoryFee+=o.getTaobiaoFee();
			}
			factoryFee+=o.getUnLineLoss();
			if(guitie10==pointerPrice){
				tiePower+=o.getPointerQuantity();
				tieFee+=o.getPointerFee();
			}
			if(guitie10==peakPrice){
				tiePower+=o.getPeakQuantity();
				tieFee+=o.getPeakFee();
				guitie10needfee+=o.getNeedFee();
				guitie10contentfee+=o.getContentFee();
			}
			
			if(huafei35==pointerPrice){
				huafeiPower+=o.getPointerQuantity();
				huafeiFee+=o.getPointerFee();
			}
			if(huafei35==peakPrice){
				huafeiPower+=o.getPeakQuantity();
				huafeiFee+=o.getPeakFee();
			}
			
		}
		
		double sumPowerFee = huafeiFee+tieFee+factoryFee+juminfee;
		double sumQuantity = huafeiPower+tiePower+factoryPower+juminpower;
		
		 /**
		  * qiaoyouliang 添加 2009-04-23 baotou begin
		  */
		 httpServletRequest.setAttribute("sumPowerFee",df1.format(sumPowerFee) );
		 httpServletRequest.setAttribute("sumQuantity",df1.format(sumQuantity) );
		 httpServletRequest.setAttribute("factoryPower",df1.format(factoryPower) );
		 httpServletRequest.setAttribute("factoryFee",df.format(factoryFee) );
		 httpServletRequest.setAttribute("tiePower",df1.format(tiePower) );
		 httpServletRequest.setAttribute("tieFee",df.format(tieFee) );
		 httpServletRequest.setAttribute("huafeiPower",df1.format(huafeiPower) );
		 httpServletRequest.setAttribute("huafeiFee",df.format(huafeiFee) );
		
		
		/**
		  * qiaoyouliang 添加 2009-04-23 baotou end
		  */
		 httpServletRequest.setAttribute("dagongye10sumfee",df.format(dagongye10sumfee) );
		 httpServletRequest.setAttribute("guitie10sumfee",df.format(guitie10sumfee) );
		 httpServletRequest.setAttribute("huafei35sumfee",df.format(huafei35sumfee) );
		 httpServletRequest.setAttribute("contentfee",df.format(contentfee) );
		 httpServletRequest.setAttribute("needfee",df.format(needfee) );
		 httpServletRequest.setAttribute("lilv",df.format(lilv) );
		 httpServletRequest.setAttribute("dagongye10power",Math.round(dagongye10power) );
		 httpServletRequest.setAttribute("guitie10power",Math.round(guitie10power) );
		 httpServletRequest.setAttribute("huafei35power",Math.round(huafei35power) );
		 httpServletRequest.setAttribute("sumallall",df.format(sumallall) );
		 httpServletRequest.setAttribute("juminpower",df.format(juminpower) );
		 httpServletRequest.setAttribute("juminfee",df.format(juminfee) );
		 httpServletRequest.setAttribute("sumallpower",Math.round(sumallpower) );
		 
		 httpServletRequest.setAttribute("dagongye10contentfee",df.format(dagongye10contentfee) );
		 httpServletRequest.setAttribute("dagongye10needfee",df.format(dagongye10needfee) );
		 httpServletRequest.setAttribute("dagongye10lilv",df.format(dagongye10lilv) );
		 
		 httpServletRequest.setAttribute("guitie10contentfee",df.format(guitie10contentfee) );
		 httpServletRequest.setAttribute("guitie10needfee",df.format(guitie10needfee) );
		 httpServletRequest.setAttribute("guitie10lilv",df.format(guitie10lilv) );
		 
		 httpServletRequest.setAttribute("huafei35contentfee",df.format(huafei35contentfee) );
		 httpServletRequest.setAttribute("huafei35needfee",df.format(huafei35needfee) );
		 httpServletRequest.setAttribute("huafei35lilv",df.format(huafei35lilv) );
		 
		 httpServletRequest.setAttribute("inputDate",inputDate.substring(0, 7) );
		return actionMapping.findForward("corporationpriceCount");
	}
}
