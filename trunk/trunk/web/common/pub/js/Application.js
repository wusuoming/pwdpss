/****************************************************************************
 * DESC       ��Ӧ�ü�JavaScript����--Application Project����(����IE5/NN6)
 * AUTHOR     ��zhouxianli
 * CREATEDATE ��2003-05-04
 * MODIFYLIST ��   Name       Date            Reason/Contents
 *          ------------------------------------------------------
 *               ������			2006-08-21       ����IAPlatform���������
 ************************************************************************************/

/** ȫ�ֱ���bCancel; */
var bCancel = false;

/**
 * �Ƿ��Ƕ���������
 * @param field Ԫ��
 * @return ���򷵻�true,���򷵻�false
 */
function isMulLineField(field)
{
    //��citem��ͷ�򷵻�true;
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
 * ���������
 * @param field Ԫ��
 * @param tableName tableName
 * @return ��
 */
function hideSubPage(field,tableName)
{
  var order = parseInt(getElementOrder(field),10);
  var obj = document.getElementsByName(tableName)[order-1];
  obj.style.display ='none';
}

/**
 * ��ʾ�����
 * @param field Ԫ��
 * @param tableName tableName
 * @param leftMove ��������ƫ������Ĭ��ֵ0
 * @return ��
 */
function showSubPage(field,tableName,evt,leftMove)
{
    var order = parseInt(getElementOrder(field),10);
    var obj = document.getElementsByName(tableName)[order-1];
    var ex = evt.clientX+document.body.scrollLeft;
    var ey = evt.clientY+document.body.scrollTop;
    var intLeftMove = (leftMove==null?0:leftMove);

    strTemp = field.name;
    var strCompare = "Context"; //�Ƚ��ַ������������󼸸��ַ���Context
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
 * ��ʾ/����ҳ
 * @param fieldId
 * @param tableId tableId
 * @return ��
 */
function showPage(fieldId,tableId)
{
  var field = document.getElementById(fieldId);
  var table = document.getElementById(tableId);
  if(table.style.display==""){
    //�ر�
    table.style.display="none";
    field.src="/sinoiaci/images/jia-jia.gif";
  }else{
    //��
    table.style.display="";
    field.src="/sinoiaci/jian-jian.gif";
  }
}


/**
 * ��֤����������(����struts����Ӧ����)
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function validateRequired(form) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //���schemaColumns
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
            //�������е�һ��
            if((count>1 && getElementOrder(field)==1) ||
                (count==1 && isMulLineField(field))){
                continue;
            }

            schemaColumn = getSchemaColumn(field.name);

            if(schemaColumn==null){
                //log("�ֶ�" + field.name + "û����ValidData.js�ж���");
                continue;
            }
            //��������Ϊ�յ�������
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
            message = message + fields[i].desc + "������Ϊ��\n";
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
 * ��֤��С������(����struts����Ӧ����)
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function validateMinLength(form) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //���schemaColumns
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
            message = message + fields[i].desc + "����С���Ȳ���С��" + fields[i].minLength + "\n";
        }
        focusField.focus();
        alert(message);
    }
    return bValid;
}


/**
 * ��֤��󳤶���
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function validateMaxLength(form) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //���schemaColumns
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
            message = message + fields[i].desc + "����󳤶Ȳ��ܳ���" + fields[i].maxLength + "\n";
        }

        focusField.focus();
        alert(message);
    }
    return bValid;
}

/**
 * ����Ƿ���char�����ֶ�
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function isCharField(field,schemaColumn){
    var maxLength  = 0;
    var temp = schemaColumn.dataType;
    var start = schemaColumn.dataType.indexOf("(",4);//"("��λ��
    var end = schemaColumn.dataType.indexOf(")",start);//")"��λ��
    maxLength=parseInt(schemaColumn.dataType.substring(start+1,end),10);

    if (getByteLength(field.value) > maxLength) {
        return false;
    }
    return true;
}

/**
 * ����Ƿ���varchar�����ֶ�
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function isVarcharField(field,schemaColumn){
    var maxLength  = 0;
    var minSpace  = 0;
    var temp = schemaColumn.dataType;
    var start = schemaColumn.dataType.indexOf("(",7);  //"("��λ��
    var middle = schemaColumn.dataType.indexOf(",",start); //","��λ��
    var end = schemaColumn.dataType.indexOf(")",start); //")"��λ��
    if(middle==-1){ //û��������Сֵ
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
 * ����Ƿ���decimal�����ֶ�
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function isDecimalField(field,schemaColumn){
    var length  = 0;
    var scale  = 0;
    var temp = schemaColumn.dataType;
    var start = schemaColumn.dataType.indexOf("(",7);  //"("��λ��
    var middle = schemaColumn.dataType.indexOf(",",start); //","��λ��
    var end = schemaColumn.dataType.indexOf(")",start); //")"��λ��
    var sign1 = "";
    var sign2 = "";
    var sign3 = "";
    field.value = trim(field.value);//ȥ��������ͷβ�ո�

    if(field.value.length==0){//Ϊ�յĲ���У��
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
    if(middle==-1){ //û��������Сֵ
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
        errorMessage("�Ƚϲ�����������=��>��<��>=��<=��<>��!=��:");
        field.focus();
        field.select();
        return false;
       }
       else if((!isInteger(sign2) && sign2 != "" && sign2 != "." && sign2=="-"))
       {
         if(sign3 != ">=" && sign3 != "<=" && sign3 != "<>" && sign3 != "!=" && sign3!=">-" && sign3!="<-" && sign3!="=-")
         {
           errorMessage("�Ƚϲ�����������=��>��<��>=��<=��<>��!=��:");
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
        if(strValue1.indexOf(":")!=-1){ //��������������
            strValue1 = strValue1.split(":");
            if(strValue1.length!=2){
              errorMessage("��ѯ����Ϊ����ʱ��ֻ������ֹ������");
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

    //��龫��
    middle = strValue1.indexOf("."); //"."��λ��
    if(middle>-1){
        if(scale<strValue1.substr(middle+1).length){
            return false;
        }
    }
    if(strValue2!=""){
      middle = strValue2.indexOf("."); //"."��λ��
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
 * ������ֶε������Ƿ�Ϸ��������Ƚϲ�������
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function isDecimal(field)
{
    var length  = 14;
    var scale  = 2;
    var sign1 = "";
    var sign2 = "";
    var sign3 = "";

    field.value = trim(field.value);//ȥ��������ͷβ�ո�
    if(field.value.length==0){//Ϊ�յĲ���У��
        return true;
    }

    if(field.value.length > 0){
      sign1 = field.value.substring(0,1);
      if(field.value.length == 1 && !isInteger(sign1))
      {
        errorMessage("����ֶ�����ӦΪdecimal(14,2)");
        return false;
      }
    }
    if(field.value.length > 1){
      sign2 = field.value.substring(1,2);
      sign3 = field.value.substring(0,2);
       if(field.value.length == 2 && !isInteger(sign2))
      {
        errorMessage("����ֶ�����ӦΪdecimal(14,2)");
        return false;
      }
    }
    if(!isInteger(sign1)){
      if(sign1 != "=" && sign1 != ">" && sign1 != "<" && sign1 != "!" && sign1 != "-"){
        errorMessage("�Ƚϲ�����������=��>��<��>=��<=��<>��!=��:");
        errorMessage("����ֶ�����ӦΪdecimal(14,2)");
        return false;
       }
       else if((!isInteger(sign2)) && sign2 != "" && sign2 != "." && sign2 != "-"){
         if(sign3 != ">=" && sign3 != "<=" && sign3 != "<>" && sign3 != "!=" && sign3 != ">-" && sign3 != "<-" && sign3 != "=-"){
           errorMessage("�Ƚϲ�����������=��>��<��>=��<=��<>��!=��:");
           errorMessage("����ֶ�����ӦΪdecimal(14,2)");
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
        if(strValue1.indexOf(":")!=-1){ //��������������
            strValue1 = strValue1.split(":");
            if(strValue1.length!=2){
              errorMessage("��ѯ����Ϊ����ʱ��ֻ������ֹ������");
              return false;
            }
            strValue2 = strValue1[1];
            strValue1 = strValue1[0];
        }
    }

    if(regExpTest(strValue1,/[+/-]?\d*[.]?\d*/g)==false){
        errorMessage("����ֶ�����ӦΪdecimal(14,2)");
        return false;
    }
    if(strValue2!=""){
      if(regExpTest(strValue2,/[+/-]?\d*[.]?\d*/g)==false){
         errorMessage("����ֶ�����ӦΪdecimal(14,2)");
         return false;
      }
    }

    //��龫��
    var middle = strValue1.indexOf("."); //"."��λ��
    if(middle>-1){
        if(scale<strValue1.substr(middle+1).length){
            errorMessage("����ֶ�����ӦΪdecimal(14,2)");
            return false;
        }
    }
    if(strValue2!=""){
      middle = strValue2.indexOf("."); //"."��λ��
      if(middle>-1){
         if(scale<strValue2.substr(middle+1).length){
             errorMessage("����ֶ�����ӦΪdecimal(14,2)");
             return false;
         }
      }
    }

    if (getByteLength(strValue1) > length) {
        errorMessage("����ֶ�����ӦΪdecimal(14,2)");
        return false;
    }
    if(strValue2!=""){
      if (getByteLength(strValue2) > length) {
          errorMessage("����ֶ�����ӦΪdecimal(14,2)");
          return false;
      }
    }
	return true;
}


