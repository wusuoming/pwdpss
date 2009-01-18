<%@ page contentType="text/html; charset=GBK" %>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html>
<head>
  <app:css />
</head>
<body class="interface" onload="bodyLoad()">
  <table class=common align=center>

       <!--<div id="endDate1">测试使用-底稿保存的结束时间</div>-->

    <tr>
      <td class=formtitle colspan="2">系统提示</td>
    </tr>
    <tr>
      <td align=center>
        <img src='/iacontact/images/success.gif'>
      </td>
      <td class="common">
        <B>操作已成功</B>
      </td>
    </tr>
  </table>
</body>
</html>
<script language="Javascript">
  function bodyLoad(){
    //测试使用-底稿保存的结束时间
//    var endDate = new Date();
//    endDate1.innerHTML = "" + endDate.getHours() + ":" + endDate.getMinutes() + ":" + endDate.getSeconds();
  }
</script>

