<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page info = "SysUserManageQuery.jsp -- �����û���ѯ��yangfq��2006-12-31��" %>
<%@ page import="java.util.*"%>
<%@ page import="com.elongway.pss.ui.model.IADCompanyFindByConditionsCommand"%>
<%@ page import="com.elongway.pss.dto.domain.IADCompanyDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<script language="Javascript" src="/iacontact/common/pub/StaticJavascript.jsp"></script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script language="javascript">

	function SubmitForm(){
		fm.submit();
	} 
	
</script>

<html>
<head>
	<title>�����û���ѯ</title>
	<app:css />
</head>

<body>
<html:form action="/SysUserManageList">

	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="6"><B>�����û���ѯ</B></td>
		</tr>
		<tr>
			<td class="title">�û����룺</td>
			<td class="input"><input type="text" name="userCode" class="text" style="width:80%"></td>
			<td class="title">�û����ƣ�</td>
			<td class="input"><input type="text" name="userName" class="text" style="width:80%"></td>    
		</tr>
		<tr>
			<td class="title">����Э����룺</td>
			<td class="input">
			<select name="companyCode" style="width:80%" class="text" maxlength="20">
				<option value=""></option>
			<%
				String conditionsGrade = "";
			    IADCompanyFindByConditionsCommand iaDCompanyFindByConditionsCommand = new IADCompanyFindByConditionsCommand(conditionsGrade);
			   	Collection ciaDCompany = (Collection)iaDCompanyFindByConditionsCommand.execute();
			   	Vector viaDCompany = new Vector();
			   	viaDCompany.addAll(ciaDCompany);
			   	Enumeration eiaDCompany = viaDCompany.elements();
			   	while (eiaDCompany.hasMoreElements()){      
					IADCompanyDto iaDCompanyDto = (IADCompanyDto)eiaDCompany.nextElement();
					out.println("<option value=" + iaDCompanyDto.getCompanyCode() + ">" + iaDCompanyDto.getCompanyCode() + "-" + iaDCompanyDto.getCompanyCName() + "</option>");
			   	}
			%>
			</select>
			</td>
			<td class="title">��Ա����</td>
			<td class="input">
				<select name="userGrade" style="width:80%" class="text">
				  	<option value="" selected="selected"></option>
				    <option value="0">�Ƶ���</option>
				    <option value="1">���������</option>
				    <option value="2">ƽ̨������</option>
				    <option value="3">ƽ̨������</option>
			  	</select>
			</td>		
		</tr>		
	</table>
	<br>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td class=button align="center">
				<input type=button class=button name=button1 value=" �� ѯ " onClick="SubmitForm();"> &nbsp;
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
