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
        <table width="100%"  border="0" >
        <tr class=listtitle align="center">
			<td class=title0 colspan="4"><B>增加用户线路对应关系</B></td>
		</tr>
          <tr>
            <td class=title>户号</td>
            <td class=input><input name="UserNo" type="text" class="text"  ><span class="warning">*</span></td><%--
            <td class=title>用户英文名称</td>
            <td class=input><input name="UserName" type="text" class="text"  ></td>
          --%>
           <td class=title>线路代码</td>
            <td class=input><input name="LineCode" type="text"  ondblclick="codeQuery(this)" class="text"
							onkeyup="codeQuery(this);" /> </td>
          </tr>
		  <tr>
		 
			  <td class=input>效力状态</td>
            <td class=input><input name="ValidStatus" type="radio" value="1" checked="checked"/>有效
                <input name="ValidStatus" type="radio" value="0" />无效<span class="warning">*</span></td>
          
            <td class=input></td>
		  <td class=input></td>
          
       </tr>
		  <tr>
		   <%--<td class=title>备注</td>
		  	<td class=input><input name="Remark" type="textfiled" class="text" value="text" ></td>
		  --%>
		  </tr>
        </table>
		
    <br />
<!--一大堆的按钮-->
   <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" 保 存 " onClick="javascript:addUserLine();"></td>
        <td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        <td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>

	
<!--Button End-->
</form>
<br />
  
<script language="javascript">
function addUserLine(){

  fm.action="/iacontact/addLWUserLine.do";
fm.submit();

}
 function codeQuery(field)
{
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.LineCode.value+"&TableName=LwPowerLine";
	alert(vURL);
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
</body>
</html>
