package com.elongway.pss.ui.control.maintenance;
/**
 *��·��Ϣά�� Action <br>
 * ɾ��
 * 
 * @author ���ټ�
 * @version 1.0 2008-10-07
 */

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.ui.view.maintenance.LWPowerLineForm;

public class UIDeleteLWPowerLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String LineCode=httpServletRequest.getParameter("UserLineNo");
		BLLwPowerLineFacade  blLwPowerLineFacade=new BLLwPowerLineFacade();
		
		//�������ر�ļ���ɾ��
		//LWindicator��
		//LWTownPriceSummary��
		//LWPriceSummary��
		//LWUserLine��
		//LWLineAmmeter��
		String[] LineCodetemp=LineCode.split(",");
		//System.out.println(UserNo.length);
	
	
		for(int i=0;i<LineCodetemp.length;i++){
			blLwPowerLineFacade.delete(LineCodetemp[i]);
		}
		return actionMapping.findForward("Success");


}
}
