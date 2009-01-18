package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.domain.BLLwAmmeterChangeAction;
import com.elongway.pss.bl.action.domain.BLLwWholeSaleUserInfoAction;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwUserAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.reference.DBManager;

public class UIAddWholeSaleUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		String transformerName = httpServletRequest
				.getParameter("transformerName");
		String voltage = httpServletRequest.getParameter("voltage");
		String company = httpServletRequest.getParameter("company");
		String wholeSaleType = httpServletRequest.getParameter("wholeSaleType");
		String phoneNo = httpServletRequest.getParameter("phoneNo");
		String lineCode = httpServletRequest.getParameter("lineCode");
		// 电表信息
		String ammeterX = httpServletRequest.getParameter("ammeterX");
		String ammeterV = httpServletRequest.getParameter("ammeterV");
		String ammeterA = httpServletRequest.getParameter("ammeterA");
		String ammeterType = httpServletRequest.getParameter("ammeterType");
		String factoryName = httpServletRequest.getParameter("factoryName");
		String ammeterNo = httpServletRequest.getParameter("ammeterNo");
		String coust = httpServletRequest.getParameter("coust");
		String precision = httpServletRequest.getParameter("precision");
		String rate = httpServletRequest.getParameter("rate");
		String factoryCcode = httpServletRequest.getParameter("factoryCcode");
		String inputDate = httpServletRequest.getParameter("inputdate");
		String PT = httpServletRequest.getParameter("PT");
		String CT = httpServletRequest.getParameter("CT");
		String ifCal = httpServletRequest.getParameter("ifCal");

		LwWholeSaleUserInfoDto user = null;
		BLLwWholeSaleUserInfoAction bllWholeSaleUserInfoAction = new BLLwWholeSaleUserInfoAction();

		if (ammeterNo.equals("") || ammeterNo == null) {

			ammeterNo = "0.1";
		}

		DBManager dbManager = new DBManager();
		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			// 插入记录

			LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = new LwWholeSaleUserInfoDto();
			BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade = new BLLwWholeSaleUserInfoFacade();
			lwWholeSaleUserInfoDto.setUserNo(transformerName);
			lwWholeSaleUserInfoDto.setVoltage(voltage);
			lwWholeSaleUserInfoDto.setCompany(company);
			lwWholeSaleUserInfoDto.setWholesaletype(wholeSaleType);
			lwWholeSaleUserInfoDto.setPhoneNo(phoneNo);
			lwWholeSaleUserInfoDto.setLineCode(lineCode);
			lwWholeSaleUserInfoDto.setIfCal(ifCal);
			user = bllWholeSaleUserInfoAction.findByPrimaryKey(dbManager,
					transformerName);
			if (user != null) {
				throw new UserException(-98, -1101, this.getClass().getName());				
			} 
			bllWholeSaleUserInfoAction.insert(dbManager,
					lwWholeSaleUserInfoDto);
			BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
			LwAmmeterChangeDto lwAmmeterChangeDto = new LwAmmeterChangeDto();
			lwAmmeterChangeDto.setId(new Long(System.currentTimeMillis())
					.toString());
			lwAmmeterChangeDto.setUserNo(transformerName);
			lwAmmeterChangeDto.setAmmeterA(ammeterA);
			lwAmmeterChangeDto.setAmmeterNo(ammeterNo);
			lwAmmeterChangeDto.setAmmeterV(ammeterV);
			lwAmmeterChangeDto.setAmmeterX(ammeterX);
			lwAmmeterChangeDto.setCoust(coust);
			lwAmmeterChangeDto.setFactoryCcode(factoryCcode);
			lwAmmeterChangeDto.setFactoryName(factoryName);
			lwAmmeterChangeDto.setPrecision(precision);
			lwAmmeterChangeDto.setRate(rate);
			lwAmmeterChangeDto.setInstallDate(inputDate);
			lwAmmeterChangeDto.setPt(PT);
			lwAmmeterChangeDto.setCt(CT);
			lwAmmeterChangeDto.setFlag("1");
			new BLLwAmmeterChangeAction().insert(dbManager, lwAmmeterChangeDto);

			dbManager.commitTransaction();
		} catch (Exception exception) {
			dbManager.rollbackTransaction();
			throw exception;
		} finally {
			dbManager.close();
		}
		return actionMapping.findForward("Success");

	}
}
