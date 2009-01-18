<%@ page contentType="text/html; charset=GBK"%>
<jsp:directive.page import="java.util.Collection"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleSummaryDto"/>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>趸售计算结果页面</title>
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

<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
	<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
	<!-- calendar stylesheet -->
  <link rel="stylesheet" type="text/css" media="all" href="../../../../iacontact/css/calendar-win2k-cold-1.css" title="win2k-cold-1" />

  <!-- main calendar program -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar.js"></script>

  <!-- language for the calendar -->

  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-cn-utf8.js"></script>

  <!-- the following script defines the Calendar.setup helper function, which makes
       adding a calendar a matter of 1 or 2 lines of code. -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-setup.js"></script>
</head>
<body class=interface>
<html:errors />

<form  name="fm" method="post">

	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="10" width="100%"><B><font size="3">统计结果</font></B></td>
		</tr>
	
	<!--点击新增时显示的新增路径条件部分(公用)-->
	
	
		<tr class=listtitle>
			<td nowrap><span class="title">线路名称/户号 </span></td>
			<td nowrap><span class="title">指针电量</span></td>
			<td nowrap><span class="title">变损电量</span></td>
			<td nowrap><span class="title">线损电量</span></td>
			<td nowrap><span class="title">总电量</span></td>
			<td nowrap><span class="title">无功电量</span></td>
			<td nowrap><span class="title">功率因素</span></td>
			<td nowrap><span class="title">调整值</span></td>
				<td nowrap><span class="title">力率电费</span></td>
			<td nowrap><span class="title">总电费</span></td>
			
			
		</tr>
		
			<%
			String count10Fee=request.getAttribute("count10Fee").toString();
			String sum10Power=request.getAttribute("sum10Power").toString();
			List list10=(List)request.getAttribute("kv10");
			if(list10!=null){
			Iterator it10=list10.iterator();
			while(it10.hasNext()){
			LwWholeSaleSummaryDto  lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it10.next();
		
			
			 %>

					<tr >
						<td class="input" align="center"><input   name="UserName" value="<%=lwWholeSaleSummaryDto.getLineCode()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="pointerPower" value="<%=lwWholeSaleSummaryDto.getPointerQuantity()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getTransLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getLineLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="sumPower" value="<%=lwWholeSaleSummaryDto.getElectricQuantity()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="unworkPower" value="<%=lwWholeSaleSummaryDto.getUnPointerQuantity()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="rateCode" value="<%=lwWholeSaleSummaryDto.getRateCode()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="ajustRate" value="<%=lwWholeSaleSummaryDto.getAdjustRate()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="powerFee" value="<%=lwWholeSaleSummaryDto.getPowerRateFee()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="sumFee" value="<%=lwWholeSaleSummaryDto.getSumFee()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						</tr>
					<%} 
					}
					%>
					<tr>
					<td class=title>10KV电费总计</td>
            <td class=input><input name=count10Fee type="text" class="text" value="<%=count10Fee%>" readonly="readonly"></td>
            <td class=input><input name=sum10Power type="text" class="text" value="<%=sum10Power%>" readonly="readonly"></td>
					</tr>
						<%
			String count35Fee=request.getAttribute("count35Fee").toString();
			List list35=(List)request.getAttribute("kv35");
			if(list35!=null){
			Iterator it35=list35.iterator();
			while(it35.hasNext()){
			LwWholeSaleSummaryDto  lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it35.next();
			
			
			 %>

					<tr >
						<td class="input" align="center"><input   name="UserName" value="<%=lwWholeSaleSummaryDto.getLineCode()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="pointerPower" value="<%=lwWholeSaleSummaryDto.getPointerQuantity()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getTransLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getLineLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="sumPower" value="<%=lwWholeSaleSummaryDto.getElectricQuantity()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="unworkPower" value="<%=lwWholeSaleSummaryDto.getUnPointerQuantity()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="rateCode" value="<%=lwWholeSaleSummaryDto.getRateCode()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="ajustRate" value="<%=lwWholeSaleSummaryDto.getAdjustRate()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="powerFee" value="<%=lwWholeSaleSummaryDto.getPowerRateFee()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="sumFee" value="<%=lwWholeSaleSummaryDto.getSumFee()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						</tr>
					<%} 
					}
					%>
					<tr>
					<td class=title>35KV电费总计</td>
            <td class=input><input name=count10Fee type="text" class="text" value="<%=count35Fee%>" readonly="readonly"></td>
             <td class=input><input name=sum10Power type="text" class="text" value="<%=sum10Power%>" readonly="readonly"></td>
					</tr>
		
		
	</table>
	
	
	<!-- 按钮的显示-->
<table cellpadding="0" cellspacing="0" width="100%">
<tr>
<td>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button
				name=button0 value="打印" onclick="savePointer()"></td>
		
	</table>
	</td>

	</tr>
	</table>

</body>

<script language="javascript">
function savePointer(){
	window.print();
}


</script>


</html>
