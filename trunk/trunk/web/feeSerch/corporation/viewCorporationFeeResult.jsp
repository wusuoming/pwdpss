<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleSummaryDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
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
</head>
<body>
<form name="fm" method="post" action="">
  <table >
  <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>大工业查询结果信息</B></td>
		</tr>
  <%
		List coporationList=(List)request.getAttribute("collectioncorporation");
		Iterator it=coporationList.iterator() ;
      while(it.hasNext()){
      	LwCorporationSummaryDto corporation=(LwCorporationSummaryDto)it.next();
		 %>
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
            <td nowrap><span class="title"><%=corporation.getPowerRateFee()%></span></td>
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
    </tr>
    <tr>
      <td nowrap><span class="title">电费</span></td>
            <td nowrap><span class="title"><%=corporation.getUnPointerQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getPointerFee()%></span></td>
			<td nowrap><span class="title"><%=corporation.getUnDenizenFee()%></span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			<td nowrap><span class="title"><%=corporation.getContentFee()%></span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			<td nowrap><span class="title"><%=corporation.getNeedFee()%></span></td>
			<%} %>
			<td nowrap><span class="title"><%=corporation.getPowerFee()%></span></td>
			<td nowrap><span class="title"><%=corporation.getSanXiaFee()%></span></td>
            <td nowrap><span class="title"><%=corporation.getSurcharge()%></span></td>
    </tr>
    <tr>
    <td nowrap><span class="title">电费合计</span></td>
    <td nowrap><span class="title"><%=corporation.getSumFee()%></span></td>
    </tr>
    <%} %><%--
    <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" 删除 " onClick="javascript:coporationDel();"></td>
  --%></table>
</form>
</body>
<script language="javascript">

function coporationDel(){
	fm.action="/iacontact/corporationFeeDel.do";
	fm.submit();
	
	
}
</script>
</html>