package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.elongway.pss.ui.view.maintenance.UILineAmmeterForm;
import com.sinosoft.sysframework.common.util.DataUtils;

/**
 * ��·�����Ϣά�� Action <br>
 * ���ӡ��޸ġ�ɾ��
 * 
 * @author ������
 * @version 1.0 2008-10-07
 */
public class UIPostLineAmmeterAction extends DispatchAction {
	/**
	 * ���ӵ��
	 */
	public ActionForward addLineAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {				
		
		UILineAmmeterForm uiLineAmmeterForm = (UILineAmmeterForm)actionForm;
		String ammeterNo = uiLineAmmeterForm.getAmmeterNo();
		// -- ��������
		BLLwLineAmmeterFacade bLwLineAmmeterFacade = new BLLwLineAmmeterFacade();
		LwLineAmmeterDto lwLineAmmeterDto = new LwLineAmmeterDto();
		
		// -- ����ת��
		formToDto(httpServletRequest, lwLineAmmeterDto);
		
		// -- ���Ӳ���
		bLwLineAmmeterFacade.insert(lwLineAmmeterDto);
		
		// -- �ɹ���ת
		return (actionMapping.findForward("Success"));
	}
	/**
	 * ����UIform ת���� DTO
	 */
	public void formToDto(HttpServletRequest httpServletRequest,LwLineAmmeterDto lwLineAmmeterDto){
		String ammeterNo = httpServletRequest.getParameter("ammeterNo");
		String lineCode = httpServletRequest.getParameter("lineCode");
		String validStatus = httpServletRequest.getParameter("validStatus");
		
		lwLineAmmeterDto.setAmmeterNo(ammeterNo);
		lwLineAmmeterDto.setLineCode(lineCode);
		lwLineAmmeterDto.setValidStatus(validStatus);
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
	public ActionForward updateLineAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {				
		UILineAmmeterForm uiLineAmmeterForm = (UILineAmmeterForm)actionForm;
		// -- ��������
		BLLwLineAmmeterFacade blLwLineAmmeterFacade = new BLLwLineAmmeterFacade();
		LwLineAmmeterDto lwLineAmmeterDto  = null;
		String forwardStr = "";
		// -- ��һ�β�ѯ
		String firstquery = httpServletRequest.getParameter("firstquery");
		// -- ��ѡ��
		String[] checkboxSelect =  httpServletRequest.getParameterValues("checkboxSelect");
		// -- ���
		String[] ammeterNo = httpServletRequest.getParameterValues("ammeterNo");
		// -- ��·����
		String[] lineCode = httpServletRequest.getParameterValues("lineCode");
		    // -- �����һ�β�ѯ
		if("1".equals(firstquery)){			
			lwLineAmmeterDto = blLwLineAmmeterFacade.findByPrimaryKey(lineCode[Integer.parseInt(checkboxSelect[0])],ammeterNo[Integer.parseInt(checkboxSelect[0])]);
			// -- ����ת��
			dtoToForm(lwLineAmmeterDto, uiLineAmmeterForm);
			// -- ��ת
			forwardStr = "Success";
		}else{
			// -- ���
			String ammeterNo1 = uiLineAmmeterForm.getAmmeterNo();
			String lineCode1 = uiLineAmmeterForm.getLineCode();
			// -- �������б�ļ�¼
			lwLineAmmeterDto = blLwLineAmmeterFacade.findByPrimaryKey(lineCode1, ammeterNo1);
			// -- ΪDTO��ֵ
			updateOrgDto(uiLineAmmeterForm, lwLineAmmeterDto);
			// -- ����
			blLwLineAmmeterFacade.update(lwLineAmmeterDto);
			forwardStr = "UpdateSuccess";
		}		
		
		// -- �ɹ���ת
		return (actionMapping.findForward(forwardStr));
	}
	
	public void updateOrgDto(UILineAmmeterForm uiLineAmmeterForm,LwLineAmmeterDto lwLineAmmeterDto){

		// �Ƿ���Ч
		String validStatus = uiLineAmmeterForm.getValidStatus();
		
		lwLineAmmeterDto.setValidStatus(validStatus);
	}
	/**
	 * ��·������õ� DTO ת���� form
	 */
	public void dtoToForm(LwLineAmmeterDto lwLineAmmeterDto,UILineAmmeterForm uiLineAmmeterForm){
		DataUtils.copySimpleObject(uiLineAmmeterForm,lwLineAmmeterDto );
	}
	/**
	 * ɾ�������Ϣ
	 * 
	 */
	public ActionForward deleteLineAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {		
		// -- ȡ�� form
		UILineAmmeterForm uiLineAmmeterForm = (UILineAmmeterForm)actionForm;
		// -- ��������
		BLLwLineAmmeterFacade blLwLineAmmeterFacade = new BLLwLineAmmeterFacade();
		String action = httpServletRequest.getParameter("action");
		
		// -- ��һ�γɹ���ת
		if("many".equals(action)){
			
			// -- ȡ��ɾ���ĵ�����
			String[] checkboxSelect =  httpServletRequest.getParameterValues("checkboxSelect");
			String[] ammeterNo = httpServletRequest.getParameterValues("ammeterNo");
			String[] lineCode = httpServletRequest.getParameterValues("lineCode");
			for (int i = 0; i < checkboxSelect.length; i++) {
				// -- ����ɾ��
				blLwLineAmmeterFacade.delete(lineCode[Integer.parseInt(checkboxSelect[i])],ammeterNo[Integer.parseInt(checkboxSelect[i])]);
			}			
			return (actionMapping.findForward("manySuccess"));
		}		
		else{
			// -- ���
			String ammeterNo = uiLineAmmeterForm.getAmmeterNo();
			String lineCode = uiLineAmmeterForm.getLineCode();
			// -- ����ɾ��
			blLwLineAmmeterFacade.delete(lineCode, ammeterNo);
			return (actionMapping.findForward("oneSuccess"));
		}
	}
}
