package com.elongway.pss.ui.view.common;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.sinosoft.sysframework.web.view.AbstractForm;
import java.util.Collection;

public class MenuForm extends AbstractForm{
	private static final long serialVersionUID = 1L;
    private Collection checkList; //用于存放用户权限

    public Collection getCheckList(){
        return checkList;
    }

    public void setCheckList(Collection checkList){
        this.checkList = checkList;
    }

    public ActionErrors validate(ActionMapping actionMapping,HttpServletRequest httpServletRequest){
        /**@todo: finish this method, this is just the skeleton.*/
        return null;
    }

    public void reset(ActionMapping actionMapping,HttpServletRequest httpServletRequest){
    }
}