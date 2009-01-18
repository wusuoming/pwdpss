<%--
*********
******************
查询用户信息页面  
create by wangrongjia
200810.09
--%>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwUserLineDto" />
<jsp:directive.page
	import="com.elongway.pss.bl.facade.BLLwPowerUserFacade" />
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerLineDto" />
<%@page import="com.elongway.pss.dto.domain.LwProrateDto"%>
<%@page import="com.elongway.pss.bl.facade.BLLwProrateFacade"%>
<%@page import="java.util.Collection"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterBookFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwDcodeDto"%>
<%@page import="com.elongway.pss.bl.facade.BLLwDcodeFacade"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html:html xhtml="true" locale="true">
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto" />
<jsp:directive.page import="java.util.Iterator" />
<jsp:directive.page import="java.util.List" />
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">
	<head>
		<meta http-equiv=Content-Type content="text/html; charset=gb2312">
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<title>查询页面</title>
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<link rel="stylesheet" type="text/css"
			href="/iacontact/css/Standard.css">
		<title>用电用户查询页面</title>
		<app:css />
		<html:base />
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<link rel="stylesheet" type="text/css"
			href="/iacontact/css/Standard.css">
		<script language="javascript">
		function viewUser(val){
			fm.action = "/iacontact/lWPowerUser.do?UserId="+val;
			fm.submit();
		}
function addUser(){
	fm.action="addLWPowerUser.jsp";
	fm.submit();
}
function delUser(){
  var str="";
  var checkbox = document.getElementsByName("chooseUser");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
 if(n==0){
  alert("!请选择要删除的用户");
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
	this.location="/iacontact/deleteLWPowerUser.do?UserId="+str;
	 }
	}
}
function update(){
 var str="";
  var checkbox = document.getElementsByName("chooseUser");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
 if(n==0){
  alert("!请选择要 修改的用户");
  return false;
 }
 if(n>1){
  alert("!一次只能修改一个用户");
  return false;
 }
 else{
     for(var i=0;i<checkbox.length;i++) 
{ 
if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     }
	this.location="/iacontact/queryOneLWPowerUser.do?UserId="+str;
	}
}
//function delUser(){
	//alert("批量删除记录！");
//}
function cancelUser(){
	alert("将选中记录设置为无效！");
}
function searchUser(){
	fm.action="/iacontact/queryLWPowerUser.do";
	fm.submit();
}
</script>
		<STYLE>
