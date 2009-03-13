package com.elongway.pss.ui.control.maintenance;

/**
 *用户信息维护 Action <br>
 * 增加
 * 
 * @author 王荣佳
 * @version 1.0 2008-10-07
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwBookUserFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwTownProrateAppendFacade;
import com.elongway.pss.dto.custom.UserInfoCustomDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwTownProrateAppendDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;

public class UIPostLWProrateAppendAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		String query = (String) httpServletRequest.getParameter("query");
		String forward = null;
		if (query != null) {
			BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
			BLLwProrateFacade blLwProrateFacade = new BLLwProrateFacade();
			String conditions = null;
			String userNo = null;
			Collection<LwPowerUserDto> userList = null;
			Collection<LwProrateDto> prorateList = null;
			// 确定需要修改比例的用户。
			String[] chooseUser = httpServletRequest
					.getParameterValues("chooseUser");
			conditions = this.getUserCondition(chooseUser);
			userList = blLwPowerUserFacade
					.findByConditions("1=1 " + conditions);
			prorateList = blLwProrateFacade.findByConditions("1=1 "
					+ conditions);
			UserInfoCustomDto userInfo = null;
			LwPowerUserDto lwPowerUserDto = null;
			LwProrateDto lwProrateDto = null;
			Collection<UserInfoCustomDto> userInfoList = new ArrayList<UserInfoCustomDto>();
			for (Iterator iterator = userList.iterator(); iterator.hasNext();) {
				lwPowerUserDto = (LwPowerUserDto) iterator.next();
				userNo = lwPowerUserDto.getUserNo();
				for (Iterator iterator2 = prorateList.iterator(); iterator2
						.hasNext();) {
					lwProrateDto = (LwProrateDto) iterator2.next();
					if (userNo.equals(lwProrateDto.getUserNo())) {
						userInfo = new UserInfoCustomDto();
						userInfo.setLwPowerUserDto(lwPowerUserDto);
						userInfo.setOldProrateDto(lwProrateDto);
						userInfoList.add(userInfo);
						break;
					}
				}
			}
			httpServletRequest.setAttribute("userInfoList", userInfoList);
			forward = "QueryLWPowerUser";
		} else {
			LwTownProrateAppendDto lwProrateAppendDtoOld = null;
			BLLwTownProrateAppendFacade blLwTownProrateAppendFacade = new BLLwTownProrateAppendFacade();
			BLLwProrateFacade blLwProrateFacade = new BLLwProrateFacade();
			LwProrateDto lwProrateDtoOld = null;
			String[] userId = httpServletRequest
			.getParameterValues("UserId");
			String[] resident = httpServletRequest
					.getParameterValues("Resident");
			String[] indecisive = httpServletRequest
					.getParameterValues("Indecisive");
			String[] agricultural = httpServletRequest
					.getParameterValues("Agricultural");
			String[] produce = httpServletRequest.getParameterValues("Produce");
			String[] business = httpServletRequest
					.getParameterValues("Business");
			String[] industry = httpServletRequest
					.getParameterValues("Industry");
			
			for (int i = 0; i < industry.length; i++) {
				
				// 查询该用户是否更新过比例
				lwProrateAppendDtoOld = blLwTownProrateAppendFacade.findByPrimaryKey(userId[i], AppConst.OLD_PRORATE_FLAG);
				lwProrateDtoOld = blLwProrateFacade.findByPrimaryKey(userId[i]);
				if(lwProrateAppendDtoOld==null){
					
					lwProrateAppendDtoOld = new LwTownProrateAppendDto();
					lwProrateAppendDtoOld.setUserNo(userId[i]);
					lwProrateAppendDtoOld.setResident(lwProrateDtoOld.getResident());
					lwProrateAppendDtoOld.setIndecisive(lwProrateDtoOld.getIndecisive());
					lwProrateAppendDtoOld.setAgricultural(lwProrateDtoOld.getAgricultural());
					lwProrateAppendDtoOld.setProduce(lwProrateDtoOld.getProduce());
					lwProrateAppendDtoOld.setBusiness(lwProrateDtoOld.getBusiness());
					lwProrateAppendDtoOld.setIndustry(lwProrateDtoOld.getIndustry());
					lwProrateAppendDtoOld.setInputDate(PowerFeeCal.getCurrentBillMonth());
					lwProrateAppendDtoOld.setFlag(AppConst.OLD_PRORATE_FLAG);
					
					blLwTownProrateAppendFacade.insert(lwProrateAppendDtoOld);
					
					lwProrateDtoOld.setResident(Double.parseDouble(resident[i]));
					lwProrateDtoOld.setIndecisive(Double.parseDouble(indecisive[i]));
					lwProrateDtoOld.setAgricultural(Double.parseDouble(agricultural[i]));
					lwProrateDtoOld.setProduce(Double.parseDouble(produce[i]));
					lwProrateDtoOld.setBusiness(Double.parseDouble(business[i]));
					lwProrateDtoOld.setIndustry(Double.parseDouble(industry[i]));
					
					blLwProrateFacade.update(lwProrateDtoOld);
				
				}
				else{
					lwProrateAppendDtoOld.setResident(lwProrateDtoOld.getResident());
					lwProrateAppendDtoOld.setIndecisive(lwProrateDtoOld.getIndecisive());
					lwProrateAppendDtoOld.setAgricultural(lwProrateDtoOld.getAgricultural());
					lwProrateAppendDtoOld.setProduce(lwProrateDtoOld.getProduce());
					lwProrateAppendDtoOld.setBusiness(lwProrateDtoOld.getBusiness());
					lwProrateAppendDtoOld.setIndustry(lwProrateDtoOld.getIndustry());
					lwProrateAppendDtoOld.setFlag(AppConst.OLD_PRORATE_FLAG);
					lwProrateAppendDtoOld.setInputDate(PowerFeeCal.getCurrentBillMonth());
					blLwTownProrateAppendFacade.update(lwProrateAppendDtoOld);					
					
					lwProrateDtoOld.setResident(Double.parseDouble(resident[i]));
					lwProrateDtoOld.setIndecisive(Double.parseDouble(indecisive[i]));
					lwProrateDtoOld.setAgricultural(Double.parseDouble(agricultural[i]));
					lwProrateDtoOld.setProduce(Double.parseDouble(produce[i]));
					lwProrateDtoOld.setBusiness(Double.parseDouble(business[i]));
					lwProrateDtoOld.setIndustry(Double.parseDouble(industry[i]));					
					
					blLwProrateFacade.update(lwProrateDtoOld);
				}
			}
			forward = "success";
		}

		return actionMapping.findForward(forward);
	}

	public String getUserCondition(String[] chooseUser) {
		String userNo = null;
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < chooseUser.length; i++) {
			userNo = chooseUser[i];
			buffer.append("'").append(userNo).append("',");
		}
		buffer.deleteCharAt(buffer.length() - 1);
		buffer.insert(0, "and userNo in(");
		buffer.append(")");
		return buffer.toString();
	}
}
