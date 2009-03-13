package com.elongway.pss.ui.control.feeappend.town;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryAppendFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryFacade;
import com.elongway.pss.bl.facade.BLLwTownPriceSummaryProratAppendFacade;
import com.elongway.pss.dto.custom.TownSataDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;

/**
 * �������۱�����̯
 * 
 * @author goodluck
 * 
 */
public class UIQueryTownChaStatAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		/** 0-�������� */
		BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
		Collection<LwDcodeDto> comList = blLwDcodeFacade
				.findByConditions(" codetype = 'SupplyCom'");
		String firstquery = httpServletRequest.getParameter("firstquery");
		BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwTownPriceSummaryFacade blLwTownPriceSummaryFacade = new BLLwTownPriceSummaryFacade();
		Collection priceSummaryList = null;
		String condition = null;
		String forward = null;
		String company = null;
		String statMonth = null;
		Collection<LwPowerUserDto> userList = null;
		TownSataDto townSataDto = null;
		Collection<TownSataDto> resultList  = new ArrayList<TownSataDto>();
		Collection allList = new ArrayList<TownSataDto>();
		Collection<LwTownPriceSummaryProratAppendDto>chaList = null;
		BLLwTownPriceSummaryProratAppendFacade appendFacade = new BLLwTownPriceSummaryProratAppendFacade();
		StringBuffer buffer = new StringBuffer();
		String appendFlag = (String)httpServletRequest.getParameter("appendflag");
		String print = (String)httpServletRequest.getParameter("print");
		

		/** 1-�����ѯҳ�� */
		if (firstquery != null) {
			httpServletRequest.setAttribute("supplycom", comList);
			forward = "Success";
		} else {
			/** 2-ͳ�� */
			// �õ���������
			company = httpServletRequest.getParameter("company");
			statMonth = httpServletRequest.getParameter("inputDate");
			statMonth = new DateTime(statMonth, DateTime.YEAR_TO_MONTH)
					.toString();
			
			httpServletRequest.setAttribute("company", company);
			// ���ѡ��һ������
			if ((!"".equals(company)) && (!"sum".equals(company))) {
				
				// 1 - ѡ��û�����Ӧ���û�
				userList = blLwPowerUserFacade
				.findByConditions("superclass = '" + company + "'");
				
				// 2 - ��֯����
				condition = PowerFeeCal.getUserCondition(userList);
				
				// 3 - ��֯��ѯ����
				buffer.append("statMonth like '%").append(statMonth).append(
				"%' and flag = '").append(AppConst.CHA_CAL_FLAG).append(
				"' ");
				buffer.append(condition);
								
				// 4 - ��ѯ��������Ϣ
				chaList = appendFacade.findByConditions(buffer.toString());
				
				
				// 5 - �����������Ϣ
				townSataDto = blCalPowerFeeCustomFacade.townAppendStatByCompany(chaList, statMonth);
				
				for (Iterator iterator = comList.iterator(); iterator.hasNext();) {
					LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
					if (lwDcodeDto.getCodeCode().equals(company)) {
						townSataDto.setComCode(lwDcodeDto.getCodeCode());
						townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
						break;
					}
				}
				resultList.add(townSataDto);
				httpServletRequest.setAttribute("resultList", resultList);
				httpServletRequest.setAttribute("statMonth", statMonth);
				forward = "statSuccess";
				
			} else if ("sum".equals(company)) {
				//�������ѡ�����
				
				// 1 - ѭ���������л���
				for (Iterator iterator = comList.iterator(); iterator.hasNext();) {
					LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
					// ��û�������
					company = lwDcodeDto.getCodeCode();
					// �õ��û������û�
					userList = blLwPowerUserFacade
							.findByConditions("superclass = '" + company + "'");
					// ��֯�û�����
					condition = PowerFeeCal.getUserCondition(userList);
				
					// ��֯��ѯ����
					buffer.append("statMonth like '%").append(statMonth).append(
					"%' and flag = '").append(AppConst.CHA_CAL_FLAG).append(
					"' ");
					buffer.append(condition);
									
					// ��ѯ��������Ϣ
					chaList = appendFacade.findByConditions(buffer.toString());
					
					
					// �ۼƲ�������Ϣ
					townSataDto = blCalPowerFeeCustomFacade.townAppendStatByCompany(chaList, statMonth);
					
					
					townSataDto.setComCode(company);
					townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
					resultList.add(townSataDto);
					buffer.delete(0, buffer.length());

				}
				// 2 - ͳ�ƻ���
				townSataDto = PowerFeeCal.getSumCompanyStat(resultList,
						statMonth);
				townSataDto.setComCode("sum");
				allList.add(townSataDto);

				httpServletRequest.setAttribute("resultList", allList);
				httpServletRequest.setAttribute("statMonth", statMonth);
				forward = "statSuccess";
			} else {
				// ���ѡ��������
				for (Iterator iterator = comList.iterator(); iterator.hasNext();) {
					LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
					// �õ���������
					company = lwDcodeDto.getCodeCode();
					// �õ��û������û�
					userList = blLwPowerUserFacade
							.findByConditions("superclass = '" + company + "'");
					// ��֯�û�����
					condition = PowerFeeCal.getUserCondition(userList);
				
					// ��֯��ѯ����
					buffer.append("statMonth like '%").append(statMonth).append(
					"%' and flag = '").append(AppConst.CHA_CAL_FLAG).append(
					"' ");
					buffer.append(condition);
									
					// ��ѯ��������Ϣ
					chaList = appendFacade.findByConditions(buffer.toString());
					
					
					// �ۼƲ�������Ϣ
					townSataDto = blCalPowerFeeCustomFacade.townAppendStatByCompany(chaList, statMonth);
					townSataDto.setComCode(company);
					townSataDto.setCompanyName(lwDcodeDto.getCodeCName());
					resultList.add(townSataDto);
					buffer.delete(0, buffer.length());
				}
				townSataDto = PowerFeeCal.getSumCompanyStat(resultList,
						statMonth);
				resultList.add(townSataDto);
				httpServletRequest.setAttribute("resultList", resultList);
				httpServletRequest.setAttribute("statMonth", statMonth);
				forward = "statSuccess";
			}
		}
		// ׷�յ��
		httpServletRequest.setAttribute("appendflag", appendFlag);
		if(print!=null){
			forward = "print";
		}
		return actionMapping.findForward(forward);

	}

}
