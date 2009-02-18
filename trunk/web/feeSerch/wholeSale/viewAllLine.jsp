<%@ page contentType="text/html; charset=GBK"%>
<jsp:directive.page import="java.util.Collection"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleSummaryDto"/>
<jsp:directive.page import="java.text.DecimalFormat"/>
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
			<td class=title0 colspan="12" width="100%"><B><font size="3">计算结果显示</font></B></td>
		</tr>
	
	<!--点击新增时显示的新增路径条件部分(公用)-->
	
	
		<tr class=listtitle>
			<td nowrap><span class="title">线路名称 </span></td>
			<td nowrap><span class="title">有功指针 </span></td>
			<td nowrap><span class="title">无功指针 </span></td>
			<td nowrap><span class="title">有功电量</span></td>
			<td nowrap><span class="title">无功电量</span></td>
			<td nowrap><span class="title">变损电量</span></td>
			<td nowrap><span class="title">线损电量</span></td>
			<td nowrap><span class="title">总电量</span></td>
			
			<td nowrap><span class="title">功率因素</span></td>
			<td nowrap><span class="title">调整值</span></td>
				<td nowrap><span class="title">力率电费</span></td>
			<td nowrap><span class="title">总电费</span></td>
			
			
		</tr>
		<tr>
					<td nowrap><span class="title">10KV线路 </span></td>
					</tr>
			<%
			//String count10Fee=(String)request.getAttribute("count10Fee");
			//String sum10Fee=(String)request.getAttribute("sum10Fee");
			//String sum10Power=(String)request.getAttribute("sum10Power");
			//String Rate10Fee=(String)request.getAttribute("Rate10Fee");
			//String allRateCode10=request.getAttribute("allRateCode10").toString();
			//String allPowerRateFee10=request.getAttribute("allPowerRateFee10").toString();
			//String usum10power=(String)request.getAttribute("usum10power");
			String sum10Fee=(String)request.getAttribute("sum10Fee");
			String sum35Fee=(String)request.getAttribute("sum35Fee");
			String Rate10Fee=(String)request.getAttribute("Rate10Fee");
			String Rate35Fee=(String)request.getAttribute("Rate35Fee");
			String sumfFee=(String)request.getAttribute("sumfFee");
			String RatefFee=(String)request.getAttribute("RatefFee");
			String sumfpower=(String)request.getAttribute("sumfpower");
			String usumfpower=(String)request.getAttribute("usumfpower");
			String sum10Power=(String)request.getAttribute("sum10Power");
			String sum35power=(String)request.getAttribute("sum35power");
			String usum10power=(String)request.getAttribute("usum10power");
			String usum35power=(String)request.getAttribute("usum35power");
				DecimalFormat df = new DecimalFormat("###0.00");	
			List list10=(List)request.getAttribute("kv10");
			if(list10!=null){
			Iterator it10=list10.iterator();
			while(it10.hasNext()){
			LwWholeSaleSummaryDto  lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it10.next();
		
			
			 %>

					<tr >
						<td class="input" align="center"><%=lwWholeSaleSummaryDto.getLineCode()%><%--<input   name="UserName" value="<%=lwWholeSaleSummaryDto.getLineCode()%>" style="border:0" readonly="readonly" style="width:65px"></td>--%>
						<td class="input" align="center"><input   name="workPointer" value="<%=lwWholeSaleSummaryDto.getWorkNum()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="unworkPointer" value="<%=lwWholeSaleSummaryDto.getUnWorkNum()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="pointerPower" value="<%=Math.round(lwWholeSaleSummaryDto.getPointerQuantity())%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="unworkPower" value="<%=Math.round(lwWholeSaleSummaryDto.getUnPointerQuantity())%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getTransLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getLineLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="sumPower" value="<%=lwWholeSaleSummaryDto.getElectricQuantity()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						
						<td class="input" align="center"><input   name="rateCode" value="<%=lwWholeSaleSummaryDto.getRateCode()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="ajustRate" value="<%=lwWholeSaleSummaryDto.getAdjustRate()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="powerFee" value="<%=df.format(lwWholeSaleSummaryDto.getPowerRateFee())%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="sumFee" value="<%=df.format(lwWholeSaleSummaryDto.getSumFee())%>" style="border:0" readonly="readonly" style="width:65px"></td>
						</tr>
					<%} 
					}
					%><%--
					<tr>
					<td nowrap><span class="title">10KV参与比例电费总计 </span></td>
			<td nowrap><span class="title">有功电量</span></td>
			<td nowrap><span class="title">无功电量</span></td>
			<td nowrap><span class="title">功率因素</span></td>
			<td nowrap><span class="title">调整值</span></td>
			
			<td nowrap><span class="title">总电费</span></td>
			<td nowrap><span class="title">利率电费</span></td>
				<td nowrap><span class="title">电费合计</span></td>
			
					</tr>
					<tr>
			 <td class=input>		
            <td class=input><input name="sum10Power" type="text" class="text" value="<%=sum10Power%>" ></td>
            <td class=input><input name="usum10power" type="text" class="text" value="<%=usum10power%>" ></td>
             <td class=input><input name="allRateCode10" type="text" class="text" value="<%=allRateCode10%>" ></td>
            <td class=input><input name="allPowerRateFee10" type="text" class="text" value="<%=allPowerRateFee10%>" ></td>
             <td class=input><input name="count10Fee" type="text" class="text" value="<%=count10Fee%>" ></td>
            <td class=input><input name="Rate10Fee" type="text" class="text" value="<%=Rate10Fee%>" ></td>
             <td class=input><input name="sum10Fee" type="text" class="text" value="<%=sum10Fee%>" ></td>
					</tr>
						--%>
						<tr>
					<td nowrap><span class="title">35KV线路 </span></td>
					</tr>
						<%
						//String sum35Fee=(String)request.getAttribute("sum35Fee");
		//	String count35Fee=(String)request.getAttribute("count35Fee");
			////String sum35power=(String)request.getAttribute("sum35power");
			
			List list35=(List)request.getAttribute("kv35");
			if(list35!=null){
			Iterator it35=list35.iterator();
			while(it35.hasNext()){
			LwWholeSaleSummaryDto  lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it35.next();
			 %>
					<tr >
						<td class="input" align="center"><input   name="UserName" value="<%=lwWholeSaleSummaryDto.getLineCode()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="workPointer" value="<%=lwWholeSaleSummaryDto.getWorkNum()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="unworkPointer" value="<%=lwWholeSaleSummaryDto.getUnWorkNum()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="pointerPower" value="<%=Math.round(lwWholeSaleSummaryDto.getPointerQuantity())%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="unworkPower" value="<%=Math.round(lwWholeSaleSummaryDto.getUnPointerQuantity())%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getTransLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getLineLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="sumPower" value="<%=Math.round(lwWholeSaleSummaryDto.getElectricQuantity())%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="rateCode" value="<%=lwWholeSaleSummaryDto.getRateCode()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="ajustRate" value="<%= lwWholeSaleSummaryDto.getAdjustRate()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="powerFee" value="<%=df.format(lwWholeSaleSummaryDto.getPowerRateFee())%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="sumFee" value="<%=df.format(lwWholeSaleSummaryDto.getSumFee())%>" style="border:0" readonly="readonly" style="width:65px"></td>
						</tr>
					<%} 
					}
					%>
					<%--<tr>
					<td nowrap><span class="title">35KV参与比例电费总计 </span></td>
			<td nowrap><span class="title">有功电量</span></td>
			<td nowrap><span class="title">无功电量</span></td>
			<td nowrap><span class="title">功率因素</span></td>
			<td nowrap><span class="title">调整值</span></td>
			<td nowrap><span class="title">总电费</span></td>
			<td nowrap><span class="title">利率电费</span></td>
				<td nowrap><span class="title">电费合计</span></td>
					</tr>
					<tr>
				 <td class=input>	
            <td class=input><input name="sum35power" type="text" class="text" value="<%=sum35power%>" ></td>
            <td class=input><input name="usum35power" type="text" class="text" value="<%=usum35power%>" ></td>
             <td class=input><input name="allRateCode35" type="text" class="text" value="<%=allRateCode35%>" ></td>
            <td class=input><input name="allPowerRateFee35" type="text" class="text" value="<%=allPowerRateFee35%>" ></td>
             <td class=input><input name="count35Fee" type="text" class="text" value="<%=count35Fee%>" ></td>
            <td class=input><input name="Rate35Fee" type="text" class="text" value="<%=Rate35Fee%>" ></td>
             <td class=input><input name="sum35Fee" type="text" class="text" value="<%=sum35Fee%>" ></td>
					</tr>
					
		
	--%>
	<tr>
	<td nowrap><span class="title">10kv</span></td>
			<td nowrap><span class="title">利率电费</span></td>
			<td nowrap><span class="title"><%=Rate10Fee%></span></td>
				<td nowrap><span class="title">电费合计</span></td>
				<td nowrap><span class="title"><%=sum10Fee%></span></td>
	</tr>
	<tr>
	<td nowrap><span class="title">趸售工业</span></td>
			<td nowrap><span class="title">利率电费</span></td>
			<td nowrap><span class="title"><%=RatefFee%></span></td>
				<td nowrap><span class="title">电费合计</span></td>
				<td nowrap><span class="title"><%=sumfFee%></span></td>
	</tr>
	
	<tr>
	<td nowrap><span class="title">35kv</span></td>
			<td nowrap><span class="title">利率电费</span></td>
			<td nowrap><span class="title"><%=Rate35Fee%></span></td>
				<td nowrap><span class="title">电费合计</span></td>
				<td nowrap><span class="title"><%=sum35Fee%></span></td>
	</tr>
	
	</table>
	
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" 打 印 " onClick="doPrint()">        </td> 
        </tr> 
	<!-- 按钮的显示-->
</body>
<script language="javascript">
function doPrint(){
	window.print();
}
</script>
</html>
