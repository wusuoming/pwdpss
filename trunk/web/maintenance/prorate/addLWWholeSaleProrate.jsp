
<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
 <meta http-equiv=Content-Type content="text/html; charset=gb2312">

<title>�������۱�����̯</title>
<link rel="stylesheet" type="text/css" media="all" href="/iacontact/css/calendar.css" title="win2k-cold-1" /> 
<app:css />
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
<script language="Javascript"
	src="/iacontact/common/pub/StaticJavascript.jsp"></script>
<script language="javascript"	src="/iacontact/common/pub/js/calendar.js"></script>


<!--�Զ������б�JS2-->

</head>
<body id="all_title">
  
	
    <!--MENU OVER-->
    <!--CONTENT BEGIN-->
    
      <form name="fm" style="display:block;">
         <table class=common width="100%" cellspacing="1" cellpadding="5">
         <tr class=listtitle align="center">
			<td class=title0 colspan="8"><B>�������۱�����̯</B></td>
		</tr>
          <tr>
            <td class=title>������˾</td>
           <td class="input"><select name="comCode"  class="text" style="width:265px">
				  <option value="gy" selected="selected">����ũ���</option>		
				  <option value="dm" selected="selected">��ïũ���</option>		
				  <option value="ty" selected="selected">����ũ���</option>		
				  <option value="jy" selected="selected">��ԭũ���</option>						  		  
              </select>	
          
            <td class=title>��ѹ�ȼ�</td>
            <td class=input><select name="voltLevel"  class="text" style="width:265px">
				  <option value="10" >10KV</option>				  
				  <option value="35">35KV</option></td>
          </tr>
		  <tr>
		  
		  <td class=title>����</td>
            <td class="input"><input name="people" type="text" class="text">
            </td>
		   <td class=title>�Ǿ���</td>
            <td class="input"><input name="notPeople" type="text" class="text">
            </td>
           
       </tr>
        <tr>
		  
		  <td class=title>ũ��</td>
            <td class="input"><input name="farm" type="text" class="text">
            </td>
		   <td class=title>ũҵ����</td>
            <td class="input"><input name="produce" type="text" class="text">
            </td>
           
       </tr>
        <tr>
		  
		  <td class=title>��ҵ</td>
            <td class="input"><input name="business" type="text" class="text">
            </td>
		   <td class=title>���չ�ҵ</td>
            <td class="input"><input name="industry" type="text" class="text">
            </td>
           
       </tr>
       
   
		      
        </table>
		
    <br />
<!--һ��ѵİ�ť-->

    <table width="50%" border="0" cellspacing="0" cellpadding="0" align="center">  
      <tr>
        <td class=button><input name="add" type="button" class=button value=" �� �� " onClick="javascript:addProrate();"></td><%--
        <td class=button><input name="reset" type="button" class=button value=" �� �� "></td>
        --%><td class=button><input name="back" type="button" class=button value="����" onClick="javascript:history.go(-1);"></td>
      </tr>
    </table>


<!--Button End-->
</form>
<br />
  
<script language="javascript">
function addProrate(){

 fm.action="<%=request.getContextPath()%>/addWholeProrate.do?";
 fm.submit();

}


</script>
</body>
</html:html>
