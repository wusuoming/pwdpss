<%--
*********
******************
大工业计算录入页面  
create by wangrongjia
200810.13
--%>

<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwFactoryIndicatorDto"/>
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto"/>
<jsp:directive.page import="org.omg.CORBA.Request"/>
    <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  <script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
	<!-- calendar stylesheet -->
  <link rel="stylesheet" type="text/css" media="all" href="../../../../iacontact/css/calendar-win2k-cold-1.css" title="win2k-cold-1" />

  <!-- main calendar program -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar.js"></script>

  <!-- language for the calendar -->

  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-cn-utf8.js"></script>

  <!-- the following script defines the Calendar.setup helper function, which makes
       adding a calendar a matter of 1 or 2 lines of code. -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-setup.js"></script>
<title>大工业核算页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>大工业核算页面</title>
<app:css />
<html:base />
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
</head>

<body class=interface>







  
    <!--CONTENT BEGIN-->
    
      <form name="fm" method="post">
      
      <table class=common width="100%" cellspacing="1" cellpadding="4">
        <%
       List list=(List)request.getAttribute("factiory");
       LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto=(LwNewFactoryIndicatorDto)list.get(0);
       LwNewFactoryIndicatorDto LwNewFactoryIndicatorDto2=(LwNewFactoryIndicatorDto)request.getAttribute("lwNewFactoryIndicatorDto2");
       String cotentPrice=request.getAttribute("contentPrice").toString();
        String needPower=request.getAttribute("needPower").toString();
        %>
		<tr>
			<td class="title">核算日期</td>				
				<td class=input>
				<input  class="text" name="inputDate"  readOnly=true 	 value="<%=lwNewFactoryIndicatorDto.getStatMonth()%>"   readonly="readonly" />
