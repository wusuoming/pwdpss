<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page info = "SysUserManage.jsp -- �����û� ά������������2006-08-24��" %>
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
		  alert("�û����벻��Ϊ�գ�");
		  fm.userCode.focus();
		  return false;
		}
		
		if(fm.userName.value == ""){
		  alert("�û����Ʋ���Ϊ�գ�");
		  fm.userName.focus();
		  return false;
		}
		
		if(fm.areaCode.value == ""){
		  alert("������벻��Ϊ�գ�");
		  fm.areaCode.focus();
		  return false;
		}
		
		if(fm.companyCode.value == ""){
		  alert("����Э����벻��Ϊ�գ�");
		  fm.companyCode.focus();
		  return false;
		}
		
		if(fm.userGrade.value == ""){
		  alert("��Ա������Ϊ�գ�");
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
			    alert("��������ȷ��Email!");
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
		//��д��Ϣ
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

    	//�޸�֮ʱ
    	if ('<%=action%>' == "Modify"){
      		fm.userCode.disabled =true;
      		
      		//fm.password.readOnly =true;
      	}
      	fm.areaCode.disabled =true;
    }
    
</script>		


<html>
<head>
	<title>�����û���Ϣ</title>
	<app:css />
</head>

<body onload="loadForm()">


<html:form action="/SysUserManage">

	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="4"><B>�����û���Ϣ</B></td>
		</tr>			
        <tr>
			<td class="title">�û����룺</td>
			<td class="input"><input type="text" name="userCode" class="text" style="width:80%" maxlength="30">&nbsp;*</td>
			<td class="title">�û����ƣ�</td>
			<td class="input"><input type="text" name="userName" class="text" style="width:80%" maxlength="30">&nbsp;*</td>        		
		</tr>
		<tr>
			<td class="title">�û����룺</td>
			<td class="input"><input type="password" name="password" class="text" style="width:80%" maxlength="10"></td>
			<td class="title">������룺</td>
			<td class="input"><input type="text" name="areaCode" class="text" style="width:80%" maxlength="10">&nbsp;*</td>		
		</tr>
		<tr>
			<td class="title">����Э����룺</td>
			<td class="input">
			<select name="companyCode" style="width:80%" class="text" maxlength="20">
				<option value=""></option>
			
			</select>&nbsp;*
			</td>
			<td class="title">��ϵ�绰��</td>
			<td class="input"><input type="text" name="phoneNumber" class="text" style="width:80%" maxlength="30">&nbsp;</td>
		</tr>
		<tr>
			<td class="title">�����ʼ���</td>
			<td class="input"><input type="text" name="email" class="text" style="width:80%" maxlength="50">&nbsp;*</td>
			<td class="title">���棺</td>
			<td class="input"><input type="text" name="fax" class="text" style="width:80%" maxlength="30">&nbsp;</td>
		</tr>
		
		   
	</table>	
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class=button align="center">
				<input type=button class=button name=button1 value=" �� �� " onClick="SubmitForm();"> &nbsp;
				<input type=button class=button name=button2 value=" �� �� " onClick="history.go(-1);">
			</td>
		</tr>
	</table>
</html:form>

<script language="javascript">
   var fm = iaSysUserForm;
</script>
	
</body>
</html>
