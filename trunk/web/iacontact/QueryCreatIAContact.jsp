<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="UTF-8"%>
<%@ page info = "QueryCreatIAContact.jsp -- 电子联系单表，yangfuqiang，2006-08-17。" %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ page import="com.elongway.pss.util.SystemConfig" %>
<script language="Javascript" src="/iacontact/common/pub/StaticJavascript.jsp"></script>


<%
	String maxFileSize = SystemConfig.getParameterValue(SystemConfig.FILE_SIZE);	
	int maxSize = Integer.parseInt(maxFileSize);
	int maxSizeM = maxSize/1024/1024;
	
	
	  

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script language="javascript">
	function questionchange(value){	                
                if(value == "01"){
                        eval("a.style.display=\"\";");
                        eval("b.style.display=\"\";");
                        eval("c.style.display=\"none\";");
                        eval("d.style.display=\"none\";");
                        eval("e.style.display=\"none\";");   
                        eval("f.style.display=\"none\";");    
                        eval("g.style.display=\"none\";");       
                        eval("h.style.display=\"none\";");   
                        eval("i.style.display=\"none\";"); 
                        eval("j.style.display=\"none\";"); 
                        eval("k.style.display=\"none\";"); 
                        eval("l.style.display=\"none\";"); 
                        eval("m.style.display=\"none\";"); 
                        eval("n.style.display=\"none\";"); 
                        eval("o.style.display=\"none\";");   
                        eval("p.style.display=\"none\";");    
                        eval("r.style.display=\"none\";");
                        eval("s.style.display=\"none\";");
                        eval("t.style.display=\"none\";");
                        eval("u.style.display=\"none\";");
                        eval("v.style.display=\"none\";");                       
                                                                
                } else if(value == "02"){
                		eval("a.style.display=\"none\";");
                        eval("b.style.display=\"none\";");
                        eval("c.style.display=\"\";");
                        eval("d.style.display=\"none\";");    
                        eval("e.style.display=\"\";");
                        eval("f.style.display=\"none\";");
						eval("g.style.display=\"none\";");       
                        eval("h.style.display=\"none\";"); 
                        eval("i.style.display=\"none\";");
                        eval("j.style.display=\"none\";"); 
                        eval("k.style.display=\"none\";"); 
                        eval("l.style.display=\"none\";"); 
                        eval("m.style.display=\"none\";"); 
                        eval("n.style.display=\"none\";"); 
                        eval("o.style.display=\"none\";");  
                        eval("p.style.display=\"none\";"); 
                        eval("r.style.display=\"none\";");  
                        eval("s.style.display=\"none\";");
                        eval("t.style.display=\"none\";");
                        eval("u.style.display=\"none\";");
                        eval("v.style.display=\"none\";");   
                        
                }else if(value == "03"){
                		eval("a.style.display=\"none\";");
                        eval("b.style.display=\"none\";");
                        eval("c.style.display=\"none\";");
                        eval("d.style.display=\"\";");   
                        eval("e.style.display=\"\";");
                        eval("f.style.display=\"none\";");   
                		eval("g.style.display=\"none\";");       
                        eval("h.style.display=\"none\";"); 
                        eval("i.style.display=\"none\";");
                        eval("j.style.display=\"none\";"); 
                        eval("k.style.display=\"none\";"); 
                        eval("l.style.display=\"none\";"); 
                        eval("m.style.display=\"none\";"); 
                        eval("n.style.display=\"none\";"); 
                        eval("o.style.display=\"none\";");  
                        eval("p.style.display=\"none\";"); 
                        eval("r.style.display=\"none\";"); 
                        eval("s.style.display=\"none\";");
                        eval("t.style.display=\"none\";");
                        eval("u.style.display=\"none\";");
                        eval("v.style.display=\"none\";");   
                        
                }else if(value == "04"){
                		eval("a.style.display=\"none\";");
                        eval("b.style.display=\"none\";");
                        eval("c.style.display=\"none\";");
                        eval("d.style.display=\"none\";");
                        eval("e.style.display=\"none\";");
                        eval("f.style.display=\"\";");
                        eval("g.style.display=\"none\";");       
                        eval("h.style.display=\"none\";"); 
                        eval("i.style.display=\"none\";"); 
                        eval("j.style.display=\"none\";"); 
                        eval("k.style.display=\"none\";"); 
                        eval("l.style.display=\"none\";"); 
                        eval("m.style.display=\"none\";"); 
                        eval("n.style.display=\"none\";"); 
                        eval("o.style.display=\"none\";");  
                        eval("p.style.display=\"none\";"); 
                        eval("r.style.display=\"none\";"); 
                        eval("s.style.display=\"none\";");
                        eval("t.style.display=\"none\";");
                        eval("u.style.display=\"none\";");
                        eval("v.style.display=\"none\";");   
                       
                 }else if(value == "05"){
                		eval("a.style.display=\"none\";");
                        eval("b.style.display=\"none\";");
                        eval("c.style.display=\"none\";");
                        eval("d.style.display=\"none\";");
                        eval("e.style.display=\"none\";");
                        eval("f.style.display=\"none\";");
                        eval("g.style.display=\"\";");     
                        eval("h.style.display=\"\";");
                        eval("i.style.display=\"\";");
                        eval("j.style.display=\"\";");     
                        eval("k.style.display=\"\";");     
                        eval("l.style.display=\"\";");     
                        eval("m.style.display=\"\";");     
                        eval("n.style.display=\"\";");     
                        eval("o.style.display=\"\";");  
                        eval("p.style.display=\"\";"); 
                        eval("r.style.display=\"\";"); 
                        eval("s.style.display=\"\";"); 
                        eval("t.style.display=\"\";"); 
                        eval("u.style.display=\"\";"); 
                        eval("v.style.display=\"\";"); 
                       
                }else {
                		eval("a.style.display=\"none\";");
                        eval("b.style.display=\"none\";");
                        eval("c.style.display=\"none\";");
                        eval("d.style.display=\"none\";");
                        eval("e.style.display=\"none\";");
                        eval("f.style.display=\"none\";");
						eval("g.style.display=\"none\";");       
                        eval("h.style.display=\"none\";");   
                        eval("i.style.display=\"none\";");
                        eval("j.style.display=\"none\";"); 
                        eval("k.style.display=\"none\";"); 
                        eval("l.style.display=\"none\";"); 
                        eval("m.style.display=\"none\";"); 
                        eval("n.style.display=\"none\";"); 
                        eval("o.style.display=\"none\";");  
                        eval("p.style.display=\"none\";"); 
                        eval("r.style.display=\"none\";");
                        eval("s.style.display=\"none\";");
                        eval("t.style.display=\"none\";");
                        eval("u.style.display=\"none\";");
                        eval("v.style.display=\"none\";");    
                        
                }
             }
	function check(value){	
		//查询	
		var companyCode =fm.companyCode.value;
		var makeCode = fm.makeCode.value;
		var creator = fm.creator.value;
		var phoneNumber = fm.phoneNumber.value;
		var email = fm.email.value;
		var queryDealType = fm.queryDealType.value;
		var queryContactStatus = fm.queryContactStatus.value;
		var content = fm.content.value;
		var questionType = fm.questionType.value;
		
		var policyQueryNo = fm.policyQueryNo.value;
		var tpolicyNo = fm.tpolicyNo.value;
		var endorseQueryNo = fm.endorseQueryNo.value;
		var ppolicyNo = fm.ppolicyNo.value;
		var tendorseQueryNo = fm.tendorseQueryNo.value;
		var registNo = fm.registNo.value;	
		
		var appearType = fm.appearType.value;	
		var editRequirement = fm.editRequirement.value;	
		var file1 = fm.file1.value;	
		var file2 = fm.file2.value;
		var file3 = fm.file3.value;
		var file4 = fm.file4.value;
		var file5 = fm.file5.value;	
					
		if (creator == ""){
		 	alert("请填写制单人姓名");
		 	//creator.focus();
			return false;
			history.back();
		}
		if (phoneNumber == ""){
			alert("请填写联系电话");
			//phoneNumber.focus();
			return false;
			history.back();
		}
			
		if (email == ""||email==null){
			alert("请填写电子邮件");
			//fm.email.focus();
			return false;
			history.back();
		}
		
		if (content.length > 1000){
			alert("业务描述请不要超过1000字");
			//content.focus();
			return false;
			history.back();
		}
				
		 function isEmail (theStr) {
	        var atIndex = theStr.indexOf ('@');
	        var dotIndex = theStr.indexOf ('.', atIndex);
	        var flag = true;
	        var theSub = theStr.substring (0, dotIndex + 1);
	        if ((atIndex < 1) || (atIndex != theStr.lastIndexOf ('@')) || (dotIndex < atIndex + 2) || (theStr.length <= theSub.length)){
                flag = false;
       		 } else { flag = true; }
        	return (flag);
			}
			if(!isEmail(email))
	    	{
			    alert("请输入正确的Email!");
			    return false;
		    }
		if (queryDealType == ""){
				alert("请填写数据处理类型");
				//queryDealType.focus();
				return false;
				history.back();
			}
		if (queryContactStatus == ""){
			alert("请填写数据处理类型");
			//queryContactStatus.focus();
			return false;
			history.back();
		}
		if (questionType == ""){
			alert("请填写问题分类");
			//phoneNumber.focus();
			return false;
			history.back();
		}
		if(value== "01"){
			if (policyQueryNo == ""){
				alert("请填写投保查询码");
				//queryContactStatus.focus();
				return false;
				history.back();
			}
			if (tpolicyNo == ""){
				alert("请填写保单号");
				//queryContactStatus.focus();
				return false;
				history.back();
			}
		
		}else if(value== "02"){
			if (endorseQueryNo == ""){
				alert("请填写批改查询码");
				//queryContactStatus.focus();
				return false;
				history.back();
			}
			if (ppolicyNo == ""){
				alert("请填写保单号");
				//queryContactStatus.focus();
				return false;
				history.back();
			}
		
		}else if(value== "03"){
			if (tendorseQueryNo == ""){
				alert("请填写退保查询码");
				//queryContactStatus.focus();
				return false;
				history.back();
			}
			if (ppolicyNo == ""){
				alert("请填写保单号");
				//queryContactStatus.focus();
				return false;
				history.back();
			}
		
		}else if(value== "04"){
			if (registNo == ""){
				alert("请填写报案号");
				//queryContactStatus.focus();
				return false;
				history.back();
			}		
		}else{
		if (appearType == ""){
				alert("请填写出现类型");
				//queryContactStatus.focus();
				return false;
				history.back();
			}	
		if (editRequirement == ""){
				alert("请填写修改要求");
				//queryContactStatus.focus();
				return false;
				history.back();
			}			
		
		
		 
		
		
		if (file1 != ""){					
					
				var atIndex = file1.indexOf ('\\')||file1.indexOf ('\/');								
				if(atIndex==-1){
				alert("附件1路径不正确");
				return false;
				history.back();
				}		
				 
				
			//	var fso = new ActiveXObject('Scripting.FileSystemObject'); 
		    //	var file1 = fso.GetFile(file1); 		    	
		    //	var file1Size =file1.Size;
		    //	var file1SizeM =file1Size/1024/1024;		    	
		    //	if(file1.Size>=<%=maxSize%>){	
		    //	alert("附件1("+file1SizeM+"M)大于等于系统限定的"+<%=maxSizeM%>+"M");	    	
		    //	return false;
			//	history.back();
		    //	}
				
				
				//queryContactStatus.focus();
				
			}
			if (file2 != ""){				
				var atIndex = file2.indexOf ('\\')||file2.indexOf ('\/');								
				if(atIndex==-1){
				alert("附件2路径不正确");
				return false;
				history.back();
				}
				
			//	var fso = new ActiveXObject('Scripting.FileSystemObject'); 
		    //	var file2 = fso.GetFile(file2); 
		    //	var file2Size =file2.Size;
		    //	var file2SizeM =file2Size/1024/1024;		    	
		   // 	if(file2.Size>=<%=maxSize%>){	
		    //	alert("附件2("+file2SizeM+"M)大于等于系统限定的"+<%=maxSizeM%>+"M");	    	
		   // 	return false;
			//	history.back();
		   // 	}
				//queryContactStatus.focus();
				
			}
			if (file3 != ""){				
				var atIndex = file3.indexOf ('\\')||file3.indexOf ('\/');								
				if(atIndex==-1){
				alert("附件3路径不正确");
				return false;
				history.back();
				}
				
			//	var fso = new ActiveXObject('Scripting.FileSystemObject'); 
		    //	var file3 = fso.GetFile(file3); 
		    //	var file3Size =file3.Size;
		    //	var file3SizeM =file3Size/1024/1024;		    	
		    //	if(file3.Size>=<%=maxSize%>){	
		    //	alert("附件3("+file3SizeM+"M)大于等于系统限定的"+<%=maxSizeM%>+"M");	    	
		    //	return false;
			//	history.back();
		    //	}
				//queryContactStatus.focus();
				
			}
			if (file4 != ""){				
				var atIndex = file4.indexOf ('\\')||file4.indexOf ('\/');								
				if(atIndex==-1){
				alert("附件4路径不正确");
				return false;
				history.back();
				}
				
			//	var fso = new ActiveXObject('Scripting.FileSystemObject'); 
		    //	var file4 = fso.GetFile(file4); 
		    //	var file4Size =file4.Size;
		    //	var file4SizeM =file4Size/1024/1024;		    	
		    //	if(file4.Size>=<%=maxSize%>){	
		    //	alert("附件4("+file4SizeM+"M)大于等于系统限定的"+<%=maxSizeM%>+"M");	    	
		   // 	return false;
			//	history.back();
		    //	}
				//queryContactStatus.focus();
				
			}
			if (file5 != ""){				
				var atIndex = file5.indexOf ('\\')||file5.indexOf ('\/');								
				if(atIndex==-1){
				alert("附件5路径不正确");
				return false;
				history.back();
				}
				
			//	var fso = new ActiveXObject('Scripting.FileSystemObject'); 
		    //	var file5 = fso.GetFile(file5); 
		    //	var file5Size =file5.Size;
		    //	var file5SizeM =file5Size/1024/1024;		    	
		    //	if(file5.Size>=<%=maxSize%>){	
		    //	alert("附件5("+file5SizeM+"M)大于等于系统限定的"+<%=maxSizeM%>+"M");	    	
		    //	return false;
			//	history.back();
		   //	}
				//queryContactStatus.focus();
				
			}	
		//if (file1 == ""){
		//		alert("请选择附件1");
		//		//queryContactStatus.focus();
		//		return false;
		//		history.back();
		//	}
		//if (file2 == ""){
		//		alert("请选择附件2");
		//		//queryContactStatus.focus();
		//		return false;
		//		history.back();
		//	}
		if (editRequirement.length > 1000){
			alert("业务描述请不要超过1000字");
			//content.focus();
			return false;
			history.back();
			}	
			
			
		
		}
		
		fm.submit();
	}
