<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@ taglib uri="/e3/calendar/E3Calendar.tld" prefix="e3c"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>ֱ�������ݳ�ʼ��¼��ҳ��</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<app:css />
<html:base />
<STYLE>BODY {
               SCROLLBAR-FACE-COLOR:#ffffff;
               SCROLLBAR-HIGHLIGHT-COLOR:#A9CBED;
               SCROLLBAR-SHADOW-COLOR:#A9CBED;
               SCROLLBAR-3DLIGHT-COLOR:#FFFFFF;
               SCROLLBAR-ARROW-COLOR:#A9CBED;
               SCROLLBAR-TRACK-COLOR:#FFFFFF;
               SCROLLBAR-DARKSHADOW-COLOR:#FFFFFF;
       }
</STYLE>
<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
<script language="Javascript">
 function validateUserQueryForm(form)
{
   //��������͵ĺϳɺ���
  if(!(composeauUserBirthday() && composeauUserStartWorkDate() && composeauUserEnterDate())){
     return false;
  }
   bValid = validateQueryForm(form);
  if(bValid == true)
  {
      disabledImg(userForm,'userOverviewChaxun');
  }
   return bValid;
}
   
  function AddForm(){
       var strURL = "<%=request.getContextPath()%>/towninitsave.do";
       if(!confirm('ȷʵ��Ҫ���棿')){
       	 return false;
       }else{
       fm.action = strURL;
	   fm.submit();
        } 
}
</script>
<script language="javascript">
   function codeQuery(field)
{
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.userNo.value+"&TableName=lwProrate";

	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
<script language="javascript">
 function check()
{	
    var count = document.getElementsByName('thisWorkNum').length;
    
            if(count ==1){
           	fm.thisWorkNum.value = fm.lastWorkNum.value;
            }else{
            	for(var i=0;i<fm.thisWorkNum.length;i++){
            		fm.thisWorkNum[i].value = fm.lastWorkNum[i].value;
            	}
            	
            }	
}
</script>
</head>
<body class=interface>
<html:errors />
<%Collection formList = (Collection)request.getAttribute("userList"); %>
<form  name="fm" method="post" >
	<table width="100%">
		<tr>
			<td height=20px class="input">ʱ����д��ʽΪ��2007-03-29</td>
		</tr>
	</table>
	<table class=common width="500%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="10"><B><font size="3">ֱ�������ݳ�ʼ��¼��ҳ��</font></B></td>
		</tr>
		
		<!--��Ա���룬����-->
		<tr class=listtitle>
			<td >���� </td>
			<td >����</td>
			<td >���</td>
			<td >�����й�ָ��</td>
			<td >�����й�ָ��</td>
			<td >����</td>
			<td >��������</td>
			<td >�쳣����</td>
			<td >�������</td>
			<td >�˲�����</td>
			
		</tr>
		<%if(formList!=null){ 
		for (Iterator iterator = formList.iterator(); iterator.hasNext();) {
			LwTownIndicatorDto dto = (LwTownIndicatorDto) iterator.next();
			
			%>			
		<tr>
			<td class="title"><%=dto.getUserNo() %> </td>
			<input name="userNo" type="hidden"  value='<%=dto.getUserNo() %>'>
			<td class="title"><%=dto.getUserName() %> </td>
			<td class="title"><%=dto.getAmmeterNo() %> </td>
			<td class="title"><input name="thisWorkNum" type="text" class="text" width="20" value=<%=dto.getThisWorkNum() %> readonly="readonly" ></td>
			<td class="title"><input name="lastWorkNum" type="text" class="text" width="20" value=<%=dto.getLastWorkNum() %>  onblur="check();"></td>
			<td class="title"><input name="rate" type="text" class="text" width="20" value=<%=dto.getRate() %>></td>
			<td class="title"><input name="readQuantity" type="text" class="text" width="20" value=<%=dto.getReadQuantity() %> disabled="disabled"></td>
			<td class="title"><input name="excepQuantity" type="text" class="text" width="20" value=<%=dto.getExcepQuantity()%> disabled="disabled"></td>
			<td class="title"><input name="chgAmmeterQuantity" type="text" class="text" width="20" value=<%=dto.getChgAmmeterQuantity() %> disabled="disabled"></td>
			<td class="title"><input name="compensateQuantity" type="text" class="text" width="20" value=<%=dto.getCompensateQuantity()%> disabled="disabled"></td>
			
		</tr>
		<%
		
		}}
		%>
		
	</table>
	
<table cellpadding="0" cellspacing="0" width="100%">
<tr>
<td>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button
				name=button0 value="����" onClick="AddForm();"></td>
		</tr>
	</table>
	</td>
<td>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button name=button2 value=" ���� " onClick="history.go(-1);">		</td>
		</tr>
	</table>
	</td>
	</tr>
	</table>
</form>
</body>


</html:html>
