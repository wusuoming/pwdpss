/****************************************************************************
 * DESC       ：公用JavaScript(兼容IE5/NN6)--Common Project控制，Application Project不能修改
 * AUTHOR     ：zhouxianli
 * CREATEDATE ：2003-05-04
 * MODIFYLIST ：   Name       Date            Reason/Contents
 *          ------------------------------------------------------
 *
 ************************************************************************************/

var verbose = true;//显示所有明细，生产环境中应改为false

/**
 * 判断客户端浏览器是否为Netscape
 * @return 客户端浏览器为Netscape则返回true,否则返回false;
 */
function isNetscape()
{
  if(navigator.appName=="Netscape")
    return true;
  else
    return false;
}

/**
 * 得到传入element在Document中的name相同的elements中的顺序(从1开始)
 * @param field element
 * @return 传入element在Document中的name相同的elements中的顺序(从1开始)
 */
function getElementOrder(field)
{
    var i = 0;
    var order = 0;
    var elements = document.getElementsByName(field.name);
    for(i=0;i<elements.length;i++)
    {
        order++;
        if(elements[i]==field)
        {
            break;
        }
    }

    return order;
}


/**
 * 查找在Document中的element的name属性等如传入值的element个数，没有则返回0
 * @param fieldName 元素名称
 * @return 在Document中的element的name属性等如传入值的element个数
 */
function getElementCount(fieldName)
{
    var count = 0;
    count = document.getElementsByName(fieldName).length;
    return count;
}

/**
 * 得到字符串的字节长度
 * @param value 字符串
 * @return 字符串的字节长度
 */
function getByteLength(value)
{
  var str;
  var count  = 0;

  for(var i=0;i<value.length;i++)
  {
    str = escape(value.charAt(i));
    if(str.length==6)
      count = count + 2;
    else
      count = count + 1;
  }

  return count;
}

/**
 * 得到Table的所有元素
 * @param tableId 表名称
 * @return table的所有元素
 */
function getTableElements(tableId)
{
  var i = 0;
  var elements=new Array();
  var tempElements = null;
  var tbody;
  var index=0;
  var tbodies = document.getElementById(tableId).tBodies;
  for(i=0;i<tbodies.length;i++)
  {
    tbody=tbodies.item(i);
    tempElements=tbody.getElementsByTagName("INPUT");    //加入INPUT域

    for(i=0;i<tempElements.length;i++)
    {
      elements[index++]=tempElements[i];
    }

    tempElements=tbody.getElementsByTagName("SELECT");   //加入SELECT域
    for(i=0;i<tempElements.length;i++)
    {
      elements[index++]=tempElements[i];
    }

    tempElements=tbody.getElementsByTagName("TEXTAREA"); //加入TEXTAREA域
    for(i=0;i<tempElements.length;i++)
    {
      elements[index++]=tempElements[i];
    }

  }
  return elements;
}

/**
 * 去掉字符串头空格
 * @param value 传人字符串
 * @return 去掉头空格后的字符串
 */
function leftTrim(value)
{
  var re =/^\s*/;
  if(value==null)
    return null;

  return value.replace(re,"");
}

/**
 * 去掉字符串尾空格
 * @param value 传人字符串
 * @return 去掉尾空格后的字符串
 */
function rightTrim(value)
{
  var re =/\s*$/;
  if(value==null)
    return null;

  return value.replace(re,"");
}

/**
 * 去掉字符串头尾空格
 * @param value 传人字符串
 * @return 去掉头尾空格后的字符串
 */
function trim(value)
{
  return leftTrim(rightTrim(value));
}


/**
 * 正则表达式测试
 * @param source 传人字符串
 * @param re 正则表达式
 * @return 正则表达式测试结果
 */
function regExpTest(source,re)
{
  var result = false;

  if(source==null || source=="")
    return false;

  if(source==re.exec(source))
    result = true;

  return result;
}

//输入域是否为空
function isEmpty(field){
    if(field.value==null || trim(field.value)==""){
        return true;
    }
    return false;
}

//打印日志信息
function log(value){
    if(verbose==true){
        window.status=(value);
    }
}


