//----------------------------------------------------------------------------
//  Javascript�����ؼ���������MS IE(5.0����)�����.
//----------------------------------------------------------------------------
//  Written by Meizz,  Finished by MingJie Xu,  Last Update: 2004-11-11
//  ������ѡ��������.
//----------------------------------------------------------------------------
//  �÷������ú��� setday(this,[object])��setday(this)��[object]�ǿؼ�����Ŀؼ���.
//  ������
//  1. <input name=txt><input type=button value=setday onclick="setday(this,document.all.txt)">
//  2. <input onfocus="setday(this)">

//============================================ �����趨���� ==============================================

var bMoveable1 = true;		//���������Ƿ�����϶�
var separator1 = "-";        //������ʾ��ʽΪyyyy-MM-dd

//============================================ WEB ҳ����ʾ���� ==========================================

var strFrame1;		    //����������HTML����
document.writeln('<iframe id=dateLayer1  frameborder=0 style="position: absolute; width: 155; height: 211; z-index: 9998; display: none"></iframe>');
strFrame1='<style>';
strFrame1+='INPUT.button{BORDER-RIGHT: #ff9900 1px solid;BORDER-TOP: #ff9900 1px solid;BORDER-LEFT: #ff9900 1px solid;';
strFrame1+='BORDER-BOTTOM: #ff9900 1px solid;BACKGROUND-COLOR: #fff8ec;font-family:����;}';
strFrame1+='TD{FONT-SIZE: 9pt;font-family:����;}';
strFrame1+='</style>';
strFrame1+='<scr' + 'ipt>';
strFrame1+='var datelayerx,datelayery;	/*��������ؼ������λ��*/';
strFrame1+='var bDrag;	/*����Ƿ�ʼ�϶�*/';
strFrame1+='function document.onmousemove()	/*������ƶ��¼��У������ʼ�϶����������ƶ�����*/';
strFrame1+='{if(bDrag && window.event.button==1)';
strFrame1+='	{var DateLayer=parent.document.all.dateLayer1.style;';
strFrame1+='		DateLayer.posLeft += window.event.clientX-datelayerx;/*����ÿ���ƶ��Ժ����λ�ö��ָ�Ϊ��ʼ��λ�ã����д����div�в�ͬ*/';
strFrame1+='		DateLayer.posTop += window.event.clientY-datelayery;}}';
strFrame1+='function DragStart()		/*��ʼ�����϶�*/';
strFrame1+='{var DateLayer=parent.document.all.dateLayer1.style;';
strFrame1+='	datelayerx=window.event.clientX;';
strFrame1+='	datelayery=window.event.clientY;';
strFrame1+='	bDrag=true;}';
strFrame1+='function DragEnd(){		/*���������϶�*/';
strFrame1+='	bDrag=false;}';
strFrame1+='</scr' + 'ipt>';
strFrame1+='<div style="z-index:9999;position: absolute; left:0; top:0;" onselectstart="return false"><span id=tmpSelectYearLayer  style="z-index: 9999;position: absolute;top: 3; left: 19;display: none"></span>';
strFrame1+='<span id=tmpSelectMonthLayer  style="z-index: 9999;position: absolute;top: 3; left: 78;display: none"></span>';
strFrame1+='<table border=1 cellspacing=0 cellpadding=0 width=142 height=160 bordercolor=#ff9900 bgcolor=#ff9900 >';
strFrame1+='  <tr ><td width=142 height=23  bgcolor=#FFFFFF><table border=0 cellspacing=1 cellpadding=0 width=150  height=23>';
strFrame1+='      <tr align=center ><td width=16 align=center bgcolor=#ff9900 style="font-size:12px;cursor: hand;color: #ffffff" ';
strFrame1+='        onclick="parent.prevM1()" title="��ǰ�� 1 ��" ><b >&lt;</b>';
strFrame1+='        </td><td width=60 align=center style="font-size:12px;cursor:default"  ';
strFrame1+='onmouseover="style.backgroundColor=\'#FFD700\'" onmouseout="style.backgroundColor=\'white\'" ';
strFrame1+='onclick="parent.tmpSelectYearInnerHTML1(this.innerText.substring(0,4))" title="�������ѡ�����"><span  id=YearHead></span></td>';
strFrame1+='<td width=48 align=center style="font-size:12px;cursor:default"  onmouseover="style.backgroundColor=\'#FFD700\'" ';
strFrame1+=' onmouseout="style.backgroundColor=\'white\'" onclick="parent.tmpSelectMonthInnerHTML1(this.innerText.length==3?this.innerText.substring(0,1):this.innerText.substring(0,2))"';
strFrame1+='        title="�������ѡ���·�"><span id=MonthHead ></span></td>';
strFrame1+='        <td width=16 bgcolor=#ff9900 align=center style="font-size:12px;cursor: hand;color: #ffffff" ';
strFrame1+='         onclick="parent.nextM1()" title="��� 1 ��" ><b >&gt;</b></td></tr>';
strFrame1+='    </table></td></tr>';
strFrame1+='  <tr ><td width=142 height=18 >';
strFrame1+='<table border=1 cellspacing=0 cellpadding=0 bgcolor=#ff9900 ' + (bMoveable1? 'onmousedown="DragStart()" onmouseup="DragEnd()"':'');
strFrame1+=' BORDERCOLORLIGHT=#FF9900 BORDERCOLORDARK=#FFFFFF width=150 height=20  style="cursor:' + (bMoveable1 ? 'move':'default') + '">';
strFrame1+='<tr  align=center valign=bottom><td style="font-size:12px;color:#FFFFFF" >��</td>';
strFrame1+='<td style="font-size:12px;color:#FFFFFF" >һ</td><td style="font-size:12px;color:#FFFFFF" >��</td>';
strFrame1+='<td style="font-size:12px;color:#FFFFFF" >��</td><td style="font-size:12px;color:#FFFFFF" >��</td>';
strFrame1+='<td style="font-size:12px;color:#FFFFFF" >��</td><td style="font-size:12px;color:#FFFFFF" >��</td></tr>';
strFrame1+='</table></td></tr>';
strFrame1+='  <tr ><td width=142 height=120 >';
strFrame1+='    <table border=1 cellspacing=2 cellpadding=0 BORDERCOLORLIGHT=#FF9900 BORDERCOLORDARK=#FFFFFF bgcolor=#fff8ec width=150 height=120 >';
var n=0; for (j=0;j<5;j++){ strFrame1+= ' <tr align=center >'; for (i=0;i<7;i++){
strFrame1+='<td width=20 height=20 id=Day'+n+' style="font-size:12px"  onclick=parent.DayClick1(this.innerText,0)></td>';n++;}
strFrame1+='</tr>';}
strFrame1+='      <tr align=center >';
for (i=35;i<39;i++)strFrame1+='<td width=20 height=20 id=Day'+i+' style="font-size:12px"  onclick="parent.DayClick1(this.innerText,0)"></td>';
strFrame1+='        <td colspan=3 align=center >';
strFrame1+='        <span onclick=parent.clear1() title="�����ǰѡ�������" style="font-size:12px;cursor: hand"><u>���</u></span>&nbsp;';
strFrame1+='<span onclick=parent.closeLayer1() title="�ر�����ѡ�񴰿�" style="font-size:12px;cursor: hand"><u>�ر�</u></span>';
strFrame1+='</td></tr>';
strFrame1+='    </table></td></tr><tr ><td >';
strFrame1+='        <table border=0 cellspacing=1 cellpadding=0 width=100%  bgcolor=#FFFFFF>';
strFrame1+='          <tr ><td  align=left><input  type=button class=button value="<<" title="��ǰ�� 1 ��" onclick="parent.prevY1()" ';
strFrame1+='             onfocus="this.blur()" style="font-size: 12px; height: 20px"><input  class=button title="��ǰ�� 1 ��" type=button ';
strFrame1+='             value="< " onclick="parent.prevM1()" onfocus="this.blur()" style="font-size: 12px; height: 20px"></td><td ';
strFrame1+='              align=center><input  type=button class=button value=���� onclick="parent.today1()" ';
strFrame1+='             onfocus="this.blur()" title="��ǰ����" style="font-size: 12px; height: 20px; cursor:hand"></td><td ';
strFrame1+='              align=right><input  type=button class=button value=" >" onclick="parent.nextM1()" ';
strFrame1+='             onfocus="this.blur()" title="��� 1 ��" class=button style="font-size: 12px; height: 20px"><input ';
strFrame1+='              type=button class=button value=">>" title="��� 1 ��" onclick="parent.nextY1()"';
strFrame1+='             onfocus="this.blur()" style="font-size: 12px; height: 20px"></td>';
strFrame1+='</tr></table></td></tr></table></div>';

