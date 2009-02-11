<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.ui.control.common.pub.SysUser"%>
<%@page import="com.elongway.pss.util.AppConst"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>直供乡电费结算单</title>
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
String statMonth = (String)request.getAttribute("statMonth");
SysUser user = (SysUser)session.getAttribute(AppConst.SYSUSER_SESSION);%>
<form  name="fm"
	onsubmit="return validateUserQueryForm(this);" enctype="multipart/form-data">
	<table width="100%" border="1" cellspacing="0">
		<tr class=listtitle align="center">
			<td class=title0 colspan="11"><B><font size="3">直供乡电费结算单</font></B></td>
		</tr>
		<tr>
			<td class="blue" colspan="4"><font size="3">单位：包头市九原电力公司供电服务总站</font></td>
			<td class="blue" colspan="5"></td>
			<td class="blue" colspan="2"><input type="text" name="statMonth"    value="<%=statMonth%>"  style="border:0"></td>
		</tr>
		<!--人员代码，姓名-->
		<tr class=listtitle>
			<td ><span class="title"><font size="3">项目/单位</font></span> </td>
			<%if(billList!=null){ 
		for (Iterator iterator = billList.iterator(); iterator.hasNext();) {
			UITownBill dto = (UITownBill) iterator.next();
			%>	
			<td width=""><span class="title"><a href="<%=request.getContextPath()%>/saveAndStat.do?townCode=<%= dto.getTownCode()%>"><font color="F9FAFB" size="3"><%=dto.getTownName() %></font></a></span></td>
			
			<%}} %>
			
		</tr>
		<tr>
			<td class="title"><font size="3">电量</font></td>
			<%if(billList!=null){ 
		for (Iterator iterator = billList.iterator(); iterator.hasNext();) {
			UITownBill dto = (UITownBill) iterator.next();
			
			%>	
			<td class="title"><font size="3"><%=dto.getPowerQuantity() %></font></td>
			
			<%}} %>
			
		</tr>
	<tr>
			<td class="title"><font size="3">电费</font> </td>
			<%if(billList!=null){ 
		for (Iterator iterator = billList.iterator(); iterator.hasNext();) {
			UITownBill dto = (UITownBill) iterator.next();
			
			%>	
			<td class="title"><font size="3"><%=dto.getPowerFee()%></font></td>
			
			<%}} %>
			
		</tr>
	
		 <tr>
    <td  colspan="4"><font size="3">制表:</font></td>
    <td  colspan="4"><font size="3">审核:</font></td>
    <td  colspan="3"><font size="3">负责人:</font></td>
  </tr>
  
</table>

	

</form>
</body>


</html:html>
