//----------------------------------------------------------------------------
//  Javascript日历控件，适用于MS IE(5.0以上)浏览器.
//----------------------------------------------------------------------------
//  Written by Meizz,  Finished by MingJie Xu,  Last Update: 2004-11-11
//  适用于选择年月日.
//----------------------------------------------------------------------------
//  用法：调用函数 setday(this,[object])或setday(this)，[object]是控件输出的控件名.
//  举例：
//  1. <input name=txt><input type=button value=setday onclick="setday(this,document.all.txt)">
//  2. <input onfocus="setday(this)">

//============================================ 参数设定部分 ==============================================

var bMoveable1 = true;		//设置日历是否可以拖动
var separator1 = "-";        //日期显示格式为yyyy-MM-dd

//============================================ WEB 页面显示部分 ==========================================

var strFrame1;		    //存放日历层的HTML代码
document.writeln('<iframe id=dateLayer1  frameborder=0 style="position: absolute; width: 155; height: 211; z-index: 9998; display: none"></iframe>');
strFrame1='<style>';
strFrame1+='INPUT.button{BORDER-RIGHT: #ff9900 1px solid;BORDER-TOP: #ff9900 1px solid;BORDER-LEFT: #ff9900 1px solid;';
strFrame1+='BORDER-BOTTOM: #ff9900 1px solid;BACKGROUND-COLOR: #fff8ec;font-family:宋体;}';
strFrame1+='TD{FONT-SIZE: 9pt;font-family:宋体;}';
strFrame1+='</style>';
strFrame1+='<scr' + 'ipt>';
strFrame1+='var datelayerx,datelayery;	/*存放日历控件的鼠标位置*/';
strFrame1+='var bDrag;	/*标记是否开始拖动*/';
strFrame1+='function document.onmousemove()	/*在鼠标移动事件中，如果开始拖动日历，则移动日历*/';
strFrame1+='{if(bDrag && window.event.button==1)';
strFrame1+='	{var DateLayer=parent.document.all.dateLayer1.style;';
strFrame1+='		DateLayer.posLeft += window.event.clientX-datelayerx;/*由于每次移动以后鼠标位置都恢复为初始的位置，因此写法与div中不同*/';
strFrame1+='		DateLayer.posTop += window.event.clientY-datelayery;}}';
strFrame1+='function DragStart()		/*开始日历拖动*/';
strFrame1+='{var DateLayer=parent.document.all.dateLayer1.style;';
strFrame1+='	datelayerx=window.event.clientX;';
strFrame1+='	datelayery=window.event.clientY;';
strFrame1+='	bDrag=true;}';
strFrame1+='function DragEnd(){		/*结束日历拖动*/';
strFrame1+='	bDrag=false;}';
strFrame1+='</scr' + 'ipt>';
strFrame1+='<div style="z-index:9999;position: absolute; left:0; top:0;" onselectstart="return false"><span id=tmpSelectYearLayer  style="z-index: 9999;position: absolute;top: 3; left: 19;display: none"></span>';
strFrame1+='<span id=tmpSelectMonthLayer  style="z-index: 9999;position: absolute;top: 3; left: 78;display: none"></span>';
strFrame1+='<table border=1 cellspacing=0 cellpadding=0 width=142 height=160 bordercolor=#ff9900 bgcolor=#ff9900 >';
strFrame1+='  <tr ><td width=142 height=23  bgcolor=#FFFFFF><table border=0 cellspacing=1 cellpadding=0 width=150  height=23>';
strFrame1+='      <tr align=center ><td width=16 align=center bgcolor=#ff9900 style="font-size:12px;cursor: hand;color: #ffffff" ';
strFrame1+='        onclick="parent.prevM1()" title="向前翻 1 月" ><b >&lt;</b>';
strFrame1+='        </td><td width=60 align=center style="font-size:12px;cursor:default"  ';
strFrame1+='onmouseover="style.backgroundColor=\'#FFD700\'" onmouseout="style.backgroundColor=\'white\'" ';
strFrame1+='onclick="parent.tmpSelectYearInnerHTML1(this.innerText.substring(0,4))" title="点击这里选择年份"><span  id=YearHead></span></td>';
strFrame1+='<td width=48 align=center style="font-size:12px;cursor:default"  onmouseover="style.backgroundColor=\'#FFD700\'" ';
strFrame1+=' onmouseout="style.backgroundColor=\'white\'" onclick="parent.tmpSelectMonthInnerHTML1(this.innerText.length==3?this.innerText.substring(0,1):this.innerText.substring(0,2))"';
strFrame1+='        title="点击这里选择月份"><span id=MonthHead ></span></td>';
strFrame1+='        <td width=16 bgcolor=#ff9900 align=center style="font-size:12px;cursor: hand;color: #ffffff" ';
strFrame1+='         onclick="parent.nextM1()" title="向后翻 1 月" ><b >&gt;</b></td></tr>';
strFrame1+='    </table></td></tr>';
strFrame1+='  <tr ><td width=142 height=18 >';
strFrame1+='<table border=1 cellspacing=0 cellpadding=0 bgcolor=#ff9900 ' + (bMoveable1? 'onmousedown="DragStart()" onmouseup="DragEnd()"':'');
strFrame1+=' BORDERCOLORLIGHT=#FF9900 BORDERCOLORDARK=#FFFFFF width=150 height=20  style="cursor:' + (bMoveable1 ? 'move':'default') + '">';
strFrame1+='<tr  align=center valign=bottom><td style="font-size:12px;color:#FFFFFF" >日</td>';
strFrame1+='<td style="font-size:12px;color:#FFFFFF" >一</td><td style="font-size:12px;color:#FFFFFF" >二</td>';
strFrame1+='<td style="font-size:12px;color:#FFFFFF" >三</td><td style="font-size:12px;color:#FFFFFF" >四</td>';
strFrame1+='<td style="font-size:12px;color:#FFFFFF" >五</td><td style="font-size:12px;color:#FFFFFF" >六</td></tr>';
strFrame1+='</table></td></tr>';
strFrame1+='  <tr ><td width=142 height=120 >';
strFrame1+='    <table border=1 cellspacing=2 cellpadding=0 BORDERCOLORLIGHT=#FF9900 BORDERCOLORDARK=#FFFFFF bgcolor=#fff8ec width=150 height=120 >';
var n=0; for (j=0;j<5;j++){ strFrame1+= ' <tr align=center >'; for (i=0;i<7;i++){
strFrame1+='<td width=20 height=20 id=Day'+n+' style="font-size:12px"  onclick=parent.DayClick1(this.innerText,0)></td>';n++;}
strFrame1+='</tr>';}
strFrame1+='      <tr align=center >';
for (i=35;i<39;i++)strFrame1+='<td width=20 height=20 id=Day'+i+' style="font-size:12px"  onclick="parent.DayClick1(this.innerText,0)"></td>';
strFrame1+='        <td colspan=3 align=center >';
strFrame1+='        <span onclick=parent.clear1() title="清除当前选择的日期" style="font-size:12px;cursor: hand"><u>清除</u></span>&nbsp;';
strFrame1+='<span onclick=parent.closeLayer1() title="关闭日期选择窗口" style="font-size:12px;cursor: hand"><u>关闭</u></span>';
strFrame1+='</td></tr>';
strFrame1+='    </table></td></tr><tr ><td >';
strFrame1+='        <table border=0 cellspacing=1 cellpadding=0 width=100%  bgcolor=#FFFFFF>';
strFrame1+='          <tr ><td  align=left><input  type=button class=button value="<<" title="向前翻 1 年" onclick="parent.prevY1()" ';
strFrame1+='             onfocus="this.blur()" style="font-size: 12px; height: 20px"><input  class=button title="向前翻 1 月" type=button ';
strFrame1+='             value="< " onclick="parent.prevM1()" onfocus="this.blur()" style="font-size: 12px; height: 20px"></td><td ';
strFrame1+='              align=center><input  type=button class=button value=今天 onclick="parent.today1()" ';
strFrame1+='             onfocus="this.blur()" title="当前日期" style="font-size: 12px; height: 20px; cursor:hand"></td><td ';
strFrame1+='              align=right><input  type=button class=button value=" >" onclick="parent.nextM1()" ';
strFrame1+='             onfocus="this.blur()" title="向后翻 1 月" class=button style="font-size: 12px; height: 20px"><input ';
strFrame1+='              type=button class=button value=">>" title="向后翻 1 年" onclick="parent.nextY1()"';
strFrame1+='             onfocus="this.blur()" style="font-size: 12px; height: 20px"></td>';
strFrame1+='</tr></table></td></tr></table></div>';

