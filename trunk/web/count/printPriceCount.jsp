<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<%@page import="com.elongway.pss.util.PowerFeeCal"%>
<%@page import="com.elongway.pss.util.AppConst"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<jsp:directive.page import="java.text.DecimalFormat" />
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@page import="com.elongway.pss.dto.domain.LwWholeSaleDetailDto"%>
<%@page import="com.elongway.pss.dto.domain.LwAllWholeFeeDto"%>
<html:html xhtml="true" locale="true">
<head>
	<meta http-equiv=Content-Type content="text/html; charset=gb2312">

	<title>趸售电费发行单</title>
	<link rel="stylesheet" type="text/css" media="all"
		href="/mimessage/css/calendar.css" title="win2k-cold-1" />
	<app:css />
	<html:base />
	<STYLE>
BODY {
	SCROLLBAR-FACE-COLOR: #ffffff;
	SCROLLBAR-HIGHLIGHT-COLOR: #A9CBED;
	SCROLLBAR-SHADOW-COLOR: #A9CBED;
	SCROLLBAR-3DLIGHT-COLOR: #FFFFFF;
	SCROLLBAR-ARROW-COLOR: #A9CBED;
	SCROLLBAR-TRACK-COLOR: #FFFFFF;
	SCROLLBAR-DARKSHADOW-COLOR: #FFFFFF;
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
<body class=interface onload="javascript:getPage();window.close()">
	.&nbsp;
	<html:errors />
	<%

LwWholeSaleDetailDto lwWholeSaleDetailDto = (LwWholeSaleDetailDto)request.getAttribute("lwWholeSaleDetailDto");
LwAllWholeFeeDto lwAllWholeFeeDto = (LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDto");
DecimalFormat df = new DecimalFormat("###0.00");
String sum1 = df.format(lwWholeSaleDetailDto.getDenizenMoney10kv()/1.17);
String sum2 = df.format(lwWholeSaleDetailDto.getDenizenMoney10kv()/1.17*0.17);
String sum3 = df.format(lwWholeSaleDetailDto.getDenizenMoney10kv());
String sum4 = df.format(lwWholeSaleDetailDto.getUnDenizenMoney10kv()/1.17);
String sum5 = df.format(lwWholeSaleDetailDto.getUnDenizenMoney10kv()/1.17*0.17);
String sum6 = df.format(lwWholeSaleDetailDto.getUnDenizenMoney10kv());
String sum7 = df.format(lwWholeSaleDetailDto.getBizMoney10kv()/1.17);
String sum8 = df.format(lwWholeSaleDetailDto.getBizMoney10kv()/1.17*0.17);
String sum9 = df.format(lwWholeSaleDetailDto.getBizMoney10kv());
String sum10 = df.format(lwWholeSaleDetailDto.getProductMoney10kv()/1.17);
String sum11 = df.format(lwWholeSaleDetailDto.getProductMoney10kv()/1.17*0.17);
String sum12 = df.format(lwWholeSaleDetailDto.getProductMoney10kv());
String sum13 = df.format(lwWholeSaleDetailDto.getFarmUseMoney10kv()/1.17);
String sum14 = df.format(lwWholeSaleDetailDto.getFarmUseMoney10kv()/1.17*0.17);
String sum15 = df.format(lwWholeSaleDetailDto.getFarmUseMoney10kv());
String sum16 = df.format(lwWholeSaleDetailDto.getUnIndustryMoney10kv()/1.17);
String sum17 = df.format(lwWholeSaleDetailDto.getUnIndustryMoney10kv()/1.17*0.17);
String sum18 = df.format(lwWholeSaleDetailDto.getUnIndustryMoney10kv());
String sum19 = df.format(lwWholeSaleDetailDto.getDenizenMoney35kv()/1.17);
String sum20 = df.format(lwWholeSaleDetailDto.getDenizenMoney35kv()/1.17*0.17);
String sum21 = df.format(lwWholeSaleDetailDto.getDenizenMoney35kv());
String sum22 = df.format(lwWholeSaleDetailDto.getUnDenizenMoney35kv()/1.17);
String sum23 = df.format(lwWholeSaleDetailDto.getUnDenizenMoney35kv()/1.17*0.17);
String sum24 = df.format(lwWholeSaleDetailDto.getUnDenizenMoney35kv());
String sum25 = df.format(lwWholeSaleDetailDto.getBizMoney35kv()/1.17);
String sum26 = df.format(lwWholeSaleDetailDto.getBizMoney35kv()/1.17*0.17);
String sum27 = df.format(lwWholeSaleDetailDto.getBizMoney35kv());
String sum28 = df.format(lwWholeSaleDetailDto.getProductMoney35kv()/1.17);
String sum29 = df.format(lwWholeSaleDetailDto.getProductMoney35kv()/1.17*0.17);
String sum30 = df.format(lwWholeSaleDetailDto.getProductMoney35kv());
String sum31 = df.format(lwWholeSaleDetailDto.getFarmUseMoney35kv()/1.17);
String sum32 = df.format(lwWholeSaleDetailDto.getFarmUseMoney35kv()/1.17*0.17);
String sum33 = df.format(lwWholeSaleDetailDto.getFarmUseMoney35kv());
String sum34 = df.format(lwWholeSaleDetailDto.getUnIndustryMoney35kv()/1.17);
String sum35 = df.format(lwWholeSaleDetailDto.getUnIndustryMoney35kv()/1.17*0.17);
String sum36 = df.format(lwWholeSaleDetailDto.getUnIndustryMoney35kv());
String sum37 = df.format(lwWholeSaleDetailDto.getDenizenQuantity10kv()+lwWholeSaleDetailDto.getUnDenizenQuantity10kv()+lwWholeSaleDetailDto.getBizQuantity10kv()+lwWholeSaleDetailDto.getProductQuantity10kv()+lwWholeSaleDetailDto.getFarmUseQuantity10kv()+lwWholeSaleDetailDto.getUnIndustryQuantity10kv()+lwWholeSaleDetailDto.getDenizenQuantity35kv()+lwWholeSaleDetailDto.getUnDenizenQuantity35kv()+lwWholeSaleDetailDto.getBizQuantity35kv()+lwWholeSaleDetailDto.getProductQuantity35kv()+lwWholeSaleDetailDto.getFarmUseQuantity35kv()+lwWholeSaleDetailDto.getUnIndustryQuantity35kv());
String sum38 = df.format(lwWholeSaleDetailDto.getDenizenMoney10kv()/1.17+lwWholeSaleDetailDto.getUnDenizenMoney10kv()/1.17+lwWholeSaleDetailDto.getBizMoney10kv()/1.17+lwWholeSaleDetailDto.getProductMoney10kv()/1.17+lwWholeSaleDetailDto.getFarmUseMoney10kv()/1.17+lwWholeSaleDetailDto.getUnIndustryMoney10kv()/1.17+lwWholeSaleDetailDto.getDenizenMoney35kv()/1.17+lwWholeSaleDetailDto.getUnDenizenMoney35kv()/1.17+lwWholeSaleDetailDto.getBizMoney35kv()/1.17+lwWholeSaleDetailDto.getProductMoney35kv()/1.17+lwWholeSaleDetailDto.getFarmUseMoney35kv()/1.17+lwWholeSaleDetailDto.getUnIndustryMoney35kv()/1.17);
String sum39 = df.format(lwWholeSaleDetailDto.getDenizenMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getUnDenizenMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getBizMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getProductMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getFarmUseMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getUnIndustryMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getDenizenMoney35kv()/1.17*0.17+lwWholeSaleDetailDto.getUnDenizenMoney35kv()/1.17*0.17+
lwWholeSaleDetailDto.getBizMoney35kv()/1.17*0.17+lwWholeSaleDetailDto.getProductMoney35kv()/1.17*0.17+lwWholeSaleDetailDto.getFarmUseMoney35kv()/1.17*0.17+lwWholeSaleDetailDto.getUnIndustryMoney35kv()/1.17*0.17);
String sum40 = df.format(lwWholeSaleDetailDto.getDenizenMoney10kv()/1.17 + lwWholeSaleDetailDto.getDenizenMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getUnDenizenMoney10kv()/1.17 + lwWholeSaleDetailDto.getUnDenizenMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getBizMoney10kv()/1.17 +lwWholeSaleDetailDto.getBizMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getProductMoney10kv()/1.17 +lwWholeSaleDetailDto.getProductMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getFarmUseMoney10kv()/1.17 + lwWholeSaleDetailDto.getFarmUseMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getUnIndustryMoney10kv()/1.17 + lwWholeSaleDetailDto.getUnIndustryMoney10kv()/1.17*0.17+lwWholeSaleDetailDto.getDenizenMoney35kv()/1.17 + lwWholeSaleDetailDto.getDenizenMoney35kv()/1.17*0.17+lwWholeSaleDetailDto.getUnDenizenMoney35kv()/1.17 + lwWholeSaleDetailDto.getUnDenizenMoney35kv()/1.17*0.17+lwWholeSaleDetailDto.getBizMoney35kv()/1.17 + lwWholeSaleDetailDto.getBizMoney35kv()/1.17*0.17+lwWholeSaleDetailDto.getProductMoney35kv()/1.17 + lwWholeSaleDetailDto.getProductMoney35kv()/1.17*0.17+lwWholeSaleDetailDto.getFarmUseMoney35kv()/1.17 + lwWholeSaleDetailDto.getFarmUseMoney35kv()/1.17*0.17+lwWholeSaleDetailDto.getUnIndustryMoney35kv()/1.17 + lwWholeSaleDetailDto.getUnIndustryMoney35kv()/1.17*0.17);
//三峡
//String sum41 = df.format(lwAllWholeFeeDto.getPower1());
//String sum42 = df.format(Double.parseDouble(lwAllWholeFeeDto.getSanxia())/1.17*0.17);
//String sum43 = df.format(lwAllWholeFeeDto.getSanxiatax());
//String sum44 = df.format(Double.parseDouble(sum42)+Double.parseDouble(sum43));
//基金
//String sum45 = df.format();


%>
	<form name="fm" method="post">
		<table class=common width="500%" border="1" cellspacing="0"
			cellpadding="5">
<input type="hidden" name="inputDate" value="<%=(String)request.getAttribute("inputDate") %>">
			<tr>
				<td class=title0 colspan="11">
					<font size="4">包头市农电公司电费电量发行单</font>
				</td>
			</tr>


			<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">项目</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">售电量</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">纯电费</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电费税</font> </span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">总计</font> </span>
					<br>
				</td>

			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">居民生活(10KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getDenizenQuantity10kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">

					<span class="title"><font size="2"><%=sum1 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum2 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum3 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">非居民照明(10KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getUnDenizenQuantity10kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum4 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum5 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum6 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">商业用电(10KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getBizQuantity10kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum7 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum8 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum9 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">农业生产(10KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getProductQuantity10kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum10 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum11 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum12 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">排灌用电(10KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getFarmUseQuantity10kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum13 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum14 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum15 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">非普工业(10KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getUnIndustryQuantity10kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum16 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum17 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum18 %></font>
					</span>
					<br>
				</td>


			</tr>

			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">居民生活(35KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getDenizenQuantity35kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum19 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum20 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum21 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">非居民照明(35KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getUnDenizenQuantity35kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum22 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum23 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum24 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">商业用电(35KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getBizQuantity35kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum25 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum26 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum27 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">农业生产(35KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getProductQuantity35kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum28 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum29 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum30 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">排灌用电(35KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getFarmUseQuantity35kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum31 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum32 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum33 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">非普工业(35KV)</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getUnIndustryQuantity35kv()) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum34 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum35 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum36 %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">合计</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum37 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum38 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum39 %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sum40 %></font>
					</span>
					<br>
				</td>


			</tr>


			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDto.getPower1() %></font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getSanxia())) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getSanxiatax())) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getSanxia())+Double.parseDouble(lwAllWholeFeeDto.getSanxiatax())) %></font>
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDto.getPower1() %></font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getJijin())) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getFujia1())) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getJijin())+Double.parseDouble(lwAllWholeFeeDto.getFujia1())) %></font>
					</span>
					<br>
				</td>


			</tr>

			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDto.getPower1() %></font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getDianjin())) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getDianjintax())) %></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getDianjin())+Double.parseDouble(lwAllWholeFeeDto.getDianjintax())) %></font>
					</span>
					<br>
				</td>


			</tr>

			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总费用</font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font> </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getSumfee())) %></font>
					</span>
					<br>
				</td>
			</tr>

		</table>

	</form>
</body>
<script language="javascript">
function getPage(){
	window.print();
}
</script>

</html:html>
