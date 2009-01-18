/****************************************************************************
 * DESC       ：应用级JavaScript定义--Application Project控制(兼容IE5/NN6)
 * AUTHOR     ：zhouxianli
 * CREATEDATE ：2003-05-04
 * MODIFYLIST ：   Name       Date            Reason/Contents
 *          ------------------------------------------------------
 *               李子扬			2006-08-21       根据IAPlatform情况调整。
 ************************************************************************************/

/** 全局变量bCancel; */
var bCancel = false;

/**
 * 是否是多行输入域
 * @param field 元素
 * @return 是则返回true,否则返回false
 */
function isMulLineField(field)
{
    //以citem开头则返回true;
    if(field.name.indexOf("auCondition")==0 ||
       field.name.indexOf("auReply")==0 ||
			 field.name.indexOf("auConclusion")==0 ||
       field.name.indexOf("auAdjust")==0||
       field.name.indexOf("auProcTemplate")==0||
       field.name.indexOf("auProcedure")==0||
       field.name.indexOf("auGrouping")==0
    ) return true;
    return false;
}

/**
 * 隐藏输入框
 * @param field 元素
 * @param tableName tableName
 * @return 无
 */
function hideSubPage(field,tableName)
{
  var order = parseInt(getElementOrder(field),10);
  var obj = document.getElementsByName(tableName)[order-1];
  obj.style.display ='none';
}

/**
 * 显示输入框
 * @param field 元素
 * @param tableName tableName
 * @param leftMove 坐标左移偏移量，默认值0
 * @return 无
 */
function showSubPage(field,tableName,evt,leftMove)
{
    var order = parseInt(getElementOrder(field),10);
    var obj = document.getElementsByName(tableName)[order-1];
    var ex = evt.clientX+document.body.scrollLeft;
    var ey = evt.clientY+document.body.scrollTop;
    var intLeftMove = (leftMove==null?0:leftMove);

    strTemp = field.name;
    var strCompare = "Context"; //比较字符串，条款的最后几个字符是Context
    if(strTemp.indexOf(strCompare)>-1){
        strTemp = strTemp.substring(strTemp.length - strCompare.length);
    }
    else{
        strTemp = "";
    }

    if(strTemp==strCompare){
        ex = ex - 520;
    }

    if(strTemp==strCompare){
        ex = ex - 520;
    }
    ex = ex - intLeftMove;

    obj.style.display ='';
    obj.style.left=ex;
    obj.style.top=ey;
}


/**
 * 显示/隐藏页
 * @param fieldId
 * @param tableId tableId
 * @return 无
 */
function showPage(fieldId,tableId)
{
  var field = document.getElementById(fieldId);
  var table = document.getElementById(tableId);
  if(table.style.display==""){
    //关闭
    table.style.display="none";
    field.src="/sinoiaci/images/jia-jia.gif";
  }else{
    //打开
    table.style.display="";
    field.src="/sinoiaci/jian-jian.gif";
  }
}


/**
 * 验证必须输入项(覆盖struts中相应方法)
 * @param form form
 * @return 成功返回true,失败返回false
 */
function validateRequired(form) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //存放schemaColumns
    var count  = 0;
    for(i=0;i<form.elements.length;i++)
    {
        field = form.elements[i];
        if (field.type == 'text' ||
            field.type == 'file' ||
            field.type == 'textarea' ||
            field.type == 'select-one' ||
            field.type == 'radio' ||
            field.type == 'password') {

            count = getElementCount(field.name);
            //跳过多行第一条
            if((count>1 && getElementOrder(field)==1) ||
                (count==1 && isMulLineField(field))){
                continue;
            }

            schemaColumn = getSchemaColumn(field.name);

            if(schemaColumn==null){
                //log("字段" + field.name + "没有在ValidData.js中定义");
                continue;
            }
            //跳过可以为空的输入域
            if(schemaColumn.allowNulls==true){
                continue;
            }

            var value;
			// get field's value
			if (field.type == "select-one") {
				var si = field.selectedIndex;
				value = field.options[si].value;
			} else {
				value = field.value;
			}

            if (value == '') {
                if (focusField == null) {
                    focusField = field;
                }
                fields[fields.length] = schemaColumn;
                bValid = false;
            }
        }
    }

    if (fields.length>0) {
        var message = "";
        for(i=0;i<fields.length;i++){
            message = message + fields[i].desc + "不允许为空\n";
        }
        try{
            focusField.focus();
        }
        catch(E){
        }
        alert(message);
    }
    return bValid;
}


/**
 * 验证最小长度项(覆盖struts中相应方法)
 * @param form form
 * @return 成功返回true,失败返回false
 */
function validateMinLength(form) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //存放schemaColumns
    var count  = 0;
    for(i=0;i<form.elements.length;i++){
        field = form.elements[i];
        if (field.type == 'text' ||
            field.type == 'password' ||
            field.type == 'textarea') {

            count = getElementCount(field.name);
            if(count==1){
                if(!isMulLineField(field)){
                    schemaColumn = getSchemaColumn(field.name);

                    var iMin = parseInt(schemaColumn.minLength,10);
                    if (getByteLength(field.value) < iMin) {
                        if (focusField == null) {
                            focusField = field;
                        }
                        fields[fields.length] = schemaColumn;
                        bValid = false;
                    }
                }
            }
            else if(count>1)
            {
                var j=0;

                for(j=1;j<count;j++){
                    schemaColumn = getSchemaColumn(field[j].name);
                    var iMin = parseInt(schemaColumn.minLength,10);
                    if (getByteLength(field[j].value) < iMin) {
                        if (focusField == null) {
                            focusField = field[j];
                        }
                        fields[i++] = schemaColumn;
                        bValid = false;
                    }
                }
            }
        }
    }

    if (fields.length>0) {
        var message = "";
        for(i=0;i<fields.length;i++){
            message = message + fields[i].desc + "的最小长度不能小于" + fields[i].minLength + "\n";
        }
        focusField.focus();
        alert(message);
    }
    return bValid;
}


