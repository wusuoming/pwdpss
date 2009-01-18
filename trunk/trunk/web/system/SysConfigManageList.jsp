<%@ page contentType="text/html; charset=GBK" %>
<%@ page info = "SysConfigManageQuery.jsp -- 系统参数配置 列表，李子扬，2006-08-24。" %>

<%@ page import="java.util.*"%>
<%@ page import="com.elongway.pss.dto.domain.IADsysConfigDto" %>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>


<script language="Javascript" src="/iacontact/common/pub/StaticJavascript.jsp"></script>

<html>
<head>
	<title>参数列表</title>
	<app:css />
</head>
<body>
<html:form action="/SysConfigManage" >

	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="6"><p><B>参数列表</B></p></td>
		</tr>
		<tr class=listtitle>
			<td width="10%" ><span class="title">参数名称代码</span></td>
			<td width="10%" ><span class="title">归属系统代码</span></td>
			<td width="10%" ><span class="title">归属机构代码</span></td>
			<td width="50%" ><span class="title">参数配置结果</span></td>
			<td width="10%" align="center"><span class="title">修改</span></td>
			<td width="10%" align="center"><span class="title">删除</span></td>
		</tr>
<%
  Collection cuserManage = (Collection)request.getAttribute("SysConfigList");
  Vector vuserManage = new Vector();
  vuserManage.addAll(cuserManage);
  Enumeration euserManage = vuserManage.elements();
  while (euserManage.hasMoreElements()){
    IADsysConfigDto dto = (IADsysConfigDto)euserManage.nextElement();

%>
     <tr class=mline>
     	 <td style="width:10%" class="input"><%=dto.getParameterCode()%></td>
		 <td style="width:10%" class="input"><%=dto.getParameterType()%></td>
		 <td style="width:10%" class="input"><%=dto.getCompanyCode()%></td>
		 <td style="width:50%" class="input"><%=dto.getParameterValue()%></td>
		
		 <td style="width:10%" class="input" align="center"><a class="check" style="cursor: hand" href="/sinoiaci/system/SysConfigManage.jsp?ParameterCode=<%=dto.getParameterCode()%>&ParameterType=<%=dto.getParameterType()%>&CompanyCode=<%=dto.getCompanyCode()%>&ParameterValue=<%=dto.getParameterValue()%>&AreaCode=<%=dto.getAreaCode()%>&ValidStatus=<%=dto.getValidStatus()%>&ParameterDesc=<%=dto.getParameterDesc()%>&Remark=<%=dto.getRemark()%>&Flag=<%=dto.getFlag()%>&action=Modify">修改</a></td>
		 <td style="width:10%" class="input" align="center"><a class="check" style="cursor: hand" href="/sinoiaci/SysConfigManageDelete.do?ParameterCode=<%=dto.getParameterCode()%>&ParameterType=<%=dto.getParameterType()%>&CompanyCode=<%=dto.getCompanyCode()%>">删除</a></td>
	   </tr>
<%
  }
%>
	</table>
</html:form>
</body>
</html>
