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
  
<title>��ͷũ���ܹ�˾��ѵ������е�</title>
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
   //��������͵ĺϳɺ���
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
			<td class=title0 colspan="14"><font size="5">��ͷ��ũ�繫˾��ѵ������е�(����)</font></td>
		</tr>
		
		<tr>
		<td nowrap colspan="2">
						<span class="title"><font size="5">�·�:<%=statMonth%></font></span>
		</td>
	    </tr>
	
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="5">��λ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">�����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="5">���˰</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="5">�ϼ�</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="5">�����</font></span>
				<br></td>	
				
				<td nowrap width="10%">
					<span class="title"><font size="5">�����˰</font></span>
				<br></td>
				
				
				<td nowrap width="10%">
					<span class="title"><font size="5">���</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="5">���˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="5">��Ͽ</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="5">��Ͽ˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="5">����</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="5">����˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="5">�ܼ�</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="5">���û�</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumfpower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumfpower" value="<%=sumfpower%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumfc%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumfc" value="<%=sumfc%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumftax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumftax" value="<%=sumftax%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumfdianfee%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumfdianfee" value="<%=sumfdianfee%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=0%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwdiffrentfee" value="<%=0%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=0%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwdiffrentfeetax" value="<%=0%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=summfdianjin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsummfdianjin" value="<%=summfdianjin%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumfdianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumfdianjintax" value="<%=sumfdianjintax%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumfsanxia%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumfsanxia" value="<%=sumfsanxia%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumfsanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumfsanxiatax" value="<%=sumfsanxiatax%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumfjijin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumfjijin" value="<%=sumfjijin%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumfjijintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumfjijintax" value="<%=sumfjijintax%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumffee%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumffee" value="<%=sumffee%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="5">����</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumwpower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumwpower" value="<%=sumwpower%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumwc%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumwc" value="<%=sumwc%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumwtax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumwtax" value="<%=sumwtax%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumwdianfee%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumwdianfee" value="<%=sumwdianfee%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(differenceQuantityFee)/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
				<span class="title"><font size="5"><input  name="lwdiffrentwfee" value="<%=df.format(Double.parseDouble(differenceQuantityFee)/1.17)%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=df.format(Double.parseDouble(differenceQuantityFee)/1.17*0.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
				<span class="title"><font size="5"><input  name="lwdiffrentwfeetax" value="<%=df.format(Double.parseDouble(differenceQuantityFee)/1.17*0.17)%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=summwdianjin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsummwdianjin" value="<%=summwdianjin%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumwdianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumwdianjintax" value="<%=sumwdianjintax%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumwsanxia%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumwsanxia" value="<%=sumwsanxia%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumwsanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumwsanxiatax" value="<%=sumwsanxiatax%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumwjijin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumwjijin" value="<%=sumwjijin%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumwjijintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumwjijintax" value="<%=sumwjijintax%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumwfee%></font></span>
				<br></td>
				<td nowrap width="10%" align="center" style="display: none">
					<span class="title"><font size="5"><input  name="lwsumwfee" value="<%=sumwfee%>" style="border: 0" readonly="readonly"></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="5">�ܼ�</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumallpower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumallc%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumalltax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumallfee%></font></span>
				<br></td>
				
					
				<td nowrap width="10%" align="center">
				<span class="title"><font size="5"><%=df.format(Double.parseDouble(differenceQuantityFee)/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
				<span class="title"><font size="5"><%=df.format(Double.parseDouble(differenceQuantityFee)/1.17*0.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumalldianjin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumalldianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumallsanxia%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumallsanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumalljijin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumalljijintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="5"><%=sumallall%></font></span>
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
