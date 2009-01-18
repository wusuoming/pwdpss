<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=GBK" %>
<%@ page info = "Logon.jsp -- 用户登录，乔有良（修改），2008-10-24。" %>

<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%
/*
	//清空用户
	if(session.getAttribute(AppConst.SYSUSER_SESSION ) != null){
		session.removeAttribute("sysUser");
	}
	
	//重新定向
	if(session.getAttribute("FROM_PAGE") == null){
		response.sendRedirect("/mimessage/index.jsp");
	}
*/
%>

<script language="JavaScript" src="/mimessage/common/pub/StaticJavascript.jsp" type="text/javascript"></script>

<script type="text/javascript" language="JavaScript">
	//装载窗口
	function loadForm(){
		var fm = logonForm;
		fm.userCode.value = "";
		fm.password.value = "";
		fm.cssStyle.value = "blue";
		
		parent.fraMain.rows= "0,*";
		parent.fraSet.cols = "0%,0%,*";
		parent.fraSubMenu.window.location="/mimessage/pub/blank.html";
	}
	
	function isUserNull(){
		var fm = logonForm;
		if(trim(fm.userCode.value).length==0){
		  alert("请先输入用户代码");
		  return false;
		}
		return true;
	}
	
	function clearPwd(){
		var fm = logonForm;
		fm.password.value="";
		return true;
   }
</script>
		
<html:html locale="true">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>包头农电计费系统</title>
	
	<link rel='stylesheet' type='text/css' href='/mimessage/css/Standard.css' />

	<html:base />
	
	<style type="text/css">
<!--
body {
}
-->
    </style>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onload="loadForm()">

<html:form action="/logon" focus="userCode">
	<link rel='stylesheet' type='text/css' href='../../css/Standard.css' />
	<%--登录画面表格--%>
	<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="3" ></td>
  </tr>
  <tr>
    <td align="center"><table width="826"  border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td width="450"><img src="../../images/imglogin.jpg" width="503" height="461" /></td>
          <td width="376" valign="bottom" background="../../images/bglogin.gif"><table width="302" height="400" border="0" cellpadding="0" cellspacing="0">
            <tr>
              <td width="276" height="13">&nbsp;</td>
              <td width="16">&nbsp;</td>
            </tr>
            <tr>
              <td height="123"><table width="66%"  border="0" align="left" cellpadding="0" cellspacing="0">
                <tr align="center" valign="top">
                  <td height="13" colspan="3">&nbsp;</td>
                </tr>
                <tr>
                  <td width="50" height="33"><img src="../../images/imgusername.gif" width="48" height="14" /></td>
                  <td width="66"><html:text styleClass="text" style="width:120px" property="userCode" maxlength="30"  onblur= "clearPwd();"/></td>
                  <td width="72" rowspan="2">&nbsp;</td>
                </tr>
                <tr>
                  <td height="34"><img src="../../images/imgpassword.gif" width="47" height="14" /></td>
                  <td><html:password styleClass="text"  style="width:120px" property="password" maxlength="128" value=""/></td>
                </tr>
                <tr>
                  <td colspan="3"><html:errors />&nbsp;
                    <table width="176" height="20" border="0" cellpadding="0" cellspacing="0">
                      
                      <tr>
                        <td width="113" height="20">&nbsp;</td>
                        <td width="63"><input name="imageField" type="image" src="../../images/btnlogin.gif" align="middle" width="60" height="18" border="0" /></td>
                      </tr>
                    </table></td>
                </tr>
              </table></td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
          </table></td>
        </tr>
      </table>
      <table width="78%"  border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td class="copyright" align="center"></td>
        </tr>
      </table></td>
  </tr>
 
</table>
	
	<html:select property="cssStyle" styleClass="select" style="width:130px;display:none">
		<html:option value="blue">蓝色样式</html:option>
	</html:select>
</html:form>

<script language="JavaScript" type="text/javascript">
   var fm = logonForm;
</script>

</body>
</html>
</html:html>
