<%@ page contentType="text/html; charset=GBK" %>
<%@ page info = "GradeManageList.jsp -- 岗位 列表，李子扬，2006-08-24。" %>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>


<script language="Javascript" src="/sinoiaci/common/pub/StaticJavascript.jsp"></script>

<html>
<head>
    <title>岗位列表</title>
	<app:css />	
</head>

<body>
<html:form action="/GradeManage" >
	<br>
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="11"><p><B>岗位列表</B></p></td>
		</tr>
		<tr class=listtitle>
			<td>岗位代码</td>
			<td>岗位名称</td>
			<td>使用类别</td>
			<td>岗位描述</td>
			<td>效力状态</td>
			<td>标志字段</td>
			<td>修改</td>
			<td>删除</td>
		</tr>

     	<logic:iterate id="dto" name="GradeList">
	     	<tr class=listodd>
	     	 	<td><bean:write name="dto" property="gradeCode"/></td>
			 	<td><bean:write name="dto" property="gradeName"/></td>
			 	<td>
			 		<logic:equal name="dto" property="userType" value=""></logic:equal>
					<logic:equal name="dto" property="userType" value="0">机构用户</logic:equal>
					<logic:equal name="dto" property="userType" value="1">个人用户</logic:equal>
			 	</td>
			 	<td><bean:write name="dto" property="description"/></td>
			 	<td>
			 		<logic:equal name="dto" property="validStatus" value="0">失效</logic:equal>
					<logic:equal name="dto" property="validStatus" value="1">有效</logic:equal>
			 	</td>
			 	<td><bean:write name="dto" property="flag"/></td>
			 	
			 	<td><a class="check" style="cursor: hand" href="/sinoiaci/system/GradeManage.jsp?GradeCode=<bean:write name="dto" property="gradeCode"/>&GradeName=<bean:write name="dto" property="gradeName"/>&UserType=<bean:write name="dto" property="userType"/>&Description=<bean:write name="dto" property="description"/>&ValidStatus=<bean:write name="dto" property="validStatus"/>&Flag=<bean:write name="dto" property="flag"/>&action=Modify">修改</a></td>
				<td><a class="check" style="cursor: hand" href="/sinoiaci/GradeManageDelete.do?GradeCode=<bean:write name="dto" property="gradeCode"/>">删除</a></td>
	   		</tr>
		</logic:iterate>
	</table>
</html:form>
</body>
</html>
