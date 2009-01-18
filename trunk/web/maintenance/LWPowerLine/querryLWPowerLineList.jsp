<%--
*********
******************
查询线路信息页面  
create by wangrongjia
200810.09
--%>
<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerLineDto"/>
 <%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>


<jsp:directive.page import="com.elongway.pss.dto.domain.LwPowerUserDto"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.List"/>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh" xml:lang="zh">

<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">
 <link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
  
<title>查询页面</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>用电用户查询页面</title>
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

<body id="all_title">
  <div id="container">
    <!--CONTENT BEGIN-->
    <div id="content">
      <form name="fm" style="display:block;">
        <table cellpadding="0" cellspacing="0" width="100%">
         <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>查询线路信息</B></td>
		</tr>
          <tr>
            <td class="title">线路代码</td>
            <td class=input><input name="LineCode" type="text"  class="text"></td>
			<td class="title">线路中文名称</td>
           <td class=input><input name="LineCName" type="text"  class="text" ></td>
          </tr><%--
          <tr>
            <td class="title">缴费归属机构</td>
            <td class=input><input name="FeeCom" type="text"  value="" ></td>
			<td class="title">所属电力公司</td>
            <td class=input><input name="ComCode" type="text"   ondblclick="codeQuery(this)"
							onkeyup="codeQuery(this);" class="codecode" ></td>
          	<td class=input>
          	<td class=input>
          </tr>
		  

--%><table cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td class=button align="center"><input type=button class=button name=button0 value=" 查 询 " onClick="serchLine();"></td>
		</tr>
	</table>
        </table>
      </form>
   <form name="fm1" >
        <table class="fix_table" border="0" width="100%">
         <tr class=listtitle align="center">
			<td class=title0 colspan="3"><B>线路信息</B></td>
		</tr>
          <%--<tr>
            <td class="title">线路代码</td>
            <td class=input><input name="LineCode" type="text"  ></td>
			<td class="title">线路中文名称</td>
           <td class=input><input name="LineCName" type="text"   ></td>
          </tr>
          <tr>
            <td class="title">缴费归属机构</td>
            <td class=input><input name="FeeCom" type="text"  value="" ></td>
			<td class="title">所属电力公司</td>
            <td class=input><input name="ComCode" type="text"  value="" ></td>
          </tr>
		  <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" 查 询 " onClick="javascript:serchLine();"></td>
		 
</tr>
        </table>
     	--%>
 
	
	
		<tr class=listtitle>
		    <td nowrap><span class="title">选择</span></td>
			<td nowrap><span class="title">线路代码</span></td>
			<%--<td nowrap><span class="title">线路中文名称</span></td>
			<td nowrap><span class="title">线路英文名称</span></td>
			--%><%--<td nowrap><span class="title">缴费归属机构</span></td>
			--%><%--<td nowrap><span class="title">所属电力公司</span></td>
			<td nowrap><span class="title">供电目标</span></td>
			<td nowrap><span class="title">供电类型</span></td>
			<td nowrap><span class="title">电流互感器</span></td>
			<td nowrap><span class="title">电压互感器</span></td>
			--%><td nowrap><span class="title">电压等级</span></td>
			<%--<td nowrap><span class="title">硅铁线损</span></td>
			<td nowrap><span class="title">三峡金线损</span></td>
			<td nowrap><span class="title">损失比例</span></td>
			--%><%--<td nowrap><span class="title">价格分类</span></td>
			--%><%--<td nowrap><span class="title">损失标志</span></td>
			--%><%--<td nowrap><span class="title">倍率</span></td>
			--%><%--<td nowrap><span class="title">注释</span></td>
			
		--%></tr>
		<% 
		List linelist=(List)request.getAttribute("powerLine");
		
		
	Iterator it=linelist.iterator();
      while(it.hasNext()){
      	LwPowerLineDto line=(LwPowerLineDto)it.next();
      	 %>
		<tr>
			<td class="input" nowrap colspan="1"><input  name="chooseLine" type="checkbox" value="<%=line.getLineCode()%>"></td>
			<td style="display:none"><input type="hidden" name="LineId" value="<%=line.getLineCode()%>"></td>
			<td class="input" nowrap colspan="1"><%=line.getLineCode()%></td>
			<%--<td ><%=line.getLineCName()%></td>
			<td ><%=line.getLineEName()%></td>
			--%><%--<td class="input" nowrap colspan="1"><%=line.getFeeCom()%></td>
			--%><%--<td class="input" nowrap colspan="1"><%=line.getComCode()%></td>
			--%><%--<td class="input" nowrap colspan="1"><%=line.getTargetCode()%> </td>
			--%><%--<td class="input" nowrap colspan="1"><%=line.getSupplyType()%></td>
			--%><%--<td class="input" nowrap colspan="1"><%=line.getCt()%></td>
			<td class="input" nowrap colspan="1"><%=line.getPt()%></td>
			--%><td class="input" nowrap colspan="1"><%=line.getVoltLevel()%></td>
			<%--<td ><%=line.getSiFeLoss()%></td>
			--%><%--<td ><%=line.getSanXiaLoss()%></td>
			--%><%--<td ><%=line.getLossProp()%></td>
			--%><%--<td ><%=line.getPriceCategory()%></td>
			--%><%--<td ><%=line.getLossFlag()%></td>
			--%><%--<td ><%=line.getRate()%></td>
			--%><%--s
			
		--%></tr>
		<%} %>
		<%--<tr><td colspan="20" class="yui-dt-odd">第1页/第1-10条共120条  下一页  尾页 </td></tr>
	--%></table>
 

   

  
    <table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">

				<td class=button align="center">
					<input type=button class=button name=button1 value="修  改"
						onClick="addLine();">
				</td>
				 <td class=button align="center">
					<input type=button class=button name=button8 value="删  除"
						onClick="delLine();">
				</td>
				<td class=button align="center">
					<input type=button class=button name=button0 value="增　加"
						onClick="caoDe();">
				</td>
			</tr>
		</table>
     </form>
<script language="javascript">

function addLine(){
var str="";
  var checkbox = document.getElementsByName("chooseLine");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!请选择要 修改的线路");
  return false;
 }
 if(n>1){
  alert("一次只能修改一条线路！");
  return false;
 }
 else{
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
      
	this.location="/iacontact/queryOneLWPowerLine.do?UserLineNo="+str;
	 
	}

	
}
function caoDe(){
fm.action="LWPowerLine/addLWPowerLine.jsp";
	fm.submit();
}
function delLine(){

  var str="";
  var checkbox = document.getElementsByName("chooseLine");
  var n = 0;
                for(var j=0;j<checkbox.length;j++){
                    if(checkbox[j].checked==true){
                        n = n + 1;
                    }
                }
   
 if(n==0){
  alert("!请选择要删除的线路");
  return false;
 }else{
     for(var i=0;i<checkbox.length;i++) 
{ 
 

if(checkbox[i].checked) {
 
str+=checkbox[i].value+",";
     }
     
     }
      if(!confirm('确认要删除？将不可恢复。')){
                                return false;
                                }else{
	this.location="/iacontact/deleteLWPowerLine.do?UserLineNo="+str;
	 }
	}
	
	
}

//function delUser(){
	//alert("批量删除记录！");
//}

function cancelUser(){
	alert("将选中记录设置为无效！");
}
function serchLine(){
	
	fm.action="/iacontact/queryLWPowerLine.do";
	fm.submit();
}
function codeQuery(field)
{
	
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.ComCode.value+"&TableName=Lwdcompany1";
	
	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
<br />
    </div>
    <!--CONTENT OVER-->
  </div>

</body>
</html>
