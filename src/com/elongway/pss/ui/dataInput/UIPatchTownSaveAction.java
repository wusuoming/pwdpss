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
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;


/**
 * ֱ��������� Action <br>
 * ���㡢����
 * 
 * @author ������ add
 * @version 1.0 2008-10-16
 */
public class UIPatchTownSaveAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		
		
		BLLwTownIndicatorFacade bLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		LwTownIndicatorDto lwTownIndicatorDto = null;
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLCalPowerFeeCustomFacade bllwCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		Collection collection = new ArrayList();
		LwPowerUserDto lwPowerUserDto = null;
		String voltLevel = null;
		Collection priceList = null;
		/***********************************************************************
		 *    ��1 -- ȡ�ñ���ֵ��
		 **********************************************************************/
		// �õ��û�
		String []userNo = httpServletRequest.getParameterValues("userNo");
		// ��·����
		String []lineCode = httpServletRequest.getParameterValues("lineCode");		
		// �����й�ָ��
		String []thisWorkNum = httpServletRequest.getParameterValues("thisWorkNum");		
		// �����й�ָ��
		String []lastWorkNum = httpServletRequest.getParameterValues("lastWorkNum");	
		// ����
		String []rate = httpServletRequest.getParameterValues("rate");
		// ��������
		String []readQuantity = httpServletRequest.getParameterValues("readQuantity");
		// �������
		String []tranferLoss = httpServletRequest.getParameterValues("tranferLossQuantity");
		// �������
		String []chgAmmeterQuantity = httpServletRequest.getParameterValues("chgAmmeterQuantity");
		// �ܵ���
		String []excepQuantity = httpServletRequest.getParameterValues("excepQuantity");
		// �˲�����
		String []compensateQuantity = httpServletRequest.getParameterValues("compensateQuantity");
		// ��������
		String statMonth = httpServletRequest.getParameter("statMonth");
		// ¼������
		String readDate = httpServletRequest.getParameter("readDate");
		LwAmmeterChangeDto dto =  null;	
		if (userNo!=null) {
			for (int i = 0; i < userNo.length; i++) {
				lwTownIndicatorDto = bLwTownIndicatorFacade.findByPrimaryKey(userNo[i], statMonth);
				Collection ammeterList = blLwAmmeterChangeFacade.findByConditions(" userNo = '"+userNo[i]+"' and flag = '"+AppConst.CURRENT_AMMETER_FLAG+"'");
				if(ammeterList==null||ammeterList.size()==0){
					throw new UserException(-6,-703,this.getClass().getName());
				}
				Iterator iterator = ammeterList.iterator();
				if(iterator.hasNext())
				{
					dto = (LwAmmeterChangeDto)iterator.next();
				}
				dto.setRate(rate[i]);
				// ���µ��ı���
				blLwAmmeterChangeFacade.update(dto);
				lwPowerUserDto = blLwPowerUserFacade.findByPrimaryKey(userNo[i]);
				voltLevel = lwPowerUserDto.getSaleVoltLevel();
				// �õ����
				priceList = bllwCalPowerFeeCustomFacade.getTownPrice(voltLevel);
				// ��֯���
				bllwCalPowerFeeCustomFacade.orgTownIndicatorPrice(priceList, lwTownIndicatorDto);
				lwTownIndicatorDto.setThisWorkNum(Double.parseDouble(thisWorkNum[i]));
				lwTownIndicatorDto.setLastWorkNum(Double.parseDouble(lastWorkNum[i]));
				lwTownIndicatorDto.setRate(Double.parseDouble(rate[i]));
				lwTownIndicatorDto.setTranferLossQuantity(Long.parseLong(tranferLoss[i]));
				lwTownIndicatorDto.setReadQuantity(Double.parseDouble(readQuantity[i]));
				lwTownIndicatorDto.setExcepQuantity(Double.parseDouble(excepQuantity[i]));
				lwTownIndicatorDto.setChgAmmeterQuantity(Double.parseDouble(chgAmmeterQuantity[i]));
				lwTownIndicatorDto.setCompensateQuantity(Double.parseDouble(compensateQuantity[i]));
				lwTownIndicatorDto.setInputDate(new DateTime(new java.util.Date(),DateTime.YEAR_TO_DAY).toString());
				lwTownIndicatorDto.setReadDate(readDate);
				bLwTownIndicatorFacade.update(lwTownIndicatorDto);
			}
		}
		// ��������
		//bLwTownIndicatorFacade.insertAll(collection);		
		return actionMapping.findForward("Success");
	}
	
}
