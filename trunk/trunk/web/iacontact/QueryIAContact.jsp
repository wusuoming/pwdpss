<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="UTF-8"%>
<%@ page info = "QueryCreatIAContact.jsp -- 电子联系单表，yangfuqiang，2006-09-09。" %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<script language="Javascript" src="/iacontact/common/pub/StaticJavascript.jsp"></script>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script language="Javascript">
function queryCommand1(){
			if (fm.content.value.length > 1200){
				alert("业务描述请不要超过1200字");
				//fm.content.focus();
				return false;				
			}			
		
			if(fm.userGrade.value=="1"){
			   if( fm.queryContactStatus.value=="01"){
			        alert("状态不能为待审核!");
			       // fm.queryContactStatus.focus();
					return false;					
      			}
      			if( fm.queryContactStatus.value==""){
			        alert("状态不能为空!");
			        //fm.queryContactStatus.focus();
					return false;
      			} 
      			if( fm.confirmName.value==""){
			        alert("机构审核人不能为空!");
			        //fm.queryContactStatus.focus();
					return false;
      			}  
      			if( fm.confirmContent.value.length >1000){
			        alert("机构审核意见请不要超过1000字!");
			        //fm.confirmContent.focus();
					return false;
      			}  
      			
      			
			}
				
			if(fm.userGrade.value=="2"){
			    if(fm.queryContactStatus.value=="04"){
			        alert("状态不能为审核通过待处理!");
			        //fm.queryContactStatus.focus();
					return false;
      			 }  
      			 if(fm.queryContactStatus.value==""){
			        alert("状态不能为空!");
			        //fm.queryContactStatus.focus();
					return false;
      			 } 
      			 if( fm.dealConfirmName.value==""){
			        alert("平台审批人不能为空!");
			        //fm.queryContactStatus.focus();
					return false;
      			}    
      			if (fm.dealConfirmContent.value.length > 1000){
					alert("平台审批意见请不要超过1000字");
					//fm.dealConfirmContent.focus();
					return false;
				}
      			 
			}
			if(fm.userGrade.value=="3"){
			    if(fm.queryContactStatus.value=="05"){
			        alert("状态不能为平台审批通过待处理!");
			       // fm.queryContactStatus.focus();
					return false;
      			 }  
      			 if(fm.queryContactStatus.value==""){
			        alert("状态不能为空!");
			        //fm.queryContactStatus.focus();
					return false;
      			 } 
      			 if( fm.dealName.value==""){
			        alert("平台处理人不能为空!");
			        //fm.queryContactStatus.focus();
					return false;
      			}    
      			if (fm.dealContent.value.length > 1000){
					alert("平台处理意见请不要超过1000字");
					//fm.dealContent.focus();
					return false;
				}
      			 
			}			
			
		  fm.queryDealType.disabled = false; 
		  fm.queryContactStatus.disabled = false; 
		  fm.questionType.disabled = false; 
		  if(fm.questionType.value=="05"){
		  fm.editData.disabled = false; 
		  fm.appearType.disabled = false; 
		  fm.editRequirement.disabled = false; 
		  }		 
		  //提交
		var strURL = "/iacontact/updateIAContact.do?action=edit&menuflag=<%= request.getParameter("menuflag") %>";
        fm.action = strURL;
		  fm.submit();
}
function queryCommand0(){
		//提交
	question   =   confirm("确认要返回待审核状态吗?")      
	  if(question   !=   "0")   
	  {   
	  //return   true;   
	  }   
	  else   
	  {   
	  return   false;   
	  }   		
		var strURL = "/iacontact/updateStatus.do?action=view&menuflag=<%= request.getParameter("menuflag") %>";
        fm.action = strURL;
		fm.submit();
}

function unload_word()
{
        //var url=location.href;
       // alert(url);       
        
       // location.href='/iacontact/common/pub/unload_word.jsp?url='+url;
      //  var strURL = "/iacontact/common/pub/unload_word.jsp?url="+url;
      var contactNo =fm.contactNo.value;
      
      //  var strURL = "/iacontact/iacontact/unload_word.jsp?url="+url+"&contactNo="+contactNo;
        var strURL = "/iacontact/downLoadWord.do?contactNo="+contactNo;
        fm.action = strURL;
		fm.submit();
}
</script>
<html:html locale="true">
<head>
	<title>电子联系单信息</title>
	<app:css />
