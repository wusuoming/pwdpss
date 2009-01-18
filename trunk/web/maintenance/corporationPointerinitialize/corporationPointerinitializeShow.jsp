<%@ page contentType="text/html; charset=GBK"%>
<jsp:directive.page import="java.util.Collection"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwFactoryIndicatorDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwAmmeterIndicatorFacade"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto"/>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>趸售指针系统初始化页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
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
<script language="Javascript">
 function validateUserQueryForm(form)
{
   //添加日期型的合成函数
  if(!(composeauUserBirthday() && composeauUserStartWorkDate() && composeauUserEnterDate())){
     return false;
  }
   bValid = validateQueryForm(form);
  if(bValid == true)
  {
      disabledImg(userForm,'userOverviewChaxun');
  }
   return bValid;
}
   
  function AddForm(){
  
       var strURL = "<%=request.getContextPath()%>/patchAndCal.do";
      fm.action = strURL;
	  fm.submit();
        } 

</script>
<script language="javascript">
   function codeQuery(field)
{
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.userNo.value+"&TableName=lwProrate";

	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
</head>
<body class=interface>&nbsp; 
<html:errors />

<form  name="fm" method="post">
<table>

<%
	List list1=(List)request.getAttribute("allPointer");
	
	
	
	LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto1=(LwNewFactoryIndicatorDto)list1.get(0);
	
	
	
	 %>
	<tr>
		

          
            <td class="title">选择录入的月份</td>
            
            <td class="input" ><input name="inputdate" value="<%=lwNewFactoryIndicatorDto1.getStatMonth()%>"></td>
	</tr>
</table>
	<table width="100%">

	
		<tr class=listtitle align="center">
			<td class=title0 colspan="10" width="100%"><B><font size="3">大工业指针初始化录入页面</font></B></td>
		</tr>
	
	<!--点击新增时显示的新增路径条件部分(公用)-->
	
	
		<tr>
			<td class="title" align="center">户号 </td>
			<td class="title" align="center">大工业名称 </td>
			<td class="title" align="center">表号 </td>
			<td class="title" align="center">上月有功指针</td>
			<td class="title" align="center">当月有功指针</td>
			<td class="title" align="center">上月无功指针</td>
			<td class="title" align="center">当月无功指针</td>
			<td class="title" align="center">倍率</td>
			<td class="title" align="center">使用类型</td>
			<%--<td class="title">换表电量</td>
			<td class="title">退补电量</td>
			
			
		--%></tr>
		
			<%--<tr class=oddrow>
				<td colspan="5" align="right"><img src="../../images/jia-jia.gif" border="0" align="absmiddle" name="img_DataPower_Insert" onclick="insertRow('DataPower')">
				</td>
			</tr>
		--%>
			 
					<%
	List list2=(List)request.getAttribute("allPointer");
	
	Iterator it2=list2.iterator();
	while(it2.hasNext()){
	LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto=(LwNewFactoryIndicatorDto)it2.next();

	
	
	 %>
					
					<tr class=oddrow>
						<td class="title" align="center"><input name="UserNo" value="<%=lwNewFactoryIndicatorDto.getUserNo()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="title" align="center"><input name="UserName" value="<%=lwNewFactoryIndicatorDto.getUsername()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="title" align="center"><input name="AmmeterNo" value="<%=lwNewFactoryIndicatorDto.getAmmeterNo()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="title" align="center"><input name="LastWorkNum" value="<%=lwNewFactoryIndicatorDto.getLastWorkNum()%>" style="width:65px">
						<td class="title" align="center"><input name="ThisWorkNum" value="<%=lwNewFactoryIndicatorDto.getThisWorkNum()%>" style="width:65px" style="border:0">
						<td class="title" align="center"><input name="LastIdleNum" value="<%=lwNewFactoryIndicatorDto.getLastIdleNum()%>" style="width:65px">
						<td class="title" align="center"><input name="ThisIdleNum" value="<%=lwNewFactoryIndicatorDto.getThisIdleNum()%>" style="width:65px" style="border:0">
						<td class="title" align="center"><input name="Rate" value="<%=lwNewFactoryIndicatorDto.getRate()%>" style="width:65px">
<%
						if(lwNewFactoryIndicatorDto.getAmmeterStyle().equals("0")){
						 %>
						<td class="title" align="center">大工业<input name="AmmeterStyle" style="width:65px" value="0" type="hidden" readonly="readonly"></td>										
						<%
						}
						 %>
						 <%
						if(lwNewFactoryIndicatorDto.getAmmeterStyle().equals("1")){
						 %>
						<td class="title" align="center">居民照明<input name="AmmeterStyle" style="width:65px" value="1" type="hidden" readonly="readonly"></td>										
						<%
						}
						 %>
						</tr>
					<%} %>
		
	</table>
	<p><br>
	</p>
	<!-- 按钮的显示-->
<table cellpadding="0" cellspacing="0" width="100%">
<tr>
<td>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button
				name=button0 value="保存" onclick="savePointer()"></td>
		
	</table>
	</td>

	</tr>
	</table>
</form>
</body>
<script language="javascript">
function savePointer(){
	fm.action="/iacontact/viewLWCorporationSalePointer.do";
	fm.submit();
}
</script>


</html:html>