window.frames.dateLayer1.document.writeln(strFrame1);
window.frames.dateLayer1.document.close();		     //解决IE进度条不结束的问题

//==================================================== WEB 页面显示部分 ======================================================
var outObject1;
var outComponent1;		//点击的按钮
var outDate1="";		//存放对象的日期
var odatelayer1=window.frames.dateLayer1.document.all;		//存放日历对象

var myYear1;
var myMonth1;
var myDay1;

//function setday(tt,obj, y, m, d) //主调函数
function setday1(tt, y, m, d)
{
	myYear1  = y;
	myMonth1 = m;
	myDay1   = d;

	//if (arguments.length >  2){alert("对不起, 传入本控件的参数太多!");return;}
	if (arguments.length == 0){alert("对不起, 您没有传给本控件任何参数!");return;}
	var dads  = document.all.dateLayer1.style;
	var th = tt;
	var ttop  = tt.offsetTop;     //TT控件的定位点高
	var thei  = tt.clientHeight;  //TT控件本身的高
	var tleft = tt.offsetLeft;    //TT控件的定位点宽
	var ttyp  = tt.type;          //TT控件的类型
	while (tt = tt.offsetParent){ttop+=tt.offsetTop; tleft+=tt.offsetLeft;}
	dads.top  = (ttyp=="image")? ttop+thei : ttop+thei+2;
	dads.left = tleft;
	//outObject1 = (arguments.length == 1) ? th : obj;
	outComponent1 = (arguments.length == 1) ? null : th;	//设定外部点击的按钮
	//根据当前输入框的日期显示日历的年月
	var reg = /^(\d+)-(\d{1,2})-(\d{1,2})$/; 
	
	//var r = outObject1.value.match(reg); 
	var r;
	if(r!=null){
		r[2]=r[2]-1; 
		var d= new Date(r[1], r[2],r[3]); 
		if(d.getFullYear()==r[1] && d.getMonth()==r[2] && d.getDate()==r[3]){
			outDate1=d;		//保存外部传入的日期
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

var MonHead1 = new Array(12);    		   //定义阳历中每个月的最大天数
    MonHead1[0] = 31; MonHead1[1] = 28; MonHead1[2] = 31; MonHead1[3] = 30; MonHead1[4]  = 31; MonHead1[5]  = 30;
    MonHead1[6] = 31; MonHead1[7] = 31; MonHead1[8] = 30; MonHead1[9] = 31; MonHead1[10] = 30; MonHead1[11] = 31;

var theYear1=new Date().getFullYear(); //定义年的变量的初始值
var theMonth1=new Date().getMonth()+1; //定义月的变量的初始值
var wDay1=new Array(39);               //定义写日期的数组

function document.onkeyup()		//按Esc键时关闭该控件
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

function document.onclick() //任意点击时关闭该控件
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

function writeHead1(yy,mm)  //往 head 中写入当前的年与月
  {
	odatelayer1.YearHead.innerText  = yy + " 年";
    odatelayer1.MonthHead.innerText = mm + " 月";
  }

function tmpSelectYearInnerHTML1(strYear) //年份的下拉框
{
  if (strYear.match(/\D/)!=null){alert("年份输入参数不是数字!");return;}
  var m = (strYear) ? strYear : new Date().getFullYear();
  if (m < 1000 || m > 9999) {alert("年份值不在 1000 到 9999 之间!");return;}

  var beforeCurrentYear = 15;    //beforeCurrentYear    = 在下拉列表中显示当前年之前多少个年份
  var afterCurrentYear = 16;      //afterCurrentYear - 1 = 在下拉列表中显示当前年之后多少个年份
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
       {selectInnerHTML += "<option  value='" + i + "' selected>" + i + "年" + "</option>\r\n";}
    else {selectInnerHTML += "<option  value='" + i + "'>" + i + "年" + "</option>\r\n";}
  }
  selectInnerHTML += "</select>";
  odatelayer1.tmpSelectYearLayer.style.display="";
  odatelayer1.tmpSelectYearLayer.innerHTML = selectInnerHTML;
  odatelayer1.tmpSelectYear.focus();
}

function tmpSelectMonthInnerHTML1(strMonth) //月份的下拉框
{
  if (strMonth.match(/\D/)!=null){alert("月份输入参数不是数字！");return;}
  var m = (strMonth) ? strMonth : new Date().getMonth() + 1;
  var s = "<select  name=tmpSelectMonth style='font-size: 12px' "
     s += "onblur='document.all.tmpSelectMonthLayer.style.display=\"none\"' "
     s += "onchange='document.all.tmpSelectMonthLayer.style.display=\"none\";"
     s += "parent.theMonth1 = this.value; parent.setDay1(parent.theYear1,parent.theMonth1)'>\r\n";
  var selectInnerHTML = s;
  for (var i = 1; i < 13; i++)
  {
    if (i == m)
       {selectInnerHTML += "<option  value='"+i+"' selected>"+i+"月"+"</option>\r\n";}
    else {selectInnerHTML += "<option  value='"+i+"'>"+i+"月"+"</option>\r\n";}
  }
  selectInnerHTML += "</select>";
  odatelayer1.tmpSelectMonthLayer.style.display="";
  odatelayer1.tmpSelectMonthLayer.innerHTML = selectInnerHTML;
  odatelayer1.tmpSelectMonth.focus();
}

function closeLayer1()               //这个层的关闭
  {
    document.all.dateLayer1.style.display="none";
  }

function IsPinYear1(year)            //判断是否闰平年
  {
    if (0==year%4&&((year%100!=0)||(year%400==0))) return true;else return false;
  }

function GetMonthCount1(year,month)  //闰年二月为29天
  {
    var c=MonHead1[month-1];if((month==2)&&IsPinYear1(year)) c++;return c;
  }
function GetDOW1(day,month,year)     //求某天的星期几
  {
    var dt=new Date(year,month-1,day).getDay()/7; return dt;
  }

function prevY1()  //往前翻 Year
  {
    if(theYear1 > 999 && theYear1 <10000){theYear1--;}
    else{alert("年份超出范围(1000-9999)!");}
    setDay1(theYear1,theMonth1);
  }
function nextY1()  //往后翻 Year
  {
    if(theYear1 > 999 && theYear1 <10000){theYear1++;}
    else{alert("年份超出范围(1000-9999)!");}
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
function prevM1()  //往前翻月份
  {
    if(theMonth1>1){theMonth1--}else{theYear1--;theMonth1=12;}
    setDay1(theYear1,theMonth1);
  }
function nextM1()  //往后翻月份
  {
    if(theMonth1==12){theYear1++;theMonth1=1}else{theMonth1++}
    setDay1(theYear1,theMonth1);
  }

function setDay1(yy,mm)   //主要的写程序**********
{
  writeHead1(yy,mm);
  //设置当前年月的公共变量为传入值
  theYear1=yy;
  theMonth1=mm;
  
  for (var i = 0; i < 39; i++){wDay1[i]=""};  //将显示框的内容全部清空
  var day1 = 1,day2=1,firstday = new Date(yy,mm-1,1).getDay();  //某月第一天的星期几
  for (i=0;i<firstday;i++)wDay1[i]=GetMonthCount1(mm==1?yy-1:yy,mm==1?12:mm-1)-firstday+i+1	//上个月的最后几天
  for (i = firstday; day1 < GetMonthCount1(yy,mm)+1; i++){wDay1[i]=day1;day1++;}
  for (i=firstday+GetMonthCount1(yy,mm);i<39;i++){wDay1[i]=day2;day2++}
  for (i = 0; i < 39; i++)
  { var da = eval("odatelayer1.Day"+i)     //书写新的一个月的日期星期排列
    if (wDay1[i]!="")
      { 
		//初始化边框
		da.borderColorLight="#FF9900";
		da.borderColorDark="#FFFFFF";
		if(i<firstday)		//上个月的部分
		{
			da.innerHTML="<b><font color=gray>" + wDay1[i] + "</font></b>";
			da.title=(mm==1?12:mm-1) +"月" + wDay1[i] + "日";
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
				//将选中的日期显示为凹下去
				if((mm==1?yy-1:yy)==outDate1.getFullYear() && (mm==1?12:mm-1)== outDate1.getMonth() + 1 && 
				wDay1[i]==outDate1.getDate())
				{
					da.borderColorLight="#FFFFFF";
					da.borderColorDark="#FF9900";
				}
			}
		}
		else if (i>=firstday+GetMonthCount1(yy,mm))		//下个月的部分
		{
			da.innerHTML="<b><font color=gray>" + wDay1[i] + "</font></b>";
			//da.title=(mm==12?1:mm+1) +"月" + wDay1[i] + "日";
			da.title=(mm==12?1:parseInt(mm)+1) +"月" + wDay1[i] + "日";
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
				//将选中的日期显示为凹下去
				if((mm==12?yy+1:yy)==outDate1.getFullYear() && (mm==12?1:mm+1)== outDate1.getMonth() + 1 && 
				wDay1[i]==outDate1.getDate())
				{
					da.borderColorLight="#FFFFFF";
					da.borderColorDark="#FF9900";
				}
			}
		}
		else		//本月的部分
		{
			da.innerHTML="<b>" + wDay1[i] + "</b>";
			da.title=mm +"月" + wDay1[i] + "日";
			da.onclick=Function("DayClick1(this.innerText,0)");		//给td赋予onclick事件的处理
			//如果是当前选择的日期，则显示亮蓝色的背景；如果是当前日期，则显示暗黄色背景
			if(!outDate1)
				da.style.backgroundColor = (yy == new Date().getFullYear() && mm == new Date().getMonth()+1 && wDay1[i] == new Date().getDate())?
					"#FFD700":"#e0e0e0";
			else
			{
				da.style.backgroundColor =(yy==outDate1.getFullYear() && mm== outDate1.getMonth() + 1 && wDay1[i]==outDate1.getDate())?
					"#00ffff":((yy == new Date().getFullYear() && mm == new Date().getMonth()+1 && wDay1[i] == new Date().getDate())?
					"#FFD700":"#e0e0e0");
				//将选中的日期显示为凹下去
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

function DayClick1(n,ex)  //点击显示框选取日期，主输入函数*************
{
  var yy=theYear1;
  var mm = parseInt(theMonth1)+ex;	//ex表示偏移量，用于选择上个月份和下个月份的日期
	//判断月份，并进行对应的处理
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

  //else {closeLayer1(); alert("您所要输出的控件对象并不存在!");}
}