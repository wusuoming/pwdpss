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
<%@page import="com.elongway.pss.dto.domain.LwWholeSaleDetailDto"%>
<%@page import="com.elongway.pss.dto.domain.LwAllWholeFeeDto"%>
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
<body class=interface onload="javascript:printCount();window.close()">&nbsp; 
<html:errors />

<form  name="fm" method="post">

	<table class=common width="500%"  border="1" cellspacing="0" cellpadding="6">
	
	<tr>
			<td class=title0 colspan="13"><font size="4">包头市农电公司趸售电费电量发行单</font></td>
		</tr>
		<tr>
	<td nowrap colspan="2"><span class="title">年月<%=(String)request.getAttribute("inputDate") %></span></td>
	</tr>	
		
		<%
		
		DecimalFormat df = new DecimalFormat("###0.00");
		
		DecimalFormat df1 = new DecimalFormat("###0");
		
		LwWholeSaleDetailDto lwWholeSaleDetailDtogy = (LwWholeSaleDetailDto)request.getAttribute("lwWholeSaleDetailDtogy");
		LwWholeSaleDetailDto lwWholeSaleDetailDtodm = (LwWholeSaleDetailDto)request.getAttribute("lwWholeSaleDetailDtodm");
		LwWholeSaleDetailDto lwWholeSaleDetailDtojy = (LwWholeSaleDetailDto)request.getAttribute("lwWholeSaleDetailDtojy");
		LwWholeSaleDetailDto lwWholeSaleDetailDtoty = (LwWholeSaleDetailDto)request.getAttribute("lwWholeSaleDetailDtoty");
		LwWholeSaleDetailDto lwWholeSaleDetailDto = (LwWholeSaleDetailDto)request.getAttribute("lwWholeSaleDetailDto");
		 LwAllWholeFeeDto lwAllWholeFeeDtoty = (LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtoty");
		 LwAllWholeFeeDto lwAllWholeFeeDtogy = (LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtogy");
		LwAllWholeFeeDto lwAllWholeFeeDtodm = (LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtodm");
		LwAllWholeFeeDto lwAllWholeFeeDtojy = (LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDtojy");
		LwAllWholeFeeDto lwAllWholeFeeDto = (LwAllWholeFeeDto)request.getAttribute("lwAllWholeFeeDto");
		
		String  power1 = lwAllWholeFeeDtoty.getPower1();
		if(power1.equals("")||power1==null){
			power1="0";
		}
		String dianfei = lwAllWholeFeeDtoty.getDianfei();
		if(dianfei.equals("")||dianfei==null){
			dianfei="0";
		}
		String dianfeiTax = lwAllWholeFeeDtoty.getDianfeitax();
		if(dianfeiTax.equals("")||dianfeiTax==null){
			dianfeiTax="0";
		}
		String fuJia3 = lwAllWholeFeeDtoty.getFujia3();
			if(fuJia3.equals("")||fuJia3==null){
			fuJia3="0";
		}
		String sanXia = lwAllWholeFeeDtoty.getSanxia();
		if(sanXia.equals("")||sanXia==null){
			sanXia="0";
		}
		String sanXiaTax = lwAllWholeFeeDtoty.getSanxiatax();
		if(sanXiaTax.equals("")||sanXiaTax==null){
			sanXiaTax="0";
		}
		String jiJin = lwAllWholeFeeDtoty.getJijin();
		if(jiJin.equals("")||jiJin==null){
			jiJin="0";
		}
		String fuJia1 = lwAllWholeFeeDtoty.getFujia1();
		if(fuJia1.equals("")||fuJia1==null){
			fuJia1="0";
		}
		String dianJin = lwAllWholeFeeDtoty.getDianjin();
		if(dianJin.equals("")||dianJin==null){
			dianJin="0";
		}
		String dianJinTax = lwAllWholeFeeDtoty.getDianjintax();
		if(dianJinTax.equals("")||dianJinTax==null){
			dianJinTax="0";
		}
		String sumFee = lwAllWholeFeeDtoty.getSumfee();
			if(sumFee.equals("")||sumFee==null){
			sumFee="0";
		}
		
		String power1dm = lwAllWholeFeeDtodm.getPower1();
		if(power1dm.equals("")||power1dm==null){
			power1dm="0";
		}
		String dianFeidm = lwAllWholeFeeDtodm.getDianfei();
		if(dianFeidm.equals("")||dianFeidm==null){
			dianFeidm="0";
		}
		
		String Dianfeitaxdm = lwAllWholeFeeDtodm.getDianfeitax();
			if(Dianfeitaxdm.equals("")||Dianfeitaxdm==null){
			Dianfeitaxdm="0";
		}
		String Fujia3dm = lwAllWholeFeeDtodm.getFujia3();
			if(Fujia3dm.equals("")||Fujia3dm==null){
			Fujia3dm="0";
		}
		String Sanxiadm = lwAllWholeFeeDtodm.getSanxia();
			if(Sanxiadm.equals("")||Sanxiadm==null){
			Sanxiadm="0";
		}
		String Sanxiataxdm = lwAllWholeFeeDtodm.getSanxiatax();
		if(Sanxiataxdm.equals("")||Sanxiataxdm==null){
			Sanxiataxdm="0";
		}
		String Jijindm = lwAllWholeFeeDtodm.getJijin();
		if(Jijindm.equals("")||Jijindm==null){
			Jijindm="0";
		}
		String Fujia1dm = lwAllWholeFeeDtodm.getFujia1();
		if(Fujia1dm.equals("")||Fujia1dm==null){
			Fujia1dm="0";
		}
		String Dianjindm = lwAllWholeFeeDtodm.getDianjin();
			if(Dianjindm.equals("")||Dianjindm==null){
			Dianjindm="0";
		}
		String Dianjintaxdm = lwAllWholeFeeDtodm.getDianjintax();
		if(Dianjintaxdm.equals("")||Dianjintaxdm==null){
			Dianjintaxdm="0";
		}
		String Sumfeedm = lwAllWholeFeeDtodm.getSumfee();
		if(Sumfeedm.equals("")||Sumfeedm==null){
			Sumfeedm="0";
		}
		String Power1jy = lwAllWholeFeeDtojy.getPower1();
		if(Power1jy.equals("")||Power1jy==null){
			Power1jy="0";
		}
		String Dianfeijy = lwAllWholeFeeDtojy.getDianfei();
		if(Dianfeijy.equals("")||Dianfeijy==null){
			Dianfeijy="0";
		}
		String Dianfeitaxjy = lwAllWholeFeeDtojy.getDianfeitax();
		if(Dianfeitaxjy.equals("")||Dianfeitaxjy==null){
			Dianfeitaxjy="0";
		}
		String Fujia3jy = lwAllWholeFeeDtojy.getFujia3();
			if(Fujia3jy.equals("")||Fujia3jy==null){
			Fujia3jy="0";
		}
		String Sanxiajy = lwAllWholeFeeDtojy.getSanxia();
		if(Sanxiajy.equals("")||Sanxiajy==null){
			Sanxiajy="0";
		}
		String Sanxiataxjy = lwAllWholeFeeDtojy.getSanxiatax();
		if(Sanxiataxjy.equals("")||Sanxiataxjy==null){
			Sanxiataxjy="0";
		}
		String Jijinjy = lwAllWholeFeeDtojy.getJijin();
		if(Jijinjy.equals("")||Jijinjy==null){
			Jijinjy="0";
		}
		String Fujia1jy = lwAllWholeFeeDtojy.getFujia1();
		if(Fujia1jy.equals("")||Fujia1jy==null){
			Fujia1jy="0";
		}
		String Dianjinjy = lwAllWholeFeeDtojy.getDianjin();
		if(Dianjinjy.equals("")||Dianjinjy==null){
			Dianjinjy="0";
		}
		String Dianjintaxjy = lwAllWholeFeeDtojy.getDianjintax();
		if(Dianjintaxjy.equals("")||Dianjintaxjy==null){
			Dianjintaxjy="0";
		}
		String Sumfeejy = lwAllWholeFeeDtojy.getSumfee();
		if(Sumfeejy.equals("")||Sumfeejy==null){
			Sumfeejy="0";
		}
		String Power1gy = lwAllWholeFeeDtogy.getPower1();
		if(Power1gy.equals("")||Power1gy==null){
			Power1gy="0";
		}
		String Dianfeigy = lwAllWholeFeeDtogy.getDianfei();
		if(Dianfeigy.equals("")||Dianfeigy==null){
			Dianfeigy="0";
		}
		String Dianfeitaxgy = lwAllWholeFeeDtogy.getDianfeitax();
		if(Dianfeitaxgy.equals("")||Dianfeitaxgy==null){
			Dianfeitaxgy="0";
		}
		
		String Fujia3gy = lwAllWholeFeeDtogy.getFujia3();
		if(Fujia3gy.equals("")||Fujia3gy==null){
			Fujia3gy="0";
		}
		String Sanxiagy = lwAllWholeFeeDtogy.getSanxia();
			if(Sanxiagy.equals("")||Sanxiagy==null){
			Sanxiagy="0";
		}
		String Sanxiataxgy = lwAllWholeFeeDtogy.getSanxiatax();
		if(Sanxiataxgy.equals("")||Sanxiataxgy==null){
			Sanxiataxgy="0";
		}
		String Jijingy = lwAllWholeFeeDtogy.getJijin();
		if(Jijingy.equals("")||Jijingy==null){
			Jijingy="0";
		}
		String Fujia1gy = lwAllWholeFeeDtogy.getFujia1();
		if(Fujia1gy.equals("")||Fujia1gy==null){
			Fujia1gy="0";
		}
		String Dianjingy = lwAllWholeFeeDtogy.getDianjin();
			if(Dianjingy.equals("")||Dianjingy==null){
			Dianjingy="0";
		}
		String Dianjintaxgy = lwAllWholeFeeDtogy.getDianjintax();
		if(Dianjintaxgy.equals("")||Dianjintaxgy==null){
			Dianjintaxgy="0";
		}
		String Sumfeegy = lwAllWholeFeeDtogy.getSumfee();
			if(Sumfeegy.equals("")||Sumfeegy==null){
			Sumfeegy="0";
		}
		
		
		
		
		
		
		
		String tuibuty = lwAllWholeFeeDtoty.getFujia5();
		if(tuibuty.equals("")||tuibuty==null){
			tuibuty="0";
		}
		
		
			String tuibugy = lwAllWholeFeeDtogy.getFujia5();
		if(tuibugy.equals("")||tuibugy==null){
			tuibugy="0";
		}
		
				String tuibudm = lwAllWholeFeeDtodm.getFujia5();
		if(tuibudm.equals("")||tuibudm==null){
			tuibudm="0";
		}
		
			String tuibujy = lwAllWholeFeeDtojy.getFujia5();
		if(tuibujy.equals("")||tuibujy==null){
			tuibujy="0";
		}
		
		//求总电量
	
		 %>
<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">总电量10KV</font></span>
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
					<span class="title"><font size="2">排灌电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电费10KV</font></span>
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
					<span class="title"><font size="2">土右供电局</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtoty.getFujia11()))%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getUnDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getUnDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getProductQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getProductMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getFarmUseQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getFarmUseMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getBizQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getBizMoney10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getUnIndustryQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getUnIndustryMoney10kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
			<td nowrap width="10%">
					<span class="title"><font size="2">总电量35KV</font></span>
				<br></td>
				
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
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtoty.getFujia12()))%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getUnDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getUnDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getProductQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getProductMoney35kv()) %></font></span>
				<br></td>
			<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getFarmUseQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getFarmUseMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getBizQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getBizMoney35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtoty.getUnIndustryQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtoty.getUnIndustryMoney35kv()) %></font></span>
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
					<span class="title"><font size="2">力率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">广播费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">海明炉</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">多边电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">退补电费</font></span>
				<br></td><%--
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">附加1费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">附加2费</font></span>
				<br></td>
				--%><td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
				
						
			</tr>
			
					<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(power1))%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(dianfei)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(dianfeiTax)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(fuJia3)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getFujia2())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getHaiminglu())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getDuobian())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(tuibuty)) %></font></span>
				<br></td>
	
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty.getSumfee())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxia())-Double.parseDouble(lwAllWholeFeeDtoty.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtoty.getJijin())-Double.parseDouble(lwAllWholeFeeDtoty.getFujia1())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjin())-Double.parseDouble(lwAllWholeFeeDtoty.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtoty.getFujia9()))%></font></span>
				<br></td>
				
						
			</tr>
			<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">总电量10KV</font></span>
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
					<span class="title"><font size="2">排灌电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电费10KV</font></span>
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
					<span class="title"><font size="2">达茂供电局</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtodm.getFujia11())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getUnDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getUnDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getProductQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getProductMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getFarmUseQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getFarmUseMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getBizQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getBizMoney10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getUnIndustryQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getUnIndustryMoney10kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				<td nowrap width="10%">
					<span class="title"><font size="2">总电量35KV</font></span>
				<br></td>
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
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtodm.getFujia12())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getDenizenQuantity35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getUnDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getUnDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getProductQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getProductMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getFarmUseQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getFarmUseMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getBizQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getBizMoney35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtodm.getUnIndustryQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtodm.getUnIndustryMoney35kv()) %></font></span>
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
					<span class="title"><font size="2">力率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">广播费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">海明炉</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">多边电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">退补电费</font></span>
				<br></td>
				<%--<td nowrap width="10%" align="center">
					<span class="title"><font size="2">附加1费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">附加2费</font></span>
				<br></td>
				--%><td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
				
						
			</tr>
			
				<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(power1dm)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(dianFeidm)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianfeitaxdm)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Fujia3dm)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getFujia2())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getHaiminglu())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getDuobian())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(tuibudm)) %></font></span>
				<br></td><%--
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianjindm)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianjintaxdm)) %></font></span>
				<br></td>
				--%><td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm.getSumfee())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxia())-Double.parseDouble(lwAllWholeFeeDtodm.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtodm.getJijin())-Double.parseDouble(lwAllWholeFeeDtodm.getFujia1())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjin())-Double.parseDouble(lwAllWholeFeeDtodm.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtodm.getFujia9()))%></font></span>
				<br></td>
				
						
			</tr>
			<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">总电量10KV</font></span>
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
					<span class="title"><font size="2">排灌电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电费10KV</font></span>
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
					<span class="title"><font size="2">九原供电局</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtojy.getFujia11()))%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getDenizenQuantity10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getUnDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getUnDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getProductQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getProductMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getFarmUseQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getFarmUseMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getBizQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getBizMoney10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getUnIndustryQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getUnIndustryMoney10kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
			
			<td nowrap width="10%">
					<span class="title"><font size="2">总电量35KV</font></span>
				<br></td>
				
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
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtojy.getFujia12()))%></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getDenizenQuantity10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getUnDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getUnDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getProductQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getProductMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getFarmUseQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getFarmUseMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getBizQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getBizMoney35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtojy.getUnIndustryQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtojy.getUnIndustryMoney35kv()) %></font></span>
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
					<span class="title"><font size="2">力率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">广播费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">海明炉</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">多边电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">退补电费</font></span>
				<br></td>
				<%--<td nowrap width="10%" align="center">
					<span class="title"><font size="2">附加1费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">附加2费</font></span>
				<br></td>
				--%><td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
				
						
			</tr>
			
				<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(Power1jy))%></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianfeijy)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianfeitaxjy)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Fujia3jy)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getFujia2())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getHaiminglu())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getDuobian())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(tuibujy)) %></font></span>
				<br></td><%--
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianjinjy)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianjintaxjy)) %></font></span>
				<br></td>
				--%><td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtojy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtojy.getJijin())-Double.parseDouble(lwAllWholeFeeDtojy.getFujia1())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtojy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtojy.getFujia9()))%></font></span>
				<br></td>
				
						
			</tr>
			<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">总电量10KV</font></span>
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
					<span class="title"><font size="2">排灌电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电费10KV</font></span>
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
					<span class="title"><font size="2">固阳供电局</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtogy.getFujia11() )) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getDenizenQuantity10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getUnDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getUnDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getProductQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getProductMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getFarmUseQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getFarmUseMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getBizQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getBizMoney10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getUnIndustryQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getUnIndustryMoney10kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
			
			<td nowrap width="10%">
					<span class="title"><font size="2">总电量35KV</font></span>
				<br></td>
				
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
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtogy.getFujia12())) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getDenizenQuantity35kv()) %></font></span>
				<br></td>
				
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getUnDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getUnDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getProductQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getProductMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getFarmUseQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getFarmUseMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getBizQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getBizMoney35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDtogy.getUnIndustryQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDtogy.getUnIndustryMoney35kv()) %></font></span>
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
					<span class="title"><font size="2">力率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">广播费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">海明炉</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">多边电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">退补电费</font></span>
				<br></td><%--
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">附加1费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">附加2费</font></span>
				<br></td>
				--%><td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
				
						
			</tr>
			
			<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(Power1gy)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianfeigy)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianfeitaxgy)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Fujia3gy)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getFujia2())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getHaiminglu())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getDuobian())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(tuibugy)) %></font></span>
				<br></td><%--
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianjingy)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianjintaxgy)) %></font></span>
				<br></td>
				--%><td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy.getSumfee())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxia())-Double.parseDouble(lwAllWholeFeeDtogy.getSanxiatax())-Double.parseDouble(lwAllWholeFeeDtogy.getJijin())-Double.parseDouble(lwAllWholeFeeDtogy.getFujia1())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjin())-Double.parseDouble(lwAllWholeFeeDtogy.getDianjintax())-Double.parseDouble(lwAllWholeFeeDtogy.getFujia9()))%></font></span>
				<br></td>
				
						
			</tr>
		<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font></span>
				<br></td>
				<td nowrap width="10%">
					<span class="title"><font size="2">总电量10KV</font></span>
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
					<span class="title"><font size="2">排灌电量10KV</font></span>
				<br></td>
				
				<td nowrap width="10%">
					<span class="title"><font size="2">排灌电费10KV</font></span>
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
					<span class="title"><font size="2">总计</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df1.format(Double.parseDouble(lwAllWholeFeeDto.getFujia11())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getUnDenizenQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getUnDenizenMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getProductQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getProductMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getFarmUseQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getFarmUseMoney10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getBizQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getBizMoney10kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getUnIndustryQuantity10kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getUnIndustryMoney10kv()) %></font></span>
				<br></td>
				
							
			</tr>
			<tr class=listtitle>
				<td nowrap width="10%">
					<span class="title"><font size="2">总电量35KV</font></span>
				<br></td>
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
					<span class="title"><font size="2"><%=df1.format(Double.parseDouble(lwAllWholeFeeDto.getFujia12())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getDenizenQuantity35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getUnDenizenQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getUnDenizenMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getProductQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getProductMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getFarmUseQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getFarmUseMoney35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getBizQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getBizMoney35kv()) %></font></span>
				<br></td>
				
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwWholeSaleDetailDto.getUnIndustryQuantity35kv()) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwWholeSaleDetailDto.getUnIndustryMoney35kv()) %></font></span>
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
					<span class="title"><font size="2">力率电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">广播费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">海明炉</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">多边电费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">退补电费</font></span>
				<br></td>
				<%--<td nowrap width="10%" align="center">
					<span class="title"><font size="2">附加1费</font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">附加2费</font></span>
				<br></td>
				--%><td nowrap width="10%" align="center">
					<span class="title"><font size="2">总电费</font></span>
				<br></td>
				
						
			</tr>
			
				<tr >
				<td nowrap width="10%"  align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDto.getPower1())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getDianfei())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getDianfeitax())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getFujia3())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getFujia2())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getHaiminglu())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getDuobian())) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getFujia5())) %></font></span>
				<br></td><%--
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianjindm)) %></font></span>
				<br></td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(Dianjintaxdm)) %></font></span>
				<br></td>
				--%><td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDto.getSumfee()))%></font></span>
				<br></td>
				
						
			</tr>
	</table>
</form>
</body>
<script language="javascript">
function printCount(){
	window.print();
}
</script>

</html:html>
