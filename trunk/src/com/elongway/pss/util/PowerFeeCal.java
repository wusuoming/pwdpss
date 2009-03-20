package com.elongway.pss.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwLineCTFacade;
import com.elongway.pss.bl.facade.BLLwLinePTFacade;
import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLLwRateCodeFacade;
import com.elongway.pss.bl.facade.BLLwSalePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwctFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;
import com.elongway.pss.bl.facade.BLLwptFacade;
import com.elongway.pss.dto.custom.ChangeAmmeterDto;
import com.elongway.pss.dto.custom.SalePriceDto;
import com.elongway.pss.dto.custom.TownSataDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwAmmeterIndicatorDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwLineCTDto;
import com.elongway.pss.dto.domain.LwLinePTDto;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwRateCodeDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryAppendDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.dto.domain.LwctDto;
import com.elongway.pss.dto.domain.LwindicatorDto;
import com.elongway.pss.dto.domain.LwptDto;
import com.sinosoft.sysframework.common.datatype.DateTime;

/**
 * 电费计算公式 version 1.0 create by 王荣佳 2008 .10 .10
 * 
 */

public class PowerFeeCal {

	public final static double zero = Double.parseDouble("0");

	// 电费总计
	public double sumPowerFee(String meritoriousPointer,
			String unMeritoriousPointer, String lineNo, String inputDAte,
			String CT, String PT) throws Exception {

		String lastMonth = String.valueOf(Integer.parseInt(inputDAte.substring(
				4, 6)) - 1);
		if (lastMonth.length() == 1) {
			lastMonth = "0" + lastMonth;
		}
		String lastInputDate = inputDAte.substring(0, 4) + lastMonth;
		LwindicatorDto lwindicatorDto = new LwindicatorDto();
		BLLwindicatorFacade blLwindicatorFacade = new BLLwindicatorFacade();
		Collection Lwindicatorcollection = new ArrayList();
		String conditions = "1=1 and  lineNo='" + lineNo
				+ "' and inputdate like '" + lastInputDate + "%'";
		Lwindicatorcollection = blLwindicatorFacade
				.findByConditions(conditions);
		Iterator it = Lwindicatorcollection.iterator();

		double sumPowerFee;
		while (it.hasNext()) {
			lwindicatorDto = (LwindicatorDto) it.next();
		}

		int lastmeritoriousPointer = lwindicatorDto.getThisWorkNum();
		int lastunMeritoriousPointer = lwindicatorDto.getThisIdleNum();
		String electrotherapy = String.valueOf(Integer
				.parseInt(meritoriousPointer)
				- lastmeritoriousPointer);// 电量
		BLLwPowerLineFacade blLwPowerLineFacade = new BLLwPowerLineFacade();
		PowerFeeCal powerFeeCal = new PowerFeeCal();
		double Rate = powerFeeCal.getRateCode(lineNo);
		sumPowerFee = (Integer.parseInt(meritoriousPointer) - lastmeritoriousPointer)
				* Rate;

		return (double) (Math.round((double) sumPowerFee * 10000) / 10000);
	}

	// 获得电表上月的信息
	public static LwindicatorDto getinfo(String lineNo, String inputDAte)
			throws Exception {
		String lastMonth = String.valueOf(Integer.parseInt(inputDAte.substring(
				4, 6)) - 1);
		if (lastMonth.length() == 1) {
			lastMonth = "0" + lastMonth;
		}
		String lastInputDate = inputDAte.substring(0, 4) + lastMonth;
		LwindicatorDto lwindicatorDto = new LwindicatorDto();
		BLLwindicatorFacade blLwindicatorFacade = new BLLwindicatorFacade();
		Collection Lwindicatorcollection = new ArrayList();
		String conditions = "1=1 and  linecode='" + lineNo
				+ "' and inputdate like '" + lastInputDate + "%'";
		Lwindicatorcollection = blLwindicatorFacade
				.findByConditions(conditions);
		Iterator it = Lwindicatorcollection.iterator();

		double sumPowerFee;
		while (it.hasNext()) {
			lwindicatorDto = (LwindicatorDto) it.next();
		}
		return lwindicatorDto;
	}

	// 获得调整值
	public static double adjustmentValue(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte) throws Exception {

		// -- 声明变量
		if (PowerClass.equals("1") || PowerClass.equals("2")) {
			PowerClass = "1";
		}
		LwRateCodeDto lwRateCodeDto = new LwRateCodeDto();
		Collection rateCodecollection = new ArrayList();
		BLLwRateCodeFacade blLwRateCodeFacade = new BLLwRateCodeFacade();

		// -- 得到功率因数
		double powerFactor = adjustrate(meritoriousPointer,
				unMeritoriousPointer, PowerClass, lineNo, inputDAte);

		// -- 查找调整率
		String sql = "1=1 and POWERFACTOR =" + powerFactor
				+ " and SUPPLETYPE='" + PowerClass + "'";
		rateCodecollection = blLwRateCodeFacade.findByConditions(sql);
		Iterator ratecode = rateCodecollection.iterator();
		while (ratecode.hasNext()) {
			lwRateCodeDto = (LwRateCodeDto) ratecode.next();
		}
		return Double.parseDouble(lwRateCodeDto.getAdjustRate());
	}

	// 功率因素
	public static double adjustrate(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte) throws Exception {
		if (PowerClass.equals("1") || PowerClass.equals("2")) {
			PowerClass = "1";
		}
		String lastMonth = String.valueOf(Integer.parseInt(inputDAte.substring(
				4, 6)) - 1);
		if (lastMonth.length() == 1) {
			lastMonth = "0" + lastMonth;
		}
		String lastInputDate = inputDAte.substring(0, 4) + lastMonth;

		double powerFactor;
		LwFactoryIndicatorDto lwFactoryIndicatorDto = new LwFactoryIndicatorDto();
		BLLwFactoryIndicatorFacade blLwFactoryIndicatorFacade = new BLLwFactoryIndicatorFacade();
		Collection Lwindicatorcollection = new ArrayList();
		String conditions = "1=1 and  userNo='" + lineNo
				+ "'and inputdate like '" + lastInputDate + "%'";
		Lwindicatorcollection = blLwFactoryIndicatorFacade
				.findByConditions(conditions);
		Iterator it = Lwindicatorcollection.iterator();
		String electrotherapy;// 电量
		double powerFactorTmp;
		double lastmeritoriousPointer = 0;
		double lastunMeritoriousPointer = 0;
		while (it.hasNext()) {
			lwFactoryIndicatorDto = (LwFactoryIndicatorDto) it.next();
			lastmeritoriousPointer = lwFactoryIndicatorDto.getThisWorkNum();
			lastunMeritoriousPointer = lwFactoryIndicatorDto.getThisIdleNum();
		}

		double bb = ((Double.parseDouble(unMeritoriousPointer) - lastunMeritoriousPointer) * (Double
				.parseDouble(unMeritoriousPointer) - lastunMeritoriousPointer))
				/ ((Double.parseDouble(meritoriousPointer) - lastmeritoriousPointer) * (Double
						.parseDouble(meritoriousPointer) - lastmeritoriousPointer));
		double aa = Math.sqrt(1 + bb);
		System.out.println("----------------------=" + aa);
		powerFactorTmp = (1 / aa);
		powerFactor = (double) ((Math.round((double) powerFactorTmp * 100)));

		return powerFactor;

	}

	// 修改后的取功率因素 wangrongjia
	public static double poweradjustrate(String workQuantity,
			String unworkQuantity) throws Exception {
		double powerFactor = 0;
		if(((workQuantity.equals("0"))&&(unworkQuantity.equals("0")))||((workQuantity.equals("0.0"))&&(unworkQuantity.equals("0.0")))||Double.parseDouble(workQuantity)<0||Double.parseDouble(unworkQuantity)<0){
			powerFactor=0;
		}else{
		DecimalFormat df = new DecimalFormat("###0.000");
		float a1 = Float.parseFloat(workQuantity);
		float a2 = Float.parseFloat(unworkQuantity);
		float b1 = a1 * a1;
		float b2 = a2 * a2;
		double c1 = Math.sqrt(1 + b2 / b1);
		double c2 = 1 / c1;
		double a = Double.parseDouble(df.format(c2));

		powerFactor = Math.round(a * 100);}
		return powerFactor;

	}

	// 修改后的获得调整值 wangrongjia
	public static double poweradjustmentValue(String workQuantity,
			String unworkQuantity, String PowerClass,String rateCode) throws Exception {

		// -- 声明变量
		if (PowerClass.equals("1") || PowerClass.equals("2")) {
			PowerClass = "1";
		}
		LwRateCodeDto lwRateCodeDto = new LwRateCodeDto();
		Collection rateCodecollection = new ArrayList();
		BLLwRateCodeFacade blLwRateCodeFacade = new BLLwRateCodeFacade();
		double ajust=0;
		// -- 得到功率因数
		//double powerFactor = poweradjustrate(workQuantity, unworkQuantity);
		double powerFactor=Double.parseDouble(rateCode)*100;
		if(powerFactor==0){
			ajust=0;
		}else{
		// -- 查找调整率
		String sql = "1=1 and POWERFACTOR =" + powerFactor
				+ " and SUPPLETYPE='" + PowerClass + "'";
		
		rateCodecollection = blLwRateCodeFacade.findByConditions(sql);
		Iterator ratecode = rateCodecollection.iterator();
		if(ratecode!=null){
		while (ratecode.hasNext()) {
			lwRateCodeDto = (LwRateCodeDto) ratecode.next();
			ajust=Double.parseDouble(lwRateCodeDto.getAdjustRate());
		}
		}else{
			ajust=(0.54-powerFactor)/0.01*0.02;
		}
		}
		return ajust;
	}
	//趸售标准电价
	public static LwWholeSalePurePriceDto getPurWholeSalePrice(String comcode,String KV)throws Exception{
		LwWholeSalePurePriceDto lwWholeSalePurePriceDto=new LwWholeSalePurePriceDto();
		BLLwWholeSalePurePriceFacade blLwWholeSalePurePriceFacade=new BLLwWholeSalePurePriceFacade();
		lwWholeSalePurePriceDto=blLwWholeSalePurePriceFacade.findByPrimaryKey(KV, comcode);
		return lwWholeSalePurePriceDto;
	}
	public static double  poweradjustmentCorporationValue(String workQuantity,
			String unworkQuantity, String PowerClass) throws Exception {

		// -- 声明变量
		if (PowerClass.equals("1") || PowerClass.equals("2")) {
			PowerClass = "1";
		}
		LwRateCodeDto lwRateCodeDto = new LwRateCodeDto();
		Collection rateCodecollection = new ArrayList();
		BLLwRateCodeFacade blLwRateCodeFacade = new BLLwRateCodeFacade();
		double ajust=0;
		// -- 得到功率因数
		double powerFactor = poweradjustrate(workQuantity, unworkQuantity);
		
		if(powerFactor==0){
			ajust=0;
		}else{
		// -- 查找调整率
		String sql = "1=1 and POWERFACTOR =" + powerFactor
				+ " and SUPPLETYPE='" + PowerClass + "'";
		System.out.print("a");
		rateCodecollection = blLwRateCodeFacade.findByConditions(sql);
		Iterator ratecode = rateCodecollection.iterator();
		while (ratecode.hasNext()) {
			lwRateCodeDto = (LwRateCodeDto) ratecode.next();
			ajust=Double.parseDouble(lwRateCodeDto.getAdjustRate());
		}
		}
		return ajust;
	}
	// 获得趸售的比例分摊
	public static LwWholeSaleProrateDto getWholeProrate(String comeCode,String userName) throws Exception {
		
		String conditions = "";
		BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade = new BLLwWholeSaleUserInfoFacade();
		LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = new LwWholeSaleUserInfoDto();
		lwWholeSaleUserInfoDto = blLwWholeSaleUserInfoFacade
				.findByPrimaryKey(comeCode);
		String  VoltLevel = lwWholeSaleUserInfoDto
				.getVoltage();
		BLLwWholeSaleProrateFacade blLwWholeSaleProrateFacade=new BLLwWholeSaleProrateFacade();
		LwWholeSaleProrateDto lwWholeSaleProrateDto = new LwWholeSaleProrateDto();
		lwWholeSaleProrateDto = blLwWholeSaleProrateFacade.findByPrimaryKey(userName,VoltLevel);
		return lwWholeSaleProrateDto;
	}


