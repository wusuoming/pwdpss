package com.elongway.pss.ui.control.change;

/**
 * ���ۻ���ȷ�� Action <br>
 * 
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-11-07
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLWUserCustomFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.dto.custom.ChangeAmmeterDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIWholePostChangeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// ��������
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLWUserCustomFacade bllwCustomFacade = new BLLWUserCustomFacade();
		BLLwWholeSaleIndicatorFacade blLwWholeSaleIndicatorFacade = new BLLwWholeSaleIndicatorFacade();
		String forward = null;
		String rate  = null;
		// �����й�����
		double chgWorkQuantity = 0D;
		// �����޹�����
		double chgIdleQuantity = 0D;
		LwAmmeterChangeDto errorAmmeter = null;
		LwAmmeterChangeDto newAmmeter = null;
		
		String transformerName = (String)httpServletRequest.getParameter("transformerName");	
		
		// 1-�õ����ϵ������
		String []id = httpServletRequest.getParameterValues("id");
		if(id == null){
		 throw new UserException(-6,-703,this.getClass().getName(),"���û���û�����õ��");
		}
		// �����й�ָ��
		String errorWorkNum = (String)httpServletRequest.getParameter("errorWorkNum");
		// �����޹�ָ��
		String errorIdleNum = (String)httpServletRequest.getParameter("errorIdleNum");	
		// �����й�ָ��
		String lastWorkNum = (String)httpServletRequest.getParameter("lastWorkNum");
		// �����޹�ָ��
		String lastIdleNum = (String)httpServletRequest.getParameter("lastIdleNum"); 

		
		// 2-���ҵ����Ϣ
		
		int count = id.length;
		// -- ȡ�ù��ϵ��
		errorAmmeter = blLwAmmeterChangeFacade.findByPrimaryKey(id[count-1]);
		rate  = errorAmmeter.getRate();
		// -- �����й�����
		chgWorkQuantity = (Double.parseDouble(errorWorkNum) - Double.parseDouble(lastWorkNum))*Double.parseDouble(rate);
		// -- �����޹�����
		chgIdleQuantity = (Double.parseDouble(errorIdleNum) - Double.parseDouble(lastIdleNum))*Double.parseDouble(rate);
		
		// 3-���¹����й�ָ�롢�����޹��������й�ָ�롢�����޹�ָ�롢�����й������������޹����������ѵ��״̬����Ϊ����ʹ��״̬��
		errorAmmeter.setErrorWorkNum(Double.parseDouble(errorWorkNum));
		errorAmmeter.setErrorIdleNum(Double.parseDouble(errorIdleNum));
		errorAmmeter.setFlag(AppConst.NOTUSE_AMMETER_FLAG);
		errorAmmeter.setLastWorkNum(Double.parseDouble(lastWorkNum));
		errorAmmeter.setLastIdleNum(Double.parseDouble(lastIdleNum));
		errorAmmeter.setChgWorkNum(chgWorkQuantity);
		errorAmmeter.setChgIdleQuantity(chgIdleQuantity);
		
		// 4-�õ��±���Ϣ
		String ammeterNo = httpServletRequest.getParameter("ammeterNo");
		String ammeterV = httpServletRequest.getParameter("ammeterV");
		String ammeterA = httpServletRequest.getParameter("ammeterA");
		String ammeterX = httpServletRequest.getParameter("ammeterX");
		String ammeterType = httpServletRequest.getParameter("ammeterType");
		String factoryName = httpServletRequest.getParameter("factoryName");
		String coust = httpServletRequest.getParameter("coust");
		String precision = httpServletRequest.getParameter("precision");
		rate = httpServletRequest.getParameter("rate");
		String installWorkNum = httpServletRequest.getParameter("installWorkNum");
		String installIdleNum = httpServletRequest.getParameter("installIdleNum");
		String installDate = httpServletRequest.getParameter("installDate");
		
		newAmmeter = new LwAmmeterChangeDto();
		newAmmeter.setUserNo(transformerName);
		newAmmeter.setUserName(transformerName);
		newAmmeter.setAmmeterA(ammeterA);
		newAmmeter.setAmmeterV(ammeterV);
		newAmmeter.setAmmeterX(ammeterX);
		newAmmeter.setAmmeterNo(ammeterNo);
		newAmmeter.setAmmeterType(ammeterType);
		newAmmeter.setCoust(coust);
		newAmmeter.setFactoryName(factoryName);
		newAmmeter.setPrecision(precision);
		newAmmeter.setRate(rate);
		newAmmeter.setId(new Long(System.currentTimeMillis()).toString());
		newAmmeter.setFlag(AppConst.CURRENT_AMMETER_FLAG);
		newAmmeter.setInstallDate(installDate);
		newAmmeter.setInstallIdleNum(Double.parseDouble(installIdleNum));
		newAmmeter.setInstallWorkNum(Double.parseDouble(installWorkNum));
		
		ChangeAmmeterDto changeAmmeterDto = PowerFeeCal.checkChgAmmeter(transformerName);
		
		// 5-���±���ϱ�ָ����µ����û�������ָ���ֶΡ�		
		LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = blLwWholeSaleIndicatorFacade.findByPrimaryKey(transformerName, PowerFeeCal.getCurrentBillMonth());
		lwWholeSaleIndicatorDto.setLastWorkNum(Double.parseDouble(installWorkNum));
		lwWholeSaleIndicatorDto.setThisWorkNum(Double.parseDouble(installWorkNum));
		lwWholeSaleIndicatorDto.setLastIdleNum(Double.parseDouble(installIdleNum));


		// -- �������й��������޹�������������ָ���
		lwWholeSaleIndicatorDto.setChgAmmeterQuantity(chgWorkQuantity+lwWholeSaleIndicatorDto.getChgAmmeterQuantity());
		lwWholeSaleIndicatorDto.setUnChgAmmeterQuantity(chgIdleQuantity+lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity());
		
		lwWholeSaleIndicatorDto.setRate(Double.parseDouble(rate));

		bllwCustomFacade.saveWholeChangeAmmeter(errorAmmeter, newAmmeter,lwWholeSaleIndicatorDto);
		
		forward = "forward";
		return actionMapping.findForward(forward);
	}

	
}
