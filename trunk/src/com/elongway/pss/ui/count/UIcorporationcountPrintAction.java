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

import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.util.PowerFeeCal;

public class UIcorporationcountPrintAction extends Action {
	
	
		public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
			String inputDate=httpServletRequest.getParameter("inputDate");
			String condition=" 1=1";
			
			String serchDate=inputDate.substring(0, 7);
			condition+=" and StatMonth = '"+serchDate+"'";
			
			DecimalFormat df = new DecimalFormat("###0.00");
			/*double dagongye10=0;
			double dagongye35=0;
			double guitie10=0;
			double guitie35=0;
			double dianshi10=0;
			double dianshi35=0;
			double huafei10=0;
			double huafei35=0;
			httpServletRequest.setAttribute("inputDate", inputDate);
			double dagongye10Power=0;
			double dagongye35Power=0;
			double guitie10Power=0;
			double guitie35Power=0;
			double dianshi10Power=0;
			double dianshi35Power=0;
			double huafei10Power=0;
			double huafei35Power=0;
			
			
			double dagongye10Fee=0;
			double dagongye35Fee=0;
			double guitie10Fee=0;
			double guitie35Fee=0;
			double dianshi10Fee=0;
			double dianshi35Fee=0;
			double huafei10Fee=0;
			double huafei35Fee=0;
			
			
			
			double dagongye10tax=0;
			double dagongye35tax=0;
			double guitie10tax=0;
			double guitie35tax=0;
			double dianshi10tax=0;
			double dianshi35tax=0;
			double huafei10tax=0;
			double huafei35tax=0;
			
			
			double dagongye10chun=0;
			double dagongye35chun=0;
			double guitie10chun=0;
			double guitie35chun=0;
			double dianshi10chun=0;
			double dianshi35chun=0;
			double huafei10chun=0;
			double huafei35chun=0;
			
			double sumPower=0;
			double sumTax=0;
			double sumChun=0;
			double sumFee=0;
			//begin
			LwCorporationSummaryDto  lwCorporationSummaryDtoguitie1=PowerFeeCal.findonecorporation("20699999065", serchDate);
			LwCorporationSummaryDto  lwCorporationSummaryDtoguitie2=PowerFeeCal.findonecorporation("20699999072", serchDate);
			
			LwCorporationSummaryDto  lwCorporationSummaryDtodagongye1=PowerFeeCal.findonecorporation("20699999066", serchDate);
			LwCorporationSummaryDto  lwCorporationSummaryDtodagongye2=PowerFeeCal.findonecorporation("20699999067", serchDate);
			LwCorporationSummaryDto  lwCorporationSummaryDtodagongye3=PowerFeeCal.findonecorporation("20699999068", serchDate);
			
			
			
			LwCorporationSummaryDto  lwCorporationSummaryDtohuafei=PowerFeeCal.findonecorporation("20699999069", serchDate);
			
			
			 httpServletRequest.setAttribute("lwCorporationSummaryDtoguitie1",lwCorporationSummaryDtoguitie1 );
			 httpServletRequest.setAttribute("lwCorporationSummaryDtoguitie2",lwCorporationSummaryDtoguitie2 );
			 httpServletRequest.setAttribute("lwCorporationSummaryDtodagongye1",lwCorporationSummaryDtodagongye1 );
			 httpServletRequest.setAttribute("lwCorporationSummaryDtodagongye2",lwCorporationSummaryDtodagongye2 );
			 httpServletRequest.setAttribute("lwCorporationSummaryDtodagongye3",lwCorporationSummaryDtodagongye3 );
			 httpServletRequest.setAttribute("lwCorporationSummaryDtohuafei",lwCorporationSummaryDtohuafei );
			//end
			
			 dagongye10=PowerFeeCal.getCountPrice("1","0");
			 dagongye35=PowerFeeCal.getCountPrice("35","0");
			 guitie10=PowerFeeCal.getCountPrice("1","1");
			 guitie35=PowerFeeCal.getCountPrice("35","1");
			 dianshi10=PowerFeeCal.getCountPrice("1","2");
			 dianshi35=PowerFeeCal.getCountPrice("35","2");
			 huafei10=PowerFeeCal.getCountPrice("1","3");
			 huafei35=PowerFeeCal.getCountPrice("35","3");
			 BLLwCorporationSummaryFacade  blLwCorporationSummaryFacade=new BLLwCorporationSummaryFacade();
			 Collection colall=blLwCorporationSummaryFacade.findByConditions(condition);
			 //dagongye
			 Collection  coldagongye10=blLwCorporationSummaryFacade.findByConditions(" PointerPrice='"+dagongye10+"'");
			 Iterator itdagongye10=coldagongye10.iterator();
			 while(itdagongye10.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdagongye10.next();
				 dagongye10Fee+=lwCorporationSummaryDto.getPointerFee();
				 dagongye10Power+=lwCorporationSummaryDto.getPointerQuantity();
			 }
			 
			
			 Collection  coldagongye35=blLwCorporationSummaryFacade.findByConditions(" PointerPrice='"+dagongye35+"'");
			 Iterator itdagongye35=coldagongye35.iterator();
			 while(itdagongye35.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdagongye35.next();
				 dagongye35Fee+=lwCorporationSummaryDto.getPointerFee();
				 dagongye35Power+=lwCorporationSummaryDto.getPointerQuantity();
			 }
			 
			 
			 Collection  coldagongye101=blLwCorporationSummaryFacade.findByConditions(" PeakPrice='"+dagongye10+"'");
			 Iterator itdagongye101=coldagongye101.iterator();
			 while(itdagongye101.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdagongye101.next();
				 dagongye10Fee+=lwCorporationSummaryDto.getPeakFee();
				 dagongye10Power+=lwCorporationSummaryDto.getPeakQuantity();
			 }
			 
			
			 Collection  coldagongye351=blLwCorporationSummaryFacade.findByConditions(" PeakPrice='"+dagongye35+"'");
			 Iterator itdagongye351=coldagongye351.iterator();
			 while(itdagongye351.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdagongye351.next();
				 dagongye35Fee+=lwCorporationSummaryDto.getPeakFee();
				 dagongye35Power+=lwCorporationSummaryDto.getPeakQuantity();
			 }
			 
			 Collection  coldagongye102=blLwCorporationSummaryFacade.findByConditions(" beforPrice='"+dagongye10+"'");
			 Iterator itdagongye102=coldagongye101.iterator();
			 while(itdagongye102.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdagongye102.next();
				 dagongye10Fee+=lwCorporationSummaryDto.getBeforFee();
				 dagongye10Power+=lwCorporationSummaryDto.getBeforPower();
			 }
			 
			
			 Collection  coldagongye352=blLwCorporationSummaryFacade.findByConditions(" beforPrice='"+dagongye35+"'");
			 Iterator itdagongye352=coldagongye352.iterator();
			 while(itdagongye352.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdagongye352.next();
				 dagongye35Fee+=lwCorporationSummaryDto.getBeforFee();
				 dagongye35Power+=lwCorporationSummaryDto.getBeforPower();
			 }
			
			 
			 Collection  coldagongye103=blLwCorporationSummaryFacade.findByConditions(" lastPrice='"+dagongye10+"'");
			 Iterator itdagongye103=coldagongye103.iterator();
			 while(itdagongye103.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdagongye103.next();
				 dagongye10Fee+=lwCorporationSummaryDto.getLastFee();
				 dagongye10Power+=lwCorporationSummaryDto.getLastPower();
			 }
			 
			
			 Collection  coldagongye353=blLwCorporationSummaryFacade.findByConditions(" lastPrice='"+dagongye35+"'");
			 Iterator itdagongye353=coldagongye353.iterator();
			 while(itdagongye353.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdagongye353.next();
				 dagongye35Fee+=lwCorporationSummaryDto.getLastFee();
				 dagongye35Power+=lwCorporationSummaryDto.getLastPower();
			 }
			 
			 
			 //guitie
			 
			 
			 Collection  colguitie10=blLwCorporationSummaryFacade.findByConditions(" PointerPrice='"+guitie10+"'");
			 Iterator itguitie10=colguitie10.iterator();
			 while(itguitie10.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie10.next();
				 guitie10Fee+=lwCorporationSummaryDto.getPointerFee();
				 guitie10Power+=lwCorporationSummaryDto.getPointerQuantity();
			 }
			 
			
			 Collection  colguitie35=blLwCorporationSummaryFacade.findByConditions(" PointerPrice='"+guitie35+"'");
			 Iterator itguitie35=colguitie35.iterator();
			 while(itguitie35.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie35.next();
				 guitie35Fee+=lwCorporationSummaryDto.getPointerFee();
				 guitie35Power+=lwCorporationSummaryDto.getPointerQuantity();
			 }
			 
			 
			 Collection  colguitie101=blLwCorporationSummaryFacade.findByConditions(" PeakPrice='"+guitie10+"'");
			 Iterator itguitie101=colguitie101.iterator();
			 while(itguitie101.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie101.next();
				 guitie10Fee+=lwCorporationSummaryDto.getPeakFee();
				 guitie10Power+=lwCorporationSummaryDto.getPeakQuantity();
			 }
			 
			
			 Collection  colguitie351=blLwCorporationSummaryFacade.findByConditions(" PeakPrice='"+guitie35+"'");
			 Iterator itguitie351=colguitie351.iterator();
			 while(itguitie351.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie351.next();
				 guitie35Fee+=lwCorporationSummaryDto.getPeakFee();
				 guitie35Power+=lwCorporationSummaryDto.getPeakQuantity();
			 }
			 
			 Collection  colguitie102=blLwCorporationSummaryFacade.findByConditions(" beforPrice='"+guitie10+"'");
			 Iterator itguitie102=colguitie101.iterator();
			 while(itguitie102.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie102.next();
				 guitie10Fee+=lwCorporationSummaryDto.getBeforFee();
				 guitie10Power+=lwCorporationSummaryDto.getBeforPower();
			 }
			 
			
			 Collection  colguitie352=blLwCorporationSummaryFacade.findByConditions(" beforPrice='"+guitie35+"'");
			 Iterator itguitie352=colguitie352.iterator();
			 while(itguitie352.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie352.next();
				 guitie35Fee+=lwCorporationSummaryDto.getBeforFee();
				 guitie35Power+=lwCorporationSummaryDto.getBeforPower();
			 }
			
			 
			 Collection  colguitie103=blLwCorporationSummaryFacade.findByConditions(" lastPrice='"+guitie10+"'");
			 Iterator itguitie103=colguitie103.iterator();
			 while(itguitie103.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie103.next();
				 guitie10Fee+=lwCorporationSummaryDto.getLastFee();
				 guitie10Power+=lwCorporationSummaryDto.getLastPower();
			 }
			 
			
			 Collection  colguitie353=blLwCorporationSummaryFacade.findByConditions(" lastPrice='"+guitie35+"'");
			 Iterator itguitie353=colguitie353.iterator();
			 while(itguitie353.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itguitie353.next();
				 guitie35Fee+=lwCorporationSummaryDto.getLastFee();
				 guitie35Power+=lwCorporationSummaryDto.getLastPower();
			 }
			 //dianshi
			 
			 Collection  coldianshi10=blLwCorporationSummaryFacade.findByConditions(" PointerPrice='"+dianshi10+"'");
			 Iterator itdianshi10=coldianshi10.iterator();
			 while(itdianshi10.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdianshi10.next();
				 dianshi10Fee+=lwCorporationSummaryDto.getPointerFee();
				 dianshi10Power+=lwCorporationSummaryDto.getPointerQuantity();
			 }
			 
			
			 Collection  coldianshi35=blLwCorporationSummaryFacade.findByConditions(" PointerPrice='"+dianshi35+"'");
			 Iterator itdianshi35=coldianshi35.iterator();
			 while(itdianshi35.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdianshi35.next();
				 dianshi35Fee+=lwCorporationSummaryDto.getPointerFee();
				 dianshi35Power+=lwCorporationSummaryDto.getPointerQuantity();
			 }
			 
			 
			 Collection  coldianshi101=blLwCorporationSummaryFacade.findByConditions(" PeakPrice='"+dianshi10+"'");
			 Iterator itdianshi101=coldianshi101.iterator();
			 while(itdianshi101.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdianshi101.next();
				 dianshi10Fee+=lwCorporationSummaryDto.getPeakFee();
				 dianshi10Power+=lwCorporationSummaryDto.getPeakQuantity();
			 }
			 
			
			 Collection  coldianshi351=blLwCorporationSummaryFacade.findByConditions(" PeakPrice='"+dianshi35+"'");
			 Iterator itdianshi351=coldianshi351.iterator();
			 while(itdianshi351.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdianshi351.next();
				 dianshi35Fee+=lwCorporationSummaryDto.getPeakFee();
				 dianshi35Power+=lwCorporationSummaryDto.getPeakQuantity();
			 }
			 
			 Collection  coldianshi102=blLwCorporationSummaryFacade.findByConditions(" beforPrice='"+dianshi10+"'");
			 Iterator itdianshi102=coldianshi101.iterator();
			 while(itdianshi102.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdianshi102.next();
				 dianshi10Fee+=lwCorporationSummaryDto.getBeforFee();
				 dianshi10Power+=lwCorporationSummaryDto.getBeforPower();
			 }
			 
			
			 Collection  coldianshi352=blLwCorporationSummaryFacade.findByConditions(" beforPrice='"+dianshi35+"'");
			 Iterator itdianshi352=coldianshi352.iterator();
			 while(itdianshi352.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdianshi352.next();
				 dianshi35Fee+=lwCorporationSummaryDto.getBeforFee();
				 dianshi35Power+=lwCorporationSummaryDto.getBeforPower();
			 }
			
			 
			 Collection  coldianshi103=blLwCorporationSummaryFacade.findByConditions(" lastPrice='"+dianshi10+"'");
			 Iterator itdianshi103=coldianshi103.iterator();
			 while(itdianshi103.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdianshi103.next();
				 dianshi10Fee+=lwCorporationSummaryDto.getLastFee();
				 dianshi10Power+=lwCorporationSummaryDto.getLastPower();
			 }
			 
			
			 Collection  coldianshi353=blLwCorporationSummaryFacade.findByConditions(" lastPrice='"+dianshi35+"'");
			 Iterator itdianshi353=coldianshi353.iterator();
			 while(itdianshi353.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)itdianshi353.next();
				 dianshi35Fee+=lwCorporationSummaryDto.getLastFee();
				 dianshi35Power+=lwCorporationSummaryDto.getLastPower();
			 }
			 //huafei
			 Collection  colhuafei10=blLwCorporationSummaryFacade.findByConditions(" PointerPrice='"+huafei10+"'");
			 Iterator ithuafei10=colhuafei10.iterator();
			 while(ithuafei10.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei10.next();
				 huafei10Fee+=lwCorporationSummaryDto.getPointerFee();
				 huafei10Power+=lwCorporationSummaryDto.getPointerQuantity();
			 }
			 
			
			 Collection  colhuafei35=blLwCorporationSummaryFacade.findByConditions(" PointerPrice='"+huafei35+"'");
			 Iterator ithuafei35=colhuafei35.iterator();
			 while(ithuafei35.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei35.next();
				 huafei35Fee+=lwCorporationSummaryDto.getPointerFee();
				 huafei35Power+=lwCorporationSummaryDto.getPointerQuantity();
			 }
			 
			 
			 Collection  colhuafei101=blLwCorporationSummaryFacade.findByConditions(" PeakPrice='"+huafei10+"'");
			 Iterator ithuafei101=colhuafei101.iterator();
			 while(ithuafei101.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei101.next();
				 huafei10Fee+=lwCorporationSummaryDto.getPeakFee();
				 huafei10Power+=lwCorporationSummaryDto.getPeakQuantity();
			 }
			 
			
			 Collection  colhuafei351=blLwCorporationSummaryFacade.findByConditions(" PeakPrice='"+huafei35+"'");
			 Iterator ithuafei351=colhuafei351.iterator();
			 while(ithuafei351.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei351.next();
				 huafei35Fee+=lwCorporationSummaryDto.getPeakFee();
				 huafei35Power+=lwCorporationSummaryDto.getPeakQuantity();
			 }
			 
			 Collection  colhuafei102=blLwCorporationSummaryFacade.findByConditions(" beforPrice='"+huafei10+"'");
			 Iterator ithuafei102=colhuafei101.iterator();
			 while(ithuafei102.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei102.next();
				 huafei10Fee+=lwCorporationSummaryDto.getBeforFee();
				 huafei10Power+=lwCorporationSummaryDto.getBeforPower();
			 }
			 
			
			 Collection  colhuafei352=blLwCorporationSummaryFacade.findByConditions(" beforPrice='"+huafei35+"'");
			 Iterator ithuafei352=colhuafei352.iterator();
			 while(ithuafei352.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei352.next();
				 huafei35Fee+=lwCorporationSummaryDto.getBeforFee();
				 huafei35Power+=lwCorporationSummaryDto.getBeforPower();
			 }
			
			 
			 Collection  colhuafei103=blLwCorporationSummaryFacade.findByConditions(" lastPrice='"+huafei10+"'");
			 Iterator ithuafei103=colhuafei103.iterator();
			 while(ithuafei103.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei103.next();
				 huafei10Fee+=lwCorporationSummaryDto.getLastFee();
				 huafei10Power+=lwCorporationSummaryDto.getLastPower();
			 }
			 
			
			 Collection  colhuafei353=blLwCorporationSummaryFacade.findByConditions(" lastPrice='"+huafei35+"'");
			 Iterator ithuafei353=colhuafei353.iterator();
			 while(ithuafei353.hasNext()){
				 LwCorporationSummaryDto  lwCorporationSummaryDto=(LwCorporationSummaryDto)ithuafei353.next();
				 huafei35Fee+=lwCorporationSummaryDto.getLastFee();
				 huafei35Power+=lwCorporationSummaryDto.getLastPower();
			 }
			 
			     dagongye10tax=dagongye10Fee/1.17*0.17;
				 dagongye35tax=dagongye35Fee/1.17*0.17;
				 guitie10tax=guitie10Fee/1.17*0.17;
				 guitie35tax=guitie35Fee/1.17*0.17;
				 dianshi10tax=dianshi10Fee/1.17*0.17;
				 dianshi35tax=dianshi35Fee/1.17*0.17;
				 huafei10tax=huafei10Fee/1.17*0.17;
				 huafei35tax=huafei35Fee/1.17*0.17;
				
				
				 dagongye10chun=dagongye10Fee/1.17;
				 dagongye35chun=dagongye35Fee/1.17;
				 guitie10chun=guitie10Fee/1.17;
				 guitie35chun=guitie35Fee/1.17;
				 dianshi10chun=dianshi10Fee/1.17;
				 dianshi35chun=dianshi35Fee/1.17;
				 huafei10chun=huafei10Fee/1.17;
				 huafei35chun=huafei35Fee/1.17;
				 sumPower=dagongye10Power+dagongye35Power+guitie10Power+guitie35Power+dianshi10Power+dianshi35Power+huafei10Power+huafei35Power;
				 sumTax=dagongye10tax+dagongye35tax+guitie10tax+guitie35tax+dianshi10tax+dianshi35tax+huafei10tax+huafei35tax;
				 sumChun=dagongye10chun+dagongye35chun+guitie10chun+guitie35chun+dianshi10chun+dianshi35chun+huafei10chun+huafei35chun;
				 sumFee=dagongye10Fee+dagongye35Fee+guitie10Fee+guitie35Fee+dianshi10Fee+dianshi35Fee+huafei10Fee+huafei35Fee;
				 
			 httpServletRequest.setAttribute("dagongye10Power",Math.round(dagongye10Power) );
			 httpServletRequest.setAttribute("dagongye35Power",Math.round(dagongye35Power) );
			 httpServletRequest.setAttribute("guitie10Power",Math.round(guitie10Power) );
			 httpServletRequest.setAttribute("guitie35Power",Math.round(guitie35Power) );
			 httpServletRequest.setAttribute("dianshi10Power",Math.round(dianshi10Power) );
			 httpServletRequest.setAttribute("dianshi35Power",Math.round(dianshi35Power) );
			 httpServletRequest.setAttribute("huafei10Power",Math.round(huafei10Power) );
			 httpServletRequest.setAttribute("huafei35Power",Math.round(huafei35Power) );
			 httpServletRequest.setAttribute("sumPower",Math.round(sumPower) );
			 
			 httpServletRequest.setAttribute("dagongye10Fee",df.format(dagongye10Fee) );
			 
			 httpServletRequest.setAttribute("colall",colall );
			 
			 httpServletRequest.setAttribute("dagongye35Fee",df.format(dagongye35Fee) );
			 httpServletRequest.setAttribute("guitie10Fee",df.format(guitie10Fee) );
			 httpServletRequest.setAttribute("guitie35Fee",df.format(guitie35Fee) );
			 httpServletRequest.setAttribute("dianshi10Fee",df.format(dianshi10Fee) );
			 httpServletRequest.setAttribute("dianshi35Fee",df.format(dianshi35Fee) );
			 httpServletRequest.setAttribute("huafei10Fee",df.format(huafei10Fee) );
			 httpServletRequest.setAttribute("huafei35Fee",df.format(huafei35Fee) );
			 httpServletRequest.setAttribute("dagongye10tax",df.format(dagongye10tax) );
			 httpServletRequest.setAttribute("dagongye35tax",df.format(dagongye35tax) );
			 httpServletRequest.setAttribute("guitie10tax",df.format(guitie10tax) );
			 httpServletRequest.setAttribute("guitie35tax",df.format(guitie35tax) );
			 httpServletRequest.setAttribute("dianshi10tax",df.format(dianshi10tax) );
			 httpServletRequest.setAttribute("dianshi35tax",df.format(dianshi35tax) );
			 httpServletRequest.setAttribute("huafei10tax",df.format(huafei10tax) );
			 httpServletRequest.setAttribute("huafei35tax",df.format(huafei35tax) );
			 httpServletRequest.setAttribute("dagongye10chun",df.format(dagongye10chun) );
			 httpServletRequest.setAttribute("dagongye35chun",df.format(dagongye35chun) );
			 httpServletRequest.setAttribute("guitie10chun",df.format(guitie10chun) );
			 httpServletRequest.setAttribute("guitie35chun",df.format(guitie35chun) );
			 httpServletRequest.setAttribute("dianshi10chun",df.format(dianshi10chun) );
			 httpServletRequest.setAttribute("dianshi35chun",df.format(dianshi35chun) );
			 httpServletRequest.setAttribute("huafei10chun",df.format(huafei10chun) );
			 httpServletRequest.setAttribute("huafei35chun",df.format(huafei35chun) );
			 httpServletRequest.setAttribute("sumTax",df.format(sumTax) );
			 httpServletRequest.setAttribute("sumChun",df.format(sumChun) );
			 httpServletRequest.setAttribute("sumFee",df.format(sumFee) );
			 
			 httpServletRequest.setAttribute("sumFee",df.format(sumFee) );*/
			
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
			 
			 
			 httpServletRequest.setAttribute("serchDate",serchDate );
			 
			 
			 
			 
			 
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			 
		
		
		 
		 
		return actionMapping.findForward("corporationpriceprint");
	}

}
