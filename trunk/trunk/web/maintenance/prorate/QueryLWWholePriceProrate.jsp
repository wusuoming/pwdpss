<%--查询比例分摊信息create by qiaoyouliang 2008.11.4 --%>
<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterBookFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@page import="com.elongway.pss.dto.domain.LwWholeSaleProrateDto"%>
<%@page import="java.util.Collection"%>
<%@page import="com.elongway.pss.bl.facade.BLLwDcodeFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwDcodeDto"%>
<jsp:directive.page import="java.text.DecimalFormat"/>
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
<title>趸售电价页面</title>
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
			<td class=title0 colspan="6"><B>趸售比例展示页面</B></td>
		</tr>
		</table>
		<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr>
 <td>
 <table class=common width="100%" cellspacing="1" cellpadding="5">
 <%Collection wholeProrateList  = (Collection)request.getAttribute("saleProrateList"); 
 int count = wholeProrateList.size();
 DecimalFormat df = new DecimalFormat("###0.0000");
 int index = 0;
 for(Iterator it = wholeProrateList.iterator();it.hasNext();){
      LwWholeSaleProrateDto dto = (LwWholeSaleProrateDto)it.next();  
 					 if(index%2==0)
							out.print("<tr class=oddrow>");
						index++; %>
   <td>
       <table class=common width="100%" cellspacing="1" cellpadding="5">
 
      <tr class=listtitle align="center">
			<td  colspan="6" bgcolor="4CA8EB"><B><%=dto.getCompanyName() %><%=dto.getVoltLevel()%>KV比例分摊（单位%）</B></td>
		</tr>
     
     <tr>
			<td class="title">居民</td>
            <td class="title">非居</td>
            <td class="title">农灌</td>
            <td class="title">生产</td>
            <td class="title">商业</td>
            <td class="title">非普</td>
          </tr>
           <tr>
			<td class="title"><%=df.format(dto.getPeople())%></td>
            <td class="title"><%=df.format(dto.getNotPeople())%></td>
            <td class="title"><%=df.format(dto.getFarm())%></td>
            <td class="title"><%=df.format(dto.getProduce())%></td>
            <td class="title"><%=df.format(dto.getBusiness())%></td>
            <td class="title"><%=df.format(dto.getIndustry())%></td>
          </tr>
  
        
          
             </table>
   </td>
   <%
						if(index == count && count%2 == 1){
							out.print("<td ><table class=common width='100%' cellspacing='1' cellpadding='5'></table></td>");
						}
					%>
					<%
						if(index !=0 && index%2 == 0){
							out.print("</tr>");
						}
					%>
<%} %>
           

           
 </table>
 </td>
 </tr>
      
        </table>
       
      
     <br />

	
	
	
 
    <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="修  改"
					onclick="update();">
				</td>
				 
				  <td class=button align="center"><input class=button name="add" type="button"  value="新  增" onClick="javascript:addWholeProrate();"></td>
				
			</tr>
		</table>
		
		
    </form>
<script language="javascript">

function addWholeProrate(){
	fm.action="addLWWholeSaleProrate.jsp?";
	fm.submit() 
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
    fm.action="/iacontact/modifySaleProrate.do?";
	fm.submit();                
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
                            alert('fm.action:'+fm.action);
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