/**
 * 验证最大长度项
 * @param form form
 * @return 成功返回true,失败返回false
 */
function validateMaxLength(form) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //存放schemaColumns
    var count  = 0;
    for(i=0;i<form.elements.length;i++){
        field = form.elements[i];
        if (field.type == 'text' ||
            field.type == 'password' ||
            field.type == 'textarea') {

            count = getElementCount(field.name);
            if(count==1){
                if(!isMulLineField(field)) {
                    schemaColumn = getSchemaColumn(field.name);

                    var iMax = parseInt(schemaColumn.maxLength,10);
                    if (getByteLength(field.value) > iMax) {
                        if (focusField == null) {
                            focusField = field;
                        }
                        fields[fields.length] = schemaColumn;
                        bValid = false;
                    }
                }
            }
            else if(count>1){
                var j=0;

                for(j=1;j<count;j++)
                {
                    schemaColumn = getSchemaColumn(field[j].name);
                    var iMax = parseInt(schemaColumn.maxLength,10);
                    if (getByteLength(field[j].value) > iMax) {
                        if (focusField == null) {
                            focusField = field[j];
                        }
                        fields[i++] = schemaColumn;
                        bValid = false;
                    }
                }
            }
        }
    }

    if (fields.length>0) {
        var message = "";
        for(i=0;i<fields.length;i++){
            message = message + fields[i].desc + "的最大长度不能超过" + fields[i].maxLength + "\n";
        }

        focusField.focus();
        alert(message);
    }
    return bValid;
}

/**
 * 检查是否是char类型字段
 * @param form form
 * @return 成功返回true,失败返回false
 */
function isCharField(field,schemaColumn){
    var maxLength  = 0;
    var temp = schemaColumn.dataType;
    var start = schemaColumn.dataType.indexOf("(",4);//"("的位置
    var end = schemaColumn.dataType.indexOf(")",start);//")"的位置
    maxLength=parseInt(schemaColumn.dataType.substring(start+1,end),10);

    if (getByteLength(field.value) > maxLength) {
        return false;
    }
    return true;
}

/**
 * 检查是否是varchar类型字段
 * @param form form
 * @return 成功返回true,失败返回false
 */
function isVarcharField(field,schemaColumn){
    var maxLength  = 0;
    var minSpace  = 0;
    var temp = schemaColumn.dataType;
    var start = schemaColumn.dataType.indexOf("(",7);  //"("的位置
    var middle = schemaColumn.dataType.indexOf(",",start); //","的位置
    var end = schemaColumn.dataType.indexOf(")",start); //")"的位置
    if(middle==-1){ //没有设置最小值
        maxLength = parseInt(schemaColumn.dataType.substring(start+1,end),10);
        minSpace = 0;
    }
    else{
        maxLength = parseInt(schemaColumn.dataType.substring(start+1,middle),10);
        minSpace = parseInt(schemaColumn.dataType.substring(middle+1,end),10);
    }

    if (getByteLength(field.value) > maxLength) {
        return false;
    }
    if (getByteLength(field.value) < minSpace) {
        return false;
    }
    return true;
}


/**
 * 检查是否是decimal类型字段
 * @param form form
 * @return 成功返回true,失败返回false
 */
function isDecimalField(field,schemaColumn){
    var length  = 0;
    var scale  = 0;
    var temp = schemaColumn.dataType;
    var start = schemaColumn.dataType.indexOf("(",7);  //"("的位置
    var middle = schemaColumn.dataType.indexOf(",",start); //","的位置
    var end = schemaColumn.dataType.indexOf(")",start); //")"的位置
    var sign1 = "";
    var sign2 = "";
    var sign3 = "";
    field.value = trim(field.value);//去掉输入域头尾空格

    if(field.value.length==0){//为空的不做校验
        return true;
    }
    if(field.value.length > 0){
      sign1 = field.value.substring(0,1);
      if(field.value.length == 1 && !isInteger(sign1))
      {
        field.focus();
        field.select();
        return false;
      }
    }
    if(field.value.length > 1){
      sign2 = field.value.substring(1,2);
      sign3 = field.value.substring(0,2);
       if(field.value.length == 2 && !isInteger(sign2)){
        field.focus();
        field.select();
        return false;
      }
    }
    if(middle==-1){ //没有设置最小值
        length = parseInt(schemaColumn.dataType.substring(start+1,end),10);
        scale = 0;
    }
    else{
        length = parseInt(schemaColumn.dataType.substring(start+1,middle),10);
        scale = parseInt(schemaColumn.dataType.substring(middle+1,end),10);
    }
    if(!isInteger(sign1))
    {
      if(sign1 != "=" && sign1 != ">" && sign1 != "<" && sign1 != "!" && sign1 !="-")
      {
        errorMessage("比较操作符包括：=、>、<、>=、<=、<>、!=、:");
        field.focus();
        field.select();
        return false;
       }
       else if((!isInteger(sign2) && sign2 != "" && sign2 != "." && sign2=="-"))
       {
         if(sign3 != ">=" && sign3 != "<=" && sign3 != "<>" && sign3 != "!=" && sign3!=">-" && sign3!="<-" && sign3!="=-")
         {
           errorMessage("比较操作符包括：=、>、<、>=、<=、<>、!=、:");
           field.focus();
           field.select();
           return false;
          }
       }
    }

    field.value = trim(field.value);
    var strValue1=field.value;
    var strValue2="";
    if(!isInteger(sign1)){
      if(!isInteger(sign2)){
        strValue1=field.value.substring(2);
      }else{
        strValue1=field.value.substring(1);
      }
    }
    else{
        strValue1=field.value;
        if(strValue1.indexOf(":")!=-1){ //输入内容是区间
            strValue1 = strValue1.split(":");
            if(strValue1.length!=2){
              errorMessage("查询条件为区间时，只包括起、止两部分");
              field.focus();
              field.select();
              return false;
            }
            strValue2 = strValue1[1];
            strValue1 = strValue1[0];
        }
    }

    if(regExpTest(strValue1,/[+/-]?\d*[.]?\d*/g)==false){
        return false;
    }
    if(strValue2!=""){
      if(regExpTest(strValue2,/[+/-]?\d*[.]?\d*/g)==false){
         return false;
      }
    }

    //检查精度
    middle = strValue1.indexOf("."); //"."的位置
    if(middle>-1){
        if(scale<strValue1.substr(middle+1).length){
            return false;
        }
    }
    if(strValue2!=""){
      middle = strValue2.indexOf("."); //"."的位置
      if(middle>-1){
         if(scale<strValue2.substr(middle+1).length){
             return false;
         }
      }
    }

    if (getByteLength(strValue1) > length) {
        return false;
    }
    if(strValue2!=""){
      if (getByteLength(strValue2) > length) {
          return false;
      }
    }
    return true;
}


