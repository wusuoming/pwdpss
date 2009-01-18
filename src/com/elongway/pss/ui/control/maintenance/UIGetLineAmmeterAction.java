package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.action.domain.BLLwAmmeterAction;
import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.elongway.pss.ui.view.maintenance.UILineAmmeterForm;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.DataUtils;

/**
 * ��·���������Ϣά�� Action <br>
 * 
 * @author ������
 * @version 1.0 2008-10-14
 */
public class UIGetLineAmmeterAction extends DispatchAction {
	/**
	 * ��ѯ���
	 */
	public ActionForward queryLineAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {		
				
		// -- ��������
		BLLwLineAmmeterFacade bLwLineAmmeterFacade =  new BLLwLineAmmeterFacade();
		String conditions = "";
			
		// -- ��������
		conditions = generateCondition(httpServletRequest,actionForm);
		System.out.println(conditions);
		
		// -- ��ҳ��ѯ
		PageRecord pageRecord = bLwLineAmmeterFacade.findByConditions(conditions, 0, 0);
		
		httpServletRequest.setAttribute("lineAmmeterList", pageRecord.getResult());
		
		// -- �ɹ���ת
		return (actionMapping.findForward("Success"));
	}
	
	/**
	 * ���ɲ�ѯ����
	 */
	public String generateCondition(HttpServletRequest httpServletRequest,ActionForm actionForm){
		UILineAmmeterForm uiLineAmmeterForm = (UILineAmmeterForm)actionForm;
		
		// -- ȡ�ñ�
		String ammeterNo = uiLineAmmeterForm.getAmmeterNo();
		String lineCode = uiLineAmmeterForm.getLineCode();
		
		StringBuffer conditions = new StringBuffer();
		conditions.append(" 1=1 ");
		if (!"".equals(ammeterNo)) {
			conditions.append(" and ").append("ammeterNo = '").append(ammeterNo).append("'");
		}
		if (!"".equals(lineCode)) {
			conditions.append(" and ").append("lineCode = '").append(lineCode).append("'");
		}
		
		return conditions.toString();
	}
	
	/**
	 * ������·������ù������ת
	 */
	public ActionForward forwordLineAmmeter(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		
		// -- ȡ�� form
		UILineAmmeterForm uiLineAmmeterForm = (UILineAmmeterForm) actionForm;
		String firstquery = httpServletRequest.getParameter("firstquery");
		String action = httpServletRequest.getParameter("action");
		
		// -- ��һ�γɹ���ת
		if(firstquery!=null){
			
			return (actionMapping.findForward("firstSuccess"));
		}
		// -- ��ӵ���תҳ��
		if("Create".equals(action)){
			uiLineAmmeterForm.setAction(action);
			httpServletRequest.setAttribute("uiLineAmmeterForm", uiLineAmmeterForm);
			return (actionMapping.findForward("addFirstSuccess"));
		}
		else
			return (actionMapping.findForward("addFirstSuccess"));
	}
}
