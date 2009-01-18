<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>Untitled Document</title>
</head>
	
<body>
<form name="fm" action="" method="post">
<table width="200" border="0">
  <%
  String company=request.getAttribute("company").toString();
  String sumMoney=request.getAttribute("sumMoney").toString();
  String sanxia=request.getAttribute("sanxia").toString();
  String dianjin=request.getAttribute("dianjin").toString();
  String jijin=request.getAttribute("jijin").toString();
  String dianliang=request.getAttribute("dianliang").toString();
  
  
   %><tr>
   <%if(company.equals("jy")){ %>
   <td>
   九原农电公司
   </td>
    <%} %>
     <%if(company.equals("gy")){ %>
   <td>
   固阳农电公司
   </td>
    <%} %>
     <%if(company.equals("ty")){ %>
   <td>
   土佑农电公司
   </td>
    <%} %>
     <%if(company.equals("dm")){ %>
   <td>
   达茂农电公司
   </td>
    <%} %>
</tr> 
<tr>
    <td>电费</td>
    <td>三峡</td>
    <td>基金费</td>
    <td>电力资金</td>
  </tr>
  <tr>
    <td><%=sumMoney%></td>
     <td style="display: none"><input name="sumMoney" type="text" class="text" value="<%=sumMoney %>" style="border: 0"></td>
    <td><%=sanxia %></td>
      <td style="display: none"><input name="sanxia" type="text" class="text" value="<%=sanxia %>" style="border: 0"></td>
    <td><%=jijin %></td>
     <td style="display: none"><input name="jijin" type="text" class="text" value="<%=jijin %>" style="border: 0"></td>
    <td><%=dianjin%></td>
     <td style="display: none"><input name="dianjin" type="text" class="text" value="<%=dianjin %>" style="border: 0"></td>
  </tr>
  <tr>
    <td>本月电量</td>
    <td>差别电量</td>
    <td>差别电费</td>
    <td>追收电费</td>
  </tr>
  <tr>
    <td><%=dianliang%></td>
    <td style="display: none"><input name="dianliang" type="text" class="text" value="<%=dianliang %>"></td>
    <td><input name="difference" type="text" class="text" value="0"></td>
    <td><input name="differenceFee" type="text" class="text" value="0" onblur="calculateSumFee()"></td>
    <td><input name="recallFee" type="text" class="text" value="0" onblur="calculateSumFee()"></td>
  </tr>
  <tr>
    <td>追收电量</td>
    <td>合计电量</td>
    <td></td>
    <td>总计</td>
  </tr>
  <tr>
    <td><input name="recall" type="text" class="text" value="0"></td>
    <td><input name="allpower" type="text" class="text" value="<%=dianliang %>"  style="border: 0"></td>
    <td></td>
    <td><input name="count" type="text" class="text"></td>
  </tr>
  <tr>
    <td>制表:</td>
    <td>审核:</td>
    <td></td>
    <td>负责人:</td>
  </tr>
  <tr>
        <td class=button><input name="add" type="button" class=button value=" 打 印 " onClick="javascript:printCount();"></td>
</tr>
</table>


</form>
</body>
<script language="javascript">
	function printCount(){
	window.print();
	}
	function calculateSumPower(){
	fm.allpower.value=fm.dianliang.value;
	}
	function calculateSumFee(){
	var differenceFee = fm.differenceFee.value;
	var recallFee = fm.recallFee.value;
	var sanxia = fm.sanxia.value;
	var dianjin = fm.dianjin.value;
	var jijin = fm.jijin.value;
	var sumMoney = fm.sumMoney.value;
	var count = parseFloat(differenceFee)+parseFloat(recallFee) + parseFloat(sanxia)+parseFloat(dianjin) + parseFloat(jijin)+parseFloat(sumMoney);
	fm.count.value=count;
	}
</script>

</html>
