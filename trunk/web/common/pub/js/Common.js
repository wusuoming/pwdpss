/****************************************************************************
 * DESC       ������JavaScript(����IE5/NN6)--Common Project���ƣ�Application Project�����޸�
 * AUTHOR     ��zhouxianli
 * CREATEDATE ��2003-05-04
 * MODIFYLIST ��   Name       Date            Reason/Contents
 *          ------------------------------------------------------
 *
 ************************************************************************************/

var verbose = true;//��ʾ������ϸ������������Ӧ��Ϊfalse

/**
 * �жϿͻ���������Ƿ�ΪNetscape
 * @return �ͻ��������ΪNetscape�򷵻�true,���򷵻�false;
 */
function isNetscape()
{
  if(navigator.appName=="Netscape")
    return true;
  else
    return false;
}

/**
 * �õ�����element��Document�е�name��ͬ��elements�е�˳��(��1��ʼ)
 * @param field element
 * @return ����element��Document�е�name��ͬ��elements�е�˳��(��1��ʼ)
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
 * ������Document�е�element��name���Ե��紫��ֵ��element������û���򷵻�0
 * @param fieldName Ԫ������
 * @return ��Document�е�element��name���Ե��紫��ֵ��element����
 */
function getElementCount(fieldName)
{
    var count = 0;
    count = document.getElementsByName(fieldName).length;
    return count;
}

/**
 * �õ��ַ������ֽڳ���
 * @param value �ַ���
 * @return �ַ������ֽڳ���
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
 * �õ�Table������Ԫ��
 * @param tableId ������
 * @return table������Ԫ��
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
    tempElements=tbody.getElementsByTagName("INPUT");    //����INPUT��

    for(i=0;i<tempElements.length;i++)
    {
      elements[index++]=tempElements[i];
    }

    tempElements=tbody.getElementsByTagName("SELECT");   //����SELECT��
    for(i=0;i<tempElements.length;i++)
    {
      elements[index++]=tempElements[i];
    }

    tempElements=tbody.getElementsByTagName("TEXTAREA"); //����TEXTAREA��
    for(i=0;i<tempElements.length;i++)
    {
      elements[index++]=tempElements[i];
    }

  }
  return elements;
}

/**
 * ȥ���ַ���ͷ�ո�
 * @param value �����ַ���
 * @return ȥ��ͷ�ո����ַ���
 */
function leftTrim(value)
{
  var re =/^\s*/;
  if(value==null)
    return null;

  return value.replace(re,"");
}

/**
 * ȥ���ַ���β�ո�
 * @param value �����ַ���
 * @return ȥ��β�ո����ַ���
 */
function rightTrim(value)
{
  var re =/\s*$/;
  if(value==null)
    return null;

  return value.replace(re,"");
}

/**
 * ȥ���ַ���ͷβ�ո�
 * @param value �����ַ���
 * @return ȥ��ͷβ�ո����ַ���
 */
function trim(value)
{
  return leftTrim(rightTrim(value));
}


/**
 * ������ʽ����
 * @param source �����ַ���
 * @param re ������ʽ
 * @return ������ʽ���Խ��
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

//�������Ƿ�Ϊ��
function isEmpty(field){
    if(field.value==null || trim(field.value)==""){
        return true;
    }
    return false;
}

//��ӡ��־��Ϣ
function log(value){
    if(verbose==true){
        window.status=(value);
    }
}


//У��Decimal
function checkDecimal(field,p,s,MinValue,MaxValue)
{
  field.value = trim(field.value);
  var strValue=field.value;
  if(strValue=="")
    strValue = "0";

  var desc   = field.description;
  //���description���Բ����ڣ�����name����
  if(desc==null)
    desc = field.name;

  if(!isNumeric(strValue))
  {
    alert("������Ϸ���" + desc +"\n����Ϊ����,����λ�Ϊ" + (p-s) + ",С��λ�Ϊ" + s);
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
    alert("������Ϸ���" + desc +"\n����Ϊ����,����λ�Ϊ" + (p-s) + ",С��λ�Ϊ" + s);
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
      alert("������Ϸ���" + desc +"\n����Ϊ����,��СֵΪ" + MinValue + ",���ֵΪ" +MaxValue);
      field.focus();
      field.select();
      return false;
    }
  }

  return true;
}


//�Ƚ����������ַ���
// date1=date2�򷵻�0 , date1>date2�򷵻�1 , date1<date2�򷵻�-1
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


//�Ƚ����������ַ�����YYYY/MM�ͣ�
// date1=date2�򷵻�0 , date1>date2�򷵻�1 , date1<date2�򷵻�-1
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

// ��д������ --onkeypressʱ���ø÷���
function uppercaseKey()
{
  var keycode = window.event.keyCode;
  if( keycode>=97 && keycode<=122 )
  {
    window.event.keyCode = keycode-32;
  }
}

//����ͼƬ-2
//function changeImage(imageSrc,gif)
//{
//	alert(imageSrc.src);
//    imageSrc.src = '/piccaudit/common/images/' + gif;
//}

//�ύ����ͼƬdisabled-1
function submitFmBeforeChgImg(fm,imageId)
{
 	document.getElementById(imageId).disabled = true;
	fm.submit();
}

//���ύֻ��ͼƬdisabled-1
function disabledImg(fm,imageId)
{
 	document.getElementById(imageId).disabled = true;
}

//��ť�����¼��������������ʾ
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
    strContext = ""; //����strCodeTypeTemp��strCodeCodeȡ����
    fm.elements[intElementIndex + intCodeNameOffset].value = strContext;
    showSubPageClause(Field,strSubPageCode);
  }
  showSubPageClause(Field,strSubPageCode);
}

//���������
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

//��ʾ�����
//leftMove Ĭ��ֵ0����������leftMove
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
  var strCompare = "Context"; //�Ƚ��ַ������������󼸸��ַ���Context
  if(strTemp.indexOf(strCompare)>-1)
  {
    strTemp = strTemp.substring(strTemp.length - strCompare.length);
  }
  else
  {
    strTemp = "";
  }

  var ex=window.event.clientX+document.body.scrollLeft;  //�õ��¼�������x
  var ey=window.event.clientY+document.body.scrollTop;   //�õ��¼�������y
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
//�������ݸ�ʽ. field:������intLength:��������λ����fraLength:С������λ����desc:����������Ϣ��
//����Ǹ��������Ų���������λ���ڡ�
function checkDecimalValue(field, intLength, fraLength, desc)
{
	var numValue = trim(field.value);
	if(!isNumber(numValue)) //���ǺϷ�������.
	{
		alert(desc);
		field.focus();
		field.select();
		return false;
	}
	else //�ǺϷ�������.
	{
		if(numValue.indexOf(".") != -1) //��С����
		{
			var numArray = numValue.split(".");
			if(numArray[1].length > fraLength) //����С��λ��.
			{
				alert(desc);
				field.focus();
				field.select();
				return false;
			}
			if(numArray[0].charAt(0) != '-') //���Ǹ���
			{
				if(numArray[0].length > intLength)
				{
					alert(desc);
					field.focus();
					field.select();
					return false;
				}
			}
			else //�Ǹ���
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
		else //û��С����
		{
			if(numValue.charAt(0) != '-') //���Ǹ���
			{
				if(numValue.length > intLength)
				{
					alert(desc);
					field.focus();
					field.select();
					return false;
				}
			}
			else //�Ǹ���
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
			alert(message + "���ܰ��������ţ����԰���˫���ţ���");
			return false;
		}
	}
	return true;
}

//===============================================================================================
