<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page info = "TaskManageQuery.jsp -- ���� ά���������2006-08-24��" %>

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
		  alert("������벻��Ϊ�գ�");
		  fm.taskCode.focus();
		  return false;
		}
		
		if(fm.taskName.value == ""){
		  alert("�������Ʋ���Ϊ�գ�");
		  fm.taskName.focus();
		  return false;
		}
		
		if(fm.userType.value == ""){
		  alert("ʹ�������Ϊ�գ�");
		  fm.userType.focus();
		  return false;
		}
		
		if(fm.validStatus.value == ""){
		  alert("Ч��״̬����Ϊ�գ�");
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
    	//��д��Ϣ
    	fm.taskCode.value   	= '<%=taskCode%>' ;
    	fm.taskName.value   	= '<%=taskName%>' ;
    	fm.userType.value    	= '<%=userType%>' ;
    	fm.description.value 	= '<%=description%>' ;
    	fm.validStatus.value 	= '<%=validStatus%>' ;
    	fm.flag.value    		= '<%=flag%>' ;
    	
    	//�޸�֮ʱ
    	if ('<%=action%>' == "Modify"){
      		fm.taskCode.disabled =true;
      	}
    }
</script>		

<html>
<head>
	<title>������Ϣ</title>
	<app:css />
</head>

<body onload="loadForm()">

<html:form action="/TaskManage">

	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="4"><B>������Ϣ</B></td>
		</tr>			
      	<tr>
			<td class="title">������룺</td>
			<td class="input"><input type="text" name="taskCode" class="text" style="width:80%" maxlength="20">&nbsp;*</td>
			<td class="title">�������ƣ�</td>
			<td class="input"><input type="text" name="taskName" class="text" style="width:80%" maxlength="30">&nbsp;*</td>      		
		</tr>
		<tr>
		  	<td class="title">ʹ�����</td>
			<td class="input">
				<select name="userType" class="text" style="width:80%">
					<option value="0">�����û�</option>
					<option value="1">�����û�</option>
				</select>
			</td>
			<td class="title">����������</td>
			<td class="input"><input type="text" name="description"	class="text" style="width:80%" maxlength="160">&nbsp;</td>
		</tr>
		<tr>
			<td class="title">Ч��״̬��</td>
			<td class="input">
				<select name="validStatus" style="width:80%">
					<option value="0">ʧЧ</option>
					<option value="1">��Ч</option>
				</select>
			</td>
			<td class="title">��־�ֶΣ�</td>
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
