<%--
*********
******************
查询表本页面  
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
<title>表本查询页面</title>
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
			<td class=title0 colspan="7"><B>查询表本信息</B></td>
		</tr>

          <tr>
            <td class="title">表本号</td>
            <td class=input><input class="text" name="BookNo" type="text"  ></td>
			<td class="title">表本名</td>
           <td class=input><input class="text" name="BookName" type="text"   ></td>
          </tr>
        </table>
        <table cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td class=button align="center"><input type=button class=button name=button0 value=" 查 询 " onClick="searchBook();"></td>
		</tr>
	</table>
      
     <br />

	
	
	<form name="fm1" >
        <table table class=common width="100%" cellspacing="1" cellpadding="5" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="6"><B>表本信息</B></td>
		</tr>

		<tr class=listtitle>
			<td nowrap><span class="select">选择</span></td>
			<td nowrap ><span class="title">表本号</span></td>
			<td nowrap ><span class="title">表本名</span></td>
			<td nowrap ><span class="title">备注</span></td>
			<td nowrap ><span class="title">表本类型</span></td>
			<td nowrap ><span class="title">是否有效</span></td>
			
			
			
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
			<td class="input" nowrap colspan="1">有效</td>
			<%} %>
			<%
			if(book.getValidStatus().equals("0")){
			 %>
			<td class="input" nowrap colspan="1">无效</td>
			<%} %>
		
			
	
		</tr>
		<%} %>
		
		<%--<tr><td colspan="10" >第1页/第1-10条共120条  下一页  尾页 </td></tr>
	--%></table>
	


 
      

 
    <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="修  改"
					onclick="update();">
				</td>
				  <td class=button align="center">
					<input type=button class=button name=button8 value="删  除"
						onClick="deleteBook();">
				</td>
				  <td class=button align="center"><input class=button name="add" type="button"  value=" 新 增 " onClick="javascript:addBook();"></td>
				  <td class=button align="center">
					<input type=button class=button name=button1 value="配置表本"
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
	alert("将选中记录设置为无效！");
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
            alert('请选择一条记录进行修改!');
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
                    alert('请选择一条记录进行修改!');
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
                      alert('只能选择一条记录进行修改!');
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
            alert('请选择一个表本进行配置!');
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
                    alert('请选择一个表本进行配置!');
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
                      alert('只能选择一个表本进行配置!');
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
						if(!confirm('确认要删除？将不可恢复。')){
                                return false;
                                }
                                 else{ 
                            fm.action = "<%=request.getContextPath()%>/deleteBook.do?";
                         //   alert('fm.action:'+fm.action);
                            fm.submit();}
            }
               else{
            alert('请选择要删除的记录!');
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
                    alert('请选择要删除的记录!');
                }  else{
                    for(var j=0;j<fm.checkboxSelect.length;j++){
                        if(fm.checkboxSelect[j].checked==true){
                            var checkboxSelect = fm.checkboxSelect[j].value;
                         //   alert('checkboxSelect:'+checkboxSelect);
                          if(!confirm('确认要删除？将不可恢复。')){
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
