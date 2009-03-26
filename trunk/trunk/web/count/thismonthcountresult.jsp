<%@ page contentType="text/html; charset=GBK"%>
<%@page import="java.util.*"%>
<%@page import="com.elongway.pss.ui.view.datainput.UITownCalForm"%>
<%@page import="com.elongway.pss.dto.domain.LwTownIndicatorDto"%>
<%@page import="com.elongway.pss.ui.view.price.UITownBill"%>
<%@page import="com.elongway.pss.dto.custom.TownSataDto"%>
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwCorporationSummaryDto" />
<jsp:directive.page
	import="com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwCoporationUserInfoDto" />
<jsp:directive.page import="java.text.DecimalFormat" />
<jsp:directive.page
	import="com.elongway.pss.dto.domain.LwAllWholeFeeDto" />
<jsp:directive.page import="com.elongway.pss.util.PowerFeeCal" />
<jsp:directive.page import="com.elongway.pss.util.AppConst" />
<%@ taglib uri="/WEB-INF/app.tld" prefix="app"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html xhtml="true" locale="true">
<head>
	<meta http-equiv=Content-Type content="text/html; charset=gb2312">

	<title>包头农电总公司电费电量发行单</title>
	<link rel="stylesheet" type="text/css" media="all"
		href="/mimessage/css/calendar.css" title="win2k-cold-1" />
	<app:css />
	<html:base />
	<STYLE>
BODY {
	SCROLLBAR-FACE-COLOR: #ffffff;
	SCROLLBAR-HIGHLIGHT-COLOR: #A9CBED;
	SCROLLBAR-SHADOW-COLOR: #A9CBED;
	SCROLLBAR-3DLIGHT-COLOR: #FFFFFF;
	SCROLLBAR-ARROW-COLOR: #A9CBED;
	SCROLLBAR-TRACK-COLOR: #FFFFFF;
	SCROLLBAR-DARKSHADOW-COLOR: #FFFFFF;
}
</STYLE>
	<script language="Javascript"
		src="/iacontact/common/pub/StaticJavascript.jsp"></script>
	<script language="Javascript">
 function validateUserQueryForm(form)
{
   //添加日期型的合成函数
  if(!(composeauUserBirthday() && composeauUserStartWorkDate() && composeauUserEnterDate())){
     return false;
  }
   bValid = validateQueryForm(form);
  if(bValid == true)
  {
      disabledImg(userForm,'userOverviewChaxun');
  }
   return bValid;
}
   
  function AddForm(){
  alert();  
       var strURL = "<%=request.getContextPath()%>/townSave.do";
       fm.action = strURL;
	 
        } 

