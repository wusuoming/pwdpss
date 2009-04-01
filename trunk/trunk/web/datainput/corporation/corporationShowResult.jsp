<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleSummaryDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="java.text.DecimalFormat"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>查询页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>大工业计算查询结果页面</title>
<app:css />
<html:base />
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

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

<body>
<form name="fm" method="post" action="">
 <%
		 LwCorporationSummaryDto corporation=(LwCorporationSummaryDto)request.getAttribute("LwCorporationSummaryDto2");
		DecimalFormat df = new DecimalFormat("###0.00");
		
		// 是否停产
	if(corporation.getIfchange().equals("0")){
	// 
      	if(corporation.getQuantityStyle().equals("1") ){
		 %>
		   <table border="1" >
  <tr class=listtitle align="center" >
			<td class=title0 colspan="8"><B><%=corporation.getUserNo()%></B></td>
		</tr>

    <tr>
      
      <td nowrap><span class="title"></span></td>
      <td style="display:none"><input type="hidden" name="LineCode" value="<%=corporation.getLineCode()%>"></td>
            <td style="display:none"><input type="hidden" name="StartMonth" value="<%=corporation.getStatMonth()%>"></td>
            <td nowrap><span class="title">指针电量</span></td>
			<td nowrap><span class="title"><%=corporation.getSumPointerQuantity()%></span></td>
			<td nowrap><span class="title">变损电量</span></td>
			<td nowrap><span class="title"><%=corporation.getLossQuantity()%></span></td>
			<td nowrap><span class="title">总电量</span></td>
			<td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
            <td nowrap><span class="title">力率电费</span></td>
    </tr>
    <tr>
      <td nowrap><span class="title"></span></td>
            <td nowrap><span class="title">无功电量</span></td>
			<td nowrap><span class="title"><%=corporation.getUnPointerQuantity()%></span></td>
			<td nowrap><span class="title">功率因素</span></td>
			<td nowrap><span class="title"><%=corporation.getRateCode()%></span></td>
			<td nowrap><span class="title">调整值</span></td>
			<td nowrap><span class="title"><%=corporation.getAjustRate()%></span></td>
            <td nowrap><span class="title"><%=df.format(corporation.getPowerRateFee())%></span></td>
    </tr>
    <tr>
     <td nowrap><span class="title"></span></td>
            <td nowrap><span class="title">电量</span></td>
			<td nowrap><span class="title">电量</span></td>
			<td nowrap><span class="title">非居民</span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title">容量电费</span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title">需量电费</span></td>
			<%} %>
			
			<td nowrap><span class="title">电金</span></td>
			<td nowrap><span class="title">三峡</span></td>
            <td nowrap><span class="title">基金</td>
    </tr>
    <tr>
      <td nowrap><span class="title">电量</span></td>
            <td nowrap><span class="title"></span></td>
			<td nowrap><span class="title"><%=corporation.getPeakQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getUnDenizenQuantity()%></span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title"><%=corporation.getContentQuantity()%> </span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title"><%=corporation.getNeedQuantity()%> </span></td>
			<%} %>
			<td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
            <td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
    </tr>
    <tr>
      <td nowrap><span class="title">电价</span></td>
            <td nowrap><span class="title"></span></td>
			<td nowrap><span class="title"><%=corporation.getPeakPrice()%></span></td>
			<td nowrap><span class="title"><%=corporation.getUnDenizenPrice()%></span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title"><%=corporation.getContentPrice()%> </span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title"><%=corporation.getNeedPrice()%> </span></td>
			<%} %>
			<td nowrap><span class="title"><%=corporation.getPowerPrice()%></span></td>
			<td nowrap><span class="title"><%=corporation.getSanXiaPrice()%></span></td>
            <td nowrap><span class="title"><%=corporation.getSurchargePrice()%></span></td>
    </tr>
    <tr>
      <td nowrap><span class="title">电费</span></td>
            <td nowrap><span class="title"></span></td>
			<td nowrap><span class="title"><%=df.format(corporation.getPeakFee())%></span></td>
			<td nowrap><span class="title"><%=df.format(corporation.getUnDenizenFee())%></span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title"><%=df.format(corporation.getContentFee())%> </span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title"><%=df.format(corporation.getNeedFee())%> </span></td>
			<%} %>
			<td nowrap><span class="title"><%=df.format(corporation.getPowerFee())%></span></td>
			<td nowrap><span class="title"><%=df.format(corporation.getSanXiaFee())%></span></td>
            <td nowrap><span class="title"><%=df.format(corporation.getSurcharge()) %></span></td>
    </tr>
    <tr>
    <td nowrap><span class="title">电费合计</span></td>
    <td nowrap><span class="title"><%=df.format(corporation.getSumFee())%></span></td>
    </tr>
    <%--
   
   <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" 删除 " onClick="javascript:coporationDel();"></td>
    --%>
     
    
  </table>
  <%} else{%>
  <table border="1">
  <% String taobiaoName = corporation.getTaobiaoName();
  double taobiaoPrice = corporation.getTaobiaoPrice();
  double taobiaoQuantity = corporation.getTaobiaoQuantity();
  double taobiaoFee = corporation.getTaobiaoFee();
          Boolean b = false;
          if(taobiaoName!=null&&!"".equals(taobiaoName)){
          b = true;
          }
           if(b){%>
  <tr class=listtitle align="center">
			<td class=title0 colspan="9"><B><%=corporation.getUserNo()%></B></td>
		</tr>
		<%}else{ %>
		  <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B><%=corporation.getUserNo()%></B></td>
		</tr>
		<%} %>
 
    <tr>
      
      <td nowrap><span class="title"></span></td>
      <td style="display:none"><input type="hidden" name="LineCode" value="<%=corporation.getLineCode()%>"></td>
            <td style="display:none"><input type="hidden" name="StartMonth" value="<%=corporation.getStatMonth()%>"></td>
            <td nowrap><span class="title">功率因素</span></td>
			<td nowrap><span class="title"><%=corporation.getRateCode()%></span></td>
			<td nowrap><span class="title">调整值</span></td>
			<td nowrap><span class="title"><%=corporation.getAjustRate()%></span></td>
			<td nowrap><span class="title"></span></td>
			<td nowrap><span class="title">力率电费</span></td>
            <td nowrap colspan="1"><span class="title"><%=df.format(corporation.getPowerRateFee())%></span></td>
       <% 
           if(b){%>
            <td nowrap colspan="1">
						<span class="title"></span>
					</td>
            <% }else{%>
               
            <%} %>
    </tr>
    <tr>
      <td nowrap><span class="title"></span></td>
            <td nowrap><span class="title">抄见电量</span></td>
			<td nowrap><span class="title">有功电量</span></td>
			<td nowrap><span class="title">非居民</span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title">容量电费</span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title">需量电费</span></td>
			<%} %>
			
			<td nowrap><span class="title">电金</span></td>
			<td nowrap><span class="title">三峡</span></td>
            <td nowrap><span class="title">基金</span></td>
             <% 
           if(b){%>
            <td nowrap colspan="1">
						<span class="title"><%=taobiaoName %></span>
					</td>
            <% }else{%>
               
            <%} %>
            
    </tr>
    <tr>
     <td nowrap><span class="title">电量</span></td>
            <td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getPointerQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getUnDenizenQuantity()%></span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title"><%=corporation.getContentQuantity()%></span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title"><%=corporation.getNeedQuantity()%></span></td>
			<%} %>
			<td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
            <td nowrap><span class="title"><%=corporation.getElectricQuantity()%></td>
             <% 
           if(b){%>
            <td nowrap colspan="1">
						<span class="title"><%=taobiaoQuantity %></span>
					</td>
            <% }else{%>
               
            <%} %>
    </tr>
    <tr>
      <td nowrap><span class="title">电价</span></td>
            <td nowrap><span class="title">无功电量</span></td>
			<td nowrap><span class="title"><%=corporation.getPointerPrice()%></span></td>
			<td nowrap><span class="title"><%=corporation.getUnDenizenPrice()%></span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title"><%=corporation.getContentPrice()%></span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title"><%=corporation.getNeedPrice()%></span></td>
			<%} %>
			<td nowrap><span class="title"><%=corporation.getPowerPrice()%></span></td>
			<td nowrap><span class="title"><%=corporation.getSanXiaPrice()%></span></td>
            <td nowrap><span class="title"><%=corporation.getSurchargePrice()%></span></td>
             <% 
           if(b){%>
            <td nowrap colspan="1">
						<span class="title"><%=taobiaoPrice%></span>
					</td>
            <% }else{%>
               
            <%} %>
    </tr>
    <tr>
      <td nowrap><span class="title">电费</span></td>
            <td nowrap><span class="title"><%=corporation.getUnPointerQuantity()%></span></td>
			<td nowrap><span class="title"><%=df.format(corporation.getPointerFee())%></span></td>
			<td nowrap><span class="title"><%=df.format(corporation.getUnDenizenFee())%></span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title"><%=df.format(corporation.getContentFee())%></span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title"><%=df.format(corporation.getNeedFee())%></span></td>
			<%} %>
			<td nowrap><span class="title"><%=df.format(corporation.getPowerFee())%></span></td>
			<td nowrap><span class="title"><%=df.format(corporation.getSanXiaFee())%></span></td>
            <td nowrap><span class="title"><%=df.format(corporation.getSurcharge())%></span></td>
             <% 
           if(b){%>
            <td nowrap colspan="1">
						<span class="title"><%=taobiaoFee %></span>
					</td>
            <% }else{%>
               
            <%} %>
    </tr>
    <tr>
    <td nowrap><span class="title">电费合计</span></td>
    <td nowrap><span class="title"><%=df.format(corporation.getSumFee())%></span></td>
    </tr>
   
    
  </table>
   <%} %>
   <%} %>
   <%
   if(corporation.getIfchange().equals("1")){
    %>
    <table  border="1">
  <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B><%=corporation.getUserNo()%></B></td>
		</tr>

    <tr>
      
      <td nowrap><span class="title"></span></td>
      <td style="display:none"><input type="hidden" name="LineCode" value="<%=corporation.getLineCode()%>"></td>
            <td style="display:none"><input type="hidden" name="StartMonth" value="<%=corporation.getStatMonth()%>"></td>
            <td nowrap><span class="title">指针电量</span></td>
			<td nowrap><span class="title"><%=corporation.getSumPointerQuantity()%></span></td>
			<td nowrap><span class="title">变损电量</span></td>
			<td nowrap><span class="title"><%=corporation.getLossQuantity()%></span></td>
			<td nowrap><span class="title">总电量</span></td>
			<td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
            <td nowrap><span class="title">力率电费</span></td>
    </tr>
    <tr>
      <td nowrap><span class="title"></span></td>
            <td nowrap><span class="title">无功电量</span></td>
			<td nowrap><span class="title"><%=corporation.getUnPointerQuantity()%></span></td>
			<td nowrap><span class="title">功率因素</span></td>
			<td nowrap><span class="title"><%=corporation.getRateCode()%></span></td>
			<td nowrap><span class="title">调整值</span></td>
			<td nowrap><span class="title"><%=corporation.getAjustRate()%></span></td>
            <td nowrap><span class="title"><%=df.format(corporation.getPowerRateFee())%></span></td>
    </tr>
    <tr>
     <td nowrap><span class="title">电量</span></td>
            <td nowrap><span class="title">电量</span></td>
			<td nowrap><span class="title">电量</span></td>
			<td nowrap><span class="title">非居民</span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title">容量电费</span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title">需量电费</span></td>
			<%} %>
			
			<td nowrap><span class="title">电金</span></td>
			<td nowrap><span class="title">三峡</span></td>
            <td nowrap><span class="title">基金</td>
    </tr>
    <tr>
      <td nowrap><span class="title">电量</span></td>
            <td nowrap><span class="title"><%=corporation.getBeforPower()%></span></td>
			<td nowrap><span class="title"><%=corporation.getLastPower()%></span></td>
			<td nowrap><span class="title"><%=corporation.getUnDenizenQuantity()%></span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title"><%=corporation.getContentQuantity()%> </span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title"><%=corporation.getNeedQuantity()%> </span></td>
			<%} %>
			<td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
            <td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>
    </tr>
    <tr>
      <td nowrap><span class="title">电价</span></td>
            <td nowrap><span class="title"><%=corporation.getBeforPrice()%></span></td>
			<td nowrap><span class="title"><%=corporation.getLastPrice()%></span></td>
			<td nowrap><span class="title"><%=corporation.getUnDenizenPrice()%></span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title"><%=corporation.getContentPrice()%> </span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title"><%=corporation.getNeedPrice()%> </span></td>
			<%} %>
			<td nowrap><span class="title"><%=corporation.getPowerPrice()%></span></td>
			<td nowrap><span class="title"><%=corporation.getSanXiaPrice()%></span></td>
            <td nowrap><span class="title"><%=corporation.getSurchargePrice()%></span></td>
    </tr>
    <tr>
      <td nowrap><span class="title">电费</span></td>
            <td nowrap><span class="title"><%=df.format(corporation.getBeforFee())%></span></td>
			<td nowrap><span class="title"><%=df.format(corporation.getLastFee())%></span></td>
			<td nowrap><span class="title"><%=df.format(corporation.getUnDenizenFee())%></span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title"><%=df.format(corporation.getContentFee())%> </span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title"><%=df.format(corporation.getNeedFee())%> </span></td>
			<%} %>
			<td nowrap><span class="title"><%=df.format(corporation.getPowerFee())%></span></td>
			<td nowrap><span class="title"><%=df.format(corporation.getSanXiaFee())%></span></td>
            <td nowrap><span class="title"><%=df.format(corporation.getSurcharge()) %></span></td>
    </tr>
    <tr>
    <td nowrap><span class="title">电费合计</span></td>
    <td nowrap><span class="title"><%=df.format(corporation.getSumFee())%></span></td>
    </tr>
    <%--
   
   <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" 删除 " onClick="javascript:coporationDel();"></td>
    --%>
     
    
  </table>
  <%} %>
</form>
</body>
<script language="javascript">

function coporationDel(){
	fm.action="/iacontact/corporationFeeDel.do";
	fm.submit();
	
	
}
</script>
</html>