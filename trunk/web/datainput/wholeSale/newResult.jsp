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
  
<title>���ۼ�����ҳ��</title>
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
<%double dh312quantity = 0; %>
	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="11" width="100%"><B><font size="3">��������ʾ</font></B></td>
		</tr>
	
	<!--�������ʱ��ʾ������·����������(����)-->
	
	
		<tr class=listtitle>
			<td nowrap><span class="title">��·����/���� </span></td>
			<td nowrap><span class="title">�й�����</span></td>
			<td nowrap><span class="title">�޹�����</span></td>
			<td nowrap><span class="title">�й��������</span></td>
			<td nowrap><span class="title">�޹��������</span></td>
			<td nowrap><span class="title">�������</span></td>
			<td nowrap><span class="title">�ܵ���</span></td>
			
			<td nowrap><span class="title">��������</span></td>
			<td nowrap><span class="title">����ֵ</span></td>
				<td nowrap><span class="title">���ʵ��</span></td>
			<td nowrap><span class="title">�ܵ��</span></td>
			
			
		</tr>
		
			<%
			String count10Fee=(String)request.getAttribute("count10Fee");
			String sum10Fee=(String)request.getAttribute("sum10Fee");
			String sum10Power=(String)request.getAttribute("sum10Power");
			String Rate10Fee=(String)request.getAttribute("Rate10Fee");
			String allRateCode10=request.getAttribute("allRateCode10").toString();
			String allPowerRateFee10=request.getAttribute("allPowerRateFee10").toString();
			String usum10power=(String)request.getAttribute("usum10power");
			
			List list10=(List)request.getAttribute("kv10");
			if(list10!=null){
			Iterator it10=list10.iterator();
			while(it10.hasNext()){
			LwWholeSaleSummaryDto  lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it10.next();
		
			
			 %>

					<tr >
						<td class="input" align="center"><input   name="UserName" value="<%=lwWholeSaleSummaryDto.getLineCode()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="pointerPower" value="<%=lwWholeSaleSummaryDto.getPointerQuantity()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="unworkPower" value="<%=lwWholeSaleSummaryDto.getUnPointerQuantity()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getTransLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getUnTransLoss() %>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getLineLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="sumPower" value="<%=lwWholeSaleSummaryDto.getElectricQuantity()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						
						<td class="input" align="center"><input   name="rateCode" value="<%=lwWholeSaleSummaryDto.getRateCode()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="ajustRate" value="<%=lwWholeSaleSummaryDto.getAdjustRate()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="powerFee" value="<%=lwWholeSaleSummaryDto.getPowerRateFee()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" align="center"><input   name="sumFee" value="<%=lwWholeSaleSummaryDto.getSumFee()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						</tr>
					<%} 
					}
					%>
					<tr>
					<td nowrap><span class="title">10KV�����������ܼ� </span></td>
			<td nowrap><span class="title">�й�����</span></td>
			<td nowrap><span class="title">�޹�����</span></td>
			<td nowrap><span class="title">��������</span></td>
			<td nowrap><span class="title">����ֵ</span></td>
			
			<td nowrap><span class="title">�ܵ��</span></td>
			<td nowrap><span class="title">���ʵ��</span></td>
				<td nowrap><span class="title">��Ѻϼ�</span></td>
			
					</tr>
					<tr>
			 <td class=input>		
            <td class=input><input name="sum10Power" type="text" class="text" style="width:90px" value="<%=sum10Power%>" ></td>
            <td class=input><input name="usum10power" type="text" class="text" style="width:90px"  value="<%=usum10power%>" ></td>
             <td class=input><input name="allRateCode10" type="text" class="text" style="width:90px"  value="<%=allRateCode10%>" ></td>
            <td class=input><input name="allPowerRateFee10" type="text" class="text" style="width:90px"  value="<%=allPowerRateFee10%>" ></td>
             <td class=input><input name="count10Fee" type="text" class="text" style="width:90px"  value="<%=count10Fee%>" ></td>
            <td class=input><input name="Rate10Fee" type="text" class="text" style="width:90px"  value="<%=Rate10Fee%>" ></td>
             <td class=input><input name="sum10Fee" type="text" class="text" style="width:90px"  value="<%=sum10Fee%>" ></td>

					</tr>
					<tr >
					
						<td class="input">��·����</td>
						<td class="input">�й�����</td>
						<td class="input">�޹�����</td>
						<td class="input">��������</td>
						<td class="input">����ֵ</td>
						<td class="input">�й�����</td>
						<td class="input">�޹�����</td>
						<td class="input">����</td>
						<td class="input">���</td>
						
						<td class="input">���ʵ��</td>
						<td class="input">��Ѻϼ�</td>
						</tr>
						<%
						String sum35Fee=(String)request.getAttribute("sum35Fee");
						
			String count35Fee=(String)request.getAttribute("count35Fee");
			
			String sum35power=(String)request.getAttribute("sum35power");
			String Rate35Fee=(String)request.getAttribute("Rate35Fee");
		
			String allRateCode35=request.getAttribute("allRateCode35").toString();
			String allPowerRateFee35=request.getAttribute("allPowerRateFee35").toString();
			String usum35power=(String)request.getAttribute("usum35power");
			List list35=(List)request.getAttribute("kv35");
			if(list35!=null){
			Iterator it35=list35.iterator();
			
			while(it35.hasNext()){
			LwWholeSaleSummaryDto  lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it35.next();
			String lingCode = lwWholeSaleSummaryDto.getLineCode();
			
			 %>

					<tr >
					<td class="input"><input   name="UserName" value="<%=lwWholeSaleSummaryDto.getLineCode()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input"><input   name="pointerPower" value="<%=lwWholeSaleSummaryDto.getPointerQuantity()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<%if("���ӱ�312".equals(lingCode)) {
						dh312quantity = lwWholeSaleSummaryDto.getLineLoss();
						%>
						<td class="input"><input   name="unworkPower" value="<%=lwWholeSaleSummaryDto.getUnPointerQuantity()+lwWholeSaleSummaryDto.getLineLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<%}else{ %>
						<td class="input"><input   name="unworkPower" value="<%=lwWholeSaleSummaryDto.getUnPointerQuantity()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<%} %>
						
						<td class="input"><input   name="rateCode" value="<%=lwWholeSaleSummaryDto.getRateCode()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input"><input   name="ajustRate" value="<%=lwWholeSaleSummaryDto.getAdjustRate()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getTransLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getUnTransLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input"><input   name="transLoss" value="<%=lwWholeSaleSummaryDto.getLineLoss()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input"><input   name="sumPower" value="<%=lwWholeSaleSummaryDto.getElectricQuantity()%>"  style="border:0" readonly="readonly" style="width:65px"></td>
						
						<td class="input"><input   name="powerFee" value="<%=lwWholeSaleSummaryDto.getPowerRateFee()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input"><input   name="sumFee" value="<%=lwWholeSaleSummaryDto.getSumFee()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						</tr>
					<%} 
					}
					%>
					<tr>
					<td nowrap><span class="title">35KV�����������ܼ� </span></td>
			<td nowrap><span class="title">�й�����</span></td>
			<td nowrap><span class="title">�޹�����</span></td>
			<td nowrap><span class="title">��������</span></td>
			<td nowrap><span class="title">����ֵ</span></td>
			
			<td nowrap><span class="title">�ܵ��</span></td>
			<td nowrap><span class="title">���ʵ��</span></td>
				<td nowrap><span class="title">��Ѻϼ�</span></td>
			
					</tr>
					<tr>
				 <td class=input>	
            <td class=input><input name="sum35power" type="text" class="text" value="<%=sum35power%>" ></td>
            <td class=input><input name="usum35power" type="text" class="text" value="<%=Double.parseDouble(usum35power)+dh312quantity%>" ></td>
             <td class=input><input name="allRateCode35" type="text" class="text" value="<%=allRateCode35%>" ></td>
            <td class=input><input name="allPowerRateFee35" type="text" class="text" value="<%=allPowerRateFee35%>" ></td>
             <td class=input><input name="count35Fee" type="text" class="text" value="<%=count35Fee%>" ></td>
            <td class=input><input name="Rate35Fee" type="text" class="text" value="<%=Rate35Fee%>" ></td>
             <td class=input><input name="sum35Fee" type="text" class="text" value="<%=sum35Fee%>" ></td>

					</tr>
		
		
	</table>
	
	
	<!-- ��ť����ʾ-->
<table cellpadding="0" cellspacing="0" width="100%">
<tr>
<td>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button
				name=button0 value="�� ӡ" onclick="getPage()"></td>
		
	</table>
	</td>

	</tr>
	</table>

</body>

<script language="javascript">
function savePointer(){
	fm.action="/iacontact/inputLWWholeSalePointerShow.do";
	fm.submit();
}

function getPage(){

	window.print();
}
</script>


</html>