/**
 * 检查金额字段的输入是否合法（包括比较操作符）
 * @param form form
 * @return 成功返回true,失败返回false
 */
function isDecimal(field)
{
    var length  = 14;
    var scale  = 2;
    var sign1 = "";
    var sign2 = "";
    var sign3 = "";

    field.value = trim(field.value);//去掉输入域头尾空格
    if(field.value.length==0){//为空的不做校验
        return true;
    }

    if(field.value.length > 0){
      sign1 = field.value.substring(0,1);
      if(field.value.length == 1 && !isInteger(sign1))
      {
        errorMessage("金额字段类型应为decimal(14,2)");
        return false;
      }
    }
    if(field.value.length > 1){
      sign2 = field.value.substring(1,2);
      sign3 = field.value.substring(0,2);
       if(field.value.length == 2 && !isInteger(sign2))
      {
        errorMessage("金额字段类型应为decimal(14,2)");
        return false;
      }
    }
    if(!isInteger(sign1)){
      if(sign1 != "=" && sign1 != ">" && sign1 != "<" && sign1 != "!" && sign1 != "-"){
        errorMessage("比较操作符包括：=、>、<、>=、<=、<>、!=、:");
        errorMessage("金额字段类型应为decimal(14,2)");
        return false;
       }
       else if((!isInteger(sign2)) && sign2 != "" && sign2 != "." && sign2 != "-"){
         if(sign3 != ">=" && sign3 != "<=" && sign3 != "<>" && sign3 != "!=" && sign3 != ">-" && sign3 != "<-" && sign3 != "=-"){
           errorMessage("比较操作符包括：=、>、<、>=、<=、<>、!=、:");
           errorMessage("金额字段类型应为decimal(14,2)");
           return false;
          }
       }
    }
    var strValue1=field.value;
    var strValue2="";
    if(!isInteger(sign1) && sign1 != "-"){
      if(!isInteger(sign2)){
        strValue1=field.value.substring(2);
      } else{
        strValue1=field.value.substring(1);
      }
    }
    else{
        strValue1=field.value;
        if(strValue1.indexOf(":")!=-1){ //输入内容是区间
            strValue1 = strValue1.split(":");
            if(strValue1.length!=2){
              errorMessage("查询条件为区间时，只包括起、止两部分");
              return false;
            }
            strValue2 = strValue1[1];
            strValue1 = strValue1[0];
        }
    }

    if(regExpTest(strValue1,/[+/-]?\d*[.]?\d*/g)==false){
        errorMessage("金额字段类型应为decimal(14,2)");
        return false;
    }
    if(strValue2!=""){
      if(regExpTest(strValue2,/[+/-]?\d*[.]?\d*/g)==false){
         errorMessage("金额字段类型应为decimal(14,2)");
         return false;
      }
    }

    //检查精度
    var middle = strValue1.indexOf("."); //"."的位置
    if(middle>-1){
        if(scale<strValue1.substr(middle+1).length){
            errorMessage("金额字段类型应为decimal(14,2)");
            return false;
        }
    }
    if(strValue2!=""){
      middle = strValue2.indexOf("."); //"."的位置
      if(middle>-1){
         if(scale<strValue2.substr(middle+1).length){
             errorMessage("金额字段类型应为decimal(14,2)");
             return false;
         }
      }
    }

    if (getByteLength(strValue1) > length) {
        errorMessage("金额字段类型应为decimal(14,2)");
        return false;
    }
    if(strValue2!=""){
      if (getByteLength(strValue2) > length) {
          errorMessage("金额字段类型应为decimal(14,2)");
          return false;
      }
    }
	return true;
}


/**
 * 验证字段类型
 * @param form form
 * @return 成功返回true,失败返回false
 */
