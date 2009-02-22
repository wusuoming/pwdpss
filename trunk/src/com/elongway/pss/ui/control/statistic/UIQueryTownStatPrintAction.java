package com.elongway.pss.ui.control.statistic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.dto.custom.SalePriceDto;
import com.elongway.pss.dto.custom.TownSataDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;

/**
 * 增加趸售比例分摊
 * 
 * @author goodluck
 * 
 */
public class UIQueryTownStatPrintAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		/** 0-声明变量 */
		String condition = null;
		String statMonth = null;
		TownSataDto townSataDto = null;
		String forward = null;
		Collection<TownSataDto> resultList = new ArrayList<TownSataDto>();
		// 得到表单的数据
		/*String s = (String) httpServletRequest.getParameter("s");
		// 进行分解
		String formValue[] = s.split(",");
		statMonth = formValue[0];
		int length = formValue.length / 10;
		for (int i = 0; i < length; i++) {
			townSataDto = new TownSataDto();
			townSataDto.setSumPower(Double.parseDouble(formValue[i * 10 + 1]));
			townSataDto.setPurePowerFee(Double
					.parseDouble(formValue[i * 10 + 2]));
			townSataDto.setPowerFeeTax(Double
					.parseDouble(formValue[i * 10 + 3]));
			townSataDto.setPureDianJin(Double
					.parseDouble(formValue[i * 10 + 4]));
			townSataDto
					.setDianJinTax(Double.parseDouble(formValue[i * 10 + 5]));
			townSataDto
					.setPureSanXia(Double.parseDouble(formValue[i * 10 + 6]));
			townSataDto.setSanXiaTax(Double.parseDouble(formValue[i * 10 + 7]));
			townSataDto.setPureJiJin(Double.parseDouble(formValue[i * 10 + 8]));
			townSataDto.setJiJinTax(Double.parseDouble(formValue[i * 10 + 9]));
			townSataDto.setSumPowerFee(Double
					.parseDouble(formValue[i * 10 + 10]));
			resultList.add(townSataDto);
		}*/
		httpServletRequest.setAttribute("resultList", resultList);
		httpServletRequest.setAttribute("statMonth", statMonth);

		return actionMapping.findForward(forward);

	}

}
