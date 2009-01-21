package com.elongway.pss.ui.control.change;

/**
 * ����ȷ�� Action <br>
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
import com.elongway.pss.dto.custom.ChangeAmmeterDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIPostChangeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// ��������
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLWUserCustomFacade bllwCustomFacade = new BLLWUserCustomFacade();
		BLLwTownIndicatorFacade blLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		String forward = null;
		LwAmmeterChangeDto errorAmmeter = null;
		LwAmmeterChangeDto newAmmeter = null;
		
		String userNo = (String)httpServletRequest.getParameter("userNo");	
		String userName = (String)httpServletRequest.getParameter("userName");	
		
		// 1-�õ����ϵ������
		String []id = httpServletRequest.getParameterValues("id");
		if(id == null){
		 throw new UserException(-6,-703,this.getClass().getName(),"���û���û�����õ��");
		}
		// �����й�ָ��
		String errorWorkNum = (String)httpServletRequest.getParameter("errorWorkNum");
		// �����޹�ָ��
	//	String errorIdleNum = (String)httpServletRequest.getParameter("errorIdleNum");	
		// �����й�ָ��
		String lastWorkNum = (String)httpServletRequest.getParameter("lastWorkNum");
		// �����й�����
		String chgWorkNum = (String)httpServletRequest.getParameter("chgWorkNum");	
		
		// 2-���ҵ����Ϣ
		
		int count = id.length;
		// -- ȡ�ù��ϵ��
		errorAmmeter = blLwAmmeterChangeFacade.findByPrimaryKey(id[count-1]);
		
		// 3-���¹����й�ָ�롢�����й�ָ�롢������������ѵ��״̬����Ϊ����ʹ��״̬��
		errorAmmeter.setErrorWorkNum(Double.parseDouble(errorWorkNum));
	//	errorAmmeter.setErrorIdleNum(Double.parseDouble(errorIdleNum));
		errorAmmeter.setFlag(AppConst.NOTUSE_AMMETER_FLAG);
		errorAmmeter.setLastWorkNum(Double.parseDouble(lastWorkNum));
		errorAmmeter.setChgWorkNum(Double.parseDouble(chgWorkNum));
		
		// 4-�õ��±���Ϣ
		String ammeterNo = httpServletRequest.getParameter("ammeterNo");
		String ammeterV = httpServletRequest.getParameter("ammeterV");
		String ammeterA = httpServletRequest.getParameter("ammeterA");
		String ammeterX = httpServletRequest.getParameter("ammeterX");
		String ammeterType = httpServletRequest.getParameter("ammeterType");
		String factoryName = httpServletRequest.getParameter("factoryName");
		String coust = httpServletRequest.getParameter("coust");
		String precision = httpServletRequest.getParameter("precision");
		String rate = httpServletRequest.getParameter("rate");
		String installWorkNum = httpServletRequest.getParameter("installWorkNum");
		String installIdleNum = httpServletRequest.getParameter("installIdleNum");
		String installDate = httpServletRequest.getParameter("installDate");
		
		newAmmeter = new LwAmmeterChangeDto();
		newAmmeter.setUserNo(userNo);
		newAmmeter.setUserName(userName);
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
//		newAmmeter.setInstallIdleNum(Double.parseDouble(installIdleNum));
		newAmmeter.setInstallWorkNum(Double.parseDouble(installWorkNum));
		
		ChangeAmmeterDto changeAmmeterDto = PowerFeeCal.checkChgAmmeter(userNo);
		
		// 5-���±���ϱ�ָ����µ����û�������ָ���ֶΡ�		
		LwTownIndicatorDto lwTownIndicatorDto = blLwTownIndicatorFacade.findByPrimaryKey(userNo, PowerFeeCal.getCurrentBillMonth());
		lwTownIndicatorDto.setLastWorkNum(Double.parseDouble(installWorkNum));
		lwTownIndicatorDto.setThisWorkNum(Double.parseDouble(installWorkNum));
		
		double chgWorkQuantity = changeAmmeterDto.getChgWorkQuantity();

		lwTownIndicatorDto.setChgAmmeterQuantity(Double.parseDouble(chgWorkNum)+changeAmmeterDto.getChgWorkQuantity());

		lwTownIndicatorDto.setRate(Double.parseDouble(rate));

		bllwCustomFacade.saveTownChangeAmmeter(errorAmmeter, newAmmeter,lwTownIndicatorDto);
		
		forward = "forward";
		return actionMapping.findForward(forward);
	}

	
}