</head>
<body>
<html:errors />
<html:form method="post"action="/updateIAContact" >
  <html:hidden name = "iaContactForm" property="userGrade" />
  
  <table class="common" border="0" cellspacing="1" cellpadding="4">
    <tbody>
      <tr>
        <td class="title0" colspan="4"><B>电子联系单信息</B></td>
      </tr>

      <tr>
        <td class="title">公司名称：</td>
        <td class=input><html:text style="width:100%" name = "iaContactForm" property="companyCode" styleClass="readonly" readonly="true" /></td>
        <td class="title">归属分公司：</td>
        <logic:equal name="iaContactForm" property="userGrade" value="0">
        	<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
       		 	<td class=input><html:text style="width:100%" name = "iaContactForm" property="makeCode" styleClass="text" maxlength="120"/></td>
       		</logic:equal>
       		<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
       		 	<td class=input><html:text style="width:100%" name = "iaContactForm" property="makeCode" styleClass="readonly" readonly="true"/></td>
       		</logic:notEqual>
        </logic:equal>
		<logic:notEqual name="iaContactForm" property="userGrade" value="0">			  		  
       		  	 <td class=input><html:text style="width:100%" name = "iaContactForm" property="makeCode" styleClass="readonly" readonly="true" /></td>       		
        </logic:notEqual>
      </tr>
      <tr>
        <td class="title">制单人姓名：</td>
         <logic:equal name="iaContactForm" property="userGrade" value="0">
         	<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
      	 		 <td class=input><html:text style="width:100%" name = "iaContactForm" property="creator" styleClass="text"  maxlength="30"/></td>
         	</logic:equal>
         	<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
      	 		 <td class=input><html:text style="width:100%" name = "iaContactForm" property="creator" styleClass="readonly" readonly="true"  /></td>
         	</logic:notEqual>
         </logic:equal>
		 <logic:notEqual name="iaContactForm" property="userGrade" value="0">		 	
		 	  <td class=input><html:text style="width:100%" name = "iaContactForm" property="creator" styleClass="readonly" readonly="true" /></td>			
		 </logic:notEqual>
        <td class="title">联系电话：</td>
	         <logic:equal name="iaContactForm" property="userGrade" value="0">
	         	<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
	       		 	 <td class=input><html:text style="width:100%" name = "iaContactForm" property="phoneNumber" styleClass="text"  maxlength="30"/></td>
	    		</logic:equal>
	    		<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
	       		 	 <td class=input><html:text style="width:100%" name = "iaContactForm" property="phoneNumber" styleClass="readonly" readonly="true" /></td>
	    		</logic:notEqual>
	    	 </logic:equal>
			 <logic:notEqual name="iaContactForm" property="userGrade" value="0">			 	
					<td class=input><html:text style="width:100%" name = "iaContactForm" property="phoneNumber" styleClass="readonly" readonly="true" /></td>             	
             </logic:notEqual>
      </tr>
      <tr>
        <td class="title">区域代码：</td>
        <td class=input><html:text style="width:100%" name = "iaContactForm" property="areaCode" styleClass="readonly" readonly="true" /></td>
        <td class="title">联系单编号:</td>
        <td class=input><html:text style="width:100%" name = "iaContactForm" property="contactNo" styleClass="readonly" readonly="true" /></td>
      </tr>
      <tr>
        <td class="title">电子邮件：</td>
	        <logic:equal name="iaContactForm" property="userGrade" value="0">
	        	<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
	        		<td class=input><html:text style="width:100%" name = "iaContactForm" property="email" styleClass="text" maxlength="50"/></td>
	      		</logic:equal>
	      		<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
	        		<td class=input><html:text style="width:100%" name = "iaContactForm" property="email" styleClass="readonly" readonly="true" /></td>
	      		</logic:notEqual>
	      	</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="0">				
					<td class=input><html:text style="width:100%" name = "iaContactForm" property="email" styleClass="readonly" readonly="true" /></td>				
			</logic:notEqual>
      	<td class="title">数据处理类型：</td>
      	 <logic:equal name="iaContactForm" property="userGrade" value="0">
      	 	<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
		         <td class=input>
			         <html:select name= "iaContactForm" property = "queryDealType" styleClass="one" style="width:100%"  >
						<html:optionsCollection name = "dealTypes" label = "codeCName" value = "codeCode" />
					 </html:select>
				 </td>
			 </logic:equal>
			 <logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
		         <td class=input>
			         <html:select name= "iaContactForm" property = "queryDealType" styleClass="one" style="width:100%"  disabled="true">
						<html:optionsCollection name = "dealTypes" label = "codeCName" value = "codeCode" />
					 </html:select>
				 </td>
			 </logic:notEqual>
		 </logic:equal>
		 <logic:notEqual name="iaContactForm" property="userGrade" value="0">		 	
			   	 <td class=input>
		         <html:select name= "iaContactForm" property = "queryDealType" styleClass="one" style="width:100%" disabled="true" >
					<html:optionsCollection name = "dealTypes" label = "codeCName" value = "codeCode" />
				 </html:select>
				 </td>			 
		</logic:notEqual>
      </tr>
      <tr>
        <td class="title">状态：</td>
			<logic:equal name="iaContactForm" property="userGrade" value="0">
				<td class=input>
					<html:select name= "iaContactForm" property = "queryContactStatus" styleClass="one" style="width:100%" disabled="true">
						<html:optionsCollection name = "contactStatus" label = "codeCName" value = "codeCode" />
					</html:select>
				</td>
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="0">
				 <logic:equal name="iaContactForm" property="userGrade" value="1">
				 	 	 <logic:equal name="iaContactForm" property="queryContactStatus" value="01">
							<td class=input>
								<html:select name= "iaContactForm" property = "queryContactStatus" styleClass="one" style="width:100%"  >
									<html:optionsCollection name = "contactStatusPop" label = "codeCName" value = "codeCode" />
								</html:select>
							</td>
						  </logic:equal>	
						  <logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">							  		
							  		<td class=input>
										<html:select name= "iaContactForm" property = "queryContactStatus" styleClass="one" style="width:100%" disabled="true" >
											<html:optionsCollection name = "contactStatusPop2" label = "codeCName" value = "codeCode" />
										</html:select>
								    </td>							  	
						  </logic:notEqual>
				 </logic:equal>					
				 <logic:notEqual name="iaContactForm" property="userGrade" value="1">
				 	<logic:equal name="iaContactForm" property="userGrade" value="2">
				 			<logic:equal name="iaContactForm" property="queryContactStatus" value="04">
								  		<td class=input>
											<html:select name= "iaContactForm" property = "queryContactStatus" styleClass="one" style="width:100%"  >
												<html:optionsCollection name = "contactStatusPop" label = "codeCName" value = "codeCode" />
											</html:select>
									    </td>
						    </logic:equal>	
						    <logic:notEqual name="iaContactForm" property="queryContactStatus" value="04">
								  		<td class=input>
											<html:select name= "iaContactForm" property = "queryContactStatus" styleClass="one" style="width:100%" disabled="true">
												<html:optionsCollection name = "contactStatusPop2" label = "codeCName" value = "codeCode" />
											</html:select>
									    </td>
						    </logic:notEqual>	
				    </logic:equal>
				    <logic:notEqual name="iaContactForm" property="userGrade" value="2">
				    	<logic:equal name="iaContactForm" property="userGrade" value="3">
				    		<logic:equal name="iaContactForm" property="queryContactStatus" value="05">
								  		<td class=input>
											<html:select name= "iaContactForm" property = "queryContactStatus" styleClass="one" style="width:100%"  >
												<html:optionsCollection name = "contactStatusPop" label = "codeCName" value = "codeCode" />
											</html:select>
									    </td>
						    </logic:equal>	
						    <logic:notEqual name="iaContactForm" property="queryContactStatus" value="05">
								  		<td class=input>
											<html:select name= "iaContactForm" property = "queryContactStatus" styleClass="one" style="width:100%" disabled="true">
												<html:optionsCollection name = "contactStatusPop2" label = "codeCName" value = "codeCode" />
											</html:select>
									    </td>
						    </logic:notEqual>	
				    	</logic:equal>
				    	<logic:notEqual name="iaContactForm" property="userGrade" value="3">				    	
				    	</logic:notEqual>
				    </logic:notEqual>
				 </logic:notEqual>
			</logic:notEqual>
         <td class="title">申请时间：</td>
        <td class=input><html:text style="width:100%" name = "iaContactForm" property="applyDate" styleClass="readonly" readonly="true" /></td>
       </tr>
       <tr>
        <td class="title">问题分类：</td>
        <td class=input>
        	<html:select name= "iaContactForm" property = "questionType" styleClass="one" style="width:100%" disabled="true" >
				<html:optionsCollection name = "questionTypes" label = "codeCName" value = "codeCode" />
			</html:select>
        </td>
        <td class="title"></td>
        <td class=input></td>
      </tr>
      
      <logic:equal name="iaContactForm" property="questionType" value="05">
       <tr>
        	<td class="title">需要修改数据：<br>(1200字以内)</td> 	  
        	<logic:equal name="iaContactForm" property="userGrade" value="0">
	         	<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
	       		 	 <td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="editData" styleClass="text"  rows="9"/> </td>  
	    		</logic:equal>
	    		<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
	       		 	 <td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="editData" styleClass="readonly" readonly="true" rows="9" /></td>
	    		</logic:notEqual>
	    	 </logic:equal>
			 <logic:notEqual name="iaContactForm" property="userGrade" value="0">			 	
					<td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="editData" styleClass="readonly" readonly="true" rows="9" /></td>             	
             </logic:notEqual>    	    
		      	    
       </tr>
       <tr>
       		<td class="title">问题出现分类：</td>
       		<logic:equal name="iaContactForm" property="userGrade" value="0">
      	 	<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
		         <td class=input>
			        <html:select name= "iaContactForm" property = "appearType" styleClass="one" style="width:100%"  >
						<html:optionsCollection name = "appearTypes" label = "codeCName" value = "codeCode" />
					</html:select>
				 </td>
			 </logic:equal>
			 <logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
		         <td class=input>
			         <html:select name= "iaContactForm" property = "appearType" styleClass="one" style="width:100%"  disabled="true">
						<html:optionsCollection name = "appearTypes" label = "codeCName" value = "codeCode" />
					 </html:select>
				 </td>
			 </logic:notEqual>
		 </logic:equal>
		 <logic:notEqual name="iaContactForm" property="userGrade" value="0">		 	
			   	 <td class=input>
		         <html:select name= "iaContactForm" property = "appearType" styleClass="one" style="width:100%" disabled="true" >
					<html:optionsCollection name = "appearTypes" label = "codeCName" value = "codeCode" />
				 </html:select>
				 </td>			 
		</logic:notEqual>
 
       	 	<td class="title" align="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       	 		<a href="/iacontact/queryIADFileList.do?menuflag=view&firstquery=1&contactNo=<bean:write name="iaContactForm" property="contactNo"/>&upcompanyCode=<bean:write name="iaContactForm" property="companyCode"/>" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                   附件查看
	            </a>	            
	        </td>
        	<td class=input>（包含保险公司和保险协会提交的所有附件）</td>
       </tr>
       <tr>
        	<td class="title">数据修改要求：<br>(1200字以内)</td>     
        	<logic:equal name="iaContactForm" property="userGrade" value="0">
	         	<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
	       		 	  <td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="editRequirement" styleClass="text"  rows="9"/> </td>  
	    		</logic:equal>
	    		<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
	       		 	 <td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="editRequirement" styleClass="readonly" readonly="true" rows="9" /></td>
	    		</logic:notEqual>
	    	 </logic:equal>
			 <logic:notEqual name="iaContactForm" property="userGrade" value="0">			 	
					<td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="editRequirement" styleClass="readonly" readonly="true" rows="9" /></td>             	
             </logic:notEqual>	        
	              
       </tr>
     </logic:equal>
       
       <tr>
        <td class="title">&nbsp;业务描述：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   (1200字以内)</td>
        <logic:equal name="iaContactForm" property="userGrade" value="0">
        	<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
		        <td class=input colspan="3">
		        <html:textarea style="width:100%" name = "iaContactForm" property="content" styleClass="text" rows="9"/>
		        </td>
	        </logic:equal>
	        <logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
		        <td class=input colspan="3" >
		        <html:textarea  style="width:100%" name = "iaContactForm" property="content" styleClass="readonly" readonly="true" rows="9" cols="45"/>
		        </td>
	        </logic:notEqual>
        </logic:equal>
	    <logic:notEqual name="iaContactForm" property="userGrade" value="0">	    	
		        <td class=input colspan="3">
		        <html:textarea style="width:100%" name = "iaContactForm" property="content" styleClass="readonly" readonly="true" rows="9"/>
		        </td>	        
        </logic:notEqual>   
       </tr>
       <tr> 
        <td class="title">机构审核人：</td>
 			<logic:equal name="iaContactForm" property="userGrade" value="1">
 				<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
					<td class=input>
						<html:text name = "iaContactForm" property="confirmName" styleClass="text" maxlength="30"/>&nbsp;*
					</td>
				</logic:equal>
				<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
					<td class=input>
						<html:text name = "iaContactForm" property="confirmName" styleClass="readonly" readonly="true" />
					</td>
				</logic:notEqual> 
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="1">								
					<td class=input>
						<html:text name = "iaContactForm" property="confirmName" styleClass="readonly" readonly="true" />
					</td>						
			</logic:notEqual>       
       
			<logic:equal name="iaContactForm" property="userGrade" value="1">
				<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
					<td class="title">&nbsp;</td>
			 	    <td class=input></td>
				</logic:equal>
				<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
					
						<td class="title">机构审核时间：</td>
						<td class=input><html:text style="width:100%" name = "iaContactForm" property="confirmDate" styleClass="readonly" readonly="true"  /></td>
										
				</logic:notEqual>
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="1">
				<td class="title">机构审核时间：</td>
				<td class=input>
					<html:text style="width:100%" name = "iaContactForm" property="confirmDate" styleClass="readonly" readonly="true"  />
				</td>
			</logic:notEqual>
	  </tr>
      <tr>
        <td class="title">机构审核意见：&nbsp; &nbsp;&nbsp;  (1000字以内)</td>
			<logic:equal name="iaContactForm" property="userGrade" value="0">
				 <td class=input colspan="3">
						<html:textarea style="width:100%" name = "iaContactForm" property="confirmContent" styleClass="readonly" readonly="true" rows="9"/>
				</td>
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="0">
				  <logic:equal name="iaContactForm" property="userGrade" value="1">
				  		<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
							<td class=input colspan="3">
									<html:textarea style="width:100%" name = "iaContactForm" property="confirmContent" styleClass="text" rows="9"/>
							</td>
						</logic:equal>
						<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
								
									<td class=input colspan="3">
											<html:textarea style="width:100%" name = "iaContactForm" property="confirmContent" styleClass="readonly" readonly="true" rows="9"/>
									</td>
								
						</logic:notEqual>
				  </logic:equal>
				  <logic:notEqual name="iaContactForm" property="userGrade" value="1">
					<td class=input colspan="3">
							<html:textarea style="width:100%" name = "iaContactForm" property="confirmContent" styleClass="readonly" readonly="true" rows="9"/>
					</td>
				  </logic:notEqual>
			</logic:notEqual>	
      </tr>
       <tr> 
        <td class="title">平台审批人：</td>
 			<logic:equal name="iaContactForm" property="userGrade" value="2">
				<logic:equal name="iaContactForm" property="queryContactStatus" value="04">	
					<td class=input>
						<html:text name = "iaContactForm" property="dealConfirmName" styleClass="text" maxlength="30"/>&nbsp;*
					</td>
				</logic:equal> 
				<logic:notEqual name="iaContactForm" property="queryContactStatus" value="04">
					<td class=input>
						<html:text name = "iaContactForm" property="dealConfirmName" styleClass="readonly" readonly="true" />
					</td>
				</logic:notEqual> 
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="2">				
					<td class=input>
						<html:text name = "iaContactForm" property="dealConfirmName" styleClass="readonly" readonly="true" />
					</td>					
			</logic:notEqual>       
       
			<logic:equal name="iaContactForm" property="userGrade" value="2">
				<logic:equal name="iaContactForm" property="queryContactStatus" value="04">
					<td class="title">&nbsp;</td>
			 	    <td class=input></td>
				</logic:equal>
				<logic:notEqual name="iaContactForm" property="queryContactStatus" value="04">					
						<td class="title">平台审批时间：</td>
						<td class=input><html:text style="width:100%" name = "iaContactForm" property="dealConfirmDate" styleClass="readonly" readonly="true"  /></td>										
				</logic:notEqual>
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="2">
				<td class="title">平台审批时间：</td>
				<td class=input><html:text style="width:100%" name = "iaContactForm" property="dealConfirmDate" styleClass="readonly" readonly="true"  /></td>
			</logic:notEqual>
	  </tr>
      <tr>
        <td class="title">平台审批意见：&nbsp; &nbsp;&nbsp;  (1000字以内)</td>
			<logic:equal name="iaContactForm" property="userGrade" value="2">
				<logic:equal name="iaContactForm" property="queryContactStatus" value="04">
			   		<td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="dealConfirmContent" styleClass="text" rows="9"/></td>
				</logic:equal>
				<logic:notEqual name="iaContactForm" property="queryContactStatus" value="04">
					<td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="dealConfirmContent" styleClass="readonly" readonly="true" rows="9"/></td>
				</logic:notEqual>
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="2">				 
					<td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="dealConfirmContent" styleClass="readonly" readonly="true" rows="9"/></td>						
			</logic:notEqual>	
      </tr>
      
      
      <tr>   
       <td class="title">处理人：</td>
       
            <logic:equal name="iaContactForm" property="userGrade" value="3">
				<logic:equal name="iaContactForm" property="queryContactStatus" value="05">			       
				    <td class=input><html:text name = "iaContactForm" property="dealName" styleClass="text" maxlength="30" />&nbsp;*</td>
				</logic:equal>
				<logic:notEqual name="iaContactForm" property="queryContactStatus" value="05">			      
				    <td class=input><html:text name = "iaContactForm" property="dealName" styleClass="readonly" readonly="true" /></td>
				</logic:notEqual>
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="3">		       
				<td class=input><html:text name = "iaContactForm" property="dealName" styleClass="readonly" readonly="true" /></td>
			</logic:notEqual>
  		 
  		 
			<logic:equal name="iaContactForm" property="userGrade" value="3">
				<logic:equal name="iaContactForm" property="queryContactStatus" value="05">
					<td class="title">&nbsp;</td>
			 	    <td class=input></td>
				</logic:equal>
				<logic:notEqual name="iaContactForm" property="queryContactStatus" value="05">
			      	<td class="title">处理时间：</td>
				  	<td class=input><html:text style="width:100%" name = "iaContactForm" property="dealDate" styleClass="readonly" readonly="true" /></td>
				</logic:notEqual>
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="3">
		      	    <td class="title">处理时间：</td>
					<td class=input><html:text style="width:100%" name = "iaContactForm" property="dealDate" styleClass="readonly" readonly="true"  /></td>
			</logic:notEqual>
      </tr>
      <tr>
         <td class="title">&nbsp;处理意见：&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;  (1000字以内)</td>
        
        <logic:equal name="iaContactForm" property="userGrade" value="3">
				<logic:equal name="iaContactForm" property="queryContactStatus" value="05">			       
				    <td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="dealContent" styleClass="text" rows="9"/></td>
				</logic:equal>
				<logic:notEqual name="iaContactForm" property="queryContactStatus" value="05">			      
				   <td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="dealContent" styleClass="readonly" readonly="true" rows="9"/></td>
				</logic:notEqual>
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="3">		       
				<td class=input colspan="3"><html:textarea style="width:100%" name = "iaContactForm" property="dealContent" styleClass="readonly" readonly="true" rows="9"/></td>
			</logic:notEqual>
        </tr>
  </table>
  <br>
  <table cellpadding="0" cellspacing="0" width="100%">
    <tr>
			<logic:equal name="iaContactForm" property="userGrade" value="0">
				<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
					<td class=button align="center">   
						<input id="Submit"type="button" class=button name="Submit" value=" 保存 "onClick="queryCommand1();">&nbsp;  		
						<input type=button class=button name=button2 value=" 返 回 " onClick="history.go(-1);;">
					</td>
				</logic:equal>
				<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">
					<td class=button align="center">   						
						<input type=button class=button name=button2 value=" 返 回 " onClick="history.go(-1);;">
					</td>
				</logic:notEqual>
			</logic:equal>
			<logic:notEqual name="iaContactForm" property="userGrade" value="0">
				<logic:equal name="iaContactForm" property="userGrade" value="1">
					<logic:equal name="iaContactForm" property="queryContactStatus" value="01">
						<td class=button align="center">
							<input id="Submit"type="button" class=button name="Submit" value=" 保存 "onClick="queryCommand1();">&nbsp;
							<input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);;">
						</td>
					</logic:equal>
					<logic:notEqual name="iaContactForm" property="queryContactStatus" value="01">	
						<logic:equal name="iaContactForm" property="queryContactStatus" value="02">											
							<td class=button align="center">
								<input id="Submit"type="button" class=button name="Submit" value=" 误操作返回 " onClick="queryCommand0();">&nbsp;
								<input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);;">
							</td>	
						</logic:equal>	
						<logic:notEqual name="iaContactForm" property="queryContactStatus" value="02">
							<logic:equal name="iaContactForm" property="queryContactStatus" value="03">
								<td class=button align="center">
									<input id="Submit"type="button" class=button name="Submit" value=" 误操作返回 " onClick="queryCommand0();">&nbsp;
									<input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);;">
								</td>
							</logic:equal>
							<logic:notEqual name="iaContactForm" property="queryContactStatus" value="03">
								<logic:equal name="iaContactForm" property="queryContactStatus" value="04">
									<td class=button align="center">
									<input id="Submit"type="button" class=button name="Submit" value=" 误操作返回 " onClick="queryCommand0();">&nbsp;
									<input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);;">
									</td>
								</logic:equal>
								<logic:notEqual name="iaContactForm" property="queryContactStatus" value="04">
									<td class=button align="center">									
										<input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);;">
									</td>
								</logic:notEqual>
							</logic:notEqual>
						</logic:notEqual>				
					</logic:notEqual>
			 </logic:equal>
			 <logic:notEqual name="iaContactForm" property="userGrade" value="1">
					<logic:equal name="iaContactForm" property="userGrade" value="2">
						<logic:equal name="iaContactForm" property="queryContactStatus" value="04">
							<td class=button align="center">
								<input id="Submit"type="button" class=button name="Submit" value=" 保存 "onClick="queryCommand1();">&nbsp;
								<input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);;">
							</td>
					    </logic:equal>
					    <logic:notEqual name="iaContactForm" property="queryContactStatus" value="04">						    	
									<td class=button align="center">
									<input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);;">
									</td>								
						</logic:notEqual>
					</logic:equal>
					<logic:notEqual name="iaContactForm" property="userGrade" value="2">
						<logic:equal name="iaContactForm" property="userGrade" value="3">
							<logic:equal name="iaContactForm" property="queryContactStatus" value="05">
								<td class=button align="center">
									<logic:equal name="iaContactForm" property="questionType" value="05">	
										<input type=button class=button name=exportToWordBtn value="导出Word" onClick="unload_word();">										
									</logic:equal>
										<input id="Submit"type="button" class=button name="Submit" value=" 保存 "onClick="queryCommand1();">&nbsp;
										<input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);;">
								</td>
							</logic:equal>
							<logic:notEqual name="iaContactForm" property="queryContactStatus" value="05">	
								<td class=button align="center">
									<input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);;">
								</td>
							</logic:notEqual>
						</logic:equal>
						<logic:notEqual name="iaContactForm" property="userGrade" value="3">
								<td class=button align="center">
									<input type=button class=button name=button2 value=" 返回 " onClick="history.go(-1);;">
								</td>
						</logic:notEqual>					
					</logic:notEqual>				
			    </logic:notEqual>
			  </logic:notEqual>			
    </tr>
  </table>
  <br>
</html:form>
</body>
</html:html>
<script language="javascript">
   var fm = iaContactForm;  
</script>
