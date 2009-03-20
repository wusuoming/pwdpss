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
			<td class=title0 colspan="14"><font size="4">大户局电量发行单</font></td>
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
					<span class="title"><font size="2"><input  name="lwsumfpower" style="width: 80px" value="<%=Math.round(corporationshoushulwShouShuTableDto.getPower()) %>" onblur="addpower()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfc" style="width: 80px" value="<%=corporationshoushulwShouShuTableDto.getChunDianFei() %>"   onblur="dianfei();addallc();addalltax();addalldianfee()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumftax" style="width: 80px"  readonly="readonly"  value="<%=corporationshoushulwShouShuTableDto.getDianFeiTax() %>" onblur="dianfei();addalltax();addalldianfee()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfdianfee" style="width: 80px" value="<%=corporationshoushulwShouShuTableDto.getSumDianFee() %>" onblur="addalldianfee()"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwdiffrentfee" style="width: 80px" value="<%=corporationshoushulwShouShuTableDto.getDiffrentFei() %>" onblur="chabie();adddiffrentallfee();adddiffrentallfeetax()"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwdiffrentfeetax" style="width: 80px" readonly="readonly" value="<%=corporationshoushulwShouShuTableDto.getDiffrentFeiTax() %>"onblur="adddiffrentallfeetax()"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsummfdianjin" style="width: 80px" value="<%=corporationshoushulwShouShuTableDto.getDianJin() %> " onblur="dianjin();addlldianjin();addalldianjintax()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfdianjintax" style="width: 80px"  readonly="readonly"  value="<%=corporationshoushulwShouShuTableDto.getDianJinTax() %>" onblur="addalldianjintax();"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfsanxia" style="width: 80px" value="<%=corporationshoushulwShouShuTableDto.getSanXia() %>" onblur="sanxia();addallsanxia();addallsanxiatax()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfsanxiatax" style="width: 80px"  readonly="readonly" value="<%=corporationshoushulwShouShuTableDto.getSanXiaTax() %>" onblur="addallsanxiatax()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfjijin" style="width: 80px" value="<%=corporationshoushulwShouShuTableDto.getJijin() %>" onblur="jijin();addalljijin();addalljijintax();fheji()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfjijintax" style="width: 80px" readonly="readonly" value="<%=corporationshoushulwShouShuTableDto.getJinjinTax() %>" onblur="addalljijintax();fheji()"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumffee" style="width: 80px" value="<%=corporationshoushulwShouShuTableDto.getSumFee() %>" ></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">趸售</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwpower" style="width: 80px" value="<%=Math.round( wholesaleshoushulwShouShuTableDto.getPower()) %>" onblur="addpower()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwc" style="width: 80px" value="<%=wholesaleshoushulwShouShuTableDto.getChunDianFei() %>" onblur="wdianfei();addallc();addalltax();addalldianfee()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input    name="lwsumwtax" style="width: 80px" readonly="readonly" value="<%=wholesaleshoushulwShouShuTableDto.getDianFeiTax() %>" onblur="addalltax();addalldianfee()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwdianfee" style="width: 80px" value="<%=wholesaleshoushulwShouShuTableDto.getSumDianFee() %>" onblur="addalldianfee()"></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><input  name="lwdiffrentwfee" style="width: 80px" value="<%=wholesaleshoushulwShouShuTableDto.getDiffrentFei() %>" onblur="wchabie();adddiffrentallfee();adddiffrentallfeetax()"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><input  name="lwdiffrentwfeetax" style="width: 80px" readonly="readonly" value="<%=wholesaleshoushulwShouShuTableDto.getDiffrentFeiTax() %>" onblur="adddiffrentallfeetax()"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsummwdianjin" style="width: 80px" value="<%=wholesaleshoushulwShouShuTableDto.getDianJin() %>" onblur="wdianjin();addlldianjin();addalldianjintax()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwdianjintax" style="width: 80px" readonly="readonly"  value="<%=wholesaleshoushulwShouShuTableDto.getDianJinTax() %>" onblur="addalldianjintax();"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwsanxia" value="<%=wholesaleshoushulwShouShuTableDto.getSanXia() %>" onblur="wsanxia();addallsanxia();addallsanxiatax()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwsanxiatax" style="width: 80px" readonly="readonly"  value="<%=wholesaleshoushulwShouShuTableDto.getSanXiaTax() %>" onblur="addallsanxiatax()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwjijin" style="width: 80px" value="<%=wholesaleshoushulwShouShuTableDto.getJijin() %>" onblur="wjijin();addalljijin();addalljijintax();wheji()"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwjijintax" style="width: 80px" readonly="readonly" value="<%=wholesaleshoushulwShouShuTableDto.getJinjinTax() %>" onblur="wheji();allsum()"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwfee" style="width: 80px" value="<%=wholesaleshoushulwShouShuTableDto.getSumFee() %>"></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input readonly="readonly" style="width: 80px" name="lwsumallpower" value="<%=Math.round( shoushulwShouShuTableDto.getPower()) %>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  readonly="readonly" style="width: 80px" name="lwsumallc" value="<%=shoushulwShouShuTableDto.getChunDianFei() %>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  readonly="readonly"  style="width: 80px" name="lwsumalltax" value="<%=shoushulwShouShuTableDto.getDianFeiTax() %>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input   readonly="readonly" style="width: 80px" name="lwsumalldianfee" value="<%=shoushulwShouShuTableDto.getSumDianFee() %>"></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><input  name="lwdiffrentallfee"  style="width: 80px" readonly="readonly" value="<%=shoushulwShouShuTableDto.getDiffrentFei() %>"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><input  name="lwdiffrentallfeetax" style="width: 80px" readonly="readonly" value="<%=shoushulwShouShuTableDto.getDiffrentFeiTax() %>"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsummalldianjin" style="width: 80px" readonly="readonly" value="<%=shoushulwShouShuTableDto.getDianJin()%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumalldianjintax" style="width: 80px" readonly="readonly" value="<%=shoushulwShouShuTableDto.getDianJinTax() %>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumallsanxia" style="width: 80px" readonly="readonly" value="<%=shoushulwShouShuTableDto.getSanXia() %>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumallsanxiatax" style="width: 80px" readonly="readonly" value="<%=shoushulwShouShuTableDto.getSanXiaTax() %>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumalljijin" style="width: 80px" readonly="readonly" value="<%=shoushulwShouShuTableDto.getJijin() %>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumalljijintax" style="width: 80px" readonly="readonly" value="<%=shoushulwShouShuTableDto.getJinjinTax() %>"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumallfee" style="width: 80px" readonly="readonly" value="<%=shoushulwShouShuTableDto.getSumFee() %>"></font></span>
				<br></td>			
			</tr>
	</table>



	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6" style="display: none">
	
		<tr>
			<td class=title0 colspan="14"><font size="4">包头市农电公司电费电量发行单</font></td>
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
					<span class="title"><font size="2"><%=Math.round(corporationlwShouShuTableDto.getPower())%></font></span>
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
					<span class="title"><font size="2"><%=Math.round(wholesalelwShouShuTableDto.getPower())%></font></span>
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
					<span class="title"><font size="2"><%=Math.round( lwShouShuTableDto.getPower())%></font></span>
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
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" 保 存 " onClick="printCount()">        </td> 
        </tr> 
    </table>

