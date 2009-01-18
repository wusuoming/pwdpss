<%--
*********
******************
修改用户信息页面  
create by wangrongjia 2008.10.09
modify by qiaoyouliang 2008.11.03

--%>

<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<%@page import="com.elongway.pss.bl.facade.BLLwDcodeFacade"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.elongway.pss.dto.domain.LwDcodeDto"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterBookFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@page import="com.elongway.pss.dto.domain.LwProrateDto"%>
<%@page import="com.elongway.pss.dto.domain.LwBookUserDto"%>
<%@page import="com.elongway.pss.dto.domain.LwUserLineDto"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterChangeDto"%>

<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>电表管理查询页面</title>
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
   
      <form name="fm" method="post">
       <% 
    LwPowerUserDto  lwPowerUserDto=(LwPowerUserDto)request.getAttribute("lwPowerUserDto");
    %>
          <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="14"><B>用电用户信息</B></td>
		</tr>
          <tr >
            <td class=title>户号</td>
            <td class=input>
            <input name="userNo" type="text" class="text" value="<%=lwPowerUserDto.getUserNo()%>" readonly="readonly"></td>
            <td class=title>户名</td>
            <td class=input><input name="userName" type="text" class="text" value="<%=lwPowerUserDto.getUserName()%>" readonly="readonly" ></td>
          </tr>
		  <tr>
		  <td class=title>地址</td>
            <td class=input><input name="address" type="text"  value="<%=lwPowerUserDto.getAddress()%>" class="text" readonly="readonly"></td>
              <% BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
             Collection collection = blLwDcodeFacade.findByConditions(" codetype = 'TownCode'");       
       %>
            
			<td class=title>所属乡镇</td>
		  	<td class=input><select name="townCode"  class="input" disabled="disabled">
		  	<% for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwDcodeDto o = (LwDcodeDto) iterator.next();
			
			    if(lwPowerUserDto.getTownCode().equals(o.getCodeCode())){%>
				  <option value=<%=o.getCodeCode() %> selected="selected"><%=o.getCodeCName() %></option> 
			<%}else{%>
			<option value=<%=o.getCodeCode() %>><%=o.getCodeCName() %></option> 
			<% }}%>    
       </select>	           
       </tr>
		  	  <tr>
		  
  <% 
     Collection bookList = (Collection)request.getAttribute("bookList");  
     LwBookUserDto lwUserBookDto = (LwBookUserDto)request.getAttribute("lwBookUserDto");  
     LwUserLineDto lwUserLineDto = (LwUserLineDto)request.getAttribute("lwUserLineDto");  
     String bookNo = lwUserBookDto.getBookNo();
       %>
		  
		  <td class=title>所属抄表本</td>
		  	<td class=input><select name="bookNo"  class="input" disabled="disabled">
		  	<% for (Iterator iterator = bookList.iterator(); iterator.hasNext();) {
			LwAmmeterBookDto o = (LwAmmeterBookDto) iterator.next();
			
			if(bookNo.equals(o.getBookNo())){
			%>
				  <option value=<%=o.getBookNo() %> selected="selected"><%=o.getBookName()%></option> 
			<%}else{ %>    
			  <option value=<%=o.getBookNo() %>><%=o.getBookName()%></option> 
			  <%}} %>
       </select>	


