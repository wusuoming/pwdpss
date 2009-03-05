<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page import="java.text.DecimalFormat"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwShouShuTableDto"/>
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
<body class=interface onload="javascript:printCount();window.close()">&nbsp; 
<html:errors />
<%
LwShouShuTableDto wholesalelwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("wholesalelwShouShuTableDto");

LwShouShuTableDto lwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("lwShouShuTableDto");
LwShouShuTableDto corporationlwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("corporationlwShouShuTableDto");


LwShouShuTableDto wholesaleshoushulwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("wholesaleshoushulwShouShuTableDto");

LwShouShuTableDto shoushulwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("shoushulwShouShuTableDto");
LwShouShuTableDto corporationshoushulwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("corporationshoushulwShouShuTableDto");










%>
<form  name="fm" method="post">
 <%
		
		DecimalFormat df = new DecimalFormat("###0.00");
		
%>

	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	<td style="display:none"><input type="hidden" name="inputDate" value="<%=(String)request.getAttribute("inputDate") %>"></td>
		
	<tr>
			<td class=title0 colspan="14"><font size="4">包头市农电公司电费电量发行单</font></td>
		</tr>
		
		<tr>
		<td nowrap colspan="2">
						<span class="title">月份:<%=corporationlwShouShuTableDto.getMonth()%></span>
					</td>
	</tr>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">纯电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">合计</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">差别电费</font></span>
				<br></td>	
				
				<td nowrap width="10%">
					<span class="title"><font size="2">差别电费税</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">电金</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">电金税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">三峡</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">三峡税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">基金</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">基金税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">大用户</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getPower() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getChunDianFei() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getDianFeiTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getSumDianFee() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getDiffrentFei() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getDiffrentFeiTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getDianJin() %> </font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getDianJinTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getSanXia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getSanXiaTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getJijin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getJinjinTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=corporationshoushulwShouShuTableDto.getSumFee() %></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">趸售</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getPower() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getChunDianFei() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getDianFeiTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getSumDianFee() %></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getDiffrentFei() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getDiffrentFeiTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getDianJin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getDianJinTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getSanXia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getSanXiaTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getJijin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getJinjinTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=wholesaleshoushulwShouShuTableDto.getSumFee() %></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getPower() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getChunDianFei() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getDianFeiTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getSumDianFee() %></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getDiffrentFei() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getDiffrentFeiTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getDianJin()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getDianJinTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getSanXia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getSanXiaTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getJijin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getJinjinTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shoushulwShouShuTableDto.getSumFee() %></font></span>
				<br></td>			
			</tr>
	</table>



	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	
		

		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">纯电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">合计</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">差别电费</font></span>
				<br></td>	
				
				<td nowrap width="10%">
					<span class="title"><font size="2">差别电费税</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">电金</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">电金税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">三峡</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">三峡税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">基金</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">基金税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">大用户</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"> <%=df.format(corporationlwShouShuTableDto.getDiffrentFei()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getDiffrentFeiTax())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationlwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getJinjinTax())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationlwShouShuTableDto.getSumFee())%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">趸售</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesalelwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesalelwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesalelwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesalelwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getDiffrentFei())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getDiffrentFeiTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getJinjinTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesalelwShouShuTableDto.getSumFee())%></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
					
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getDiffrentFei())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getDiffrentFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getJinjinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( lwShouShuTableDto.getSumFee())%></font></span>
				<br></td>
							
			</tr>
	</table>
	

</form>
</body>
<script language="javascript">
function printCount(){
window.print();
}

	
	
	
</script>

</html:html>
