<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>ֱ����������¼��ҳ��</title>
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
  
       var strURL = "<%=request.getContextPath()%>/patchAndCal.do";
      fm.action = strURL;
      fm.submit();
	 
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
</head>
<body class=interface>
<html:errors />

<form  name="fm" method="post">
	<table width="100%">
		<tr class=listtitle align="center">
			<td class=title0 colspan="7"><B><font size="3">ֱ����������¼��ҳ��</font></B></td>
		</tr>
	</table>
	<!--�������ʱ��ʾ������·����������(����)-->
	<table style='display:none' id="DataPower_Data" cellspacing="1"
		cellpadding="5">
			<tr class=oddrow>
		<td class="title"  align="center"><input name="ammeterX" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterV" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterA" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterType" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="factoryName" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="factoryCcode" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="coust" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="PT" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="CT" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="rate" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><select name="ammeterStyle" style="width:60px">
					<option value="0">��ҵ</option>
				  <option value="1" >����</option></td>
				
				<td class="input" style='width:10%'>
				<img src="../../images/jian-jian.gif" border="0" name="img_DataPower_Delete" onclick="deleteRow(this,'DataPower')">
				</td>
			</tr>
	</table>
	<table class="sub" style='width:100%' id="DataPower" cellspacing="1"
		cellpadding="5">
		<thead>
			<td class="title" align="center">���</td>		
			<td class="title" align="center">��</td>
			<td class="title" align="center">��</td>
			<td class="title" align="center">��</td>
			<td class="title" align="center">��ʽ</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">��ѹ��</td>
			<td class="title" align="center">������</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">�õ�����</td>
			<td class="title" align="center">�ϱ�����</td>
		</thead>
		<tfoot>
			<tr class=oddrow>
				<td colspan="5" align="right"><img src="../../images/jia-jia.gif" border="0" align="absmiddle" name="img_DataPower_Insert" onclick="insertRow('DataPower')">
				</td>
			</tr>
		</tfoot>
		<tbody>		
					<tr class=oddrow>
						<td class="title"  align="center"><input name="ammeterNo" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterX" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterV" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterA" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterType" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="factoryName" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="factoryCcode" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="coust" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="PT" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="CT" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="rate" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><select name="ammeterStyle" style="width:60px">
					<option value="0">��ҵ</option>
				  <option value="1" >����</option></td>
						
						<td class="input" style='width:10%'><img src="../../images/jian-jian.gif" border="0" align="absmiddle" name="img_DataPower_Delete" onclick="deleteRow(this,'DataPower')"></td>
					</tr>
		</tbody>
	</table>
	<p><br>
	</p>
	<!-- ��ť����ʾ-->
<table cellpadding="0" cellspacing="0" width="100%">
<tr>
<td>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button
				name=button0 value="���㲢����" onClick="AddForm();"></td>
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
