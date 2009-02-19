<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwAllWholeFeeDto"/>
<%
	//response.setHeader("Content-disposition","attachment;filename=abc.xls");
%>
<jsp:directive.page import="java.util.List" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwWholeSaleSummaryDto" />
<jsp:directive.page import="java.util.Iterator" />
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto" />
<jsp:directive.page import="java.util.Iterator" />
<jsp:directive.page import="java.util.List" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwCorporationSummaryDto" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto" />
<jsp:directive.page import="java.util.Collection" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwFactoryIndicatorDto" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto" />
<jsp:directive.page
	import="com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwAmmeterChangeDto" />
<jsp:directive.page
	import="com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<meta http-equiv=Content-Type content="text/html; charset=gb2312">
	<link rel="stylesheet" type="text/css" media="all"
		href="/mimessage/css/calendar.css" title="win2k-cold-1" />

	<title>趸售结算</title>
	<link rel="stylesheet" type="text/css" media="all"
		href="/mimessage/css/calendar.css" title="win2k-cold-1" />
	<link rel="stylesheet" type="text/css"
		href="/iacontact/css/Standard.css">
	<title>大工业结算单</title>
	<app:css />

	<link rel="stylesheet" type="text/css" media="all"
		href="/mimessage/css/calendar.css" title="win2k-cold-1" />
	<link rel="stylesheet" type="text/css"
		href="/iacontact/css/Standard.css">

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

	<body>
		<form name="fm" method="post" action="">
			<%
				Collection col = (List) request.getAttribute("all");
				String company = (String) request.getAttribute("company");
				String statMonth = (String) request.getAttribute("statMonth");
				String sumAllFee = (String) request.getAttribute("sumAllFee");
				String agriculturalPower10 = (String) request
						.getAttribute("agriculturalPower10");
				String producePower10 = (String) request
						.getAttribute("producePower10");
				String residentPower10 = (String) request
						.getAttribute("residentPower10");
				String indecisivePower10 = (String) request
						.getAttribute("indecisivePower10");
				String industryPower10 = (String) request
						.getAttribute("industryPower10");
				String agriculturalFee10 = (String) request
						.getAttribute("agriculturalFee10");
				String produceFee10 = (String) request.getAttribute("produceFee10");
				String residentFee10 = (String) request
						.getAttribute("residentFee10");
				String indecisiveFee10 = (String) request
						.getAttribute("indecisiveFee10");
				String industryFee10 = (String) request
						.getAttribute("industryFee10");
				String businessFee10 = (String) request
						.getAttribute("businessFee10");
				String businessPower10 = (String) request
						.getAttribute("businessPower10");
				String agriculturalPower35 = (String) request
						.getAttribute("agriculturalPower35");
				String producePower35 = (String) request
						.getAttribute("producePower35");
				String residentPower35 = (String) request
						.getAttribute("residentPower35");
				String indecisivePower35 = (String) request
						.getAttribute("indecisivePower35");
				String industryPower35 = (String) request
						.getAttribute("industryPower35");
				String agriculturalFee35 = (String) request
						.getAttribute("agriculturalFee35");
				String produceFee35 = (String) request.getAttribute("produceFee35");
				String residentFee35 = (String) request
						.getAttribute("residentFee35");
				String indecisiveFee35 = (String) request
						.getAttribute("indecisiveFee35");
				String industryFee35 = (String) request
						.getAttribute("industryFee35");
				String businessFee35 = (String) request
						.getAttribute("businessFee35");
				String businessPower35 = (String) request
						.getAttribute("businessPower35");
				String lineLoss = (String) request.getAttribute("lineLoss");
				String trassLoss = (String) request.getAttribute("trassLoss");
				String sumFee = (String) request.getAttribute("sumFee");
				String sumRateFee = (String) request.getAttribute("sumRateFee");
				String powerRateFee = (String) request.getAttribute("powerRateFee");
				String sanxiaPower = (String) request.getAttribute("sanxiaPower");
				String tax = (String) request.getAttribute("tax");
				String nongwanghaidaiPower = (String) request
						.getAttribute("nongwanghaidaiPower");
				String kezaishengpepolePower = (String) request
						.getAttribute("kezaishengpepolePower");
				String kezaishengnotpepolePower = (String) request
						.getAttribute("kezaishengnotpepolePower");
				String kuquPower = (String) request.getAttribute("kuquPower");
				String sanxiaFee = (String) request.getAttribute("sanxiaFee");
				String nongwanghaidaiFee = (String) request
						.getAttribute("nongwanghaidaiFee");
				String kezaishengpepoleFee = (String) request
						.getAttribute("kezaishengpepoleFee");
				String kezaishengnotpepoleFee = (String) request
						.getAttribute("kezaishengnotpepoleFee");
				String kuquFee = (String) request.getAttribute("kuquFee");
				String sumPower = (String) request.getAttribute("sumPower");
				String unsumPower = (String) request.getAttribute("unsumPower");

				String agriculturalPrice10 = (String) request
						.getAttribute("agriculturalPrice10");
				String producePrice10 = (String) request
						.getAttribute("producePrice10");
				String residentPrice10 = (String) request
						.getAttribute("residentPrice10");
				String indecisivePrice10 = (String) request
						.getAttribute("indecisivePrice10");
				String industryPrice10 = (String) request
						.getAttribute("industryPrice10");
				String businessPrice10 = (String) request
						.getAttribute("businessPrice10");
				String agriculturalPrice35 = (String) request
						.getAttribute("agriculturalPrice35");
				String producePrice35 = (String) request
						.getAttribute("producePrice35");
				String residentPrice35 = (String) request
						.getAttribute("residentPrice35");
				String indecisivePrice35 = (String) request
						.getAttribute("indecisivePrice35");
				String industryPrice35 = (String) request
						.getAttribute("industryPrice35");
				String businessPrice35 = (String) request
						.getAttribute("businessPrice35");

				String differenceQuantity = (String) request
						.getAttribute("differenceQuantity");
				String differencePrice = (String) request
						.getAttribute("differencePrice");
				String differenceQuantityFee = (String) request
						.getAttribute("differenceQuantityFee");
						
						
				String Rate10Fee = (String) request
						.getAttribute("Rate10Fee");
						String Rate35Fee = (String) request
						.getAttribute("Rate35Fee");		
						
						
						LwAllWholeFeeDto  lwAllWholeFeeDto=(LwAllWholeFeeDto)request
						.getAttribute("lwAllWholeFeeDto");
						
						
						
						
						String sum10Fee = (String) request.getAttribute("sum10Fee");
						String sum35Fee = (String) request.getAttribute("sum35Fee");
						String sum10Power = (String) request.getAttribute("sum10Power");
						String sum35power = (String) request.getAttribute("sum35power");
						String sumwholesalefa = (String) request.getAttribute("sumwholesalefa");
						
						
						
						
			%>
			<table class=common width="500%" cellspacing="1" cellpadding="5">
				<tr class=listtitle align="center">
					<td class=title0 colspan="12">
						<B>趸售结算单</B>
					</td>
					<td nowrap colspan="2" style="display: none">
						<span class="title"><input name="company"
								value="<%=company%>" style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2" style="display: none">
						<span class="title"><input name="inputDate"
								value="<%=statMonth%>" style="width: 65px"> </span>
					</td>
					
				</tr>
				<tr>
				<td nowrap colspan="2">
						<span class="title">月份:<%=statMonth%></span>
					</td>
				</tr>

				<tr>




					<td nowrap colspan="2">
						<span class="title">户名</span>
					</td>

					<%
						if (company.equals("gy")) {
					%>
					<td nowrap colspan="2">
						<span class="title">固阳农电局</span>
					</td>
					<%
						}
					%>
					<%
						if (company.equals("dm")) {
					%>
					<td nowrap colspan="2">
						<span class="title">达茂农电局</span>
					</td>
					<%
						}
					%>
					<%
						if (company.equals("jy")) {
					%>
					<td nowrap colspan="2">
						<span class="title">九原农电局</span>
					</td>
					<%
						}
					%>
					<%
						if (company.equals("ty")) {
					%>
					<td nowrap colspan="2">
						<span class="title">土右农电局</span>
					</td>
					<%
						}
					%>
					
				
					
					<td nowrap colspan="2">
						<span class="title">户号</span>
					</td>
						<%
						if (company.equals("gy")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><input name="ss" value="20699999179"
								style="width: 65px"> </span>
					</td>
					<%} %>
						<%
						if (company.equals("dm")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><input name="ss" value="20699999185"
								style="width: 65px"> </span>
					</td>
					<%} %>
					
						<%
						if (company.equals("ty")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><input name="ss" value="20699999178"
								style="width: 65px"> </span>
					</td>
					<%} %>
					
						<%
						if (company.equals("jy")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><input name="ss" value="20699999177"
								style="width: 65px"> </span>
					</td>
					<%} %>
					
					<td nowrap colspan="2">
						<span class="title">地址</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="ss" value=""
								style="width: 65px"> </span>
					</td>

				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">开户行</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="ss" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title">税号</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="ss" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title">帐号</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="ss" value=""
								style="width: 65px"> </span>
					</td>

				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">行业分类</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">趸售</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">供电电压</span>
					</td>

					<td nowrap colspan="2">
						<span class="title">10KV , 35KV</span>
					</td>


					<td nowrap colspan="2">
						<span class="title">供电线路</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"></span>
					</td>

				</tr>







				<tr class=listtitle align="center">
					<td class=title0 colspan="12">
						<B>表计信息</B>
					</td>
				</tr>
				<tr class=listtitle>
					<td nowrap>
						<span class="title">线路名称 </span>
					</td>
					<td nowrap>
						<span class="title">表号 </span>
					</td>
					<td nowrap>
						<span class="title">类别</span>
					</td>
					<td nowrap>
						<span class="title">计费类别</span>
					</td>
					<td nowrap>
						<span class="title">倍率</span>
					</td>
					<td nowrap>
						<span class="title">上月有功</span>
					</td>
					<td nowrap>
						<span class="title">本月有功</span>
					</td>
					<td nowrap>
						<span class="title">有功电量</span>
					</td>
					<td nowrap>
						<span class="title">上月无功</span>
					</td>
					<td nowrap>
						<span class="title">本月无功 </span>
					</td>
					<td nowrap>
						<span class="title">无功电量</span>
					</td>
					<td nowrap>
						<span class="title">功率因素</span>
					</td>


				</tr>
				<%
					Iterator it = col.iterator();
					while (it.hasNext()) {
						LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = (LwWholeSaleIndicatorDto) it
								.next();
						String conditions = " flag=1 and userno='"
								+ lwWholeSaleIndicatorDto.getUserNo() + "'";
						BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
						BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade = new BLLwWholeSaleUserInfoFacade();
						LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = blLwWholeSaleUserInfoFacade
								.findByPrimaryKey(lwWholeSaleIndicatorDto.getUserNo());
						Collection colat = blLwAmmeterChangeFacade
								.findByConditions(conditions);
						Iterator ad = colat.iterator();
						LwAmmeterChangeDto lwAmmeterChangeDto = new LwAmmeterChangeDto();
						while (ad.hasNext()) {
							lwAmmeterChangeDto = (LwAmmeterChangeDto) ad.next();
						}
				%>
				<tr>
					<td class="title" style="width:80px"><input name="ammeterNo"
							value="<%=lwWholeSaleIndicatorDto.getUserNo()%>"
							readonly="readonly" style="diplay:none"></td>
					<td class="input">
						<input name="ammeterNo"
							value="<%=lwAmmeterChangeDto.getAmmeterNo()%>"
							readonly="readonly" style="width: 65px">
					</td>
					<%
						if (lwWholeSaleUserInfoDto.getIfCal().equals("0")) {
					%>
					<td class="input">
						<input name="ammeterStyle" value="总表" readonly="readonly"
							>
					</td>
					<%
						}
					%>
					<%
						if (lwWholeSaleUserInfoDto.getIfCal().equals("1")) {
					%>
					<td class="input">
						<input name="ammeterStyle" value="考核表" readonly="readonly"
							>
					</td>
					<%
						}
					%>
					<td class="input">
						<input name="Rate"
							value="<%=lwWholeSaleUserInfoDto.getVoltage()%>KV趸售"
							style="width: 65px" readonly="readonly">
					</td>
					<td class="input">
						<input name="Rate" value="<%=Math.round(lwWholeSaleIndicatorDto.getRate())%>"
							style="width: 65px" readonly="readonly">
					</td>
					<td class="input">
						<input name="LastWorkNum"
							value="<%=lwWholeSaleIndicatorDto.getLastWorkNum()%>"
							readonly="readonly" style="width: 65px">
					</td>


					<td class="input">
						<input name="ThisWorkNum"
							value="<%=lwWholeSaleIndicatorDto.getThisWorkNum()%>"
							readonly="readonly" style="width: 65px">
					</td>

					<td class="input">
						<input name="workQuantity"
							value="<%=lwWholeSaleIndicatorDto.getWorkQuantity()%>"
							readonly="readonly" style="width: 65px">
					</td>
					<td class="input">
						<input name="LastIdleNum"
							value="<%=lwWholeSaleIndicatorDto.getLastIdleNum()%>"
							readonly="readonly" style="width: 65px">
					</td>



					<td class="input">
						<input name="ThisIdleNum"
							value="<%=lwWholeSaleIndicatorDto.getThisIdleNum()%>"
							readonly="readonly" style="width: 65px">
					</td>

					<td class="input">
						<input name="workQuantity"
							value="<%=lwWholeSaleIndicatorDto.getUnworkQuantity()%>"
							readonly="readonly" style="width: 65px">
					</td>
					<td class="input">
						<input name="workQuantity"
							value="<%=lwWholeSaleIndicatorDto.getPowerCode()%>"
							readonly="readonly" style="width: 65px">
					</td>

				</tr>
				<%
					}
				%>




				<tr>




					<td nowrap colspan="2">
						<span class="title">有功变损</span>
					</td>
					<td nowrap>
						<span class="title"><%=trassLoss%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title">无功变损</span>
					</td>
					<td nowrap>
						<span class="title"><input name="ss" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title">有功线损</span>
					</td>
					<td nowrap>
						<span class="title"><%=lineLoss%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title">无功线损</span>
					</td>
					<td nowrap>
						<span class="title"><input name="ss" value=""
								style="width: 65px"> </span>
					</td>

				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">退补有功电量</span>
					</td>
					<td nowrap>
						<span class="title"><input name="ss" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title">（其中旁路电量）</span>
					</td>
					<td nowrap>
						<span class="title"><input name="dd" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title">退补无功电量</span>
					</td>
					<td nowrap>
						<span class="title"><input name="ee" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2"><span class="title">总有功电量</span></td>
			<td nowrap><span class="title"><input name="zongdianliang" value="<%=Math.round(Double.parseDouble(sumPower))%>"  style="width:65px"></span></td>

    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title">无功总电量</span></td>
			<td nowrap ><span class="title"><%=Math.round(Double.parseDouble(unsumPower))%></span></td>
			<td nowrap colspan="2"><span class="title">力率标准值</span></td>
			<td nowrap><span class="title">0.80</span></td>
			<td nowrap colspan="2"><span class="title">力率实际值</span></td>
			<td nowrap><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">力率调整值</span></td>
			<td nowrap><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
    </tr>
   
    <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>电费信息</B></td>
		</tr>
    <tr>
    <tr>
            <td nowrap colspan="2"><span class="title">项目</span></td>
			<td nowrap ><span class="title">电量</span></td>
			<td nowrap "><span class="title">电价</span></td>
			<td nowrap colspan="2"><span class="title">金额</span></td>
			 <td nowrap colspan="2"><span class="title">项目</span></td>
			<td nowrap ><span class="title">电量</span></td>
			<td nowrap ><span class="title">电价</span></td>
			<td nowrap colspan="2"><span class="title">金额</span></td>
    </tr>
    <tr>
					<td nowrap colspan="2">
						<span class="title">非居民照明/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="UnDenizenQuantity10kv" value="<%=Math.round(Double.parseDouble(indecisivePower10))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" readOnly="true" value="<%=indecisivePrice10%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="UnDenizenMoney10kv" value="<%=indecisiveFee10%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title">非居民照明/35KV</span>
					</td>

					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="UnDenizenQuantity35kv" readOnly="true" value="<%=Math.round(Double.parseDouble(indecisivePower35))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" readOnly="true" value="<%=indecisivePrice35%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="UnDenizenMoney35kv" readOnly="true" value="<%=indecisiveFee35%>"></span>
					</td>

					
				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">居民生活/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="DenizenQuantity10kv" value="<%=Math.round(Double.parseDouble(residentPower10))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" value="<%=residentPrice10%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="DenizenMoney10kv" value="<%=residentFee10%>"></span>
					</td>
					
					<td nowrap colspan="2">
						<span class="title">居民生活/35KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="DenizenQuantity35kv" value="<%=Math.round(Double.parseDouble(residentPower35))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" value="<%=residentPrice35%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="DenizenMoney35kv" value="<%=residentFee35%>"></span>
					</td>
					
					
					
				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">农业生产/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="ProductQuantity10kv" value="<%=Math.round(Double.parseDouble(producePower10))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" value="<%=producePrice10%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="ProductMoney10kv" value="<%=produceFee10%>"></span>
					</td>
					
					<td nowrap colspan="2">
						<span class="title">农业生产/35KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="ProductQuantity35kv" value="<%=Math.round(Double.parseDouble(producePower35))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" value="<%=producePrice35%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="ProductMoney35kv" value="<%=produceFee35%>"></span>
					</td>
					
				</tr>


				<tr>
				<td nowrap colspan="2">
						<span class="title">非普工业/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="UnIndustryQuantity10kv" value="<%=Math.round(Double.parseDouble(industryPower10))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" value="<%=industryPrice10%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="UnIndustryMoney10kv" value="<%=industryFee10%>"></span>
					</td>
				
					


					<td nowrap colspan="2">
						<span class="title">非普工业/35KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="UnIndustryQuantity35kv" value="<%=Math.round(Double.parseDouble(industryPower35))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" value="<%=industryPrice35%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="UnIndustryMoney35kv" value="<%=industryFee35%>"></span>
					</td>

				</tr>
				<tr>
						<td nowrap colspan="2">
						<span class="title">农业排灌/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="FarmUseQuantity10kv" value="<%=Math.round(Double.parseDouble(agriculturalPower10))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" value="<%=agriculturalPrice10%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title" ><input type="text" readOnly=true name="FarmUseMoney10kv" value="<%=agriculturalFee10%>"></span>
					</td>
					
					<td nowrap colspan="2">
						<span class="title">农业排灌/35KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="FarmUseQuantity35kv" value="<%=Math.round(Double.parseDouble(agriculturalPower35))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" value="<%=agriculturalPrice35%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="FarmUseMoney35kv" value="<%=agriculturalFee35%>"></span>
					</td>
				</tr>
				<tr>

					
					<td nowrap colspan="2">
						<span class="title">商业/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="BizQuantity10kv" value="<%=Math.round(Double.parseDouble(businessPower10))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" value="<%=businessPrice10%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="BizMoney10kv" value="<%=businessFee10%>"></span>
					</td>
					<td nowrap colspan="2">
					
					
					
					
					
					
						<span class="title">商业/35KV</span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="BizQuantity35kv" value="<%=Math.round(Double.parseDouble(businessPower35))%>"></span>
					</td>
					<td nowrap>
						<span class="title"><input type="text" readOnly=true name="" value="<%=businessPrice35%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" readOnly=true name="BizMoney35kv" value="<%=businessFee35%>"></span>
					</td>
				</tr>

    
    			<tr>

					
					<td nowrap colspan="2">
						<span class="title">总10KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(sum10Power))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=Rate10Fee%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="sum10fee" value="<%=sum10Fee%>"  style="width:65px"></span>
					</td>
					<td nowrap colspan="2">
					
					
					
					
					
					
						<span class="title">总35KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(sum35power))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=Rate35Fee%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="sum35fee" value="<%=sum35Fee%>"style="width:65px"></span>
					</td>
				</tr>
    <tr>
            <td nowrap colspan="2"><span class="title">三峡</span></td>
			<td nowrap><span class="title"><%=Math.round(Double.parseDouble(sanxiaPower))%></span></td>
			<td nowrap><span class="title">0.004</span></td>
			<td nowrap colspan="2"><span class="title"><input name="sanxia" value="<%=sanxiaFee%>"style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">农网还贷</span></td>
			<td nowrap><span class="title"><%=Math.round(Double.parseDouble(nongwanghaidaiPower))%></span></td>
			<td nowrap><span class="title">0.02</span></td>
			<td nowrap colspan="2"><span class="title"><input name="dianjin" value="<%=nongwanghaidaiFee%>"style="width:65px"></span></td>
    </tr>
     <tr>
           <td nowrap colspan="2"><span class="title">库区移民</span></td>
			<td nowrap><span class="title"><%=Math.round(Double.parseDouble(kuquPower))%></span></td>
			<td nowrap><span class="title">0.0031</span></td>
			<td nowrap colspan="2"><span class="title"><input name="jijin1" value="<%=kuquFee%>"style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">可再生能源</span></td>
			<td nowrap><span class="title"><%=Math.round(Double.parseDouble(kezaishengpepolePower))%></span></td>
			<td nowrap><span class="title">0.001</span></td>
			<td nowrap colspan="2"><span class="title"><input name="jijin2" value="<%=kezaishengpepoleFee%>"style="width:65px"></span></td>
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title">可再生能源</span></td>
			<td nowrap><span class="title"><%=Math.round(Double.parseDouble(kezaishengnotpepolePower))%></span></td>
			<td nowrap><span class="title">0.002</span></td>
			<td nowrap colspan="2"><span class="title"><input name="jijin3" value="<%=kezaishengnotpepoleFee%>"style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">差别电费</span></td>
			<td nowrap><span class="title"><input name="ss" value="<%=Math.round(Double.parseDouble(differenceQuantity))%>"  style="width:65px"></span></td>
			<td nowrap><span class="title"><input name="ss" value="<%=differencePrice%>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value="<%=differenceQuantityFee%>"  style="width:65px"></td>
    </tr>

				<tr class=listtitle align="center">
					<td class=title0 colspan="12">
						<B>合计信息</B>
					</td>
				</tr>
				<tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">利率电费</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input type="text" name="liLvDianFei" readOnly=true value="<%=powerRateFee%>"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title">税</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=tax%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title">资金合计</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="before" value="<%=sumAllFee%>" onblur="sum()"
								style="width: 65px"> </span>
					</td>

				</tr>
				<%
					if(lwAllWholeFeeDto.equals("")){
					
					
					
				
				 %>

				<tr>

					<td nowrap colspan="2">
						<span class="title"><input name="exends1" value="海明炉"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends2" value="0" onblur="sum()"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends3" value="多边电费"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends4" value="0" onblur="sum()"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends5" value="广播费"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends6" value="0" onblur="sum()"
								style="width: 65px"> </span>
					</td>

				</tr>
				<%
				}else{
				 %>
				 
				<tr>

					<td nowrap colspan="2">
						<span class="title"><input name="exends1" value="海明炉"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends2" value="<%=lwAllWholeFeeDto.getHaiminglu()%>" onblur="sum()"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends3" value="多边电费"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends4" value="<%=lwAllWholeFeeDto.getDuobian() %>" onblur="sum()"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends5" value="广播费"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends6" value="<%=lwAllWholeFeeDto.getFujia2() %>" onblur="sum()"
								style="width: 65px"> </span>
					</td>

				</tr>
				 <%} %>
				<tr>

					<td nowrap colspan="2">
						<span class="title"><input name="exends7" value="总合计"
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends8" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends9" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends10" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends11" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends12" value=""
								style="width: 65px"> </span>
					</td>

				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title"><input name="exends13" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends14" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends15" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends16" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends17" value=""
								style="width: 65px"> </span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends18" value=""
								style="width: 65px"> </span>
					</td>

				</tr>
			</table>

			<table width="50%" cellspacing="0" cellpadding="0" align="center">
				<tr>
					<td class=button>
						<input name="add" type="button" class=button value="打印并保存 "
							onclick="Printme();sum()">
					</td>
				</tr>
			</table>
		</form>
	</body>
	<script type="text/javascript">
	function  sum(){
	
	var last=parseFloat(fm.before.value)+parseFloat(fm.exends2.value)+parseFloat(fm.exends4.value)+parseFloat(fm.exends6.value);
	fm.exends8.value=last;
	
	}

  function   Printme()   
    
  {   
	 
   var exends1 = fm.exends1.value;
   var exends2 = fm.exends2.value;
   var exends3 = fm.exends3.value;
   var exends4 = fm.exends4.value;
   var exends5 = fm.exends5.value;
   var exends6 = fm.exends6.value;
   var exends7 = fm.exends7.value;
   var exends8 = fm.exends8.value;
   var exends9 = fm.exends9.value;
   var exends10 = fm.exends10.value;
   var exends11 = fm.exends11.value;
   var exends12 = fm.exends12.value;
   var exends13 = fm.exends13.value;
   var exends14 = fm.exends14.value;
   var exends15 = fm.exends15.value;
   var exends16 = fm.exends16.value;
   var exends17 = fm.exends17.value;
   var exends18 = fm.exends18.value;
   
   
    var zongdianliang = fm.zongdianliang.value;
     var sum10fee = fm.sum10fee.value;
      var sum35fee = fm.sum35fee.value;
       var sanxia = fm.sanxia.value;
        var dianjin = fm.dianjin.value;
         var jijin1 = fm.jijin1.value;
          var jijin2 = fm.jijin2.value;
           var jijin3 = fm.jijin3.value;
   var UnDenizenQuantity10kv = fm.UnDenizenQuantity10kv.value;
   var UnDenizenMoney10kv = fm.UnDenizenMoney10kv.value;
   var DenizenQuantity10kv = fm.DenizenQuantity10kv.value;
   var DenizenMoney10kv = fm.DenizenMoney10kv.value;
   var ProductQuantity10kv = fm.ProductQuantity10kv.value;
   var ProductMoney10kv = fm.ProductMoney10kv.value;
   var UnIndustryQuantity10kv = fm.UnIndustryQuantity10kv.value;
   var UnIndustryMoney10kv = fm.UnIndustryMoney10kv.value;
   
   var FarmUseQuantity10kv = fm.FarmUseQuantity10kv.value;
   var FarmUseMoney10kv = fm.FarmUseMoney10kv.value;
   
   var BizQuantity10kv = fm.BizQuantity10kv.value;
   var BizMoney10kv = fm.BizMoney10kv.value;
   var UnDenizenQuantity35kv = fm.UnDenizenQuantity35kv.value;
   var UnDenizenMoney35kv = fm.UnDenizenMoney35kv.value;
   var DenizenQuantity35kv = fm.DenizenQuantity35kv.value;
   var DenizenMoney35kv = fm.DenizenMoney35kv.value;
   var ProductQuantity35kv = fm.ProductQuantity35kv.value;
   var ProductMoney35kv = fm.ProductMoney35kv.value;
   var UnIndustryQuantity35kv = fm.UnIndustryQuantity35kv.value;
   var UnIndustryMoney35kv = fm.UnIndustryMoney35kv.value;
   var FarmUseQuantity35kv = fm.FarmUseQuantity35kv.value;
   var FarmUseMoney35kv = fm.FarmUseMoney35kv.value;
   var BizQuantity35kv = fm.BizQuantity35kv.value;
   var BizMoney35kv = fm.BizMoney35kv.value;
    var liLvDianFei = fm.liLvDianFei.value;
  var   strURL;     
  var a=fm.company.value;
  var b=fm.inputDate.value;
    
  strURL   =   "<%=request.getContextPath()%>/wholeSaleprint.do?company="+a+"&&inputDate="+b+"&&exends2="+exends2+"&&exends4="+exends4+"&&exends6="+exends6+"&&exends8="+exends8+"&&exends9="+exends9+"&&exends10="+exends10+"&&zongdianliang="+zongdianliang+"&&sum10fee="+sum10fee+"&&sum35fee="+sum35fee+"&&sanxia="+sanxia+"&&dianjin="+dianjin+"&&jijin1="+jijin1+"&&jijin2="+jijin2+"&&jijin3="+jijin3+"&&exends11="+exends11+"&&exends12="+exends12+"&&exends13="+exends13+"&&exends14="+exends14+"&&exends15="+exends15+"&&exends16="+exends16+"&&exends17="+exends17+"&&exends18="+exends18+"&&UnDenizenQuantity10kv="+UnDenizenQuantity10kv+"&&UnDenizenMoney10kv="+UnDenizenMoney10kv+"&&DenizenQuantity10kv="+DenizenQuantity10kv+"&&DenizenMoney10kv="+DenizenMoney10kv+"&&ProductQuantity10kv="+ProductQuantity10kv+"&&ProductMoney10kv="+ProductMoney10kv+"&&UnIndustryQuantity10kv="+UnIndustryQuantity10kv+"&&UnIndustryMoney10kv="+UnIndustryMoney10kv+"&&FarmUseQuantity10kv="+FarmUseQuantity10kv+"&&FarmUseMoney10kv="+FarmUseMoney10kv+"&&BizQuantity10kv="+BizQuantity10kv+"&&BizMoney10kv="+BizMoney10kv+"&&UnDenizenQuantity35kv="+UnDenizenQuantity35kv+"&&UnDenizenMoney35kv="+UnDenizenMoney35kv+"&&DenizenQuantity35kv="+DenizenQuantity35kv+"&&DenizenMoney35kv="+DenizenMoney35kv+"&&ProductQuantity35kv="+ProductQuantity35kv+"&&ProductMoney35kv="+ProductMoney35kv+"&&UnIndustryQuantity35kv="+UnIndustryQuantity35kv+"&&UnIndustryMoney35kv="+UnIndustryMoney35kv+"&&FarmUseQuantity35kv="+FarmUseQuantity35kv+"&&FarmUseMoney35kv="+FarmUseMoney35kv+"&&BizQuantity35kv="+BizQuantity35kv+"&&BizMoney35kv="+BizMoney35kv+"&&liLvDianFei="+liLvDianFei;     
 
  window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
  
  }  

</script>
</html>