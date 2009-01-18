<%--
*********
******************
换表查询页面 
create by qiaoyouliang
2008.11.4
--%>

<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterBookFacade"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@page import="com.elongway.pss.bl.facade.BLLwPowerUserFacade"%>
<%@page import="java.util.Collection"%>
<%@page import="com.elongway.pss.util.AppConst"%>
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
<title>换表查询页面</title>
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
  <%	String saleType = (String )request.getAttribute("saleType"); %>
      <form name="fm" style="display:block;" method="post">
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>换表查询页面</B></td>
		</tr>

          <tr>
            <td class="title">户号</td>
            <td class=input><input class="title" name="userNo" type="text"></td>
           <td class="title"><select name="saleType"  class="select">
           <%if(AppConst.TOWN_SALE_FLAG.equals(saleType)) {%>
				  <option value="1" selected="selected">直供乡</option>				
				  <%}else{ %> 
				   <option value="1">直供乡</option>				
				   <%} 
				 if(AppConst.WHOLE_SALE_FLAG.equals(saleType)) {%>
				  <option value="2" selected="selected">趸售</option>				
				  <%}else{ %> 
				   <option value="2">趸售</option>				
				   <%} 
				   if(AppConst.FACTORY_SALE_FLAG.equals(saleType)) {%>
				  <option value="3" selected="selected">大工业</option>				
				  <%}else{ %> 
				   <option value="3">大工业</option>				
				   <%} %>
              </select>	</td>
           <td class="title"></td>
             
          </tr>
        </table>
        <table cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td class=button align="center"><input type=button class=button name=button0 value=" 查 询 " onClick="searchChg();"></td>
		</tr>
	</table>

	   <table table class=common width="100%" cellspacing="1" cellpadding="5" border="0">
        <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>用电用户信息</B></td>
		</tr>

		<tr class=listtitle>
			<td nowrap><span class="select">选择</span></td>
			<td nowrap ><span class="title">户号</span></td>
			<td nowrap ><span class="title">户名</span></td>
			<td nowrap ><span class="title">地址</span></td>
			<td nowrap ><span class="title">所属乡镇</span></td>
			
			
			
		</tr>
		<%

	if(null== saleType){		
	BLLwPowerUserFacade 	 blLwPowerUserFacade=new BLLwPowerUserFacade();
	Collection userlist= blLwPowerUserFacade.findByConditions(" 1=1 ");
	
	Iterator it=userlist.iterator();
      while(it.hasNext()){
      	LwPowerUserDto 	 user=(LwPowerUserDto)it.next();
      	
      	
 %>
		<tr>
		
			<td class="select" nowrap colspan="1"><input  name="chooseUser" type="checkbox" value="<%=user.getUserNo()%>"></td>
			
			<td class="input" nowrap colspan="1"><%=user.getUserNo()%></td>
			<td class="input" nowrap colspan="1"><%=user.getUserName()%></td>
			<td class="input" nowrap colspan="1"><%=user.getAddress()%></td>
			<td class="input" nowrap colspan="1"><%=user.getTownCode()%></td>
			
		
			
	
		</tr>
		<%}}else { 
		Collection collection = (Collection)request.getAttribute("userList");
		
		Iterator it=collection.iterator();
      while(it.hasNext()){
      	LwPowerUserDto 	 user=(LwPowerUserDto)it.next();
      	
      	
 %>
 <tr>
		
			<td class="input" nowrap colspan="1"><input  name="chooseUser" type="checkbox" value="<%=user.getUserNo()%>"></td>
			
			<td class="input" nowrap colspan="1"><%=user.getUserNo()%></td>
			<td class="input" nowrap colspan="1"><%=user.getUserName()%></td>
			<td class="input" nowrap colspan="1"><%=user.getAddress()%></td>
			<td class="input" nowrap colspan="1"><%=user.getTownCode()%></td>
			
		
			
	
		</tr>
		<%} }%>
		
		</table>
	
 <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="换 表"
						onClick="change();">
				
			</tr>
		</table>
 
   
		
    </form>
<script language="javascript">

function searchChg(){
	fm.action="<%=request.getContextPath()%>/chgAmmeterUser.do?";
	fm.submit();
}
function change()
        {    
            
            var count = document.getElementsByName('chooseUser').length;
           
            if(count ==1){
            if(fm.chooseUser.checked==true){
                            var checkboxSelect = fm.chooseUser.value;
                      
							alert(fm.chooseUser.value);
                           fm.action = "<%=request.getContextPath()%>/chgQuery.do?";
                         	fm.submit();
                            
            }   else{
            alert('请选择一个用户进行换表操作!');
            }
            }
            else{
                var n = 0;
                for(var i=0;i<fm.chooseUser.length;i++){
                    if(fm.chooseUser[i].checked==true){
                        n = n + 1;
                    }
                }
             //   alert('n:'+n);
                if(n==0){
                    alert('请选择一个用户进行换表操作!');
                }   else if(n==1){
                    for(var j=0;j<fm.chooseUser.length;j++){
                        if(fm.chooseUser[j].checked==true){
                            var checkboxSelect = fm.chooseUser[j].value;
                         //   alert('checkboxSelect:'+checkboxSelect);

                           fm.action = "<%=request.getContextPath()%>/chgQuery.do?";
                           fm.submit();
                           
                            break;
                        }
                    }
                    }else{
                      alert('只能选择一个用户进行换表操作!');
                    }
                }
               }


</script>

<br />
  

</body>
</html>
</html:html>
