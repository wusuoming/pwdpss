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
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwAmmeterChangeDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorBakDto"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>���۱�</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>���۱�</title>
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
		 Collection col=(List)request.getAttribute("col");
		 Collection colbak=(List)request.getAttribute("colbak");
		 Collection cola=(List)request.getAttribute("cola");
		  String date=(String)request.getAttribute("date");
		 LwWholeSaleUserInfoDto  lwWholeSaleUserInfoDto=(LwWholeSaleUserInfoDto)request.getAttribute("lwWholeSaleUserInfoDto");
		 String sumPower=request.getAttribute("sumPower").toString();
		 String sumFee=(String)request.getAttribute("sumFee");
		 BLLwWholeSaleSummaryFacade  blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		
		
%>
		   <table style='width:100%' border="1"  bordercolor="black" cellspacing="0">
		   <td style="display:none"><input type="hidden" name="StartMonth" value="<%=(String)request.getAttribute("date") %>"></td>
	<td style="display:none"><input type="hidden" name="LineCode" value="<%=(String)request.getAttribute("linecode") %>"></td>
	
  <tr class=listtitle align="center">
			<td class=title0 colspan="22"><B>���۱�</B></td>
		</tr>
		<tr>
		<td colspan="7" rowspan="1" align="center"><%=(String)request.getAttribute("date") %>��&nbsp;&nbsp;��ͷũ�繫˾��������Ʒѿ�</td>
		<td nowrap align="center"><span class="title">�������п��</span></td><td nowrap ><span class="title">&nbsp</span></td>
		<td nowrap align="center"><span class="title">�����п��ױ�</span></td><td nowrap ><span class="title">&nbsp</span></td>
		</tr>

    <tr>
      
      
      		
            <td nowrap align="center"><span class="title">����</span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleUserInfoDto.getUserNo()%></span></td>
			<td nowrap align="center"><span class="title">����</span></td>
			<td nowrap align="center"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			<td nowrap align="center"><span class="title">��ѹ����Ȩ</span></td>
			<td nowrap align="center"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			<td nowrap align="center"><span class="title" >����</span></td>
			<td nowrap align="center"  colspan="4"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
 
    </tr>
    <tr>
   
           <td nowrap align="center"><span class="title">��·</span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleUserInfoDto.getUserNo()%>�й�</span></td>
			<td nowrap align="center"><span class="title">��ַ</span></td>
			<td nowrap align="center"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			<td nowrap align="center"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			<td nowrap align="center"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			<td nowrap align="center"><span class="title">����</span></td>
			<td nowrap align="center"  colspan="4"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>

    </tr>
     <tr>
   
            <td nowrapn rowspan="4" align="center"><span class="title">���ܱ�</span></td>
			<td nowrap align="center"><span class="title">��</span></td>
			<td nowrap align="center"><span class="title">��ѹ</span></td>
			<td nowrap align="center"><span class="title">����</span></td>
			<td nowrap align="center"><span class="title">����</span></td>
			<td nowrap align="center"><span class="title">���</span></td>
			<td nowrap align="center"><span class="title">����</span></td>
			<td nowrap align="center"><span class="title">�ͺ�</span></td>
			<td nowrap align="center"><span class="title">ɫ��</span></td>
			<td nowrap align="center"><span class="title">��ѹ��</span></td>
			<td nowrap align="center"><span class="title">������</span></td>
			
    </tr>
  
    
    
    
    
    
   
    
    <tr>
			<%
			Iterator ita=cola.iterator();
			
			while(ita.hasNext()){
			LwAmmeterChangeDto lwAmmeterChangeDto=(LwAmmeterChangeDto)ita.next();
			 %>
			<td nowrap align="center"><span class="title">&nbsp;<%=lwAmmeterChangeDto.getAmmeterX()%></span></td>
			<td nowrap align="center"><span class="title">&nbsp;<%=lwAmmeterChangeDto.getAmmeterV()%></span></td>
			<td nowrap align="center"><span class="title">&nbsp;<%=lwAmmeterChangeDto.getAmmeterA()%></span></td>
			<td nowrap align="center"><span class="title">&nbsp;<%=lwAmmeterChangeDto.getFactoryName()%></span></td>
			<td nowrap align="center"><span class="title">&nbsp;<%=lwAmmeterChangeDto.getAmmeterNo()%></span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp;<%=lwAmmeterChangeDto.getAmmeterType()%></span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp;<%=lwAmmeterChangeDto.getCt()%></span></td>
			<td nowrap align="center"><span class="title">&nbsp;<%=lwAmmeterChangeDto.getPt()%></span></td>
			
<%} %>
			</tr>
			
			<tr >
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>	
						
			</tr>
			<tr >
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>	
			</tr>
    <tr>
            <td nowrap align="center"><span class="title">���</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">��ҵ���</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">��ҵ���</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">����</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">�Ǿ���</span></td>
			<td nowrap align="center" colspan="2"><span class="title">&nbsp</span></td>
    </tr>
    <tr>
            <td nowrap align="center"><span class="title">��������</span></td>
			<td nowrap align="center"><span class="title">ָʾ��</span></td>
			<td nowrap align="center"><span class="title">����</span></td>
			<td nowrap align="center"><span class="title">��������</span></td>
			<td nowrap align="center"><span class="title">����</span></td>
			<td nowrap align="center"><span class="title">����</span></td>
			<td nowrap align="center" colspan="2"><span class="title">����</span></td>
			<td nowrap align="center" colspan="3"><span class="title">��Ѻϼ�</span></td>

    </tr>
    <%
    		Iterator it=col.iterator();
    		while(it.hasNext()){
    		LwWholeSaleIndicatorDto  lwWholeSaleIndicatorDto=(LwWholeSaleIndicatorDto)it.next();
    		String conditions=" 1=1 and lineCode='"+lwWholeSaleIndicatorDto.getUserNo()+"' and StatMonth like ' "+date+"%'";
    		System.out.println("conditions=="+conditions);
    		Collection colfee=blLwWholeSaleSummaryFacade.findByConditions(conditions);
    		LwWholeSaleSummaryDto  lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
    			Iterator itfee=colfee.iterator();
    			while(itfee.hasNext()){
    			  lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)itfee.next();
    			}
     %>
     <tr>
   
           	<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorDto.getStatMonth()%></span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorDto.getThisWorkNum()%></span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorDto.getRate()%></span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorDto.getWorkQuantity()%></span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorDto.getTransLossQuantity()%></span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorDto.getLineLossQuantity()%></span></td>
			<td nowrap align="center" colspan="2"><span class="title"><%=lwWholeSaleSummaryDto.getElectricQuantity()%></span></td>
			<td nowrap align="center" colspan="3"><span class="title"><%=lwWholeSaleSummaryDto.getSumFee()%></span></td>
			
    </tr>
