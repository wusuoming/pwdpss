package com.elongway.pss.ui.control.change;

/**
 * 趸售换表查询 Action <br>
 * 
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-11-07
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

import com.elongway.pss.bl.action.custom.BLDataInitCustomAction;
import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwBookUserFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwUserAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIGetFactoryChangeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量 
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		BLLwNewFactoryIndicatorFacade blLwNewFactoryIndicatorFacade = new BLLwNewFactoryIndicatorFacade();
		BLLwBookUserFacade blLwBookUserFacade = new BLLwBookUserFacade();
		BLLwUserLineFacade blLwUserLineFacade = new BLLwUserLineFacade();
		String forward = null;
		String condition = null;
		Collection ammeterList = null;
		LwCoporationUserInfoDto lwCoporationUserInfoDto = null;
		LwBookUserDto lwBookUserDto = null;
		LwUserLineDto lwUserLineDto = null;
		LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = null;

		// 得到用户代码
		String userNo = httpServletRequest.getParameter("UserNo");
		// 电表类型
		String useStyle = httpServletRequest.getParameter("useStyle");
		String ammeterNo = httpServletRequest.getParameter("ammeterNohidden");
		// 查找用户信息
		lwCoporationUserInfoDto = blLwCoporationUserInfoFacade
				.findByPrimaryKey(userNo);
		// 查找用户上月指针信息
		Collection factoryIndicatorList = blLwNewFactoryIndicatorFacade
				.findByConditions(" 1=1 and userNo = '" + userNo
						+ "' and statMonth = '"
						+ PowerFeeCal.getCurrentBillMonth() + "'"+" and AMMETERNO = '"+ammeterNo+"'");
		if (factoryIndicatorList != null && factoryIndicatorList.size() != 0) {
			Iterator<LwNewFactoryIndicatorDto> it = factoryIndicatorList.iterator();
			lwNewFactoryIndicatorDto = (LwNewFactoryIndicatorDto) it.next();
		} else {
			// 还没有进行月数据初始化
			throw new UserException(-6,-702, this.getClass().getName(),"还没有进行月数据初始化");
		}
		// 分类查找用户所对应电表信息（居民表、大工业表）
		ammeterList = blLwAmmeterChangeFacade.findByConditions(" userNo = '"+ userNo + "'  and ammeterNo = '"+ammeterNo+"' and flag=1 order by installDate asc");
		int i = 0;
	
			for (Iterator iterator = ammeterList.iterator(); iterator.hasNext();) {
				LwAmmeterChangeDto o = (LwAmmeterChangeDto) iterator.next();
				// 将上月有功指针带过来
				
					o.setLastIdleNum(lwNewFactoryIndicatorDto.getLastIdleNum());
					o.setLastWorkNum(lwNewFactoryIndicatorDto.getLastWorkNum());
					
					blLwAmmeterChangeFacade.update(o);
					
				
				
			}
		
		
		
		// 线路代码
		/*Collection<LwUserLineDto> userLine = blLwUserLineFacade
				.findByConditions(" userNo = '" + userNo + "'");
		if (userLine != null&&userLine.size()!=0) {
			Iterator it = userLine.iterator();
			lwUserLineDto = (LwUserLineDto) it.next();
		}else{
			throw new UserException(-7, -703, this.getClass().getName(),
			"该用户没有配置电表信息");
		}*/
		httpServletRequest.setAttribute("lwCoporationUserInfoDto",
				lwCoporationUserInfoDto);
		httpServletRequest.setAttribute("ammeter", ammeterList);
		httpServletRequest.setAttribute("lwUserLineDto", lwUserLineDto);
		httpServletRequest.setAttribute("useStyle", useStyle);
		forward = "forward";
		return actionMapping.findForward(forward);
	}

}
