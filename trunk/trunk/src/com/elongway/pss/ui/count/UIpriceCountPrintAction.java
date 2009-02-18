package com.elongway.pss.ui.count;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAllWholeFeeFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleDetailFacade;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;
import com.sinosoft.sysframework.common.datatype.DateTime;

public class UIpriceCountPrintAction extends Action{
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		String inputDate = httpServletRequest.getParameter("inputDate");
		inputDate = new DateTime(inputDate,DateTime.YEAR_TO_MONTH).toString();
		httpServletRequest.setAttribute("inputDate",inputDate);
		LwWholeSaleDetailDto lwWholeSaleDetailDtogy = new LwWholeSaleDetailDto();
		LwWholeSaleDetailDto lwWholeSaleDetailDtodm = new LwWholeSaleDetailDto();
		LwWholeSaleDetailDto lwWholeSaleDetailDtojy = new LwWholeSaleDetailDto();
		LwWholeSaleDetailDto lwWholeSaleDetailDtoty = new LwWholeSaleDetailDto();
		BLLwWholeSaleDetailFacade bLLwWholeSaleDetailFacade = new BLLwWholeSaleDetailFacade();
		lwWholeSaleDetailDtogy = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"gy", inputDate);
		lwWholeSaleDetailDtodm = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"dm", inputDate);
		lwWholeSaleDetailDtojy = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"jy", inputDate);
		lwWholeSaleDetailDtoty = bLLwWholeSaleDetailFacade.findByPrimaryKey(
				"ty", inputDate);
		/*
		 * 求各种用电类型总电量
		 * junwei
		 */
		double UnDenizenQuantity10kvSum = lwWholeSaleDetailDtogy
				.getUnDenizenQuantity10kv()
				+ lwWholeSaleDetailDtodm.getUnDenizenQuantity10kv()
				+ lwWholeSaleDetailDtojy.getUnDenizenQuantity10kv()
				+ lwWholeSaleDetailDtoty.getUnDenizenQuantity10kv();
		double UnDenizenQuantity35kvSum = lwWholeSaleDetailDtogy
				.getUnDenizenQuantity35kv()
				+ lwWholeSaleDetailDtodm.getUnDenizenQuantity35kv()
				+ lwWholeSaleDetailDtojy.getUnDenizenQuantity35kv()
				+ lwWholeSaleDetailDtoty.getUnDenizenQuantity35kv();
		double DenizenQuantity10kvSum = lwWholeSaleDetailDtogy
				.getDenizenQuantity10kv()
				+ lwWholeSaleDetailDtodm.getDenizenQuantity10kv()
				+ lwWholeSaleDetailDtojy.getDenizenQuantity10kv()
				+ lwWholeSaleDetailDtoty.getDenizenQuantity10kv();
		double DenizenQuantity35kvSum = lwWholeSaleDetailDtogy
				.getDenizenQuantity35kv()
				+ lwWholeSaleDetailDtodm.getDenizenQuantity35kv()
				+ lwWholeSaleDetailDtojy.getDenizenQuantity35kv()
				+ lwWholeSaleDetailDtoty.getDenizenQuantity35kv();
		double UnIndustryQuantity10kvSum = lwWholeSaleDetailDtogy
				.getUnIndustryQuantity10kv()
				+ lwWholeSaleDetailDtodm.getUnIndustryQuantity10kv()
				+ lwWholeSaleDetailDtojy.getUnIndustryQuantity10kv()
				+ lwWholeSaleDetailDtoty.getUnIndustryQuantity10kv();
		double UnIndustryQuantity35kvSum = lwWholeSaleDetailDtogy
				.getUnIndustryQuantity35kv()
				+ lwWholeSaleDetailDtodm.getUnIndustryQuantity35kv()
				+ lwWholeSaleDetailDtojy.getUnIndustryQuantity35kv()
				+ lwWholeSaleDetailDtoty.getUnIndustryQuantity35kv();
		double ProductQuantity10kvSum = lwWholeSaleDetailDtogy
				.getProductQuantity10kv()
				+ lwWholeSaleDetailDtodm.getProductQuantity10kv()
				+ lwWholeSaleDetailDtojy.getProductQuantity10kv()
				+ lwWholeSaleDetailDtoty.getProductQuantity10kv();
		double ProductQuantity35kvSum = lwWholeSaleDetailDtogy
				.getProductQuantity35kv()
				+ lwWholeSaleDetailDtodm.getProductQuantity35kv()
				+ lwWholeSaleDetailDtojy.getProductQuantity35kv()
				+ lwWholeSaleDetailDtoty.getProductQuantity35kv();
		double FarmUseQuantity10kvSum = lwWholeSaleDetailDtogy
				.getFarmUseQuantity10kv()
				+ lwWholeSaleDetailDtodm.getFarmUseQuantity10kv()
				+ lwWholeSaleDetailDtojy.getFarmUseQuantity10kv()
				+ lwWholeSaleDetailDtoty.getFarmUseQuantity10kv();
		double FarmUseQuantity35kvSum = lwWholeSaleDetailDtogy
				.getFarmUseQuantity35kv()
				+ lwWholeSaleDetailDtodm.getFarmUseQuantity35kv()
				+ lwWholeSaleDetailDtojy.getFarmUseQuantity35kv()
				+ lwWholeSaleDetailDtoty.getFarmUseQuantity35kv();
		double BizQuantity10kvSum = lwWholeSaleDetailDtogy.getBizQuantity10kv()
				+ lwWholeSaleDetailDtodm.getBizQuantity10kv()
				+ lwWholeSaleDetailDtojy.getBizQuantity10kv()
				+ lwWholeSaleDetailDtoty.getBizQuantity10kv();
		double BizQuantity35kvSum = lwWholeSaleDetailDtogy.getBizQuantity35kv()
				+ lwWholeSaleDetailDtodm.getBizQuantity35kv()
				+ lwWholeSaleDetailDtojy.getBizQuantity35kv()
				+ lwWholeSaleDetailDtoty.getBizQuantity35kv();
		/*
		 * 求各种用电类型总电费
		 * junwei
		 */
		double UnDenizenMoney10kvSum = lwWholeSaleDetailDtogy
				.getUnDenizenMoney10kv()
				+ lwWholeSaleDetailDtodm.getUnDenizenMoney10kv()
				+ lwWholeSaleDetailDtojy.getUnDenizenMoney10kv()
				+ lwWholeSaleDetailDtoty.getUnDenizenMoney10kv();
		double DenizenMoney10kvSum = lwWholeSaleDetailDtogy
				.getDenizenMoney10kv()
				+ lwWholeSaleDetailDtodm.getDenizenMoney10kv()
				+ lwWholeSaleDetailDtojy.getDenizenMoney10kv()
				+ lwWholeSaleDetailDtoty.getDenizenMoney10kv();
		double UnIndustryMoney10kvSum = lwWholeSaleDetailDtogy
				.getUnIndustryMoney10kv()
				+ lwWholeSaleDetailDtodm.getUnIndustryMoney10kv()
				+ lwWholeSaleDetailDtojy.getUnIndustryMoney10kv()
				+ lwWholeSaleDetailDtoty.getUnIndustryMoney10kv();
		double ProductMoney10kvSum = lwWholeSaleDetailDtogy
				.getProductMoney10kv()
				+ lwWholeSaleDetailDtodm.getProductMoney10kv()
				+ lwWholeSaleDetailDtojy.getProductMoney10kv()
				+ lwWholeSaleDetailDtoty.getProductMoney10kv();
		double FarmUseMoney10kvSum = lwWholeSaleDetailDtogy
				.getFarmUseMoney10kv()
				+ lwWholeSaleDetailDtodm.getFarmUseMoney10kv()
				+ lwWholeSaleDetailDtojy.getFarmUseMoney10kv()
				+ lwWholeSaleDetailDtoty.getFarmUseMoney10kv();
		double BizMoney10kvSum = lwWholeSaleDetailDtogy.getBizMoney10kv()
				+ lwWholeSaleDetailDtodm.getBizMoney10kv()
				+ lwWholeSaleDetailDtojy.getBizMoney10kv()
				+ lwWholeSaleDetailDtoty.getBizMoney10kv();
		double UnDenizenMoney35kvSum = lwWholeSaleDetailDtogy
				.getUnDenizenMoney35kv()
				+ lwWholeSaleDetailDtodm.getUnDenizenMoney35kv()
				+ lwWholeSaleDetailDtojy.getUnDenizenMoney35kv()
				+ lwWholeSaleDetailDtoty.getUnDenizenMoney35kv();
		double DenizenMoney35kvSum = lwWholeSaleDetailDtogy
				.getDenizenMoney35kv()
				+ lwWholeSaleDetailDtodm.getDenizenMoney35kv()
				+ lwWholeSaleDetailDtojy.getDenizenMoney35kv()
				+ lwWholeSaleDetailDtoty.getDenizenMoney35kv();
		double UnIndustryMoney35kvSum = lwWholeSaleDetailDtogy
				.getUnIndustryMoney35kv()
				+ lwWholeSaleDetailDtodm.getUnIndustryMoney35kv()
				+ lwWholeSaleDetailDtojy.getUnIndustryMoney35kv()
				+ lwWholeSaleDetailDtoty.getUnIndustryMoney35kv();
		double ProductMoney35kvSum = lwWholeSaleDetailDtogy
				.getProductMoney35kv()
				+ lwWholeSaleDetailDtodm.getProductMoney35kv()
				+ lwWholeSaleDetailDtojy.getProductMoney35kv()
				+ lwWholeSaleDetailDtoty.getProductMoney35kv();
		double FarmUseMoney35kvSum = lwWholeSaleDetailDtogy
				.getFarmUseMoney35kv()
				+ lwWholeSaleDetailDtodm.getFarmUseMoney35kv()
				+ lwWholeSaleDetailDtojy.getFarmUseMoney35kv()
				+ lwWholeSaleDetailDtoty.getFarmUseMoney35kv();
		double BizMoney35kvSum = lwWholeSaleDetailDtogy.getBizMoney35kv()
				+ lwWholeSaleDetailDtodm.getBizMoney35kv()
				+ lwWholeSaleDetailDtojy.getBizMoney35kv()
				+ lwWholeSaleDetailDtoty.getBizMoney35kv();
		LwWholeSaleDetailDto lwWholeSaleDetailDto = new LwWholeSaleDetailDto();
		lwWholeSaleDetailDto.setUnDenizenQuantity10kv(UnDenizenQuantity10kvSum);
		lwWholeSaleDetailDto.setDenizenQuantity10kv(DenizenQuantity10kvSum);
		lwWholeSaleDetailDto
				.setUnIndustryQuantity10kv(UnIndustryQuantity10kvSum);
		lwWholeSaleDetailDto.setProductQuantity10kv(ProductQuantity10kvSum);
		lwWholeSaleDetailDto.setFarmUseQuantity10kv(FarmUseQuantity10kvSum);
		lwWholeSaleDetailDto.setBizQuantity10kv(BizQuantity10kvSum);
		lwWholeSaleDetailDto.setUnDenizenQuantity35kv(UnDenizenQuantity35kvSum);
		lwWholeSaleDetailDto.setDenizenQuantity35kv(DenizenQuantity35kvSum);
		lwWholeSaleDetailDto
				.setUnIndustryQuantity35kv(UnIndustryQuantity35kvSum);
		lwWholeSaleDetailDto.setProductQuantity35kv(ProductQuantity35kvSum);
		lwWholeSaleDetailDto.setFarmUseQuantity35kv(FarmUseQuantity35kvSum);
		lwWholeSaleDetailDto.setBizQuantity35kv(BizQuantity35kvSum);
		lwWholeSaleDetailDto.setUnDenizenMoney10kv(UnDenizenMoney10kvSum);
		lwWholeSaleDetailDto.setDenizenMoney10kv(DenizenMoney10kvSum);
		lwWholeSaleDetailDto.setUnIndustryMoney10kv(UnIndustryMoney10kvSum);
		lwWholeSaleDetailDto.setProductMoney10kv(ProductMoney10kvSum);
		lwWholeSaleDetailDto.setFarmUseMoney10kv(FarmUseMoney10kvSum);
		lwWholeSaleDetailDto.setBizMoney10kv(BizMoney10kvSum);
		lwWholeSaleDetailDto.setUnDenizenMoney35kv(UnDenizenMoney35kvSum);
		lwWholeSaleDetailDto.setDenizenMoney35kv(DenizenMoney35kvSum);
		lwWholeSaleDetailDto.setUnIndustryMoney35kv(UnIndustryMoney35kvSum);
		lwWholeSaleDetailDto.setProductMoney35kv(ProductMoney35kvSum);
		lwWholeSaleDetailDto.setFarmUseMoney35kv(FarmUseMoney35kvSum);
		lwWholeSaleDetailDto.setBizMoney35kv(BizMoney35kvSum);
		
		/*
		 * 求三峡
		 * junwei
		 */
		BLLwAllWholeFeeFacade bLLwAllWholeFeeFacade = new BLLwAllWholeFeeFacade();
		LwAllWholeFeeDto lwAllWholeFeeDtogy = new LwAllWholeFeeDto();
		LwAllWholeFeeDto lwAllWholeFeeDtodm = new LwAllWholeFeeDto();
		LwAllWholeFeeDto lwAllWholeFeeDtojy = new LwAllWholeFeeDto();
		LwAllWholeFeeDto lwAllWholeFeeDtoty = new LwAllWholeFeeDto();
		lwAllWholeFeeDtogy = bLLwAllWholeFeeFacade.findByPrimaryKey("gy",inputDate);
		lwAllWholeFeeDtodm = bLLwAllWholeFeeFacade.findByPrimaryKey("dm",inputDate);
		lwAllWholeFeeDtojy = bLLwAllWholeFeeFacade.findByPrimaryKey("jy",inputDate);
		lwAllWholeFeeDtoty = bLLwAllWholeFeeFacade.findByPrimaryKey("ty",inputDate);
		
		/*
		 * 求各局三峡综合
		 */
		System.out.println("--------->>>>"+lwAllWholeFeeDtogy.getSanxia());
		System.out.println("--------->>>>"+lwAllWholeFeeDtodm.getSanxia());
		System.out.println("--------->>>>"+lwAllWholeFeeDtojy.getSanxia());
		String sanXiagy = lwAllWholeFeeDtogy.getSanxia();
		String sanXiaty = lwAllWholeFeeDtoty.getSanxia();
		String sanXiadm = lwAllWholeFeeDtodm.getSanxia();
		String sanXiajy = lwAllWholeFeeDtojy.getSanxia();
		String sanXiaTaxgy = lwAllWholeFeeDtogy.getSanxiatax();
		String sanXiaTaxty = lwAllWholeFeeDtoty.getSanxiatax();
		String sanXiaTaxdm = lwAllWholeFeeDtodm.getSanxiatax();
		String sanXiaTaxjy = lwAllWholeFeeDtojy.getSanxiatax();
		String jiJingy = lwAllWholeFeeDtogy.getJijin();
		String jiJinty = lwAllWholeFeeDtoty.getJijin();
		String jiJindm = lwAllWholeFeeDtodm.getJijin();
		String jiJinjy = lwAllWholeFeeDtojy.getJijin();
		String fuJia1gy = lwAllWholeFeeDtogy.getFujia1();
		String fuJia1ty = lwAllWholeFeeDtoty.getFujia1();
		String fuJia1dm = lwAllWholeFeeDtodm.getFujia1();
		String fuJia1jy = lwAllWholeFeeDtojy.getFujia1();
		String dianJingy = lwAllWholeFeeDtogy.getDianjin();
		String dianJinty = lwAllWholeFeeDtoty.getDianjin();
		String dianJindm = lwAllWholeFeeDtodm.getDianjin();
		String dianJinjy = lwAllWholeFeeDtojy.getDianjin();
		String dianJinTaxgy = lwAllWholeFeeDtogy.getDianjintax();
		String dianJinTaxty = lwAllWholeFeeDtoty.getDianjintax();
		String dianJinTaxdm = lwAllWholeFeeDtodm.getDianjintax();
		String dianJinTaxjy = lwAllWholeFeeDtojy.getDianjintax();
		String sumFeegy = lwAllWholeFeeDtogy.getSumfee();
		String sumFeety = lwAllWholeFeeDtoty.getSumfee();
		String sumFeedm = lwAllWholeFeeDtodm.getSumfee();
		String sumFeejy = lwAllWholeFeeDtojy.getSumfee();
		if(sumFeegy.equals("")||sumFeegy==null){
			sumFeegy="0";
		}
		if(sumFeety.equals("")||sumFeety==null){
			sumFeety="0";
		}
		if(sumFeedm.equals("")||sumFeedm==null){
			sumFeedm="0";
		}
		if(sumFeejy.equals("")||sumFeejy==null){
			sumFeejy="0";
		}
		
		
		if(dianJingy.equals("")||dianJingy==null){
			dianJingy="0";
		}
		if(dianJinty.equals("")||dianJinty==null){
			dianJinty="0";
		}
		if(dianJindm.equals("")||dianJindm==null){
			dianJindm="0";
		}
		if(dianJinjy.equals("")||dianJinjy==null){
			dianJinjy="0";
		}
		
		if(dianJinTaxgy.equals("")||dianJinTaxgy==null){
			dianJinTaxgy="0";
		}
		if(dianJinTaxty.equals("")||dianJinTaxty==null){
			dianJinTaxty="0";
		}
		if(dianJinTaxdm.equals("")||dianJinTaxdm==null){
			dianJinTaxdm="0";
		}
		if(dianJinTaxjy.equals("")||dianJinTaxjy==null){
			dianJinTaxjy="0";
		}
		
		
		
		
		
		if(jiJingy.equals("")||jiJingy==null){
			jiJingy="0";
		}
		if(jiJinty.equals("")||jiJinty==null){
			jiJinty="0";
		}
		if(jiJindm.equals("")||jiJindm==null){
			jiJindm="0";
		}
		if(jiJinjy.equals("")||jiJinjy==null){
			jiJinjy="0";
		}
		
		if(fuJia1gy.equals("")||fuJia1gy==null){
			fuJia1gy="0";
		}
		if(fuJia1ty.equals("")||fuJia1ty==null){
			fuJia1ty="0";
		}
		if(fuJia1dm.equals("")||fuJia1dm==null){
			fuJia1dm="0";
		}
		if(fuJia1jy.equals("")||fuJia1jy==null){
			fuJia1jy="0";
		}
		
		if(sanXiagy.equals("")||sanXiagy==null){
			sanXiagy="0";
		}
		if(sanXiaty.equals("")||sanXiaty==null){
			sanXiaty="0";
		}
		if(sanXiadm.equals("")||sanXiadm==null){
			sanXiadm="0";
		}
		if(sanXiajy.equals("")||sanXiajy==null){
			sanXiajy="0";
		}
		if(sanXiaTaxgy.equals("")||sanXiaTaxgy==null){
			sanXiaTaxgy="0";
		}
		if(sanXiaTaxty.equals("")||sanXiaTaxty==null){
			sanXiaTaxty="0";
		}
		if(sanXiaTaxdm.equals("")||sanXiaTaxdm==null){
			sanXiaTaxdm="0";
		}
		if(sanXiaTaxjy.equals("")||sanXiaTaxjy==null){
			sanXiaTaxjy="0";
		}
		double sanXiaSum = Double.parseDouble(sanXiagy)+Double.parseDouble(sanXiadm)+Double.parseDouble(sanXiajy)+Double.parseDouble(sanXiaty);
		double jiJinSum = Double.parseDouble(jiJingy)+Double.parseDouble(jiJindm)+Double.parseDouble(jiJinty)+Double.parseDouble(jiJinjy);
		double dianJinSum = Double.parseDouble(dianJinty)+Double.parseDouble(dianJindm)+Double.parseDouble(dianJinty)+Double.parseDouble(dianJinjy);
		double sanXiaTaxSum = Double.parseDouble(sanXiaTaxgy)+Double.parseDouble(sanXiaTaxty)+Double.parseDouble(sanXiaTaxdm)+Double.parseDouble(sanXiaTaxjy);
		double jiJinTaxSum = Double.parseDouble(fuJia1jy)+Double.parseDouble(fuJia1ty)+Double.parseDouble(fuJia1gy)+Double.parseDouble(fuJia1dm);
		double dianJinTaxSum = Double.parseDouble(dianJinTaxjy)+Double.parseDouble(dianJinTaxgy)+Double.parseDouble(dianJinTaxdm)+Double.parseDouble(dianJinTaxty);
		double sumFee = Double.parseDouble(sumFeejy)+Double.parseDouble(sumFeegy)+Double.parseDouble(sumFeedm)+Double.parseDouble(sumFeety);
		LwAllWholeFeeDto lwAllWholeFeeDto = new LwAllWholeFeeDto();
		lwAllWholeFeeDto.setSanxia(sanXiaSum+"");
		lwAllWholeFeeDto.setJijin(jiJinSum+"");
		lwAllWholeFeeDto.setDianjin(dianJinSum+"");
		lwAllWholeFeeDto.setSanxiatax(sanXiaTaxSum+"");
		lwAllWholeFeeDto.setFujia1(jiJinTaxSum+"");
		lwAllWholeFeeDto.setDianjintax(dianJinTaxSum+"");
		lwAllWholeFeeDto.setSumfee(sumFee+"");
		
		
		httpServletRequest.setAttribute("lwAllWholeFeeDto", lwAllWholeFeeDto);
		
		httpServletRequest.setAttribute("lwWholeSaleDetailDto",
				lwWholeSaleDetailDto);
				return actionMapping.findForward("printPriceCount");
		
	}

}
