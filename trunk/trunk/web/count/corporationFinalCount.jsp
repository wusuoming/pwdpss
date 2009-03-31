<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
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
<jsp:directive.page import="java.text.DecimalFormat" />
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto" />
<%@page import="com.elongway.pss.util.AppConst"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<meta http-equiv=Content-Type content="text/html; charset=gb2312">
	<link rel="stylesheet" type="text/css" media="all"
		href="/mimessage/css/calendar.css" title="win2k-cold-1" />

	<title>大工业结算</title>
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

	<body>
		<form name="fm" method="post" action="">
			<%
		 LwCorporationSummaryDto corporation=(LwCorporationSummaryDto)request.getAttribute("LwCorporationSummaryDto2");
		 LwCoporationUserInfoDto lwCoporationUserInfoDto=(LwCoporationUserInfoDto)request.getAttribute("lwCoporationUserInfoDto");
		Collection col=(List)request.getAttribute("colpoint");
		
		Collection colbak=(List)request.getAttribute("colpointbak");
		
		String tax=(String)request.getAttribute("tax");
		DecimalFormat df = new DecimalFormat("###0.00");
		
%>
			<table style='width:100%' border="1" cellspacing="0">
				<tr class=listtitle align="center">
					<td class=title0 colspan="11">
						<B>结算单</B>
					</td>
				</tr>
				<tr>
					<td nowrap colspan="2">
						<span class="title">月份:<%=corporation.getStatMonth()%>
						</span>
					</td>
				</tr>
				<tr>



					<td style="display:none">
						<input type="hidden" name="LineCode"
							value="<%=corporation.getLineCode()%>">
					</td>
					<td style="display:none">
						<input type="hidden" name="StartMonth"
							value="<%=corporation.getStatMonth()%>">
					</td>
					<td nowrap>
						<span class="title">户名</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=lwCoporationUserInfoDto.getUserName()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">户号</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=lwCoporationUserInfoDto.getUserNo()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">地址</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=lwCoporationUserInfoDto.getAddress()%>
						</span>
					</td>

				</tr>
				<tr>

					<td nowrap>
						<span class="title">开户行</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=lwCoporationUserInfoDto.getAccountBank()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">税号</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=lwCoporationUserInfoDto.getTaxNo()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">帐号</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=lwCoporationUserInfoDto.getAccountNo()%>
						</span>
					</td>

				</tr>
				<tr>

					<td nowrap>
						<span class="title">行业分类</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">大工业</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">供电电压</span>
					</td>
					<%
					if (lwCoporationUserInfoDto.getVoltage().equals("1")) {
					%>
					<td nowrap colspan="2">
						<span class="title">1</span>
					</td>
					<%
					}
					%>
					<%
					if (lwCoporationUserInfoDto.getVoltage().equals("2")) {
					%>
					<td nowrap colspan="2">
						<span class="title">10</span>
					</td>
					<%
					}
					%>
					<%
					if (lwCoporationUserInfoDto.getVoltage().equals("3")) {
					%>
					<td nowrap colspan="2">
						<span class="title">35</span>
					</td>
					<%
					}
					%>
					<%
					if (lwCoporationUserInfoDto.getVoltage().equals("4")) {
					%>
					<td nowrap colspan="2">
						<span class="title">220</span>
					</td>
					<%
					}
					%>
					<%
					if (lwCoporationUserInfoDto.getVoltage().equals("5")) {
					%>
					<td nowrap colspan="2">
						<span class="title">220以上</span>
					</td>
					<%
					}
					%>

					<td nowrap colspan="2">
						<span class="title">供电线路</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=lwCoporationUserInfoDto.getLineNo()%>
						</span>
					</td>

				</tr>







				<tr class=listtitle align="center">
					<td class=title0 colspan="12">
						<B>表计信息</B>
					</td>
				</tr>
				<tr>
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
						<span class="title">需量指示</span>
					</td>


				</tr>
				<%
							if (corporation.getStatMonth().equals(
							PowerFeeCal.getCurrentBillMonth())) {
				%>
				<%
						Iterator it = col.iterator();
						while (it.hasNext()) {
							LwNewFactoryIndicatorDto lwFactoryIndicatorDto = (LwNewFactoryIndicatorDto) it
							.next();
				%>
				<tr>
					<td>
						<input name="lincode"
							value="<%=lwCoporationUserInfoDto.getLineNo()%>"
							readonly="readonly" style="width:65px">
					</td>
					<td>
						<input name="ammeterNo"
							value="<%=lwFactoryIndicatorDto.getAmmeterNo()%>"
							readonly="readonly" style="width:65px">
					</td>
					<%
					if (lwFactoryIndicatorDto.getAmmeterStyle().equals("0")) {
					%>
					<td class="input">
						<input name="ammeterStyle" value="大工业" readonly="readonly"
							style="width:65px">
					</td>
					<%
					}
					%>
					<%
					if (lwFactoryIndicatorDto.getAmmeterStyle().equals("1")) {
					%>
					<td class="input">
						<input name="ammeterStyle" value="非居民照明" readonly="readonly"
							style="width:65px">
					</td>
					<%
					}
					%>
					<td class="input">
						<input name="Rate"
							value="<%=Math.round(lwFactoryIndicatorDto.getRate())%>"
							style="width:65px">
					</td>
					<td class="input">
						<input name="LastWorkNum"
							value="<%=lwFactoryIndicatorDto.getLastWorkNum()%>"
							readonly="readonly" style="width:65px">
					</td>


					<td class="input">
						<input name="ThisWorkNum"
							value="<%=lwFactoryIndicatorDto.getThisWorkNum()%>"
							onblur="workpower()" style="width:65px">
					</td>

					<td class="input">
						<input name="workQuantity"
							value="<%=lwFactoryIndicatorDto.getWorkQuantity()%>"
							style="width:65px">
					</td>
					<td class="input">
						<input name="LastIdleNum"
							value="<%=lwFactoryIndicatorDto.getLastIdleNum()%>"
							readonly="readonly" style="width:65px">
					</td>



					<td class="input">
						<input name="ThisIdleNum"
							value="<%=lwFactoryIndicatorDto.getThisIdleNum()%>"
							style="width:65px">
					</td>

					<td class="input">
						<input name="workQuantity"
							value="<%=lwFactoryIndicatorDto.getUnworkQuantity()%>"
							style="width:65px">
					</td>
					<%
					if (lwFactoryIndicatorDto.getAmmeterStyle().equals("0")) {
					%>
					<td class="input">
						<input name="needPointer"
							value="<%=corporation.getNeedPointer()%>" readonly="readonly"
							style="width:65px">
					</td>

					<%
					}
					%>

				</tr>
				<%
					}
					} else {

						Iterator itbak = colbak.iterator();
						while (itbak.hasNext()) {
							LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto = (LwNewFactoryIndicatorBakDto) itbak
							.next();
				%>
				<tr>
					<td>
						<input name="lincode"
							value="<%=lwCoporationUserInfoDto.getLineNo()%>"
							readonly="readonly" style="width:65px">
					</td>
					<td>
						<input name="ammeterNo"
							value="<%=lwNewFactoryIndicatorBakDto.getAmmeterNo()%>"
							readonly="readonly" style="width:65px">
					</td>
					<%
								if (lwNewFactoryIndicatorBakDto.getAmmeterStyle().equals(
								"0")) {
					%>
					<td class="input">
						<input name="ammeterStyle" value="大工业" readonly="readonly"
							style="width:65px">
					</td>
					<%
					}
					%>
					<%
								if (lwNewFactoryIndicatorBakDto.getAmmeterStyle().equals(
								"1")) {
					%>
					<td class="input">
						<input name="ammeterStyle" value="非居民照明" readonly="readonly"
							style="width:65px">
					</td>
					<%
					}
					%>
					<td class="input">
						<input name="Rate"
							value="<%=Math.round(lwNewFactoryIndicatorBakDto
											.getRate())%>"
							style="width:65px">
					</td>
					<td class="input">
						<input name="LastWorkNum"
							value="<%=lwNewFactoryIndicatorBakDto
											.getLastWorkNum()%>"
							readonly="readonly" style="width:65px">
					</td>


					<td class="input">
						<input name="ThisWorkNum"
							value="<%=lwNewFactoryIndicatorBakDto
											.getThisWorkNum()%>"
							onblur="workpower()" style="width:65px">
					</td>

					<td class="input">
						<input name="workQuantity"
							value="<%=lwNewFactoryIndicatorBakDto.getWorkQuantity()%>"
							style="width:65px">
					</td>
					<td class="input">
						<input name="LastIdleNum"
							value="<%=lwNewFactoryIndicatorBakDto
											.getLastIdleNum()%>"
							readonly="readonly" style="width:65px">
					</td>



					<td class="input">
						<input name="ThisIdleNum"
							value="<%=lwNewFactoryIndicatorBakDto
											.getThisIdleNum()%>"
							style="width:65px">
					</td>

					<td class="input">
						<input name="workQuantity"
							value="<%=lwNewFactoryIndicatorBakDto.getUnworkQuantity()%>"
							style="width:65px">
					</td>
					<%
								if (lwNewFactoryIndicatorBakDto.getAmmeterStyle().equals(
								"0")) {
					%>
					<td class="input">
						<input name="needPointer"
							value="<%=corporation.getNeedPointer()%>" readonly="readonly"
							style="width:65px">
					</td>

					<%
					}
					%>

				</tr>


				<%
					}
					}
				%>

				<tr>




					<td nowrap>
						<span class="title">有功变损</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=corporation.getLineLoss()%>
						</span>
					</td>
					<td nowrap>
						<span class="title">无功变损</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=corporation.getUnLineLoss()%>
						</span>
					</td>
					<td nowrap>
						<span class="title">有功线损</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=corporation.getLossQuantity()%>
						</span>
					</td>
					<td nowrap>
						<span class="title">无功线损</span>
					</td>
					<td nowrap>
						<span class="title"><%=corporation.getUnLossQuantity()%>
						</span>
					</td>

				</tr>
				<tr>

					<td nowrap>
						<span class="title">退补有功电量</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="ss" value=""
								style="width:65px">
						</span>
					</td>
					<td nowrap>
						<span class="title">（其中旁路电量）</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="dd" value=""
								style="width:65px">
						</span>
					</td>
					<td nowrap>
						<span class="title">退补无功电量</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="ee" value=""
								style="width:65px">
						</span>
					</td>
					<td nowrap>
						<span class="title">总有功电量</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(corporation.getElectricQuantity())%>
						</span>
					</td>

				</tr>
				<tr>

					<td nowrap>
						<span class="title">无功总电量</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getUnPointerQuantity())%>
						</span>
					</td>
					<td nowrap>
						<span class="title">力率标准值</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">0.90</span>
					</td>
					<td nowrap>
						<span class="title">力率实际值</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=corporation.getAjustRate()%>
						</span>
					</td>
					<td nowrap>
						<span class="title">力率调整值</span>
					</td>
					<td nowrap>
						<span class="title"><%=corporation.getRateCode()%>
						</span>
					</td>
				</tr>

				<tr class=listtitle align="center">
					<td class=title0 colspan="12">
						<B>电费信息</B>
					</td>
				</tr>
				<tr>
				<tr>
					<td nowrap>
						<span class="title">项目</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">电量</span>
					</td>
					<td nowrap>
						<span class="title">电价</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">金额</span>
					</td>
					<td nowrap>
						<span class="title">项目</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">电量</span>
					</td>
					<td nowrap>
						<span class="title">电价</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">金额</span>
					</td>

				</tr>
				<tr>
					<td nowrap>
						<span class="title">大工业</span>
					</td>
					<%
						System.out.println("sss" + corporation.getQuantityStyle());
						if (corporation.getQuantityStyle().equals("")
								&& corporation.getIfchange().equals("0")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getPointerQuantity())%>
						</span>
					</td>
					<td nowrap>
						<span class="title"><%=corporation.getPointerPrice()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getPointerFee())%>
						</span>
					</td>
					<%
					}
					%>
					<%
								if (corporation.getQuantityStyle().equals("1")
								&& corporation.getIfchange().equals("0")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getPeakQuantity())%>
						</span>
					</td>
					<td nowrap>
						<span class="title"><%=corporation.getPeakPrice()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getPeakFee())%>
						</span>
					</td>
					<%
					}
					%>
					<%
					if (corporation.getIfchange().equals("1")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getBeforPower())%>
						</span>
					</td>
					<td nowrap>
						<span class="title"><%=corporation.getBeforPrice()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getBeforFee())%>
						</span>
					</td>
					<%
					}
					%>

					<td nowrap>
						<span class="title">非居民照明</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getUnDenizenQuantity())%>
						</span>
					</td>
					<td nowrap>
						<span class="title"><%=corporation.getUnDenizenPrice()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getUnDenizenFee())%>
						</span>
					</td>

				</tr>
				<tr>

					<td nowrap>
						<span class="title">三峡基金</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getElectricQuantity())%>
						</span>
					</td>
					<td nowrap>
						<span class="title"><%=corporation.getSanXiaPrice()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getSanXiaFee())%>
						</span>
					</td>
					<td nowrap>
						<span class="title">基金</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getElectricQuantity())%>
						</span>
					</td>
					<td nowrap>
						<span class="title"><%=corporation.getSurchargePrice()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getSurcharge())%>
						</span>
					</td>
				</tr>
				<tr>

					<td nowrap>
						<span class="title">电金</span>
					</td>
					<%if("20699999069".equals(corporation.getLineCode())){%>
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getUnDenizenQuantity())%>
						</span>
					</td>
					<%}else{ %>
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getElectricQuantity())%>
						</span>
					</td>
					<%} %>
					<td nowrap>
						<span class="title"><%=corporation.getPowerPrice()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getPowerFee())%>
						</span>
					</td>
					<%
					if (corporation.getQuantityStyle().equals("1")) {
					%>
					<td nowrap>
						<span class="title">大工业</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getLastPower())%>
						</span>
					</td>
					<td nowrap>
						<span class="title"><%=corporation.getLastPrice()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getLastFee())%>
						</span>
					</td>
					<%
					}
					%>
					<%
					if (corporation.getIfchange().equals("0")) {
					 
					%>
					<td nowrap colspan="1">
						<span class="title">""</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=corporation.getTaobiaoQuantity() %></span>
					</td>
					<td nowrap>
						<span class="title"><%=corporation.getTaobiaoPrice() %></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=corporation.getTaobiaoFee() %></span>
					</td>
					<%
					}
					%>
					
				</tr>

				<tr class=listtitle align="center">
					<td class=title0 colspan="12">
						<B>合计信息</B>
					</td>
				</tr>
				<tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">容量</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=corporation.getContentQuantity()%>
						</span>
					</td>
					<td nowrap>
						<span class="title">容量电价</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=corporation.getContentPrice()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title" colspan="2">容量电费</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getContentFee())%>
						</span>
					</td>

				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">需量</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=corporation.getNeedQuantity()%>
						</span>
					</td>
					<td nowrap>
						<span class="title">需量电价</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=corporation.getNeedPrice()%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">需量电费</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getNeedFee())%>
						</span>
					</td>

				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">力率电费</span>
					</td>
					<td nowrap colspan="2">
					<%
					System.out.println(corporation.getPowerRateFee());
					
					 %>
						<span class="title"><%=df.format(corporation.getPowerRateFee())%>
						</span>
					</td>
					<td nowrap>
						<span class="title">税</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=tax%>
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title">资金合计</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=df.format(corporation.getSumFee())%>
						</span>
					</td>

				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title"><input name="exends1" value="<%=corporation.getInputDate() %>"
								style="width:65px">
						</span>
					</td>
					<%if(corporation.getUnLineLoss()==0.0||corporation.getUnLineLoss()==0){
					
					
					 %>
					 <td nowrap colspan="2">
						<span class="title"><input name="exends2" value=""
								style="width:65px">
						</span>
					</td>
					<%}else{ %>
					<td nowrap colspan="2">
						<span class="title"><input name="exends2" value="<%=corporation.getUnLineLoss() %>"
								style="width:65px">
						</span>
					</td>
					<%} %>
					<td nowrap>
						<span class="title"><input name="exends3" value=""
								style="width:65px">
						</span>
					</td>
					
					<td nowrap colspan="2">
						<span class="title"><input name="exends4" value=""
								style="width:65px">
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends5" value=""
								style="width:65px">
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends6" value=""
								style="width:65px">
						</span>
					</td>

				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title"><input name="exends7" value=""
								style="width:65px">
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends8" value=""
								style="width:65px">
						</span>
					</td>
					<td nowrap>
						<span class="title"><input name="exends9" value=""
								style="width:65px">
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends10" value=""
								style="width:65px">
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends11" value=""
								style="width:65px">
						</span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><input name="exends12" value=""
								style="width:65px">
						</span>
					</td>

				</tr>
			</table>

			<table width="50%" cellspacing="0" cellpadding="0" align="center">
				<tr>
					<td class=button>
						<input name="add" type="button" class=button value=" 打 印 "
							onClick="javascript:printCount();">
					</td>
				</tr>
			</table>
		</form>
	</body>

	<script language="javascript">

function printCount(){
	 var   strURL;     
  var a=fm.LineCode.value;
  var b=fm.StartMonth.value;
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
  strURL   =   "<%=request.getContextPath()%>/corporationprint.do?corporationName="+a+"&&inputDate="+b+"&&exends1="+exends1+"&&exends2="+exends2+"&&exends3="+exends3+"&&exends4="+exends4+"&&exends5="+exends5+"&&exends6="+exends6+"&&exends7="+exends7+"&&exends8="+exends8+"&&exends9="+exends9+"&&exends10="+exends10+"&&exends11="+exends11+"&&exends12="+exends12;    
    
  winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
}
</script>
</html>