<td class=input>
				<td class=input>
		</tr>
		
		</table>
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>大工用户信息</B></td>
		</tr>
	<%
	LwCoporationUserInfoDto lwCoporationUserInfoDto=(LwCoporationUserInfoDto)request.getAttribute("lwCoporationUserInfoDto");
	
	 %>
          <tr>
           <td class="title">户号</td>				
				<td class=input>
				<input  class="text" name="UserNo"  readOnly=true 	 value="<%=lwCoporationUserInfoDto.getUserNo()%>"   />	
            <td class="title">大工业名称</td>
            
            <td class="input"><input class="text" name="UserName"  readOnly=true type="text" value="<%=lwCoporationUserInfoDto.getUserName()%>" ></td>
          
				
         
         </tr>
          <tr>
           <td class="title">月中停产或生产</td>				
				<td class="input" >
				<select name="stopProduce">
				 <option value="0"  readOnly=true <%if(LwNewFactoryIndicatorDto2.getIfChange().equals("0")){ %>selected="selected"<%} %>>否</option>
				  <option value="1"  readOnly=true <%if(LwNewFactoryIndicatorDto2.getIfChange().equals("1")){ %>selected="selected"<%} %>>是</option>
				 
              </select>	
			 </td>
			 <%
		if(lwCoporationUserInfoDto.getIndustryType().equals("1")) {
		 %>
		 <td class="title" >容量电量</td>				
				<td class=input >
				<input  class="text" readOnly=true name="RongliangQuantity"  value="<%=lwCoporationUserInfoDto.getRongliangPower()%>"  />	
		<input  type="hidden" name="appStyle"	  value="0"  />	
		<%} else{%>
		<td class=input >
		<td class=input >
		<%} %>
			 <%--<td class="title">电金电量</td>				
				<td class="input" ><select name="dianjinPower"  >
				  
				  <option value="0">总电量</option>
				  <option value="1">非居民照明电量</option>
				 
              </select>	
			 </td>
           --%></tr><%--
          	
		
		 <tr>
		 
		<td class="title">变损</td>				
				<td class=input>
				<input  class="text" name="TransLoss"	    >%</td>	
					 <%
		if(lwCoporationUserInfoDto.getIndustryType().equals("1")) {
		 %>
		 <td class="title" >容量电量</td>				
				<td class=input >
				<input  class="text" name="RongliangQuantity"	  value="<%=lwCoporationUserInfoDto.getRongliangPower()%>"  />	
		<input  type="hidden" name="appStyle"	  value="0"  />	
		<%} else{%>
		<td class=input >
		<td class=input >
		<%} %>
		 </tr>
		 
		 --%><%
		if(lwCoporationUserInfoDto.getIndustryType().equals("2")) {
		 %>
		 <tr>
		 <td class="title" >需量指针</td>				
				<td class=input >
				<input  class="text" name="NeedPointer"	readOnly=true value="<%=needPower %>"  />	
				<input  type="hidden" name="appStyle"	  value="1"  />	
	<td class="title" >需量倍率</td>				
				<td class=input >
				<input input class="text" name="NeedRate"  readOnly=true 	 value="<%=lwCoporationUserInfoDto.getNeedRate()%>"   />	
		 </tr>
		 <%} %>
		 
         <%--<tr>
			<td class="title">居民照明电金价格</td>				
				<td class=input>
				<input  class="text" name="pdanjin"	  value="0.02"  />	
							
			<td class="title"  >电量类型</td>
            <td class="input" ><select name="AmmeterStyle"  >
				  
				  <option value="0">平</option>
				  <option value="1">峰</option>
				  
              </select>	
			 </td>
					
			  
				 
		</tr> 
			--%><%--<tr >
				<td class="title"  >定量照明电量</td>				
				<td class=input  >
				<input  class="text"  name="PeopleQuantity"	    />	
				<td class=input  >
				<td class=input  >
			</tr>
		--%></table>
		<table class=common width="100%" cellspacing="1" cellpadding="5">
	 <tr class=listtitle align="center">
			<td class=title0 colspan="18"><B>大工业抄表信息</B></td>
		</tr>			
        		<%
	List list2=(List)request.getAttribute("factiory");
	
	Iterator it2=list2.iterator();
	while(it2.hasNext()){
	lwNewFactoryIndicatorDto =(LwNewFactoryIndicatorDto)it2.next();
	
	 %> 
      <tr class=listtitle>
			<td nowrap ><span class="title">表号 </span></td>
			<td nowrap><span class="title">上月有功指针 </span></td>
			<td nowrap><span class="title">当月有功指针</span></td>
			<td nowrap><span class="title">上月无功指针</span></td>
			<td nowrap><span class="title">当月无功指针</span></td>
			<td nowrap><span class="title">倍率</span></td>
			<td nowrap><span class="title">有功电量</span></td>
			<td nowrap><span class="title">无功电量  </span></td>
			
			

			
			
			
		</tr>

					<tr >
						<td class="input" rowspan="3"><input name="AmmeterNo"  readOnly=true  value="<%=lwNewFactoryIndicatorDto.getAmmeterNo()%>" style="border:0"  style="width:65px" ></td>
						<td class="input" ><input name="LastWorkNum"  readOnly=true  value="<%=lwNewFactoryIndicatorDto.getLastWorkNum()%>" onblur="checkWork()" style="border:0"  style="width:65px"></td>
						
							<%
								if(lwNewFactoryIndicatorDto.getAmmeterStyle().equals("0")&&lwNewFactoryIndicatorDto.getIfChange().equals("1")){
							 %>
							  <td class="input" ><input name="ThisWorkNum"  readOnly=true  value="<%=lwNewFactoryIndicatorDto.getChangeWorkPointer()%>" onblur="checkWork()" style="width:65px"></td>
							 <%}else{ %>
						 <td class="input" ><input name="ThisWorkNum"   readOnly=true  value="<%=lwNewFactoryIndicatorDto.getThisWorkNum()%>" onblur="checkWork()" style="width:65px"></td>
						<%} %>
						<td class="input" ><input name="LastIdleNum"  readOnly=true  value="<%=lwNewFactoryIndicatorDto.getLastIdleNum()%>" onblur="checkunWork()" style="border:0"  style="width:65px"></td>
						<%
								if(lwNewFactoryIndicatorDto.getAmmeterStyle().equals("0")&&lwNewFactoryIndicatorDto.getIfChange().equals("1")){
							 %>
							<td class="input" ><input name="ThisIdleNum"  readOnly=true  value="<%=lwNewFactoryIndicatorDto.getChangeunWorkPointer()%>" onblur="checkunWork()" style="width:65px"></td>
							 <%}else{ %>
						
					
						 <td class="input" ><input name="ThisIdleNum"  readOnly=true  value="<%=lwNewFactoryIndicatorDto.getThisIdleNum()%>" onblur="checkunWork()" style="width:65px"></td>
						<%} %>
						
						<td class="input" ><input name="Rate"  readOnly=true  value="<%=lwNewFactoryIndicatorDto.getRate()%>" style="width:65px" onblur="checkRate()"></td>

						
						
						
						
						 <td class="input" ><input name="workQuantity"  readOnly=true  value="<%=lwNewFactoryIndicatorDto.getWorkQuantity()%>" style="width:65px"></td>
						
						
						
						 <td class="input" ><input name="unworkQuantity"  readOnly=true  value="<%=lwNewFactoryIndicatorDto.getUnworkQuantity()%>" style="width:65px"></td>
		
							</tr>
							
							<tr class=listtitle>
							
			
			<td nowrap><span class="title">天数</span></td>
			<td nowrap><span class="title">换表有功电量</span></td>
			<td nowrap><span class="title">换表无功电量</span></td>
			<td nowrap><span class="title">退补有功电量</span></td>
			<td nowrap><span class="title">退补无功电量</span></td>
			<td nowrap><span class="title">状态</span></td>
			<td nowrap><span class="title">电表类型</span></td>
							</tr>
							
							<tr>
							<%if(lwNewFactoryIndicatorDto.getAmmeterStyle().equals("0")){ %>
							
       
        
        <td class="input" ><input name="day"  readOnly=true  value="<%=lwNewFactoryIndicatorDto.getDay()%>"  style="width:65px"></td>
							
							<%} %>					<%if(lwNewFactoryIndicatorDto.getAmmeterStyle().equals("1")){ %>
										
						<td class="input" >
						
					
      
							
							<%} %>

						 <td class="input" ><input   readOnly=true name="ChgAmmeterQuantity" value="<%=lwNewFactoryIndicatorDto.getChgAmmeterQuantity()%>"   style="width:65px"></td>
						
						 <td class="input" ><input  readOnly=true name="UnChgAmmeterQuantity" value="<%=lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity()%>"   style="width:65px"></td>
						
						 <td class="input" ><input  readOnly=true name="CompensateQuantity" value="<%=lwNewFactoryIndicatorDto.getCompensateQuantity()%>" style="width:65px"></td>
					
	
						
						 <td class="input" ><input  readOnly=true name="UnCompensateQuantity" value="<%=lwNewFactoryIndicatorDto.getUnCompensateQuantity()%>" style="width:65px"></td>
						 <%if(lwNewFactoryIndicatorDto.getAmmeterStyle().equals("0")){ %>
							
       
        
        <td class="input" ><select name="state" style="width:60px">
					<option value="1" <%if(lwNewFactoryIndicatorDto.getChangeBefore().equals("1")){ %>selected="selected"<%} %> >生产</option>
				  <option value="2" <%if(lwNewFactoryIndicatorDto.getChangeBefore().equals("2")){ %>selected="selected"<%} %>>停产</option></td>
							
							<%} %>					<%if(lwNewFactoryIndicatorDto.getAmmeterStyle().equals("1")){ %>
										
						<td class="input" >
						
					
      
							
							<%} %>		
						 		
						 		
						 		<%
						if(lwNewFactoryIndicatorDto.getAmmeterStyle().equals("0")){
						 %>
						<td class="title" align="center">大工业<input  readOnly=true name="useStyle" style="width:65px" value="0" type="hidden" readonly="readonly"></td>										
						<%
						}
						 %>
						 <%
						if(lwNewFactoryIndicatorDto.getAmmeterStyle().equals("1")){
						 %>
						<td class="title" align="center">居民照明<input  readOnly=true name="useStyle" style="width:65px" value="1" type="hidden" readonly="readonly"></td>										
						<%
						}
						 %>


						                  
					</tr>
					<%} %>
					<%
					if(LwNewFactoryIndicatorDto2.getIfChange().equals("1")){
					 %>
					<tr class=listtitle >
			<td nowrap ><span class="title">月中停产/生产 </span></td>
			<td nowrap><span class="title">上月有功指针 </span></td>
			<td nowrap><span class="title">当月有功指针</span></td>
			<td nowrap><span class="title">上月无功指针</span></td>
			<td nowrap><span class="title">当月无功指针</span></td>
			<td nowrap><span class="title">倍率</span></td>
			<td nowrap><span class="title">有功电量</span></td>
			<td nowrap><span class="title">无功电量  </span></td>
		
			

			
			
			
		</tr>
					<tr >
						<td class="input" rowspan="3"><input name="changeAmmeterNo" value="大工业" style="border:0" readonly="readonly" style="width:65px"></td>
						<td class="input" ><input  readOnly=true  name="changeLastWorkNum" value="<%=LwNewFactoryIndicatorDto2.getChangeWorkPointer()%>" onblur="checkchangeWork()" style="width:65px"></td>
						
						
						 <td class="input" ><input  readOnly=true name="changeThisWorkNum" value="<%=LwNewFactoryIndicatorDto2.getThisWorkNum()%>" onblur="checkchangeWork()"  style="width:65px"></td>
						
						<td class="input" ><input  readOnly=true name="changeLastIdleNum" value="<%=LwNewFactoryIndicatorDto2.getChangeunWorkPointer()%>"  onblur="checkchangeunWork()" style="width:65px" ></td>
						
						
					
						 <td class="input" ><input  readOnly=true name="changeThisIdleNum" value="<%=LwNewFactoryIndicatorDto2.getThisIdleNum()%>" onblur="checkchangeunWork()" style="width:65px"></td>
						
						
						<td class="input" ><input  readOnly=true name="changeRate" value="<%=LwNewFactoryIndicatorDto2.getRate()%>" style="width:65px" onblur="checkchangeRate()"></td>

						
						
						
						
						 <td class="input" ><input  readOnly=true name="changeworkQuantity" value="<%=LwNewFactoryIndicatorDto2.getChangeworkQuantity()%>" style="width:65px"></td>
						
						
						
						 <td class="input" ><input  readOnly=true name="changeunworkQuantity" value="<%=LwNewFactoryIndicatorDto2.getChangeUnworkQuantity()%>" style="width:65px"></td>
						
       </tr>
       <tr class=listtitle >
						
			<td nowrap><span class="title">天数</span></td>
			<td nowrap><span class="title">换表有功电量</span></td>
			<td nowrap><span class="title">换表无功电量</span></td>
			<td nowrap><span class="title">退补有功电量</span></td>
			<td nowrap><span class="title">退补无功电量</span></td>
			<td nowrap><span class="title">状态</span></td>
			<td nowrap><span class="title">电表类型</span></td>
							</tr>
       <tr >
       
        <td class="input" ><input  readOnly=true name="changeday" value="<%=LwNewFactoryIndicatorDto2.getChangeday()%>"  style="width:65px"></td>
							
							
					
						 <td class="input" ><input  readOnly=true name="changeChgAmmeterQuantity" value="<%=LwNewFactoryIndicatorDto2.getChageChgAmmeterQuantity()%>"   style="width:65px"></td>
						
						 <td class="input" ><input  readOnly=true name="changeUnChgAmmeterQuantity" value="<%=LwNewFactoryIndicatorDto2.getChangeunChgAmmeterQuantity()%>"   style="width:65px"></td>
						
						 <td class="input" ><input  readOnly=true name="changeCompensateQuantity" value="<%=LwNewFactoryIndicatorDto2.getChangeCompensateQuantity()%>" style="width:65px"></td>
						
	
						
						 <td class="input" ><input  readOnly=true name="changeUnCompensateQuantity" value="<%=LwNewFactoryIndicatorDto2.getChangeunCompensateQuantity()%>" style="width:65px"></td>
						 		
						
							
       
        
        <td class="input" ><select name="changestate" style="width:60px">
					<option value="1" <%if(LwNewFactoryIndicatorDto2.getChangeAfter().equals("1")) {%>selected="selected"<%} %>>生产</option>
				  <option value="2" <%if(LwNewFactoryIndicatorDto2.getChangeAfter().equals("2")) {%>selected="selected"<%} %>>停产</option></td>
							
											
						<td class="title" align="center">大工业<input name="changeAmmeterStyle" style="width:65px" value="0" type="hidden" readonly="readonly"></td>										
					
						                  
					</tr>
		
		<%} %>
		
		
			<%--<tr class=oddrow>
				<td colspan="5" align="right"><img src="../../images/jia-jia.gif" border="0" align="absmiddle" name="img_DataPower_Insert" onclick="insertRow('DataPower')">
				</td>
			</tr>
		--%>
			 	
		
		
        </table>
      <table cellpadding="0" cellspacing="0" width="100%">