<%} %>


 <%
    		Iterator itbak=colbak.iterator();
    		while(itbak.hasNext()){
    		LwWholeSaleIndicatorBakDto  lwWholeSaleIndicatorBakDto=(LwWholeSaleIndicatorBakDto)itbak.next();
    		String conditions=" 1=1 and lineCode='"+lwWholeSaleIndicatorBakDto.getUserNo()+"'  and StatMonth like '"+date+"%'";;
    		System.out.println("conditions=="+conditions);
    		Collection colfee=blLwWholeSaleSummaryFacade.findByConditions(conditions);
    		LwWholeSaleSummaryDto  lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
    			Iterator itfee=colfee.iterator();
    			while(itfee.hasNext()){
    			  lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)itfee.next();
    			}
     %>
     <tr>
   
           	<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorBakDto.getStatMonth()%></span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorBakDto.getThisWorkNum()%></span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorBakDto.getRate()%></span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorBakDto.getWorkQuantity()%></span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorBakDto.getTransLossQuantity()%></span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleIndicatorBakDto.getLineLossQuantity()%></span></td>
			<td nowrap align="center" colspan="2"><span class="title"><%=lwWholeSaleSummaryDto.getElectricQuantity()%></span></td>
			<td nowrap align="center" colspan="3"><span class="title"><%=lwWholeSaleSummaryDto.getSumFee()%></span></td>
    </tr>
<%} %>
    <tr>
   <td nowrap align="center" colspan=2><span class="title">�ܵ���</span></td>
   <td nowrap align="center" colspan=3><span class="title"><%=sumPower%></span></td>
   <td nowrap align="center" colspan=2><span class="title">�ܵ��</span></td>
   <td nowrap align="center" colspan=4><span class="title"><%=sumFee%></span></td>
    </tr>
    
     </table>
    

</form>
</body>

<script language="javascript">

function doPrint(){
	window.print();
}
</script>
</html>