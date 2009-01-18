package com.elongway.pss.ui.dataInput;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.dto.domain.LwindicatorDto;
import com.elongway.pss.ui.view.datainput.UITownCalForm;


/**
 * ֱ�������������� Action <br>
 * ���㡢����
 * 
 * @author ������ add
 * @version 1.0 2008-10-25
 */
public class UIPostTownCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		

		/***********************************************************************
		 *    ��0 -- ����������
		 **********************************************************************/
		UITownCalForm uiTownCalForm = new UITownCalForm();
		BLLwTownPriceSummaryFacade bLwTownPriceSummaryFacade  = new BLLwTownPriceSummaryFacade();
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwindicatorFacade bLwindicatorFacade = new BLLwindicatorFacade();
		LwindicatorDto lwindicatorDto = new LwindicatorDto();
		BLLwLineAmmeterFacade blLwLineAmmeterFacade = new BLLwLineAmmeterFacade();
		/***********************************************************************
		 *    ��1 -- ȡ�ñ���ֵ��
		 **********************************************************************/
		// �õ��û�
		String userNo = httpServletRequest.getParameter("userNo");
		// ��·����
		String lineCode = httpServletRequest.getParameter("lineCode");
		// �й�ָ��
		String thisWorkNum = httpServletRequest.getParameter("thisWorkNum");
		// �޹�ָ��
		String thisIdleNum = httpServletRequest.getParameter("thisIdleNum");
		// ¼������
		String inputDate = httpServletRequest.getParameter("inputDate");
		// ��һ�β�ѯ
		String firstquery = httpServletRequest.getParameter("firstquery");
		// ����
		String rate = httpServletRequest.getParameter("rate");
		
		if (thisIdleNum == null||"".equals(thisIdleNum)) {
			thisIdleNum = "0";
		}
		/***********************************************************************
		 *    ��2 -- �����ѡ�
		 **********************************************************************/
		// ������
//		LwTownPriceSummaryDto lwTownPriceSummaryDto = blCalPowerFeeCustomFacade.calTownFee(thisWorkNum, thisIdleNum, lineCode, userNo, inputDate);
		
		/***********************************************************************
		 *    ��3 -- ���桿
		 **********************************************************************/
//		Collection collection = blLwLineAmmeterFacade.findByConditions(" lineCode = '"+lineCode+"' and validstatus = '1'");
//		LwLineAmmeterDto lwLineAmmeterDto = null;
//		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
//			lwLineAmmeterDto = (LwLineAmmeterDto) iterator.next();			
//		}
//		String ammeterNo = lwLineAmmeterDto.getAmmeterNo();
		
		
		// ���浱���й�ָ����
//		lwindicatorDto.setAmmeterNo(ammeterNo);
//		lwindicatorDto.setInputDate(inputDate);
//		lwindicatorDto.setLineCode(lineCode);
//		lwindicatorDto.setRate(Double.parseDouble(rate));
//		lwindicatorDto.setStatMonth(inputDate);
//		lwindicatorDto.setThisIdleNum(Integer.parseInt(thisIdleNum));
//		
//		bLwindicatorFacade.insert(lwindicatorDto);
		// �����ظ����㣬��ɾ�������
//		bLwTownPriceSummaryFacade.deleteAndInsert(lwTownPriceSummaryDto);
//		
//		/***********************************************************************
//		 *    ��4 -- Ϊҳ��չ�ָ�ֵ��
//		 **********************************************************************/
//		uiTownCalForm.setUserNo(userNo);
//		uiTownCalForm.setLineCode(lineCode);
//		uiTownCalForm.setThisWorkNum(thisWorkNum);
//		uiTownCalForm.setThisIdleNum(thisIdleNum);
//		uiTownCalForm.setInputDate(inputDate);
//		
//		httpServletRequest.setAttribute("lwTownPriceSummaryDto", lwTownPriceSummaryDto);
//		httpServletRequest.setAttribute("uiTownCalForm", uiTownCalForm);
		return actionMapping.findForward("Success");
	}
	
}
