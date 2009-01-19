package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIcorporationPointerinitializeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String statMonth = null;
		statMonth = PowerFeeCal.getCurrentBillMonth();
		Collection indicatorList = new ArrayList();
		//BLLwFactoryIndicatorFacade blLwFactoryIndicatorFacade=new BLLwFactoryIndicatorFacade();
		BLLwNewFactoryIndicatorFacade  blLwNewFactoryIndicatorFacade=new BLLwNewFactoryIndicatorFacade();
		Collection wholesalePointer=new ArrayList();
		wholesalePointer=blLwNewFactoryIndicatorFacade.findByConditions(" ");
		
		//BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
		Collection wholesaleUser=new ArrayList();
		wholesaleUser=blLwAmmeterChangeFacade.findByConditions("flag=1 and remark='0'");
		int all = wholesaleUser.size();
		int count = 0;
		int initCount = wholesalePointer.size();
		if(initCount == 0){
			for (Iterator iterator = wholesaleUser.iterator(); iterator
					.hasNext();) {
				//LwCoporationUserInfoDto lwCoporationUserInfoDto = (LwCoporationUserInfoDto) iterator
					//	.next();		
				LwAmmeterChangeDto  lwAmmeterChangeDto = (LwAmmeterChangeDto) iterator
					.next();
				LwNewFactoryIndicatorDto  lwNewFactoryIndicatorDto= new LwNewFactoryIndicatorDto();
				lwNewFactoryIndicatorDto.setUserNo(lwAmmeterChangeDto.getUserNo());
				lwNewFactoryIndicatorDto.setUsername(lwAmmeterChangeDto.getUserName());
				lwNewFactoryIndicatorDto.setAmmeterNo(lwAmmeterChangeDto.getAmmeterNo());
				lwNewFactoryIndicatorDto.setRate(Double.parseDouble(lwAmmeterChangeDto.getRate()));
				lwNewFactoryIndicatorDto.setAmmeterStyle(lwAmmeterChangeDto.getUseStyle());
				indicatorList.add(lwNewFactoryIndicatorDto);			
			}
		}
		else if(all!=initCount){
			// 将当月还没有别初始化的数据初始化到指针表中
			for (Iterator iterator = wholesaleUser.iterator(); iterator.hasNext();) {
				//LwCoporationUserInfoDto lwCoporationUserInfoDto = (LwCoporationUserInfoDto) iterator.next();
				LwAmmeterChangeDto  lwAmmeterChangeDto=(LwAmmeterChangeDto) iterator.next();
				count = 1;
				String userNo1= lwAmmeterChangeDto.getUserNo() ;
				String adNo1=lwAmmeterChangeDto.getAmmeterNo();
				String flag=lwAmmeterChangeDto.getFlag();

				
				for (Iterator iterator2 = wholesalePointer.iterator(); iterator2
						.hasNext();) {
					//LwFactoryIndicatorDto lwFactoryIndicatorDto2 = (LwFactoryIndicatorDto) iterator2
							//.next();
					LwNewFactoryIndicatorDto  lwNewFactoryIndicatorDto2=(LwNewFactoryIndicatorDto)iterator2.next();
					LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = new LwNewFactoryIndicatorDto();
					String userNo2 = lwNewFactoryIndicatorDto2.getUserNo() ;
					String adNo2=lwNewFactoryIndicatorDto2.getAmmeterNo();
					if((userNo1.equals(userNo2))&&(adNo1.equals(adNo2))&&flag.equals("1")){
						break;
					}else if(((!adNo1.equals(adNo2))&&flag.equals("1"))&&count == initCount){					
						lwNewFactoryIndicatorDto.setUserNo(lwAmmeterChangeDto.getUserNo());
						lwNewFactoryIndicatorDto.setStatMonth(statMonth);
						lwNewFactoryIndicatorDto.setUsername(lwAmmeterChangeDto.getUserName());
						lwNewFactoryIndicatorDto.setAmmeterNo(lwAmmeterChangeDto.getAmmeterNo());
						lwNewFactoryIndicatorDto.setRate(Double.parseDouble(lwAmmeterChangeDto.getRate()));
						lwNewFactoryIndicatorDto.setAmmeterStyle(lwAmmeterChangeDto.getUseStyle());
					// 用户名
					
					indicatorList.add(lwNewFactoryIndicatorDto);					
					}
					count++;
				}				
			}
		}	
		else if(all == initCount){
			throw new UserException(-6,-709,this.getClass().getName());
		}
		httpServletRequest.setAttribute("statMonth", statMonth);
		httpServletRequest.setAttribute("indicatorList", indicatorList);
	return actionMapping.findForward("corporationPointerinitialize");

}
}