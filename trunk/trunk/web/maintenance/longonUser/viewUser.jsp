<%--
*********
******************
��ѯ��·��Ϣҳ��  
create by wangrongjia
200810.09
--%>
<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerLineDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwSysUserDto"/>
 <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>


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

<body id="all_title">
  <div id="container">
    <!--CONTENT BEGIN-->
    <div id="content">
      <form name="fm" style="display:block;">
        <table cellpadding="0" cellspacing="0" width="100%">
         <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>��ѯ�û���Ϣ</B></td>
		</tr>
          <tr>
            <td class="title">�û���½��</td>
            <td class=input><input name="USERCODE" type="text"  class="text"></td>
			<td class="title">�û�����</td>
           <td class=input><input name="USERNAME" type="text"  class="text" ></td>
          </tr><%--
          
		  

--%><table cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td class=button align="center"><input type=button class=button name=button0 value=" �� ѯ " onClick="serchLine();"></td>
		</tr>
	</table>
        </table>
      </form>
   <form name="fm1" >
        <table class="fix_table" border="0" width="100%">
         <tr class=listtitle align="center">
			<td class=title0 colspan="5"><B>��½�û���Ϣ</B></td>
		</tr>
     
 
	
	
		<tr class=listtitle>
		    <td nowrap><span class="select">ѡ��</span></td>
			<td nowrap><span class="title">�û���½��</span></td>
			
			<td nowrap><span class="title">�û�����</span></td>
			<td nowrap><span class="title">�Ƿ���Ч</span></td>
			<td nowrap><span class="title">�û�Ȩ��</span></td>
		
			</tr>
		<% 
		List linelist=(List)request.getAttribute("logonUser");
		
		
	Iterator it=linelist.iterator();
      while(it.hasNext()){
      	LwSysUserDto lwSysUserDto=(LwSysUserDto)it.next();
      	 %>
		<tr>
			<td class="select" nowrap colspan="1"><input  name="chooseLine" type="checkbox" value="<%=lwSysUserDto.getUserCode()%>"></td>
			<td style="display:none"><input type="hidden" name="LineId" value="<%=lwSysUserDto.getUserCode()%>"></td>
			<td class="input" nowrap colspan="1"><%=lwSysUserDto.getUserCode()%></td>
			<td class="input" nowrap colspan="1"><%=lwSysUserDto.getUserName()%></td>
			<%--<td ><%=line.getLineCName()%></td>
			<td ><%=line.getLineEName()%></td>
			--%><%--<td class="input" nowrap colspan="1"><%=line.getFeeCom()%></td>
			--%><%--<td class="input" nowrap colspan="1"><%=line.getComCode()%></td>
			--%><%--<td class="input" nowrap colspan="1"><%=line.getTargetCode()%> </td>
			--%><%--<td class="input" nowrap colspan="1"><%=line.getSupplyType()%></td>
			--%><%--<td class="input" nowrap colspan="1"><%=line.getCt()%></td>
			<td class="input" nowrap colspan="1"><%=line.getPt()%></td>
			
			--%>
			<%
			if(lwSysUserDto.getValidStatus().equals("0")){
			 %>
			<td class="input" nowrap colspan="1">��Ч</td>
			<%} %>
			<%
			if(lwSysUserDto.getValidStatus().equals("1")){
			 %>
			<td class="input" nowrap colspan="1">��Ч</td>
			<%} %>
			<%
			if(lwSysUserDto.getUserGrade().equals("1")){
			 %>
			<td class="input" nowrap colspan="1">ϵͳ����Ա</td>
			<%} %>
			<%
			if(lwSysUserDto.getUserGrade().equals("2")){
			 %>
			<td class="input" nowrap colspan="1">��ҵ</td>
			<%} %>
			<%
			if(lwSysUserDto.getUserGrade().equals("3")){
			 %>
			<td class="input" nowrap colspan="1">ֱ����</td>
			<%} %>
			<%
			if(lwSysUserDto.getUserGrade().equals("4")){
			 %>
			<td class="input" nowrap colspan="1">����</td>
			<%} %>
			<%--<td ><%=line.getSiFeLoss()%></td>
			--%><%--<td ><%=line.getSanXiaLoss()%></td>
			--%><%--<td ><%=line.getLossProp()%></td>
			--%><%--<td ><%=line.getPriceCategory()%></td>
			--%><%--<td ><%=line.getLossFlag()%></td>
			--%><%--<td ><%=line.getRate()%></td>
			--%><%--s
			
		--%></tr>
		<%} %>
		<%--<tr><td colspan="20" class="yui-dt-odd">��1ҳ/��1-10����120��  ��һҳ  βҳ </td></tr>
	--%></table>
 

   

  
    <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="��  ��"
						onClick="addLine();">
				</td>
				 <td class=button align="center">
					<input type=button class=button name=button8 value="ɾ  ��"
						onClick="delLine();">
				</td>
				<td class=button align="center">
					<input type=button class=button name=button0 value="������"
						onClick="addUser();">
				</td>
			</tr>
		</table>
     </form>
<script language="javascript">

function addLine(){
var str="";
  var checkbox = document.getElementsByName("chooseLine");
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
  alert("һ��ֻ���޸�һ���û���");
  return false;
 }
 else{
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
      
	this.location="/iacontact/UIviewOneSysuserAciton.do?UserLineNo="+str;
	 
	}

	
}
function addUser(){
fm.action="addUser.jsp";
fm.submit();
}
function delLine(){

  var str="";
  var checkbox = document.getElementsByName("chooseLine");
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
	this.location="/iacontact/UIDeleteUserAction.do?UserLineNo="+str;
	 }
	}
	
	
}

//function delUser(){
	//alert("����ɾ����¼��");
//}

function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
}
function serchLine(){
	
	fm.action="/iacontact/UIviewsysUserAction.do";
	fm.submit();
}
function codeQuery(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.ComCode.value+"&TableName=Lwdcompany1";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
<br />
    </div>
    <!--CONTENT OVER-->
  </div>

</body>
</html>
