<%--
*********
******************
��ѯ��ҵ�û���Ϣҳ��  
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

		<title>��ѯҳ��</title>
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<link rel="stylesheet" type="text/css"
			href="/iacontact/css/Standard.css">
		<title>��ҵ�õ��û���ѯҳ��</title>
		<app:css />
		<html:base />
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<link rel="stylesheet" type="text/css"
			href="/iacontact/css/Standard.css">
	
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

		<form name="fm" style="display:block;" method="post">
			<table class=common width="100%" cellspacing="1" cellpadding="5">
				<tr class=listtitle align="center">
					<td class=title0 colspan="10">
						<B>��ѯ��ҵ�õ��û���Ϣ</B>
					</td>
				</tr>

				<tr>
					<td class="title">
						����
					</td>
					<td class=input>
						<input class="text" name="UserNo" type="text">
					</td>

					<td class="title">
						����
					</td>
					<td class=input>
						<input class="text" name="UserName" type="text">
					</td>
				</tr>

			</table>
			<table cellpadding="0" cellspacing="0" width="100%">
				<tr>
					<td class=button align="center">
						<input type=button class=button name=button0 value=" �� ѯ "
							onClick="serchCorporation();">
					</td>
				</tr>
			</table>

			<br />
				<table class=common width="100%" cellspacing="1"
					cellpadding="5" border="0">
					<tr class=listtitle align="center">
						<td class=title0 colspan="11">
							<B>��ҵ�õ��û���Ϣ</B>
						</td>
					</tr>

					<tr class=listtitle>
						<td nowrap >
							<span class="select">ѡ��</span>
						</td>
						<td nowrap>
							<span class="title">����</span>
						</td>
						<td nowrap>
							<span class="title">����</span>
						</td>
						<td nowrap>
							<span class="title">��ַ</span>
						</td>
						<td nowrap>
							<span class="title">������</span>
						</td>
						<td nowrap>
							<span class="title">˰��</span>
						</td>
						<td nowrap>
							<span class="title">�����ʺ�</span>
						</td>
						<td nowrap>
							<span class="title">����/����</span>
						</td>
							<td nowrap>
							<span class="title">��������/��������</span>
						</td>
						<td nowrap>
							<span class="title">�����ѹ</span>
						</td>
						<td nowrap>
							<span class="title">������·</span>
						</td>

					</tr>
					<%
								List corporationList = (List) request.getAttribute("corporationUserList");

						Iterator it = corporationList.iterator();
						while (it.hasNext()) {
							LwCoporationUserInfoDto lwCoporationUserInfoDto = (LwCoporationUserInfoDto) it.next();
					%>
					<tr>

						<td class="select" nowrap colspan="1">
							<input name="chooseCorporation" type="checkbox"
								value="<%=lwCoporationUserInfoDto.getUserNo()%>">
						</td>
						<td class="input" nowrap colspan="1">
							<a href="javascript:viewCopoUser('<%=lwCoporationUserInfoDto.getUserNo()%>');"><%=lwCoporationUserInfoDto.getUserNo()%></a>
						</td>
						<td class="input" nowrap colspan="1">
							<%=lwCoporationUserInfoDto.getUserName()%>
						</td>
						<td class="input" nowrap colspan="1">
							<%=lwCoporationUserInfoDto.getAddress()%>
						</td>
						<td class="input" nowrap colspan="1">
							<%=lwCoporationUserInfoDto.getAccountBank()%>
						</td>
						<td class="input" nowrap colspan="1">
							<%=lwCoporationUserInfoDto.getTaxNo()%>
						</td>
						<td class="input" nowrap colspan="1">
							<%=lwCoporationUserInfoDto.getAccountNo()%>
						</td>
						<%if(lwCoporationUserInfoDto.getIndustryType().equals("1")){%>
						<td class="input" nowrap colspan="1">
							
							����
							
						</td>
						<td class="input" nowrap colspan="1">
							
							<%=lwCoporationUserInfoDto.getRongliangPower()%>
							
						</td>
						<%} %>
							<%if(lwCoporationUserInfoDto.getIndustryType().equals("2")){%>
						<td class="input" nowrap colspan="1">
							
							����
							
						</td>
						<td class="input" nowrap colspan="1">
							
							<%=lwCoporationUserInfoDto.getNeedRate()%>
							
						</td>
						<%} %>
						<%
						if(lwCoporationUserInfoDto.getVoltage().equals("2")){
						 %>
						<td class="input" nowrap colspan="1">
							1-10KV
						</td>
						<%} %>
						<%
						if(lwCoporationUserInfoDto.getVoltage().equals("3")){
						 %>
						<td class="input" nowrap colspan="3">
							35-110KV����
						</td>
						<%} %>
						<%
						if(lwCoporationUserInfoDto.getVoltage().equals("4")){
						 %>
						<td class="input" nowrap colspan="3">
							110-220KV������
						</td>
						<%} %>
						<%
						if(lwCoporationUserInfoDto.getVoltage().equals("5")){
						 %>
						<td class="input" nowrap colspan="3">
							220KV������
						</td>
						<%} %>
						<td class="input" nowrap colspan="1">
							<%=lwCoporationUserInfoDto.getLineNo()%>
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
								onClick="javascript:addCorporation();">
						</td>
					</tr>
				</table>


			</form>
			<script language="javascript">
			
			function viewCopoUser(val){
			fm.action="<%=request.getContextPath()%>/lwCorporationUser.do?UserId="+val;
			fm.submit();
			}

function addCorporation(){
	  fm.action="addCorporationUser.jsp";
	fm.submit();
	
	
}

function delCorporation(){

  var str="";
  var checkbox = document.getElementsByName("chooseCorporation");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!��ѡ��Ҫɾ�����û�");
  return false;
 }else{
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
      if(!confirm('ȷ��Ҫɾ���������ɻָ���')){
                                return false;
                                }else{
	this.location="/iacontact/delLWCorporation.do?UserId="+str;

	
	 }
	}
	
}
function update(){

 var str="";
  var checkbox = document.getElementsByName("chooseCorporation");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!��ѡ��Ҫ �޸ĵ��û�");
  return false;
 }
 if(n>1){
  alert("!һ��ֻ���޸�һ���û�");
  return false;
 }
 else{
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
      
	this.location="<%=request.getContextPath()%>/viewOneLWCorporationUser.do?UserId="+str;
	}

}


function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
}
function serchCorporation(){
	
	fm.action="/iacontact/viewcorporationUserList.do";
	fm.submit();
}
</script>

			<br />
	</body>
</html>
</html:html>