function validateType(form) {
    var bValid = true;
    var bResult = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //存放schemaColumns
    var count  = 0;
    var type = "";
    var property = "";
    for(i=0;i<form.elements.length;i++){
        field = form.elements[i];
        if (field.type == 'text' ||
            field.type == 'password' ||
            field.type == 'textarea') {

            count = getElementCount(field.name);

            //跳过多行第一条
            if((count>1 && getElementOrder(field)==1) ||
                (count==1 && isMulLineField(field))){
                continue;
            }

            schemaColumn = getSchemaColumn(field.name);
            if(schemaColumn==null){
                //log("字段" + field.name + "没有在ValidData.js中定义");
                continue;
            }
            property = schemaColumn.dataType.toLowerCase();
            if(property.indexOf("varchar")!=-1){
                bResult = isVarcharField(field,schemaColumn);
            }
            else if (property.indexOf("char")!=-1){
                bResult = isCharField(field,schemaColumn);
            }
            else if (property.indexOf("date")!=-1){
//                bResult = isDateField(field);
                bResult = true;
            }
            else if (property.indexOf("integer")!=-1){
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("serial")!=-1){
                bResult = isSerialField(field);
            }
            else if (property.indexOf("smallint")!=-1){
                bResult = isSmallintField(field);
            }
            else if (property.indexOf("decimal")!=-1){
                bResult = isDecimalField(field,schemaColumn);
            }
            else if (property.indexOf("dec(16,2)")!=-1){
                bResult = isDecimalField(field,schemaColumn);
            }
            
            else if (property.indexOf("dec(20,4)")!=-1){
                bResult = isDecimalField(field,schemaColumn);
            }
            else if (property.indexOf("float")!=-1){
                bResult = isDecimalField(field,schemaColumn);
            }
            else if (property.indexOf("text")!=-1){ //text类型无需校验
                bResult = true;
            }
            else if (property.indexOf("byte")!=-1){//byte类型无需校验
                bResult = true;
            }
            else{
                alert("警告"+field.name+"类型为" +property + ".在validateType()中没有处理");
                return true;
            }

            if(bResult==false){
                if (focusField == null) {
                    focusField = field;
                }
                fields[fields.length] = schemaColumn;
                bValid = false;
            }
        }
    }

    if (fields.length>0) {
        var message = "";
        for(i=0;i<fields.length;i++)
        {
            message = message + fields[i].desc + "的类型应为" + fields[i].dataType + "\n";
        }

        focusField.focus();
        alert(message);
    }
    return bValid;
}


//对输入域是否是日期的校验，splitChar参数缺省为"/"
function isDateField(field,splitChar)
{
  var strValue = field.value;
  var strValue2 = "";
  if(strValue.indexOf(":")!=-1)
  { //输入内容是区间
      strValue = strValue.split(":");
      if(strValue.length!=2){
        errorMessage("查询条件为区间时，只包括起、止两部分");
        field.focus();
        field.select();
        return false;
      }
      strValue2 = strValue[1];
      strValue = strValue[0];
  }
  if(!isDate(strValue,splitChar))
  {
    field.focus();
    field.select();
    return false;
  }
  if(strValue2!=""){
    if(!isDate(strValue2,splitChar))
    {
      field.focus();
      field.select();
      return false;
    }
  }
  return true;
}


//对输入域是否是日期的校验，splitChar参数缺省为"/"
function isDate(strValue,splitChar)
{
  if(strValue.length==0)
    return true;
  var strValue2 = "";
  if(strValue.indexOf(":")!=-1)
  { //输入内容是区间
      strValue = strValue.split(":");
      if(strValue.length!=2){
        errorMessage("查询条件为区间时，只包括起、止两部分");
        field.focus();
        field.select();
        return false;
      }
      strValue2 = strValue[1];
      strValue = strValue[0];
  }

  var charSplit = (splitChar==null?"/":splitChar);
  strValue = strValue.split(charSplit);

  if(strValue.length!=3)
    return false;
  if(!isInteger(strValue[0]) || !isInteger(strValue[1]) || !isInteger(strValue[2]) )
    return false;

  var intYear = eval(strValue[0]);
  var intMonth = eval(strValue[1]);
  var intDay = eval(strValue[2]);

  if( intYear<1 || intYear>9999 || intMonth<1 || intMonth>12 || intDay<1 || intDay>31 )
    return false;

  if(strValue2!=""){
    strValue2 = strValue2.split(charSplit);

    if(strValue2.length!=3)
      return false;
    if(!isInteger(strValue2[0]) || !isInteger(strValue2[1]) || !isInteger(strValue2[2]) )
      return false;

    intYear = eval(strValue2[0]);
    intMonth = eval(strValue2[1]);
    intDay = eval(strValue2[2]);

    if( intYear<1 || intYear>9999 || intMonth<1 || intMonth>12 || intDay<1 || intDay>31 )
      return false;
  }
  return true
}


//对输入域是否是年月的校验，splitChar参数缺省为"/"
function isYearmonthField(field,splitChar)
{
  var strValue = field.value;
  var strValue2 = "";
  if(strValue.length==0)
    return true;

  if(strValue.indexOf(":")!=-1)
  { //输入内容是区间
      strValue = strValue.split(":");
      if(strValue.length!=2){
        errorMessage("查询条件为区间时，只包括起、止两部分");
        field.focus();
        field.select();
        return false;
    }
    strValue2 = strValue[1];
    strValue = strValue[0];
  }

  var charSplit = (splitChar==null?"/":splitChar);
  strValue = strValue.split(charSplit);

  if(strValue.length!=2)
  {
    field.focus();
    field.select();
    return false;
  }
  if(!isInteger(strValue[0]) || !isInteger(strValue[1]) )
  {
    field.focus();
    field.select();
    return false;
  }

  var intYear = eval(strValue[0]);
  var intMonth = eval(strValue[1]);

  if( intYear<1 || intYear>9999 || intMonth<1 || intMonth>12 )
  {
    field.focus();
    field.select();
    return false;
  }

  if(strValue2!=""){
     var charSplit = (splitChar==null?"/":splitChar);
     strValue = strValue2.split(charSplit);

     if(strValue.length!=2)
     {
       field.focus();
       field.select();
       return false;
     }
     if(!isInteger(strValue[0]) || !isInteger(strValue[1]) )
     {
       field.focus();
       field.select();
       return false;
     }

     var intYear = eval(strValue[0]);
     var intMonth = eval(strValue[1]);

     if( intYear<1000 || intYear>9999 || intMonth<1 || intMonth>12 )
     {
       field.focus();
       field.select();
       return false;
     }
  }
  return true
}


//对输入域是否是年校验
function isYearField(field)
{
  var strValue = field.value;
  if(strValue.length==0)
    return true;

  if(strValue.length!=4)
  {
    field.focus();
    field.select();
    return false;
  }
  if(!isInteger(strValue) )
  {
    field.focus();
    field.select();
    return false;
  }

  var intYear = eval(strValue);

  if( intYear<1 || intYear>9999 )
  {
    field.focus();
    field.select();
    return false;
  }
  return true
}


