<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@page import="java.text.*"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Collection"%>




<html>
<head>
  <title>代码查询显示列表</title>
  <app:css/>
  <html:base/>
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
<body class="interface">
  <html:errors/>
<form name="fm">
  <table class=common width="100%" cellspacing="1" cellpadding="5">
    <thead>
      <tr>
    	  <td class="title0" colspan="2"><B>代码查询显示列表</B></td>
    	</tr>
    </thead>
    <tbody>
      <tr class=title >
        <td class="input">代码</td>
        <td class="input">名称</td>
      </tr>

      <logic:iterate id="ls" name="list">
      <tr class="oddrow" >
        <td class="input"><a href="" onclick="test('<bean:write name="ls" property="codeCode"/>')"><bean:write name="ls" property="codeCode"/></a></td>
        <td class="input"><a href="" onclick="test('<bean:write name="ls" property="codeCode"/>');"><bean:write name="ls" property="codeType"/></a></td>
      </tr>
      </logic:iterate>
<%
//    }
//  }
%>
	    <tr>
		    <td colspan="2" align="center" class="title0">共查询出 <bean:write name="uiGetAmmeterForm" property="count"/> 条满足条件的记录</td>
	    </tr>
    </tbody>
    <tfoot>
      <tr align="center">
        <td colspan="2">
          <input type="button" value=" 取消 " onclick="javascript:window.close();">
        </td>
      </tr>
    </tfoot>
  </table>
</form>
<script type="text/javascript">
<%
out.println("function test(TEST){");
//out.println("alert(TEST);");
String CodeForm = (String)request.getAttribute("CodeForm");
out.println(CodeForm+".value = TEST;");
out.println("try  {");
out.println(CodeForm+".focus();");
out.println("}  catch(jse1) {");
out.println(" try{"); 
	out.println(CodeForm+".focus();  } ");
out.println("catch(jse2){}	  ");
out.println("}		window.close();");
out.println();



%>
// function test(TEST){
//  alert(TEST);
//  String CodeForm = (String)request.getAttribute("CodeForm");
   // CodeForm = TEST;
//  window.opener.+midRoleTaskForm.groupNo.value=TEST;
// alert(window.opener.midRoleTaskForm.groupNo.value);
   // alert(CodeForm);
//  try
//  {
//    window.opener.midRoleTaskForm.groupNo.focus();
//  }
//  catch(jse1)
//  {
//    try{ window.opener.midRoleTaskForm.groupNo.focus();  } catch(jse2){}
//  }
 // window.close();
}
</script>
</body>
</html>
