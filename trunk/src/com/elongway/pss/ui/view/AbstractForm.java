package com.elongway.pss.ui.view;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.sinosoft.sysframework.reference.AppConfig;

public class AbstractForm extends ActionForm
{
	private static final long serialVersionUID = 1L;
    private String action;
    private String rgrade;
    private String wgrade;
    private String xgrade;
    private int pageNo;
    private int rowsCount;
    private int rowsPerPage;
    private String type;
    private String codeDescription;
    private String actionType;
    
    public AbstractForm()
    {
        pageNo = 1;
        rowsCount = 0;
        try{
        rowsPerPage = Integer.parseInt(AppConfig.get("SysConfig.ROWS_PERPAGE"));
        }catch(Exception e){
        	
        }
        
    }

    public void setAction(String action){
        this.action = action;
    }

    public String getAction(){
        return action;
    }

    public void setRgrade(String rgrade){
        this.rgrade = rgrade;
    }

    public String getRgrade(){
        return rgrade;
    }

    public void setWgrade(String wgrade){
        this.wgrade = wgrade;
    }

    public String getWgrade(){
        return wgrade;
    }

    public void setXgrade(String xgrade){
        this.xgrade = xgrade;
    }

    public String getXgrade(){
        return xgrade;
    }

    public void setPageNo(int pageNo){
        this.pageNo = pageNo;
    }

    public int getPageNo(){
        return pageNo;
    }

    public void setRowsCount(int rowsCount){
        this.rowsCount = rowsCount;
    }

    public int getRowsCount(){
        return rowsCount;
    }

    public void setRowsPerPage(int rowsPerPage){
        this.rowsPerPage = rowsPerPage;
    }

    public int getRowsPerPage(){
        return rowsPerPage;
    }

    public ActionErrors validate(ActionMapping actionMapping,HttpServletRequest httpServletRequest){
        /**@todo: finish this method, this is just the skeleton.*/
        return null;
    }

    public void reset(ActionMapping actionMapping,HttpServletRequest httpServletRequest){
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getCodeDescription(){
        return codeDescription;
    }

    public void setCodeDescription(String codeDescription){
        this.codeDescription = codeDescription;
    }
    public String getActionType(){
       return actionType;
   }

   public void setActionType(String actionType){
       this.actionType = actionType;
   }

}