<%--
*********
******************
�����·��Ϣҳ��  
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
			<td class=title0 colspan="4"><B>������·</B></td>
		</tr>
          <tr>
            <td class=title>��·����</td>
            <td class=input><input name="LineCode" type="text" class="text"  ><span class="warning">*</span></td>
            <td class=title>��ѹ�ȼ�</td>
            <td class=input><input name="VoltLevel" type="text"  class="text"></td>
            <%--
              <td class=title>��������</td>
           
            
            <td class="input"><select name="SupplyType" >
				  <option value="1">ֱ����</option>
				  <option value="2">����</option>
				  <option value="4">���۹�ҵ</option>
				  <option value="3">��ҵ</option>
				  
              </select>	
            </td>
             <td class=title>�ɷѹ�������</td>
            <td class=title><input name="FeeCom" type="text"  >
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         </td>--%>
            
          </tr><%--
		  <tr>
		  <td class=title>��·Ӣ������</td>
            <td class=input><input name="LineEName" type="text"  ></td>
			<td class=title>��·��������</td>
            <td class=input><input name="LineCName" type="text"   ></td>
          
            
          
       </tr>
		  --%><tr><%--
		  <td class=title>����������˾</td>
		  	<td class=input><input name="ComCode" type="textfiled" class="text"  ></td>
		  	 --%>
		  	<%--
		   <td class=title>����Ŀ��</td>
		  	<td class=input><input name="TargetCode" type="textfiled" class="text"  ></td>
		  
		  --%></tr><%--
		          <tr>
           
          </tr>
		  --%><tr>
		  <%--<td class=title>��ѹ������</td>
            <td class=input><input name="PT" type="text"  ></td>
            <td class=title>����������</td>
            <td class=input><input name="CT" type="text"  ></td>
			--%><%--
          
            
          
       </tr>
		  <tr>
		  <td class=title>��������</td>
		  	<td class=input><input name="SiFeLoss" type="textfiled" class="input_w w_10"  ></td>
		   <td class=title>��Ͽ������</td>
		  	<td class=input><input name="SanXiaLoss" type="textfiled" class="input_w w_10"  ></td>
		  
		  </tr>
		          <tr>
            <td class=title>��ʧ����</td>
            <td class=input><input name="LossProp" type="text" class="input_w w_10"  ></td>
            <td class=title>�۸����</td>
            <td class=input><input name="PriceCategory" type="text" class="input_w w_10"  ></td>
          </tr>
		  --%><%--<tr>
		  <td class=title>��ʧ��־</td>
            <td class=input><input name="LossFlag" type="text"  ></td>
			 <td class=title>����</td>
            <td class=input><input name="Rate" type="text"  ></td>
          
            
          
       </tr>
		  --%><%--<tr>
		  
		  <td class=class=title>ע��</td>
		  	<td class=input><input name="Remark" type="textfiled" class="text"  ></td>
		   <td class=input>
		   <td class=input>
		  
		  </tr>
		    
        --%></table>
		
    <br />
<!--һ��ѵİ�ť-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" �� �� " onClick="javascript:addline();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" �� �� "></td>
        --%><td class=button><input name="back" type="button" class=button value="����" onClick="javascript:history.go(-1);"></td>
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
   alert("�����·����Ϊ��");
   return false;
   }
 if(fm.ComCode.value==""||fm.ComCode.value==null){
 	
   alert("������˾����Ϊ��");
   return false;
   }
}

</script>

</body>

</html>