//对输入域是否是时间的校验，splitChar参数缺省为":"
function isTimeField(field,splitChar)
{
  var strValue = field.value;
  if(!isTime(strValue,splitChar))
  {
    field.focus();
    field.select();
    return false;
  }
  return true;
}


function isTime(strValue,splitChar)
{
  if(strValue.length==0)
    return true;

  var charSplit = (splitChar==null?":":splitChar);
  strValue = strValue.split(charSplit);

  if(strValue.length!=3)
    return false;

  if(!isInteger(strValue[0]) || !isInteger(strValue[1]) || !isInteger(strValue[2]) )
    return false;

  var intHour = eval(strValue[0]);
  var intMinute = eval(strValue[1]);
  var intSecond = eval(strValue[2]);

  if( intHour<0 || intHour>23 || intMinute<1 || intMinute>60 || intSecond<1 || intSecond>60 )
    return false;
  return true;
}


//对输入域是否是YYYY/MM/DD hh:mm:ss的校验
function isFulldateField(field,splitChar)
{
  var strValue = field.value;
  if(strValue.length==0)
    return true;

  var strDate = strValue.substring(0,10);
  var strTime = strValue.substring(11);

  if(!isDate(strDate,splitChar))
  {
    field.focus();
    field.select();
    return false;
  }

  if(!isTime(strTime))
  {
    field.focus();
    field.select();
    return false;
  }
  return true;
}


//是否是数字的校验
function isNumeric(strValue)
{
  var result = regExpTest(strValue,/\d*[.]?\d*/g);
  return result;
}


//是否是整数的校验,即只包含字符0123456789
function isInteger(strValue)
{
  var result = regExpTest(strValue,/\d+/g);
  return result;
}


//对输入域是否是Serial的校验
function isSerialField(field)
{
  var strValue = field.value;
  if(strValue.length==0)
    return true;

  var MAX_SMALLINT = Math.pow(2,31) - 1;
  var MIN_SMALLINT = -Math.pow(2,31);

  field.value = trim(field.value);
  var strValue=field.value;
  if(strValue=="")
    strValue = "0";
  var desc   = field.description;
  //如果description属性不存在，则用name属性
  if(desc==null)
    desc = field.name;

  if(!isInteger(strValue))
  {
//    errorMessage("请输入合法的smallint型数字,最小值为" + MinValue + ",最大值为" +MaxValue);
    field.focus();
    field.select();
    return false;
  }

  MinValue = MIN_SMALLINT;
  MaxValue = MAX_SMALLINT;
  var value = parseInt(strValue,10);
  if(isNaN(value) || value>MaxValue || value<MinValue)
  {
//    errorMessage("请输入合法的smallint型数字,最小值为" + MinValue + ",最大值为" +MaxValue);
    field.focus();
    field.select();
    return false;
  }
  return true;
}


//对输入域是否是Smallint的校验
function isSmallintField(field)
{
  var strValue = field.value;
  var sign1 = "";
  var sign2 = "";
  var sign3 = "";
  if(strValue.length > 0)
  {
    sign1 = strValue.substring(0,1);
    if(strValue.length == 1 && !isInteger(sign1))
    {
      field.focus();
      field.select();
      return false;
    }
  }
  if(strValue.length > 1)
  {
    sign2 = strValue.substring(1,2);
    sign3 = strValue.substring(0,2);
     if(strValue.length == 2 && !isInteger(sign2))
    {
      field.focus();
      field.select();
      return false;
    }
 }
  if(strValue.length == 0)
    return true;

  if(!isInteger(sign1))
  {
    if(sign1 != "=" && sign1 != ">" && sign1 != "<" && sign1 != "!" && sign1 != "-")
    {
      errorMessage("比较操作符包括：=、>、<、>=、<=、<>、!=、:");
      field.focus();
      field.select();
      return false;
     }
     else if((!isInteger(sign2)) && sign2 != "" && sign2 != ":" && sign2 != "-")
     {
       if(sign3 != ">=" && sign3 != "<=" && sign3 != "<>" && sign3 != "!=")
       {
         errorMessage("比较操作符包括：=、>、<、>=、<=、<>、!=、:");
         field.focus();
         field.select();
         return false;
        }
     }
  }
  var MAX_SMALLINT = Math.pow(2,15) - 1;
  var MIN_SMALLINT = -MAX_SMALLINT;

  field.value = trim(field.value);
  var strValue1=field.value;
  var strValue2="";
 if(!isInteger(sign1))
  {
    if(!isInteger(sign2))
    {
      strValue=strValue1.substring(2);
    }
    else
    {
      strValue=strValue1.substring(1);
    }
  }
  else
  {
    strValue=strValue1;
    if(strValue.indexOf(":")!=-1)
    { //输入内容是区间
        strValue = strValue.split(":");
        if(strValue.length!=2){
          errorMessage("查询条件为区间时，只包括起、止两部分");
          field.focus();
          field.select();
          return false;
        }
        strValue2 = strValue[1];
        strValue = strValue[0];
    }
  }
  if(strValue=="")
    strValue = "0";
  var desc   = field.description;
  //如果description属性不存在，则用name属性
  if(desc==null)
    desc = field.name;

  if(!isInteger(strValue))
  {
//    errorMessage("请输入合法的smallint型数字,最小值为" + MinValue + ",最大值为" +MaxValue);
    field.focus();
    field.select();
    return false;
  }
  if(strValue2!="")
  {
    if(!isInteger(strValue2))
    {
      field.focus();
      field.select();
      return false;
    }
  }

  MinValue = MIN_SMALLINT;
  MaxValue = MAX_SMALLINT;
  var value = parseInt(strValue,10);
  if(isNaN(value) || value>MaxValue || value<MinValue)
  {
//    errorMessage("请输入合法的smallint型数字,最小值为" + MinValue + ",最大值为" +MaxValue);
    field.focus();
    field.select();
    return false;
  }
  if(strValue2!=""){
  value = parseInt(strValue2,10);
    if(isNaN(value) || value>MaxValue || value<MinValue)
    {
      field.focus();
      field.select();
      return false;
    }
  }
  return true;
}


