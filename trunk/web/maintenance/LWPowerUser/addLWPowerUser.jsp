
<%@ page contentType="text/html; charset=GBK"%>
<%@page import="com.elongway.pss.bl.action.domain.BLLwDcodeAction"%>
<%@page import="com.elongway.pss.bl.facade.BLLwDcodeFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwDcodeDto"%>
<%@page import="com.elongway.pss.bl.facade.BLLwBookUserFacade"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterBookFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterChangeDto"%>
<%@page import="com.elongway.pss.dto.domain.LwBookUserDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@page import="java.util.*" %>
<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">

<title>直供乡新增用电用户</title>
<link rel="stylesheet" type="text/css" media="all" href="/iacontact/css/calendar.css" title="win2k-cold-1" /> 
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
	src="/mimessage/common/pub/StaticJavascript.jsp"></script>
<link rel="stylesheet" type="text/css" media="all" href="../../../../iacontact/css/calendar-win2k-cold-1.css" title="win2k-cold-1" />

  <!-- main calendar program -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar.js"></script>

  <!-- language for the calendar -->

  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-cn-utf8.js"></script>

  <!-- the following script defines the Calendar.setup helper function, which makes
       adding a calendar a matter of 1 or 2 lines of code. -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-setup.js"></script>



<!--自动下拉列表JS2-->

</head>
<body id="all_title">
  
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    
      <form name="fm" style="display:block;">
         <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>增加直供乡用电用户</B></td>
		</tr>
          <tr>
            <td class=title>户号</td>
            <td class=input><input name="UserNo" type="text" class="text">&nbsp;<img
							src="../../images/redstar.gif" ></td>
            <td class=title>户名</td>
            <td class=input><input name="UserName" type="text"  class="text" >&nbsp;<img
							src="../../images/redstar.gif" ></td>
          </tr>
		  <tr>
		  <% BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
             Collection collection = blLwDcodeFacade.findByConditions(" codetype = 'TownCode'");       
       %>
        <td class=title>配置线路</td>
            <td class=input><input name="lineCode" type="text" value="和913-29#" ondblclick="codeQueryLine(this)"
							onkeyup="codeQueryLine(this)" class="codecode" >&nbsp;<img
							src="../../images/redstar.gif" ></td>
		  <td class=title>地址</td>
            <td class=input><input name="Address" type="text"  class="text"></td>
           
			
          
       </tr>
       
		  <tr>
		  
   <% BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade();
             Collection bookList = blLwAmmeterBookFacade.findByConditions(" 1=1 ");     
       %>
		  
		  <td class=title>所属抄表本</td>
		  	<td class=input><select name="bookNo"  class="input">
		  	<% for (Iterator iterator = bookList.iterator(); iterator.hasNext();) {
			LwAmmeterBookDto o = (LwAmmeterBookDto) iterator.next();
			%>
			
			  <option value=<%=o.getBookNo() %>><%=o.getBookName()%></option> 
			  <%} %>
       </select>	


</td><td class=title>所属乡镇</td>
		  	<td class=input><select name="TownCode"  class="input">
		  	<% for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwDcodeDto o = (LwDcodeDto) iterator.next();
			%>
				  <option value=<%=o.getCodeCode() %>><%=o.getCodeCName() %></option> 
			<%} %>    
       </select>	


</td>
		   
		   
		  </tr>
	   	 <tr>
		
 <% Collection salePriceList = blLwDcodeFacade.findByConditions(" codetype = 'SaleLevel'"); 
       %>
		  
         <td class=title>电压等级</td>
            <td class=input><select name="voltLevel"  class="input">
		  	<% for (Iterator iterator = salePriceList.iterator(); iterator.hasNext();) {
			LwDcodeDto o = (LwDcodeDto) iterator.next();
			if(o.getCodeCode().equals("2")){
			%>
			 
			  <option value=<%=o.getCodeCode() %> selected="selected"><%=o.getCodeCName()%></option> 
			  <%} else{%>
			    <option value=<%=o.getCodeCode() %>><%=o.getCodeCName()%></option> 
			    <%}} %>
       </select>	


</td>
<%Collection<LwDcodeDto> comList = blLwDcodeFacade.findByConditions(" codetype = 'SupplyCom'"); %>
          <td class=title>供电局</td>
             <td class=input><select name="company"  class="input">
		  	<% for (Iterator iterator = comList.iterator(); iterator.hasNext();) {
			LwDcodeDto o = (LwDcodeDto) iterator.next();
			%>
			 
			  <option value=<%=o.getCodeCode() %> ><%=o.getCodeCName()%></option> 
			  <%} %>
       </select>	


