package com.elongway.pss.ui.dataInput;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterBookFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwBookUserFacade;
import com.elongway.pss.bl.facade.BLLwDcodeFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.exceptionlog.UserException;


/**
 * ֱ�������������� Action <br>
 * ���㡢����
 * 
 * @author ������ add
 * @version 1.0 2008-10-25
 */
public class UIListBookTownCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		// ��������
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		String forword = "";
		String condition = "";
		LwPowerUserDto lwPowerUserDto = null;
		Collection <LwAmmeterChangeDto> changeList = null;

		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		BLLwTownIndicatorFacade blLWTownIndicatorFacade = new BLLwTownIndicatorFacade();
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		BLLwBookUserFacade blLwBookUserFacade = new BLLwBookUserFacade();
		LwAmmeterChangeDto lwAmmeterChangeDto = null;
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		LwAmmeterBookDto lwAmmeterBookDto = null;
		// ������
		String bookNo = httpServletRequest.getParameter("bookNo");
		lwAmmeterBookDto = blLwAmmeterBookFacade.findByPrimaryKey(bookNo);
		String statMonth = PowerFeeCal.getCurrentBillMonth();
		
		// �õ��ñ����õ��û��б�        
		Collection <LwBookUserDto>bookUserList = blLwBookUserFacade.findByConditions("bookNo = '" + bookNo + "' order by userno asc");
		// ���ձ����õ��û��б����ҵ���ָ���¼��
		int bint = bookUserList.size();
		if(bookUserList==null||bint==0){
			throw new UserException(-6,-711,this.getClass().getName());
		}
		condition = " 1=1 "+getBookNoCondition(bookUserList);
		Collection <LwTownIndicatorDto>userIndicatorList = blLWTownIndicatorFacade.findByConditions("statMonth='"+statMonth+"' and "+condition);
		int dint = userIndicatorList.size();
		if(userIndicatorList== null||dint==0){
			throw new UserException(-6,-705,this.getClass().getName(),"��û�н���ָ���ʼ��");
		}
		Collection<LwTownIndicatorDto> userList = new ArrayList<LwTownIndicatorDto>();
		for (Iterator iterator = userIndicatorList.iterator(); iterator
				.hasNext();) {
			LwTownIndicatorDto o1 = (LwTownIndicatorDto) iterator.next();
			String userNo = o1.getUserNo();
			changeList = blLwAmmeterChangeFacade.findByConditions(" userNo = '"+o1.getUserNo()+"' and flag = '1'");
			if(changeList!=null&changeList.size()!=0){
				Iterator it =  changeList.iterator();
				lwAmmeterChangeDto = (LwAmmeterChangeDto)it.next();
				o1.setAmmeterNo(lwAmmeterChangeDto.getAmmeterNo());
			}
			lwPowerUserDto = blLwPowerUserFacade.findByPrimaryKey(userNo);
			o1.setUserName(lwPowerUserDto.getUserName());
		}
		
		int indiCount = userIndicatorList.size();
		int bookUserCount = bookUserList.size();
//		if(indiCount<bookUserCount){
//			throw new UserException(-6,-706,this.getClass().getName(),"�˱����������û���û�н���ָ���ʼ����");
//		}
		httpServletRequest.setAttribute("userList", userIndicatorList);
		httpServletRequest.setAttribute("statMonth", statMonth);
		httpServletRequest.setAttribute("lwAmmeterBookDto", lwAmmeterBookDto);
		forword = "townInputSuccess";

		return actionMapping.findForward(forword);
	}
	/**
	 * ��֯����UserNo����
	 * @param bookUserList
	 * @return
	 */
	public String getBookNoCondition(Collection <LwBookUserDto>bookUserList){
		StringBuffer buffer = new StringBuffer();
		buffer.append(" and userNO in ( ");
		for (Iterator iterator = bookUserList.iterator(); iterator.hasNext();) {
			LwBookUserDto lwBookUserDto = (LwBookUserDto) iterator.next();
			buffer.append("'").append(lwBookUserDto.getUserNo()).append("'");
			buffer.append(",");
		}
		buffer.deleteCharAt(buffer.length()-1);
		buffer.append(" ) ");
		return buffer.toString();
	}
	public static void main(String []args){

		BigDecimal big = new BigDecimal("2222222222");
		BigDecimal value = null;
		value = big.multiply(BigDecimal.valueOf(0.7787));
		
	}
}