//对输入域是否是Integer的校验,即只包含字符0123456789
function isIntegerField(field)
{
  var strValue = field.value;
  var sign1 = "";
  var sign2 = "";
  var sign3 = "";
  if(strValue.length > 0)
  {
    sign1 = strValue.substring(0,1);
    if(strValue.length == 1 && !isInteger(sign1))
    {
      field.focus();
      field.select();
      return false;
    }
  }
  if(strValue.length > 1)
  {
    sign2 = strValue.substring(1,2);
    sign3 = strValue.substring(0,2);
     if(strValue.length == 2 && !isInteger(sign2))
    {
      field.focus();
      field.select();
      return false;
    }
 }
  if(strValue.length==0)
    return true;

  if(!isInteger(sign1))
  {
    if(sign1 != "=" && sign1 != ">" && sign1 != "<" && sign1 != "!")
    {
      errorMessage("比较操作符包括：=、>、<、>=、<=、<>、!=、:");
      field.focus();
      field.select();
      return false;
     }
     else if(!isInteger(sign2) && sign2 != "" && sign2 != ":")
     {
       if(sign3 != ">=" && sign3 != "<=" && sign3 != "<>" && sign3 != "!=")
       {
         errorMessage("比较操作符包括：=、>、<、>=、<=、<>、!=、:");
         field.focus();
         field.select();
         return false;
        }
     }
  }

  var MAX_INTEGER  = Math.pow(2,31) - 1;
  var MIN_INTEGER  = -MAX_INTEGER;

  field.value = trim(field.value);
  var strValue1=field.value;
  var strValue2="";
 if(!isInteger(sign1))
  {
    if(!isInteger(sign2))
    {
      strValue=strValue1.substring(2);
    }
    else
    {
      strValue=strValue1.substring(1);
    }
  }
  else
  {
    strValue=strValue1;
    if(strValue.indexOf(":")!=-1)
    { //输入内容是区间
        strValue = strValue.split(":");
        if(strValue.length!=2){
          errorMessage("查询条件为区间时，只包括起、止两部分");
          field.focus();
          field.select();
          return false;
        }
        strValue2 = strValue[1];
        strValue = strValue[0];
    }
  }
  if(strValue=="")
    strValue = "0";
  var desc   = field.description;
  //如果description属性不存在，则用name属性
  if(desc==null)
    desc = field.name;

  if(!isInteger(strValue))
  {
//    errorMessage("请输入合法的smallint型数字,最小值为" + MinValue + ",最大值为" +MaxValue);
    field.focus();
    field.select();
    return false;
  }
  if(strValue2!="")
  {
    if(!isInteger(strValue2))
    {
      field.focus();
      field.select();
      return false;
    }
  }

  MinValue = MIN_INTEGER;
  MaxValue = MAX_INTEGER;
  var value = parseInt(strValue,10);
  if(isNaN(value) || value>MaxValue || value<MinValue)
  {
//    errorMessage("请输入合法的smallint型数字,最小值为" + MinValue + ",最大值为" +MaxValue);
    field.focus();
    field.select();
    return false;
  }
  if(strValue2!=""){
  value = parseInt(strValue2,10);
    if(isNaN(value) || value>MaxValue || value<MinValue)
    {
      field.focus();
      field.select();
      return false;
    }
  }
  return true;
}


//显示错误信息
function errorMessage(strErrMsg)
{
  var strMsg = "系统信息:\n\n" + strErrMsg;
  alert(strMsg);
}


/**
 * 验证日期字段——之所以要分输入域的名称进行处理，因为在审计业务结构中，date型字段全用char保存
 * @param form form
 * @return 成功返回true,失败返回false
 * 2006-08-23 李子扬，修改。
 */
