<%--
*********
******************
查询变压器信息页面  
create by wangrongjia
200810.09
--%>
<%@ page language="java" contentType="text/html; charset=GBk"
	pageEncoding="GBk"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwUserLineDto" />
<jsp:directive.page
	import="com.elongway.pss.bl.facade.BLLwPowerUserFacade" />
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerLineDto" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto" />
<jsp:directive.page import="com.elongway.pss.dto.domain.TransforDto" />
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
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<title>查询页面</title>
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<link rel="stylesheet" type="text/css"
			href="/iacontact/css/Standard.css">
		<title>变压器查询页面</title>
		<app:css />
		<html:base />
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<link rel="stylesheet" type="text/css"
			href="/iacontact/css/Standard.css">
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
		<form name="fm" style="display: block;" method="post">
			<table class=common width="100%" cellspacing="1" cellpadding="5">
				<tr class=listtitle align="center">
					<td class=title0 colspan="10">
						<B>查询变压器信息</B>
					</td>
				</tr>
				<tr>
					<td class="title">
						线路名称
					</td>
					<td class=input>
						<input class="text" name="transforName" type="text">
					</td>
					<td class=input>
					<td class=input>
				</tr>
			</table>
			<table cellpadding="0" cellspacing="0" width="100%">
				<tr>
					<td class=button align="center">
						<input type=button class=button name=button0 value=" 查 询 "
							onClick="serchTransfor();">
					</td>
				</tr>
			</table>
			<br />
				<table class=common width="100%" cellspacing="1" cellpadding="5"
					border="0">
					<tr class=listtitle align="center">
						<td class=title0 colspan="10">
							<B>变损信息</B>
						</td>
					</tr>

					<tr class=listtitle>
						<td nowrap>
							<span class="select">选择</span>
						</td>
						<td nowrap>
							<span class="title">线路名称</span>
						</td>
						<td nowrap>
							<span class="title">电话</span>
						</td>
						<td nowrap>
							<span class="title">变压器空载损耗</span>
						</td>
						<td nowrap>
							<span class="title">额定容量短路损耗</span>
						</td>
						<td nowrap>
							<span class="title">额定容量</span>
						</td>
						<td nowrap>
							<span class="title">用电时间</span>
						</td>
						<td nowrap>
							<span class="title">空载电流</span>
						</td>
						<td nowrap>
							<span class="title">短路电压</span>
						</td>

						<td nowrap>
							<span class="title">连续供电时间</span>
						</td>
					</tr>
					<%
						List transfor = (List) request.getAttribute("transfor");

							Iterator it = transfor.iterator();
							while (it.hasNext()) {
								TransforDto transforDto = (TransforDto) it.next();
					%>
					<tr>

						<td class="select" nowrap colspan="1">
							<input name="chooseWholeSale" type="checkbox"
								value="<%=transforDto.getTransforName()%>">
						</td>
						<td style="display: none">
							<input name="UserId" value="<%=transforDto.getTransforName()%>">
						</td>
						<td class="input" nowrap colspan="1">

							<a
								href="javascript:viewTransfor('<%=transforDto.getTransforName()%>');">
								<%=transforDto.getTransforName()%></a>
						</td>
						<td class="input" nowrap colspan="1">

							<%=transforDto.getPhone()%>
						</td>
						<td class="input" nowrap colspan="1">
							<%=transforDto.getKongzaiLoss()%>
						</td>
						<td class="input" nowrap colspan="1">
							<%=transforDto.getDuanluLoss()%>
						</td>

						<td class="input" nowrap colspan="1">
							<%=transforDto.getContentPower()%>
						</td>
						<td class="input" nowrap colspan="1">
							<%=transforDto.getUseHour()%>
						</td>
						<td class="input" nowrap colspan="1">
							<%=transforDto.getKongzaiCT()%>
						</td>
						<td class="input" nowrap colspan="1">
							<%=transforDto.getDuanluPT()%>
						</td>
						<td class="input" nowrap colspan="1">
							<%=transforDto.getSuplyHour()%>
						</td>
					</tr>
					<%
						}
					%>
					<%--<tr><td colspan="10" >第1页/第1-10条共120条  下一页  尾页 </td></tr>
	--%>
				</table>
				<table cellpadding="0" cellspacing="0" width="100%">

					<tr class="listtitle" align="center">

						<td class=button align="center">
							<input type=button class=button name=button1 value="修  改"
								onClick="update();">
						</td>
						<td class=button align="center">
							<input type=button class=button name=button8 value="删  除"
								onClick="delCorporation();">
						</td>
						<td class=button align="center">
							<input class=button name="add" type="button" value=" 新 增 "
								onClick="javascript:addWholeSale();">
						</td>
					</tr>
				</table>


			</form>
			<script language="javascript">
			function viewTransfor(val){
				fm.action="/iacontact/transforInfo.do?UserId="+val;
				fm.submit();
			}

function addWholeSale(){
	fm.action="addTransfor.jsp";
	fm.submit();
}

function delCorporation(){
	var str = "";
	var count = 0;
	var ids = document.getElementsByName('chooseWholeSale');
	for(var i=0;i<ids.length;i++){
		if(ids[i].checked){
			str+=ids[i].value+",";
			count++;
		}
	}
	if(count<1){
		alert("至少选择一条记录！！");
		return;
	}else{
		if(!confirm("确认删除后，数据不可恢复！")){
			return false;
		}else{
			this.location="/iacontact/deleteTransfor.do?UserId="+str;
		}
	}
}
function update(){
 var str = "";
	var count = 0;
	var ids = document.getElementsByName('chooseWholeSale');
	for(var i=0;i<ids.length;i++){
		if(ids[i].checked){
		str = ids[i].value;
			count++;
		}
	}
 if(count==0){
  alert("!请选择要修改的用户");
  return false;
 }
 if(count>1){
  alert("!一次只能修改一个用户");
  return false;
 }
 else{  
	this.location="/iacontact/viewOneTransfor.do?UserId="+str;
}
}
function cancelUser(){
	alert("将选中记录设置为无效！");
}
function serchWholeSale(){
	fm.action="/iacontact/viewTransfor.do";
	fm.submit();
}
</script>

			<br />
	</body>
</html>
</html:html>
