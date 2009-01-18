package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;
import com.elongway.pss.ui.view.maintenance.LWUserLineForm;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class BLLWUserLine extends DispatchAction{
	public ActionForward getLWUserLineInfo(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		Collection UserLinecollection=new ArrayList();
		LWUserLineForm  lWUserLineForm=(LWUserLineForm)actionForm;
		String UserNo=lWUserLineForm.getUserNo();
		String UserName=lWUserLineForm.getUserName();
		String LineCode=lWUserLineForm.getLineCode();
		String ValidStatus=lWUserLineForm.getValidStatus();
		String condition="select * from LWUserLine where 1=1";
		if(UserNo==null||"".equals(UserNo)){
			condition+="and UserNo is null";
		}else{
			condition+="and UserNo="+UserNo;
		}
		if(UserName==null||"".equals(UserName)){
			condition+="and UserName is null";
		}else{
			condition+="and UserName="+UserName;
		}
		if(LineCode==null||"".equals(LineCode)){
			condition+="and LineCode is null";
		}else{
			condition+="and LineCode="+LineCode;
		}
		if(ValidStatus==null||"".equals(ValidStatus)){
			condition+="and ValidStatus is null";
		}else{
			condition+="and ValidStatus="+ValidStatus;
		}
		
		BLLwPowerLineFacade  blLwPowerLineFacade=new BLLwPowerLineFacade();
		UserLinecollection=blLwPowerLineFacade.findByConditions(condition);
		httpServletRequest.setAttribute("powerLine", UserLinecollection);
		return actionMapping.findForward("");
		
		
		
	}
	/**
	 * 新增方法
	 * 
	 * @param actionMapping
	 * @param actionForm
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return
	 * @throws Exception
	 */
	public ActionForward addLWPowerUser(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		LWUserLineForm  lWUserLineForm=(LWUserLineForm)actionForm;
		String UserNo=lWUserLineForm.getUserNo();
		String UserName=lWUserLineForm.getUserName();
		String LineCode=lWUserLineForm.getLineCode();
		String ValidStatus=lWUserLineForm.getValidStatus();
		String Remark=lWUserLineForm.getRemark();
		BLLwUserLineFacade  blLwUserLineFacade=new BLLwUserLineFacade();
		LwUserLineDto lwUserLineDto=new LwUserLineDto();
		lwUserLineDto.setUserNo(UserNo);
		lwUserLineDto.setUserName(UserName);

		lwUserLineDto.setValidStatus(ValidStatus);
		lwUserLineDto.setRemark(Remark);
		blLwUserLineFacade.insert(lwUserLineDto);
		return actionMapping.findForward("");
		
		
		
		
}
	/**
	 * 删除方法
	 * 
	 * @param actionMapping
	 * @param actionForm
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return
	 * @throws Exception
	 */
	public ActionForward deleteLWUserLine(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		String UserNo=httpServletRequest.getParameter("UserNo");
		String LineCode=httpServletRequest.getParameter("LineCode");
		BLLwUserLineFacade  blLwUserLineFacade=new BLLwUserLineFacade();
		blLwUserLineFacade.delete(UserNo, LineCode);
		return actionMapping.findForward("");
		
		
}
	/**
	 * 修改方法
	 * 
	 * @param actionMapping
	 * @param actionForm
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return
	 * @throws Exception
	 */
	public ActionForward modifyLWUserLine(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		LWUserLineForm  lWUserLineForm=(LWUserLineForm)actionForm;
		String UserNo=lWUserLineForm.getUserNo();
		String UserName=lWUserLineForm.getUserName();
		String LineCode=lWUserLineForm.getLineCode();
		String ValidStatus=lWUserLineForm.getValidStatus();
		String Remark=lWUserLineForm.getRemark();
		LwUserLineDto lwUserLineDto=new LwUserLineDto();
		lwUserLineDto.setUserNo(UserNo);
		lwUserLineDto.setUserName(UserName);
		lwUserLineDto.setLineCode(LineCode);
		lwUserLineDto.setValidStatus(ValidStatus);
		lwUserLineDto.setRemark(Remark);
		
		BLLwUserLineFacade  blLwUserLineFacade=new BLLwUserLineFacade();
		blLwUserLineFacade.update(lwUserLineDto);
		return actionMapping.findForward("");
		
		
		
		
		
	}
	

}