function validateDate(form) {
    var bValid = true;

    form.name = trim(form.name);
    var formName = form.name;
    var field = null;
    var dateText = "";
    var i = 0;
    var splitChar = "-";//LZY
    
    
    for(i=0; i<form.elements.length; i++){
    	// 得到字段。
        field = form.elements[i];
        
        // 判断类型
        if (field.type != 'text') continue;
        
        // 开始处理
        field.value = trim(field.value);
        dateText = field.value;
        fieldName = field.name; 
        
        // - iaCMainForm 保单信息
		if(formName == 'iaCMainForm'){	 
			if(fieldName == 'inputDate' || fieldName == 'operateDate' || fieldName == 'startDate' || fieldName == 'endDate' ){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		// - iaLAppendCaseForm 结案追加表
		if(formName == 'iaLAppendCaseForm'){	 
			if(fieldName == 'inputDate' ){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		// - iaLClaimForm 立案信息表
		if(formName == 'iaLClaimForm'){	 
			if(fieldName == 'damageDate' || fieldName == 'inputDate'){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		// - iaLEndCaseForm 结案信息表    
		if(formName == 'iaLEndCaseForm'){	 
			if(fieldName == 'reportDate' || fieldName == 'claimDate' || fieldName == 'endCaseDate' || fieldName == 'damageDate' || fieldName == 'inputDate'){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		// - iaLLossPaidForm 损失赔偿信息   
		if(formName == 'iaLLossPaidForm'){	 
			
		}
		
		// - iaLRegistForm 报案信息表    
		if(formName == 'iaLRegistForm'){	 
			if(fieldName == 'damageDate' || fieldName == 'reportDate' || fieldName == 'inputDate'){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		// - iaPItemKindForm 批改险种表
		if(formName == 'iaPItemKindForm'){	 
			if(fieldName == 'startDate' || fieldName == 'endDate'){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		// - iaTCItemKindForm 投保/承保险种表
		if(formName == 'iaTCItemKindForm'){	 
			if(fieldName == 'startDate' || fieldName == 'endDate'){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		if(bValid == false) {
			errorMessage("请输入正确的日期，格式为YYYY-MM-DD，例如：2006-12-31。");
			field.focus();
			return false;
		}
	}
    return bValid;
}


/**
 * 验证综合查询中的日期字段
 * @param form form
 * @return 成功返回true,失败返回false
 */
function validateQueryDate(form) {
    var bValid = true;
    var i = 0;
    var field = null;
    
    
    form.name = trim(form.name);
    var formname = form.name;
    var strValue;
    
    for(i=0;i<form.elements.length;i++)
    {
        field = form.elements[i];
        if (field.type == 'text') {
		  if(formname == 'allPrpCmainForm'){
                field.value = trim(field.value);
		  		if(field.name == 'allPrpCmainStatisticsYM'){
		    		strValue = field.value;
		    		if(!isYearmonthField(field,"-")){
        				bValid = false;
                        errorMessage("请输入合法的日期，格式为YYYY-MM");
		    		}
		  		}
			}
		  else if(formname == 'carPrpCmainForm'){
                field.value = trim(field.value);
		  		if(field.name == 'carPrpCmainStatisticsYM'){
		    		strValue = field.value;
		    		if(!isYearmonthField(field,"-")){
        				bValid = false;
                        errorMessage("请输入合法的日期，格式为YYYY-MM");
		    		}
		  		}
			}
		  else if(formname == 'lifePrpCmainForm'){
                field.value = trim(field.value);
		  		if(field.name == 'lifePrpCmainStatisticsYM'){
		    		strValue = field.value;
		    		if(!isYearmonthField(field,"-")){
        				bValid = false;
                        errorMessage("请输入合法的日期，格式为YYYY-MM");
		    		}
		  		}
			}

		}
	}
    return bValid;
}

/**
* 默认的校验Form的方法
* @return 通过true/不通过false
*/
function validateForm(form)
{
   if(bCancel==true) {
     return true;
   }
   if(!confirm("确认要执行操作？")){
     return false;
   }
   window.status = "                                                     ";//清除状态栏
   return validateRequired(form) && validateType(form) && validateDate(form);
}


/**
* 默认的校验Form的方法
* @return 通过true/不通过false
*/
function validateQueryForm(form)
{
   if(bCancel==true) {
     return true;
   }
   window.status = "                                                     ";//清除状态栏
   return validateType(form) && validateQueryDate(form);
 //  return validateType(form) && validateDate(form);
}
//比较两个日期字符串
// date1=date2则返回0 , date1>date2则返回1 , date1<date2则返回-1
function compareFullDate1(date1,date2)
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
/**
* 将起始日期与终止日期拼接在一起
* @return date 拼接好得日期
*/
function connectDate(startDate,endDate,date){
   //拼接签单日期条件
   if(startDate!="" && (endDate =="" || endDate ==null)){
       date = startDate;
   }else if((startDate=="" || startDate == null)&& endDate !=""){
       date = ":"+endDate;
   }else if(startDate!="" && endDate !=""){
       var result = compareFullDate1(trim(startDate),trim(endDate));
       if(result==1){
        alert("起始日期不能晚于终止日期！");
        return -1;
        }
      date = startDate + ":" + endDate;
    }
  return date;
}



/**
 * 验证必须输入项(覆盖struts中相应方法)，李子扬添加：为了没有表名的表单。
 * @param form form
 * @return 成功返回true,失败返回false
 */
function validateTableRequired(form,tableName) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //存放schemaColumns
    var count  = 0;
    for(i=0;i<form.elements.length;i++)
    {
        field = form.elements[i];
        //alert("validateTableRequired" + field.type);
        if (field.type == 'text' ||
            field.type == 'file' ||
            field.type == 'textarea' ||
            field.type == 'select-one' ||
            field.type == 'radio' ||
            field.type == 'password') {

            count = getElementCount(field.name);
            //跳过多行第一条
            if((count>1 && getElementOrder(field)==1) ||
                (count==1 && isMulLineField(field))){
                continue;
            }

            schemaColumn = getSchemaTableColumn(tableName, field.name);

            if(schemaColumn==null){
                //log("字段" + field.name + "没有在ValidData.js中定义");
                continue;
            }
            //跳过可以为空的输入域
            if(schemaColumn.allowNulls==true){
                continue;
            }

            var value;
			// get field's value
			if (field.type == "select-one") {
				var si = field.selectedIndex;
				value = field.options[si].value;
			} else {
				value = field.value;
			}

            if (value == '') {
                if (focusField == null) {
                    focusField = field;
                }
                fields[fields.length] = schemaColumn;
                bValid = false;
            }
        }
    }

    if (fields.length>0) {
        var message = "";
        for(i=0;i<fields.length;i++){
            message = message + fields[i].desc + "不允许为空\n";
        }
        try{
            focusField.focus();
        }
        catch(E){
        }
        alert(message);
    }
    return bValid;
}


/**
 * 验证最小长度项(覆盖struts中相应方法)，李子扬添加：为了没有表名的表单。
 * @param form form
 * @return 成功返回true,失败返回false
 */
function validateTableMinLength(form, tableName) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //存放schemaColumns
    var count  = 0;
    for(i=0;i<form.elements.length;i++){
        field = form.elements[i];
        if (field.type == 'text' ||
            field.type == 'password' ||
            field.type == 'textarea') {

            count = getElementCount(field.name);
            if(count==1){
                if(!isMulLineField(field)){
                    schemaColumn = getSchemaTableColumn(tableName, field.name);

                    var iMin = parseInt(schemaColumn.minLength,10);
                    if (getByteLength(field.value) < iMin) {
                        if (focusField == null) {
                            focusField = field;
                        }
                        fields[fields.length] = schemaColumn;
                        bValid = false;
                    }
                }
            }
            else if(count>1)
            {
                var j=0;

                for(j=1;j<count;j++){
                    schemaColumn = getSchemaTableColumn(tableName, field[j].name);
                    var iMin = parseInt(schemaColumn.minLength,10);
                    if (getByteLength(field[j].value) < iMin) {
                        if (focusField == null) {
                            focusField = field[j];
                        }
                        fields[i++] = schemaColumn;
                        bValid = false;
                    }
                }
            }
        }
    }

    if (fields.length>0) {
        var message = "";
        for(i=0;i<fields.length;i++){
            message = message + fields[i].desc + "的最小长度不能小于" + fields[i].minLength + "\n";
        }
        focusField.focus();
        alert(message);
    }
    return bValid;
}


/**
 * 验证最大长度项，李子扬添加：为了没有表名的表单。
 * @param form form
 * @return 成功返回true,失败返回false
 */
function validateTableMaxLength(form,tableName) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //存放schemaColumns
    var count  = 0;
    for(i=0;i<form.elements.length;i++){
        field = form.elements[i];
        if (field.type == 'text' ||
            field.type == 'password' ||
            field.type == 'textarea') {

            count = getElementCount(field.name);
            if(count==1){
                if(!isMulLineField(field)) {
                    schemaColumn = getSchemaTableColumn(tableName, field.name);

                    var iMax = parseInt(schemaColumn.maxLength,10);
                    if (getByteLength(field.value) > iMax) {
                        if (focusField == null) {
                            focusField = field;
                        }
                        fields[fields.length] = schemaColumn;
                        bValid = false;
                    }
                }
            }
            else if(count>1){
                var j=0;

                for(j=1;j<count;j++)
                {
                    schemaColumn = getSchemaTableColumn(tableName, field[j].name);
                    var iMax = parseInt(schemaColumn.maxLength,10);
                    if (getByteLength(field[j].value) > iMax) {
                        if (focusField == null) {
                            focusField = field[j];
                        }
                        fields[i++] = schemaColumn;
                        bValid = false;
                    }
                }
            }
        }
    }

    if (fields.length>0) {
        var message = "";
        for(i=0;i<fields.length;i++){
            message = message + fields[i].desc + "的最大长度不能超过" + fields[i].maxLength + "\n";
        }

        focusField.focus();
        alert(message);
    }
    return bValid;
}

/**
 * 验证字段类型，李子扬添加：为了没有表名的表单。
 * @param form form
 * @return 成功返回true,失败返回false
 */
function validateTableType(form,tableName) {
    var bValid = true;
    var bResult = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //存放schemaColumns
    var count  = 0;
    var type = "";
    var property = "";
    
    for(i=0;i<form.elements.length;i++){
        field = form.elements[i];
        //alert("validateTableType" + field.type);
        if (field.type == 'text' ||
            field.type == 'password' ||
            field.type == 'textarea') {

            count = getElementCount(field.name);

            //跳过多行第一条
            if((count>1 && getElementOrder(field)==1) ||
                (count==1 && isMulLineField(field))){
                continue;
            }

            schemaColumn = getSchemaTableColumn(tableName,field.name);
            if(schemaColumn==null){
                //log("字段" + field.name + "没有在ValidData.js中定义");
                continue;
            }
            property = schemaColumn.dataType.toLowerCase();
            if(property.indexOf("varchar")!=-1){
                bResult = isVarcharField(field,schemaColumn);
            }
            else if (property.indexOf("char")!=-1){
                bResult = isCharField(field,schemaColumn);
            }
            else if (property.indexOf("date")!=-1){
//                bResult = isDateField(field);
                bResult = true;
            }
            else if (property.indexOf("integer")!=-1){
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("serial")!=-1){
                bResult = isSerialField(field);
            }
            else if (property.indexOf("smallint")!=-1){
                bResult = isSmallintField(field);
            }
            else if (property.indexOf("decimal")!=-1){
                bResult = isDecimalField(field,schemaColumn);
            }
            else if (property.indexOf("number(14,2)")!=-1){//LZY
                bResult = isDecimalField(field,schemaColumn);
            }
            else if (property.indexOf("number(3,2)")!=-1){//LZY
                bResult = isDecimalField(field,schemaColumn);
            }
            else if (property.indexOf("number(3,2)")!=-1){//LZY
                bResult = isDecimalField(field,schemaColumn);
            }
            else if (property.indexOf("number(15)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(14)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(13)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(12)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(11)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(10)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(9)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(8)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(7)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(6)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(5)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(4)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(3)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(2)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("number(1)")!=-1){//LZY
                bResult = isIntegerField(field);
            }
            else if (property.indexOf("dec(16,2)")!=-1){
                bResult = isDecimalField(field,schemaColumn);
            }
            else if (property.indexOf("dec(20,4)")!=-1){
                bResult = isDecimalField(field,schemaColumn);
            }
            else if (property.indexOf("float")!=-1){
                bResult = isDecimalField(field,schemaColumn);
            }
            else if (property.indexOf("text")!=-1){ //text类型无需校验
                bResult = true;
            }
            else if (property.indexOf("byte")!=-1){//byte类型无需校验
                bResult = true;
            }
            
            else{
                alert("警告"+field.name+"类型为" +property + ".在validateType()中没有处理");
                return true;
            }

            if(bResult==false){
                if (focusField == null) {
                    focusField = field;
                }
                fields[fields.length] = schemaColumn;
                bValid = false;
            }
        }
    }

    if (fields.length>0) {
        var message = "";
        for(i=0;i<fields.length;i++)
        {
            message = message + fields[i].desc + "的类型应为" + fields[i].dataType + "\n";
        }

        focusField.focus();
        alert(message);
    }
    return bValid;
}

/**
* 默认的校验Form的方法，李子扬添加：为了没有表名的表单。
* @return 通过true/不通过false
*/
function validateTableForm(form,tableName){
   if(bCancel==true) {
     return true;
   }
   if(!confirm("确认要执行操作？")){
     return false;
   }
   window.status = "                                                     ";//清除状态栏
   return validateTableRequired(form, tableName) && validateTableType(form, tableName) && validateDate(form);
}