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
<%@page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"%>
<%@page import="java.util.List"%>

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
    
          <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="14"><B>趸售用电用户信息</B></td>
		</tr>
          <%
		LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto=(LwWholeSaleUserInfoDto)request.getAttribute("lwWholeSaleUserInfoDto");
		 %>
          <tr>
            <td class=title>线路名称</td>
            <td class=input><%=lwWholeSaleUserInfoDto.getUserNo()%></td>
            <td class=input style="display: none"><input name="transformerName" type="hidden" class="text" value="<%=lwWholeSaleUserInfoDto.getUserNo() %>"></td>
            <td class=title>供电电压</td>
            <td class=input><input name="voltage" type="text"  class="text" value="<%=lwWholeSaleUserInfoDto.getVoltage()%>"></td>
          </tr>
		  <tr>
		    <td class=title>所属电力公司</td>
			  <td class=input><select name="company" >
            <option value="gy" <%if(lwWholeSaleUserInfoDto.getCompany().equals("gy")) {%>selected="selected"<%} %>>固阳</option>
			<option value="dm" <%if(lwWholeSaleUserInfoDto.getCompany().equals("dm")) {%>selected="selected"<%} %>>达茂</option>
			 <option value="ty"<%if(lwWholeSaleUserInfoDto.getCompany().equals("ty")) {%>selected="selected"<%} %>>图佑</option>
			<option value="jy"<%if(lwWholeSaleUserInfoDto.getCompany().equals("jy")) {%>selected="selected"<%} %>>九原</option>
		  <td class=title>趸售类型</td>
            
			
            <td class=input><select name="wholeSaleType" onchange="isHaveProrate()">
            <option value="0"<%if(lwWholeSaleUserInfoDto.getWholesaletype().equals("0")){ %>selected="selected"<%} %>>普通趸售</option>
			<option value="1"<%if(lwWholeSaleUserInfoDto.getWholesaletype().equals("1")){ %>selected="selected"<%} %>>趸售工业</option>
              
          
            </select>
            </td>
            
          
       </tr>
       <tr>
       		<td class=title>电话</td>
            <td class=input><input name="phoneNo" type="text"  class="text" value="<%=lwWholeSaleUserInfoDto.getPhoneNo()%>"></td>
           	<% LwUserLineDto lwUserLineDto=(LwUserLineDto)request.getAttribute("lwUserLineDto");
		
	%>
           
            <td class=input>
             <td class=input>
       </tr>
		  
        </table>
       <table  width="100%" >
         <tr class=listtitle align="center">
			<td class=title0 colspan="17"><B>配置电表信息</B></td>
		</tr>
		<tr class=listtitle>			
		    <td nowrap align="center">类别</td>
			<td nowrap align="center">相</td>
			<td nowrap align="center">伏</td>
			<td nowrap align="center">安</td>
			<td nowrap align="center">型式</td>
			<td nowrap align="center">厂名</td>
			<td nowrap align="center">表号</td>
			<td nowrap align="center">常数</td>
			<td nowrap align="center">精度</td>
			<td nowrap align="center">倍率</td>
			<td nowrap align="center">上表日期</td>
			<td nowrap align="center">上月有功指针</td>		
			<td nowrap align="center">故障有功指针</td>
			
			
			<td nowrap align="center">上月无功指针</td>		
			<td nowrap align="center">故障无功指针</td>
			
			<td nowrap align="center">换表有功指针</td>
			<td nowrap align="center">换表无功指针</td>
			
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
			
			<td  align="center"><%=o.getLastIdleNum()%><input name="lastIdleNum" type="hidden"  class="shorttext" value=<%=o.getLastIdleNum() %> ></td>
			<td  align="center"><input name="errorIdleNum" type="text"  class="shorttext" value="" style="width:65px"></td>
			
			<%}else{ %>
			<td  align="center"><%=o.getLastWorkNum() %></td>
			<td  align="center"><%=o.getErrorWorkNum() %> </td>
			<td  align="center"><%=o.getChgWorkNum()%> </td>
			
			<td  align="center"><%=o.getLastIdleNum() %></td>
			<td  align="center"><%=o.getErrorIdleNum() %> </td>
			<td  align="center"><%=o.getChgIdleQuantity()%> </td>
			<%} %>
			
			<td  align="center"> </td>
			<td  align="center"> </td>

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
			<td  align="center"></td>
			<td  align="center"><input name="installWorkNum" type="text" class="shorttext"  value="" style="width:65px"></td>
			<td  align="center"><input name="installIdleNum" type="text" class="shorttext"  value="" style="width:65px"></td>
		</tr>
	</table>
      
    <br />
<!--一大堆的按钮-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value="修 改 " onClick="javascript:updateAmmeter();"></td>
        <%--<td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        --%><td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
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

 fm.action="/iacontact/updateWholeChgAmmeter.do";
 fm.submit();
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
