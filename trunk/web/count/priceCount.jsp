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
  
<title>趸售电费发行单</title>
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
String sumJuminPower10=request.getAttribute("sumJuminPower10").toString();
String sumFactoryPower10=request.getAttribute("sumFactoryPower10").toString();
String sumNotJuminPower10=request.getAttribute("sumNotJuminPower10").toString();
String sumBusinessPower10=request.getAttribute("sumBusinessPower10").toString();
String sumFarmPower10=request.getAttribute("sumFarmPower10").toString();
String sumProducePower10=request.getAttribute("sumProducePower10").toString();
String sumJuminPower35=request.getAttribute("sumJuminPower35").toString();
String sumFactoryPower35=request.getAttribute("sumFactoryPower35").toString();
String sumNotJuminPower35=request.getAttribute("sumNotJuminPower35").toString();
String sumBusinessPower35=request.getAttribute("sumBusinessPower35").toString();
String sumFarmPower35=request.getAttribute("sumFarmPower35").toString();
String sumProducePower35=request.getAttribute("sumProducePower35").toString();

String sumAllPower=request.getAttribute("sumAllPower").toString();

String sumJuminFee10=(String)request.getAttribute("sumJuminFee10");
String sumFactoryFee10=(String)request.getAttribute("sumFactoryFee10");
String sumNotJuminFee10=(String)request.getAttribute("sumNotJuminFee10");
String sumBusinessFee10=(String)request.getAttribute("sumBusinessFee10");
String sumFarmFee10=(String)request.getAttribute("sumFarmFee10");
String sumProduceFee10=(String)request.getAttribute("sumProduceFee10");
String sumJuminFee35=(String)request.getAttribute("sumJuminFee35");
String sumFactoryFee35=(String)request.getAttribute("sumFactoryFee35");
String sumNotJuminFee35=(String)request.getAttribute("sumNotJuminFee35");
String sumBusinessFee35=(String)request.getAttribute("sumBusinessFee35");
String sumFarmFee35=(String)request.getAttribute("sumFarmFee35");
String sumProduceFee35=(String)request.getAttribute("sumProduceFee35");
String sanxiaFee=(String)request.getAttribute("sanxiaFee");
String dianjinFee=(String)request.getAttribute("dianjinFee");
String jijinFee=(String)request.getAttribute("jijinFee");
String jumintax10=(String)request.getAttribute("jumintax10");
String notjumintax10=(String)request.getAttribute("notjumintax10");
String shengchantax10=(String)request.getAttribute("shengchantax10");
String gongyetax10=(String)request.getAttribute("gongyetax10");
String shangyetax10=(String)request.getAttribute("shangyetax10");
String nongguantax10=(String)request.getAttribute("nongguantax10");
String juminchun10=(String)request.getAttribute("juminchun10");
String notjuminchun10=(String)request.getAttribute("notjuminchun10");
String shengchanchun10=(String)request.getAttribute("shengchanchun10");
String gongyechun10=(String)request.getAttribute("gongyechun10");
String shangyechun10=(String)request.getAttribute("shangyechun10");
String nongguanchun10=(String)request.getAttribute("nongguanchun10");
String jumintax35=(String)request.getAttribute("jumintax35");
String notjumintax35=(String)request.getAttribute("notjumintax35");
String shengchantax35=(String)request.getAttribute("shengchantax35");
String gongyetax35=(String)request.getAttribute("gongyetax35");
String shangyetax35=(String)request.getAttribute("shangyetax35");
String nongguantax35=(String)request.getAttribute("nongguantax35");
String juminchun35=(String)request.getAttribute("juminchun35");
String notjuminchun35=(String)request.getAttribute("notjuminchun35");
String shengchanchun35=(String)request.getAttribute("shengchanchun35");
String gongyechun35=(String)request.getAttribute("gongyechun35");
String shangyechun35=(String)request.getAttribute("shangyechun35");
String nongguanchun35=(String)request.getAttribute("nongguanchun35");
String sumAllFee=(String)request.getAttribute("sumAllFee");
String sumAllTax=(String)request.getAttribute("sumAllTax");
String sumAllChunFee=(String)request.getAttribute("sumAllChunFee");
String sumCountFee=(String)request.getAttribute("sumCountFee");
String sanxiatax=(String)request.getAttribute("sanxiatax");
String jijintax=(String)request.getAttribute("jijintax");
String dianjintax=(String)request.getAttribute("dianjintax");
String sanxiachun=(String)request.getAttribute("sanxiachun");
String jijinchun=(String)request.getAttribute("jijinchun");
String dianjinchun=(String)request.getAttribute("dianjinchun");






%>
<form  name="fm" method="post">
	<table class=common width="500%"  border="1" cellspacing="1" cellpadding="5">
		
	<tr>
			<td class=title0 colspan="11"><font size="4">包头市农电公司电费电量发行单</font></td>
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
					<span class="title"><font size="2">居民生活(10KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumJuminPower10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=juminchun10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=jumintax10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumJuminFee10%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">非居民照明(10KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumNotJuminPower10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=notjuminchun10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=notjumintax10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumNotJuminFee10%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">商业用电(10KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumBusinessPower10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shangyechun10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shangyetax10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumBusinessFee10%></font></span>
				<br></td>
				
							
			</tr>		
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">农业生产(10KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumProducePower10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shengchanchun10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shengchantax10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumProduceFee10%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">排灌用电(10KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumFarmPower10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=nongguanchun10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=nongguantax10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumFarmFee10%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">非普工业(10KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumFactoryPower10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=gongyechun10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=gongyetax10%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumFactoryFee10%></font></span>
				<br></td>
				
							
			</tr>
			
									<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">居民生活(35KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumJuminPower35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=juminchun35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=jumintax35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumJuminFee35%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">非居民照明(35KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumNotJuminPower35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=notjuminchun35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=notjumintax35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumNotJuminFee35%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">商业用电(35KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumBusinessPower35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shangyechun35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shangyetax35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumBusinessFee35%></font></span>
				<br></td>
				
							
			</tr>		
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">农业生产(35KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumProducePower35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shengchanchun35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=shengchantax35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumProduceFee35%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">排灌用电(35KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumFarmPower35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=nongguanchun35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=nongguantax35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumFarmFee35%></font></span>
				<br></td>
				
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">非普工业(35KV)</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumFactoryPower35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=gongyechun35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=gongyetax35%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumFactoryFee35%></font></span>
				<br></td>
				
							
			</tr>
			<tr>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">合计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumAllPower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumAllChunFee%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumAllTax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumAllFee%></font></span>
				<br></td>
				
							
			</tr>
			
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">三峡</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sanxiachun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sanxiaFee%></font></span>
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
					<span class="title"><font size="2"><%=jijinchun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=jijintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=jijinFee%></font></span>
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
					<span class="title"><font size="2"><%=dianjinchun%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dianjinFee%></font></span>
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
					<span class="title"><font size="2"><%=sumCountFee%></font></span>
				<br></td>
				
							
			</tr>
			
	</table>
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
