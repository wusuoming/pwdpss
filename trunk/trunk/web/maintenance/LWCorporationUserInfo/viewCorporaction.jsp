
<%--
*********
******************
��Ӵ�ҵ�û���Ϣҳ��  
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
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwUserLineDto"/>
<jsp:directive.page import="java.util.Collection"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwAmmeterChangeDto"/>




  
<title></title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<html>
<head>



<!--�Զ������б�JS2-->

</head>
<body id="all_title">
  
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    
      <form name="fm" method="post">
        <table id="table_userMain" class="fix_table" border="0">
         <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>�޸Ĵ�ҵ�õ��û�</B></td>
		</tr>
		<%
		LwCoporationUserInfoDto lwCoporationUserInfoDto=(LwCoporationUserInfoDto)request.getAttribute("lwCoporationUserInfoDto");
		
		 %>
          <tr>
            <td class=title>����</td>
            <td class=input><%=lwCoporationUserInfoDto.getUserNo()%></td>
            <td class=input style="display: none"><input name="UserNo" type="hidden" class="text" value="<%=lwCoporationUserInfoDto.getUserNo()%>"></td>
            <td class=title>����</td>
            <td class=input><input name="UserName" readOnly=true type="text" class="text" value="<%=lwCoporationUserInfoDto.getUserName()%>">&nbsp;<img
							src="../../iacontact/images/redstar.gif" ></td>			
          </tr>
		  <tr>
		  <td class=title>��ַ</td>
            <td class=input><input name="Address" readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getAddress()%>"></td>
			  <td class=title>������</td>
            <td class=input><input name="accountBank" readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getAccountBank()%>"/>
              
          
            
          
       </tr>
		  
				<tr>
				<td class=title>˰��</td>
            <td class=input><input name="taxNo" readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getTaxNo()%>"></td>
			  <td class=title>�����ʺ�</td>
            <td class=input><input name="accountNo" readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getAccountNo()%>"/>
				</tr>  
				  
				 
				  
				  
        
		
		  <tr>

			    <td class=title>��ѹ�ȼ�</td>
            <td class=input><select name="voltage"  class="input" disabled>
		  	
			
			  <option value=1 <%if(lwCoporationUserInfoDto.getVoltage().equals("1")){ %>selected="selected"<%} %>>����1KV</option> 
			  
			
			  <option value=2 <%if(lwCoporationUserInfoDto.getVoltage().equals("2")){ %>selected="selected"<%} %>>1-10KV</option> 
			  
			
			  <option value=3 <%if(lwCoporationUserInfoDto.getVoltage().equals("3")){ %>selected="selected"<%} %>>35-110KV����</option> 
			  
			
			  <option value=4 <%if(lwCoporationUserInfoDto.getVoltage().equals("4")){ %>selected="selected"<%} %>>110-220KV������</option> 
			  
			
			  <option value=5 <%if(lwCoporationUserInfoDto.getVoltage().equals("5")){ %>selected="selected"<%} %>>220KV������</option> 
			  
       </select>	


</td>
			   <td class=title>������·</td>
            <td class=input><input name="lineCode"  readOnly=truetype="text" value="<%=lwCoporationUserInfoDto.getLineNo()%>" 
							 ></td> 
				</tr>  
				<tr>
		<td class=title>����/����</td>
          
            <td class=input><select name="industryType"  class="input" onchange="corn()" disabled>
		  	
			
			  <option value=1 <%if(lwCoporationUserInfoDto.equals("1")){ %>selected="selected"<%} %>>����</option> 
			  
			
			  <option value=2 <%if(lwCoporationUserInfoDto.equals("2")){ %>selected="selected"<%} %>>����</option> 
	
			  
       </select>	


