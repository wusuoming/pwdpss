<%--
*********
******************
չʾ��·��Ϣҳ��  
create by wangrongjia
200810.09
--%>
<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerLineDto"/>
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
   
      <form name="fm" >
        <table class="fix_table" border="0">
         <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>��·��Ϣ</B></td>
		</tr>
          <%--<tr>
            <td class="title">��·����</td>
            <td class=input><input name="LineCode" type="text"  ></td>
			<td class="title">��·��������</td>
           <td class=input><input name="LineCName" type="text"   ></td>
          </tr>
          <tr>
            <td class="title">�ɷѹ�������</td>
            <td class=input><input name="FeeCom" type="text"  value="" ></td>
			<td class="title">����������˾</td>
            <td class=input><input name="ComCode" type="text"  value="" ></td>
          </tr>
		  <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" �� ѯ " onClick="javascript:serchLine();"></td>
		  <td class=button align="center"><input class=button name="add" type="button"  value=" �� �� " onClick="javascript:addLine();"></td></td>
</tr>
        </table>
     
 
	<table>
		--%>
		<tr>
		    <td nowrap><span class="title">ѡ��</span></td>
			<td nowrap><span class="title">��·����</span></td>
			<%--<td nowrap><span class="title">��·��������</span></td>
			<td nowrap><span class="title">��·Ӣ������</span></td>
			--%><td nowrap><span class="title">�ɷѹ�������</span></td>
			<td nowrap><span class="title">����������˾</span></td>
			<td nowrap><span class="title">����Ŀ��</span></td>
			<td nowrap><span class="title">��������</span></td>
			<td nowrap><span class="title">����������</span></td>
			<td nowrap><span class="title">��ѹ������</span></td>
			<td nowrap><span class="title">��ѹ�ȼ�</span></td>
			<%--<td nowrap><span class="title">��������</span></td>
			<td nowrap><span class="title">��Ͽ������</span></td>
			<td nowrap><span class="title">��ʧ����</span></td>
			--%><%--<td nowrap><span class="title">�۸����</span></td>
			--%><%--<td nowrap><span class="title">��ʧ��־</span></td>
			--%><%--<td nowrap><span class="title">����</span></td>
			--%><td nowrap><span class="title">ע��</span></td>
			<td nowrap><span class="title">����</span></td>
		</tr>
		<% 
		List linelist=(List)request.getAttribute("powerLine");
		
		
	Iterator it=linelist.iterator();
      while(it.hasNext()){
      	LwPowerLineDto line=(LwPowerLineDto)it.next();
      	 %>
		<tr>
			<td ><input  name="chooseLine" type="checkbox" value="<%=line.getLineCode()%>"></td>
			<td style="display:none"><input type="hidden" name="LineId" value="<%=line.getLineCode()%>"></td>
			<td><%=line.getLineCode()%></td>
			<%--<td ><%=line.getLineCName()%></td>
			<td ><%=line.getLineEName()%></td>
			--%><td ><%=line.getFeeCom()%></td>
			<td ><%=line.getComCode()%></td>
			<td ><%=line.getTargetCode()%> </td>
			<td ><%=line.getSupplyType()%></td>
			<td ><%=line.getCt()%></td>
			<td ><%=line.getPt()%></td>
			<td ><%=line.getVoltLevel()%></td>
			<%--<td ><%=line.getSiFeLoss()%></td>
			--%><%--<td ><%=line.getSanXiaLoss()%></td>
			--%><%--<td ><%=line.getLossProp()%></td>
			--%><%--<td ><%=line.getPriceCategory()%></td>
			--%><%--<td ><%=line.getLossFlag()%></td>
			--%><%--<td ><%=line.getRate()%></td>
			--%><td ><%=line.getRemark() %></td>
			<td ><a href="/iacontact/queryOneLWPowerLine.do?LineCode=<%=line.getLineCode()%>">�޸�</a></td>
		</tr>
		<%} %>
		<tr><td colspan="20" class="yui-dt-odd">��1ҳ/��1-10����120��  ��һҳ  βҳ </td></tr>
	</table>
 

   

  
    <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<%--<td class=button align="center">
					<input type=button class=button name=button1 value="��  ��"
						onClick="update();">
				</td>
				  --%><td class=button align="center">
					<input type=button class=button name=button8 value="ɾ  ��"
						onClick="delLine();">
				</td>
				<td class=button align="center">
					<input type=button class=button name=button0 value="������"
						onClick=history.go(-1);>
				</td>
			</tr>
		</table>
     </form>

<script language="javascript">

function addLine(){
	fm.action="/LWPowerLine/addLWPowerLine.jsp";
	fm.submit();
	
	
}

function delLine(){

  var str="";
  var checkbox = document.getElementsByName("chooseLine");
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
   
	this.location="/iacontact/deleteLWPowerLine.do?LineId="+str;
	 
	
	
}

//function delUser(){
	//alert("����ɾ����¼��");
//}

function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
}
function serchLine(){
	
	fm.action="/iacontact/queryLWPowerLine.do";
	fm.submit();
}
</script>
<br />
    </div>
    <!--CONTENT OVER-->
 

</body>
</html>
