package com.elongway.pss.ui.control.iacontact;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.struts.config.ModuleConfig;
import org.apache.struts.util.MessageResources;
import org.apache.struts.util.ResponseUtils;

import com.elongway.pss.dto.domain.IAContactDto;

/** Generate a URL-encoded hyperlink to the specified URI, with associated query parameters selecting a specified Policy. */
public class UILinkIAContactTag extends TagSupport{
    /**
	 * 
	 */
	private static final long serialVersionUID = -752059284071560296L;
	/** The context-relative URI. */
    protected String page = null;
    protected String rgrade = "";
protected String wgrade = "";
protected String xgrade = "";


    /** The message resources for this package. */
    protected static MessageResources messages = MessageResources.getMessageResources("resources.ApplicationResources");

    /** The attribute name. */
    private String name = "dto";


    /**
     * Render the beginning of the hyperlink.
     * @return intvalue
     * @exception JspException if a JSP exception has occurred
     */
    public int doStartTag() throws JspException{
        // Generate the URL to be encoded
        ModuleConfig config = (ModuleConfig)pageContext.getRequest().getAttribute(org.apache.struts.Globals.MODULE_KEY);
        HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
        StringBuffer url = new StringBuffer(request.getContextPath());
        url.append(config.getPrefix());
        url.append(page);

        IAContactDto iaContactDto = null;
        try{
        	iaContactDto = (IAContactDto)pageContext.findAttribute(name);
        }
        catch(ClassCastException e){
        	iaContactDto = null;
        }
        if(iaContactDto == null){
            throw new JspException(messages.getMessage("error.linkPaperType.noPolicy",name));
        }
        if(page.indexOf("?") < 0){
            url.append("?");
        }
        else{
            url.append("&");
        }
        url.append("keyContactNo=");
        url.append(ResponseUtils.filter(iaContactDto.getContactNo()));
       

        // Generate the hyperlink start element
        HttpServletResponse response = (HttpServletResponse)pageContext.getResponse();
        StringBuffer results = new StringBuffer("<a href=\"");
        results.append(response.encodeURL(url.toString()));
        results.append("\">");
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
     * @return intvalue
     * @exception JspException if a JSP exception has occurred
     */
    public int doEndTag() throws JspException{
        // Print the ending element to our output writer
        JspWriter writer = pageContext.getOut();
        try{
            writer.print("</a>");
        }
        catch(IOException e){
            throw new JspException(messages.getMessage("ioException",e.toString()));
        }
        return(EVAL_PAGE);
    }

    /** Release any acquired resources. */
    public void release(){
        super.release();
        this.page = null;
        this.name = "dto";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPage(){
        return page;
    }

    public void setPage(String page){
        this.page = page;
    }


}