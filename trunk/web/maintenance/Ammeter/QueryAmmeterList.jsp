<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

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
      function AddForm(){  
       var strURL = "<%=request.getContextPath()%>/forwordAmmeter.do?method=forwordAmmeter&action=Create";
       fm.action= strURL;
	  fm.submit();
        } 
         function update()
        {          
            var count = document.getElementsByName('checkboxSelect').length;
            //alert('count:'+count);
            if(count ==1){
            if(fm.checkboxSelect.checked==true){
                            var checkboxSelect = fm.checkboxSelect.value;
                         //   alert('checkboxSelect:'+checkboxSelect);

                           this.location = "<%=request.getContextPath()%>/updateAmmeter.do?method=updateAmmeter&action=Edit&firstquery=1";
                          //  alert('fm.action:'+fm.action);
                          
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

                            this.location = "<%=request.getContextPath()%>/updateAmmeter.do?method=updateAmmeter&action=Edit&firstquery=1";
                           
                           
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

         function deleteAmmeter()
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
                            this.location = "<%=request.getContextPath()%>/deleteAmmeter.do?method=deleteAmmeter&action=one";
                         //   alert('fm.action:'+fm.action);
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
                           this.location = "<%=request.getContextPath()%>/deleteAmmeter.do?method=deleteAmmeter&action=many";
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
			<td class=title0 colspan="8"><B>查询电表信息</B></td>
		</tr>
		<tr class=listtitle>
				<td nowrap>
					<span class="select" >选择</span>
				</td>
				<td nowrap>
					<span class="title">表号</span>
				</td>
				<td nowrap>
					<span class="title">相</span>
				</td>
				<td nowrap>
					<span class="title">伏</span>
				</td>
				
				<td nowrap>
					<span class="title">安</span>
				</td>
				<td nowrap>
					<span class="title">厂名</span>
				</td>
				<td nowrap>
					<span class="title">型式</span>
				</td>
				
				<td nowrap>
					<span class="title">是否有效</span>
				</td>
			</tr>

		<%
			int index = 0;
		%>

		<logic:iterate id="ammeter" name="ammeterList">

		<tr class=oddrow>			
			<td class="select" nowrap ><!-- checkbox的显示 --> <input
				type=checkbox name=checkboxSelect value="<%=index%>"> </td>
				<input type="hidden" name="ammeterNo" value="<bean:write name="ammeter"	property="ammeterNo" filter="true" />">
			<!-- 表号 -->
			<td class="input" nowrap ><bean:write name="ammeter"
				property="ammeterNo" filter="true" /></td>
			<!-- 相 -->
			<td class="input" nowrap ><bean:write name="ammeter"
				property="ammeterX" filter="true" /></td>
				<!-- 伏 -->
			<td class="input" nowrap ><bean:write name="ammeter"
				property="ammeterV" filter="true" /></td>
				
				<!-- 安 -->
			<td class="input" nowrap ><bean:write name="ammeter"
				property="ammeterA" filter="true" /></td>
				
			
			<!-- 中文名称 -->
			<td class="input" nowrap ><bean:write name="ammeter"
				property="factoryName" filter="true" /></td>

			
			<td class="input" nowrap ><bean:write name="ammeter"
				property="ammeterType" filter="true" /></td>
				
				<td class="input" nowrap >
				<logic:equal name="ammeter" property="validStatus" value="1" >
				有效
				</logic:equal>
				<logic:equal name="ammeter" property="validStatus" value="0" >
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
			<td class=button align="center"><input type=button class=button
				name=button0 value="新增" onClick="AddForm();"></td>
				<td class=button align="center">
					<input type=button class=button name=button1 value="修  改"
						onClick="update();">
				</td>
				  <td class=button align="center">
					<input type=button class=button name=button8 value="删  除"
						onClick="deleteAmmeter();">
				</td>
				<td class=button align="center">
					<input type=button class=button name=button0 value="返　回"
						onClick=history.go(-1);>
				</td>
			</tr>
		</table>
 
			

</html:form>
	 <script language="javascript">
		var fm = uiGetAmmeterForm;
		</script>
</body>
</html:html>

