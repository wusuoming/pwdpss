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
  
<title>��ҵ��ѵ������е�</title>
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
   //��������͵ĺϳɺ���
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
String dagongye10Power=request.getAttribute("dagongye10Power").toString();
String dagongye35Power=request.getAttribute("dagongye35Power").toString();
String guitie10Power=request.getAttribute("guitie10Power").toString();
String guitie35Power=request.getAttribute("guitie35Power").toString();
String dianshi10Power=request.getAttribute("dianshi10Power").toString();
String dianshi35Power=request.getAttribute("dianshi35Power").toString();
String huafei10Power=request.getAttribute("huafei10Power").toString();

String huafei35Power=request.getAttribute("huafei35Power").toString();
String sumPower=request.getAttribute("sumPower").toString();

String dagongye10Fee=(String)request.getAttribute("dagongye10Fee");
String dagongye35Fee=(String)request.getAttribute("dagongye35Fee");
String guitie10Fee=(String)request.getAttribute("guitie10Fee");
String guitie35Fee=(String)request.getAttribute("guitie35Fee");
String dianshi10Fee=(String)request.getAttribute("dianshi10Fee");
String dianshi35Fee=(String)request.getAttribute("dianshi35Fee");
String huafei10Fee=(String)request.getAttribute("huafei10Fee");
String huafei35Fee=(String)request.getAttribute("huafei35Fee");
String dagongye10tax=(String)request.getAttribute("dagongye10tax");
String dagongye35tax=(String)request.getAttribute("dagongye35tax");
String guitie10tax=(String)request.getAttribute("guitie10tax");
String guitie35tax=(String)request.getAttribute("guitie35tax");
String dianshi10tax=(String)request.getAttribute("dianshi10tax");
String dianshi35tax=(String)request.getAttribute("dianshi35tax");
String huafei10tax=(String)request.getAttribute("huafei10tax");
String huafei35tax=(String)request.getAttribute("huafei35tax");
String dagongye10chun=(String)request.getAttribute("dagongye10chun");
String dagongye35chun=(String)request.getAttribute("dagongye35chun");
String guitie10chun=(String)request.getAttribute("guitie10chun");
String guitie35chun=(String)request.getAttribute("guitie35chun");
String dianshi10chun=(String)request.getAttribute("dianshi10chun");
String dianshi35chun=(String)request.getAttribute("dianshi35chun");
String huafei10chun=(String)request.getAttribute("huafei10chun");
String huafei35chun=(String)request.getAttribute("huafei35chun");
String sumTax=(String)request.getAttribute("sumTax");
String sumChun=(String)request.getAttribute("sumChun");
String sumFee=(String)request.getAttribute("sumFee");

	DecimalFormat df = new DecimalFormat("###0.00");


LwCorporationSummaryDto lwCorporationSummaryDtoguitie1=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtoguitie1");

LwCorporationSummaryDto lwCorporationSummaryDtoguitie2=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtoguitie2");
LwCorporationSummaryDto lwCorporationSummaryDtodagongye1=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtodagongye1");
LwCorporationSummaryDto lwCorporationSummaryDtodagongye2=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtodagongye2");
LwCorporationSummaryDto lwCorporationSummaryDtodagongye3=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtodagongye3");
LwCorporationSummaryDto lwCorporationSummaryDtohuafei=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtohuafei");

 %>

<form  name="fm" method="post">
	<table class=common width="100%" cellspacing="1" cellpadding="5" border="1">
		
	<tr>
			<td class=title0 colspan="14"><font size="4">��ͷ��ũ�繫˾��ҵ��ѵ������е�</font></td>
