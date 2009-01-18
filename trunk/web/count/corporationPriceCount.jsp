<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>大工业电费电量发行单</title>
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
       var strURL = "<%=request.getContextPath()%>/townSave.do";
       fm.action = strURL;
	 
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
	if(fm.userNo==null){
	alert(fm.userNo.value);
	}
}
</script>
</head>
<body class=interface>&nbsp; 
<html:errors />
<%
String dagongye10Power=request.getAttribute("dagongye10Power").toString();
String dagongye35Power=request.getAttribute("dagongye35Power").toString();
String guitie10Power=request.getAttribute("guitie10Power").toString();
String guitie35Power=request.getAttribute("guitie35Power").toString();
String dianshi10Power=request.getAttribute("dianshi10Power").toString();
String dianshi35Power=request.getAttribute("dianshi35Power").toString();
String huafei10Power=request.getAttribute("huafei10Power").toString();

String huafei35Power=request.getAttribute("huafei35Power").toString();
String sumPower=request.getAttribute("sumPower").toString();

String dagongye10Fee=(String)request.getAttribute("dagongye10Fee");
String dagongye35Fee=(String)request.getAttribute("dagongye35Fee");
String guitie10Fee=(String)request.getAttribute("guitie10Fee");
String guitie35Fee=(String)request.getAttribute("guitie35Fee");
String dianshi10Fee=(String)request.getAttribute("dianshi10Fee");
String dianshi35Fee=(String)request.getAttribute("dianshi35Fee");
String huafei10Fee=(String)request.getAttribute("huafei10Fee");
String huafei35Fee=(String)request.getAttribute("huafei35Fee");
String dagongye10tax=(String)request.getAttribute("dagongye10tax");
String dagongye35tax=(String)request.getAttribute("dagongye35tax");
String guitie10tax=(String)request.getAttribute("guitie10tax");
String guitie35tax=(String)request.getAttribute("guitie35tax");
String dianshi10tax=(String)request.getAttribute("dianshi10tax");
String dianshi35tax=(String)request.getAttribute("dianshi35tax");
String huafei10tax=(String)request.getAttribute("huafei10tax");
String huafei35tax=(String)request.getAttribute("huafei35tax");
String dagongye10chun=(String)request.getAttribute("dagongye10chun");
String dagongye35chun=(String)request.getAttribute("dagongye35chun");
String guitie10chun=(String)request.getAttribute("guitie10chun");
String guitie35chun=(String)request.getAttribute("guitie35chun");
String dianshi10chun=(String)request.getAttribute("dianshi10chun");
String dianshi35chun=(String)request.getAttribute("dianshi35chun");
String huafei10chun=(String)request.getAttribute("huafei10chun");
String huafei35chun=(String)request.getAttribute("huafei35chun");
String sumTax=(String)request.getAttribute("sumTax");
String sumChun=(String)request.getAttribute("sumChun");
String sumFee=(String)request.getAttribute("sumFee");


 %>

<form  name="fm" method="post">
	<table class=common width="500%" cellspacing="1" cellpadding="5" border="1">
		
	<tr>
			<td class=title0 colspan="11"><font size="4">包头市农电公司大工业电费电量发行单</font></td>
		</tr>
		
		
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">项目</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">售电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">纯电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">总计</font></span>
				<br></td>	
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">大工业(1-10KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dagongye10Power%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dagongye10chun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dagongye10tax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dagongye10Fee%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">大工业(10-35KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dagongye35Power%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dagongye35chun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dagongye35tax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dagongye35Fee%></font></span>
				<br></td>
				
							
			</tr>
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">硅铁(1-10KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=guitie10Power%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=guitie10chun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=guitie10tax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=guitie10Fee%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">硅铁(10-35KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=guitie35Power%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=guitie35chun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=guitie35tax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=guitie35Fee%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">电石(1-10KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dianshi10Power%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dianshi10chun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dianshi10tax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dianshi10Fee%></font></span>
				<br></td>
				
							
			</tr>
			
									<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">电石(10-35KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dianshi35Power%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dianshi35chun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dianshi35tax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dianshi35Fee%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">化肥(1-10KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=huafei10Power%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=huafei10chun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=huafei10tax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=huafei10Fee%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">化肥(10-35KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=huafei35Power%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=huafei35chun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=huafei35tax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=huafei35Fee%></font></span>
				<br></td>
				
							
			</tr>		
			
			<tr>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">合计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumPower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumChun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumTax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumFee%></font></span>
				<br></td>
				
							
			</tr><%--
			
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">三峡</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">基金</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				
							
			</tr>
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">电金</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				
							
			</tr>
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总费用</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				
							
			</tr>
			
	--%></table>
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" 打 印 " onClick="getPage()">        </td> 
        </tr> 
    </table>

</form>
</body>
<script language="javascript">
function getPage(){
	window.print();
}
</script>

</html:html>
