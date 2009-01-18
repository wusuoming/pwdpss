
<%--
*********
******************
添加变压器信息页面  
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
			<td class=title0 colspan="10"><B>增加变电站信息</B></td>
		</tr>
          <tr>
            <td class=title>线路名称</td>
            <td class=input><input name="transforName" type="text" class="text">&nbsp;<img
							src="../../images/redstar.gif" ></td>
           <td class=title>电话</td>
            <td class=input><input name="phone" type="text" class="text"></td>
            <td class=title>变压器空载损耗(KW)</td>
            <td class=input><input name="kongzaiLoss" type="text" class="text"></td>
          </tr>
		  <tr>
		     
		  <td class=title>短路阻抗(KW)</td>
            <td class=input><input name="duanluLoss" type="text" class="text"></td>
            <td class=title>额定容量(KV)</td>
            <td class=input><input name="contentPower" type="text"  class="text"></td>
            <td class=title>用电时间(小时)</td>
            <td class=input><input name="useHour" type="text"  class="text"></td>
          
       </tr>
        <tr>
       		<td class=title>空载电流</td>
            <td class=input><input name="kongzaiCT" type="text"  class="text"></td>
            <td class=title>短路电压</td>
            <td class=input><input name="duanluPT" type="text"  class="text"></td>
            <td class=title>连续供电时间(小时)</td>
            <td class=input><input name="suplyHour" type="text"  class="text"></td>
       </tr>
       
		  
        </table>
         

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

if(fm.transforName.value==""){
	alert("请输入线路名称！");
	return;
}
if(fm.phone.value==""){
	alert("请输入电话信息！");
	return;
}
if(fm.kongzaiLoss.value==""){
	alert("请输入变压器空载损耗！");
	return;
}else if(isNaN(fm.kongzaiLoss.value)){
	alert("变压器空载损耗，请输入数字！");
	return;
}
if(fm.duanluLoss.value==""){
	alert("请输入短路阻抗！");
	return;
}else if(isNaN(fm.duanluLoss.value)){
	alert("短路阻抗，请输入数字！");
	return;
}
if(fm.contentPower.value==""){
	alert("请输入额定容量！");
	return;
}else if(isNaN(fm.contentPower.value)){
	alert("额定容量,请输入数字！");
	return;
}
 if(fm.useHour.value==""){
 	alert("请输入用电时间！");
 	return;
 }else if(isNaN(fm.useHour.value)){
 	alert("用电时间，请输入数字！");
 	return;
 }
 if(fm.kongzaiCT.value==""){
 	alert("请输入空载电流！");
 	return;
 }else if(isNaN(fm.kongzaiCT.value)){
 	alert("空载电流，请输入数字！");
 	return;
 }
 if(fm.duanluPT.value==""){
 	alert("请输入短路电压！");
 	return;
 }else if(isNaN(fm.duanluPT.value)){
 	alert("短路电压,请输入数字！");
 	return;
 }
 if(fm.suplyHour.value==""){
 	alert("请输入连续供电时间！");
 	return;
 }else if(isNaN(fm.suplyHour.value)){
 	alert("连续供电时间,请输入数字！");
 	return;
 }
 fm.action="/iacontact/addTransfor.do";
fm.submit();
 
}


</script>
</body>
</html>
