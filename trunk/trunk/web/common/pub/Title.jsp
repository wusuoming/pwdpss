<%@ page contentType="text/html; charset=GBK" %>
<%@ page info = "Title.jsp -- Title页面，应丹, 李子扬，2006-09-16。1. 显示服务器时间.2. 显示登录用户名." 
%>

<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.elongway.pss.ui.control.common.pub.SysUser" %>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%
	// 当前日期
	Date currentDate = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	// 登录用户
	SysUser sysUser = (SysUser) session.getAttribute("sysUser");
	String userCode = "";
	if(sysUser != null ){
		userCode = sysUser.getUserCode();
	}
%>

<script language="JavaScript">
//显示或隐藏主菜单
function showHideMenuFrame(){
	if(fm.mainMenu.value=="show"){
		parent.fraSet.cols = "0%,0%,*";
		menuPowerImage.src = "../../images/imgopenmenu.gif";
		fm.mainMenu.value = "hide";
		
    }else if(fm.mainMenu.value=="hide"){
		parent.fraSet.cols = "194,0%,*";
		menuPowerImage.src = "../../images/btnclosemenu.gif";
		fm.mainMenu.value = "show";
    }
}

function loadForm(){
	document.styleSheets[0].href="../../css/Standard.css";
}
</script>

<html:html>
<head>
	<app:css />
</head>
 
<body onLoad="loadForm()" bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginhigh="0">
	<form name="fm">
	    <input type="hidden" name="mainMenu" value="show">
	    <input type="hidden" name="subMenu" value="hide">
	</form>
	<table id="tbLoginBg" width="100%" border="0" cellspacing="0" cellpadding="0" style="display:">
		<tr>
			<td width="40%" background="../../images/blank.gif">  
			<img src="../../images/btsndgs.gif"  align="left">&#12288;</td>
			<td width="2%" background="../../images/blank.gif"><img class="button" name="menuPowerImage" src="../../images/btnclosemenu.gif" width="17" height="30" align="absmiddle" onClick="showHideMenuFrame()"></td>
			<td width="33%"  background="../../images/ndjfxt.gif"></td>
			<td width="25%" align="right" background="../../images/blank.gif">          
				<table width="50%"  border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="44%" class="top">
							<img src="../../images/imgicon_1.gif" width="4" height="7" align="absmiddle">
					  &#29992;&#25143;&#65306; <% out.println(userCode); %>						</td>
						<td width="56%" class="top">
							<img src="../../images/imgicon_1.gif" width="4" height="7" align="absmiddle">
					  &#26085;&#26399;&#65306; <% out.println(formatter.format(currentDate)); %>						</td>
					</tr>
		  </table>			</td>
	  </tr>
   	</table>
</body>
</html:html>