</td>
		  
		   <td class=title>线路信息</td>
            <td class=input><input name="lineCode" type="text"  class="codecode" readonly="readonly" value=<%=lwPowerUserDto.getLineCode() %> ></td>
		  </tr>
		  
        </table>
       <table  width="100%" >
         <tr class=listtitle align="center">
			<td class=title0 colspan="15"><B>配置电表信息</B></td>
		</tr>
		<tr class=listtitle>			
		    <td nowrap align="center">类别</td>
			<td nowrap align="center">相</td>
			<td nowrap align="center">伏</td>
			<td nowrap align="center">安</td>
			<td nowrap align="center">型式</td>
			<td nowrap align="center">厂名</td>
			<td nowrap align="center">厂号</td>
			<td nowrap align="center">常数</td>
			<td nowrap align="center">精度</td>
			<td nowrap align="center">倍率</td>
			<td nowrap align="center">上表日期</td>
			<td nowrap align="center">上月有功指针</td>		
			<td nowrap align="center">故障有功指针</td>
			<td nowrap align="center">换表有功电量</td>
			<td nowrap align="center">换表有功指针</td>
			
		</tr>
	<%Collection ammeter = (Collection)request.getAttribute("ammeter");
	int count = ammeter.size();
	int index = 0;
	int i = 1;
	 for(Iterator it = ammeter.iterator();it.hasNext();){
	    LwAmmeterChangeDto o = (LwAmmeterChangeDto)it.next();
	 %>
		
				
		<tr>
		<%if(index==0){ %>
			<td  align="center" class=title>原装</td>
			<%}else{ %>
			<td  align="center" class=title>新装</td>
			<% }%>
			<td  align="center"><%=o.getAmmeterX() %></td>
			<input name="id" type="hidden"  value=<%=o.getId() %> >
			<td  align="center"><%=o.getAmmeterV() %></td>
			<td  align="center"><%=o.getAmmeterA() %></td>
			<td  align="center"><%=o.getAmmeterType() %></td>
			<td  align="center"><%=o.getFactoryName() %></td>
			<td  align="center"><%=o.getAmmeterNo() %></td>
			<td  align="center"><%=o.getCoust() %></td>
			<td  align="center"><%=o.getPrecision() %></td>
			<td  align="center"><%=o.getRate() %></td>
			<td  align="center"><%=o.getInstallDate() %></td>
			
			<%if(index == count-1) {%>
			<td  align="center"><%=o.getLastWorkNum() %><input name="lastWorkNum" type="hidden"  class="shorttext" value=<%=o.getLastWorkNum() %> ></td>
			<td  align="center"><input name="errorWorkNum" type="text"  class="shorttext" value="" style="width:65px"></td>
			<td  align="center"><input name="chgWorkNum" type="text"  class="shorttext" value="" style="width:60px" > </td>
			<%}else{ %>
			<td  align="center"><%=o.getLastWorkNum() %></td>
			<td  align="center"><%=o.getErrorWorkNum() %> </td>
			<td  align="center"><%=o.getChgWorkNum()%> </td>
			<%} %>
			
			<td  align="center"><%=o.getInstallWorkNum()%> </td>

		</tr>
	
		<%index ++;} %>
		<tr>
		<%if(index!=0){ %>
			<td  align="center" class=title>新装</td>
			<%}else {%><%} %>
			<td  align="center"><input name="ammeterX" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="ammeterV" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="ammeterA" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="ammeterType" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="factoryName" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="ammeterNo" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="coust" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="precision" type="text"  class="shorttext" value="" style="width:65px"></td>
			<td  align="center"><input name="rate" type="text"  class="shorttext" value="" style="width:65px"></td>
			<td  align="center"><input name="installDate" type="text"  class="shorttext" value="" style="width:65px"></td>
			<td  align="center"></td>
			<td  align="center"></td>
			<td  align="center"></td>
			<td  align="center"><input name="installWorkNum" type="text" class="shorttext"  value="" style="width:65px"></td>
		</tr>
	</table>
      
    <br />
<!--一大堆的按钮-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value="修  改" onClick="javascript:updateAmmeter();"></td>
        <%--<td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        --%><td class=button><input name="back" type="button" class=button value="返  回" onClick="javascript:history.go(-1);"></td>
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
function industryType1(){

if(fm.UserStyle.value== "1"){
 
 aaa.style.display = "none"; 
 bbb.style.display = "none";
}
if(fm.UserStyle.value== "3"){
 
 aaa.style.display = "none"; 
 bbb.style.display = "none";
}
 if(fm.UserStyle.value== "2"){
 aaa.style.display = ""; 
 bbb.style.display = "";
}
}
function updateAmmeter(){
if(!confirm('确定进行修改？')){
return false;
}else{
 fm.action="/iacontact/updateChgAmmeter.do";
 fm.submit();
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
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.lineCode.value+"&TableName=LwPowerLine1";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
</body>
</html>
