<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<%@page import="com.elongway.pss.util.AppConst"%>
<%@page import="com.elongway.pss.ui.control.common.pub.SysUser"%>
<%@page import="java.text.DecimalFormat"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %> 

<%
	// ��ǰ����
	Date currentDate = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");	
%> 

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>ֱ�����ѷ��е�</title>
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
</head>
<body onload="javascript:doPrint();window.close()">
<html:errors />
<% String statMonth = (String)request.getAttribute("statMonth");
DecimalFormat df = new DecimalFormat("###0.00");
%>
<form  name="fm">
	<%
	Collection resultList = (Collection)request.getAttribute("resultList"); 
		for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
				TownSataDto townSataDto = (TownSataDto) iterator
						.next();
		%>
		
	<table class=common width="500%" cellspacing="0" cellpadding="5" border="1">
		
		
		<tr>
			<td class=title0 colspan="11"><b><font size="4">��ͷ��ũ�繫˾<%=statMonth %>��ѵ������е�</font></td>
		</tr>
		
		<!--��Ա���룬����-->
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><b><font size="4">��λ</font></b></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><b><font size="4">�۵���</font></b></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><b><font size="4">�����</font></b></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><b><font size="4">���˰</font></b></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><b><font size="4">���</font></b></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><b><font size="4">���˰</font></b></span>
				<br></td>			
				<td nowrap width="10%">
					<span class="title"><b><font size="4">��Ͽ</font></b></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><b><font size="4">��Ͽ˰</font></b></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><b><font size="4">����</font></b></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><b><font size="4">����˰</font></b></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><b><font size="4">�ܼ�</font></b></span>
				<br></td>	
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4"><%=townSataDto.getCompanyName()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(townSataDto.getSumPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(townSataDto.getPurePowerFee()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(townSataDto.getPowerFeeTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(townSataDto.getPureDianJin()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(townSataDto.getDianJinTax()) %></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(townSataDto.getPureSanXia()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(townSataDto.getSanXiaTax()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(townSataDto.getPureJiJin()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(townSataDto.getJiJinTax()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(townSataDto.getSumPowerFee()) %></font></span>
				<br></td>	
			</tr>
    </table>
    <br>
    <table class=common width="500%" cellspacing="0" cellpadding="5" >
    <tr style="hight:60px">
    <td height="30">
    </td>
    </tr>
    </table>
		<%} %>
</form>
</body>
<script>
function doPrint(){
	window.print();
}
</script>
</html:html>
