
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
			<td class=title0 colspan="10"><B>增加变电站信息</B></td>
		</tr>
		<%
			TransforDto  transforDto=(TransforDto)request.getAttribute("transforDto");
		 %>
          <tr>
            <td class=title>线路名称</td>
            <td class=input ><input type="text" name="transforName" class="text" readOnly=true value="<%=transforDto.getTransforName() %>"></td>
           <td class=title>电话</td>
            <td class=input><input name="phone" type="text" readOnly=true class="text" value="<%=transforDto.getPhone()%>"></td>
          <td class=title>变压器空载损耗(KW)</td>
            <td class=input><input name="kongzaiLoss" readOnly=true type="text" class="text" value="<%=transforDto.getKongzaiLoss()%>"></td>
          </tr>
		  <tr>
		    
		  <td class=title>短路阻抗(KW)</td>
            <td class=input><input name="duanluLoss" type="text" readOnly=true class="text" value="<%=transforDto.getDuanluLoss()%>"></td>
            
          <td class=title>额定容量(KV)</td>
            <td class=input><input name="contentPower" type="text" readOnly=true class="text" value="<%=transforDto.getContentPower()%>"></td>
            <td class=title>用电时间(小时)</td>
            <td class=input><input name="useHour" type="text" readOnly=true class="text" value="<%=transforDto.getUseHour()%>"></td>
       </tr>
        <tr>
       		<td class=title>空载电流</td>
            <td class=input><input name="kongzaiCT" type="text" readOnly=true class="text" value="<%=transforDto.getKongzaiCT()%>"></td>
            <td class=title>短路电压</td>
            <td class=input><input name="duanluPT" type="text" readOnly=true class="text" value="<%=transforDto.getDuanluPT()%>"></td>
       <td class=title>连续供电时间(小时)</td>
            <td class=input><input name="suplyHour" type="text" readOnly=true class="text" value="<%=transforDto.getSuplyHour()%>"></td>
            
       </tr>
        </table>
         

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
