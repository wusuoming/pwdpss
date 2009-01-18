package com.elongway.pss.ui.control.common.pub;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import javax.servlet.http.*;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.struts.util.MessageResources;

import com.elongway.pss.bl.action.custom.BLSelectOptionsNameValueAction;
import com.elongway.pss.dto.custom.SelectOptionsDto;
import com.sinosoft.sysframework.common.util.StringUtils;


/** 从auCodeType数据表中根据参数CodeType得到Code的下拉框元素 */
public class SelectOptionsNameValueTag extends TagSupport{

	private static final long serialVersionUID = 1L;
	/** The para auTableCode */
    protected String auTableCode = "";
    /** The para auFieldCode */
    protected String auFieldCode = "";
    protected String auFieldNameCode = "";
    /** The para conditions */
    protected String conditions = "";

    /** The message resources for this package. */
    protected static MessageResources messages = MessageResources.getMessageResources("resources.ApplicationResources");

    /**
     * Render the beginning of the hyperlink.
     * @return int value
     * @exception JspException if a JSP exception has occurred
     */
    public int doStartTag() throws JspException{
        StringBuffer options = new StringBuffer();

        try{
            BLSelectOptionsNameValueAction blSelectOptionsNameValueAction = new BLSelectOptionsNameValueAction();
            Collection collectionSelectOptionsNameValue = blSelectOptionsNameValueAction.getSelectOptionsNameValue(
                auTableCode,auFieldCode,auFieldNameCode,conditions);

            for(Iterator i = collectionSelectOptionsNameValue.iterator();i.hasNext();){
                SelectOptionsDto selectOptionsDto = (SelectOptionsDto)i.next();
                String optionValue = StringUtils.rightTrim(selectOptionsDto.getOptionValue());
                String optionName = StringUtils.rightTrim(selectOptionsDto.getOptionName());
                options.append("<option value=\"" + optionValue + "\">" + optionName + "</option>" +
                               System.getProperty("line.separator"));
            }
        }
        catch(Exception sqlEx){
        }

        // Generate the hyperlink start element
        HttpServletResponse response = (HttpServletResponse)pageContext.getResponse();
        StringBuffer results = new StringBuffer("");
        results.append(response.encodeURL(options.toString()));
        results.append("");
        // Print this element to our output writer
        JspWriter writer = pageContext.getOut();
        try{
            writer.print(results.toString());
        }
        catch(IOException e){
            throw new JspException(messages.getMessage("errors.ioException",e.toString()));
        }
        // Evaluate the body of this tag
        return(EVAL_BODY_INCLUDE);
    }

    /**
     * Render the end of the hyperlink.
     * @return int value
     * @exception JspException if a JSP exception has occurred
     */
    public int doEndTag() throws JspException{
        // Print the ending element to our output writer
        JspWriter writer = pageContext.getOut();
        try{
            writer.print("");
        }
        catch(IOException e){
            throw new JspException(messages.getMessage("ioException",e.toString()));
        }
        return(EVAL_PAGE);
    }

    /** Release any acquired resources. */
    public void release(){
        super.release();
        this.auTableCode = null;
        this.auFieldCode = null;
        this.conditions = null;

    }

    public String getAuTableCode(){
        return auTableCode;
    }

    public void setAuTableCode(String auTableCode){
        this.auTableCode = auTableCode;
    }

    public String getAuFieldCode(){
        return auFieldCode;
    }

    public void setAuFieldCode(String auFieldCode){
        this.auFieldCode = auFieldCode;
    }

    public String getAuFieldNameCode(){
        return auFieldNameCode;
    }

    public void setAuFieldNameCode(String auFieldNameCode){
        this.auFieldNameCode = auFieldNameCode;
    }

    public String getConditions(){
        return conditions;
    }

    public void setConditions(String conditions){
        this.conditions = conditions;
    }

}