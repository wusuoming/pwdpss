<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page import="java.text.DecimalFormat"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwShouShuTableDto"/>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>��ͷũ���ܹ�˾��ѵ������е�</title>
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
   //���������͵ĺϳɺ���
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
  alert();  
       var strURL = "<%=request.getContextPath()%>/townSave.do";
       fm.action = strURL;
	 
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
	if(fm.userNo==null){
	alert(fm.userNo.value);
	}
}
</script>
</head>
<body class=interface>&nbsp; 
<html:errors />
<%
LwShouShuTableDto wholesalelwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("wholesalelwShouShuTableDto");

LwShouShuTableDto lwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("lwShouShuTableDto");
LwShouShuTableDto corporationlwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("corporationlwShouShuTableDto");


LwShouShuTableDto wholesaleshoushulwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("wholesaleshoushulwShouShuTableDto");

LwShouShuTableDto shoushulwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("shoushulwShouShuTableDto");
LwShouShuTableDto corporationshoushulwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("corporationshoushulwShouShuTableDto");










%>
<form  name="fm" method="post">
 <%
		
		DecimalFormat df = new DecimalFormat("###0.00");
		
%>

	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	<td style="display:none"><input type="hidden" name="inputDate" value="<%=(String)request.getAttribute("inputDate") %>"></td>
		
	<tr>
			<td class=title0 colspan="14"><font size="4">��ͷ��ũ�繫˾��ѵ������е�</font></td>
		</tr>
		
		<tr>
		<td nowrap colspan="2">
						<span class="title">�·�:<%=corporationlwShouShuTableDto.getMonth()%></span>
					</td>
	</tr>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">��λ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">�����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">���˰</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">�ϼ�</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">�����</font></span>
				<br></td>	
				
				<td nowrap width="10%">
					<span class="title"><font size="2">�����˰</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">���</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">���˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">��Ͽ</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">��Ͽ˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">����</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">����˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">�ܼ�</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">���û�</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round( corporationshoushulwShouShuTableDto.getPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getChunDianFei() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getDianFeiTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getSumDianFee() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getDiffrentFei() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getDiffrentFeiTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getDianJin() %> </font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getDianJinTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getSanXia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getSanXiaTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getJijin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getJinjinTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getSumFee() %></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">����</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round( wholesaleshoushulwShouShuTableDto.getPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getChunDianFei() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getDianFeiTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getSumDianFee() %></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getDiffrentFei() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getDiffrentFeiTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getDianJin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getDianJinTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getSanXia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getSanXiaTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getJijin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getJinjinTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getSumFee() %></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">�ܼ�</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round( shoushulwShouShuTableDto.getPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getChunDianFei() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getDianFeiTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getSumDianFee() %></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getDiffrentFei() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getDiffrentFeiTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getDianJin()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getDianJinTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getSanXia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getSanXiaTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getJijin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getJinjinTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getSumFee() %></font></span>
				<br></td>			
			</tr>
	</table>



	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	
		

		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">��λ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">�����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">���˰</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">�ϼ�</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">�����</font></span>
				<br></td>	
				
				<td nowrap width="10%">
					<span class="title"><font size="2">�����˰</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">���</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">���˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">��Ͽ</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">��Ͽ˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">����</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">����˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">�ܼ�</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">���û�</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(corporationlwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"> <%=df.format(corporationlwShouShuTableDto.getDiffrentFei()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getDiffrentFeiTax())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationlwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getJinjinTax())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getSumFee())%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">����</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(wholesalelwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesalelwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesalelwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesalelwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getDiffrentFei())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getDiffrentFeiTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getJinjinTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getSumFee())%></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">�ܼ�</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round( lwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
					
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getDiffrentFei())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getDiffrentFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getJinjinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getSumFee())%></font></span>
				<br></td>
							
			</tr>
	</table>
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" �� ӡ " onClick="printCount()">        </td> 
        </tr> 
    </table>

</form>
</body>
<script language="javascript">
function printCount(){
	var b=fm.inputDate.value;
strURL   =   "<%=request.getContextPath()%>/UIViewCountNewResultPrintAction.do?inputDate="+b;
	winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
  
}
//function dianfei(){
	//var fdianfeishui=0.0;
	//var fdianfee=0.0;
	//fdianfeishui=parseFloat(fm.lwsumfc.value)*0.17;
	//fdianfee=fdianfeishui+parseFloat(fm.lwsumfc.value);
	//fm.lwsumftax.value=fdianfeishui;
	//fm.lwsumfdianfee.value=fdianfee;
	
//}
//function chabie(){
	//var chabieshui=0.0;
	//chabieshui=parseFloat(fm.lwdiffrentfee.value)*0.17;
	//fm.lwdiffrentfeetax.value=chabieshui;
	


//}

