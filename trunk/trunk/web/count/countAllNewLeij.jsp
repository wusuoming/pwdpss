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
<body class=interface>&nbsp; 
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
			<td class=title0 colspan="14"><font size="5">大户局电费电量发行单</font></td>
		</tr>
		
		<tr>
		<td nowrap colspan="2">
						<span class="title"><font size="2"><%=inputDate.substring(0,7) %>月</font></span>
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
					<span class="title"><font size="2"><%=df.format(corporationshoushuLwShouShuTableDto.getPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getChunDianFei()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getDianFeiTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getSumDianFee()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getDiffrentFei()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getDiffrentFeiTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getDianJin()) %> </font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getDianJinTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getSanXia()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getSanXiaTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getJijin()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getJinjinTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationshoushuLwShouShuTableDto.getSumFee()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">趸售</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getChunDianFei()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getDianFeiTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getSumDianFee()) %></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getDiffrentFei()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getDiffrentFeiTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getDianJin()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getDianJinTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getSanXia()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getSanXiaTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getJijin()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getJinjinTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleshoushuLwShouShuTableDto.getSumFee()) %></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getPower()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getChunDianFei()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getDianFeiTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getSumDianFee()) %></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getDiffrentFei()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getDiffrentFeiTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getDianJinTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getSanXia()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getSanXiaTax()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getJijin()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getJinjinTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allshoushuLwShouShuTableDto.getSumFee()) %></font></span>
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
			<td class=title0 colspan="14"><font size="5">包头市农电公司电费电量发行单</font></td>
		</tr>
<tr>
		<td nowrap colspan="2">
						<span class="title"><font size="2"><%=inputDate.substring(0,7) %>月</font></span>
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
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"> <%=df.format(corporationduLwShouShuTableDto.getDiffrentFei()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getDiffrentFeiTax())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( corporationduLwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getJinjinTax())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(corporationduLwShouShuTableDto.getSumFee())%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">趸售</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesaleduLwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesaleduLwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesaleduLwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholesaleduLwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( wholesaleduLwShouShuTableDto.getDiffrentFei())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( wholesaleduLwShouShuTableDto.getDiffrentFeiTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleduLwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleduLwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleduLwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleduLwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleduLwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleduLwShouShuTableDto.getJinjinTax()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( wholesaleduLwShouShuTableDto.getSumFee())%></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getPower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getChunDianFei())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getDianFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getSumDianFee())%></font></span>
				<br></td>
				
					
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getDiffrentFei())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getDiffrentFeiTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getSanXia())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getJijin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getJinjinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format( allduLwShouShuTableDto.getSumFee())%></font></span>
				<br></td>
							
			</tr>
	</table>
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" 打 印 " onClick="printCount()">        </td> 
        </tr> 
    </table>

</form>
</body>
<script language="javascript">
function printCount(){
	var b=fm.inputDate.value;
strURL   =   "<%=request.getContextPath()%>/UICountAllNewResultljPrintAction.do?inputDate="+b;
	winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
  
}
//function dianfei(){
	//var fdianfeishui=0.0;
	//var fdianfee=0.0;
	//fdianfeishui=parseFloat(fm.lwsumfc.value)*0.17;
	//fdianfee=fdianfeishui+parseFloat(fm.lwsumfc.value);
	//fm.lwsumftax.value=fdianfeishui;
	//fm.lwsumfdianfee.value=fdianfee;
	
//}
//function chabie(){
	//var chabieshui=0.0;
	//chabieshui=parseFloat(fm.lwdiffrentfee.value)*0.17;
	//fm.lwdiffrentfeetax.value=chabieshui;
	


//}

//function jijin(){
	//var jijinshui=0.0;
	//jijinshui=parseFloat(fm.lwsumfjijin.value)*0.17;
	//fm.lwsumfjijintax.value=jijinshui;
	//}
	//function dianjin(){
	////var dianjinshui=0.0;
	//dianjinshui=parseFloat(fm.lwsummfdianjin.value)*0.17;
	//fm.lwsumfdianjintax.value=dianjinshui;
	//}
	
	//function sanxia(){
	///var sanxiashui=0.0;
	///sanxiashui=parseFloat(fm.lwsumfsanxia.value)*0.17;
	//fm.lwsumfsanxiatax.value=sanxiashui;
	//}
	//function fheji(){
	//var heji=0.0;
	//heji=parseFloat(fm.lwsumfc.value)+parseFloat(fm.lwsumftax.value)+parseFloat(fm.lwdiffrentfee.value)+parseFloat(fm.lwdiffrentfeetax.value)+parseFloat(fm.lwsummfdianjin.value)+parseFloat(fm.lwsumfdianjintax.value)+parseFloat(fm.lwsumfsanxia.value)+parseFloat(fm.lwsumfsanxiatax.value)+parseFloat(fm.lwsumfjijin.value)+parseFloat(fm.lwsumfjijintax.value);
	//fm.lwsumffee.value=heji;
	//}
	
	
	
	
	//dunshou
	//function wdianfei(){
	//var wdianfeishui=0.0;
	//var wdianfee=0.0;
	//wdianfeishui=parseFloat(fm.lwsumwc.value)*0.17;
	//wdianfee=wdianfeishui+parseFloat(fm.lwsumwc.value);
	//fm.lwsumwtax.value=wdianfeishui;
	//fm.lwsumwdianfee.value=wdianfee;
	
