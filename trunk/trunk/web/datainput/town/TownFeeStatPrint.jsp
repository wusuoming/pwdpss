<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<%@page import="com.elongway.pss.util.AppConst"%>
<%@page import="com.elongway.pss.ui.control.common.pub.SysUser"%>
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
	 var tt = fm.statMonth.value;
   strURL="<%=request.getContextPath()%>/townfeeprint.do?statMonth="+tt;    
    alert(strURL);
  winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
}
function doPrint(){
	window.print();
}
</script>
</head>
<body onload="javascript:doPrint();window.close()">
<html:errors />
<%Collection billList = (Collection)request.getAttribute("billList");
SysUser user = (SysUser)session.getAttribute(AppConst.SYSUSER_SESSION);
%>
<form  name="fm"
	onsubmit="return validateUserQueryForm(this);" enctype="multipart/form-data">
	
	<%Collection resultList = (Collection)request.getAttribute("resultList"); 
		for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
				TownSataDto townSataDto = (TownSataDto) iterator
						.next();
		%>
		
	<table class=common width="500%" cellspacing="0" cellpadding="5" border="1">
		
		
		<tr>
			<td class=title0 colspan="11"><b><font size="4">包头市农电公司<%=townSataDto.getStatMonth() %>电费电量发行单</font></td>
		</tr>
		
		<!--人员代码，姓名-->
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><b><font size="4">单位</font></b></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><b><font size="4">售电量</font></b></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><b><font size="4">纯电费</font></b></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><b><font size="4">电费税</font></b></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><b><font size="4">电金</font></b></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><b><font size="4">电金税</font></b></span>
				<br></td>			
				<td nowrap width="10%">
					<span class="title"><b><font size="4">三峡</font></b></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><b><font size="4">三峡税</font></b></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><b><font size="4">基金</font></b></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><b><font size="4">基金税</font></b></span>
				<br></td>	
				<td nowrap width="10%">
					<span class="title"><b><font size="4">总计</font></b></span>
				<br></td>	
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="4"><%=townSataDto.getCompanyName() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=townSataDto.getSumPower() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=townSataDto.getPurePowerFee() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=townSataDto.getPowerFeeTax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=townSataDto.getPureDianJin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=townSataDto.getDianJinTax() %></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=townSataDto.getPureSanXia() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=townSataDto.getSanXiaTax() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=townSataDto.getPureJiJin() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=townSataDto.getJiJinTax() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="4"><%=townSataDto.getSumPowerFee() %></font></span>
				<br></td>	
							
			</tr>
		
  
    </table>
    <br>
    <table class=common width="500%" cellspacing="0" cellpadding="5" >
    <tr style="hight:60px">
    <td height="30">
    </td>
    </tr>
    </table>
		<%} %>
		
		

  
	

</form>
</body>


</html:html>
