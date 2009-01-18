package com.elongway.pss.ui.control.change;

/**
 * ���ۻ����ѯ Action <br>
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
		// �������� 
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

		// �õ��û�����
		String userNo = httpServletRequest.getParameter("UserNo");
		// �������
		String useStyle = httpServletRequest.getParameter("useStyle");
		String ammeterNo = httpServletRequest.getParameter("ammeterNohidden");
		// �����û���Ϣ
		lwCoporationUserInfoDto = blLwCoporationUserInfoFacade
				.findByPrimaryKey(userNo);
		// �����û�����ָ����Ϣ
		Collection factoryIndicatorList = blLwNewFactoryIndicatorFacade
				.findByConditions(" 1=1 and userNo = '" + userNo
						+ "' and statMonth = '"
						+ PowerFeeCal.getCurrentBillMonth() + "'"+" and AMMETERNO = '"+ammeterNo+"'");
		if (factoryIndicatorList != null && factoryIndicatorList.size() != 0) {
			Iterator<LwNewFactoryIndicatorDto> it = factoryIndicatorList.iterator();
			lwNewFactoryIndicatorDto = (LwNewFactoryIndicatorDto) it.next();
		} else {
			// ��û�н��������ݳ�ʼ��
			throw new UserException(-6,-702, this.getClass().getName(),"��û�н��������ݳ�ʼ��");
		}
		// ��������û�����Ӧ�����Ϣ���������ҵ��
		ammeterList = blLwAmmeterChangeFacade.findByConditions(" userNo = '"+ userNo + "'  and ammeterNo = '"+ammeterNo+"' and flag=1 order by installDate asc");
		int i = 0;
	
			for (Iterator iterator = ammeterList.iterator(); iterator.hasNext();) {
				LwAmmeterChangeDto o = (LwAmmeterChangeDto) iterator.next();
				// �������й�ָ�������
				
					o.setLastIdleNum(lwNewFactoryIndicatorDto.getLastIdleNum());
					o.setLastWorkNum(lwNewFactoryIndicatorDto.getLastWorkNum());
					
					blLwAmmeterChangeFacade.update(o);
					
				
				
			}
		
		
		
		// ��·����
		/*Collection<LwUserLineDto> userLine = blLwUserLineFacade
				.findByConditions(" userNo = '" + userNo + "'");
		if (userLine != null&&userLine.size()!=0) {
			Iterator it = userLine.iterator();
			lwUserLineDto = (LwUserLineDto) it.next();
		}else{
			throw new UserException(-7, -703, this.getClass().getName(),
			"���û�û�����õ����Ϣ");
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
