<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="java.text.DecimalFormat"/>
<%@page import="com.elongway.pss.dto.custom.TownFeeSumCustomDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>直供乡比例分摊电量发行单</title>
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
<body >
<html:errors />


<form  name="fm" method="post">
	<table class=common width="100%" cellspacing="0"  border="1" >
		<%Collection<TownFeeSumCustomDto>feeList = (Collection)request.getAttribute("feeList"); 
		String statMonth=(String)request.getAttribute("statMonth");%>
	<tr>
			<td class=title0 colspan="14"><font size="4">包头市农电公司<%=statMonth %>比例分摊电费发行单</font></td>
<td style="display:none"><input type="hidden" name="StartMonth" value="<%=statMonth%>"></td>
		</tr>
		
		
		<tr class=listtitle  style="height:30px">
				<td width="10%" align="center">
					<span class="title"><font size="2">项目</font></span>
				<br></td>
				
				<td width="10%" align="center">
					<span class="title"><font size="2">电压等级</font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">售电量</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title" ><font size="2">电费</font></span>
				<br></td>
				
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">合计(含税)</font></span>
				<br></td>				
							
			</tr>
			<% TownFeeSumCustomDto feeDto = null;
			int count = feeList.size()/6;
			int tempCount = 1;
			for (Iterator iterator = feeList.iterator(); iterator.hasNext();) {
			feeDto = (TownFeeSumCustomDto)iterator.next();
		
			%>
				<tr class=title style="height:30px">
				<%if(tempCount%count==1) {%>
				<td width="10%"  align="center" rowspan=<%=count%>>
					<span class="title"><font size="2"><%=feeDto.getClassId() %></font></span>
				<br></td>
				<%} %>
				<td width="10%"  align="center">
					<span class="title"><font size="2"><%=feeDto.getVoltLevelName() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=feeDto.getQuantity() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=feeDto.getPowerFee() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=feeDto.getSumFee() %></font></span>
				<br></td>				
							
			</tr>
			
			<% tempCount++;
			} %>
			
			
	</table>
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" 打 印 " onClick="getPage()">        </td> 
        </tr> 
    </table>

</form>
</body>
<script language="javascript">
function getPage(){
	var b=fm.StartMonth.value;
	
strURL   =   "<%=request.getContextPath()%>/UIcorporationcountPrintAction.do?inputDate="+b;
	winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");
}
</script>

</html:html>