window.frames.dateLayer1.document.writeln(strFrame1);
window.frames.dateLayer1.document.close();		     //���IE������������������

//==================================================== WEB ҳ����ʾ���� ======================================================
var outObject1;
var outComponent1;		//����İ�ť
var outDate1="";		//��Ŷ��������
var odatelayer1=window.frames.dateLayer1.document.all;		//�����������

var myYear1;
var myMonth1;
var myDay1;

//function setday(tt,obj, y, m, d) //��������
function setday1(tt, y, m, d)
{
	myYear1  = y;
	myMonth1 = m;
	myDay1   = d;

	//if (arguments.length >  2){alert("�Բ���, ���뱾�ؼ��Ĳ���̫��!");return;}
	if (arguments.length == 0){alert("�Բ���, ��û�д������ؼ��κβ���!");return;}
	var dads  = document.all.dateLayer1.style;
	var th = tt;
	var ttop  = tt.offsetTop;     //TT�ؼ��Ķ�λ���
	var thei  = tt.clientHeight;  //TT�ؼ�����ĸ�
	var tleft = tt.offsetLeft;    //TT�ؼ��Ķ�λ���
	var ttyp  = tt.type;          //TT�ؼ�������
	while (tt = tt.offsetParent){ttop+=tt.offsetTop; tleft+=tt.offsetLeft;}
	dads.top  = (ttyp=="image")? ttop+thei : ttop+thei+2;
	dads.left = tleft;
	//outObject1 = (arguments.length == 1) ? th : obj;
	outComponent1 = (arguments.length == 1) ? null : th;	//�趨�ⲿ����İ�ť
	//���ݵ�ǰ������������ʾ����������
	var reg = /^(\d+)-(\d{1,2})-(\d{1,2})$/; 
	
	//var r = outObject1.value.match(reg); 
	var r;
	if(r!=null){
		r[2]=r[2]-1; 
		var d= new Date(r[1], r[2],r[3]); 
		if(d.getFullYear()==r[1] && d.getMonth()==r[2] && d.getDate()==r[3]){
			outDate1=d;		//�����ⲿ���������
		}
		else outDate1="";
			setDay1(r[1],r[2]+1);
	}
	else{
		outDate1="";
		setDay1(new Date().getFullYear(), new Date().getMonth() + 1);
	}

	dads.display = '';

	event.returnValue=false;
}

