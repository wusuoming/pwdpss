<%--
*********
******************
��ѯ��ѹ����Ϣҳ��  
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
		<title>��ѯҳ��</title>
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<link rel="stylesheet" type="text/css"
			href="/iacontact/css/Standard.css">
		<title>��ѹ����ѯҳ��</title>
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
						<B>��ѯ��ѹ����Ϣ</B>
					</td>
				</tr>
				<tr>
					<td class="title">
						��·����
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
						<input type=button class=button name=button0 value=" �� ѯ "
							onClick="serchTransfor();">
					</td>
				</tr>
			</table>
			<br />
				<table class=common width="100%" cellspacing="1" cellpadding="5"
					border="0">
					<tr class=listtitle align="center">
						<td class=title0 colspan="10">
							<B>������Ϣ</B>
						</td>
					</tr>

					<tr class=listtitle>
						<td nowrap>
							<span class="select">ѡ��</span>
						</td>
						<td nowrap>
							<span class="title">��·����</span>
						</td>
						<td nowrap>
							<span class="title">�绰</span>
						</td>
						<td nowrap>
							<span class="title">��ѹ���������</span>
						</td>
						<td nowrap>
							<span class="title">�������·���</span>
						</td>
						<td nowrap>
							<span class="title">�����</span>
						</td>
						<td nowrap>
							<span class="title">�õ�ʱ��</span>
						</td>
						<td nowrap>
							<span class="title">���ص���</span>
						</td>
						<td nowrap>
							<span class="title">��·��ѹ</span>
						</td>

						<td nowrap>
							<span class="title">��������ʱ��</span>
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
					<%--<tr><td colspan="10" >��1ҳ/��1-10����120��  ��һҳ  βҳ </td></tr>
	--%>
				</table>
				<table cellpadding="0" cellspacing="0" width="100%">

					<tr class="listtitle" align="center">

						<td class=button align="center">
							<input type=button class=button name=button1 value="��  ��"
								onClick="update();">
						</td>
						<td class=button align="center">
							<input type=button class=button name=button8 value="ɾ  ��"
								onClick="delCorporation();">
						</td>
						<td class=button align="center">
							<input class=button name="add" type="button" value=" �� �� "
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
		alert("����ѡ��һ����¼����");
		return;
	}else{
		if(!confirm("ȷ��ɾ�������ݲ��ɻָ���")){
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
  alert("!��ѡ��Ҫ�޸ĵ��û�");
  return false;
 }
 if(count>1){
  alert("!һ��ֻ���޸�һ���û�");
  return false;
 }
 else{  
	this.location="/iacontact/viewOneTransfor.do?UserId="+str;
}
}
function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
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
