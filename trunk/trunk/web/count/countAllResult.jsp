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

String statMonth = (String)request.getAttribute("statMonth");

String differenceQuantityFee=(String)request.getAttribute("differenceQuantityFee");










%>
<form  name="fm" method="post">
 <%
		 LwCorporationSummaryDto corporation=(LwCorporationSummaryDto)request.getAttribute("LwCorporationSummaryDto2");
		 LwCoporationUserInfoDto lwCoporationUserInfoDto=(LwCoporationUserInfoDto)request.getAttribute("lwCoporationUserInfoDto");
		Collection col=(List)request.getAttribute("colpoint");
		String tax=(String)request.getAttribute("tax");
		DecimalFormat df = new DecimalFormat("###0.00");
		
%>
	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	<td style="display:none"><input type="hidden" name="StartMonth" value="<%=(String)request.getAttribute("inputDate") %>"></td>
		
	<tr>
			<td class=title0 colspan="14"><font size="4">包头市农电公司电费电量发行单</font></td>
		</tr>
		
		<tr>
		<td nowrap colspan="2">
						<span class="title">月份:<%=statMonth%></span>
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
					<span class="title"><font size="2"><input  name="lwsumfpower" value="<%=sumfpower%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfc" value="<%=sumfc%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumftax" value="<%=sumftax%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfdianfee" value="<%=sumfdianfee%>"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwdiffrentfee" value="<%=0%>"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwdiffrentfeetax" value="<%=0%>"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsummfdianjin" value="<%=summfdianjin%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfdianjintax" value="<%=sumfdianjintax%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfsanxia" value="<%=sumfsanxia%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfsanxiatax" value="<%=sumfsanxiatax%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfjijin" value="<%=sumfjijin%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumfjijintax" value="<%=sumfjijintax%>"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumffee" value="<%=sumffee%>"></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">趸售</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwpower" value="<%=sumwpower%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwc" value="<%=sumwc%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwtax" value="<%=sumwtax%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwdianfee" value="<%=sumwdianfee%>"></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><input  name="lwdiffrentwfee" value="<%=df.format(Double.parseDouble(differenceQuantityFee)/1.17)%>"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><input  name="lwdiffrentwfeetax" value="<%=df.format(Double.parseDouble(differenceQuantityFee)/1.17*0.17)%>"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsummwdianjin" value="<%=summwdianjin%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwdianjintax" value="<%=sumwdianjintax%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwsanxia" value="<%=sumwsanxia%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwsanxiatax" value="<%=sumwsanxiatax%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwjijin" value="<%=sumwjijin%>"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwjijintax" value="<%=sumwjijintax%>"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input  name="lwsumwfee" value="<%=sumwfee%>"></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallpower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallc%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumalltax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallfee%></font></span>
				<br></td>
				
					
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantityFee)/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantityFee)/1.17*0.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumalldianjin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumalldianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallsanxia%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallsanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumalljijin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumalljijintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallall%></font></span>
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
  var b=fm.StartMonth.value;
  var lwsumfpower=fm.lwsumfpower.value;
  var lwsumfc=fm.lwsumfc.value;
  var lwsumftax=fm.lwsumftax.value;
  var lwsumfdianfee=fm.lwsumfdianfee.value;
  var lwdiffrentfee=fm.lwdiffrentfee.value;
  var lwdiffrentfeetax=fm.lwdiffrentfeetax.value;
  var lwsummfdianjin=fm.lwsummfdianjin.value;
  var lwsumfdianjintax=fm.lwsumfdianjintax.value;
  var lwsumfsanxia=fm.lwsumfsanxia.value;
  var lwsumfsanxiatax=fm.lwsumfsanxiatax.value;
  var lwsumfjijin=fm.lwsumfjijin.value;
  var lwsumfjijintax=fm.lwsumfjijintax.value;
  var lwsumffee=fm.lwsumffee.value;
  var lwsumwpower=fm.lwsumwpower.value;
  var lwsumwc=fm.lwsumwc.value;
  var lwsumwtax=fm.lwsumwtax.value;
  var lwsumwdianfee=fm.lwsumwdianfee.value;
  var lwdiffrentwfee=fm.lwdiffrentwfee.value;
  var lwdiffrentwfeetax=fm.lwdiffrentwfeetax.value;
  
  var lwsummwdianjin=fm.lwsummwdianjin.value;
  var lwsumwdianjintax=fm.lwsumwdianjintax.value;
  var lwsumwsanxia=fm.lwsumwsanxia.value;
  var lwsumwsanxiatax=fm.lwsumwsanxiatax.value;
  var lwsumwjijin=fm.lwsumwjijin.value;
  var lwsumwjijintax=fm.lwsumwjijintax.value;
  var lwsumwfee=fm.lwsumwfee.value;
  
  
strURL   =   "<%=request.getContextPath()%>/countAllResult.do?inputDate="+b+"&&lwsumfpower="+lwsumfpower+"&&lwsumfc="+lwsumfc+"&&lwsumftax="+lwsumftax+"&&lwsumfdianfee="+lwsumfdianfee+"&&lwdiffrentfee="+lwdiffrentfee+"&&lwdiffrentfeetax="+lwdiffrentfeetax+"&&lwsummfdianjin="+lwsummfdianjin+"&&lwsumfdianjintax="+lwsumfdianjintax+"&&lwsumfsanxia="+lwsumfsanxia+"&&lwsumfsanxiatax="+lwsumfsanxiatax+"&&lwsumfjijin="+lwsumfjijin+"&&lwsumfjijintax="+lwsumfjijintax+"&&lwsumffee="+lwsumffee+"&&lwsumwpower="+lwsumwpower+"&&lwsumwc="+lwsumwc+"&&lwsumwtax="+lwsumwtax+"&&lwsumwdianfee="+lwsumwdianfee+"&&lwdiffrentwfee="+lwdiffrentwfee+"&&lwdiffrentwfeetax="+lwdiffrentwfeetax+"&&lwsummwdianjin="+lwsummwdianjin+"&&lwsumwdianjintax="+lwsumwdianjintax+"&&lwsumwsanxia="+lwsumwsanxia+"&&lwsumwsanxiatax="+lwsumwsanxiatax+"&&lwsumwjijin="+lwsumwjijin+"&&lwsumwjijintax="+lwsumwjijintax+"&&lwsumwfee="+lwsumwfee;
	winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
}
</script>

</html:html>