</form>
</body>
<script language="javascript">
function printCount(){
	fm.action="/iacontact/UICountAllNewSaveAction.do";
fm.submit();
  
}
function dianfei(){

	var fdianfeishui=0.0;
	var fdianfee=0.0;
	fdianfeishui=(parseFloat(fm.lwsumfc.value)*0.17).toFixed(2);
	
	fdianfee=parseFloat(fdianfeishui)+parseFloat(fm.lwsumfc.value);
	fm.lwsumftax.value=fdianfeishui;
	fm.lwsumfdianfee.value=fdianfee;
	
}
function chabie(){
	var chabieshui=0.0;
	chabieshui=(parseFloat(fm.lwdiffrentfee.value)*0.17).toFixed(2);
	fm.lwdiffrentfeetax.value=chabieshui;
	


}

function jijin(){
	var jijinshui=0.0;
	jijinshui=(parseFloat(fm.lwsumfjijin.value)*0.17).toFixed(2);
	fm.lwsumfjijintax.value=jijinshui;
	}
	function dianjin(){
	var dianjinshui=0.0;
	dianjinshui=(parseFloat(fm.lwsummfdianjin.value)*0.17).toFixed(2);
	fm.lwsumfdianjintax.value=dianjinshui;
	}
	
	function sanxia(){
	var sanxiashui=0.0;
	sanxiashui=(parseFloat(fm.lwsumfsanxia.value)*0.17).toFixed(2);
	fm.lwsumfsanxiatax.value=sanxiashui;
	}
	function fheji(){
	var heji=0.0;
	heji=(parseFloat(fm.lwsumfc.value)+parseFloat(fm.lwsumftax.value)+parseFloat(fm.lwdiffrentfee.value)+parseFloat(fm.lwdiffrentfeetax.value)+parseFloat(fm.lwsummfdianjin.value)+parseFloat(fm.lwsumfdianjintax.value)+parseFloat(fm.lwsumfsanxia.value)+parseFloat(fm.lwsumfsanxiatax.value)+parseFloat(fm.lwsumfjijin.value)+parseFloat(fm.lwsumfjijintax.value)).toFixed(2);
	fm.lwsumffee.value=heji;
	}
	
	
	
	
	//dunshou
	function wdianfei(){
	var wdianfeishui=0.0;
	var wdianfee=0.0;
	wdianfeishui=(parseFloat(fm.lwsumwc.value)*0.17).toFixed(2);
	wdianfee=parseFloat(wdianfeishui)+parseFloat(fm.lwsumwc.value);
	fm.lwsumwtax.value=wdianfeishui;
	fm.lwsumwdianfee.value=wdianfee;
	
}
function wchabie(){
	var wchabieshui=0.0;
	wchabieshui=(parseFloat(fm.lwdiffrentwfee.value)*0.17).toFixed(2);
	fm.lwdiffrentwfeetax.value=wchabieshui;
	


}

