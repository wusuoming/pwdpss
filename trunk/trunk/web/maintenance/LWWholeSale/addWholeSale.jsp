
<%--
*********
******************
��������û���Ϣҳ��  
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
    
      <form name="fm" >
   <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="10"><B>���������û�</B></td>
		</tr>
          <tr>
            <td class=title>��·����</td>
            <td class=input><input name="transformerName" type="text" class="text"><span class="warning">&nbsp;<img src="../../images/redstar.gif" ></span></td>
            <td class=title>��ַ</td>
            <td class=input><input name="phoneNo" type="text"  class="text"></td>
            
          </tr>
		  <tr>
		    <td class=title>����ũ���</td>
			  <td class=input><select name="company" >
            <option value="gy">����ũ���</option>
			<option value="dm">��ïũ���</option>
			 <option value="ty">����ũ���</option>
			<option value="jy">��ԭũ���</option></td>
		  <td class=title>��������</td>
            
			
            <td class=input><select name="wholeSaleType" onchange="isHaveProrate()">
            <option value="0">��ͨ����</option>
			<option value="1">���۹�ҵ</option>
              
          
            </select>
            </td>
            
          
       </tr>
       <tr>
       		<td class=title>�����ѹ</td>
           
             <td class=input><select name="voltage" >
            <option value="10">10KV</option>
			<option value="35">35KV</option>
            <td class=title>�绰</td>
            <td class=input><input name="lineCode" type="text" class="text"></td>
       </tr>
        <tr>
       		<td class=title>�Ƿ�Ϊ���˱�</td>
           
             <td class=input><select name="ifCal" >
            <option value="0">��(���)</option>
			<option value="1">��(ֻ�������)</option>
			<td class=input>
			<td class=input>
           
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
			<td class="title" align="center">�ϱ�����</td>
			<td class="title" align="center"></td>
		</tr>
				
		<tr>
			<td class="title"  align="center"><input name="ammeterNo" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterX" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterV" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterA" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="ammeterType" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="factoryName" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="factoryCcode" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="coust" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="PT" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="CT" type="text" class="text" style="width:60px" value=></td>
			<td class="title"  align="center"><input name="rate" type="text" class="text" style="width:60px" value=></td>
			<td class="input" ><input name="inputdate"  id="f_date_shqqs"  size="31" onkeyPress="return pressFullDate(event)" style="width:60px"  onblur="checkFullDate(this);" readonly="readonly"></td>
	<td> <img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
					style="cursor: pointer; border: 1px solid #0083da;"
					title="Date selector"					
					onmouseover="this.style.background='#4CA8EB';"
					onmouseout="this.style.background=''" /></td>
		</tr>
	
		
	</table>
       
<!--һ��ѵİ�ť-->

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" �� �� " onClick="javascript:addWholeSaleUser();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" �� �� "></td>
        --%><td class=button><input name="back" type="button" class=button value="����" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function addWholeSaleUser(){

 if(fm.transformerName.value ==''){
   alert('���Ų���Ϊ�գ�'); 
   return false;
 }
 //if(fm.wholeSaleType.value=="0"){
 //if(sum!=1)
	//{
	//alert('���û��ı�����̯����100%�������½������ã�');
	// return false;
	//}
//}
 fm.action="<%=request.getContextPath()%>/addLWWholeSale.do";
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
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.ammeterNo.value+"&TableName=LwAmmeterNo1";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
function addPowerUser(){



 if(fm.transformerName.value ==''){
   alert('��·����Ϊ�գ�'); 
   return false;
 }
 
  if(fm.rate.value ==''){
   alert('���ʲ���Ϊ�գ�'); 
   return false;
 }

 fm.action="/iacontact/addLWPowerUser.do";
 fm.submit();

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
