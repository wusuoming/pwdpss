<%--
*********
******************
��ѯ��ҳ��  
create by qiaoyouliang
2008.11.4
--%>

<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterBookFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
    <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 

<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>����ѯҳ��</title>
<app:css />
<html:base />
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">

<STYLE>BODY {
               SCROLLBAR-FACE-COLOR:#ffffff;
               SCROLLBAR-HIGHLIGHT-COLOR:#A9CBED;
               SCROLLBAR-SHADOW-COLOR:#A9CBED;
               SCROLLBAR-3DLIGHT-COLOR:#FFFFFF;
               SCROLLBAR-ARROW-COLOR:#A9CBED;
               SCROLLBAR-TRACK-COLOR:#FFFFFF;
               SCROLLBAR-DARKSHADOW-COLOR:#FFFFFF;
       }
</STYLE>
</head>

<body class=interface>







  
    <!--CONTENT BEGIN-->
    
      <form name="fm" style="display:block;">
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>��ѯ����Ϣ</B></td>
		</tr>

          <tr>
            <td class="title">����</td>
            <td class=input><input class="text" name="BookNo" type="text"  ></td>
			<td class="title">����</td>
           <td class=input><input class="text" name="BookName" type="text"   ></td>
          </tr>
        </table>
        <table cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td class=button align="center"><input type=button class=button name=button0 value=" �� ѯ " onClick="searchBook();"></td>
		</tr>
	</table>
      
     <br />

	
	
	<form name="fm1" >
        <table table class=common width="100%" cellspacing="1" cellpadding="5" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="6"><B>����Ϣ</B></td>
		</tr>

		<tr class=listtitle>
			<td nowrap><span class="select">ѡ��</span></td>
			<td nowrap ><span class="title">����</span></td>
			<td nowrap ><span class="title">����</span></td>
			<td nowrap ><span class="title">��ע</span></td>
			<td nowrap ><span class="title">������</span></td>
			<td nowrap ><span class="title">�Ƿ���Ч</span></td>
			
			
			
		</tr>
		<%
	
	List bookList=(List)request.getAttribute("bookList");
	
	Iterator it=bookList.iterator();
      while(it.hasNext()){
      	LwAmmeterBookDto book=(LwAmmeterBookDto)it.next();
      	
      	
 %>
		<tr>
		
			<td class="select" nowrap colspan="1"><input  name="checkboxSelect" type="checkbox" value="<%=book.getBookNo()%>"></td>
			<td class="input" nowrap colspan="1"><%=book.getBookNo()%></td>
			<td class="input" nowrap colspan="1"><%=book.getBookName()%></td>
			<td class="input" nowrap colspan="1"><%=book.getRemark()%></td>
			<td class="input" nowrap colspan="1"><%=book.getBookType()%></td>
			<%--<td class="input" nowrap colspan="1"><%=userLine.getLineCode()%></td>
			--%><%
			if(book.getValidStatus().equals("1")){
			 %>
			<td class="input" nowrap colspan="1">��Ч</td>
			<%} %>
			<%
			if(book.getValidStatus().equals("0")){
			 %>
			<td class="input" nowrap colspan="1">��Ч</td>
			<%} %>
		
			
	
		</tr>
		<%} %>
		
		<%--<tr><td colspan="10" >��1ҳ/��1-10����120��  ��һҳ  βҳ </td></tr>
	--%></table>
	


 
      

 
    <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="��  ��"
					onclick="update();">
				</td>
				  <td class=button align="center">
					<input type=button class=button name=button8 value="ɾ  ��"
						onClick="deleteBook();">
				</td>
				  <td class=button align="center"><input class=button name="add" type="button"  value=" �� �� " onClick="javascript:addBook();"></td>
				  <td class=button align="center">
					<input type=button class=button name=button1 value="���ñ�"
					onclick="configBook();">
				</td>
			</tr>
		</table>
		
		
    </form>
<script language="javascript">

function addBook(){
	fm.action="addLWAmmeterBook.jsp";
	fm.submit();
	
	
}


