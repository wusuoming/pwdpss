<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleSummaryDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCorporationSummaryDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="java.util.Collection"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwFactoryIndicatorDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwAmmeterChangeDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorBakDto"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>���۽��� </title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>��ҵ���㵥</title>
<app:css />

<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

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

<body onload="javascript:doPrint();window.close()">
<form name="fm" method="post" action="">
 <%
		 
		Collection col=(List)request.getAttribute("all");
		Collection colbak = (List) request.getAttribute("allbak");
		String company=(String)request.getAttribute("company");
		String statMonth=(String)request.getAttribute("statMonth");
		String sumAllFee=(String)request.getAttribute("sumAllFee");
		String agriculturalPower10=(String)request.getAttribute("agriculturalPower10");
		String producePower10=(String)request.getAttribute("producePower10");
		String residentPower10=(String)request.getAttribute("residentPower10");
		String indecisivePower10=(String)request.getAttribute("indecisivePower10");
		String industryPower10=(String)request.getAttribute("industryPower10");
		String agriculturalFee10=(String)request.getAttribute("agriculturalFee10");
		String produceFee10=(String)request.getAttribute("produceFee10");
		String residentFee10=(String)request.getAttribute("residentFee10");
		String indecisiveFee10=(String)request.getAttribute("indecisiveFee10");
		String industryFee10=(String)request.getAttribute("industryFee10");
		String businessFee10=(String)request.getAttribute("businessFee10");
		String businessPower10=(String)request.getAttribute("businessPower10");
		String agriculturalPower35=(String)request.getAttribute("agriculturalPower35");
		String producePower35=(String)request.getAttribute("producePower35");
		String residentPower35=(String)request.getAttribute("residentPower35");
		String indecisivePower35=(String)request.getAttribute("indecisivePower35");
		String industryPower35=(String)request.getAttribute("industryPower35");
		String agriculturalFee35=(String)request.getAttribute("agriculturalFee35");
		String produceFee35=(String)request.getAttribute("produceFee35");
		String residentFee35=(String)request.getAttribute("residentFee35");
		String indecisiveFee35=(String)request.getAttribute("indecisiveFee35");
		String industryFee35=(String)request.getAttribute("industryFee35");
		String businessFee35=(String)request.getAttribute("businessFee35");
		String businessPower35=(String)request.getAttribute("businessPower35");
		String lineLoss=(String)request.getAttribute("lineLoss");
		String trassLoss=(String)request.getAttribute("trassLoss");
		String sumFee=(String)request.getAttribute("sumFee");
		String sumRateFee=(String)request.getAttribute("sumRateFee");
		String powerRateFee=(String)request.getAttribute("powerRateFee");
		String sanxiaPower=(String)request.getAttribute("sanxiaPower");
		String tax=(String)request.getAttribute("tax");
		String nongwanghaidaiPower=(String)request.getAttribute("nongwanghaidaiPower");
		String kezaishengpepolePower=(String)request.getAttribute("kezaishengpepolePower");
		String kezaishengnotpepolePower=(String)request.getAttribute("kezaishengnotpepolePower");
		String kuquPower=(String)request.getAttribute("kuquPower");
		String sanxiaFee=(String)request.getAttribute("sanxiaFee");
		String nongwanghaidaiFee=(String)request.getAttribute("nongwanghaidaiFee");
		String kezaishengpepoleFee=(String)request.getAttribute("kezaishengpepoleFee");
		String kezaishengnotpepoleFee=(String)request.getAttribute("kezaishengnotpepoleFee");
		String kuquFee=(String)request.getAttribute("kuquFee");
		String sumPower=(String)request.getAttribute("sumPower");
		String unsumPower=(String)request.getAttribute("unsumPower");
		
		String agriculturalPrice10=(String)request.getAttribute("agriculturalPrice10");
		String producePrice10=(String)request.getAttribute("producePrice10");
		String residentPrice10=(String)request.getAttribute("residentPrice10");
		String indecisivePrice10=(String)request.getAttribute("indecisivePrice10");
		String industryPrice10=(String)request.getAttribute("industryPrice10");
		String businessPrice10=(String)request.getAttribute("businessPrice10");
		String agriculturalPrice35=(String)request.getAttribute("agriculturalPrice35");
		String producePrice35=(String)request.getAttribute("producePrice35");
		String residentPrice35=(String)request.getAttribute("residentPrice35");
		String indecisivePrice35=(String)request.getAttribute("indecisivePrice35");
		String industryPrice35=(String)request.getAttribute("industryPrice35");
		String businessPrice35=(String)request.getAttribute("businessPrice35");
		
		String exends1=(String)request.getAttribute("exends1");
		String exends2=(String)request.getAttribute("exends2");
		String exends3=(String)request.getAttribute("exends3");
		String exends4=(String)request.getAttribute("exends4");
		String exends5=(String)request.getAttribute("exends5");
		String exends6=(String)request.getAttribute("exends6");
		String exends7=(String)request.getAttribute("exends7");
		String exends8=(String)request.getAttribute("exends8");
		String exends9=(String)request.getAttribute("exends9");
		String exends10=(String)request.getAttribute("exends10");
					
				String Rate10Fee = (String) request
						.getAttribute("Rate10Fee");
						String Rate35Fee = (String) request
						.getAttribute("Rate35Fee");	
		
		String differenceQuantity=(String)request.getAttribute("differenceQuantity");
		String differencePrice=(String)request.getAttribute("differencePrice");
		String differenceQuantityFee=(String)request.getAttribute("differenceQuantityFee");
		
		String sum10Fee = (String) request.getAttribute("sum10Fee");
						String sum35Fee = (String) request.getAttribute("sum35Fee");
						String sum10Power = (String) request.getAttribute("sum10Power");
						String sum35power = (String) request.getAttribute("sum35power");
		