</td>
            
               <td class=title id="c1" style="display: ">��������</td>
            <td class=input id="c2" style="display: "><input name="rongliangPower"  readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getRongliangPower()%>"></td>
           <td class=title id="n1" style="display:none ">��������</td>
            <td class=input id="n2" style="display:none "><input name="xuliangRate" type="text" readOnly=true  class="text" value="<%=lwCoporationUserInfoDto.getNeedRate()%>"></td>
            
           
		  </tr>
		 <tr>
		  	<td class=title >����ʱ�ĵ��</td>
		  	<td class="input" ><select name="shengChanpriceStyle"  class="input" disabled >
		  	
			
			  <option value=0 <%if(lwCoporationUserInfoDto.getShengChanPrice().equals("0")){ %>selected="selected"<%} %>>��ҵ</option> 
			  
			
			  <option value=1  <%if(lwCoporationUserInfoDto.getShengChanPrice().equals("1")){ %>selected="selected"<%} %>>����</option> 
			  
			
			  <option value=2 <%if(lwCoporationUserInfoDto.getShengChanPrice().equals("2")){ %>selected="selected"<%} %>>��ʯ</option> 
			  
			
			  <option value=3 <%if(lwCoporationUserInfoDto.getShengChanPrice().equals("3")){ %>selected="selected"<%} %>>����</option> 
			  
			
			 
			  
       </select>	</td>
        <td class="input" ><select name="shengChanKV"  class="input" disabled>
		  	
			
			  
			
			  <option value=2 <%if(lwCoporationUserInfoDto.getShengChanKV().equals("2")){ %>selected="selected"<%} %>>1-10KV</option> 
			  
			
			  <option value=3 <%if(lwCoporationUserInfoDto.getShengChanKV().equals("3")){ %>selected="selected"<%} %>>35-110KV����</option> 
			  
			
			  <option value=4 <%if(lwCoporationUserInfoDto.getShengChanKV().equals("4")){ %>selected="selected"<%} %>>110-220KV������</option> 
			  
			
			  <option value=5>220KV������</option> 
			 
			  
       </select>	</td>
        <td class="input" >
       
