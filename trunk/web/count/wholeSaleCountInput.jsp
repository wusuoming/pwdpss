<%--
*********
******************趸售查询录入页面  
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

<body class=interface  onload="javascript:sexy();">
    <!--CONTENT BEGIN-->
      <form name="fm" method="post" style="display:block;">
        <table class=common width="100%" cellspacing="0" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>趸售统计</B></td>
		</tr>
          <tr>
           <td class="title">趸售统计：</td>	
           <td class="input"><select name="wholesaleStyle" onchange="sexy()">
				   <option value="3">按局统计</option>
				     <option value="2">按电价统计</option>
				 
              </select>	
           <td class="title" id="s1">选择：</td>	 
           <td class="input" id="d1"><select name="counttype" >
				  <option value="1">当月统计</option>
				  <option value="2">累加统计</option>
              </select>	
           </td>
           <td class="title" id="s">趸售公司：</td>	
         <td class="input" id="d"><select name="company" >
				  <option value="gy">固阳</option>
				  <option value="dm">达茂</option>
				  <option value="ty">土佑</option>
				   <option value="jy">九原</option>
              </select>
              </td>
           <td class="title">录入年月：</td>				
				<td class=input>
				<input styleClass="text" name="inputDate"	id="f_date_shqqs"  size="31" onkeyPress="return pressFullDate(event)"   onblur="checkFullDate(this);" readonly="readonly" value="<% out.println(formatter.format(currentDate));%>"   />				
			
				<td class="title"> <img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
					style="cursor: pointer; border: 1px solid #0083da;"
					title="Date selector"					
					onmouseover="this.style.background='#4CA8EB';"
					onmouseout="this.style.background=''" /></td>	
                <td style="display:none;"><input styleClass="text" name="powerClass" type="text" value="2" ></td>
          </tr>
		  <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" 统计 " onClick="javascript:wholeSaleSerch();"></td>	 
          </tr>
        </table>
      
     <br />

	
	
</form>
<script language="javascript">

function wholeSaleSerch(){
if(fm.inputDate.value ==''){
   alert('请输入日期！'); 
   return false;
 }
	//if(fm.wholesaleStyle.value=='1'){
	//fm.action="/iacontact/UIPriceCountAction.do";
	//}
	if(fm.wholesaleStyle.value=='3'){
	fm.action="/iacontact/wholeSaleCount.do";
	}
	
	if(fm.wholesaleStyle.value=='2'){
	fm.action="/iacontact/UIEveryWholeSaleCountAction.do";
	}
	fm.submit();
	
	
	
	
}
function sexy(){

if(fm.wholesaleStyle.value=='3'){
	s.style.display="";
	d.style.display="";
	s1.style.display="none";
	d1.style.display="none";
}
if(fm.wholesaleStyle.value=='2'){
	s.style.display="none";
	d.style.display="none";
	s1.style.display="";
	d1.style.display="";
}
}

Calendar.setup({
        inputField     :    "f_date_shqqs",     // id of the input field
        button         :    "f_trigger_shqqs",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    }); 

</script>
<br />
</body>
</html>
</html:html>