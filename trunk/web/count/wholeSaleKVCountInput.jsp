<%--
*********
******************���۲�ѯ¼��ҳ��  
create by wangrongjia
200810.13
--%>

<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
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
  
<title>���۲�ѯҳ��</title>
<link rel="stylesheet" type="text/css" media="all" href="/mimessage/css/calendar.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="/iacontact/css/Standard.css">
<title>���۲�ѯҳ��</title>
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
    
      <form name="fm" style="display:block;" method="post">
        <table class=common width="100%" cellspacing="1" cellpadding="5">
        <tr class=listtitle align="center">
			<td class=title0 colspan="7"><B>¼������ͳ��������Ϣ</B></td>
		</tr>

         
         
          <tr>
          <td class="title">¼�����£�</td>				
				<td class=input>
				<input styleClass="text" name="inputDate"	   />				
				</td>
					</tr>
					<tr style="display:none;">
          <td style="display:none;"><input styleClass="text" name="powerClass" type="text" value="2" ></td>
          
          </tr>
         
   <tr>
           <td class="title">���۵�ѹѡ��</td>	
         <td class="input"><select name="wholesaleKV" >
				  <option value="10">10KV</option>
				  <option value="35">35KV</option>
				  
              </select>	
          
          </tr>
          <tr>
            <td class="title">��ҵѡ��</td>
            
            <td class="input"><select name="company" >
            	<option value="">ȫѡ</option>
				  <option value="gy">����</option>
				  <option value="dm">��ï</option>
				  <option value="ty">ͼ��</option> 
              </select>	
            </td>
			
          </tr>
          
			
			
		  
		  <tr class="listtitle" align="center"><td class=button align="center"><input class=button name="serch" type="button"  value=" ͳ�� " onClick="javascript:wholeSaleSerch();"></td>
		 
</tr>
        </table>
      
     <br />

	
	
</form>
<script language="javascript">

function wholeSaleSerch(){
	if(fm.wholesaleStyle.value=="1"){
	fm.action="/iacontact/wholeSaleCount.do";
	
	}if(fm.wholesaleStyle.value=="4"){
	fm.action="/iacontact/wholeSaleOtherCount.do";
	
	}
	fm.submit();
}




</script>
<br />
  

</body>
</html>
</html:html>