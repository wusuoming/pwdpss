<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%
	String noPass = "1";//审核未通过标志
	String startNodeNo = (String) request.getAttribute("startNodeNo");
	String nodeStatus = (String) request.getAttribute("nodeStatus");
%>

<html:html locale="true">
<head>
<title></title>
<app:css />

<script  language="Javascript">

         function update1()
        {          
            var count = document.getElementsByName('checkboxSelect').length;
           // alert('count:'+count);
            if(count ==1){
         //   alert(fm.checkboxSelect.checked);
            if(fm.checkboxSelect.checked==true){
                            var checkboxSelect = fm.checkboxSelect.value;
                         //   alert('checkboxSelect:'+checkboxSelect);

                            this.location = "<%=request.getContextPath()%>/updateLineAmmeter.do?method=updateLineAmmeter&action=Edit&firstquery=1";
                          //  alert('fm.action:'+fm.action);
                         
            }
            else{
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
              
                if(n==0){
                    alert('请选择一条记录进行修改!');
                }   else if(n==1){
                    for(var j=0;j<fm.checkboxSelect.length;j++){
                        if(fm.checkboxSelect[j].checked==true){
                            var checkboxSelect = fm.checkboxSelect[j].value;
                         //   alert('checkboxSelect:'+checkboxSelect);

                            this.location = "<%=request.getContextPath()%>/updateLineAmmeter.do?method=updateLineAmmeter&action=Edit&firstquery=1";
                           
                           
                            break;
                        }
                    }
                    }else{
                      alert('只能选择一条记录进行修改!');
                    }
                }
               }
            
        
</script>
<script  language="Javascript">

         function deleteLineAmmeter()
        {                   
            var count = document.getElementsByName('checkboxSelect').length;
        //  alert('count:'+count);
            if(count ==1){
            if(fm.checkboxSelect.checked==true){
                            var checkboxSelect = fm.checkboxSelect.value;
                         //   alert('checkboxSelect:'+checkboxSelect);

                           this.location = "<%=request.getContextPath()%>/deleteLineAmmeter.do?method=deleteLineAmmeter&action=one";
                         //   alert('fm.action:'+fm.action);
                         if(!confirm('确认要删除？将不可恢复。')){
                                return false;
                                }else{
                           
                            }
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
                alert('n:'+n);
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
                           this.location = "<%=request.getContextPath()%>/deleteLineAmmeter.do?method=deleteLineAmmeter&action=many";
                          //  alert('fm.action:'+fm.action);
                           
                            break;
                            }
                        }
                    }
                   
                }
             }  
        }
</script>
<script language="Javascript"
	src="/mimessage/common/pub/StaticJavascript.jsp"></script>
<html:base />
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
<body class="interface">
<html:form action="/queryAmmeter.do?method=queryAmmeter">

	<!-- 分页的显示-->
  <html:hidden property="pageNo"/>
     <html:hidden property="rowsCount"/>
     <html:hidden property="rowsPerPage"/>
	<!--<table class="common" align="center" cellspacing="1" cellpadding="5">-->
	
	<table class=common width="100%" cellspacing="1" cellpadding="5">
		<tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>查询线路电表对照信息</B></td>
		</tr>
		<tr class=listtitle>
				<td width="25">
					<span class="select" >选择</span>
				</td>
				<td nowrap>
					<span class="title">线路代码</span>
				</td>
				<td nowrap>
					<span class="title">表号</span>
				</td>
				<td nowrap>
					<span class="title">是否有效</span>
				</td>
			</tr>

		<%
			int index = 0;
		%>
	    <% Collection collection = (Collection)request.getAttribute("lineAmmeterList"); 
	      if(collection != null && collection.size()>0 )
	          {
	    %>
	   
		<logic:iterate id="lineAmmeter" name="lineAmmeterList">

		<tr class=oddrow>			
			<td class="select" nowrap colspan="1"><!-- checkbox的显示 --> <input
				type=checkbox name=checkboxSelect value="<%=index%>"> </td>
				<input type="hidden" name="ammeterNo" value="<bean:write name="lineAmmeter"	property="ammeterNo" filter="true" />">
				
				
	
		

			<!-- 线路代码 -->
			<td class="input" nowrap colspan="1"><bean:write name="lineAmmeter"
				property="lineCode" filter="true" /></td>
				<input type="hidden" name="lineCode" value="<bean:write name="lineAmmeter"	property="lineCode" filter="true" />">
			<!-- 表号 -->
			<td class="input" nowrap colspan="1"><bean:write name="lineAmmeter"
				property="ammeterNo" filter="true" /></td>
			
			<!-- 上表日期 -->
			
				
				<td class="input" nowrap colspan="1">
				<logic:equal name="lineAmmeter" property="validStatus" value="1" >
				有效
				</logic:equal>
				<logic:equal name="lineAmmeter" property="validStatus" value="0" >
				无效
				</logic:equal>
				</td>
				</tr>
				<%
					index++;
				%>
		</logic:iterate>
		
	</table>
		<table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="修  改"
						onClick="update1();">
				</td>
				  <td class=button align="center">
					<input type=button class=button name=button8 value="删  除"
						onClick="deleteLineAmmeter();">
				</td>
				<td class=button align="center">
					<input type=button class=button name=button0 value="返　回"
						onClick=history.go(-1);>
				</td>
			</tr>
		</table>
 
		<%} else{%>
		
	    <table class=common>	
	    <tr>
			<td align="center" class="input" nowrap colspan="1">
			<img src="../../images/sorryNoSearch.gif" border="0">
			
				</td>
				</tr>
				</table>
				<table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button0 value="返　回"
						onClick=history.go(-1);>
				</td>
			</tr>
		</table>
	    <%
	    }
	     %>	

</html:form>
	 <script language="javascript">
		var fm = uiGetAmmeterForm;
		</script>
</body>
</html:html>

