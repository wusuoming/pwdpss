
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




<title></title>
<link rel="stylesheet" type="text/css" media="all"
	href="/mimessage/css/calendar.css" title="win2k-cold-1" />
<link rel="stylesheet" type="text/css"
	href="/iacontact/css/Standard.css">
<html>
	<head>



		<!--�Զ������б�JS2-->
	</head>
	<body id="all_title">


		<!--MENU OVER-->
		<!--CONTENT BEGIN-->

		<form name="fm" method="post">
			<table id="table_userMain" width="1050" border="0">
				<tr class=listtitle align="center">
					<td class=title0 colspan="13">
						<B>���Ӵ�ҵ�õ��û�</B>
					</td>
				</tr>

</head>
<body id="all_title">
  
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    
      <form name="fm" method="post">
        <table id="table_userMain" class="fix_table" border="0">
         <tr class=listtitle align="center">
			<td class=title0 colspan="13"><B>���Ӵ�ҵ�õ��û�</B></td>
		</tr>
          <tr>
            <td class=title>����</td>
            <td class=input><input name="UserNo" type="text" class="text">&nbsp;<img
							src="../../images/redstar.gif" ></td>
            <td class=title>����</td>
            <td class=input><input name="UserNo" type="text" class="text">&nbsp;<img
							src="../../images/redstar.gif" ></td>
          </tr>
		  <tr>
		  <td class=title>��ַ</td>
            <td class=input><input name="Address" type="text"  class="text"></td>
			  <td class=title>������</td>
            <td class=input><input name="accountBank" type="text"  class="text" />
              
          
            
          
       </tr>
		  

				<tr>
					<td class=title>
						����
					</td>
					<td class=input>
						<input name="UserNo" type="text" class="text">
						&nbsp;<img
							src="../../images/redstar.gif" >
					</td>
					<td class=title>
						����
					</td>
					<td class=input>
						<input name="UserName" type="text" class="text">
						&nbsp;<img
							src="../../images/redstar.gif" >
					</td>
				</tr>
				<tr>
					<td class=title>
						��ַ
					</td>
					<td class=input>
						<input name="Address" type="text" class="text">
					</td>
					<td class=title>
						������
					</td>
					<td class=input>
						<input name="accountBank" type="text" class="text" />
				</tr>

				<tr>
					<td class=title>
						˰��
					</td>
					<td class=input>
						<input name="taxNo" type="text" class="text">
					</td>
					<td class=title>
						�����ʺ�
					</td>
					<td class=input>
						<input name="accountNo" type="text" class="text" />
				</tr>
				<tr>

					<td class=title>
						��ѹ�ȼ�
					</td>
					<td class=input>
						<select name="voltage" class="input">
							<option value=2>
								1-10KV
							</option>
							<option value=3>
								35-110KV����
							</option>
							<option value=4>
								110-220KV������
							</option>


							<option value=5>
								220KV������
							</option>

						</select>


					</td>
					<td class=title>
						������·
					</td>
					<td class=input>
						<input name="lineCode" type="text" class="text">
					</td>
				</tr>
				<tr>

					<td class=title>
						����/����
					</td>

					<td class=input>
						<select name="industryType" class="input" onchange="corn()">
							<option value=1>
								����
							</option>
							<option value=2>
								����
							</option>
						</select>
					</td>
					<td class=title id="c1" style="display: ">
						��������
					</td>
					<td class=input id="c2" style="display: ">
						<input name="rongliangPower" type="text" class="text">
					</td>
					<td class=title id="n1" style="display: none">
						��������
					</td>
					<td class=input id="n2" style="display: none">
						<input name="xuliangRate" type="text" class="text">
					</td>
				</tr>
				<tr>
					<td class=title>
						����ʱ�ĵ��
					</td>
					<td class="input">
						<select name="shengChanpriceStyle" class="input">
							<option value=0>
								��ҵ
							</option>
							<option value=1>
								����
							</option>
							<option value=2>
								��ʯ
							</option>


							<option value=3>
								����
							</option>




						</select>
					</td>
					<td class=title>
						��ѹ�ȼ�
					</td>
					<td class="input">
						<select name="shengChanKV" class="input">




							<option value=2>
								1-10KV
							</option>


							<option value=3>
								35-110KV����
							</option>


							<option value=4>
								110-220KV������
							</option>


							<option value=5>
								220KV������
							</option>


						</select>
					</td>
					<td class="input">
				</tr>
				<tr>
					<td class=title>
						ͣ��ʱ�ĵ��
					</td>
					<td class="input">
						<select name="tingChanpriceStyle" class="input">


							<option value=0>
								��ҵ
							</option>


							<option value=1>
								����
							</option>


							<option value=2>
								��ʯ
							</option>


							<option value=3>
								����
							</option>




						</select>
					</td>
					<td class=title>
						��ѹ�ȼ�
					</td>
					<td class="input">
						<select name="tingChanKV" class="input">




							<option value=2>
								1-10KV
							</option>


							<option value=3>
								35-110KV����
							</option>


							<option value=4>
								110-220KV������
							</option>


							<option value=5>
								220KV������
							</option>


						</select>
					</td>
					<td class="input">
				</tr>
				<tr>
					<td class=title>
						ͣ���������
					</td>
					<td class=input>
						<input name="tingChanRongliangPrice" type="text" class="text">
					</td>
					<td class=title>
						�����������
					</td>
					<td class=input>
						<input name="shengChanRongliangPrice" type="text" class="text">
					</td>
				</tr>
				<tr>
					<td class=title>
						����ʱ�����
					</td>
					<td class=input>
						<input name="tingChanDianJinPrice" type="text" class="text">
					</td>
					<td class=title>
						ͣ��ʱ�����
					</td>
					<td class=input>
						<input name="shengChanDianJinPrice" type="text" class="text">
					</td>
				</tr>


				<tr>
					<td class=title>
						����������ʽ
					</td>
					<td class="input">
						<select name="pepoleFlag" class="input" onchange="borc()">




							<option value=1>
								����
							</option>


							<option value=2>
								����
							</option>





						</select>
					</td>
					<td class=title id="a1" style="display: none">
						����
					</td>
					<td class=input id="a2" style="display: none">
						<input name="pepolePower" type="text" class="text">
					</td>
					<td class="input" id="b1" style="display: ">
					<td class="input" id="b2" style="display: ">
				</tr>
				<tr>
					<td class=title>
						�������
					</td>
					<td class=input>
						<input name="lineLossScale" type="text" class="text" value="0">
						%
					</td>
					<td class=title>
						������
					</td>
					<td class="input">
						<select name="dianJinPower" class="input">
							<option value=1>
								�ܵ���
							</option>


							<option value=2>
								�������
							</option>
						</select>
					</td>
				</tr>
			</table>
			<table style='display: none' id="DataPower_Data" cellspacing="1"
				cellpadding="5">
				<tr class=oddrow>
					<td class="title" align="center">
						<input name="ammeterNo" type="text" class="text"
							style="width: 60px" value=>
					</td>
					<td class="title" align="center">
						<input name="ammeterX" type="text" class="text"
							style="width: 60px" value=>
					</td>
					<td class="title" align="center">
						<input name="ammeterV" type="text" class="text"
							style="width: 60px" value=>
					</td>
					<td class="title" align="center">
						<input name="ammeterA" type="text" class="text"
							style="width: 60px" value=>
					</td>
					<td class="title" align="center">
						<input name="ammeterType" type="text" class="text"
							style="width: 60px" value=>
					</td>
					<td class="title" align="center">
						<input name="factoryName" type="text" class="text"
							style="width: 60px" value=>
					</td>
					<td class="title" align="center">
						<input name="factoryCcode" type="text" class="text"
							style="width: 60px" value=>
					</td>
					<td class="title" align="center">
						<input name="coust" type="text" class="text" style="width: 60px"
							value=>
					</td>
					<td class="title" align="center">
						<input name="PT" type="text" class="text" style="width: 60px"
							value=>
					</td>
					<td class="title" align="center">
						<input name="CT" type="text" class="text" style="width: 60px"
							value=>
					</td>
					<td class="title" align="center">
						<input name="rate" type="text" class="text" style="width: 60px"
							value=>
					</td>
					<td class="title" align="center">
						<select name="ammeterStyle" style="width: 60px">
							<option value="0">
								��ҵ
							</option>
							<option value="1">
								����
							</option>
					</td>
					<td class="title" align="center" style="display: none">
						<input name="useStyle" value="0">
					<td class=input>
						<input style="width: 60px" name="inputdate" id="f_date_shqqs"
							size="31" onblur="checkFullDate(this)" />
							<td colspan="5" align="right">
							<img src="../../images/jia-jia.gif" border="0" align="absmiddle"
								name="img_DataPower_Insert" onclick="insertRow('DataPower')">
						</td>
							
					<td class="input" style='width: 10%'>
						<img src="../../images/jian-jian.gif" border="0"
							name="img_DataPower_Delete" onclick="deleteRow(this,'DataPower')">
					</td>
										</tr>
			</table>
			<table width="1050">
				<tr class=listtitle align="center">
					<td class=title0 colspan="14">
						<B>���õ����Ϣ</B>
					</td>
				</tr>
			</table>
			<table class="sub" style='width: 100%' id="DataPower" cellspacing="1"
				cellpadding="5">

				<thead>
					<td class="title" align="center">
						���
					</td>
					<td class="title" align="center">
						��
					</td>
					<td class="title" align="center">
						��
					</td>
					<td class="title" align="center">
						��
					</td>
					<td class="title" align="center">
						��ʽ
					</td>
					<td class="title" align="center">
						����
					</td>
					<td class="title" align="center">
						����
					</td>
					<td class="title" align="center">
						����
					</td>
					<td class="title" align="center">
						��ѹ��
					</td>
					<td class="title" align="center">
						������
					</td>
					<td class="title" align="center">
						����
					</td>
					<td class="title" align="center">
						�õ�����
					</td>
					<td class="title" align="center">
						�ϱ�����
					</td>
				</thead>
				<tbody>
					<tr class=oddrow>
						<td class="title" align="center">
							<input name="ammeterNo" type="text" class="text"
								style="width: 60px" value=>
						</td>
						<td class="title" align="center">
							<input name="ammeterX" type="text" class="text"
								style="width: 60px" value=>
						</td>
						<td class="title" align="center">
							<input name="ammeterV" type="text" class="text"
								style="width: 60px" value=>
						</td>
						<td class="title" align="center">
							<input name="ammeterA" type="text" class="text"
								style="width: 60px" value=>
						</td>
						<td class="title" align="center">
							<input name="ammeterType" type="text" class="text"
								style="width: 60px" value=>
						</td>
						<td class="title" align="center">
							<input name="factoryName" type="text" class="text"
								style="width: 60px" value=>
						</td>
						<td class="title" align="center">
							<input name="factoryCcode" type="text" class="text"
								style="width: 60px" value=>
						</td>
						<td class="title" align="center">
							<input name="coust" type="text" class="text" style="width: 60px"
								value=>
						</td>
						<td class="title" align="center">
							<input name="PT" type="text" class="text" style="width: 60px"
								value=>
						</td>
						<td class="title" align="center">
							<input name="CT" type="text" class="text" style="width: 60px"
								value=>
						</td>
						<td class="title" align="center">
							<input name="rate" type="text" class="text" style="width: 60px"
								value=>
						</td>
						<td class="title" align="center">
							<select name="ammeterStyle" style="width: 60px">
								<option value="0">
									��ҵ
								</option>
								<option value="1">
									����
								</option>
						</td>
						<td class="title" align="center" style="display: none">
							<input name="useStyle" value="0">
						<td class=input>
							<input style="width: 60px" name="inputdate" id="f_date_shqqs"
								size="31" onblur="checkFullDate(this);" />

							<%--<td> <img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
					style="cursor: pointer; border: 1px solid #0083da;"
					title="Date selector"					
					onmouseover="this.style.background='#4CA8EB';"
					onmouseout="this.style.background=''" /></td>		
						--%>
						<td colspan="5" align="right">
							<img src="../../images/jia-jia.gif" border="0" align="absmiddle"
								name="img_DataPower_Insert" onclick="insertRow('DataPower')">
						</td>
						<td class="input" style='width: 10%'>
							<img src="../../images/jian-jian.gif" border="0"
								align="absmiddle" name="img_DataPower_Delete"
								onclick="javascript:delRows();">
						</td><!-- deleteRow(this,'DataPower') -->
					</tr>
				</tbody>
			</table>


			<!--һ��ѵİ�ť-->

			<table width="50%" border="0" cellspacing="0" cellpadding="0"
				align="center">
				<tr>
					<td class=button>
						<input name="add" type="button" class=button value=" �� �� "
							onClick="javascript:addCorporationUser();">
					</td>
					<!--<td class=button>
						<input name="reset" type="button" class=button value=" �� �� ">
					</td>-->
					<td class=button>
						<input name="back" type="button" class=button value="����"
							onClick="javascript:history.go(-1);">
					</td>
				</tr>
			</table>


			<!--Button End-->
		</form>
		<br />

		<script language="javascript">
		<!--begin junwei -->
