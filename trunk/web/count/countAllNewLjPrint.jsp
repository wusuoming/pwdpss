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
LwShouShuTableDto wholesaleshoushuLwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("wholesaleshoushuLwShouShuTableDto");

LwShouShuTableDto corporationshoushuLwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("corporationshoushuLwShouShuTableDto");
LwShouShuTableDto allshoushuLwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("allshoushuLwShouShuTableDto");


LwShouShuTableDto wholesaleduLwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("wholesaleduLwShouShuTableDto");

LwShouShuTableDto corporationduLwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("corporationduLwShouShuTableDto");
LwShouShuTableDto allduLwShouShuTableDto=(LwShouShuTableDto)request.getAttribute("allduLwShouShuTableDto");

String inputDate=(String)request.getAttribute("inputDate");













%>
<form  name="fm" method="post">
 <%
		
		DecimalFormat df = new DecimalFormat("###0.00");
		
%>

	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	<td style="display:none"><input type="hidden" name="inputDate" value="<%=(String)request.getAttribute("inputDate") %>"></td>
		
	<tr>
			<td class=title0 colspan="14"><font size="4">大户局电费电量发行单</font></td>
		</tr>
		
		<tr>
		<td nowrap colspan="2">
						<span class="title"><%=inputDate.substring(0,7) %>月</span>
					</td>
	</tr>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="4">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">纯电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">电费税</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="4">合计</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="4">差别电费</font></span>
				<br></td>	
				
				<td nowrap width="10%">
					<span class="title"><font size="4">差别电费税</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="4">电金</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">电金税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">三峡</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">三峡税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">基金</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">基金税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">总计</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4">大用户</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getPower() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getChunDianFei() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getDianFeiTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getSumDianFee() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getDiffrentFei() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getDiffrentFeiTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getDianJin() %> </font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getDianJinTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getSanXia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getSanXiaTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getJijin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getJinjinTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=corporationshoushuLwShouShuTableDto.getSumFee() %></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4">趸售</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getPower() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getChunDianFei() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getDianFeiTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getSumDianFee() %></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getDiffrentFei() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getDiffrentFeiTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getDianJin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getDianJinTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getSanXia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getSanXiaTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getJijin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getJinjinTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=wholesaleshoushuLwShouShuTableDto.getSumFee() %></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getPower() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getChunDianFei() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getDianFeiTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getSumDianFee() %></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getDiffrentFei() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getDiffrentFeiTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getDianJin()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getDianJinTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getSanXia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getSanXiaTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getJijin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getJinjinTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=allshoushuLwShouShuTableDto.getSumFee() %></font></span>
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

	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	
		<tr>
			<td class=title0 colspan="14"><font size="4">包头市农电公司电费电量发行单</font></td>
		</tr>

		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="4">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">纯电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="4">电费税</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="4">合计</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="4">差别电费</font></span>
				<br></td>	
				
				<td nowrap width="10%">
					<span class="title"><font size="4">差别电费税</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="4">电金</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">电金税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">三峡</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">三峡税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">基金</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">基金税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="4">总计</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4">大用户</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"> <%=df.format(corporationduLwShouShuTableDto.getDiffrentFei()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getDiffrentFeiTax())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( corporationduLwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getJinjinTax())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(corporationduLwShouShuTableDto.getSumFee())%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4">趸售</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(wholesaleduLwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(wholesaleduLwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(wholesaleduLwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format(wholesaleduLwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=df.format( wholesaleduLwShouShuTableDto.getDiffrentFei())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=df.format( wholesaleduLwShouShuTableDto.getDiffrentFeiTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( wholesaleduLwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( wholesaleduLwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( wholesaleduLwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( wholesaleduLwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( wholesaleduLwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( wholesaleduLwShouShuTableDto.getJinjinTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( wholesaleduLwShouShuTableDto.getSumFee())%></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
					
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getDiffrentFei())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getDiffrentFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getJinjinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=df.format( allduLwShouShuTableDto.getSumFee())%></font></span>
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
