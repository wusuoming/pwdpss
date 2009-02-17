<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page import="java.text.DecimalFormat"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.dto.custom.WholeSaleFee"/>
<%@page import="com.elongway.pss.dto.domain.LwWholeSaleDetailDto"%>
<%@page import="com.elongway.pss.dto.domain.LwAllWholeFeeDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>包头农电总公司趸售电费电量发行单</title>
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

<form  name="fm" method="post">

	<table class=common width="500%"  border="1" cellspacing="1" cellpadding="6">
	<td style="display:none"><input type="hidden" name="StartMonth" value="<%=(String)request.getAttribute("inputDate") %>"></td>
		
	<tr>
			<td class=title0 colspan="13"><font size="4">包头市农电公司趸售电费电量发行单</font></td>
		</tr>
		
		<%
		
		DecimalFormat df = new DecimalFormat("###0.00");
		LwWholeSaleDetailDto lwWholeSaleDetailDtogy = (LwWholeSaleDetailDto)request.getAttribute("lwWholeSaleDetailDtogy");
		LwWholeSaleDetailDto lwWholeSaleDetailDtodm = (LwWholeSaleDetailDto)request.getAttribute("lwWholeSaleDetailDtodm");
		LwWholeSaleDetailDto lwWholeSaleDetailDtojy = (LwWholeSaleDetailDto)request.getAttribute("lwWholeSaleDetailDtojy");
		LwWholeSaleDetailDto lwWholeSaleDetailDtoty = (LwWholeSaleDetailDto)request.getAttribute("lwWholeSaleDetailDtoty");
		 LwAllWholeFeeDto lwAllWholeFeeDtoty = (LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtoty");
		 LwAllWholeFeeDto lwAllWholeFeeDtogy = (LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtogy");
		LwAllWholeFeeDto lwAllWholeFeeDtodm = (LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtodm");
		LwAllWholeFeeDto lwAllWholeFeeDtojy = (LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtojy");
		//求总电量
		LwAllWholeFeeDto lwAllWholeFeeDto = new LwAllWholeFeeDto();
		 %>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量10KV</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费10KV</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费10KV</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center" rowspan="5">
					<span class="title"><font size="2">土右供电局</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getUnDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getUnDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getProductQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getProductMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getFarmUseQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getFarmUseMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getBizQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getBizMoney10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getUnIndustryQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getUnIndustryMoney10kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量35KV</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费35KV</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font></span>
				<br></td>
							
			</tr>
			<tr >
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getUnDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getUnDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getProductQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getProductMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getFarmUseQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getFarmUseMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getBizQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getBizMoney35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getUnIndustryQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getUnIndustryMoney35kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总电量</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">利率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
				
						
			</tr>
			
					<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtoty.getPower1()))%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getDianfei())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getDianfeitax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getFujia3())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getJijin())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getFujia1())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getDianjintax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font></span>
				<br></td>
				
						
			</tr>
			<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量10KV</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费10KV</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费10KV</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center" rowspan="5">
					<span class="title"><font size="2">达茂供电局</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getUnDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getUnDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getProductQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getProductMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getFarmUseQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getFarmUseMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getBizQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getBizMoney10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getUnIndustryQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getUnIndustryMoney10kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量35KV</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费35KV</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font></span>
				<br></td>
							
			</tr>
			<tr >
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getUnDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getUnDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getProductQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getProductMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getFarmUseQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getFarmUseMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getBizQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getBizMoney35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getUnIndustryQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getUnIndustryMoney35kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总电量</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">利率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
				
						
			</tr>
			
				<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtodm.getPower1())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getDianfei())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getDianfeitax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getFujia3())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getJijin())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getFujia1())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getDianjintax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font></span>
				<br></td>
				
						
			</tr>
			<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量10KV</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费10KV</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费10KV</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center" rowspan="5">
					<span class="title"><font size="2">九原供电局</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getUnDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getUnDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getProductQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getProductMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getFarmUseQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getFarmUseMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getBizQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getBizMoney10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getUnIndustryQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getUnIndustryMoney10kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量35KV</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费35KV</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font></span>
				<br></td>
							
			</tr>
			<tr >
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getUnDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getUnDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getProductQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getProductMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getFarmUseQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getFarmUseMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getBizQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getBizMoney35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getUnIndustryQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getUnIndustryMoney35kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总电量</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">利率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
				
						
			</tr>
			
				<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtojy.getPower1()))%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getDianfei())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getDianfeitax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getFujia3())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getSanxia())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getJijin())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getFujia1())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getDianjin())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getDianjintax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font></span>
				<br></td>
				
						
			</tr>
			<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量10KV</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费10KV</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费10KV</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center" rowspan="5">
					<span class="title"><font size="2">固阳供电局</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getUnDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getUnDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getProductQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getProductMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getFarmUseQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getFarmUseMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getBizQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getBizMoney10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getUnIndustryQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getUnIndustryMoney10kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量35KV</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费35KV</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font></span>
				<br></td>
							
			</tr>
			<tr >
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getUnDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getUnDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getProductQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getProductMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getFarmUseQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getFarmUseMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getBizQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getBizMoney35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getUnIndustryQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getUnIndustryMoney35kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总电量</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">利率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
				
						
			</tr>
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtogy.getPower1())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getDianfei())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getDianfeitax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getFujia3())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getJijin())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getFujia1())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font></span>
				<br></td>
				
						
			</tr>
			<tr class=listtitle>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电量</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">利率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
							
			</tr>
			
						<tr >
						<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=request.getAttribute("sumwpower") %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=request.getAttribute("sumwc") %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=request.getAttribute("sumwtax")%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=request.getAttribute("Sumlilv") %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=request.getAttribute("sumwsanxia")%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=request.getAttribute("sumwsanxiatax")%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=request.getAttribute("sumwjijin")%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=request.getAttribute("sumwjijintax")%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=request.getAttribute("summwdianjin")%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=request.getAttribute("sumwdianjintax")%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=request.getAttribute("sumwfee") %></font></span>
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
