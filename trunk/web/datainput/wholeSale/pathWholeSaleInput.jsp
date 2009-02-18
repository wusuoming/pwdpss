<%@ page contentType="text/html; charset=GBK"%>
<jsp:directive.page import="java.util.Collection" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto" />
<jsp:directive.page import="java.util.List" />
<jsp:directive.page import="java.util.Iterator" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto" />
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade"/>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html xhtml="true" locale="true">
	<head>
		<meta http-equiv=Content-Type content="text/html; charset=gb2312">

		<title>趸售指针初始化录入页面</title>
		<link rel="stylesheet" type="text/css" media="all"
			href="/mimessage/css/calendar.css" title="win2k-cold-1" />
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

		<script language="Javascript"
			src="/iacontact/common/pub/StaticJavascript.jsp"></script>
		<script language="Javascript"
			src="/iacontact/common/pub/StaticJavascript.jsp"></script>
		<!-- calendar stylesheet -->
		<link rel="stylesheet" type="text/css" media="all"
			href="../../../../iacontact/css/calendar-win2k-cold-1.css"
			title="win2k-cold-1" />

		<!-- main calendar program -->
		<script type="text/javascript"
			src="../../../../iacontact/common/pub/js/calendar.js"></script>

		<!-- language for the calendar -->

		<script type="text/javascript"
			src="../../../../iacontact/common/pub/js/calendar-cn-utf8.js"></script>

		<!-- the following script defines the Calendar.setup helper function, which makes
       adding a calendar a matter of 1 or 2 lines of code. -->
		<script type="text/javascript"
			src="../../../../iacontact/common/pub/js/calendar-setup.js"></script>
	</head>
	<body class=interface>
		<html:errors />

		<form name="fm" method="post">
			<table class=common width="100%" cellspacing="1" cellpadding="5">
				<tr>

					<%
						List list1 = (List) request.getAttribute("allPointer");
						LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = new LwWholeSaleIndicatorDto();

						lwWholeSaleIndicatorDto = (LwWholeSaleIndicatorDto) list1.get(0);
					%>

					<td class="title">
						选择录入的月份
					</td>

					<td class="input">
						<input name="inputdate"
							value="<%=lwWholeSaleIndicatorDto.getStatMonth()%>"
							id="f_date_shqqs" size="31"
							onkeyPress="return pressFullDate(event)"
							onblur="checkFullDate(this);" readonly="readonly">
					</td>

				</tr>
			</table>
			<table class=common width="100%" cellspacing="1" cellpadding="5">
				<tr class=listtitle align="center">
					<td class=title0 colspan="20" width="100%">
						<B><font size="3">趸售抄表指针录入页面</font> </B>
					</td>
				</tr>

				<!--点击新增时显示的新增路径条件部分(公用)-->


				<tr class=listtitle>
					<td nowrap>
						<span class="title">线路名称 </span>
					</td>
					<td nowrap>
						<span class="title">电话 </span>
					</td>
					<td nowrap>
						<span class="title">上月有功指针</span>
					</td>
					<td nowrap>
						<span class="title">当月有功指针</span>
					</td>
					<td nowrap>
						<span class="title">上月无功指针</span>
					</td>
					<td nowrap>
						<span class="title">当月无功指针</span>
					</td>
					<td nowrap>
						<span class="title">倍率</span>
					</td>
					<td nowrap>
						<span class="title">有功电量</span>
					</td>
					<td nowrap>
						<span class="title">无功电量</span>
					</td>
					<td nowrap>
						<span class="title">功率因素</span>
					</td>
					<td nowrap>
						<span class="title">线损比例 %</span>
					</td>
					<td nowrap>
						<span class="title">线损电量</span>
					</td>
					<td nowrap>
						<span class="title">有功变损电量</span>
					</td>
					<td nowrap>
						<span class="title">无功变损电量</span>
					</td>
					<td nowrap>
						<span class="title">差别电量</span>
					</td>
					<td nowrap>
						<span class="title">换表有功电量</span>
					</td>
					<td nowrap>
						<span class="title">换表无功电量</span>
					</td>
					
					<td nowrap>
						<span class="title">退补有功电量</span>
					</td>
					<td nowrap>
						<span class="title">退补无功电量</span>
					</td>
					<td nowrap>
						<span class="title">备注</span>
					</td>



				</tr>


				<%
					List list2 = (List) request.getAttribute("allPointer");

					Iterator it2 = list2.iterator();
					while (it2.hasNext()) {
						lwWholeSaleIndicatorDto = (LwWholeSaleIndicatorDto) it2.next();
				%>
				<tr>
					<td class="input" align="center">
					<%=lwWholeSaleIndicatorDto.getUserNo()%>
						<input name="UserName"
							value="<%=lwWholeSaleIndicatorDto.getUserNo()%>" 
							readonly="readonly" type="hidden">
					</td>
					<%
					BLLwWholeSaleUserInfoFacade  blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
					LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto=blLwWholeSaleUserInfoFacade.findByPrimaryKey(lwWholeSaleIndicatorDto.getUserNo());
					
					 %>
					 
					 <td class="input" align="center">
						<input name="ssss"
							value="<%=lwWholeSaleUserInfoDto.getLineCode()%>"
							  style="width:65px" readonly="readonly"  style="border:0">
					</td>
					 
					 
					<td class="input" align="center">
						<input name="LastWorkNum"
							value="<%=lwWholeSaleIndicatorDto.getLastWorkNum()%>"
							  style="width:65px" readonly="readonly"  style="border:0">
					</td>
					
					<td class="input" align="center">
						<input name="ThisWorkNum"
							value="<%=lwWholeSaleIndicatorDto.getThisWorkNum()%>"
							onblur="checkWork();result();resultall()" style="width:65px">
					</td>
				
					<td class="input" align="center">
						<input name="LastIdleNum"
							value="<%=lwWholeSaleIndicatorDto.getLastIdleNum()%>"
							  style="width:65px"  readonly="readonly"  style="border:0">
					</td>
					
					<td class="input" align="center">
						<input name="ThisIdleNum"
							value="<%=lwWholeSaleIndicatorDto.getThisIdleNum()%>"
							onblur="checkunWork();result();resultall()" style="width:65px">
					</td>
	

					<td class="input" align="center">
						<input name="Rate" value="<%=Math.round(lwWholeSaleIndicatorDto.getRate())%>"
							onblur="checkRate()" style="width:65px">
					</td>
					
					<td class="input" align="center">
						<input name="workQuantity"
							value="<%=lwWholeSaleIndicatorDto.getWorkQuantity()%>"
							style="width:65px" onblur="rateCode1();result()">
					</td>
					
					<td class="input" align="center">
						<input name="unworkQuantity"
							value="<%=lwWholeSaleIndicatorDto.getUnworkQuantity()%>"
							style="width:65px" onblur="rateCode1();result();resultall()">
					</td>
				
					<td class="input" align="center">
						<input name="rateCode" style="width:65px" value="<%=lwWholeSaleIndicatorDto.getPowerCode()%>">
					</td>
					
					<td class="input" align="center">
						<input name="LossRate"
							value="<%=lwWholeSaleIndicatorDto.getLossRate()%>"
							style="width:65px" onblur="checkLineLoss()">
						
					</td>
				
					<td class="input" align="center">
						<input name="LineLossQuantity"
							value="<%=lwWholeSaleIndicatorDto.getLineLossQuantity()%>" onblur="result();resultall()"
							style="width:65px">
						
					</td>
				
					<td class="input" align="center">
						<input name="TransLossQuantity"
							value="<%=lwWholeSaleIndicatorDto.getTransLossQuantity()%>" onblur="result();resultall()"
							style="width:65px">
					</td>
					<td class="input" align="center">
						<input name="unTransLossQuantity"
							value="<%=lwWholeSaleIndicatorDto.getUnTransLossQuantity()%>" onblur="result();resultall()"
							style="width:65px">
					</td>
					
					<td class="input" align="center">
						<input name="differenceQuantity"
							value="<%=lwWholeSaleIndicatorDto.getDifferenceQuantity()%>"
							style="width:65px">
					</td>
					
					<td class="input" align="center">
						<input name="ChgAmmeterQuantity"
							value="<%=lwWholeSaleIndicatorDto.getChgAmmeterQuantity()%>" onblur="result();resultall()"
							 style="width:65px">
					</td>
					
					<td class="input" align="center">
						<input name="UnChgAmmeterQuantity"
							value="<%=lwWholeSaleIndicatorDto
											.getUnChgAmmeterQuantity()%>"
							 style="width:65px" onblur="result();resultall()">
					</td>
					
					
					
					<td class="input" align="center">
						<input name="CompensateQuantity"
							value="<%=lwWholeSaleIndicatorDto.getCompensateQuantity()%>" onblur="result();resultall()"
							style="width:65px">
					</td>
				
					<td class="input" align="center">
						<input name="UnCompensateQuantity"
							value="<%=lwWholeSaleIndicatorDto
											.getUnCompensateQuantity()%>" onblur="result();resultall()"
							style="width:65px">
					</td>
				
					<td class="input" align="center">
						<input name="Remark"
							value="<%=lwWholeSaleIndicatorDto.getRemark()%>"
							style="width:65px">
						<input name="ifCal" type="hidden" value="<%=lwWholeSaleIndicatorDto.getIfCal()%>">
					</td>
					

					<td class="input" style="display: none">
						<input name="flag" type="hidden"
							value="<%=lwWholeSaleIndicatorDto.getFlag()%>" style="width:65px">
				</tr>
				<%
				}
				%>

			</table>


			<!-- 按钮的显示-->
			<table cellpadding="0" cellspacing="0" width="100%">
				<tr>
					<td>
						<table cellpadding="0" cellspacing="0" width="100%">
							<tr>
							<tr class="listtitle" align="center">
								<td class=button align="center">
									<input type=button class=button name=button0 value="保存"
										onclick="savePointer()">
								</td>
						</table>
					</td>

				</tr>
			</table>
			
 <table cellpadding="0" cellspacing="0" width="100%">
			<tr>
				<td  >
					<b>总有功电量(含变/线损)</b>
				</td>
				<td  >
					<b><input name="pureQuantity" type="text" class="text" width="20"
						 style="width: 90px"></b>
				</td>
				<td  >
					<b>总无功电量(含变/线损)</b>
				</td>
				<td  >
					<b><input name="unpureQuantity" type="text" class="text" width="20"
						 style="width: 90px"></b>
				</td>
			</tr>
			
			<tr>
				<td  >
					<b>总有功电量</b>
				</td>
				<td  >
					<b><input name="pureQuantityall" type="text" class="text" width="20"
						 style="width: 90px"></b>
				</td>
				<td  >
					<b>总无功电量</b>
				</td>
				<td  >
					<b><input name="unpureQuantityall" type="text" class="text" width="20"
						 style="width: 90px"></b>
				</td>
			</tr>
		</table>

	</body>

	<script language="javascript">