%>
		   <table style='width:100%' border="1" cellspacing="0">
  <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B><font size="3">���۽��㵥</font></B></td>
				<td nowrap colspan="2" style="display: none"><span class="title"><input name="company" value="<%=company%>"  style="width:65px"></span></td>
				<td nowrap colspan="2" style="display: none"><span class="title"><input name="inputDate" value="<%=statMonth%>"  style="width:65px"></span></td>
				
		</tr>
		<tr>
				<td nowrap colspan="2">
						<span class="title"><font size="3">�·�:<%=statMonth%></font></span>
					</td>
				</tr>

    <tr >
      
      

        
            <td nowrap colspan="2" ><span class="title"><font size="3">����</font></span></td>
            
            <%
            if(company.equals("gy")){
             %>
			<td nowrap colspan="2" ><span class="title"><font size="3">����ũ���</font></span></td>
			<%} %>
			 <%
            if(company.equals("dm")){
             %>
			<td nowrap colspan="2" width="50%"><span class="title"><font size="3">��ïũ���</font></span></td>
			<%} %>
			 <%
            if(company.equals("jy")){
             %>
			<td nowrap colspan="2" ><span class="title"><font size="3">��ԭũ���</font></span></td>
			<%} %>
			 <%
            if(company.equals("ty")){
             %>
			<td nowrap colspan="2" ><span class="title"><font size="3">����ũ���</font></span></td>
			<%} %>
			<td nowrap colspan="2"><span class="title"><font size="3">����</font></span></td>
			<%
						if (company.equals("gy")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><font size="3">20699999179</font> </span>
					</td>
					<%} %>
						<%
						if (company.equals("dm")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><font size="3">20699999185</font> </span>
					</td>
					<%} %>
					
						<%
						if (company.equals("ty")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><font size="3">20699999178</font> </span>
					</td>
					<%} %>
					
						<%
						if (company.equals("jy")) {
					%>
					<td nowrap colspan="2">
						<span class="title"><font size="3">20699999177</font></span>
					</td>
					<%} %>
			<td nowrap colspan="2"><span class="title"><font size="3">��ַ</font></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value=""  style="width:65px" class="inputprint"></span></td>

    </tr>
    <tr>
   
            <td nowrap colspan="2"><span class="title"><font size="3">������</font></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value=""  style="width:65px" class="inputprint"></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">˰��</font></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value=""  style="width:65px" class="inputprint"></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�ʺ�</font></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value=""  style="width:65px" class="inputprint"></span></td>

    </tr>
     <tr>
   
            <td nowrap colspan="2"><span class="title"><font size="3">��ҵ����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�����ѹ</font></span></td>
			
			<td nowrap colspan="2"><span class="title"><font size="3">10KV , 35KV</font></span></td>
	
			
			<td nowrap colspan="2"><span class="title"><font size="3">������·</font></span></td>
			<td nowrap colspan="2"><span class="title"></span></td>

    </tr>
    <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B><font size="3">�����Ϣ</font></B></td>
		</tr>
      <tr class=listtitle>
     <td nowrap><span class="title"><font size="3">��·����</font> </span></td>
			<td nowrap><span class="title"><font size="3">���</font> </span></td>
			<td nowrap><span class="title"><font size="3">���</font></span></td>
			<td nowrap><span class="title"><font size="3">�Ʒ����</font></span></td>
			<td nowrap><span class="title"><font size="3">����</font></span></td>
			<td nowrap><span class="title"><font size="3">�����й�</font></span></td>
			<td nowrap><span class="title"><font size="3">�����й�</font></span></td>
			<td nowrap><span class="title"><font size="3">�й�����</font></span></td>
			<td nowrap><span class="title"><font size="3">�����޹�</font></span></td>
			<td nowrap><span class="title"><font size="3">�����޹�</font></span></td>
			<td nowrap><span class="title"><font size="3">�޹�����</font></span></td>
			<td nowrap><span class="title"><font size="3">��������</font></span></td>
			

			</tr>
			<%
				String serchdate=(String)request.getAttribute("statMonth");
				String now=PowerFeeCal.getCurrentBillMonth();
				if(col!=null||!col.equals("")){
				
				 %>
			<%
			Iterator it=col.iterator();
			while(it.hasNext()){
			LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto=(LwWholeSaleIndicatorDto)it.next();
			String conditions= " flag=1 and userno='"+lwWholeSaleIndicatorDto.getUserNo()+"'";
			BLLwAmmeterChangeFacade blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
			BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
			LwWholeSaleUserInfoDto  lwWholeSaleUserInfoDto=blLwWholeSaleUserInfoFacade.findByPrimaryKey(lwWholeSaleIndicatorDto.getUserNo());
			Collection colat=blLwAmmeterChangeFacade.findByConditions(conditions);
			Iterator ad=colat.iterator();
			LwAmmeterChangeDto lwAmmeterChangeDto=new LwAmmeterChangeDto();
			while(ad.hasNext()){
			 lwAmmeterChangeDto=(LwAmmeterChangeDto)ad.next();
			}
			 %>
			<tr >
						<td class="input" ><font size="3"><%=lwWholeSaleIndicatorDto.getUserNo()%></font></td>
						<td  ><font size="3"><%=lwAmmeterChangeDto.getAmmeterNo()%></font></td>
						<%
						if(lwWholeSaleUserInfoDto.getIfCal().equals("0") ){
						 %>
						<td class="input" ><font size="3">�ܱ�</font></td>
						<%} %>
						<%
						if(lwWholeSaleUserInfoDto.getIfCal().equals("1") ){
						 %>
						<td class="input" ><font size="3">�ױ�</font></td>
						<%} %>
						<td class="input" ><font size="3"><%=lwWholeSaleUserInfoDto.getVoltage()%>KV����</font></td>
						<td class="input" ><font size="3"><%=Math.round(lwWholeSaleIndicatorDto.getRate())%></font></td>
						<td class="input" ><font size="3"><%=lwWholeSaleIndicatorDto.getLastWorkNum()%></font></td>
						
						
						 <td class="input" ><font size="3"><%=lwWholeSaleIndicatorDto.getThisWorkNum()%></font></td>
						
						 <td class="input" ><font size="3"><%=lwWholeSaleIndicatorDto.getWorkQuantity() %></font></td>
						<td class="input" ><font size="3"><%=lwWholeSaleIndicatorDto.getLastIdleNum()%></font></td>
						
						
					
						 <td class="input" ><font size="3"><%=lwWholeSaleIndicatorDto.getThisIdleNum()%></font></td>
						
						 <td class="input" ><font size="3"><%=lwWholeSaleIndicatorDto.getUnworkQuantity()%></font></td>
						<td class="input" ><font size="3"><%=lwWholeSaleIndicatorDto.getPowerCode()%></font></td>
						
			</tr>
			<%
					}
					}else{
				%>
				<%
					Iterator itbak = colbak.iterator();
					while (itbak.hasNext()) {
						LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto = (LwWholeSaleIndicatorBakDto) itbak
								.next();
						String conditions = " flag=1 and userno='"
								+ lwWholeSaleIndicatorBakDto.getUserNo() + "'";
						BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
						BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade = new BLLwWholeSaleUserInfoFacade();
						LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = blLwWholeSaleUserInfoFacade
								.findByPrimaryKey(lwWholeSaleIndicatorBakDto.getUserNo());
						Collection colat = blLwAmmeterChangeFacade
								.findByConditions(conditions);
						Iterator ad = colat.iterator();
						LwAmmeterChangeDto lwAmmeterChangeDto = new LwAmmeterChangeDto();
						while (ad.hasNext()) {
							lwAmmeterChangeDto = (LwAmmeterChangeDto) ad.next();
						}
				%>
				<tr >
						<td class="input" ><font size="3"><%=lwWholeSaleIndicatorBakDto.getUserNo()%></font></td>
						<td  ><font size="3"><%=lwAmmeterChangeDto.getAmmeterNo()%></font></td>
						<%
						if(lwWholeSaleUserInfoDto.getIfCal().equals("0") ){
						 %>
						<td class="input" ><font size="3">�ܱ�</font></td>
						<%} %>
						<%
						if(lwWholeSaleUserInfoDto.getIfCal().equals("1") ){
						 %>
						<td class="input" ><font size="3">�ױ�</font></td>
						<%} %>
						<td class="input" ><font size="3"><%=lwWholeSaleUserInfoDto.getVoltage()%>KV����</font></td>
						<td class="input" ><font size="3"><%=Math.round(lwWholeSaleIndicatorBakDto.getRate())%></font></td>
						<td class="input" ><font size="3"><%=lwWholeSaleIndicatorBakDto.getLastWorkNum()%></font></td>
						
						
						 <td class="input" ><font size="3"><%=lwWholeSaleIndicatorBakDto.getThisWorkNum()%></font></td>
						
						 <td class="input" ><font size="3"><%=lwWholeSaleIndicatorBakDto.getWorkQuantity() %></font></td>
						<td class="input" ><font size="3"><%=lwWholeSaleIndicatorBakDto.getLastIdleNum()%></font></td>
						
						
					
						 <td class="input" ><font size="3"><%=lwWholeSaleIndicatorBakDto.getThisIdleNum()%></font></td>
						
						 <td class="input" ><font size="3"><%=lwWholeSaleIndicatorBakDto.getUnworkQuantity()%></font></td>
						<td class="input" ><font size="3"><%=lwWholeSaleIndicatorBakDto.getPowerCode()%></font></td>
						
			</tr>
				<%
					}
					}
				%>



    


    <tr>
      
      
     
        
            <td nowrap colspan="2"><span class="title" ><font size="3">�й�����</font></span></td>
			<td nowrap ><span class="title"><font size="3"><%=trassLoss%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�޹�����</font></span></td>
			<td nowrap ><span class="title"><input name="ss" value=""  style="width:65px" class="inputprint"></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�й�����</font></span></td>
			<td nowrap ><span class="title"><font size="3"><%=lineLoss%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�޹�����</font></span></td>
			<td nowrap ><span class="title"><input name="ss" value=""  style="width:65px" class="inputprint"></span></td>
 
    </tr>
    <tr>
   
            <td nowrap colspan="2"><span class="title"><font size="3">�˲��й�����</font></span></td>
			<td nowrap><span class="title"><input name="ss" value=""  style="width:65px" class="inputprint"></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">��������·������</font></span></td>
			<td nowrap><span class="title"><input name="dd" value=""  style="width:65px" class="inputprint"></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�˲��޹�����</font></span></td>
			<td nowrap><span class="title"><input name="ee" value=""  style="width:65px" class="inputprint"></span></td>
								<td nowrap colspan="2"><span class="title"><font size="3">���й�����</font></span></td>
			<td nowrap><span class="title"><font size="3"><%=Math.round(Double.parseDouble(sumPower))%></font></span></td>

    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3">�޹��ܵ���</font></span></td>
			<td nowrap ><span class="title"><font size="3"><%=Math.round(Double.parseDouble(unsumPower))%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">���ʱ�׼ֵ</font></span></td>
			<td nowrap><span class="title"><font size="3">0.80</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">����ʵ��ֵ</font></span></td>
			<td nowrap><span class="title"><input name="ss" value=""  style="width:65px"  class="inputprint"></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">���ʵ���ֵ</font></span></td>
			<td nowrap><span class="title"><input name="ss" value=""  style="width:65px" class="inputprint"></span></td>
    </tr>
   
    <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B><font size="3">�����Ϣ</font></B></td>
		</tr>
    <tr>
    <tr>
      
      
     
        
            <td nowrap colspan="2"><span class="title"><font size="3">��Ŀ</font></span></td>
			<td nowrap ><span class="title"><font size="3">����</font></span></td>
			<td nowrap "><span class="title"><font size="3">���</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">���</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">��Ŀ</font></span></td>
			<td nowrap ><span class="title"><font size="3">����</font></span></td>
			<td nowrap ><span class="title"><font size="3">���</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">���</font></span></td>
 
    </tr>
    <tr>

					<td nowrap colspan="2">
						<span class="title"><font size="3">�Ǿ�������/10KV</font></span>
					</td>

					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(indecisivePower10))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=indecisivePrice10%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=indecisiveFee10%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3">�Ǿ�������/35KV</font></span>
					</td>

					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(indecisivePower35))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=indecisivePrice35%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=indecisiveFee35%></font></span>
					</td>

					
				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title"><font size="3">��������/10KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(residentPower10))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=residentPrice10%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=residentFee10%></font></span>
					</td>
					
					<td nowrap colspan="2">
						<span class="title"><font size="3">��������/35KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(residentPower35))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=residentPrice35%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=residentFee35%></font></span>
					</td>
					
					
					
				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title"><font size="3">ũҵ����/10KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(producePower10))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=producePrice10%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=produceFee10%></font></span>
					</td>
					
					<td nowrap colspan="2">
						<span class="title"><font size="3">ũҵ����/35KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(producePower35))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=producePrice35%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=produceFee35%></font></span>
					</td>
					
				</tr>


				<tr>
				<td nowrap colspan="2">
						<span class="title"><font size="3">���չ�ҵ/10KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(industryPower10))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=industryPrice10%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=industryFee10%></font></span>
					</td>
				
					


					<td nowrap colspan="2">
						<span class="title"><font size="3">���չ�ҵ/35KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(industryPower35))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=industryPrice35%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=industryFee35%></font></span>
					</td>

				</tr>
				<tr>
						<td nowrap colspan="2">
						<span class="title"><font size="3">ũҵ�Ź�/10KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(agriculturalPower10))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=agriculturalPrice10%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title" ><font size="3"><%=agriculturalFee10%></font></span>
					</td>
					
					<td nowrap colspan="2">
						<span class="title"><font size="3">ũҵ�Ź�/35KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(agriculturalPower35))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=agriculturalPrice35%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=agriculturalFee35%></font></span>
					</td>
				</tr>
				<tr>

					
					<td nowrap colspan="2">
						<span class="title"><font size="3">��ҵ/10KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(businessPower10))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=businessPrice10%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=businessFee10%></font></span>
					</td>
					<td nowrap colspan="2">
					
					
					
					
					
					
						<span class="title"><font size="3">��ҵ/35KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(businessPower35))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=businessPrice35%></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=businessFee35%></font></span>
					</td>
				</tr>

    
    			<tr>

					
					<td nowrap colspan="2">
						<span class="title"><font size="3">��10KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(sum10Power))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><input name="ss" value=""  style="width:65px" class="inputprint"></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=sum10Fee%></font></span>
					</td>
					<td nowrap colspan="2">
					
					
					
					
					
					
						<span class="title"><font size="3">��35KV</font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=Math.round(Double.parseDouble(sum35power))%></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><input name="ss" value=""  style="width:65px" class="inputprint"></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=sum35Fee%></font></span>
					</td>
				</tr>
				

    			
    
    
    
    
    
    
    
    <tr>
   
            <td nowrap colspan="2"><span class="title"><font size="3">��Ͽ</font></span></td>
           
			<td nowrap><span class="title"><font size="3"><%=Math.round(Double.parseDouble(sanxiaPower))%></span></td>
			<td nowrap><span class="title"><font size="3">0.004</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=sanxiaFee%></font></span></td>
			
			
			<td nowrap colspan="2"><span class="title"><font size="3">ũ������</font></span></td>
			<td nowrap><span class="title"><font size="3"><%=Math.round(Double.parseDouble(nongwanghaidaiPower))%></span></td>
			<td nowrap><span class="title"><font size="3">0.02</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=nongwanghaidaiFee%><font size="3"></span></td>

    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3">��������</font></span></td>
			<td nowrap><span class="title"><font size="3"><%=Math.round(Double.parseDouble(kuquPower))%></font></span></td>
			<td nowrap><span class="title"><font size="3"><font size="3">0.0031</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=kuquFee%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">��������Դ</font></span></td>
			<td nowrap><span class="title"><font size="3"><%=Math.round(Double.parseDouble(kezaishengpepolePower))%></font></span></td>
			<td nowrap><span class="title"><font size="3">0.001</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=kezaishengpepoleFee%></font></span></td>
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3">��������Դ</font></span></td>
			<td nowrap><span class="title"><font size="3"><%=Math.round(Double.parseDouble(kezaishengnotpepolePower))%></font></span></td>
			<td nowrap><span class="title"><font size="3">0.002</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=kezaishengnotpepoleFee%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�����</font></span></td>
			<td nowrap><span class="title"><font size="3"><%=Math.round(Double.parseDouble(differenceQuantity))%></font></span></td>
			<td nowrap><span class="title"><font size="3"><%=differencePrice%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=differenceQuantityFee%></font></td>
    </tr>

     <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B><font size="3">�ϼ���Ϣ</font></B></td>
		</tr>
    <tr>
     <tr>
   			
           <td nowrap colspan="2"><span class="title"><font size="3">���ʵ��</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=powerRateFee%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">˰</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=tax%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�ʽ�ϼ�</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=sumAllFee%></font></span></td>
			
    </tr>
     
    <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3">����¯</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends2") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">��ߵ��</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends4") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�㲥��</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends6") %></font></span></td>
			
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3">�ܺϼ�</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends8") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">
			<%
			if(request.getAttribute("exends9")!=null){
			 %>
			
			
			<%=request.getAttribute("exends9") %>
			
			<%} %>
			</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">
			<% if(request.getAttribute("exends10")!=null){
			 %>
			
			
			<%=request.getAttribute("exends10") %>
			
			<%} %></font></span></td>
			
			<%--<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends11") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends12") %></font></span></td>
			
    --%></tr><%--
    <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends13") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends14") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends15") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends16") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends17") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends18") %></font></span></td>
			
    </tr>
     --%></table>
    
