<%--
*********
******************
��ѯ�û���Ϣҳ��  
create by qiaoyouliang
2009.3.4
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
	this.location="/iacontact/deleteLWPowerUser.do?UserId="+str;
	 }
	}
}
function adjustProrate(){

	fm.action="/iacontact/queryLWPowerUser.do?op=1";
	fm.submit();
}


function calFee(){
	
	fm.action="<%=request.getContextPath()%>/calTownChaFee.do";
	fm.submit();
}
//function delUser(){
	//alert("����ɾ����¼��");
//}
function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
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
						<B>��ѯ�õ��û���Ϣ</B>
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
						<input type=button class=button name=button0 value="��  ѯ"
							onClick="searchUser();">
					</td>
					<td class=button align="center">
						<input type=button class=button name=button1 value="��������"
							onClick="adjustProrate();">
					</td>
					<td class=button align="center">
						<input type=button class=button name=button1 value="��������"
							onClick="calFee();">
					</td>
				
					<td class=button align="center">
						<input class=button name="add" type="button" value="��  ��"
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
						<B>�õ��û���Ϣ(<%=count%>)</B>
					</td>
				</tr>

				<tr class=listtitle>
					<td nowrap colspan="6">
						<span class="title">�û���Ϣ</span>
					</td>
					<td nowrap colspan="6">
						<span class="title">������̯</span>
					</td>
				</tr>
				<tr class=listtitle>
					<td nowrap>
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
						<span class="title">��������</span>
					</td>
					<td nowrap>
						<span class="title">���������</span>
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
