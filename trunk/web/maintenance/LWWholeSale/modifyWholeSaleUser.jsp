
<%--
*********
******************
修改趸售用户信息页面  
create by wangrongjia
200810.09
--%>
<%@ page language="java" contentType="text/html; charset=GBk"
	pageEncoding="GBk"%>
	<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
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
<jsp:directive.page import="com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwProrateDto"/>
<jsp:directive.page import="com.elongway.pss.bl.facade.BLLwProrateFacade"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwAmmeterChangeDto"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwUserLineDto"/>




  
<title></title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<html>
<head>



<!--自动下拉列表JS2-->

</head>
<body id="all_title">
  
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    
      <form name="fm" >
        <table id="table_userMain" class="fix_table" border="0">
         <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>修改趸售用户</B></td>
		</tr>
		<%
		LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto=(LwWholeSaleUserInfoDto)request.getAttribute("lwWholeSaleUserInfoDto");
		 %>
          <tr>
            <td class=title>线路名称</td>
            <td class=input><%=lwWholeSaleUserInfoDto.getUserNo()%></td>
            <td class=input style="display: none"><input name="transformerName" type="hidden" class="text" value="<%=lwWholeSaleUserInfoDto.getUserNo()%>"></td>
            <td class=title>供电电压</td>
           
             <td class=input><select name="voltage" >
            <option value="10" <%if(lwWholeSaleUserInfoDto.getVoltage().equals("10")){ %>selected="selected"<%} %>>10KV</option>
			<option value="35" <%if(lwWholeSaleUserInfoDto.getVoltage().equals("35")){ %>selected="selected"<%} %>>35KV</option>
          </tr>
		  <tr>
		    <td class=title>所属农电局</td>
			  <td class=input><select name="company" >
            <option value="gy" <%if(lwWholeSaleUserInfoDto.getCompany().equals("gy")) {%>selected="selected"<%} %>>固阳农电局</option>
			<option value="dm" <%if(lwWholeSaleUserInfoDto.getCompany().equals("dm")) {%>selected="selected"<%} %>>达茂农电局</option>
			 <option value="ty"<%if(lwWholeSaleUserInfoDto.getCompany().equals("ty")) {%>selected="selected"<%} %>>土右农电局</option>
			<option value="jy"<%if(lwWholeSaleUserInfoDto.getCompany().equals("jy")) {%>selected="selected"<%} %>>九原农电局</option>
		  <td class=title>趸售类型</td>
            
			
            <td class=input><select name="wholeSaleType" onchange="isHaveProrate()">
            <option value="0"<%if(lwWholeSaleUserInfoDto.getWholesaletype().equals("0")){ %>selected="selected"<%} %>>普通趸售</option>
			<option value="1"<%if(lwWholeSaleUserInfoDto.getWholesaletype().equals("1")){ %>selected="selected"<%} %>>趸售工业</option>
              
          
            </select>
            </td>
            
          
       </tr>
       <tr>
       		<td class=title>地址</td>
            <td class=input><input name="phoneNo" type="text"  class="text" value="<%=lwWholeSaleUserInfoDto.getPhoneNo()%>"></td>

           <td class=title>电话</td>
            <td class=input><input name="lineCode" value="<%=lwWholeSaleUserInfoDto.getLineCode()%>" type="text"  class="text"></td>
       </tr>
        <tr>
       		<td class=title>是否为考核表</td>
           
             <td class=input><select name="ifCal" >
            <option value="0" <%if(lwWholeSaleUserInfoDto.getIfCal().equals("0")){ %>selected="selected"<%} %>>否(算费)</option>
			<option value="1"  <%if(lwWholeSaleUserInfoDto.getIfCal().equals("1")){ %>selected="selected"<%} %>>是(只抄表不算费)</option>
			<td class=input>
			<td class=input>
           
       </tr>
        </table>
         <table width="100%">
		<tr class=listtitle align="center">
			<td class=title0 colspan="12"><B>配置电表信息</B></td>
		</tr>
		
	<% List list=(List)request.getAttribute("ua");
		Iterator it=list.iterator();
		LwAmmeterChangeDto  lwAmmeterChangeDto=new LwAmmeterChangeDto();
		while(it.hasNext()){
		lwAmmeterChangeDto=(LwAmmeterChangeDto)it.next();
		}
	%>
		<tr>
			<td class="title" align="center">表号</td>		
			<td class="title" align="center">相</td>
			<td class="title" align="center">伏</td>
			<td class="title" align="center">安</td>
			<td class="title" align="center">型式</td>
			<td class="title" align="center">厂名</td>
			<td class="title" align="center">厂号</td>
			<td class="title" align="center">常数</td>
			<td class="title" align="center">电压比</td>
			<td class="title" align="center">电流比</td>
			<td class="title" align="center">倍率</td>
			<td class="title" align="center">上表日期</td>
		</tr>
				
		<tr>
			<td class="title"  align="center"><input name="ammeterNo" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterNo()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterX" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterX()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterV" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterV()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterA" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterA()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterType" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterType()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="factoryName" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getFactoryName()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="factoryCcode" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getFactoryCcode()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="coust" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getCoust()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="PT" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getPt()%>" readonly="readonly"></td>
					<td class="title"  align="center"><input name="CT" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getCt()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="rate" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getRate()%>" readonly="readonly"></td>
			<td class="input" ><input name="inputdate"  value="<%=lwAmmeterChangeDto.getInstallDate()%>" id="f_date_shqqs"  size="31" onkeyPress="return pressFullDate(event)" style="width:60px"  onblur="checkFullDate(this);" readonly="readonly"></td>
	<td> <img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
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
        <td class=button><input name="add" type="button" class=button value=" 保 存 " onClick="javascript:addWholeSaleUser();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        --%><td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function modifyWholeSaleUser(){

 fm.action="/iacontact/modifyLWWholeSaleUser.do";
fm.submit();
 
}
function isHaveProrate(){
	if(fm.wholeSaleType.value=="0"){
		aa.style.display="";
		bb.style.display="";
		cc.style.display="";
		
	}if(fm.wholeSaleType.value=="1"){
		aa.style.display="none";
		bb.style.display="none";
		cc.style.display="none";
		
	}


}

function addWholeSaleUser(){

 if(fm.transformerName.value ==''){
   alert('户号不能为空！'); 
   return false;
 }
 if(fm.transformerName.value ==''){
   alert('户号不能为空！'); 
   return false;
 }
 //if(fm.wholeSaleType.value=="0"){
 //if(sum!=1)
	//{
	//alert('该用户的比例分摊不是100%，请重新进行配置！');
	// return false;
	//}
//}
 fm.action="<%=request.getContextPath()%>/modifyLWWholeSaleUser.do";
fm.submit();

}
 function codeQuery(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.LineCode.value+"&TableName=LwPowerLine1";
	alert(vURL);
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
</html>
