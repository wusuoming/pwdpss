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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>��ҵ̨����Ϣ</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>��ҵ̨����Ϣ</title>
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

<body>
<form name="fm" method="post" action="">
 <%
		 LwCorporationSummaryDto corporation=(LwCorporationSummaryDto)request.getAttribute("LwCorporationSummaryDto2");
		 LwCoporationUserInfoDto lwCoporationUserInfoDto=(LwCoporationUserInfoDto)request.getAttribute("lwCoporationUserInfoDto");
		Collection col=(List)request.getAttribute("colpoint");
		String tax=(String)request.getAttribute("tax");
		
		
%>
		   <table style='width:100%' border="1" cellspacing="0">
  <tr class=listtitle align="center">
			<td class=title0 colspan="11"><B>���û�<%=corporation.getStatMonth()%>���㵥</B></td>
		</tr>

    <tr>
      
      
      <td style="display:none"><input type="hidden" name="LineCode" value="<%=corporation.getLineCode()%>"></td>
            <td style="display:none"><input type="hidden" name="StartMonth" value="<%=corporation.getStatMonth()%>"></td>
            <td nowrap ><span class="title">����</span></td>
			<td nowrap colspan="2"><span class="title"><%=lwCoporationUserInfoDto.getUserName()%></span></td>
			<td nowrap colspan="2"><span class="title">����</span></td>
			<td nowrap colspan="2"><span class="title"><%=lwCoporationUserInfoDto.getUserNo()%></span></td>
			<td nowrap colspan="2"><span class="title">��ַ</span></td>
			<td nowrap colspan="2"><span class="title"><%=lwCoporationUserInfoDto.getAddress()%></span></td>
 
    </tr>
    <tr>
   
            <td nowrap><span class="title">������</span></td>
			<td nowrap colspan="2"><span class="title"><%=lwCoporationUserInfoDto.getAccountBank()%></span></td>
			<td nowrap colspan="2"><span class="title">˰��</span></td>
			<td nowrap colspan="2"><span class="title"><%=lwCoporationUserInfoDto.getTaxNo()%></span></td>
			<td nowrap colspan="2"><span class="title">�ʺ�</span></td>
			<td nowrap colspan="2"><span class="title"><%=lwCoporationUserInfoDto.getAccountNo()%></span></td>

    </tr>
     <tr>
   
            <td nowrap><span class="title">��ҵ����</span></td>
			<td nowrap colspan="2"><span class="title">��ҵ</span></td>
			<td nowrap colspan="2"><span class="title">�����ѹ</span></td>
			<%
			if(lwCoporationUserInfoDto.getVoltage().equals("1")){
			 %>
			<td nowrap colspan="2"><span class="title">1</span></td>
			<%
			}
			 %>
			 <%
			if(lwCoporationUserInfoDto.getVoltage().equals("2")){
			 %>
			<td nowrap colspan="2"><span class="title">10</span></td>
			<%
			}
			 %>
			 <%
			if(lwCoporationUserInfoDto.getVoltage().equals("3")){
			 %>
			<td nowrap colspan="2"><span class="title">35</span></td>
			<%
			}
			 %>
			 <%
			if(lwCoporationUserInfoDto.getVoltage().equals("4")){
			 %>
			<td nowrap colspan="2"><span class="title">220</span></td>
			<%
			}
			 %>
			 <%
			if(lwCoporationUserInfoDto.getVoltage().equals("5")){
			 %>
			<td nowrap colspan="2"><span class="title">220����</span></td>
			<%
			}
			 %>
			
			<td nowrap colspan="2"><span class="title">������·</span></td>
			<td nowrap colspan="2"><span class="title"><%=lwCoporationUserInfoDto.getLineNo()%></span></td>

    </tr>
  
    
    
    
    
    
   
    <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>������Ϣ</B></td>
		</tr>
    <tr>
     <td nowrap><span class="title">��·���� </span></td>
			<td nowrap><span class="title">���� </span></td>
			<td nowrap><span class="title">���</span></td>
			<td nowrap><span class="title">����</span></td>
			<td nowrap><span class="title">�����й�</span></td>
			<td nowrap><span class="title">�����й�</span></td>
			<td nowrap><span class="title">�й�����</span></td>
			<td nowrap><span class="title">�����޹�</span></td>
			<td nowrap><span class="title">�����޹�	</span></td>
			<td nowrap><span class="title">�޹�����</span></td>
			<td nowrap><span class="title">����ָʾ</span></td>
			

			</tr>
			<%
			Iterator it=col.iterator();
			while(it.hasNext()){
			LwNewFactoryIndicatorDto lwFactoryIndicatorDto=(LwNewFactoryIndicatorDto)it.next();
			
			 %>
			<tr >
						<td  ><input name="lincode" value="<%=lwCoporationUserInfoDto.getLineNo()%>"  readonly="readonly" style="width:65px"></td>
						<td  ><input name="ammeterNo" value="<%=lwFactoryIndicatorDto.getAmmeterNo()%>"  readonly="readonly" style="width:65px"></td>
						<%
						if(lwFactoryIndicatorDto.getAmmeterStyle().equals("0") ){
						 %>
						<td class="input" ><input name="ammeterStyle" value="��ҵ"  readonly="readonly" style="width:65px"></td>
						<%} %>
						<%
						if(lwFactoryIndicatorDto.getAmmeterStyle().equals("1") ){
						 %>
						<td class="input" ><input name="ammeterStyle" value="�Ǿ�������"  readonly="readonly" style="width:65px"></td>
						<%} %>
						<td class="input" ><input name="Rate" value="<%=lwFactoryIndicatorDto.getRate()%>"  style="width:65px"></td>
						<td class="input" ><input name="LastWorkNum" value="<%=lwFactoryIndicatorDto.getLastWorkNum()%>"  readonly="readonly" style="width:65px"></td>
						
						
						 <td class="input" ><input name="ThisWorkNum" value="<%=lwFactoryIndicatorDto.getThisWorkNum()%>" onblur="workpower()"  style="width:65px"></td>
						
						 <td class="input" ><input name="workQuantity" value="<%=lwFactoryIndicatorDto.getWorkQuantity() %>" style="width:65px"></td>
						<td class="input" ><input name="LastIdleNum" value="<%=lwFactoryIndicatorDto.getLastIdleNum()%>"  readonly="readonly" style="width:65px"></td>
						
						
					
						 <td class="input" ><input name="ThisIdleNum" value="<%=lwFactoryIndicatorDto.getThisIdleNum()%>"  style="width:65px"></td>
						
						 <td class="input" ><input name="workQuantity" value="<%=lwFactoryIndicatorDto.getUnworkQuantity()%>"  style="width:65px"></td>
						<%
						if(lwFactoryIndicatorDto.getAmmeterStyle().equals("0") ){
						 %>
						<td class="input" ><input name="needPointer" value="<%=corporation.getNeedPointer()%>"  readonly="readonly" style="width:65px"></td>
						
						<%} %>
						
			</tr>
			<%} %>

    
  


    <tr>
      
      
     
        
            <td nowrap><span class="title">�й�����</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getLineLoss()%></span></td>
			<td nowrap><span class="title">�޹�����</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getUnLineLoss()%></span></td>
			<td nowrap><span class="title">�й�����</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getLossQuantity()%></span></td>
			<td nowrap><span class="title">�޹�����</span></td>
			<td nowrap><span class="title"><%=corporation.getUnLossQuantity()%></span></td>
 
    </tr>
    <tr>
   
            <td nowrap><span class="title">�˲��й�����</span></td>
			<td nowrap colspan="2"><span class="title"><input name="ss" value=""  style="width:65px"></span></td>
			<td nowrap><span class="title">��������·������</span></td>
			<td nowrap colspan="2"><span class="title"><input name="dd" value=""  style="width:65px"></span></td>
			<td nowrap><span class="title">�˲��޹�����</span></td>
			<td nowrap colspan="2"><span class="title"><input name="ee" value=""  style="width:65px"></span></td>
			<td nowrap><span class="title">���й�����</span></td>
			<td nowrap><span class="title"><%=corporation.getElectricQuantity()%></span></td>

    </tr>
     <tr>
   
           <td nowrap><span class="title">�޹��ܵ���</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getUnPointerQuantity()%></span></td>
			<td nowrap><span class="title">���ʱ�׼ֵ</span></td>
			<td nowrap colspan="2"><span class="title">0.90</span></td>
			<td nowrap><span class="title">����ʵ��ֵ</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getAjustRate()%></span></td>
			<td nowrap><span class="title">���ʵ���ֵ</span></td>
			<td nowrap><span class="title"><%=corporation.getRateCode()%></span></td>
    </tr>
  
    <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>�����Ϣ</B></td>
		</tr>
    <tr>
    <tr>
      
      
     
        
            <td nowrap><span class="title">��Ŀ</span></td>
			<td nowrap colspan="2"><span class="title">����</span></td>
			<td nowrap><span class="title">���</span></td>
			<td nowrap colspan="2"><span class="title">���</span></td>
			 <td nowrap><span class="title">��Ŀ</span></td>
			<td nowrap colspan="2"><span class="title">����</span></td>
			<td nowrap><span class="title">���</span></td>
			<td nowrap colspan="2"><span class="title">���</span></td>
 
    </tr>
    <tr>
   
            <td nowrap><span class="title">��ҵ</span></td>
            <%
            if(corporation.getQuantityStyle().equals("")&&corporation.getIfchange().equals("0")){
       
             %>
             <td nowrap colspan="2"><span class="title"><%=corporation.getPointerQuantity()%></span></td>
              <td nowrap><span class="title"><%=corporation.getPointerPrice()%></span></td>
            	 <td nowrap colspan="2"><span class="title"><%=corporation.getPointerFee()%></span></td>
             <%} %>
             <%
              if(corporation.getQuantityStyle().equals("1")&&corporation.getIfchange().equals("0")){
          
              %>
			<td nowrap colspan="2"><span class="title"><%=corporation.getPeakQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getPeakPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getPeakFee()%></span></td>
			<%} %>
			<%
              if(corporation.getIfchange().equals("1")){
              %>
			<td nowrap colspan="2"><span class="title"><%=corporation.getBeforPower()%></span></td>
			<td nowrap><span class="title"><%=corporation.getBeforPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getBeforFee()%></span></td>
			<%} %>
			
			<td nowrap><span class="title">�Ǿ�������</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getUnDenizenQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getUnDenizenPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getUnDenizenFee()%></span></td>

    </tr>
     <tr>
   
           <td nowrap><span class="title">��Ͽ����</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getElectricQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getSanXiaPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getSanXiaFee()%></span></td>
			<td nowrap><span class="title">����</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getElectricQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getSurchargePrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getSurchargePrice()%></span></td>
    </tr>
    <tr>
   
           <td nowrap><span class="title">���</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getElectricQuantity()%></span></td>
			<td nowrap><span class="title"><%=corporation.getPointerPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getPowerFee()%></span></td>
			<%
              if(corporation.getQuantityStyle().equals("1")){
              %>
			<td nowrap><span class="title">��ҵ</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getLastPower()%></span></td>
			<td nowrap><span class="title"><%=corporation.getLastPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getLastFee()%></span></td>
    	<%} %>
    				<%
              if(corporation.getIfchange().equals("0")){
              %>
			<td nowrap colspan="2"><span class="title"></span></td>
			<td nowrap><span class="title"></span></td>
			<td nowrap><span class="title"></span></td>
			<td nowrap colspan="2" ><span class="title"></span></td>
    	<%} %>
    </tr>
  
     <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>�ϼ���Ϣ</B></td>
		</tr>
    <tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title">����</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getContentQuantity()%></span></td>
			<td nowrap><span class="title">�������</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getContentPrice()%></span></td>
			<td nowrap colspan="2"><span class="title" colspan="2">�������</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getContentFee()%></span></td>
			
    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title">����</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getNeedQuantity()%></span></td>
			<td nowrap><span class="title">�������</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getNeedPrice()%></span></td>
			<td nowrap colspan="2"><span class="title">�������</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getNeedFee()%></span></td>
			
    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title">���ʵ��</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getPowerRateFee()%></span></td>
			<td nowrap><span class="title">˰</span></td>
			<td nowrap colspan="2"><span class="title"><%=tax%></span></td>
			<td nowrap colspan="2"><span class="title">�ʽ�ϼ�</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getSumFee()%></span></td>
			
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			<td nowrap><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			<td nowrap ><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="ThisIdleNum" value=""  style="width:65px"></span></td>
			
    </tr>
     </table>
    

</form>
</body>

<script language="javascript">

function printCount(){
	 var   strURL;     
  var a=fm.LineCode.value;
  var b=fm.StartMonth.value;
    
  strURL   =   "<%=request.getContextPath()%>/corporationprint.do?corporationName="+a+"&&inputDate="+b;     
    
  winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
	
	
}
</script>
</html>