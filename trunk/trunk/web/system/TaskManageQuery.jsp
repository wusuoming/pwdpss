<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page info = "TaskManageQuery.jsp -- ���� ��ѯ�������2006-08-24��" %>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>


<script language="Javascript" src="/sinoiaci/common/pub/StaticJavascript.jsp"></script>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script language="javascript">
	function SubmitForm(){
		fm.submit();
	} 
</script>

<html>
<head>
	<title>�����ѯ</title>
	<app:css />
</head>

<body>

<html:form action="/TaskManageList">
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="4"><B>�����ѯ</B></td>
		</tr>
		<tr>
			<td class="title">������룺</td>
			<td class="input"><input type="text" name="taskCode" class="text" style="width:100%"></td>
			<td class="title">�������ƣ�</td>
			<td class="input"><input type="text" name="taskName" class="text" style="width:100%"></td>    
		</tr>
		<tr>
			<td class="title">ʹ�����</td>
			<td class="input">
				<select name="userType" style="width:100%" class="text">
				  	<option value="" selected="selected"></option>
				    <option value="0">�����û�</option>
				    <option value="1">�����û�</option>
			  	</select>
			</td>	
			<td class="title"></td>
			<td class="title"></td>
		</tr>
	</table>
	
	<br>
	
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		  	<td class="button" colspan="2"><img src="/sinoiaci/images/chaxun1.gif" style="cursor: hand" onClick="SubmitForm()"></td>
		 	<td class="button" colspan="2"><img src="/sinoiaci/images/fanhui.gif" style="cursor: hand" onClick="history.go(-1)"></td>
		</tr>
	</table>

</html:form>	

<script language="javascript">
   var fm = iaTaskForm;
</script>

</body>
</html>
