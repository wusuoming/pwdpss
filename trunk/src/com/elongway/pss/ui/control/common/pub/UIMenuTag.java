package com.elongway.pss.ui.control.common.pub;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.struts.util.ResponseUtils;

/** Generate a URL-encoded hyperlink to the specified URI, with associated query parameters selecting a specified Plan. */
public class UIMenuTag extends TagSupport{
	private static final long serialVersionUID = 1L;
    /** The context-relative URI. */
    protected String page = null;
    /** The key of the session-scope bean we look for. */
    String rgrade = "";
    String wgrade = "";
    String xgrade = "";
    String target = "";
    //private String LINE_SEPARATOR = System.getProperty("line.separator");
    //private StringBuffer results = null;
    /**
     * Render the beginning of the hyperlink.
     * @return int
     * @exception JspException if a JSP exception has occurred
     */
    public int doStartTag() throws JspException{
        // Generate the URL to be encoded
        HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
        StringBuffer url = new StringBuffer(request.getContextPath());
//        url.append(config.getPrefix());
        url.append(page);
        String rgrade = getRgrade();
        String wgrade = getWgrade();
        String xgrade = getXgrade();
        String target = getTarget();

        if(page.indexOf("?") < 0){
            url.append("?");
        }
        else{
            url.append("&");
        }
        url.append("rgrade=");
        url.append(ResponseUtils.filter(rgrade));
        url.append("&wgrade=");
        url.append(ResponseUtils.filter(wgrade));
        url.append("&xgrade=");
        url.append(ResponseUtils.filter(xgrade));
        // Generate the hyperlink start element
        HttpServletResponse response = (HttpServletResponse)pageContext.getResponse();
        StringBuffer results = new StringBuffer("<a href=\"");
        results.append(response.encodeURL(url.toString()));
        results.append("\" target=\"");
        results.append(target);
        results.append("\" class='menu'>");
       // Print this element to our output writer
        JspWriter writer = pageContext.getOut();
        try{
            writer.print(results.toString());
        }
        catch(IOException e){
            throw new JspException(e.toString());
        }
        // Evaluate the body of this tag
        return(EVAL_BODY_INCLUDE);
    }

    /**
     * Render the end of the hyperlink.
     * @return int
     * @exception JspException if a JSP exception has occurred
     */
    public int doEndTag() throws JspException{
        // Print the ending element to our output writer
        JspWriter writer = pageContext.getOut();
        try{
            writer.print("</a>");
        }
        catch(IOException e){
            throw new JspException(e.toString());
        }
        return(EVAL_PAGE);
    }

    /** Release any acquired resources. */
    public void release(){
        super.release();
        this.page = null;
    }

    public String getPage(){
        return page;
    }

    public void setPage(String page){
        this.page = page;
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

    public void setTarget(String target){
        this.target = target;
    }

    public String getTarget(){
        return target;
    }
}
