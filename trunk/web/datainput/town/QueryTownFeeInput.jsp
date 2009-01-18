<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="com.elongway.pss.dto.domain.LwTownPriceSummaryDto" %>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.bl.facade.BLLwDcodeFacade"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.elongway.pss.dto.domain.LwDcodeDto"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>统计直供乡电费信息</title>
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
<script language="javascript"	src="/iacontact/common/pub/js/calendar.js"></script>
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
   
  function statForm(){
       var strURL = "<%=request.getContextPath()%>/saveAndStat.do?action=Create";
       fm.action = strURL;
	 fm.submit();
        } 
  function QueryForm(){  
       var strURL = "<%=request.getContextPath()%>/queryAmmeter.do?method=queryAmmeter";
       fm.action = strURL;
	  fm.submit();
        } 
</script>
</head>
<body class=interface>
<html:errors />
<% UITownCalForm form = (UITownCalForm)request.getAttribute("uiTownCalForm");
	String userNo = "";
	String lineCode = "";
	String thisWorkNum = "";
	String statMonth =  "";
	if(form != null){
	statMonth = form.getStatMonth();
	userNo = form.getUserNo();
	lineCode = form.getLineCode();
	thisWorkNum = form.getThisWorkNum();
	}
	String firstquery = (String )request.getAttribute("firstquery") ;
%>
<form  name="fm"
	onsubmit="return validateUserQueryForm(this);">
	<html:hidden property="pageNo" value="1" />
	<table width="100%">
		<tr>
			<td height=20px class="input">时间填写格式为：2007-03-29</td>
		</tr>
	</table>
	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>统计直供乡电费信息</B></td>
		</tr>
		<tr>
			<td class="blue" colspan="4"></td>
		</tr>
		<!--人员代码，姓名-->
		 <% BLLwDcodeFacade blLwDcodeFacade = new BLLwDcodeFacade();
             Collection collection = blLwDcodeFacade.findByConditions(" codetype = 'TownCode'");       
       %>
		<tr>
			<td class=title>所属乡镇</td>
		  	<td class=input><select name="TownCode"  class="input">
		  	<% 
		  	String townCode = (String)request.getAttribute("townCode");
		  	for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwDcodeDto o = (LwDcodeDto) iterator.next();
			if(townCode.equals(o.getCodeCode())){
			%>
				  <option value=<%=o.getCodeCode() %> selected="selected"><%=o.getCodeCName() %></option> 
			<%}else{ %>    
			 <option value=<%=o.getCodeCode() %>><%=o.getCodeCName() %></option> 
			 <%}
			 } %>
       </select>	


