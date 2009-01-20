package com.elongway.pss.ui.dataInput;

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
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

/**
 * 直供乡指针初始化 Action <br>
 * 计算、保存
 * 
 * @author 乔有良 add
 * @version 1.0 2008-11-05
 */
public class UIInitPostTownCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		// 声明变量
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwTownIndicatorFacade blLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		Collection<LwPowerUserDto> userList = null;
		Collection<LwTownIndicatorDto>initList = null;
		LwTownIndicatorDto lwTownIndicatorDto = null;
		LwAmmeterChangeDto lwAmmeterChangeDto = null;
		Collection changeList = null;
		Collection<LwTownIndicatorDto> indicatorList = new ArrayList<LwTownIndicatorDto>();
		BLCalPowerFeeCustomFacade bllwCalPowerFeeCustomFacade = new BLCalPowerFeeCustomFacade();
		String statMonth = null;
		String forward = null;
		
		
		// 得到当前的结帐月
		statMonth = PowerFeeCal.getCurrentBillMonth();
		// 查找所有的用户
		userList = blLwPowerUserFacade.findByConditions("");
		if(userList == null||userList.size()==0){
			throw new UserException(-6,-710,this.getClass().getName(),"系统中没有录入用电用户");
		}
		initList = blLwTownIndicatorFacade.findByConditions("1=1  order by userno");	
		int all = userList.size();
		int count = 0;
		// 得到已经初始化的指针数量。
		int initCount = initList.size();
		// 1-指针表中没有当月的记录
		if(initCount == 0){
			for (Iterator iterator = userList.iterator(); iterator
					.hasNext();) {
				LwPowerUserDto lwPowerDto = (LwPowerUserDto) iterator
						.next();		
				lwTownIndicatorDto = new LwTownIndicatorDto();
				lwTownIndicatorDto.setUserNo(lwPowerDto.getUserNo());
				lwTownIndicatorDto.setStatMonth(statMonth);		
				changeList = blLwAmmeterChangeFacade.findByConditions(" userNo = '"+lwPowerDto.getUserNo()+"' and flag = '1'");
				if(changeList!=null&changeList.size()!=0){
					Iterator it =  changeList.iterator();
					lwAmmeterChangeDto = (LwAmmeterChangeDto)it.next();
					lwTownIndicatorDto.setAmmeterNo(lwAmmeterChangeDto.getAmmeterNo());
				}
				// 用户名
				lwTownIndicatorDto.setUserName(lwPowerDto.getUserName());
				// 地址
				lwTownIndicatorDto.setAddress(lwPowerDto.getAddress());
				// 倍率
				lwTownIndicatorDto.setRate(Double.parseDouble(lwAmmeterChangeDto.getRate()));				
				indicatorList.add(lwTownIndicatorDto);			
			}
		}
		// 2-已经做了初始化，需要检验
		else if(all!=initCount){
			// 将当月还没有被初始化的数据初始化到指针表中
			for (Iterator iterator = userList.iterator(); iterator.hasNext();) {
				LwPowerUserDto lwPowerUserDto = (LwPowerUserDto) iterator.next();
				count = 1;
				String userNo1= lwPowerUserDto.getUserNo();

				for (Iterator iterator2 = initList.iterator(); iterator2
						.hasNext();) {
					LwTownIndicatorDto lwTownIndicatorDto2 = (LwTownIndicatorDto) iterator2
							.next();
					lwTownIndicatorDto = new LwTownIndicatorDto();
					String userNo2 = lwTownIndicatorDto2.getUserNo();
					if(userNo1.equals(userNo2)){
						break;
					}else if(!lwPowerUserDto.getUserNo().equals(lwTownIndicatorDto2.getUserNo())&&count == initCount){					
					lwTownIndicatorDto.setUserNo(lwPowerUserDto.getUserNo());
					lwTownIndicatorDto.setStatMonth(statMonth);
					changeList = blLwAmmeterChangeFacade.findByConditions(" userNo = '"+lwPowerUserDto.getUserNo()+"' and flag = '1'");
					if(changeList!=null&changeList.size()!=0){
						Iterator it =  changeList.iterator();
						lwAmmeterChangeDto = (LwAmmeterChangeDto)it.next();
						lwTownIndicatorDto.setAmmeterNo(lwAmmeterChangeDto.getAmmeterNo());
					}
					// 用户名
					lwTownIndicatorDto.setUserName(lwPowerUserDto.getUserName());
					// 地址
					lwTownIndicatorDto.setAddress(lwPowerUserDto.getAddress());
					// 倍率
					lwTownIndicatorDto.setRate(Double.parseDouble(lwAmmeterChangeDto.getRate()));
					indicatorList.add(lwTownIndicatorDto);					
					}
					count++;
				}				
			}
		}	
		else if(all == initCount){
			// 没有需要指针初始化的用电用户
			throw new UserException(-6,-709,this.getClass().getName());
		}
		forward = "townInputSuccess";
		httpServletRequest.setAttribute("userList", indicatorList);
		httpServletRequest.setAttribute("statMonth", statMonth);

		return actionMapping.findForward(forward);
	}
	
}
