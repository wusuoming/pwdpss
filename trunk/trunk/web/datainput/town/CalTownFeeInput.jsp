<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="com.elongway.pss.dto.domain.LwTownPriceSummaryDto" %>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>直供乡电费录入页面</title>
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
  
       var strURL = "<%=request.getContextPath()%>/saveAndCal.do?action=Create";
      fm.action = strURL;
	  fm.submit();
        } 
  function QueryForm(){  
       var strURL = "<%=request.getContextPath()%>/queryAmmeter.do?method=queryAmmeter";
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
<body class=interface>
<html:errors />
<% UITownCalForm form = (UITownCalForm)request.getAttribute("uiTownCalForm");
	String userNo = "";
	String lineCode = "";
	String thisWorkNum = "";
	String inputDate = "";
	if(form != null){
	userNo = form.getUserNo();
	lineCode = form.getLineCode();
	thisWorkNum = form.getThisWorkNum();
	inputDate = form.getInputDate();
	}
%>
<form  name="fm" method="post"
	onsubmit="return validateUserQueryForm(this);">
	<html:hidden property="pageNo" value="1" />
	<table width="100%">
		<tr>
			<td height=20px class="input">时间填写格式为：2007-03-29</td>
		</tr>
	</table>
	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>录入指针信息</B></td>
		</tr>
		<tr>
			<td class="blue" colspan="4"></td>
		</tr>
		<!--人员代码，姓名-->
		<tr>
			<td class=title>户号</td>
			<td class=input>
				<input class="codecode" maxlength="20"
							name="userNo" ondblclick="codeQuery(this)"
							onkeyup="codeQuery(this);" /> <img
							src="../../images/redstar.gif" >
				</td>
			<td class=title>线路代码</td>
			<td class="input">
				<input name="lineCode" type="text" class="text" width="20" value=<%=lineCode %>></td>
		</tr>

		<!--单位代码，密码-->
		<tr>
			<td class=title>有功指针</td>
			<td class=input> 
			<input name="thisWorkNum" type="text" class="text" width="20" value=<%=thisWorkNum %>>
			</td>
			<td class=title>录入日期</td>
			<td class=input> 
			<input name="inputDate" type="text" class="text" width="20" value=<%=inputDate %>>
			</td>
		</tr>
		
		
	</table>
	<p><br>
	</p>
	<!-- 按钮的显示-->
	<% String firstquery = (String )request.getAttribute("firstquery") ;
	if(firstquery !=null){%>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button
				name=button0 value="计算并保存" onClick="AddForm();"></td>
		</tr>
	</table>
	<%}
	if(firstquery ==null){
	LwTownPriceSummaryDto lwTownPriceSummaryDto = (LwTownPriceSummaryDto)request.getAttribute("lwTownPriceSummaryDto");
	
	// 比例
	double farmScale = lwTownPriceSummaryDto.getFarmScale();
	double industryScale = lwTownPriceSummaryDto.getIndustryScale();
	double notPeopleScale = lwTownPriceSummaryDto.getNotPeopleScale();
	double peopleScale = lwTownPriceSummaryDto.getPeopleScale();
	double produceScale = lwTownPriceSummaryDto.getProduceScale();
	double bizScale = lwTownPriceSummaryDto.getBizScale();
	// 电量
	double farmQuantity = lwTownPriceSummaryDto.getFarmQuantity();
	double industryQuantity = lwTownPriceSummaryDto.getIndustryQuantity();
	double notPeopleQuantity = lwTownPriceSummaryDto.getNotPeopleQuantity();
	double peopleQuantity = lwTownPriceSummaryDto.getPeopleQuantity();
	double produceQuantity = lwTownPriceSummaryDto.getProduceQuantity();
	double bizQuantity = lwTownPriceSummaryDto.getBizQuantity();
	// 电费
	double farmFee = lwTownPriceSummaryDto.getFarmFee();
	double industryFee = lwTownPriceSummaryDto.getIndustryFee();
	double notPeopleFee = lwTownPriceSummaryDto.getNotPeopleFee();
	double peopleFee = lwTownPriceSummaryDto.getPeopleFee();
	double produceFee = lwTownPriceSummaryDto.getProduceFee();
	double bizFee = lwTownPriceSummaryDto.getBizFee();
	// 电金
	double farmPrice = lwTownPriceSummaryDto.getFarmPrice();
	double industryPrice = lwTownPriceSummaryDto.getIndustryPrice();
	double notPeoplePrice = lwTownPriceSummaryDto.getNotPeoplePrice();
	double peoplePrice = lwTownPriceSummaryDto.getPeoplePrice();
	double producePrice = lwTownPriceSummaryDto.getProducePrice();
	double bizPrice = lwTownPriceSummaryDto.getBizPrice();
	
	%>	
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="10"><p><B>用户比例分摊信息</B></p></td>
		</tr>
		<tr class=listtitle>
	    	<td nowrap >比例分摊</td>
		    <td nowrap ><span class="title">居民</span></td>
			<td nowrap ><span class="title">非居民</span></td>
			<td nowrap ><span class="title">农灌</span></td>
			<td nowrap ><span class="title">农业生产</span></td>
			<td nowrap ><span class="title">商业用电</span></td>
			<td nowrap ><span class="title">非普工业</span></td>
		
		</tr>
		
		<tr  class=listtitle>
		<td ><span class="title">比例</span></td>
			<td nowrap ><%= peopleScale%></td>
			<td nowrap ><%= notPeopleScale%></td>
			<td nowrap ><%= farmScale%></td>
			<td nowrap ><%= produceScale%></td>
			<td nowrap ><%= bizScale%></td>
			<td nowrap ><%= industryScale%></td>	
		</tr>
		<tr  class="listtitle">
		<td  ><span class="title">电价</span></td>
			<td nowrap ><%= peoplePrice%></td>
			<td nowrap ><%= notPeoplePrice%></td>
			<td nowrap ><%= farmPrice%></td>
			<td nowrap ><%= producePrice%></td>
			<td nowrap ><%= bizPrice%></td>
			<td nowrap ><%= industryPrice%></td>	
		</tr>
		
		<tr  class="listtitle">
		<td  class=listtitle ><span class="title">电量</span></td>
			<td nowrap ><%= peopleQuantity%></td>
			<td nowrap ><%= notPeopleQuantity%></td>
			<td nowrap ><%= farmQuantity%></td>
			<td nowrap ><%= produceQuantity%></td>
			<td nowrap ><%= bizQuantity%></td>
			<td nowrap ><%= industryQuantity%></td>	
		</tr>

		<tr  class="listtitle">
		<td  ><span class="title">电费</span></td>
			<td  nowrap ><%= peopleFee%></td>
			<td  nowrap><%= notPeopleFee%></td>
			<td nowrap ><%= farmFee%></td>
			<td nowrap ><%= produceFee%></td>
			<td nowrap ><%= bizFee%></td>
			<td nowrap ><%= industryFee%></td>		
		</tr>
		
	</table>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);">		</td>
		</tr>
	</table>
	<%} %>
</form>
</body>


</html:html>
