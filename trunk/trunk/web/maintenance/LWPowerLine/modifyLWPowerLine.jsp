<%--
*********
******************
�޸���·��Ϣҳ��  
create by wangrongjia
200810.09
--%>
<%@ page contentType="text/html; charset=GBK" %>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerLineDto"/>




  
<title></title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<html>
<head>







</head>
<body id="all_title">
  <div id="container">
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    <div id="content">
      <form name="fm"  >
        <table id="table_userMain" class="fix_table" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>�޸���·</B></td>
		</tr>
		<%
		
		 LwPowerLineDto  lwPowerLineDto=(LwPowerLineDto)request.getAttribute("powerLine");
		
		 %>
          <tr>
            <td class=title>��·����</td>
            <td class=input><%=lwPowerLineDto.getLineCode()%> </td>
            <td class=input style="display:none;"><input name="LineCode" type="text"   value="<%=lwPowerLineDto.getLineCode()%>"><span class="warning">*</span></td>
            <td class=title>��ѹ�ȼ�</td>
            <td class=input><input name="VoltLevel" type="text" value="<%=lwPowerLineDto.getVoltLevel()%>" class="text"></td><%--
            <td class=title>�ɷѹ�������</td>
            <td class=input><input name="FeeCom" type="text"  value="<%=lwPowerLineDto.getFeeCom()%>"></td>
          --%><%--
           <td class=title>��������</td>
            <td class=input><input name="SupplyType" type="text" value="<%=lwPowerLineDto.getSupplyType()%>" class="text" ></td></tr>
		  <tr>
		  <td class=title>��·Ӣ������</td>
            <td class=input><input name="LineEName" type="text"  value="<%=lwPowerLineDto.getLineEName()%>"></td>
            <td class=title>��·��������</td>
            <td class=input><input name="LineCName" type="text"  value="<%=lwPowerLineDto.getLineCName()%>" ></td>
			 
          
            
          
       </tr>
		  --%><%--<tr>
		  <td class=title>����������˾</td>
		  	<td class=input><input name="ComCode" type="textfiled" value="<%=lwPowerLineDto.getComCode()%>" ondblclick="codeQueryPT(this)"
							onkeyup="codeQueryPT(this)" class="codecode" ></td>--%><%--
		   <td class=title>����Ŀ��</td>
		  	<td class=input><input name="TargetCode" type="textfiled" value="<%=lwPowerLineDto.getTargetCode()%>"  class="text"></td>
		  
		  --%></tr>
		          <tr>
           <%--
            <td class=title>����������</td>
            <td class=input><input name="CT" type="text" value="<%=lwPowerLineDto.getCt()%>"  ></td>
            
          --%></tr>
		  <tr>
		  <%--<td class=title>��ѹ������</td>
            <td class=input><input name="PT" type="text"  value="<%=lwPowerLineDto.getPt()%>"></td>
			 --%><%--
          
            
          
       </tr>
		  <tr>
		  <td class=title>��������</td>
		  	<td class=input><input name="SiFeLoss" type="textfiled" value="<%=lwPowerLineDto.getSiFeLoss()%>"  ></td>
		   <td class=title>��Ͽ������</td>
		  	<td class=input><input name="SanXiaLoss" type="textfiled" value="<%=lwPowerLineDto.getSanXiaLoss()%>"  ></td>
		  
		  </tr>
		          <tr>
            <td class=title>��ʧ����</td>
            <td class=input><input name="LossProp" type="text" value="<%=lwPowerLineDto.getLossProp()%>"  ></td>
            <td class=title>�۸����</td>
            <td class=input><input name="PriceCategory" type="text" value="<%=lwPowerLineDto.getPriceCategory()%>"  ></td>
          </tr>
		  --%><%--<tr>
		  <td class=title>��ʧ��־</td>
            <td class=input><input name="LossFlag" type="text"  value="<%=lwPowerLineDto.getLossFlag()%>"></td>
			 <td class=title>����</td>
            <td class=input><input name="Rate" type="text" value="<%=lwPowerLineDto.getRate()%>" ></td>
          
            
          
       </tr>
		  --%><%--<tr>
		  <td class=class=title>ע��</td>
		  	<td class=input><input name="Remark" type="textfiled" value="<%=lwPowerLineDto.getRemark()%>"  ></td>
		  <td class=title>�۸����</td>
            <td class=input><input name="PriceCategory" type="text" value="<%=lwPowerLineDto.getPriceCategory()%>"  ></td>
		  
		  </tr>
		  
		    
        --%></table>
		
    <br />
<!--һ��ѵİ�ť-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" �� �� " onClick="javascript:addPowerLine();"></td>
        <%--<td class=button><input name="reset" type="button" class=button value=" �� �� "></td>
        --%><td class=button><input name="back" type="button" class=button value="����" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>

</div>
<!--Button End-->
</form>
<br />
    </div>
    <!--CONTENT OVER-->
  </div>
<script language="javascript">
function addPowerLine(){

 fm.action="/iacontact/editLWPowerLine.do";
fm.submit();

}
function codeQueryPT(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.ComCode.value+"&TableName=ComCode";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
</body>
</html>
