<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
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
<body class="interface" onload="javascript:doPrint();window.close()">&nbsp; 
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
%>
<form  name="fm" method="post">
	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
		
	<tr>
			<td class=title0 colspan="12"><font size="4">��ͷ��ũ�繫˾��ѵ������е�</font></td>
		</tr>
		
		<tr>
		<td nowrap colspan="2">
						<span class="title">�·�:<%=PowerFeeCal.getCurrentBillMonth()%></span>
					</td>
	</tr>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="3">��λ</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="3">����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="3">�����</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="3">���˰</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="3">�ϼ�</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="3">���</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="3">���˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="3">��Ͽ</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="3">��Ͽ˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="3">����</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="3">����˰</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="3">�ܼ�</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="3">���û�</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumfpower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumfc%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumftax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumfdianfee%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=summfdianjin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumfdianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumfsanxia%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumfsanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumfjijin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumfjijintax%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumffee%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="3">����</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumwpower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumwc%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumwtax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumwdianfee%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=summwdianjin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumwdianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumwsanxia%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumwsanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumwjijin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumwjijintax%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumwfee%></font></span>
				<br></td>			
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="3">�ܼ�</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumallpower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumallc%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumalltax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumallfee%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumalldianjin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumalldianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumallsanxia%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumallsanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumalljijin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumalljijintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="3"><%=sumallall%></font></span>
				<br></td>
							
			</tr>
			
	</table>
</form>
</body>
<script language="javascript">
function doPrint(){
	window.print();
}
</script>

</html:html>
