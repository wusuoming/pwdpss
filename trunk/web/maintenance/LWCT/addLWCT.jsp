
<%--
*********
******************
添加用户信息页面  
create by wangrongjia
200810.09
--%>
<%@ page contentType="text/html; charset=GBK" %>




  
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
    
      <form name="fm" style="display:block;">
         <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="4"><B>增加电压互感器</B></td>
		</tr>
          <tr>
            <td class=title>型式</td>
            <td class=input><input name="Modus" type="text" class="text"><span class="warning">*</span></td>
            <td class=title>电压比</td>
            <td class=input><input name="CT" type="text"  class="text" ></td>
          </tr>
		  <tr>
		  <td class=title>厂名</td>
            <td class=input><input name="FactoryName" type="text"  class="text"></td>
			
           <td class=title>精度</td>
		  	<td class=input><input name="Exact" type="textfiled" class="text" ></td>
            
          
       </tr>
		 
           

		  <tr>
		  	<td class=title>倍率</td>
		  	<td class=input><input name="CTRate" type="textfiled" class="text" ><span class="warning">*</span></td>
		  <td class=title>厂号A</td>
		  	<td class=input><input name="FctoryCodeA" type="textfiled" class="text" ></td>
		  	
      </tr>
           
  
		  <tr>
		  <td class=title>厂号B</td>
		  	<td class=input><input name="FctoryCodeB" type="textfiled" class="text" ></td>
		  <td class=title>厂号C</td>
		  	<td class=input><input name="FctoryCodeC" type="textfiled" class="text" ></td>
		  	
      </tr>
		  <tr>
		  <td class=title>录入日期</td>
		  	<td class=input><input name="ImportDate" type="textfiled" class="text" ><span class="warning">*</span></td>
		  <td class=title>效力状态</td>
            <td class=input><input name="ValidStatus" type="radio" value="1" checked="checked"/>有效
                <input name="ValidStatus" type="radio" value="0"/>无效</td>
		  </tr>
        </table>
		
    <br />
<!--一大堆的按钮-->

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" 保 存 " onClick="javascript:addPowerUser();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        --%><td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function addPowerUser(){
if(fm.Modus.value == ""){
		  alert("型式不能为空！");
		  fm.Modus.focus();
		  return false;
		}
if(fm.CTRate.value == ""){
		  alert("倍率不能为空！");
		  fm.CTRate.focus();
		  return false;
		}
		if(fm.ImportDate.value == ""){
		  alert("录入日期不能为空！");
		  fm.ImportDate.focus();
		  return false;
		}		
	
 fm.action="/iacontact/addLWCT.do";
 fm.submit();

 
}
function industryType1(){

if(fm.industry.value== "1"){
 
 aaa.style.display = "none"; 
 bbb.style.display = "none";
}
 if(fm.industry.value== "0"){
 aaa.style.display = ""; 
 bbb.style.display = "";
}
}
 function codeQuery(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.LineCode.value+"&TableName=LwPowerLine1";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
function hasEmtyModus(){

if(fm.Modus.value==""||fm.Modus.value==null){
	alert("型式不能为空");
	
	return false;
}
else{
	return true;
}
}
function hasEmtyPCRate(){
if(fm.PCRate.value==""||fm.CTRate.value==null){
	alert("倍率不能为空");

	return false;
}else{
	return true;
}
}
function hasEmtyImportDate(){
if(fm.ImportDate.value==""||fm.ImportDate.value==null){
	alert("录入日期不能为空");

	return false;
}else{
	return true;
}


}
</script>
</body>
</html>
