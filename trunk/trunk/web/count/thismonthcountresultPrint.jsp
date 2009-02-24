<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="java.text.DecimalFormat"/>
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwAllWholeFeeDto"/>
<jsp:directive.page import="com.elongway.pss.util.AppConst"/>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>包头农电总公司电费电量发行单</title>
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
<body class="interface" onload="javascript:doPrint();window.close()">&nbsp; 
<html:errors />
<%
DecimalFormat df = new DecimalFormat("###0.00");
String sumffee=(String)request.getAttribute("sumffee");
String sumfpower=request.getAttribute("sumfpower").toString();
String sumfdianfee=(String)request.getAttribute("sumfdianfee");
String sumftax=(String)request.getAttribute("sumftax");
String sumfc=(String)request.getAttribute("sumfc");
String summfdianjin=(String)request.getAttribute("summfdianjin");
String sumfdianjintax=(String)request.getAttribute("sumfdianjintax");
String sumfsanxia=(String)request.getAttribute("sumfsanxia");
String sumfsanxiatax=(String)request.getAttribute("sumfsanxiatax");
String sumfjijin=(String)request.getAttribute("sumfjijin");
String sumfjijintax=(String)request.getAttribute("sumfjijintax");
String sumwfee=(String)request.getAttribute("sumwfee");
String sumwpower=request.getAttribute("sumwpower").toString();
String sumwdianfee=(String)request.getAttribute("sumwdianfee");
String sumwtax=(String)request.getAttribute("sumwtax");
String sumwc=(String)request.getAttribute("sumwc");
String summwdianjin=(String)request.getAttribute("summwdianjin");
String sumwdianjintax=(String)request.getAttribute("sumwdianjintax");
String sumwsanxia=(String)request.getAttribute("sumwsanxia");
String sumwsanxiatax=(String)request.getAttribute("sumwsanxiatax");
String sumwjijin=(String)request.getAttribute("sumwjijin");
String sumwjijintax=(String)request.getAttribute("sumwjijintax");

String sumallfee=(String)request.getAttribute("sumwjijintax");
String sumallpower=request.getAttribute("sumallpower").toString();
String sumallc=(String)request.getAttribute("sumallc");
String sumalltax=(String)request.getAttribute("sumalltax");
String sumallall=(String)request.getAttribute("sumallall");
String sumalldianjin=(String)request.getAttribute("sumalldianjin");
String sumalldianjintax=(String)request.getAttribute("sumalldianjintax");
String sumallsanxia=(String)request.getAttribute("sumallsanxia");
String sumallsanxiatax=(String)request.getAttribute("sumallsanxiatax");
String sumalljijin=(String)request.getAttribute("sumalljijin");
String sumalljijintax=(String)request.getAttribute("sumalljijintax");



String sanxiagy=(String)request.getAttribute("sanxiagy");
String jijingy=(String)request.getAttribute("jijingy");
String dianjingy=(String)request.getAttribute("dianjingy");
String sumpowergy=request.getAttribute("sumpowergy").toString();
String sumdianfeegy=(String)request.getAttribute("sumdianfeegy");
String sanxiajy=(String)request.getAttribute("sanxiajy");
String jijinjy=(String)request.getAttribute("jijinjy");
String dianjinjy=(String)request.getAttribute("dianjinjy");
String sumpowerjy=request.getAttribute("sumpowerjy").toString();
String sumdianfeejy=(String)request.getAttribute("sumdianfeejy");
String sanxiadm=(String)request.getAttribute("sanxiadm");
String jijindm=(String)request.getAttribute("jijindm");
String dianjindm=(String)request.getAttribute("dianjindm");
String sumpowerdm=request.getAttribute("sumpowerdm").toString();
String sumdianfeedm=(String)request.getAttribute("sumdianfeedm");
String sanxiaty=(String)request.getAttribute("sanxiaty");
String jijinty=(String)request.getAttribute("jijinty");
String dianjinty=(String)request.getAttribute("dianjinty");
String sumpowerty=request.getAttribute("sumpowerty").toString();
String sumdianfeety=(String)request.getAttribute("sumdianfeety");
List colf=(List)request.getAttribute("colf");



String sumallfeejy=(String)request.getAttribute("sumallfeejy");
String sumallfeegy=(String)request.getAttribute("sumallfeegy");
String sumallfeedm=(String)request.getAttribute("sumallfeedm");
String sumallfeety=(String)request.getAttribute("sumallfeety");

String inputDate1  =(String)request.getAttribute("ssss");


