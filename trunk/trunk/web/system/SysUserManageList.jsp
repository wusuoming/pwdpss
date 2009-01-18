<%@ page contentType="text/html; charset=GBK" %>
<%@ page info = "SysUserManageList.jsp -- 个人用户 列表,李子扬，2006-08-24。" %>

<%@ page import="com.elongway.pss.ui.model.IADCompanyFindByPrimaryKeyCommand"%>
<%@ page import="com.elongway.pss.dto.domain.IADCompanyDto"%>
<%@ page import="com.elongway.pss.dto.domain.IASysUserDto"%>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<script language="Javascript">
function queryCommand0(value1,value2){
		//提交		
	question   =   confirm("确认要删除此用户吗?")      
	  if(question   !=   "0")   
	  {   
	  
	  //return   true;   
	  }   
	  else   
	  {   
	  return   false;   
	  }   		
	    var strURL = "/iacontact/SysUserManageDelete.do?UserCode="+value1+"&AreaCode="+value2;
		//alert(strURL);
        fm.action = strURL;
		fm.submit();	
}
</script>
<script language="Javascript" src="/iacontact/common/pub/StaticJavascript.jsp"></script>

<html>
<head>
	<title>个人用户列表</title>
	<app:css />
</head>
<body>
    
<html:form action="/SysUserManage" >
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="11"><p><B>个人用户列表</B></p></td>
		</tr>
		<tr class=listtitle>
			<td>用户代码</td>
			<td>区域代码</td>
			<td>用户名称</td>
			<td>归属协会代码</td>
			<td>联系电话</td>
			<td>人员级别</td>
			<td>效力状态</td>
			<td>修改</td>
			<td>删除</td>
		</tr>

     	<logic:iterate id="dto" name="SysUserList">
	     	<tr class=listodd>
	     	 	<td><bean:write name="dto" property="userCode"/></td>
			 	<td><bean:write name="dto" property="areaCode"/></td>
			 	<td><bean:write name="dto" property="userName"/></td>
			 	<td>
			 	<%
				 	String companyCodeKey = ((IASysUserDto) dto).getCompanyCode();
				 	String areaCodeKey = ((IASysUserDto) dto).getAreaCode();
				 	
				    IADCompanyFindByPrimaryKeyCommand iaDCompanyFindByPrimaryKeyCommand = new IADCompanyFindByPrimaryKeyCommand(companyCodeKey, areaCodeKey);
				    
					IADCompanyDto iaDCompanyDto = (IADCompanyDto)iaDCompanyFindByPrimaryKeyCommand.execute();
					if (iaDCompanyDto == null)
						out.println(companyCodeKey);
					else
						out.println(companyCodeKey + "-" + iaDCompanyDto.getCompanyCName());
			    %>
			 	<td><bean:write name="dto" property="phoneNumber"/></td>
			 	<td>
			 		<logic:equal name="dto" property="userGrade" value="0">制单人</logic:equal>
					<logic:equal name="dto" property="userGrade" value="1">机构审核人</logic:equal>
					<logic:equal name="dto" property="userGrade" value="2">平台审批人</logic:equal>
					<logic:equal name="dto" property="userGrade" value="3">平台处理人</logic:equal>
			 	</td>
			 	<td>
			 		<logic:equal name="dto" property="validStatus" value="0">失效</logic:equal>
					<logic:equal name="dto" property="validStatus" value="1">有效</logic:equal>
			 	</td>
		 		<td><a class="check" href="/iacontact/system/SysUserManage.jsp?UserCode=<bean:write name="dto" property="userCode"/>&AreaCode=<bean:write name="dto" property="areaCode"/>&UserName=<bean:write name="dto" property="userName"/>&CompanyCode=<bean:write name="dto" property="companyCode"/>&PhoneNumber=<bean:write name="dto" property="phoneNumber"/>&Email=<bean:write name="dto" property="email"/>&Fax=<bean:write name="dto" property="fax"/>&UserGrade=<bean:write name="dto" property="userGrade"/>&ValidStatus=<bean:write name="dto" property="validStatus"/>&Password=<bean:write name="dto" property="password"/>&Flag=<bean:write name="dto" property="flag"/>&action=Modify"style="cursor: hand">修改</a></td>
		 		
		 		<td>
		 		<a class="check" onClick="queryCommand0('<bean:write name="dto" property="userCode"/>','<bean:write name="dto" property="areaCode"/>')" style="cursor: hand"> <font color="#930093">删除</font></a>
		 		</td>
			</tr>
		</logic:iterate>
		
	</table>
</html:form>
</body>
</html>
<script language="javascript">
   var fm = iaSysUserForm;
</script>