</td>
          </tr>
		  
        </table>
       
      <table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="9"><B>用户比例分摊信息</B></td>
		</tr>
		<%String statMonth = (String)request.getAttribute("statMonth"); %>

		<tr class="listtitle">
			<td  align="center">居民生活</td>
			<td  align="center">非居民照明</td>
			<td  align="center">贫困县农业排灌</td>
			<td  align="center">农业生产</td>
			<td  align="center">商业</td>
			<td  align="center">非普工业</td>
			
			
			
		</tr>
				
		<tr>
			<td class="title"  align="center"><input name="people" type="text" class="text" width="20" value=0.299></td>
			<td class="title"  align="center"><input name="notPeople" type="text" class="text" width="20" value=0.0></td>
			
			<td class="title"  align="center"><input name="farm" type="text" class="text" width="20" value=0.685></td>
			<td class="title"  align="center"><input name="produce" type="text" class="text" width="20" value=0.0></td>
			<td class="title"  align="center"><input name="business" type="text" class="text" width="20" value=0.0039></td>
			<td class="title"  align="center"><input name="notFactory" type="text" class="text" width="20" value=0.0121></td>
			
		</tr>
	
		
	</table>
	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="11"><B>配置电表信息</B></td>
		</tr>
		

		<tr class="listtitle">			
			<td align="center"><span >相</span></td>
			<td align="center">电压</td>
			<td align="center">安培</td>			
			<td align="center">厂名</td>
			<td align="center">表号</td>
			<td align="center">常数</td>
			<td align="center">型号</td>
			<td align="center">精度</td>
			<td align="center">倍率</td>
			<td align="center">上表日期</td>
				<td align="center"></td>
			
		</tr>
				
		<tr >
			<td class="title"  align="center"><input name="ammeterX" type="text" class="text" width="20" value=3></td>
			<td class="title"  align="center"><input name="ammeterV" type="text" class="text" width="20" value=380/220></td>
			<td class="title"  align="center"><input name="ammeterA" type="text" class="text" width="20" value=1.5(6)></td>
			<td class="title"  align="center"><input name="factoryName" type="text" class="text" width="20" value=长沙></td>
			<td class="title"  align="center"><input name="ammeterNo" type="text" class="text" width="20" value=""></td>
			<td class="title"  align="center"><input name="coust" type="text" class="text" width="20" value=""></td>
			<td class="title"  align="center"><input name="ammeterType" type="text" class="text" width="20" value=DTS(X)343></td>
			<td class="title"  align="center"><input name="precision" type="text" class="text" width="20" value=""></td>
			<td class="title"  align="center"><input name="rate" type="text" class="text" width="20" value=0.0></td>			
				<td class=input>
				<input class="text" name="installDate"	id="f_date_shqqs"  size="31" onkeyPress="return pressFullDate(event)"   onblur="checkFullDate(this);" readonly="readonly" value=2007-12-22  /></td>				
			<td><img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
					style="cursor: pointer; border: 1px solid #0083da;"
					title="Date selector"					
					onmouseover="this.style.background='#4CA8EB';"
					onmouseout="this.style.background=''" /></td>	
           
		</tr>
	
		
	</table>

		
    <br />
<!--一大堆的按钮-->

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" 保 存 " onClick="addPowerUser();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        --%><td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function addPowerUser(){
var people = fm.people.value;
	var notPeople = fm.notPeople.value;
	var business = fm.business.value;
	var notFactory = fm.notFactory.value;
	var produce = fm.produce.value;
	var farm = fm.farm.value;
	var sum = parseFloat(people)+parseFloat(notPeople)+parseFloat(business) + parseFloat(notFactory)+parseFloat(produce) + parseFloat(farm);


 if(fm.UserNo.value ==''){
   alert('户号不能为空！'); 
   return;
 }
  if(fm.UserName.value ==''){
   alert('户名不能为空！'); 
   return;
 }
 
 if(sum!=1)
	{
	if(!confirm('该用户的比例分摊不是100%，是否需要继续保存？')){
	 return false;
	}else{
	 fm.action="/iacontact/addLWPowerUser.do";
 fm.submit();	
	}}else{
	if(!confirm('确定保存？')){
	 return false;
	}else{
	 fm.action="/iacontact/addLWPowerUser.do";
 fm.submit();	
	}
	}



}
 function codeQuery(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.ammeterNo.value+"&TableName=LwAmmeterNo1";
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}

 function codeQueryLine(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.lineCode.value+"&TableName=LwPowerLine1";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
function codeQueryAmmeter(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.ammeterNo.value+"&TableName=LwAmmeterNo";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
Calendar.setup({
        inputField     :    "f_date_shqqs",     // id of the input field
        button         :    "f_trigger_shqqs",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    }); 
</script>
</body>
</html:html>
