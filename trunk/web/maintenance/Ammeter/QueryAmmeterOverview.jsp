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
  
<title>�������ѯҳ��</title>
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
			out.println("{alert('�˵�֤ID������')");
			out.println("}");
			out.println("}");
	*/	 %>
</script>
<script language="Javascript">
 function validateUserQueryForm(form)
{
   //��������͵ĺϳɺ���
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
			<td height=20px class="input">ʱ����д��ʽΪ��2007-03-29</td>
		</tr>
	</table>
	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>��ѯ�����Ϣ</B></td>
		</tr>
		<tr>
			<td class="blue" colspan="4"></td>
		</tr>
		<!--��Ա���룬����-->
		<tr>
			<td class=title>���</td>
			<td class=input><html:text styleClass="text" maxlength="10"
				property="ammeterNo" value=""/></td>
			<td class=title>���ֵ</td>
			<td class="input"><html:text styleClass="text"
				property="maxNum" value=""/></td>
		</tr>

		<!--��λ���룬����-->
		<tr>
			<td class=title>��������</td>
			<td class=input>
			    <html:text property="ammeterCName" styleClass="text" maxlength="8" value=""></html:text>
			</td>
			<td class=title>Ӣ������</td>
			<td class=input>
			 <html:text property="ammeterEName" styleClass="text" maxlength="8" value=""></html:text>
			</td>
		</tr>
		<tr>
		    <td class="title">����ʹ������</td>
			<td class="input">
				
				<input class="text" name="allowDate" id="f_date_c1" value="" readonly="readonly" style="width:58%"/>
				<img src="../../images/img.gif" id="f_trigger_c1" style="cursor: pointer; border: 1px solid #0083da;" title="Date selector"
             onmouseover="this.style.background='#0083da';" onMouseOut="this.style.background=''" />
			</td>
			<td class="title">�ϱ�����</td>
			<td class="input">
				
				<input class="text" name="installDate" id="f_date_c2" value="" readonly="readonly" style="width:58%"/>
				<img src="../../images/img.gif" id="f_trigger_c2" style="cursor: pointer; border: 1px solid #0083da;" title="Date selector"
             onmouseover="this.style.background='#0083da';" onMouseOut="this.style.background=''" />
			</td>
			
		</tr>
		<!--�Ա𣬳�������-->
		<tr>
				
			<td class=title>�Ƿ���Ч</td>
			<td class="input">
				<html:select  styleClass="blue" property="validStatus" style="width:20%">
  				  <option value="0">��Ч</option>
  				  <option value="1" selected="selected">��Ч</option>				
				</html:select>
				
			</td>
			<td class="input"></td><td class="input"></td>
			
		</tr>
		
		<!--�μӹ���ʱ�䣬��˾ʱ��-->
		
		
	</table>
	<p><br>
	</p>
	<!-- ��ť����ʾ-->
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">
			
			<td class=button align="center"><input type=button class=button
				name=button0 value="��ѯ" onClick="Query();"></td>
				<td class=button align="center"><input type=button class=button
				name=button0 value="����" onClick="AddForm();"></td>
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
