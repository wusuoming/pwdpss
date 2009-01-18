
<%--
*********
******************
添加线损信息页面  
create by wangrongjia
200810.09
--%>
<%@ page language="java" contentType="text/html; charset=GBk"
	pageEncoding="GBk"%>

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
			<td class=title0 colspan="10"><B>增加线损信息</B></td>
		</tr>
          <tr>
            <td class=title>线路名称</td>

            <td class=input><input name="LineCode" type="text" class="text">&nbsp;<img
							src="../../images/redstar.gif" ></td>
           <td class=title>线路电阻值</td>
            <td class=input><input name="R" type="text" class="text"></td>
             <td class=title>线路长度(KM)</td>
            <td class=input><input name="lineLong" type="text" class="text"></td>
          </tr>
		  <tr>
		    
		  <td class=title>额定电压(KV)</td>
            <td class=input><input name="volt" type="text" class="text"></td>
            <td class=title>用电时间(小时)</td>
            <td class=input><input name="t" type="text"  class="text"></td>
            <td class=title></td>
            <td class=title></td>
       </tr>
		 
        </table>
         <br/>

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" 保 存 " onClick="addTransfor();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        --%><td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>
<!--Button End-->
</form>
<br />
<script language="javascript">
function addTransfor(){

if(fm.LineCode.value==""){
	alert("请输入线路名称！");
	return;
}
if(fm.R.value==""){
	alert("请输入线路电阻值!");
	return;
}else if(isNaN(fm.R.value)){
	alert("线路电阻值,请输入数字！");
	return;
}
if(fm.lineLong.value==""){
	alert("请输入线路长度!");
	return;
}else if(isNaN(fm.lineLong.value)){
	alert("线路长度,请输入数字!");
	return;
}
if(fm.volt.value==""){
	alert("请输入额定电压!");
	return;
}else if(isNaN(fm.volt.value)){
	alert("额定电压,请输入数字!");
	return;
}
if(fm.t.value==""){
	alert("请输入用电时间!");
	return;
}else if(isNaN(fm.t.value)){
	alert("用电时间,请输入数字!");
	return;
}
 fm.action="/iacontact/addLineLoss.do";
fm.submit();
}
</script>
</body>
</html>
