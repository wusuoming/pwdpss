package com.elongway.pss.ui.control.maintenance;

/**
 *用户信息维护 Action <br>
 * 增加
 * 
 * @author 王荣佳
 * @version 1.0 2008-10-07
 */

import java.util.Collection;
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
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;

public class UIQueryLWProrateAppendAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// 声明变量
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		String condition = null;
		// 组织条件
		condition = this.generateCondition(httpServletRequest);
		BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
		BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
		Collection bookList = blLwAmmeterBookFacade.findByConditions(" 1=1 ");
		Collection townList = blLwDcodeFacade
				.findByConditions(" codetype = 'TownCode'");
		Collection<LwPowerUserDto> powerUserList = blLwPowerUserFacade
				.findByConditions(condition);
		Collection<LwDcodeDto> comList = blLwDcodeFacade
				.findByConditions(" codetype = 'SupplyCom'");
		for (Iterator iterator = powerUserList.iterator(); iterator.hasNext();) {
			LwPowerUserDto lwPowerUserDto = (LwPowerUserDto) iterator.next();
			for (Iterator iterator2 = townList.iterator(); iterator2.hasNext();) {
				LwDcodeDto o = (LwDcodeDto) iterator2.next();
				if (lwPowerUserDto.getTownCode().equals(o.getCodeCode())) {
					lwPowerUserDto.setTownName(o.getCodeCName());
					break;
				}
			}
			for (Iterator iterator3 = comList.iterator(); iterator3.hasNext();) {
				LwDcodeDto o = (LwDcodeDto) iterator3.next();
				if (lwPowerUserDto.getSuperClass().equals(o.getCodeCode())) {
					lwPowerUserDto.setCompany(o.getCodeCName());
					break;
				}
			}
		}
		String firstquery = httpServletRequest.getParameter("firstquery");
		httpServletRequest.setAttribute("powerUser", powerUserList);
		httpServletRequest.setAttribute("bookList", bookList);
		return actionMapping.findForward("QueryLWPowerUser");
	}

	/**
	 * 组织查询条件 qiaoyouliang add 2008-11-03 支持模糊查询
	 * 
	 * @param httpServletRequest
	 * @return
	 */
	public String generateCondition(HttpServletRequest httpServletRequest)
			throws Exception {
		String userNo = httpServletRequest.getParameter("UserNo");
		String userName = httpServletRequest.getParameter("UserName");
		String address = httpServletRequest.getParameter("Address");
		String townCode = httpServletRequest.getParameter("TownCode");
		String bookNo = httpServletRequest.getParameter("bookNo");
		String firstquery = httpServletRequest.getParameter("firstquery");

		StringBuffer buffer = new StringBuffer();
		buffer.append(" 1=1 ");
		// 支持模糊查询
		if (userNo != null && !"".equals(userNo)) {
			buffer.append(" and ").append(" UserNo like '%").append(
					userNo.trim()).append("%'");
		}
		if (userName != null && !"".equals(userName)) {
			buffer.append(" and ").append(" UserName like '%").append(
					userName.trim()).append("%'");
		}
		if (address != null && !"".equals(address)) {
			buffer.append(" and ").append(" address like '%").append(
					address.trim()).append("%'");
		}
		if (firstquery == null) {
			if ((bookNo != null && !"".equals(bookNo))) {
				Collection list = new BLLwBookUserFacade()
						.findByConditions("bookNo = '" + bookNo.trim() + "'");
				String bookStr = "";
				if (list.size() > 0) {
					bookStr = getBookNoCondition(list);
				} else {
					bookStr = " and 1=0";
				}
				buffer.append(bookStr);
				httpServletRequest.setAttribute("bookNo", bookNo);
			}
		} else {
			buffer.append(" and towncode = 'gcx'");
		}
		return buffer.toString();

	}

	public String getBookNoCondition(Collection<LwBookUserDto> bookUserList) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(" and userNO in ( ");
		for (Iterator iterator = bookUserList.iterator(); iterator.hasNext();) {
			LwBookUserDto lwBookUserDto = (LwBookUserDto) iterator.next();
			buffer.append("'").append(lwBookUserDto.getUserNo()).append("'");
			buffer.append(",");
		}
		buffer.deleteCharAt(buffer.length() - 1);
		buffer.append(" ) ");
		return buffer.toString();
	}
}
