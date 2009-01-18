<%--
*********
******************
修改用户信息页面  
create by wangrongjia
200810.09
--%>

<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwptDto"/>

<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>电压互感器修改</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

<script type="text/javascript">

</script>
<!--自动下拉列表JS2-->

</head>
<body id="all_title">
  <div id="container">
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    <div id="content">
   
      <form name="fm" >
       <% 
    LwptDto  lwptDto=(LwptDto)request.getAttribute("PT");
    %>
          <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="4"><B>修改电压互感器信息</B></td>
		</tr>
          <tr>
            <td class=title>型式</td>
            <td class=input><%=lwptDto.getModus()%></td>
            <td class="input" style="display:none;"><input name="Modus" type="text" class="text" value="<%=lwptDto.getModus()%>" ></td>
            <td class=title>电压比</td>
            <td class=input><input name="PT" type="text" class="text" value="<%=lwptDto.getPt()%>" ></td>
          </tr>
		  <tr>
		  <td class=title>厂名</td>
            <td class=input><input name="FactoryName" type="text"  class="text" value="<%=lwptDto.getFactoryName()%>"></td>
			 <td class=title>倍率</td>
		  	<td class=input><input name="PTRate" type="textfiled" class="text" value="<%=lwptDto.getPtRate()%>" ><span class="warning">*</span></td>
          
            
          
       </tr>
        <tr>
         <td class=title>精度</td>
            <td class=input><input name="Exact" type="text"  class="text" value="<%=lwptDto.getExact()%>"></td>
		  <td class=title>厂号A</td>
            <td class=input><input name="FctoryCodeA" type="text" class="text" value="<%=lwptDto.getFctoryCodeA()%>"></td>
			
          
            
          
       </tr>
        <tr>
         <td class=title>厂号B</td>
		  	<td class=input><input name="FctoryCodeB" type="textfiled" class="text" value="<%=lwptDto.getFctoryCodeB()%>" ></td>
		  <td class=title>厂号C</td>
            <td class=input><input name="FctoryCodeC" type="text" class="text" value="<%=lwptDto.getFctoryCodeC()%>"></td>
			
          
            
          
       </tr>
		  <tr>
		   <td class=title>录入日期</td>
		  	<td class=input><input name="ImportDate" type="textfiled" class="text" value="<%=lwptDto.getImportDate()%>" ><span class="warning">*</span></td>
		  
		   <td class=title>是否有效</td>
            <td class=input><input name="ValidStatus" type="radio" value="1" <% if(lwptDto.getValidStatus().equals("1")) {%>checked="checked"<%} %>/>有效
                <input name="ValidStatus" type="radio" value="0" <% if(lwptDto.getValidStatus().equals("0")) {%>checked="checked"<%} %>/>无效</td>
                
		  </tr>
        </table>
		
    <br />
<!--一大堆的按钮-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" 保 存 " onClick="javascript:addPowerUser();"></td>
        <td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        <td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
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
function addPowerUser(){
	if(!hasEmty()){
	return false;
	}else{
  fm.action="/iacontact/editLWPT.do";
 fm.submit();

 }
}
function hasEmty(){

if(fm.PTRate.value==""||fm.PTRate.value==null){
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
