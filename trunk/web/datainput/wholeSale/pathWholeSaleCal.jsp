<%@ page contentType="text/html; charset=GBK"%>
<jsp:directive.page import="java.util.Collection"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto"/>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>����ָ���ʼ��¼��ҳ��</title>
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
   //��������͵ĺϳɺ���
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
    
       var strURL = "<%=request.getContextPath()%>/patchAndCal.do";
       fm.action = strURL;
	 fm.submit();
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
</head>
<body class=interface>
<html:errors />

<form  name="fm" method="post">
<table class=common width="100%" cellspacing="1" cellpadding="5">
	<tr>
		
<%
	List list1=(List)request.getAttribute("allPointer");
	LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto=new LwWholeSaleIndicatorDto();	
	lwWholeSaleIndicatorDto=(LwWholeSaleIndicatorDto)list1.get(0);
	
	 %>
          
            <td class="title">¼���·�</td>
            
             <td class="input" ><input name="inputdate" value="<%=lwWholeSaleIndicatorDto.getStatMonth()%>" ></td>
             <%
             if(lwWholeSaleIndicatorDto.getFlag().equals("ty")){
              %>
             <td class="input" >����<input name="comcode" value="ty" ></td>
             <%} %>
              <%
             if(lwWholeSaleIndicatorDto.getFlag().equals("gy")){
              %>
             <td class="input" >����<input name="comcode" value="gy" ></td>
             <%} %>
             
             <%
             if(lwWholeSaleIndicatorDto.getFlag().equals("dm")){
              %>
             <td class="input" >��ï<input name="comcode" value="dm" ></td>
             <%} %>
             <%
             if(lwWholeSaleIndicatorDto.getFlag().equals("jy")){
              %>
             <td class="input" >��ԭ<input name="comcode" value="jy" ></td>
             <%} %>
	</tr>
	</table>
	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=class=title0 colspan="19" width="100%"><span class="title"><B><font size="3">���۳������ҳ��</font></B></span></td>
		</tr>
	
	<!--�������ʱ��ʾ������·����������(����)-->
	
	
		<tr class=listtitle>
			<td nowrap><span class="title">��·���� </span></td>
			<td nowrap><span class="title">�����й�ָ�� </span></td>
			<td nowrap><span class="title">�����й�ָ��</span></td>
			<td nowrap><span class="title">�����޹�ָ��</span></td>
			<td nowrap><span class="title">�����޹�ָ��</span></td>
			<td nowrap><span class="title">����</span></td>
			<td nowrap><span class="title">��������</span></td>
			<td nowrap><span class="title">�й�����	</span></td>
			<td nowrap><span class="title">�޹�����</span></td>
			<td nowrap><span class="title">������� %</span></td>
			<td nowrap><span class="title">�������</span></td>
			<td nowrap><span class="title">�й��������</span></td>
			<td nowrap><span class="title">�޹��������</span></td>
			<td nowrap><span class="title">������</span></td>
			<td nowrap><span class="title">�����й�����</span></td>
			<td nowrap><span class="title">�����޹�����</span></td>
			<%--<td nowrap><span class="title">��������</span></td>
			--%><td nowrap><span class="title">�˲��й�����</span></td>
			<td nowrap><span class="title">�˲��޹�����</span></td>
			<td nowrap><span class="title">��ע</span></td>
			
			
			
		</tr>
		
			<%--<tr class=oddrow>
				<td colspan="5" align="right"><img src="../../images/jia-jia.gif" border="0" align="absmiddle" name="img_DataPower_Insert" onclick="insertRow('DataPower')">
				</td>
			</tr>
		--%>
			 	<%
	List list2=(List)request.getAttribute("allPointer");
	
	Iterator it2=list2.iterator();
	while(it2.hasNext()){
	lwWholeSaleIndicatorDto=(LwWholeSaleIndicatorDto)it2.next();
	
	 %>
					<tr >
						<td class="input" ><input name="UserName" value="<%=lwWholeSaleIndicatorDto.getUserNo()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" ><input name="LastWorkNum" value="<%=lwWholeSaleIndicatorDto.getLastWorkNum()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						
						
						 <td class="input" ><input name="ThisWorkNum" value="<%=lwWholeSaleIndicatorDto.getThisWorkNum()%>" onblur="workpower()" style="width:65px"></td>
						
						<td class="input" ><input name="LastIdleNum" value="<%=lwWholeSaleIndicatorDto.getLastIdleNum()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						
						
					
						 <td class="input" ><input name="ThisIdleNum" value="<%=lwWholeSaleIndicatorDto.getThisIdleNum()%>" onblur="unworkpower()" style="width:65px"></td>
						
						
						<td class="input" ><input name="Rate" value="<%=Math.round(lwWholeSaleIndicatorDto.getRate())%>" style="width:65px"></td>
						<td class="input" ><input name="rateCode" value="<%=lwWholeSaleIndicatorDto.getPowerCode()%>" style="width:65px"></td>
						
						
						
						
						 <td class="input" ><input name="workQuantity" value="<%=lwWholeSaleIndicatorDto.getWorkQuantity()%>" style="width:65px"></td>
						
						
						
						 <td class="input" ><input name="unworkQuantity" value="<%=lwWholeSaleIndicatorDto.getUnworkQuantity()%>" style="width:65px"></td>
						
							 <%
						if(lwWholeSaleIndicatorDto.getLossRate()==0){
						 %>
						<td class="input" ><input name="LossRate" style="width:65px">%</td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="LossRate" value="<%=lwWholeSaleIndicatorDto.getLossRate()%>" style="width:65px">%</td>
						 <%} %>
						 <%
						if(lwWholeSaleIndicatorDto.getLineLossQuantity()==0){
						 %>
						<td class="input" ><input name="LineLossQuantity" style="width:65px"></td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="LineLossQuantity" value="<%=lwWholeSaleIndicatorDto.getLineLossQuantity()%>" style="width:65px"></td>
						 <%} %>
						
						 <%
						if(lwWholeSaleIndicatorDto.getTransLossQuantity()==0){
						 %>
						<td class="input" ><input name="TransLossQuantity" style="width:65px"></td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="TransLossQuantity" value="<%=lwWholeSaleIndicatorDto.getTransLossQuantity()%>" style="width:65px"></td>
						 <%} %>
						 <%
						if(lwWholeSaleIndicatorDto.getUnTransLossQuantity()==0){
						 %>
						<td class="input" ><input name="unTransLossQuantity" style="width:65px"></td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="unTransLossQuantity" value="<%=lwWholeSaleIndicatorDto.getUnTransLossQuantity()%>" style="width:65px"></td>
						 <%} %>
						<td class="input" align="center">
						<input name="differenceQuantity"
							value="<%=lwWholeSaleIndicatorDto.getDifferenceQuantity()%>"
							style="width:65px">
					</td>
					 
						
						<%
						if(lwWholeSaleIndicatorDto.getChgAmmeterQuantity()==0 ){
						 %>
						<td class="input" ><input name="ChgAmmeterQuantity" style="border:0" readonly="readonly" style="width:65px"></td>
						<%}
						else{
						 %>
						 <td class="input" ><input name="ChgAmmeterQuantity" value="<%=lwWholeSaleIndicatorDto.getChgAmmeterQuantity()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<%} %>
						<%
						if(lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity()==0 ){
						 %>
						<td class="input" ><input name="UnChgAmmeterQuantity" style="border:0" readonly="readonly" style="width:65px"></td>
						<%}
						else{
						 %>
						 <td class="input" ><input name="UnChgAmmeterQuantity" value="<%=lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity()%>" style="border:0" readonly="readonly" style="width:65px"></td>
						<%} %><%--
						 <%
						if(lwWholeSaleIndicatorDto.getExcepQuantity()==0){
						 %>
						<td class="input" ><input name="ExcepQuantity" style="width:65px"></td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="ExcepQuantity" value="<%=lwWholeSaleIndicatorDto.getExcepQuantity()%>" style="width:65px"></td>
						 <%} %>
						  --%><%
						if(lwWholeSaleIndicatorDto.getCompensateQuantity() ==0){
						 %>
						<td class="input" ><input name="CompensateQuantity" style="width:65px"></td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="CompensateQuantity" value="<%=lwWholeSaleIndicatorDto.getCompensateQuantity()%>" style="width:65px"></td>
						 <%} %>
						 	  <%
						if(lwWholeSaleIndicatorDto.getUnCompensateQuantity() ==0){
						 %>
						<td class="input" ><input name="UnCompensateQuantity" style="width:65px"></td>
						<%
						}
						else{
						 %>
						 <td class="input" ><input name="UnCompensateQuantity" value="<%=lwWholeSaleIndicatorDto.getUnCompensateQuantity()%>" style="width:65px"></td>
						 <%} %>
						
						
						 <td class="input" ><input name="Remark" value="<%=lwWholeSaleIndicatorDto.getRemark()%>" style="width:65px"></td>
						<td class="input" style="display: none"><input name="flag" type="hidden" value="<%=lwWholeSaleIndicatorDto.getFlag()%>" style="width:65px">
						                  
					<br></tr>
					<%} %>
		
	</table>
	<p><br>
	</p>
	<!-- ��ť����ʾ-->
<table cellpadding="0" cellspacing="0" width="100%">
<tr>
<td>  
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button
				name=button0 value="����" onclick="feeCal()"></td>
		
	</table>
	</td>

	</tr>
	</table>
</form>
</body>

<script language="javascript">
function feeCal(){
	fm.action="<%=request.getContextPath()%>/UIPathWholeSaleCal.do";
	fm.submit();
}
function workpower(){

var ThisWorkNum=fm.ThisWorkNum.value;

var LastWorkNum=fm.LastWorkNum.value;

var Rate=fm.Rate.value;
//if(ThisWorkNum = ""||ThisWorkNum = null){
	//ThisWorkNum="0";
//}
//if(LastWorkNum = ""||LastWorkNum = null){
	//LastWorkNum="0";
//}
//if(Rate = ""||Rate = null){
//	Rate="0";
//}
 //fm.workQuantity.value=(parseFloat(ThisWorkNum)-parseFloat(LastWorkNum))*parseFloat(Rate);

}
function unworkpower(){

//var ThisIdleNum=fm.ThisIdleNum.value;

//var LastIdleNum=fm.LastIdleNum.value;
//var Rate=fm.Rate.value;
//if(ThisIdleNum = ""||ThisIdleNum = null){
	//ThisIdleNum="0";
//}
//if(LastIdleNum = ""||LastIdleNum = null){
	//LastIdleNum="0";
//}
//if(Rate = ""||Rate = null){
//	Rate="0";
//}
 //fm.unworkQuantity.value=(parseFloat(ThisIdleNum)-parseFloat(LastIdleNum))*parseFloat(Rate);

}
</script>


</html>
