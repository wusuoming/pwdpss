<%--
*********
******************
查询用户线路对应信息页面  
create by wangrongjia
200810.09
--%>

<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwUserLineDto"/>
    <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>



<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>查询页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>用电用户查询页面</title>
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
<body id="all_title">
  <div id="container">
    <!--CONTENT BEGIN-->
    <div id="content">
      <form name="fm" >
        <table class="fix_table" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>查询线路用户对应关系</B></td>
		</tr>
          <tr>
            <td class="title">户号</td>
            <td class=input><input name="UserNo" type="text" class="text"  /></td>
			<td class="title">户名</td>
           <td class=input><input name="UserName" type="text" class="text"  /></td>
          </tr>
          <tr>
            <td class="title">线路代码</td>
            <td class="title"><input name="LineCode" type="text" class="text"  /></td>
			<td class="title">效力状态</td>
            <td class="title"><input name="ValidStatus" type="radio" value="1" checked="checked"/>有效
                <input name="ValidStatus" type="radio" value="" />无效<span class="warning">*</span></td>
          	 
		  </tr>
		  <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" 查 询 " onClick="javascript:serchUserLine();"></td><%--
		  <td class=button align="center"><input class=button name="add" type="button"  value=" 新 增 " onClick="javascript:addUserLine();"></td>
--%></tr>
        </table>
      <table class="fix_table" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>线路用户对应关系</B></td>
		</tr>
          
		<tr class=listtitle>
			<td nowrap><span class="title">选择</span></td>
			<td nowrap><span class="title">户号</span></td>
			<td nowrap><span class="title">户名</span></td>
			<td nowrap><span class="title">线路代码</span></td>
			<td nowrap><span class="title">是否有效</span></td>
			<td nowrap><span class="title">注释</span></td>
			<td nowrap><span class="title">操作</span></td>
		</tr>
		<%
	
		
		
	List userLinelist=(List)request.getAttribute("powerLine");
	Iterator it=userLinelist.iterator();
      while(it.hasNext()){
      	LwUserLineDto userLine=(LwUserLineDto)it.next();
 %>
		<tr>
			<td class="input" nowrap colspan="1"><input  name="chooseUserLine" type="checkbox" value="<%=userLine.getUserNo()%>;<%=userLine.getLineCode()%>"></td>
			<td style="display:none"><input type="hidden" name="UserLine" value="'<%=userLine.getUserNo()%>'+;+'<%=userLine.getLineCode()%>'"></td>
			<td class="input" nowrap colspan="1"><%=userLine.getUserNo()%></td>
			<td class="input" nowrap colspan="1"><%=userLine.getUserName()%></td>
			<td class="input" nowrap colspan="1"><%=userLine.getLineCode()%></td>
			<td class="input" nowrap colspan="1"><%=userLine.getValidStatus()%></td>
			<td class="input" nowrap colspan="1"><%=userLine.getRemark()%></td>
			<%--<td ><a href="/iacontact/queryOneLWUserLine.do?UserLineNo='<%=userLine.getUserNo()%>'+;+'<%=userLine.getLineCode()%>'">修改</a></td>
		--%></tr>
		<%} %>
		
		<%--<tr><td colspan="10" class="yui-dt-odd">第1页/第1-10条共120条  下一页  尾页 </td></tr>
	--%></table>
  </div>

      <br />

  <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="增  加"
						onClick="addUser();">
				</td>
				  <td class=button align="center">
					<input type=button class=button name=button8 value="删  除"
						onClick="delUser();">
				</td>
				<td class=button align="center">
					<input type=button class=button name=button0 value="修　该"
						onClick=update();>
				</td>
			</tr>
		</table>
		</form>
		<script language="javascript">

function addUser(){
	 fm.action="LWUserLine/addLWUserLine.jsp";
	fm.submit();
	
	
}

function delUser(){

  var str="";
  var checkbox = document.getElementsByName("chooseUserLine");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!请选择要删除的记录");
  return false;
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
	this.location="/iacontact/deleteLWUserLine.do?UserLineId="+str;
	 }
	}
	
}
function update(){
 var str="";
  var checkbox = document.getElementsByName("chooseUserLine");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!请选择要 修改的记录");
  return false;
 }
 if(n>1){
  alert("!一次只能修改一个记录");
  return false;
 }
 else{
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
      
	this.location="/iacontact/queryOneLWUserLine.do?UserLineId="+str;
	 
	}

}
//function delUser(){
	//alert("批量删除记录！");
//}

function cancelUser(){
	alert("将选中记录设置为无效！");
}
function serchUser(){
	
	 fm.action="/iacontact/queryLWUserLine.do";
	fm.submit();
}
</script>
<br />
  

</body>
</html>

