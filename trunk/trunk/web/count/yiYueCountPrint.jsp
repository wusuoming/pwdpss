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
<body class=interface onload="javascript:printCount();window.close()">&nbsp; 
<html:errors />
<%



LwShouShuTableDto lwShouShuTableDtocorporation=(LwShouShuTableDto)request.getAttribute("lwShouShuTableDtocorporation");

LwShouShuTableDto lwShouShuTableDtowholesale=(LwShouShuTableDto)request.getAttribute("lwShouShuTableDtowholesale");
LwShouShuTableDto lwShouShuTableDtoalldu=(LwShouShuTableDto)request.getAttribute("lwShouShuTableDtoalldu");

String inputDate=(String)request.getAttribute("inputDate");













%>
<form  name="fm" method="post">
 <%
		
		DecimalFormat df = new DecimalFormat("###0.00");
		
%>





	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	
		<tr>
			<td class=title0 colspan="14"><font size="4">��ͷ��ũ�繫˾��ѵ������е�</font></td>
		</tr>
		
		<tr>
		<td nowrap colspan="2">
						<span class="title">�·�:2009-01</span>
					</td>
	</tr>

		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="4">��λ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">�����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">���˰</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="4">�ϼ�</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="4">�����</font></span>
				<br></td>	
				
				<td nowrap width="10%">
					<span class="title"><font size="4">�����˰</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="4">���</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">���˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">��Ͽ</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">��Ͽ˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">����</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">����˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">�ܼ�</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4">���û�</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=Math.round(lwShouShuTableDtocorporation.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtocorporation.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtocorporation.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtocorporation.getSumDianFee())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"> <%=df.format(lwShouShuTableDtocorporation.getDiffrentFei()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtocorporation.getDiffrentFeiTax())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtocorporation.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtocorporation.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtocorporation.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtocorporation.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtocorporation.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtocorporation.getJinjinTax())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtocorporation.getSumFee())%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4">����</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=Math.round(lwShouShuTableDtowholesale.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtowholesale.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtowholesale.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(lwShouShuTableDtowholesale.getSumDianFee())%></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=df.format( lwShouShuTableDtowholesale.getDiffrentFei())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=df.format( lwShouShuTableDtowholesale.getDiffrentFeiTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtowholesale.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtowholesale.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtowholesale.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtowholesale.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtowholesale.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtowholesale.getJinjinTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtowholesale.getSumFee())%></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4">�ܼ�</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=Math.round( lwShouShuTableDtoalldu.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getSumDianFee())%></font></span>
				<br></td>
				
					
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getDiffrentFei())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getDiffrentFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getJinjinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( lwShouShuTableDtoalldu.getSumFee())%></font></span>
				<br></td>
							
			</tr>
	</table>
	

</form>
</body>
<script language="javascript">
function printCount(){
	window.print();
  
}

	
	
	
</script>

</html:html>
