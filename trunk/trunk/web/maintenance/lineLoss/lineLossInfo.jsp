
<%--
*********
******************
添加变压器信息页面  
create by wangrongjia
200810.09
--%>
<%@ page language="java" contentType="text/html; charset=GBk"
	pageEncoding="GBk"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.TransforDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LineLossDto"/>

<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
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


  
<title></title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<html>
<head>



<!--自动下拉列表JS2-->

</head>
<body id="all_title">
  
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    
      <form name="fm" method="post">
        <table id="table_userMain" width="1050" border="0">
         <tr class=listtitle align="center">
			<td class=title0 colspan="10"><B>线损信息</B></td>
		</tr>
		<%
			LineLossDto  lineLossDto=(LineLossDto)request.getAttribute("lineLossDto");
		 %>
          <tr>
            <td class=title>线路名称</td>
            <td class=input><input type="text" readOnly=true name="LineCode" value="<%=lineLossDto.getLineCode()%>" type="text" class="text"></td>
           <td class=title>线路电阻值</td>
            <td class=input><input name="R" readOnly=true type="text" value="<%=lineLossDto.getR()%>" class="text"></td>
         <td class=title>线路长度（KM）</td>
            <td class=input><input name="lineLong" readOnly=true type="text" class="text" value="<%=lineLossDto.getLineLong()%>"></td>
          </tr>
		  <tr>
		    
		  <td class=title>额定电压（KV）</td>
            <td class=input><input name="volt" readOnly=true type="text" value="<%=lineLossDto.getVolt()%>" class="text"></td>
            
          <td class=title>用电时间（小时）</td>
            <td class=input><input name="t" readOnly=true type="text"  class="text" value="<%=lineLossDto.getT()%>"></td>
            <td class=input>
            <td class=input>
       </tr>
        </table>
         <br />

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>
<!--Button End-->
</form>
<br />
  
<script language="javascript">

</script>
</body>
</html>
