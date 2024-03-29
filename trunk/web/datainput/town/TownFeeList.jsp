<%@ page contentType="text/html; charset=GBK"%> 
<%@page import="java.util.*"%> 
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.dto.domain.LwTownPriceSummaryDto"%> 
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%> 
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%> 
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%> 
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%> 

<html:html xhtml="true" locale="true"> 
<head> 
 <meta http-equiv=Content-Type content="text/html; charset=gb2312"> 
  
<title>直供乡电费批量计算展现页面</title> 
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
<script language="javascript"> 
   function check() 
{ 
    if(fm.userNo==null){ 
  
    } 
} 
</script> 
</head> 
<body class=interface> 
<html:errors /> 
<%Collection patchFee = (Collection)request.getAttribute("patchFee"); 
String townName = (String)request.getAttribute("townName"); 
String query = (String)request.getAttribute("query");%> 
<form  name="fm" method="post"
    onsubmit="return validateUserQueryForm(this);" enctype="multipart/form-data"> 
    <table class=common width="500%" cellspacing="1" cellpadding="5"> 
        <tr class=listtitle align="center"> 
            <td class=title0 colspan="16"><B><font size="3">直供乡电费批量计算展现页面</font></B></td> 
        </tr> 
       
        <tr class=listtitle> 
            <td  nowrap colspan="3" ><span class="title">用户信息</span> </td> 
            <td  nowrap colspan="7"><span class="title">比例分摊电量</span></td> 
            <td nowrap colspan="3"><span class="title">三金</span></td>        
            <td nowrap colspan="3"><span class="title">合计</span></td>     
        </tr>  
        <tr class=listtitle align="center"> 
            <td  style="width:65px"  width="">户号 </td> 
            <td  style="width:65px" align="center">户名</td> 
            <td  align="center">地址</td> 
            <td  align="center">表号</td> 
            <td  align="center">居民</td> 
            <td  align="center">非居民</td> 
            <td  align="center">农灌</td> 
            <td  align="center">生产</td> 
            <td  align="center">非普</td> 
            <td  align="center">商业</td> 
            
            <td  align="center">农网还贷资金</td> 
            <td  align="center">三峡基金</td> 
            <td  align="center">基金</td> 
            <td  align="center">总电量</td> 
            <td  align="center">电费合计</td> 
            <td  align="center">资金合计</td> 
            
             
        </tr> 
        <%if(patchFee!=null){ 
        for (Iterator iterator = patchFee.iterator(); iterator.hasNext();) { 
            LwTownPriceSummaryDto dto = (LwTownPriceSummaryDto) iterator.next(); 
             
            %>             
        <tr> 
            <td class="title"><%=dto.getUserNo() %> </td> 
            <input name="userNo" type="hidden"  value=<%=dto.getUserNo() %>> 
            <td class="title"><%=dto.getUserName()%> </td> 
            <td class="title"><%=dto.getAddress() %> </td> 
               <td class="title"><%=dto.getAmmeterNo() %> </td> 
            <td class="title"><%=dto.getSumPeopleFee()%></td> 
            <td class="title"><%=dto.getSumNotPeopleFee()%></td> 
            <td class="title"><%=dto.getSumFarmFee()%></td> 
            <td class="title"><%=dto.getSumProduceFee() %></td> 
            <td class="title"><%=dto.getSumIndustryFee()%></td> 
            <td class="title"><%=dto.getSumBizFee() %></td> 
            
            
            <td class="title"><%=dto.getSumDianJin()%></td> 

            <td class="title"><%=dto.getSumSanXia()%></td> 
            <td class="title"><%=dto.getRemark()%></td> 
          
            <td class="title"><%=dto.getSumQuantity()%></td> 
            <td class="title"><%=dto.getSumFee() %></td> 
            <td class="title"><%=dto.getElectricFee()%></td> 
        </tr> 
        <% 
         
        }} 
        %> 
         
    </table> 
     
<table cellpadding="0" cellspacing="0" width="100%"> 
<tr> 

<td> 
    <table cellpadding="0" cellspacing="0" width="100%"> 
        <tr> 
        <tr class="listtitle" align="center">             
            <td class=button align="center"><input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);">        </td> 
        </tr> 
    </table> 
    </td> 
    </tr> 
    </table> 
</form> 
</body> 


</html:html> 
