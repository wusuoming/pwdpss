package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.ui.view.maintenance.AddLWPowerUserForm;

import com.sinosoft.sysframework.exceptionlog.UserException;
/**
 * yongdianyonghu Action
 * @author wang rong jia
 *
 */
public class BLPLWPowerUser extends DispatchAction{
	/**
	 * 查询方法
	 * 
	 * @param actionMapping
	 * @param actionForm
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return
	 * @throws Exception
	 */

	
	public ActionForward getLWPowerUserInfo(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		Collection PowerUsercollection=new ArrayList();
		AddLWPowerUserForm  addLWPowerUserForm=(AddLWPowerUserForm)actionForm;
		String UserNo=addLWPowerUserForm.getUserNo();
		String UserName=addLWPowerUserForm.getUserName();
		String Address=addLWPowerUserForm.getAddress();
		String ValidStatus=addLWPowerUserForm.getValidStatus();
		String TownCode=addLWPowerUserForm.getTownCode();
		String condition="select * from LWPowerUser where 1=1";
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
		if(Address==null||"".equals(Address)){
			condition+="and Address is null";
		}else{
			condition+="and Address="+Address;
		}
		if(ValidStatus==null||"".equals(ValidStatus)){
			condition+="and ValidStatus is null";
		}else{
			condition+="and ValidStatus="+ValidStatus;
		}
		if(TownCode==null||"".equals(TownCode)){
			condition+="and TownCode is null";
		}else{
			condition+="and TownCode="+TownCode;
		}
		
		BLLwPowerUserFacade  blLwPowerUserFacade=new BLLwPowerUserFacade();
		PowerUsercollection=blLwPowerUserFacade.findByConditions(condition);
		httpServletRequest.setAttribute("powerUser", PowerUsercollection);
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
		AddLWPowerUserForm  addLWPowerUserForm=(AddLWPowerUserForm)actionForm;
		String UserNo=addLWPowerUserForm.getUserNo();
		String UserName=addLWPowerUserForm.getUserName();
		String Address=addLWPowerUserForm.getAddress();
		String ValidStatus=addLWPowerUserForm.getValidStatus();
		String TownCode=addLWPowerUserForm.getTownCode();
		String Remark=addLWPowerUserForm.getRemark();
		BLLwPowerUserFacade  blLwPowerUserFacade=new BLLwPowerUserFacade();
		LwPowerUserDto lwPowerUserDto=new LwPowerUserDto();
		lwPowerUserDto.setUserNo(UserNo);
		lwPowerUserDto.setUserName(UserName);
		lwPowerUserDto.setAddress(Address);
		lwPowerUserDto.setValidStatus(ValidStatus);
		lwPowerUserDto.setTownCode(TownCode);
	
		blLwPowerUserFacade.insert(lwPowerUserDto);
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
	public ActionForward deleteLWPowerUser(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		String UserNo=httpServletRequest.getParameter("UserNo");
		BLLwPowerUserFacade  blLwPowerUserFacade=new BLLwPowerUserFacade();
		blLwPowerUserFacade.delete(UserNo);
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
	public ActionForward modifyLWPowerUser(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,Exception {
		AddLWPowerUserForm  addLWPowerUserForm=(AddLWPowerUserForm)actionForm;
		String UserNo=addLWPowerUserForm.getUserNo();
		String UserName=addLWPowerUserForm.getUserName();
		String Address=addLWPowerUserForm.getAddress();
		String ValidStatus=addLWPowerUserForm.getValidStatus();
		String TownCode=addLWPowerUserForm.getTownCode();
		String Remark=addLWPowerUserForm.getRemark();
		LwPowerUserDto lwPowerUserDto=new LwPowerUserDto();
		lwPowerUserDto.setUserNo(UserNo);
		lwPowerUserDto.setUserName(UserName);
		lwPowerUserDto.setAddress(Address);
		lwPowerUserDto.setValidStatus(ValidStatus);
		lwPowerUserDto.setTownCode(TownCode);
	
		
		BLLwPowerUserFacade  blLwPowerUserFacade=new BLLwPowerUserFacade();
		blLwPowerUserFacade.update(lwPowerUserDto);
		return actionMapping.findForward("");
	}
	}