//function jijin(){
	//var jijinshui=0.0;
	//jijinshui=parseFloat(fm.lwsumfjijin.value)*0.17;
	//fm.lwsumfjijintax.value=jijinshui;
	//}
	//function dianjin(){
	////var dianjinshui=0.0;
	//dianjinshui=parseFloat(fm.lwsummfdianjin.value)*0.17;
	//fm.lwsumfdianjintax.value=dianjinshui;
	//}
	
	//function sanxia(){
	///var sanxiashui=0.0;
	///sanxiashui=parseFloat(fm.lwsumfsanxia.value)*0.17;
	//fm.lwsumfsanxiatax.value=sanxiashui;
	//}
	//function fheji(){
	//var heji=0.0;
	//heji=parseFloat(fm.lwsumfc.value)+parseFloat(fm.lwsumftax.value)+parseFloat(fm.lwdiffrentfee.value)+parseFloat(fm.lwdiffrentfeetax.value)+parseFloat(fm.lwsummfdianjin.value)+parseFloat(fm.lwsumfdianjintax.value)+parseFloat(fm.lwsumfsanxia.value)+parseFloat(fm.lwsumfsanxiatax.value)+parseFloat(fm.lwsumfjijin.value)+parseFloat(fm.lwsumfjijintax.value);
	//fm.lwsumffee.value=heji;
	//}
	
	
	
	
	//dunshou
	//function wdianfei(){
	//var wdianfeishui=0.0;
	//var wdianfee=0.0;
	//wdianfeishui=parseFloat(fm.lwsumwc.value)*0.17;
	//wdianfee=wdianfeishui+parseFloat(fm.lwsumwc.value);
	//fm.lwsumwtax.value=wdianfeishui;
	//fm.lwsumwdianfee.value=wdianfee;
	
//}
//function wchabie(){
	//var wchabieshui=0.0;
	//wchabieshui=parseFloat(fm.lwdiffrentwfee.value)*0.17;
	//fm.lwdiffrentwfeetax.value=wchabieshui;
	


//}

//function wjijin(){
	//var wjijinshui=0.0;
	wjijinshui=parseFloat(fm.lwsumwjijin.value)*0.17;
	////fm.lwsumwjijintax.value=wjijinshui;
	//}
	//function wdianjin(){
	//var wdianjinshui=0.0;
	//wdianjinshui=parseFloat(fm.lwsummwdianjin.value)*0.17;
	//fm.lwsumwdianjintax.value=wdianjinshui;
	//}
	
	//function wsanxia(){
	//var wsanxiashui=0.0;
	//wsanxiashui=parseFloat(fm.lwsumwsanxia.value)*0.17;
	//fm.lwsumwsanxiatax.value=wsanxiashui;
	//}
	//function wheji(){
	//var wheji=0.0;
	//wheji=parseFloat(fm.lwsumwc.value)+parseFloat(fm.lwsumwtax.value)+parseFloat(fm.lwdiffrentwfee.value)+parseFloat(fm.lwdiffrentwfeetax.value)+parseFloat(fm.lwsummwdianjin.value)+parseFloat(fm.lwsumwdianjintax.value)+parseFloat(fm.lwsumwsanxia.value)+parseFloat(fm.lwsumwsanxiatax.value)+parseFloat(fm.lwsumwjijin.value)+parseFloat(fm.lwsumwjijintax.value);
	//fm.lwsumwfee.value=wheji;
	//}
	//function allsum(){
	//fm.lwsumallpower.value=parseFloat(fm.lwsumfpower.value)+parseFloat(fm.lwsumwpower.value);
	
	//fm.lwsumallc.value=parseFloat(fm.lwsumfc.value)+parseFloat(fm.lwsumwc.value);
	//fm.lwsumalltax.value=parseFloat(fm.lwsumftax.value)+parseFloat(fm.lwsumwtax.value);
	//fm.lwsumalldianfee.value=parseFloat(fm.lwsumfdianfee.value)+parseFloat(fm.lwsumwdianfee.value);
	//fm.lwdiffrentallfee.value=parseFloat(fm.lwdiffrentfee.value)+parseFloat(fm.lwdiffrentwfee.value);
	//fm.lwdiffrentallfeetax.value=parseFloat(fm.lwdiffrentfeetax.value)+parseFloat(fm.lwdiffrentwfeetax.value);
	//fm.lwsummalldianjin.value=parseFloat(fm.lwsummfdianjin.value)+parseFloat(fm.lwsummwdianjin.value);
	//fm.lwsumalldianjintax.value=parseFloat(fm.lwsumfdianjintax.value)+parseFloat(fm.lwsumwdianjintax.value);
	//fm.lwsumallsanxia.value=parseFloat(fm.lwsumfsanxia.value)+parseFloat(fm.lwsumwsanxia.value);
	//fm.lwsumallsanxiatax.value=parseFloat(fm.lwsumfsanxiatax.value)+parseFloat(fm.lwsumwsanxiatax.value);
	//fm.lwsumalljijin.value=parseFloat(fm.lwsumfjijin.value)+parseFloat(fm.lwsumwjijin.value);
	//fm.lwsumalljijintax.value=parseFloat(fm.lwsumfjijintax.value)+parseFloat(fm.lwsumwjijintax.value);
	//fm.lwsumallfee.value=parseFloat(fm.lwsumffee.value)+parseFloat(fm.lwsumwfee.value);
	
	
	//}
	
	
	
</script>

</html:html>