package com.elongway.pss.ui.count;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwShouShuTableFacade;
import com.elongway.pss.dto.domain.LwShouShuTableDto;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UICountAllResultNewAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String StatMonth=inputDate.substring(0, 7);
		BLLwShouShuTableFacade  blLwShouShuTableFacade=new BLLwShouShuTableFacade();
		//LwShouShuTableDto wholesalelwShouShuTableDto=new LwShouShuTableDto();
		//wholesalelwShouShuTableDto=blLwShouShuTableFacade.findByPrimaryKey(StatMonth, "duwholesale");
		
	//	if(wholesalelwShouShuTableDto==null){
		//	throw new UserException(-6, -706, this.getClass().getName(),
		//	"该月还没有算过费！");
		//}
		//LwShouShuTableDto  corporationlwShouShuTableDto=new LwShouShuTableDto();
		//corporationlwShouShuTableDto=blLwShouShuTableFacade.findByPrimaryKey(StatMonth, "ducorporation");
		//if(corporationlwShouShuTableDto==null){
			//throw new UserException(-6, -706, this.getClass().getName(),
			//"该月还没有算过费！");
	//	}
		
		//LwShouShuTableDto lwShouShuTableDto=new LwShouShuTableDto();
		
		//lwShouShuTableDto.setPower(wholesalelwShouShuTableDto.getPower()+corporationlwShouShuTableDto.getPower());
		//lwShouShuTableDto.setChunDianFei(wholesalelwShouShuTableDto.getChunDianFei()+corporationlwShouShuTableDto.getChunDianFei());
		//lwShouShuTableDto.setDianFeiTax(wholesalelwShouShuTableDto.getDianFeiTax()+corporationlwShouShuTableDto.getDianFeiTax());
		//lwShouShuTableDto.setSumDianFee(wholesalelwShouShuTableDto.getSumDianFee()+corporationlwShouShuTableDto.getSumDianFee());
		//lwShouShuTableDto.setJijin(wholesalelwShouShuTableDto.getJijin()+corporationlwShouShuTableDto.getJinjinTax());
		//lwShouShuTableDto.setJinjinTax(wholesalelwShouShuTableDto.getJinjinTax()+corporationlwShouShuTableDto.getJinjinTax());
		//lwShouShuTableDto.setDianJin(wholesalelwShouShuTableDto.getDianJin()+corporationlwShouShuTableDto.getDianJin());
		//lwShouShuTableDto.setDianJinTax(wholesalelwShouShuTableDto.getDianJinTax()+corporationlwShouShuTableDto.getDianJinTax());
		//lwShouShuTableDto.setSanXia(wholesalelwShouShuTableDto.getSanXia()+corporationlwShouShuTableDto.getSanXia());
		//lwShouShuTableDto.setSanXiaTax(wholesalelwShouShuTableDto.getSanXiaTax()+corporationlwShouShuTableDto.getSanXiaTax());
		//lwShouShuTableDto.setSumFee(wholesalelwShouShuTableDto.getSumFee()+corporationlwShouShuTableDto.getSumFee());
		//lwShouShuTableDto.setDiffrentFei(wholesalelwShouShuTableDto.getDiffrentFei()+corporationlwShouShuTableDto.getDiffrentFei());
		//lwShouShuTableDto.setDiffrentFeiTax(wholesalelwShouShuTableDto.getDiffrentFeiTax()+corporationlwShouShuTableDto.getDiffrentFeiTax());
		
		LwShouShuTableDto wholesaleshoushulwShouShuTableDto=new LwShouShuTableDto();
		wholesaleshoushulwShouShuTableDto=blLwShouShuTableFacade.findByPrimaryKey(StatMonth, "shoushuwholesale");
		//if(wholesaleshoushulwShouShuTableDto==null){
			//wholesaleshoushulwShouShuTableDto.setPower(0);
			//wholesaleshoushulwShouShuTableDto.setChunDianFei(0);
			//wholesaleshoushulwShouShuTableDto.setDianFeiTax(0);
			//wholesaleshoushulwShouShuTableDto.setSumDianFee(0);
			//wholesaleshoushulwShouShuTableDto.setDiffrentFei(0);
			//wholesaleshoushulwShouShuTableDto.setDiffrentFeiTax(0);
			//wholesaleshoushulwShouShuTableDto.setJijin(0);
			//wholesaleshoushulwShouShuTableDto.setJinjinTax(0);
			//wholesaleshoushulwShouShuTableDto.setSanXia(0);
			//wholesaleshoushulwShouShuTableDto.setSanXiaTax(0);
			//wholesaleshoushulwShouShuTableDto.setDianJin(0);
			//wholesaleshoushulwShouShuTableDto.setDianJinTax(0);
			//wholesaleshoushulwShouShuTableDto.setSumFee(0);
			
			
		//}
		
		LwShouShuTableDto  corporationshoushulwShouShuTableDto=new LwShouShuTableDto();
		corporationshoushulwShouShuTableDto=blLwShouShuTableFacade.findByPrimaryKey(StatMonth, "shoushucorporation");
		//if(corporationshoushulwShouShuTableDto==null){
			//corporationshoushulwShouShuTableDto.setPower(0);
		//	corporationshoushulwShouShuTableDto.setChunDianFei(0);
			//corporationshoushulwShouShuTableDto.setDianFeiTax(0);
			//corporationshoushulwShouShuTableDto.setSumDianFee(0);
			//corporationshoushulwShouShuTableDto.setDiffrentFei(0);
			//corporationshoushulwShouShuTableDto.setDiffrentFeiTax(0);
			//corporationshoushulwShouShuTableDto.setJijin(0);
			//corporationshoushulwShouShuTableDto.setJinjinTax(0);
			//corporationshoushulwShouShuTableDto.setSanXia(0);
			//corporationshoushulwShouShuTableDto.setSanXiaTax(0);
			//corporationshoushulwShouShuTableDto.setDianJin(0);
		//	corporationshoushulwShouShuTableDto.setDianJinTax(0);
			//corporationshoushulwShouShuTableDto.setSumFee(0);
			
			
		//}
		
		LwShouShuTableDto shoushulwShouShuTableDto=new LwShouShuTableDto();
		if(wholesaleshoushulwShouShuTableDto==null||corporationshoushulwShouShuTableDto==null){}
		else{
		shoushulwShouShuTableDto.setPower(wholesaleshoushulwShouShuTableDto.getPower()+corporationshoushulwShouShuTableDto.getPower());
		shoushulwShouShuTableDto.setChunDianFei(wholesaleshoushulwShouShuTableDto.getChunDianFei()+corporationshoushulwShouShuTableDto.getChunDianFei());
		shoushulwShouShuTableDto.setDianFeiTax(wholesaleshoushulwShouShuTableDto.getDianFeiTax()+corporationshoushulwShouShuTableDto.getDianFeiTax());
		shoushulwShouShuTableDto.setSumDianFee(wholesaleshoushulwShouShuTableDto.getSumDianFee()+corporationshoushulwShouShuTableDto.getSumDianFee());
		shoushulwShouShuTableDto.setJijin(wholesaleshoushulwShouShuTableDto.getJijin()+corporationshoushulwShouShuTableDto.getJijin());
		shoushulwShouShuTableDto.setJinjinTax(wholesaleshoushulwShouShuTableDto.getJinjinTax()+corporationshoushulwShouShuTableDto.getJinjinTax());
		shoushulwShouShuTableDto.setDianJin(wholesaleshoushulwShouShuTableDto.getDianJin()+corporationshoushulwShouShuTableDto.getDianJin());
		shoushulwShouShuTableDto.setDianJinTax(wholesaleshoushulwShouShuTableDto.getDianJinTax() +corporationshoushulwShouShuTableDto.getDianJinTax());
		shoushulwShouShuTableDto.setSanXia(wholesaleshoushulwShouShuTableDto.getSanXia()+corporationshoushulwShouShuTableDto.getSanXia());
		shoushulwShouShuTableDto.setSanXiaTax(wholesaleshoushulwShouShuTableDto.getSanXiaTax()+corporationshoushulwShouShuTableDto.getSanXiaTax());
		shoushulwShouShuTableDto.setSumFee(wholesaleshoushulwShouShuTableDto.getSumFee()+corporationshoushulwShouShuTableDto.getSumFee());
		shoushulwShouShuTableDto.setDiffrentFei(wholesaleshoushulwShouShuTableDto.getDiffrentFei()+corporationshoushulwShouShuTableDto.getDiffrentFei() );
		shoushulwShouShuTableDto.setDiffrentFeiTax(wholesaleshoushulwShouShuTableDto.getDiffrentFeiTax()+corporationshoushulwShouShuTableDto.getDianFeiTax());
		//httpServletRequest.setAttribute("wholesalelwShouShuTableDto", wholesalelwShouShuTableDto);
		//httpServletRequest.setAttribute("corporationlwShouShuTableDto", corporationlwShouShuTableDto);
		//httpServletRequest.setAttribute("lwShouShuTableDto", lwShouShuTableDto);
		}
		httpServletRequest.setAttribute("wholesaleshoushulwShouShuTableDto", wholesaleshoushulwShouShuTableDto);
		httpServletRequest.setAttribute("corporationshoushulwShouShuTableDto", corporationshoushulwShouShuTableDto);
		httpServletRequest.setAttribute("shoushulwShouShuTableDto", shoushulwShouShuTableDto);
		httpServletRequest.setAttribute("inputDate", inputDate);
		
		return actionMapping.findForward("countallnew");
		
		
		
		
		
		
	}
	}
