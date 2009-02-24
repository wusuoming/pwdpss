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

  winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
}
function   doPrintSetup(){    
  //打印设置    
  WB.ExecWB(8,1)    
  }    
  function   doPrintPreview(){    
  //打印预览    
  WB.ExecWB(7,1)    
  }    
  function   doprint(){    
  //直接打印    
  WB.ExecWB(6,6)    
  }    
</script>
</head>
<body class=interface>
<OBJECT   classid=CLSID:8856F961-340A-11D0-A96B-00C04FD705A2   height=10   id=WB   width=10></OBJECT>
<html:errors />
<%Collection billList = (Collection)request.getAttribute("billList");
String statMonth = (String)request.getAttribute("statMonth");
SysUser user = (SysUser)session.getAttribute(AppConst.SYSUSER_SESSION);%>
<form  name="fm"
	onsubmit="return validateUserQueryForm(this);" enctype="multipart/form-data">
	<table width="100%" cellspacing="0" border="0" >
		<tr class=listtitle align="center">
			<td class=title0 colspan="10"><B><font size="3"></font></B></td>
		</tr>
		<tr>
			<td class="blue" colspan="4">单位：包头市九原电力公司供电服务总站</td>
			<td class="blue" colspan="5"></td>
			<td class="blue" colspan="5"><input type="text" name="statMonth" value="<%=statMonth%>"></td>
		</tr>
		<!--人员代码，姓名-->
		<tr class=listtitle>
			<td ><span class="title">项目/单位</span> </td>
			<%if(billList!=null){ 
		for (Iterator iterator = billList.iterator(); iterator.hasNext();) {
			UITownBill dto = (UITownBill) iterator.next();
			if(!"mcx".equals(dto.getTownCode())){
			%>	
			<td width=""><span class="title"><a href="<%=request.getContextPath()%>/saveAndStat.do?townCode=<%= dto.getTownCode()%>"><font color="F9FAFB"><%=dto.getTownName() %></font></a></span></td>
			
			<%}}} %>
			
		</tr>
		<tr>
			<td class="title">电量</td>
			<%if(billList!=null){ 
		for (Iterator iterator = billList.iterator(); iterator.hasNext();) {
			UITownBill dto = (UITownBill) iterator.next();
			if(!"mcx".equals(dto.getTownCode())){
			%>	
			<td class="title"><%=dto.getPowerQuantity() %></td>
			
			<%}}} %>
			
		</tr>
	<tr>
			<td class="title">电费 </td>
			<%if(billList!=null){ 
		for (Iterator iterator = billList.iterator(); iterator.hasNext();) {
			UITownBill dto = (UITownBill) iterator.next();
			if(!"mcx".equals(dto.getTownCode())){
			%>	
			<td class="title"><%=dto.getPowerFee()%></td>
			
			<%}}} %>
			
		</tr>
	
		 <tr>
    <td  colspan="3">制表:</td>
    <td  colspan="3">审核:</td>
    <td></td>
    <td  colspan="3">负责人:</td>
  </tr>
  </table>
  <table width="100%">
  <tr >
        <td class=button><input name="add" type="button" class=button value=" 打 印 " onClick="printCount();"></td>
        
</tr>
</table>

	

</form>
</body>


</html:html>
