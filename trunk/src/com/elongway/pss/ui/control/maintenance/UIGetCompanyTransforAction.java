package com.elongway.pss.ui.control.maintenance;
/**
 * ����ָ���ʼ��
 * @author wangrongjia 
 * modify by qiaoyouliang 2008-11-11
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIGetCompanyTransforAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		
		// ��������
		String comcode=httpServletRequest.getParameter("comcode");
		String statMonth = null;
		BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
		Collection indicatorList = new ArrayList();
		BLLwWholeSaleIndicatorFacade blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
		Collection wholesalePointer=new ArrayList();
		Collection wholesaleUser=new ArrayList();
		
		// �õ���ǰ������
		statMonth = PowerFeeCal.getCurrentBillMonth();
		// ����ָ������Ƿ���ڵ��µ�ָ���¼
		wholesalePointer=blLwWholeSaleIndicatorFacade.findByConditions("  flag = '"+comcode+"'"+"order by userno");	

		// �������е������û�
		wholesaleUser=blLwWholeSaleUserInfoFacade.findByConditions(" COMPANY = '"+comcode+"'"+"order by userno");
		int all = wholesaleUser.size();
		int count = 0;
		int initCount = wholesalePointer.size();
		if(initCount == 0){
			for (Iterator iterator = wholesaleUser.iterator(); iterator
					.hasNext();) {
				LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = (LwWholeSaleUserInfoDto) iterator
						.next();		
				
				LwWholeSaleIndicatorDto  lwWholeSaleIndicatorDto= new LwWholeSaleIndicatorDto();
				lwWholeSaleIndicatorDto.setUserNo(lwWholeSaleUserInfoDto.getUserNo() );
				lwWholeSaleIndicatorDto.setIfCal(lwWholeSaleUserInfoDto.getIfCal());
				lwWholeSaleIndicatorDto.setFlag(lwWholeSaleUserInfoDto.getCompany());
				indicatorList.add(lwWholeSaleIndicatorDto);			
			}
		}
		else if(all!=initCount){
			// �����»�û�б��ʼ�������ݳ�ʼ����ָ�����
			for (Iterator iterator = wholesaleUser.iterator(); iterator.hasNext();) {
				LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = (LwWholeSaleUserInfoDto) iterator.next();
				count = 1;
				
				String userNo1= lwWholeSaleUserInfoDto.getUserNo();				
				for (Iterator iterator2 = wholesalePointer.iterator(); iterator2
						.hasNext();) {
					LwWholeSaleIndicatorDto LwWholeSaleIndicatorDto2 = (LwWholeSaleIndicatorDto) iterator2
							.next();
					LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = new LwWholeSaleIndicatorDto();
					String userNo2 = LwWholeSaleIndicatorDto2.getUserNo() ;
					if(userNo1.equals(userNo2)){
						break;
					}else if(!lwWholeSaleUserInfoDto.getUserName().equals(LwWholeSaleIndicatorDto2.getUserNo())&&count == initCount){					
						lwWholeSaleIndicatorDto.setUserNo(lwWholeSaleUserInfoDto.getUserNo());
						lwWholeSaleIndicatorDto.setStatMonth(statMonth);
						lwWholeSaleIndicatorDto.setFlag(lwWholeSaleUserInfoDto.getCompany());
						lwWholeSaleIndicatorDto.setIfCal(lwWholeSaleUserInfoDto.getIfCal());
					// �û���
					
					indicatorList.add(lwWholeSaleIndicatorDto);					
					}
					count++;
				}				
			}
		}	
		else if(all == initCount){
			throw new UserException(-6,-709,this.getClass().getName());
		}
		httpServletRequest.setAttribute("statMonth", statMonth);
		httpServletRequest.setAttribute("comcode", comcode);
		httpServletRequest.setAttribute("indicatorList", indicatorList);
		return actionMapping.findForward("wholeSalePointerinitialize");
	}

}
