<%--
*********
******************
大工业计算录入页面  
create by wangrongjia
200810.13
--%>

<%@ page language="java" contentType="text/html; charset=GBk"
    pageEncoding="GBk"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto"/>
<jsp:directive.page import="java.util.Collection"/>
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
  
<title>趸售核算选择</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>趸售核算选择</title>
<app:css />

<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
	<!-- calendar stylesheet -->
  <link rel="stylesheet" type="text/css" media="all" href="../../../../iacontact/css/calendar-win2k-cold-1.css" title="win2k-cold-1" />

  <!-- main calendar program -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar.js"></script>

  <!-- language for the calendar -->

  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-cn-utf8.js"></script>

  <!-- the following script defines the Calendar.setup helper function, which makes
       adding a calendar a matter of 1 or 2 lines of code. -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-setup.js"></script>
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
    
      <form name="fm" method="post">
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>选择变电站</B></td>
		</tr>
		<%
	List list1=(List)request.getAttribute("wholesaleUser");
	Iterator it1=list1.iterator();
	LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto1=new LwWholeSaleUserInfoDto();
	BLLwWholeSaleIndicatorFacade blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
	LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto=new LwWholeSaleIndicatorDto();
	
	while(it1.hasNext()){
	lwWholeSaleUserInfoDto1=(LwWholeSaleUserInfoDto)it1.next();
		Collection col=blLwWholeSaleIndicatorFacade.findByConditions("userNo='"+lwWholeSaleUserInfoDto1.getUserNo()+"'");
		Iterator it2=col.iterator();
		while(it2.hasNext()){
		 lwWholeSaleIndicatorDto=(LwWholeSaleIndicatorDto)it2.next();
		}
	}
	
 %>
		<tr>
		
					
				<td class=input>
			<%=lwWholeSaleIndicatorDto.getStatMonth()%>	
		</tr>
<%
	List list=(List)request.getAttribute("wholesaleUser");
	Iterator it=list.iterator();
	LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto=new LwWholeSaleUserInfoDto();
	while(it.hasNext()){
	lwWholeSaleUserInfoDto=(LwWholeSaleUserInfoDto)it.next();
 %>
          <tr>
          
           <td class="input"><a href="/iacontact/UIShowWholeSaleAction.do?UserName=<%=lwWholeSaleUserInfoDto.getUserNo()%>&flag=<%=lwWholeSaleUserInfoDto.getCompany()%>&inputdate=<%=lwWholeSaleIndicatorDto.getStatMonth()%>"><font><%=lwWholeSaleUserInfoDto.getUserNo()%></font></a></td>
			
		</tr>
		<%} %>
		
  </table>

</body>
<script type="text/javascript">

</script>
</html>
