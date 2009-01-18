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
  
<title>趸售表本</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>趸售表本</title>
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
			<td class=title0 colspan="22"><B>趸售表本</B></td>
		</tr>
		<tr>
		<td colspan="7" rowspan="1" align="center"><%=(String)request.getAttribute("date") %>年&nbsp;&nbsp;包头农电公司电力抄表计费卡</td>
		<td nowrap align="center"><span class="title">本表内有块表</span></td><td nowrap ><span class="title">&nbsp</span></td>
		<td nowrap align="center"><span class="title">本表有块套表</span></td><td nowrap ><span class="title">&nbsp</span></td>
		</tr>

    <tr>
      
      
      		
            <td nowrap align="center"><span class="title">户号</span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleUserInfoDto.getUserNo()%></span></td>
			<td nowrap align="center"><span class="title">户名</span></td>
			<td nowrap align="center"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			<td nowrap align="center"><span class="title">变压器产权</span></td>
			<td nowrap align="center"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			<td nowrap align="center"><span class="title" >容量</span></td>
			<td nowrap align="center"  colspan="4"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
 
    </tr>
    <tr>
   
           <td nowrap align="center"><span class="title">线路</span></td>
			<td nowrap align="center"><span class="title"><%=lwWholeSaleUserInfoDto.getUserNo()%>有功</span></td>
			<td nowrap align="center"><span class="title">地址</span></td>
			<td nowrap align="center"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			<td nowrap align="center"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			<td nowrap align="center"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			<td nowrap align="center"><span class="title">变损</span></td>
			<td nowrap align="center"  colspan="4"><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>

    </tr>
     <tr>
   
            <td nowrapn rowspan="4" align="center"><span class="title">电能表</span></td>
			<td nowrap align="center"><span class="title">相</span></td>
			<td nowrap align="center"><span class="title">电压</span></td>
			<td nowrap align="center"><span class="title">安培</span></td>
			<td nowrap align="center"><span class="title">厂名</span></td>
			<td nowrap align="center"><span class="title">表号</span></td>
			<td nowrap align="center"><span class="title">级别</span></td>
			<td nowrap align="center"><span class="title">型号</span></td>
			<td nowrap align="center"><span class="title">色标</span></td>
			<td nowrap align="center"><span class="title">电压比</span></td>
			<td nowrap align="center"><span class="title">电流比</span></td>
			
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
            <td nowrap align="center"><span class="title">电价</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">工业电价</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">商业电价</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">居民</span></td>
			<td nowrap align="center"><span class="title">&nbsp</span></td>
			<td nowrap align="center"><span class="title">非居民</span></td>
			<td nowrap align="center" colspan="2"><span class="title">&nbsp</span></td>
    </tr>
    <tr>
            <td nowrap align="center"><span class="title">抄表月日</span></td>
			<td nowrap align="center"><span class="title">指示数</span></td>
			<td nowrap align="center"><span class="title">倍率</span></td>
			<td nowrap align="center"><span class="title">抄见电量</span></td>
			<td nowrap align="center"><span class="title">变损</span></td>
			<td nowrap align="center"><span class="title">线损</span></td>
			<td nowrap align="center" colspan="2"><span class="title">电量</span></td>
			<td nowrap align="center" colspan="3"><span class="title">电费合计</span></td>

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
   <td nowrap align="center" colspan=2><span class="title">总电量</span></td>
   <td nowrap align="center" colspan=3><span class="title"><%=sumPower%></span></td>
   <td nowrap align="center" colspan=2><span class="title">总电费</span></td>
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