LwAllWholeFeeDto  lwAllWholeFeeDtogy=(LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtogy");
LwAllWholeFeeDto  lwAllWholeFeeDtodm=(LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtodm");
LwAllWholeFeeDto  lwAllWholeFeeDtojy=(LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtojy");
LwAllWholeFeeDto  lwAllWholeFeeDtoty=(LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtoty");

String differenceQuantity=request.getAttribute("differenceQuantity").toString();
String differenceQuantitygy=request.getAttribute("differenceQuantitygy").toString();
String differenceQuantitydm=request.getAttribute("differenceQuantitydm").toString();
String differenceQuantityjy=request.getAttribute("differenceQuantityjy").toString();
String differenceQuantityty=request.getAttribute("differenceQuantityty").toString();






%>
<form  name="fm" method="post">
	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	
		
	<tr>
			<td class=title0 colspan="13"><font size="4">包头市农电公司电费电量发行单</font></td>
		</tr>
		<tr>
		<td nowrap colspan="2">
						<span class="title">月份:<%=inputDate1%></span>
					</td>
	</tr>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电量</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电费</font></span>
				<br></td>
				
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">三峡基金</font></span>
				<br></td>
		
				<td nowrap width="10%">
					<span class="title"><font size="2">电力资金</font></span>
				<br></td>	
				
				
				<td nowrap width="10%">
					<span class="title"><font size="2">基金</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">电费税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">三峡税</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">电金税</font></span>
				<br></td>
				
			
				<td nowrap width="10%">
					<span class="title"><font size="2">基金税</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">差别电费</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">差别电费税</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">总计</font></span>
				<br></td>
							
			</tr>
			<%
				Iterator itf=colf.iterator();
				LwCorporationSummaryDto lwCorporationSummaryDto=new LwCorporationSummaryDto();
				while(itf.hasNext()){
						lwCorporationSummaryDto=(LwCorporationSummaryDto)itf.next();
						
					
				 
				 
				 %>
			<tr >
				
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=lwCorporationSummaryDto.getUserNo() %></font></span>
				<br></td>
				<%
					if(lwCorporationSummaryDto.getLineCode().equals("20699999065")||lwCorporationSummaryDto.getLineCode().equals("20699999072")){
				 %>
				 <td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(lwCorporationSummaryDto.getPeakQuantity())%></font></span>
				<br></td>
				<%} else{%>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(lwCorporationSummaryDto.getElectricQuantity())%></font></span>
				<br></td>
				<%} %>
				
				<%
					if(lwCorporationSummaryDto.getLineCode().equals("20699999065")||lwCorporationSummaryDto.getLineCode().equals("20699999072")){
				 %>
				 <td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=df.format((lwCorporationSummaryDto.getPeakFee()+lwCorporationSummaryDto.getContentFee()+lwCorporationSummaryDto.getNeedFee()+lwCorporationSummaryDto.getPowerRateFee()+lwCorporationSummaryDto.getUnDenizenFee())/1.17)%></font></span>
				<br></td>
				<%} else{%>
				
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=df.format((lwCorporationSummaryDto.getPointerFee()+lwCorporationSummaryDto.getContentFee()+lwCorporationSummaryDto.getNeedFee()+lwCorporationSummaryDto.getPowerRateFee()+lwCorporationSummaryDto.getUnDenizenFee())/1.17)%></font></span>
				<br></td>
				<%} %>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue(lwCorporationSummaryDto.getSanXiaFee()/1.17,AppConst.TWO_DOT_FLAG) %></font></span>
				<br></td>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue(lwCorporationSummaryDto.getPowerFee()/1.17,AppConst.TWO_DOT_FLAG)%></font></span>
				<br></td>
				
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue(lwCorporationSummaryDto.getSurcharge()/1.17,AppConst.TWO_DOT_FLAG)%></font></span>
				<br></td>
				<%
					if(lwCorporationSummaryDto.getLineCode().equals("20699999065")||lwCorporationSummaryDto.getLineCode().equals("20699999072")){
				 %>
				 <td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=df.format((lwCorporationSummaryDto.getPeakFee()+lwCorporationSummaryDto.getContentFee()+lwCorporationSummaryDto.getNeedFee()+lwCorporationSummaryDto.getPowerRateFee()+lwCorporationSummaryDto.getUnDenizenFee())/1.17*0.17)%></font></span>
				<br></td>
				<%} else{%>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=df.format((lwCorporationSummaryDto.getPointerFee()+lwCorporationSummaryDto.getContentFee()+lwCorporationSummaryDto.getNeedFee()+lwCorporationSummaryDto.getPowerRateFee()+lwCorporationSummaryDto.getUnDenizenFee())/1.17*0.17)%></font></span>
				<br></td>
				<%} %>
				
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue(lwCorporationSummaryDto.getSanXiaFee()/1.17*0.17,AppConst.TWO_DOT_FLAG)%></font></span>
				<br></td>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue(lwCorporationSummaryDto.getPowerFee()/1.17*0.17,AppConst.TWO_DOT_FLAG)%></font></span>
				<br></td>
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue(lwCorporationSummaryDto.getSurcharge()/1.17*0.17,AppConst.TWO_DOT_FLAG)%></font></span>
				<br></td>
				
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=0%></font></span>
				<br></td>
				
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=0%></font></span>
				<br></td>
				
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDto.getSumFee())%></font></span>
				<br></td>
				
				
							
			</tr>
			<%} %>
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">郊区</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getPower1()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format((Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtojy.getJijin())-Double.parseDouble(lwAllWholeFeeDtojy.getFujia1())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtojy.getFujia9()))/1.17) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getSanxia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getDianjin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getJijin()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format((Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtojy.getJijin())-Double.parseDouble(lwAllWholeFeeDtojy.getFujia1())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtojy.getFujia9()))/1.17*0.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getSanxiatax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getDianjintax()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getFujia1() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantityjy)/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantityjy)/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getSumfee()))%></font></span>
				<br></td>
				
					
			</tr>
			
					<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">达茂旗</font></span>
				<br></td>
					<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getPower1()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format((Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtodm.getJijin())-Double.parseDouble(lwAllWholeFeeDtodm.getFujia1())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtodm.getFujia9()))/1.17) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getSanxia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getDianjin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getJijin()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format((Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtodm.getJijin())-Double.parseDouble(lwAllWholeFeeDtodm.getFujia1())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtodm.getFujia9()))/1.17*0.17) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getSanxiatax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getDianjintax()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getFujia1() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantitydm)/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantitydm)/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getSumfee()))%></font></span>
				<br></td>
				
					
			</tr>
			
			
					<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">土右</font></span>
				<br></td>
					<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtoty.getPower1()))%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format((Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtoty.getJijin())-Double.parseDouble(lwAllWholeFeeDtoty.getFujia1())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtoty.getFujia9()))/1.17) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getSanxia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getDianjin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getJijin()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format((Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtoty.getJijin())-Double.parseDouble(lwAllWholeFeeDtoty.getFujia1())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtoty.getFujia9()))/1.17*0.17) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getSanxiatax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getDianjintax()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getFujia1() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantityty)/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantityty)/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getSumfee()))%></font></span>
				<br></td>
				
				
					
			</tr>
			
			
			
					<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">固阳</font></span>
				<br></td>
						<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getPower1()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format((Double.parseDouble(lwAllWholeFeeDtogy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtogy.getJijin())-Double.parseDouble(lwAllWholeFeeDtogy.getFujia1())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtogy.getFujia9()))/1.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getSanxia() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getDianjin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getJijin()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format((Double.parseDouble(lwAllWholeFeeDtogy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtogy.getJijin())-Double.parseDouble(lwAllWholeFeeDtogy.getFujia1())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtogy.getFujia9()))/1.17*0.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getSanxiatax() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getDianjintax()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getFujia1() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantitygy)/1.17) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantitygy)/1.17*0.17) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getSumfee()))%></font></span>
				<br></td>
					
			</tr>
			
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">小计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwpower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwc%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwsanxia%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=summwdianjin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwjijin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwtax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwsanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwdianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwjijintax%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantity)/1.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantity)/1.17*0.17)%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwfee%></font></span>
				<br></td>
				
							
			</tr>
			<%Collection resultList = (Collection)request.getAttribute("resultList"); 
		for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
				TownSataDto townSataDto = (TownSataDto) iterator
						.next();
		%>
	<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=townSataDto.getCompanyName() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getSumPower() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPurePowerFee() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPureSanXia()%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPureDianJin() %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPureJiJin() %></font></span>
				<br></td>			
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPowerFeeTax() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getSanXiaTax() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getDianJinTax() %></font></span>
				<br></td>	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getJiJinTax() %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font></span>
				<br></td>
					
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getSumPowerFee() %></font></span>
				<br></td>	
							
			</tr>
		<%} %>
		<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2">合计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallpower%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallc%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallsanxia%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumalldianjin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumalljijin%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumalltax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallsanxiatax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumalldianjintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumalljijintax%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantity)/1.17)%></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(differenceQuantity)/1.17*0.17)%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumallall%></font></span>
				<br></td>
				
							
			</tr>
	</table>

</form>
</body>
<script language="javascript">
function doPrint(){
	window.print();
}
</script>

</html:html>
