<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page info = "TaskManageQuery.jsp -- 任务 维护，李子扬，2006-08-24。" %>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>


<script language="Javascript" src="/sinoiaci/common/pub/StaticJavascript.jsp"></script>

<%
    String taskCode   	= request.getParameter("TaskCode") + "";    
    String taskName   	= request.getParameter("TaskName") + ""; 
    String userType    	= request.getParameter("UserType") + ""; 
    String description 	= request.getParameter("Description") + ""; 
    String validStatus 	= request.getParameter("ValidStatus") + ""; 
    String flag        	= request.getParameter("Flag") + ""; 

    String action     = request.getParameter("action") + "";
    
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script language="javascript">

	function SubmitForm(){
		if(fm.taskCode.value == ""){
		  alert("任务代码不能为空！");
		  fm.taskCode.focus();
		  return false;
		}
		
		if(fm.taskName.value == ""){
		  alert("任务名称不能为空！");
		  fm.taskName.focus();
		  return false;
		}
		
		if(fm.userType.value == ""){
		  alert("使用类别不能为空！");
		  fm.userType.focus();
		  return false;
		}
		
		if(fm.validStatus.value == ""){
		  alert("效力状态不能为空！");
		  fm.validStatus.focus();
		  return false;
		}
		
		fm.taskCode.disabled =false;
        fm.action="/sinoiaci/TaskManage.do?action=<%= request.getParameter("action") %>";
        fm.submit();
	 }
</script>

<script language="javascript">
    function loadForm(){
    	//填写信息
    	fm.taskCode.value   	= '<%=taskCode%>' ;
    	fm.taskName.value   	= '<%=taskName%>' ;
    	fm.userType.value    	= '<%=userType%>' ;
    	fm.description.value 	= '<%=description%>' ;
    	fm.validStatus.value 	= '<%=validStatus%>' ;
    	fm.flag.value    		= '<%=flag%>' ;
    	
    	//修改之时
    	if ('<%=action%>' == "Modify"){
      		fm.taskCode.disabled =true;
      	}
    }
</script>		

<html>
<head>
	<title>任务信息</title>
	<app:css />
</head>

<body onload="loadForm()">

<html:form action="/TaskManage">

	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="4"><B>任务信息</B></td>
		</tr>			
      	<tr>
			<td class="title">任务代码：</td>
			<td class="input"><input type="text" name="taskCode" class="text" style="width:80%" maxlength="20">&nbsp;*</td>
			<td class="title">任务名称：</td>
			<td class="input"><input type="text" name="taskName" class="text" style="width:80%" maxlength="30">&nbsp;*</td>      		
		</tr>
		<tr>
		  	<td class="title">使用类别：</td>
			<td class="input">
				<select name="userType" class="text" style="width:80%">
					<option value="0">机构用户</option>
					<option value="1">个人用户</option>
				</select>
			</td>
			<td class="title">任务描述：</td>
			<td class="input"><input type="text" name="description"	class="text" style="width:80%" maxlength="160">&nbsp;</td>
		</tr>
		<tr>
			<td class="title">效力状态：</td>
			<td class="input">
				<select name="validStatus" style="width:80%">
					<option value="0">失效</option>
					<option value="1">有效</option>
				</select>
			</td>
			<td class="title">标志字段：</td>
			<td class="input"><input type="text" name="flag" class="text" style="width:80%" maxlength="10">&nbsp;</td>
		</tr>
		
	</table>
	
	<br>
	
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		  	<td class="button" colspan="2"><img src="/sinoiaci/images/baocun.gif" style="cursor: hand" onClick="SubmitForm()"></td>
			<td class="button" colspan="2"><img src="/sinoiaci/images/fanhui.gif" style="cursor: hand" onClick="history.go(-1)"></td>
		</tr>
	</table>
</html:form>
	
<script language="javascript">
   var fm = iaTaskForm;
</script>

</body>
</html>
