<%--
*********
******************
添加线路信息页面  
create by wangrongjia
200810.09
--%>
<%@ page contentType="text/html; charset=GBK" pageEncoding="GBK" %>




  
<title></title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<html>
<body id="all_title">
 
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
   
 <form   name="fm"  action="">
        <table id="table_userMain" class="fix_table" border="0"  width="100%">
        <tr class=listtitle align="center">
			<td class=title0 colspan="4"><B>增加线路</B></td>
		</tr>
          <tr>
            <td class=title>线路代码</td>
            <td class=input><input name="LineCode" type="text" class="text"  ><span class="warning">*</span></td>
            <td class=title>电压等级</td>
            <td class=input><input name="VoltLevel" type="text"  class="text"></td>
            <%--
              <td class=title>供电类型</td>
           
            
            <td class="input"><select name="SupplyType" >
				  <option value="1">直供户</option>
				  <option value="2">趸售</option>
				  <option value="4">趸售工业</option>
				  <option value="3">大工业</option>
				  
              </select>	
            </td>
             <td class=title>缴费归属机构</td>
            <td class=title><input name="FeeCom" type="text"  >
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         </td>--%>
            
          </tr><%--
		  <tr>
		  <td class=title>线路英文名称</td>
            <td class=input><input name="LineEName" type="text"  ></td>
			<td class=title>线路中文名称</td>
            <td class=input><input name="LineCName" type="text"   ></td>
          
            
          
       </tr>
		  --%><tr><%--
		  <td class=title>所属电力公司</td>
		  	<td class=input><input name="ComCode" type="textfiled" class="text"  ></td>
		  	 --%>
		  	<%--
		   <td class=title>供电目标</td>
		  	<td class=input><input name="TargetCode" type="textfiled" class="text"  ></td>
		  
		  --%></tr><%--
		          <tr>
           
          </tr>
		  --%><tr>
		  <%--<td class=title>电压互感器</td>
            <td class=input><input name="PT" type="text"  ></td>
            <td class=title>电流互感器</td>
            <td class=input><input name="CT" type="text"  ></td>
			--%><%--
          
            
          
       </tr>
		  <tr>
		  <td class=title>硅铁线损</td>
		  	<td class=input><input name="SiFeLoss" type="textfiled" class="input_w w_10"  ></td>
		   <td class=title>三峡金线损</td>
		  	<td class=input><input name="SanXiaLoss" type="textfiled" class="input_w w_10"  ></td>
		  
		  </tr>
		          <tr>
            <td class=title>损失比例</td>
            <td class=input><input name="LossProp" type="text" class="input_w w_10"  ></td>
            <td class=title>价格分类</td>
            <td class=input><input name="PriceCategory" type="text" class="input_w w_10"  ></td>
          </tr>
		  --%><%--<tr>
		  <td class=title>损失标志</td>
            <td class=input><input name="LossFlag" type="text"  ></td>
			 <td class=title>倍率</td>
            <td class=input><input name="Rate" type="text"  ></td>
          
            
          
       </tr>
		  --%><%--<tr>
		  
		  <td class=class=title>注释</td>
		  	<td class=input><input name="Remark" type="textfiled" class="text"  ></td>
		   <td class=input>
		   <td class=input>
		  
		  </tr>
		    
        --%></table>
		
    <br />
<!--一大堆的按钮-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" 保 存 " onClick="javascript:addline();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" 重 置 "></td>
        --%><td class=button><input name="back" type="button" class=button value="返回" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
   
    <!--CONTENT OVER-->
 

<script language="javascript">
function addline(){

 fm.action="/iacontact/addLWPowerLine.do";
fm.submit();
 
  
 }
function isEmpty(){
 if(fm.LineCode.value==""||fm.LineCode.value==null){
   alert("输电线路不能为空");
   return false;
   }
 if(fm.ComCode.value==""||fm.ComCode.value==null){
 	
   alert("所属公司不能为空");
   return false;
   }
}

</script>

</body>

</html>
