<%@ page contentType="text/html; charset=GBK" %>

<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:html xhtml="true" locale="true">
	<head>
	    <title>农电计费系统</title>
	    <script language="javascript">
	    <!--
	         if (self!=top){top.location=self.location;}
	         var intPageWidth=screen.availWidth;
	         var intPageHeight=screen.availHeight;
	         window.resizeTo(intPageWidth,intPageHeight);
	         window.focus();
	     // -->
	    </script>	 	
	</head>
	<frameset name="fraMain" rows="0,*" frameborder="no" border="1" framespacing="0">
	    <frame name="fraTitle"  scrolling="no" noresize src="/iacontact/common/pub/Title.jsp" >
		<frameset name="fraSet" cols="0,0,*" frameborder="no" border="1" framespacing="0" rows="*">
			<frame name="fraMenu" scrolling="auto" noresize src="about:blank">
			<frame name="fraSubMenu" scrolling="auto" noresize src="about:blank">
			<frameset name="fraRight" rows="100%,0%,0%,0%,0%,0%" frameborder="no" border="1" framespacing="0" rows="*">
				<frame id="fraInterface" name="fraInterface" scrolling="auto" src="/iacontact/common/pub/Logon.jsp">
				<frame id="fraPaper" name="fraPaper" scrolling="yes" src="about:blank">
				<frame id="fraQuery" name="fraQuery" scrolling="auto" src="about:blank">
				<frame id="fraQueryResult" name="fraQueryResult" scrolling="auto" src="about:blank">
				<frame id="fraNext" name="fraNext" scrolling="auto" src="about:blank">
				<frame id="fraCode" name="fraCode" scrolling="auto" noresize src="about:blank">
			</frameset>
	    </frameset>
  	</frameset>
  	<noframes>
    	<body bgcolor="#FFFFFF" text="#000000">
    	</body>
  	</noframes>
</html:html>