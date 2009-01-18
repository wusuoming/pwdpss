<%--修改比例分摊信息create by qiaoyouliang 2008.11.4 --%>
<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterBookFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@page import="com.elongway.pss.dto.domain.LwWholeSaleProrateDto"%>
<%@page import="java.util.Collection"%>
<%@page import="com.elongway.pss.bl.facade.BLLwDcodeFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwDcodeDto"%>
<jsp:directive.page import="java.text.DecimalFormat"/>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 

<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>修改趸售比例分摊页面</title>
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

<body class=interface>
  
    <!--CONTENT BEGIN-->
    
      <form name="fm" style="display:block;">
     
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="6"><B>修改趸售比例分摊页面</B></td>
		</tr>
		</table>
		<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr>
 <td>
 <table class=common width="100%" cellspacing="1" cellpadding="5">
 <%Collection wholeProrateList  = (Collection)request.getAttribute("saleProrateList"); 
 DecimalFormat df = new DecimalFormat("###0.0000");
 int count = wholeProrateList.size();
 int index = 0;
 for(Iterator it = wholeProrateList.iterator();it.hasNext();){
      LwWholeSaleProrateDto dto = (LwWholeSaleProrateDto)it.next();  
 					 if(index%2==0)
							out.print("<tr class=oddrow>");
						index++; %>
   <td>
       <table class=common width="100%" cellspacing="1" cellpadding="5">
 
      <tr class=listtitle align="center">
			<td  colspan="6" bgcolor="4CA8EB"><B><%=dto.getCompanyName() %><%=dto.getVoltLevel() %>KV比例分摊（单位%）</B></td>
			<input type="hidden" name="comCode" value="<%=dto.getComCode() %>"/>
			<input type="hidden" name="voltLevel" value="<%=dto.getVoltLevel() %>"/>
		</tr>
     
     <tr>
			<td class="title">居民</td>
            <td class="title">非居</td>
            <td class="title">农灌</td>
            <td class="title">生产</td>
            <td class="title">商业</td>
            <td class="title">非普</td>
          </tr>
           <tr>
			<td class="title"><input type="input" name="people" value="<%=df.format(dto.getPeople())%>" style="width:60px"/></td>
            <td class="title"><input type="input" name="notPeople" value="<%=df.format(dto.getNotPeople()) %>" style="width:60px"/></td>
            <td class="title"><input type="input" name="farm" value="<%=df.format(dto.getFarm()) %>" style="width:60px"/></td>
            <td class="title"><input type="input" name="produce" value="<%=df.format(dto.getProduce())%>" style="width:60px"/></td>
            <td class="title"><input type="input" name="business" value="<%=df.format(dto.getBusiness()) %>" style="width:60px"/></td>
            <td class="title"><input type="input" name="industry" value="<%=df.format(dto.getIndustry()) %>" style="width:60px"/></td>
          </tr>
  
        
          
             </table>
   </td>
   <%
						if(index == count && count%2 == 1){
							out.print("<td ><table class=common width='100%' cellspacing='1' cellpadding='5'></table></td>");
						}
					%>
					<%
						if(index !=0 && index%2 == 0){
							out.print("</tr>");
						}
					%>
<%} %>
           

           
 </table>
 </td>
 </tr>
      
        </table>
       
      
     <br />

	
	
	
 
    <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="保  存"
					onclick="update();">
				</td>
				
			</tr>
		</table>
		
		
    </form>
<script language="javascript">



 function update()
        {          
          fm.action="<%=request.getContextPath()%>/modifyWholeProrate.do?";
          if(!confirm('确实要进行保存?')){
          return;
          }else{
          fm.submit();
          }
        }
               
 
</script>

<br />
  

</body>
</html>
</html:html>
