package com.elongway.pss.ui.count;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwShouShuTableFacade;
import com.elongway.pss.dto.domain.LwShouShuTableDto;

public class UICountAllNewSaveAction extends Action {
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
		lwShouShuTableDto.setFeeType("shoushucorporation");
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
		blLwShouShuTableFacade.delete(statmonth, "shoushucorporation");
		blLwShouShuTableFacade.insert(lwShouShuTableDto);
		
		
		
		LwShouShuTableDto  lwwShouShuTableDto=new LwShouShuTableDto();
		lwwShouShuTableDto.setMonth(statmonth);
		lwwShouShuTableDto.setFeeType("shoushuwholesale");
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
		blLwShouShuTableFacade.delete(statmonth, "shoushuwholesale");
		blLwShouShuTableFacade.insert(lwwShouShuTableDto);
		
		return actionMapping.findForward("Success");
		
	}

}