<td style="display:none"><input type="hidden" name="StartMonth" value="<%=(String)request.getAttribute("inputDate") %>"></td>
		</tr>
		
		
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">��Ŀ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">������</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">�۵���</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">�����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">���˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">��Ͽ��</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">��Ͽ˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">����</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">���˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">�����</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">����˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">���ʵ��</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">����/�������</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">�ܼ�</font></span>
				<br></td>	
							
			</tr>
			<tr >
				<td width="10%" rowspan="3">
					<span class="title"><font size="2">��ҵ10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtodagongye1.getUserNo()%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtodagongye1.getPointerQuantity()%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getPointerFee()/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getPointerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getSanXiaFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getSanXiaFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getPowerFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getPowerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getSurcharge()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getSurcharge()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getPowerRateFee())%></font></span>
				<br></td>
				<%
				if(lwCorporationSummaryDtodagongye1.getFlag().equals("1")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getNeedFee())%></font></span>
				<br></td>
		<%} %>
		
		<%
				if(lwCorporationSummaryDtodagongye1.getFlag().equals("2")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getContentFee())%></font></span>
				<br></td>
		<%} %>
		
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getSumFee())%></font></span>
				<br></td>	
							
			</tr>
			<tr >
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtodagongye2.getUserNo()%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtodagongye2.getPointerQuantity()%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getPointerFee()/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getPointerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getSanXiaFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getSanXiaFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getPowerFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getPowerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getSurcharge()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getSurcharge()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getPowerRateFee())%></font></span>
				<br></td>
				<%
				if(lwCorporationSummaryDtodagongye2.getFlag().equals("1")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getNeedFee())%></font></span>
				<br></td>
		<%} %>
		
		<%
				if(lwCorporationSummaryDtodagongye2.getFlag().equals("2")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getContentFee())%></font></span>
				<br></td>
		<%} %>
		
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye2.getSumFee())%></font></span>
				<br></td>	
							
			</tr>
			
			<tr >
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtodagongye3.getUserNo()%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtodagongye3.getPointerQuantity()%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getPointerFee()/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getPointerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getSanXiaFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getSanXiaFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getPowerFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getPowerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getSurcharge()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getSurcharge()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getPowerRateFee())%></font></span>
				<br></td>
				<%
				if(lwCorporationSummaryDtodagongye3.getFlag().equals("1")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getNeedFee())%></font></span>
				<br></td>
		<%} %>
		
		<%
				if(lwCorporationSummaryDtodagongye3.getFlag().equals("2")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getContentFee())%></font></span>
				<br></td>
		<%} %>
		
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye3.getSumFee())%></font></span>
				<br></td>	
							
			</tr>
			
			
				<tr >
				<td width="10%" rowspan="1">
					<span class="title"><font size="2">�ܼ�</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">&nbsp</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtodagongye1.getPointerQuantity()+lwCorporationSummaryDtodagongye2.getPointerQuantity()+lwCorporationSummaryDtodagongye3.getPointerQuantity()%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getPointerFee()/1.17+lwCorporationSummaryDtodagongye2.getPointerFee()/1.17+lwCorporationSummaryDtodagongye3.getPointerFee()/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getPointerFee()/1.17*0.17+lwCorporationSummaryDtodagongye2.getPointerFee()/1.17*0.17+lwCorporationSummaryDtodagongye3.getPointerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getSanXiaFee()/1.17+lwCorporationSummaryDtodagongye2.getSanXiaFee()/1.17+lwCorporationSummaryDtodagongye3.getSanXiaFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getSanXiaFee()/1.17*0.17+lwCorporationSummaryDtodagongye2.getSanXiaFee()/1.17*0.17+lwCorporationSummaryDtodagongye3.getSanXiaFee()/1.17*0.17)%></font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getPowerFee()/1.17+lwCorporationSummaryDtodagongye2.getPowerFee()/1.17+lwCorporationSummaryDtodagongye3.getPowerFee()/1.17)%></font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getPowerFee()/1.17*0.17+lwCorporationSummaryDtodagongye2.getPowerFee()/1.17*0.17+lwCorporationSummaryDtodagongye3.getPowerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getSurcharge()/1.17+lwCorporationSummaryDtodagongye2.getSurcharge()/1.17+lwCorporationSummaryDtodagongye3.getSurcharge()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getSurcharge()/1.17*0.17+lwCorporationSummaryDtodagongye2.getSurcharge()/1.17*0.17+lwCorporationSummaryDtodagongye3.getSurcharge()/1.17*0.17)%></font></span>
				<br></td>
				
			
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getPowerRateFee()+lwCorporationSummaryDtodagongye2.getPowerRateFee()+lwCorporationSummaryDtodagongye3.getPowerRateFee())%></font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">&nbsp</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtodagongye1.getSumFee()+lwCorporationSummaryDtodagongye2.getSumFee()+lwCorporationSummaryDtodagongye3.getSumFee())%></font></span>
				<br></td>	
							
			</tr>
			
			
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">����10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtoguitie1.getUserNo()%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtoguitie1.getPeakQuantity()%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getPeakFee()/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getPeakFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getSanXiaFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getSanXiaFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getPowerFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getPowerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getSurcharge()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getSurcharge()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getPowerRateFee())%></font></span>
				<br></td>
				<%
				if(lwCorporationSummaryDtoguitie1.getFlag().equals("1")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getNeedFee())%></font></span>
				<br></td>
		<%} %>
		
		<%
				if(lwCorporationSummaryDtoguitie1.getFlag().equals("2")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getContentFee())%></font></span>
				<br></td>
		<%} %>
		
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getSumFee())%></font></span>
				<br></td>	
								
			</tr>
			
			
			
			
			
			<tr >
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtoguitie2.getUserNo()%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtoguitie2.getPeakQuantity()%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getPeakQuantity()/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getPeakFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getSanXiaFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getSanXiaFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getPowerFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getPowerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getSurcharge()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getSurcharge()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getPowerRateFee())%></font></span>
				<br></td>
				<%
				if(lwCorporationSummaryDtoguitie2.getFlag().equals("1")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getNeedFee())%></font></span>
				<br></td>
		<%} %>
		
		<%
				if(lwCorporationSummaryDtoguitie2.getFlag().equals("2")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getContentFee())%></font></span>
				<br></td>
		<%} %>
		
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie2.getSumFee())%></font></span>
				<br></td>	
								
				
							
			</tr>
			
			<tr >
				<td width="10%" rowspan="1">
					<span class="title"><font size="2">�ܼ�</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">&nbsp</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtoguitie1.getPeakQuantity()+lwCorporationSummaryDtoguitie2.getPeakQuantity()%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getPeakFee()/1.17+lwCorporationSummaryDtoguitie2.getPeakFee()/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getPeakFee()/1.17*0.17+lwCorporationSummaryDtoguitie2.getPeakFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getSanXiaFee()/1.17+lwCorporationSummaryDtoguitie2.getSanXiaFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getSanXiaFee()/1.17*0.17+lwCorporationSummaryDtoguitie2.getSanXiaFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getPowerFee()/1.17+lwCorporationSummaryDtoguitie2.getPowerFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getPowerFee()/1.17*0.17+lwCorporationSummaryDtoguitie2.getPowerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getSurcharge()/1.17+lwCorporationSummaryDtoguitie2.getSurcharge()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getSurcharge()/1.17*0.17+lwCorporationSummaryDtoguitie2.getSurcharge()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getPowerRateFee()+lwCorporationSummaryDtoguitie2.getPowerRateFee())%></font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">&nbsp</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtoguitie1.getSumFee()+lwCorporationSummaryDtoguitie2.getSumFee())%></font></span>
				<br></td>	
								
			</tr>
			
			
			
			
			
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">����35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtohuafei.getUserNo()%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=lwCorporationSummaryDtohuafei.getPointerQuantity()%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getPointerFee()/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getPointerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getSanXiaFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getSanXiaFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getPowerFee()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getPowerFee()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getSurcharge()/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getSurcharge()/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getPowerRateFee())%></font></span>
				<br></td>
				<%
				if(lwCorporationSummaryDtohuafei.getFlag().equals("1")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getNeedFee())%></font></span>
				<br></td>
		<%} %>
		
		<%
				if(lwCorporationSummaryDtohuafei.getFlag().equals("2")){
				 %>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getContentFee())%></font></span>
				<br></td>
		<%} %>
		
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDtohuafei.getSumFee())%></font></span>
				<br></td>	
								
				
							
			</tr><%--
			
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">��Ͽ</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">����</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				
							
			</tr>
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">���</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				
							
			</tr>
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">�ܷ���</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				
							
			</tr>
			
	--%></table>
	

</form>
</body>
<script language="javascript">
function doPrint(){
	window.print();
}
</script>

</html:html>
