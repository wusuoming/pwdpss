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
  
<title>��ѯҳ��</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>��ҵ�����ѯ���ҳ��</title>
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
			<td class=title0 colspan="8"><B>��ҵ��ѯ�����Ϣ</B></td>
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
            <td nowrap><span class="title">��������</span></td>
			<td nowrap><span class="title"><%=corporation.getRateCode()%></span></td>
			<td nowrap><span class="title">����ֵ</span></td>
			<td nowrap><span class="title"><%=corporation.getAjustRate()%></span></td>
			<td nowrap><span class="title"></span></td>
			<td nowrap><span class="title">���ʵ��</span></td>
            <td nowrap><span class="title"><%=corporation.getPowerRateFee()%></span></td>
    </tr>
    <tr>
      <td nowrap><span class="title"></span></td>
            <td nowrap><span class="title">��������</span></td>
			<td nowrap><span class="title">�й�����</span></td>
			<td nowrap><span class="title">�Ǿ���</span></td>
			<% 
			if(corporation.getFlag().equals("2")){
			%>
			
			<td nowrap><span class="title">�������</span></td>
			<%} %>
			<% 
			if(corporation.getFlag().equals("1")){
			%>
			
			<td nowrap><span class="title">�������</span></td>
			<%} %>
			<td nowrap><span class="title">���</span></td>
			<td nowrap><span class="title">��Ͽ</span></td>
            <td nowrap><span class="title">����</span></td>
    </tr>
    <tr>
     <td nowrap><span class="title">����</span></td>
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
      <td nowrap><span class="title">���</span></td>
            <td nowrap><span class="title">�޹�����</span></td>
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
      <td nowrap><span class="title">���</span></td>
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
    <td nowrap><span class="title">��Ѻϼ�</span></td>
    <td nowrap><span class="title"><%=corporation.getSumFee()%></span></td>
    </tr>
    <%} %><%--
    <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" ɾ�� " onClick="javascript:coporationDel();"></td>
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