<tr>
<td>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button
				name=button0 value="计算" onclick="feecal()"></td>
		
	</table>
	</td>

	</tr>
	</table>
     <br />

	
	
	</form>
 
  <iframe id="fm2" name="fm2" width="100%" src=""  frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="yes" allowtransparency="yes" ></iframe>
  </body>
<script language="javascript">



function corn(){
	if(fm.stopProduce.value=="0"){
	c1.style.display="none";
	c2.style.display="none";
	c3.style.display="none";
	c4.style.display="none";
	}
	if(fm.stopProduce.value=="1"){
	c1.style.display="";
	c2.style.display="";
	c3.style.display="";
	c4.style.display="";
	}
}

function feecal(){
//if(fm.ThisWorkNum.value==""||fm.ThisWorkNum.value==null){
 // alert("当月有功指针不能为空");
 // return false;
//}
//if(fm.ThisIdleNum.value==""||fm.ThisIdleNum.value==null){
 // alert("当月无功指针不能为空");
  //return false;
//}

fm.action="/iacontact/corporationFeeCal.do";
	fm.target="fm2";
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
  function checkchangeWork()
{	

   
             if(fm.changeThisWorkNum.value!=null&&fm.changeLastWorkNum.value!=""){
            if(fm.changeThisWorkNum.value>=fm.changeLastWorkNum.value){
           	fm.changeworkQuantity.value = Math.round((fm.changeThisWorkNum.value - fm.changeLastWorkNum.value)*fm.changeRate.value);
			}
			}
           
}
function checkchangeunWork()
{	
  
   
            if(fm.changeThisIdleNum.value!=null&&fm.changeThisIdleNum.value!=""){
            if(fm.changeThisIdleNum.value>=fm.changeLastIdleNum.value){
           	fm.changeunworkQuantity.value = Math.round((fm.changeThisIdleNum.value - fm.changeLastIdleNum.value)*fm.changeRate.value);
           	
			}
			}
           
            }
 function checkchangeRate(){
  
 
         if(fm.changeThisIdleNum.value!=null&&fm.changeThisIdleNum.value!=""&&fm.changeThisWorkNum.value!=null&&fm.changeLastWorkNum.value!=""){
            if(fm.changeThisIdleNum.value>=fm.changeLastIdleNum.value&&fm.changeThisWorkNum.value>=fm.changeLastWorkNum.value){
           		fm.changeunworkQuantity.value = Math.round((fm.changeThisIdleNum.value - fm.changeLastIdleNum.value)*fm.changeRate.value);
           	fm.changeworkQuantity.value = Math.round((fm.changeThisWorkNum.value - fm.changeLastWorkNum.value)*fm.changeRate.value);
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
function validateUserQueryForm(form)
{
   //添加日期型的合成函数
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

</script>
<br />
  


</html>
</html:html>