function savePointer(){
  
	fm.action="/iacontact/inputLWWholeSalePointerShow.do";
	fm.submit();
}
function checkWork()
{	
  
    var count = document.getElementsByName('ThisWorkNum').length;
   
            if(count ==1){
            
             if(fm.ThisWorkNum.value!=null&&fm.LastWorkNum.value!=""){
            if(fm.ThisWorkNum.value>=fm.LastWorkNum.value){
           	fm.workQuantity.value = Math.round((fm.ThisWorkNum.value - fm.LastWorkNum.value)*fm.Rate.value);
			}
			}
            }else{
        	
            	for(var i=0;i<fm.ThisWorkNum.length;i++){
            	if(fm.ThisWorkNum[i].value!=null&&fm.LastWorkNum[i].value!=""){
            	
            	
            		fm.workQuantity[i].value = Math.round((fm.ThisWorkNum[i].value - fm.LastWorkNum[i].value)* fm.Rate[i].value);
            		
            	
            	}
            	}
            }	
}
function checkunWork()
{	
  
    var count = document.getElementsByName('ThisIdleNum').length;
   
            if(count ==1){
            if(fm.ThisIdleNum.value!=null&&fm.ThisIdleNum.value!=""){
            if(fm.ThisIdleNum.value>=fm.LastIdleNum.value){
           	fm.unworkQuantity.value = Math.round((fm.ThisIdleNum.value - fm.LastIdleNum.value)*fm.Rate.value);
           	
			}
			}
            }else{
           
            	for(var i=0;i<fm.ThisIdleNum.length;i++){
            	if(fm.ThisIdleNum[i].value!=null&&fm.ThisIdleNum[i].value!=""){
            	 
            		fm.unworkQuantity[i].value = Math.round((fm.ThisIdleNum[i].value - fm.LastIdleNum[i].value)* fm.Rate[i].value);
            	
            	}
            	}
            }	
            }
  function checkRate(){
  
  var count = document.getElementsByName('Rate').length;
   
            if(count ==1){
         if(fm.ThisIdleNum.value!=null&&fm.ThisIdleNum.value!=""&&fm.ThisWorkNum.value!=null&&fm.LastWorkNum.value!=""){
            if(fm.ThisIdleNum.value>=fm.LastIdleNum.value&&fm.ThisWorkNum.value>=fm.LastWorkNum.value){
           		fm.unworkQuantity.value = Math.round((fm.ThisIdleNum.value - fm.LastIdleNum.value)*fm.Rate.value);
           	fm.workQuantity.value = Math.round((fm.ThisWorkNum.value - fm.LastWorkNum.value)*fm.Rate.value);
			}
			}
            }else{
           
            	for(var i=0;i<fm.ThisIdleNum.length;i++){
            	if(fm.ThisIdleNum[i].value!=null&&fm.ThisIdleNum[i].value!=""&&fm.ThisWorkNum[i].value!=null&&fm.LastWorkNum[i].value!=""){
            
            			fm.unworkQuantity[i].value = Math.round((fm.ThisIdleNum[i].value - fm.LastIdleNum[i].value)*fm.Rate[i].value);
           	fm.workQuantity[i].value =Math.round((fm.ThisWorkNum[i].value - fm.LastWorkNum[i].value)*fm.Rate[i].value);
           
            	}
            	
  
  }
  }
}
function checkLineLoss()
{	
  
    //var count = document.getElementsByName('ThisWorkNum').length;
   
        //    if(count ==1){
            
          //   if(fm.LossRate.value!=null&&fm.LossRate.value!=""){
           
           	//fm.LineLossQuantity.value = Math.round(fm.workQuantity.value *fm.LossRate.value);
			
			//}
            //}else{
        	
            	//for(var i=0;i<fm.ThisWorkNum.length;i++){
            	//if(fm.LossRate[i].value!=null&&fm.LossRate[i].value!=""){
            	
            	
            		//fm.LineLossQuantity[i].value = Math.round(fm.workQuantity[i].value * fm.LossRate[i].value);
            		
            	
            	//}
            	//}
            //}	
}