//校验Decimal
function checkDecimal(field,p,s,MinValue,MaxValue)
{
  field.value = trim(field.value);
  var strValue=field.value;
  if(strValue=="")
    strValue = "0";

  var desc   = field.description;
  //如果description属性不存在，则用name属性
  if(desc==null)
    desc = field.name;

  if(!isNumeric(strValue))
  {
    alert("请输入合法的" + desc +"\n类型为数字,整数位最长为" + (p-s) + ",小数位最长为" + s);
    field.focus();
    field.select();
    return false;
  }
  p = parseInt(p,10);
  s = parseInt(s,10);

  var pLength;
  var sLength;
  var position = strValue.indexOf(".");
  if(position>-1)
  {
    pLength = position;
    sLength = strValue.length - position - 1;
  }
  else
  {
    pLength = strValue.length;
    sLength = 0;
  }

  if(pLength>(p-s) || sLength>s)
  {
    alert("请输入合法的" + desc +"\n类型为数字,整数位最长为" + (p-s) + ",小数位最长为" + s);
    field.focus();
    field.select();
    return false;
  }

  var value = parseFloat(strValue);
  if(MaxValue!=null && MinValue!=null && MaxValue!="" && MinValue!="")
  {
    MinValue = parseFloat(MinValue);
    MaxValue = parseFloat(MaxValue);
    if(isNaN(value) || value>MaxValue || value<MinValue)
    {
      alert("请输入合法的" + desc +"\n类型为数字,最小值为" + MinValue + ",最大值为" +MaxValue);
      field.focus();
      field.select();
      return false;
    }
  }

  return true;
}


//比较两个日期字符串
// date1=date2则返回0 , date1>date2则返回1 , date1<date2则返回-1
function compareFullDate(date1,date2)
{
  var strValue1=date1.split("/");
  var date1Temp=new Date(strValue1[0],parseInt(strValue1[1],10)-1,parseInt(strValue1[2],10));

  var strValue2=date2.split("/");
  var date2Temp=new Date(strValue2[0],parseInt(strValue2[1],10)-1,parseInt(strValue2[2],10));

  if(date1Temp.getTime()==date2Temp.getTime())
    return 0;
  else if(date1Temp.getTime()>date2Temp.getTime())
    return 1;
  else
    return -1;
}


//比较两个日期字符串（YYYY/MM型）
// date1=date2则返回0 , date1>date2则返回1 , date1<date2则返回-1
function compareYM(date1,date2)
{
  var strValue1=date1.split("/");
  var date1Temp=new Date(strValue1[0],parseInt(strValue1[1],10)-1,1);

  var strValue2=date2.split("/");
  var date2Temp=new Date(strValue2[0],parseInt(strValue2[1],10)-1,1);

  if(date1Temp.getTime()==date2Temp.getTime())
    return 0;
  else if(date1Temp.getTime()>date2Temp.getTime())
    return 1;
  else
    return -1;
}

// 大写输入域 --onkeypress时调用该方法
function uppercaseKey()
{
  var keycode = window.event.keyCode;
  if( keycode>=97 && keycode<=122 )
  {
    window.event.keyCode = keycode-32;
  }
}

//更换图片-2
//function changeImage(imageSrc,gif)
//{
//	alert(imageSrc.src);
//    imageSrc.src = '/piccaudit/common/images/' + gif;
//}

//提交并将图片disabled-1
function submitFmBeforeChgImg(fm,imageId)
{
 	document.getElementById(imageId).disabled = true;
	fm.submit();
}

//不提交只将图片disabled-1
function disabledImg(fm,imageId)
{
 	document.getElementById(imageId).disabled = true;
}

//按钮单击事件，用于条款的显示
function buttonOnClick(Field,strCodeType,intCodeCodeOffset,intCodeNameOffset,strSubPageCode)
{
  var intElementIndex=getElementIndex(Field);
  var strCodeCode = trim(fm.elements[intElementIndex + intCodeCodeOffset].value);
  var strContext  = trim(fm.elements[intElementIndex + intCodeNameOffset].value);
  var strCodeTypeTemp = "";
  if(strCodeType.indexOf("Context")>-1)
  {
    strCodeTypeTemp = strCodeType.substring(0,strCodeType.indexOf("Context"));
  }
  else
  {
    return;
  }
  if(strContext=="")
  {
    strContext = ""; //根据strCodeTypeTemp、strCodeCode取内容
    fm.elements[intElementIndex + intCodeNameOffset].value = strContext;
    showSubPageClause(Field,strSubPageCode);
  }
  showSubPageClause(Field,strSubPageCode);
}

