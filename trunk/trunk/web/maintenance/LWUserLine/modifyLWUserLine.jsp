<%--
*********
******************
�޸��û���·��Ӧ��Ϣҳ��  
create by wangrongjia
200810.09
--%>
<%@ page contentType="text/html; charset=GBK" %>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwUserLineDto"/>




  
<title></title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<html>
<head>

</head>
<body id="all_title">
  <div id="container">
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    <div id="content">
      <form name="fm" style="display:block;">
        <table width="100%" border="0">
         <tr class=listtitle align="center">
			<td class=title0 colspan="4"><B>�޸��û���·��Ӧ��ϵ</B></td>
		</tr>
          <tr>
          <%
          LwUserLineDto  lwUserLineDto=(LwUserLineDto)request.getAttribute("powerUser");
           %>
            <td class=title>����</td>
            <td class=input><input name="UserNo" type="text" class="text" value="<%=lwUserLineDto.getUserNo()%>" ><span class="warning">*</span></td>
             <td class=title>��·����</td>
            <td class=input><input name="LineCode" class="text" type="text"  value="<%=lwUserLineDto.getLineCode()%>"></td>
            <%--<td class=title>����</td>
            <td class=input><input name="UserName" type="text" class="text"  ></td>
          --%></tr>
		  <tr>
		 
			  <td class=title>Ч��״̬</td>
            <td class=input><input name="ValidStatus" type="radio"  value="1"<%if(lwUserLineDto.getValidStatus().equals("1")){ %>checked="checked"<%} %>/>��Ч
                <input name="ValidStatus" type="radio" value="0" <%if(lwUserLineDto.getValidStatus().equals("0")){ %>checked="checked"<%} %>/>��Ч<span class="warning">*</span></td>
           <td class=input></td>
		  <td class=input></td>
            
          
       </tr><%--
		  <tr>
		   <td class=title>��ע</td>
		  	<td class=input><input name="Remark" type="textfiled" class="text" value="xxxxxx" ></td>
		 
		  </tr>
        --%></table>
		
    <br />
<!--һ��ѵİ�ť-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td><input name="add" type="button" class="btn_add" value=" �� �� " onClick="javascript:addUserLine();"></td>
        <td><input name="reset" type="reset" class="btn_del" value=" �� �� "></td>
        <td><input name="back" type="button" class="btn_refresh" value="����" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>

  <script language="javascript">
function addUserLine(){

 fm.action="/iacontact/editLWUserLine.do";
 
 fm.submit();
}
</script>

</body>
</html>
