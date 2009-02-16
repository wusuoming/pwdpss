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

import antlr.collections.List;

import com.elongway.pss.bl.facade.BLLwAllWholeFeeFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleDetailFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.custom.WholeSaleFee;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.sinosoft.sysframework.common.datatype.DateTime;

public class UIEveryWholeSaleCountAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		String inputDate = httpServletRequest.getParameter("inputDate");
		inputDate = new DateTime(inputDate,DateTime.YEAR_TO_MONTH).toString();
		LwWholeSaleDetailDto lwWholeSaleDetailDtogy = new LwWholeSaleDetailDto();
		LwWholeSaleDetailDto lwWholeSaleDetailDtodm = new LwWholeSaleDetailDto();
		LwWholeSaleDetailDto lwWholeSaleDetailDtojy = new LwWholeSaleDetailDto();
		LwWholeSaleDetailDto lwWholeSaleDetailDtoty = new LwWholeSaleDetailDto();
		BLLwWholeSaleDetailFacade bLLwWholeSaleDetailFacade = new BLLwWholeSaleDetailFacade();
		lwWholeSaleDetailDtogy = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"gy", inputDate);
		lwWholeSaleDetailDtodm = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"dm", inputDate);
		lwWholeSaleDetailDtojy = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"jy", inputDate);
		lwWholeSaleDetailDtoty = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"ty", inputDate);
		BLLwAllWholeFeeFacade bLLwAllWholeFeeFacade = new BLLwAllWholeFeeFacade();
		LwAllWholeFeeDto lwAllWholeFeeDtogy = new LwAllWholeFeeDto();
		LwAllWholeFeeDto lwAllWholeFeeDtodm = new LwAllWholeFeeDto();
		LwAllWholeFeeDto lwAllWholeFeeDtojy = new LwAllWholeFeeDto();
		LwAllWholeFeeDto lwAllWholeFeeDtoty = new LwAllWholeFeeDto();
		lwAllWholeFeeDtogy = bLLwAllWholeFeeFacade.findByPrimaryKey("gy",inputDate);
		lwAllWholeFeeDtodm = bLLwAllWholeFeeFacade.findByPrimaryKey("dm",inputDate);
		lwAllWholeFeeDtojy = bLLwAllWholeFeeFacade.findByPrimaryKey("jy",inputDate);
		lwAllWholeFeeDtoty = bLLwAllWholeFeeFacade.findByPrimaryKey("ty",inputDate);
		httpServletRequest.setAttribute("lwAllWholeFeeDtogy", lwAllWholeFeeDtogy);
		httpServletRequest.setAttribute("lwAllWholeFeeDtodm", lwAllWholeFeeDtodm);
		httpServletRequest.setAttribute("lwAllWholeFeeDtojy", lwAllWholeFeeDtojy);
		httpServletRequest.setAttribute("lwAllWholeFeeDtoty", lwAllWholeFeeDtoty);
		
		httpServletRequest.setAttribute("lwWholeSaleDetailDtogy", lwWholeSaleDetailDtogy);
		httpServletRequest.setAttribute("lwWholeSaleDetailDtodm", lwWholeSaleDetailDtodm);
		httpServletRequest.setAttribute("lwWholeSaleDetailDtojy", lwWholeSaleDetailDtojy);
		httpServletRequest.setAttribute("lwWholeSaleDetailDtoty", lwWholeSaleDetailDtoty);
		return actionMapping.findForward("everywholesale");
	}

}
