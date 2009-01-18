//----------------------------------------------------------------------------
//  Javascript日历控件，适用于MS IE(5.0以上)浏览器.
//----------------------------------------------------------------------------
//  Written by Meizz,  Finished by MingJie Xu,  Last Update: 2004-11-11
//  适用于只选择年月.
//----------------------------------------------------------------------------
//  用法：调用函数 setday(this,[object])或setday(this)，[object]是控件输出的控件名.
//  举例：
//  1. <input name=txt><input type=button value=setday onclick="setday(this,document.all.txt)">
//  2. <input onfocus="setday(this)">

//============================================ 参数设定部分 ==============================================

var bMoveable2 = true;		//设置日历是否可以拖动
var separator2 = "-";        //年月显示格式为yyyy-MM-dd

//============================================ WEB 页面显示部分 ==========================================

var strFrame2;		    //存放日历层的HTML代码
document.writeln('<iframe id=dateLayer2  frameborder=0 style="position: absolute; width: 155; height: 75; z-index: 9998; display:none"></iframe>');
strFrame2='<style>';
strFrame2+='INPUT.button{BORDER-RIGHT: #ff9900 1px solid;BORDER-TOP: #ff9900 1px solid;BORDER-LEFT: #ff9900 1px solid;';
strFrame2+='BORDER-BOTTOM: #ff9900 1px solid;BACKGROUND-COLOR: #fff8ec;font-family:宋体;}';
strFrame2+='TD{FONT-SIZE: 9pt;font-family:宋体;}';
strFrame2+='</style>';
strFrame2+='<scr' + 'ipt>';
strFrame2+='var datelayerx,datelayery;	/*存放日历控件的鼠标位置*/';
strFrame2+='var bDrag;	/*标记是否开始拖动*/';
strFrame2+='function document.onmousemove()	/*在鼠标移动事件中，如果开始拖动日历，则移动日历*/';
strFrame2+='{if(bDrag && window.event.button==1)';
strFrame2+='	{var DateLayer=parent.document.all.dateLayer2.style;';
strFrame2+='		DateLayer.posLeft += window.event.clientX-datelayerx;/*由于每次移动以后鼠标位置都恢复为初始的位置，因此写法与div中不同*/';
strFrame2+='		DateLayer.posTop += window.event.clientY-datelayery;}}';
strFrame2+='function DragStart()		/*开始日历拖动*/';
strFrame2+='{var DateLayer=parent.document.all.dateLayer2.style;';
strFrame2+='	datelayerx=window.event.clientX;';
strFrame2+='	datelayery=window.event.clientY;';
strFrame2+='	bDrag=true;}';
strFrame2+='function DragEnd(){		/*结束日历拖动*/';
strFrame2+='	bDrag=false;}';
strFrame2+='</scr' + 'ipt>';
strFrame2+='<div style="z-index:9999;position: absolute; left:0; top:0;" onselectstart="return false"><span id=tmpSelectYearLayer  style="z-index: 9999;position: absolute;top: 3; left: 19;display: none"></span>';
strFrame2+='<span id=tmpSelectMonthLayer  style="z-index: 9999;position: absolute;top: 3; left: 78;display: none"></span>';
strFrame2+='<table border=1 cellspacing=0 cellpadding=0 width=142 height=75 bordercolor=#ff9900 bgcolor=#ff9900 >';
strFrame2+='  <tr ><td width=142 height=23  bgcolor=#FFFFFF><table border=0 cellspacing=1 cellpadding=0 width=150  height=23>';
strFrame2+='      <tr align=center ><td width=16 align=center bgcolor=#ff9900 style="font-size:12px;cursor: hand;color: #ffffff" ';
strFrame2+='        onclick="parent.prevM2()" title="向前翻 1 月" ><b >&lt;</b>';
strFrame2+='        </td><td width=60 align=center style="font-size:12px;cursor:default"  ';
strFrame2+='onmouseover="style.backgroundColor=\'#FFD700\'" onmouseout="style.backgroundColor=\'white\'" ';
strFrame2+='onclick="parent.tmpSelectYearInnerHTML2(this.innerText.substring(0,4))" title="点击这里选择年份"><span  id=YearHead></span></td>';
strFrame2+='<td width=48 align=center style="font-size:12px;cursor:default"  onmouseover="style.backgroundColor=\'#FFD700\'" ';
strFrame2+=' onmouseout="style.backgroundColor=\'white\'" onclick="parent.tmpSelectMonthInnerHTML2(this.innerText.length==3?this.innerText.substring(0,1):this.innerText.substring(0,2))"';
strFrame2+='        title="点击这里选择月份"><span id=MonthHead ></span></td>';
strFrame2+='        <td width=16 bgcolor=#ff9900 align=center style="font-size:12px;cursor: hand;color: #ffffff" ';
strFrame2+='         onclick="parent.nextM2()" title="向后翻 1 月" ><b >&gt;</b></td></tr>';
strFrame2+='    </table></td></tr>';