function delRows(){
	var count = document.getElementById('DataPower_Data').rows.length;
	if(parseInt(count)==1){
		alert("��������һ�������Ϣ��");
		return;
	}
}

function addCorporationUser(){
if(fm.UserNo.value ==''){
   alert('�������ҵ���ţ�'); 
   return;
 }if(fm.UserName.value ==''){
   alert('�������ҵ������'); 
   return;
 }
var arr = document.getElementsByName('ammeterNo');
var arr1 = document.getElementsByName('rate');
var arr2 = document.getElementsByName('inputdate');
for(var i=1;i<parseInt(arr.length);i++){
	if(arr[i].value == ''){
		alert("�������ţ�");
		return;
	}
}
for(var i=1;i<parseInt(arr1.length);i++){
	if(arr1[i].value == ''){
		alert("�����뱶�ʣ�");
		return;
	}
	if(isNaN(arr1[i].value)){
		alert("���ʱ��������֣�");
		return;
	}
}
for(var i=1;i<parseInt(arr2.length);i++){
	if(arr2[i].value == ''){
		alert("���������ڣ�");
		return;
	}
}
fm.action="/iacontact/addLWCorporation.do";
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


function isHavePepole(){
if(fm.ifhavepepole.value=="0"){
 pp.style.display="none";
}
if(fm.ifhavepepole.value=="1"){
 pp.style.display="";
}
}
function isDate(date,splitChar)
{
  var charSplit = (splitChar==null?"-":splitChar);
  var strValue = date.split(charSplit);

  if(strValue.length!=3) return false;
  if(!isInteger(strValue[0]) || !isInteger(strValue[1]) || !isInteger(strValue[2]) ) return false;

  var intYear  = parseInt(strValue[0],10);
  var intMonth = parseInt(strValue[1],10)-1;
  var intDay   = parseInt(strValue[2],10);

  var dt = new Date(intYear,intMonth,intDay);
  if( dt.getFullYear() != intYear ||
      dt.getMonth() != intMonth ||
      dt.getDate() != intDay
     )
  {
    return false;
  }
  return true;
}
function checkFullDate(field)
{
  field.value = trim(field.value);
  var strValue = field.value;
  var desc   = field.description;
  //���description���Բ����ڣ�����name����
  if(desc==null)
    desc = field.name;
  if(strValue=="")
  {
    return false;
  }
  if(isNumeric(strValue ))
  {
    if(strValue.length > 6 && strValue.length < 9)
    {
        strValue = strValue.substring(0,4) + "-" + strValue.substring(4,6) + "-" + strValue.substring(6);

        field.value = strValue;
    }
     else
     {
      errorMessage("������Ϸ���" + "����" +"\n����Ϊ���ڣ���ʽΪYYYY-MM-DD ����2008-01-01");
        field.value="";
        field.focus();
        field.select();
        return false;
     }
  }
  if( !isDate(strValue,"-") && !isDate(strValue)||strValue.substring(0,1)=="0")
  {
    errorMessage("������Ϸ���" + "����" +"\n����Ϊ���ڣ���ʽΪYYYY-MM-DD ����2008-01-01");
    field.value="";
    field.focus();
    field.select();
    return false;
  }

  return true;
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