var MonHead1 = new Array(12);    		   //����������ÿ���µ��������
    MonHead1[0] = 31; MonHead1[1] = 28; MonHead1[2] = 31; MonHead1[3] = 30; MonHead1[4]  = 31; MonHead1[5]  = 30;
    MonHead1[6] = 31; MonHead1[7] = 31; MonHead1[8] = 30; MonHead1[9] = 31; MonHead1[10] = 30; MonHead1[11] = 31;

var theYear1=new Date().getFullYear(); //������ı����ĳ�ʼֵ
var theMonth1=new Date().getMonth()+1; //�����µı����ĳ�ʼֵ
var wDay1=new Array(39);               //����д���ڵ�����

function document.onkeyup()		//��Esc��ʱ�رոÿؼ�
{
    if(window.event.keyCode==27)
	{
		/*
		if(outObject1)
		{
			outObject1.blur();
		}
		*/
		closeLayer1();
	}
  }

function document.onclick() //������ʱ�رոÿؼ�
{
	with(window.event)
	{
		//if(srcElement != outObject1 && srcElement != outComponent1)
		if(srcElement != outComponent1 && 
		   srcElement != myYear1 && srcElement != myMonth1 && srcElement != myDay1)
		{
			closeLayer1();
		}
		if(srcElement != outComponent2 &&
		   srcElement != myYear2 && srcElement != myMonth2)
		{
			closeLayer2();
		}
	}

}

