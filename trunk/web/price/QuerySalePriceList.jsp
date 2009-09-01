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
	<script language="Javascript"
		src="/mimessage/common/pub/StaticJavascript.jsp"></script>
	<html:base />
	<STYLE>
BODY {
	SCROLLBAR-FACE-COLOR: #ffffff;
	SCROLLBAR-HIGHLIGHT-COLOR: #A9CBED;
	SCROLLBAR-SHADOW-COLOR: #A9CBED;
	SCROLLBAR-3DLIGHT-COLOR: #FFFFFF;
	SCROLLBAR-ARROW-COLOR: #A9CBED;
	SCROLLBAR-TRACK-COLOR: #FFFFFF;
	SCROLLBAR-DARKSHADOW-COLOR: #FFFFFF;
}
</STYLE>
</head>
<body class="interface">
	<form name="fm" action="/salePriceQuery" method="post">
		<table class=common width="500%" cellspacing="1" cellpadding="5">
			<tr class=listtitle align="center">
				<td class=title0 colspan="8">
					<font size="5"><B>内蒙古自治区西部电网销售电价表</B>
					</font>
					<br>
				</td>
			</tr>
			<tr class=listtitle>
				<td rowspan="2" width="20%">
					<span class="title">用电分类</span>
					<br>
				</td>
				<td nowrap colspan="5" width="50%">
					<span class="title">电度电价</span>
					<br>
				</td>
				<td nowrap colspan="2" width="20%">
					<span class="title">基本电价</span>
					<br>
				</td>

			</tr>
			<tr class=listtitle>
				<td width="10%">
					<span class="title">不满1KV</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title">1-10KV</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title">35-110KV以下</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title">110-220KV及以下</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title">220KV及以上</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title">最大需量</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title">变压器容量</span>
					<br>
				</td>
			</tr>

			<%
				Collection collection = (Collection) request
							.getAttribute("priceFormList");
					String query = (String) request.getAttribute("query");
					UIPriceForm dto = null;
					String kv1 = null;
					String kv10 = null;
					String kv110 = null;
					String kv220 = null;
					String kvMore220 = null;
					String rongliang = null;
					String xuliang = null;
					String name = null;
					String code = null;
					for (Iterator iterator2 = collection.iterator(); iterator2
							.hasNext();) {
						dto = (UIPriceForm) iterator2.next();
						kv1 = dto.getKV1();
						kv10 = dto.getKV10();
						kv110 = dto.getKV110();
						kv220 = dto.getKv220();
						kvMore220 = dto.getKv220More();
						xuliang = dto.getMaxXuLiang();
						rongliang = dto.getRongLiang();
						name = dto.getPowerClassName();
						code = dto.getPowerClasscode();
			%>
			<%
				if (query == null) {
			%>
			<tr class=listtitle>
				<!-- 用电分类 -->
				<td class="title" nowrap align="center"><%=name%>
					<input type="hidden" name="powerClassCode" value="<%=code%>">

				</td>
				<!-- 不满1KV -->
				<td class="title" nowrap align="center">
					<span class="title"><%=kv1%></span>
				</td>
				<!-- 1-10KV -->
				<td class="title" nowrap align="center">
					<span class="title"><%=kv10%></span>
				</td>
				<!-- 35-110KV以下 -->
				<td class="title" nowrap align="center">
					<span class="title"><%=kv110%></span>
				</td>
				<!-- 110-220KV及以下 -->
				<td class="title" nowrap align="center">
					<span class="title"><%=kv220%></span>
				</td>
				<!-- 220KV及以上 -->
				<td class="title" nowrap align="center">
					<span class="title"><%=kvMore220%></span>
				</td>
				<!-- 最大需量 -->
				<td class="title" nowrap align="center">
					<span class="title"><%=xuliang%></span>
				</td>
				<!-- 变压器容量 -->
				<td class="title" nowrap align="center">
					<span class="title"><%=rongliang%></span>
				</td>
			</tr>

			<%
				} else {
			%>
			<tr class=listtitle>
				<!-- 用电分类 -->
				<td class="title" nowrap align="center">
					<input type="hidden" name="powerClassCode" value="<%=code%>">
					<%=name%>
				</td>
				<!-- 不满1KV -->
				<td class="title" nowrap align="center">
					<input name="kv1" style="width: 90px" value=<%=kv1%>>
				</td>
				<!-- 1-10KV -->
				<td class="title" nowrap align="center">
					<input name="kv10" style="width: 90px" value=<%=kv10%>>
				</td>
				<!-- 35-110KV以下 -->
				<td class="title" nowrap align="center">
					<input name="kv110" style="width: 90px" value=<%=kv110%>>
				</td>
				<!-- 110-220KV及以下 -->
				<td class="title" nowrap align="center">
					<input name="kv220" style="width: 90px" value=<%=kv220%>>
				</td>
				<!-- 220KV及以上 -->
				<td class="title" nowrap align="center">
					<input name="kvMore220" style="width: 90px" value=<%=kvMore220%>>
				</td>
				<!-- 最大需量 -->
				<td class="title" nowrap align="center">
					<input name="xuliang" style="width: 90px" value=<%=xuliang%>>
				</td>
				<!-- 变压器容量 -->
				<td class="title" nowrap align="center">
					<input name="rongliang" style="width: 90px" value=<%=rongliang%>>
				</td>
			</tr>
			<%
				}
					}
			%>
		</table>
		<table cellpadding="0" cellspacing="0" width="100%">
			<%
				if (query == null) {
			%>
			<tr class="listtitle" align="center">
				<td class=button align="center">
					<input type="button" class="button" name="button1" value="电价调整"
						onClick="update();">
				</td>
				<%
					} else {
				%>
			
			<tr class="listtitle" align="center">
				<td class=button align="center">
					<input type=button class=button name=button1 value="保  存"
						onClick="confirmUpdate();">
				</td>
				<%
					}
				%>
				<td class=button align="center">
					<input type=button class=button name=button0 value="返　回"
						onClick=history.go(-1);>
				</td>
			</tr>
		</table>


	</form>
	<script language="javascript">
		//var fm = uiPriceForm;
		</script>

	<script language="Javascript">
         function update()
        {          
         fm.action = "<%=request.getContextPath()%>/salePriceQuery.do?method=salePriceQuery&query=1";
         fm.submit();
            }  
          function confirmUpdate()
        {          
           fm.action = "<%=request.getContextPath()%>/salePriceUpdate.do?method=salePriceUpdate&query=1";
                           fm.submit();
            }
</script>
</body>
</html:html>

