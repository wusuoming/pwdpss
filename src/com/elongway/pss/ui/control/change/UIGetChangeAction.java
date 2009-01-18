package com.elongway.pss.ui.control.change;

/**
 * 换表查询 Action <br>
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
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwUserAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIGetChangeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		BLLwPowerUserFacade bLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		BLLwTownIndicatorFacade blLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		BLLwBookUserFacade blLwBookUserFacade = new BLLwBookUserFacade();
		BLLwUserLineFacade blLwUserLineFacade = new BLLwUserLineFacade();
		String forward = null;
		String condition = null;
		Collection ammeterList = null;				
		LwPowerUserDto lwPowerUserDto = null;
		LwBookUserDto lwBookUserDto = null;
		LwUserLineDto lwUserLineDto = null;
		LwTownIndicatorDto lwTownIndicatorDto = null;
		
		// 得到用户代码
		String userNo = httpServletRequest.getParameter("chooseUser");
		// 查找用户信息
		lwPowerUserDto = bLwPowerUserFacade.findByPrimaryKey(userNo);
		// 查找用户上月指针信息
		Collection townIndicatorList = blLwTownIndicatorFacade.findByConditions(" 1=1 and userNo = '"+userNo+"' and statMonth = '"+PowerFeeCal.getCurrentBillMonth()+"'");
		if (townIndicatorList!=null&&townIndicatorList.size()!=0) {
			Iterator<LwTownIndicatorDto>it = townIndicatorList.iterator();
			lwTownIndicatorDto = (LwTownIndicatorDto) it.next();
		}else{
			throw new UserException(-6,-705,this.getClass().getName(),"该用户还没有进行指针初始化，请先进行指针初始化");
		}
		// 查找用户所对应电表信息
		ammeterList = blLwAmmeterChangeFacade.findByConditions(" userNo = '"+userNo+"' order by installDate asc");
		int i = 0;
		if(ammeterList == null||ammeterList.size()==0){
			throw new UserException(-7,-703,this.getClass().getName(),"该用户没有配置电表信息");
		}else{
			for (Iterator iterator = ammeterList.iterator(); iterator
					.hasNext();) {
				
				LwAmmeterChangeDto o = (LwAmmeterChangeDto) iterator.next();
				// 将上月有功指针带过来
				if(AppConst.CURRENT_AMMETER_FLAG.equals(o.getFlag())){
				o.setLastWorkNum(lwTownIndicatorDto.getLastWorkNum());
				blLwAmmeterChangeFacade.update(o);
				break;
				}
				i++;
			}
		}
		// 表本信息
		Collection bookList = blLwAmmeterBookFacade.findByConditions(" 1=1 ");
		// 所在表本
		Collection <LwBookUserDto>colleciton = blLwBookUserFacade.findByConditions(" userNo = '"+userNo+"'");
		if (colleciton!=null) {
			Iterator<LwBookUserDto>it = colleciton.iterator();
		 lwBookUserDto = (LwBookUserDto) it.next();
		}
		// 线路代码
//		Collection <LwUserLineDto>userLine = blLwUserLineFacade.findByConditions(" userNo = '"+userNo+"'");
//		if (userLine!=null) {
//			Iterator it = userLine.iterator();
//			lwUserLineDto = (LwUserLineDto) it.next();
//		}
		httpServletRequest.setAttribute("lwPowerUserDto",lwPowerUserDto );
		httpServletRequest.setAttribute("ammeter",ammeterList );
		httpServletRequest.setAttribute("bookList",bookList );
		httpServletRequest.setAttribute("lwBookUserDto", lwBookUserDto);
//		httpServletRequest.setAttribute("lwUserLineDto", lwUserLineDto);
		forward = "forward";
		return actionMapping.findForward(forward);
	}

	
}
