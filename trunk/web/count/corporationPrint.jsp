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
 <jsp:directive.page import="java.text.DecimalFormat"/>
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>��ҵ����</title>
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
		 LwCorporationSummaryDto corporation=(LwCorporationSummaryDto)request.getAttribute("LwCorporationSummaryDto2");
		 LwCoporationUserInfoDto lwCoporationUserInfoDto=(LwCoporationUserInfoDto)request.getAttribute("lwCoporationUserInfoDto");
		Collection col=(List)request.getAttribute("colpoint");
		String tax=(String)request.getAttribute("tax");
		DecimalFormat df = new DecimalFormat("###0.00");
		Collection colbak=(List)request.getAttribute("colpointbak");
		double unchangeunPointerQuantity = (Double)request.getAttribute("unchangeunPointerQuantity");
%>
		   <table width="100%" border="1" cellspacing="0" >
  <tr class=listtitle align="center" >
			<td class=title0 colspan="12"><B><font size="4">���㵥</font></B></td>
		</tr>
	<tr>
	<td nowrap colspan="2" >
						<span class="title"><font size="3">�·�:<%=corporation.getStatMonth()%></font></span>
					</td>
	</tr>
    <tr>
      
      
      <td style="display:none"><input type="hidden" name="LineCode" value="<%=corporation.getLineCode()%>"></td>
            <td style="display:none"><input type="hidden" name="StartMonth" value="<%=corporation.getStatMonth()%>"></td>
            <td nowrap ><span class="title"><font size="3">����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=lwCoporationUserInfoDto.getUserName()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=lwCoporationUserInfoDto.getUserNo()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">��ַ</font></span></td>
			<%
			if(lwCoporationUserInfoDto.getAddress().equals("")||lwCoporationUserInfoDto.getAddress()==null){
			 %>
			 <td nowrap colspan="2"><span class="title"><font size="3">&nbsp</font></span></td>
			 <%
			 }else{
			  %>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=lwCoporationUserInfoDto.getAddress()%></font></span></td>
 			<%} %>
    </tr>
    <tr>
   
            <td nowrap><span class="title"><font size="3">������</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=lwCoporationUserInfoDto.getAccountBank()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">˰��</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=lwCoporationUserInfoDto.getTaxNo()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�ʺ�</font></span></td>
			
			<%
			if(lwCoporationUserInfoDto.getAccountNo().equals("")||lwCoporationUserInfoDto.getAccountNo()==null){
			 %>
			 <td nowrap colspan="2"><span class="title"><font size="3">&nbsp</font></span></td>
			 <%
			 }else{
			  %>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=lwCoporationUserInfoDto.getAccountNo()%></font></span></td>
 			<%} %>

    </tr>
     <tr>
   
            <td nowrap><span class="title"><font size="3">��ҵ����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">��ҵ</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�����ѹ</font></span></td>
			<%
			if(lwCoporationUserInfoDto.getVoltage().equals("1")){
			 %>
			<td nowrap colspan="2"><span class="title"><font size="3">1</font></span></td>
			<%
			}
			 %>
			 <%
			if(lwCoporationUserInfoDto.getVoltage().equals("2")){
			 %>
			<td nowrap colspan="2"><span class="title"><font size="3">10</font></span></td>
			<%
			}
			 %>
			 <%
			if(lwCoporationUserInfoDto.getVoltage().equals("3")){
			 %>
			<td nowrap colspan="2"><span class="title"><font size="3">35</font></span></td>
			<%
			}
			 %>
			 <%
			if(lwCoporationUserInfoDto.getVoltage().equals("4")){
			 %>
			<td nowrap colspan="2"><span class="title"><font size="3">220</font></span></td>
			<%
			}
			 %>
			 <%
			if(lwCoporationUserInfoDto.getVoltage().equals("5")){
			 %>
			<td nowrap colspan="2"><span class="title"><font size="3">220����</font></span></td>
			<%
			}
			 %>
			
			<td nowrap colspan="2"><span class="title">������·</span></td>
			<%
			if(lwCoporationUserInfoDto.getLineNo().equals("")||lwCoporationUserInfoDto.getLineNo()==null){
			 %>
			 <td nowrap colspan="2"><span class="title"><font size="3">&nbsp</font></span></td>
			 <%
			 }else{
			  %>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=lwCoporationUserInfoDto.getLineNo()%></font></span></td>
 			<%} %>
    </tr>
  
    
    
    
    
    
   
    <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B><font size="3">�����Ϣ</B></td>
		</tr>
    <tr>
     <td nowrap><span class="title"><font size="3">��·���� </span></td>
			<td nowrap><span class="title"><font size="3">��� </font></span></td>
			<td nowrap><span class="title"><font size="3">���</font></span></td>
			<td nowrap><span class="title"><font size="3">����</font></span></td>
			<td nowrap><span class="title"><font size="3">�����й�</font></span></td>
			<td nowrap><span class="title"><font size="3">�����й�</font></span></td>
			<td nowrap><span class="title"><font size="3">�й�����</font></span></td>
			<td nowrap><span class="title"><font size="3">�����޹�</font></span></td>
			<td nowrap><span class="title"><font size="3">�����޹�</font></span></td>
			<td nowrap><span class="title"><font size="3">�޹�����</font></span></td>
			<td nowrap><span class="title"><font size="3">����ָʾ</font></span></td>
			

			</tr>
			<%
			if(corporation.getStatMonth().equals(PowerFeeCal.getCurrentBillMonth())){
			Iterator it=col.iterator();
			while(it.hasNext()){
			LwNewFactoryIndicatorDto lwFactoryIndicatorDto=(LwNewFactoryIndicatorDto)it.next();
			
			 %>
			<tr >
						<td><font size="3"><%=lwCoporationUserInfoDto.getLineNo()%></font></td>
						<td><font size="3"><%=lwFactoryIndicatorDto.getAmmeterNo()%></font></td>
						<%
						if(lwFactoryIndicatorDto.getAmmeterStyle().equals("0") ){
						 %>
						<td class="input" ><font size="3">��ҵ</font></td>
						<%} %>
						<%
						if(lwFactoryIndicatorDto.getAmmeterStyle().equals("1") ){
						 %>
						<td class="input" ><font size="3">�Ǿ�������</font></td>
						<%} %>
						
						<%
						if(lwFactoryIndicatorDto.getAmmeterStyle().equals("2") ){
						 %>
						<td class="input" ><font size="3">�ױ�</font></td>
						<%} %>
						<td class="input" ><font size="3"><%=Math.round(lwFactoryIndicatorDto.getRate())%></font></td>
						<td class="input" ><font size="3"><%=lwFactoryIndicatorDto.getLastWorkNum()%></font></td>
						
						
						 <td class="input" ><font size="3"><%=lwFactoryIndicatorDto.getThisWorkNum()%></font></td>
						
						 <td class="input" ><font size="3"><%=lwFactoryIndicatorDto.getWorkQuantity() %></font></td>
						<td class="input" ><font size="3"><%=lwFactoryIndicatorDto.getLastIdleNum()%></font></td>
						
						
					
						 <td class="input" ><font size="3"><%=lwFactoryIndicatorDto.getThisIdleNum()%></font></td>
						
						 <td class="input" ><font size="3"><%=lwFactoryIndicatorDto.getUnworkQuantity()%></font></td>
						<%
						if(lwFactoryIndicatorDto.getAmmeterStyle().equals("0") ){
						 %>
						<td class="input" ><font size="3"><%=corporation.getNeedPointer()%></font></td>
						
						<%} %>
						
			</tr>
			<%} 
			}else{
			
			
			Iterator itbak=colbak.iterator();
			while(itbak.hasNext()){
			LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto=(LwNewFactoryIndicatorBakDto)itbak.next();
			%>
			
			<tr >
						<td><font size="3"><%=lwCoporationUserInfoDto.getLineNo()%></font></td>
						<td><font size="3"><%=lwNewFactoryIndicatorBakDto.getAmmeterNo()%></font></td>
						<%
						if(lwNewFactoryIndicatorBakDto.getAmmeterStyle().equals("0") ){
						 %>
						<td class="input" ><font size="3">��ҵ</font></td>
						<%} %>
						<%
						if(lwNewFactoryIndicatorBakDto.getAmmeterStyle().equals("1") ){
						 %>
						<td class="input" ><font size="3">�Ǿ�������</font></td>
						<%} %>
						<%
						if(lwNewFactoryIndicatorBakDto.getAmmeterStyle().equals("2") ){
						 %>
						<td class="input" ><font size="3">�ױ�</font></td>
						<%} %>
						<td class="input" ><font size="3"><%=Math.round(lwNewFactoryIndicatorBakDto.getRate())%></font></td>
						<td class="input" ><font size="3"><%=lwNewFactoryIndicatorBakDto.getLastWorkNum()%></font></td>
						
						
						 <td class="input" ><font size="3"><%=lwNewFactoryIndicatorBakDto.getThisWorkNum()%></font></td>
						
						 <td class="input" ><font size="3"><%=lwNewFactoryIndicatorBakDto.getWorkQuantity() %></font></td>
						<td class="input" ><font size="3"><%=lwNewFactoryIndicatorBakDto.getLastIdleNum()%></font></td>
						
						
					
						 <td class="input" ><font size="3"><%=lwNewFactoryIndicatorBakDto.getThisIdleNum()%></font></td>
						
						 <td class="input" ><font size="3"><%=lwNewFactoryIndicatorBakDto.getUnworkQuantity()%></font></td>
						<%
						if(lwNewFactoryIndicatorBakDto.getAmmeterStyle().equals("0") ){
						
						 %>
						<td class="input" ><font size="3"><%=corporation.getNeedPointer()%></font></td>
						
						<%} %>
						<%
						if(lwNewFactoryIndicatorBakDto.getAmmeterStyle().equals("1") ){
						
						 %>
						<td class="input" ><font size="3">&nbsp</font></td>
						
						<%} %>
						
			</tr>
			<%
			}}
			 %>
    
  


    <tr>
      
      
     
        
            <td nowrap><span class="title"><font size="3">�й�����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=corporation.getLineLoss()%></font></span></td>
			<td nowrap><span class="title"><font size="3">�޹�����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=corporation.getUnLineLoss()%></font></span></td>
			<td nowrap><span class="title"><font size="3">�й�����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=corporation.getLossQuantity()%></font></span></td>
			<td nowrap><span class="title"><font size="3">�޹�����</font></span></td>
			<td nowrap><span class="title"><font size="3"><%=corporation.getUnLossQuantity()%></font></span></td>
 
    </tr>
    <tr>
   
            <td nowrap><span class="title"><font size="3">�˲��й�����</font></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
			<td nowrap><span class="title"><font size="3">��������·������</font></span></td>
			<td nowrap colspan="2"><span class="title"><input name="dd" value=""  style="width:65px"></span></td>
			<td nowrap><span class="title"><font size="3">�˲��޹�����</font></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ee" value=""  style="width:65px"></span></td>
			<td nowrap><span class="title"><font size="3">���й�����</font></span></td>
			<td nowrap><span class="title"><font size="3"><%=Math.round(corporation.getElectricQuantity())%></font></span></td>

    </tr>
     <tr>
   
           <td nowrap><span class="title"><font size="3">�޹��ܵ���</font></span></td>
			<%if(corporation.getIfchange().equals("0")){ %>	
					<td nowrap colspan="2">
						<span class="title"><%=Math.round(corporation.getUnPointerQuantity())%>
						</span>
					</td>
					<%}else{ %>
						<td nowrap colspan="2">
						<span class="title"><%=Math.round(unchangeunPointerQuantity)%>
						</span>
					</td>
					<%} %>
			<td nowrap><span class="title"><font size="3">���ʱ�׼ֵ</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">0.90</font></span></td>
			<td nowrap><span class="title"><font size="3">����ʵ��ֵ</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=corporation.getAjustRate()%></font></span></td>
			<td nowrap><span class="title"><font size="3">���ʵ���ֵ</font></span></td>
			<td nowrap><span class="title"><font size="3"><%=corporation.getRateCode()%></font></span></td>
    </tr>
  
    <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B><font size="3">�����Ϣ</font></B></td>
		</tr>
    <tr>
    <tr>
      
      
     
        
            <td nowrap><span class="title"><font size="3">��Ŀ</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">����</font></span></td>
			<td nowrap><span class="title"><font size="3">���</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">���</font></span></td>
			 <td nowrap><span class="title"><font size="3">��Ŀ</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">����</font></span></td>
			<td nowrap><span class="title"><font size="3">���</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">���</font></span></td>
 
    </tr>
    <tr>
   
            <td nowrap><span class="title"><font size="3">��ҵ</font></span></td>
            <%
            if(corporation.getQuantityStyle().equals("")&&corporation.getIfchange().equals("0")){
       
             %>
             <td nowrap colspan="2"><span class="title"><font size="3"><%=Math.round(corporation.getPointerQuantity())%></font></span></td>
              <td nowrap><span class="title"><font size="3"><%=corporation.getPointerPrice()%></font></span></td>
            	 <td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getPointerFee())%></font></span></td>
             <%} %>
             <%
              if(corporation.getQuantityStyle().equals("1")&&corporation.getIfchange().equals("0")){
          
              %>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=Math.round(corporation.getPeakQuantity())%></font></span></td>
			<td nowrap><span class="title"><font size="3"><%=corporation.getPeakPrice()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getPeakFee())%></font></span></td>
			<%} %>
			<%
              if(corporation.getIfchange().equals("1")){
              %>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=Math.round(corporation.getBeforPower())%></font></span></td>
			<td nowrap><span class="title"><font size="3"><%=corporation.getBeforPrice()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getBeforFee())%></font></span></td>
			<%} %>
			
			<td nowrap><span class="title"><font size="3">�Ǿ�������</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=Math.round(corporation.getUnDenizenQuantity())%></font></span></td>
			<td nowrap><span class="title"><font size="3"><%=corporation.getUnDenizenPrice()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getUnDenizenFee())%></font></span></td>

    </tr>
     <tr>
   
           <td nowrap><span class="title"><font size="3">��Ͽ����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=Math.round(corporation.getElectricQuantity())%></font></span></td>
			<td nowrap><span class="title"><font size="3"><%=corporation.getSanXiaPrice()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getSanXiaFee())%></font></span></td>
			<td nowrap><span class="title"><font size="3">����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=Math.round(corporation.getElectricQuantity())%></font></span></td>
			<td nowrap><span class="title"><font size="3"><%=corporation.getSurchargePrice()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getSurcharge())%></font></span></td>
    </tr>
    <tr>
   
           <td nowrap><span class="title"><font size="3">���</font></span></td>
           <%if("20699999069".equals(corporation.getLineCode())){%>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=corporation.getLastPower()+corporation.getTaobiaoQuantity()+corporation.getUnDenizenQuantity()%></font>
						</span>
					</td>
					<%}else{ %>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=Math.round(corporation.getElectricQuantity())%></font>
						</span>
					</td>
					<%} %>
			
			<td nowrap><span class="title"><font size="3"><%=corporation.getPowerPrice()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getPowerFee())%></font></span></td>
			<%
              if(corporation.getIfchange().equals("1")){
              %>
			<td nowrap><span class="title"><font size="3">��ҵ</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=Math.round(corporation.getLastPower()+corporation.getTaobiaoQuantity())%></font></span></td>
			<td nowrap><span class="title"><font size="3"><%=corporation.getLastPrice()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getLastFee()+corporation.getTaobiaoFee())%></font></span></td>
    	<%} %>
    		<%
					if (corporation.getIfchange().equals("0")) {
					 String taoBiaoName = corporation.getTaobiaoName() ;
					  if(!"".equals(taoBiaoName)){
					%>
					
					<td nowrap colspan="1">
						<span class="title"><font size="3"><%=corporation.getTaobiaoName() %></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=corporation.getTaobiaoQuantity() %></font></span>
					</td>
					<td nowrap>
						<span class="title"><font size="3"><%=corporation.getTaobiaoPrice() %></font></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"><font size="3"><%=corporation.getTaobiaoFee() %></font></span>
					</td>
					<%
					}else{%>
						<td nowrap colspan="1">
						<span class="title"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"></span>
					</td>
					<td nowrap>
						<span class="title"></span>
					</td>
					<td nowrap colspan="2">
						<span class="title"></span>
					</td>
					<% }}
					%>
    </tr>
  
     <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B><font size="3">�ϼ���Ϣ</font></B></td>
		</tr>
    <tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3">����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=Math.round(corporation.getContentQuantity())%></font></span></td>
			<td nowrap><span class="title"><font size="3">�������</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=corporation.getContentPrice()%></font></span></td>
			<td nowrap colspan="2"><span class="title" colspan="2"><font size="3">�������</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getContentFee())%></font></span></td>
			
    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3">����</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=Math.round(corporation.getNeedQuantity())%></font></span></td>
			<td nowrap><span class="title"><font size="3">�������</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=corporation.getNeedPrice()%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�������</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getNeedFee())%></font></span></td>
			
    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3">���ʵ��</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=corporation.getPowerRateFee()%></font></span></td>
			<td nowrap><span class="title"><font size="3">˰</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=tax%></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3">�ʽ�ϼ�</font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=df.format(corporation.getSumFee())%></font></span></td>
			
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends1") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends2") %></font></span></td>
			<td nowrap><span class="title"><font size="3"><%=request.getAttribute("exends3") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends4") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends5") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends6") %></font></span></td>
			
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends7") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends8") %></font></span></td>
			<td nowrap ><span class="title"><font size="3"><%=request.getAttribute("exends9") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends10") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends11") %></font></span></td>
			<td nowrap colspan="2"><span class="title"><font size="3"><%=request.getAttribute("exends12") %></font></span></td>
			
    </tr>
     </table>
    
</form>
</body>
<script type="text/javascript" language="javascript">
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