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
<%@page import="com.elongway.pss.dto.domain.LwPowerFeeFaxingDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>包头农电总公司电费电量发行单</title>
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
   //添加日期型的合成函数
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
function doPrint(){
	window.print();
}
</script>
</head>
<body class=interface  onload="javascript:doPrint();window.close()">&nbsp; 
<html:errors />

<%
DecimalFormat df = new DecimalFormat("###0.00");
String s=(String)request.getAttribute("inputDate");

%>
<form  name="fm" method="post">
	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	<td style="display:none"><input type="hidden" name="StartMonth" value="<%=(String)request.getAttribute("inputDate") %>"></td>
	<input type="hidden" name="counttype" value="<%=(String)request.getAttribute("counttype") %>">
		
	<tr>
			<td class=title0 colspan="13"><font size="5">包头市农电公司电费电量发行单（累计）</font></td>
		</tr>
		<tr>
		<td nowrap colspan="2">
						<span class="title">月份:<%=s %></span>
					</td>
	</tr>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="5">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">售电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">纯电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">电费税</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">电金</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">电金税</font></span>
				<br></td>			
				<td nowrap width="10%">
					<span class="title"><font size="5">三峡</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">三峡税</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">基金</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">基金税</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">差别电费</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">差别电费税</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">总计</font></span>
				<br></td>	
							
			</tr>
	<% 	Collection resultList = (Collection)request.getAttribute("faXingList"); 
		
		for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
				LwPowerFeeFaxingDto faxingDto = (LwPowerFeeFaxingDto) iterator
						.next();
		%>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="5"><%=faxingDto.getUserName() %></font></span>
				
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=faxingDto.getQuantity()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(faxingDto.getPurePowerFee())  %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(faxingDto.getPowerFeeTax())  %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format( faxingDto.getPureDianJin()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(faxingDto.getDianJinTax())  %></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(faxingDto.getSanXiaFee()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(faxingDto.getSanXiaTax())  %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(faxingDto.getPureJiJin())  %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(faxingDto.getJiJinTax())  %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(faxingDto.getChaBieFee())  %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(faxingDto.getChaBieTax())  %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(faxingDto.getSumFee())    %></font></span>
				<br></td>	
							
			</tr>
		<%} %>
			
			
			
			
			
	</table>
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" 打 印 " onClick="printCount();">        </td> 
        </tr> 
    </table>

</form>
</body>
<script language="javascript">
function printCount(){
  var b=fm.StartMonth.value;
  var counttype=fm.counttype.value;
 
strURL = "<%=request.getContextPath()%>/thismonthSumPrint.do?inputDate="+b+"&counttype="+counttype;

	winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");
    
}
</script>

</html:html>
