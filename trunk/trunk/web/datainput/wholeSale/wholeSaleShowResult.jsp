<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleSummaryDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>查询页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>趸售计算查询页面</title>
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
		<%
		LwWholeSaleSummaryDto wholeSale=(LwWholeSaleSummaryDto)request.getAttribute("lwWholeSaleSummaryDto");
		//if(wholesaleList==null){}
		//else{
		//Iterator it=wholesaleList.iterator();
     // while(it.hasNext()){
      	//LwWholeSaleSummaryDto wholeSale=(LwWholeSaleSummaryDto)it.next();
		
		if(wholeSale.getWholesaletype().equals("0")){
		 %>
  <table border="1" bordercolor="black">
   <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>趸售查询结果信息</B></td>
		</tr>

    <tr >
            <td nowrap><span class="title">&nbsp</span></td>
            <td style="display:none"><input type="hidden" name="LineCode" value="<%=wholeSale.getLineCode()%>"></td>
            <td style="display:none"><input type="hidden" name="StartMonth" value="<%=wholeSale.getStatMonth()%>"></td>
            <td nowrap><span class="title">指针电量</span></td>
			<td nowrap><span class="title"><%=wholeSale.getPointerQuantity()%></span></td>
			<%
			if(wholeSale.getLineLoss()!=0  ){
			 %>
			<td nowrap><span class="title">线损电量</span></td>
			<td nowrap><span class="title"><%=wholeSale.getLineLoss()%></span></td>
			<%} %>
			<%
			if(wholeSale.getTransLoss()!=0){
			 %>
			<td nowrap><span class="title">变损电量</span></td>
			<td nowrap><span class="title"><%=wholeSale.getTransLoss()%></span></td>
			<%} %>
			<td nowrap><span class="title">总电量</span></td>
			<td nowrap><span class="title"><%=wholeSale.getElectricQuantity()%></span></td>
				<td nowrap><span class="title">&nbsp</span></td>
					<td nowrap><span class="title">&nbsp</span></td>
			
    </tr>
    <tr> 
      <td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">无功电量</span></td>
			<td nowrap><span class="title"><%=wholeSale.getUnPointerQuantity()%></span></td>
			<td nowrap><span class="title">功率因素</span></td>
			<td nowrap><span class="title"><%=wholeSale.getRateCode()%></span> </td>
			<td nowrap><span class="title">调整值</span></td>
			<td nowrap><span class="title"><%=wholeSale.getAdjustRate()%></span></td>
    </tr>
    <tr>
     <td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">农灌</span></td>
			<td nowrap><span class="title">生产</span></td>
			<td nowrap><span class="title">居民</span></td>
			<td nowrap><span class="title">非居民</span></td>
			<td nowrap><span class="title">工业</span></td>
			<td nowrap><span class="title">商业</span></td>
    </tr>
    <tr>
      <td nowrap><span class="title">比例</span></td>
			
			<td nowrap><span class="title"><%=wholeSale.getFarmUseScale()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getProductScale()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getDenizenScale()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getUnDenizenScale()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getIndustryScale()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getBizScale()%></span></td>
    </tr>
    <tr>
       <td nowrap><span class="title">电价</span></td>
			<td nowrap><span class="title"><%=wholeSale.getFarmUsePrice()%> </span></td>
			<td nowrap><span class="title"><%=wholeSale.getProductPrice()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getDenizenPrice()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getUnDenizenPrice()%></td>
			<td nowrap><span class="title"><%=wholeSale.getIndustryPrice()%></td>
			<td nowrap><span class="title"><%=wholeSale.getBizPrice()%></span></td>
    </tr>
    <tr>
            <td nowrap><span class="title">电量</span></td>
            <td nowrap><span class="title"><%=wholeSale.getFarmUseQuantity()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getProductQuantity()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getDenizenQuantity()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getUnDenizenQuantity()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getIndustryQuantity()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getBizQuantity()%></span></td>
			
    </tr>
    <tr>
      <td nowrap><span class="title">电费</span></td>
			<td nowrap><span class="title"><%=wholeSale.getFarmUseFee()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getProductFee()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getDenizenFee()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getUnDenizenFee()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getIndustryFee()%></span></td>
			<td nowrap><span class="title"><%=wholeSale.getBizFee()%></span></td>
    </tr>
    <tr>
       <td nowrap><span class="title">力率电费</span></td>
			<td nowrap><span class="title"><%=wholeSale.getPowerRateFee()%></span></td>
			<td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">&nbsp</span></td>
    </tr>
    <tr>
      <td nowrap><span class="title">电费合计</span></td>
			<td nowrap><span class="title"><%=wholeSale.getSumFee()%></span></td>
			<td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">&nbsp</span></td>
    </tr>
    
   
  </table>
   <%}
    if(wholeSale.getWholesaletype().equals("1")){
    %>
    <table class="fix_table" >
   <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>趸售工业查询结果信息</B></td>
		</tr>
	
    <tr >
            
            <td style="display:none"><input type="hidden" name="LineCode" value="<%=wholeSale.getLineCode()%>"></td>
            <td style="display:none"><input type="hidden" name="StartMonth" value="<%=wholeSale.getStatMonth()%>"></td>
            <td nowrap><span class="title">有功电量</span></td>
			<td nowrap><span class="title"><%=wholeSale.getPointerQuantity()%></span></td>
			<td nowrap><span class="title">无功电量</span></td>
			<td nowrap><span class="title"><%=wholeSale.getUnPointerQuantity()%></span></td>
			<td nowrap><span class="title">功率因素</span></td>
			<td nowrap><span class="title"><%=wholeSale.getRateCode()%></span></td>
			
    </tr>
    <tr>
      <td nowrap><span class="title">电价</span></td>
			
			<td nowrap><span class="title"><%=wholeSale.getIndustryPrice()%></span></td>
			<td nowrap><span class="title">电费</span></td>
			<td nowrap><span class="title"><%=wholeSale.getIndustryFee()%></span> </td>
			<td nowrap><span class="title">调整值</span></td>
			<td nowrap><span class="title"><%=wholeSale.getAdjustRate()%></span></td>
    </tr>
    <tr>
     
			<td nowrap><span class="title">力率电费</span></td>
			<td nowrap><span class="title"><%=wholeSale.getPowerRateFee()%></span></td>
			<td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title">电费合计</span></td>
			<td nowrap><span class="title">&nbsp</span></td>
			<td nowrap><span class="title"><%=wholeSale.getSumFee()%></span></td>
    </tr>
    
  
  </table>
  <%} %>  


</form>
</body>
<script language="javascript">

function wholeSaleDel(){
	fm.action="/iacontact/wholeSaleresultDel.do";
	fm.submit();
	
	
}
</script>
</html>