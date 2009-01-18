<%--
*********
******************
添加用户线路对应信息页面  
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
			<td class=title0 colspan="8"><B>增加电表指针记录</B></td>
		</tr>
          <tr>
            <td class=title>线路代码</td>
            <td class=input><input name="LineCode" type="text" class="text"  ><span class="warning">*</span></td>
            <td class=title>表号</td>
            <td class=input><input name="AmmeterNo" type="text" class="text"  ><span class="warning">*</span></td>
          </tr>
		  <tr>
		 
			 <td class=title>当月有功指针数</td>
		  	<td class=input><input name="ThisWorkNum" type="textfiled" class="text"  ><span class="warning">*</span></td>
		  	 <td class=title>当月无功指针数</td>
		  	<td class=input><input name="ThisIdleNum" type="textfiled" class="text"  ><span class="warning">*</span></td>
          
            
          
       </tr>
		
		   <tr>
		   <td class=title>录入年月</td>
            <td class=input><input name="StatMonth" type="text"  ><span class="warning">*</span></td>
		   
		  	<td class=input>
		  	<td class=input>
		  	
		  </tr>	
        </table>
		
    <br />
<!--一大堆的按钮-->
  <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td><input name="add" type="button" class="btn_add" value=" 保 存 " onClick="javascript:addUserLine();"></td><%--
        <td><input name="reset" type="reset" class="btn_del" value=" 重 置 "></td>
        --%><td><input name="back" type="button" class="btn_refresh" value="返回" onClick="javascript:history.go(-1);"></td>
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
