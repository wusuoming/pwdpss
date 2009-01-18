<%@ page contentType="text/html; charset=GBK"%>
<jsp:directive.page import="java.util.Collection" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto" />
<jsp:directive.page import="java.util.List" />
<jsp:directive.page import="java.util.Iterator" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwFactoryIndicatorDto" />
<jsp:directive.page
	import="com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwAmmeterChangeDto" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto" />
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
	<meta http-equiv=Content-Type content="text/html; charset=gb2312">

	<title>大工业指针初始化录入页面</title>
	<link rel="stylesheet" type="text/css" media="all"
		href="/mimessage/css/calendar.css" title="win2k-cold-1" />
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
	<script language="Javascript"
		src="/iacontact/common/pub/StaticJavascript.jsp"></script>
	<!-- calendar stylesheet -->
	<link rel="stylesheet" type="text/css" media="all"
		href="../../../../iacontact/css/calendar-win2k-cold-1.css"
		title="win2k-cold-1" />

	<!-- main calendar program -->
	<script type="text/javascript"
		src="../../../../iacontact/common/pub/js/calendar.js"></script>

	<!-- language for the calendar -->

	<script type="text/javascript"
		src="../../../../iacontact/common/pub/js/calendar-cn-utf8.js"></script>

	<!-- the following script defines the Calendar.setup helper function, which makes
       adding a calendar a matter of 1 or 2 lines of code. -->
	<script type="text/javascript"
		src="../../../../iacontact/common/pub/js/calendar-setup.js"></script>
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
       var strURL = "<%=request.getContextPath()%>/patchAndCal.do";
       fm.action = strURL;
	  fm.submit();
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
</head>
<body class=interface>
	<html:errors />

	<form name="fm" method="post">
		<table>
			<tr>



				<td class="title">
					录入日期
				</td>
				<%
				String statMonth = (String) request.getAttribute("statMonth");
				%>
				<td class="input">
					<input name="inputdate" value=<%=statMonth%> readonly="readonly" />
			</tr>
		</table>
		<table width="100%">


			<tr class=listtitle align="center">
				<td class=title0 colspan="9" width="100%">
					<B><font size="3">大工业指针初始化录入页面</font>
					</B>
				</td>
			</tr>

			<!--点击新增时显示的新增路径条件部分(公用)-->


			<tr class=listtitle>
				<td nowrap>
					<span class="title">户号</span>
				</td>
				<td nowrap>
					<span class="title">工厂名</span>
				</td>
				<td nowrap>
					<span class="title">表号</span>
				</td>
				<td nowrap>
					<span class="title">上月有功指针</span>
				</td>
				<td nowrap>
					<span class="title">当月有功指针</span>
				</td>
				<td nowrap>
					<span class="title">上月无功指针</span>
				</td>
				<td nowrap>
					<span class="title">当月无功指针</span>
				</td>
				<td nowrap>
					<span class="title">倍率</span>
				</td>
				<td nowrap>
					<span class="title">使用类型</span>
				</td>




			</tr>



			<%
				LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = new LwNewFactoryIndicatorDto();
				List wholesaleUser = (List) request.getAttribute("indicatorList");
				Iterator it = wholesaleUser.iterator();
				while (it.hasNext()) {
					lwNewFactoryIndicatorDto = (LwNewFactoryIndicatorDto) it.next();
			%>

			<tr class=oddrow>
				<td class="input">
					<input name="UserNo" style="width:65px"
						value="<%=lwNewFactoryIndicatorDto.getUserNo()%>" style="border:0"
						readonly="readonly">
				</td>
				<td class="input">
					<input name="UserName" style="width:65px"
						value="<%=lwNewFactoryIndicatorDto.getUsername()%>"
						style="border:0" readonly="readonly">
				</td>
				<td class="input">
					<input name="AmmeterNo" style="width:65px"
						value="<%=lwNewFactoryIndicatorDto.getAmmeterNo()%>"
						style="border:0" readonly="readonly">
				</td>
				<td class="input">
					<input name="LastWorkNum" style="width:65px">
				<td class="input">
					<input name="ThisWorkNum" style="width:65px" style="border:0"
						readonly="readonly">
				<td class="input">
					<input name="LastIdleNum" style="width:65px">
				<td class="input">
					<input name="ThisIdleNum" style="width:65px" style="border:0"
						readonly="readonly">
				<td class="input">
					<input name="Rate" style="width:65px"
						value="<%=lwNewFactoryIndicatorDto.getRate()%>" style="border:0"
						readonly="readonly">
				</td>
				<%
				if (lwNewFactoryIndicatorDto.getAmmeterStyle().equals("0")) {
				%>
				<td class="title" align="center">
					大工业
					<input name="AmmeterStyle" style="width:65px" value="0"
						type="hidden" readonly="readonly">
				</td>
				<%
				}
				%>
				<%
				if (lwNewFactoryIndicatorDto.getAmmeterStyle().equals("1")) {
				%>
				<td class="title" align="center">
					居民照明
					<input name="AmmeterStyle" style="width:65px" value="1"
						type="hidden" readonly="readonly">
				</td>
				<%
				}
				%>
			</tr>
			<%
			}
			%>

		</table>
		<p>
			<br>
		</p>
		<!-- 按钮的显示-->
		<table cellpadding="0" cellspacing="0" width="100%">
			<tr>
				<td>
					<table cellpadding="0" cellspacing="0" width="100%">
						<tr>
						<tr class="listtitle" align="center">
							<td class=button align="center">
								<input type=button class=button name=button0 value="保存"
									onclick="savePointer()">
							</td>
					</table>
				</td>

			</tr>
		</table>
	</form>
</body>
<script language="javascript">
function savePointer(){
	fm.action="/iacontact/viewLWCorporationSalePointer.do";
	fm.submit();
}

</script>


</html:html>
