<%--
*********
******************
大工业计算录入页面  
create by wangrongjia
200810.13
--%>

<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto"/>
    <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>趸售计算录入页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>趸售计算录入页面</title>
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

<body class=interface>







  
    <!--CONTENT BEGIN-->
    
      <form name="fm" method="post" style="display:block;">
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>录入趸售所需信息</B></td>
		</tr>
	<%
		
		LwWholeSaleIndicatorDto  lwWholeSaleIndicatorDto=(LwWholeSaleIndicatorDto)request.getAttribute("lwWholeSaleIndicatorDto");
	 %>
          <tr>
            <td class="title">线路</td>
            <td class="input" ><input class="text" name="UserName" value="<%=lwWholeSaleIndicatorDto.getUserNo()%>"  readonly="readonly" ></td>
			<td style="display: none"><<input name="inputdate" value="<%=lwWholeSaleIndicatorDto.getStatMonth()%>"  readonly="readonly" ></td>
        
          <td class="title">上月有功指针</td>				
				<td class="input" ><input name="LastWorkNum" class="text" value="<%=lwWholeSaleIndicatorDto.getLastWorkNum()%>"  readonly="readonly" ></td>
					</tr>
					
          			<tr>
					<td class="title"  >当月有功指针</td>
            <td class="input" ><input name="ThisWorkNum" value="<%=lwWholeSaleIndicatorDto.getThisWorkNum()%>"  readonly="readonly" class="text"></td>
			  
				 <td class="title"  >上月无功指针</td>				
				<td class="input" ><input name="LastIdleNum" value="<%=lwWholeSaleIndicatorDto.getLastIdleNum()%>" class="text" readonly="readonly"></td>
		</tr>
		<tr>
		<td class="title" id="gzy1" >当月无功指针</td>				
				<td class="input" ><input name="ThisIdleNum" value="<%=lwWholeSaleIndicatorDto.getThisIdleNum()%>"  class="text" readonly="readonly"></td>
				<td class="title"  >倍率</td>				
				<td class="input" ><input name="Rate" value="<%=lwWholeSaleIndicatorDto.getRate()%>"  class="text" readonly="readonly"></td>
		</tr>
		
		<tr>
		<td class="title" id="gzw1">有功电量</td>				
				 <td class="input" ><input name="workQuantity" value="<%=lwWholeSaleIndicatorDto.getWorkQuantity()%>" class="text" readonly="readonly"></td>
				<td class="title" >无功电量</td>				
				<td class="input" ><input name="unworkQuantity" value="<%=lwWholeSaleIndicatorDto.getUnworkQuantity()%>" class="text" readonly="readonly" ></td>
		</tr>
         
           <tr>
           <td class="title">线损比例 %</td>	
         <%
						if(lwWholeSaleIndicatorDto.getLineLossQuantity()==0){
						 %>
						<td class="input" ><input name="LineLossQuantity" class="text" readonly="readonly">%</td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="LineLossQuantity" value="<%=lwWholeSaleIndicatorDto.getLineLossQuantity()%>" class="text" readonly="readonly">%</td>
						 <%} %>
          
         
            <td class="title">变损电量</td>
             <%
						if(lwWholeSaleIndicatorDto.getTransLossQuantity()==0){
						 %>
						<td class="input" ><input class="text" name="TransLossQuantity" class="text" readonly="readonly"></td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="TransLossQuantity" value="<%=lwWholeSaleIndicatorDto.getTransLossQuantity()%>" ></td>
						 <%} %>
			</tr>
			<tr>
			<td class="title">换表有功电量</td>
           <%
						if(lwWholeSaleIndicatorDto.getChgAmmeterQuantity()==0 ){
						 %>
						<td class="input" ><input name="ChgAmmeterQuantity"  readonly="readonly"  class="text"></td>
						<%}
						else{
						 %>
						 <td class="input" ><input name="ChgAmmeterQuantity" value="<%=lwWholeSaleIndicatorDto.getChgAmmeterQuantity()%>" class="text" readonly="readonly" ></td>
						<%} %>
		  
		   <td class="title">换表无功电量</td>
            <%
						if(lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity()==0 ){
						 %>
						<td class="input" ><input name="UnChgAmmeterQuantity"  readonly="readonly" class="text"></td>
						<%}
						else{
						 %>
						 <td class="input" ><input name="UnChgAmmeterQuantity" value="<%=lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity()%>"  readonly="readonly"  class="text"></td>
						<%} %>
          </tr>
          <tr>
			<%--<td class="title">增减电量</td>
          <%
						if(lwWholeSaleIndicatorDto.getExcepQuantity()==0){
						 %>
						<td class="input" ><input name="ExcepQuantity" class="text" readonly="readonly"></td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="ExcepQuantity" value="<%=lwWholeSaleIndicatorDto.getExcepQuantity()%>" class="text" readonly="readonly"></td>
						 <%} %>
		  
		   --%><td class="title">退补有功电量</td>
             <%
						if(lwWholeSaleIndicatorDto.getCompensateQuantity() ==0){
						 %>
						<td class="input" ><input name="CompensateQuantity" class="text" readonly="readonly"></td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="CompensateQuantity" value="<%=lwWholeSaleIndicatorDto.getCompensateQuantity()%>" class="text" readonly="readonly"></td>
						 <%} %>
						 
						 <td class="title">退补无功电量</td>
             <%
						if(lwWholeSaleIndicatorDto.getUnCompensateQuantity() ==0){
						 %>
						<td class="input" ><input name="UnCompensateQuantity" class="text" readonly="readonly"></td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="UnCompensateQuantity" value="<%=lwWholeSaleIndicatorDto.getUnCompensateQuantity()%>" class="text" readonly="readonly"></td>
						 <%} %>
						
          </tr>
          
		  <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" 计算并保存 " onClick="javascript:cauculate();"></td>
		 
</tr>
        </table>
      
     <br />

	
	
</form>
 <iframe id="fm2" name="fm2" width="100%" src=""  frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="yes" allowtransparency="yes" ></iframe>
<script language="javascript">



</script>
<br />
  

</body>
</html>
</html:html>