/**
 * ��֤�ֶ�����
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function validateType(form) {
    var bValid = true;
    var bResult = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //���schemaColumns
    var count  = 0;
    var type = "";
    var property = "";
    for(i=0;i<form.elements.length;i++){
        field = form.elements[i];
        if (field.type == 'text' ||
            field.type == 'password' ||
            field.type == 'textarea') {

            count = getElementCount(field.name);

            //�������е�һ��
            if((count>1 && getElementOrder(field)==1) ||
                (count==1 && isMulLineField(field))){
                continue;
            }

            schemaColumn = getSchemaColumn(field.name);
            if(schemaColumn==null){
                //log("�ֶ�" + field.name + "û����ValidData.js�ж���");
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
            else if (property.indexOf("text")!=-1){ //text��������У��
                bResult = true;
            }
            else if (property.indexOf("byte")!=-1){//byte��������У��
                bResult = true;
            }
            else{
                alert("����"+field.name+"����Ϊ" +property + ".��validateType()��û�д���");
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
            message = message + fields[i].desc + "������ӦΪ" + fields[i].dataType + "\n";
        }

        focusField.focus();
        alert(message);
    }
    return bValid;
}


//���������Ƿ������ڵ�У�飬splitChar����ȱʡΪ"/"
function isDateField(field,splitChar)
{
  var strValue = field.value;
  var strValue2 = "";
  if(strValue.indexOf(":")!=-1)
  { //��������������
      strValue = strValue.split(":");
      if(strValue.length!=2){
        errorMessage("��ѯ����Ϊ����ʱ��ֻ������ֹ������");
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


//���������Ƿ������ڵ�У�飬splitChar����ȱʡΪ"/"
function isDate(strValue,splitChar)
{
  if(strValue.length==0)
    return true;
  var strValue2 = "";
  if(strValue.indexOf(":")!=-1)
  { //��������������
      strValue = strValue.split(":");
      if(strValue.length!=2){
        errorMessage("��ѯ����Ϊ����ʱ��ֻ������ֹ������");
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


//���������Ƿ������µ�У�飬splitChar����ȱʡΪ"/"
function isYearmonthField(field,splitChar)
{
  var strValue = field.value;
  var strValue2 = "";
  if(strValue.length==0)
    return true;

  if(strValue.indexOf(":")!=-1)
  { //��������������
      strValue = strValue.split(":");
      if(strValue.length!=2){
        errorMessage("��ѯ����Ϊ����ʱ��ֻ������ֹ������");
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


//���������Ƿ�����У��
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


//���������Ƿ���ʱ���У�飬splitChar����ȱʡΪ":"
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


//���������Ƿ���YYYY/MM/DD hh:mm:ss��У��
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


//�Ƿ������ֵ�У��
function isNumeric(strValue)
{
  var result = regExpTest(strValue,/\d*[.]?\d*/g);
  return result;
}


