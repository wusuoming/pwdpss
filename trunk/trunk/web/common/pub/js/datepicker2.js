//----------------------------------------------------------------------------
//  Javascript�����ؼ���������MS IE(5.0����)�����.
//----------------------------------------------------------------------------
//  Written by Meizz,  Finished by MingJie Xu,  Last Update: 2004-11-11
//  ������ֻѡ������.
//----------------------------------------------------------------------------
//  �÷������ú��� setday(this,[object])��setday(this)��[object]�ǿؼ�����Ŀؼ���.
//  ������
//  1. <input name=txt><input type=button value=setday onclick="setday(this,document.all.txt)">
//  2. <input onfocus="setday(this)">

//============================================ �����趨���� ==============================================

var bMoveable2 = true;		//���������Ƿ�����϶�
var separator2 = "-";        //������ʾ��ʽΪyyyy-MM-dd

//============================================ WEB ҳ����ʾ���� ==========================================

var strFrame2;		    //����������HTML����
document.writeln('<iframe id=dateLayer2  frameborder=0 style="position: absolute; width: 155; height: 75; z-index: 9998; display:none"></iframe>');
strFrame2='<style>';
strFrame2+='INPUT.button{BORDER-RIGHT: #ff9900 1px solid;BORDER-TOP: #ff9900 1px solid;BORDER-LEFT: #ff9900 1px solid;';
strFrame2+='BORDER-BOTTOM: #ff9900 1px solid;BACKGROUND-COLOR: #fff8ec;font-family:����;}';
strFrame2+='TD{FONT-SIZE: 9pt;font-family:����;}';
strFrame2+='</style>';
strFrame2+='<scr' + 'ipt>';
strFrame2+='var datelayerx,datelayery;	/*��������ؼ������λ��*/';
strFrame2+='var bDrag;	/*����Ƿ�ʼ�϶�*/';
strFrame2+='function document.onmousemove()	/*������ƶ��¼��У������ʼ�϶����������ƶ�����*/';
strFrame2+='{if(bDrag && window.event.button==1)';
strFrame2+='	{var DateLayer=parent.document.all.dateLayer2.style;';
strFrame2+='		DateLayer.posLeft += window.event.clientX-datelayerx;/*����ÿ���ƶ��Ժ����λ�ö��ָ�Ϊ��ʼ��λ�ã����д����div�в�ͬ*/';
strFrame2+='		DateLayer.posTop += window.event.clientY-datelayery;}}';
strFrame2+='function DragStart()		/*��ʼ�����϶�*/';
strFrame2+='{var DateLayer=parent.document.all.dateLayer2.style;';
strFrame2+='	datelayerx=window.event.clientX;';
strFrame2+='	datelayery=window.event.clientY;';
strFrame2+='	bDrag=true;}';
strFrame2+='function DragEnd(){		/*���������϶�*/';
strFrame2+='	bDrag=false;}';
strFrame2+='</scr' + 'ipt>';
strFrame2+='<div style="z-index:9999;position: absolute; left:0; top:0;" onselectstart="return false"><span id=tmpSelectYearLayer  style="z-index: 9999;position: absolute;top: 3; left: 19;display: none"></span>';
strFrame2+='<span id=tmpSelectMonthLayer  style="z-index: 9999;position: absolute;top: 3; left: 78;display: none"></span>';
strFrame2+='<table border=1 cellspacing=0 cellpadding=0 width=142 height=75 bordercolor=#ff9900 bgcolor=#ff9900 >';
strFrame2+='  <tr ><td width=142 height=23  bgcolor=#FFFFFF><table border=0 cellspacing=1 cellpadding=0 width=150  height=23>';
strFrame2+='      <tr align=center ><td width=16 align=center bgcolor=#ff9900 style="font-size:12px;cursor: hand;color: #ffffff" ';
strFrame2+='        onclick="parent.prevM2()" title="��ǰ�� 1 ��" ><b >&lt;</b>';
strFrame2+='        </td><td width=60 align=center style="font-size:12px;cursor:default"  ';
strFrame2+='onmouseover="style.backgroundColor=\'#FFD700\'" onmouseout="style.backgroundColor=\'white\'" ';
strFrame2+='onclick="parent.tmpSelectYearInnerHTML2(this.innerText.substring(0,4))" title="�������ѡ�����"><span  id=YearHead></span></td>';
strFrame2+='<td width=48 align=center style="font-size:12px;cursor:default"  onmouseover="style.backgroundColor=\'#FFD700\'" ';
strFrame2+=' onmouseout="style.backgroundColor=\'white\'" onclick="parent.tmpSelectMonthInnerHTML2(this.innerText.length==3?this.innerText.substring(0,1):this.innerText.substring(0,2))"';
strFrame2+='        title="�������ѡ���·�"><span id=MonthHead ></span></td>';
strFrame2+='        <td width=16 bgcolor=#ff9900 align=center style="font-size:12px;cursor: hand;color: #ffffff" ';
strFrame2+='         onclick="parent.nextM2()" title="��� 1 ��" ><b >&gt;</b></td></tr>';
strFrame2+='    </table></td></tr>';

