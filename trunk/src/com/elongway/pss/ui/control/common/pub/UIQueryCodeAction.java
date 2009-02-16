package com.elongway.pss.ui.control.common.pub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwDcompanyFacade;
import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwctFacade;
import com.elongway.pss.bl.facade.BLLwptFacade;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwDcompanyDto;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.dto.domain.LwctDto;
import com.elongway.pss.dto.domain.LwptDto;
import com.elongway.pss.ui.view.common.SelectBean;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;
import com.sinosoft.sysframework.common.util.SqlUtils;

public class UIQueryCodeAction extends Action {
	static Logger log = Logger.getLogger(UIQueryCodeAction.class);

	/**
	 * 由struts主动调用
	 * 
	 * @param actionMapping
	 * @param actionForm
	 *            actionForm
	 * @param httpServletRequest
	 *            http请求
	 * @param httpServletResponse
	 *            http回应
	 * @return
	 * @throws Exception
	 */
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		UIGetAmmeterForm uiGetAmmeterForm = (UIGetAmmeterForm) actionForm;
		String lineCode = httpServletRequest.getParameter("CODE");
		String tableName = httpServletRequest.getParameter("TableName");
		
		
		  if (tableName.equals("LwPowerLine")) {
			StringBuffer conditions = new StringBuffer();
			int count = 0;
			String strGROUPNO = ""; // 选中项
			String groupName = "";
			Collection collection = null;
			List list = new ArrayList();
			// 拼写条件子句
			conditions.append(" 1=1 ").append(SqlUtils.convertString("lineCode",lineCode));
			BLLwPowerLineFacade bllwPowerLineFacade = new BLLwPowerLineFacade ();
			// 从线路表(PowerLine)查询出所有的线路
			collection = bllwPowerLineFacade.findByConditions(conditions.toString());
			if (collection != null) {
				count = collection.size();
			}
			for (Iterator i = collection.iterator(); i.hasNext();) {
				LwPowerLineDto lwPowerLineDto = (LwPowerLineDto) i.next();
				SelectBean selectBean = new SelectBean();
				strGROUPNO = lwPowerLineDto.getLineCode();
				groupName = lwPowerLineDto.getLineCName();
				selectBean.setCodeCode(strGROUPNO);
				selectBean.setCodeType(groupName);
				list.add(selectBean);
			}
			uiGetAmmeterForm.setCount(count);
			httpServletRequest.setAttribute("uiGetAmmeterForm",uiGetAmmeterForm);
			httpServletRequest.setAttribute("CodeForm",
					"window.opener.uiGetAmmeterForm.LineCode");
			httpServletRequest.setAttribute("list", list);
		}
		  //add by wangrongjia begin
		  if (tableName.equals("LwPowerLine1")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 and flag is null ").append(SqlUtils.convertString("lineCode", lineCode));
				BLLwPowerLineFacade bllwPowerLineFacade = new BLLwPowerLineFacade ();
				// 从线路表(PowerLine)查询出所有的线路
				collection = bllwPowerLineFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwPowerLineDto lwPowerLineDto = (LwPowerLineDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwPowerLineDto.getLineCode();
					groupName = lwPowerLineDto.getLineCName();
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.lineCode");
				httpServletRequest.setAttribute("list", list);
			}
		  if (tableName.equals("LwCT1")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 and flag is null ").append(SqlUtils.convertString("CT", lineCode));
				BLLwctFacade  blLwctFacade = new BLLwctFacade();
				// 从线路表(PowerLine)查询出所有的线路
				collection = blLwctFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwctDto lwctDto = (LwctDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwctDto.getModus();
					groupName = "";
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.CTModus");
				httpServletRequest.setAttribute("list", list);
			}
		  if (tableName.equals("LwPT1")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 and flag is null ").append(SqlUtils.convertString("CT", lineCode));
				BLLwptFacade  blLwptFacade = new BLLwptFacade();
				// 从线路表(PowerLine)查询出所有的线路
				collection = blLwptFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwptDto lwptDto = (LwptDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwptDto.getModus();
					groupName = "";
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.PTModus");
				httpServletRequest.setAttribute("list", list);
			}
		  if (tableName.equals("LwAmmeterNo1")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 and flag is null ").append(SqlUtils.convertString("CT", lineCode));
				BLLwAmmeterFacade  blLwAmmeterFacade = new BLLwAmmeterFacade();
				// 从线路表(PowerLine)查询出所有的线路
				collection = blLwAmmeterFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwAmmeterDto lwAmmeterDto = (LwAmmeterDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwAmmeterDto.getAmmeterNo();
					groupName = "";
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.AmmeterNo");
				httpServletRequest.setAttribute("list", list);
			}
		  if (tableName.equals("industryId")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 ").append(SqlUtils.convertString("industryId", lineCode));
				BLLwDcompanyFacade blLwDcompanyFacade= new BLLwDcompanyFacade();
				// 从线路表(PowerLine)查询出所有的线路
				collection = blLwDcompanyFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwDcompanyDto  lwDcompanyDto = (LwDcompanyDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwDcompanyDto.getComCode();
					groupName = lwDcompanyDto.getComCName();
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.industryId");
				httpServletRequest.setAttribute("list", list);
			}
		  
		  if (tableName.equals("wholeLine")) {
			  StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 and SUPPLYTYPE=3 OR SUPPLYTYPE=4 ").append(SqlUtils.convertString("lineCode", lineCode));
				BLLwPowerLineFacade bllwPowerLineFacade = new BLLwPowerLineFacade ();
				// 从线路表(PowerLine)查询出所有的线路
				collection = bllwPowerLineFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwPowerLineDto lwPowerLineDto = (LwPowerLineDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwPowerLineDto.getLineCode();
					groupName = lwPowerLineDto.getLineCName();
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm",uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.LineCode");
				httpServletRequest.setAttribute("list", list);
			}
		  if (tableName.equals("ComCode")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 ").append(SqlUtils.convertString("ComCode", lineCode));
				BLLwDcompanyFacade blLwDcompanyFacade= new BLLwDcompanyFacade();
				// 从线路表(PowerLine)查询出所有的线路
				collection = blLwDcompanyFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwDcompanyDto  lwDcompanyDto = (LwDcompanyDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwDcompanyDto.getComCode();
					groupName = lwDcompanyDto.getComCName();
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.ComCode");
				httpServletRequest.setAttribute("list", list);
			}
		  if (tableName.equals("LwAmmeterNo2")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 and flag is null ").append(SqlUtils.convertString("CT", lineCode));
				BLLwAmmeterFacade  blLwAmmeterFacade = new BLLwAmmeterFacade();
				// 从线路表(PowerLine)查询出所有的线路
				collection = blLwAmmeterFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwAmmeterDto lwAmmeterDto = (LwAmmeterDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwAmmeterDto.getAmmeterNo();
					groupName = "";
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.UnAmmeterNo");
				httpServletRequest.setAttribute("list", list);
			}
		  if (tableName.equals("LwAmmeterNo3")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 and flag is null ").append(SqlUtils.convertString("CT", lineCode));
				BLLwAmmeterFacade  blLwAmmeterFacade = new BLLwAmmeterFacade();
				// 从线路表(PowerLine)查询出所有的线路
				collection = blLwAmmeterFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwAmmeterDto lwAmmeterDto = (LwAmmeterDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwAmmeterDto.getAmmeterNo();
					groupName = "";
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.PepoleAmmeterNo");
				httpServletRequest.setAttribute("list", list);
			}
		  if (tableName.equals("LwAmmeterNo")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 and flag is null ");
				BLLwAmmeterFacade  blLwAmmeterFacade = new BLLwAmmeterFacade();
				// 从线路表(PowerLine)查询出所有的线路
				collection = blLwAmmeterFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwAmmeterDto lwAmmeterDto = (LwAmmeterDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwAmmeterDto.getAmmeterNo();
					groupName = lwAmmeterDto.getFactoryName();
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.ammeterNo");
				httpServletRequest.setAttribute("list", list);
			}
		  if (tableName.equals("wholeSaleName")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 ");
				BLLwWholeSaleUserInfoFacade  blLwWholeSaleUserInfoFacade = new BLLwWholeSaleUserInfoFacade();
				// 从线路表(PowerLine)查询出所有的线路
				collection = blLwWholeSaleUserInfoFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = (LwWholeSaleUserInfoDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwWholeSaleUserInfoDto.getUserNo() ;
					String s=lwWholeSaleUserInfoDto.getCompany();
					if(lwWholeSaleUserInfoDto.getCompany().equals("gy")){
						s="固阳";
					}
					if(lwWholeSaleUserInfoDto.getCompany().equals("dm")){
						s="达茂";
					}
					if(lwWholeSaleUserInfoDto.getCompany().equals("ty")){
						s="图佑";
					}
					if(lwWholeSaleUserInfoDto.getCompany().equals("jy")){
						s="九原";
					}
					groupName = s ;
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.wholeSaleName");
				httpServletRequest.setAttribute("list", list);
			}
		  if (tableName.equals("corporationName")) {
				StringBuffer conditions = new StringBuffer();
				int count = 0;
				String strGROUPNO = ""; // 选中项
				String groupName = "";
				Collection collection = null;
				List list = new ArrayList();
				// 拼写条件子句
				conditions.append(" 1=1 ");
				BLLwCoporationUserInfoFacade   blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
				// 从线路表(PowerLine)查询出所有的线路
				collection = blLwCoporationUserInfoFacade.findByConditions(conditions.toString());
				if (collection != null) {
					count = collection.size();
				}
				for (Iterator i = collection.iterator(); i.hasNext();) {
					LwCoporationUserInfoDto lwCoporationUserInfoDto = (LwCoporationUserInfoDto) i.next();
					SelectBean selectBean = new SelectBean();
					strGROUPNO = lwCoporationUserInfoDto.getUserNo() ;
					groupName = lwCoporationUserInfoDto.getUserName();
					selectBean.setCodeCode(strGROUPNO);
					selectBean.setCodeType(groupName);
					list.add(selectBean);
				}
				uiGetAmmeterForm.setCount(count);
				httpServletRequest.setAttribute("uiGetAmmeterForm", uiGetAmmeterForm);
				httpServletRequest.setAttribute("CodeForm",
						"window.opener.fm.corporationName");
				httpServletRequest.setAttribute("list", list);
			}
		return actionMapping.findForward("Success");
	}
}
