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
		
%>
		   <table style='width:100%' border="1" cellspacing="0">
  <tr class=listtitle align="center">
			<td class=title0 colspan="11"><B>���㵥</B></td>
		</tr>
	<tr>
	<td nowrap colspan="2">
						<span class="title">�·�:<%=corporation.getStatMonth()%></span>
					</td>
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
			<td class=title0 colspan="12"><B>�����Ϣ</B></td>
		</tr>
    <tr>
     <td nowrap><span class="title">��·���� </span></td>
			<td nowrap><span class="title">��� </span></td>
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
						<td class="input" ><input name="Rate" value="<%=Math.round(lwFactoryIndicatorDto.getRate())%>"  style="width:65px"></td>
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
			<td nowrap><span class="title"><%=Math.round(corporation.getElectricQuantity())%></span></td>

    </tr>
     <tr>
   
           <td nowrap><span class="title">�޹��ܵ���</span></td>
			<td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getUnPointerQuantity())%></span></td>
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
             <td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getPointerQuantity())%></span></td>
              <td nowrap><span class="title"><%=corporation.getPointerPrice()%></span></td>
            	 <td nowrap colspan="2"><span class="title"><%=df.format(corporation.getPointerFee())%></span></td>
             <%} %>
             <%
              if(corporation.getQuantityStyle().equals("1")&&corporation.getIfchange().equals("0")){
          
              %>
			<td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getPeakQuantity())%></span></td>
			<td nowrap><span class="title"><%=corporation.getPeakPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=df.format(corporation.getPeakFee())%></span></td>
			<%} %>
			<%
              if(corporation.getIfchange().equals("1")){
              %>
			<td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getBeforPower())%></span></td>
			<td nowrap><span class="title"><%=corporation.getBeforPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=df.format(corporation.getBeforFee())%></span></td>
			<%} %>
			
			<td nowrap><span class="title">�Ǿ�������</span></td>
			<td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getUnDenizenQuantity())%></span></td>
			<td nowrap><span class="title"><%=corporation.getUnDenizenPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=df.format(corporation.getUnDenizenFee())%></span></td>

    </tr>
     <tr>
   
           <td nowrap><span class="title">��Ͽ����</span></td>
			<td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getElectricQuantity())%></span></td>
			<td nowrap><span class="title"><%=corporation.getSanXiaPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=df.format(corporation.getSanXiaFee())%></span></td>
			<td nowrap><span class="title">����</span></td>
			<td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getElectricQuantity())%></span></td>
			<td nowrap><span class="title"><%=corporation.getSurchargePrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=df.format(corporation.getSurchargePrice())%></span></td>
    </tr>
    <tr>
   
           <td nowrap><span class="title">���</span></td>
			<td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getElectricQuantity())%></span></td>
			<td nowrap><span class="title"><%=corporation.getPointerPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=df.format(corporation.getPowerFee())%></span></td>
			<%
              if(corporation.getQuantityStyle().equals("1")){
              %>
			<td nowrap><span class="title">��ҵ</span></td>
			<td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getLastPower())%></span></td>
			<td nowrap><span class="title"><%=corporation.getLastPrice()%></span></td>
			<td nowrap colspan="2"><span class="title"><%=df.format(corporation.getLastFee())%></span></td>
    	<%} %>
    				<%
              if(corporation.getIfchange().equals("0")){
              %>
			<td nowrap colspan="2"><span class="title"></span></td>
			<td nowrap><span class="title"></span></td>
			<td nowrap><span class="title"></span></td>
			<td nowrap colspan="2" >j<span class="title"></span></td>
    	<%} %>
    </tr>
  
     <tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>�ϼ���Ϣ</B></td>
		</tr>
    <tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title">����</span></td>
			<td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getContentQuantity())%></span></td>
			<td nowrap><span class="title">�������</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getContentPrice()%></span></td>
			<td nowrap colspan="2"><span class="title" colspan="2">�������</span></td>
			<td nowrap colspan="2"><span class="title"><%=df.format(corporation.getContentFee())%></span></td>
			
    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title">����</span></td>
			<td nowrap colspan="2"><span class="title"><%=Math.round(corporation.getNeedQuantity())%></span></td>
			<td nowrap><span class="title">�������</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getNeedPrice()%></span></td>
			<td nowrap colspan="2"><span class="title">�������</span></td>
			<td nowrap colspan="2"><span class="title"><%=df.format(corporation.getNeedFee())%></span></td>
			
    </tr>
     <tr>
   
           <td nowrap colspan="2"><span class="title">���ʵ��</span></td>
			<td nowrap colspan="2"><span class="title"><%=corporation.getPowerRateFee()%></span></td>
			<td nowrap><span class="title">˰</span></td>
			<td nowrap colspan="2"><span class="title"><%=tax%></span></td>
			<td nowrap colspan="2"><span class="title">�ʽ�ϼ�</span></td>
			<td nowrap colspan="2"><span class="title"><%=df.format(corporation.getSumFee())%></span></td>
			
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title"><input name="exends1" value="<%=request.getAttribute("exends1") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends2" value="<%=request.getAttribute("exends2") %>"  style="width:65px"></span></td>
			<td nowrap><span class="title"><input name="exends3" value="<%=request.getAttribute("exends3") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends4" value="<%=request.getAttribute("exends4") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends5" value="<%=request.getAttribute("exends5") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends6" value="<%=request.getAttribute("exends6") %>"  style="width:65px"></span></td>
			
    </tr>
    <tr>
   
           <td nowrap colspan="2"><span class="title"><input name=exends7 value="<%=request.getAttribute("exends7") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends8" value="<%=request.getAttribute("exends8") %>"  style="width:65px"></span></td>
			<td nowrap ><span class="title"><input name="exends9" value="<%=request.getAttribute("exends9") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends10" value="<%=request.getAttribute("exends10") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends11" value="<%=request.getAttribute("exends11") %>"  style="width:65px"></span></td>
			<td nowrap colspan="2"><span class="title"><input name="exends12" value="<%=request.getAttribute("exends12") %>"  style="width:65px"></span></td>
			
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