<%--
*********
******************
查询用户信息页面  
create by wangrongjia
200810.09
--%>

<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwptDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwctDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto"/>
    <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>查询页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>用线路配置查询页面</title>
<app:css />
<html:base />
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

<STYLE>BODY {
               SCROLLBAR-FACE-COLOR:#ffffff;
               SCROLLBAR-HIGHLIGHT-COLOR:#A9CBED;
               SCROLLBAR-SHADOW-COLOR:#A9CBED;
               SCROLLBAR-3DLIGHT-COLOR:#FFFFFF;
               SCROLLBAR-ARROW-COLOR:#A9CBED;
               SCROLLBAR-TRACK-COLOR:#FFFFFF;
               SCROLLBAR-DARKSHADOW-COLOR:#FFFFFF;
       }
</STYLE>
</head>

<body class=interface>







  
    <!--CONTENT BEGIN-->
    
      <form name="fm" style="display:block;">
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>配置线路信息</B></td>
		</tr>

          <tr>
            <td class="title">线路</td>
            <td class=input><input styleClass="text" name="Modus" type="text"  ></td>
			
           <td class=input></td>
            <td class=input></td>
          </tr><%--
          <tr>
            <td class="title">地址</td>
            <td class=input><input styleClass="text" name="Address" type="text"  value="" ></td>
			<td class="title">效力状态</td>
            <td class=input><input styleClass="text" name="ValidStatus" type="radio"  value="1">有效
                <input styleClass="blue" name="ValidStatus" type="radio" value="0">无效</td>
          </tr>
		  <tr>
		   <td class="title">所属乡镇</td>
            <td class=input><input styleClass="text" name="TownCode" type="text"  value="" ></td>			 
			 <td class="title"></td>
			 <td class="input"></td>
			 
		  </tr>
		
		  
--%>
        </table>
        <table cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td class=button align="center"><input type=button class=button name=button0 value=" 查 询 " onClick="serchCT();"></td>
		</tr>
	</table>
      
     <br />

	
	
	<form name="fm1" >
        <table table class=common width="100%" cellspacing="1" cellpadding="5" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="10"><B>电压互感器信息</B></td>
		</tr>

		<tr class=listtitle>
			<td nowrap><span class="title">线路代码</span></td>
			<td nowrap ><span class="title">电流互感器型式</span></td>
			<td nowrap ><span class="title">电压互感器型式</span></td>
			<td nowrap ><span class="title">表号</span></td>
			<td nowrap ><span class="title">是否有效</span></td>
			<td nowrap ><span class="title">录入日期</span></td>
			
			
		</tr>
		<%
	
		
		
	List LineRalationcol=(List)request.getAttribute("LineRalationcol");
	Iterator it=LineRalationcol.iterator();
      while(it.hasNext()){
      	LwLineCTPTAmmeterDto LineCTPTA=(LwLineCTPTAmmeterDto)it.next();
 %>
		<tr>
			<td class="input" nowrap colspan="1"><input  name="chooseLineRalation" type="checkbox" value="<%=LineCTPTA.getLineCode()%>"></td>
			<td style="display:none"><input type="hidden" name="LineRalationId" value="<%=LineCTPTA.getLineCode()%>"></td>
			<td class="input" nowrap colspan="1"><%=LineCTPTA.getCtModus()%></td>
			<td class="input" nowrap colspan="1"><%=LineCTPTA.getPtModus()%></td>
			<td class="input" nowrap colspan="1"><%=LineCTPTA.getAmmeterNo()%></td>
			
	
			<%
			if(LineCTPTA.getFlag().equals("1")){
			 %>
			<td class="input" nowrap colspan="1">有效</td>
			<%} %>
			<%
			if(LineCTPTA.getFlag().equals("0")){
			 %>
			<td class="input" nowrap colspan="1">无效</td>
			<%} %>
			
			<td class="input" nowrap colspan="1"><%=LineCTPTA.getInputDate()%></td>
			<%--<td class="input" nowrap colspan="1"><%=PT.getFlag()%></td>
			
		
			
	
		--%></tr>
		<%} %>
		
		<%--<tr><td colspan="10" >第1页/第1-10条共120条  下一页  尾页 </td></tr>
	--%></table>
	


 
      

 
    <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="修  改"
						onClick="update();">
				</td>
				  <td class=button align="center">
					<input type=button class=button name=button8 value="删  除"
						onClick="delCT();">
				</td>
				  <td class=button align="center"><input class=button name="add" type="button"  value=" 新 增 " onClick="javascript:addCT();"></td>
			</tr>
		</table>
    </form>
<script language="javascript">

function addCT(){
	 fm.action="LWLineRalation/addLWLineRalation.jsp";
	fm.submit();
	
	
}

function delCT(){

  var str="";
  var checkbox = document.getElementsByName("chooseLineRalation");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!请选择要删除的电压互感器");
 }else{
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
      if(!confirm('确认要删除？将不可恢复。')){
                                return false;
                                }else{
	this.location="/iacontact/deleteLWLineRalation.do?LineRalationId="+str;
	 }
	}
	
}
function update(){
 var str="";
  var checkbox = document.getElementsByName("chooseLineRalation");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!请选择要 修改的电压互感器");
  return false;
 }
 if(n>1){
  alert("!一次只能修改一个电压互感器");
  return false;
 }
 else{
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
      
	this.location="/iacontact/queryOneLWLineRalation.do?LineRalationId="+str;
	 
	}

}
//function delUser(){
	//alert("批量删除记录！");
//}

function cancelUser(){
	alert("将选中记录设置为无效！");
}
function serchCT(){
	
	 fm.action="/iacontact/viewLWLineRalation.do";
	
}

</script>

<br />
  

</body>
</html>
</html:html>