strFrame2+='  <tr ><td width=142 height=12 >';
strFrame2+='    <table border=1 cellspacing=2 cellpadding=0 BORDERCOLORLIGHT=#FF9900 BORDERCOLORDARK=#FFFFFF bgcolor=#fff8ec width=150 height=12 >';
var n2=0; for (j2=0;j2<5;j2++){ strFrame2+= ' <tr align=center style="display:none">'; for (i2=0;i2<7;i2++){
strFrame2+='<td width=20 height=20 id=Day'+n2+' style="font-size:12px"  onclick=parent.DayClick2(this.innerText,0)></td>';n2++;}
strFrame2+='</tr>';}

strFrame2+='      <tr align=center style="display:none">';
for (i2=35;i2<39;i2++)strFrame2+='<td width=20 height=20 id=Day'+i2+' style="font-size:12px"  onclick="parent.DayClick2(this.innerText,0)"></td>';
strFrame2+='        <td colspan=3 align=center >';
strFrame2+='        <span onclick=parent.clear2() title="清除当前选择的年月" style="font-size:12px;cursor: hand"><u>清除</u></span>&nbsp;';
strFrame2+='<span onclick=parent.closeLayer2() title="关闭年月选择窗口" style="font-size:12px;cursor: hand"><u>关闭</u></span>';
strFrame2+='</td></tr>';


strFrame2+='      <tr align=center style="display:">';
strFrame2+='        <td align=center >';
strFrame2+='<span onclick="parent.setDay2(parent.theYear2,parent.theMonth2);parent.DayClick2(this.innerText,0)" title="设置当前的选择" style="font-size:12px;cursor: hand"><u>确定</u></span>&nbsp;';
strFrame2+='<span onclick=parent.clear2() title="清除当前选择的年月" style="font-size:12px;cursor: hand"><u>清除</u></span>&nbsp;';
strFrame2+='<span onclick=parent.closeLayer2() title="关闭年月选择窗口" style="font-size:12px;cursor: hand"><u>关闭</u></span>';
strFrame2+='</td></tr>';


strFrame2+='    </table></td></tr><tr ><td >';
strFrame2+='        <table border=0 cellspacing=1 cellpadding=0 width=100%  bgcolor=#FFFFFF>';
strFrame2+='          <tr ><td  align=left><input  type=button class=button value="<<" title="向前翻 1 年" onclick="parent.prevY2()" ';
strFrame2+='             onfocus="this.blur()" style="font-size: 12px; height: 20px"><input  class=button title="向前翻 1 月" type=button ';
strFrame2+='             value="< " onclick="parent.prevM2()" onfocus="this.blur()" style="font-size: 12px; height: 20px"></td><td ';
strFrame2+='              align=center><input  type=button class=button value=当月 onclick="parent.today2()" ';
strFrame2+='             onfocus="this.blur()" title="当前年月" style="font-size: 12px; height: 20px; cursor:hand"></td><td ';
strFrame2+='              align=right><input  type=button class=button value=" >" onclick="parent.nextM2()" ';
strFrame2+='             onfocus="this.blur()" title="向后翻 1 月" class=button style="font-size: 12px; height: 20px"><input ';
strFrame2+='              type=button class=button value=">>" title="向后翻 1 年" onclick="parent.nextY2()"';
strFrame2+='             onfocus="this.blur()" style="font-size: 12px; height: 20px"></td>';
strFrame2+='</tr></table></td></tr></table></div>';

window.frames.dateLayer2.document.writeln(strFrame2);
window.frames.dateLayer2.document.close();		     //解决IE进度条不结束的问题

//==================================================== WEB 页面显示部分 ======================================================
var outObject2;
var outComponent2;		//点击的按钮
var outDate2="";		//存放对象的年月
var odatelayer2=window.frames.dateLayer2.document.all;		//存放日历对象

var myYear2;
var myMonth2;

