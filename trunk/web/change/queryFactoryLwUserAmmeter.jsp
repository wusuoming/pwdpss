<%--
*********
******************
�޸��û���Ϣҳ��  
create by wangrongjia 2008.10.09
modify by qiaoyouliang 2008.11.03

--%>

<%@ page language="java" contentType="text/html; charset=GBK"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<%@page import="com.elongway.pss.bl.facade.BLLwDcodeFacade"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.elongway.pss.dto.domain.LwDcodeDto"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterBookFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@page import="com.elongway.pss.dto.domain.LwProrateDto"%>
<%@page import="com.elongway.pss.dto.domain.LwBookUserDto"%>
<%@page import="com.elongway.pss.dto.domain.LwUserLineDto"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterChangeDto"%>
<%@page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"%>

<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
  
<title>�����ѯҳ��</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

<script type="text/javascript">

</script>
<!--�Զ������б�JS2-->

</head>
<body id="all_title">
  <div id="container">
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    <div id="content">
   
      <form name="fm" method="post">
      
          <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="16"><B>��ҵ�õ��û���Ϣ</B></td>
		</tr>
          <%
		LwCoporationUserInfoDto lwCoporationUserInfoDto=(LwCoporationUserInfoDto)request.getAttribute("lwCoporationUserInfoDto");
		
		 %>
          <tr>
            <td class=title colspan="2">����</td>
            <td class=input colspan="2"><%=lwCoporationUserInfoDto.getUserNo()%></td>
            <td class=input colspan="2" style="display: none"><input name="UserNo" type="hidden" class="text" value="<%=lwCoporationUserInfoDto.getUserNo()%>"></td>
            <td class=title colspan="2" >����</td>
            <td class=input colspan="2" ><input name="UserName" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getUserName()%>" style="width:120px"><span class="warning">*</span></td>
            <td class=title colspan="2" >��ַ</td>
            <td class=input colspan="2" ><input name="Address" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getAddress()%>" style="width:120px"></td>
			  <td class=title colspan="2">������</td>
            <td class=input colspan="2"><input name="accountBank" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getAccountBank()%>" style="width:120px"/>
          </tr>
	
				<tr>
				<td class=title colspan="2">˰��</td>
            <td class=input colspan="2" ><input name="taxNo" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getTaxNo()%>" style="width:120px"></td>
			  <td class=title colspan="2">�����ʺ�</td>
            <td class=input colspan="2"><input name="accountNo" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getAccountNo()%>" style="width:120px"/>
			
				<td class=title colspan="2">�����ѹ</td>
            <td class=input colspan="2"><input name="voltage" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getVoltage()%>" style="width:120px"></td>
			  <td class=title colspan="2">������·</td>
		
            <td class=input colspan="2"><input name="lineNo" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getLineNo()%>" style="width:120px"/>
				</tr>  
	
		  
      
         <tr class=listtitle align="center">
			<td class=title0 colspan="19"><B>���õ����Ϣ</B></td>
		</tr>
		<tr class=listtitle>			
		    <td nowrap align="center">���</td>
			<td nowrap align="center">��</td>
			<td nowrap align="center">��</td>
			<td nowrap align="center">��</td>
			<td nowrap align="center">��ʽ</td>
			<td nowrap align="center">����</td>
			<td nowrap align="center">���</td>
			<td nowrap align="center">����</td>
			<td nowrap align="center">����</td>
			<td nowrap align="center">����</td>
			<td nowrap align="center">�ϱ�����</td>
			<td nowrap align="center">�����й�ָ��</td>		
			<td nowrap align="center">�����й�ָ��</td>
			
		
			<td nowrap align="center">�����޹�ָ��</td>		
			<td nowrap align="center">�����޹�ָ��</td>
			
			<td nowrap align="center">�����й�ָ��</td>
			<td nowrap align="center">�����޹�ָ��</td>
			
		</tr>
	<%Collection ammeter = (Collection)request.getAttribute("ammeter");
	int count = ammeter.size();
	int index = 0;
	int i = 1;
	 for(Iterator it = ammeter.iterator();it.hasNext();){
	    LwAmmeterChangeDto o = (LwAmmeterChangeDto)it.next();
	 %>
		
				
		<tr>
		<%if(index==0){ %>
			<td  align="center" class=title>ԭװ</td>
			<%}else{ %>
			<td  align="center" class=title>��װ</td>
			<% }%>
			<td  align="center"><%=o.getAmmeterX() %></td>
			<input name="id" type="hidden"  value=<%=o.getId() %> >
			<td  align="center"><%=o.getAmmeterV() %></td>
			<td  align="center"><%=o.getAmmeterA() %></td>
			<td  align="center"><%=o.getAmmeterType() %></td>
			<td  align="center"><%=o.getFactoryName() %></td>
			<td  align="center"><%=o.getAmmeterNo() %></td>
			<td  align="center" style="display: none"><input name="AmmeterNo" type="text"  class="shorttext" value="<%=o.getAmmeterNo()%>" style="width:65px"></td>
			<td  align="center"><%=o.getCoust() %></td>
			<td  align="center"><%=o.getPrecision() %></td>
			<td  align="center"><%=o.getRate() %></td>
			<td  align="center"><%=o.getInstallDate() %></td>
			
			<%if(index == count-1) {%>
			<td  align="center"><%=o.getLastWorkNum() %><input name="lastWorkNum" type="hidden"  class="shorttext" value=<%=o.getLastWorkNum() %> ></td>
			<td  align="center"><input name="errorWorkNum" type="text"  class="shorttext" value="" style="width:65px"></td>
			
			<td  align="center"><%=o.getLastIdleNum()%><input name="lastIdleNum" type="hidden"  class="shorttext" value=<%=o.getLastIdleNum()%> ></td>
			<td  align="center"><input name="errorIdleNum" type="text"  class="shorttext" value="" style="width:65px"></td>
		
			<%}else{ %>
			<td  align="center"><%=o.getLastWorkNum() %></td>
			<td  align="center"><%=o.getErrorWorkNum() %> </td>
			<td  align="center"><%=o.getChgWorkNum()%> </td>
			
			<td  align="center"><%=o.getLastIdleNum() %></td>
			<td  align="center"><%=o.getErrorIdleNum() %> </td>
			<td  align="center"><%=o.getChgIdleQuantity()%> </td>
			<%} %>
			
			

		</tr>
	
		<%index ++;} %>
		<tr>
		<%if(index!=0){ %>
			<td  align="center" class=title>��װ</td>
			<%}else {%><%} %>
			<td  align="center"><input name="ammeterX" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="ammeterV" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="ammeterA" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="ammeterType" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="factoryName" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="newammeterNo" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="coust" type="text"  class="shorttext" value="" style="width:60px"></td>
			<td  align="center"><input name="precision" type="text"  class="shorttext" value="" style="width:65px"></td>
			<td  align="center"><input name="rate" type="text"  class="shorttext" value="" style="width:65px"></td>
			<td  align="center"><input name="installDate" type="text"  class="shorttext" value="" style="width:65px"></td>
			<td  align="center"></td>
			<td  align="center"></td>
			<td  align="center"></td>
			<td  align="center"></td>
			<td  align="center"><input name="installWorkNum" type="text" class="shorttext"  value="" style="width:65px"></td>
			<td  align="center"><input name="installIdleNum" type="text" class="shorttext"  value="" style="width:65px"></td>
		</tr>
	</table>
      
    <br />
<!--һ��ѵİ�ť-->
  <div class="box_frame">
    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value="�� �� " onClick="javascript:updateAmmeter();"></td>
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
function industryType1(){

if(fm.UserStyle.value== "1"){
 
 aaa.style.display = "none"; 
 bbb.style.display = "none";
}
if(fm.UserStyle.value== "3"){
 
 aaa.style.display = "none"; 
 bbb.style.display = "none";
}
 if(fm.UserStyle.value== "2"){
 aaa.style.display = ""; 
 bbb.style.display = "";
}
}
function updateAmmeter(){
if(!confirm('�Ƿ�ִ�л��������') ){
return;
} 
 fm.action="/iacontact/updateFactoryChgAmmeter.do";
 fm.submit();
}


</script>
</body>
</html>
