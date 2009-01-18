<%--
*********
******************直供乡电费追加查询录入页面  
create by qiaoyouliang 2008.12.16 --%>

<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@page import="java.util.Collection"%>
<%@page import="com.elongway.pss.dto.domain.LwDcodeDto"%>
    <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
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
  
<title>直供乡追加电费查询页面</title>
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
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><font size="3"><B>直供乡追收电费查询</B></font></td>
<input type="hidden" name="firstquery" value="1" >
		</tr>

         <%Collection collection  = (Collection)request.getAttribute("collection"); %>
         
          <tr>
        <td class=title>所属乡镇</td>
		  	<td class=input><select name="townCode"  class="input">
		  	<% for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwDcodeDto o = (LwDcodeDto) iterator.next();
			%>
				  <option value=<%=o.getCodeCode() %>><%=o.getCodeCName() %></option> 
			<%} %>    
       </select>	
</td>
          <td class="title">追收电费年月：</td>		
				<td class=input>
				<input class="text" name="inputDate" style="width:120px"	id="f_date_shqqs"  size="31" onkeyPress="return pressFullDate(event)"   readonly="readonly"   />				
		<img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
					style="cursor: pointer; border: 1px solid #0083da;"
					title="Date selector"					
					onmouseover="this.style.background='#4CA8EB';"
					onmouseout="this.style.background=''" /></td>	
		
          </tr>
          </table>
          <table class=common width="100%" cellspacing="1" cellpadding="5">         
		  <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value="确  定" onClick="feeAppend();"></td>
		 
</tr>
        </table>
      
     <br />

	
	
</form>
<script language="javascript">

function feeAppend(){
alert(fm.inputDate.value);
if(fm.inputDate.value ==''){
   alert('请输入追收电费年月！'); 
   return false;
 }
	
	fm.action="<%=request.getContextPath()%>/townFeeAppendList.do";
	fm.submit();
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