function cancelUser(){
	alert("��ѡ�м�¼����Ϊ��Ч��");
}
function searchBook(){
	
	fm.action="/iacontact/queryLWAmmeterBook.do?action=query";
	fm.submit();
}

 function update()
        {          
            var count = document.getElementsByName('checkboxSelect').length;
            //alert('count:'+count);
            if(count ==1){
            if(fm.checkboxSelect.checked==true){
                            var checkboxSelect = fm.checkboxSelect.value;

                            fm.action = "<%=request.getContextPath()%>/updateBook.do?123=1";
                          
                            fm.submit();
            }   else{
            alert('��ѡ��һ����¼�����޸�!');
            }
            }
            else{
                var n = 0;
                for(var i=0;i<fm.checkboxSelect.length;i++){
                    if(fm.checkboxSelect[i].checked==true){
                        n = n + 1;
                    }
                }
             //   alert('n:'+n);
                if(n==0){
                    alert('��ѡ��һ����¼�����޸�!');
                }   else if(n==1){
                    for(var j=0;j<fm.checkboxSelect.length;j++){
                        if(fm.checkboxSelect[j].checked==true){
                            var checkboxSelect = fm.checkboxSelect[j].value;
                         //   alert('checkboxSelect:'+checkboxSelect);

                            fm.action = "<%=request.getContextPath()%>/updateBook.do?123=1";
                         
                            fm.submit();
                            break;
                        }
                    }
                    }else{
                      alert('ֻ��ѡ��һ����¼�����޸�!');
                    }
                }
               }
               
 function configBook()
        {          
            var count = document.getElementsByName('checkboxSelect').length;
            //alert('count:'+count);
            if(count ==1){
            if(fm.checkboxSelect.checked==true){
                            var checkboxSelect = fm.checkboxSelect.value;
                         //   alert('checkboxSelect:'+checkboxSelect);
                            fm.action = "<%=request.getContextPath()%>/configBookQuery.do?";
                          //  alert('fm.action:'+fm.action);
                            fm.submit();
            }   else{
            alert('��ѡ��һ������������!');
            }// ok
            }
            else{
                var n = 0;
                for(var i=0;i<fm.checkboxSelect.length;i++){
                    if(fm.checkboxSelect[i].checked==true){
                        n = n + 1;
                    }
                }
             //   alert('n:'+n);
                if(n==0){
                    alert('��ѡ��һ������������!');
                }   else if(n==1){
                    for(var j=0;j<fm.checkboxSelect.length;j++){
                        if(fm.checkboxSelect[j].checked==true){
                            var checkboxSelect = fm.checkboxSelect[j].value;
                         //   alert('checkboxSelect:'+checkboxSelect);

                            fm.action = "<%=request.getContextPath()%>/configBookQuery.do?";
                           // alert('fm.action:'+fm.action);
                            fm.submit();
                            break;
                        }
                    }
                    }else{
                      alert('ֻ��ѡ��һ������������!');
                    }
                }
               }
               
function deleteBook()
        {                   
            var count = document.getElementsByName('checkboxSelect').length;
       //     alert('count:'+count);
            if(count ==1){
            if(fm.checkboxSelect.checked==true){
                            var checkboxSelect = fm.checkboxSelect.value;
                         //   alert('checkboxSelect:'+checkboxSelect);
						if(!confirm('ȷ��Ҫɾ���������ɻָ���')){
                                return false;
                                }
                                 else{ 
                            fm.action = "<%=request.getContextPath()%>/deleteBook.do?";
                         //   alert('fm.action:'+fm.action);
                            fm.submit();}
            }
               else{
            alert('��ѡ��Ҫɾ���ļ�¼!');
            }
            }
            else{
                var n = 0;
                for(var i=0;i<fm.checkboxSelect.length;i++){
                    if(fm.checkboxSelect[i].checked==true){
                        n = n + 1;
                    }
                }
            //    alert('n:'+n);
                if(n==0){
                    alert('��ѡ��Ҫɾ���ļ�¼!');
                }  else{
                    for(var j=0;j<fm.checkboxSelect.length;j++){
                        if(fm.checkboxSelect[j].checked==true){
                            var checkboxSelect = fm.checkboxSelect[j].value;
                         //   alert('checkboxSelect:'+checkboxSelect);
                          if(!confirm('ȷ��Ҫɾ���������ɻָ���')){
                                return false;
                                }
                                 else{                    
                            fm.action = "<%=request.getContextPath()%>/deleteBook.do?";
                          //  alert('fm.action:'+fm.action);
                            fm.submit();
                            break;
                            }
                        }
                    }
                   
                }
             }  
        }
</script>

<br />
  

</body>
</html>
</html:html>
