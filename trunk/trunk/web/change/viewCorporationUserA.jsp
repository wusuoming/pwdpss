
<%--
*********
******************
��Ӵ�ҵ�û���Ϣҳ��  
create by wangrongjia
200810.09
--%>
<%@ page language="java" contentType="text/html; charset=GBk"
	pageEncoding="GBk"%>
	<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
	<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
	<!-- calendar stylesheet -->
  <link rel="stylesheet" type="text/css" media="all" href="../../../../iacontact/css/calendar-win2k-cold-1.css" title="win2k-cold-1" />

  <!-- main calendar program -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar.js"></script>

  <!-- language for the calendar -->

  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-cn-utf8.js"></script>

  <!-- the following script defines the Calendar.setup helper function, which makes
       adding a calendar a matter of 1 or 2 lines of code. -->
  <script type="text/javascript" src="../../../../iacontact/common/pub/js/calendar-setup.js"></script>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwUserLineDto"/>
<jsp:directive.page import="java.util.Collection"/>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwAmmeterChangeDto"/>




  
<title></title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<html>
<head>



<!--�Զ������б�JS2-->

</head>
<body id="all_title">
  
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    
      <form name="fm" method="post">
        <table id="table_userMain" class="fix_table" border="0">
         <tr class=listtitle align="center">
			<td class=title0 colspan="14"><B>�޸Ĵ�ҵ�õ��û�</B></td>
		</tr>
		<%
		LwCoporationUserInfoDto lwCoporationUserInfoDto=(LwCoporationUserInfoDto)request.getAttribute("lwCoporationUserInfoDto");
		
		 %>
          <tr>
            <td class=title colspan="2">����</td>
            <td class=input  colspan="2"><%=lwCoporationUserInfoDto.getUserNo()%></td>
            <td class=input style="display: none"><input name="UserNo" type="hidden" class="text" value="<%=lwCoporationUserInfoDto.getUserNo()%>"></td>
            <td class=title  colspan="2">����</td>
            <td class=input  colspan="3"><input name="UserName" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getUserName()%>"><span class="warning">*</span></td>
         <td class=title  colspan="2">˰��</td>
            <td class=input  colspan="3"><input name="taxNo" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getTaxNo()%>"></td>
          </tr>
		  <tr>
		  <td class=title  colspan="2">��ַ</td>
            <td class=input  colspan="2"><input name="Address" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getAddress()%>"></td>
			  <td class=title  colspan="2">������</td>
            <td class=input  colspan="3"><input name="accountBank" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getAccountBank()%>"/>
              	
			  <td class=title  colspan="2">�����ʺ�</td>
            <td class=input  colspan="3"><input name="accountNo" type="text"  class="text" value="<%=lwCoporationUserInfoDto.getAccountNo()%>"/>
          
            
          
       </tr>
		  
				 
				  
				 
				  
				  
        
		
		 
          
       
		
  
<!--һ��ѵİ�ť-->

 

 
		<tr class=listtitle align="center">
			<td class=title0 colspan="14"><B>���õ����Ϣ</B></td>
		</tr>
		

		<tr>
		<td class="select" align="center">ѡ��</td>	
			<td class="title" align="center">���</td>	
			<td class="title"  align="center" style="display: none"><input name="ammeterNohidden" type="hidden" class="text" style="width:60px" value=" " readonly="readonly"></td>			
			<td class="title" align="center">��</td>
			<td class="title" align="center">��</td>
			<td class="title" align="center">��</td>
			<td class="title" align="center">��ʽ</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">��ѹ��</td>
			<td class="title" align="center">������</td>
			<td class="title" align="center">����</td>
			<td class="title" align="center">�õ�����</td>
				<td class="title" align="center">�ϱ�����</td>
				<td class="title" align="center"></td>
			
		</tr>
		<%
			List list2=(List)request.getAttribute("au");
			Iterator au=list2.iterator();
			LwAmmeterChangeDto lwAmmeterChangeDto=new LwAmmeterChangeDto();
			while(au.hasNext()){
			lwAmmeterChangeDto=(LwAmmeterChangeDto)au.next();
		
			
		 %>	
		<tr>
			<td class="select" nowrap colspan="1"><input  name="chooseUser" type="checkbox" value="<%=lwAmmeterChangeDto.getAmmeterNo()%>"></td>	
			
			<td class="title"  align="center"><input name="ammeterNo" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterNo()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterX" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterX()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterV" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterV()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterA" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterA()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="ammeterType" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getAmmeterType()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="factoryName" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getFactoryName()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="factoryCcode" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getFactoryCcode()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="coust" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getCoust()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="PT" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getPt() %>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="CT" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getCt()%>" readonly="readonly"></td>
			<td class="title"  align="center"><input name="rate" type="text" class="text" style="width:60px" value="<%=lwAmmeterChangeDto.getRate()%>" readonly="readonly"></td>

			
			<%
				if(lwAmmeterChangeDto.getUseStyle().equals("0")){
			 %>
			<td class="title"  align="center" ><input type="text" class="text" style="width:60px" name="useStyle" value="��ҵ" readonly="readonly">
			<%} %>
			<%
				if(lwAmmeterChangeDto.getUseStyle().equals("1")){
			 %>
			<td class="title"  align="center" ><input type="text" class="text" style="width:60px" name="useStyle" value="�Ǿ�������" readonly="readonly">
			<%} %>
			<td class="input" ><input name="inputdate"  id="f_date_shqqs"  size="31"     readonly="readonly" style="width:60px" value="<%=lwAmmeterChangeDto.getInstallDate()%>"></td>
	<%--<td> <img src="../../../../iacontact/images/img.gif"	id="f_trigger_shqqs"				
					style="cursor: pointer; border: 1px solid #0083da;"
					title="Date selector"					
					onmouseover="this.style.background='#4CA8EB';"
					onmouseout="this.style.background=''" /></td>
		--%></tr>
		<%} %>
			</table>
			 <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="��  ��"
						onClick="javascript:change();"">
				
			</tr>
		</table>
		
	
		<table>
<!--Button End-->
</form>

  
<script language="javascript">

function change()
        {          
       		
            var count = document.getElementsByName('chooseUser').length;
            //alert('count:'+count);
            if(count ==1){
            if(fm.chooseUser.checked==true){
                            var checkboxSelect = fm.chooseUser.value;
                         //   alert('checkboxSelect:'+checkboxSelect);
							
                            fm.action = "<%=request.getContextPath()%>/chgFactoryQuery.do?";
                            fm.submit();
                          //  alert('fm.action:'+fm.action);
                            
            }   else{
            alert('��ѡ��һ���û����л������!');
            }
            }
            else{
                var n = 0;
                for(var i=0;i<fm.chooseUser.length;i++){
                    if(fm.chooseUser[i].checked==true){
                        n = n + 1;
                    }
                }
                //alert('n:'+n);
                if(n==0){
                    alert('��ѡ��һ���û����л������!');
                }   else if(n==1){
                    for(var j=0;j<fm.chooseUser.length;j++){
                        if(fm.chooseUser[j].checked==true){
                            var checkboxSelect = fm.chooseUser[j].value;
                          fm.ammeterNohidden.value=checkboxSelect;
							
                            fm.action = "<%=request.getContextPath()%>/chgFactoryQuery.do?";
                           	fm.submit();
                            break;
                        }
                    }
                    }else{
                      alert('ֻ��ѡ��һ���û����л������!');
                    }
                }
                
               }




</script>
</body>
</html>