strFrame2+='  <tr ><td width=142 height=12 >';
strFrame2+='    <table border=1 cellspacing=2 cellpadding=0 BORDERCOLORLIGHT=#FF9900 BORDERCOLORDARK=#FFFFFF bgcolor=#fff8ec width=150 height=12 >';
var n2=0; for (j2=0;j2<5;j2++){ strFrame2+= ' <tr align=center style="display:none">'; for (i2=0;i2<7;i2++){
strFrame2+='<td width=20 height=20 id=Day'+n2+' style="font-size:12px"  onclick=parent.DayClick2(this.innerText,0)></td>';n2++;}
strFrame2+='</tr>';}

strFrame2+='      <tr align=center style="display:none">';
for (i2=35;i2<39;i2++)strFrame2+='<td width=20 height=20 id=Day'+i2+' style="font-size:12px"  onclick="parent.DayClick2(this.innerText,0)"></td>';
strFrame2+='        <td colspan=3 align=center >';
strFrame2+='        <span onclick=parent.clear2() title="�����ǰѡ�������" style="font-size:12px;cursor: hand"><u>���</u></span>&nbsp;';
strFrame2+='<span onclick=parent.closeLayer2() title="�ر�����ѡ�񴰿�" style="font-size:12px;cursor: hand"><u>�ر�</u></span>';
strFrame2+='</td></tr>';


strFrame2+='      <tr align=center style="display:">';
strFrame2+='        <td align=center >';
strFrame2+='<span onclick="parent.setDay2(parent.theYear2,parent.theMonth2);parent.DayClick2(this.innerText,0)" title="���õ�ǰ��ѡ��" style="font-size:12px;cursor: hand"><u>ȷ��</u></span>&nbsp;';
strFrame2+='<span onclick=parent.clear2() title="�����ǰѡ�������" style="font-size:12px;cursor: hand"><u>���</u></span>&nbsp;';
strFrame2+='<span onclick=parent.closeLayer2() title="�ر�����ѡ�񴰿�" style="font-size:12px;cursor: hand"><u>�ر�</u></span>';
strFrame2+='</td></tr>';


strFrame2+='    </table></td></tr><tr ><td >';
strFrame2+='        <table border=0 cellspacing=1 cellpadding=0 width=100%  bgcolor=#FFFFFF>';
strFrame2+='          <tr ><td  align=left><input  type=button class=button value="<<" title="��ǰ�� 1 ��" onclick="parent.prevY2()" ';
strFrame2+='             onfocus="this.blur()" style="font-size: 12px; height: 20px"><input  class=button title="��ǰ�� 1 ��" type=button ';
strFrame2+='             value="< " onclick="parent.prevM2()" onfocus="this.blur()" style="font-size: 12px; height: 20px"></td><td ';
strFrame2+='              align=center><input  type=button class=button value=���� onclick="parent.today2()" ';
strFrame2+='             onfocus="this.blur()" title="��ǰ����" style="font-size: 12px; height: 20px; cursor:hand"></td><td ';
strFrame2+='              align=right><input  type=button class=button value=" >" onclick="parent.nextM2()" ';
strFrame2+='             onfocus="this.blur()" title="��� 1 ��" class=button style="font-size: 12px; height: 20px"><input ';
strFrame2+='              type=button class=button value=">>" title="��� 1 ��" onclick="parent.nextY2()"';
strFrame2+='             onfocus="this.blur()" style="font-size: 12px; height: 20px"></td>';
strFrame2+='</tr></table></td></tr></table></div>';

window.frames.dateLayer2.document.writeln(strFrame2);
window.frames.dateLayer2.document.close();		     //���IE������������������

//==================================================== WEB ҳ����ʾ���� ======================================================
var outObject2;
var outComponent2;		//����İ�ť
var outDate2="";		//��Ŷ��������
var odatelayer2=window.frames.dateLayer2.document.all;		//�����������

var myYear2;
var myMonth2;