</script>

<html:html locale="true">
<head>
	<title>电子联系单新增</title>
	<app:css />
</head>
<body>
<html:errors />
<html:form action="/saveIAContact" method="post" enctype="multipart/form-data">
 <table class="common" border="0" cellspacing="1" cellpadding="5">
    <tbody>
      <tr>
        <td class="title0" colspan="4"><B>电子联系单新增</B></td>
      </tr>
      <tr>
        <td class="title">公司名称：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="companyCode" styleClass="readonly" readonly="true" /></td>
        <td class="title">归属分公司：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="makeCode" styleClass="text" maxlength="120"/></td>
      </tr>
      <tr>
        <td class="title">制单人姓名：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="creator" styleClass="text"  maxlength="30"/>&nbsp;*</td>
        <td class="title">联系电话：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="phoneNumber" styleClass="text" maxlength="30"/>&nbsp;*</td>
      </tr>
      <tr>
        <td class="title">电子邮件：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="email" styleClass="text" maxlength="50"/>&nbsp;*</td>
      	<td class="title">数据处理类型：</td>
        <td class=input>
	       <html:select name= "iaContactForm" property = "queryDealType" styleClass="one" style="width:75%">
							<html:optionsCollection name = "dealTypes" label = "codeCName" value = "codeCode" />
		   </html:select>&nbsp;*
		</td>
      </tr>
      <tr>
        <td class="title">状态：</td>
        <td class=input>
	        <html:select name= "iaContactForm" property = "queryContactStatus" styleClass="one" style="width:75%" disabled="true">
				<html:optionsCollection name = "contactStatus" label = "codeCName" value = "codeCode" />
			</html:select>
        </td>
         <td class="title">问题分类：</td>
        <td class=input>
        	<html:select name= "iaContactForm" property = "questionType" styleClass="one" onchange ="questionchange(this.value);" style="width:75%">
				<html:optionsCollection name = "questionTypes" label = "codeCName" value = "codeCode" />
	   		</html:select>&nbsp;*
        </td>
      </tr>
      
      <tr style="display:none" id="a">       
        <td class="title">投保查询码：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="policyQueryNo" styleClass="text" maxlength="120"/>&nbsp;*</td>
		<td class="title">投保确认码：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="policyConfirmNo" styleClass="text" maxlength="120"/></td>      
      </tr>
      <tr style="display:none" id="b">
        <td class="title">保单号：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="tpolicyNo" styleClass="text" maxlength="120"/>&nbsp;*</td>
        <td class="title"></td>
        <td class=input></td>
      </tr>      
       <tr style="display:none" id="c">
        <td class="title">批改查询码：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="endorseQueryNo" styleClass="text" maxlength="120"/>&nbsp;*</td>
      	<td class="title">批改确认码：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="endorseConfirmNo" styleClass="text" maxlength="120"/></td>
       </tr>      
       <tr style="display:none" id="d">
        <td class="title">退保查询码：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="tendorseQueryNo" styleClass="text" maxlength="120"/>&nbsp;*</td>
      	<td class="title">退保确认码：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="tendorseConfirmNo" styleClass="text" maxlength="120"/></td>
      </tr>   
      <tr style="display:none" id="e">
        <td class="title">保单号：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="ppolicyNo" styleClass="text" maxlength="120"/>&nbsp;*</td>
        <td class="title">批单号：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="endorseNo" styleClass="text" maxlength="120"/></td>
      </tr>   
       <tr style="display:none" id="f">
        <td class="title">报案号：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="registNo" styleClass="text" maxlength="120"/>&nbsp;*</td>
        <td class="title">理赔编码：</td>
        <td class=input><html:text style="width:75%" name = "iaContactForm" property="claimQueryNo" styleClass="text" maxlength="120"/></td>
       </tr>  
       
       
          
      
      <tr>
        <td class="title" align="center">&nbsp;业务描述：&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; (1000字以内)</td>
        <td class=input colspan="3" ><html:textarea style="width:100%" name = "iaContactForm" property="content" styleClass="text" rows="9"/></td>
      </tr>
  </table>
 
   <table class="common" border="0" cellspacing="1" cellpadding="6">
        <tr style="display:none" id="g">
	       <td class="title">数据：</td>	 
	        <td class=input>
		        <html:select name= "iaContactForm" property = "dataType1" styleClass="one"  style="width:75%" disabled="true">
					<html:optionsCollection name = "dataTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>      
	        <td class="title">笔数：</td>
	        <td class=input><html:text style="width:75%" name = "iaContactForm" property="count1" styleClass="text" maxlength="120"/></td>
			<td class="title">类型：</td>        	
        	 <td class=input>
		        <html:select name= "iaContactForm" property = "editType1" styleClass="one" style="width:75%">
					<html:optionsCollection name = "editTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>        	
       </tr>
        <tr style="display:none" id="h">
        	<td class="title">数据：</td>	 
	        <td class=input>
		        <html:select name= "iaContactForm" property = "dataType2" styleClass="one"  style="width:75%" disabled="true">
					<html:optionsCollection name = "dataTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>      
	        <td class="title">笔数：</td>
	        <td class=input><html:text style="width:75%" name = "iaContactForm" property="count2" styleClass="text" maxlength="120"/></td>
			<td class="title">类型：</td>        	
        	 <td class=input>
		        <html:select name= "iaContactForm" property = "editType2" styleClass="one"  style="width:75%">
					<html:optionsCollection name = "editTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>        	
       </tr>
        <tr style="display:none" id="i">
        	<td class="title">数据：</td>	 
	        <td class=input>
		        <html:select name= "iaContactForm" property = "dataType3" styleClass="one"  style="width:75%" disabled="true">
					<html:optionsCollection name = "dataTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>      
	        <td class="title">笔数：</td>
	        <td class=input><html:text style="width:75%" name = "iaContactForm" property="count3" styleClass="text" maxlength="120"/></td>
			<td class="title">类型：</td>        	
        	 <td class=input>
		        <html:select name= "iaContactForm" property = "editType3" styleClass="one"  style="width:75%">
					<html:optionsCollection name = "editTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>        	
       </tr>
        <tr style="display:none" id="j">
        	<td class="title">数据：</td>	 
	        <td class=input>
		        <html:select name= "iaContactForm" property = "dataType4" styleClass="one"  style="width:75%" disabled="true">
					<html:optionsCollection name = "dataTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>      
	        <td class="title">笔数：</td>
	        <td class=input><html:text style="width:75%" name = "iaContactForm" property="count4" styleClass="text" maxlength="120"/></td>
			<td class="title">类型：</td>        	
        	 <td class=input>
		        <html:select name= "iaContactForm" property = "editType4" styleClass="one"  style="width:75%">
					<html:optionsCollection name = "editTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>        	
       </tr>
        <tr style="display:none" id="k">
        	<td class="title">数据：</td>	 
	        <td class=input>
		        <html:select name= "iaContactForm" property = "dataType5" styleClass="one"  style="width:75%" disabled="true">
					<html:optionsCollection name = "dataTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>      
	        <td class="title">笔数：</td>
	        <td class=input><html:text style="width:75%" name = "iaContactForm" property="count5" styleClass="text" maxlength="120"/></td>
			<td class="title">类型：</td>        	
        	 <td class=input>
		        <html:select name= "iaContactForm" property = "editType5" styleClass="one"  style="width:75%">
					<html:optionsCollection name = "editTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>        	
       </tr>
        <tr style="display:none" id="l">
        	<td class="title">数据：</td>	 
	        <td class=input>
		        <html:select name= "iaContactForm" property = "dataType6" styleClass="one"  style="width:75%" disabled="true">
					<html:optionsCollection name = "dataTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>      
	        <td class="title">笔数：</td>
	        <td class=input><html:text style="width:75%" name = "iaContactForm" property="count6" styleClass="text" maxlength="120"/></td>
			<td class="title">类型：</td>        	
        	 <td class=input>
		        <html:select name= "iaContactForm" property = "editType6" styleClass="one" style="width:75%">
					<html:optionsCollection name = "editTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>        	
       </tr>
        <tr style="display:none" id="m">
        	<td class="title">数据：</td>	 
	        <td class=input>
		        <html:select name= "iaContactForm" property = "dataType7" styleClass="one"  style="width:75%" disabled="true">
					<html:optionsCollection name = "dataTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>      
	        <td class="title">笔数：</td>
	        <td class=input><html:text style="width:75%" name = "iaContactForm" property="count7" styleClass="text" maxlength="120"/></td>
			<td class="title">类型：</td>        	
        	 <td class=input>
		        <html:select name= "iaContactForm" property = "editType7" styleClass="one" style="width:75%">
					<html:optionsCollection name = "editTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>        	
       </tr>
        <tr style="display:none" id="n">
        	<td class="title">数据：</td>	 
	        <td class=input>
		        <html:select name= "iaContactForm" property = "dataType8" styleClass="one"  style="width:75%" disabled="true">
					<html:optionsCollection name = "dataTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>      
	        <td class="title">笔数：</td>
	        <td class=input><html:text style="width:75%" name = "iaContactForm" property="count8" styleClass="text" maxlength="120"/></td>
			<td class="title">类型：</td>        	
        	 <td class=input>
		        <html:select name= "iaContactForm" property = "editType8" styleClass="one"  style="width:75%">
					<html:optionsCollection name = "editTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>
	        </td>        	
       </tr>
        <tr style="display:none" id="o">
        	<td class="title"  warp>出现类型：</td>	 
	        <td class=input >
		        <html:select name= "iaContactForm" property = "appearType" styleClass="one"  style="width:75%">
					<html:optionsCollection name = "appearTypes" label = "codeCName" value = "codeCode" />
		   		</html:select>&nbsp;*
	        </td>      
	        <td class="title"></td>
	        <td class=input></td>
			<td class="title"></td>        	
        	<td class=input></td>        	
       </tr>
       <tr style="display:none" id="p">
        	 <td class="title" >修改要求：<br>(1000字以内，必填)</td>
      		 <td class=input colspan="5" ><html:textarea style="width:100%" name = "iaContactForm" property="editRequirement" styleClass="text" rows="9"/></td>
       </tr>
       <tr style="display:none" id="r">       		
	     <td class="title" align="right">附件1：</td>		     
		 <td colspan="5" class="title" align="left"><html:file  property="file1"/>&nbsp;（附件的大小不超过<%=maxSize%>M，下同）</td>	
		</tr>	
		<tr style="display:none" id="s">  
	     <td class="title" align="right">附件2：</td>		     
		 <td colspan="5" class="title" align="left"><html:file  property="file2"/>&nbsp;</td>	
		</tr>
		<tr style="display:none" id="t">  
	     <td class="title" align="right">附件3：</td>		     
		 <td colspan="5" class="title" align="left"><html:file  property="file3"/>&nbsp;</td>	
		</tr>
		<tr style="display:none" id="u">  
	     <td class="title" align="right">附件4：</td>		     
		 <td colspan="5" class="title" align="left"><html:file  property="file4"/>&nbsp;</td>	
		</tr>
		<tr style="display:none" id="v">  
	     <td class="title" align="right">附件5：</td>		     
		 <td colspan="5" class="title" align="left"><html:file  property="file5"/>&nbsp;</td>	
		</tr>			 
		
	
        </table>
        <br>
  <table cellpadding="0" cellspacing="0" width="100%">
    <tr>
      <td class=button align="center">
      		<input id="Submit" type="button" class="button" name="Submit" value=" 保 存 " onClick="check(fm.questionType.value)">&nbsp;
      		<input id="Reset" type=reset class=button name="Reset" value=" 取 消 " >
      </td>
    </tr>
  </table>
  <br>
</html:form>
<script language="javascript">
   var fm = iaContactForm;
</script>
</body>
</html:html>
