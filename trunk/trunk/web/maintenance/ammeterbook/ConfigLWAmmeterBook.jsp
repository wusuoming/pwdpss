
<%@ page contentType="text/html; charset=GBK"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@page import="com.elongway.pss.dto.domain.LwPowerUserDto"%>
<%@page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">

<title>���ñ�ҳ��</title>
<link rel="stylesheet" type="text/css" media="all" href="/iacontact/css/calendar.css" title="win2k-cold-1" /> 
<app:css />
<html:base />
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
<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
<script language="javascript"	src="/iacontact/common/pub/js/calendar.js"></script>


<!--�Զ������б�JS2-->

</head>
<%LwAmmeterBookDto dto = (LwAmmeterBookDto)request.getAttribute("bookDto"); %>
<body id="all_title">
  
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    
      <form name="fm" style="display:block;" method="post">
         <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>���ñ�ҳ��</B></td>
		</tr>
          <tr>
            <td class=title>����</td>
            <td class=input><%=dto.getBookNo() %>  <input name="BookNo" type="hidden"  class="text" value=<%=dto.getBookNo() %>></td>
       
            <td class=title>����</td>
            <td class=input><%=dto.getBookName() %><input name="BookName" type="hidden"  class="text" value=<%=dto.getBookName() %>></td>
          </tr>
		  <tr>
		  <td class=title>������</td>
            <td class="input"><select name="BookType"  class="select" disabled="disabled">
            <%if("1".equals(dto.getBookType())) {%>
            
				  <option value="1" selected="selected" disabled="disabled">ֱ����</option>	
			<%   }			else  if("2".equals(dto.getBookType())) {%>	 
				  <option value="2" selected="selected" disabled="disabled">����</option>
				  <%   }	else {%>
				  <option value="3" selected="selected" disabled="disabled">��ҵ</option><%} %>
              </select>	
            </td>
		   <td class=title>�Ƿ���Ч</td>
            <td class="input"><select name="ValidStatus"  class="select" disabled="disabled">
            <%if("1".equals(dto.getValidStatus())) {%>
				  <option value="1" selected="selected" disabled="disabled">��Ч</option>	
				  <%}else{ %>			  
				  <option value="0" disabled="disabled">��Ч</option>
				  <%} %>
              </select>	
            </td>
           
       </tr>
         <tr>
		  <td class=title>��ע</td>
            <td class="input" colspan="3"><textarea rows="3" cols="129" name="Remark" disabled="disabled"><%=dto.getRemark() %></textarea>
            </td>
		 
       </tr>
		      
        </table>
         <table table class=common width="100%" cellspacing="1" cellpadding="5" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>�õ��û���Ϣ</B></td>
		</tr>

		<tr class=listtitle>
			<td nowrap><span class="select">ѡ��</span></td>
			<td nowrap ><span class="title">����</span></td>
			<td nowrap ><span class="title">����</span></td>
			<td nowrap ><span class="title">��ַ</span></td>
			<td nowrap ><span class="title">��������</span></td>
			<td nowrap ><span class="title">���</span></td>
			
			
			
		</tr>
		<%
	
	List userlist=(List)request.getAttribute("allList");
	
	Iterator it=userlist.iterator();
      while(it.hasNext()){
      	LwPowerUserDto 	 user=(LwPowerUserDto)it.next();
      	String flag = user.getFlag();
      	
 %>
		<tr>
		
			<td class="select" nowrap colspan="1">
			<%if("1".equals(flag)){ %>
			<input  name="checkboxSelect" type="checkbox" value="<%=user.getUserNo()%>" checked="checked">
			<%}else{ %>
			<input  name="checkboxSelect" type="checkbox" value="<%=user.getUserNo()%>" >
			<% }%>
			</td>
			
			<td class="input" nowrap colspan="1"><%=user.getUserNo()%></td>
			<td class="input" nowrap colspan="1"><%=user.getUserName()%></td>
			<td class="input" nowrap colspan="1"><%=user.getAddress()%></td>
			<td class="input" nowrap colspan="1"><%=user.getTownCode()%></td>
			<%--<td class="input" nowrap colspan="1"><%=userLine.getLineCode()%></td>
			--%>
			<td class="input" nowrap colspan="1" width="30"><input name="SerialNo" type="text"  class="text" value=<%= user.getSerialNo()%>></td>
			
			
	
		</tr>
		<%} %>
		
		<%--<tr><td colspan="10" >��1ҳ/��1-10����120��  ��һҳ  βҳ </td></tr>
	--%></table>
		
    <br />
<!--һ��ѵİ�ť-->

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" �� �� " onClick="javascript:updateConfig();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" �� �� "></td>
        --%><td class=button><input name="back" type="button" class=button value="�� ��" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function updateConfig(){
 fm.action="<%=request.getContextPath()%>/updateConfig.do?flag=update";
fm.submit();
}
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
 function codeQuery(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.LineCode.value+"&TableName=LwPowerLine1";
	alert(vURL);
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
</body>
</html:html>
