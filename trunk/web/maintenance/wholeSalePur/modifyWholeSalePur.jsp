<%--
*********
******************
��ѯ�����û���Ϣҳ��  
create by wangrongjiar
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
<jsp:directive.page import="com.elongway.pss.dto.domain.SubjoinFeeDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSalePriceDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSalePurePriceDto"/>
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

		<title>չʾҳ��</title>
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
		<link rel="stylesheet" type="text/css"
			href="/iacontact/css/Standard.css">
		<title>���۴���ۼ۸�</title>
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

		
			






			<form name="fm" method="post">
				<table table class=common width="100%" cellspacing="1"
					cellpadding="7" border="0">
					<tr class=listtitle align="center">
						<td class=title0 colspan="10">
							<B>���۴������Ϣ</B>
						</td>
					</tr>

					<tr class=listtitle>
						<td nowrap>
							<span class="title">������</span>
						</td>
						<td nowrap>
							<span class="title">����</span>
						</td>
						<td nowrap>
							<span class="title">�Ǿ���</span>
						</td>
						<td nowrap>
							<span class="title">ũ��</span>
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
						
						<td nowrap>
							<span class="title">��ѹ�ȼ�</span>
						</td>
						
						


					</tr>
					<%
								List price = (List) request.getAttribute("price");

						Iterator it = price.iterator();
						while (it.hasNext()) {
							LwWholeSalePurePriceDto lwWholeSalePurePriceDto= (LwWholeSalePurePriceDto) it.next();
					%>
					<tr>

						
						<td style="display:none">
							<input type="hidden" name="ComCode"
								value="<%=lwWholeSalePurePriceDto.getComCode()%>">
						</td>
						<td class="input" nowrap colspan="1">
							<input  name="ComName"
								value="<%=lwWholeSalePurePriceDto.getComName() %>">
						</td>
						<td class="input" nowrap colspan="1">
							<input  name="PeoplePrice"
								value="<%=lwWholeSalePurePriceDto.getPeoplePrice()%>">
						</td>
				
		
						<td class="input" nowrap colspan="1">
							<input  name="NotPeoplePrice"
								value="<%=lwWholeSalePurePriceDto.getNotPeoplePrice()%>">
						</td>
						<td class="input" nowrap colspan="1">
							<input  name="ProducePrice"
								value="<%=lwWholeSalePurePriceDto.getProducePrice()%>">
						</td>
						<td class="input" nowrap colspan="1">
							<input name="BusinessPrice"
								value="<%=lwWholeSalePurePriceDto.getBusinessPrice()%>">
						</td>
						
						<td class="input" nowrap colspan="1">
							<input name="IndustryPrice"
								value="<%=lwWholeSalePurePriceDto.getIndustryPrice()%>">
						</td>
						
						<td class="input" nowrap colspan="1">
							<input name="FarmPrice"
								value="<%=lwWholeSalePurePriceDto.getFarmPrice()%>">
						</td>
						
						<td class="input" nowrap colspan="1">
							<input name="VoltLevel"
								value="<%=lwWholeSalePurePriceDto.getVoltLevel() %>">
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
							<input type=button class=button name=button1 value="�� ��"
								onClick="serchWholeSale();">
						</td>
						
						
					</tr>
				</table>




				


			</form>
			<script language="javascript">

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
	
	fm.action="/iacontact/savewholeSale.do";
	fm.submit();
}
</script>

			<br />
	</body>
</html>
</html:html>