function writeHead1(yy,mm)  //�� head ��д�뵱ǰ��������
  {
	odatelayer1.YearHead.innerText  = yy + " ��";
    odatelayer1.MonthHead.innerText = mm + " ��";
  }

function tmpSelectYearInnerHTML1(strYear) //��ݵ�������
{
  if (strYear.match(/\D/)!=null){alert("������������������!");return;}
  var m = (strYear) ? strYear : new Date().getFullYear();
  if (m < 1000 || m > 9999) {alert("���ֵ���� 1000 �� 9999 ֮��!");return;}

  var beforeCurrentYear = 15;    //beforeCurrentYear    = �������б�����ʾ��ǰ��֮ǰ���ٸ����
  var afterCurrentYear = 16;      //afterCurrentYear - 1 = �������б�����ʾ��ǰ��֮����ٸ����
  var n = m - beforeCurrentYear;
  if(n < 1000)
  {
      n = 1000;
  }
  if(n + beforeCurrentYear + afterCurrentYear > 9999) 
  {
      n = 9999 + 1 - beforeCurrentYear - afterCurrentYear;
  }
  
  var s = "<select  name=tmpSelectYear style='font-size: 12px' "
     s += "onblur='document.all.tmpSelectYearLayer.style.display=\"none\"' "
     s += "onchange='document.all.tmpSelectYearLayer.style.display=\"none\";"
     s += "parent.theYear1 = this.value; parent.setDay1(parent.theYear1,parent.theMonth1)'>\r\n";
  var selectInnerHTML = s;
  for (var i = n; i < n + beforeCurrentYear + afterCurrentYear; i++)
  {
	if (i == m)
       {selectInnerHTML += "<option  value='" + i + "' selected>" + i + "��" + "</option>\r\n";}
    else {selectInnerHTML += "<option  value='" + i + "'>" + i + "��" + "</option>\r\n";}
  }
  selectInnerHTML += "</select>";
  odatelayer1.tmpSelectYearLayer.style.display="";
  odatelayer1.tmpSelectYearLayer.innerHTML = selectInnerHTML;
  odatelayer1.tmpSelectYear.focus();
}

function tmpSelectMonthInnerHTML1(strMonth) //�·ݵ�������
{
  if (strMonth.match(/\D/)!=null){alert("�·���������������֣�");return;}
  var m = (strMonth) ? strMonth : new Date().getMonth() + 1;
  var s = "<select  name=tmpSelectMonth style='font-size: 12px' "
     s += "onblur='document.all.tmpSelectMonthLayer.style.display=\"none\"' "
     s += "onchange='document.all.tmpSelectMonthLayer.style.display=\"none\";"
     s += "parent.theMonth1 = this.value; parent.setDay1(parent.theYear1,parent.theMonth1)'>\r\n";
  var selectInnerHTML = s;
  for (var i = 1; i < 13; i++)
  {
    if (i == m)
       {selectInnerHTML += "<option  value='"+i+"' selected>"+i+"��"+"</option>\r\n";}
    else {selectInnerHTML += "<option  value='"+i+"'>"+i+"��"+"</option>\r\n";}
  }
  selectInnerHTML += "</select>";
  odatelayer1.tmpSelectMonthLayer.style.display="";
  odatelayer1.tmpSelectMonthLayer.innerHTML = selectInnerHTML;
  odatelayer1.tmpSelectMonth.focus();
}

function closeLayer1()               //�����Ĺر�
  {
    document.all.dateLayer1.style.display="none";
  }

function IsPinYear1(year)            //�ж��Ƿ���ƽ��
  {
    if (0==year%4&&((year%100!=0)||(year%400==0))) return true;else return false;
  }

function GetMonthCount1(year,month)  //�������Ϊ29��
  {
    var c=MonHead1[month-1];if((month==2)&&IsPinYear1(year)) c++;return c;
  }
function GetDOW1(day,month,year)     //��ĳ������ڼ�
  {
    var dt=new Date(year,month-1,day).getDay()/7; return dt;
  }

function prevY1()  //��ǰ�� Year
  {
    if(theYear1 > 999 && theYear1 <10000){theYear1--;}
    else{alert("��ݳ�����Χ(1000-9999)!");}
    setDay1(theYear1,theMonth1);
  }
