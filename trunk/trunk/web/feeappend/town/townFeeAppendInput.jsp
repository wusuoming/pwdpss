<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
	<meta http-equiv=Content-Type content="text/html; charset=gb2312">

	<title>ֱ����������¼��ҳ��</title>
	<link rel="stylesheet" type="text/css" media="all"
		href="/mimessage/css/calendar.css" title="win2k-cold-1" />
	<app:css />
	<html:base />
	<STYLE>
BODY {
	SCROLLBAR-FACE-COLOR: #ffffff;
	SCROLLBAR-HIGHLIGHT-COLOR: #A9CBED;
	SCROLLBAR-SHADOW-COLOR: #A9CBED;
	SCROLLBAR-3DLIGHT-COLOR: #FFFFFF;
	SCROLLBAR-ARROW-COLOR: #A9CBED;
	SCROLLBAR-TRACK-COLOR: #FFFFFF;
	SCROLLBAR-DARKSHADOW-COLOR: #FFFFFF;
}
</STYLE>
	<script language="Javascript"
		src="/iacontact/common/pub/StaticJavascript.jsp"></script>
	<link rel="stylesheet" type="text/css" media="all"
		href="../../../../iacontact/css/calendar-win2k-cold-1.css"
		title="win2k-cold-1" />

	<!-- main calendar program -->
	<script type="text/javascript"
		src="../../../../iacontact/common/pub/js/calendar.js"></script>

	<!-- language for the calendar -->

	<script type="text/javascript"
		src="../../../../iacontact/common/pub/js/calendar-cn-utf8.js"></script>

	<!-- the following script defines the Calendar.setup helper function, which makes
       adding a calendar a matter of 1 or 2 lines of code. -->
	<script type="text/javascript"
		src="../../../../iacontact/common/pub/js/calendar-setup.js"></script>
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
  alert();  
       var strURL = "<%=request.getContextPath()%>/townSave.do";
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
	<script language="javascript">
 