//function setday2(tt,obj) //��������
function setday2(tt, y, m)
{
	myYear2  = y;
	myMonth2 = m;
	
	//if (arguments.length >  2){alert("�Բ���, ���뱾�ؼ��Ĳ���̫��!");return;}
	if (arguments.length == 0){alert("�Բ���, ��û�д������ؼ��κβ���!");return;}
	var dads  = document.all.dateLayer2.style;
	var th = tt;
	var ttop  = tt.offsetTop;     //TT�ؼ��Ķ�λ���
	var thei  = tt.clientHeight;  //TT�ؼ�����ĸ�
	var tleft = tt.offsetLeft;    //TT�ؼ��Ķ�λ���
	var ttyp  = tt.type;          //TT�ؼ�������
	while (tt = tt.offsetParent){ttop+=tt.offsetTop; tleft+=tt.offsetLeft;}
	dads.top  = (ttyp=="image")? ttop+thei : ttop+thei+2;
	dads.left = tleft;
	//outObject2 = (arguments.length == 1) ? th : obj;
	outComponent2 = (arguments.length == 1) ? null : th;	//�趨�ⲿ����İ�ť
	//���ݵ�ǰ������������ʾ����������
	var reg = /^(\d+)-(\d{1,2})-(\d{1,2})$/; 
	//var r = outObject2.value.match(reg); 
	var r;
	if(r!=null){
		r[2]=r[2]-1; 
		var d= new Date(r[1], r[2],r[3]); 
		if(d.getFullYear()==r[1] && d.getMonth()==r[2] && d.getDate()==r[3]){
			outDate2=d;		//�����ⲿ���������
		}
		else outDate2="";
			setDay2(r[1],r[2]+1);
	}
	else{
		outDate2="";
		setDay2(new Date().getFullYear(), new Date().getMonth() + 1);
	}
	dads.display = '';

	event.returnValue=false;
}

var MonHead2 = new Array(12);    		   //����������ÿ���µ��������
    MonHead2[0] = 31; MonHead2[1] = 28; MonHead2[2] = 31; MonHead2[3] = 30; MonHead2[4]  = 31; MonHead2[5]  = 30;
    MonHead2[6] = 31; MonHead2[7] = 31; MonHead2[8] = 30; MonHead2[9] = 31; MonHead2[10] = 30; MonHead2[11] = 31;

var theYear2=new Date().getFullYear(); //������ı����ĳ�ʼֵ
var theMonth2=new Date().getMonth()+1; //�����µı����ĳ�ʼֵ
var wDay2=new Array(39);               //����д���µ�����

function document.onkeyup()		//��Esc��ʱ�رոÿؼ�
{
    if(window.event.keyCode==27)
	{
		/*
		if(outObject2)
		{
			outObject2.blur();
		}
		*/
		closeLayer2();
	}
  }