//隐藏输入框
function hideSubPageClause(field,spanID)
{
  var intIndex = parseInt(getElementOrder(field),10) - 1;
  var span ;
  if(getElementCount(spanID)<=1){
       span = eval(spanID);
  }else{
       span = eval(spanID + "(" + intIndex + ")");
  }
  span.style.display ='none';
}

//显示输入框
//leftMove 默认值0，坐标左移leftMove
function showSubPageClause(field,spanID,leftMove)
{
  var intLeftMove = (leftMove==null?0:leftMove);
  var intIndex = parseInt(getElementOrder(field),10) - 1;
  var span ;
  if(getElementCount(spanID)<=1){
       span = eval(spanID);
  }else{
       span = eval(spanID + "(" + intIndex + ")");
  }
  var strTemp = span.id;
  var strCompare = "Context"; //比较字符串，条款的最后几个字符是Context
  if(strTemp.indexOf(strCompare)>-1)
  {
    strTemp = strTemp.substring(strTemp.length - strCompare.length);
  }
  else
  {
    strTemp = "";
  }

  var ex=window.event.clientX+document.body.scrollLeft;  //得到事件的坐标x
  var ey=window.event.clientY+document.body.scrollTop;   //得到事件的坐标y
  if(strTemp==strCompare)
  {
    ex = ex - 520;
  }
  if (ex<0)
  {
    ex = 0;
  }
  ex = ex - intLeftMove;
  span.style.left=ex;
  span.style.top=ey;
  span.style.display ='';
}

//===============================================================================================
//Added by xumingjie.
//检验数据格式. field:输入域；intLength:整数部分位数；fraLength:小数部分位数；desc:错误描述信息。
//如果是负数，负号不记入整数位数内。
function checkDecimalValue(field, intLength, fraLength, desc)
{
	var numValue = trim(field.value);
	if(!isNumber(numValue)) //不是合法的数字.
	{
		alert(desc);
		field.focus();
		field.select();
		return false;
	}
	else //是合法的数字.
	{
		if(numValue.indexOf(".") != -1) //有小数点
		{
			var numArray = numValue.split(".");
			if(numArray[1].length > fraLength) //检验小数位数.
			{
				alert(desc);
				field.focus();
				field.select();
				return false;
			}
			if(numArray[0].charAt(0) != '-') //不是负数
			{
				if(numArray[0].length > intLength)
				{
					alert(desc);
					field.focus();
					field.select();
					return false;
				}
			}
			else //是负数
			{
				if(numArray[0].length > intLength + 1)
				{
					alert(desc);
					field.focus();
					field.select();
					return false;
				}
			}
		}
		else //没有小数点
		{
			if(numValue.charAt(0) != '-') //不是负数
			{
				if(numValue.length > intLength)
				{
					alert(desc);
					field.focus();
					field.select();
					return false;
				}
			}
			else //是负数
			{
				if(numValue.length > intLength + 1)
				{
					alert(desc);
					field.focus();
					field.select();
					return false;
				}
			}
		}
	}
	return true;
}

function isNumber(val)
{
	if(isNaN(val))
		return false;
	for(var k=0; k<val.length; k++)
	{
		if((val.charAt(k) < '0' || val.charAt(k) > '9') &&
			val.charAt(k) != '-' && val.charAt(k) != '.')
			return false;
	}
	return true;
}

function checkInputString(string, message)
{
	var chr;
	for(var i=0; i<string.length; i++)
	{
		chr = string.charAt(i);
		if(chr=='\'')
		{
			alert(message + "不能包含单引号（可以包含双引号）！");
			return false;
		}
	}
	return true;
}

//===============================================================================================