//function setday2(tt,obj) //主调函数
function setday2(tt, y, m)
{
	myYear2  = y;
	myMonth2 = m;
	
	//if (arguments.length >  2){alert("对不起, 传入本控件的参数太多!");return;}
	if (arguments.length == 0){alert("对不起, 您没有传给本控件任何参数!");return;}
	var dads  = document.all.dateLayer2.style;
	var th = tt;
	var ttop  = tt.offsetTop;     //TT控件的定位点高
	var thei  = tt.clientHeight;  //TT控件本身的高
	var tleft = tt.offsetLeft;    //TT控件的定位点宽
	var ttyp  = tt.type;          //TT控件的类型
	while (tt = tt.offsetParent){ttop+=tt.offsetTop; tleft+=tt.offsetLeft;}
	dads.top  = (ttyp=="image")? ttop+thei : ttop+thei+2;
	dads.left = tleft;
	//outObject2 = (arguments.length == 1) ? th : obj;
	outComponent2 = (arguments.length == 1) ? null : th;	//设定外部点击的按钮
	//根据当前输入框的年月显示日历的年月
	var reg = /^(\d+)-(\d{1,2})-(\d{1,2})$/; 
	//var r = outObject2.value.match(reg); 
	var r;
	if(r!=null){
		r[2]=r[2]-1; 
		var d= new Date(r[1], r[2],r[3]); 
		if(d.getFullYear()==r[1] && d.getMonth()==r[2] && d.getDate()==r[3]){
			outDate2=d;		//保存外部传入的年月
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

var MonHead2 = new Array(12);    		   //定义阳历中每个月的最大天数
    MonHead2[0] = 31; MonHead2[1] = 28; MonHead2[2] = 31; MonHead2[3] = 30; MonHead2[4]  = 31; MonHead2[5]  = 30;
    MonHead2[6] = 31; MonHead2[7] = 31; MonHead2[8] = 30; MonHead2[9] = 31; MonHead2[10] = 30; MonHead2[11] = 31;

var theYear2=new Date().getFullYear(); //定义年的变量的初始值
var theMonth2=new Date().getMonth()+1; //定义月的变量的初始值
var wDay2=new Array(39);               //定义写年月的数组

function document.onkeyup()		//按Esc键时关闭该控件
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

function document.onclick() //任意点击时关闭该控件
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

function writeHead2(yy,mm)  //往 head 中写入当前的年与月
  {
	odatelayer2.YearHead.innerText  = yy + " 年";
    odatelayer2.MonthHead.innerText = mm + " 月";
  }

function tmpSelectYearInnerHTML2(strYear) //年份的下拉框
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
     s += "parent.theYear2 = this.value; parent.setDay2(parent.theYear2,parent.theMonth2)'>\r\n";
  var selectInnerHTML = s;
  for (var i = n; i < n + beforeCurrentYear + afterCurrentYear; i++)
  {
	if (i == m)
       {selectInnerHTML += "<option  value='" + i + "' selected>" + i + "年" + "</option>\r\n";}
    else {selectInnerHTML += "<option  value='" + i + "'>" + i + "年" + "</option>\r\n";}
  }
  selectInnerHTML += "</select>";
  odatelayer2.tmpSelectYearLayer.style.display="";
  odatelayer2.tmpSelectYearLayer.innerHTML = selectInnerHTML;
  odatelayer2.tmpSelectYear.focus();
}

function tmpSelectMonthInnerHTML2(strMonth) //月份的下拉框
{
  if (strMonth.match(/\D/)!=null){alert("月份输入参数不是数字！");return;}
  var m = (strMonth) ? strMonth : new Date().getMonth() + 1;
  var s = "<select  name=tmpSelectMonth style='font-size: 12px' "
     s += "onblur='document.all.tmpSelectMonthLayer.style.display=\"none\"' "
     s += "onchange='document.all.tmpSelectMonthLayer.style.display=\"none\";"
     s += "parent.theMonth2 = this.value; parent.setDay2(parent.theYear2,parent.theMonth2);parent.DayClick2(this.innerText,0)'>\r\n";
  var selectInnerHTML = s;
  for (var i = 1; i < 13; i++)
  {
    if (i == m)
       {selectInnerHTML += "<option  value='"+i+"' selected>"+i+"月"+"</option>\r\n";}
    else {selectInnerHTML += "<option  value='"+i+"'>"+i+"月"+"</option>\r\n";}
  }
  selectInnerHTML += "</select>";
  odatelayer2.tmpSelectMonthLayer.style.display="";
  odatelayer2.tmpSelectMonthLayer.innerHTML = selectInnerHTML;
  odatelayer2.tmpSelectMonth.focus();
}

function closeLayer2()               //这个层的关闭
  {
    document.all.dateLayer2.style.display="none";
  }

function IsPinYear2(year)            //判断是否闰平年
  {
    if (0==year%4&&((year%100!=0)||(year%400==0))) return true;else return false;
  }

function GetMonthCount2(year,month)  //闰年二月为29天
  {
    var c=MonHead2[month-1];if((month==2)&&IsPinYear2(year)) c++;return c;
  }
function GetDOW2(day,month,year)     //求某天的星期几
  {
    var dt=new Date(year,month-1,day).getDay()/7; return dt;
  }

function prevY2()  //往前翻 Year
  {
    if(theYear2 > 999 && theYear2 <10000){theYear2--;}
    else{alert("年份超出范围(1000-9999)!");}
    setDay2(theYear2,theMonth2);
  }
function nextY2()  //往后翻 Year
  {
    if(theYear2 > 999 && theYear2 <10000){theYear2++;}
    else{alert("年份超出范围(1000-9999)!");}
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
function prevM2()  //往前翻月份
  {
    if(theMonth2>1){theMonth2--}else{theYear2--;theMonth2=12;}
    setDay2(theYear2,theMonth2);
  }
function nextM2()  //往后翻月份
  {
    if(theMonth2==12){theYear2++;theMonth2=1}else{theMonth2++}
    setDay2(theYear2,theMonth2);
  }

function setDay2(yy,mm)   //主要的写程序**********
{
  writeHead2(yy,mm);
  //设置当前年月的公共变量为传入值
  theYear2=yy;
  theMonth2=mm;
  
  for (var i = 0; i < 39; i++){wDay2[i]=""};  //将显示框的内容全部清空
  var day1 = 1,day2=1,firstday = new Date(yy,mm-1,1).getDay();  //某月第一天的星期几
  for (i=0;i<firstday;i++)wDay2[i]=GetMonthCount2(mm==1?yy-1:yy,mm==1?12:mm-1)-firstday+i+1	//上个月的最后几天
  for (i = firstday; day1 < GetMonthCount2(yy,mm)+1; i++){wDay2[i]=day1;day1++;}
  for (i=firstday+GetMonthCount2(yy,mm);i<39;i++){wDay2[i]=day2;day2++}
  for (i = 0; i < 39; i++)
  { var da = eval("odatelayer2.Day"+i)     //书写新的一个月的年月星期排列
    if (wDay2[i]!="")
      { 
		//初始化边框
		da.borderColorLight="#FF9900";
		da.borderColorDark="#FFFFFF";
		if(i<firstday)		//上个月的部分
		{
			da.innerHTML="<b><font color=gray>" + wDay2[i] + "</font></b>";
			da.title=(mm==1?12:mm-1) +"月" + wDay2[i] + "日";
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
				//将选中的年月显示为凹下去
				if((mm==1?yy-1:yy)==outDate2.getFullYear() && (mm==1?12:mm-1)== outDate2.getMonth() + 1 && 
				wDay2[i]==outDate2.getDate())
				{
					da.borderColorLight="#FFFFFF";
					da.borderColorDark="#FF9900";
				}
			}
		}
		else if (i>=firstday+GetMonthCount2(yy,mm))		//下个月的部分
		{
			da.innerHTML="<b><font color=gray>" + wDay2[i] + "</font></b>";
			//da.title=(mm==12?1:mm+1) +"月" + wDay2[i] + "日";
			da.title=(mm==12?1:parseInt(mm)+1) +"月" + wDay2[i] + "日";
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
				//将选中的年月显示为凹下去
				if((mm==12?yy+1:yy)==outDate2.getFullYear() && (mm==12?1:mm+1)== outDate2.getMonth() + 1 && 
				wDay2[i]==outDate2.getDate())
				{
					da.borderColorLight="#FFFFFF";
					da.borderColorDark="#FF9900";
				}
			}
		}
		else		//本月的部分
		{
			da.innerHTML="<b>" + wDay2[i] + "</b>";
			da.title=mm +"月" + wDay2[i] + "日";
			da.onclick=Function("DayClick2(this.innerText,0)");		//给td赋予onclick事件的处理
			//如果是当前选择的年月，则显示亮蓝色的背景；如果是当前年月，则显示暗黄色背景
			if(!outDate2)
				da.style.backgroundColor = (yy == new Date().getFullYear() && mm == new Date().getMonth()+1 && wDay2[i] == new Date().getDate())?
					"#FFD700":"#e0e0e0";
			else
			{
				da.style.backgroundColor =(yy==outDate2.getFullYear() && mm== outDate2.getMonth() + 1 && wDay2[i]==outDate2.getDate())?
					"#00ffff":((yy == new Date().getFullYear() && mm == new Date().getMonth()+1 && wDay2[i] == new Date().getDate())?
					"#FFD700":"#e0e0e0");
				//将选中的年月显示为凹下去
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

function DayClick2(n,ex)  //点击显示框选取年月，主输入函数*************
{
  var yy=theYear2;
  var mm = parseInt(theMonth2)+ex;	//ex表示偏移量，用于选择上个月份和下个月份的年月
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
  //else {closeLayer2(); alert("您所要输出的控件对象并不存在!");}
}