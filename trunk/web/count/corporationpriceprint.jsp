<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="java.text.DecimalFormat"/>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>大工业电费电量发行单</title>
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
<script language="Javascript">
 function validateUserQueryForm(form)
{
   //添加日期型的合成函数
  if(!(composeauUserBirthday() && composeauUserStartWorkDate() && composeauUserEnterDate())){
     return false;
  }
   bValid = validateQueryForm(form);
  if(bValid == true)
  {
      disabledImg(userForm,'userOverviewChaxun');
  }
   return bValid;
}
   
  function AddForm(){
  alert();  
       var strURL = "<%=request.getContextPath()%>/townSave.do";
       fm.action = strURL;
	 
        } 

</script>
<script language="javascript">
   function codeQuery(field)
{
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.userNo.value+"&TableName=lwProrate";

	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
<script language="javascript">
   function check()
{
	if(fm.userNo==null){
	alert(fm.userNo.value);
	}
}
</script>
</head>
<body class="interface" onload="javascript:doPrint();window.close()">&nbsp; 
<html:errors />
<%


	DecimalFormat df = new DecimalFormat("###0.00");
	String dagongye10sumfee=(String)request.getAttribute("dagongye10sumfee");
	
	String guitie10sumfee=(String)request.getAttribute("guitie10sumfee");
	
	String huafei35sumfee=(String)request.getAttribute("huafei35sumfee");
	
	String contentfee=(String)request.getAttribute("contentfee");
	
	String needfee=(String)request.getAttribute("needfee");
	
	String lilv=(String)request.getAttribute("lilv");
	
	String dagongye10power=request.getAttribute("dagongye10power").toString();
	
	String guitie10power=request.getAttribute("guitie10power").toString();
	
	String huafei35power=request.getAttribute("huafei35power").toString();
	
	String sumallall=(String)request.getAttribute("sumallall");
	
	String juminfee=(String)request.getAttribute("juminfee");
	
	String juminpower=request.getAttribute("juminpower").toString();
	
	String sumallpower=request.getAttribute("sumallpower").toString();
	
	
	String dagongye10contentfee=(String)request.getAttribute("dagongye10contentfee");
	String dagongye10needfee=(String)request.getAttribute("dagongye10needfee");
	String dagongye10lilv=(String)request.getAttribute("dagongye10lilv");
	String guitie10contentfee=(String)request.getAttribute("guitie10contentfee");
	String guitie10needfee=(String)request.getAttribute("guitie10needfee");
	String guitie10lilv=(String)request.getAttribute("guitie10lilv");
	String huafei35contentfee=(String)request.getAttribute("huafei35contentfee");
	String huafei35needfee=(String)request.getAttribute("huafei35needfee");
	String huafei35lilv=(String)request.getAttribute("huafei35lilv");
	
	String factoryPower=(String)request.getAttribute("factoryPower");
	String factoryFee=(String)request.getAttribute("factoryFee");
	String tiePower=(String)request.getAttribute("tiePower");
	String tieFee=(String)request.getAttribute("tieFee");
	String huafeiPower=(String)request.getAttribute("huafeiPower");
	String huafeiFee=(String)request.getAttribute("huafeiFee");
	String sumQuantity=(String)request.getAttribute("sumQuantity");
	String sumPowerFee=(String)request.getAttribute("sumPowerFee");
	



 %>

<form  name="fm" method="post">
	<table class=common width="100%" cellspacing="0"  border="0" >
		
	<tr style="height:30px">
			<td class=title0 colspan="14"><font size="5">包头市农电公司大工业电费电量发行单（当月）</font></td>
<td style="display:none"><input type="hidden" name="StartMonth" value="<%=(String)request.getAttribute("inputDate") %>"></td>
		</tr>
		<tr class=title style="height:30px">
			<td align="center" colspan="10"></td>
		</tr>
		</table>
		<table class=common width="100%" cellspacing="0"  border="1" >
		<tr>
			<td class=title0 colspan="8"></td><td class=title0 colspan="2"><font size="4"><%=(String)request.getAttribute("inputDate") %></font></td>
		</tr>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="4">项目</font></span>
				<br></td>
				
				<td width="10%">
					<span class="title"><font size="4">电压等级</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">电价</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="4">售电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">电费</font></span>
				<br></td>
				
				
				<td nowrap width="10%" colspan="2">
					<span class="title"><font size="4">力率电费</font></span>
				<br></td>
				
			
				
				
				<td nowrap width="10%">
					<span class="title"><font size="4">需量电费</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">容量电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">合计(含税)</font></span>
				<br></td>
		
				
							
			</tr>
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="4">居民生活</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">不满1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.43</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="4">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.3769</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
			
			
			</tr>
			
					<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="4">非居民照明</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">不满1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.512</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="4">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.4731</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=juminpower %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=juminfee %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
			
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=juminfee %></font></span>
				<br></td>
			
			</tr>
			
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="4">商业</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">不满1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.761</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="4">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.4731</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
			
			</tr>
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="4">非普工业</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">不满1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.493</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="4">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.4842</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
			<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
			
			</tr>
			
			
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="4">排灌</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">不满1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.18</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="4">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.177</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
			
				
			
			</tr>
			
			
			<tr >
				<td width="10%" rowspan="3">
					<span class="title"><font size="4">大工业</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">不满1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.18</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="4">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.3939</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=factoryPower %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=factoryFee %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%
					if(Double.parseDouble(dagongye10lilv)>0){
					out.write(dagongye10lilv);
					}else{
					out.write(0);
					}
					 %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%
					if(Double.parseDouble(dagongye10lilv)<0){
					out.write(dagongye10lilv);
					}else{
					out.write(0);
					}
					 %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=dagongye10needfee %></font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="4"><%=dagongye10contentfee %></font></span>
				<br></td>
			<td nowrap width="10%">
					<span class="title"><font size="4"><%=df.format(Double.parseDouble(dagongye10sumfee)+Double.parseDouble(dagongye10lilv)+Double.parseDouble(dagongye10needfee)+Double.parseDouble(dagongye10contentfee)) %></font></span>
				<br></td>
				
			
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="4">35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.3539</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
			<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
		
			</tr>
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="4">硅铁</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">10kv</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.3609</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=tiePower %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=tieFee %></font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="4"><%
					if(Double.parseDouble(guitie10lilv)>0){
					out.write(guitie10lilv);
					}else{
					out.write(0);
					}
					 %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%
					if(Double.parseDouble(guitie10lilv)<0){
					out.write(guitie10lilv);
					}else{
					out.write(0);
					}
					 %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=guitie10needfee %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=guitie10contentfee %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=Double.parseDouble(guitie10sumfee)+Double.parseDouble(guitie10lilv)+Double.parseDouble(guitie10needfee)+Double.parseDouble(guitie10contentfee) %></font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="4">35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.3539</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0 </font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
			<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
			
			</tr>
			
				
			
					<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="4">化肥</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">10kv</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.2249</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=huafeiPower %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=huafeiFee %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%
					if(Double.parseDouble(huafei35lilv)>0){
					out.write(huafei35lilv);
					}else{
					out.write(0);
					}
					 %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%
					if(Double.parseDouble(huafei35lilv)<0){
					out.write(huafei35lilv);
					}else{
					out.write(0);
					}
					 %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=huafei35needfee %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=huafei35contentfee %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=Double.parseDouble(huafei35sumfee)+Double.parseDouble(huafei35lilv)+Double.parseDouble(huafei35needfee)+Double.parseDouble(huafei35contentfee) %></font></span>
				<br></td>
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="4">35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0.2987</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
			<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="4">0</font></span>
				<br></td>
				
			
			</tr>
			
				
			<tr >
				<td width="10%">
					<span class="title"><font size="4">总计</font></span>
				<br></td>
				
				<td width="10%">
					<span class="title"><font size="4"></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"></font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=Math.round(Double.parseDouble(sumQuantity)) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=df.format(Double.parseDouble(sumPowerFee)) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%
					if(Double.parseDouble(lilv)>0){
					out.write(lilv);
					}else{
					out.write(0);
					}
					 %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%
					if(Double.parseDouble(lilv)<0){
					out.write(lilv);
					}else{
					out.write(0);
					}
					 %></font></span>
				<br></td>
				
			
				
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=needfee %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=contentfee %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4"><%=sumallall %></font></span>
				<br></td>
		
				
							
			</tr>
			
			
	</table>
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" 打 印 " onClick="getPage()">        </td> 
        </tr> 
    </table>

</form>
</body>

<script language="javascript">
function doPrint(){
	window.print();
}
</script>

</html:html>
