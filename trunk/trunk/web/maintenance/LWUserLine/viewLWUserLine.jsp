<%--
*********
******************
չʾ�û���·��Ӧ��Ϣҳ��  
create by wangrongjia
200810.09
--%>

<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwUserLineDto"/>
    <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>



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
<body id="all_title">
  <div id="container">
    <!--CONTENT BEGIN-->
    <div id="content">
      <form name="fm" >
        <table class="fix_table" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>��·�û���Ӧ��ϵ</B></td>
		</tr>
          
		<tr>
			<td nowrap><span class="title">ѡ��</span></td>
			<td nowrap><span class="title">����</span></td>
			<td nowrap><span class="title">����</span></td>
			<td nowrap><span class="title">��·����</span></td>
			<td nowrap><span class="title">�Ƿ���Ч</span></td>
			<td nowrap><span class="title">ע��</span></td>
			<td nowrap><span class="title">����</span></td>
		</tr>
		<%
	
		
		
	List userLinelist=(List)request.getAttribute("powerLine");
	Iterator it=userLinelist.iterator();
      while(it.hasNext()){
      	LwUserLineDto userLine=(LwUserLineDto)it.next();
 %>
		<tr>
			<td ><input  name="chooseUserLine" type="checkbox" value="<%=userLine.getUserNo()%>;<%=userLine.getLineCode()%>"></td>
			<td style="display:none"><input type="hidden" name="UserLine" value="'<%=userLine.getUserNo()%>'+;+'<%=userLine.getLineCode()%>'"></td>
			<td ><%=userLine.getUserNo()%></td>
			<td ><%=userLine.getUserName()%></td>
			<td ><%=userLine.getLineCode()%></td>
			<td ><%=userLine.getValidStatus()%></td>
			<td ><%=userLine.getRemark()%></td>
			<td ><a href="/iacontact/queryOneLWUserLine.do?UserLineNo='<%=userLine.getUserNo()%>'+;+'<%=userLine.getLineCode()%>'">�޸�</a></td>
		</tr>
		<%} %>
		
		<tr><td colspan="10" class="yui-dt-odd">��1ҳ/��1-10����120��  ��һҳ  βҳ </td></tr>
	</table>
  </div>

      <br />

  <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<%--<td class=button align="center">
					<input type=button class=button name=button1 value="��  ��"
						onClick="update();">
				</td>
				  --%><td class=button align="center">
					<input type=button class=button name=button8 value="ɾ  ��"
						onClick="delUserLine();">
				</td>
				<td class=button align="center">
					<input type=button class=button name=button0 value="������"
						onClick=history.go(-1);>
				</td>
			</tr>
		</table>
    </form>
<script language="javascript">

function addUserLine(){
	 this.location="LWUserLine/addLWUserLine.jsp";
	
	
	
}

function delUserLine(){

  var str="";
  var checkbox = document.getElementsByName("chooseUserLine");
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
    
  
	this.location="/iacontact/deleteLWUserLine.do?UserLineId="+str;
	 
	
	
}

//function delUser(){
	//alert("����ɾ����¼��");
//}

function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
}
function serchUserLine(){
	
	 this.location="/iacontact/queryLWUserLine.do";
	
}
</script>
<br />
  

</body>
</html>

