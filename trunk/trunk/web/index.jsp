<%@ page contentType="text/html;  charset=GBK" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%
  // Put a Locale object in the user's
  // session describing the Locale that
  // is specified by the browser's language preference (obtained via http header).
  String lang = request.getHeader("Accept-Language");
  boolean headerSuccess = false;
  if (lang != null)
  {
    if (lang.length() >= 2)
    {
      //session.putValue(org.apache.struts.action.Action.LOCALE_KEY, new java.util.Locale(lang.substring(0, 2), "") );
      headerSuccess = true;
    }
  }

  if (!headerSuccess)
  {
    out.println("Header 'Accept-Language' either not found or has no recognisable value.");
    return;
  }
%>
<!-- ======================== Added By XuMJ Start =================================== -->
<%
	//session.setAttribute("FROM_PAGE", "IndexPage");
%>
<!-- ======================== Added By XuMJ End   =================================== -->

<jsp:forward page="common/pub/MainFrame.jsp"/>