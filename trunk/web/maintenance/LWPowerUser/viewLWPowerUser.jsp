<%--
*********
******************
�޸��û���Ϣҳ��  
create by wangrongjia 2008.10.09
modify by qiaoyouliang 2008.11.03

--%>

<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<%@page import="com.elongway.pss.bl.facade.BLLwDcodeFacade"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.elongway.pss.dto.domain.LwDcodeDto"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterBookFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@page import="com.elongway.pss.dto.domain.LwProrateDto"%>
<%@page import="com.elongway.pss.dto.domain.LwBookUserDto"%>
<%@page import="com.elongway.pss.dto.domain.LwUserLineDto"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterChangeDto"%>

<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>�������ѯҳ��</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

<script type="text/javascript">

</script>
<!--�Զ������б�JS2-->

</head>
<body id="all_title">
  <div id="container">
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    <div id="content">
   
      <form name="fm" >
       <% 
    LwPowerUserDto  lwPowerUserDto=(LwPowerUserDto)request.getAttribute("lwPowerUserDto");
    %>
          <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="4"><B>�޸��õ��û���Ϣ</B></td>
		</tr>
          <tr>
            <td class=title  style="width:120px" >����</td>
            <td class=input><%=lwPowerUserDto.getUserNo()%>
            <input name="userNo" type="hidden" class="text" value="<%=lwPowerUserDto.getUserNo()%>" ></td>
            <td class=title>����</td>
            <td class=input><input name="userName" readOnly=true type="text" class="text"  style="width:120px" value="<%=lwPowerUserDto.getUserName()%>" ></td>
          </tr>
		  <tr>
		  <td class=title >��ַ</td>
            <td class=input><input name="address" readOnly=true type="text"  value="<%=lwPowerUserDto.getAddress()%>" class="text"></td>
              <% BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
             Collection collection = blLwDcodeFacade.findByConditions(" codetype = 'TownCode'");       
       %>
            
			<td class=title>��������</td>
		  	<td class=input><select name="townCode"  class="input" disabled>
		  	<% for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwDcodeDto o = (LwDcodeDto) iterator.next();
			
			    if(lwPowerUserDto.getTownCode().equals(o.getCodeCode())){%>
				  <option value=<%=o.getCodeCode() %> selected="selected"><%=o.getCodeCName() %></option> 
			<%}else{%>
			<option value=<%=o.getCodeCode() %>><%=o.getCodeCName() %></option> 
			<% }}%>    
       </select>	 
       </td>          
       </tr>
		  	  <tr>
		  
  <% 
     Collection bookList = (Collection)request.getAttribute("bookList");  
     LwBookUserDto lwUserBookDto = (LwBookUserDto)request.getAttribute("lwBookUserDto");  
   
     String bookNo = lwUserBookDto.getBookNo();
       %>
		  
		  <td class=title>��������</td>
		  	<td class=input><select name="bookNo"  class="input" disabled>
		  	<% for (Iterator iterator = bookList.iterator(); iterator.hasNext();) {
			LwAmmeterBookDto o = (LwAmmeterBookDto) iterator.next();
			
			if(bookNo.equals(o.getBookNo())){
			%>
				  <option value=<%=o.getBookNo() %> selected="selected"><%=o.getBookName()%></option> 
			<%}else{ %>    
			  <option value=<%=o.getBookNo() %>><%=o.getBookName()%></option> 
			  <%}} %>
       </select>	


</td>
		  
		   <td class=title>������·</td>
            <td class=input><input name="lineCode" readOnly=true type="text" ondblclick="codeQueryLine(this)"
							onkeyup="codeQueryLine(this)" class="codecode" value=<%=lwPowerUserDto.getLineCode() %> ></td>
		  </tr>
		  	 <tr>
		
 <% Collection salePriceList = blLwDcodeFacade.findByConditions(" codetype = 'SaleLevel'"); 
       %>
		  
         <td class=title>��ѹ�ȼ�</td>
            <td class=input><select name="voltLevel"  class="input" disabled>
		  	<% for (Iterator iterator = salePriceList.iterator(); iterator.hasNext();) {
			LwDcodeDto o = (LwDcodeDto) iterator.next();
			if(o.getCodeCode().equals(lwPowerUserDto.getSaleVoltLevel())){
			%>
			 
			  <option value=<%=o.getCodeCode() %> selected="selected"><%=o.getCodeCName()%></option> 
			  <%} else{%>
			    <option value=<%=o.getCodeCode() %>><%=o.getCodeCName()%></option> 
			    <%}} %>
       </select>	


</td>
	<%Collection<LwDcodeDto> comList = blLwDcodeFacade.findByConditions(" codetype = 'SupplyCom'"); %>
          <td class=title>�����</td>
             <td class=input><select name="company"  class="input" disabled>
		  	<% for (Iterator iterator = comList.iterator(); iterator.hasNext();) {
			LwDcodeDto o = (LwDcodeDto) iterator.next();
			if(o.getCodeCode().equals(lwPowerUserDto.getSuperClass())){
			%>
			 
			  <option value=<%=o.getCodeCode() %> selected="selected" ><%=o.getCodeCName()%></option> 
			  <%}else{ %>
			  <option value=<%=o.getCodeCode() %>  ><%=o.getCodeCName()%></option> 
			  
			  <%}} %>
       </select>	


