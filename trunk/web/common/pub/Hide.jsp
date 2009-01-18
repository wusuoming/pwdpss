<%@ page contentType="text/html; charset=GBK" %>

<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<script type="text/javascript" language="Javascript">
    function loadForm(){
		var fm = logonForm;
   		
		//关于菜单的显示
		//parent.fraTitle.titleMenu.style.display = "";
		//parent.fraTitle.titleInfo.style.display = "";
		//parent.fraTitle.titleLogo.style.display = "";
		//parent.fraTitle.tbLoginBg.style.display="none";
		
		parent.fraMain.rows= "80,*";
		parent.fraSet.cols = "194,0%,*";
		
		parent.fraTitle.window.location="common/pub/Title.jsp";
		parent.fraMenu.window.location="common/pub/MainMenu.jsp";

		parent.fraInterface.window.location="queryIAContactList.do?menuflag=view&firstquery=1";
		
	}
</script>

<html:html locale="true">
	<head>
		<title></title>
		<link rel='stylesheet' type='text/css' href='../../css/Standard.css'>
	</head>
	<body onload="loadForm()">
		<html:errors />
		<html:form action="/logon">
			<html:hidden property="userGrade" />
			<html:hidden property="userCode" />
			<html:hidden property="userName" />
			<html:hidden property="cssStyle" />
		</html:form>
	</body>
</html:html>