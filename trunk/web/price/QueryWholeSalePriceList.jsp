<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.elongway.pss.dto.domain.LwSalePriceDto"%>
<%@page import="com.elongway.pss.ui.view.price.UIPriceForm"%>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html locale="true">
<head>
<title></title>
<app:css />

<script  language="Javascript">

         function update()
        {          
         this.location = "<%=request.getContextPath()%>/salePriceQuery.do?method=wholeSalePriceQuery&query=1";
                           // alert('fm.action:'+fm.action);
        
            }  
          function confirmUpdate()
        {          
          this.location = "<%=request.getContextPath()%>/salePriceUpdate.do?method=wholeSalePriceQuery&query=1";
                           // alert('fm.action:'+fm.action);
        
            }
</script>

<script language="Javascript"
	src="/mimessage/common/pub/StaticJavascript.jsp"></script>
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
</head>
<body class="interface">
<html:form action="/salePriceQuery">

	<!-- 分页的显示-->
  <html:hidden property="pageNo"/>
     <html:hidden property="rowsCount"/>
     <html:hidden property="rowsPerPage"/>
	
	<table class=common width="500%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="8"><font size="5"><B>内蒙古自治区西部电网趸售电价表</B></font><br></td>
		</tr>
		<tr class=listtitle>
				<td rowspan="2" width="20%">
					<span class="title">用电分类</span>
				<br></td>
				<td nowrap colspan="2" width="40%">
					<span class="title">县级趸售</span>
				<br></td>
				<td nowrap colspan="2" width="40%">
					<span class="title">县级以下趸售</span>
				<br></td>
				
			</tr>
			<tr class=listtitle>
				
				<td nowrap width="10%">
					<span class="title">1-10KV</span>
				<br></td>
				<td nowrap width="10%">
					<span class="title">35KV及以上</span>
				<br></td>
				<td nowrap width="10%">
					<span class="title">1-10KV</span>
				<br></td>
				<td nowrap width="10%">
					<span class="title">35KV及以上</span>
				<br></td>	
			</tr>

		<%Collection collection = (Collection)request.getAttribute("priceFormList"); 
		String query = (String )request.getAttribute("query");
		UIPriceForm dto = null;
		
		String kv10Xian = null;
		String kv35MoreXian = null;
		String kv10Xia = null;
		String kv35MoreXia = null;
		String name = null;
		String code = null;
		for (Iterator iterator2 = collection.iterator(); iterator2.hasNext();) {
				 dto = (UIPriceForm) iterator2.next();
		
		kv10Xian=  dto.getKV10Xian();
		kv35MoreXian = dto.getKV35MoreXian();
		kv10Xia = dto.getKV10Xia();
		kv35MoreXia = dto.getKV35MoreXia();
		name = dto.getPowerClassName();
		code = dto.getPowerClasscode();
		%>
<% 
if(query ==null){

%>
 <tr class=listtitle>
			<!-- 用电分类 -->
			<td class="title" nowrap align="center"><%=name %>
			<input type="hidden" name="powerClassCode" value=<%=code %>>
			
			</td>			
				<!-- 1-10KV -->
			<td class="title" nowrap align="center"><span class="title"><%=kv10Xian %></span></td>
				<!-- 35及以上 -->
			<td class="title" nowrap align="center"><span class="title"><%=kv35MoreXian %></span></td>
			<!-- 1-10KV -->
			<td class="title" nowrap align="center"><span class="title"><%=kv10Xia %></span></td>
				<!-- 35及以上 -->
			<td class="title" nowrap align="center"><span class="title"><%=kv35MoreXia %></span></td>
		</tr>
		
<%} else{%>
	     <tr class=listtitle>
			<!-- 用电分类 -->
			<td class="title" nowrap align="center"><%=name %>
			<input type="hidden" name="powerClassCode" value=<%=code %>>
			
			</td>
				<!-- 1-10KV -->
			<td class="title" nowrap align="center"><span class="title"><input type="text" name="powerClassName" value=<%=kv10Xian %>></span></td>
				<!-- 35及以上 -->
			<td class="title" nowrap align="center"><span class="title"><input type="text" name="powerClassName" value=<%=kv35MoreXian %>></span></td>
			<!-- 1-10KV -->
			<td class="title" nowrap align="center"><span class="title"><input type="text" name="powerClassName" value=<%=kv10Xia %>></span></td>
				<!-- 35及以上 -->
			<td class="title" nowrap align="center"><span class="title"><input type="text" name="powerClassName" value=<%=kv35MoreXia %>></span></td>
		</tr>
		<%}} %>
	</table>
	<table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">
<% 
if(query ==null){

%>
				<td class=button align="center">
					<input type=button class=button name=button1 value="修  改"
						onClick="update();">
				</td>
	<%}else{ %>	
	<td class=button align="center">
					<input type=button class=button name=button1 value="确  定"
						onClick="confirmUpdate();">
				</td>
	<%} %>		 
				<td class=button align="center">
					<input type=button class=button name=button0 value="返　回"
						onClick=history.go(-1);>
				</td>
			</tr>
		</table>
		

</html:form>
	 <script language="javascript">
		var fm = uiPriceForm;
		</script>
</body>
</html:html>

