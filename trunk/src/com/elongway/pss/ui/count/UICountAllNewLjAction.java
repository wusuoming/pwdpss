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
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UICountAllNewLjAction extends Action {
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
		
		
		//写的数据
		LwShouShuTableDto  wholesaleshoushuLwShouShuTableDto=new LwShouShuTableDto();
		LwShouShuTableDto  corporationshoushuLwShouShuTableDto=new LwShouShuTableDto();
		LwShouShuTableDto  allshoushuLwShouShuTableDto=new LwShouShuTableDto();
		
		
		double dunshoushoushupower=0;
		double dunshoushoushudianfee=0;
		double dunshoushoushudianfeeshui=0;
		double dunshoushoushusumdianfee=0;
		double dunshoushoushuchabiefee=0;
		double dunshoushoushuchabietax=0;
		double dunshoushoushujijin=0;
		double dunshoushoushujijintax=0;
		double dunshoushoushusanxia=0;
		double dunshoushoushusanxiatax=0;
		double dunshoushoushudianjin=0;
		double dunshoushoushudianjintax=0;
		double dunshoushoushusumallfee=0;
		//趸售写
		Collection colwholesaleshoushu=blLwShouShuTableFacade.findByConditions(tempCondition+" and feetype='shoushuwholesale' ");
		if(colwholesaleshoushu==null||colwholesaleshoushu.size()==0){
			
			throw new UserException(-6, -706, this.getClass().getName(),
			"该月还没有输入数据！");
		}
		Iterator itwholesaleshoushu=colwholesaleshoushu.iterator();
		while(itwholesaleshoushu.hasNext()){
			LwShouShuTableDto lwShouShuTableDto=(LwShouShuTableDto)itwholesaleshoushu.next();
			dunshoushoushupower+=lwShouShuTableDto.getPower();
			dunshoushoushudianfee+=lwShouShuTableDto.getChunDianFei();
			dunshoushoushudianfeeshui+=lwShouShuTableDto.getDianFeiTax();
			dunshoushoushusumdianfee+=lwShouShuTableDto.getSumDianFee();
			dunshoushoushuchabiefee+=lwShouShuTableDto.getDiffrentFei();
			dunshoushoushuchabietax+=lwShouShuTableDto.getDiffrentFeiTax();
			dunshoushoushujijin+=lwShouShuTableDto.getJijin();
			dunshoushoushujijintax+=lwShouShuTableDto.getJinjinTax();
			dunshoushoushusanxia+=lwShouShuTableDto.getSanXia();
			dunshoushoushusanxiatax+=lwShouShuTableDto.getSanXiaTax();
			dunshoushoushudianjin+=lwShouShuTableDto.getDianJin();
			dunshoushoushudianjintax+=lwShouShuTableDto.getDianJinTax();
			dunshoushoushusumallfee+=lwShouShuTableDto.getSumFee();
			}
		wholesaleshoushuLwShouShuTableDto.setPower(dunshoushoushupower);
		wholesaleshoushuLwShouShuTableDto.setChunDianFei(dunshoushoushudianfee);
		wholesaleshoushuLwShouShuTableDto.setDianFeiTax(dunshoushoushudianfeeshui);
		wholesaleshoushuLwShouShuTableDto.setSumDianFee(dunshoushoushusumdianfee);
		wholesaleshoushuLwShouShuTableDto.setDiffrentFei(dunshoushoushuchabiefee);
		wholesaleshoushuLwShouShuTableDto.setDiffrentFeiTax(dunshoushoushuchabietax);
		wholesaleshoushuLwShouShuTableDto.setJijin(dunshoushoushujijin);
		wholesaleshoushuLwShouShuTableDto.setJinjinTax(dunshoushoushujijintax);
		wholesaleshoushuLwShouShuTableDto.setSanXia(dunshoushoushusanxia);
		wholesaleshoushuLwShouShuTableDto.setSanXiaTax(dunshoushoushusanxiatax);
		wholesaleshoushuLwShouShuTableDto.setDianJin(dunshoushoushudianjin);
		wholesaleshoushuLwShouShuTableDto.setDianJinTax(dunshoushoushudianjintax);
		wholesaleshoushuLwShouShuTableDto.setSumFee(dunshoushoushusumallfee);
		//大工业读
		double corporationshoushupower=0;
		double corporationshoushudianfee=0;
		double corporationshoushudianfeeshui=0;
		double corporationshoushusumdianfee=0;
		double corporationshoushuchabiefee=0;
		double coporationshoushuchabietax=0;
		double corporationshoushujijin=0;
		double corporationshoushujijintax=0;
		double corporationshoushusanxia=0;
		double corporationshoushusanxiatax=0;
		double corporationshoushudianjin=0;
		double corporationshoushudianjintax=0;
		double corporationshoushusumallfee=0;
		Collection colcorporationshoushu=blLwShouShuTableFacade.findByConditions(tempCondition+" and feetype='shoushucorporation' ");
		
if(colcorporationshoushu==null||colcorporationshoushu.size()==0){
			
			throw new UserException(-6, -706, this.getClass().getName(),
			"该月还没有输入数据！");
		}
		
		
		
		Iterator itcorporationshoushu=colcorporationshoushu.iterator();
		while(itcorporationshoushu.hasNext()){
			LwShouShuTableDto lwShouShuTableDto=(LwShouShuTableDto)itcorporationshoushu.next();
			corporationshoushupower+=lwShouShuTableDto.getPower();
			corporationshoushudianfee+=lwShouShuTableDto.getChunDianFei();
			corporationshoushudianfeeshui+=lwShouShuTableDto.getDianFeiTax();
			corporationshoushusumdianfee+=lwShouShuTableDto.getSumDianFee();
			corporationshoushuchabiefee+=lwShouShuTableDto.getDiffrentFei();
			coporationshoushuchabietax+=lwShouShuTableDto.getDiffrentFeiTax();
			corporationshoushujijin+=lwShouShuTableDto.getJijin();
			corporationshoushujijintax+=lwShouShuTableDto.getJinjinTax();
			corporationshoushusanxia+=lwShouShuTableDto.getSanXia();
			corporationshoushusanxiatax+=lwShouShuTableDto.getSanXiaTax();
			corporationshoushudianjin+=lwShouShuTableDto.getDianJin();
			corporationshoushudianjintax+=lwShouShuTableDto.getDianJinTax();
			corporationshoushusumallfee+=lwShouShuTableDto.getSumFee();
			}
		corporationshoushuLwShouShuTableDto.setPower(corporationshoushupower);
		corporationshoushuLwShouShuTableDto.setChunDianFei(corporationshoushudianfee);
		corporationshoushuLwShouShuTableDto.setDianFeiTax(corporationshoushudianfeeshui);
		corporationshoushuLwShouShuTableDto.setSumDianFee(corporationshoushusumdianfee);
		corporationshoushuLwShouShuTableDto.setDiffrentFei(corporationshoushuchabiefee);
		corporationshoushuLwShouShuTableDto.setDiffrentFeiTax(coporationshoushuchabietax);
		corporationshoushuLwShouShuTableDto.setJijin(corporationshoushujijin);
		corporationshoushuLwShouShuTableDto.setJinjinTax(corporationshoushujijintax);
		corporationshoushuLwShouShuTableDto.setSanXia(corporationshoushusanxia);
		corporationshoushuLwShouShuTableDto.setSanXiaTax(corporationshoushusanxiatax);
		corporationshoushuLwShouShuTableDto.setDianJin(corporationshoushudianjin);
		corporationshoushuLwShouShuTableDto.setDianJinTax(corporationshoushudianjintax);
		corporationshoushuLwShouShuTableDto.setSumFee(dunshoushoushusumallfee);
		//全部写
		allshoushuLwShouShuTableDto.setPower(wholesaleshoushuLwShouShuTableDto.getPower()+corporationshoushuLwShouShuTableDto.getPower());
		allshoushuLwShouShuTableDto.setChunDianFei(wholesaleshoushuLwShouShuTableDto.getChunDianFei()+corporationshoushuLwShouShuTableDto.getChunDianFei());
		allshoushuLwShouShuTableDto.setDianFeiTax(wholesaleshoushuLwShouShuTableDto.getDianFeiTax()+corporationshoushuLwShouShuTableDto.getDianFeiTax());
		allshoushuLwShouShuTableDto.setSumDianFee(wholesaleshoushuLwShouShuTableDto.getSumDianFee()+corporationshoushuLwShouShuTableDto.getSumDianFee());
		allshoushuLwShouShuTableDto.setDiffrentFei(wholesaleshoushuLwShouShuTableDto.getDiffrentFei()+corporationshoushuLwShouShuTableDto.getDiffrentFei());
		allshoushuLwShouShuTableDto.setDiffrentFeiTax(wholesaleshoushuLwShouShuTableDto.getDiffrentFeiTax()+corporationshoushuLwShouShuTableDto.getDiffrentFeiTax());
		allshoushuLwShouShuTableDto.setJijin(wholesaleshoushuLwShouShuTableDto.getJijin()+corporationshoushuLwShouShuTableDto.getJijin());
		allshoushuLwShouShuTableDto.setJinjinTax(wholesaleshoushuLwShouShuTableDto.getJinjinTax()+corporationshoushuLwShouShuTableDto.getJinjinTax());
		allshoushuLwShouShuTableDto.setDianJin(wholesaleshoushuLwShouShuTableDto.getDianJin()+corporationshoushuLwShouShuTableDto.getDianJin());
		allshoushuLwShouShuTableDto.setDianJinTax(wholesaleshoushuLwShouShuTableDto.getDianJinTax()+corporationshoushuLwShouShuTableDto.getDianJinTax());
		allshoushuLwShouShuTableDto.setSanXia(wholesaleshoushuLwShouShuTableDto.getSanXia()+corporationshoushuLwShouShuTableDto.getSanXia());
		allshoushuLwShouShuTableDto.setSanXiaTax(wholesaleshoushuLwShouShuTableDto.getSanXiaTax()+corporationshoushuLwShouShuTableDto.getSanXiaTax());
		allshoushuLwShouShuTableDto.setSumFee(wholesaleshoushuLwShouShuTableDto.getSumFee()+corporationshoushuLwShouShuTableDto.getSumFee());
		
		
		httpServletRequest.setAttribute("wholesaleduLwShouShuTableDto", wholesaleduLwShouShuTableDto);
		httpServletRequest.setAttribute("corporationduLwShouShuTableDto", corporationduLwShouShuTableDto);
		httpServletRequest.setAttribute("allduLwShouShuTableDto", allduLwShouShuTableDto);
		
		httpServletRequest.setAttribute("wholesaleshoushuLwShouShuTableDto", wholesaleshoushuLwShouShuTableDto);
		httpServletRequest.setAttribute("corporationshoushuLwShouShuTableDto", corporationshoushuLwShouShuTableDto);
		httpServletRequest.setAttribute("allshoushuLwShouShuTableDto", allshoushuLwShouShuTableDto);
		httpServletRequest.setAttribute("inputDate", inputDate);
		
		return actionMapping.findForward("countallnewleijia");
		
	}
	
	public String getAddMonthCondition(String startMonth, String endMonth,
			String column) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("1=1 and ").append(column).append(" between '").append(
				startMonth).append("' and '").append(endMonth).append("'");
		return buffer.toString();
	}
}
