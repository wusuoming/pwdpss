<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page info = "SysUserManage.jsp -- 个人用户 维护，乔有良，2006-08-24。" %>
<%@ page import="java.util.*"%>
<%@ page import="com.elongway.pss.dto.domain.IADCompanyDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>


<script language="Javascript" src="/iacontact/common/pub/StaticJavascript.jsp"></script>

<%
    String strUserCode    = request.getParameter("UserCode") + "";    
    String strAreaCode    = request.getParameter("AreaCode") + ""; 
    String strUserName    = request.getParameter("UserName") + ""; 
    String strCompanyCode = request.getParameter("CompanyCode") + ""; 
    String strPhoneNumber = request.getParameter("PhoneNumber") + ""; 
    String strFax 	  	  = request.getParameter("Fax") + ""; 
    String strEmail 	  = request.getParameter("Email") + "";     
    String strUserGrade   = request.getParameter("UserGrade") + ""; 
    String strValidStatus = request.getParameter("ValidStatus") + ""; 
    String strFlag 		  = request.getParameter("Flag") + "";
    String strPassword    = request.getParameter("Password") + "";

    String action    = request.getParameter("action") + "";
    
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script language="javascript">
	function SubmitForm(){
		if(fm.userCode.value == ""){
		  alert("用户代码不能为空！");
		  fm.userCode.focus();
		  return false;
		}
		
		if(fm.userName.value == ""){
		  alert("用户名称不能为空！");
		  fm.userName.focus();
		  return false;
		}
		
		if(fm.areaCode.value == ""){
		  alert("区域代码不能为空！");
		  fm.areaCode.focus();
		  return false;
		}
		
		if(fm.companyCode.value == ""){
		  alert("归属协会代码不能为空！");
		  fm.companyCode.focus();
		  return false;
		}
		
		if(fm.userGrade.value == ""){
		  alert("人员级别不能为空！");
		  fm.userGrade.focus();
		  return false;
		}
		
		function isEmail (theStr) {
	        var atIndex = theStr.indexOf ('@');
	        var dotIndex = theStr.indexOf ('.', atIndex);
	        var flag = true;
	        var theSub = theStr.substring (0, dotIndex + 1);
	        if ((atIndex < 1) || (atIndex != theStr.lastIndexOf ('@')) || (dotIndex < atIndex + 2) || (theStr.length <= theSub.length)){
                flag = false;
       		 } else { flag = true; }
        	return (flag);
			}
			if(!isEmail(fm.email.value))
	    	{
			    alert("请输入正确的Email!");
			    return false;
		    }
		
		fm.userCode.disabled =false;
      	fm.areaCode.disabled =false;
      		
        fm.action="/iacontact/SysUserManage.do?action=<%= request.getParameter("action") %>";
        fm.submit();
	}
</script>

<script language="javascript">

    function loadForm(){
		//填写信息
		fm.userCode.value    = '<%=strUserCode%>';
		fm.areaCode.value    = '<%=strAreaCode%>';
		fm.userName.value    = '<%=strUserName%>';
		fm.password.value    = '<%=strPassword%>';
		fm.companyCode.value = '<%=strCompanyCode%>';
		fm.phoneNumber.value = '<%=strPhoneNumber%>';
		fm.fax.value 		 = '<%=strFax%>';
		fm.email.value 		 = '<%=strEmail%>';
		fm.flag.value 		 = '<%=strFlag%>';		
		fm.userGrade.value   = '<%=strUserGrade%>';
		fm.validStatus.value = '<%=strValidStatus%>';

    	//修改之时
    	if ('<%=action%>' == "Modify"){
      		fm.userCode.disabled =true;
      		
      		//fm.password.readOnly =true;
      	}
      	fm.areaCode.disabled =true;
    }
    
</script>		


<html>
<head>
	<title>个人用户信息</title>
	<app:css />
</head>

<body onload="loadForm()">


<html:form action="/SysUserManage">

	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="4"><B>个人用户信息</B></td>
		</tr>			
        <tr>
			<td class="title">用户代码：</td>
			<td class="input"><input type="text" name="userCode" class="text" style="width:80%" maxlength="30">&nbsp;*</td>
			<td class="title">用户名称：</td>
			<td class="input"><input type="text" name="userName" class="text" style="width:80%" maxlength="30">&nbsp;*</td>        		
		</tr>
		<tr>
			<td class="title">用户密码：</td>
			<td class="input"><input type="password" name="password" class="text" style="width:80%" maxlength="10"></td>
			<td class="title">区域代码：</td>
			<td class="input"><input type="text" name="areaCode" class="text" style="width:80%" maxlength="10">&nbsp;*</td>		
		</tr>
		<tr>
			<td class="title">归属协会代码：</td>
			<td class="input">
			<select name="companyCode" style="width:80%" class="text" maxlength="20">
				<option value=""></option>
			
			</select>&nbsp;*
			</td>
			<td class="title">联系电话：</td>
			<td class="input"><input type="text" name="phoneNumber" class="text" style="width:80%" maxlength="30">&nbsp;</td>
		</tr>
		<tr>
			<td class="title">电子邮件：</td>
			<td class="input"><input type="text" name="email" class="text" style="width:80%" maxlength="50">&nbsp;*</td>
			<td class="title">传真：</td>
			<td class="input"><input type="text" name="fax" class="text" style="width:80%" maxlength="30">&nbsp;</td>
		</tr>
		
		   
	</table>	
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class=button align="center">
				<input type=button class=button name=button1 value=" 保 存 " onClick="SubmitForm();"> &nbsp;
				<input type=button class=button name=button2 value=" 返 回 " onClick="history.go(-1);">
			</td>
		</tr>
	</table>
</html:form>

<script language="javascript">
   var fm = iaSysUserForm;
</script>
	
</body>
</html>
