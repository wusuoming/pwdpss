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
		   <table style='width:80%' border="1" cellspacing="0">
  <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>���۽��㵥</B></td>
				<td nowrap colspan="2" style="display: none"><span class="title"><input name="company" value="<%=company%>"  style="width:65px"></span></td>
				<td nowrap colspan="2" style="display: none"><span class="title"><input name="inputDate" value="<%=statMonth%>"  style="width:65px"></span></td>
				
		</tr>
		<tr>
				<td nowrap colspan="2">
						<span class="title">�·�:<%=statMonth%></span>
					</td>
				</tr>

    <tr >
      
      

        
            <td nowrap colspan="2" ><span class="title">����</span></td>
            
            <%
            if(company.equals("gy")){
             %>
			<td nowrap colspan="2" ><span class="title">����ũ���</span></td>
			<%} %>
			 <%
            if(company.equals("dm")){
             %>
			<td nowrap colspan="2" width="50%"><span class="title">��ïũ���</span></td>
			<%} %>
			 <%
            if(company.equals("jy")){
             %>
			<td nowrap colspan="2" ><span class="title">��ԭũ���</span></td>
			<%} %>
			 <%
            if(company.equals("ty")){
             %>
			<td nowrap colspan="2" ><span class="title">����ũ���</span></td>
			<%} %>
			<td nowrap colspan="2"><span class="title">����</span></td>
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
			<td nowrap colspan="2"><span class="title">��ַ</span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value=""  style="width:65px"></span></td>

    </tr>
    <tr>
   
            <td nowrap colspan="2"><span class="title">������</span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">˰��</span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">�ʺ�</span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value=""  style="width:65px"></span></td>

    </tr>
     <tr>
   
            <td nowrap colspan="2"><span class="title">��ҵ����</span></td>
			<td nowrap colspan="2"><span class="title">����</span></td>
			<td nowrap colspan="2"><span class="title">�����ѹ</span></td>
			
			<td nowrap colspan="2"><span class="title">10KV , 35KV</span></td>
	
			
			<td nowrap colspan="2"><span class="title">������·</span></td>
			<td nowrap colspan="2"><span class="title"></span></td>

    </tr>
    <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>�����Ϣ</B></td>
		</tr>
      <tr>
     <td nowrap><span class="title">��·���� </span></td>
			<td nowrap><span class="title">��� </span></td>
			<td nowrap><span class="title">���</span></td>
			<td nowrap><span class="title">�Ʒ����</span></td>
			<td nowrap><span class="title">����</span></td>
			<td nowrap><span class="title">�����й�</span></td>
			<td nowrap><span class="title">�����й�</span></td>
			<td nowrap><span class="title">�й�����</span></td>
			<td nowrap><span class="title">�����޹�</span></td>
			<td nowrap><span class="title">�����޹�	</span></td>
			<td nowrap><span class="title">�޹�����</span></td>
			<td nowrap><span class="title">��������</span></td>
			

			</tr>
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
						<td  ><%=lwWholeSaleIndicatorDto.getUserNo()%></td>
						<td  ><input name="ammeterNo" value="<%=lwAmmeterChangeDto.getAmmeterNo()%>"  readonly="readonly" style="width:65px"></td>
						<%
						if(lwWholeSaleUserInfoDto.getIfCal().equals("0") ){
						 %>
						<td class="input" ><input name="ammeterStyle" value="�ܱ�"  readonly="readonly" style="width:65px"></td>
						<%} %>
						<%
						if(lwWholeSaleUserInfoDto.getIfCal().equals("1") ){
						 %>
						<td class="input" ><input name="ammeterStyle" value="���˱�"  readonly="readonly" style="width:65px"></td>
						<%} %>
						<td class="input" ><input name="Rate" value="<%=lwWholeSaleUserInfoDto.getVoltage()%>KV����"  style="width:65px" readonly="readonly"></td>
						<td class="input" ><input name="Rate" value="<%=Math.round(lwWholeSaleIndicatorDto.getRate())%>"  style="width:65px" readonly="readonly"></td>
						<td class="input" ><input name="LastWorkNum" value="<%=lwWholeSaleIndicatorDto.getLastWorkNum()%>"  readonly="readonly" style="width:65px"></td>
						
						
						 <td class="input" ><input name="ThisWorkNum" value="<%=lwWholeSaleIndicatorDto.getThisWorkNum()%>" readonly="readonly"  style="width:65px"></td>
						
						 <td class="input" ><input name="workQuantity" value="<%=lwWholeSaleIndicatorDto.getWorkQuantity() %>" readonly="readonly" style="width:65px"></td>
						<td class="input" ><input name="LastIdleNum" value="<%=lwWholeSaleIndicatorDto.getLastIdleNum()%>"  readonly="readonly" style="width:65px"></td>
						
						
					
						 <td class="input" ><input name="ThisIdleNum" value="<%=lwWholeSaleIndicatorDto.getThisIdleNum()%>"  readonly="readonly" style="width:65px"></td>
						
						 <td class="input" ><input name="workQuantity" value="<%=lwWholeSaleIndicatorDto.getUnworkQuantity()%>"  readonly="readonly" style="width:65px"></td>
						<td class="input" ><input name="workQuantity" value="<%=lwWholeSaleIndicatorDto.getPowerCode()%>"  readonly="readonly" style="width:65px"></td>
						
			</tr>
			<%} %>

    


    <tr>
      
      
     
        
            <td nowrap colspan="2"><span class="title" >�й�����</span></td>
			<td nowrap ><span class="title"><%=trassLoss%></span></td>
			<td nowrap colspan="2"><span class="title">�޹�����</span></td>
			<td nowrap ><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">�й�����</span></td>
			<td nowrap ><span class="title"><%=lineLoss%></span></td>
			<td nowrap colspan="2"><span class="title">�޹�����</span></td>
			<td nowrap ><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
 
    </tr>
    <tr>
   
            <td nowrap colspan="2"><span class="title">�˲��й�����</span></td>
			<td nowrap><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">��������·������</span></td>
			<td nowrap><span class="title"><input name="dd" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">�˲��޹�����</span></td>
			<td nowrap><span class="title"><input name="ee" value=""  style="width:65px"></span></td>
								<td nowrap colspan="2"><span class="title">���й�����</span></td>
			<td nowrap><span class="title"><input name="zongdianliang" value="<%=Math.round(Double.parseDouble(sumPower))%>"  style="width:65px"></span></td>

    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title">�޹��ܵ���</span></td>
			<td nowrap ><span class="title"><%=Math.round(Double.parseDouble(unsumPower))%></span></td>
			<td nowrap colspan="2"><span class="title">���ʱ�׼ֵ</span></td>
			<td nowrap><span class="title">0.80</span></td>
			<td nowrap colspan="2"><span class="title">����ʵ��ֵ</span></td>
			<td nowrap><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">���ʵ���ֵ</span></td>
			<td nowrap><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
    </tr>
   
    <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>�����Ϣ</B></td>
		</tr>
    <tr>
    <tr>
      
      
     
        
            <td nowrap colspan="2"><span class="title">��Ŀ</span></td>
			<td nowrap ><span class="title">����</span></td>
			<td nowrap "><span class="title">���</span></td>
			<td nowrap colspan="2"><span class="title">���</span></td>
			 <td nowrap colspan="2"><span class="title">��Ŀ</span></td>
			<td nowrap ><span class="title">����</span></td>
			<td nowrap ><span class="title">���</span></td>
			<td nowrap colspan="2"><span class="title">���</span></td>
 
    </tr>
    <tr>

					<td nowrap colspan="2">
						<span class="title">�Ǿ�������/10KV</span>
					</td>

					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(indecisivePower10))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=indecisivePrice10%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=indecisiveFee10%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title">�Ǿ�������/35KV</span>
					</td>

					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(indecisivePower35))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=indecisivePrice35%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=indecisiveFee35%></span>
					</td>

					
				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">��������/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(residentPower10))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=residentPrice10%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=residentFee10%></span>
					</td>
					
					<td nowrap colspan="2">
						<span class="title">��������/35KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(residentPower35))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=residentPrice35%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=residentFee35%></span>
					</td>
					
					
					
				</tr>
				<tr>

					<td nowrap colspan="2">
						<span class="title">ũҵ����/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(producePower10))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=producePrice10%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=produceFee10%></span>
					</td>
					
					<td nowrap colspan="2">
						<span class="title">ũҵ����/35KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(producePower35))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=producePrice35%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=produceFee35%></span>
					</td>
					
				</tr>


				<tr>
				<td nowrap colspan="2">
						<span class="title">���չ�ҵ/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(industryPower10))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=industryPrice10%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=industryFee10%></span>
					</td>
				
					


					<td nowrap colspan="2">
						<span class="title">���չ�ҵ/35KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(industryPower35))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=industryPrice35%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=industryFee35%></span>
					</td>

				</tr>
				<tr>
						<td nowrap colspan="2">
						<span class="title">ũҵ�Ź�/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(agriculturalPower10))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=agriculturalPrice10%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title" ><%=agriculturalFee10%></span>
					</td>
					
					<td nowrap colspan="2">
						<span class="title">ũҵ�Ź�/35KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(agriculturalPower35))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=agriculturalPrice35%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=agriculturalFee35%></span>
					</td>
				</tr>
				<tr>

					
					<td nowrap colspan="2">
						<span class="title">��ҵ/10KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(businessPower10))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=businessPrice10%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=businessFee10%></span>
					</td>
					<td nowrap colspan="2">
					
					
					
					
					
					
						<span class="title">��ҵ/35KV</span>
					</td>
					<td nowrap>
						<span class="title"><%=Math.round(Double.parseDouble(businessPower35))%></span>
					</td>
					<td nowrap>
						<span class="title"><%=businessPrice35%></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><%=businessFee35%></span>
					</td>
				</tr>

    
    			<tr>

					
					<td nowrap colspan="2">
						<span class="title">��10KV</span>
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
					
					
					
					
					
					
						<span class="title">��35KV</span>
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
   
            <td nowrap colspan="2"><span class="title">��Ͽ</span></td>
           
			<td nowrap><span class="title"><%=Math.round(Double.parseDouble(sanxiaPower))%></span></td>
			<td nowrap><span class="title">0.004</span></td>
			<td nowrap colspan="2"><span class="title"><input name="sanxia" value="<%=sanxiaFee%>"style="width:65px"></span></td>
			
			
			<td nowrap colspan="2"><span class="title">ũ������</span></td>
			<td nowrap><span class="title"><%=Math.round(Double.parseDouble(nongwanghaidaiPower))%></span></td>
			<td nowrap><span class="title">0.02</span></td>
			<td nowrap colspan="2"><span class="title"><input name="dianjin" value="<%=nongwanghaidaiFee%>"style="width:65px"></span></td>

    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title">��������</span></td>
			<td nowrap><span class="title"><%=Math.round(Double.parseDouble(kuquPower))%></span></td>
			<td nowrap><span class="title">0.0031</span></td>
			<td nowrap colspan="2"><span class="title"><input name="jijin1" value="<%=kuquFee%>"style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">��������Դ</span></td>
			<td nowrap><span class="title"><%=Math.round(Double.parseDouble(kezaishengpepolePower))%></span></td>
			<td nowrap><span class="title">0.001</span></td>
			<td nowrap colspan="2"><span class="title"><input name="jijin2" value="<%=kezaishengpepoleFee%>"style="width:65px"></span></td>
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title">��������Դ</span></td>
			<td nowrap><span class="title"><%=Math.round(Double.parseDouble(kezaishengnotpepolePower))%></span></td>
			<td nowrap><span class="title">0.002</span></td>
			<td nowrap colspan="2"><span class="title"><input name="jijin3" value="<%=kezaishengnotpepoleFee%>"style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title">�����</span></td>
			<td nowrap><span class="title"><input name="ss" value="<%=Math.round(Double.parseDouble(differenceQuantity))%>"  style="width:65px"></span></td>
			<td nowrap><span class="title"><input name="ss" value="<%=differencePrice%>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value="<%=differenceQuantityFee%>"  style="width:65px"></td>
    </tr>

     <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>�ϼ���Ϣ</B></td>
		</tr>
    <tr>
     <tr>
   			
           <td nowrap colspan="2"><span class="title">���ʵ��</span></td>
			<td nowrap colspan="2"><span class="title"><%=powerRateFee%></span></td>
			<td nowrap colspan="2"><span class="title">˰</span></td>
			<td nowrap colspan="2"><span class="title"><%=tax%></span></td>
			<td nowrap colspan="2"><span class="title">�ʽ�ϼ�</span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value="<%=sumAllFee%>"  style="width:65px"></span></td>
			
    </tr>
     
    <tr>
   
           <td nowrap colspan="2"><span class="title"><input name="exends1" value="����¯"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends2" value="<%=request.getAttribute("exends2") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends3" value="��ߵ��"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends4" value="<%=request.getAttribute("exends4") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends5" value="�㲥��"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends6" value="<%=request.getAttribute("exends6") %>"  style="width:65px"></span></td>
			
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title"><input name="exends7" value="�ܺϼ�"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends8" value="<%=request.getAttribute("exends8") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends9" value="<%=request.getAttribute("exends9") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends10" value="<%=request.getAttribute("exends10") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends11" value="<%=request.getAttribute("exends11") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends12" value="<%=request.getAttribute("exends12") %>"  style="width:65px"></span></td>
			
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title"><input name="exends13" value="<%=request.getAttribute("exends13") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends14" value="<%=request.getAttribute("exends14") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends15" value="<%=request.getAttribute("exends15") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends16" value="<%=request.getAttribute("exends16") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends17" value="<%=request.getAttribute("exends17") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends18" value="<%=request.getAttribute("exends18") %>"  style="width:65px"></span></td>
			
    </tr>
     </table>
    
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