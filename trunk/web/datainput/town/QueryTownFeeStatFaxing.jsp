<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<%@page import="com.elongway.pss.util.AppConst"%>
<%@page import="com.elongway.pss.ui.control.common.pub.SysUser"%>
<%@page import="com.elongway.pss.dto.domain.LwTownGouDianFaxingDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>

<%
	// 当前日期
	Date currentDate = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
%>

<html:html xhtml="true" locale="true">
<head>
	<meta http-equiv=Content-Type content="text/html; charset=gb2312">

	<title></title>
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
       fm.action = strURL;
	 
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
	if(fm.userNo==null){
	alert(fm.userNo.value);
	}
}
function printCount(){
	 var   strURL;     
	 var tt = fm.dd.value;
	 var obj=document.getElementsByTagName("input");
     var s="";
    for(var i=0;i<obj.length;i++)
    {
         if(obj[i].type!="button")
		    s+=obj[i].value+",";
}
   strURL="<%=request.getContextPath()%>/queryTownStatPrint.do?s="+s;  
    winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");   
}

function save(){
	 var   strURL;     
	 var statMonth = fm.dd.value;
	 strURL="<%=request.getContextPath()%>/queryTownFaxingSave.do?statMonth="+statMonth; 
	 fm.action = strURL;
	 alert(fm.action);
	 fm.submit(); 
      
}


function result()
{	
    var count = document.getElementsByName('pureFee').length;
    var sumPurefee = 0.0;
    var sumfee1 = 0.0;
    var sumfeeTax = 0.0;
    var sumsanxia = 0.0;
    var sumsanxiaTax = 0.0;
    var sumdianjin = 0.0;
    var sumdianjinTax = 0.0;
    var sumjijin = 0.0;
    var sumjijinTax = 0.0;
            if(count ==1){
            fm.feeTax.value = parseFloat(fm.pureFee.value) * 0.17;
            fm.sanxiaTax.value = parseFloat(fm.sanxia.value) * 0.17;
            fm.dianjinTax.value = parseFloat(fm.dianjin.value) * 0.17;
            fm.jijinTax.value = parseFloat(fm.jijin.value)* 0.17;
            fm.sumFee.value = parseFloat(fm.pureFee.value)+parseFloat(fm.feeTax.value)+parseFloat(fm.dianjin.value)+parseFloat(fm.dianjinTax.value)+parseFloat(fm.jijin.value)+parseFloat(fm.jijinTax.value)+parseFloat(fm.sanxia.value)+parseFloat(fm.sanxiaTax.value);
            
            }else{
            	for(var i=0;i<count-1;i++){
                fm.feeTax[i].value = (parseFloat(fm.pureFee[i].value) * 0.17).toFixed(2);
                fm.sanxiaTax[i].value = (parseFloat(fm.sanxia[i].value) * 0.17).toFixed(2);
                fm.dianjinTax[i].value = (parseFloat(fm.dianjin[i].value) * 0.17).toFixed(2);
                fm.jijinTax[i].value = (parseFloat(fm.jijin[i].value)* 0.17).toFixed(2);
                fm.sumFee[i].value = (parseFloat(fm.pureFee[i].value)+parseFloat(fm.feeTax[i].value)+parseFloat(fm.dianjin[i].value)+parseFloat(fm.dianjinTax[i].value)+parseFloat(fm.jijin[i].value)+parseFloat(fm.jijinTax[i].value)+parseFloat(fm.sanxia[i].value)+parseFloat(fm.sanxiaTax[i].value)).toFixed(2);
              
                sumPurefee = (parseFloat(sumPurefee) + parseFloat(fm.pureFee[i].value)).toFixed(2);
    
                sumfeeTax = (parseFloat(sumfeeTax) + parseFloat(fm.feeTax[i].value)).toFixed(2);
				
				
                sumfee1 = (parseFloat(sumfee1) + parseFloat(fm.sumFee[i].value)).toFixed(2);

     			sumsanxia = (parseFloat(sumsanxia) + parseFloat(fm.sanxia[i].value)).toFixed(2);
     				
    			sumsanxiaTax = (parseFloat(sumsanxiaTax)+parseFloat(fm.sanxiaTax[i].value)).toFixed(2);
    					
    			sumdianjin = (parseFloat(sumdianjin)+parseFloat(fm.dianjin[i].value)).toFixed(2);
			    sumdianjinTax = (parseFloat(sumdianjinTax)+parseFloat(fm.dianjinTax[i].value)).toFixed(2);
    			sumjijin =(parseFloat(sumjijin)+ parseFloat(fm.jijin[i].value)).toFixed(2);
    		
    			sumjijinTax = (parseFloat(sumjijinTax)+parseFloat(fm.jijinTax[i].value)).toFixed(2);
            	}
            				fm.pureFee[count-1].value = parseFloat(sumPurefee);
							fm.feeTax[count-1].value =parseFloat(sumfeeTax);
							fm.sumFee[count-1].value= parseFloat(sumfee1);    
							fm.sanxia[count-1].value= parseFloat(sumsanxia);
							fm.sanxiaTax[count-1].value= parseFloat(sumsanxiaTax);
							fm.dianjin[count-1].value= parseFloat(sumdianjin);
							fm.dianjinTax[count-1].value= parseFloat(sumdianjinTax);
							fm.jijin[count-1].value= parseFloat(sumjijin);
							fm.jijinTax[count-1].value= parseFloat(sumjijinTax);
            	
            	
            }	
} 

