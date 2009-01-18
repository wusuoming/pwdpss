<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page import="java.text.DecimalFormat"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.dto.custom.WholeSaleFee"/>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>包头农电总公司趸售电费电量发行单</title>
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

<form  name="fm" method="post">

	<table class=common width="500%"  border="1" cellspacing="1" cellpadding="6">
	<td style="display:none"><input type="hidden" name="StartMonth" value="<%=(String)request.getAttribute("inputDate") %>"></td>
		
	<tr>
			<td class=title0 colspan="13"><font size="4">包头市农电公司趸售电费电量发行单</font></td>
		</tr>
		
		<%
		
		DecimalFormat df = new DecimalFormat("###0.00");
		Collection col=(List)request.getAttribute("list");
		String alldianliang=(String)request.getAttribute("alldianliang");
		
		String alldianfee=(String)request.getAttribute("alldianfee");
		String alltax=(String)request.getAttribute("alltax");
		String alllilv=(String)request.getAttribute("alllilv");
		String allsanxia=(String)request.getAttribute("allsanxia");
		String allsanxiatax=(String)request.getAttribute("allsanxiatax");
		String jijin=(String)request.getAttribute("jijin");
		String alljijintax=(String)request.getAttribute("alljijintax");
		String alldianjin=(String)request.getAttribute("alldianjin");
		String alldianjintax=(String)request.getAttribute("alldianjintax");
		String allfee=(String)request.getAttribute("allfee");
		
		Iterator it=col.iterator();
		WholeSaleFee  wholeSaleFee=new WholeSaleFee();
		while(it.hasNext()){
		wholeSaleFee=(WholeSaleFee)it.next();
		
		 %>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量10KV</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费10KV</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量10KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费10KV</font></span>
				<br></td>
							
			</tr>
			<tr >
				<td nowrap width="10%"  align="center" rowspan="5">
					<span class="title"><font size="2"><%=wholeSaleFee.getComcode()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getJumindianliang())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getJumindianfee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getFeijumindianliang())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getFeijunmindianfee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getShengchandianliang())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getShengchandianfee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getGongyedianliang())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getGongyedianfee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getShangyedianliang())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getShangyedianfee())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getNongguandianliang())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getNongguandianfee())%></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电量35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">居民电费35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电量35KV</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">非居民电费35KV</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">生产电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电量35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">商业电费35KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电量35KV</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">工业电费35KV</font></span>
				<br></td>
							
			</tr>
			<tr >
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getJumindianliang35())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getJumindianfee35())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getFeijumindianliang35())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getFeijunmindianfee35())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getShengchandianliang35())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getShengchandianfee35())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getGongyedianliang35())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getGongyedianfee35())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getShangyedianliang35())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getShangyedianfee35())%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getNongguandianliang35())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getNongguandianfee35())%></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总电量</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">利率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
				
						
			</tr>
			
					<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getSumpower())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getSumfee()/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getSumfee()/1.17*0.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getLilvdianfee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getSanxiafee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getSanxiatax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getJijinfee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getJijintax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getDianjinfee())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getDianfeetax())%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(wholeSaleFee.getSumfee())%></font></span>
				<br></td>
				
						
			</tr>
			<%} %>
			
			<tr class=listtitle>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电量</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">利率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">三峡税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">基金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">电金税</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
							
			</tr>
			
						<tr >
						<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"></font></span>
				<br></td>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=alldianliang%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=alldianfee%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=alltax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=alllilv%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=allsanxia%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=allsanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=jijin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=alljijintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=alldianjin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=alldianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=allfee%></font></span>
				<br></td>
				
						
			</tr>
	</table>
	<table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" 打 印 " onClick="printCount()">        </td> 
        </tr> 
    </table>

</form>
</body>
<script language="javascript">
function printCount(){
  var b=fm.StartMonth.value;
strURL   =   "<%=request.getContextPath()%>/countAllResult.do?inputDate="+b;
	winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
}
</script>

</html:html>
