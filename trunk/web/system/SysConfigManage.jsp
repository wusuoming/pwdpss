<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page info = "SysConfigManageQuery.jsp -- ϵͳ�������� ά���������2006-08-24��" %>

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
		  alert("�������ƴ��벻��Ϊ�գ�");
		  fm.parameterCode.focus();
		  return false;
		}
		
		if(fm.parameterType.value == ""){
		  alert("����������ϵͳ���벻��Ϊ�գ�");
		  fm.parameterType.focus();
		  return false;
		}
		
		if(fm.companyCode.value == ""){
		  alert("�����������벻��Ϊ�գ�");
		  fm.companyCode.focus();
		  return false;
		}
		
		if(fm.areaCode.value == ""){
		  alert("�������벻��Ϊ�գ�");
		  fm.areaCode.focus();
		  return false;
		}
		if(fm.validStatus.value == ""){
		  alert("Ч��״̬����Ϊ�գ�");
		  fm.validStatus.focus();
		  return false;
		}
		
		if(fm.parameterDesc.value == ""){
		  alert("������������Ϊ�գ�");
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
    
    	//������Ϣ
    	fm.parameterCode.value  = '<%=parameterCode%>' ;
    	fm.parameterType.value  = '<%=parameterType%>' ;
    	fm.parameterValue.value = '<%=parameterValue%>' ;
    	fm.companyCode.value    = '<%=companyCode%>' ;
    	fm.areaCode.value    	= '<%=areaCode%>' ;
    	fm.validStatus.value    = '<%=validStatus%>' ;
    	fm.parameterDesc.value  = '<%=parameterDesc%>' ;
    	fm.remark.value    		= '<%=remark%>' ;
    	fm.flag.value    		= '<%=flag%>' ;
    	
    	//�޸�֮ʱ
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
	<title>������Ϣ</title>
	<app:css />
</head>

<body onload="loadForm()">

<html:form action="/SysConfigManage">

	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="4"><B>������Ϣ</B></td>
		</tr>			
      	<tr>
			<td class="title">�������ƴ��룺</td>
			<td class="input"><input type="text" name="parameterCode" class="text" style="width:80%" maxlength="50">&nbsp;*</td>
			<td class="title">����ϵͳ���룺</td>
			<td class="input"><input type="text" name="parameterType" class="text" style="width:80%" maxlength="30">&nbsp;*</td>      		
		</tr>
		<tr>
		  	<td class="title">�����������룺</td>
			<td class="input"><input type="text" name="companyCode"	class="text" style="width:80%" maxlength="10">&nbsp;*</td>
			<td class="title">�������ý����</td>
			<td class="input">
				<select name="parameterValue" style="width:80%" class="one">
				  	<option value=""></option>
				    <option value="0">0.��ʹ��</option>
				    <option value="1">1.ʹ��</option>
				    <option value="9">9.����</option>
			  	</select>
			</td>
		</tr>
		<tr>
		  	<td class="title">�������룺</td>
			<td class="input"><input type="text" name="areaCode" class="text" style="width:80%" maxlength="10">&nbsp;*</td>
			<td class="title">Ч��״̬��</td>
			<td class="input">
				<select name="validStatus" class="text" style="width:80%">
					<option value="0">ʧЧ</option>
					<option value="1">��Ч</option>
				</select>
			</td>
		</tr>
		<tr>
			<td class="title">����������</td>
			<td class="input"><input type="text" name="parameterDesc" class="text" style="width:80%" maxlength="255">&nbsp;*</td>
			<td class="title">��ע��</td>
			<td class="input"><input type="text" name="remark" class="text" style="width:80%" maxlength="200"></td>
		</tr>
		<tr>
			<td class="title">��־�ֶΣ�</td>
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
