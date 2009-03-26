package com.elongway.pss.ui.count;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerFeeFaxingFacade;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;
import com.elongway.pss.util.AppConst;
import com.sinosoft.sysframework.common.datatype.DateTime;

public class UIThisMonthAllCountSave extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
	
		String counttype = httpServletRequest.getParameter("counttype");
		
		/************************************************************************
		 * 1、读取表单数据
		 ************************************************************************/
		String statMonth = httpServletRequest.getParameter("StartMonth");
		statMonth = new DateTime(statMonth,DateTime.YEAR_TO_MONTH).toString();
		String []userName = httpServletRequest.getParameterValues("userNo");
		String []userNo = httpServletRequest.getParameterValues("lineCode");
		String []electricQuantity = httpServletRequest.getParameterValues("electricQuantity");
		String []fee = httpServletRequest.getParameterValues("fee");
		String []sanXiaFee = httpServletRequest.getParameterValues("sanXiaFee");
		String []dianJin = httpServletRequest.getParameterValues("dianJin");
		String []jiJin = httpServletRequest.getParameterValues("jiJin");
		String []feeTax = httpServletRequest.getParameterValues("feeTax");
		String []sanXiaTax = httpServletRequest.getParameterValues("sanXiaTax");
		String []dianJinTax = httpServletRequest.getParameterValues("dianJinTax");
		String []jiJinTax = httpServletRequest.getParameterValues("jiJinTax");
		String []chabie = httpServletRequest.getParameterValues("chabie");
		String []chabieTax = httpServletRequest.getParameterValues("chabieTax");
		String []sumFee = httpServletRequest.getParameterValues("sumFee");
		String []remark = httpServletRequest.getParameterValues("remark");
		
		Collection<LwPowerFeeFaxingDto>collection = new ArrayList<LwPowerFeeFaxingDto>();		
		
		BLLwPowerFeeFaxingFacade blLwPowerFeeFaxingFacade = new BLLwPowerFeeFaxingFacade();
		
		LwPowerFeeFaxingDto o = null;
		for (int i = 0; i < sumFee.length; i++) {
			o = new LwPowerFeeFaxingDto();
			o.setUserNo(userNo[i]);
			o.setUserName(userName[i]);
			o.setQuantity(Long.parseLong(electricQuantity[i]));
			o.setPurePowerFee(Double.parseDouble(fee[i]));
			o.setSanXiaFee(Double.parseDouble(sanXiaFee[i]));
			o.setPureDianJin(Double.parseDouble(dianJin[i]));
			o.setPureJiJin(Double.parseDouble(jiJin[i]));
			o.setPowerFeeTax(Double.parseDouble(feeTax[i]));
			o.setSanXiaTax(Double.parseDouble(sanXiaTax[i]));
			o.setDianJinTax(Double.parseDouble(dianJinTax[i]));
			o.setJiJinTax(Double.parseDouble(jiJinTax[i]));
			o.setChaBieFee(Double.parseDouble(chabie[i]));
			o.setChaBieTax(Double.parseDouble(chabieTax[i]));
			o.setSumFee(Double.parseDouble(sumFee[i]));
			o.setStatMonth(statMonth);
			o.setInputDate(new DateTime(new Date(),DateTime.YEAR_TO_MONTH).toString());
			o.setStatStyle(AppConst.STAT_CURRENT_FLAG);
			o.setRemark(remark[i]);
			collection.add(o);		
		}
		
		blLwPowerFeeFaxingFacade.insertAll(collection);
		
		httpServletRequest.setAttribute("counttype", counttype);
		httpServletRequest.setAttribute("faXingList", collection);
		httpServletRequest.setAttribute("inputDate", statMonth);
		
		return actionMapping.findForward("storetable");
	}

	

	}