	/**
	 * 有功指针
	 * 
	 * @param meritoriousPointer
	 * @param unMeritoriousPointer
	 * @param PowerClass
	 * @param lineNo
	 * @param inputDAte
	 * @return
	 * @throws Exception
	 */
	public static int electrotherapy(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte) throws Exception {

		String lastMonth = String.valueOf(Integer.parseInt(inputDAte.substring(
				4, 6)) - 1);
		if (lastMonth.length() == 1) {
			lastMonth = "0" + lastMonth;
		}
		String lastInputDate = inputDAte.substring(0, 4) + lastMonth;
		LwFactoryIndicatorDto lwFactoryIndicatorDto = new LwFactoryIndicatorDto();
		BLLwFactoryIndicatorFacade blLwFactoryIndicatorFacade = new BLLwFactoryIndicatorFacade();
		Collection Lwindicatorcollection = new ArrayList();
		double lastmeritoriousPointer = 0;
		double lastunMeritoriousPointer = 0;
		String conditions = "1=1 and  userNo='" + lineNo
				+ "' and inputdate like '" + lastInputDate + "%'";
		Lwindicatorcollection = blLwFactoryIndicatorFacade
				.findByConditions(conditions);
		Iterator it = Lwindicatorcollection.iterator();

		while (it.hasNext()) {
			lwFactoryIndicatorDto = (LwFactoryIndicatorDto) it.next();
		}
		if (lwFactoryIndicatorDto != null) {
			lastmeritoriousPointer = lwFactoryIndicatorDto.getThisWorkNum();
			lastunMeritoriousPointer = lwFactoryIndicatorDto.getThisIdleNum();
		}
		//int electrotherapy = Integer.parseInt(meritoriousPointer)
			//	- lastmeritoriousPointer;
		return 0;
	}

	// 大工业取居民电量
	public static int pepoleElectrotherapy(String meritoriousPointer,
			String PowerClass, String lineNo, String inputDAte)
			throws Exception {

		String lastMonth = String.valueOf(Integer.parseInt(inputDAte.substring(
				4, 6)) - 1);
		if (lastMonth.length() == 1) {
			lastMonth = "0" + lastMonth;
		}
		String lastInputDate = inputDAte.substring(0, 4) + lastMonth;
		LwFactoryIndicatorDto lwFactoryIndicatorDto = new LwFactoryIndicatorDto();
		BLLwFactoryIndicatorFacade blLwFactoryIndicatorFacade = new BLLwFactoryIndicatorFacade();
		Collection Lwindicatorcollection = new ArrayList();
		int lastmeritoriousPointer = 0;
		int lastunMeritoriousPointer = 0;
		String conditions = "1=1 and  userNo='" + lineNo
				+ "' and inputdate like '" + lastInputDate + "%'";
		Lwindicatorcollection = blLwFactoryIndicatorFacade
				.findByConditions(conditions);
		Iterator it = Lwindicatorcollection.iterator();

		while (it.hasNext()) {
			lwFactoryIndicatorDto = (LwFactoryIndicatorDto) it.next();
		}
		if (lwFactoryIndicatorDto != null) {
			//lastmeritoriousPointer = lwFactoryIndicatorDto
					//.getPeopleThisWorkNum();
			// lastunMeritoriousPointer =
			// lwFactoryIndicatorDto.getPeopleThisIdleNum();
		}
		int electrotherapy = Integer.parseInt(meritoriousPointer)
				- lastmeritoriousPointer;
		return electrotherapy;
	}

	// 总无功电量的计算公式

	public double unelectrotherapy(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte) throws Exception {
		String lastMonth = String.valueOf(Integer.parseInt(inputDAte.substring(
				4, 6)) - 1);
		if (lastMonth.length() == 1) {
			lastMonth = "0" + lastMonth;
		}
		String lastInputDate = inputDAte.substring(0, 4) + lastMonth;
		LwFactoryIndicatorDto lwFactoryIndicatorDto = new LwFactoryIndicatorDto();
		BLLwFactoryIndicatorFacade blLwFactoryIndicatorFacade = new BLLwFactoryIndicatorFacade();
		Collection Lwindicatorcollection = new ArrayList();
		String conditions = "1=1 and  userNo='" + lineNo
				+ "'and inputdate like '" + lastInputDate + "%'";
		Lwindicatorcollection = blLwFactoryIndicatorFacade
				.findByConditions(conditions);
		Iterator it = Lwindicatorcollection.iterator();

		double sumPowerFee;
		while (it.hasNext()) {
			lwFactoryIndicatorDto = (LwFactoryIndicatorDto) it.next();
		}

		//int lastmeritoriousPointer = lwFactoryIndicatorDto.getThisWorkNum();
		//int lastunMeritoriousPointer = lwFactoryIndicatorDto.getThisIdleNum();
		//double unelectrotherapy = Integer.parseInt(unMeritoriousPointer)
				//- lastunMeritoriousPointer;// 电量
		return 0;
	}

	// 三峡金
	public Double sanXiaFee(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte, String company) throws Exception {
		int electrotherapy = electrotherapy(meritoriousPointer,
				unMeritoriousPointer, PowerClass, lineNo, inputDAte);
		Double sanXiaFee;
		String nongGuan = "";
		if (company.equals("gy") || company.equals("dm")) {
			sanXiaFee = (electrotherapy - Double.parseDouble(nongGuan)) * 0.004 * 0.88;
		} else {
			sanXiaFee = electrotherapy * 0.004 * 0.88;
		}

		return sanXiaFee;
	}

	public Double jiJinKeZaiSheng(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte) throws Exception {
		int electrotherapy = electrotherapy(meritoriousPointer,
				unMeritoriousPointer, PowerClass, lineNo, inputDAte);
		String nongGuan = "";
		String nongYeShengChan = "";
		Double jiJinKeZaiSheng = (electrotherapy - Double.parseDouble(nongGuan) - Double
				.parseDouble(nongYeShengChan)) * 0.002 * 0.88;
		return jiJinKeZaiSheng;

	}

	public Double jiJinKuQu(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte) throws Exception {
		int electrotherapy = electrotherapy(meritoriousPointer,
				unMeritoriousPointer, PowerClass, lineNo, inputDAte);
		String nongGuan = "";
		String nongYeShengChan = "";
		Double jiJinKuQu = (electrotherapy - Double.parseDouble(nongGuan) - Double
				.parseDouble(nongYeShengChan)) * 0.031 * 0.88;
		return jiJinKuQu;
	}

	/*
	 * //大工业有功电量 public static double factoryWorkPower(String LastWorkNum,String
	 * ThisWorkNum,String LastIdleNum,String ThisIdleNum,String Rate) { double
	 * workPower=
	 *  }
	 */
	/**
	 * 
	 * @param meritoriousPointer
	 * @param unMeritoriousPointer
	 * @param PowerClass
	 * @param lineNo
	 * @param inputDAte
	 * @return
	 * @throws Exception
	 */
	public Double dianJin(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte) throws Exception {
		int electrotherapy = electrotherapy(meritoriousPointer,
				unMeritoriousPointer, PowerClass, lineNo, inputDAte);
		LwPowerLineDto lwPowerLineDto = new LwPowerLineDto();
		BLLwPowerLineFacade blLwPowerLineFacade = new BLLwPowerLineFacade();
		lwPowerLineDto = blLwPowerLineFacade.findByPrimaryKey(lineNo);
		String company = lwPowerLineDto.getComCode();

		String nongGuan = "";
		double dianJin;
		if (PowerClass.equals("1")) {
			dianJin = electrotherapy * 0.002 * 0.88;

		}
		if (company.equals("gy") || company.equals("dm")) {
			dianJin = electrotherapy * 0.002 * 0.88;
		} else {
			dianJin = (electrotherapy - Double.parseDouble(nongGuan)) * 0.002 * 0.88;
		}
		return dianJin;
	}

	public Double daGongYeDianJin(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte) throws Exception {
		double daGongYeDianJin;
		int electrotherapy = electrotherapy(meritoriousPointer,
				unMeritoriousPointer, PowerClass, lineNo, inputDAte);
		daGongYeDianJin = electrotherapy * 0.01;
		return daGongYeDianJin;
	}

	public Double sanXiaJin(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte) throws Exception {
		double sanXiaJin;
		int electrotherapy = electrotherapy(meritoriousPointer,
				unMeritoriousPointer, PowerClass, lineNo, inputDAte);
		sanXiaJin = electrotherapy * 0.04;
		return sanXiaJin;
	}

	public Double jiJin(String meritoriousPointer, String unMeritoriousPointer,
			String PowerClass, String lineNo, String inputDAte)
			throws Exception {
		double jiJin;
		int electrotherapy = electrotherapy(meritoriousPointer,
				unMeritoriousPointer, PowerClass, lineNo, inputDAte);
		jiJin = electrotherapy * 0.0051;
		return jiJin;
	}