function  rateCode1(){

var count = document.getElementsByName('ThisIdleNum').length;
	
	
	
		var b1;
		var b2;
		var c1;
		var c2;
            if(count==1){
             if((fm.ThisWorkNum.value!=null && fm.ThisWorkNum.value!="")||(fm.workQuantity.value!=null && fm.workQuantity.value!="")||(fm.unworkQuantity.value!=null && fm.unworkQuantity.value!="")){
              if(fm.workQuantity.value=='0'){
              c2=0;
              }else{
            	b1=parseFloat(fm.workQuantity.value)*parseFloat(fm.workQuantity.value);
           			b2=parseFloat(fm.unworkQuantity.value)*parseFloat(fm.unworkQuantity.value);
           	
           		c1=Math.sqrt(1+b2/b1);
           		c2=Math.round(((1/c1)*100))/100;
           		}
           		fm.rateCode.value=c2;
			}
            }else{
         
            	for(var i=0;i<fm.ThisIdleNum.length;i++){
            if((fm.ThisWorkNum[i].value!=null && fm.ThisWorkNum[i].value!="")||(fm.workQuantity[i].value!=null && fm.workQuantity[i].value!="")||(fm.unworkQuantity[i].value!=null && fm.unworkQuantity[i].value!="")){
            		if(fm.workQuantity[i].value=='0'){
            		c2=0;
            		}else{
            			b1=parseFloat(fm.workQuantity[i].value)*parseFloat(fm.workQuantity[i].value);
           			b2=parseFloat(fm.unworkQuantity[i].value)*parseFloat(fm.unworkQuantity[i].value);
           			
            	c1=Math.sqrt(1+b2/b1);
            
           		c2=Math.round(((1/c1)*100))/100;
           	}
           		fm.rateCode[i].value=c2;
           }
            	}
            	
  
  }
}


  function result()
{	
    var count = document.getElementsByName('ThisIdleNum').length;
         	fm.pureQuantity.value = 0;
         	fm.unpureQuantity.value = 0;
     	 	
     	 	
            if(count ==1){
           	fm.pureQuantity.value = parseInt(fm.workQuantity.value) +  parseInt(fm.ChgAmmeterQuantity.value) + parseInt(fm.CompensateQuantity.value)-parseInt(fm.LineLossQuantity.value)-parseInt(fm.TransLossQuantity.value);
           fm.unpureQuantity.value=parseInt(fm.unworkQuantity.value) +  parseInt(fm.UnChgAmmeterQuantity.value) + parseInt(fm.UnCompensateQuantity.value)-parseInt(fm.unTransLossQuantity.value);
            }else{
            	for(var i=0;i<count;i++){
            		fm.pureQuantity.value = parseInt(fm.pureQuantity.value) + parseInt(fm.workQuantity[i].value) +  parseInt(fm.ChgAmmeterQuantity[i].value) + parseInt(fm.CompensateQuantity[i].value)-parseInt(fm.LineLossQuantity[i].value)-parseInt(fm.TransLossQuantity[i].value);
            	    fm.unpureQuantity.value=parseInt(fm.unpureQuantity.value) +parseInt(fm.unworkQuantity[i].value) +  parseInt(fm.UnChgAmmeterQuantity[i].value) + parseInt(fm.UnCompensateQuantity[i].value)-parseInt(fm.unTransLossQuantity[i].value);
                
            	}
            }	
} 




  function resultall()
{	
    var count = document.getElementsByName('ThisIdleNum').length;
         	fm.pureQuantityall.value = 0;
         	fm.unpureQuantityall.value = 0;
     	 	
     	 	
            if(count ==1){
           	fm.pureQuantityall.value = parseInt(fm.workQuantity.value) +  parseInt(fm.ChgAmmeterQuantity.value) + parseInt(fm.CompensateQuantity.value);
           fm.unpureQuantityall.value=parseInt(fm.unworkQuantity.value) +  parseInt(fm.UnChgAmmeterQuantity.value) + parseInt(fm.UnCompensateQuantity.value);
            }else{
            	for(var i=0;i<count;i++){
            		fm.pureQuantityall.value = parseInt(fm.pureQuantityall.value) + parseInt(fm.workQuantity[i].value) +  parseInt(fm.ChgAmmeterQuantity[i].value) + parseInt(fm.CompensateQuantity[i].value)
            	    fm.unpureQuantityall.value=parseInt(fm.unpureQuantityall.value) +parseInt(fm.unworkQuantity[i].value) +  parseInt(fm.UnChgAmmeterQuantity[i].value) + parseInt(fm.UnCompensateQuantity[i].value);
                	
            	}
            }	
} 


</script>


</html>
