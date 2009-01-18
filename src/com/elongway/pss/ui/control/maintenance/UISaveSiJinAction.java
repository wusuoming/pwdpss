package com.elongway.pss.ui.control.maintenance;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLSubjoinFeeFacade;
import com.elongway.pss.dto.domain.SubjoinFeeDto;

public class UISaveSiJinAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String[]  UserId=httpServletRequest.getParameterValues("UserId");
		String[]  UserName=httpServletRequest.getParameterValues("UserName");
		String[]  nongwanhuandai=httpServletRequest.getParameterValues("nongwanhuandai");
		String[]  sanxia=httpServletRequest.getParameterValues("sanxia");
		String[]  kuquyimin=httpServletRequest.getParameterValues("kuquyimin");
		String[]  kezaisheng=httpServletRequest.getParameterValues("kezaisheng");
		BLSubjoinFeeFacade  blSubjoinFeeFacade=new BLSubjoinFeeFacade();
		SubjoinFeeDto subjoinFeeDto=new SubjoinFeeDto();
		
		for( int i=0;i<UserId.length;i++){
			subjoinFeeDto.setPowerType(UserId[i]);
			subjoinFeeDto.setName(UserName[i]);
			subjoinFeeDto.setNongwanghuanDai(Double.parseDouble(nongwanhuandai[i]));
			subjoinFeeDto.setSanXia(Double.parseDouble(sanxia[i]));
			subjoinFeeDto.setKuquyimin(Double.parseDouble(kuquyimin[i]));
			subjoinFeeDto.setKezaishengnengyuan(Double.parseDouble(kezaisheng[i]));
			blSubjoinFeeFacade.update(subjoinFeeDto);
		}
		String conditions="";
		
		Collection col=blSubjoinFeeFacade.findByConditions(conditions);
		
		httpServletRequest.setAttribute("price", col);
		return  actionMapping.findForward("editsijin");
	}

}
