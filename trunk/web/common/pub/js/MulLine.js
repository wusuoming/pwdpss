/****************************************************************************
 * DESC       ��JavaScript���¼����֮FrameWork(����IE5/NN6)--Common Project���ƣ�Application Project�����޸�
 * AUTHOR     ��zhouxianli
 * CREATEDATE ��2003-05-02
 * MODIFYLIST ��   Name       Date            Reason/Contents
 *          ------------------------------------------------------
 *
 ****************************************************************************/

/**
<!--
ע�⣺
    ��ҪCommon.js�еĺ���getElementOrder��getTableElements
    ============================================================================
    �Ǳ�ģ���JavaScriptֻ���������direct��ͷ�ķ���������������Ϊ˽�У�����ʹ��
    ============================================================================
����ԭ��:

ģʽ
    <table style="display:none" id="<pageCode>_Data">
      <tbody>
        �м����һ������(��ʵ��չ�ָ��û�ʹ�õ�һ��tr)
      </tbody>
    </table>

    <table id="<pageCode>">
      <thead>
        �м���ʾ����
      </thead>
      <tfoot>
        ����Ӻ�
      </tfoot>
      <tbody>
        �յģ��м���ݶ�����������
      </tbody>
    </table>

    <script language='javascript'>
      function beforeInsert<pageCode>()
      {
        ...
      }
      function insert<pageCode>()
      {
        ...
      }
      function afterInsert<pageCode>()
      {
        ...
      }
      function beforeDelete<pageCode>(field)
      {
        ...
      }
      function delete<pageCode>(field)
      {
        ...
      }
      function afterDelete<pageCode>(field)
      {
        ...
      }

    </script>
    ������ҲҪ��д������������֣���ʵ�����ݴӵ�һ�п�ʼ��

    ��ÿһ����ӿ��ư�ť��
    ����˳��Ϊ��beforeInsert<pageCode>  ==>  insert<pageCode>  ==>  afterInsert<pageCode>
    ������������Զ��巽��beforeInsert<pageCode>,MulLine�Զ����ã�
        ��������Զ��巽��insert<pageCode>,MulLine�Զ����ã���������������Ĭ�ϵ���ӷ���
        ��������Զ��巽��afterInsert<pageCode>,MulLine�Զ�����

    ��ÿһ��ɾ�����ư�ť��
    ����˳��Ϊ��beforeDelete<pageCode>  ==>  delete<pageCode>  ==>  afterDelete<pageCode>
    ������������Զ��巽��beforeDelete<pageCode>,MulLine�Զ����ã�
        ��������Զ��巽��delete<pageCode>,MulLine�Զ����ã���������������Ĭ�ϵ�ɾ������
        ��������Զ��巽��afterDelete<pageCode>,MulLine�Զ�����


    ע��ɾ����Ӧ�õ���getRecentDeletedRowNo()����ѯɾ��������һ��(�����һ��ɾ�����У���Ϊɾ���ĵ�һ��)

    talbe��ID����ΪPageCode + "_Data",����������tablei��id��ͬ
    thead��������ͱ������һ��������
    tfoot���������tbodyǰ
    -�Ű�ť��������Ϊ"button_" + pageCode + "_Delete",ȷ����������Ԫ����������
    +�Ű�ť��������Ϊ"button_" + pageCode + "_Insert",ȷ����������Ԫ����������
-->
*/

var recentDeletedRowNo = 0;

/**
 ���������ɾ�����е����,�����һ��ɾ�����У���Ϊɾ���ĵ�һ�е����
 */
function getRecentDeletedRowNo()
{
  return recentDeletedRowNo;
}

/**
 ֱ�ӵ��ò��뺯��,�����߼��û�ʹ��
 */
function directInsertRow(pageCode,dataPageCode)
{
   return private_insertRow(pageCode,dataPageCode);
}

/**
 ֱ�ӵ���ɾ������,�����߼��û�ʹ��
 */
function directDeleteRow(field,pageCode,pageDataRowsCount,controlRowsCount)
{
   return private_deleteRow(field,pageCode,pageDataRowsCount,controlRowsCount);
}

/**
 ֱ�ӵ���ȡҳ�������������ĺ���,�����߼��û�ʹ��
 */
function directGetRowsCount(pageCode)
{
  return private_getRowsCount(pageCode);
}

/**
 ֱ�ӵ���������ɫ����,�����߼��û�ʹ��
 */
function directSetRowColor(pageCode,dataPageCode,index,color)
{
  private_setRowColor(pageCode,dataPageCode,index,color);
}
/**
 ���뺯��,Frameworkʹ��
 */
