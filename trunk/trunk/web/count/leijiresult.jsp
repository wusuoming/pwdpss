<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="java.text.DecimalFormat"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwAllWholeFeeDto"/>
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal"/>
<jsp:directive.page import="com.elongway.pss.util.AppConst"/>
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
DecimalFormat df = new DecimalFormat("###0.00");





String s=(String)request.getAttribute("inputDate");














%>
<form  name="fm" method="post">
	<table class=common width="500%"  border="1" cellspacing="1" cellpadding="6">
	<td style="display:none"><input type="hidden" name="StartMonth" value="<%=(String)request.getAttribute("inputDate") %>"></td>
		
	<tr>
			<td class=title0 colspan="13"><font size="4">��ͷ��ũ�繫˾��ѵ������е����ۼƣ�</font></td>
		</tr>
		<tr>
		<td nowrap colspan="2">
						<span class="title">�·�:<%=s.substring(0,7) %></span>
					</td>
	</tr>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">��λ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">�۵���</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">�����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">���˰</font></span>
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
	<% 	Collection resultList = (Collection)request.getAttribute("resultList"); 
		Collection colf = (Collection)request.getAttribute("colf"); 
		Collection wholeResultList = (Collection)request.getAttribute("wholeResultList"); 
		for (Iterator iterator = colf.iterator(); iterator.hasNext();) {
				TownSataDto townSataDto = (TownSataDto) iterator
						.next();
		%>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=townSataDto.getCompanyName() %></font></span>
					<input type="hidden" name="company" value="<%=townSataDto.getComCode()%>">
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(townSataDto.getSumPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getPurePowerFee()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getPowerFeeTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getPureDianJin()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getDianJinTax()) %></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getPureSanXia()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getSanXiaTax()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getPureJiJin()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getJiJinTax()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getSumPowerFee()) %></font></span>
				<br></td>	
							
			</tr>
			<%}
			for (Iterator iterator = wholeResultList.iterator(); iterator.hasNext();) {
				LwAllWholeFeeDto townSataDto = (LwAllWholeFeeDto) iterator
						.next();
		%>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=townSataDto.getCompany() %></font></span>
					
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(townSataDto.getPower1())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(townSataDto.getDianfei())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(townSataDto.getDianfeitax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(townSataDto.getDianjin())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(townSataDto.getDianjintax()) )%></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(townSataDto.getSanxia())) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(townSataDto.getSanxiatax())) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(townSataDto.getJijin())) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(townSataDto.getFujia1())) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(townSataDto.getSumfee())) %></font></span>
				<br></td>	
							
			</tr>
			<%}
			for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
				TownSataDto townSataDto = (TownSataDto) iterator
						.next();
		%>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=townSataDto.getCompanyName() %></font></span>
					<input type="hidden" name="company" value="<%=townSataDto.getComCode()%>">
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(townSataDto.getSumPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getPurePowerFee()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getPowerFeeTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getPureDianJin()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getDianJinTax() )%></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getPureSanXia()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getSanXiaTax()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getPureJiJin()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getJiJinTax()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(townSataDto.getSumPowerFee()) %></font></span>
				<br></td>	
							
			</tr>
			<%}%>
			
	</table>
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" �� ӡ " onClick="printCount();">        </td> 
        </tr> 
    </table>

</form>
</body>
<script language="javascript">
function printCount(){
  var b=fm.StartMonth.value;
strURL   =   "<%=request.getContextPath()%>/thismonthPrint.do?inputDate="+b;
	winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
}
</script>

</html:html>