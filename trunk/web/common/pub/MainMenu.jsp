<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="com.elongway.pss.ui.control.common.pub.SysUser"%>
<%@page import="com.elongway.pss.bl.facade.BLLwAmmeterBookFacade"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.elongway.pss.dto.domain.LwAmmeterBookDto"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<html>
	<head>
		<meta http-equiv=Content-Type content="text/html; charset=gb2312">
		<link rel='stylesheet' type='text/css'
			href='/iacontact/css/Standard.css'>
		<script languge=JavaScript>
      function showMenu(divID){
        if (divID.style.display == "")
          divID.style.display="none";
        else
          divID.style.display="";
      }
      
      function loadForm(){
		document.styleSheets[0].href="/iacontact/css/Standard.css";
      }
      
      function clickme(){
        parent.fraRight.cols="*,0";
      }
      
      function relogon()
      {
       parent.fraMain.rows= "0,*";
       parent.fraSet.cols = "0%,0%,*";
      }
    </script>
		<style type="text/css">
 
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #ebf7ff;
}
-->
</style>
		<style>
    BODY {
	BORDER-TOP-WIDTH: 0px;
    BORDER-LEFT-WIDTH: 0px; 
    BORDER-BOTTOM-WIDTH: 0px;
    BORDER-RIGHT-WIDTH: 0px;
    SCROLLBAR-FACE-COLOR:#ffffff;
    SCROLLBAR-HIGHLIGHT-COLOR:#2591FF;
    SCROLLBAR-SHADOW-COLOR:#2591FF;
    SCROLLBAR-3DLIGHT-COLOR:#E7F3FF;
    SCROLLBAR-ARROW-COLOR:#ffffff;
    SCROLLBAR-TRACK-COLOR:#E7F3FF;
    SCROLLBAR-DARKSHADOW-COLOR:#E7F3FF;
}
</style>
	</head>

	<body onload="loadForm()">
		<!--查询统计-->

		<table border=0 cellpadding="0" cellspacing="0" class=menu>
			<tr>
				<td class=titleLink onclick="showMenu(T_dianfeiluru)">
			<img src="../../images/cbzz.gif" border="0"> 
			
				</td>
			</tr>
		</table>
		<div id=T_dianfeiluru style="" class=menu>
			<table class=menu>
				<tr>
					<td>


						<!--线路管理-->
						<table class=menu>
						<tr>
								 <td class=titleLink onclick="showMenu(T_zhigongxiang)">
								 &nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_3.gif" border="0" align="absmiddle" > 直供乡表本
	                 		
	                	</td>	                	
						</tr>
						</table>
						<div id=T_zhigongxiang style="display:none" class=menu>
							<table class=menu>
					
					    
									<%BLLwAmmeterBookFacade blLwAmmeterBookFacade = new BLLwAmmeterBookFacade(); 
									Collection collection = blLwAmmeterBookFacade.findByConditions("");
									for(Iterator it = collection.iterator();it.hasNext();){
									 LwAmmeterBookDto o = (LwAmmeterBookDto)it.next();
									 String bookNo = o.getBookNo();
									%>
								    <tr>										
										 <td class=titleLink>
	            				     		<a href="<%=request.getContextPath() %>/bookInput.do?bookNo=<%=bookNo%>"  target="fraInterface" >
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > <font color="F9FAFB"><%=o.getBookName() %></font>
	             					    		</a>
	             					     </td>												
								    </tr>
								    <%} %>
						
							</table>
						</div>
												<table class=menu>
							
							<tr>
								<td class=titleLink>
									<app:menu
										page="/pointerInputBefore.do"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 大工业
	                 		</app:menu>
								</td>
							</tr>
							
						</table>
						<table class=menu>
							<tr>
								<td class=titleLink onclick="showMenu(T_dunshouluru)">
							&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售
								</td>
							</tr>
							</table>
						<div id=T_dunshouluru style="display:none" class=menu>
									<table class=menu>
										<tr>										
												 <td class=titleLink>
												 	<table class=menu>
												 <tr>										
												 <td class=titleLink>
	            				     		<app:menu page="/inputLWWholeSalePointer.do?flag=gy" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 固阳
	             					    		</app:menu>
	             							   	</td>
	             							   	</tr>
	             							   	</table>
	             							   	<table class=menu>
	             							   	<tr>
	             							   	 <td class=titleLink>
	            				     		<app:menu page="/inputLWWholeSalePointer.do?flag=dm" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 达茂
	             					    		</app:menu>
	             							   	</td>
												
										</tr>	
											<tr>
	             							   	 <td class=titleLink>
	            				     		<app:menu page="/inputLWWholeSalePointer.do?flag=ty" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 土右
	             					    		</app:menu>
	             							   	</td>
												
										</tr>	
										<tr>
	             							   	 <td class=titleLink>
	            				     		<app:menu page="/inputLWWholeSalePointer.do?flag=jy" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 九原
	             					    		</app:menu>
	             							   	</td>												
										</tr>
												</table>	
								  </table>
						</div>
					
						<!--  <table class=menu>
							
						</table>
						-->
					</td>
				</tr>
			</table>
		</div>
		<table border=0 cellpadding="0" cellspacing="0" class=menu>
			<tr>
				<td class=titleLink onclick="showMenu(T_hesuan)">
					<img src="../../images/hsdf.gif" border="0">
				</td>
			</tr>
		</table>
		<div id=T_hesuan style="" class=menu>
			<table class=menu>
				<tr>
					<td>
					

						<!--线路管理-->
					 	<table class=menu>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
						<table class=menu>
						<tr>
								 <td class=titleLink onclick="showMenu(T_hesuan1)" >
								 &nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_3.gif" border="0" align="absmiddle" > 直供乡表本
	                 		
	                	</td>	                	
						</tr>
						</table>
						<div id=T_hesuan1 style="display:none" class=menu  >
							<table class=menu>
								
					    
									<%BLLwAmmeterBookFacade blLwAmmeterBookFacade1 = new BLLwAmmeterBookFacade(); 
									Collection collection1 = blLwAmmeterBookFacade1.findByConditions("");
									for(Iterator it = collection1.iterator();it.hasNext();){
									 LwAmmeterBookDto o = (LwAmmeterBookDto)it.next();
									 String bookNo = o.getBookNo();
									%>
								    <tr>										
										 <td class=titleLink>
	            				     		<a href="<%=request.getContextPath() %>/townInput.do?bookNo=<%=bookNo%>"  target="fraInterface" >
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > <font color="F9FAFB"><%=o.getBookName() %></font>
	             					    		</a>
	             					     </td>												
								    </tr>
								    <%} %>
						
					</table>
						</div>	
								
								
								<table>
								<tr>
								<td class=titleLink>
									<app:menu page="/corporationInputBefore.do"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 大工业电费核算
	                 		</app:menu>
								</td>
							</tr>
					
							</table>
							<table>
							<tr>
								<td class=titleLink onclick="showMenu(T_jigou)">
							&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售核算
	                 	
								</td>
							</tr>
							</table>

						<div id=T_jigou style="display:none" class=menu>
									<table class=menu>
										<tr>										
												 <td class=titleLink>
	            				     		<app:menu page="/UIPathWholeSaleCalBefore.do?comcode=gy" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 固阳
	             					    		</app:menu>
	             							   	</td>
												
										</tr>	
											<tr>
	             							   	 <td class=titleLink>
	            				     		<app:menu page="/UIPathWholeSaleCalBefore.do?comcode=dm" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 达茂
	             					    		</app:menu>
	             							   	</td>
												
										</tr>	
											<tr>
	             							   	 <td class=titleLink>
	            				     		<app:menu page="/UIPathWholeSaleCalBefore.do?comcode=ty" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 土右
	             					    		</app:menu>
	             							   	</td>
												
										</tr>	
										<tr>
	             							   	 <td class=titleLink>
	            				     		<app:menu page="/UIPathWholeSaleCalBefore.do?comcode=jy" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 九原
	             					    		</app:menu>
	             							   	</td>
												
										</tr>	
										
										
										
								  </table>
						</div>

					
					</td>
				</tr>
			</table>
		</div>
		    	
		<table border=0 cellpadding="0" cellspacing="0" class=menu>
			<tr>
				<td class=titleLink onclick="showMenu(T_chaxutongji)">
					<img src="../../images/chaxuntongji.gif" border="0">
				</td>
			</tr>
		</table>
		<div id=T_chaxutongji style="" class=menu>
			<table class=menu>
				<tr>
					<td>
						<!--线路管理-->
						<table class=menu>
								<tr>
								<td class=titleLink>
									<app:menu page="/count/allCount.jsp"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 大用户趸售当月累计
	                 		</app:menu>
								</td>
							</tr>
						<table class=menu>
								<tr>
								<td class=titleLink>
									<app:menu page="/count/thismonthallcount.jsp"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 电量电费当月发行单
	                 		</app:menu>
								</td>
							</tr>
							
							
							<tr>
								<td class=titleLink>
									<app:menu page="/feeSerch/wholeSale/wholeSaleBookBefore.jsp"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售表本
	                 		</app:menu>
								</td>
							</tr>
							
							<tr>
								<td class=titleLink>
									<app:menu page="/count/corporationSaleCountInput.jsp"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 大工业统计
	                 		</app:menu>
								</td>
							</tr>
							<tr>
								<td class=titleLink>
									<app:menu page="/count/wholeSaleCountInput.jsp" rgrade="1"
										wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售统计
	                 		</app:menu>
								</td>
							</tr>
					
					 	<tr>
								 <td class=titleLink>
	                 		<app:menu page="/townBill.do?" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 直供乡电费按乡结算
	                 		</app:menu>
	                	</td>
								</tr>
								<tr>
								 <td class=titleLink>
	                 		<app:menu page="/queryTownStat.do?firstquery=1" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 直供乡统计
	                 		</app:menu>
	                	</td>
								</tr>
							
						<!--		<tr>
								 <td class=titleLink>
	                 		<app:menu page="/townFeeStat.do?method=forwordTownStat&menuflag=view&firstquery=1&UserCode=&CompanyCode=" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 直供乡按乡查询
	                 		</app:menu>
	                	</td>
								</tr> -->	
								
							<tr>
								<td class=titleLink>
									<app:menu page="/feeSerch/corporation/corporationSerch.jsp"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 大工业查询
	                 		</app:menu>
								</td>
							</tr>
							<tr>
								<td class=titleLink>
									<app:menu page="/feeSerch/wholeSale/wholeSaleSerch.jsp"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售查询
	                 		</app:menu>
								</td>
							</tr>
						
					
							<%--<tr>
								<td class=titleLink>
									<app:menu
										page="/count/wholeSaleCountInput.jsp"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售电压统计
	                 		</app:menu>
								</td>
							</tr>
						--%>
						</table>
					</td>
				</tr>
			</table>
		</div>
		<table border=0 cellpadding="0" cellspacing="0" class=menu>

			<tr>
				<td class=titleLink onclick="showMenu(T_richang)">
					<img src="../../images/rccl.gif" border="0">
				</td>
			</tr>
		</table>
		<div id=T_richang style="display" class=menu>
			<table class=menu>
				<tr>
					<td>

						<!--新增表单信息-->
						<table class=menu>
							<tr>
								<td class=titleLink>
									<app:menu
										page="/change/QueryLWChangeAmmeter.jsp"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 换表
	                 		</app:menu>
								</td>
							</tr>						
						</table>

					


						
					</td>
				</tr>
			</table>
		</div>

		<table border=0 cellpadding="0" cellspacing="0" class=menu>

			<tr>
				<td class=titleLink onclick="showMenu(T_jichu)">
					<img src="../../images/jichuxinxiweihu.gif" border="0">
				</td>
			</tr>
		</table>
		<div id=T_jichu style="display" class=menu>
			<table class=menu>
				<tr>
					<td>

						<!--新增表单信息-->
						<table class=menu>
							
						<tr>
								<td class=titleLink>
									<app:menu page="/queryLWPowerUser.do?firstquery=1" rgrade="1" wgrade="1"
										xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 直供乡用户
	                 		</app:menu>
								</td>
							</tr>
							<tr>
								<td class=titleLink>
									<app:menu page="/viewcorporationUserList.do" rgrade="1" wgrade="1" xgrade="1"
										target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 大工业用户
	                 		</app:menu>
								</td>
							</tr>
							<tr>
								<td class=titleLink>
									<app:menu page="/viewLWWholeSaleUserList.do" rgrade="1" wgrade="1" xgrade="1"
										target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售用户
	                 		</app:menu>
								</td>
							</tr>
							<tr>
								<td class=titleLink>
									<app:menu page="/viewTransfor.do" rgrade="1" wgrade="1" xgrade="1"
										target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 变损管理
	                 		</app:menu>
								</td>
							</tr>
							<tr>
								<td class=titleLink>
									<app:menu page="/viewLineLoss.do" rgrade="1" wgrade="1"
										xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 线损管理
	                 		</app:menu>
								</td>
							</tr>
							
						<!-- 	<tr>
								<td class=titleLink>
									<app:menu
										page="/queryAmmeter.do?method=queryAmmeter&menuflag=view&firstquery=1&UserCode=&CompanyCode="
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 电表信息
	                 		</app:menu>
								</td>
							</tr> -->
							<tr>
								<td class=titleLink>
									<app:menu
										page="/queryLWAmmeterBook.do?action=query"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 表本管理
	                 		</app:menu>
								</td>
							</tr>
							
						<tr>
								<td class=titleLink>
									<app:menu
										page="/salePriceQuery.do?method=salePriceQuery&menuflag=view&firstquery=1&UserCode=&CompanyCode="
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 销售电价
	                 		</app:menu>
								</td>
							</tr>
							<!-- <tr>
								<td class=titleLink>
									<app:menu
										page="/salePriceQuery.do?method=wholeSalePriceQuery&menuflag=view&firstquery=1&UserCode=&CompanyCode="
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售电价
	                 		</app:menu>
								</td>
							</tr> -->
							
							
									<tr>
								<td class=titleLink>
									<app:menu
										page="/showsijin.do" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 四金电价
	                 		</app:menu>
								</td>
							</tr>
								<tr>
								<td class=titleLink>
									<app:menu
										page="/showwholesalePuer.do?"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售电价
	                 		</app:menu>
								</td>
							</tr>
							<tr>
								<td class=titleLink>
									<app:menu
										page="/querySaleProrate.do?"
										rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售比例分摊
	                 		</app:menu>
								</td>
							</tr>
					

						</table>


						
					</td>
				</tr>
			</table>
		</div>
		<table border=0 cellpadding="0" cellspacing="0" class=menu>

			<tr>
				<td class=titleLink onclick="showMenu(T_jcsz)">
					<img src="../../images/quanxianguanli.gif" border="0">
				</td>
			</tr>
		</table>
		<div id=T_jcsz style="display" class=menu>
			<table class=menu>
				<tr>
					<td>

						<!--新增表单信息-->
						<table class=menu>
							<tr>
								<td class=titleLink>
									<app:menu page="/UIviewsysUserAction.do" rgrade="1" wgrade="1"
										xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 人员管理
	                 		</app:menu>
								</td>
							</tr>

						</table>						
					</td>
				</tr>
			</table>
		</div>
		<table border=0 cellpadding="0" cellspacing="0" class=menu>
			<tr>
				<td class=titleLink onclick="showMenu(T_xitongshuju)">
					<img src="../../images/ysjcsh.gif" border="0">
				</td>
			</tr>
		</table>
	<div id=T_xitongshuju style="display" class=menu>
			<table class=menu>
				<tr>
					<td>
						<!--新增表单信息-->
						<table class=menu>
							<tr>
								<td class=titleLink>
									<app:menu page="/maintenance/datainit/town/TownMonthInitPromote.jsp" rgrade="1" wgrade="1"
										xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 直供乡月数据初始化
	                 		</app:menu>
								</td>
							</tr>
							</table>
							<table class=menu>
							<tr>
								<td class=titleLink>
									<app:menu page="/maintenance/datainit/wholesale/SaleMonthInitPromote.jsp" rgrade="1" wgrade="1"
										xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售月数据初始化
	                 		</app:menu>
								</td>
							</tr>
							</table>
							<table class=menu>
							<tr>
								<td class=titleLink>
									<app:menu page="/maintenance/datainit/corporation/FactoryMonthInitPromote.jsp" rgrade="1" wgrade="1"
										xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 大工业月数据初始化
	                 		</app:menu>
								</td>
							</tr>
														
						</table>
						


						
					</td>
				</tr>
			</table>
		</div>
