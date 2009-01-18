<%--
*********
******************
查询趸售用户信息页面  
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

		<title>查询页面</title>
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<link rel="stylesheet" type="text/css"
			href="/iacontact/css/Standard.css">
		<title>趸用电用户查询页面</title>
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
						<B>查询趸售用电用户信息</B>
					</td>
				</tr>

				<tr>
					<td class=title>所属农电局</td>
			  <td class=input><select name="company" >
            <option value="gy">固阳</option>
			<option value="dm">达茂</option>
			 <option value="ty">土右</option>
			<option value="jy">九原</option></td>

					<td class="title">
						线路名称
					</td>
					<td class=input>
						<input class="text" name="UserNo" type="text">
					</td>
				</tr>

			</table>


		<table cellpadding="0" cellspacing="0" width="100%">

				
					<tr class="listtitle" align="center">

							<td class=button align="center">
						<input type=button class=button name=button0 value=" 查 询 "
							onClick="serchWholeSale();">
					</td>
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



			
				<table table class=common width="100%" cellspacing="1"
					cellpadding="5" border="0">
					<tr class=listtitle align="center">
						<td class=title0 colspan="10">
							<B>趸售用电用户信息</B>
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
							<span class="title">供电电压</span>
						</td>
						<td nowrap>
							<span class="title">趸售类型</span>
						</td>
						<td nowrap>
							<span class="title">所属农电局</span>
						</td>
						<td nowrap>
							<span class="title">地址</span>
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
							普通趸售
							<%} %>
							<%if(lwWholeSaleUserInfoDto.getWholesaletype().equals("1")){%>
							趸售工业
							<%} %>
						</td>
						<td class="input" nowrap colspan="1">
							<%if(lwWholeSaleUserInfoDto.getCompany().equals("gy")){%>
							固阳农电局
							<%} %>
							<%if(lwWholeSaleUserInfoDto.getCompany().equals("ty")){%>
							图佑农电局
							<%} %>
							<%if(lwWholeSaleUserInfoDto.getCompany().equals("jy")){%>
							九原农电局
							<%} %>
							<%if(lwWholeSaleUserInfoDto.getCompany().equals("dm")){%>
							达茂农电局
							<%} %>
						</td>
						<td class="input" nowrap colspan="1">
							<%=lwWholeSaleUserInfoDto.getPhoneNo()%>
						</td>
						




					</tr>
					<%
					}
					%>

					<%--<tr><td colspan="10" >第1页/第1-10条共120条  下一页  尾页 </td></tr>
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
      
	this.location="/iacontact/viewOneLWWholeSaleUser.do?UserId="+str;
	 
	}

}
//function delUser(){
	//alert("批量删除记录！");
//}

function cancelUser(){
	alert("将选中记录设置为无效！");
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