function insertRow(pageCode)
{
 
  var obj;
  var index;
  var i;
	
  //Call beforeInsertRow of pageCode
  obj = eval("window.beforeInsert" + pageCode);

  if(obj != null)
  {
    obj.apply();
  }
  //call realy insertRow of pageCode
  obj = eval("window.insert" + pageCode);
  if(obj != null)
  {
    index=obj.apply();
  }
  else  //���û���Զ�����ӷ��������Ĭ�ϵ���ӷ���
  {
    i=directGetRowsCount(pageCode)
   
    if(i == 20 && pageCode == "PickUpData")  //�Գ�ȡ���ݵ�λ����������
    {
      alert("���ݳ�ȡ��λ���ó���20��!");
    }
    else
    {
      index=directInsertRow(pageCode,pageCode+"_Data");
    }
  }

  //Call afterInsertRow of pageCode
  obj = eval("window.afterInsert" + pageCode);
  if(obj != null)
  {
    obj.apply();
  }

//  directSetRowColor(pageCode,pageCode+"_Data",index,"#EEECFA")
}

/**
 ɾ������,Frameworkʹ��
 */
function deleteRow(field,pageCode)
{
  var obj;
  var index;

  //Call beforeDeleteRow of pageCode
  obj = eval("window.beforeDelete" + pageCode);
  if(obj != null)
  {
    obj.apply(obj,arguments);
  }

  //call realy insertRow of pageCode
  obj = eval("window.delete" + pageCode);
  if(obj != null)
  {
    index = obj.apply(obj,arguments);
  }
  else  //���û���Զ���ɾ�����������Ĭ�ϵ�ɾ������
  {
    index = directDeleteRow(field,pageCode,1,1);
  }

  //Call afterDeleteRow of pageCode
  obj = eval("window.afterDelete" + pageCode);
  if(obj != null)
  {
    obj.apply(obj,arguments);
  }

}

/**
  �ڱ���·����һ�����ݣ���ֹ�Ǳ�ģ�����
  ����Ϊҳ�������ƺ�ҳԭʼ���ݴ�������
  ��:insertRow("Engage","Engage_Data");
  ���ز����е���ţ���1��ʼ��
  */
function private_insertRow(pageCode,dataPageCode)
{

  var oTBODY     = document.getElementById(pageCode).tBodies.item(0);
  var oTBODYData = document.getElementById(dataPageCode).tBodies.item(0);
  for(var i=0;i<oTBODYData.rows.length;i++)
  {
    oTBODY.appendChild(oTBODYData.rows[i].cloneNode(true));
  }

  return private_getRowsCount(pageCode);
}

/**
  ɾ�����ư�ť���Ƶ��У���ֹ�Ǳ�ģ�����
  �ֶΣ�ҳ���ƣ�����ҳ�п��ư�ť�ĸ���������ҳ��ÿ�����ư�ť�Ŀ��Ƶ�TR�ĸ���
  ����ɾ���е���ţ���1��ʼ��
 */
function private_deleteRow(field,pageCode,pageDataRowsCount,controlRowsCount)
{
  recentDeletedRowNo = parseInt(getElementOrder(field),10);
  var order = recentDeletedRowNo - 1;  //˳���Ϊ��0��ʼ
  var oTBODY   = document.getElementById(pageCode).tBodies.item(0);
  order = order - pageDataRowsCount;  //ȥ���������еĿ��ư�ť�ĸ���
  for(var i=0;i<controlRowsCount;i++)
  {
    oTBODY.removeChild(oTBODY.rows[order*controlRowsCount]);
  }
  return recentDeletedRowNo-1;
}
/**
  �õ�һҳ�Ķ��м�¼�ļ�¼��
*/
function private_getRowsCount(pageCode)
{
  var oTBODY   = document.getElementById(pageCode).tBodies.item(0);
  var intCount = oTBODY.rows.length;
  return intCount;
}

/**
 * ����һ�е���ɫ
 */
function private_setRowColor(pageCode,dataPageCode,index,color)
{
	var i = 0;
	var command = "";
  var elements = getTableElements(dataPageCode);

  for(i=0;i<elements.length;i++)
  {
  	command = "document.getElementsByName('" + elements[i].name + "')["+index+"].style.backgroundColor = color;"
  	eval(command);
  }
}


////���һҳ�����ж��м�¼
////ҳ����
//function deleteAllRows(pageCode)
//{
//  var oTBODY   = document.all(pageCode).tBodies.item(0);
//  var intCount = getRowsCount(pageCode);
//
//  for(var i=0;i<intCount;i++)
//  {
//   oTBODY.deleteRow(0);
//  }
//}
//
////���������£���ʱ����ҳ���"insert" + pageCode + "()"����
//function fieldInsertRow(pageCode)
//{
//  if( window.event.keyCode==40)
//  {
//    eval("insert" + pageCode + "()");
//  }
//}