<table border=0 cellpadding="0" cellspacing="0" class=menu>

			<tr>
				<td class=titleLink onclick="showMenu(T_xitongzhizhen)">
					<img src="../../images/xtzzcsh.gif" border="0">
				</td>
			</tr>
		</table>
	<div id=T_xitongzhizhen style="display" class=menu>
			<table class=menu>
				<tr>
					<td>

						<!--新增表单信息-->
						<table class=menu>
							
							<tr>
								<td class=titleLink>
									<app:menu page="/datainit.do" rgrade="1" wgrade="1"
										xgrade="1" target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 直供乡指针初始化
	                 		</app:menu>
								</td>
							</tr>
							</table>
							<table class=menu>
							<tr>
								<td class=titleLink>
									<app:menu page="/viewLWCorporationUser.do" rgrade="1" wgrade="1" xgrade="1"
										target="fraInterface">
	                 		&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 大工业指针初始化
	                 		</app:menu>
								</td>
							</tr>
							
						</table>
						<table class=menu>
							<tr>
								<td class=titleLink onclick="showMenu(T_dunshouzhizhen)">
							&nbsp;&nbsp;&nbsp;<img
											src="../../images/imgicon_3.gif" border="0" align="absmiddle"> 趸售指针初始化
	                 	
								</td>
							</tr>
							</table>
						<div id=T_dunshouzhizhen style="display:none" class=menu>
									<table class=menu>
										<tr>										
												 <td class=titleLink>
	            				     		<app:menu page="/viewLWWholeSaleCompanyUser.do?comcode=gy" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 固阳
	             					    		</app:menu>
	             							   	</td>
	             							   	</tr>
	             							   	<tr>
	             							   	 <td class=titleLink>
	            				     		<app:menu page="/viewLWWholeSaleCompanyUser.do?comcode=dm" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 达茂
	             					    		</app:menu>
	             							   	</td>
												
										</tr>	
											<tr>
	             							   	 <td class=titleLink>
	            				     		<app:menu page="/viewLWWholeSaleCompanyUser.do?comcode=ty" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 土右
	             					    		</app:menu>
	             							   	</td>
												
										</tr>	
										<tr>
	             							   	 <td class=titleLink>
	            				     		<app:menu page="/viewLWWholeSaleCompanyUser.do?comcode=jy" rgrade="1" wgrade="1" xgrade="1" target="fraInterface">
	            				     		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/imgicon_2.gif" border="0" > 九原
	             					    		</app:menu>
	             							   	</td>
												
										</tr>	
								  </table>
						</div>
					</td>
				</tr>
			</table>
		</div>

		<!--■ 重新登录菜单-->
		<table border="0" cellpadding=0 cellspacing=0 class=menu>
			<tr>
				<td class=itemLink>
					<a class=menu href="/iacontact/index.jsp" target="fraInterface"
						onclick="return relogon();"> <img
							src="../../images/chongxindenglu.gif" border="0">
					</a>
				</td>
			</tr>
			<tr>
				<td class=itemLink>
					<a class=menu href="/iacontact/updatePassword.do"
						target="fraInterface"> <img src="../../images/xiugaimima.gif"
							border="0">
					</a>
				</td>
			</tr>
		</table>
	</body>
</html>
