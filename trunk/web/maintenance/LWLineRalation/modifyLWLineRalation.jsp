<%--
*********
******************
�޸��û���Ϣҳ��  
create by wangrongjia
200810.09
--%>

<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Collection"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto"/>

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
    Collection LineRalation=(Collection)request.getAttribute("LineRalationcol");
    Iterator it=LineRalation.iterator();
    LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto=new LwLineCTPTAmmeterDto();
    if(it.hasNext()){
    lwLineCTPTAmmeterDto=(LwLineCTPTAmmeterDto)it.next();
    
    
    %>
        <table id="table_userMain" class="fix_table" border="0">
         <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>�޸��õ��û���Ϣ</B></td>
		</tr>
          <tr>
            <td class=title>��·����</td>
            <td class=input><%=lwLineCTPTAmmeterDto.getLineCode()%></td>
            <td class="long" style="display:none;"><input name="LineCode" type="text"  value="<%=lwLineCTPTAmmeterDto.getLineCode()%>" ></td>
            <td class=title>����������</td>
            <td class=input><input name="CTModus" type="text" class="text" value="<%=lwLineCTPTAmmeterDto.getCtModus()%>" ></td>
             <td class="long" style="display:none;"><input name="CTModusOld" type="text"  value="<%=lwLineCTPTAmmeterDto.getCtModus()%>" ></td>
          </tr>
		  <tr>
		  <td class=title>��ѹ������</td>
            <td class=input><input name="PTModus" type="text"  value="<%=lwLineCTPTAmmeterDto.getPtModus()%>"></td>
            <td class="long" style="display:none;"><input name="PTModusOld" type="text"  value="<%=lwLineCTPTAmmeterDto.getPtModus()%>" ></td>
			  <td class=title>���</td>
            <td class=input><input name="AmmeterNo" type="text"  value="<%=lwLineCTPTAmmeterDto.getAmmeterNo()%>"></td>
              <td class="long" style="display:none;"><input name="AmmeterNoOld" type="text"  value="<%=lwLineCTPTAmmeterDto.getAmmeterNo()%>" ></td>
          
            
          
       </tr>
       <tr>
       	  <td class=title>¼������</td>
            <td class=input><input name="inputDate" type="text"  value="<%=lwLineCTPTAmmeterDto.getInputDate()%>"></td>
       </tr>
		 
		  <%} %>
        </table>
		
    <br />
<!--һ��ѵİ�ť-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
       <td><input name="add" type="button" class="btn_add" value=" �� �� " onClick="javascript:addPowerUser();"></td>
        <td><input name="reset" type="reset" class="btn_del" value=" �� �� "></td>
        <td><input name="back" type="button" class="btn_refresh" value="����" onClick="javascript:history.go(-1);"></td>
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
function addPowerUser(){

 fm.action="/iacontact/editLWLineRalation.do";

 fm.submit();
}
</script>
</body>
</html>
