
<%--
*********
******************
��ӱ�ѹ����Ϣҳ��  
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



<!--�Զ������б�JS2-->

</head>
<body id="all_title">
  
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    
      <form name="fm" method="post">
        <table id="table_userMain" width="1050" border="0">
         <tr class=listtitle align="center">
			<td class=title0 colspan="10"><B>���ӱ��վ��Ϣ</B></td>
		</tr>
          <tr>
            <td class=title>��·����</td>
            <td class=input><input name="transforName" type="text" class="text">&nbsp;<img
							src="../../images/redstar.gif" ></td>
           <td class=title>�绰</td>
            <td class=input><input name="phone" type="text" class="text"></td>
            <td class=title>��ѹ���������(KW)</td>
            <td class=input><input name="kongzaiLoss" type="text" class="text"></td>
          </tr>
		  <tr>
		     
		  <td class=title>��·�迹(KW)</td>
            <td class=input><input name="duanluLoss" type="text" class="text"></td>
            <td class=title>�����(KV)</td>
            <td class=input><input name="contentPower" type="text"  class="text"></td>
            <td class=title>�õ�ʱ��(Сʱ)</td>
            <td class=input><input name="useHour" type="text"  class="text"></td>
          
       </tr>
        <tr>
       		<td class=title>���ص���</td>
            <td class=input><input name="kongzaiCT" type="text"  class="text"></td>
            <td class=title>��·��ѹ</td>
            <td class=input><input name="duanluPT" type="text"  class="text"></td>
            <td class=title>��������ʱ��(Сʱ)</td>
            <td class=input><input name="suplyHour" type="text"  class="text"></td>
       </tr>
       
		  
        </table>
         

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" �� �� " onClick="addTransfor();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" �� �� "></td>
        --%><td class=button><input name="back" type="button" class=button value="����" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function addTransfor(){

if(fm.transforName.value==""){
	alert("��������·���ƣ�");
	return;
}
if(fm.phone.value==""){
	alert("������绰��Ϣ��");
	return;
}
if(fm.kongzaiLoss.value==""){
	alert("�������ѹ��������ģ�");
	return;
}else if(isNaN(fm.kongzaiLoss.value)){
	alert("��ѹ��������ģ����������֣�");
	return;
}
if(fm.duanluLoss.value==""){
	alert("�������·�迹��");
	return;
}else if(isNaN(fm.duanluLoss.value)){
	alert("��·�迹�����������֣�");
	return;
}
if(fm.contentPower.value==""){
	alert("������������");
	return;
}else if(isNaN(fm.contentPower.value)){
	alert("�����,���������֣�");
	return;
}
 if(fm.useHour.value==""){
 	alert("�������õ�ʱ�䣡");
 	return;
 }else if(isNaN(fm.useHour.value)){
 	alert("�õ�ʱ�䣬���������֣�");
 	return;
 }
 if(fm.kongzaiCT.value==""){
 	alert("��������ص�����");
 	return;
 }else if(isNaN(fm.kongzaiCT.value)){
 	alert("���ص��������������֣�");
 	return;
 }
 if(fm.duanluPT.value==""){
 	alert("�������·��ѹ��");
 	return;
 }else if(isNaN(fm.duanluPT.value)){
 	alert("��·��ѹ,���������֣�");
 	return;
 }
 if(fm.suplyHour.value==""){
 	alert("��������������ʱ�䣡");
 	return;
 }else if(isNaN(fm.suplyHour.value)){
 	alert("��������ʱ��,���������֣�");
 	return;
 }
 fm.action="/iacontact/addTransfor.do";
fm.submit();
 
}


</script>
</body>
</html>
