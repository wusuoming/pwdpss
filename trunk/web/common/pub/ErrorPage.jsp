<%@ page contentType="text/html; charset=GBK" %>
<%@ page info = "ErrorPage.jsp -- 错误信息，李子扬，2006-09-09。" %>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="com.sinosoft.sysframework.exceptionlog.UserException"%>
<%@ page isErrorPage="true"%>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%
String strutsException = "org.apache.struts.action.EXCEPTION"; // 类型
String strCaption = "系统提示"; // 标题
String strTitle = ""; // 信息
String strContent = ""; // 内容
StringWriter stringWriter = new StringWriter();	// 输出

UserException userException = null;	// UserException
SQLException sqlException = null; // SQLException 
Exception sysException = null; // Exception 

if(request.getAttribute(strutsException) instanceof UserException){ //用户异常
	userException = (UserException) request.getAttribute(strutsException);
    strTitle += userException.getErrorMessage();
    strContent += "<table class='common' width='100%'>";
    strContent += "    <tr>";
    strContent += "        <td align='left' colspan='2' width='100%'>错误类别：" + userException.getErrorCatalog() + "</td>";
    strContent += "    </tr>";
    strContent += "    <tr>";
    strContent += "        <td align='left' colspan='2' width='100%'>错误号码：" + userException.getErrorNo() + "</td>";
    strContent += "    </tr>";
    strContent += "    <tr>";
    strContent += "        <td align='left' colspan='2' width='100%'>模块名称：" + userException.getErrorModule() + "</td>";
    strContent += "    </tr>";
    strContent += "</table>";
    
}else if(request.getAttribute(strutsException) instanceof SQLException){ //SQL异常
	sqlException = (SQLException) request.getAttribute(strutsException);
	if(sqlException.getErrorCode() == -268){
		strTitle += "SQL异常：系统正在忙，请单击鼠标右键，选择刷新，此页面重新提交即可。";
	}else{
		strTitle += "SQL异常：系统可能出现异常，请与系统管理员联系。";
	}
	sqlException.printStackTrace(new PrintWriter(stringWriter));
    strContent += "<table class='common' width='100%'>";
    strContent += "    <tr>";
    strContent += "        <td align='left' colspan='2' width='100%'>错误信息：" + stringWriter.toString() + "</td>";
    strContent += "    </tr>";
    strContent += "</table>";
    
}else{
	sysException = (Exception)request.getAttribute(strutsException);
	strTitle = sysException.getMessage();
	sysException.printStackTrace(new PrintWriter(stringWriter));
    strContent += "<table class='common' width='100%'>";
    strContent += "    <tr>";
    strContent += "        <td align='left' colspan='2' width='100%'>错误信息：" + sysException.toString() + "</td>";
    strContent += "    </tr>";
    strContent += "</table>";
}
%>
<html>
<head>
<app:css />
<script language=javascript>
	function showContent(){
	  	if(trContent.style.display=='')
	    	trContent.style.display = 'none';
	  	else
	    	trContent.style.display = '';
	}
</script>
</head>
<body class="interface">
	<table class="common" align="center" width="100%">
		<tr>
      		<td class="title0" colspan="2"><%=strCaption%></td>
    	</tr>
    	<tr>
      		<td class="common" align="center" width="30%"><img src="/iacontact/images/tanhao.gif" style="cursor:hand" alt="详细信息" onclick="showContent()"></td>
      		<td class="common" align="left" width="70%" ><%=strTitle%></td>
    	</tr>
	    <tr id="trContent" style="display:none">
	      	<td class="common" align="left" colspan="2"><pre><%=strContent%></pre></td>
	    </tr>
  </table>
</body>
</html>