</form>
</body>
<script type="text/javascript">

function doPrint(){
	window.print();
}
</script>
 <script language="VBScript">
    // ���ⵯ����ȫ������˵����Internetѡ��=����ȫ=�������ε�վ�� 
    // 1.����վ����������վ�㣬
    // 2.�Զ��弶���� ���� ��û�б��Ϊ��ȫ��ActiveX�ؼ����г�ʼ���ͽű�����    

    dim hkey_root,hkey_path,hkey_key
    hkey_root="HKEY_CURRENT_USER"
    hkey_path="\Software\Microsoft\Internet Explorer\PageSetup"
    
    dim oldheader,oldfooter     
    
    '//������ҳ��ӡ��ҳüҳ�ţ���������
    function pagesetup_set(header,footer)
        on error resume next
        Set RegWsh = CreateObject("WScript.Shell")
        hkey_key="\header"          
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,header
        hkey_key="\footer"
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,footer
        
        
        hkey_key="\margin_left" '��
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,"0.73"
        hkey_key="\margin_right" '��
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,"0.70"
        hkey_key="\margin_top" '��
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,"1.1"
        hkey_key="\margin_bottom" '��
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,"1"
        
    end function
    '//������ҳ��ӡ��ҳüҳ��,��������ΪĬ��ֵ
    function pagesetup_default()
        on error resume next
        Set RegWsh = CreateObject("WScript.Shell")
        hkey_key="\header"    
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,"&w&bҳ�룬&p/&P"
        hkey_key="\footer"
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,"&u&b&d"
        
        hkey_key="\margin_left" '��
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,"0.75"     '(��Ӧ 19.05����)
        hkey_key="\margin_right" '��
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,"0.75"
        hkey_key="\margin_top" '��
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,"0.75"
        hkey_key="\margin_bottom" '��
        RegWsh.RegWrite hkey_root+hkey_path+hkey_key,"0.75"        
    end function
    
    '//��ʾҳ������
    function pagesetup_get()
        on error resume next
        Set RegWsh = CreateObject("WScript.Shell")
        hkey_key="\header"    
        oldheader=RegWsh.RegRead(hkey_root+hkey_path+hkey_key)
        hkey_key="\footer"
        oldfooter=RegWsh.RegRead(hkey_root+hkey_path+hkey_key)
        
        'hkey_key="\margin_left" '��
        'message = message & "��:" & RegWsh.RegRead( hkey_root+hkey_path+hkey_key) & vbCrLf
        'hkey_key="\margin_right" '��
        'message = message & "��:" & RegWsh.RegRead( hkey_root+hkey_path+hkey_key) & vbCrLf
        'hkey_key="\margin_top" '��
        'message = message & "��:" & RegWsh.RegRead( hkey_root+hkey_path+hkey_key) & vbCrLf
        'hkey_key="\margin_bottom" '��
        'message = message & "��:" & RegWsh.RegRead( hkey_root+hkey_path+hkey_key) & vbCrLf
        '
        'msgbox (message)
    end function    
    
    function printPage()
		on error resume next
		pagesetup_get()         '��ȡ��ֵ
		header=""
		footer=""		
		pagesetup_get()
		pagesetup_set header, footer
		divButton.style.display = "none"
		accountButton.style.display="none"

    	        window.print()
		pagesetup_set oldheader, oldfooter            '�ָ�����

    end function
</script>  
</html>