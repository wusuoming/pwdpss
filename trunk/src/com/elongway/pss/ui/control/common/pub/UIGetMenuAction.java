package com.elongway.pss.ui.control.common.pub;

import java.util.Collection;
import javax.servlet.http.*;

import org.apache.struts.action.*;

import com.elongway.pss.ui.control.common.pub.User;

/**
 * LZY: 未使用！
 * 得到菜单
 * <p>Title: PICCAUDIT</p>
 * <p>Description: PICC计算机辅助审计系统程序</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>@createdate: 2003-06-14</p>
 * @author zhouxianli
 * @version 1.0
 */
public class UIGetMenuAction extends Action{
    /**
     * 执行方法，由Struts主动调用
     * @param actionMapping actionMapping
     * @param actionForm actionForm
     * @param httpServletRequest http请求
     * @param httpServletResponse http响应
     * @return ActionForward
     * @throws UserException
     * @throws Exception
     */
    public ActionForward execute(ActionMapping actionMapping,ActionForm actionForm,
                                 HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws
        Exception{
        //MenuForm menuForm = new MenuForm();

        HttpSession session = httpServletRequest.getSession();
        User user = (User)session.getAttribute("user");
        String userCode = user.getUserCode();
        System.err.println("=================Menu_userCode:" + userCode);

        Collection checklist = user.getCheckList();
//        BLUserGradeAction blUserGradeAction = new BLUserGradeAction();
        httpServletRequest.setAttribute("checklist",checklist);

        return(actionMapping.findForward("Success"));
    }

}