<%--
*********
******************
��ѯ�û���Ϣҳ��  
create by wangrongjia
200810.09
--%>

<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwindicatorDto"/>
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
			<td class=title0 colspan="6"><B>���ָ����Ϣ</B></td>
		</tr>

          <tr>
            <td class="title">��·����</td>
            <td class=input><input styleClass="text" name="LINECODE" type="text"  ></td>
			<td class="title">���</td>
           <td class=input><input styleClass="text" name="AMMETERNO" type="text"   ></td>
          </tr>
        
		  <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" �� ѯ " onClick="javascript:serchUser();"></td>
		  <td class=button align="center"><input class=button name="add" type="button"  value=" �� �� " onClick="javascript:addUser();"></td>
</tr>
        </table>
      
     <br />

	
	
	<table>
		<tr class=listtitle>
			<td nowrap><span class="select">ѡ��</span></td>
			<td nowrap><span class="title">��·����</span></td>
			<td nowrap><span class="title">���</span></td>
			<td nowrap><span class="title">�����й�ָ��</span></td>
			<td nowrap><span class="title">�����޹�ָ��</span></td>
			<td nowrap><span class="title">�����·�</span></td>
			
			
		</tr>
		<%
	
		
		
	List LwindicatorDtolist=(List)request.getAttribute("indicatorcol");
	Iterator it=LwindicatorDtolist.iterator();
      while(it.hasNext()){
      	LwindicatorDto  lwindicatorDto=(LwindicatorDto)it.next();
 %>
		<tr>
			<td class="select" nowrap colspan="1"><input  name="chooseindicator" type="checkbox" value="<%=lwindicatorDto.getLineCode()%>;<%=lwindicatorDto.getStatMonth()%>"></td>
			<td class="input" nowrap colspan="1"><%=lwindicatorDto.getLineCode()%></td>
			<td style="display:none"><input type="hidden" name="indicatorId" value="<%=lwindicatorDto.getLineCode()%>"></td>
			<td class="input" nowrap colspan="1"><%=lwindicatorDto.getAmmeterNo()%></td>
			<td class="input" nowrap colspan="1"><%=lwindicatorDto.getThisWorkNum()%></td>
			<td class="input" nowrap colspan="1"><%=lwindicatorDto.getThisIdleNum()%></td>
			<td class="input" nowrap colspan="1"><%=lwindicatorDto.getStatMonth()%></td>
			
	
		</tr>
		<%} %>
		
		<%--<tr><td colspan="10" >��1ҳ/��1-10����120��  ��һҳ  βҳ </td></tr>
	--%></table>
	


      <br />
      

 
    <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="��  ��"
						onClick="addLine();">
				</td>
				 <td class=button align="center">
					<input type=button class=button name=button8 value="ɾ  ��"
						onClick="delUserLine();">
				</td>
				<td class=button align="center">
					<input type=button class=button name=button0 value="������"
						onClick="addUser();">
				</td>
			</tr>
		</table>
    </form>
<script language="javascript">

function addUser(){
	fm.action="LWindicator/addLWindicator.jsp";
	fm.submit();
	
	
}

function delUserLine(){

  var str="";
  var checkbox = document.getElementsByName("chooseindicator");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!��ѡ��Ҫɾ�����û�");
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
	this.location="/iacontact/deleteLWindicator.do?indicatorId="+str;
	 }
	}
	
}


//function delUser(){
	//alert("����ɾ����¼��");
//}

function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
}
function serchUser(){
	
	fm.action="/iacontact/queryLWPowerUser.do";
	fm.submit();
}
function addLine(){
var str="";
  var checkbox = document.getElementsByName("chooseindicator");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!��ѡ��Ҫ �޸ĵ��û�");
 }
 if(n>1){
  alert("!һ��ֻ���޸�һ���û�");
 }
 else{
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
      
	this.location="/iacontact/queryOneLWindicator.do?indicatorId="+str;
	 
	}

	
}
</script>
<br />
  

</body>
</html>
</html:html>