</td>
				
			<td class=title>统计年月</td>
			<td class=title>
			<td class="input">
			<% if(firstquery!=null){%>
				<input name="statMonth" type="text" class="text" width="20" value="">
				<%}else {%>
				<input name="statMonth" type="text" class="text" width="20" value=<%=statMonth%>>
				<%} %>
				</td>
		</tr>

		
	</table>
	<p><br>
	</p>
	<!-- 按钮的显示-->
	<%
	if(firstquery !=null){%>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button
				name=button0 value="统计" onClick="statForm();"></td>
		</tr>
	</table>
	<%} 
	else{
	LwTownPriceSummaryDto dto = (LwTownPriceSummaryDto)request.getAttribute("lwTownPriceSummaryDto");
			/** 农灌电量 */
		double farmUseQuantity = 0.0;
		// 农灌电费
		double farmUseFee = 0.0;

		
		// 生产电量
		double productQuantity = 0.0;
		// 生产电费
		double productFee = 0.0;

		
		// 居民电量
		double peopleUseQuantity = 0.0;
		// 居民电费
		double peopleUseFee = 0.0;

		
		// 非居民电量
		double notPeopleUseQuantity = 0.0;
		// 非居民电费
		double notPeopleUseFee = 0.0;

		
		// 非工业电量
		double industryQuantity = 0.0;
		// 非工业电费
		double industryFee = 0.0;

		
		// 商业电量
		double bizQuantity = 0.0;
		// 商业电费
		double bizFee = 0.0;
	
	    double farmDianJin = 0.0;
		double farmSanXia = 0.0;
		double farmJiJin = 0.0;
		double farmKuQu = 0.0;
		
		
		double industryDianJin = 0.0;
		double industrySanXia = 0.0;
		double industryJiJin = 0.0;
		double industryKuQu = 0.0;
		
		double produceDianJin = 0.0;
		double produceSanXia = 0.0;
		double produceJiJin = 0.0;
		double produceKuQu = 0.0;
		
		double peopleDianJin = 0.0;
		double peopleSanXia = 0.0;
		double peopleJiJin = 0.0;
		double peopleKuQu = 0.0;
		
		double notPeopleDianJin = 0.0;
		double notPeopleSanXia = 0.0;
		double notPeopleJiJin = 0.0;
		double notPeopleKuQu = 0.0;		
		
		double bizDianJin = 0.0;
		double bizSanXia = 0.0;
		double bizJiJin = 0.0;
		double bizKuQu = 0.0;
		
		// 总电量
		double sumPower = 0.0;
		// 总电费
		double sumPowerFee = 0.0;
		// 总电金
		double sumDianJin = 0.0;
		// 总三峡
		double sumSanXia = 0.0;
		// 总基金
		double sumJiJin = 0.0;
		// 总库区
		double sumKuQu = 0.0;
		
		// 总农灌
		 double   sumFarmFee = 0.0;
		// 总居民
		 double   sumPeopleFee = 0.0;
		// 总非居民
		 double   sumNotPeopleFee = 0.0;
		// 总农业生产
		 double   sumProduceFee = 0.0;
		// 总非普工业
		 double   sumIndustryFee = 0.0;
		// 总商业
		 double   sumBizFee = 0.0;
		 // 总电费合计
		 double electricFee = 0.0;
			
			// 农灌：电量、电费、四金
		    farmUseQuantity =   dto.getFarmQuantity();
		    farmUseFee =  dto.getFarmFee();
		    farmDianJin =  dto.getFarmDianJin();
		    farmJiJin =  dto.getFarmJiJin();
		    farmSanXia =  dto. getFarmSanXia();	
		    farmKuQu = dto.getFarmKuQu();		   
		    
		    // 非普工业：电量、电费、四金
		    industryQuantity = dto.getIndustryQuantity();
		    industryFee = dto.getIndustryFee();
		    industryDianJin = dto.getIndustryDianJin();
		    industryJiJin =  dto.getIndustryJiJin();
		    industrySanXia = dto. getIndustrySanXia();	
		    industryKuQu = dto.getIndustryKuQu();		    
		    
		    // 农业生产：电量、电费、四金
		    productQuantity = dto.getProduceQuantity();
		    productFee = dto.getProduceFee();
		    produceDianJin = dto.getProduceDianJin();
		    produceJiJin = dto.getProduceJiJin();
		    produceSanXia = dto.getProduceSanXia();	
		    produceKuQu = dto.getPeopleKuQu();		    
		    
		    // 商业：电量、电费、四金
		    bizQuantity = dto.getBizQuantity();
		    bizFee =  dto.getBizFee();
		    bizDianJin = dto.getBizDianJin();
		    bizJiJin =  dto.getBizJiJin();
		    bizSanXia = dto. getBizSanXia();	
		    bizKuQu = dto.getPeopleKuQu();
		    
		    // 居民：电量、电费、四金
		    peopleUseQuantity = dto.getPeopleQuantity();
		    peopleUseFee =  dto.getPeopleFee();
		    peopleDianJin =  dto.getPeopleDianJin();
		    peopleJiJin =  dto.getPeopleJiJin();
		    peopleSanXia =  dto.getPeopleFeeSanXia();
		    peopleKuQu =  dto.getPeopleKuQu();
		   
		    // 非居民：电量、电费、四金
		    notPeopleUseQuantity = dto.getNotPeopleQuantity();
		    notPeopleUseFee =  dto.getNotPeopleFee();
		    notPeopleDianJin =  dto.getNotPeopleDianJin();
		    notPeopleJiJin =  dto.getNotPeopleJiJin();
		    notPeopleSanXia =  dto.getNotPeopleFeeSanXia();
		    notPeopleKuQu =  dto.getNotPeopleKuQu();
		    
		    // 电量维度的合计 
		    // --总电量
		    sumPower = dto.getSumQuantity();
			// --总电费
			sumPowerFee = dto.getSumFee();
			// --总电金
			sumDianJin = dto.getSumDianJin();
			// --总三峡
			sumSanXia = dto.getSumSanXia();
			// --总基金
			sumJiJin = dto.getSumJiJin();
			// --总库区
			sumKuQu = dto.getSumKuQu();
		   
		    // 比例分摊维度的合计
		    // 总农灌
			 sumFarmFee = dto.getSumFarmFee();
			// 总居民
			 sumPeopleFee = dto.getSumPeopleFee();
			// 总非居民
			 sumNotPeopleFee = dto.getSumNotPeopleFee();
			// 总农业生产
			 sumProduceFee = dto.getSumProduceFee();
			// 总非普工业
			 sumIndustryFee = dto.getSumIndustryFee();
			// 总商业
		 	sumBizFee = dto.getSumBizFee();
		 	// 总电费合计
		    electricFee = dto.getElectricFee();
	
	%>	
	<table class="common" border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td class="title0" colspan="10"><p><B>用户比例分摊信息</B></p></td>
		</tr>
		<tr class=listtitle>
	    	<td nowrap ><span class="title">比例分摊</span></td>
		    <td nowrap ><span class="title">电量</span></td>
			<td nowrap ><span class="title">电费</span></td>
			<td nowrap ><span class="title">电金</span></td>
			<td nowrap ><span class="title">三峡</span></td>
			<td nowrap ><span class="title">基金</span></td>
			<td nowrap ><span class="title">合计</span></td>
		
		</tr>
		
		<tr  class=listtitle>
		<td ><span class="title">居民</span></td>
			<td nowrap ><%= peopleUseQuantity%></td>
			<td nowrap ><%= peopleUseFee%></td>
			<td nowrap ><%= peopleDianJin%></td>
			<td nowrap ><%= peopleSanXia%></td>
			<td nowrap ><%= peopleJiJin%></td>
			<td nowrap ><%= sumPeopleFee%></td>	
		</tr>
		<tr  class="listtitle">
		<td  ><span class="title">非居民</span></td>
			<td nowrap ><%= notPeopleUseQuantity%></td>
			<td nowrap ><%= notPeopleUseFee%></td>
			<td nowrap ><%= notPeopleDianJin%></td>
			<td nowrap ><%= notPeopleJiJin%></td>
			<td nowrap ><%= notPeopleSanXia%></td>
			<td nowrap ><%= sumNotPeopleFee%></td>	
		</tr>
	 
		<tr  class="listtitle">
		<td  class=listtitle ><span class="title">农灌</span></td>
			<td nowrap ><%= farmUseQuantity%></td>
			<td nowrap ><%= farmUseFee%></td>
			<td nowrap ><%= farmDianJin%></td>
			<td nowrap ><%= farmJiJin%></td>
			<td nowrap ><%= farmSanXia%></td>
			<td nowrap ><%= sumFarmFee%></td>	
		</tr>

		<tr  class="listtitle">
		<td  ><span class="title">农业生产</span></td>
			<td  nowrap ><%= productQuantity%></td>
			<td  nowrap><%= produceDianJin%></td>
			<td nowrap ><%= produceJiJin%></td>
			<td nowrap ><%= productFee%></td>
			<td nowrap ><%= produceSanXia%></td>	
			<td nowrap ><%= sumProduceFee%></td>		
		</tr>
		<tr  class="listtitle">
		
		<td  ><span class="title">商业</span></td>
			<td  nowrap ><%= bizQuantity%></td>
			<td  nowrap><%= bizFee%></td>
			<td nowrap ><%= bizDianJin%></td>
			<td nowrap ><%= bizJiJin%></td>
			<td nowrap ><%= bizSanXia%></td>
			<td nowrap ><%= sumBizFee%></td>		
		</tr>
		<tr  class="listtitle">
		<td  ><span class="title">非普工业</span></td>
			<td  nowrap ><%= industryQuantity%></td>
			<td  nowrap><%= industryFee%></td>
			<td nowrap ><%= industryDianJin%></td>
			<td nowrap ><%= industryJiJin%></td>
			<td nowrap ><%= industrySanXia%></td>
			<td nowrap ><%= sumIndustryFee%></td>		
		</tr>
		<tr  class="listtitle">
		<td  ><span class="title">合计</span></td>
			<td nowrap ><%= sumPower%></td>
			<td nowrap><%= sumPowerFee%></td>
			<td nowrap ><%= sumDianJin%></td>
			<td nowrap ><%= sumSanXia%></td>
			<td nowrap ><%= sumJiJin%></td>
			<td nowrap ><%= electricFee%></td>		
		</tr>
		
	</table>
	<table cellpadding="0" cellspacing="0" width="100%">
		<tr>
		<tr class="listtitle" align="center">			
			<td class=button align="center"><input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);">		</td>
		</tr>
	</table>
	<% } %>
</form>
</body>

<script type="text/javascript">
    Calendar.setup({
        inputField     :    "f_date_shqqs",     // id of the input field
        button         :    "f_trigger_shqqs",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    }); 
     Calendar.setup({
        inputField     :    "f_date_shqzz",     // id of the input field
        button         :    "f_trigger_shqzz",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    });
    Calendar.setup({
        inputField     :    "f_date_shhqs",     // id of the input field
        button         :    "f_trigger_shhqs",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    }); 
    Calendar.setup({
        inputField     :    "f_date_shhzz",     // id of the input field
        button         :    "f_trigger_shhzz",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    });  
    Calendar.setup({
        inputField     :    "f_date_shpqs",     // id of the input field
        button         :    "f_trigger_shpqs",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    });  
    Calendar.setup({
        inputField     :    "f_date_shpzz",     // id of the input field
        button         :    "f_trigger_shpzz",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    });  
    Calendar.setup({
        inputField     :    "f_date_chlqs",     // id of the input field
        button         :    "f_trigger_chlqs",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    }); 
    Calendar.setup({
        inputField     :    "f_date_chlzz",     // id of the input field
        button         :    "f_trigger_chlzz",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    });    
</script>
</html:html>
