<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page import="java.text.DecimalFormat" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwCorporationSummaryDto" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto" />
<jsp:directive.page import="com.elongway.pss.dto.custom.WholeSaleFee" />
<%@page import="com.elongway.pss.dto.domain.LwWholeSaleDetailDto"%>
<%@page import="com.elongway.pss.dto.domain.LwAllWholeFeeDto"%>
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal" />
<%@page import="com.elongway.pss.dto.domain.LwWholeSaleStatDetailDto"%>
<%@page import="com.elongway.pss.util.AppConst"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
	<meta http-equiv=Content-Type content="text/html; charset=gb2312">

	<title>包头农电总公司趸售电费电量发行单</title>
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
<body class=interface>
	&nbsp;
	<html:errors />

	<form name="fm" method="post">

		<table class=common width="500%" border="1" cellspacing="0"
			cellpadding="6">
			<td style="display: none">
				<input type="hidden" name="StartMonth"
					value="<%=(String) request.getAttribute("statMonth")%>">
				<input type="hidden" name="counttype"
					value="<%=(String) request.getAttribute("counttype")%>">
			</td>

			<tr>
				<td class=title0 colspan="14">
					<font size="4">包头市农电公司趸售电费电量发行单（累计）</font>
				</td>
			</tr>

			<%
				DecimalFormat df = new DecimalFormat("###0.00");
				DecimalFormat df1 = new DecimalFormat("###0");
				String print = (String)request.getAttribute("print");
					PowerFeeCal powerFeeCal = new PowerFeeCal();
					Collection<LwWholeSaleStatDetailDto> statList = (Collection) request
							.getAttribute("statList");
		for (Iterator iterator = statList.iterator(); iterator.hasNext();) {
				LwWholeSaleStatDetailDto o = (LwWholeSaleStatDetailDto) iterator
						.next();
			%>
			<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">总电量10KV</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量10KV</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费10KV</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量10KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费10KV</font>
					</span>
					<br>
				</td>


				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量10KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费10KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电量10KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电费10KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量10KV</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费10KV</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量10KV</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费10KV</font>
					</span>
					<br>
				</td>
			</tr>
			<tr>
				<td nowrap width="10%" align="center" rowspan="5">
					<span class="title"><font size="2"><%=o.getCompanyName() %></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df1.format(o.getSumQuantity10KV())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df1.format(o.getDenizenQuantity10kv())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o
								.getDenizenMoney10kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(o
								.getUnDenizenQuantity10kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o
								.getUnDenizenMoney10kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(o
								.getProductQuantity10kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o
								.getProductMoney10kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(o
								.getFarmUseQuantity10kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o
								.getFarmUseMoney10kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(o
								.getBizQuantity10kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o.getBizMoney10kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(o
								.getUnIndustryQuantity10kv())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o
								.getUnIndustryMoney10kv())%></font>
					</span>
					
				</td>


			</tr>
			<tr class=listtitle>
				<td nowrap width="10%">
					<span class="title"><font size="2">总电量35KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量35KV</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费35KV</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量35KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费35KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量35KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费35KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量35KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费35KV</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font>
					</span>
					<br>
				</td>

			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df1.format(o.getSumQuantity35KV())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(o
								.getDenizenQuantity35kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o
								.getDenizenMoney35kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(o
								.getUnDenizenQuantity35kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o
								.getUnDenizenMoney35kv())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(o
								.getProductQuantity35kv())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o
								.getProductMoney35kv())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(o
								.getFarmUseQuantity35kv())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o
								.getFarmUseMoney35kv())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(o
								.getBizQuantity35kv())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o.getBizMoney35kv())%></font>
					</span>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df1.format(o
								.getUnIndustryQuantity35kv())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o
								.getUnIndustryMoney35kv())%></font>
					</span>
				</td>


			</tr>
			<tr class=listtitle>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电量</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费税</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">力率电费</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">广播费</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">海明炉</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">多边电费</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">退补电费</font>
					</span>
					<br>
				</td>
		        <td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font>
					</span>
					<br>
				</td>
			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df1.format(o.getSumQuantity())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o.getPowerFee())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o.getPowerFeeTax())%></font>
					</span>
					
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o.getLilvFee())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o.getBroadFee())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o.getHaiminglu())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o.getDuobianFee())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o.getTuibuFee())%></font>
					</span>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(o.getSumPowerFee())%></font>
					</span>
				</td>
			</tr>
			<%} %>
		</table>
		<%if(!AppConst.PRINT_FLAG.equals(print)){ %>
		<table cellpadding="0" cellspacing="0" width="100%">
			<tr>
			<tr class="listtitle" align="center">
				<td class=button align="center">
					<input type=button class=button name=button2 value=" 打 印 "
						onClick="printCount()">
				</td>
				
			</tr>
		</table>
		<%} %>
	</form>
</body>
<script language="javascript">
function printCount(){
  var b=fm.StartMonth.value;
strURL   =   "<%=request.getContextPath()%>/UIEveryWholeSaleCountAction.do?inputDate="+b+"&print=1";
	winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
}
function saveReport(){
  var b=fm.StartMonth.value;
strURL   =   "<%=request.getContextPath()%>/wholesalepricecount.do?inputDate="+b;
  fm.action = strURL;
  fm.submit();     
}
</script>

</html:html>
