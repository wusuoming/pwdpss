<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">

<title>������·�������ҳ��</title>
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

</head>
<body class=interface>
<html:errors />
<html:form action="/addLineAmmeter">
	<html:hidden property="pageNo" value="1" />
	<table width="100%">
		<tr>
			<td height=20px class="input">ʱ����д��ʽΪ��2007-03-29</td>
		</tr>
	</table>
	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
		
		
		<logic:equal name="uiLineAmmeterForm" property="action" value="Create">
				<td class=title0 colspan="7"><B>������·���������Ϣ</B></td>
			</logic:equal>
			<logic:equal name="uiLineAmmeterForm" property="action" value="Edit">
			<td class=title0 colspan="7"><B>�޸���·���������Ϣ</B></td>
			</logic:equal>
		</tr>
		<tr>
			<td class="blue" colspan="4"></td>
		</tr>
		<!--��š���·����-->
	<tr>
			<td class=title>��·����</td>
				<logic:equal name="uiLineAmmeterForm" property="action" value="Create">
				<td class="input"><input type="text"  styleClass="text"
				name="lineCode" value=""></td>
			</logic:equal>
			<logic:equal name="uiLineAmmeterForm" property="action" value="Edit">
			<td class="input"><input type="text"  styleClass="text" readonly="readonly"
				name="lineCode" value="<bean:write name="uiLineAmmeterForm" property="lineCode"/>"></td>
			</logic:equal>
			<td class=title>���</td>
			<logic:equal name="uiLineAmmeterForm" property="action" value="Create">
				<td class=input><input type="text"  class="text" maxlength="10"
				name="ammeterNo" value=""></td>
			</logic:equal>
			<logic:equal name="uiLineAmmeterForm" property="action" value="Edit">
			<td class=input><input type="text"  class="text" maxlength="10" readonly="readonly"
				name="ammeterNo" value="<bean:write name="uiLineAmmeterForm" property="ammeterNo"/>"></td>
			</logic:equal>
			
			
			
		</tr>

		<!--��λ���룬����-->
		
		<tr>
		    
			
			<td class=title>�Ƿ���Ч</td>
			<logic:equal name="uiLineAmmeterForm" property="action" value="Create">
				<td class="input">				
				 <html:select  styleClass="blue" property="validStatus" style="width:20%">
				    <option value="1" selected="selected">��Ч</option>	
				    <option value="0" >��Ч</option>
				  </html:select>
			</td>
			</logic:equal>
			<logic:equal name="uiLineAmmeterForm" property="action" value="Edit">
			<td class="input">
				<html:select  styleClass="blue" property="validStatus" style="width:20%">
				    <logic:equal name="uiLineAmmeterForm" property="validStatus" value="1">
  				     <option value="1" selected="selected">��Ч</option>	
  				     <option value="0" >��Ч</option>
  				  	</logic:equal>		
  				  	<logic:equal name="uiLineAmmeterForm" property="validStatus" value="0">
  				     <option value="1" >��Ч</option>	
  				     <option value="0" selected="selected">��Ч</option>
  				  	</logic:equal>		
				</html:select>
			</td>
			<td class=title></td><td class="input"></td>
			</logic:equal>
				
		</tr>
		
	</table>
	<p><br>
	</p>
	<!-- ��ť����ʾ-->
	
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">
			<logic:equal name="uiLineAmmeterForm" property="action" value="Create">
				<td class=button align="center"><input type="button"
					class="button" name="button0" value="�� ��" onClick="SaveAddForm1();"></td>
				<td class=button align="center"><input type=reset class=button
					name=button0 value="�� ��"
					onClick="history.back(-1)"></td>
			</logic:equal>
			<logic:equal name="uiLineAmmeterForm" property="action" value="Edit">
				<td class=button align="center"><input type="button"
					class="button" name="button0" value="�� ��"
					onClick="EditForm();"></td>
				<td class=button align="center"><input type=reset class=button
					name=button0 value="�� ��" onClick="history.back(-1)"></td>
			</logic:equal>
		</tr>
	</table>
</html:form>
</body>

<script language="Javascript"
	src="/mimessage/common/pub/StaticJavascript.jsp"></script>
<script language="Javascript">

   function SaveAddForm1(){  
       var strURL = "<%=request.getContextPath()%>/addLineAmmeter.do?method=addLineAmmeter";
      
       fm.action = strURL;
    fm.submit();
	  
        } 
   function EditForm(){  
       var strURL = "<%=request.getContextPath()%>/updateLineAmmeter.do?method=updateLineAmmeter";
       fm.action = strURL;
     fm.submit();
	 
        } 
  function QueryForm(){  
       var strURL = "<%=request.getContextPath()%>/queryUserOverView.do?method=queryUserOverView";
       fm.action = strURL;
	  fm.submit();
        } 
        
  function Birthday(){  
    var strURL = "<%=request.getContextPath()%>/queryCompanyOverview.do?method=queryCompanyOverview&action=View";
    fm.action = strURL;
    fm.submit();
}
</script>
<script language="javascript">
   var fm = uiLineAmmeterForm;
</script>
</html:html>
