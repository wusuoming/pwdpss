<%--
*********
******************
添加线路信息页面  
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
			<td class=title0 colspan="4"><B>增加登陆用户</B></td>
		</tr>
          <tr>
            <td class=title>登陆名</td>
            <td class=input><input name="USERCODE" type="text" class="text"  ><span class="warning">*</span></td>
            <td class=title>用户名称</td>
            <td class=input><input name="USERNAME" type="text"  class="text"></td>
            
		  
		  </tr>
		   <tr>
            <td class=title>密码</td>
            <td class=input><input name="PASSWORD" type="password" class="text"  ><span class="warning">*</span></td>
            <td class=title>确认密码</td>
            <td class=input><input name="PASSWORD1" type="password"  class="text"></td>
            
		  
		  </tr>
		  
		  <tr>
           <td class=title >用户权限<span class="warning"></span></td>
           
            
            <td class="input" ><select name="USERGRADE" >
				  <option value="1">系统管理员</option>
				  <option value="2">大工业登陆用户</option>
				  <option value="3">直供乡登陆用户</option>
				  <option value="4">趸售登陆用户</option></select>	
            
		  <td class=title >是否有效<span class="warning">*</span></td>
           
            
            <td class="input" ><select name="VALIDSTATUS" >
				  <option value="1">有效</option>
				  <option value="0">无效</option>
				 
		  </tr>
		    
       </table>
		
    <br />
<!--一大堆的按钮-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" 保 存 " onClick="javascript:addUser();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        --%><td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
   
    <!--CONTENT OVER-->
 

<script language="javascript">
function addUser(){
if(fm.USERCODE.value==""||fm.USERCODE.value==null){
	alert("登陆名不能为空");
	return false;
}
if(fm.PASSWORD.value==""||fm.PASSWORD.value==null){
	alert("密码不能为空");
	return false;
}
if(fm.PASSWORD.value != fm.PASSWORD1.value){
	alert("两次输入的密码不同，请重新输入");
	return false;
	}
fm.action="/iacontact/UIAddUserAction.do";
fm.submit();
 
 
 }
function isEmpty(){
 if(fm.LineCode.value==""||fm.LineCode.value==null){
   alert("输电线路不能为空");
   return false;
   }
 if(fm.ComCode.value==""||fm.ComCode.value==null){
 	
   alert("所属公司不能为空");
   return false;
   }
}

</script>

</body>

</html>
