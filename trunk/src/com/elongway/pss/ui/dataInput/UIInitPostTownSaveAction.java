package com.elongway.pss.ui.dataInput;

import java.util.ArrayList;
import java.util.Collection;
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
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.ui.view.datainput.UITownCalForm;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.DataUtils;

/**
 * ֱ�������ݳ�ʼ������ Action <br>
 * ���㡢����
 * 
 * @author ������ add
 * @version 1.0 2008-11-05
 */
public class UIInitPostTownSaveAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		// ��������
		LwTownIndicatorDto lwTownIndicatorDto = null;
		LwPowerUserDto lwPowerUserDto =  null;
		Collection<LwTownIndicatorDto> indicatorList = new ArrayList<LwTownIndicatorDto>();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLCalPowerFeeCustomFacade bllwCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		String voltLevel = null;
		Collection<LwSalePriceDto>priceList = null;
		
		String forward = null;
		// ��ñ���ֵ
		String []thisWorkNum = httpServletRequest.getParameterValues("thisWorkNum");
		String []lastWorkNum = httpServletRequest.getParameterValues("lastWorkNum");
		String []rate = httpServletRequest.getParameterValues("rate");
		
		String []userNo = httpServletRequest.getParameterValues("userNo");
		String statMonth = PowerFeeCal.getCurrentBillMonth();
		// ���ָ��DTO
		for (int i = 0; i < userNo.length; i++) {
			lwTownIndicatorDto = new LwTownIndicatorDto();
			lwTownIndicatorDto.setUserNo(userNo[i]);
			lwPowerUserDto = blLwPowerUserFacade.findByPrimaryKey(userNo[i]);
			voltLevel = lwPowerUserDto.getSaleVoltLevel();
			// �õ����
			//priceList = bllwCalPowerFeeCustomFacade.getPrice(voltLevel);
			lwTownIndicatorDto.setThisWorkNum(Double.parseDouble(thisWorkNum[i]));
			lwTownIndicatorDto.setLastWorkNum(lastWorkNum==null||"".equals(lastWorkNum)?0.0:Double.parseDouble(lastWorkNum[i]));
			lwTownIndicatorDto.setRate(Double.parseDouble(rate[i]));
			lwTownIndicatorDto.setReadQuantity(0);
			lwTownIndicatorDto.setChgAmmeterQuantity(0);
			lwTownIndicatorDto.setCompensateQuantity(0);
			lwTownIndicatorDto.setExcepQuantity(0);
			// ��ѹ
			lwTownIndicatorDto.setVoltlevel(Integer.parseInt(voltLevel));
			lwTownIndicatorDto.setStatMonth(statMonth);
			// ��֯���
			//bllwCalPowerFeeCustomFacade.orgTownIndicatorPrice(priceList, lwTownIndicatorDto);
			// �û���
			lwTownIndicatorDto.setUserName(lwPowerUserDto.getUserName());
			// ��ַ
			lwTownIndicatorDto.setAddress(lwPowerUserDto.getAddress());
			indicatorList.add(lwTownIndicatorDto);
		}
		// ��������
		new BLLwTownIndicatorFacade().insertAll(indicatorList);
		forward = "success";
		return actionMapping.findForward(forward);
	}

}
