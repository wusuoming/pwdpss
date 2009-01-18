<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterFacade"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterDto"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">

<title>新增电表页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/iacontact/css/calendar.css" title="win2k-cold-1" /> 
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
<script language="javascript"	src="/iacontact/common/pub/js/calendar.js"></script>
<script language="Javascript">

   function SaveAddForm(){  
       var strURL = "<%=request.getContextPath()%>/addAmmeter.do?method=addAmmeter";
      fm.action = strURL;
	   fm.submit();
        } 
   function EditForm(){  
       var strURL = "<%=request.getContextPath()%>/updateAmmeter.do?method=updateAmmeter";
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
</head>
<body class=interface>
<html:errors />
<html:form action="/addAmmeter">
	<html:hidden property="pageNo" value="1" />
	<table width="100%">
		<tr>
			<td height=20px class="input">时间填写格式为：2007-03-29</td>
		</tr>
	</table>
	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
		
		
		<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=title0 colspan="7"><B>新增电表信息</B></td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class=title0 colspan="7"><B>修改电表信息</B></td>
			</logic:equal>
		</tr>
		<tr>
			<td class="blue" colspan="4"></td>
		</tr>
		<!--人员代码，姓名-->
	<tr>
			<td class=title>表号</td>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=input><input type="text"  class="text" maxlength="20"
				name="ammeterNo" value=""  >&nbsp;<img src="../../images/redstar.gif" ></td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class=input><input type="text"  class="text" maxlength="20" readonly="readonly"
				name="ammeterNo" value="<bean:write name="uiGetAmmeterForm" property="ammeterNo"/>">&nbsp;<img src="../../images/redstar.gif" ></td>
			</logic:equal>
			
			<td class=title>倍率</td>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=input>
			  <input type="text" name="rate" class="text" maxlength="20" value="">
			</td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class=input>
			  <input type="text" name="rate" class="text" maxlength="20" value="<bean:write name="uiGetAmmeterForm" property="rate"/>">
			</td>
			</logic:equal>		
			
		</tr>

		<!--单位代码，密码-->
		<tr>
			<td class=title>相</td>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=input>
			    <input type="text" name="ammeterX" class="text" maxlength="20" value="">
			</td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class=input>
			    <input type="text" name="ammeterX" class="text" maxlength="20" value="<bean:write name="uiGetAmmeterForm" property="ammeterX"/>">
			</td>
			</logic:equal>
			
			<td class=title>伏</td>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=input>
			  <input type="text" name="ammeterV" class="text" maxlength="20" value="">
			</td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class=input>
			  <input type="text" name="ammeterV" class="text" maxlength="20" value="<bean:write name="uiGetAmmeterForm" property="ammeterV"/>">
			</td>
			</logic:equal>
			
		</tr>
		<tr>
			<td class=title>安</td>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=input>
			    <input type="text" name="ammeterA" class="text" maxlength="20" value="">
			</td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class=input>
			    <input type="text" name="ammeterA" class="text" maxlength="20" value="<bean:write name="uiGetAmmeterForm" property="ammeterA"/>">
			</td>
			</logic:equal>
			
			<td class=title>型式</td>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=input>
			  <input type="text" name="ammeterType" class="text" maxlength="20" value="">
			</td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class=input>
			  <input type="text" name="ammeterType" class="text" maxlength="20" value="<bean:write name="uiGetAmmeterForm" property="ammeterType"/>">
			</td>
			</logic:equal>
			
		</tr>
		<tr>
			<td class=title>常数</td>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=input>
			    <input type="text" name="coust" class="text" maxlength="20" value="">
			</td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class=input>
			    <input type="text" name="coust" class="text" maxlength="20" value="<bean:write name="uiGetAmmeterForm" property="coust"/>">
			</td>
			</logic:equal>
			
			<td class=title>精度</td>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=input>
			  <input type="text" name="precision" class="text" maxlength="20" value="">
			</td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class=input>
			  <input type="text" name="precision" class="text" maxlength="20" value="<bean:write name="uiGetAmmeterForm" property="precision"/>">
			</td>
			</logic:equal>		
		</tr>
		
			
		 <tr>
		    <td class="title">允许使用日期</td>
		    <logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class="input">				
				<input class="text" name="allowDate" id="f_date_c1" value="" readonly="readonly" style="width:58%"/>
				<img src="../../images/img.gif" id="f_trigger_c1" style="cursor: pointer; border: 1px solid #0083da;" title="Date selector"
             onmouseover="this.style.background='#0083da';" onMouseOut="this.style.background=''" />
			</td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class="input">
				
				<input class="text" name="allowDate" id="f_date_c1" value="<bean:write name="uiGetAmmeterForm" property="allowDate"/>" readonly="readonly" style="width:58%"/>
				<img src="../../images/img.gif" id="f_trigger_c1" style="cursor: pointer; border: 1px solid #0083da;" title="Date selector"
             onmouseover="this.style.background='#0083da';" onMouseOut="this.style.background=''" />
			</td>
			</logic:equal>
			
			<td class=title>是否有效</td>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class="input">				
				 <html:select  styleClass="blue" property="validStatus" style="width:20%">
				    <option value="1" selected="selected">有效</option>	
				    <option value="0" >无效</option>
				  </html:select>
			</td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class="input">
				<html:select  styleClass="blue" property="validStatus" style="width:20%">
				    <logic:equal name="uiGetAmmeterForm" property="validStatus" value="1">
  				     <option value="1" selected="selected">有效</option>	
  				     <option value="0" >无效</option>
  				  	</logic:equal>		
  				  	<logic:equal name="uiGetAmmeterForm" property="validStatus" value="0">
  				     <option value="1" >有效</option>	
  				     <option value="0" selected="selected">无效</option>
  				  	</logic:equal>		
				</html:select>
			</td>
			</logic:equal>
				
		</tr> 
		<tr>
			<td class=title>最大指针数</td>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=input>
			    <input type="text" name="maxnum" class="text" maxlength="20" value="">
			</td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class=input>
			    <input type="text" name="maxnum" class="text" maxlength="20" value="<bean:write name="uiGetAmmeterForm" property="maxnum"/>">
			</td>
			</logic:equal>
			
			<td class=title>厂名</td>
				<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class="input"><input type="text"  class="text" maxlength="20"
				name="factoryName" value=""></td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
			<td class="input"><input type="text"  class="text" maxlength="20"
				name="factoryName" value="<bean:write name="uiGetAmmeterForm" property="factoryName"/>"></td>
			</logic:equal>
		</tr>
		
		
	</table>
	<p><br>
	</p>
	<!-- 按钮的显示-->
	
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">
			<logic:equal name="uiGetAmmeterForm" property="action" value="Create">
				<td class=button align="center"><input type="button"
					class="button" name="button0" value="保 存" onClick="SaveAddForm();"></td>
				<td class=button align="center"><input type=reset class=button
					name=button0 value="返 回"
					onClick="history.back(-1)"></td>
			</logic:equal>
			<logic:equal name="uiGetAmmeterForm" property="action" value="Edit">
				<td class=button align="center"><input type="button"
					class="button" name="button0" value="修 改"
					onClick="EditForm();"></td>
				<td class=button align="center"><input type=reset class=button
					name=button0 value="返 回" onClick="history.back(-1)"></td>
			</logic:equal>
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
<script language=javascript>
<%	     BLLwAmmeterFacade blLwAmmeterFacade  = new BLLwAmmeterFacade();
    Collection <LwAmmeterDto>collection = blLwAmmeterFacade.findByConditions("");
    		String visaCode = null;
		int count = 0;
		count = collection.size();
		out.println("function checkAmmeterID(id)");
			out.println("{");
			out.println("var tempCount = 0;");
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwAmmeterDto vsStorageDto = (LwAmmeterDto) iterator.next();
			visaCode = vsStorageDto.getAmmeterNo();
			out.println("if (id ==\"" + visaCode+"\")");
			out.println("{");
			out.println(" alert('此表号已经存在，请重新录入')");
			out.println(" break; ");
			out.println(" }");
			
		}
			out.println("}");
		 %>
</script>
<script language="javascript">
   var fm = uiGetAmmeterForm;
</script>
</html:html>
