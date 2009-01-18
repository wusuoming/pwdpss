/****************************************************************************
 * DESC       ������¼��
 * AUTHOR     ��zhouxianli
 * CREATEDATE ��2003-01-14
 * MODIFYLIST ��   Name       Date            Reason/Contents
 *          ------------------------------------------------------
 ****************************************************************************/

var DEBUG_MODE = false;
var inquery = false;    //���ڲ�ѯ�����־
var queryError = false; //��ѯ��������־
var sign; //ʱ���

function isInquery(){
	return inquery;
}

function isQueryError(){
	return queryError;
}

function setInquery(pInquery){
	inquery = pInquery;
}

function setQueryError(pQueryError){
	queryError = pQueryError;
}

function getSign(){
	return sign;
}
function setSign(pSign){
	sign=pSign;
}


//����Ԫ����Form�е�˳��û���򷵻�-1
function getElementIndex(field){
    var intElementIndex = -1;

    //����fm���Ԫ��
    for(var i=0;i<fm.elements.length;i++){
        if(fm.elements[i]==field){
            intElementIndex=i;
            break;
        }
    }
    return intElementIndex;
}

//��ʼ�����д���������
function initAllCodeInput(){
    for(var i=0;i<fm.elements.length;i++){
        if(fm.elements[i].className=="codecode" || fm.elements[i].className=="codename"){
            fm.elements[i].tag = fm.elements[i].value;
        }
    }
}

function private_Code_CallService(field,codetype,relation,inputtype,querytype,limit,method)
{
    var fmcode = parent.fraCode.fm;
    if(isInquery()==true){
//        window.status = "���ڲ�ѯ����......";
        return;
    }
    setSign(new Date().getTime());

    setInquery(true);
    setQueryError(false);

    //���������
    try
    {
        if(relation==null){
            relation = 1;
        }
        if(inputtype==null){
            inputtype = "code";
        }
        if(querytype==null){
            querytype = "always";
        }
        if(limit==null){
            limit = "must";
        }
        if(method==null){
            method = "select";
        }

        fmcode.codeindex.value= getElementIndex(field);
        fmcode.codevalue.value=field.value;
        fmcode.codetype.value=codetype;
        fmcode.relation.value=relation;
        fmcode.inputtype.value=inputtype;
        fmcode.querytype.value=querytype;
        fmcode.limit.value=limit;
        fmcode.method.value=method;
        fmcode.fieldsign.value= getSign();
        fmcode.other.value="";
        fmcode.submit();                  //�ύ
    }
    catch(E){
        if(DEBUG_MODE==true){
            alert(E);
        }
    }
}


function code_CodeSelect(field,codetype,relation,inputtype,querytype,limit,method)
{
	/*alert("field=" + field + ",codetype=" + codetype + ",relation=" + relation + ",inputtype=" + inputtype +
		  ",querytype=" + querytype + ",limit=" + limit + ",method=" + method);*/
    if(!isInquery() && !isQueryError())
	{
        window.status="";
    }
    if(event.type == "keyup")
	{
        var charCode = window.event.keyCode;
        if(!(charCode == 13 & window.event.ctrlKey))
		{
            return;
        }
    }

    var flag=0;
    if(field.value=="")
	{
    	field.value = "*";
    	flag=1;
    }
    private_Code_CallService(field,codetype,relation,inputtype,querytype,limit,"select");
if(flag==1 && field.value=="")
	{
    	field.value = "*";
    }
}

function code_CodeChange(field,codetype,relation,inputtype,querytype,limit,method)
{
	if(!isInquery() && !isQueryError()){
        window.status="";
    }

    if(field.value=="*"){
      field.value = "";
      return;
    }

    if(field.tag==field.value){
        return;
    }

    private_Code_CallService(field,codetype,relation,inputtype,querytype,limit,"change");
}
