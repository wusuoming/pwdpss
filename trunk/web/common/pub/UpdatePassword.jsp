<%@ page contentType="text/html; charset=GBK" %>

<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>

<html:html locale="true">

<head>
<title>修改密码</title>
<app:css />
<STYLE>BODY {
     SCROLLBAR-FACE-COLOR:#ffffff;
     SCROLLBAR-HIGHLIGHT-COLOR:#A9CBED;
     SCROLLBAR-SHADOW-COLOR:#A9CBED;
     SCROLLBAR-3DLIGHT-COLOR:#FFFFFF;
     SCROLLBAR-ARROW-COLOR:#A9CBED;
     SCROLLBAR-TRACK-COLOR:#FFFFFF;
     SCROLLBAR-DARKSHADOW-COLOR:#FFFFFF;
}
</STYLE>

<script language="Javascript" src="/iacontact/common/pub/StaticJavascript.jsp"></script>

<script language="javascript">
	function SubmitForm(){
		if(!confirm('确认修改密码？')){
		return;
		}else{
		
        fm.submit();
        }
	}	
</script>
</head>

<body class="interface">
<html:errors />

<html:form action="/savePassword" onsubmit="return validateUpdatePasswordForm(this);">

<html:hidden property="action" />
	
	<table class="common" align="center" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="2"><B>修改密码</B></td>
		</tr>
		
		<tr>
			<td class="blue" colspan="2"></td>
		</tr>
		
		<tr>
			<td class="title">用户代码：</td>
			<td class="input" height="25">
				<bean:write name="updatePasswordForm" property="updUserCode" />
				<html:hidden name="updatePasswordForm" property="updUserCode"/>
			</td>
		</tr>
		
		<tr>
			<td class="title">用户名称：</td>
			<td class="input" height="25">
				<bean:write name="updatePasswordForm" property="updUserName" />
			</td>
		</tr>
		
		<tr>
			<td class="title">原密码：</td>
			<td class="input">
				<input class="text" type=password name=oldPassword maxlength="10">
			</td>
		</tr>

		<tr>
			<td class="title">新密码：</td>
			<td class="input">
				<input class="text" type=password name=newPassword maxlength="10">
			</td>
		</tr>
		
		<tr>
			<td class="title">重新输入：</td>
			<td class="input">
				<input class="text" type=password name=confirmPassword maxlength="10">
			</td>
		</tr>
	</table>			
    <br>				
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td class=button align="center">
				<input type=button class=button name=button1 value=" 保 存 " onClick="SubmitForm();"> &nbsp;
				<input type=button class=button name=button2 value=" 返 回 " onClick="history.go(-1);">
			</td>
		</tr>
	</table>
</html:form>

<script language="javascript">
   var fm = updatePasswordForm;
 </script>
 
</body>
</html:html>
