<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page info = "SysConfigManageQuery.jsp -- 系统参数配置 维护，李子扬，2006-08-24。" %>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>


<script language="Javascript" src="/sinoiaci/common/pub/StaticJavascript.jsp"></script>

<%
    String parameterCode  = request.getParameter("ParameterCode") + "";    
    String parameterType  = request.getParameter("ParameterType") + ""; 
    String companyCode    = request.getParameter("CompanyCode") + ""; 
    String parameterValue = request.getParameter("ParameterValue") + ""; 
    String areaCode 	  = request.getParameter("AreaCode") + ""; 
    String validStatus    = request.getParameter("ValidStatus") + ""; 
    String parameterDesc  = request.getParameter("ParameterDesc") + ""; 
    String remark 		  = request.getParameter("Remark") + "";
    String flag    		  = request.getParameter("Flag") + "";
    
    String action    	  = request.getParameter("action") + "";
    
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<script language="javascript">

	function SubmitForm(){
		if(fm.parameterCode.value == ""){
		  alert("参数名称代码不能为空！");
		  fm.parameterCode.focus();
		  return false;
		}
		
		if(fm.parameterType.value == ""){
		  alert("参数归属的系统代码不能为空！");
		  fm.parameterType.focus();
		  return false;
		}
		
		if(fm.companyCode.value == ""){
		  alert("归属机构代码不能为空！");
		  fm.companyCode.focus();
		  return false;
		}
		
		if(fm.areaCode.value == ""){
		  alert("地区代码不能为空！");
		  fm.areaCode.focus();
		  return false;
		}
		if(fm.validStatus.value == ""){
		  alert("效力状态不能为空！");
		  fm.validStatus.focus();
		  return false;
		}
		
		if(fm.parameterDesc.value == ""){
		  alert("配置描述不能为空！");
		  fm.parameterDesc.focus();
		  return false;
		}
			
		fm.parameterCode.disabled =false; 
		fm.parameterType.disabled =false;
		fm.companyCode.disabled =false;
		
        fm.action="/sinoiaci/SysConfigManage.do?action=<%= request.getParameter("action") %>";
        fm.submit();
	 }
</script>

<script language="javascript">

    function loadForm(){
    
    	//基本信息
    	fm.parameterCode.value  = '<%=parameterCode%>' ;
    	fm.parameterType.value  = '<%=parameterType%>' ;
    	fm.parameterValue.value = '<%=parameterValue%>' ;
    	fm.companyCode.value    = '<%=companyCode%>' ;
    	fm.areaCode.value    	= '<%=areaCode%>' ;
    	fm.validStatus.value    = '<%=validStatus%>' ;
    	fm.parameterDesc.value  = '<%=parameterDesc%>' ;
    	fm.remark.value    		= '<%=remark%>' ;
    	fm.flag.value    		= '<%=flag%>' ;
    	
    	//修改之时
    	if ('<%=action%>' == "Modify"){
	    	//fm.parameterCode.readOnly =true; 
			//fm.parameterType.readOnly =true;
			//fm.companyCode.readOnly =true;
			fm.parameterCode.disabled =true; 
			fm.parameterType.disabled =true;
			fm.companyCode.disabled =true;
      	}
    }
    
</script>		

<html>
<head>
	<title>参数信息</title>
	<app:css />
</head>

<body onload="loadForm()">

<html:form action="/SysConfigManage">

	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="4"><B>参数信息</B></td>
		</tr>			
      	<tr>
			<td class="title">参数名称代码：</td>
			<td class="input"><input type="text" name="parameterCode" class="text" style="width:80%" maxlength="50">&nbsp;*</td>
			<td class="title">归属系统代码：</td>
			<td class="input"><input type="text" name="parameterType" class="text" style="width:80%" maxlength="30">&nbsp;*</td>      		
		</tr>
		<tr>
		  	<td class="title">归属机构代码：</td>
			<td class="input"><input type="text" name="companyCode"	class="text" style="width:80%" maxlength="10">&nbsp;*</td>
			<td class="title">参数配置结果：</td>
			<td class="input">
				<select name="parameterValue" style="width:80%" class="one">
				  	<option value=""></option>
				    <option value="0">0.不使用</option>
				    <option value="1">1.使用</option>
				    <option value="9">9.其他</option>
			  	</select>
			</td>
		</tr>
		<tr>
		  	<td class="title">地区代码：</td>
			<td class="input"><input type="text" name="areaCode" class="text" style="width:80%" maxlength="10">&nbsp;*</td>
			<td class="title">效力状态：</td>
			<td class="input">
				<select name="validStatus" class="text" style="width:80%">
					<option value="0">失效</option>
					<option value="1">有效</option>
				</select>
			</td>
		</tr>
		<tr>
			<td class="title">配置描述：</td>
			<td class="input"><input type="text" name="parameterDesc" class="text" style="width:80%" maxlength="255">&nbsp;*</td>
			<td class="title">备注：</td>
			<td class="input"><input type="text" name="remark" class="text" style="width:80%" maxlength="200"></td>
		</tr>
		<tr>
			<td class="title">标志字段：</td>
			<td class="input"><input type="text" name="flag" class="text" style="width:80%" maxlength="10"></td>
			<td class="title"></td>
			<td class="title"></td>
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
   var fm = iaDsysConfigForm;
</script>
	
</body>
</html>
