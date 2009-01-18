<%@ page contentType="text/html; charset=GBK" %>
<%@ page info = "GradeManageList.jsp -- ��λ �б������2006-08-24��" %>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>


<script language="Javascript" src="/sinoiaci/common/pub/StaticJavascript.jsp"></script>

<html>
<head>
    <title>��λ�б�</title>
	<app:css />	
</head>

<body>
<html:form action="/GradeManage" >
	<br>
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="11"><p><B>��λ�б�</B></p></td>
		</tr>
		<tr class=listtitle>
			<td>��λ����</td>
			<td>��λ����</td>
			<td>ʹ�����</td>
			<td>��λ����</td>
			<td>Ч��״̬</td>
			<td>��־�ֶ�</td>
			<td>�޸�</td>
			<td>ɾ��</td>
		</tr>

     	<logic:iterate id="dto" name="GradeList">
	     	<tr class=listodd>
	     	 	<td><bean:write name="dto" property="gradeCode"/></td>
			 	<td><bean:write name="dto" property="gradeName"/></td>
			 	<td>
			 		<logic:equal name="dto" property="userType" value=""></logic:equal>
					<logic:equal name="dto" property="userType" value="0">�����û�</logic:equal>
					<logic:equal name="dto" property="userType" value="1">�����û�</logic:equal>
			 	</td>
			 	<td><bean:write name="dto" property="description"/></td>
			 	<td>
			 		<logic:equal name="dto" property="validStatus" value="0">ʧЧ</logic:equal>
					<logic:equal name="dto" property="validStatus" value="1">��Ч</logic:equal>
			 	</td>
			 	<td><bean:write name="dto" property="flag"/></td>
			 	
			 	<td><a class="check" style="cursor: hand" href="/sinoiaci/system/GradeManage.jsp?GradeCode=<bean:write name="dto" property="gradeCode"/>&GradeName=<bean:write name="dto" property="gradeName"/>&UserType=<bean:write name="dto" property="userType"/>&Description=<bean:write name="dto" property="description"/>&ValidStatus=<bean:write name="dto" property="validStatus"/>&Flag=<bean:write name="dto" property="flag"/>&action=Modify">�޸�</a></td>
				<td><a class="check" style="cursor: hand" href="/sinoiaci/GradeManageDelete.do?GradeCode=<bean:write name="dto" property="gradeCode"/>">ɾ��</a></td>
	   		</tr>
		</logic:iterate>
	</table>
</html:form>
</body>
</html>
