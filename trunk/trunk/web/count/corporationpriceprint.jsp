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
//String dagongye10Power=request.getAttribute("dagongye10Power").toString();
//String dagongye35Power=request.getAttribute("dagongye35Power").toString();
//String guitie10Power=request.getAttribute("guitie10Power").toString();
//String guitie35Power=request.getAttribute("guitie35Power").toString();
//String dianshi10Power=request.getAttribute("dianshi10Power").toString();
//String dianshi35Power=request.getAttribute("dianshi35Power").toString();
//String huafei10Power=request.getAttribute("huafei10Power").toString();

//String huafei35Power=request.getAttribute("huafei35Power").toString();
//String sumPower=request.getAttribute("sumPower").toString();

//String dagongye10Fee=(String)request.getAttribute("dagongye10Fee");
//String dagongye35Fee=(String)request.getAttribute("dagongye35Fee");
//String guitie10Fee=(String)request.getAttribute("guitie10Fee");
//String guitie35Fee=(String)request.getAttribute("guitie35Fee");
//String dianshi10Fee=(String)request.getAttribute("dianshi10Fee");
//String dianshi35Fee=(String)request.getAttribute("dianshi35Fee");
//String huafei10Fee=(String)request.getAttribute("huafei10Fee");
//String huafei35Fee=(String)request.getAttribute("huafei35Fee");
//String dagongye10tax=(String)request.getAttribute("dagongye10tax");
//String dagongye35tax=(String)request.getAttribute("dagongye35tax");
//String guitie10tax=(String)request.getAttribute("guitie10tax");
//String guitie35tax=(String)request.getAttribute("guitie35tax");
//String dianshi10tax=(String)request.getAttribute("dianshi10tax");
//String dianshi35tax=(String)request.getAttribute("dianshi35tax");
//String huafei10tax=(String)request.getAttribute("huafei10tax");
//String huafei35tax=(String)request.getAttribute("huafei35tax");
//String dagongye10chun=(String)request.getAttribute("dagongye10chun");
//String dagongye35chun=(String)request.getAttribute("dagongye35chun");
//String guitie10chun=(String)request.getAttribute("guitie10chun");
//String guitie35chun=(String)request.getAttribute("guitie35chun");
//String dianshi10chun=(String)request.getAttribute("dianshi10chun");
//String dianshi35chun=(String)request.getAttribute("dianshi35chun");
//String huafei10chun=(String)request.getAttribute("huafei10chun");
//String huafei35chun=(String)request.getAttribute("huafei35chun");
//String sumTax=(String)request.getAttribute("sumTax");
//String sumChun=(String)request.getAttribute("sumChun");
//String sumFee=(String)request.getAttribute("sumFee");

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
	
	
	
	


//LwCorporationSummaryDto lwCorporationSummaryDtoguitie1=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtoguitie1");

//LwCorporationSummaryDto lwCorporationSummaryDtoguitie2=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtoguitie2");
//LwCorporationSummaryDto lwCorporationSummaryDtodagongye1=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtodagongye1");
//LwCorporationSummaryDto lwCorporationSummaryDtodagongye2=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtodagongye2");
//LwCorporationSummaryDto lwCorporationSummaryDtodagongye3=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtodagongye3");
//LwCorporationSummaryDto lwCorporationSummaryDtohuafei=(LwCorporationSummaryDto)request.getAttribute("lwCorporationSummaryDtohuafei");

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
				
				<td width="10%">
					<span class="title"><font size="2">��ѹ�ȼ�</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">���</font></span>
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
					<span class="title"><font size="2">���ʵ��</font></span>
				<br></td>
				
			
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">�������</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">�������</font></span>
				<br></td>
		
				
							
			</tr>
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">��������</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">����1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.43</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.3769</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=juminpower%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(juminfee)/1.17 ) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(juminfee)/1.17*0.17) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			
			
			</tr>
			
					<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">�Ǿ�������</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">����1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.512</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.4731</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=juminpower %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(juminfee)/1.17) %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(juminfee)/1.17*0.17) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			
			</tr>
			
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">��ҵ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">����1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.761</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.4731</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			
			</tr>
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">���չ�ҵ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">����1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.493</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.4842</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			
			</tr>
			
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">ũҵ����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">����1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.371</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.337</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			
			</tr>
			
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">�Ź�</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">����1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.18</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.177</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			
				
			
			</tr>
			
			
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">��ҵ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">����1KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.18</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.3939</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(dagongye10sumfee)/1.17) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(dagongye10sumfee)/1.17*0.17) %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			
			</tr>
			<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">10kv</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.3609</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(guitie10sumfee)/1.17) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(guitie10sumfee)/1.17*0.17) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.3539</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0 </font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			
			</tr>
			
					<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">��ʯ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">10kv</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.3137</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.2987</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0 </font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			
			</tr>
			
					<tr >
				<td width="10%" rowspan="2">
					<span class="title"><font size="2">����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">10kv</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.2249</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(huafei35sumfee)/1.17) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(huafei35sumfee)/1.17*0.17) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.26</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				
			
			</tr>
			
				<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2">35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0.2987</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0 </font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			
				
			<td nowrap width="10%">
					<span class="title"><font size="2">0</font></span>
				<br></td>
			</tr>
			
					<tr >
				<td width="10%" rowspan="4">
					<span class="title"><font size="2">�ܼ�</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">�Ǿ�����������</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">�Ǿ����������</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">�Ǿ����������˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">��ҵ����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">��ҵ��� </font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2">��ҵ���˰</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">���ʵ��</font></span>
				<br></td>
		
				
				
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2"><%=juminpower %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(juminfee)/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(juminfee)/1.17*0.17)%></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(dagongye10power)+Double.parseDouble(guitie10power)+Double.parseDouble(huafei35power)) %></font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format((Double.parseDouble(dagongye10sumfee)+Double.parseDouble(guitie10sumfee)+Double.parseDouble(huafei35sumfee))/1.17) %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=df.format((Double.parseDouble(dagongye10sumfee)+Double.parseDouble(guitie10sumfee)+Double.parseDouble(huafei35sumfee))/1.17*0.17) %></font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2"><%=lilv %></font></span>
				<br></td>
			
				
			
			</tr>
			<tr>
					<td nowrap width="10%">
					<span class="title"><font size="2">�������</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">�������</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">���úϼ�</font></span>
				<br></td>
			</tr>
			<tr>
			<td nowrap width="10%">
					<span class="title"><font size="2"><%=contentfee %></font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2"><%=needfee%></font></span>
				<br></td>
					<td nowrap width="10%">
					<span class="title"><font size="2"><%=sumallall %></font></span>
				<br></td>
			
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
