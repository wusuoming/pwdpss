
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
			<td class=title0 colspan="4"><B>配置电路信息</B></td>
		</tr>
          <tr>
            <td class=title>线路代码</td>
            <td class=input><input name="LineCode" type="text" ondblclick="codeQueryLine(this)"
							onkeyup="codeQueryLine(this)" class="codecode"><span class="warning">*</span></td>
            <td class=title>电流互感器型式</td>
            <td class=input><input name="CTModus" type="text"   ondblclick="codeQueryCT(this)"
							onkeyup="codeQueryCT(this)" class="codecode"><span class="warning">*</span></td>
          
          </tr>
          <tr>
           <td class=title>电压互感器型式</td>
            <td class=input><input name="PTModus" type="text"  ondblclick="codeQueryPT(this)"
							onkeyup="codeQueryPT(this)" class="codecode"><span class="warning">*</span></td>
           <td class=title>有功电表号</td>
            <td class=input><input name="AmmeterNo" type="text" ondblclick="codeQueryA(this)"
							onkeyup="codeQueryAthis)" class="codecode"><span class="warning">*</span></td>
          </tr>
            <tr>
       	  
             <td class=title>无功电表号</td>
            <td class=input><input name="UnAmmeterNo" type="text" ondblclick="codeQueryUA(this)"
							onkeyup="codeQueryAthis)" class="codecode"><span class="warning">*</span></td>
							  <td class=title>大工业居民电表号</td>
            <td class=input><input name="PepoleAmmeterNo" type="text" ondblclick="codeQueryPA(this)"
							onkeyup="codeQueryAthis)" class="codecode"></td>
       </tr>
		 <tr>
		 
							
		 
           <td class=title>录入日期</td>
            <td class=input><input name="inputDate" type="text"  ><span class="warning">*</span></td>
            <td class=input>
            <td class=input>
		 </tr>

        </table>
		
    <br />
<!--一大堆的按钮-->

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" 保 存 " onClick="javascript:addPowerUser();"></td>
        <%--<td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        --%><td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function addPowerUser(){
	//if(!hasEmty()){
	//return false;
	//}else{
  fm.action="/iacontact/addLWLineRalation.do";
  fm.submit();
 

// }
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
 function codeQueryLine(field)
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
 function codeQueryCT(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.CTModus.value+"&TableName=LwCT1";

	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
 function codeQueryA(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.AmmeterNo.value+"&TableName=LwAmmeterNo1";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
function codeQueryUA(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.UnAmmeterNo.value+"&TableName=LwAmmeterNo2";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
function codeQueryPA(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.PepoleAmmeterNo.value+"&TableName=LwAmmeterNo3";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
function codeQueryPT(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.PTModus.value+"&TableName=LwPT1";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
function hasEmty(){

if(fm.Modus.value==""||fm.Modus.value==null){
	alert("型式不能为空");
	
	return false;
}
else{
	return true;
}

if(fm.PCRate.value==""||fm.CTRate.value==null){
	alert("倍率不能为空");

	return false;
}else{
	return true;
}
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
