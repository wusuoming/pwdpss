<%--
*********
******************
�����·��Ϣҳ��  
create by wangrongjia
200810.09
--%>
<%@ page contentType="text/html; charset=GBK" pageEncoding="GBK" %>




  
<title></title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<html>
<body id="all_title">
 
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
   
 <form   name="fm"  action="">
        <table id="table_userMain" class="fix_table" border="0"  width="100%">
        <tr class=listtitle align="center">
			<td class=title0 colspan="4"><B>���ӵ�½�û�</B></td>
		</tr>
          <tr>
            <td class=title>��½��</td>
            <td class=input><input name="USERCODE" type="text" class="text"  ><span class="warning">*</span></td>
            <td class=title>�û�����</td>
            <td class=input><input name="USERNAME" type="text"  class="text"></td>
            
		  
		  </tr>
		   <tr>
            <td class=title>����</td>
            <td class=input><input name="PASSWORD" type="password" class="text"  ><span class="warning">*</span></td>
            <td class=title>ȷ������</td>
            <td class=input><input name="PASSWORD1" type="password"  class="text"></td>
            
		  
		  </tr>
		  
		  <tr>
           <td class=title >�û�Ȩ��<span class="warning"></span></td>
           
            
            <td class="input" ><select name="USERGRADE" >
				  <option value="1">ϵͳ����Ա</option>
				  <option value="2">��ҵ��½�û�</option>
				  <option value="3">ֱ�����½�û�</option>
				  <option value="4">���۵�½�û�</option></select>	
            
		  <td class=title >�Ƿ���Ч<span class="warning">*</span></td>
           
            
            <td class="input" ><select name="VALIDSTATUS" >
				  <option value="1">��Ч</option>
				  <option value="0">��Ч</option>
				 
		  </tr>
		    
       </table>
		
    <br />
<!--һ��ѵİ�ť-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" �� �� " onClick="javascript:addUser();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" �� �� "></td>
        --%><td class=button><input name="back" type="button" class=button value="����" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
   
    <!--CONTENT OVER-->
 

<script language="javascript">
function addUser(){
if(fm.USERCODE.value==""||fm.USERCODE.value==null){
	alert("��½������Ϊ��");
	return false;
}
if(fm.PASSWORD.value==""||fm.PASSWORD.value==null){
	alert("���벻��Ϊ��");
	return false;
}
if(fm.PASSWORD.value != fm.PASSWORD1.value){
	alert("������������벻ͬ������������");
	return false;
	}
fm.action="/iacontact/UIAddUserAction.do";
fm.submit();
 
 
 }
function isEmpty(){
 if(fm.LineCode.value==""||fm.LineCode.value==null){
   alert("�����·����Ϊ��");
   return false;
   }
 if(fm.ComCode.value==""||fm.ComCode.value==null){
 	
   alert("������˾����Ϊ��");
   return false;
   }
}

</script>

</body>

</html>
