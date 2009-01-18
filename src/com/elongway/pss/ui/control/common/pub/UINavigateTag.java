package com.elongway.pss.ui.control.common.pub;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.elongway.pss.ui.view.AbstractForm;

/** Generate a URL-encoded hyperlink to the specified URI, with associated query parameters selecting a specified Plan. */
public class UINavigateTag extends TagSupport {
	private static final long serialVersionUID = 1L;
	/** The context-relative URI. */
	protected String page = null;
	/** The key of the session-scope bean we look for. */
	private String name = "formBean";
	private String hasCheckbox = null;
	private String rgrade = "";
	private String wgrade = "";
	private String xgrade = "";
	private String LINE_SEPARATOR = System.getProperty("line.separator");
	private StringBuffer results = null;
	/**
	 * Render the beginning of the hyperlink.
	 * @return int
	 * @exception JspException if a JSP exception has occurred
	 */
	public int doStartTag() throws JspException {
		// Generate the URL to be encoded
		HttpServletRequest request =
			(HttpServletRequest) pageContext.getRequest();
		String formName = getName();
		hasCheckbox = getHasCheckbox();

		//取得员工任务权限取值，对读写权限做判断
		//读权限控制查询、全选、全不选按钮
		//写权限控制新增、修改、删除、注销、恢复、注销按钮
		//        String rgrade = (String)request.getAttribute("rgrade");
		String wgrade = (String) request.getAttribute("wgrade");
		//        String xgrade = (String)request.getAttribute("xgrade");
		if (wgrade == null) {
			wgrade = "";
		}

		AbstractForm abstractForm =
			(AbstractForm) request.getAttribute(formName);
		int rowsCount = abstractForm.getRowsCount();
		int firstRow = 0;
		int lastRow = 0;
		int currentPage = 0;
		int pagesCount = 0;
		int tempCount = rowsCount;
		if (rowsCount > 0) {
			currentPage = abstractForm.getPageNo();
		}
		while (tempCount > 0) {
			tempCount = tempCount - abstractForm.getRowsPerPage();
			pagesCount++;
		}
		if (currentPage > 0) {
			firstRow =
				abstractForm.getRowsPerPage() * (abstractForm.getPageNo() - 1)
					+ 1;
		}
		if (currentPage < pagesCount) {
			lastRow = firstRow + abstractForm.getRowsPerPage() - 1;
		} else {
			lastRow = abstractForm.getRowsCount();
		}
		//---------Added by xumingjie.-----------------------------
		if(firstRow > rowsCount)
		{
		    firstRow = firstRow - abstractForm.getRowsPerPage();
		}
		//---------------------------------------------------------
		results = new StringBuffer();
		writeLine(
			"    <input type=hidden name=pagesCount value=" + pagesCount + ">");
		writeLine("    <table class=common align=center cellspacing='0' cellpadding='5'>");
		writeLine("        <tr class=navigaterow>");
		writeLine(
			"          <td colspan=4 align=center>共"
				+ rowsCount
				+ "条，列出"
				+ firstRow
				+ "条到第"
				+ lastRow
				+ "条</td>");
		writeLine("          <td colspan=4 align=center>");
		writeLine("          	<img src='/piccaudit/common/images/shouye.gif' onclick=\"locate(1)\" style='cursor: hand'>&nbsp;&nbsp;");
		writeLine(
			"          	<img src='/piccaudit/common/images/shangye.gif' onclick=\"locate("
				+ (currentPage - 1)
				+ ")\" style='cursor: hand'>&nbsp;&nbsp;");
		writeLine(
			"          	<img src='/piccaudit/common/images/xiaye.gif' onclick=\"locate("
				+ (currentPage + 1)
				+ ")\" style='cursor: hand'>&nbsp;&nbsp;");
		writeLine(
			"          	<img src='/piccaudit/common/images/weiye.gif' onclick=\"locate("
				+ pagesCount
				+ ")\" style='cursor: hand'>&nbsp;&nbsp;");
		if (wgrade.trim().equals("1")) {
			if (hasCheckbox.equalsIgnoreCase("true")) {
				writeLine("          	<img src='/piccaudit/common/images/quanxuan.gif' onclick=\"setCheckboxSelectStatus(true);\" style='cursor: hand'>&nbsp;&nbsp;");
				writeLine("          	<img src='/piccaudit/common/images/quanbuxuan.gif' onclick=\"setCheckboxSelectStatus(false);\" style='cursor: hand'>");
			}
		}
		writeLine("          </td>");
		writeLine("          <td colspan=4 align=\"center\">");
		writeLine(
			"          	第" + currentPage + "/" + pagesCount + "页&nbsp; 转到");
		writeLine("          	<input class='common' name=newPageNo size=3>页");
		writeLine("          	<img src='/piccaudit/common/images/go.gif' onclick=\"goPage()\" style='cursor: hand' align='absmiddle'>");
		writeLine("          </td>");
		writeLine("        </tr>");
		writeLine("   </table>");
		writeLine("");
		writeLine("<script language=\"javascript\">");
		writeLine("    function locate(pageNo){");
		writeLine("        if(pageNo<1){");
		writeLine("            alert(\"已到第一页\");");
		writeLine("            return;");
		writeLine("        }");
		writeLine(
			"        if(pageNo>parseInt(" + formName + ".pagesCount.value)){");
		writeLine("            alert(\"已到最后一页\");");
		writeLine("            return;");
		writeLine("        }");
		writeLine("        if(pageNo==" + currentPage + "){");
		writeLine("            return;");
		writeLine("        }");
		writeLine("");
		writeLine("        " + formName + ".pageNo.value=pageNo;");
		writeLine("        " + formName + ".submit();");
		writeLine("    }");
		writeLine("    function goPage(){");
		writeLine(
			"        var pageNo=parseInt(" + formName + ".newPageNo.value);");
		writeLine("        if(isNaN(pageNo)){");
		writeLine("            pageNo=1;");
		writeLine("        }");
		writeLine(
			"        if(pageNo>parseInt(" + formName + ".pagesCount.value)){");
		writeLine("            alert(\"无法定位到第\" + pageNo + \"页\");");
		writeLine("            return;");
		writeLine("        }");
		writeLine("        locate(pageNo);");
		writeLine("    }");
		writeLine("        function setCheckboxSelectStatus(value){");
		writeLine("            var count = getElementCount('checkboxSelect');");
		writeLine("            if(count==1){");
		writeLine("                if(fm.checkboxSelect.disabled==false){");
		writeLine("                    fm.checkboxSelect.checked=value;");
		writeLine("                }");
		writeLine("            }");
		writeLine("            else{");
		writeLine("                for(var i=0;i<fm.checkboxSelect.length;i++){");
		writeLine("                    if(fm.checkboxSelect[i].disabled==false){");
		writeLine("                        fm.checkboxSelect[i].checked=value;");
		writeLine("                    }");
		writeLine("                }");
		writeLine("            }");
		writeLine("        }");
		writeLine("</script>");

		//        results.append(response.encodeURL(url.toString()));
		//        results.append("\">");
		// Print this element to our output writer
		JspWriter writer = pageContext.getOut();
		try {
			writer.print(results.toString());
		} catch (IOException e) {
			throw new JspException(e.toString());
		}
		// Evaluate the body of this tag
		return (EVAL_BODY_INCLUDE);
	}

	/**
	 * Render the end of the hyperlink.
	 * @return int
	 * @exception JspException if a JSP exception has occurred
	 */
	public int doEndTag() throws JspException {
		return (EVAL_PAGE);
	}

	/** Release any acquired resources. */
	public void release() {
		super.release();
		this.page = null;
		this.name = "formBean";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
    public String getRgrade()
    {
        return rgrade;
    }
    public void setRgrade(String rgrade)
    {
        this.rgrade = rgrade;
    }
    public String getWgrade()
    {
        return wgrade;
    }
    public void setWgrade(String wgrade)
    {
        this.wgrade = wgrade;
    }
    public String getXgrade()
    {
        return xgrade;
    }
    public void setXgrade(String xgrade)
    {
        this.xgrade = xgrade;
    }
    
	public void setHasCheckbox(String hasCheckbox) {
		this.hasCheckbox = hasCheckbox;
	}

	public String getHasCheckbox() {
		return hasCheckbox;
	}

	private void writeLine(String value) {
		results.append(value);
		results.append(LINE_SEPARATOR);
	}
}