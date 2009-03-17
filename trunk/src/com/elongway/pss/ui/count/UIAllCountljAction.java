package com.elongway.pss.ui.count;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwShouShuTableFacade;
import com.elongway.pss.dto.domain.LwShouShuTableDto;

public class UIAllCountljAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String StatMonth=inputDate.substring(0, 7);
		String tempCondition = this.getAddMonthCondition("2009-01",
				StatMonth, "month");
		BLLwShouShuTableFacade  blLwShouShuTableFacade=new BLLwShouShuTableFacade();
		LwShouShuTableDto  wholesaleduLwShouShuTableDto=new LwShouShuTableDto();
		LwShouShuTableDto  corporationduLwShouShuTableDto=new LwShouShuTableDto();
		LwShouShuTableDto  allduLwShouShuTableDto=new LwShouShuTableDto();
		
		
		double dunshoudupower=0;
		double dunshoududianfee=0;
		double dunshoududianfeeshui=0;
		double dunshoudusumdianfee=0;
		double dunshouduchabiefee=0;
		double dunshouduchabietax=0;
		double dunshoudujijin=0;
		double dunshoudujijintax=0;
		double dunshoudusanxia=0;
		double dunshoudusanxiatax=0;
		double dunshoududianjin=0;
		double dunshoududianjintax=0;
		double dunshoudusumallfee=0;
		//趸售读
		Collection colwholesaledu=blLwShouShuTableFacade.findByConditions(tempCondition+" and feetype='duwholesale' ");
		Iterator itwholesaledu=colwholesaledu.iterator();
		while(itwholesaledu.hasNext()){
			LwShouShuTableDto lwShouShuTableDto=(LwShouShuTableDto)itwholesaledu.next();
			dunshoudupower+=lwShouShuTableDto.getPower();
			dunshoududianfee+=lwShouShuTableDto.getChunDianFei();
			dunshoududianfeeshui+=lwShouShuTableDto.getDianFeiTax();
			dunshoudusumdianfee+=lwShouShuTableDto.getSumDianFee();
			dunshouduchabiefee+=lwShouShuTableDto.getDiffrentFei();
			dunshouduchabietax+=lwShouShuTableDto.getDiffrentFeiTax();
			dunshoudujijin+=lwShouShuTableDto.getJijin();
			dunshoudujijintax+=lwShouShuTableDto.getJinjinTax();
			dunshoudusanxia+=lwShouShuTableDto.getSanXia();
			dunshoudusanxiatax+=lwShouShuTableDto.getSanXiaTax();
			dunshoududianjin+=lwShouShuTableDto.getDianJin();
			dunshoududianjintax+=lwShouShuTableDto.getDianJinTax();
			dunshoudusumallfee+=lwShouShuTableDto.getSumFee();
			}
		wholesaleduLwShouShuTableDto.setPower(dunshoudupower);
		wholesaleduLwShouShuTableDto.setChunDianFei(dunshoududianfee);
		wholesaleduLwShouShuTableDto.setDianFeiTax(dunshoududianfeeshui);
		wholesaleduLwShouShuTableDto.setSumDianFee(dunshoudusumdianfee);
		wholesaleduLwShouShuTableDto.setDiffrentFei(dunshouduchabiefee);
		wholesaleduLwShouShuTableDto.setDiffrentFeiTax(dunshouduchabietax);
		wholesaleduLwShouShuTableDto.setJijin(dunshoudujijin);
		wholesaleduLwShouShuTableDto.setJinjinTax(dunshoudujijintax);
		wholesaleduLwShouShuTableDto.setSanXia(dunshoudusanxia);
		wholesaleduLwShouShuTableDto.setSanXiaTax(dunshoudusanxiatax);
		wholesaleduLwShouShuTableDto.setDianJin(dunshoududianjin);
		wholesaleduLwShouShuTableDto.setDianJinTax(dunshoududianjintax);
		wholesaleduLwShouShuTableDto.setSumFee(dunshoudusumallfee);
		//大工业读
		double corporationdupower=0;
		double corporationdudianfee=0;
		double corporationdudianfeeshui=0;
		double corporationdusumdianfee=0;
		double corporationduchabiefee=0;
		double coporationduchabietax=0;
		double corporationdujijin=0;
		double corporationdujijintax=0;
		double corporationdusanxia=0;
		double corporationdusanxiatax=0;
		double corporationdudianjin=0;
		double corporationdudianjintax=0;
		double corporationdusumallfee=0;
		Collection colcorporationdu=blLwShouShuTableFacade.findByConditions(tempCondition+" and feetype='ducorporation' ");
		Iterator itcorporationdu=colcorporationdu.iterator();
		while(itcorporationdu.hasNext()){
			LwShouShuTableDto lwShouShuTableDto=(LwShouShuTableDto)itcorporationdu.next();
			corporationdupower+=lwShouShuTableDto.getPower();
			corporationdudianfee+=lwShouShuTableDto.getChunDianFei();
			corporationdudianfeeshui+=lwShouShuTableDto.getDianFeiTax();
			corporationdusumdianfee+=lwShouShuTableDto.getSumDianFee();
			corporationduchabiefee+=lwShouShuTableDto.getDiffrentFei();
			coporationduchabietax+=lwShouShuTableDto.getDiffrentFeiTax();
			corporationdujijin+=lwShouShuTableDto.getJijin();
			corporationdujijintax+=lwShouShuTableDto.getJinjinTax();
			corporationdusanxia+=lwShouShuTableDto.getSanXia();
			corporationdusanxiatax+=lwShouShuTableDto.getSanXiaTax();
			corporationdudianjin+=lwShouShuTableDto.getDianJin();
			corporationdudianjintax+=lwShouShuTableDto.getDianJinTax();
			corporationdusumallfee+=lwShouShuTableDto.getSumFee();
			}
		corporationduLwShouShuTableDto.setPower(corporationdupower);
		corporationduLwShouShuTableDto.setChunDianFei(corporationdudianfee);
		corporationduLwShouShuTableDto.setDianFeiTax(corporationdudianfeeshui);
		corporationduLwShouShuTableDto.setSumDianFee(corporationdusumdianfee);
		corporationduLwShouShuTableDto.setDiffrentFei(corporationduchabiefee);
		corporationduLwShouShuTableDto.setDiffrentFeiTax(coporationduchabietax);
		corporationduLwShouShuTableDto.setJijin(corporationdujijin);
		corporationduLwShouShuTableDto.setJinjinTax(corporationdujijintax);
		corporationduLwShouShuTableDto.setSanXia(corporationdusanxia);
		corporationduLwShouShuTableDto.setSanXiaTax(corporationdusanxiatax);
		corporationduLwShouShuTableDto.setDianJin(corporationdudianjin);
		corporationduLwShouShuTableDto.setDianJinTax(corporationdudianjintax);
		corporationduLwShouShuTableDto.setSumFee(dunshoudusumallfee);
		//全部读
		allduLwShouShuTableDto.setPower(wholesaleduLwShouShuTableDto.getPower()+corporationduLwShouShuTableDto.getPower());
		allduLwShouShuTableDto.setChunDianFei(wholesaleduLwShouShuTableDto.getChunDianFei()+corporationduLwShouShuTableDto.getChunDianFei());
		allduLwShouShuTableDto.setDianFeiTax(wholesaleduLwShouShuTableDto.getDianFeiTax()+corporationduLwShouShuTableDto.getDianFeiTax());
		allduLwShouShuTableDto.setSumDianFee(wholesaleduLwShouShuTableDto.getSumDianFee()+corporationduLwShouShuTableDto.getSumDianFee());
		allduLwShouShuTableDto.setDiffrentFei(wholesaleduLwShouShuTableDto.getDiffrentFei()+corporationduLwShouShuTableDto.getDiffrentFei());
		allduLwShouShuTableDto.setDiffrentFeiTax(wholesaleduLwShouShuTableDto.getDiffrentFeiTax()+corporationduLwShouShuTableDto.getDiffrentFeiTax());
		allduLwShouShuTableDto.setJijin(wholesaleduLwShouShuTableDto.getJijin()+corporationduLwShouShuTableDto.getJijin());
		allduLwShouShuTableDto.setJinjinTax(wholesaleduLwShouShuTableDto.getJinjinTax()+corporationduLwShouShuTableDto.getJinjinTax());
		allduLwShouShuTableDto.setDianJin(wholesaleduLwShouShuTableDto.getDianJin()+corporationduLwShouShuTableDto.getDianJin());
		allduLwShouShuTableDto.setDianJinTax(wholesaleduLwShouShuTableDto.getDianJinTax()+corporationduLwShouShuTableDto.getDianJinTax());
		allduLwShouShuTableDto.setSanXia(wholesaleduLwShouShuTableDto.getSanXia()+corporationduLwShouShuTableDto.getSanXia());
		allduLwShouShuTableDto.setSanXiaTax(wholesaleduLwShouShuTableDto.getSanXiaTax()+corporationduLwShouShuTableDto.getSanXiaTax());
		allduLwShouShuTableDto.setSumFee(wholesaleduLwShouShuTableDto.getSumFee()+corporationduLwShouShuTableDto.getSumFee());
		
		
		httpServletRequest.setAttribute("wholesaleduLwShouShuTableDto", wholesaleduLwShouShuTableDto);
		httpServletRequest.setAttribute("corporationduLwShouShuTableDto", corporationduLwShouShuTableDto);
		httpServletRequest.setAttribute("allduLwShouShuTableDto", allduLwShouShuTableDto);
		
		
		httpServletRequest.setAttribute("inputDate", inputDate);
		
		return actionMapping.findForward("countalllj");

}
	public String getAddMonthCondition(String startMonth, String endMonth,
			String column) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("1=1 and ").append(column).append(" between '").append(
				startMonth).append("' and '").append(endMonth).append("'");
		return buffer.toString();
	}
}