	// 取大工业和直供户的的电价的条件
	public static String basePowerPrice(String lineCode, String powerClass)
			throws Exception {
		String conditions = "1=1 ";
		BLLwPowerLineFacade blLwPowerLineFacade = new BLLwPowerLineFacade();
		LwPowerLineDto lwPowerLineDto = new LwPowerLineDto();
		lwPowerLineDto = blLwPowerLineFacade.findByPrimaryKey(lineCode);
		double VoltLevel = lwPowerLineDto.getVoltLevel();
		String sql = getSalePowerCondition(VoltLevel);

		conditions = " and powerClass='" + powerClass + "'" + sql;

		return conditions;
	}
	//大工业统计
	public static double getCountPrice(String KV,String type) throws Exception{
		double price=0;
		LwSalePriceDto  lwSalePriceDto=new LwSalePriceDto();
		BLLwSalePriceFacade  blLwSalePriceFacade=new BLLwSalePriceFacade();
		String sql=" PowerClass=7 and PriceCategory=3 and VoltageBegin='"+KV+"' and MaterialsType='"+type+"'";
		Collection  col=blLwSalePriceFacade.findByConditions(sql);
		Iterator it=col.iterator();
		while(it.hasNext()){
			lwSalePriceDto=(LwSalePriceDto)it.next();
			price=lwSalePriceDto.getPrice();
		}
		return price;
		
		
	}
	

	// 获得倍率
	public static double getRateCode(String lineCode) throws Exception {
		double CT = 0;
		double PT = 0;
		BLLwctFacade blLwctFacade = new BLLwctFacade();
		BLLwptFacade blLwptFacade = new BLLwptFacade();
		LwctDto lwctDto = new LwctDto();
		LwptDto lwptDto = new LwptDto();
		String conditions = "1=1 and flag=1 and linecode='" + lineCode + "'";
		BLLwLineCTFacade blLwLineCTFacade = new BLLwLineCTFacade();
		LwLineCTDto lwLineCTDto = new LwLineCTDto();
		BLLwLinePTFacade blLwLinePTFacade = new BLLwLinePTFacade();
		LwLinePTDto lwLinePTDto = new LwLinePTDto();

		Collection ct = blLwLineCTFacade.findByConditions(conditions);
		Iterator ict = ct.iterator();
		while (ict.hasNext()) {
			lwLineCTDto = (LwLineCTDto) ict.next();
			String cttem = lwLineCTDto.getCtModus();
			lwctDto = blLwctFacade.findByPrimaryKey(cttem);
			CT = lwctDto.getCtRate();

		}
		Collection pt = blLwLinePTFacade.findByConditions(conditions);
		Iterator ipt = pt.iterator();
		while (ipt.hasNext()) {
			lwLinePTDto = (LwLinePTDto) ipt.next();
			String pttem = lwLinePTDto.getPtModus();
			lwptDto = blLwptFacade.findByPrimaryKey(pttem);
			PT = lwptDto.getPtRate();

		}

		double ratecode = CT * PT;
		return ratecode;

	}
	//取大工业容量电价
	public double rongLiangPrice(String flag,String userNo) throws Exception{
		double  rongliang=0;
		LwCoporationUserInfoDto lwCoporationUserInfoDto=new LwCoporationUserInfoDto();
		BLLwCoporationUserInfoFacade  blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		lwCoporationUserInfoDto=blLwCoporationUserInfoFacade.findByPrimaryKey(userNo);
		if(flag.equals("1")){
			rongliang=lwCoporationUserInfoDto.getShengChanrongLiangPrice();
			
			
		}if(flag.equals("2")){
			rongliang=lwCoporationUserInfoDto.getTingChanrongLiangPrice();
		}
		return rongliang;
	}
//	取大工业电金电价
	public double dianJinPrice(String flag,String userNo) throws Exception{
		double dianJin=0;
		LwCoporationUserInfoDto lwCoporationUserInfoDto=new LwCoporationUserInfoDto();
		BLLwCoporationUserInfoFacade  blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		lwCoporationUserInfoDto=blLwCoporationUserInfoFacade.findByPrimaryKey(userNo);
		if(flag.equals("1")){
			
			dianJin=lwCoporationUserInfoDto.getShengChandianJinPrice();
			
		}if(flag.equals("2")){
			dianJin=lwCoporationUserInfoDto.getTingChanrongLiangPrice();
		}
		return dianJin;
		
	}
//	取大工业电价
	public double corporationPrice(String flag,String userNo) throws Exception{
		double factoryPrice=0;
		LwCoporationUserInfoDto lwCoporationUserInfoDto=new LwCoporationUserInfoDto();
		BLLwCoporationUserInfoFacade  blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		lwCoporationUserInfoDto=blLwCoporationUserInfoFacade.findByPrimaryKey(userNo);
		if(flag.equals("1")){
			
			factoryPrice=factorySalePrice(lwCoporationUserInfoDto.getShengChanKV(), lwCoporationUserInfoDto.getShengChanPrice());
			
		}if(flag.equals("2")){
			factoryPrice=factorySalePrice(lwCoporationUserInfoDto.getTingChanKV(),lwCoporationUserInfoDto.getTingChanPrice());
		}
		return factoryPrice;
		
	}
	// 取趸售的标准电价的条件
	public double wholeSalePrice(String userName, String type) throws Exception {
		String conditions = "";
		BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade = new BLLwWholeSaleUserInfoFacade();
		LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = new LwWholeSaleUserInfoDto();
		lwWholeSaleUserInfoDto = blLwWholeSaleUserInfoFacade
				.findByPrimaryKey(userName);
		double VoltLevel = Double.parseDouble(lwWholeSaleUserInfoDto
				.getVoltage());

		conditions = "  PowerClass='" + type + "'"
				+ " and SaleArea=1 and Voltageend='" + VoltLevel + "'";
		BLLwWholeSalePriceFacade blLwWholeSalePriceFacade = new BLLwWholeSalePriceFacade();
		LwWholeSalePriceDto lwWholeSalePriceDto = new LwWholeSalePriceDto();
		Collection col = blLwWholeSalePriceFacade.findByConditions(conditions);
		Iterator it = col.iterator();
		while (it.hasNext()) {
			lwWholeSalePriceDto = (LwWholeSalePriceDto) it.next();
		}

		return lwWholeSalePriceDto.getPrice();
	}

	// 取大工业电价格
	public double factorySalePrice(String voltage,String priceType) throws Exception {
		String conditions = "1=1 ";
		/*BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto lwCoporationUserInfoDto = new LwCoporationUserInfoDto();
		lwCoporationUserInfoDto = blLwCoporationUserInfoFacade
				.findByPrimaryKey(userNo);*/
		//String factoryStyle = lwCoporationUserInfoDto.getIndustryType();
		double VoltLevel = Double.parseDouble(voltage);
		if (VoltLevel==1) {
			VoltLevel=1;
		}// 1-10KV
		else if (VoltLevel==2) {
			VoltLevel=10;
		}// 35-110KV以下
		else if (VoltLevel==3) {
			VoltLevel=110;
		}// 110-220KV以下
		else if (VoltLevel==4) {
			VoltLevel=220;
		}// 220及以下
		if(VoltLevel<=220){
		conditions += "and PowerClass=7 and PriceCategory=3 and VoltageEnd='"
				+ VoltLevel + "'" + " and MaterialsType='" + priceType + "'";
		}else{
			conditions += "and PowerClass=7 and PriceCategory=3 and Voltagebegin=220 " + " and MaterialsType='" + priceType + "'";
		}
		
		BLLwSalePriceFacade blLwSalePriceFacade = new BLLwSalePriceFacade();
		Collection sal = new ArrayList();
		sal = blLwSalePriceFacade.findByConditions(conditions);
		Iterator it = sal.iterator();
		LwSalePriceDto lwSalePriceDto = new LwSalePriceDto();
		while (it.hasNext()) {
			lwSalePriceDto = (LwSalePriceDto) it.next();
		}

		return lwSalePriceDto.getPrice();

	}
	public double wholefactorySalePrice(String userNo) throws Exception {
		String conditions = "1=1 ";
		BLLwWholeSaleUserInfoFacade  blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
		LwWholeSaleUserInfoDto  lwWholeSaleUserInfoDto = new LwWholeSaleUserInfoDto();
		lwWholeSaleUserInfoDto = blLwWholeSaleUserInfoFacade
				.findByPrimaryKey(userNo);
		String wholeSaleStyle = lwWholeSaleUserInfoDto.getWholesaletype() ;
		double VoltLevel = Double.parseDouble(lwWholeSaleUserInfoDto
				.getVoltage());
		conditions += "and PowerClass=7 and PriceCategory=3 and VoltageEnd='"
				+ VoltLevel + "'" + " and MaterialsType= 0" ;
		BLLwSalePriceFacade blLwSalePriceFacade = new BLLwSalePriceFacade();
		Collection sal = new ArrayList();
		sal = blLwSalePriceFacade.findByConditions(conditions);
		Iterator it = sal.iterator();
		LwSalePriceDto lwSalePriceDto = new LwSalePriceDto();
		while (it.hasNext()) {
			lwSalePriceDto = (LwSalePriceDto) it.next();
		}

		return lwSalePriceDto.getPrice();

	}
	public double factoryPeoplePrice(String userNo) throws Exception {
		String conditions = "1=1 ";
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto lwCoporationUserInfoDto = new LwCoporationUserInfoDto();
		lwCoporationUserInfoDto = blLwCoporationUserInfoFacade
				.findByPrimaryKey(userNo);
		String factoryStyle = lwCoporationUserInfoDto.getIndustryType();
		double VoltLevel = Double.parseDouble(lwCoporationUserInfoDto
				.getVoltage());
		if (VoltLevel==1) {
			VoltLevel=1;
		}// 1-10KV
		else if (VoltLevel==2) {
			VoltLevel=10;
		}// 35-110KV以下
		else if (VoltLevel==3) {
			VoltLevel=110;
		}// 110-220KV以下
		else if (VoltLevel==4) {
			VoltLevel=220;
		}// 220及以下
		if(VoltLevel<=220){
		conditions += "and PowerClass=2  and PriceCategory=3 and VoltageEnd='"+ VoltLevel + "'"  ;
	}else{
			conditions += "and PowerClass=2 and PriceCategory=3 and Voltagebegin=220 " ;
		}
		BLLwSalePriceFacade blLwSalePriceFacade = new BLLwSalePriceFacade();
		Collection sal = new ArrayList();
		sal = blLwSalePriceFacade.findByConditions(conditions);
		Iterator it = sal.iterator();
		LwSalePriceDto lwSalePriceDto = new LwSalePriceDto();
		while (it.hasNext()) {
			lwSalePriceDto = (LwSalePriceDto) it.next();
		}

		return lwSalePriceDto.getPrice();

	}

