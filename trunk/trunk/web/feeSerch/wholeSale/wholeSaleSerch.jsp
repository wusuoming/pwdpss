<%--
*********
******************趸售查询录入页面  
create by wangrongjia
200810.13
--%>

<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
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
<html:html xhtml="true" locale="true">
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<title>趸售查询页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>趸售查询页面</title>
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
<body class=interface>
    <!--CONTENT BEGIN-->
      <form name="fm" method="post" style="display:block;">
        <table class=common width="100%" cellspacing="1" cellpadding="5" border=0>
        <tr class=listtitle align="center">
			<td class=title0 colspan="9"><B>录入趸售查询所需信息</B></td>
		</tr>
          <tr>
               <td class="title">查询方式：</td>	
         <td class="input"><select name="serchStyle" onchange="serchtype()">
				   <option value="cpy">按局查询</option>
				  <option value="line">按线路查询</option>
              </select></td>
          <td class="title">录入年月：</td>				
				<td class=input>
				<input styleClass="text" name="inputDate"	id="f_date_shqqs"  size="31" onkeyPress="return pressFullDate(event)"   onblur="checkFullDate(this);" readonly="readonly" value="<% out.println(formatter.format(currentDate));%>"    />				
				</td>
				<td> <img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
					style="cursor: pointer; border: 1px solid #0083da;"
					title="Date selector"					
					onmouseover="this.style.background='#4CA8EB';"
					onmouseout="this.style.background=''" /><span class="warning">&nbsp;<img src="../../images/redstar.gif" > </span></td>	
          <td style="display:none;"><input styleClass="text" name="powerClass" type="text" value="2" ></td>
          <td class="title" id="a1">趸售公司：</td>	
         <td class="input" id="a2"><select name="company" >
				  <option value="gy">固阳</option>
				  <option value="dm">达茂</option>
				  <option value="ty">土佑</option>
				   <option value="jy">九原</option>
              </select></td>
          	 <td class="title" id="a3" style="display: none">线路名称</td>
            <td class=input id="a4" style="display: none"><input  name="wholeSaleName" type="text" class="codecode" ondblclick="codeQueryLine(this)"
							onkeyup="codeQueryLine(this)" class="codecode"><span class="warning"></span></td>	
          <td class=input>
           <td class=input>
          </tr>
		  <tr><td colspan=7 align="center"><input class=button name="serch" type="button"  value=" 查询 " onClick="javascript:wholeSaleSerch();"></td>
</tr>
        </table>
     <br />
</form>
<script language="javascript">
function wholeSaleSerch(){
 if(fm.inputDate.value ==''){
   alert('录入结算的日期！'); 
   return false;
 }
	if(fm.serchStyle.value=='line'){
	fm.action="/iacontact/wholeSaleFeeSerch.do";
	}
	if(fm.serchStyle.value=='cpy'){
	fm.action="/iacontact/serchAllLine.do";
	}
	fm.submit();
}
function serchtype(){
if(fm.serchStyle.value=='cpy'){
a1.style.display="";
a2.style.display="";
a3.style.display="none";
a4.style.display="none";
}
if(fm.serchStyle.value=='line'){
a1.style.display="none";
a2.style.display="none";
a3.style.display="";
a4.style.display="";
}
}
Calendar.setup({
        inputField     :    "f_date_shqqs",     // id of the input field
        button         :    "f_trigger_shqqs",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    }); 
  function codeQueryLine(field)
{
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.wholeSaleName.value+"&TableName=wholeSaleName";
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
<br />
</body>
</html>
</html:html>