//}
//function wchabie(){
	//var wchabieshui=0.0;
	//wchabieshui=parseFloat(fm.lwdiffrentwfee.value)*0.17;
	//fm.lwdiffrentwfeetax.value=wchabieshui;
	


//}

//function wjijin(){
	//var wjijinshui=0.0;
	wjijinshui=parseFloat(fm.lwsumwjijin.value)*0.17;
	////fm.lwsumwjijintax.value=wjijinshui;
	//}
	//function wdianjin(){
	//var wdianjinshui=0.0;
	//wdianjinshui=parseFloat(fm.lwsummwdianjin.value)*0.17;
	//fm.lwsumwdianjintax.value=wdianjinshui;
	//}
	
	//function wsanxia(){
	//var wsanxiashui=0.0;
	//wsanxiashui=parseFloat(fm.lwsumwsanxia.value)*0.17;
	//fm.lwsumwsanxiatax.value=wsanxiashui;
	//}
	//function wheji(){
	//var wheji=0.0;
	//wheji=parseFloat(fm.lwsumwc.value)+parseFloat(fm.lwsumwtax.value)+parseFloat(fm.lwdiffrentwfee.value)+parseFloat(fm.lwdiffrentwfeetax.value)+parseFloat(fm.lwsummwdianjin.value)+parseFloat(fm.lwsumwdianjintax.value)+parseFloat(fm.lwsumwsanxia.value)+parseFloat(fm.lwsumwsanxiatax.value)+parseFloat(fm.lwsumwjijin.value)+parseFloat(fm.lwsumwjijintax.value);
	//fm.lwsumwfee.value=wheji;
	//}
	//function allsum(){
	//fm.lwsumallpower.value=parseFloat(fm.lwsumfpower.value)+parseFloat(fm.lwsumwpower.value);
	
	//fm.lwsumallc.value=parseFloat(fm.lwsumfc.value)+parseFloat(fm.lwsumwc.value);
	//fm.lwsumalltax.value=parseFloat(fm.lwsumftax.value)+parseFloat(fm.lwsumwtax.value);
	//fm.lwsumalldianfee.value=parseFloat(fm.lwsumfdianfee.value)+parseFloat(fm.lwsumwdianfee.value);
	//fm.lwdiffrentallfee.value=parseFloat(fm.lwdiffrentfee.value)+parseFloat(fm.lwdiffrentwfee.value);
	//fm.lwdiffrentallfeetax.value=parseFloat(fm.lwdiffrentfeetax.value)+parseFloat(fm.lwdiffrentwfeetax.value);
	//fm.lwsummalldianjin.value=parseFloat(fm.lwsummfdianjin.value)+parseFloat(fm.lwsummwdianjin.value);
	//fm.lwsumalldianjintax.value=parseFloat(fm.lwsumfdianjintax.value)+parseFloat(fm.lwsumwdianjintax.value);
	//fm.lwsumallsanxia.value=parseFloat(fm.lwsumfsanxia.value)+parseFloat(fm.lwsumwsanxia.value);
	//fm.lwsumallsanxiatax.value=parseFloat(fm.lwsumfsanxiatax.value)+parseFloat(fm.lwsumwsanxiatax.value);
	//fm.lwsumalljijin.value=parseFloat(fm.lwsumfjijin.value)+parseFloat(fm.lwsumwjijin.value);
	//fm.lwsumalljijintax.value=parseFloat(fm.lwsumfjijintax.value)+parseFloat(fm.lwsumwjijintax.value);
	//fm.lwsumallfee.value=parseFloat(fm.lwsumffee.value)+parseFloat(fm.lwsumwfee.value);
	
	
	//}
	
	
	
</script>

</html:html>
