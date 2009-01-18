<%@ page contentType="text/html; charset=GBK" %>
<%@ page info = "ErrorPage.jsp -- ������Ϣ�������2006-09-09��" %>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="com.sinosoft.sysframework.exceptionlog.UserException"%>
<%@ page isErrorPage="true"%>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%
String strutsException = "org.apache.struts.action.EXCEPTION"; // ����
String strCaption = "ϵͳ��ʾ"; // ����
String strTitle = ""; // ��Ϣ
String strContent = ""; // ����
StringWriter stringWriter = new StringWriter();	// ���

UserException userException = null;	// UserException
SQLException sqlException = null; // SQLException 
Exception sysException = null; // Exception 

if(request.getAttribute(strutsException) instanceof UserException){ //�û��쳣
	userException = (UserException) request.getAttribute(strutsException);
    strTitle += userException.getErrorMessage();
    strContent += "<table class='common' width='100%'>";
    strContent += "    <tr>";
    strContent += "        <td align='left' colspan='2' width='100%'>�������" + userException.getErrorCatalog() + "</td>";
    strContent += "    </tr>";
    strContent += "    <tr>";
    strContent += "        <td align='left' colspan='2' width='100%'>������룺" + userException.getErrorNo() + "</td>";
    strContent += "    </tr>";
    strContent += "    <tr>";
    strContent += "        <td align='left' colspan='2' width='100%'>ģ�����ƣ�" + userException.getErrorModule() + "</td>";
    strContent += "    </tr>";
    strContent += "</table>";
    
}else if(request.getAttribute(strutsException) instanceof SQLException){ //SQL�쳣
	sqlException = (SQLException) request.getAttribute(strutsException);
	if(sqlException.getErrorCode() == -268){
		strTitle += "SQL�쳣��ϵͳ����æ���뵥������Ҽ���ѡ��ˢ�£���ҳ�������ύ���ɡ�";
	}else{
		strTitle += "SQL�쳣��ϵͳ���ܳ����쳣������ϵͳ����Ա��ϵ��";
	}
	sqlException.printStackTrace(new PrintWriter(stringWriter));
    strContent += "<table class='common' width='100%'>";
    strContent += "    <tr>";
    strContent += "        <td align='left' colspan='2' width='100%'>������Ϣ��" + stringWriter.toString() + "</td>";
    strContent += "    </tr>";
    strContent += "</table>";
    
}else{
	sysException = (Exception)request.getAttribute(strutsException);
	strTitle = sysException.getMessage();
	sysException.printStackTrace(new PrintWriter(stringWriter));
    strContent += "<table class='common' width='100%'>";
    strContent += "    <tr>";
    strContent += "        <td align='left' colspan='2' width='100%'>������Ϣ��" + sysException.toString() + "</td>";
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
      		<td class="common" align="center" width="30%"><img src="/iacontact/images/tanhao.gif" style="cursor:hand" alt="��ϸ��Ϣ" onclick="showContent()"></td>
      		<td class="common" align="left" width="70%" ><%=strTitle%></td>
    	</tr>
	    <tr id="trContent" style="display:none">
	      	<td class="common" align="left" colspan="2"><pre><%=strContent%></pre></td>
	    </tr>
  </table>
</body>
</html>