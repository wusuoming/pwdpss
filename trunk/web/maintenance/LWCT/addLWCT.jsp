
<%--
*********
******************
����û���Ϣҳ��  
create by wangrongjia
200810.09
--%>
<%@ page contentType="text/html; charset=GBK" %>




  
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
    
      <form name="fm" style="display:block;">
         <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="4"><B>���ӵ�ѹ������</B></td>
		</tr>
          <tr>
            <td class=title>��ʽ</td>
            <td class=input><input name="Modus" type="text" class="text"><span class="warning">*</span></td>
            <td class=title>��ѹ��</td>
            <td class=input><input name="CT" type="text"  class="text" ></td>
          </tr>
		  <tr>
		  <td class=title>����</td>
            <td class=input><input name="FactoryName" type="text"  class="text"></td>
			
           <td class=title>����</td>
		  	<td class=input><input name="Exact" type="textfiled" class="text" ></td>
            
          
       </tr>
		 
           

		  <tr>
		  	<td class=title>����</td>
		  	<td class=input><input name="CTRate" type="textfiled" class="text" ><span class="warning">*</span></td>
		  <td class=title>����A</td>
		  	<td class=input><input name="FctoryCodeA" type="textfiled" class="text" ></td>
		  	
      </tr>
           
  
		  <tr>
		  <td class=title>����B</td>
		  	<td class=input><input name="FctoryCodeB" type="textfiled" class="text" ></td>
		  <td class=title>����C</td>
		  	<td class=input><input name="FctoryCodeC" type="textfiled" class="text" ></td>
		  	
      </tr>
		  <tr>
		  <td class=title>¼������</td>
		  	<td class=input><input name="ImportDate" type="textfiled" class="text" ><span class="warning">*</span></td>
		  <td class=title>Ч��״̬</td>
            <td class=input><input name="ValidStatus" type="radio" value="1" checked="checked"/>��Ч
                <input name="ValidStatus" type="radio" value="0"/>��Ч</td>
		  </tr>
        </table>
		
    <br />
<!--һ��ѵİ�ť-->

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" �� �� " onClick="javascript:addPowerUser();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" �� �� "></td>
        --%><td class=button><input name="back" type="button" class=button value="����" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function addPowerUser(){
if(fm.Modus.value == ""){
		  alert("��ʽ����Ϊ�գ�");
		  fm.Modus.focus();
		  return false;
		}
if(fm.CTRate.value == ""){
		  alert("���ʲ���Ϊ�գ�");
		  fm.CTRate.focus();
		  return false;
		}
		if(fm.ImportDate.value == ""){
		  alert("¼�����ڲ���Ϊ�գ�");
		  fm.ImportDate.focus();
		  return false;
		}		
	
 fm.action="/iacontact/addLWCT.do";
 fm.submit();

 
}
function industryType1(){

if(fm.industry.value== "1"){
 
 aaa.style.display = "none"; 
 bbb.style.display = "none";
}
 if(fm.industry.value== "0"){
 aaa.style.display = ""; 
 bbb.style.display = "";
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
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.LineCode.value+"&TableName=LwPowerLine1";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
function hasEmtyModus(){

if(fm.Modus.value==""||fm.Modus.value==null){
	alert("��ʽ����Ϊ��");
	
	return false;
}
else{
	return true;
}
}
function hasEmtyPCRate(){
if(fm.PCRate.value==""||fm.CTRate.value==null){
	alert("���ʲ���Ϊ��");

	return false;
}else{
	return true;
}
}
function hasEmtyImportDate(){
if(fm.ImportDate.value==""||fm.ImportDate.value==null){
	alert("¼�����ڲ���Ϊ��");

	return false;
}else{
	return true;
}


}
</script>
</body>
</html>
