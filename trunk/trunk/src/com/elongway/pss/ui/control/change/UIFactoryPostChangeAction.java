package com.elongway.pss.ui.control.change;

/**
 * ��ҵ����ȷ�� Action <br>
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
import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.dto.custom.ChangeAmmeterDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIFactoryPostChangeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// ��������
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLWUserCustomFacade bllwCustomFacade = new BLLWUserCustomFacade();
		BLLwNewFactoryIndicatorFacade blLwNewFactoryIndicatorFacade = new BLLwNewFactoryIndicatorFacade();
		String forward = null;
		String rate  = null;
		// �����й�����
		double chgWorkQuantity = 0D;
		// �����޹�����
		double chgIdleQuantity = 0D;
		LwAmmeterChangeDto errorAmmeter = null;
		LwAmmeterChangeDto newAmmeter = null;
		
		String userNo = (String)httpServletRequest.getParameter("UserNo");	
		String UserName = (String)httpServletRequest.getParameter("UserName");	
		String useStyle = (String)httpServletRequest.getParameter("useStyle");
		
		String AmmeterNo = (String)httpServletRequest.getParameter("AmmeterNo");
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
		// �ϱ��й�ָ��
		String installWorkNum = httpServletRequest.getParameter("installWorkNum");
		// �ϱ��޹�ָ��
		String installIdleNum = httpServletRequest.getParameter("installIdleNum");
		String installDate = httpServletRequest.getParameter("installDate");

		
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
		String newammeterNo = httpServletRequest.getParameter("newammeterNo");
		String ammeterV = httpServletRequest.getParameter("ammeterV");
		String ammeterA = httpServletRequest.getParameter("ammeterA");
		String ammeterX = httpServletRequest.getParameter("ammeterX");
		String ammeterType = httpServletRequest.getParameter("ammeterType");
		 String factoryCcode = httpServletRequest.getParameter("factoryCcode");
		String factoryName = httpServletRequest.getParameter("factoryName");
		String coust = httpServletRequest.getParameter("coust");
		String precision = httpServletRequest.getParameter("precision");
		rate = httpServletRequest.getParameter("rate");

		
		newAmmeter = new LwAmmeterChangeDto();
		newAmmeter.setUserNo(userNo);
		newAmmeter.setUserName(UserName);
		newAmmeter.setAmmeterA(ammeterA);
		newAmmeter.setAmmeterV(ammeterV);
		newAmmeter.setAmmeterX(ammeterX);
		newAmmeter.setAmmeterNo(newammeterNo);
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
		newAmmeter.setUseStyle(useStyle);
		
		ChangeAmmeterDto changeAmmeterDto = PowerFeeCal.checkChgAmmeter(userNo,AmmeterNo);
		
		// 5-���±���ϱ�ָ����µ����û�������ָ���ֶΡ�		
		LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = blLwNewFactoryIndicatorFacade.findByPrimaryKey(userNo, PowerFeeCal.getCurrentBillMonth(),AmmeterNo);
		LwNewFactoryIndicatorDto newlwNewFactoryIndicatorDto=new LwNewFactoryIndicatorDto();
		// -- ����Ǿ����
		
		newlwNewFactoryIndicatorDto.setLastWorkNum(Integer.parseInt(installWorkNum));
		newlwNewFactoryIndicatorDto.setStatMonth(lwNewFactoryIndicatorDto.getStatMonth());
		
			// ��ҵ�����޹�
		newlwNewFactoryIndicatorDto.setLastIdleNum(Integer.parseInt(installIdleNum));
			// �������
		newlwNewFactoryIndicatorDto.setChgAmmeterQuantity(chgWorkQuantity+changeAmmeterDto.getChgWorkQuantity());
		newlwNewFactoryIndicatorDto.setAmmeterNo(newammeterNo);
		String s=lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity();
		if(lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity().equals("")||lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity()==null){
			s="0";
		}
		newlwNewFactoryIndicatorDto.setUnChgAmmeterQuantity(String.valueOf((chgIdleQuantity+Double.parseDouble(s))));
		newlwNewFactoryIndicatorDto.setRate(Double.parseDouble(rate));
		
		newlwNewFactoryIndicatorDto.setAmmeterStyle(lwNewFactoryIndicatorDto.getAmmeterStyle());
		newlwNewFactoryIndicatorDto.setUserNo(lwNewFactoryIndicatorDto.getUserNo());
		newlwNewFactoryIndicatorDto.setUsername(lwNewFactoryIndicatorDto.getUsername());
		
		bllwCustomFacade.saveWholeChangeAmmeter(errorAmmeter, newAmmeter,lwNewFactoryIndicatorDto,newlwNewFactoryIndicatorDto);		
		forward = "forward";
		return actionMapping.findForward(forward);
	}

	
}