function nextY1()  //���� Year
  {
    if(theYear1 > 999 && theYear1 <10000){theYear1++;}
    else{alert("��ݳ�����Χ(1000-9999)!");}
    setDay1(theYear1,theMonth1);
  }
function today1()  //Today Button
  {
	var today;
    theYear1 = new Date().getFullYear();
    theMonth1 = new Date().getMonth()+1;
    today=new Date().getDate();
    //setDay1(theYear1,theMonth1);
    myYear1.value = theYear1;
	if(theMonth1 < 10)
		theMonth1 = "0" + theMonth1;
	myMonth1.value = theMonth1;
	if(today < 10)
		today = "0" + today;
	myDay1.value = today;
	/*
	if(outObject1){
		outObject1.value=theYear1 + separator1 + theMonth1 + separator1 + today;
    }
	*/
    closeLayer1();
  }
function clear1()
{
	myYear1.value = "";
	myMonth1.value = "";
	myDay1.value = "";

	/*
	if(outObject1)
	{
		outObject1.value = "";
	}
	*/
	//closeLayer1();
}
function prevM1()  //��ǰ���·�
  {
    if(theMonth1>1){theMonth1--}else{theYear1--;theMonth1=12;}
    setDay1(theYear1,theMonth1);
  }
function nextM1()  //�����·�
  {
    if(theMonth1==12){theYear1++;theMonth1=1}else{theMonth1++}
    setDay1(theYear1,theMonth1);
  }

