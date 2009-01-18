
function getXlsFromJsp(idTable,idTable1,formname){
  //获得form
  var tblFromname = document.all(formname);
  //获得tdId
  if(idTable1!=null && idTable1.length >0){
     var idArray = idTable1.split(",");
     var i,curTbl,tableValue;
     for( i = 0;i < idArray.length;i++){
     var obj = document.getElementById(idArray[i]);
        if (obj.style.display == "")
        {
          obj.style.display="none";
        }
        else
        {
          obj.style.display="";
        }
    }
  }
  //获得第一个tableId
  if(idTable!=null && idTable.length >0){
     var idArray = idTable.split(",");
     var i,curTbl,tableValue;
     for( i = 0;i < idArray.length;i++){
         curTbl = document.all(idArray[i]);
         tableValue = curTbl.innerHTML;
     if( i == 0){
         tblFromname.tablevalue1.value = tableValue;
     }else if( i == 1){
         tblFromname.tablevalue2.value = tableValue;
     }else if(i == 2){
         tblFromname.tablevalue3.value = tableValue;
     }else if(i == 3){
		 tblFromname.tablevalue4.value = tableValue;
	 }
    }
  }
  //获得tdId
  if(idTable1!=null && idTable1.length >0){
     var idArray = idTable1.split(",");
     var i,curTbl,tableValue;
     for( i = 0;i < idArray.length;i++){
     var obj = document.getElementById(idArray[i]);
        if (obj.style.display == "")
        {
          obj.style.display="none";
        }
        else
        {
          obj.style.display="";
        }
    }
  }
  //打开导出Excel中转页面
  window.open("/sinoiaci/common/pub/excel-transfer.jsp?formname=" + formname);
 }