<%@ page contentType="text/html; charset=GBK"%>
<%@page import="com.elongway.pss.bl.action.domain.BLLwAmmeterAction"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterFacade"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>电表管理查询页面</title>
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
	src="/mimessage/common/pub/StaticJavascript.jsp"></script>
<script language="javascript"	src="/mimessage/common/pub/js/calendar.js"></script>
<script language=javascript>
<%	     BLLwAmmeterFacade blLwAmmeterFacade  = new BLLwAmmeterFacade();
    Collection <LwAmmeterDto>collection = blLwAmmeterFacade.findByConditions("");
    		String visaCode = null;
		int count = 0;
		count = collection.size();
		out.println("function checkVisaID(id)");
			out.println("{");
			out.println("var tempCount = 0;");
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwAmmeterDto vsStorageDto = (LwAmmeterDto) iterator.next();
			visaCode = vsStorageDto.getAmmeterNo();
			out.println("if (id !=\"" + visaCode+"\")");
			out.println("{");
			out.println(" tempCount =tempCount+1");
			out.println(" }");
		}
			out.println("if (tempCount ==\""+count+"\")");
			out.println("{alert('此单证ID不存在')");
			out.println("}");
			out.println("}");
		 %>
</script>
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
       var strURL = "<%=request.getContextPath()%>/forwordLineAmmeter.do?method=forwordLineAmmeter&action=Create";
       fm.action = strURL;
	  fm.submit();
        } 
  function QueryForm(){  
       var strURL = "<%=request.getContextPath()%>/queryLineAmmeter.do?method=queryLineAmmeter";
       fm.action = strURL;
	   fm.submit();
        } 
     
</script>
</head>
<body class=interface>
<html:errors />
<html:form action="/forwordAmmeter"
	onsubmit="return validateUserQueryForm(this);">
	<html:hidden property="pageNo" value="1" />
	<table width="100%">
		<tr>
			<td height=20px class="input">时间填写格式为：2007-03-29</td>
		</tr>
	</table>
	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>查询线路电表配置信息</B></td>
		</tr>
		<tr>
			<td class="blue" colspan="4"></td>
		</tr>
		<!--人员代码，姓名-->
		<tr>
			<td class=title>线路代码</td>
			<td class=input><html:text styleClass="codecode" maxlength="20"
							property="lineCode" ondblclick="codeQuery(this)"
							onkeyup="codeQuery(this);" /> <img
							src="../../images/redstar.gif" ></td>
			<td class=title>表 号</td>
			<td class="input"><html:text styleClass="text"
				property="ammeterNo" value=""/></td>
		</tr>

		
		
		
	</table>
	<p><br>
	</p>
	<!-- 按钮的显示-->
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">
			
			<td class=button align="center"><input type=button class=button
				name=button0 value="查询" onClick="QueryForm();"></td>
				<td class=button align="center"><input type=button class=button
				name=button0 value="新增" onClick="AddForm();"></td>
		</tr>
	</table>
</html:form>
</body>
<script type="text/javascript">
    Calendar.setup({
        inputField     :    "f_date_c1",     // id of the input field
        button         :    "f_trigger_c1",  // trigger for the calendar (button ID)
        align          :    "Bl",           // alignment (defaults to "Bl")
        singleClick    :    true
    });
     Calendar.setup({
        inputField     :    "f_date_c2",     // id of the input field
        button         :    "f_trigger_c2",  // trigger for the calendar (button ID)
        align          :    "Bl",           // alignment (defaults to "Bl")
        singleClick    :    true
    });
    Calendar.setup({
        inputField     :    "f_date_c3",     // id of the input field
        button         :    "f_trigger_c3",  // trigger for the calendar (button ID)
        align          :    "Bl",           // alignment (defaults to "Bl")
        singleClick    :    true
    });
</script>
<script language="javascript">
   var fm = uiGetAmmeterForm;
   function codeQuery(field)
{
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.lineCode.value+"&TableName=LwPowerLine";

	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>

</html:html>