</tr>
<tr>
       <td class=title >ͣ��ʱ�ĵ��</td>
		  	<td class="input" ><select name="tingChanpriceStyle"  class="input" disabled>
		  	
			
			  <option value=0 <%if(lwCoporationUserInfoDto.getTingChanPrice().equals("0")){ %>selected="selected"<%} %>>��ҵ</option> 
			  
			
			  <option value=1 <%if(lwCoporationUserInfoDto.getTingChanPrice().equals("1")){ %>selected="selected"<%} %>>����</option> 
			  
			
			  <option value=2 <%if(lwCoporationUserInfoDto.getTingChanPrice().equals("2")){ %>selected="selected"<%} %>>��ʯ</option> 
			  
			
			  <option value=3 <%if(lwCoporationUserInfoDto.getTingChanPrice().equals("3")){ %>selected="selected"<%} %>>����</option> 
			  
			
			 
			  
       </select>	</td>
       <td class="input" ><select name="tingChanKV"  class="input" disabled>
		  	
			 	 	
			  
			
			  <option value=2 <%if(lwCoporationUserInfoDto.getTingChanKV().equals("2")){ %>selected="selected"<%} %>>1-10KV</option> 
			  
			
			  <option value=3 <%if(lwCoporationUserInfoDto.getTingChanKV().equals("3")){ %>selected="selected"<%} %>>35-110KV����</option> 
			  
			
			  <option value=4 <%if(lwCoporationUserInfoDto.getTingChanKV().equals("4")){ %>selected="selected"<%} %>>110-220KV������</option> 
			  
			
			  <option value=5 <%if(lwCoporationUserInfoDto.getTingChanKV().equals("5")){ %>selected="selected"<%} %>>220KV������</option> 
			 
			  
       </select>	</td>
        <td class="input" >
		  </tr>
		<tr>
		  	<td class=title >ͣ���������</td>
		  	<td class=input><input name="tingChanRongliangPrice" readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getTingChanrongLiangPrice() %>"></td>
		  	<td class=title >�����������</td>
		  	<td class=input><input name="shengChanRongliangPrice" readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getShengChanrongLiangPrice() %>"></td>
		  </tr>
		  <%
		  	if(lwCoporationUserInfoDto.getShengChandianJinPrice()==lwCoporationUserInfoDto.getTingChandianJinPrice() ){
		  	%>
		  	<tr>
		  	<td class=title >�����</td>
		  	<td class=input><input name="tingChanDianJinPrice" readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getTingChandianJinPrice() %>"></td>
		  	
		  	<td class=input>
		  	<td class=input>
		  </tr>
		  	
		  	
		  	<% 
		  	}else{
		   %>
		  <tr>
		  	<td class=title >����ʱ�����</td>
		  	<td class=input><input name="tingChanDianJinPrice" readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getTingChandianJinPrice() %>"></td>
		  	<td class=title >ͣ��ʱ�����</td>
		  	<td class=input><input name="shengChanDianJinPrice" readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getShengChandianJinPrice() %>"></td>
		  </tr>
		  <%} %>
		  <tr>
		  	<td class=title >����������ʽ</td>
		  	<td class="input" ><select name="pepoleFlag"  class="input" onchange="borc()" disabled>
			  <option value="1" <%if(lwCoporationUserInfoDto.getPepoleFlag().equals("1")){ %>selected="selected"<%} %>>����</option> 
			  <option value="2" <%if(lwCoporationUserInfoDto.getPepoleFlag().equals("2")){ %>selected="selected"<%} %>>����</option> 
       </select>	</td>
       <td class=title id="a1" style="display: none">����</td>
		  	<td class=input id="a2"  style="display: none"><input name="pepolePower" readOnly=true type="text"  class="text" value="<%=lwCoporationUserInfoDto.getPepolePower()%>"></td>
		  	<td class="input" id="b1" style="display: ">
		  	<td class="input" id="b2" style="display: ">
		  </tr>
		  <tr>
		  	 <td class=title >�������</td>
		  	<td class=input><input name="lineLossScale" type="text" readOnly=true  class="text" value="<%=lwCoporationUserInfoDto.getLineLossScale()%>">%</td>
		  <td class=title >������</td>
		  	<td class="input" ><select name="dianJinPower"  class="input" disabled>
			  <option value=1 <%if(lwCoporationUserInfoDto.getDianJinPower().equals("1")){ %>selected="selected"<%} %>>�ܵ���</option> 
			  <option value=2 <%if(lwCoporationUserInfoDto.getDianJinPower().equals("2")){ %>selected="selected"<%} %>>�������</option> 
       </select>	</td>
		  </tr>
        </table>
