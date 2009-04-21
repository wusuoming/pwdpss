<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
	<meta http-equiv=Content-Type content="text/html; charset=gb2312">

	<title>直供乡追收电费批量录入</title>
	<link rel="stylesheet" type="text/css" media="all"
		href="/mimessage/css/calendar.css" title="win2k-cold-1" />
	<app:css />
	<html:base />
	<STYLE>
BODY {
	SCROLLBAR-FACE-COLOR: #ffffff;
	SCROLLBAR-HIGHLIGHT-COLOR: #A9CBED;
	SCROLLBAR-SHADOW-COLOR: #A9CBED;
	SCROLLBAR-3DLIGHT-COLOR: #FFFFFF;
	SCROLLBAR-ARROW-COLOR: #A9CBED;
	SCROLLBAR-TRACK-COLOR: #FFFFFF;
	SCROLLBAR-DARKSHADOW-COLOR: #FFFFFF;
}
</STYLE>
	<script language="Javascript"
		src="/iacontact/common/pub/StaticJavascript.jsp"></script>
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
	<script language="Javascript">
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
   
  function AddForm(){
  alert();  
       var strURL = "<%=request.getContextPath()%>/townSave.do";
       this.location = strURL;
	  
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
	<script language="javascript">
 
</script>
</head>
<body class=interface>
	<html:errors />
	<%Collection formList = (Collection)request.getAttribute("userList"); 
	  String statMonth = (String)request.getAttribute("statMonth");
	  LwAmmeterBookDto lwAmmeterBookDto = (LwAmmeterBookDto)request.getAttribute("lwAmmeterBookDto");
	   %>
	<form name="fm" method="post">
		<table class=common width="500%" cellspacing="1" cellpadding="5">
			<tr class=listtitle align="center">
				<td  colspan="12">
					<B><font size="3">抄表指针批量录入页面</font> </B>
				</td>
			</tr>
			
			<tr>
				<td nowrap colspan="1">
					<b>录入年月</b>
				</td>
				<td  nowrap  colspan="2">
					<input name="statMonth"  type="text" class="text" 
						value=<%=statMonth%> readonly="readonly">
				</td>
				<td  nowrap  colspan="1">
					<b>所在表本</b>
				</td>
				<td  nowrap   colspan="7">
					<%=lwAmmeterBookDto.getBookName()%>
				</td>
				
			</tr>
			  <tr class=listtitle> 
            <td  nowrap colspan="3" >用户信息 </td> 
            <td  nowrap colspan="8">抄表信息</td>   
        </tr>
			<!--人员代码，姓名-->
			<tr  class="listtitle"  >
				<td  nowrap >
				<span class="title">	户号</span>
				</td>
				<td  align="center">
					户名
				</td>
				<td  align="center">
					表号
				</td>
				<td  align="center">
					当月有功指针
				</td>
				<td  align="center">
					上月有功指针
				</td>
				<td nowrap >
				<span class="nerrow">
					倍率
					</span>
				</td>
				<td  align="center">
					抄见电量
				</td>
				<td  align="center">
					变损电量
				</td>
				
				<td  align="center">
					换表电量
				</td>
				<td  align="center">
					退补电量
				</td>
				<td  align="center">
					总电量
				</td>
			</tr>
			<%if(formList!=null){ 
		for (Iterator iterator = formList.iterator(); iterator.hasNext();) {
			LwTownIndicatorDto dto = (LwTownIndicatorDto) iterator.next();
			
			%>
			<tr>
				<td class="title"><%=dto.getUserNo() %>
				</td>
				<input name="userNo" type="hidden" value=<%=dto.getUserNo() %>>
				<td class="title"><%=dto.getUserName() %> 
				</td>
				<td class="title"><%=dto.getAmmeterNo() %>
				</td>
				<td class="title">
					<input name="thisWorkNum" type="text" class="text" width="20"
						value=<%=dto.getThisWorkNum() %> onblur="getSum();"  onclick="selectAll(this)" 
						style="width: 90px">
				</td>
				<td class="title">
					<input name="lastWorkNum" type="text" class="text" width="20"
						value=<%=dto.getLastWorkNum() %> onblur="getSum();"
						style="width: 90px">
				</td>
				<td class="title">
					<input name="rate" type="text" class="text" width="20"
						value=<%=dto.getRate() %> onblur="getSum();" style="width: 60px">
				</td>
				<td class="title">
					<input name="readQuantity" type="text" class="text" width="20"
						value=<%=dto.getReadQuantity() %> style="width: 90px">
				</td>
				<td class="title">
					<input name="tranferLossQuantity" type="text" class="text"
						width="20"  onblur="getSum();"   onclick="selectAll(this)" 
						 value=<%=dto.getTranferLossQuantity() %>
						style="width: 90px">
				</td>
				
				<td class="title">
					<input name="chgAmmeterQuantity" type="text" class="text"
						width="20" value=<%=dto.getChgAmmeterQuantity() %>
						  onblur="getSum();" 
						style="width: 90px">
				</td>
				<td class="title">
					<input name="compensateQuantity" type="text" class="text"  onclick="selectAll(this)" 
						width="20" value=<%=dto.getCompensateQuantity()%>  onblur="getSum();" 
						style="width: 90px">
				</td>
				<td class="title">
				<!-- 使用该字段表示总电量 -->
					<input name="excepQuantity" type="text" class="text" width="20"
						value=<%=dto.getExcepQuantity()%> style="width: 90px">
				</td>
			
			</tr>
			<%
		
		}}
		%>

		</table>
	    <table cellpadding="0" cellspacing="0" width="100%">
			<tr>
				<td  >
					<b>纯电量</b>
				</td>
				<td  >
					<b><input name="pureQuantity" type="text" class="text" width="20"
						 style="width: 90px"></b>
				</td>
				<td   >
					<b>总电量</b>
				</td>
				<td   >
					<b><input name="allQuantity" type="text" class="text" width="20"
						 style="width: 90px"></b>
				    <b><input name="sumTranferLoss" type="hidden" class="text" width="20"
						 style="width: 90px"></b>
				</td>
			</tr>
		</table>
		<table cellpadding="0" cellspacing="0" width="100%">
			<tr>
				<td>
					<table cellpadding="0" cellspacing="0" width="100%">
						<tr>
						<tr class="listtitle" align="center">
							<td class="title" align="center">
								<input type=button class=button name=button0 value="保存"
									onClick="checkNotInput();">
							</td>
						</tr>
					</table>
				</td>
				<td>
					<table cellpadding="0" cellspacing="0" width="100%">
						<tr>
						<tr class="listtitle" align="center">
							<td class="title" align="center">
								<input type=button class=button name=button2 value=" 返回 "
									onClick="history.go(-1);">
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
<script language="Javascript">
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
<script language="javascript">
   function check()
{	
    var count = document.getElementsByName('thisWorkNum').length;
            if(count ==1){
           	fm.readQuantity.value = parseInt((parseFloat(fm.thisWorkNum.value) - parseFloat(fm.lastWorkNum.value))*parseInt(fm.rate.value));
            }else{
            	for(var i=0;i<count;i++){
            		fm.readQuantity[i].value = parseInt(Math.round((parseFloat(fm.thisWorkNum[i].value) - parseFloat(fm.lastWorkNum[i].value))* parseFloat(fm.rate[i].value)));

            	}
            	
            }
}

function checkSumQuantity()
{	
    var count = document.getElementsByName('thisWorkNum').length;
            if(count ==1){
           	fm.excepQuantity.value = parseInt(fm.readQuantity.value) + parseInt(fm.tranferLossQuantity.value)  + parseInt(fm.chgAmmeterQuantity.value) + parseInt(fm.compensateQuantity.value);
            }else{
            	for(var i=0;i<count;i++){
            		fm.excepQuantity[i].value = parseInt(fm.readQuantity[i].value) + parseInt(fm.tranferLossQuantity[i].value)  + parseInt(fm.chgAmmeterQuantity[i].value) + parseInt(fm.compensateQuantity[i].value);

            	}
            	
            }	
}
function getSum(){
check();
checkSumQuantity();
result();
}
  function checkNotInput()
{	
var strURL = "<%=request.getContextPath()%>/townSave.do";
    var count = document.getElementsByName('thisWorkNum').length;

    var n = 0;
            if(count ==1){
           	if(parseFloat(fm.thisWorkNum.value) <= parseFloat(fm.lastWorkNum.value))
           	{
           		if(!confirm('还有没有录入指针的用户，是否要保存')){
           		fm.thisWorkNum.focus();
           		return false;
           		}
           		else{           		   
            fm.action = strURL;
	        fm.submit();
           		}
           		
           	}else{
           fm.action = strURL;
	       fm.submit();
           	}
            
}
else{
		for(var i=0;i<fm.thisWorkNum.length;i++){
			if(parseFloat(fm.thisWorkNum[i].value)<= parseFloat(fm.lastWorkNum[i].value))
			{
			n=n+1;
			}
		}
		if(n>0)
		{
		    if(!confirm('还有没有录入指针的用户，是否要保存')){
           		return false;
           		}else{           		   
             fm.action = strURL;
	         fm.submit();
           		}
		}else{
           	 fm.action = strURL;
	         fm.submit();
           	}

}
}
function result()
{	
    var count = document.getElementsByName('thisWorkNum').length;
         	fm.pureQuantity.value = 0;
     	 	fm.sumTranferLoss.value = 0;
     	 	fm.allQuantity.value = 0;
            if(count ==1){
           	fm.pureQuantity.value = parseInt(fm.readQuantity.value) +  parseInt(fm.chgAmmeterQuantity.value) + parseInt(fm.compensateQuantity.value);
           	fm.allQuantity.value = parseInt(fm.pureQuantity.value) + parseInt(fm.tranferLossQuantity.value);
            }else{
            	for(var i=0;i<count;i++){
            		fm.pureQuantity.value = parseInt(fm.pureQuantity.value) + parseInt(fm.readQuantity[i].value) + parseInt(fm.chgAmmeterQuantity[i].value) + parseInt(fm.compensateQuantity[i].value);
            	    fm.sumTranferLoss.value = parseInt(fm.sumTranferLoss.value)+ parseInt(fm.tranferLossQuantity[i].value);
                	fm.allQuantity.value = parseInt(fm.sumTranferLoss.value)+parseInt(fm.pureQuantity.value);
                	
            	}
            }	
} 
function   selectAll(obj){   
    
        var   array   =   document.getElementsByTagName("input");   
      
        for(var   i   =   0;i<array.length;   i++){   
            if(array[i]   ==   obj){   
        obj.focus(); 
        obj.select();
        break;   
    }   
        }   
  }  

     
</script>
</html:html>
