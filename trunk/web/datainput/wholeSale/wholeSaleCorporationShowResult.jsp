<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleSummaryDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>��ѯҳ��</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>���ۼ����ѯҳ��</title>
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
  <table class="fix_table" >
   <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>���۹�ҵ��ѯ�����Ϣ</B></td>
		</tr>
		<%
		List wholesaleList=(List)request.getAttribute("collectionwholesale");
		if(wholesaleList==null){}
		else{
		Iterator it=wholesaleList.iterator();
      while(it.hasNext()){
      	LwWholeSaleSummaryDto wholeSale=(LwWholeSaleSummaryDto)it.next();
		 %>
    <tr >
            
            <td style="display:none"><input type="hidden" name="LineCode" value="<%=wholeSale.getLineCode()%>"></td>
            <td style="display:none"><input type="hidden" name="StartMonth" value="<%=wholeSale.getStatMonth()%>"></td>
            <td nowrap><span class="title">�й�����</span></td>
			<td nowrap><span class="title"><%=wholeSale.getPointerQuantity()%></span></td>
			<td nowrap><span class="title">�޹�����</span></td>
			<td nowrap><span class="title"><%=wholeSale.getUnPointerQuantity()%></span></td>
			<td nowrap><span class="title">��������</span></td>
			<td nowrap><span class="title"><%=wholeSale.getRateCode()%></span></td>
			
    </tr>
    <tr>
      <td nowrap><span class="title">���</span></td>
			
			<td nowrap><span class="title"><%=wholeSale.getIndustryPrice()%></span></td>
			<td nowrap><span class="title">���</span></td>
			<td nowrap><span class="title"><%=wholeSale.getIndustryFee()%></span> </td>
			<td nowrap><span class="title">����ֵ</span></td>
			<td nowrap><span class="title"><%=wholeSale.getAdjustRate()%></span></td>
    </tr>
    <tr>
     
			<td nowrap><span class="title">���ʵ��</span></td>
			<td nowrap><span class="title"><%=wholeSale.getPowerRateFee()%></span></td>
			<td nowrap><span class="title"></span></td>
			<td nowrap><span class="title">��Ѻϼ�</span></td>
			<td nowrap><span class="title"></span></td>
			<td nowrap><span class="title"><%=wholeSale.getSumFee()%></span></td>
    </tr>
    
    <%}%>
   <%} %>
  </table>

</form>
</body>

</html>