<!--һ��ѵİ�ť-->
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
       <td class=button><input name="back" readOnly=true type="button" class=button value="����" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>
 <table width="100%">
		<tr class=listtitle align="center">
			<td class=title0 colspan="13"><B>���õ����Ϣ</B></td>
		</tr>
		<tr>
			<td class="title" align="center">���</td>		
			<td class="title" align="center">��</td>
			<td class="title" align="center">��</td>
			<td class="title" align="center">��</td>
			<td class="title" align="center">��ʽ</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">��ѹ��</td>
			<td class="title" align="center">������</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">�õ�����</td>
				<td class="title" align="center">�ϱ�����</td>
				<td class="title" align="center"></td>
		</tr>
		<%
			List list2=(List)request.getAttribute("au");
			Iterator au=list2.iterator();
			LwAmmeterChangeDto lwAmmeterChangeDto=new LwAmmeterChangeDto();
			while(au.hasNext()){
			lwAmmeterChangeDto=(LwAmmeterChangeDto)au.next();
		 %>	
		<tr>
			<td class="title"  align="center"><input name="ammeterNo" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterNo()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterX" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterX()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterV" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterV()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterA" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterA()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterType" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterType()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="factoryName" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getFactoryName()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="factoryCcode" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getFactoryCcode()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="coust" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getCoust()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="PT" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getPt() %>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="CT" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getCt()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="rate" readOnly=true type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getRate()%>" readonly="readonly"></td>
			<%
				if(lwAmmeterChangeDto.getUseStyle().equals("0")){
			 %>
			<td class="title"  align="center" ><input type="text" class="text" style="width:60px" name="useStyle" value="��ҵ" readonly="readonly">
			<%} %>
			<%
				if(lwAmmeterChangeDto.getUseStyle().equals("1")){
			 %>
			<td class="title"  align="center" ><input type="text" class="text" style="width:60px" name="useStyle" value="�Ǿ�������" readonly="readonly">
			<%} %>
			<td class="input" ><input name="inputdate"  id="f_date_shqqs"  size="31"     readonly="readonly" style="width:60px" value="<%=lwAmmeterChangeDto.getInstallDate()%>"></td>
	<%--<td> <img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
					style="cursor: pointer; border: 1px solid #0083da;"
					title="Date selector"					
					onmouseover="this.style.background='#4CA8EB';"
					onmouseout="this.style.background=''" /></td>
		--%></tr>
		<%} %>
			</table>
		<table>
<!--Button End-->
</form>
<script language="javascript">
function borc(){
	if(fm.pepoleFlag.value=="1"){
	b1.style.display="";
	b2.style.display="";
	a1.style.display="none";
	a2.style.display="none";
	}
	if(fm.pepoleFlag.value=="2"){
	b1.style.display="none";
	b2.style.display="none";
	a1.style.display="";
	a2.style.display="";
	}

}
function editCorporationUser(){
	if(fm.UserName.value ==''){
   alert('�������ҵ������'); 
   return false;
 }
 if(!confirm('�������������Ƿ�������ȷ��') ){
return;
} 
 fm.action="/iacontact/editLWCorporation.do";
fm.submit();
 
}
function industryType1(){

if(fm.UserStyle.value== "1"){
 
 aaa.style.display = "none"; 
 bbb.style.display = "none";
}
if(fm.UserStyle.value== "3"){
 
 aaa.style.display = "none"; 
 bbb.style.display = "none";
}
 if(fm.UserStyle.value== "2"){
 aaa.style.display = ""; 
 bbb.style.display = "";
}
}
function corn(){
	if(fm.industryType.value=="1"){
	c1.style.display="";
	c2.style.display="";
	n1.style.display="none";
	n2.style.display="none";
	}
	if(fm.industryType.value=="2"){
	c1.style.display="none";
	c2.style.display="none";
	n1.style.display="";
	n2.style.display="";
	}

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
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.ammeterNo.value+"&TableName=LwAmmeterNo3";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
function codeQueryAmmeter1(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.PepoleAmmeterNo.value+"&TableName=LwAmmeterNo";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
function isHavePepole(){
if(fm.ifhavepepole.value=="0"){
 pp.style.display="none";
}
if(fm.ifhavepepole.value=="1"){
 pp.style.display="";
}
function corn(){
	if(fm.industryType.value=="1"){
	c1.style.display="";
	c2.style.display="";
	n1.style.display="none";
	n2.style.display="none";
	}
	if(fm.industryType.value=="2"){
	c1.style.display="none";
	c2.style.display="none";
	n1.style.display="";
	n2.style.display="";
	}

}

Calendar.setup({
        inputField     :    "f_date_shqqs",     // id of the input field
        button         :    "f_trigger_shqqs",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    }); 
    Calendar.setup({
        inputField     :    "pf_date_shqqs",     // id of the input field
        button         :    "pf_trigger_shqqs",  // trigger for the calendar (button ID)
        align          :    "Br",           // alignment (defaults to "Bl")
        singleClick    :    true
    }); 
}
</script>
</body>
</html>