</script>
</head>
<body class=interface>
	&nbsp;
	<html:errors />
	<%
	String requestCom = (String) request
					.getAttribute("company");
	String requestStatMonth = (String) request
					.getAttribute("statMonth");
		Collection billList = (Collection) request
					.getAttribute("billList");
			SysUser user = (SysUser) session
					.getAttribute(AppConst.SYSUSER_SESSION);
			String inputDate = (String) request.getAttribute("statMonth");
	%>
	<form name="fm" method="post" onsubmit="return validateUserQueryForm(this);">
		<table class=common width="500%" cellspacing="0" cellpadding="5"
			border="1">
			<tr>
				<td class=title0 colspan="11" style="display: none">
					
					<input type="hidden" name="dd" value="<%=inputDate%>">
					<br>
					<br>
				</td>
			</tr>
			<%
				Collection resultList = (Collection) request
							.getAttribute("queryResult");
					for (Iterator iterator = resultList.iterator(); iterator
							.hasNext();) {
						LwTownGouDianFaxingDto lwTownGouDianFaxingDto = (LwTownGouDianFaxingDto) iterator.next();
			%>

			<tr>
				<td class=title0 colspan="11">
					<font size="2"><%=lwTownGouDianFaxingDto.getTownName()%><%=lwTownGouDianFaxingDto.getStatMonth()%>电费电量发行单</font>
				</td>
			</tr>

			<!--人员代码，姓名-->
			<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">售电量</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">纯电费</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电费税</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电金</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电金税</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">三峡</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">三峡税</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">基金</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">基金税</font> </span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">总计</font> </span>
					<br>
				</td>

			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwTownGouDianFaxingDto.getTownName()%></font>
					<input type="hidden" name="company" value="<%=lwTownGouDianFaxingDto.getTownName()%>">
					<input type="hidden" name="comCode" value="<%=lwTownGouDianFaxingDto.getTownCode()%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><%=lwTownGouDianFaxingDto.getPowerQuantity()%></span>
					<input type="hidden" name="sumPower" value="<%=lwTownGouDianFaxingDto.getPowerQuantity()%>">
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><input type="text" name="pureFee"
							value="<%=lwTownGouDianFaxingDto.getPureFee()%>" style="width: 80px" > </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><input type="text" name="feeTax"
							value="<%=lwTownGouDianFaxingDto.getPowerFeeTax()%>" style="width: 80px" > </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><input type="text" name="dianjin"
							value="<%=lwTownGouDianFaxingDto.getPureDianJin()%>" style="width: 80px" > </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><input type="text" name="dianjinTax"
							value="<%=lwTownGouDianFaxingDto.getDianJinTax()%>" style="width: 80px" > </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><input type="text" name="sanxia"
							value="<%=lwTownGouDianFaxingDto.getPureSanXia()%>" style="width: 80px" > </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><input type="text" name="sanxiaTax"
							value="<%=lwTownGouDianFaxingDto.getSanXiaTax()%>" style="width: 80px" > </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><input type="text" name="jijin"
							value="<%=lwTownGouDianFaxingDto.getPureJiJin()%>" style="width: 80px" > </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><input type="text" name="jijinTax"
							value="<%=lwTownGouDianFaxingDto.getJiJinTax()%>" style="width: 80px" > </span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><input type="text" name="sumFee"
							value="<%=lwTownGouDianFaxingDto.getSumFee()%>" style="width: 80px" > </span>
					<br>
				</td>

			</tr>
			<tr>
				<td colspan="4">
					制表:
				</td>
				<td colspan="4">
					审核:
				</td>

				<td colspan="3">
					负责人:
				</td>
			</tr>

			<%
				}
			%>

		</table>

		<table cellpadding="0" cellspacing="0" width="100%">
			<tr>
			<tr class="listtitle" align="center">
				
		 	<td class=button>
					<input name="add" type="button" class=button value=" 打 印 "
						onClick="printCount();">
				</td> 
				<td class=button align="center">
					<input type=button class=button name=button2 value=" 返回 "
						onClick="history.go(-1);">
				</td>
			</tr>
		</table>

	</form>
</body>

</html:html>