//�Ƿ���������У��,��ֻ�����ַ�0123456789
function isInteger(strValue)
{
  var result = regExpTest(strValue,/\d+/g);
  return result;
}


//���������Ƿ���Serial��У��
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
  //���description���Բ����ڣ�����name����
  if(desc==null)
    desc = field.name;

  if(!isInteger(strValue))
  {
//    errorMessage("������Ϸ���smallint������,��СֵΪ" + MinValue + ",���ֵΪ" +MaxValue);
    field.focus();
    field.select();
    return false;
  }

  MinValue = MIN_SMALLINT;
  MaxValue = MAX_SMALLINT;
  var value = parseInt(strValue,10);
  if(isNaN(value) || value>MaxValue || value<MinValue)
  {
//    errorMessage("������Ϸ���smallint������,��СֵΪ" + MinValue + ",���ֵΪ" +MaxValue);
    field.focus();
    field.select();
    return false;
  }
  return true;
}


//���������Ƿ���Smallint��У��
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
      errorMessage("�Ƚϲ�����������=��>��<��>=��<=��<>��!=��:");
      field.focus();
      field.select();
      return false;
     }
     else if((!isInteger(sign2)) && sign2 != "" && sign2 != ":" && sign2 != "-")
     {
       if(sign3 != ">=" && sign3 != "<=" && sign3 != "<>" && sign3 != "!=")
       {
         errorMessage("�Ƚϲ�����������=��>��<��>=��<=��<>��!=��:");
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
    { //��������������
        strValue = strValue.split(":");
        if(strValue.length!=2){
          errorMessage("��ѯ����Ϊ����ʱ��ֻ������ֹ������");
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
  //���description���Բ����ڣ�����name����
  if(desc==null)
    desc = field.name;

  if(!isInteger(strValue))
  {
//    errorMessage("������Ϸ���smallint������,��СֵΪ" + MinValue + ",���ֵΪ" +MaxValue);
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
//    errorMessage("������Ϸ���smallint������,��СֵΪ" + MinValue + ",���ֵΪ" +MaxValue);
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


//���������Ƿ���Integer��У��,��ֻ�����ַ�0123456789
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
      errorMessage("�Ƚϲ�����������=��>��<��>=��<=��<>��!=��:");
      field.focus();
      field.select();
      return false;
     }
     else if(!isInteger(sign2) && sign2 != "" && sign2 != ":")
     {
       if(sign3 != ">=" && sign3 != "<=" && sign3 != "<>" && sign3 != "!=")
       {
         errorMessage("�Ƚϲ�����������=��>��<��>=��<=��<>��!=��:");
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
    { //��������������
        strValue = strValue.split(":");
        if(strValue.length!=2){
          errorMessage("��ѯ����Ϊ����ʱ��ֻ������ֹ������");
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
  //���description���Բ����ڣ�����name����
  if(desc==null)
    desc = field.name;

  if(!isInteger(strValue))
  {
//    errorMessage("������Ϸ���smallint������,��СֵΪ" + MinValue + ",���ֵΪ" +MaxValue);
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
//    errorMessage("������Ϸ���smallint������,��СֵΪ" + MinValue + ",���ֵΪ" +MaxValue);
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


//��ʾ������Ϣ
function errorMessage(strErrMsg)
{
  var strMsg = "ϵͳ��Ϣ:\n\n" + strErrMsg;
  alert(strMsg);
}


/**
 * ��֤�����ֶΡ���֮����Ҫ������������ƽ��д�����Ϊ�����ҵ��ṹ�У�date���ֶ�ȫ��char����
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 * 2006-08-23 ������޸ġ�
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
    	// �õ��ֶΡ�
        field = form.elements[i];
        
        // �ж�����
        if (field.type != 'text') continue;
        
        // ��ʼ����
        field.value = trim(field.value);
        dateText = field.value;
        fieldName = field.name; 
        
        // - iaCMainForm ������Ϣ
		if(formName == 'iaCMainForm'){	 
			if(fieldName == 'inputDate' || fieldName == 'operateDate' || fieldName == 'startDate' || fieldName == 'endDate' ){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		// - iaLAppendCaseForm �᰸׷�ӱ�
		if(formName == 'iaLAppendCaseForm'){	 
			if(fieldName == 'inputDate' ){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		// - iaLClaimForm ������Ϣ��
		if(formName == 'iaLClaimForm'){	 
			if(fieldName == 'damageDate' || fieldName == 'inputDate'){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		// - iaLEndCaseForm �᰸��Ϣ��    
		if(formName == 'iaLEndCaseForm'){	 
			if(fieldName == 'reportDate' || fieldName == 'claimDate' || fieldName == 'endCaseDate' || fieldName == 'damageDate' || fieldName == 'inputDate'){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		// - iaLLossPaidForm ��ʧ�⳥��Ϣ   
		if(formName == 'iaLLossPaidForm'){	 
			
		}
		
		// - iaLRegistForm ������Ϣ��    
		if(formName == 'iaLRegistForm'){	 
			if(fieldName == 'damageDate' || fieldName == 'reportDate' || fieldName == 'inputDate'){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		// - iaPItemKindForm �������ֱ�
		if(formName == 'iaPItemKindForm'){	 
			if(fieldName == 'startDate' || fieldName == 'endDate'){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		// - iaTCItemKindForm Ͷ��/�б����ֱ�
		if(formName == 'iaTCItemKindForm'){	 
			if(fieldName == 'startDate' || fieldName == 'endDate'){
				if(!isDateField(field, splitChar)) bValid = false; 
			}
		}
		
		if(bValid == false) {
			errorMessage("��������ȷ�����ڣ���ʽΪYYYY-MM-DD�����磺2006-12-31��");
			field.focus();
			return false;
		}
	}
    return bValid;
}


/**
 * ��֤�ۺϲ�ѯ�е������ֶ�
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
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
                        errorMessage("������Ϸ������ڣ���ʽΪYYYY-MM");
		    		}
		  		}
			}
		  else if(formname == 'carPrpCmainForm'){
                field.value = trim(field.value);
		  		if(field.name == 'carPrpCmainStatisticsYM'){
		    		strValue = field.value;
		    		if(!isYearmonthField(field,"-")){
        				bValid = false;
                        errorMessage("������Ϸ������ڣ���ʽΪYYYY-MM");
		    		}
		  		}
			}
		  else if(formname == 'lifePrpCmainForm'){
                field.value = trim(field.value);
		  		if(field.name == 'lifePrpCmainStatisticsYM'){
		    		strValue = field.value;
		    		if(!isYearmonthField(field,"-")){
        				bValid = false;
                        errorMessage("������Ϸ������ڣ���ʽΪYYYY-MM");
		    		}
		  		}
			}

		}
	}
    return bValid;
}

/**
* Ĭ�ϵ�У��Form�ķ���
* @return ͨ��true/��ͨ��false
*/
function validateForm(form)
{
   if(bCancel==true) {
     return true;
   }
   if(!confirm("ȷ��Ҫִ�в�����")){
     return false;
   }
   window.status = "                                                     ";//���״̬��
   return validateRequired(form) && validateType(form) && validateDate(form);
}


/**
* Ĭ�ϵ�У��Form�ķ���
* @return ͨ��true/��ͨ��false
*/
function validateQueryForm(form)
{
   if(bCancel==true) {
     return true;
   }
   window.status = "                                                     ";//���״̬��
   return validateType(form) && validateQueryDate(form);
 //  return validateType(form) && validateDate(form);
}
//�Ƚ����������ַ���
// date1=date2�򷵻�0 , date1>date2�򷵻�1 , date1<date2�򷵻�-1
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
* ����ʼ��������ֹ����ƴ����һ��
* @return date ƴ�Ӻõ�����
*/
function connectDate(startDate,endDate,date){
   //ƴ��ǩ����������
   if(startDate!="" && (endDate =="" || endDate ==null)){
       date = startDate;
   }else if((startDate=="" || startDate == null)&& endDate !=""){
       date = ":"+endDate;
   }else if(startDate!="" && endDate !=""){
       var result = compareFullDate1(trim(startDate),trim(endDate));
       if(result==1){
        alert("��ʼ���ڲ���������ֹ���ڣ�");
        return -1;
        }
      date = startDate + ":" + endDate;
    }
  return date;
}



/**
 * ��֤����������(����struts����Ӧ����)����������ӣ�Ϊ��û�б����ı���
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function validateTableRequired(form,tableName) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //���schemaColumns
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
            //�������е�һ��
            if((count>1 && getElementOrder(field)==1) ||
                (count==1 && isMulLineField(field))){
                continue;
            }

            schemaColumn = getSchemaTableColumn(tableName, field.name);

            if(schemaColumn==null){
                //log("�ֶ�" + field.name + "û����ValidData.js�ж���");
                continue;
            }
            //��������Ϊ�յ�������
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
            message = message + fields[i].desc + "������Ϊ��\n";
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
 * ��֤��С������(����struts����Ӧ����)����������ӣ�Ϊ��û�б����ı���
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function validateTableMinLength(form, tableName) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //���schemaColumns
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
            message = message + fields[i].desc + "����С���Ȳ���С��" + fields[i].minLength + "\n";
        }
        focusField.focus();
        alert(message);
    }
    return bValid;
}


/**
 * ��֤��󳤶����������ӣ�Ϊ��û�б����ı���
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function validateTableMaxLength(form,tableName) {
    var bValid = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //���schemaColumns
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
            message = message + fields[i].desc + "����󳤶Ȳ��ܳ���" + fields[i].maxLength + "\n";
        }

        focusField.focus();
        alert(message);
    }
    return bValid;
}

/**
 * ��֤�ֶ����ͣ���������ӣ�Ϊ��û�б����ı���
 * @param form form
 * @return �ɹ�����true,ʧ�ܷ���false
 */
function validateTableType(form,tableName) {
    var bValid = true;
    var bResult = true;
    var focusField = null;
    var i = 0;
    var field = null;
    var schemaColumn = null;
    var fields = new Array(); //���schemaColumns
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

            //�������е�һ��
            if((count>1 && getElementOrder(field)==1) ||
                (count==1 && isMulLineField(field))){
                continue;
            }

            schemaColumn = getSchemaTableColumn(tableName,field.name);
            if(schemaColumn==null){
                //log("�ֶ�" + field.name + "û����ValidData.js�ж���");
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
            else if (property.indexOf("text")!=-1){ //text��������У��
                bResult = true;
            }
            else if (property.indexOf("byte")!=-1){//byte��������У��
                bResult = true;
            }
            
            else{
                alert("����"+field.name+"����Ϊ" +property + ".��validateType()��û�д���");
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
            message = message + fields[i].desc + "������ӦΪ" + fields[i].dataType + "\n";
        }

        focusField.focus();
        alert(message);
    }
    return bValid;
}

/**
* Ĭ�ϵ�У��Form�ķ�������������ӣ�Ϊ��û�б����ı���
* @return ͨ��true/��ͨ��false
*/
function validateTableForm(form,tableName){
   if(bCancel==true) {
     return true;
   }
   if(!confirm("ȷ��Ҫִ�в�����")){
     return false;
   }
   window.status = "                                                     ";//���״̬��
   return validateTableRequired(form, tableName) && validateTableType(form, tableName) && validateDate(form);
}