<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="java.text.DecimalFormat"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwAllWholeFeeDto"/>
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal"/>
<jsp:directive.page import="com.elongway.pss.util.AppConst"/>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>包头农电总公司电费电量发行单</title>
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
<body  class="interface" onload="javascript:doPrint();window.close()">&nbsp; 
<html:errors />

<%
DecimalFormat df = new DecimalFormat("###0.00");
String s=(String)request.getAttribute("inputDate");
%>
<form  name="fm" method="post">
	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	<td style="display:none"><input type="hidden" name="StartMonth" value="<%=(String)request.getAttribute("inputDate") %>"></td>
	<input type="hidden" name="counttype" value="<%=(String)request.getAttribute("counttype") %>">
		
	<tr>
			<td class=title0 colspan="13"><font size="5">包头市农电公司电费电量发行单（累计）</font></td>
		</tr>
		<tr>
		<td nowrap colspan="2">
						<span class="title"><font size="5">月份:<%=s.substring(0,7) %></font></span>
					</td>
	</tr>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="5">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">售电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">纯电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">电费税</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">电金</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">电金税</font></span>
				<br></td>			
				<td nowrap width="10%">
					<span class="title"><font size="5">三峡</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">三峡税</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">基金</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">基金税</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">差别电费</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">差别电费税</font></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><font size="5">总计</font></span>
				<br></td>	
							
			</tr>
	<% 	Collection resultList = (Collection)request.getAttribute("resultList"); 
		Collection colf = (Collection)request.getAttribute("colf"); 
		Collection wholeResultList = (Collection)request.getAttribute("wholeResultList"); 
		TownSataDto townSataDto1 = (TownSataDto)request.getAttribute("sum"); 
		
		int factorycount = 0;
		for (Iterator iterator = colf.iterator(); iterator.hasNext();) {
				TownSataDto townSataDto = (TownSataDto) iterator
						.next();
					if(factorycount==6){	
		%>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="5"><%=townSataDto.getCompanyName() %></font></span>
					<input type="hidden" name="company" value="<%=townSataDto.getComCode()%>">
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=Math.round(townSataDto.getSumPower()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getPurePowerFee()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getPowerFeeTax()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getPureDianJin()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getDianJinTax()) %></font></b></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getPureSanXia()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getSanXiaTax()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getPureJiJin()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getJiJinTax()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5">0</font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5">0</font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getSumPowerFee()) %></font></b></span>
				<br></td>	
							
			</tr>
			<%}else{%>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="5"><%=townSataDto.getCompanyName() %></font></span>
					<input type="hidden" name="company" value="<%=townSataDto.getComCode()%>">
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=Math.round(townSataDto.getSumPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getPurePowerFee()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getPowerFeeTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getPureDianJin()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getDianJinTax()) %></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getPureSanXia()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getSanXiaTax()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getPureJiJin()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getJiJinTax()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5">0</font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5">0</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getSumPowerFee()) %></font></span>
				<br></td>	
							
			</tr>
			<% }
			factorycount++;
			}
			int wholecount = 0;
			for (Iterator iterator = wholeResultList.iterator(); iterator.hasNext();) {
				LwAllWholeFeeDto townSataDto = (LwAllWholeFeeDto) iterator
						.next();
						if(wholecount==4){
		%>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><b><font size="5"><%=townSataDto.getCompany() %></font></b></span>
					
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=Math.round(Double.parseDouble(townSataDto.getPower1())) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getDianfei())) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getDianfeitax())) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getDianjin())) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getDianjintax()) )%></font></b></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getSanxia())) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getSanxiatax())) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getJijin())) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getFujia1())) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getFujia9())/1.17) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getFujia9())/1.17*0.17) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(Double.parseDouble(townSataDto.getSumfee())) %></font></b></span>
				<br></td>	
							
			</tr>
			<%}else{%>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="5"><%=townSataDto.getCompany() %></font></span>
					
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=Math.round(Double.parseDouble(townSataDto.getPower1())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getDianfei())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getDianfeitax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getDianjin())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getDianjintax()) )%></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getSanxia())) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getSanxiatax())) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getJijin())) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getFujia1())) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getFujia9())/1.17) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getFujia9())/1.17*0.17) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(townSataDto.getSumfee())) %></font></span>
				<br></td>	
							
			</tr>
			<%}
			wholecount++;}
			int townCount = 0;
			for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
			
				TownSataDto townSataDto = (TownSataDto) iterator
						.next();
						if(townCount==4){
		%>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><b><font size="5"><%=townSataDto.getCompanyName() %></font></b></span>
					<input type="hidden" name="company" value="<%=townSataDto.getComCode()%>">
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=Math.round(townSataDto.getSumPower()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getPurePowerFee()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getPowerFeeTax()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getPureDianJin()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getDianJinTax() )%></font></b></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getPureSanXia()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getSanXiaTax()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getPureJiJin()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getJiJinTax()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5">0</font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5">0</font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto.getSumPowerFee()) %></font></b></span>
				<br></td>	
							
			</tr>
			
			<%}else{%>
<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="5"><%=townSataDto.getCompanyName() %></font></span>
					<input type="hidden" name="company" value="<%=townSataDto.getComCode()%>">
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=Math.round(townSataDto.getSumPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getPurePowerFee()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getPowerFeeTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getPureDianJin()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getDianJinTax() )%></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getPureSanXia()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getSanXiaTax()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getPureJiJin()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getJiJinTax()) %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5">0</font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5">0</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(townSataDto.getSumPowerFee()) %></font></span>
				<br></td>	
							
			</tr>
			<%}
			townCount++;
			} %>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><b><font size="5"><%=townSataDto1.getCompanyName() %></font></b></span>
					
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=Math.round(townSataDto1.getSumPower()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getPurePowerFee()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getPowerFeeTax()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getPureDianJin()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getDianJinTax()) %></font></b></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getPureSanXia()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getSanXiaTax()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getPureJiJin()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getJiJinTax()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getPureChaBie()) %></font></b></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getChaBieTax()) %></font></b></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><b><font size="5"><%=df.format(townSataDto1.getSumPowerFee()) %></font></b></span>
				<br></td>	
							
			</tr>
	</table>
	

</form>
</body>
<script language="javascript">
function doPrint(){
	window.print();
}
function printCount(){
  var b=fm.StartMonth.value;
  var counttype=fm.counttype.value;
 
strURL = "<%=request.getContextPath()%>/thismonthSumPrint.do?inputDate="+b+"&counttype="+counttype;
alert(strURL);
	winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");
    
}
</script>

</html:html>
