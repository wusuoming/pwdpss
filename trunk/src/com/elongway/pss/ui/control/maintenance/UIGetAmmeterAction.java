package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.action.domain.BLLwAmmeterAction;
import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.DataUtils;

/**
 * �����Ϣά�� Action <br>
 * ��ѯ
 * 
 * @author ������
 * @version 1.0 2008-10-09
 */
public class UIGetAmmeterAction extends DispatchAction {
	/**
	 * ��ѯ���
	 */
	public ActionForward queryAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {		
				
		// -- ��������
		BLLwAmmeterFacade bLwAmmeterFacade = new BLLwAmmeterFacade();
		String conditions = "";
			
		// -- ��������
		conditions = generateCondition(httpServletRequest,actionForm);
		System.out.println(conditions);
		
		// -- ��ҳ��ѯ
		PageRecord pageRecord = bLwAmmeterFacade.findByConditions(conditions, 0, 0);
		
		httpServletRequest.setAttribute("ammeterList", pageRecord.getResult());
		
		// -- �ɹ���ת
		return (actionMapping.findForward("Success"));
	}
	
	/**
	 * ���ɲ�ѯ����
	 */
	public String generateCondition(HttpServletRequest httpServletRequest,ActionForm actionForm){
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm)actionForm;
		
		// -- ȡ�ñ�
		String ammeterNo = uiGetAmmeterForm.getAmmeterNo();
		
		StringBuffer conditions = new StringBuffer();
		conditions.append(" 1=1 ");
		if (!"".equals(ammeterNo)) {
			conditions.append(" and ").append("ammeterNo = '").append(ammeterNo).append("'");
		}
			
		return conditions.toString();
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
}