</script>
</head>
<body class=interface>
	<html:errors />
	<%Collection formList = (Collection)request.getAttribute("indicatorList"); %>
	<form name="fm" method="post">
		<table class=common width="500%" cellspacing="1" cellpadding="5">
			<tr class=listtitle align="center">
				<td class=title0 colspan="12">
					<B><font size="3">ֱ����׷�ӵ������¼��ҳ��</font> </B>
				</td>
			</tr>
			<%String statMonth = (String)request.getAttribute("statMonth");
			String firstquery = (String)request.getAttribute("firstquery");
			 %>
			<tr>
				<td class="blue" colspan="1">
					��������
				</td>
				<td>
					<input name="statMonth" type="text" class="text" width="20"
						value=<%=statMonth %> readonly="readonly">
				</td>
				
			</tr>
			<!--��Ա���룬����-->
			<tr class=listtitle>
				<td>
					����
				</td>
				<td>
					����
				</td>
				<td>
					�����й�ָ��
				</td>
				<td>
					���г���ָ��
				</td>
				<td>
					�����й�ָ��
				</td>
				<td>
					����
				</td>
				<td>
					���µ���
				</td>	
				<td>
					׷�ӵ���
				</td>
				


			</tr>
			<%if(formList!=null){ 
		for (Iterator iterator = formList.iterator(); iterator.hasNext();) {
			LwTownIndicatorDto dto = (LwTownIndicatorDto) iterator.next();
			if(firstquery!=null){
			%>
			    <tr>
				<td><%=dto.getUserNo() %>
				</td>
				<input name="userNo" type="hidden" value=<%=dto.getUserNo() %>>
				<td><%=dto.getUserName() %>
				</td>
				<td>
					<input name="thisWorkNum" type="text" class="text"
						value=<%=dto.getThisWorkNum() %>  readonly="readonly"  onblur="getSum();"
						style="width: 90px">
				</td>
				<td>
					<input name="midWorkNum" type="text" class="text"  onblur="append();"  style="width: 90px"
						value=<%=dto.getMidWorkNum() %> 
						>
				</td>
				<td>
					<input name="lastWorkNum" type="text" class="text" readonly="readonly"
						style="width: 90px" 
						value=<%=dto.getLastWorkNum() %> >
				</td>
				<td>
					<input name="rate" type="text" class="text" 
						value=<%=dto.getRate() %> onblur="getSum();" style="width: 90px">
				</td>
				<td>
					<input name="readQuantity" type="text" class="text" 
						value=<%=dto.getReadQuantity() %>  style="width: 90px">
				</td>
				<td>
					<input name="appendQuantity" type="text" class="text" style="width:90px"
						value=<%=dto.getAppendCalQuantity() %>>
				</td>
				
				
			</tr>
			<%
		}else{%>
		 <tr>
				<td><%=dto.getUserNo() %>
				</td>
				<input name="userNo" type="hidden" value=<%=dto.getUserNo() %>>
				<td><%=dto.getUserName() %>
				</td>
				<td>
					<%=dto.getThisWorkNum() %>
				</td>
				<td>
					<%=dto.getMidWorkNum() %> 
						
				</td>
				<td>
					<%=dto.getLastWorkNum() %> 
				</td>
				<td>
					<%=dto.getRate() %> 
				</td>
				<td>
					<%=dto.getReadQuantity() %> 
				</td>
				<td>
					<%=dto.getAppendCalQuantity() %>
				</td>
				
				
			</tr>
		<% }}}
		%>

		</table>

		<table cellpadding="0" cellspacing="0" width="100%">
			<tr>
				<td>
					<table cellpadding="0" cellspacing="0" width="100%">
						<tr>
						<tr class="listtitle" align="center">
							<td class=button align="center">
								<input type=button class=button name=button0 value="��  ��"
									onClick="checkNotInput();">
							</td>
						</tr>
					</table>
				</td>
				<td>
					<table cellpadding="0" cellspacing="0" width="100%">
						<tr>
						<tr class="listtitle" align="center">
							<td class=button align="center">
								<input type=button class=button name=button0 value="��  ��"
									onClick="appendCal();">
							</td>
						</tr>
					</table>
				</td>
				<td>
					<table cellpadding="0" cellspacing="0" width="100%">
						<tr>
						<tr class="listtitle" align="center">
							<td class=button align="center">
								<input type=button class=button name=button2 value="��  ��"
									onClick="history.go(-1);">
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
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
<script language="javascript">
   function check()
{	
    var count = document.getElementsByName('thisWorkNum').length;
            if(count ==1){
           	fm.readQuantity.value = parseInt((parseFloat(fm.thisWorkNum.value) - parseFloat(fm.lastWorkNum.value))*parseInt(fm.rate.value));
            }else{
            	for(var i=0;i<count;i++){
            		fm.readQuantity[i].value = parseInt(Math.round((parseFloat(fm.thisWorkNum[i].value) - parseFloat(fm.lastWorkNum[i].value))* parseFloat(fm.rate[i].value)));

            	}
            	
            }	
}

   function append()
{	
    var count = document.getElementsByName('thisWorkNum').length;
            if(count ==1){
           	fm.appendQuantity.value = parseInt(Math.round((parseFloat(fm.thisWorkNum.value) - parseFloat(fm.midWorkNum.value))*parseInt(fm.rate.value)));
            }else{
            	for(var i=0;i<count;i++){
            		fm.appendQuantity[i].value = parseInt(Math.round((parseFloat(fm.thisWorkNum[i].value) - parseFloat(fm.midWorkNum[i].value))* parseFloat(fm.rate[i].value)));

            	}
            	
            }	
}
   function appendCal()
{	
   var strURL = "<%=request.getContextPath()%>/townAppendCal.do";
   if(!confirm('�Ƿ����׷�ӷ��õļ��㣿')){
           		return false;
           		}
           		else{           		   
            fm.action = strURL;
	        fm.submit();
           		}
}
function checkSumQuantity()
{	
    var count = document.getElementsByName('thisWorkNum').length;
            if(count ==1){
           	fm.sumQuantity.value = parseInt(fm.readQuantity.value) + parseInt(fm.tranferLossQuantity.value) + parseInt(fm.excepQuantity.value) + parseInt(fm.chgAmmeterQuantity.value) + parseInt(fm.compensateQuantity.value);
            }else{
            	for(var i=0;i<count;i++){
            		fm.sumQuantity[i].value = parseInt(fm.readQuantity[i].value) + parseInt(fm.tranferLossQuantity[i].value) + parseInt(fm.excepQuantity[i].value) + parseInt(fm.chgAmmeterQuantity[i].value) + parseInt(fm.compensateQuantity[i].value);

            	}
            	
            }	
}
function getSum(){
check();
checkSumQuantity();
}
  function checkNotInput()
{	
var strURL = "<%=request.getContextPath()%>/townAppendSave.do";
    var count = document.getElementsByName('thisWorkNum').length;

    var n = 0;
            if(count ==1){
           	if(parseFloat(fm.thisWorkNum.value) <= parseFloat(fm.lastWorkNum.value))
           	{
           		if(!confirm('����û��¼��ָ����û����Ƿ�Ҫ����')){
           		fm.thisWorkNum.focus();
           		return false;
           		}
           		else{           		   
            fm.action = strURL;
	        fm.submit();
           		}
           		
           	}else{
           	if(!confirm('ȷ��Ҫ����')){
           fm.action = strURL;
	       fm.submit();
           	}
           	}           
}
else{
		for(var i=0;i<fm.thisWorkNum.length;i++){
			if(parseFloat(fm.thisWorkNum[i].value)<= parseFloat(fm.lastWorkNum[i].value))
			{
			n=n+1;
			}
		}
		if(n>0)
		{
		    if(!confirm('����û��¼��ָ����û����Ƿ�Ҫ����')){
           		return false;
           		}else{           		   
             fm.action = strURL;
	         fm.submit();
           		}
		}else{
		if(!confirm('ȷ��Ҫ���棿')){
           	 fm.action = strURL;
	         fm.submit();
           	}
           	}

}
}
 


     
</script>
</html:html>
