package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.sinosoft.sysframework.common.util.DataUtils;

/**
 * �����Ϣά�� Action <br>
 * ���ӡ��޸ġ�ɾ��
 * 
 * @author ������
 * @version 1.0 2008-10-07
 */
public class UIPostAmmeterAction extends DispatchAction {
	/**
	 * ���ӵ��
	 */
	public ActionForward addAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {				
		
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm)actionForm;
		String ammeterNo = uiGetAmmeterForm.getAmmeterNo();
		// -- ��������
		BLLwAmmeterFacade bLwAmmeterFacade = new BLLwAmmeterFacade();
		LwAmmeterDto lwAmmeterDto = new LwAmmeterDto();	
		
		// -- ����ת��
		formToDto(httpServletRequest, lwAmmeterDto);
		
		// -- ���Ӳ���
		bLwAmmeterFacade.insert(lwAmmeterDto);
		
		// -- �ɹ���ת
		return (actionMapping.findForward("CreateSuccess"));
	}
	/**
	 * ����UIform ת���� DTO
	 */
	public void formToDto(HttpServletRequest httpServletRequest,LwAmmeterDto lwAmmeterDto){
		String ammeterNo = httpServletRequest.getParameter("ammeterNo");
		String ammeterX = httpServletRequest.getParameter("ammeterX");
		String ammeterV = httpServletRequest.getParameter("ammeterV");
		String ammeterA = httpServletRequest.getParameter("ammeterA");
		String factoryName = httpServletRequest.getParameter("factoryName");
		String ammeterType = httpServletRequest.getParameter("ammeterType");
		String coust = httpServletRequest.getParameter("coust");
		String precision = httpServletRequest.getParameter("precision");
		String rate = httpServletRequest.getParameter("rate");
		String allowDate = httpServletRequest.getParameter("allowDate");
		String validStatus = httpServletRequest.getParameter("validStatus");
		String maxnum = httpServletRequest.getParameter("maxnum");

		lwAmmeterDto.setAmmeterNo(ammeterNo);
		lwAmmeterDto.setAmmeterX(ammeterX);
		lwAmmeterDto.setAmmeterV(ammeterV);
		lwAmmeterDto.setAmmeterA(ammeterA);
		lwAmmeterDto.setFactoryName(factoryName);
		lwAmmeterDto.setAmmeterType(ammeterType);
		lwAmmeterDto.setCoust(coust);
		lwAmmeterDto.setPrecision(precision);
		lwAmmeterDto.setRate(rate);
		lwAmmeterDto.setMaxnum(Integer.parseInt(maxnum));
		lwAmmeterDto.setAllowDate(allowDate);
		lwAmmeterDto.setValidStatus(validStatus);
		
		lwAmmeterDto.setValidStatus(validStatus);
	}
	
	/**
	 * ���Ƶ��������ת
	 */
	public ActionForward forwordAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		
		// -- ȡ�� form
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm) actionForm;
		String firstquery = httpServletRequest.getParameter("firstquery");
		String action = httpServletRequest.getParameter("action");
		
		// -- ��һ�γɹ���ת
		if(firstquery!=null){
			httpServletRequest.setAttribute("firstquery", firstquery);
			return (actionMapping.findForward("firstSuccess"));
		}
		// -- ��ӵ���תҳ��
		if("Create".equals(action)){
			uiGetAmmeterForm.setAction(action);
			httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
			return (actionMapping.findForward("addFirstSuccess"));
		}
		else
			return (actionMapping.findForward("addFirstSuccess"));
	}
	/**
	 * �޸ĵ��
	 */
	public ActionForward updateAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {				
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm)actionForm;
		// -- ��������
		BLLwAmmeterFacade bLwAmmeterFacade = new BLLwAmmeterFacade();
		LwAmmeterDto lwAmmeterDto  = null;
		String forwardStr = "";
		String firstquery = httpServletRequest.getParameter("firstquery");
		String[] checkboxSelect =  httpServletRequest.getParameterValues("checkboxSelect");
		String[] ammeterNo = httpServletRequest.getParameterValues("ammeterNo");
		    // -- �����һ�β�ѯ
		if("1".equals(firstquery)){			
			lwAmmeterDto = bLwAmmeterFacade.findByPrimaryKey(ammeterNo[Integer.parseInt(checkboxSelect[0])]);
			// -- ����ת��
			dtoToForm(lwAmmeterDto, uiGetAmmeterForm);
			// -- ��ת
			forwardStr = "Success";
		}else{
			// -- ���
			String ammeterNo1 = uiGetAmmeterForm.getAmmeterNo();
			// -- �������б�ļ�¼
			lwAmmeterDto = bLwAmmeterFacade.findByPrimaryKey(ammeterNo1);
			// -- ΪDTO��ֵ
			updateOrgDto(uiGetAmmeterForm, lwAmmeterDto);
			// -- ����
			bLwAmmeterFacade.update(lwAmmeterDto);
			System.out.println(ammeterNo1);
			forwardStr = "UpdateSuccess";
		}		
		
		
		// -- �ɹ���ת
		return (actionMapping.findForward(forwardStr));
	}
	
	public void updateOrgDto(UIGetAmmeterForm uiGetAmmeterForm,LwAmmeterDto lwAmmeterDto){
		// ���
		String ammeterNo1 = uiGetAmmeterForm.getAmmeterNo();
		String ammeterX = uiGetAmmeterForm.getAmmeterX();
		String ammeterV = uiGetAmmeterForm.getAmmeterV();
		String ammeterA = uiGetAmmeterForm.getAmmeterA();
		String factoryName = uiGetAmmeterForm.getFactoryName();
		String coust = uiGetAmmeterForm.getCoust();
		String precision = uiGetAmmeterForm.getPrecision();
		String rate = uiGetAmmeterForm.getRate();
		int maxnum = uiGetAmmeterForm.getMaxnum();
		String allowDate = uiGetAmmeterForm.getAllowDate();
		String validStatus = uiGetAmmeterForm.getValidStatus();
		
		lwAmmeterDto.setAmmeterNo(ammeterNo1);
		lwAmmeterDto.setAmmeterX(ammeterX);
		lwAmmeterDto.setAmmeterV(ammeterV);
		lwAmmeterDto.setAmmeterA(ammeterA);
		lwAmmeterDto.setFactoryName(factoryName);
		lwAmmeterDto.setCoust(coust);
		lwAmmeterDto.setPrecision(precision);
		lwAmmeterDto.setRate(rate);
		lwAmmeterDto.setMaxnum(maxnum);
		lwAmmeterDto.setAllowDate(allowDate);
		lwAmmeterDto.setValidStatus(validStatus);
	}
	/**
	 * ���� DTO ת���� form
	 */
	public void dtoToForm(LwAmmeterDto lwAmmeterDto,UIGetAmmeterForm uiGetAmmeterForm){
		DataUtils.copySimpleObject(uiGetAmmeterForm,lwAmmeterDto );
	}
	/**
	 * ɾ�������Ϣ
	 * 
	 */
	public ActionForward deleteAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {		
		// -- ȡ�� form
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm) actionForm;
		String action = httpServletRequest.getParameter("action");
		BLLwAmmeterFacade bLwAmmeterFacade = new BLLwAmmeterFacade();
		
		// -- ��һ�γɹ���ת
		if("many".equals(action)){
			
			// -- ȡ��ɾ���ĵ�����
			String[] checkboxSelect =  httpServletRequest.getParameterValues("checkboxSelect");
			String[] ammeterNo = httpServletRequest.getParameterValues("ammeterNo");
			for (int i = 0; i < checkboxSelect.length; i++) {
				// -- ����ɾ��
				bLwAmmeterFacade.delete(ammeterNo[Integer.parseInt(checkboxSelect[i])]);
			}			
			return (actionMapping.findForward("manySuccess"));
		}		
		else{
			// -- ���
			String ammeterNo1 = uiGetAmmeterForm.getAmmeterNo();
			// -- ����ɾ��
			bLwAmmeterFacade.delete(ammeterNo1);
			return (actionMapping.findForward("oneSuccess"));
		}
	}
}
