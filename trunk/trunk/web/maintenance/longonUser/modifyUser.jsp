<%--
*********
******************
�޸���·��Ϣҳ��  
create by wangrongjia
200810.09
--%>
<%@ page contentType="text/html; charset=GBK" %>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerLineDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwSysUserDto"/>

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
      <form name="fm"  >
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="6"><B>�޸ĵ�½�û�</B></td>
		</tr>
		<%
		
		 LwSysUserDto  lwSysUserDto=(LwSysUserDto)request.getAttribute("sysUser");
		
		 %>
          <tr>
            <td class=title>�û�����</td>
            <td class=input><%=lwSysUserDto.getUserCode()%> </td>
<input name="userCode" type="hidden"   value="<%=lwSysUserDto.getUserCode()%>">
            <td class=title>�û���ʵ����</td>
            <td class=input><input name="userName" type="text" value="<%=lwSysUserDto.getUserName()%>" class="text" ></td>
            <td class=title >�û�Ȩ��<span class="warning">&nbsp;<img
							src="../../iacontact/images/redstar.gif" ></span></td>   
            		                            
           <td class="input" ><select name="USERGRADE"  style='width:175px'>
				  <option value="1" <%if(lwSysUserDto.getUserGrade().equals("1")){ %>selected="selected"<%} %>>ϵͳ����Ա</option>
				  <option value="2"  <%if(lwSysUserDto.getUserGrade().equals("2")){ %>selected="selected"<%} %>>��ҵ��½�û�</option>
				  <option value="3" <%if(lwSysUserDto.getUserGrade().equals("3")){ %>selected="selected"<%} %>>ֱ�����½�û�</option>
				  <option value="4"  <%if(lwSysUserDto.getUserGrade().equals("4")){ %>selected="selected"<%} %>>���۵�½�û�</option></select>	
				  </td>
            
           </tr>
           <tr>
           <td class=title>ԭ����</td>
            <td class=input><input name="oldpassword" type="password" value="" class="text" ></td>
           <td class=title>������</td>
           <td class=input><input name="newpassword" type="password" value="" class="text"></td>        
           <td class=title>ȷ��������</td>
           <td class=input><input name="confirmPwd" type="password"  value=""  class="text"></td>        
           
		  <tr>
		   <td class=title >�Ƿ���Ч<span class="warning">&nbsp;<img
							src="../../iacontact/images/redstar.gif" ></span></td>
            <td class="input" ><select name="VALIDSTATUS" style='width:175px'>
				  <option value="0"<%if(lwSysUserDto.getValidStatus().equals("1")){ %>selected="selected"<%} %>>��Ч</option>
				  <option value="1"<%if(lwSysUserDto.getValidStatus().equals("0")){ %>selected="selected"<%} %>>��Ч</option>
          </select>
            </td>
          <td class=title ></td>
           <td class=title ></td>
            <td class=title ></td>
             <td class=title ></td>
             
       </tr>
	
	</table>
		
    <br />
<!--һ��ѵİ�ť-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" �� �� " onClick="javascript:addPowerLine();"></td>
        <%--<td class=button><input name="reset" type="button" class=button value=" �� �� "></td>
        --%><td class=button><input name="back" type="button" class=button value="����" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>

</div>
<!--Button End-->
</form>
<br />
    </div>
    <!--CONTENT OVER-->
  </div>
<script language="javascript">
function addPowerLine(){

if(fm.newpassword.value != fm.confirmPwd.value){
	alert("������������벻ͬ������������");
	return false;
}
if(fm.newpassword.value ==''){
 if(!confirm('ȷ�����趨�����룿')){
 return false;
 }else{
 fm.action="/iacontact/UIEditUser.do";
 fm.submit();
 }
 }else{
 fm.action="/iacontact/UIEditUser.do";
 fm.submit();
 }
 
}
function codeQueryPT(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.ComCode.value+"&TableName=ComCode";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
</body>
</html>
