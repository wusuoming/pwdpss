<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<%@page import="com.elongway.pss.util.AppConst"%>
<%@page import="com.elongway.pss.ui.control.common.pub.SysUser"%>
<%@page import="com.elongway.pss.dto.domain.LwDcodeDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %> 

<%
	// 当前日期
	Date currentDate = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");	
%> 

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>直供乡电费发行单</title>
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
function printCount(){
	 var   strURL;     
	 var tt = fm.dd.value;
	 var company = fm.company.value;
   strURL="<%=request.getContextPath()%>/queryTownStatPrint.do?statMonth="+tt+"&company="+company;    
 
  winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
}
</script>
</head>
<body class=interface>&nbsp; 
<html:errors />
<%Collection billList = (Collection)request.getAttribute("billList");
SysUser user = (SysUser)session.getAttribute(AppConst.SYSUSER_SESSION);
String inputDate = (String)request.getAttribute("statMonth");
%>
<form  name="fm" method="post" 
	onsubmit="return validateUserQueryForm(this);" enctype="multipart/form-data">
	<table class=common width="500%" cellspacing="0" cellpadding="5" border="1" >
		<tr>
			<td class=title0 colspan="11" style="display:none"><input type="hidden" name="dd" value="<%=inputDate%>"></td>
		</tr>
		<%Collection resultList = (Collection)request.getAttribute("resultList"); 
		
		for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
				TownSataDto townSataDto = (TownSataDto) iterator
						.next();
		%>
		
		<tr>
			<td class=title0 colspan="11"><font size="2">包头市农电公司<%=townSataDto.getStatMonth() %>电费电量发行单</font></td>
		</tr>
		
		<!--人员代码，姓名-->
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">售电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">纯电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电费税</font></span>
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
					<span class="title"><font size="2"><%=townSataDto.getCompanyName() %></font></span>
					<input type="hidden" name="company" value="<%=townSataDto.getComCode()%>">
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getSumPower() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPurePowerFee() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPowerFeeTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPureDianJin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getDianJinTax() %></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPureSanXia() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getSanXiaTax() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPureJiJin() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getJiJinTax() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getSumPowerFee() %></font></span>
				<br></td>	
							
			</tr>
			<tr>
    <td  colspan="4">制表:</td>
    <td  colspan="4">审核:</td>

    <td  colspan="3">负责人:</td>
  </tr>
			
		<%} %>
		
  </table>
  
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button><input name="add" type="button" class=button value=" 打 印 " onClick="printCount();"></td>
            <td class=button align="center"><input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);">        </td> 
        </tr> 
    </table>

</form>
</body>


</html:html>
