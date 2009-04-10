<%--
*********
******************
大工业查询录入页面  
create by wangrongjia
200810.13
--%>

<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
    <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%> 
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html:html xhtml="true" locale="true">
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<%
	// 当前日期
	Date currentDate = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
	

	
%>
<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
	<!-- calendar stylesheet -->
  <link rel="stylesheet" type="text/css" media="all" href="../../../../iacontact/css/calendar-win2k-cold-1.css" title="win2k-cold-1" />

  <!-- main calendar program -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar.js"></script>

  <!-- language for the calendar -->

  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-cn-utf8.js"></script>

  <!-- the following script defines the Calendar.setup helper function, which makes
       adding a calendar a matter of 1 or 2 lines of code. -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-setup.js"></script>
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>大工业统计页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>大工业统计页面</title>
<app:css />
<html:base />
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

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
</head>

<body class=interface onload="changeF();">
    <!--CONTENT BEGIN-->
      <form name="fm" method="post">
        <table class=common width="100%" cellspacing="0" cellpadding="5" border=0>
        <tr class=listtitle align="center">
			<td class=title0 colspan="9"><B>大工业统计</B></td>
		</tr>
          <tr>
            <td class="title">选择统计模式</td>
	<td class="title"  align="center"><select name="countStyle" onchange="changeF()"><option value="1">按厂统计</option><option value="2">按电价统计</option></select></td>
         <td class="title">录入年月：</td>				
				<td class=input>
				<input styleClass="text" name="inputDate"	id="f_date_shqqs"  size="31" onkeyPress="return pressFullDate(event)"   onblur="checkFullDate(this);" readonly="readonly" value="<% out.println(formatter.format(currentDate));%>" />				
				<td> <img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
					style="cursor: pointer; border: 1px solid #0083da;"
					title="Date selector"					
					onmouseover="this.style.background='#4CA8EB';"
					onmouseout="this.style.background=''" /></td>	
          <td style="display:none;"><input styleClass="text" name="powerClass" type="text" value="2" ></td>
             <td class="title" id="a" style="display: ">大工业选择</td>
             <td class=input id="b" style="display: "><input  name="corporationName" type="text" class="codecode" ondblclick="codeQueryLine(this)"
							onkeyup="codeQueryLine(this)" class="codecode"></td>
			<td class=input id="c" style="display: ">
				  <td class=input id="d" style="display: ">
			</tr>
		  <tr><td colspan="7" align="center"><input class=button name="serch" type="button"  value=" 统计 " onClick="javascript:corporationFeeCount();"></td>
</tr>
        </table>
     <br />
</form>
<script language="javascript"> 
function corporationFeeCount(){
if(fm.inputDate.value ==''){
   alert('请输入日期！'); 
   return false;
 }
 if(fm.countStyle.value =='1'){
 if(fm.corporationName.value ==''){
   alert('请选择大工业！'); 
   return false;
   }
 }
 if(fm.countStyle.value =='1'){
	fm.action="/iacontact/corporationCount.do";
	}
	 if(fm.countStyle.value =='2'){
	fm.action="/iacontact/corporationPriceCount.do";
	}
	fm.submit();
}
Calendar.setup({
        inputField     :    "f_date_shqqs",     // id of the input field
        button         :    "f_trigger_shqqs",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    }); 
function changeF(){
if(fm.countStyle.value=="1"){
a.style.display="";
b.style.display="";
c.style.display="";
d.style.display="";
}
if(fm.countStyle.value=="2"){
a.style.display="none";
b.style.display="none";
c.style.display="none";
d.style.display="none";
}
}
function codeQueryLine(field)
{
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.corporationName.value+"&TableName=corporationName";
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
<br />
</body>
</html>
</html:html>