BODY {
	SCROLLBAR-FACE-COLOR: #ffffff;
	SCROLLBAR-HIGHLIGHT-COLOR: #A9CBED;
	SCROLLBAR-SHADOW-COLOR: #A9CBED;
	SCROLLBAR-3DLIGHT-COLOR: #FFFFFF;
	SCROLLBAR-ARROW-COLOR: #A9CBED;
	SCROLLBAR-TRACK-COLOR: #FFFFFF;
	SCROLLBAR-DARKSHADOW-COLOR: #FFFFFF;
}
</STYLE>
	</head>
	<body class=interface>
		<!--CONTENT BEGIN-->
		<form name="fm" method="post">
			<table class=common width="100%" cellspacing="1" cellpadding="5">
				<tr class=listtitle align="center">
					<td class=title0 colspan="7">
						<B>查询用电用户信息</B>
					</td>
				</tr>
				<tr>
					<td class="title">
						户号
					</td>
					<td class=input>
						<input class="text" name="UserNo" type="text">
					</td>
					<td class="title">
						户名
					</td>
					<td class=input>
						<input class="text" name="UserName" type="text">
					</td>
					<%
						BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
							Collection bookList = blLwAmmeterBookFacade
									.findByConditions(" 1=1 ");
							String firstquery = (String) request.getAttribute("firstquery");
							String bookNo = (String) request.getAttribute("bookNo");
					%>

					<td class=title>
						所属抄表本
					</td>
					<td class=input>
						<select name="bookNo" class="input">
							<%
								if (firstquery != null) {
							%>
							<option value="" selected="selected">
								全部
							</option>
							<%
								} else {
							%>
							<option value="">
								全部
							</option>
							<%
								}
							%>
							<%
								for (Iterator iterator = bookList.iterator(); iterator
											.hasNext();) {
										LwAmmeterBookDto o = (LwAmmeterBookDto) iterator.next();
										if (o.getBookNo().equals(bookNo)) {
							%>
							<option value=<%=o.getBookNo()%> selected="selected"><%=o.getBookName()%></option>
							<%
								} else {
							%>
							<option value=<%=o.getBookNo()%>><%=o.getBookName()%></option>
							<%
								}
									}
							%>
						</select>
					</td>
				</tr>
			</table>
			<table cellpadding="0" cellspacing="0" width="100%">
				<tr>
					<td class=button align="center">
						<input type=button class=button name=button0 value=" 查 询 "
							onClick="searchUser();">
					</td>
					<td class=button align="center">
						<input type=button class=button name=button1 value="修  改"
							onClick="update();">
					</td>
					<!-- 	  <td class=button align="center">
					<input type=button class=button name=button8 value="删  除"
						onClick="delUser();">
				</td>
				 -->
					<td class=button align="center">
						<input class=button name="add" type="button" value="新  增"
							onClick="addUser();">
					</td>
				</tr>
			</table>
			<%
				List userlist = (List) request.getAttribute("powerUser");
					int count = 0;
					if (userlist == null) {
						count = 0;
					} else {
						count = userlist.size();
					}
			%>
			<table class=common width="100%" cellspacing="1" cellpadding="5"
				border="0">
				<tr class=listtitle align="center">
					<td class=title0 colspan="12">
						<B>用电用户信息(<%=count%>)</B>
					</td>
				</tr>

				<tr class=listtitle>
					<td nowrap colspan="6">
						<span class="title">用户信息</span>
					</td>
					<td nowrap colspan="6">
						<span class="title">比例分摊</span>
					</td>
				</tr>
				<tr class=listtitle>
					<td nowrap>
						<span class="select">选择</span>
					</td>
					<td nowrap>
						<span class="title">户号</span>
					</td>
					<td nowrap>
						<span class="title">户名</span>
					</td>
					<td nowrap>
						<span class="title">地址</span>
					</td>
					<td nowrap>
						<span class="title">所属乡镇</span>
					</td>
					<td nowrap>
						<span class="title">所属供电局</span>
					</td>
					<td nowrap>
						<span class="title">居民生活
					</td>
					<td nowrap>
						<span class="title">非居民照明</span>
					</td>
					<td nowrap>
						<span class="title">农业排灌</span>
					</td>
					<td nowrap>
						<span class="title">农业生产</span>
					</td>
					<td nowrap>
						<span class="title">商业</span>
					</td>
					<td nowrap>
						<span class="title">非普工业</span>
					</td>
				</tr>
				<%
					BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
						LwProrateDto lwProrateDto = null;
						String company = null;

						for (Iterator iterator = userlist.iterator(); iterator
								.hasNext();) {
							LwPowerUserDto user = (LwPowerUserDto) iterator.next();
							String userNo = user.getUserNo();
							lwProrateDto = new BLLwProrateFacade()
									.findByPrimaryKey(userNo);
				%>
				<tr>
					<td class="select" nowrap colspan="1">
						<input name="chooseUser" type="checkbox" value="<%=userNo%>">
					</td>
					<td style="display: none">
						<input type="hidden" name="UserId" value="<%=userNo%>">
					</td>
					<td class="input" nowrap colspan="1"><a href="javascript:viewUser('<%=userNo%>');"><%=userNo%></a></td>
					<td class="input" nowrap colspan="1"><%=user.getUserName()%></td>
					<td class="input" nowrap colspan="1"><%=user.getAddress()%></td>
					<td class="input" nowrap colspan="1"><%=user.getTownName()%></td>
					<td class="input" nowrap colspan="1"><%=user.getCompany()%></td>
					<td class="input" nowrap colspan="1"><%=lwProrateDto.getResident()%></td>
					<td class="input" nowrap colspan="1"><%=lwProrateDto.getIndecisive()%></td>
					<td class="input" nowrap colspan="1"><%=lwProrateDto.getAgricultural()%></td>
					<td class="input" nowrap colspan="1"><%=lwProrateDto.getProduce()%></td>
					<td class="input" nowrap colspan="1"><%=lwProrateDto.getBusiness()%></td>
					<td class="input" nowrap colspan="1"><%=lwProrateDto.getIndustry()%></td>

				</tr>
				<%
					}
				%>
				</table>
				</form>
	</body>
</html>
</html:html>
