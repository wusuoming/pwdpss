<%--
*********
******************
修改用户信息页面  
create by wangrongjia
200810.09
--%>

<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Collection"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwindicatorDto"/>

<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>电表管理查询页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

<script type="text/javascript">

</script>
<!--自动下拉列表JS2-->

</head>
<body id="all_title">
  <div id="container">
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    <div id="content">
   
      <form name="fm" >
       <% 
   LwindicatorDto lwindicatorDto=(LwindicatorDto)request.getAttribute("lwindicatorDto");
    
    
    %>
        <table id="table_userMain" class="fix_table" border="0">
         <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>修改指针记录信息</B></td>
		</tr>
          <tr>
            <td class=title>线路代码</td>
            <td class=input><%=lwindicatorDto.getLineCode()%></td>
            <td class="long" style="display:none;"><input name="LineCode" type="text"  value="<%=lwindicatorDto.getLineCode()%>" ></td>
           <td class=title>表号</td>
            <td class=input><input name="AmmeterNo" type="text" class="text" value="<%=lwindicatorDto.getAmmeterNo()%>" ></td><%--
             <td class="long" style="display:none;"><input name="AmmeterNo" type="text"  value="<%=lwLineCTPTAmmeterDto.getCtModus()%>" ></td>
          --%></tr>
		  <tr>
		  <td class=title>当月有功指针</td>
            <td class=input><input name="ThisWorkNum" type="text"  value="<%=lwindicatorDto.getThisWorkNum()%>"></td><%--
            <td class="long" style="display:none;"><input name="ThisWorkNum" type="text"  value="<%=lwLineCTPTAmmeterDto.getPtModus()%>" ></td>
			  --%><td class=title>当月无攻指针</td>
            <td class=input><input name="ThisIdleNum" type="text"  value="<%=lwindicatorDto.getThisIdleNum()%>"></td><%--
              <td class="long" style="display:none;"><input name="AmmeterNoOld" type="text"  value="<%=lwLineCTPTAmmeterDto.getAmmeterNo()%>" ></td>
          
            
          
       --%></tr>
       <tr>
       	  <td class=title>录入日期</td>
            <td class=input><input name="StatMonth" type="text"  value="<%=lwindicatorDto.getStatMonth()%>"></td>
       </tr>
		 
		  
        </table>
		
    <br />
<!--一大堆的按钮-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
       <td><input name="add" type="button" class="btn_add" value=" 保 存 " onClick="javascript:addPowerUser();"></td>
        <td><input name="reset" type="reset" class="btn_del" value=" 重 置 "></td>
        <td><input name="back" type="button" class="btn_refresh" value="返回" onClick="javascript:history.go(-1);"></td>
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

 fm.action="/iacontact/editLWindicator.do";
fm.submit();
 
}
</script>
</body>
</html>
