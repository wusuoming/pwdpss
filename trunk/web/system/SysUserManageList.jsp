<%@ page contentType="text/html; charset=GBK" %>
<%@ page info = "SysUserManageList.jsp -- �����û� �б�,�����2006-08-24��" %>

<%@ page import="com.elongway.pss.ui.model.IADCompanyFindByPrimaryKeyCommand"%>
<%@ page import="com.elongway.pss.dto.domain.IADCompanyDto"%>
<%@ page import="com.elongway.pss.dto.domain.IASysUserDto"%>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<script language="Javascript">
function queryCommand0(value1,value2){
		//�ύ		
	question   =   confirm("ȷ��Ҫɾ�����û���?")      
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
	<title>�����û��б�</title>
	<app:css />
</head>
<body>
    
<html:form action="/SysUserManage" >
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="11"><p><B>�����û��б�</B></p></td>
		</tr>
		<tr class=listtitle>
			<td>�û�����</td>
			<td>�������</td>
			<td>�û�����</td>
			<td>����Э�����</td>
			<td>��ϵ�绰</td>
			<td>��Ա����</td>
			<td>Ч��״̬</td>
			<td>�޸�</td>
			<td>ɾ��</td>
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
			 		<logic:equal name="dto" property="userGrade" value="0">�Ƶ���</logic:equal>
					<logic:equal name="dto" property="userGrade" value="1">���������</logic:equal>
					<logic:equal name="dto" property="userGrade" value="2">ƽ̨������</logic:equal>
					<logic:equal name="dto" property="userGrade" value="3">ƽ̨������</logic:equal>
			 	</td>
			 	<td>
			 		<logic:equal name="dto" property="validStatus" value="0">ʧЧ</logic:equal>
					<logic:equal name="dto" property="validStatus" value="1">��Ч</logic:equal>
			 	</td>
		 		<td><a class="check" href="/iacontact/system/SysUserManage.jsp?UserCode=<bean:write name="dto" property="userCode"/>&AreaCode=<bean:write name="dto" property="areaCode"/>&UserName=<bean:write name="dto" property="userName"/>&CompanyCode=<bean:write name="dto" property="companyCode"/>&PhoneNumber=<bean:write name="dto" property="phoneNumber"/>&Email=<bean:write name="dto" property="email"/>&Fax=<bean:write name="dto" property="fax"/>&UserGrade=<bean:write name="dto" property="userGrade"/>&ValidStatus=<bean:write name="dto" property="validStatus"/>&Password=<bean:write name="dto" property="password"/>&Flag=<bean:write name="dto" property="flag"/>&action=Modify"style="cursor: hand">�޸�</a></td>
		 		
		 		<td>
		 		<a class="check" onClick="queryCommand0('<bean:write name="dto" property="userCode"/>','<bean:write name="dto" property="areaCode"/>')" style="cursor: hand"> <font color="#930093">ɾ��</font></a>
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