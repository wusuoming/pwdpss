<%--
*********
******************
��ѯ�û���Ϣҳ��  
create by wangrongjia
200810.09
--%>

<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwptDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwctDto"/>
    <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>��ѯҳ��</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>�õ��û���ѯҳ��</title>
<app:css />
<html:base />
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

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
    
      <form name="fm" style="display:block;">
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>��ѹ��������Ϣ</B></td>
		</tr>

          <tr>
            <td class="title">��ʽ</td>
            <td class=input><input styleClass="text" name="Modus" type="text"  ></td>
			
           <td class=input></td>
            <td class=input></td>
          </tr><%--
          <tr>
            <td class="title">��ַ</td>
            <td class=input><input styleClass="text" name="Address" type="text"  value="" ></td>
			<td class="title">Ч��״̬</td>
            <td class=input><input styleClass="text" name="ValidStatus" type="radio"  value="1">��Ч
                <input styleClass="blue" name="ValidStatus" type="radio" value="0">��Ч</td>
          </tr>
		  <tr>
		   <td class="title">��������</td>
            <td class=input><input styleClass="text" name="TownCode" type="text"  value="" ></td>			 
			 <td class="title"></td>
			 <td class="input"></td>
			 
		  </tr>
		
		  
--%>
        </table>
        <table cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td class=button align="center"><input type=button class=button name=button0 value=" �� ѯ " onClick="serchCT();"></td>
		</tr>
	</table>
      
     <br />

	
	
	<form name="fm1" >
        <table table class=common width="100%" cellspacing="1" cellpadding="5" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="10"><B>��ѹ��������Ϣ</B></td>
		</tr>

		<tr class=listtitle>
			<td nowrap><span class="title">ѡ��</span></td>
			<td nowrap ><span class="title">��ʽ</span></td>
			<td nowrap ><span class="title">������</span></td>
			<td nowrap ><span class="title">����</span></td>
			<td nowrap ><span class="title">����</span></td>
			<td nowrap ><span class="title">����A</span></td>
			<td nowrap ><span class="title">����B</span></td>
			<td nowrap ><span class="title">����C</span></td>
			<td nowrap ><span class="title">¼������</span></td>
			<td nowrap ><span class="title">�Ƿ���Ч</span></td>
			
		</tr>
		<%
	
		
		
	List CTcol=(List)request.getAttribute("CTcol");
	Iterator it=CTcol.iterator();
      while(it.hasNext()){
      	LwctDto CT=(LwctDto)it.next();
 %>
		<tr>
			<td class="input" nowrap colspan="1"><input  name="chooseCT" type="checkbox" value="<%=CT.getModus()%>"></td>
			<td style="display:none"><input type="hidden" name="CTId" value="<%=CT.getModus()%>"></td>
			<td class="input" nowrap colspan="1"><%=CT.getModus()%></td>
			<td class="input" nowrap colspan="1"><%=CT.getCt()%></td>
			<td class="input" nowrap colspan="1"><%=CT.getFactoryName()%></td>
			
			<td class="input" nowrap colspan="1"><%=CT.getExact()%></td>
			
			<td class="input" nowrap colspan="1"><%=CT.getFctoryCodeA()%></td>
			<td class="input" nowrap colspan="1"><%=CT.getFctoryCodeB()%></td>
			<td class="input" nowrap colspan="1"><%=CT.getFctoryCodeC()%></td>
			<td class="input" nowrap colspan="1"><%=CT.getImportDate() %></td>
			<%
			if(CT.getValidStatus().equals("1")){
			 %>
			<td class="input" nowrap colspan="1">��Ч</td>
			<%} %>
			<%
			if(CT.getValidStatus().equals("0")){
			 %>
			<td class="input" nowrap colspan="1">��Ч</td>
			<%} %>
			
			
			<%--<td class="input" nowrap colspan="1"><%=PT.getFlag()%></td>
			
		
			
	
		--%></tr>
		<%} %>
		
		<%--<tr><td colspan="10" >��1ҳ/��1-10����120��  ��һҳ  βҳ </td></tr>
	--%></table>
	


 
      

 
    <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="��  ��"
						onClick="update();">
				</td>
				  <td class=button align="center">
					<input type=button class=button name=button8 value="ɾ  ��"
						onClick="delCT();">
				</td>
				  <td class=button align="center"><input class=button name="add" type="button"  value=" �� �� " onClick="javascript:addCT();"></td>
			</tr>
		</table>
    </form>
<script language="javascript">

function addCT(){
	fm.action="LWCT/addLWCT.jsp";
	fm.submit();
	
	
}

function delCT(){

  var str="";
  var checkbox = document.getElementsByName("chooseCT");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!��ѡ��Ҫɾ���ĵ�ѹ������");
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
	this.location="/iacontact/deleteLWCT.do?CTId="+str;
	 }
	}
	
}
function update(){
 var str="";
  var checkbox = document.getElementsByName("chooseCT");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!��ѡ��Ҫ �޸ĵĵ�ѹ������");
  return false;
 }
 if(n>1){
  alert("!һ��ֻ���޸�һ����ѹ������");
  return false;
 }
 else{
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
      
	this.location="/iacontact/queryOneLWCT.do?CTId="+str;
	 
	}

}
//function delUser(){
	//alert("����ɾ����¼��");
//}

function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
}
function serchCT(){
	
	fm.action="/iacontact/queryLWCT.do";
	fm.submit();
}

</script>

<br />
  

</body>
</html>
</html:html>