function document.onclick() //������ʱ�رոÿؼ�
{
	with(window.event)
	{
		//if(srcElement != outObject2 && srcElement != outComponent2)
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

function writeHead2(yy,mm)  //�� head ��д�뵱ǰ��������
  {
	odatelayer2.YearHead.innerText  = yy + " ��";
    odatelayer2.MonthHead.innerText = mm + " ��";
  }

function tmpSelectYearInnerHTML2(strYear) //��ݵ�������
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
     s += "parent.theYear2 = this.value; parent.setDay2(parent.theYear2,parent.theMonth2)'>\r\n";
  var selectInnerHTML = s;
  for (var i = n; i < n + beforeCurrentYear + afterCurrentYear; i++)
  {
	if (i == m)
       {selectInnerHTML += "<option  value='" + i + "' selected>" + i + "��" + "</option>\r\n";}
    else {selectInnerHTML += "<option  value='" + i + "'>" + i + "��" + "</option>\r\n";}
  }
  selectInnerHTML += "</select>";
  odatelayer2.tmpSelectYearLayer.style.display="";
  odatelayer2.tmpSelectYearLayer.innerHTML = selectInnerHTML;
  odatelayer2.tmpSelectYear.focus();
}

function tmpSelectMonthInnerHTML2(strMonth) //�·ݵ�������
{
  if (strMonth.match(/\D/)!=null){alert("�·���������������֣�");return;}
  var m = (strMonth) ? strMonth : new Date().getMonth() + 1;
  var s = "<select  name=tmpSelectMonth style='font-size: 12px' "
     s += "onblur='document.all.tmpSelectMonthLayer.style.display=\"none\"' "
     s += "onchange='document.all.tmpSelectMonthLayer.style.display=\"none\";"
     s += "parent.theMonth2 = this.value; parent.setDay2(parent.theYear2,parent.theMonth2);parent.DayClick2(this.innerText,0)'>\r\n";
  var selectInnerHTML = s;
  for (var i = 1; i < 13; i++)
  {
    if (i == m)
       {selectInnerHTML += "<option  value='"+i+"' selected>"+i+"��"+"</option>\r\n";}
    else {selectInnerHTML += "<option  value='"+i+"'>"+i+"��"+"</option>\r\n";}
  }
  selectInnerHTML += "</select>";
  odatelayer2.tmpSelectMonthLayer.style.display="";
  odatelayer2.tmpSelectMonthLayer.innerHTML = selectInnerHTML;
  odatelayer2.tmpSelectMonth.focus();
}

function closeLayer2()               //�����Ĺر�
  {
    document.all.dateLayer2.style.display="none";
  }

function IsPinYear2(year)            //�ж��Ƿ���ƽ��
  {
    if (0==year%4&&((year%100!=0)||(year%400==0))) return true;else return false;
  }

function GetMonthCount2(year,month)  //�������Ϊ29��
  {
    var c=MonHead2[month-1];if((month==2)&&IsPinYear2(year)) c++;return c;
  }
function GetDOW2(day,month,year)     //��ĳ������ڼ�
  {
    var dt=new Date(year,month-1,day).getDay()/7; return dt;
  }

function prevY2()  //��ǰ�� Year
  {
    if(theYear2 > 999 && theYear2 <10000){theYear2--;}
    else{alert("��ݳ�����Χ(1000-9999)!");}
    setDay2(theYear2,theMonth2);
  }
function nextY2()  //���� Year
  {
    if(theYear2 > 999 && theYear2 <10000){theYear2++;}
    else{alert("��ݳ�����Χ(1000-9999)!");}
    setDay2(theYear2,theMonth2);
  }
function today2()  //Today Button
  {
	var today;
    theYear2 = new Date().getFullYear();
    theMonth2 = new Date().getMonth()+1;
    today=new Date().getDate();
    //setDay2(theYear2,theMonth2);
    /*
	if(outObject2){
		//outObject2.value=theYear2 + separator2 + theMonth2 + separator2 + today;
		//outObject2.value=theYear2 + separator2 + theMonth2;
    }
	*/
	myYear2.value = theYear2;
	if(theMonth2 < 10)
		theMonth2 = "0" + theMonth2;
	myMonth2.value = theMonth2;

    closeLayer2();
  }
function clear2()
{
	myYear2.value = "";
	myMonth2.value = "";
	/*
	if(outObject2)
	{
		outObject2.value = "";
	}
	*/
	//closeLayer2();
}
function prevM2()  //��ǰ���·�
  {
    if(theMonth2>1){theMonth2--}else{theYear2--;theMonth2=12;}
    setDay2(theYear2,theMonth2);
  }
function nextM2()  //�����·�
  {
    if(theMonth2==12){theYear2++;theMonth2=1}else{theMonth2++}
    setDay2(theYear2,theMonth2);
  }

function setDay2(yy,mm)   //��Ҫ��д����**********
{
  writeHead2(yy,mm);
  //���õ�ǰ���µĹ�������Ϊ����ֵ
  theYear2=yy;
  theMonth2=mm;
  
  for (var i = 0; i < 39; i++){wDay2[i]=""};  //����ʾ�������ȫ�����
  var day1 = 1,day2=1,firstday = new Date(yy,mm-1,1).getDay();  //ĳ�µ�һ������ڼ�
  for (i=0;i<firstday;i++)wDay2[i]=GetMonthCount2(mm==1?yy-1:yy,mm==1?12:mm-1)-firstday+i+1	//�ϸ��µ������
  for (i = firstday; day1 < GetMonthCount2(yy,mm)+1; i++){wDay2[i]=day1;day1++;}
  for (i=firstday+GetMonthCount2(yy,mm);i<39;i++){wDay2[i]=day2;day2++}
  for (i = 0; i < 39; i++)
  { var da = eval("odatelayer2.Day"+i)     //��д�µ�һ���µ�������������
    if (wDay2[i]!="")
      { 
		//��ʼ���߿�
		da.borderColorLight="#FF9900";
		da.borderColorDark="#FFFFFF";
		if(i<firstday)		//�ϸ��µĲ���
		{
			da.innerHTML="<b><font color=gray>" + wDay2[i] + "</font></b>";
			da.title=(mm==1?12:mm-1) +"��" + wDay2[i] + "��";
			da.onclick=Function("DayClick2(this.innerText,-1)");
			if(!outDate2)
				da.style.backgroundColor = ((mm==1?yy-1:yy) == new Date().getFullYear() && 
					(mm==1?12:mm-1) == new Date().getMonth()+1 && wDay2[i] == new Date().getDate()) ?
					 "#FFD700":"#e0e0e0";
			else
			{
				da.style.backgroundColor =((mm==1?yy-1:yy)==outDate2.getFullYear() && (mm==1?12:mm-1)== outDate2.getMonth() + 1 && 
				wDay2[i]==outDate2.getDate())? "#00ffff" :
				(((mm==1?yy-1:yy) == new Date().getFullYear() && (mm==1?12:mm-1) == new Date().getMonth()+1 && 
				wDay2[i] == new Date().getDate()) ? "#FFD700":"#e0e0e0");
				//��ѡ�е�������ʾΪ����ȥ
				if((mm==1?yy-1:yy)==outDate2.getFullYear() && (mm==1?12:mm-1)== outDate2.getMonth() + 1 && 
				wDay2[i]==outDate2.getDate())
				{
					da.borderColorLight="#FFFFFF";
					da.borderColorDark="#FF9900";
				}
			}
		}
		else if (i>=firstday+GetMonthCount2(yy,mm))		//�¸��µĲ���
		{
			da.innerHTML="<b><font color=gray>" + wDay2[i] + "</font></b>";
			//da.title=(mm==12?1:mm+1) +"��" + wDay2[i] + "��";
			da.title=(mm==12?1:parseInt(mm)+1) +"��" + wDay2[i] + "��";
			da.onclick=Function("DayClick2(this.innerText,1)");
			if(!outDate2)
				da.style.backgroundColor = ((mm==12?yy+1:yy) == new Date().getFullYear() && 
					(mm==12?1:mm+1) == new Date().getMonth()+1 && wDay2[i] == new Date().getDate()) ?
					 "#FFD700":"#e0e0e0";
			else
			{
				da.style.backgroundColor =((mm==12?yy+1:yy)==outDate2.getFullYear() && (mm==12?1:mm+1)== outDate2.getMonth() + 1 && 
				wDay2[i]==outDate2.getDate())? "#00ffff" :
				(((mm==12?yy+1:yy) == new Date().getFullYear() && (mm==12?1:mm+1) == new Date().getMonth()+1 && 
				wDay2[i] == new Date().getDate()) ? "#FFD700":"#e0e0e0");
				//��ѡ�е�������ʾΪ����ȥ
				if((mm==12?yy+1:yy)==outDate2.getFullYear() && (mm==12?1:mm+1)== outDate2.getMonth() + 1 && 
				wDay2[i]==outDate2.getDate())
				{
					da.borderColorLight="#FFFFFF";
					da.borderColorDark="#FF9900";
				}
			}
		}
		else		//���µĲ���
		{
			da.innerHTML="<b>" + wDay2[i] + "</b>";
			da.title=mm +"��" + wDay2[i] + "��";
			da.onclick=Function("DayClick2(this.innerText,0)");		//��td����onclick�¼��Ĵ���
			//����ǵ�ǰѡ������£�����ʾ����ɫ�ı���������ǵ�ǰ���£�����ʾ����ɫ����
			if(!outDate2)
				da.style.backgroundColor = (yy == new Date().getFullYear() && mm == new Date().getMonth()+1 && wDay2[i] == new Date().getDate())?
					"#FFD700":"#e0e0e0";
			else
			{
				da.style.backgroundColor =(yy==outDate2.getFullYear() && mm== outDate2.getMonth() + 1 && wDay2[i]==outDate2.getDate())?
					"#00ffff":((yy == new Date().getFullYear() && mm == new Date().getMonth()+1 && wDay2[i] == new Date().getDate())?
					"#FFD700":"#e0e0e0");
				//��ѡ�е�������ʾΪ����ȥ
				if(yy==outDate2.getFullYear() && mm== outDate2.getMonth() + 1 && wDay2[i]==outDate2.getDate())
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

function DayClick2(n,ex)  //�����ʾ��ѡȡ���£������뺯��*************
{
  var yy=theYear2;
  var mm = parseInt(theMonth2)+ex;	//ex��ʾƫ����������ѡ���ϸ��·ݺ��¸��·ݵ�����
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
  /*
  if (outObject2)
  {
    if (!n) {//outObject2.value=""; 
      return;}
    //if ( n < 10){n = "0" + n;}
    //outObject2.value= yy + separator2 + mm + separator2 + n ;
	outObject2.value= yy + separator2 + mm;
    closeLayer2(); 
  }
  */
	myYear2.value = yy;
	myMonth2.value = mm;
	closeLayer2();
  //else {closeLayer2(); alert("����Ҫ����Ŀؼ����󲢲�����!");}
}