<%--
*********
******************
����û���·��Ӧ��Ϣҳ��  
create by wangrongjia
200810.09
--%>

<%@ page contentType="text/html; charset=GBK" %>




  
<title></title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<html>
<head>

</head>
<body id="all_title">
  <div id="container">
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    <div id="content">
      <form name="fm" style="display:block;">
        <table id="table_userMain" class="fix_table" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>���ӵ��ָ���¼</B></td>
		</tr>
          <tr>
            <td class=title>��·����</td>
            <td class=input><input name="LineCode" type="text" class="text"  ><span class="warning">*</span></td>
            <td class=title>���</td>
            <td class=input><input name="AmmeterNo" type="text" class="text"  ><span class="warning">*</span></td>
          </tr>
		  <tr>
		 
			 <td class=title>�����й�ָ����</td>
		  	<td class=input><input name="ThisWorkNum" type="textfiled" class="text"  ><span class="warning">*</span></td>
		  	 <td class=title>�����޹�ָ����</td>
		  	<td class=input><input name="ThisIdleNum" type="textfiled" class="text"  ><span class="warning">*</span></td>
          
            
          
       </tr>
		
		   <tr>
		   <td class=title>¼������</td>
            <td class=input><input name="StatMonth" type="text"  ><span class="warning">*</span></td>
		   
		  	<td class=input>
		  	<td class=input>
		  	
		  </tr>	
        </table>
		
    <br />
<!--һ��ѵİ�ť-->
  <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td><input name="add" type="button" class="btn_add" value=" �� �� " onClick="javascript:addUserLine();"></td><%--
        <td><input name="reset" type="reset" class="btn_del" value=" �� �� "></td>
        --%><td><input name="back" type="button" class="btn_refresh" value="����" onClick="javascript:history.go(-1);"></td>
     </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function addUserLine(){

 fm.action="/iacontact/addLWindicator.do";
fm.submit();
 
}
</script>
</body>
</html>
