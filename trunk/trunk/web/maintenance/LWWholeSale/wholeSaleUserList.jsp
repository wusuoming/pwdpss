<%--
*********
******************
��ѯ�����û���Ϣҳ��  
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
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
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
		<title>���õ��û���ѯҳ��</title>
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

		<form name="fm"  method="post">
			<table class=common width="100%" cellspacing="1" cellpadding="5">
				<tr class=listtitle align="center">
					<td class=title0 colspan="10">
						<B>��ѯ�����õ��û���Ϣ</B>
					</td>
				</tr>

				<tr>
					<td class=title>����ũ���</td>
			  <td class=input><select name="company" >
            <option value="gy">����</option>
			<option value="dm">��ï</option>
			 <option value="ty">����</option>
			<option value="jy">��ԭ</option></td>

					<td class="title">
						��·����
					</td>
					<td class=input>
						<input class="text" name="UserNo" type="text">
					</td>
				</tr>

			</table>


		<table cellpadding="0" cellspacing="0" width="100%">

				
					<tr class="listtitle" align="center">

							<td class=button align="center">
						<input type=button class=button name=button0 value=" �� ѯ "
							onClick="serchWholeSale();">
					</td>
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



			
				<table table class=common width="100%" cellspacing="1"
					cellpadding="5" border="0">
					<tr class=listtitle align="center">
						<td class=title0 colspan="10">
							<B>�����õ��û���Ϣ</B>
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
							<span class="title">�����ѹ</span>
						</td>
						<td nowrap>
							<span class="title">��������</span>
						</td>
						<td nowrap>
							<span class="title">����ũ���</span>
						</td>
						<td nowrap>
							<span class="title">��ַ</span>
						</td>
						


					</tr>
					<%
						List wholeSaleList = (List) request.getAttribute("wholeSaleList");
						Iterator it = wholeSaleList.iterator();
						while (it.hasNext()) {
							LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto= (LwWholeSaleUserInfoDto) it.next();
					%>
					<tr>

						<td class="select" nowrap colspan="1">
							<input name="chooseWholeSale" type="checkbox"
								value="<%=lwWholeSaleUserInfoDto.getUserNo()%>">
						</td>
						<td style="display:none">
							<input type="hidden" name="UserId"
								value="<%=lwWholeSaleUserInfoDto.getUserNo()%>">
						</td>
						<td class="input" nowrap colspan="1">
							<a href="javascript:viewLwWhole('<%=lwWholeSaleUserInfoDto.getUserNo()%>');"><%=lwWholeSaleUserInfoDto.getUserNo()%></a>
						</td>
						<td class="input" nowrap colspan="1">
							<%=lwWholeSaleUserInfoDto.getVoltage()%>
						</td>
						<td class="input" nowrap colspan="1">
							
							<%if(lwWholeSaleUserInfoDto.getWholesaletype().equals("0")){%>
							��ͨ����
							<%} %>
							<%if(lwWholeSaleUserInfoDto.getWholesaletype().equals("1")){%>
							���۹�ҵ
							<%} %>
						</td>
						<td class="input" nowrap colspan="1">
							<%if(lwWholeSaleUserInfoDto.getCompany().equals("gy")){%>
							����ũ���
							<%} %>
							<%if(lwWholeSaleUserInfoDto.getCompany().equals("ty")){%>
							ͼ��ũ���
							<%} %>
							<%if(lwWholeSaleUserInfoDto.getCompany().equals("jy")){%>
							��ԭũ���
							<%} %>
							<%if(lwWholeSaleUserInfoDto.getCompany().equals("dm")){%>
							��ïũ���
							<%} %>
						</td>
						<td class="input" nowrap colspan="1">
							<%=lwWholeSaleUserInfoDto.getPhoneNo()%>
						</td>
						




					</tr>
					<%
					}
					%>

					<%--<tr><td colspan="10" >��1ҳ/��1-10����120��  ��һҳ  βҳ </td></tr>
	--%>
				</table>
			</form>
			<script language="javascript">
			function viewLwWhole(str){
				fm.action="/iacontact/lwWholeSaleUser.do?UserId="+str;
				fm.submit();
			}

function addWholeSale(){
	fm.action="addWholeSale.jsp";
	fm.submit();
	
	
}

function delCorporation(){

  var str="";
  var checkbox = document.getElementsByName("chooseWholeSale");
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
	this.location="/iacontact/deleteLWWholeSaleUser.do?UserId="+str;
	 }
	}
	
}
function update(){
 var str="";
  var checkbox = document.getElementsByName("chooseWholeSale");
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
      
	this.location="/iacontact/viewOneLWWholeSaleUser.do?UserId="+str;
	 
	}

}
//function delUser(){
	//alert("����ɾ����¼��");
//}

function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
}
function serchWholeSale(){
	
	fm.action="/iacontact/viewLWWholeSaleUserList.do";
	fm.submit();
}
</script>

			<br />
	</body>
</html>
</html:html>
