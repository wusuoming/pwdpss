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
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
<script language="javascript"	src="/iacontact/common/pub/js/calendar.js"></script>
<script language=javascript>
<%	/*     BLLwAmmeterFacade blLwAmmeterFacade  = new BLLwAmmeterFacade();
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
	*/	 %>
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
       var strURL = "<%=request.getContextPath()%>/forwordAmmeter.do?method=forwordAmmeter&action=Create";
      fm.action = strURL;
	  fm.submit();
        } 
  function QueryForm(){  
       var strURL = "<%=request.getContextPath()%>/queryAmmeter.do?method=queryAmmeter";
      fm.action = strURL;
	 fm.submit();
        } 
  function checkId(){  
       var strURL = "<%=request.getContextPath()%>/queryAmmeter.do?method=queryAmmeter";
       fm.action = strURL;
	  fm.submit();
        }    
  function Birthday(){  
    var strURL = "<%=request.getContextPath()%>/queryCompanyOverview.do?method=queryCompanyOverview&action=View";
    fm.action= strURL;
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
			<td class=title0 colspan="7"><B>查询电表信息</B></td>
		</tr>
		<tr>
			<td class="blue" colspan="4"></td>
		</tr>
		<!--人员代码，姓名-->
		<tr>
			<td class=title>表号</td>
			<td class=input><html:text styleClass="text" maxlength="10"
				property="ammeterNo" value=""/></td>
			<td class=title>最大值</td>
			<td class="input"><html:text styleClass="text"
				property="maxNum" value=""/></td>
		</tr>

		<!--单位代码，密码-->
		<tr>
			<td class=title>中文名称</td>
			<td class=input>
			    <html:text property="ammeterCName" styleClass="text" maxlength="8" value=""></html:text>
			</td>
			<td class=title>英文名称</td>
			<td class=input>
			 <html:text property="ammeterEName" styleClass="text" maxlength="8" value=""></html:text>
			</td>
		</tr>
		<tr>
		    <td class="title">允许使用日期</td>
			<td class="input">
				
				<input class="text" name="allowDate" id="f_date_c1" value="" readonly="readonly" style="width:58%"/>
				<img src="../../images/img.gif" id="f_trigger_c1" style="cursor: pointer; border: 1px solid #0083da;" title="Date selector"
             onmouseover="this.style.background='#0083da';" onMouseOut="this.style.background=''" />
			</td>
			<td class="title">上表日期</td>
			<td class="input">
				
				<input class="text" name="installDate" id="f_date_c2" value="" readonly="readonly" style="width:58%"/>
				<img src="../../images/img.gif" id="f_trigger_c2" style="cursor: pointer; border: 1px solid #0083da;" title="Date selector"
             onmouseover="this.style.background='#0083da';" onMouseOut="this.style.background=''" />
			</td>
			
		</tr>
		<!--性别，出生日期-->
		<tr>
				
			<td class=title>是否有效</td>
			<td class="input">
				<html:select  styleClass="blue" property="validStatus" style="width:20%">
  				  <option value="0">无效</option>
  				  <option value="1" selected="selected">有效</option>				
				</html:select>
				
			</td>
			<td class="input"></td><td class="input"></td>
			
		</tr>
		
		<!--参加工作时间，入司时间-->
		
		
	</table>
	<p><br>
	</p>
	<!-- 按钮的显示-->
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">
			
			<td class=button align="center"><input type=button class=button
				name=button0 value="查询" onClick="Query();"></td>
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
</script>
</html:html>
