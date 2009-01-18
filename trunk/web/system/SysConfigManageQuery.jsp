<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page info = "SysConfigManageQuery.jsp -- 系统参数配置 查询，李子扬，2006-08-24。" %>

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
	<title>参数查询</title>
	<app:css />
</head>

<body>
<html:form action="/SysConfigManageList">
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="4"><B>参数查询</B></td>
		</tr>
		<tr>
			<td class="title">参数名称代码：</td>
			<td class="input"><input type="text" name="parameterCode" class="text" style="width:100%"></td>
			<td class="title">归属系统代码：</td>
			<td class="input"><input type="text" name="parameterType" class="text" style="width:100%"></td>    
		</tr>
		<tr>
			<td class="title">归属机构代码：</td>
			<td class="input"><input type="text" name="companyCode" class="text" style="width:100%"></td>	
			<td class="title"></td>
			<td class="title"></td>
		</tr>
	</table>
	
	<br>
	  
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		  <td class="button" colspan="2"><img src="/sinoiaci/images/chaxun1.gif" style="cursor: hand" onClick="SubmitForm()"></td>
		  <td class="button" colspan="2"><img src="/sinoiaci/images/fanhui.gif"  style="cursor: hand" onClick="history.go(-1)"></td>
		</tr>
	</table>
</html:form>
<script language="javascript">
   var fm = iaDsysConfigForm;
</script>
</body>
</html>
