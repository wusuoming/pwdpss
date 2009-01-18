<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%
    String message = (String)request.getAttribute("message");
    if(message==null){
        message = "";
    }
%>
<html>
	<head>
		<title>Message</title>
	</head>
	<body>
		<html:errors />
	    <h4><font class=info><%=message%></font></h4>
	</body>

</html>