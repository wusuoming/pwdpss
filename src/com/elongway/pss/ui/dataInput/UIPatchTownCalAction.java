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
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwBookUserFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;


/**
 * ֱ��������� Action <br>
 * ���㡢����
 * 
 * @author ������ add
 * @version 1.0 2008-10-16
 */
public class UIPatchTownCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		

		/***********************************************************************
		 *    ��0 -- ����������
		 **********************************************************************/
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwTownPriceSummaryFacade bLwTownPriceSummaryFacade = new BLLwTownPriceSummaryFacade();
		BLLwTownIndicatorFacade blLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		String inputDate  = new DateTime(new java.util.Date(),
				DateTime.YEAR_TO_MINUTE).toString();
		
		LwTownPriceSummaryDto lwTownPriceSummaryDto = null;
		Collection <LwTownPriceSummaryDto>patchFee = new ArrayList<LwTownPriceSummaryDto>();
		Collection<LwTownIndicatorDto> collection = null;
		BLLwBookUserFacade blLwBookUserFacade = new BLLwBookUserFacade();
		LwAmmeterChangeDto lwAmmeterChangeDto = null;
		LwPowerUserDto lwPowerUserDto = null;
		String bookNo = null;
		Collection changeList = null;
		double jijin = 0;
		double sanxia= 0;
		double dianjin = 0;
		double allFee = 0;
		
		bookNo = httpServletRequest.getParameter("bookNo");

		/***********************************************************************
		 *    ��1 -- ȡ��ָ����е�ֵ��
		 **********************************************************************/
		Collection<LwBookUserDto> bookUserList = blLwBookUserFacade
				.findByConditions(" bookNo = '" + bookNo
						+ "' order by serialNo asc");
		String condition = PowerFeeCal.getBookNoCondition(bookUserList);
		collection = blLwTownIndicatorFacade
				.findByConditions(" 1=1 " + condition);
		if(collection!=null){
		/***********************************************************************
		 *    ��2 -- �����ѡ�
		 **********************************************************************/

		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwTownIndicatorDto dto = (LwTownIndicatorDto) iterator
					.next();	
			// ������
			lwTownPriceSummaryDto = blCalPowerFeeCustomFacade.calTownFee(dto);
			lwPowerUserDto = blLwPowerUserFacade.findByPrimaryKey(dto.getUserNo());
			lwTownPriceSummaryDto.setUserName(lwPowerUserDto.getUserName());
			lwTownPriceSummaryDto.setAddress(lwPowerUserDto.getAddress());
			changeList = blLwAmmeterChangeFacade.findByConditions(" userNo = '"+dto.getUserNo()+"' and flag = '1'");
			if(changeList!=null&changeList.size()!=0){
				Iterator it =  changeList.iterator();
				lwAmmeterChangeDto = (LwAmmeterChangeDto)it.next();
				lwTownPriceSummaryDto.setAmmeterNo(lwAmmeterChangeDto.getAmmeterNo());
			}
			// �趨����ʱ��
			lwTownPriceSummaryDto.setInputDate(inputDate);
			patchFee.add(lwTownPriceSummaryDto);
			jijin +=lwTownPriceSummaryDto.getSumJiJin();
			sanxia += lwTownPriceSummaryDto.getSumSanXia();
			dianjin += lwTownPriceSummaryDto.getSumDianJin();
			allFee+=lwTownPriceSummaryDto.getElectricFee();
		}		
		/***********************************************************************
		 *    ��3 -- ���桿
		 **********************************************************************/
		// �����ظ����㣬��ɾ�������
		for (Iterator iterator = patchFee.iterator(); iterator.hasNext();) {
			 lwTownPriceSummaryDto = (LwTownPriceSummaryDto) iterator
					.next();
			 bLwTownPriceSummaryFacade.deleteAndInsert(lwTownPriceSummaryDto);
		}
		}
		else{
			throw new UserException(-6, -702, this.getClass().getName(), "��û�н��������ݳ�ʼ����");
		}		
		httpServletRequest.setAttribute("patchFee", patchFee);
		return actionMapping.findForward("Success");
	}
	
}