</td>
          </tr>
		  
        </table>
       	<table width="100%">
   <tr class=listtitle align="center">
			<td class=title0 colspan="9"><B>���õ����Ϣ</B></td>
		</tr>
		
	<%LwAmmeterChangeDto ammeter = (LwAmmeterChangeDto)request.getAttribute("lwAmmeterChangeDto"); %>
		<tr>			
			<td class="title" align="center">��</td>
			<td class="title" align="center">��ѹ</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">�ͺ�</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">���</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">����</td>
		</tr>
				
		<tr>
			<td class="title"  align="center"><%=ammeter.getAmmeterX() %></td>
			<td class="title"  align="center"><%=ammeter.getAmmeterV() %></td>
			<td class="title"  align="center"><%=ammeter.getAmmeterA() %></td>
			<td class="title"  align="center"><%=ammeter.getAmmeterType() %></td>
			<td class="title"  align="center"><%=ammeter.getFactoryName() %></td>
			<td class="title"  align="center"><%=ammeter.getAmmeterNo() %></td>
			<td class="title"  align="center"><%=ammeter.getCoust() %></td>
			<td class="title"  align="center"><%=ammeter.getPrecision() %></td>
			<td class="title"  align="center"><%=ammeter.getRate() %></td>
		</tr>
	
		
	</table>
         <table width="100%">
		<tr class=listtitle align="center">
			<td class=title0 colspan="9"><B>�û�������̯��Ϣ</B></td>
		</tr>
		<%LwProrateDto lwProrateDto = (LwProrateDto)request.getAttribute("lwProrateDto"); %>

		<tr>
			<td  align="center" class="title">��������</td>
			<td  align="center" class="title">�Ǿ�������</td>
			<td  align="center" class="title">ƶ����ũҵ�Ź�</td>
			<td  align="center" class="title">ũҵ����</td>
			<td  align="center" class="title">��ҵ</td>
			<td  align="center" class="title">���չ�ҵ</td>		
		</tr>
				
		<tr>
			<td class="title"  align="center"><input name="people" type="text" readOnly=true class="text" width="20" value=<%=lwProrateDto.getResident() %>></td>
			<td class="title"  align="center"><input name="notPeople" type="text" readOnly=true class="text" width="20" value=<%=lwProrateDto.getIndecisive() %>></td>
			<td class="title"  align="center"><input name="farm" type="text"  readOnly=trueclass="text" width="20" value=<%=lwProrateDto.getAgricultural()%>></td>
			<td class="title"  align="center"><input name="produce" type="text" readOnly=true class="text" width="20" value=<%=lwProrateDto.getProduce() %>></td>		
			<td class="title"  align="center"><input name="business" type="text" readOnly=true class="text" width="20" value=<%=lwProrateDto.getBusiness() %>></td>
			<td class="title"  align="center"><input name="notFactory" type="text" readOnly=true class="text" width="20" value=<%=lwProrateDto.getIndustry() %>></td>
				
		</tr>
	</table>
		
    <br />
<!--һ��ѵİ�ť-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="back" type="button" class=button value="����" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>
</div>
<!--Button End-->
</form>
<br />
    </div>
    <!--CONTENT OVER-->
  </div>

<script language="javascript">
function industryType1(){

if(fm.UserStyle.value== "1"){
 
 aaa.style.display = "none"; 
 bbb.style.display = "none";
}
if(fm.UserStyle.value== "3"){
 
 aaa.style.display = "none"; 
 bbb.style.display = "none";
}
 if(fm.UserStyle.value== "2"){
 aaa.style.display = ""; 
 bbb.style.display = "";
}
}
function updatePowerUser(){
var people = fm.people.value;
	var notPeople = fm.notPeople.value;
	var business = fm.business.value;
	var notFactory = fm.notFactory.value;
	var produce = fm.produce.value;
	var farm = fm.farm.value;
	var sum = parseFloat(people)+parseFloat(notPeople)+parseFloat(business) + parseFloat(notFactory)+parseFloat(produce) + parseFloat(farm);


if(sum!=1)
	{
	if(!confirm('���û��ı�����̯����100%���Ƿ���Ҫ���������޸ģ�')){
	 return false;
	}else{
	 fm.action="/iacontact/editLWPowerUser.do";
 fm.submit();	
	}}else{
	if(!confirm('ȷ�������޸ģ�')){
	 return false;
	}else{
	 fm.action="/iacontact/editLWPowerUser.do";
 fm.submit();	
	}
	}



}
function codeQueryLine(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.lineCode.value+"&TableName=LwPowerLine1";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
</body>
</html>
