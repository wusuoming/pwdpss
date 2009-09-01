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
<%@page import="com.elongway.pss.dto.domain.LwPowerFeeFaxingDto"%>
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
String sumffee=(String)request.getAttribute("sumffee");
String sumfpower=request.getAttribute("sumfpower").toString();
String sumfdianfee=(String)request.getAttribute("sumfdianfee");
String sumftax=(String)request.getAttribute("sumftax");
String sumfc=(String)request.getAttribute("sumfc");
String summfdianjin=(String)request.getAttribute("summfdianjin");
String sumfdianjintax=(String)request.getAttribute("sumfdianjintax");
String sumfsanxia=(String)request.getAttribute("sumfsanxia");
String sumfsanxiatax=(String)request.getAttribute("sumfsanxiatax");
String sumfjijin=(String)request.getAttribute("sumfjijin");
String sumfjijintax=(String)request.getAttribute("sumfjijintax");
String sumwfee=(String)request.getAttribute("sumwfee");
String sumwpower=request.getAttribute("sumwpower").toString();
String sumwdianfee=(String)request.getAttribute("sumwdianfee");
String sumwtax=(String)request.getAttribute("sumwtax");
String sumwc=(String)request.getAttribute("sumwc");
String summwdianjin=(String)request.getAttribute("summwdianjin");
String sumwdianjintax=(String)request.getAttribute("sumwdianjintax");
String sumwsanxia=(String)request.getAttribute("sumwsanxia");
String sumwsanxiatax=(String)request.getAttribute("sumwsanxiatax");
String sumwjijin=(String)request.getAttribute("sumwjijin");
String sumwjijintax=(String)request.getAttribute("sumwjijintax");

String sumallfee=(String)request.getAttribute("sumallfee");
String sumallpower=request.getAttribute("sumallpower").toString();
String sumallc=(String)request.getAttribute("sumallc");
String sumalltax=(String)request.getAttribute("sumalltax");
String sumallall=(String)request.getAttribute("sumallall");
String sumalldianjin=(String)request.getAttribute("sumalldianjin");
String sumalldianjintax=(String)request.getAttribute("sumalldianjintax");
String sumallsanxia=(String)request.getAttribute("sumallsanxia");
String sumallsanxiatax=(String)request.getAttribute("sumallsanxiatax");
String sumalljijin=(String)request.getAttribute("sumalljijin");
String sumalljijintax=(String)request.getAttribute("sumalljijintax");
String differenceQuantityFee=(String)request.getAttribute("differenceQuantityFee");









%>
<form  name="fm" method="post">
 <%
		 LwCorporationSummaryDto corporation=(LwCorporationSummaryDto)request.getAttribute("LwCorporationSummaryDto2");
		 LwCoporationUserInfoDto lwCoporationUserInfoDto=(LwCoporationUserInfoDto)request.getAttribute("lwCoporationUserInfoDto");
		Collection col=(List)request.getAttribute("colpoint");
		String tax=(String)request.getAttribute("tax");
		DecimalFormat df = new DecimalFormat("###0.00");
		String statMonth = (String)request.getAttribute("statMonth");
		
%>
	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	<td style="display:none"><input type="hidden" name="StartMonth" value="<%=(String)request.getAttribute("statMonth") %>"></td>
		<tr>
			<td class=title0 colspan="14"><font size="5">包头市农电公司电费电量发行单(当月)</font></td>
		</tr>
		
		<tr>
		<td nowrap colspan="2">
						<span class="title"><font size="5">月份:<%=statMonth%></font></span>
		</td>
	    </tr>
	
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="5">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">纯电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">电费税</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="5">合计</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="5">差别电费</font></span>
				<br></td>	
				
				<td nowrap width="10%">
					<span class="title"><font size="5">差别电费税</font></span>
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
					<span class="title"><font size="5">总计</font></span>
				<br></td>
							
			</tr>
				<%
			List list = (List)request.getAttribute("list");

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				LwPowerFeeFaxingDto faxingDto = (LwPowerFeeFaxingDto) iterator
						.next();
				String userNanme = faxingDto.getUserNo();		
						
						 %>
			<tr >
				<td nowrap width="10%"  align="center">
				<%if("sumwhole".equals(userNanme)){ %>
					<span class="title"><font size="2">趸售</font></span>
					<%} %>
					<%if("sumcorp".equals(userNanme)){ %>
					<span class="title"><font size="2">大用户</font></span>
					<%} %>
					<%if("sumFaXing".equals(userNanme)){ %>
					<span class="title"><font size="2">合计</font></span>
					<%} %>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=faxingDto.getQuantity()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsumfpower" value="<%=faxingDto.getQuantity()%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(faxingDto.getPurePowerFee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsumfc" value="<%=df.format(faxingDto.getPurePowerFee())%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(faxingDto.getPowerFeeTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsumftax" value="<%=df.format(faxingDto.getPowerFeeTax())%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(faxingDto.getPurePowerFee()+faxingDto.getPowerFeeTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsumfdianfee" value="<%=df.format(faxingDto.getPurePowerFee()+faxingDto.getPowerFeeTax())%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwdiffrentfee" value="<%=0%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwdiffrentfeetax" value="<%=0%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(faxingDto.getPureDianJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsummfdianjin" value="<%=df.format(faxingDto.getPureDianJin())%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(faxingDto.getDianJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsumfdianjintax" value="<%=df.format(faxingDto.getDianJinTax())%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(faxingDto.getSanXiaFee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsumfsanxia" value="<%=df.format(faxingDto.getSanXiaFee())%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(faxingDto.getSanXiaTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsumfsanxiatax" value="<%=df.format(faxingDto.getSanXiaTax())%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(faxingDto.getPureJiJin())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsumfjijin" value="<%=df.format(faxingDto.getPureJiJin())%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(faxingDto.getJiJinTax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsumfjijintax" value="<%=df.format(faxingDto.getJiJinTax())%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(faxingDto.getSumFee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="2"><input  name="lwsumffee" value="<%=df.format(faxingDto.getSumFee())%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				
							
			</tr>
						<%} %>
	</table>

</form>
</body>
<script language="javascript">
function printCount(){
window.print();
}
</script>

</html:html>
