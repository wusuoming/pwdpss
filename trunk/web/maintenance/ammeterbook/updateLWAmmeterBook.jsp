
<%@ page contentType="text/html; charset=GBK"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">

<title>修改表本</title>
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


<!--自动下拉列表JS2-->

</head>
<%LwAmmeterBookDto dto = (LwAmmeterBookDto)request.getAttribute("bookDto"); %>
<body id="all_title">
  
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    
      <form name="fm" style="display:block;">
         <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>修改表本</B></td>
		</tr>
          <tr>
            <td class=title>表本号</td>
            <td class=input><%=dto.getBookNo() %></td>
            <input name="BookNo" type="hidden"  class="text" value=<%=dto.getBookNo() %>>
            <td class=title>表本名</td>
            <td class=input><input name="BookName" type="text"  class="text" value=<%=dto.getBookName() %>></td>
          </tr>
		  <tr>
		  <td class=title>表本类型</td>
            <td class="input"><select name="BookType"  class="select">
            <%if("1".equals(dto.getBookType())) {%>
            
				  <option value="1" selected="selected">直供乡</option>	
			<%   }			else  if("2".equals(dto.getBookType())) {%>	 
				  <option value="2" selected="selected">趸售</option>
				  <%   }	else {%>
				  <option value="3" selected="selected">大工业</option><%} %>
              </select>	
            </td>
		   <td class=title>是否有效</td>
            <td class="input"><select name="ValidStatus"  class="select">
            <%if("1".equals(dto.getValidStatus())) {%>
				  <option value="1" selected="selected">有效</option>	
				  <%}else{ %>			  
				  <option value="0">无效</option>
				  <%} %>
              </select>	
            </td>
           
       </tr>
         <tr>
		  <td class=title>备注</td>
            <td class="input" colspan="3"><textarea rows="3" cols="129" name="Remark"><%=dto.getRemark() %></textarea>
            </td>
		 
       </tr>
		      
        </table>
		
    <br />
<!--一大堆的按钮-->

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" 保 存 " onClick="javascript:updateBook();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        --%><td class=button><input name="back" type="button" class=button value="返 回" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function updateBook(){

 fm.action="<%=request.getContextPath()%>/updateSave.do?flag=update";
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