	// 取大工业非居民照明电价

	// 取容量电费
	public double rongliangFee(String userNo) throws Exception {
		String conditions = "1=1 ";
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto lwCoporationUserInfoDto = new LwCoporationUserInfoDto();
		lwCoporationUserInfoDto = blLwCoporationUserInfoFacade
				.findByPrimaryKey(userNo);
		String factoryStyle = lwCoporationUserInfoDto.getIndustryType();
		double VoltLevel = Double.parseDouble(lwCoporationUserInfoDto
				.getVoltage());
		conditions += "and PowerClass=7 and PriceCategory=4 and Voltagebegin=2 ";
		BLLwSalePriceFacade blLwSalePriceFacade = new BLLwSalePriceFacade();
		Collection sal = new ArrayList();
		sal = blLwSalePriceFacade.findByConditions(conditions);
		Iterator it = sal.iterator();
		LwSalePriceDto lwSalePriceDto = new LwSalePriceDto();
		while (it.hasNext()) {
			lwSalePriceDto = (LwSalePriceDto) it.next();
		}

		return lwSalePriceDto.getPrice();

	}

	// 取需量电费
	public double xuliangFee(String userNo) throws Exception {
		String conditions = "1=1 ";
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto lwCoporationUserInfoDto = new LwCoporationUserInfoDto();
		lwCoporationUserInfoDto = blLwCoporationUserInfoFacade
				.findByPrimaryKey(userNo);
		String factoryStyle = lwCoporationUserInfoDto.getIndustryType();
		double VoltLevel = Double.parseDouble(lwCoporationUserInfoDto
				.getVoltage());
		conditions += "and PowerClass=7 and PriceCategory=4 and Voltagebegin=1 ";
		BLLwSalePriceFacade blLwSalePriceFacade = new BLLwSalePriceFacade();
		Collection sal = new ArrayList();
		sal = blLwSalePriceFacade.findByConditions(conditions);
		Iterator it = sal.iterator();
		LwSalePriceDto lwSalePriceDto = new LwSalePriceDto();
		while (it.hasNext()) {
			lwSalePriceDto = (LwSalePriceDto) it.next();
		}

		return lwSalePriceDto.getPrice();

	}

	/*
	 * public double getWholePrice(String powerClass,String saleArea,String
	 * lineCode) throws Exception{ String append=wholeSalePrice(lineCode);
	 * String condions=" 1=1 and powerClass='"+powerClass+"'"+" and saleArea=1
	 * "+append; LwWholeSalePriceDto lwWholeSalePriceDto=new
	 * LwWholeSalePriceDto(); BLLwWholeSalePriceFacade
	 * blLwWholeSalePriceFacade=new BLLwWholeSalePriceFacade(); Collection coll
	 * =blLwWholeSalePriceFacade.findByConditions(condions); Iterator
	 * it=coll.iterator(); if(it.hasNext()){
	 * lwWholeSalePriceDto=(LwWholeSalePriceDto)it.next();
	 *  } double wholePrice=lwWholeSalePriceDto.getPrice(); return wholePrice; }
	 */
	public String deleteSql(String linecode, String inputdate) {

		String conditions = "1=1 and  USERNO='" + linecode
				+ "' and STATMONTH ='" + inputdate + "'";
		return conditions;
	}

	public String deleteLineSql(String linecode, String inputdate) {

		String conditions = "1=1 and  linecode='" + linecode
				+ "' and STATMONTH ='" + inputdate + "'";
		return conditions;
	}