function wjijin(){
	var wjijinshui=0.0;
	wjijinshui=(parseFloat(fm.lwsumwjijin.value)*0.17).toFixed(2);
	fm.lwsumwjijintax.value=wjijinshui;
	}
	function wdianjin(){
	var wdianjinshui=0.0;
	wdianjinshui=(parseFloat(fm.lwsummwdianjin.value)*0.17).toFixed(2);
	
	fm.lwsumwdianjintax.value=wdianjinshui;
	}
	
	function wsanxia(){
	var wsanxiashui=0.0;
	wsanxiashui=(parseFloat(fm.lwsumwsanxia.value)*0.17).toFixed(2);
	fm.lwsumwsanxiatax.value=wsanxiashui;
	}
	function wheji(){
	var wheji=0.0;
	wheji=(parseFloat(fm.lwsumwc.value)+parseFloat(fm.lwsumwtax.value)+parseFloat(fm.lwdiffrentwfee.value)+parseFloat(fm.lwdiffrentwfeetax.value)+parseFloat(fm.lwsummwdianjin.value)+parseFloat(fm.lwsumwdianjintax.value)+parseFloat(fm.lwsumwsanxia.value)+parseFloat(fm.lwsumwsanxiatax.value)+parseFloat(fm.lwsumwjijin.value)+parseFloat(fm.lwsumwjijintax.value)).toFixed(2);
	fm.lwsumwfee.value=wheji;
	}
	function allsum(){
	fm.lwsumallpower.value=parseFloat(fm.lwsumfpower.value)+parseFloat(fm.lwsumwpower.value);
	
	fm.lwsumallc.value=(parseFloat(fm.lwsumfc.value)+parseFloat(fm.lwsumwc.value)).toFixed(2);
	fm.lwsumalltax.value=(parseFloat(fm.lwsumftax.value)+parseFloat(fm.lwsumwtax.value)).toFixed(2);
	fm.lwsumalldianfee.value=(parseFloat(fm.lwsumfdianfee.value)+parseFloat(fm.lwsumwdianfee.value)).toFixed(2);
	fm.lwdiffrentallfee.value=(parseFloat(fm.lwdiffrentfee.value)+parseFloat(fm.lwdiffrentwfee.value)).toFixed(2);
	fm.lwdiffrentallfeetax.value=(parseFloat(fm.lwdiffrentfeetax.value)+parseFloat(fm.lwdiffrentwfeetax.value)).toFixed(2);
	fm.lwsummalldianjin.value=(parseFloat(fm.lwsummfdianjin.value)+parseFloat(fm.lwsummwdianjin.value)).toFixed(2);
	fm.lwsumalldianjintax.value=(parseFloat(fm.lwsumfdianjintax.value)+parseFloat(fm.lwsumwdianjintax.value)).toFixed(2);
	fm.lwsumallsanxia.value=(parseFloat(fm.lwsumfsanxia.value)+parseFloat(fm.lwsumwsanxia.value)).toFixed(2);
	fm.lwsumallsanxiatax.value=(parseFloat(fm.lwsumfsanxiatax.value)+parseFloat(fm.lwsumwsanxiatax.value)).toFixed(2);
	fm.lwsumalljijin.value=(parseFloat(fm.lwsumfjijin.value)+parseFloat(fm.lwsumwjijin.value)).toFixed(2);
	fm.lwsumalljijintax.value=(parseFloat(fm.lwsumfjijintax.value)+parseFloat(fm.lwsumwjijintax.value)).toFixed(2);
	fm.lwsumallfee.value=(parseFloat(fm.lwsumffee.value)+parseFloat(fm.lwsumwfee.value)).toFixed(2);
	
	
	}
	function addpower(){
	fm.lwsumallpower.value=(parseFloat(fm.lwsumfpower.value)+parseFloat(fm.lwsumwpower.value)).toFixed(2);
	}
	function addallc(){
	fm.lwsumallc.value=(parseFloat(fm.lwsumfc.value)+parseFloat(fm.lwsumwc.value)).toFixed(2);
	}
	function addalltax(){
	fm.lwsumalltax.value=(parseFloat(fm.lwsumftax.value)+parseFloat(fm.lwsumwtax.value)).toFixed(2);
	}
	function addalldianfee(){
	fm.lwsumalldianfee.value=(parseFloat(fm.lwsumfdianfee.value)+parseFloat(fm.lwsumwdianfee.value)).toFixed(2);
	}
	function addalldianfee(){
	fm.lwsumalldianfee.value=(parseFloat(fm.lwsumfdianfee.value)+parseFloat(fm.lwsumwdianfee.value)).toFixed(2);
	}
	function adddiffrentallfee(){
	fm.lwdiffrentallfee.value=(parseFloat(fm.lwdiffrentfee.value)+parseFloat(fm.lwdiffrentwfee.value)).toFixed(2);
	}
	function adddiffrentallfeetax(){
	fm.lwdiffrentallfeetax.value=(parseFloat(fm.lwdiffrentfeetax.value)+parseFloat(fm.lwdiffrentwfeetax.value)).toFixed(2);
	}
	function addlldianjin(){
	fm.lwsummalldianjin.value=(parseFloat(fm.lwsummfdianjin.value)+parseFloat(fm.lwsummwdianjin.value)).toFixed(2);
	}
	
	function addalldianjintax(){
	fm.lwsumalldianjintax.value=(parseFloat(fm.lwsumfdianjintax.value)+parseFloat(fm.lwsumwdianjintax.value)).toFixed(2);
	}
	function addallsanxia(){
	fm.lwsumallsanxia.value=(parseFloat(fm.lwsumfsanxia.value)+parseFloat(fm.lwsumwsanxia.value)).toFixed(2);
	}
	function addallsanxiatax(){
	fm.lwsumallsanxiatax.value=(parseFloat(fm.lwsumfsanxiatax.value)+parseFloat(fm.lwsumwsanxiatax.value)).toFixed(2);
	}
	function addalljijin(){
	fm.lwsumalljijin.value=(parseFloat(fm.lwsumfjijin.value)+parseFloat(fm.lwsumwjijin.value)).toFixed(2);
	}
	function addalljijintax(){
	fm.lwsumalljijintax.value=(parseFloat(fm.lwsumfjijintax.value)+parseFloat(fm.lwsumwjijintax.value)).toFixed(2);
	}
	function addallfee(){
	fm.lwsumallfee.value=(parseFloat(fm.lwsumffee.value)+parseFloat(fm.lwsumwfee.value)).toFixed(2);
	}
	
	
	
</script>

</html:html>
