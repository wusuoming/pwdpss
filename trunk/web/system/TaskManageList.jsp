<%@ page contentType="text/html; charset=GBK" %>
<%@ page info = "TaskManageQuery.jsp -- ���� �б������2006-08-24��" %>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>


<script language="Javascript" src="/sinoiaci/common/pub/StaticJavascript.jsp"></script>

<html>
<head>
	<title>�����б�</title>
	<app:css />
</head>

<body>
<html:form action="/TaskManage" >
	<br>
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="11"><p><B>�����б�</B></p></td>
		</tr>
		<tr class=listtitle>
			<td>�������</td>
			<td>��������</td>
			<td>ʹ�����</td>
			<td>��������</td>
			<td>Ч��״̬</td>
			<td>��־�ֶ�</td>
			<td>�޸�</td>
			<td>ɾ��</td>
		</tr>
		<logic:iterate id="dto" name="TaskList">
	     	<tr class=listodd align=left>
	     	 	<td align=left><bean:write name="dto"	property="taskCode"/></td>
			 	<td align=left><bean:write name="dto"	property="taskName"/></td>
			 	<td align=left>
					<logic:equal name="dto" property="userType" value="0">�����û�</logic:equal>
					<logic:equal name="dto" property="userType" value="1">�����û�</logic:equal>
			 	</td >
			 	<td align=left><bean:write name="dto"	property="description"/></td>
			 	<td >
			 		<logic:equal name="dto" property="validStatus" value="0">ʧЧ</logic:equal>
					<logic:equal name="dto" property="validStatus" value="1">��Ч</logic:equal>
			 	</td>
			 	<td align=left><bean:write name="dto"	property="flag"/></td>
			 	
			 	<td><a class="check" style="cursor: hand" href="/sinoiaci/system/TaskManage.jsp?TaskCode=<bean:write name="dto" property="taskCode"/>&TaskName=<bean:write name="dto" property="taskName"/>&UserType=<bean:write name="dto" property="userType"/>&Description=<bean:write name="dto" property="description"/>&ValidStatus=<bean:write name="dto" property="validStatus"/>&Flag=<bean:write name="dto" property="flag"/>&action=Modify">�޸�</a></td>
				<td><a class="check" style="cursor: hand" href="/sinoiaci/TaskManageDelete.do?TaskCode=<bean:write name="dto" property="taskCode"/>">ɾ��</a></td>
		   </tr>
	   </logic:iterate>
	</table>
</html:form>
</body>
</html>
