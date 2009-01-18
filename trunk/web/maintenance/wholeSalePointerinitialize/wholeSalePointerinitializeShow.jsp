<%@ page contentType="text/html; charset=GBK"%>
<jsp:directive.page import="java.util.Collection"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwAmmeterChangeDto"/>
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
  alert();  
       var strURL = "<%=request.getContextPath()%>/patchAndCal.do";
        this.location = strURL;
	  
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
	<table width="100%">
	<%
	List list1=(List)request.getAttribute("allPointer");
	LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto=new LwWholeSaleIndicatorDto();
	 String comcode=(String)request.getAttribute("s");
	
	lwWholeSaleIndicatorDto=(LwWholeSaleIndicatorDto)list1.get(0);
	
	 %>
	<tr>
		

          
            <td align="center">录入的月份</td>
            
            <td  ><input name="inputdate" value="<%=lwWholeSaleIndicatorDto.getStatMonth()%>" readonly="readonly"></td>
           <input name="comcode" value=<%=comcode %> readonly="readonly" / type="hidden">
          <%if(comcode.equals("gy")) {%>
           <td class="input" ><input name=com value="固阳" readonly="readonly" />
           <%} %>
            <%if(comcode.equals("dm")) {%>
           <td class="input" ><input name=com value="达茂" readonly="readonly" />
           <%} %>
            <%if(comcode.equals("ty")) {%>
           <td class="input" ><input name=com value="图右" readonly="readonly" />
           <%} %>
             <%if(comcode.equals("jy")) {%>
           <td class="input" ><input name=com value="九原" readonly="readonly" />
           <%} %>
	</tr>
	
		<tr class=listtitle align="center">
			<td class=title0 colspan="9" width="100%"><B><font size="3">趸售指针初始化录入页面</font></B></td>
		</tr>
	
	<!--点击新增时显示的新增路径条件部分(公用)-->
	
	
		<tr class=listtitle>
			<td nowrap><span class="title">变压器名称</span> </td>

			<td nowrap><span class="title">上月有功指针</span></td>
			<td nowrap><span class="title">当月有功指针</span></td>
			<td nowrap><span class="title">上月无功指针</span></td>
			<td nowrap><span class="title">当月无功指针</span></td>
			<td nowrap><span class="title">倍率</span></td>
			<td nowrap><span class="title">有功电量</span></td>
			<td nowrap><span class="title">无功电量</span></td>
			
			
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
	lwWholeSaleIndicatorDto=(LwWholeSaleIndicatorDto)it2.next();
		String userNo=lwWholeSaleIndicatorDto.getUserNo();
					BLLwAmmeterChangeFacade blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
					LwAmmeterChangeDto  lwAmmeterChangeDto=new LwAmmeterChangeDto();
					String conditions=" 1=1 and flag=1 and userNo = '"+userNo+"'" ;
					System.out.println("conditions="+conditions);
					
					Collection ad=blLwAmmeterChangeFacade.findByConditions(conditions);
					Iterator a=ad.iterator();
					while(a.hasNext()){
					lwAmmeterChangeDto=(LwAmmeterChangeDto)a.next();
					}
	
	 %>
					
					<tr >
						<td class="title"  align="center"><input name="UserName" class="text" value="<%=lwWholeSaleIndicatorDto.getUserNo()%>" style="border:0" readonly="readonly" width="20"></td>
						<td class="title"  align="center"><input name="LastWorkNum" class="text" value="<%=lwWholeSaleIndicatorDto.getLastWorkNum()%>" width="20" >
						<td class="title"  align="center"><input name="ThisWorkNum" class="text" value="<%=lwWholeSaleIndicatorDto.getThisWorkNum()%>" width="20">
						<td class="title"  align="center"><input name="LastIdleNum" class="text" value="<%=lwWholeSaleIndicatorDto.getLastIdleNum()%>" width="20">
						<td class="title"  align="center"><input name="ThisIdleNum" class="text" value="<%=lwWholeSaleIndicatorDto.getThisIdleNum()%>" width="20">
						<td class="title"  align="center"><input name="Rate" class="text" value="<%=lwAmmeterChangeDto.getRate()%>" width="20">
						<td class="title"  align="center"><input name="workQuantity" class="text" value="<%=lwWholeSaleIndicatorDto.getWorkQuantity()%>" width="20">
						<td class="title"  align="center"><input name="unworkQuantity" class="text" value="<%=lwWholeSaleIndicatorDto.getUnworkQuantity()%>" width="20">
						<input name="ifCal" type="hidden" value="<%=lwWholeSaleIndicatorDto.getIfCal()%>">
						<td class="title"  align="center" style="display:none "><input name="flag" class="text" value="<%=lwWholeSaleIndicatorDto.getFlag()%>" width="20">
						<%--<td class="input"><input name="thisWorkNum">
						<td class="input"><input name="UserNo" value="">
						<td class="input"><input name="LastWorkNum">
						<td class="input"><input name="lineCode">
						<td class="input"><input name="12">
						<td class="input"><input name="thisWorkNum">
						
						--%><%--<td class="input" style='width:10%'><img src="../../images/jian-jian.gif" border="0" align="absmiddle" name="img_DataPower_Delete" onclick="deleteRow(this,'DataPower')"></td>
					--%></tr>
					<%} %>
		
	</table>
	<p><br>
	</p>
	<!-- 按钮的显示-->
<table cellpadding="0"  width="100%">
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
	fm.action="/iacontact/viewLWWholeSalePointer.do";
	fm.submit();
}
</script>


</html:html>