	/**
	 * 直供乡总电费计算公式 2008-10-16 add by qiaoyouliang
	 * 
	 * @param workNum
	 *            本月有功指针
	 * @param rateCode
	 *            倍率
	 * @param lwProrateDto
	 *            按户比例分摊
	 * @param salePriceList
	 *            分摊电价
	 * @param adjustRate
	 *            功率因数
	 * @param adjustValue
	 *            调整值
	 * @return
	 */
	public static LwTownPriceSummaryDto townSumPowerFeeFormular(
			double sumQuantity, double rateCode, LwProrateDto lwProrateDto,
			SalePriceDto salePriceDto, double adjustRate, double adjustValue,
			String lineCode, String userNo, String statMonth) {

		/***********************************************************************
		 * 【0 -- 声明变量】
		 **********************************************************************/
		// 农灌比例
		double farmUseScale = 0.0;
		// 农灌电价
		double farmUsePrice = 0.0;
		/** 农灌电量 */
		double farmUseQuantity = 0.0;
		// 农灌电费
		double farmUseFee = 0.0;

		// 生产比例
		double productScale = 0.0;
		// 生产电价
		double productPrice = 0.0;
		// 生产电量
		double productQuantity = 0.0;
		// 生产电费
		double productFee = 0.0;

		// 居民比例
		double peopleUseScale = 0.0;
		// 居民电价
		double peopleUsePrice = 0.0;
		// 居民电量
		double peopleUseQuantity = 0.0;
		// 居民电费
		double peopleUseFee = 0.0;

		// 非居民比例
		double notPeopleUseScale = 0.0;
		// 非居民电价
		double notPeopleUsePrice = 0.0;
		// 非居民电量
		double notPeopleUseQuantity = 0.0;
		// 非居民电费
		double notPeopleUseFee = 0.0;

		// 非工业比例
		double industryScale = 0.0;
		// 非工业电价
		double industryPrice = 0.0;
		// 非工业电量
		double industryQuantity = 0.0;
		// 非工业电费
		double industryFee = 0.0;

		// 商业比例
		double bizScale = 0.0;
		// 商业电价
		double bizPrice = 0.0;
		// 商业电量
		double bizQuantity = 0.0;
		// 商业电费
		double bizFee = 0.0;
		// 分摊电价
		double price = 0.0;
		// 电价分类
		String powerClass = "";
		// 总电量
		double sumPower = 0.0;
		// 电金
		double sumDianJin = 0.0;
		// 三峡
		double sumSanXia = 0.0;
		// 基金
		double sumJiJin = 0.0;
		// 库区移民
		double sumKuQu = 0.0;
		// 电费合计
		double sumFee = 0.0;
		// 总电费
		double electricityFee = 0.0;

		// 居民电费合计
		double sumPeopleFee = 0.0;
		// 非居民电费合计
		double sunNotPeopleFee = 0.0;
		// 农灌电费合计
		double sumFarmFee = 0.0;
		// 农业生产电费合计
		double sumProduceFee = 0.0;
		// 商业电费合计
		double sumBizFee = 0.0;
		// 非工业电费合计
		double sumIndustryFee = 0.0;
		// 电价 DTO
		LwSalePriceDto lwSalePriceDto = null;

		/***********************************************************************
		 * 【1 -- 取得比例分摊的电价和分摊比例】
		 **********************************************************************/

		// 居民生活电价
		peopleUsePrice = salePriceDto.getPeoplePrice();
		peopleUseScale = lwProrateDto.getResident();

		// 非居民照明电价
		notPeopleUsePrice = salePriceDto.getNotPeople();
		notPeopleUseScale = lwProrateDto.getIndecisive();

		// 商业电价
		bizPrice = salePriceDto.getBusinessPrice();
		bizScale = lwProrateDto.getBusiness();

		// 非工业、普通电价
		industryPrice = salePriceDto.getIndustryPrice();
		industryScale = lwProrateDto.getIndustry();

		// 农业生产用电
		productPrice = salePriceDto.getProducePrice();
		productScale = lwProrateDto.getProduce();

		// 贫困县农业排灌用电
		farmUsePrice = salePriceDto.getFarmPrice();
		farmUseScale = lwProrateDto.getAgricultural();

		/***********************************************************************
		 * 【2 -- 计算总电量、力率电费】
		 **********************************************************************/
		// 总电量
		sumPower = sumQuantity;
		/***********************************************************************
		 * 【3 -- 计算比例分摊电费、比例分摊电价】
		 **********************************************************************/
		// 农灌电量 = 总电量 * 农灌的比例
		farmUseQuantity = sumPower * farmUseScale;
		// 农灌电费 = 农灌电量 × 农灌电价
		farmUseFee = farmUseQuantity * farmUsePrice;

		// 生产电量 = 总电量 × 生产比例
		productQuantity = sumPower * productScale;
		// 生产电费 = 生产电量 × 生产电价
		productFee = productQuantity * productPrice;
		// 居民电量 = 总电量 × 居民比例
		peopleUseQuantity = sumPower * peopleUseScale;
		// 居民电费 = 居民电量 × 居民电价
		peopleUseFee = peopleUseQuantity * peopleUsePrice;

		// 非居民电量 = 总电量 × 非居民比例
		notPeopleUseQuantity = sumPower * notPeopleUseScale;
		// 非居民电费 = 非居民电量 × 非居民电价
		notPeopleUseFee = notPeopleUseQuantity * notPeopleUsePrice;

		// 非工业电量 = 总电量 × 非工业比例
		industryQuantity = sumPower * industryScale;
		// 非工业电费 = 非工业电量 × 非工业电价
		industryFee = industryQuantity * industryPrice;

		// 商业电量 = 总电量 × 商业比例
		bizQuantity = sumPower * bizScale;
		// 商业电费 = 商业电量 × 商业电价
		bizFee = bizQuantity * bizPrice;

		bizQuantity = sumQuantity
				- (farmUseQuantity + productQuantity + peopleUseQuantity
						+ notPeopleUseQuantity + industryQuantity);
		// 电费合计 = 农灌 + 生产 + 居民 + 非居民 + 非普工业 + 商业
		sumFee = farmUseFee + productFee + peopleUseFee + notPeopleUseFee
				+ industryFee + bizFee;

		/***********************************************************************
		 * 【5 -- 组织直供乡电费计算总表】
		 **********************************************************************/
		LwTownPriceSummaryDto lwTownPriceSummaryDto = new LwTownPriceSummaryDto();
		// -- 调整值
		lwTownPriceSummaryDto.setAdjustValue(adjustValue);
		// -- 基础信息维护
		lwTownPriceSummaryDto.setSumQuantity(PowerFeeCal.getValue(sumPower, AppConst.ZERO_DOT_FLAG));
		lwTownPriceSummaryDto.setLineCode(lineCode);
		lwTownPriceSummaryDto.setRateCode(rateCode);
		lwTownPriceSummaryDto.setRateFee(zero);
		lwTownPriceSummaryDto.setStatMonth(statMonth);
		// 电费合计
		lwTownPriceSummaryDto.setSumFee(PowerFeeCal.getValue(sumFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setUserNo(userNo);
		lwTownPriceSummaryDto.setValidStatus("1");
		// -- 组织商业用电的电费、电价、电量、比例
		lwTownPriceSummaryDto.setBizFee(PowerFeeCal.getValue(bizFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setBizPrice(bizPrice);
		lwTownPriceSummaryDto.setBizQuantity(PowerFeeCal.getValue(bizQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setBizScale(bizScale);
		// -- 组织农灌用电的电费、电价、电量、比例
		double tt = PowerFeeCal.getValue(farmUseFee, AppConst.FOUR_DOT_FLAG);
		lwTownPriceSummaryDto.setFarmFee(PowerFeeCal.getValue(farmUseFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setFarmPrice(farmUsePrice);
		lwTownPriceSummaryDto.setFarmQuantity(PowerFeeCal.getValue(farmUseQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setFarmScale(farmUseScale);
		// -- 非工业、普通工业用电的电费、电价、电量、比例
		lwTownPriceSummaryDto.setIndustryFee(PowerFeeCal.getValue(industryFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setIndustryPrice(industryPrice);
		lwTownPriceSummaryDto.setIndustryQuantity(PowerFeeCal.getValue(industryQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setIndustryScale(industryScale);
		// -- 非居民用电的电费、电价、电量、比例
		lwTownPriceSummaryDto.setNotPeopleFee(PowerFeeCal.getValue(notPeopleUseFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setNotPeoplePrice(notPeopleUsePrice);
		lwTownPriceSummaryDto.setNotPeopleQuantity(PowerFeeCal.getValue(notPeopleUseQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setNotPeopleScale(notPeopleUseScale);
		// -- 居民用电的电费、电价、电量、比例
		lwTownPriceSummaryDto.setPeopleFee(PowerFeeCal.getValue(peopleUseFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setPeoplePrice(peopleUsePrice);
		lwTownPriceSummaryDto.setPeopleQuantity(PowerFeeCal.getValue(peopleUseQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setPeopleScale(peopleUseScale);
		// -- 农业生产用电的电费、电价、电量、比例
		lwTownPriceSummaryDto.setProduceFee(PowerFeeCal.getValue(productFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setProducePrice(productPrice);
		lwTownPriceSummaryDto.setProduceQuantity(PowerFeeCal.getValue(productQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setProduceScale(productScale);

		/***********************************************************************
		 * 【5 -- 计算四金并组织DTO：农业还贷资金、三峡建设资金、可再生能源附加费、库区移民】
		 **********************************************************************/
		// 农业还贷资金
		sumDianJin = getTowndianJin(lwTownPriceSummaryDto, 0.02, 0.88);
		// 三峡建设资金
		sumSanXia = getTownsanXia(lwTownPriceSummaryDto, 0.004, 0.88);
		// 可再生能源附加费
		sumJiJin = getTownjiJin(lwTownPriceSummaryDto, 0.002, 0.001,0.88);
		// 库区移民
		sumKuQu = getTownkuQu(lwTownPriceSummaryDto, 0.0031, 0.88);
		// 总基金
		lwTownPriceSummaryDto.setRemark(new Double(PowerFeeCal.getValue(sumJiJin+sumKuQu, AppConst.FOUR_DOT_FLAG)).toString());
		// -- 为DTO 赋值
		lwTownPriceSummaryDto.setSumDianJin(PowerFeeCal.getValue(sumDianJin, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setSumSanXia(PowerFeeCal.getValue(sumSanXia, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setSumJiJin(PowerFeeCal.getValue(sumJiJin+sumKuQu, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setSumKuQu(PowerFeeCal.getValue(sumKuQu, AppConst.FOUR_DOT_FLAG));

		// 总电费 = 电费合计+电金合计+三峡+基金合计+库区合计
		electricityFee = sumFee + sumDianJin + sumSanXia + sumJiJin + sumKuQu;
	//	lwTownPriceSummaryDto.setElectricFee(electricityFee);
		lwTownPriceSummaryDto.setElectricFee(PowerFeeCal.getValue(electricityFee, AppConst.FOUR_DOT_FLAG));
		/***********************************************************************
		 * 【6 -- 计算农业还贷资金、三峡建设资金、可再生能源附加费、库区移民的比例分摊值】
		 **********************************************************************/
		// 比例分摊电金= 总电金×居民比例
		double peopleDianJin = lwTownPriceSummaryDto.getSumDianJin()
				* lwTownPriceSummaryDto.getPeopleScale();
		double notPeopleDianJin = lwTownPriceSummaryDto.getSumDianJin()
				* lwTownPriceSummaryDto.getNotPeopleScale();
		double farmDianJin = lwTownPriceSummaryDto.getSumDianJin()
				* lwTownPriceSummaryDto.getFarmScale();
		double produceDianJin = lwTownPriceSummaryDto.getSumDianJin()
				* lwTownPriceSummaryDto.getProduceScale();
		double industryDianJin = lwTownPriceSummaryDto.getSumDianJin()
				* lwTownPriceSummaryDto.getIndustryScale();
		double bizDianJin = lwTownPriceSummaryDto.getSumDianJin()
				* lwTownPriceSummaryDto.getBizScale();

		// 比例分摊三峡= 总三峡×居民比例
		double peopleSanXia = lwTownPriceSummaryDto.getSumSanXia()
				* lwTownPriceSummaryDto.getPeopleScale();
		double notPeopleSanXia = lwTownPriceSummaryDto.getSumSanXia()
				* lwTownPriceSummaryDto.getNotPeopleScale();
		
		double farmSanXia = lwTownPriceSummaryDto.getSumSanXia()
				* lwTownPriceSummaryDto.getFarmScale();
		double produceSanXia = lwTownPriceSummaryDto.getSumSanXia()
				* lwTownPriceSummaryDto.getProduceScale();
		
		double industrySanXia = lwTownPriceSummaryDto.getSumSanXia()
				* lwTownPriceSummaryDto.getIndustryScale();
		double bizSanXia = lwTownPriceSummaryDto.getSumSanXia()
				* lwTownPriceSummaryDto.getBizScale();

		// 比例分摊基金= 总基金×居民比例
		double peopleJiJin = lwTownPriceSummaryDto.getSumJiJin()
				* lwTownPriceSummaryDto.getPeopleScale();
		double notPeopleJiJin = lwTownPriceSummaryDto.getSumJiJin()
				* lwTownPriceSummaryDto.getNotPeopleScale();
		
		double farmJiJin = lwTownPriceSummaryDto.getSumJiJin()
				* lwTownPriceSummaryDto.getFarmScale();
		double produceJiJin = lwTownPriceSummaryDto.getSumJiJin()
				* lwTownPriceSummaryDto.getProduceScale();
		
		double industryJiJin = lwTownPriceSummaryDto.getSumJiJin()
				* lwTownPriceSummaryDto.getIndustryScale();
		double bizJiJin = lwTownPriceSummaryDto.getSumJiJin()
				* lwTownPriceSummaryDto.getBizScale();

		// 比例分摊库区= 总库区×居民比例
		double peopleKuQu = lwTownPriceSummaryDto.getSumKuQu()
				* lwTownPriceSummaryDto.getPeopleScale();
		double notPeopleKuQu = lwTownPriceSummaryDto.getSumKuQu()
				* lwTownPriceSummaryDto.getNotPeopleScale();
		
		double farmKuQu = lwTownPriceSummaryDto.getSumKuQu()
				* lwTownPriceSummaryDto.getFarmScale();
		double produceKuQu = lwTownPriceSummaryDto.getSumKuQu()
				* lwTownPriceSummaryDto.getProduceScale();
		
		double industryKuQu = lwTownPriceSummaryDto.getSumKuQu()
				* lwTownPriceSummaryDto.getIndustryScale();
		double bizKuQu = lwTownPriceSummaryDto.getSumKuQu()
				* lwTownPriceSummaryDto.getBizScale();

		/***********************************************************************
		 * 【7 -- 计算比例分摊电费合计信息】
		 **********************************************************************/
		// 居民电费合计 = 居民电费+居民电金+居民三峡+居民基金+居民库区
		sumPeopleFee = peopleUseFee + peopleDianJin + peopleSanXia
				+ peopleJiJin + peopleKuQu;
		// 非居民电费合计 = 非居民电费+非居民电金+非居民三峡+非居民基金+非居民库区
		sunNotPeopleFee = notPeopleUseFee + notPeopleDianJin + notPeopleSanXia
				+ notPeopleJiJin + notPeopleKuQu;
		// 农灌电费合计 = 农灌电费+农灌电金+农灌三峡+农灌基金+农灌库区
		sumFarmFee = farmUseFee + farmDianJin + farmSanXia + farmJiJin
				+ farmKuQu;
		// 农业生产电费合计 = 农业生产电费+农业生产电金+农业生产三峡+农业生产基金+农业生产库区
		sumProduceFee = productFee + produceDianJin + produceSanXia
				+ produceJiJin + produceKuQu;
		// 商业电费合计 = 商业电费+商业电金+商业三峡+商业基金+商业库区
		sumBizFee = bizFee + bizDianJin + bizSanXia + bizJiJin + bizKuQu;
		// 非工业电费合计 = 非工业电费+非工业电金+非工业三峡+非工业基金+非工业库区
		sumIndustryFee = industryFee + industryDianJin + industrySanXia
				+ industryJiJin + industryKuQu;
		/***********************************************************************
		 * 【8 -- 组织合计电费到DTO】
		 **********************************************************************/
		// 居民
		lwTownPriceSummaryDto.setPeopleDianJin(peopleDianJin);
		lwTownPriceSummaryDto.setPeopleFeeSanXia(peopleSanXia);
		lwTownPriceSummaryDto.setPeopleJiJin(peopleJiJin);
		lwTownPriceSummaryDto.setPeopleKuQu(peopleKuQu);
		lwTownPriceSummaryDto.setSumPeopleFee(PowerFeeCal.getValue(peopleUseFee, AppConst.FOUR_DOT_FLAG));

		// 非居民
		lwTownPriceSummaryDto.setNotPeopleDianJin(notPeopleDianJin);
		lwTownPriceSummaryDto.setNotPeopleFeeSanXia(notPeopleSanXia);
		lwTownPriceSummaryDto.setNotPeopleJiJin(notPeopleJiJin);
		lwTownPriceSummaryDto.setNotPeopleKuQu(notPeopleKuQu);
		lwTownPriceSummaryDto.setSumNotPeopleFee(PowerFeeCal.getValue(notPeopleUseFee, AppConst.FOUR_DOT_FLAG));

		// 农业生产
		lwTownPriceSummaryDto.setProduceDianJin(produceDianJin);
		lwTownPriceSummaryDto.setProduceSanXia(produceSanXia);
		lwTownPriceSummaryDto.setProduceJiJin(produceJiJin);
		lwTownPriceSummaryDto.setProduceKuQu(produceKuQu);
		lwTownPriceSummaryDto.setSumProduceFee(PowerFeeCal.getValue(productFee, AppConst.FOUR_DOT_FLAG));

		// 农灌
		lwTownPriceSummaryDto.setFarmDianJin(farmDianJin);
		lwTownPriceSummaryDto.setFarmSanXia(farmSanXia);
		lwTownPriceSummaryDto.setFarmJiJin(farmJiJin);
		lwTownPriceSummaryDto.setFarmKuQu(farmKuQu);
		lwTownPriceSummaryDto.setSumFarmFee(PowerFeeCal.getValue(farmUseFee, AppConst.FOUR_DOT_FLAG));

		// 商业
		lwTownPriceSummaryDto.setBizDianJin(bizDianJin);
		lwTownPriceSummaryDto.setBizSanXia(bizSanXia);
		lwTownPriceSummaryDto.setBizJiJin(bizJiJin);
		lwTownPriceSummaryDto.setBizKuQu(bizKuQu);
		lwTownPriceSummaryDto.setSumBizFee(PowerFeeCal.getValue(bizFee, AppConst.FOUR_DOT_FLAG));

		// 非普工业
		lwTownPriceSummaryDto.setIndustryDianJin(industryDianJin);
		lwTownPriceSummaryDto.setIndustrySanXia(industrySanXia);
		lwTownPriceSummaryDto.setIndustryJiJin(industryJiJin);
		lwTownPriceSummaryDto.setIndustryKuQu(industryKuQu);
		lwTownPriceSummaryDto.setSumIndustryFee(PowerFeeCal.getValue(industryFee, AppConst.FOUR_DOT_FLAG));

		return lwTownPriceSummaryDto;
	}
	/**
	 * 直供乡总追收电费计算公式 2008-12-17 add by qiaoyouliang
	 * 
	 * @param appendQuantity
	 *            追收计算电量
	 * @param lwProrateDto
	 *            比例分摊
	 * @param oldPriceDto
	 *            历史电价
	 * @param newPriceDto
	 *            新电价
	 * @param userNo
	 *            用户代码
	 * @param statMonth
	 *            统计年月
	 * @param appendMonth
	 *            追加年月
	 * @return
	 */
	public static LwTownPriceSummaryAppendDto townFeeAppendFormular(
			double appendQuantity, LwProrateDto lwProrateDto,
			SalePriceDto oldPriceDto, SalePriceDto newPriceDto, String userNo,
			String statMonth,String appendMonth) {

		/***********************************************************************
		 * 【0 -- 声明变量】
		 **********************************************************************/
		// 农灌比例
		double farmUseScale = 0.0;
		// 农灌历史电价
		double oldFarmPrice = 0.0;
		// 农灌新电价
		double newFarmPrice = 0.0;
		/** 农灌追收电量 */
		double appendFarmQuantity = 0.0;
		// 农灌电费
		double appendFarmFee = 0.0;

		// 生产比例
		double productScale = 0.0;
		// 生产历史电价
		double oldProducePrice = 0.0;
		// 生产新电价
		double newProducePrice = 0.0;
		// 生产追收电量
		double appendProductQuantity = 0.0;
		// 生产追收电费
		double appendProductFee = 0.0;

		// 居民比例
		double peopleUseScale = 0.0;
		// 居民历史电价
		double oldPeoplePrice = 0.0;
		// 居民新电价
		double newPeoplePrice = 0.0;
		// 居民追加电量
		double appendPeopleUseQuantity = 0.0;
		// 居民电费
		double appendPeopleFee = 0.0;

		// 非居民比例
		double notPeopleUseScale = 0.0;
		// 非居民历史电价
		double oldNotPeoplePrice = 0.0;
		// 非居民新电价
		double newNotPeoplePrice = 0.0;
		// 非居民追加电量
		double notPeopleUseQuantity = 0.0;
		// 非居民电费
		double appendNotPeopleFee = 0.0;

		// 非工业比例
		double industryScale = 0.0;
		// 非工业历史电价
		double oldIndustryPrice = 0.0;
		// 非工业新电价
		double newIndustryPrice = 0.0;
		// 非工业追收电量
		double appendIndustryQuantity = 0.0;
		// 非普工业电费
		double appendIndustryFee = 0.0;

		// 商业比例
		double bizScale = 0.0;
		// 商业历史电价
		double oldBizPrice = 0.0;
		// 商业新电价
		double newBizPrice = 0.0;
		// 商业追收电量
		double appendBizQuantity = 0.0;
		// 商业电费
		double appendBizFee = 0.0;

		// 电金
		double sumDianJin = 0.0;
		// 三峡
		double sumSanXia = 0.0;
		// 基金
		double sumJiJin = 0.0;
		// 库区移民
		double sumKuQu = 0.0;
		// 电费合计
		double appendPowerFee = 0.0;
		// 总电费
		double electricityFee = 0.0;

		// 电价 DTO
		LwSalePriceDto lwSalePriceDto = null;

		/***********************************************************************
		 * 【1 -- 取得比例分摊的电价和分摊比例】
		 **********************************************************************/

		// 居民生活电价、比例
		oldPeoplePrice = oldPriceDto.getPeoplePrice();
		newPeoplePrice = newPriceDto.getPeoplePrice();
		peopleUseScale = lwProrateDto.getResident();

		// 非居民照明电价、比例
		oldNotPeoplePrice = oldPriceDto.getNotPeople();
		newNotPeoplePrice = newPriceDto.getNotPeople();
		notPeopleUseScale = lwProrateDto.getIndecisive();

		// 商业电价、比例
		oldBizPrice = oldPriceDto.getBusinessPrice();
		newBizPrice = newPriceDto.getBusinessPrice();
		bizScale = lwProrateDto.getBusiness();

		// 非工业、普通电价、比例
		oldIndustryPrice = oldPriceDto.getIndustryPrice();
		newIndustryPrice = newPriceDto.getIndustryPrice();
		industryScale = lwProrateDto.getIndustry();

		// 农业生产用电、比例
		oldProducePrice = oldPriceDto.getProducePrice();
		newProducePrice = newPriceDto.getProducePrice();
		productScale = lwProrateDto.getProduce();

		// 贫困县农业排灌用电、比例
		oldFarmPrice = oldPriceDto.getFarmPrice();
		newFarmPrice = newPriceDto.getFarmPrice();
		farmUseScale = lwProrateDto.getAgricultural();

	
		/***********************************************************************
		 * 【3 -- 按照比例分摊进行追收电费的计算】
		 **********************************************************************/
		// 农灌追收电量 = 总电量 * 农灌的比例
		appendFarmQuantity = appendQuantity * farmUseScale;
		// 农灌追收电费 = 农灌追收电量 × 农灌电价
		appendFarmFee = appendFarmQuantity * (newFarmPrice - oldFarmPrice);

		// 生产电量 = 总电量 × 生产比例
		appendProductQuantity = appendQuantity * productScale;
		// 生产追收电费 = 生产电量 × 生产电价
		appendProductFee = appendProductQuantity * (newProducePrice - oldProducePrice);
		
		// 居民追加电量 = 总电量 × 居民比例
		appendPeopleUseQuantity = appendQuantity * peopleUseScale;
		// 居民追收电费 = 居民追加电量 × 居民电价
		appendPeopleFee = appendPeopleUseQuantity * (oldPeoplePrice - oldPeoplePrice);

		// 非居民追加电量 = 总电量 × 非居民比例
		notPeopleUseQuantity = appendQuantity * notPeopleUseScale;
		// 非居民追收电费 = 非居民追加电量 × 非居民电价
		appendNotPeopleFee = notPeopleUseQuantity * (newNotPeoplePrice - oldNotPeoplePrice);;

		// 非工业追收电量 = 总电量 × 非工业比例
		appendIndustryQuantity = appendQuantity * industryScale;
		// 非普工业电费 = 非工业追收电量 × 非工业电价
		appendIndustryFee = appendIndustryQuantity * (newIndustryPrice - oldIndustryPrice);;

		// 商业追收电量 = 总电量 × 商业比例
		appendBizQuantity = appendQuantity * bizScale;
		// 商业追收电费 = 商业追收电量 × 商业电价
		appendBizFee = appendBizQuantity * (newBizPrice - oldBizPrice);;

		appendBizQuantity = appendQuantity
				- (appendFarmQuantity + appendProductQuantity + appendPeopleUseQuantity
						+ notPeopleUseQuantity + appendIndustryQuantity);
		// 电费合计 = 农灌 + 生产 + 居民 + 非居民 + 非普工业 + 商业
		appendPowerFee = appendFarmFee + appendProductFee + appendPeopleFee + appendNotPeopleFee
				+ appendIndustryFee + appendBizFee;

		/***********************************************************************
		 * 【5 -- 组织直供乡电费计算总表】
		 **********************************************************************/
		LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto = new LwTownPriceSummaryAppendDto();

		// -- 基础信息维护
		lwTownPriceSummaryAppendDto.setAppendCalQuantity(appendQuantity);
		lwTownPriceSummaryAppendDto.setStatMonth(statMonth);
		lwTownPriceSummaryAppendDto.setUserNo(userNo);

		// 电费合计
		lwTownPriceSummaryAppendDto.setAppendCalPowerFee(appendPowerFee);
		lwTownPriceSummaryAppendDto.setValidStatus("1");

		return lwTownPriceSummaryAppendDto;
	}

	/**
	 * 根据输电线路的电压等级，组织条件
	 * 
	 * @param voltLevel
	 * @return
	 */
	public static String getSalePowerCondition(double level) {

		StringBuffer buffer = new StringBuffer();
		// 不满1KV
		if (level < 1) {
			buffer.append(" and VoltageEnd='1' ");
		}// 1-10KV
		else if ((level <= 10 && level >= 1)) {
			buffer.append(" and VoltageEnd='10' ");
		}// 35-110KV以下
		else if ((level < 110 && level >= 35)) {
			buffer.append(" and VoltageEnd='110' ");
		}// 110-220KV以下
		else if ((level < 220 && level >= 110)) {
			buffer.append(" and VoltageEnd='220' ");
		}// 220及以下
		else {
			buffer.append(" and VoltageBegin='220' ");
		}

		return buffer.toString();
	}

	/**
	 * 根据输电线路的类别代码，组织条件
	 * 
	 * @param voltLevel
	 * @return
	 */
	public static String getSalePowerCondition(String saleVoltCode) {

		StringBuffer buffer = new StringBuffer();
		// 不满1KV
		if ("1".equals(saleVoltCode)) {
			buffer.append(" and VoltageEnd='1' ");
		}// 1-10KV
		else if ("2".equals(saleVoltCode)) {
			buffer.append(" and VoltageEnd='10' ");
		}// 35-110KV以下
		else if ("3".equals(saleVoltCode)) {
			buffer.append(" and VoltageEnd='110' ");
		}// 110-220KV以下
		else if ("4".equals(saleVoltCode)) {
			buffer.append(" and VoltageEnd='220' ");
		}// 220及以下
		else {
			buffer.append(" and VoltageBegin='220' ");
		}

		return buffer.toString();
	}

	/**
	 * 计算直供乡农业还贷资金公式（电金）
	 * 
	 * @param lwTownPriceSummaryDto
	 *            电费计算DTO
	 * @param price
	 *            价格
	 * @param loss
	 *            损失
	 * @return 直供乡电金
	 */

	public static double getTowndianJin(
			LwTownPriceSummaryDto lwTownPriceSummaryDto, double price,
			double loss) {

		double sumPower = 0.0;
		double farmUseQuantity = 0.0;
		if (lwTownPriceSummaryDto != null) {
			// 总电量
			sumPower = lwTownPriceSummaryDto.getSumQuantity();
			// 农灌电量
			farmUseQuantity = lwTownPriceSummaryDto.getFarmQuantity();
		}
		// 直供乡电金 = （总电量 - 农灌）× 0.02 × 0.88
		return (sumPower - farmUseQuantity) * price * loss;
	}

	/**
	 * 计算直供乡三峡建设资金公式（三峡）
	 * 
	 * @param lwTownPriceSummaryDto
	 *            电费计算DTO
	 * @param price
	 *            价格
	 * @param loss
	 *            损失
	 * @return 三峡
	 */
	public static double getTownsanXia(
			LwTownPriceSummaryDto lwTownPriceSummaryDto, double price,
			double loss) {

		double sumPower = 0.0;
		if (lwTownPriceSummaryDto != null) {
			// 总电量
			sumPower = lwTownPriceSummaryDto.getSumQuantity();
		}
		// 直供乡电金 = 总电量 × 0.004 × 0.88
		return sumPower * price * loss;
	}

	/**
	 * 计算直供乡可再生能源附加费
	 * 
	 * @param lwTownPriceSummaryDto
	 *            电费计算DTO
	 * @param price
	 *            价格
	 * @param loss
	 *            损失
	 * @return 基金
	 */
	public static double getTownjiJin(
			LwTownPriceSummaryDto lwTownPriceSummaryDto, double jijinPrice,double peoplePrice,
			double loss) {
		// 居民
		double peopleQuantity = 0.0;
		// 商业
		double bizQuantity = 0.0;
		// 非普工业
		double industryQuantity = 0.0;
		// 非居民
		double notPeopleQuantity = 0.0;
		
		double peopleDianjin = 0.0;
		double otherDianjin = 0.0;
		if (lwTownPriceSummaryDto != null) {
			peopleQuantity = lwTownPriceSummaryDto.getPeopleQuantity();
			bizQuantity = lwTownPriceSummaryDto.getBizQuantity();
			industryQuantity = lwTownPriceSummaryDto.getIndustryQuantity();
			notPeopleQuantity = lwTownPriceSummaryDto.getNotPeopleQuantity();

		}
		// 直供乡可再生能源附加费 = （商业 + 非居民 + 非普） × 0.002 × 0.88 + 居民 × 0.01 × 0.88
		peopleDianjin = peopleQuantity * peoplePrice * loss;
		otherDianjin = (bizQuantity + industryQuantity +notPeopleQuantity )*jijinPrice * loss;
		
		return peopleDianjin+otherDianjin;
	}

	/**
	 * 计算直供乡库区移民
	 * 
	 * @author qiaoyouliang 2008-10-15 add
	 * @param lwTownPriceSummaryDto
	 *            电费计算DTO
	 * @param price
	 *            价格
	 * @param loss
	 *            损失
	 * @return 库区
	 */
	public static double getTownkuQu(
			LwTownPriceSummaryDto lwTownPriceSummaryDto, double price,
			double loss) {
		// 总电量
		double sumPower = 0.0;
		// 农灌
		double farmUseQuantity = 0.0;
		// 农业生产
		double produceQuantity = 0.0;
		if (lwTownPriceSummaryDto != null) {

			sumPower = lwTownPriceSummaryDto.getSumQuantity();
			farmUseQuantity = lwTownPriceSummaryDto.getFarmQuantity();
			produceQuantity = lwTownPriceSummaryDto.getProduceQuantity();

		}
		// 库区移民 = （总电量 - 农灌 - 农业生产） × 0.0031 × 0.88
		return (sumPower - farmUseQuantity - produceQuantity) * price * loss;
	}

	/**
	 * 保存电表指针
	 */
	public static void saveIndicator(LwAmmeterIndicatorDto dto) {
		// 表号
		String ammetorNo = dto.getAmmeterNo();
		// 当前指针
		int currentNum = dto.getCurrentNum();
		// 抄表日期
		String readDate = dto.getReadAmmeterDate();
		// 上表日期
		String operateDate = dto.getOperateDate();
		// 上表指针
		int startNum = dto.getStartNum();

		DateTime dateTime = new DateTime(readDate, DateTime.YEAR_TO_MONTH);

	}



	/**
	 * 得到结帐月
	 * 
	 * @return
	 */
	public static String getCurrentBillMonth() {
		String statMonth = new DateTime(new java.util.Date(),
				DateTime.YEAR_TO_MONTH).toString();
		return statMonth;
	}

	
	/**
	 * 得到上个结帐月
	 * 
	 * @return
	 */
	public static String getLastBillMonth() {
		String statMonth = new DateTime(new java.util.Date(),
				DateTime.YEAR_TO_MONTH).addMonth(-1).toString();
		return statMonth;
	}

	/**
	 * 检验是否换表
	 * 如果返回的Dto为null，则说明没有换表；否则说明换表，并可以取得上表有功指针、上表无功指针、换表有功电量、换表无功电量
	 * @param userNo
	 * @return
	 * @throws Exception
	 */
	public static ChangeAmmeterDto checkChgAmmeter(String userNo) throws Exception{
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		StringBuffer buffer = new StringBuffer();
		Collection allUserAmmeter = null;
		ChangeAmmeterDto changeAmmeterDto = null;
		String installDate = null;
		
		Collection <LwAmmeterChangeDto>thisMonthAmmeter = new ArrayList<LwAmmeterChangeDto>();
		
		// 本月结帐日（本月）
		String statMonth = getCurrentBillMonth();
		// 条件，按照上表时间降序排（从新到旧的顺序）
		buffer.append(" userNo = '").append(userNo).append("' order by installDate desc");
		// 查找该用户的所有电表
		allUserAmmeter =  blLwAmmeterChangeFacade.findByConditions(buffer.toString());
		
		// 把当月所换的电表数查出来
		for (Iterator iterator = allUserAmmeter.iterator(); iterator
				.hasNext();) {
			LwAmmeterChangeDto lwAmmeterChangeDto = (LwAmmeterChangeDto) iterator
					.next();
			installDate = lwAmmeterChangeDto.getInstallDate();
			String installMonth = new DateTime(installDate,DateTime.YEAR_TO_MONTH).toString();
			if(statMonth.equals(installMonth))
			{
				thisMonthAmmeter.add(lwAmmeterChangeDto);
			}
			
		}
		// 进行换表判断
		changeAmmeterDto = check(statMonth, thisMonthAmmeter, allUserAmmeter);;
		
		return changeAmmeterDto;
	}
	public static ChangeAmmeterDto checkChgAmmeter(String userNo,String a) throws Exception{
		BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
		StringBuffer buffer = new StringBuffer();
		Collection allUserAmmeter = null;
		ChangeAmmeterDto changeAmmeterDto = null;
		String installDate = null;
		
		Collection <LwAmmeterChangeDto>thisMonthAmmeter = new ArrayList<LwAmmeterChangeDto>();
		
		// 本月结帐日（本月）
		String statMonth = getCurrentBillMonth();
		// 条件，按照上表时间降序排（从新到旧的顺序）
		buffer.append(" userNo = '").append(userNo).append("' and AMMETERNO ='"+a+"' order by installDate desc");
		// 查找该用户的所有电表
		allUserAmmeter =  blLwAmmeterChangeFacade.findByConditions(buffer.toString());
		
		// 把当月所换的电表数查出来
		for (Iterator iterator = allUserAmmeter.iterator(); iterator
				.hasNext();) {
			LwAmmeterChangeDto lwAmmeterChangeDto = (LwAmmeterChangeDto) iterator
					.next();
			installDate = lwAmmeterChangeDto.getInstallDate();
			String installMonth = new DateTime(installDate,DateTime.YEAR_TO_MONTH).toString();
			if(statMonth.equals(installMonth))
			{
				thisMonthAmmeter.add(lwAmmeterChangeDto);
			}
			
		}
		// 进行换表判断
		changeAmmeterDto = check(statMonth, thisMonthAmmeter, allUserAmmeter);;
		
		return changeAmmeterDto;
	}
	public static void main(String []args) throws Exception{
/*		LwAmmeterChangeDto o1 = new LwAmmeterChangeDto();
		LwAmmeterChangeDto o2 = new LwAmmeterChangeDto();
		LwAmmeterChangeDto o3 = new LwAmmeterChangeDto();
		LwAmmeterChangeDto o4 = new LwAmmeterChangeDto();
		LwAmmeterChangeDto o5 = new LwAmmeterChangeDto();
		Collection<LwAmmeterChangeDto> thisMonthAmmeter = new ArrayList<LwAmmeterChangeDto>();
		Collection<LwAmmeterChangeDto> allUserAmmeter = new ArrayList<LwAmmeterChangeDto>();
		// 本月结帐日（本月）
		String statMonth = getCurrentBillMonth();
		// 上月结帐日（上月）
		String lastMonth = getLastBillMonth();
		o1.setInstallDate("2008-10-1");
		o1.setChgIdleQuantity(10);
		o1.setChgWorkNum(20);
		
		o2.setChgIdleQuantity(30);
		o2.setInstallDate("2008-10-10");		
		o2.setChgWorkNum(50);
		
		o3.setInstallDate("2008-11-11");

		o3.setChgIdleQuantity(70);
		o3.setChgWorkNum(80);
		
		o4.setInstallDate("2008-11-16");
		o4.setFlag("1");
		o4.setInstallWorkNum(200);
		o4.setInstallIdleNum(50);
		
		thisMonthAmmeter.add(o4);
		thisMonthAmmeter.add(o3);
		
		allUserAmmeter.add(o4);
		allUserAmmeter.add(o3);
		allUserAmmeter.add(o2);
		allUserAmmeter.add(o1);
		
		check(statMonth,  thisMonthAmmeter, allUserAmmeter);*/
		System.out.println("sucess===="+compare_date("2008-01-01", "2007-02-02"));
		
	}
	public static ChangeAmmeterDto check(String statMonth,Collection<LwAmmeterChangeDto> thisMonthAmmeter,Collection <LwAmmeterChangeDto>allUserAmmeter){
		ChangeAmmeterDto changeAmmeterDto = null;
		String installDate = null;
		int lastFlag = 0;
		// 换表有功电量
	    double chgWorkQuantity = 0D;
		// 换表无功电量
	    double chgIdleQuantity = 0D;
		
		// 进行换表判断
		
		// -- 如果本月有上表且该用户所用电表数>1，说明该用户本月有换表
		if(thisMonthAmmeter.size()<=allUserAmmeter.size()){
			changeAmmeterDto = new ChangeAmmeterDto();
			for (Iterator iterator = thisMonthAmmeter.iterator(); iterator
					.hasNext();) {
				LwAmmeterChangeDto lwAmmeterChangeDto = (LwAmmeterChangeDto) iterator
						.next();
				installDate = lwAmmeterChangeDto.getInstallDate();
				
				// 历史表，则将换表的有功无功电量相加求和
					if(lastFlag<1){
						chgWorkQuantity +=lwAmmeterChangeDto.getChgWorkNum();
						chgIdleQuantity +=lwAmmeterChangeDto.getChgIdleQuantity();
						// 如果历史表不在当月安装，则只加最近表的换表有功、无功电量
						if(thisMonthAmmeter.size()==0){
							lastFlag = 1;
						}
					}				
				
			}
			changeAmmeterDto.setChgWorkQuantity(chgWorkQuantity);
			changeAmmeterDto.setChgIdleQuantity(chgIdleQuantity);
		}
		
		return changeAmmeterDto;

	}
	/**
	 * 计算变损电量
	 * 
	 * @param P0
	 *            空载损耗
	 * @param T
	 *            连续供电时间
	 * @param t
	 *            用电时间
	 * @param Pk
	 *            短路电流
	 * @param Se
	 *            额定容量
	 * @param AP
	 *            抄见有功电量
	 * @param AQ
	 *            抄见无功电量
	 * @return
	 */
	public static double calTransferLoss(double P0, double T, double t,
			double Pk, double Se, double AP, double AQ) {
		double P=0;
		if(AP==0){
		 P = 0;
		}else{
			P =P0 * T + Pk * (AP * AP + AQ * AQ) / (Se * Se * t);
		}
		return PowerFeeCal.getValue(P, AppConst.TWO_DOT_FLAG);
	}
	/**
	 * 计算线损
	 * 
	 * @param R
	 *            线路电阻值
	 * @param L
	 *            线路长度
	 * @param Ve
	 *            额定电压
	 * @param t
	 *            用电时间
	 * @param AP
	 *            抄见有功电量
	 * @param AQ
	 *            抄见无功电量
	 * @return
	 */
	public static double calLineLoss(double R, double L, double Ve, double t,
			double AP, double AQ) {
		double P = R * L * (AP * AP + AQ * AQ) / (1000 * Ve * Ve * t);
		return P;
	}
	
	/**
	 * 根据指定的格式，精确小数
	 * 
	 * @param number
	 * @param format
	 * @return
	 */
	public static double getValue(double number, String format) {
		java.text.DecimalFormat df = new java.text.DecimalFormat(format);
		String result = df.format(number);
		return Double.parseDouble(result);
	}
	
	/**
	 * 组织取得电价分类的条件。
	 * @param collection
	 * @return
	 */	
	public static String getUserCondition(Collection <LwPowerUserDto>collection){
		StringBuffer buffer = new StringBuffer();
		if(collection ==null||collection.size()==0) {
			buffer.append(" and 1=0 ");
		}else{
		buffer.append(" and (");
		buffer.append(" 1=0 ");
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwPowerUserDto lwPowerUserDto = (LwPowerUserDto) iterator.next();	
			buffer.append(" or userNo = '").append(lwPowerUserDto.getUserNo()).append("'");
			
		}
		buffer.append(")");
		}
		return buffer.toString();
	}
	public static String getBookNoCondition(Collection <LwBookUserDto>bookUserList){
		StringBuffer buffer = new StringBuffer();
		buffer.append(" and userNO in ( ");
		for (Iterator iterator = bookUserList.iterator(); iterator.hasNext();) {
			LwBookUserDto lwBookUserDto = (LwBookUserDto) iterator.next();
			buffer.append("'").append(lwBookUserDto.getUserNo()).append("'");
			buffer.append(",");
		}
		buffer.deleteCharAt(buffer.length()-1);
		buffer.append(" ) ");
		return buffer.toString();
	}
	/**
	 * 得到历史月的电价
	 * @param lwTownIndicatorDto
	 * @return
	 */
	public static SalePriceDto getHistoryPrice(LwTownIndicatorDto lwTownIndicatorDto){
		SalePriceDto salePriceDto = new SalePriceDto();
		salePriceDto.setBusinessPrice(lwTownIndicatorDto.getBusinessPrice());
		salePriceDto.setFarmPrice(lwTownIndicatorDto.getFarmPrice());
		salePriceDto.setIndustryPrice(lwTownIndicatorDto.getIndustryPrice());
		salePriceDto.setNotPeople(lwTownIndicatorDto.getNotPeoplePrice());
		salePriceDto.setPeoplePrice(lwTownIndicatorDto.getPeoplePrice());
		salePriceDto.setProducePrice(lwTownIndicatorDto.getProducePrice());
		return salePriceDto;
	}
	//日期比较
	 public static int compare_date(String DATE1, String DATE2) {
	   
	       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            Date dt1 = df.parse(DATE1);
	            Date dt2 = df.parse(DATE2);
	            if (dt1.getTime() > dt2.getTime()) {
	               
	                return 1;
	            } else if (dt1.getTime() < dt2.getTime()) {
	                
	                return -1;
	            } else {
	                return 0;
	            }
	        } catch (Exception exception) {
	            exception.printStackTrace();
	        }
	        return 0;
	    }
	 public static TownSataDto getSumCompanyStat(Collection <TownSataDto>resultList,String statMonth){
			
			TownSataDto townSataDto2= new TownSataDto();
			// 总电量
			double sumPower = 0.0;
			// 总电费
			double sumPowerFee = 0.0;
			// 电费
			double powerFee = 0.0;
			// 总电金
			double sumDianJin = 0.0;
			// 总三峡
			double sumSanXia = 0.0;
			// 总基金
			double sumJiJin = 0.0;
			// 总库区
			double sumKuQu = 0.0;

			

			// 纯电金
			double pureDianJin = 0.0;
			// 电金税
			double dianJinTax = 0.0;
			// 纯三峡
			double pureSanXia = 0.0;
			// 三峡税
			double sanXiaTax = 0.0;
			// 纯基金
			double pureJiJin = 0.0;
			// 基金税
			double jiJinTax = 0.0;
			// 纯电费
			double purePowerFee = 0D;
			// 电费税
			double powerFeeTax = 0.0;
			for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
				TownSataDto townSataDto = (TownSataDto) iterator.next();
				sumPower += townSataDto.getSumPower();
				sumPowerFee += townSataDto.getSumPowerFee();
				purePowerFee += townSataDto.getPurePowerFee();
				powerFee += townSataDto.getPowerFee();
				powerFeeTax += townSataDto.getPowerFeeTax();
				pureDianJin += townSataDto.getPureDianJin();
				dianJinTax += townSataDto.getDianJinTax();
				pureSanXia += townSataDto.getPureSanXia();
				sanXiaTax += townSataDto.getSanXiaTax();
				pureJiJin+= townSataDto.getPureJiJin();
				jiJinTax += townSataDto.getJiJinTax();
				
				
				townSataDto2.setPurePowerFee(PowerFeeCal.getValue(purePowerFee, AppConst.TWO_DOT_FLAG));
				townSataDto2.setPowerFeeTax(PowerFeeCal.getValue(powerFeeTax, AppConst.TWO_DOT_FLAG));
				townSataDto2.setPureDianJin(PowerFeeCal.getValue(pureDianJin, AppConst.TWO_DOT_FLAG));
				townSataDto2.setDianJinTax(PowerFeeCal.getValue(dianJinTax, AppConst.TWO_DOT_FLAG));
				townSataDto2.setPureSanXia(PowerFeeCal.getValue(pureSanXia, AppConst.TWO_DOT_FLAG));
				townSataDto2.setSanXiaTax(PowerFeeCal.getValue(sanXiaTax, AppConst.TWO_DOT_FLAG));
				townSataDto2.setPureJiJin(PowerFeeCal.getValue(pureJiJin, AppConst.TWO_DOT_FLAG));
				townSataDto2.setJiJinTax(PowerFeeCal.getValue(jiJinTax, AppConst.TWO_DOT_FLAG));
				
				townSataDto2.setSumPower(PowerFeeCal.getValue(sumPower, AppConst.TWO_DOT_FLAG));
				townSataDto2.setSumPowerFee(PowerFeeCal.getValue(sumPowerFee, AppConst.TWO_DOT_FLAG));
				townSataDto2.setStatMonth(statMonth);
				townSataDto2.setCompanyName("东、青、昆、高");
			}
			return townSataDto2;
		}
	 public static LwCorporationSummaryDto findonecorporation(String userno,String date)  throws Exception{
			
			BLLwCorporationSummaryFacade  blLwCorporationSummaryFacade=new BLLwCorporationSummaryFacade();
			LwCorporationSummaryDto  lwCorporationSummaryDto=new LwCorporationSummaryDto();
			lwCorporationSummaryDto=blLwCorporationSummaryFacade.findByPrimaryKey(userno, date);
			return  lwCorporationSummaryDto;
		}
	}
	