</script>
	<script language="javascript">
   function codeQuery(field)
{
	if(event.type=="keyup")
	{
		var charCode=window.event.keyCode;
		if(!(charCode==13 & window.event.ctrlKey))
			return;
	}
	var vURL="<%=request.getContextPath()%>/QueryCodeList.do?CODE="+fm.userNo.value+"&TableName=lwProrate";

	var newWindow=window.open(vURL,"GROUP","width=640,height=480,top=100,left=200,toolbar=0,location=0,directions=0,menubar=0,scrollbars=1,resizable=1,status=0");
	newWindow.focus();
	return newWindow;
}
</script>
	<script language="javascript">
   function check()
{
	if(fm.userNo==null){
	alert(fm.userNo.value);
	}
}
</script>
</head>
<body class=interface>
	&nbsp;
	<html:errors />

	<%
		DecimalFormat df = new DecimalFormat("###0.00");
			//String sumffee=(String)request.getAttribute("sumffee");
			//String sumfpower=request.getAttribute("sumfpower").toString();
			//String sumfdianfee=(String)request.getAttribute("sumfdianfee");
			//String sumftax=(String)request.getAttribute("sumftax");
			//String sumfc=(String)request.getAttribute("sumfc");
			//String summfdianjin=(String)request.getAttribute("summfdianjin");
			//String sumfdianjintax=(String)request.getAttribute("sumfdianjintax");
			//String sumfsanxia=(String)request.getAttribute("sumfsanxia");
			//String sumfsanxiatax=(String)request.getAttribute("sumfsanxiatax");
			//String sumfjijin=(String)request.getAttribute("sumfjijin");
			//String sumfjijintax=(String)request.getAttribute("sumfjijintax");
			String sumwfee = (String) request.getAttribute("sumwfee");
			double sumffee = 0;
			double sumfpower = 0;
			double sumfdianfee = 0;
			double sumftax = 0;
			double sumfc = 0;
			double summfdianjin = 0;
			double sumfdianjintax = 0;
			double sumfsanxia = 0;
			double sumfsanxiatax = 0;
			double sumfjijin = 0;
			double sumfjijintax = 0;
			TownSataDto sumtownSataDto = (TownSataDto) request
					.getAttribute("sumtownSataDto");
			String sumwpower = request.getAttribute("sumwpower").toString();
			String sumwdianfee = (String) request
					.getAttribute("sumwdianfee");
			String sumwtax = (String) request.getAttribute("sumwtax");
			String sumwc = (String) request.getAttribute("sumwc");
			String summwdianjin = (String) request
					.getAttribute("summwdianjin");
			String sumwdianjintax = (String) request
					.getAttribute("sumwdianjintax");
			String sumwsanxia = (String) request.getAttribute("sumwsanxia");
			String sumwsanxiatax = (String) request
					.getAttribute("sumwsanxiatax");
			String sumwjijin = (String) request.getAttribute("sumwjijin");
			String sumwjijintax = (String) request
					.getAttribute("sumwjijintax");

			//String sumallfee=(String)request.getAttribute("sumwjijintax");
			//String sumallpower=request.getAttribute("sumallpower").toString();
			//String sumallc=(String)request.getAttribute("sumallc");
			//String sumalltax=(String)request.getAttribute("sumalltax");
			//String sumallall=(String)request.getAttribute("sumallall");
			//String sumalldianjin=(String)request.getAttribute("sumalldianjin");
			//String sumalldianjintax=(String)request.getAttribute("sumalldianjintax");
			//String sumallsanxia=(String)request.getAttribute("sumallsanxia");
			//String sumallsanxiatax=(String)request.getAttribute("sumallsanxiatax");
			//String sumalljijin=(String)request.getAttribute("sumalljijin");
			//String sumalljijintax=(String)request.getAttribute("sumalljijintax");
			double sumallfee = 0;
			double sumallpower = 0;
			double sumallc = 0;
			double sumalltax = 0;
			double sumallall = 0;
			double sumalldianjin = 0;
			double sumalldianjintax = 0;
			double sumallsanxia = 0;
			double sumallsanxiatax = 0;
			double sumalljijin = 0;
			double sumalljijintax = 0;

			String sanxiagy = (String) request.getAttribute("sanxiagy");
			String jijingy = (String) request.getAttribute("jijingy");
			String dianjingy = (String) request.getAttribute("dianjingy");
			String sumpowergy = request.getAttribute("sumpowergy")
					.toString();
			String sumdianfeegy = (String) request
					.getAttribute("sumdianfeegy");
			String sanxiajy = (String) request.getAttribute("sanxiajy");
			String jijinjy = (String) request.getAttribute("jijinjy");
			String dianjinjy = (String) request.getAttribute("dianjinjy");
			String sumpowerjy = request.getAttribute("sumpowerjy")
					.toString();
			String sumdianfeejy = (String) request
					.getAttribute("sumdianfeejy");
			String sanxiadm = (String) request.getAttribute("sanxiadm");
			String jijindm = (String) request.getAttribute("jijindm");
			String dianjindm = (String) request.getAttribute("dianjindm");
			String sumpowerdm = request.getAttribute("sumpowerdm")
					.toString();
			String sumdianfeedm = (String) request
					.getAttribute("sumdianfeedm");
			String sanxiaty = (String) request.getAttribute("sanxiaty");
			String jijinty = (String) request.getAttribute("jijinty");
			String dianjinty = (String) request.getAttribute("dianjinty");
			String sumpowerty = request.getAttribute("sumpowerty")
					.toString();
			String sumdianfeety = (String) request
					.getAttribute("sumdianfeety");
			List colf = (List) request.getAttribute("colf");

			String sumallfeejy = (String) request
					.getAttribute("sumallfeejy");
			String sumallfeegy = (String) request
					.getAttribute("sumallfeegy");
			String sumallfeedm = (String) request
					.getAttribute("sumallfeedm");
			String sumallfeety = (String) request
					.getAttribute("sumallfeety");
			String s = (String) request.getAttribute("inputDate");

			LwAllWholeFeeDto lwAllWholeFeeDtogy = (LwAllWholeFeeDto) request
					.getAttribute("lwAllWholeFeeDtogy");
			LwAllWholeFeeDto lwAllWholeFeeDtodm = (LwAllWholeFeeDto) request
					.getAttribute("lwAllWholeFeeDtodm");
			LwAllWholeFeeDto lwAllWholeFeeDtojy = (LwAllWholeFeeDto) request
					.getAttribute("lwAllWholeFeeDtojy");
			LwAllWholeFeeDto lwAllWholeFeeDtoty = (LwAllWholeFeeDto) request
					.getAttribute("lwAllWholeFeeDtoty");

			String differenceQuantity = request.getAttribute(
					"differenceQuantity").toString();
			String differenceQuantitygy = request.getAttribute(
					"differenceQuantitygy").toString();
			String differenceQuantitydm = request.getAttribute(
					"differenceQuantitydm").toString();
			String differenceQuantityjy = request.getAttribute(
					"differenceQuantityjy").toString();
			String differenceQuantityty = request.getAttribute(
					"differenceQuantityty").toString();
	%>
	<form name="fm" method="post">
		<table class=common width="500%" border="1" cellspacing="0"
			cellpadding="6">
			<td style="display: none">
				<input type="hidden" name="StartMonth"
					value="<%=(String) request.getAttribute("inputDate")%>">
				<input type="hidden" name="counttype"
					value="<%=(String) request.getAttribute("counttype")%>">
			</td>

			<tr>
				<td class=title0 colspan="13">
					<font size="4">包头市农电公司电费电量发行单（当月）</font>
				</td>
			</tr>
			<tr>
				<td nowrap colspan="2">
					<span class="title">月份:<%=s.substring(0, 7)%></span>
				</td>
			</tr>
			<tr class=listtitle>
				<td width="10%">
					<span class="title"><font size="2">单位</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电量</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">电费</font>
					</span>
					<br>
				</td>



				<td nowrap width="10%">
					<span class="title"><font size="2">三峡基金</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">电力资金</font>
					</span>
					<br>
				</td>


				<td nowrap width="10%">
					<span class="title"><font size="2">基金</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">电费税</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">三峡税</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">电金税</font>
					</span>
					<br>
				</td>


				<td nowrap width="10%">
					<span class="title"><font size="2">基金税</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">差别电费</font>
					</span>
					<br>
				</td>

				<td nowrap width="10%">
					<span class="title"><font size="2">差别电费税</font>
					</span>
					<br>
				</td>
				<td nowrap width="10%">
					<span class="title"><font size="2">总计</font>
					</span>
					<br>
				</td>

			</tr>
			<%
				Iterator itf = colf.iterator();
					LwCorporationSummaryDto lwCorporationSummaryDto = new LwCorporationSummaryDto();
					while (itf.hasNext()) {
						lwCorporationSummaryDto = (LwCorporationSummaryDto) itf
								.next();
						String lineCode = lwCorporationSummaryDto.getLineCode();
						sumfpower += lwCorporationSummaryDto.getElectricQuantity();
						if (lwCorporationSummaryDto.getLineCode().equals(
								"20699999065")
								|| lwCorporationSummaryDto.getLineCode().equals(
										"20699999072")) {
							sumfc += PowerFeeCal
									.getValue(
											(lwCorporationSummaryDto.getPeakFee()
													+ lwCorporationSummaryDto
															.getContentFee()
													+ lwCorporationSummaryDto
															.getNeedFee()
													+ lwCorporationSummaryDto
															.getPowerRateFee()
													+ lwCorporationSummaryDto
															.getUnDenizenFee() + lwCorporationSummaryDto
													.getUnLineLoss()) / 1.17,
											AppConst.TWO_DOT_FLAG);
						} else {
							sumfc += PowerFeeCal
									.getValue(
											(lwCorporationSummaryDto
													.getPointerFee()
													+ lwCorporationSummaryDto
															.getContentFee()
													+ lwCorporationSummaryDto
															.getNeedFee()
													+ lwCorporationSummaryDto
															.getPowerRateFee()
													+ lwCorporationSummaryDto
															.getUnDenizenFee() + lwCorporationSummaryDto
													.getUnLineLoss()) / 1.17,
											AppConst.TWO_DOT_FLAG);
						}
						sumfsanxia += PowerFeeCal.getValue(lwCorporationSummaryDto
								.getSanXiaFee() / 1.17, AppConst.TWO_DOT_FLAG);
						summfdianjin += PowerFeeCal.getValue(
								lwCorporationSummaryDto.getPowerFee() / 1.17,
								AppConst.TWO_DOT_FLAG);
						sumfjijin += PowerFeeCal.getValue((lwCorporationSummaryDto
								.getSurcharge() / 1.17), AppConst.TWO_DOT_FLAG);
						if (lwCorporationSummaryDto.getLineCode().equals(
								"20699999065")
								|| lwCorporationSummaryDto.getLineCode().equals(
										"20699999072")) {
							sumftax += PowerFeeCal
									.getValue(
											((lwCorporationSummaryDto.getPeakFee()
													+ lwCorporationSummaryDto
															.getContentFee()
													+ lwCorporationSummaryDto
															.getNeedFee()
													+ lwCorporationSummaryDto
															.getPowerRateFee()
													+ lwCorporationSummaryDto
															.getUnDenizenFee() + lwCorporationSummaryDto
													.getUnLineLoss()) - (lwCorporationSummaryDto
													.getPeakFee()
													+ lwCorporationSummaryDto
															.getContentFee()
													+ lwCorporationSummaryDto
															.getNeedFee()
													+ lwCorporationSummaryDto
															.getPowerRateFee()
													+ lwCorporationSummaryDto
															.getUnDenizenFee() + lwCorporationSummaryDto
													.getUnLineLoss()) / 1.17),
											AppConst.TWO_DOT_FLAG);

						} else {
							sumftax += PowerFeeCal
									.getValue(
											((lwCorporationSummaryDto
													.getPointerFee()
													+ lwCorporationSummaryDto
															.getContentFee()
													+ lwCorporationSummaryDto
															.getNeedFee()
													+ lwCorporationSummaryDto
															.getPowerRateFee()
													+ lwCorporationSummaryDto
															.getUnDenizenFee() + lwCorporationSummaryDto
													.getUnLineLoss()) - (lwCorporationSummaryDto
													.getPointerFee()
													+ lwCorporationSummaryDto
															.getContentFee()
													+ lwCorporationSummaryDto
															.getNeedFee()
													+ lwCorporationSummaryDto
															.getPowerRateFee()
													+ lwCorporationSummaryDto
															.getUnDenizenFee() + lwCorporationSummaryDto
													.getUnLineLoss()) / 1.17),
											AppConst.TWO_DOT_FLAG);
						}
						sumfsanxiatax += PowerFeeCal
								.getValue(
										(lwCorporationSummaryDto.getSanXiaFee() - lwCorporationSummaryDto
												.getSanXiaFee() / 1.17),
										AppConst.TWO_DOT_FLAG);
						sumfdianjintax += PowerFeeCal
								.getValue(
										(lwCorporationSummaryDto.getPowerFee() - lwCorporationSummaryDto
												.getPowerFee() / 1.17),
										AppConst.TWO_DOT_FLAG);
						sumfjijintax += PowerFeeCal
								.getValue(
										(lwCorporationSummaryDto.getSurcharge() - lwCorporationSummaryDto
												.getSurcharge() / 1.17),
										AppConst.TWO_DOT_FLAG);
						sumffee += lwCorporationSummaryDto.getSumFee();
			%>
			<tr>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><input
								name="UserNo" value=<%=lwCorporationSummaryDto.getUserNo()%>
								style="border: 0" readonly="readonly" style="width:65px">
					</font>
					<input type="hidden" name="userNo"
							value="<%=lwCorporationSummaryDto.getUserNo()%>">
					<input type="hidden" name="lineCode"
							value="<%=lineCode%>">
					</span>
					<br>
				</td>
				<%
					if (lwCorporationSummaryDto.getLineCode().equals(
									"20699999065")
									|| lwCorporationSummaryDto.getLineCode().equals(
											"20699999072")) {
				%>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwCorporationSummaryDto
										.getElectricQuantity())%></font>
					<input type="hidden" name="electricQuantity"
							value="<%=Math.round(lwCorporationSummaryDto
										.getElectricQuantity())%>">
					<input type="hidden" name="remark"
							value="1">
					</span>
					<br>
				</td>
				<%
					} else {
				%>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(lwCorporationSummaryDto
										.getElectricQuantity())%></font>
										<input type="hidden" name="electricQuantity" value="<%=Math.round(lwCorporationSummaryDto
										.getElectricQuantity())%>" >
					<input type="hidden" name="remark"
							value="1">
					</span>
					<br>
				</td>
				<%
					}
				%>

				<%
					if (lwCorporationSummaryDto.getLineCode().equals(
									"20699999065")
									|| lwCorporationSummaryDto.getLineCode().equals(
											"20699999072")) {
				%>
				<td nowrap width="10%" align="center">
				<%String fee = df.format( PowerFeeCal.getValue((lwCorporationSummaryDto
																		.getPeakFee()
																		+ lwCorporationSummaryDto
																				.getContentFee()
																		+ lwCorporationSummaryDto
																				.getNeedFee()
																		+ lwCorporationSummaryDto
																				.getPowerRateFee()
																		+ lwCorporationSummaryDto
																				.getUnDenizenFee() + lwCorporationSummaryDto
																		.getUnLineLoss()) / 1.17,
																AppConst.TWO_DOT_FLAG));%>
					<span class="title"><font size="2"><%=fee%></font>
					<input type="hidden" name="fee" value="<%=fee %>" >
					</span>
					<br>
				</td>
				<%
					} else {
								System.out.println(lwCorporationSummaryDto.getUserNo());
								System.out.println(lwCorporationSummaryDto
										.getPointerFee());
								System.out.println(lwCorporationSummaryDto
										.getContentFee());
								System.out
										.println(lwCorporationSummaryDto.getNeedFee());
								System.out
										.println(lwCorporationSummaryDto.getNeedFee());
								System.out.println(lwCorporationSummaryDto
										.getPowerRateFee());
								System.out.println(lwCorporationSummaryDto
										.getUnDenizenFee());
								System.out.println(lwCorporationSummaryDto
										.getUnLineLoss());
				%>

				<td nowrap width="10%" align="center">
				<% String fee =  df.format(PowerFeeCal.getValue((lwCorporationSummaryDto
																		.getPointerFee()
																		+ lwCorporationSummaryDto
																				.getContentFee()
																		+ lwCorporationSummaryDto
																				.getNeedFee()
																		+ lwCorporationSummaryDto
																				.getPowerRateFee()
																		+ lwCorporationSummaryDto
																				.getUnDenizenFee() + lwCorporationSummaryDto
																		.getUnLineLoss()) / 1.17,
																AppConst.TWO_DOT_FLAG));%>
					<span class="title"><font size="2"><%=fee%></font>
					<input type="hidden" name="fee" value="<%=fee %>" >
					</span>
					<br>
				</td>




				<%
					}
				%>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue(lwCorporationSummaryDto
									.getSanXiaFee() / 1.17,
									AppConst.TWO_DOT_FLAG)%></font>
					<input type="hidden" name="sanXiaFee" value="<%=PowerFeeCal.getValue(lwCorporationSummaryDto
									.getSanXiaFee() / 1.17,
									AppConst.TWO_DOT_FLAG)%>" >
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue(lwCorporationSummaryDto
									.getPowerFee() / 1.17,
									AppConst.TWO_DOT_FLAG)%></font>
				   <input type="hidden" name="dianJin" value="<%=PowerFeeCal.getValue(lwCorporationSummaryDto
									.getPowerFee() / 1.17,
									AppConst.TWO_DOT_FLAG)%>" >				
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue(lwCorporationSummaryDto
									.getSurcharge() / 1.17,
									AppConst.TWO_DOT_FLAG)%></font>
					 <input type="hidden" name="jiJin" value="<%=PowerFeeCal.getValue(lwCorporationSummaryDto
									.getSurcharge() / 1.17,
									AppConst.TWO_DOT_FLAG)%>" >				
					</span>
					<br>
				</td>
				<%
					if (lwCorporationSummaryDto.getLineCode().equals(
									"20699999065")
									|| lwCorporationSummaryDto.getLineCode().equals(
											"20699999072")) {
				%>
				<td nowrap width="10%" align="center">
				<%String feeTax  = df.format(PowerFeeCal.getValue(
																((lwCorporationSummaryDto
																		.getPeakFee()
																		+ lwCorporationSummaryDto
																				.getContentFee()
																		+ lwCorporationSummaryDto
																				.getNeedFee()
																		+ lwCorporationSummaryDto
																				.getPowerRateFee()
																		+ lwCorporationSummaryDto
																				.getUnDenizenFee() + lwCorporationSummaryDto
																		.getUnLineLoss()) - (lwCorporationSummaryDto
																		.getPeakFee()
																		+ lwCorporationSummaryDto
																				.getContentFee()
																		+ lwCorporationSummaryDto
																				.getNeedFee()
																		+ lwCorporationSummaryDto
																				.getPowerRateFee()
																		+ lwCorporationSummaryDto
																				.getUnDenizenFee() + lwCorporationSummaryDto
																		.getUnLineLoss()) / 1.17),
																AppConst.TWO_DOT_FLAG));%>
					<span class="title"><font size="2"><%=feeTax%></font>
					<input type="hidden" name="feeTax" value="<%=feeTax %>" >
					</span>
					<br>
				</td>
				<%
					} else {
				%>
				<td nowrap width="10%" align="center">
				<%String feeTax = df.format(PowerFeeCal.getValue(
																((lwCorporationSummaryDto
																		.getPointerFee()
																		+ lwCorporationSummaryDto
																				.getContentFee()
																		+ lwCorporationSummaryDto
																				.getNeedFee()
																		+ lwCorporationSummaryDto
																				.getPowerRateFee()
																		+ lwCorporationSummaryDto
																				.getUnDenizenFee() + lwCorporationSummaryDto
																		.getUnLineLoss()) - (lwCorporationSummaryDto
																		.getPointerFee()
																		+ lwCorporationSummaryDto
																				.getContentFee()
																		+ lwCorporationSummaryDto
																				.getNeedFee()
																		+ lwCorporationSummaryDto
																				.getPowerRateFee()
																		+ lwCorporationSummaryDto
																				.getUnDenizenFee() + lwCorporationSummaryDto
																		.getUnLineLoss()) / 1.17),
																AppConst.TWO_DOT_FLAG)); %>
					<span class="title"><font size="2"><%=feeTax%></font>
					<input type="hidden" name="feeTax" value="<%=feeTax %>" >
					</span>
					<br>
				</td>
				<%
					}
				%>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue((lwCorporationSummaryDto
									.getSanXiaFee() - lwCorporationSummaryDto
									.getSanXiaFee() / 1.17),
									AppConst.TWO_DOT_FLAG)%></font>
					<input type="hidden" name="sanXiaTax" value="<%=PowerFeeCal.getValue((lwCorporationSummaryDto
									.getSanXiaFee() - lwCorporationSummaryDto
									.getSanXiaFee() / 1.17),
									AppConst.TWO_DOT_FLAG) %>" >
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue((lwCorporationSummaryDto
									.getPowerFee() - lwCorporationSummaryDto
									.getPowerFee() / 1.17),
									AppConst.TWO_DOT_FLAG)%></font>
					<input type="hidden" name="dianJinTax" value="<%=PowerFeeCal.getValue((lwCorporationSummaryDto
									.getPowerFee() - lwCorporationSummaryDto
									.getPowerFee() / 1.17),
									AppConst.TWO_DOT_FLAG)%>" >
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=PowerFeeCal.getValue((lwCorporationSummaryDto
									.getSurcharge() - lwCorporationSummaryDto
									.getSurcharge() / 1.17),
									AppConst.TWO_DOT_FLAG)%></font>
					<input type="hidden" name="jiJinTax" value="<%=PowerFeeCal.getValue((lwCorporationSummaryDto
									.getSurcharge() - lwCorporationSummaryDto
									.getSurcharge() / 1.17),
									AppConst.TWO_DOT_FLAG)%>" >				
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font>
			    <input type="hidden" name="chabie" value="<%=0%>" >		
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font>
					  <input type="hidden" name="chabieTax" value="<%=0%>" >	
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(lwCorporationSummaryDto.getSumFee())%></font>
				 <input type="hidden" name="sumFee" value="<%=df.format(lwCorporationSummaryDto.getSumFee())%>" >		
					</span>
					<br>
				</td>



			</tr>
			<%
				}
			%>

			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">小计</font>
					 <input type="hidden" name="userNo" value="小计" >	
					  <input type="hidden" name="lineCode" value="sumcorp" >	
					  <input type="hidden" name="remark"
							value="2">				 	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(sumfpower)%></font>
					 <input type="hidden" name="electricQuantity" value="<%=Math.round(sumfpower)%>" >		
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(sumfc)%></font>
						 <input type="hidden" name="fee" value="<%=df.format(sumfc)%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(sumfsanxia)%></font>
					<input type="hidden" name="sanXiaFee" value="<%=df.format(sumfsanxia)%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(summfdianjin)%></font>
					<input type="hidden" name="dianJin" value="<%=df.format(summfdianjin)%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(sumfjijin)%></font>
					<input type="hidden" name="jiJin" value="<%=df.format(sumfjijin)%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(sumftax)%></font>
					<input type="hidden" name="feeTax" value="<%=df.format(sumftax)%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(sumfsanxiatax)%></font>
					<input type="hidden" name="sanXiaTax" value="<%=df.format(sumfsanxiatax)%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(sumfdianjintax)%></font>
					<input type="hidden" name="dianJinTax" value="<%=df.format(sumfdianjintax)%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(sumfjijintax)%></font>
					<input type="hidden" name="jiJinTax" value="<%=df.format(sumfjijintax)%>" >	
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font>
					<input type="hidden" name="chabie" value="<%=0%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font>
					<input type="hidden" name="chabieTax" value="<%=0%>" >	
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(sumffee)%></font>
					<input type="hidden" name="sumFee" value="<%=df.format(sumffee)%>" >	
					</span>
					<br>
				</td>


			</tr>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">郊区</font>
					<input type="hidden" name="userNo" value="郊区" >	
					<input type="hidden" name="lineCode" value= "jy">
					<input type="hidden" name="remark"
							value="3">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getPower1()%></font>
					<input type="hidden" name="electricQuantity" value="<%=lwAllWholeFeeDtojy.getPower1()%>" >	
					</span>
					<br>
				</td>
				<%String jypower = df.format((Double.parseDouble(lwAllWholeFeeDtojy
										.getSumfee())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getSanxia())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getSanxiatax())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getJijin())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getFujia1())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getDianjin())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getDianjintax()) - Double
										.parseDouble(lwAllWholeFeeDtojy
												.getFujia9())) / 1.17); %>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=jypower%></font>
					<input type="hidden" name="fee" value="<%=jypower%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getSanxia()%></font>
						<input type="hidden" name="sanXiaFee" value="<%=lwAllWholeFeeDtojy.getSanxia()%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getDianjin()%></font>
					<input type="hidden" name="dianJin" value="<%=lwAllWholeFeeDtojy.getDianjin()%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getJijin()%></font>
					<input type="hidden" name="jiJin" value="<%=lwAllWholeFeeDtojy.getJijin()%>" >	
					</span>
					<br>
				</td>
				<%String jydianfeiTax = df.format((Double.parseDouble(lwAllWholeFeeDtojy
										.getSumfee())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getSanxia())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getSanxiatax())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getJijin())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getFujia1())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getDianjin())
										- Double.parseDouble(lwAllWholeFeeDtojy
												.getDianjintax()) - Double
										.parseDouble(lwAllWholeFeeDtojy
												.getFujia9())) / 1.17 * 0.17);%>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=jydianfeiTax%></font>
					<input type="hidden" name="feeTax" value="<%=jydianfeiTax%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getSanxiatax()%></font>
					<input type="hidden" name="sanXiaTax" value="<%=lwAllWholeFeeDtojy.getSanxiatax()%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getDianjintax()%></font>
					<input type="hidden" name="dianJinTax" value="<%=lwAllWholeFeeDtojy.getDianjintax()%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtojy.getFujia1()%></font>
					<input type="hidden" name="jiJinTax" value="<%=lwAllWholeFeeDtojy.getFujia1()%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantityjy) / 1.17)%></font>
					<input type="hidden" name="chabie" value="<%=df.format(Double
												.parseDouble(differenceQuantityjy) / 1.17)%>" >	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantityjy) / 1.17 * 0.17)%></font>
					<input type="hidden" name="chabieTax" value="<%=df.format(Double
												.parseDouble(differenceQuantityjy) / 1.17)%>" >	
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtojy
								.getSumfee()))%></font>
				    <input type="hidden" name="sumFee" value="<%=df.format(Double.parseDouble(lwAllWholeFeeDtojy
								.getSumfee()))%>" >	
					</span>
					<br>
				</td>


			</tr>

			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">达茂旗</font>
					<input type="hidden" name="userNo" value="达茂旗" >	
					<input type="hidden" name="lineCode" value= "dm">
					<input type="hidden" name="remark"
							value="3">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getPower1()%></font>
					<input type="hidden" name="electricQuantity" value= "<%=lwAllWholeFeeDtodm.getPower1()%>">					
					</span>
					<br>
				</td>
				<%String dmpower = df
								.format((Double.parseDouble(lwAllWholeFeeDtodm
										.getSumfee())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getSanxia())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getSanxiatax())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getJijin())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getFujia1())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getDianjin())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getDianjintax()) - Double
										.parseDouble(lwAllWholeFeeDtodm
												.getFujia9())) / 1.17);%>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=dmpower%></font>
				    <input type="hidden" name="fee" value= "<%=dmpower%>">			
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getSanxia()%></font>
					  <input type="hidden" name="sanXiaFee" value= "<%=lwAllWholeFeeDtodm.getSanxia()%>">		
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getDianjin()%></font>
					<input type="hidden" name="dianJin" value= "<%=lwAllWholeFeeDtodm.getDianjin()%>">	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getJijin()%></font>
					<input type="hidden" name="jiJin" value= "<%=lwAllWholeFeeDtodm.getJijin()%>">	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
				<%String dmtax = df.format((Double.parseDouble(lwAllWholeFeeDtodm
										.getSumfee())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getSanxia())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getSanxiatax())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getJijin())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getFujia1())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getDianjin())
										- Double.parseDouble(lwAllWholeFeeDtodm
												.getDianjintax()) - Double
										.parseDouble(lwAllWholeFeeDtodm
												.getFujia9())) / 1.17 * 0.17); %>
					<span class="title"><font size="2"><%=dmtax%></font>
					<input type="hidden" name="feeTax" value= "<%=dmtax%>">	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getSanxiatax()%></font>
					<input type="hidden" name="sanXiaTax" value= "<%=lwAllWholeFeeDtodm.getSanxiatax()%>">	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getDianjintax()%></font>
					<input type="hidden" name="dianJinTax" value= "<%=lwAllWholeFeeDtodm.getDianjintax()%>">	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtodm.getFujia1()%></font>
					<input type="hidden" name="jiJinTax" value= "<%=lwAllWholeFeeDtodm.getFujia1()%>">	
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantitydm) / 1.17)%></font>
					<input type="hidden" name="chabie" value= "<%=df.format(Double
												.parseDouble(differenceQuantitydm) / 1.17)%>">	
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantitydm) / 1.17 * 0.17)%></font>
					<input type="hidden" name="chabieTax" value= "<%=df.format(Double
												.parseDouble(differenceQuantitydm) / 1.17 * 0.17)%>">	
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtodm
								.getSumfee()))%></font>
					<input type="hidden" name="sumFee" value= "<%=df.format(Double.parseDouble(lwAllWholeFeeDtodm
								.getSumfee()))%>">
					</span>
					<br>
				</td>


			</tr>


			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">土右</font>
					<input type="hidden" name="userNo" value="土右" >	
					<input type="hidden" name="lineCode" value= "ty">
					<input type="hidden" name="remark"
							value="3">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(Double.parseDouble(lwAllWholeFeeDtoty
								.getPower1()))%></font>
					  <input type="hidden" name="electricQuantity" value= "<%=Math.round(Double.parseDouble(lwAllWholeFeeDtoty
								.getPower1()))%>">
					</span>
					<br>
				</td>
				<%String tyfee = df
								.format((Double.parseDouble(lwAllWholeFeeDtoty
										.getSumfee())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getSanxia())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getSanxiatax())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getJijin())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getFujia1())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getDianjin())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getDianjintax()) - Double
										.parseDouble(lwAllWholeFeeDtoty
												.getFujia9())) / 1.17); %>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=tyfee%></font>
					  <input type="hidden" name="fee" value= "<%=tyfee%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getSanxia()%></font>
					  <input type="hidden" name="sanXiaFee" value= "<%=lwAllWholeFeeDtoty.getSanxia()%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getDianjin()%></font>
					  <input type="hidden" name="dianJin" value= "<%=lwAllWholeFeeDtoty.getDianjin()%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getJijin()%></font>
					  <input type="hidden" name="jiJin" value= "<%=lwAllWholeFeeDtoty.getJijin()%>">
					</span>
					<br>
				</td>
				<%String tyTax =  df.format((Double.parseDouble(lwAllWholeFeeDtoty
										.getSumfee())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getSanxia())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getSanxiatax())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getJijin())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getFujia1())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getDianjin())
										- Double.parseDouble(lwAllWholeFeeDtoty
												.getDianjintax()) - Double
										.parseDouble(lwAllWholeFeeDtoty
												.getFujia9())) / 1.17 * 0.17);%>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=tyTax%></font>
					  <input type="hidden" name="feeTax" value= "<%=tyTax%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getSanxiatax()%></font>
					  <input type="hidden" name="sanXiaTax" value= "<%=lwAllWholeFeeDtoty.getSanxiatax()%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getDianjintax()%></font>
					 <input type="hidden" name="dianJinTax" value= "<%=lwAllWholeFeeDtoty.getDianjintax()%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtoty.getFujia1()%></font>
					 <input type="hidden" name="jiJinTax" value= "<%=lwAllWholeFeeDtoty.getFujia1()%>">
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double
												.parseDouble(differenceQuantityty) / 1.17)%></font>
					<input type="hidden" name="chabie" value= "<%=df.format(Double
												.parseDouble(differenceQuantityty) / 1.17)%>">
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantityty) / 1.17 * 0.17)%></font>
					<input type="hidden" name="chabieTax" value= "<%=df.format(Double
												.parseDouble(differenceQuantityty) / 1.17 * 0.17)%>">
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtoty
								.getSumfee()))%></font>
					<input type="hidden" name="sumFee" value= "<%=df.format(Double.parseDouble(lwAllWholeFeeDtoty
								.getSumfee()))%>">			
					</span>
					<br>
				</td>



			</tr>



			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">固阳</font>
					<input type="hidden" name="userNo" value="固阳" >	
					<input type="hidden" name="lineCode" value= "gy">
					<input type="hidden" name="remark"
							value="3">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getPower1()%></font>	
  					<input type="hidden" name="electricQuantity" value= "<%=lwAllWholeFeeDtogy.getPower1()%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
				<%String gyfee = df.format((Double.parseDouble(lwAllWholeFeeDtogy
										.getSumfee())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getSanxia())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getSanxiatax())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getJijin())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getFujia1())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getDianjin())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getDianjintax()) - Double
										.parseDouble(lwAllWholeFeeDtogy
												.getFujia9())) / 1.17); %>
					<span class="title"><font size="2"><%=gyfee%></font>
					<input type="hidden" name="fee" value= "<%=gyfee%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getSanxia()%></font>
					<input type="hidden" name="sanXiaFee" value= "<%=lwAllWholeFeeDtogy.getSanxia()%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getDianjin()%></font>
					<input type="hidden" name="dianJin" value= "<%=lwAllWholeFeeDtogy.getDianjin()%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getJijin()%></font>
					<input type="hidden" name="jiJin" value= "<%=lwAllWholeFeeDtogy.getJijin()%>">
					</span>
					<br>
				</td>
				<%String gytax = df
								.format((Double.parseDouble(lwAllWholeFeeDtogy
										.getSumfee())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getSanxia())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getSanxiatax())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getJijin())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getFujia1())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getDianjin())
										- Double.parseDouble(lwAllWholeFeeDtogy
												.getDianjintax()) - Double
										.parseDouble(lwAllWholeFeeDtogy
												.getFujia9())) / 1.17 * 0.17); %>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=gytax%></font>
					<input type="hidden" name="feeTax" value= "<%=gytax%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getSanxiatax()%></font>
					<input type="hidden" name="sanXiaTax" value= "<%=lwAllWholeFeeDtogy.getSanxiatax()%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getDianjintax()%></font>
					<input type="hidden" name="dianJinTax" value= "<%=lwAllWholeFeeDtogy.getDianjintax()%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=lwAllWholeFeeDtogy.getFujia1()%></font>
					<input type="hidden" name="jiJinTax" value= "<%=lwAllWholeFeeDtogy.getFujia1()%>">
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantitygy) / 1.17)%></font>
				    <input type="hidden" name="chabie" value= "<%=df
										.format(Double
												.parseDouble(differenceQuantitygy) / 1.17)%>">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantitygy) / 1.17 * 0.17)%></font>
					   <input type="hidden" name="chabieTax" value= "<%=df
										.format(Double
												.parseDouble(differenceQuantitygy) / 1.17 * 0.17)%>">
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(lwAllWholeFeeDtogy
								.getSumfee()))%></font>
					<input type="hidden" name="sumFee" value= "<%=df.format(Double.parseDouble(lwAllWholeFeeDtogy
								.getSumfee()))%>">
					</span>
					<br>
				</td>

			</tr>


			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">小计</font>
					<input type="hidden" name="userNo" value= "小计">
					<input type="hidden" name="lineCode" value= "sumwhole">
					<input type="hidden" name="remark"
							value="4">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwpower%></font>
					<input type="hidden" name="electricQuantity" value= <%=sumwpower%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwc%></font>
					<input type="hidden" name="fee" value= <%=sumwc%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwsanxia%></font>
					<input type="hidden" name="sanXiaFee" value= <%=sumwsanxia%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=summwdianjin%></font>
					<input type="hidden" name="dianJin" value= <%=summwdianjin%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwjijin%></font>
					<input type="hidden" name="jiJin" value= <%=sumwjijin%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwtax%></font>
					<input type="hidden" name="feeTax" value= <%=sumwtax%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwsanxiatax%></font>
						<input type="hidden" name="sanXiaTax" value= <%=sumwsanxiatax%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwdianjintax%></font>
					<input type="hidden" name="dianJinTax" value= <%=sumwdianjintax%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwjijintax%></font>
					<input type="hidden" name="jiJinTax" value= <%=sumwjijintax%>>
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantity) / 1.17)%></font>
					<input type="hidden" name="chabie" value= <%=df.format(Double
												.parseDouble(differenceQuantity) / 1.17)%>>
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantity) / 1.17 * 0.17)%></font>
					<input type="hidden" name="chabieTax" value= <%=df.format(Double
												.parseDouble(differenceQuantity) / 1.17 * 0.17)%>>
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=sumwfee%></font>
					<input type="hidden" name="sumFee" value= <%=sumwfee%>>
					</span>
					<br>
				</td>


			</tr>
			<%
				Collection resultList = (Collection) request
							.getAttribute("resultList");
					for (Iterator iterator = resultList.iterator(); iterator
							.hasNext();) {
						TownSataDto townSataDto = (TownSataDto) iterator.next();
			%>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getCompanyName()%></font>
					<input type="hidden" name="userNo" value= "<%=townSataDto.getCompanyName()%>">
					<input type="hidden" name="lineCode" value= "<%=townSataDto.getComCode() %>">
					<input type="hidden" name="remark"
							value="5">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(townSataDto.getSumPower())%></font>
					<input type="hidden" name="electricQuantity" value= <%=Math.round(townSataDto.getSumPower())%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPurePowerFee()%></font>
					<input type="hidden" name="fee" value= <%=townSataDto.getPurePowerFee()%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPureSanXia()%></font>
					<input type="hidden" name="sanXiaFee" value= <%=townSataDto.getPureSanXia()%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPureDianJin()%></font>
					<input type="hidden" name="dianJin" value= <%=townSataDto.getPureDianJin()%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPureJiJin()%></font>
					<input type="hidden" name="jiJin" value= <%=townSataDto.getPureJiJin()%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getPowerFeeTax()%></font>
					<input type="hidden" name="feeTax" value= <%=townSataDto.getPowerFeeTax()%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getSanXiaTax()%></font>
					<input type="hidden" name="sanXiaTax" value= <%=townSataDto.getSanXiaTax()%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getDianJinTax()%></font>
					<input type="hidden" name="dianJinTax" value= <%=townSataDto.getDianJinTax()%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getJiJinTax()%></font>
					<input type="hidden" name="jiJinTax" value= <%=townSataDto.getJiJinTax()%>>
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font>
					<input type="hidden" name="chabie" value= "0">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=0%></font>
						<input type="hidden" name="chabieTax" value= "0">
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=townSataDto.getSumPowerFee()%></font>
					<input type="hidden" name="sumFee" value= "<%=townSataDto.getSumPowerFee()%>">
					</span>
					<br>
				</td>

			</tr>
			<%
				}
			%>
			<tr>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2">合计</font>
					<input type="hidden" name="userNo" value= "合计">
					<input type="hidden" name="lineCode" value= "sum">
					<input type="hidden" name="remark"
							value="7">
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=Math.round(sumfpower + Double.parseDouble(sumwpower)
								+ sumtownSataDto.getSumPower())%></font>
					<input type="hidden" name="electricQuantity" value=<%=Math.round(sumfpower + Double.parseDouble(sumwpower)
								+ sumtownSataDto.getSumPower()) %>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(sumwc) + sumfc
								+ sumtownSataDto.getPurePowerFee())%></font>
					<input type="hidden" name="fee" value=<%=df.format(Double.parseDouble(sumwc) + sumfc
								+ sumtownSataDto.getPurePowerFee())%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(sumwsanxia) + sumfsanxia
								+ sumtownSataDto.getPureSanXia())%></font>
					<input type="hidden" name="sanXiaFee" value=<%=df.format(Double.parseDouble(sumwsanxia) + sumfsanxia
								+ sumtownSataDto.getPureSanXia()) %>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(summwdianjin)
								+ summfdianjin
								+ sumtownSataDto.getPureDianJin())%></font>
					<input type="hidden" name="dianJin" value=<%=df.format(Double.parseDouble(summwdianjin)
								+ summfdianjin
								+ sumtownSataDto.getPureDianJin())%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(sumwjijin) + sumfjijin
								+ sumtownSataDto.getPureJiJin())%></font>
					<input type="hidden" name="jiJin" value=<%=df.format(Double.parseDouble(sumwjijin) + sumfjijin
								+ sumtownSataDto.getPureJiJin())%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(sumwtax) + sumftax
								+ sumtownSataDto.getPowerFeeTax())%></font>
								
					<input type="hidden" name="feeTax" value=<%=df.format(Double.parseDouble(sumwtax) + sumftax
								+ sumtownSataDto.getPowerFeeTax())%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
								.format(Double.parseDouble(sumwsanxiatax)
										+ sumfsanxiatax
										+ sumtownSataDto.getSanXiaTax())%></font>
					<input type="hidden" name="sanXiaTax" value=<%=df
								.format(Double.parseDouble(sumwsanxiatax)
										+ sumfsanxiatax
										+ sumtownSataDto.getSanXiaTax())%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(sumwdianjintax)
								+ sumfdianjintax
								+ sumtownSataDto.getDianJinTax())%></font>
					<input type="hidden" name="dianJinTax" value=<%=df.format(Double.parseDouble(sumwdianjintax)
								+ sumfdianjintax
								+ sumtownSataDto.getDianJinTax())%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(sumwjijintax)
								+ sumfjijintax + sumtownSataDto.getJiJinTax())%></font>
				    <input type="hidden" name="jiJinTax" value=<%=df.format(Double.parseDouble(sumwjijintax)
								+ sumfjijintax + sumtownSataDto.getJiJinTax())%>>
					</span>
					<br>
				</td>

				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantity) / 1.17)%></font>
					<input type="hidden" name="chabie" value=<%=df.format(Double
												.parseDouble(differenceQuantity) / 1.17)%>>
					</span>
					<br>
				</td>


				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df
										.format(Double
												.parseDouble(differenceQuantity) / 1.17 * 0.17)%></font>
					<input type="hidden" name="chabieTax" value=<%=df.format(Double
												.parseDouble(differenceQuantity) / 1.17 * 0.17)%>>
					</span>
					<br>
				</td>
				<td nowrap width="10%" align="center">
					<span class="title"><font size="2"><%=df.format(Double.parseDouble(sumwfee) + sumffee
								+ sumtownSataDto.getSumPowerFee())%></font>
					<input type="hidden" name="sumFee" value=<%=df.format(Double.parseDouble(sumwfee) + sumffee
								+ sumtownSataDto.getSumPowerFee())%>>
					</span>
					<br>
				</td>


			</tr>

		</table>
		<table cellpadding="0" cellspacing="0" width="100%">
			
			<tr class="listtitle" align="center">
				<td class=button align="center">
					<input type=button class=button name=button2 value=" 打 印 "
						onClick="printCount();">
				</td>
				<td class=button align="center">
					<input type=button class=button name=button2 value=" 保存报表 "
						onClick="submitForm();">
				</td>
			</tr>
		</table>

	</form>
</body>
<script language="javascript">
function printCount(){
  var b=fm.StartMonth.value;
strURL   =   "<%=request.getContextPath()%>/thismonthPrint.do?inputDate="+b;
	winPrint=window.open(strURL,"","left=2000,top=2000,fullscreen=yes,resizable=yes,scrollbars=yes,resizable=yes");     
}
</script>
<script language="javascript">
function submitForm(){
  var b=fm.StartMonth.value;
strURL   =   "<%=request.getContextPath()%>/saveReport.do?statMonth="+b;
	fm.action = strURL;
	fm.submit();
}
</script>



</html:html>
