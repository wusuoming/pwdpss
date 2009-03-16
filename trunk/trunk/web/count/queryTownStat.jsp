<%--
*********
******************趸售查询录入页面  
create by wangrongjia
200810.13
--%>
<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@page import="java.util.Collection"%>
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
  
<title>直供乡统计</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

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
         <%String flag = (String)request.getAttribute("flag"); 
         String faXing = (String)request.getAttribute("faXing"); 
            if(flag==null){%>
			<td class=title0 colspan="7"><B>直供乡统计</B></td>
			<%}else{ %>
			<td class=title0 colspan="7"><B>直供乡购电结算单查询</B></td>
			<%} %>
		</tr>        
          <tr>
          <%if(!"1".equals(faXing)) {%>
          <td class="title">选择统计模式：
	<select name="countStyle" >
	<option value="1">按局统计</option>
	<option value="2">按电价统计</option></select></td>
	<%} %>
              <td align="center" class="title">所属供电公司：
            <%Collection list = (Collection)request.getAttribute("supplycom"); 
            LwDcodeDto lwDcodeDto1 = new LwDcodeDto();
		lwDcodeDto1.setCodeCode("sum");
		lwDcodeDto1.setCodeCName("东、青、昆、高");
		list.add(lwDcodeDto1);
          if(list!=null&&list.size()!=0){         
          %>
        <select name="company" >
         <option value="">全部</option>		
         <%for(Iterator it = list.iterator();it.hasNext();) {
         	LwDcodeDto lwDcodeDto = (LwDcodeDto)it.next(); 	
         	String code = lwDcodeDto.getCodeCode();
         	String name = lwDcodeDto.getCodeCName();
         %>
				  <option value=<%=code %>><%=name %></option>		
         
              <%}} %>
                   </select>	
                   </td>
          <td align="center"  class="title">统计年月：
				<input class="title" name="inputDate"	id="f_date_shqqs"  size="31" onkeyPress="return pressFullDate(event)"   onblur="checkFullDate(this);" readonly="readonly" 
						value="<% out.println(formatter.format(currentDate));%>"   />			
				 <img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
					style="cursor: pointer; border: 1px solid #0083da;"
					title="Date selector"					
					onmouseover="this.style.background='#4CA8EB';"
					onmouseout="this.style.background=''" />
					&nbsp;<img src="../images/redstar.gif" >	
					</td>	
          </tr>
        </table>
      <table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<%if(flag==null){%>
			<td class=button align="center"><input type=button class=button name=button0 value=" 统  计 " onClick="javascript:wholeSaleSerch();"></td>
			<%}else{ %>
			<td class=button align="center"><input type=button class=button name=button0 value=" 查  询 " onClick="Search();"></td>
			<td class=button align="center"><input type=button class=button name=button0 value=" 录  入 " onClick="input();"></td>
			<%} %>
	</table>
</form>
<script language="javascript">
function wholeSaleSerch(){
if(fm.inputDate.value ==''){
   alert('请输入统计日期'); 
   return false;
 }else{
	fm.action="/iacontact/queryTownStat.do?";
	fm.submit();
	}
}

function Search(){
if(fm.inputDate.value ==''){
   alert('请输入查询日期'); 
   return false;
 }else{
	fm.action="/iacontact/queryTownFaxing.do?firstquery=query";
	fm.submit();
	}
}

function input(){
if(fm.inputDate.value ==''){
   alert('请输入查询日期'); 
   return false;
 }else{
	fm.action="/iacontact/queryTownFaxing.do?";
	fm.submit();
	}
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
</script>
<br />
  

</body>
</html>
</html:html>