function setDay1(yy,mm)   //��Ҫ��д����**********
{
  writeHead1(yy,mm);
  //���õ�ǰ���µĹ�������Ϊ����ֵ
  theYear1=yy;
  theMonth1=mm;
  
  for (var i = 0; i < 39; i++){wDay1[i]=""};  //����ʾ�������ȫ�����
  var day1 = 1,day2=1,firstday = new Date(yy,mm-1,1).getDay();  //ĳ�µ�һ������ڼ�
  for (i=0;i<firstday;i++)wDay1[i]=GetMonthCount1(mm==1?yy-1:yy,mm==1?12:mm-1)-firstday+i+1	//�ϸ��µ������
  for (i = firstday; day1 < GetMonthCount1(yy,mm)+1; i++){wDay1[i]=day1;day1++;}
  for (i=firstday+GetMonthCount1(yy,mm);i<39;i++){wDay1[i]=day2;day2++}
  for (i = 0; i < 39; i++)
  { var da = eval("odatelayer1.Day"+i)     //��д�µ�һ���µ�������������
    if (wDay1[i]!="")
      { 
		//��ʼ���߿�
		da.borderColorLight="#FF9900";
		da.borderColorDark="#FFFFFF";
		if(i<firstday)		//�ϸ��µĲ���
		{
			da.innerHTML="<b><font color=gray>" + wDay1[i] + "</font></b>";
			da.title=(mm==1?12:mm-1) +"��" + wDay1[i] + "��";
			da.onclick=Function("DayClick1(this.innerText,-1)");
			if(!outDate1)
				da.style.backgroundColor = ((mm==1?yy-1:yy) == new Date().getFullYear() && 
					(mm==1?12:mm-1) == new Date().getMonth()+1 && wDay1[i] == new Date().getDate()) ?
					 "#FFD700":"#e0e0e0";
			else
			{
				da.style.backgroundColor =((mm==1?yy-1:yy)==outDate1.getFullYear() && (mm==1?12:mm-1)== outDate1.getMonth() + 1 && 
				wDay1[i]==outDate1.getDate())? "#00ffff" :
				(((mm==1?yy-1:yy) == new Date().getFullYear() && (mm==1?12:mm-1) == new Date().getMonth()+1 && 
				wDay1[i] == new Date().getDate()) ? "#FFD700":"#e0e0e0");
				//��ѡ�е�������ʾΪ����ȥ
				if((mm==1?yy-1:yy)==outDate1.getFullYear() && (mm==1?12:mm-1)== outDate1.getMonth() + 1 && 
				wDay1[i]==outDate1.getDate())
				{
					da.borderColorLight="#FFFFFF";
					da.borderColorDark="#FF9900";
				}
			}
		}
		else if (i>=firstday+GetMonthCount1(yy,mm))		//�¸��µĲ���
		{
			da.innerHTML="<b><font color=gray>" + wDay1[i] + "</font></b>";
			//da.title=(mm==12?1:mm+1) +"��" + wDay1[i] + "��";
			da.title=(mm==12?1:parseInt(mm)+1) +"��" + wDay1[i] + "��";
			da.onclick=Function("DayClick1(this.innerText,1)");
			if(!outDate1)
				da.style.backgroundColor = ((mm==12?yy+1:yy) == new Date().getFullYear() && 
					(mm==12?1:mm+1) == new Date().getMonth()+1 && wDay1[i] == new Date().getDate()) ?
					 "#FFD700":"#e0e0e0";
			else
			{
				da.style.backgroundColor =((mm==12?yy+1:yy)==outDate1.getFullYear() && (mm==12?1:mm+1)== outDate1.getMonth() + 1 && 
				wDay1[i]==outDate1.getDate())? "#00ffff" :
				(((mm==12?yy+1:yy) == new Date().getFullYear() && (mm==12?1:mm+1) == new Date().getMonth()+1 && 
				wDay1[i] == new Date().getDate()) ? "#FFD700":"#e0e0e0");
				//��ѡ�е�������ʾΪ����ȥ
				if((mm==12?yy+1:yy)==outDate1.getFullYear() && (mm==12?1:mm+1)== outDate1.getMonth() + 1 && 
				wDay1[i]==outDate1.getDate())
				{
					da.borderColorLight="#FFFFFF";
					da.borderColorDark="#FF9900";
				}
			}
		}
		else		//���µĲ���
		{
			da.innerHTML="<b>" + wDay1[i] + "</b>";
			da.title=mm +"��" + wDay1[i] + "��";
			da.onclick=Function("DayClick1(this.innerText,0)");		//��td����onclick�¼��Ĵ���
			//����ǵ�ǰѡ������ڣ�����ʾ����ɫ�ı���������ǵ�ǰ���ڣ�����ʾ����ɫ����
			if(!outDate1)
				da.style.backgroundColor = (yy == new Date().getFullYear() && mm == new Date().getMonth()+1 && wDay1[i] == new Date().getDate())?
					"#FFD700":"#e0e0e0";
			else
			{
				da.style.backgroundColor =(yy==outDate1.getFullYear() && mm== outDate1.getMonth() + 1 && wDay1[i]==outDate1.getDate())?
					"#00ffff":((yy == new Date().getFullYear() && mm == new Date().getMonth()+1 && wDay1[i] == new Date().getDate())?
					"#FFD700":"#e0e0e0");
				//��ѡ�е�������ʾΪ����ȥ
				if(yy==outDate1.getFullYear() && mm== outDate1.getMonth() + 1 && wDay1[i]==outDate1.getDate())
				{
					da.borderColorLight="#FFFFFF";
					da.borderColorDark="#FF9900";
				}
			}
		}
        da.style.cursor="hand"
      }
    else{da.innerHTML="";da.style.backgroundColor="";da.style.cursor="default"}
  }
}

function DayClick1(n,ex)  //�����ʾ��ѡȡ���ڣ������뺯��*************
{
  var yy=theYear1;
  var mm = parseInt(theMonth1)+ex;	//ex��ʾƫ����������ѡ���ϸ��·ݺ��¸��·ݵ�����
	//�ж��·ݣ������ж�Ӧ�Ĵ���
	if(mm<1){
		yy--;
		mm=12+mm;
	}
	else if(mm>12){
		yy++;
		mm=mm-12;
	}
	
  if (mm < 10){mm = "0" + mm;}
  if (n < 10) {n = "0" + n;}

  /*
  if (outObject1)
  {
    if (!n) {//outObject1.value=""; 
      return;}
    if ( n < 10){n = "0" + n;}
    //outObject1.value= yy + separator1 + mm + separator1 + n ;
	
    closeLayer1(); 
  }
  */
  	myYear1.value  = yy;
	myMonth1.value = mm;
	myDay1.value   = n;
	closeLayer1(); 

  //else {closeLayer1(); alert("����Ҫ����Ŀؼ����󲢲�����!");}
}