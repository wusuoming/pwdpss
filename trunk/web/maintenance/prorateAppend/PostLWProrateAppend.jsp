<%--
*********
******************
��ѯ�û���Ϣҳ��  
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
<%@page import="com.elongway.pss.dto.custom.UserInfoCustomDto"%>
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
		<title>�õ��û���ѯҳ��</title>
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
function updateProrate(){
  
    if(!confirm('�Ƿ���Ҫ�����޸ı�����')){
    }else{
	fm.action="/iacontact/postLWProrateAppend.do?";
	fm.submit();
	}
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
						<B>�����û�������̯��Ϣ</B>
					</td>
				</tr>
				
			</table>
			
			<%
				List<UserInfoCustomDto> userlist = (List) request.getAttribute("userInfoList");
					int count = 0;
					if (userlist == null) {
						count = 0;
					} else {
						count = userlist.size();
					}
			%>
			<table class=common width="100%" cellspacing="1" cellpadding="5"
				border="0">
				

				<tr class=listtitle>
					<td nowrap colspan="5">
						<span class="title">�û���Ϣ</span>
					</td>
					<td nowrap colspan="7">
						<span class="title">������̯</span>
					</td>
				</tr>
				<tr class=listtitle>
					
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
						<span class="title">��������</span>
					</td>
					<td nowrap>
						<span class="title">���������</span>
					</td>
					<td nowrap>
						<span class="title"></span>
					</td>
					<td nowrap>
						<span class="title">��������
					</td>
					<td nowrap>
						<span class="title">�Ǿ�������</span>
					</td>
					<td nowrap>
						<span class="title">ũҵ�Ź�</span>
					</td>
					<td nowrap>
						<span class="title">ũҵ����</span>
					</td>
					<td nowrap>
						<span class="title">��ҵ</span>
					</td>
					<td nowrap>
						<span class="title">���չ�ҵ</span>
					</td>
				</tr>
				<%
					BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
						LwProrateDto oldProrateDto = null;
						String company = null;
						UserInfoCustomDto user = null;
						LwPowerUserDto lwPowerUserDto = null;
						

						for (Iterator iterator = userlist.iterator(); iterator
								.hasNext();) {
							user = (UserInfoCustomDto) iterator.next();
							lwPowerUserDto = user.getLwPowerUserDto();
							oldProrateDto = user.getOldProrateDto();
							
				%>
				<tr>
					
					
					<td class="input" nowrap colspan="1" rowspan="2"><%=lwPowerUserDto.getUserNo()%></td>
					<td class="input" nowrap colspan="1" rowspan="2"><%=lwPowerUserDto.getUserName()%></td>
					<td class="input" nowrap colspan="1" rowspan="2"><%=lwPowerUserDto.getAddress()%></td>
					<td class="input" nowrap colspan="1" rowspan="2"><%=lwPowerUserDto.getTownName()%></td>
					<td class="input" nowrap colspan="1" rowspan="2"><%=lwPowerUserDto.getCompany()%></td>
					<td class="input" nowrap colspan="1" >ԭ����</td>
					<td class="input" nowrap colspan="1"><%=oldProrateDto.getResident()%></td>
					<td class="input" nowrap colspan="1"><%=oldProrateDto.getIndecisive()%></td>
					<td class="input" nowrap colspan="1"><%=oldProrateDto.getAgricultural()%></td>
					<td class="input" nowrap colspan="1"><%=oldProrateDto.getProduce()%></td>
					<td class="input" nowrap colspan="1"><%=oldProrateDto.getBusiness()%></td>
					<td class="input" nowrap colspan="1"><%=oldProrateDto.getIndustry()%></td>
				</tr>
				<tr>
				<td style="display: none">
						<input type="hidden" name="UserId" value="<%=lwPowerUserDto.getUserNo()%>">
					</td>
				    <td class="input" nowrap colspan="1" >�±���</td>
					<td class="input" nowrap colspan="1"><input type="text" name="Resident" style="width:60px"></td>
					<td class="input" nowrap colspan="1"><input type="text" name="Indecisive"  style="width:60px"></td>
					<td class="input" nowrap colspan="1"><input type="text" name="Agricultural"  style="width:60px"></td>
					<td class="input" nowrap colspan="1"><input type="text" name="Produce"  style="width:60px"></td>
					<td class="input" nowrap colspan="1"><input type="text" name="Business"  style="width:60px"></td>
					<td class="input" nowrap colspan="1"><input type="text" name="Industry" style="width:60px"></td>
				</tr>
				<%
					}
				%>
				</table>
				<table cellpadding="0" cellspacing="0" width="100%">
				<tr>
					<td class=button align="center">
						<input type=button class=button name=button1 value="��  ��"
							onClick="updateProrate();">
					</td>					
				</tr>
			</table>
				</form>
	</body>
</html>
</html:html>
