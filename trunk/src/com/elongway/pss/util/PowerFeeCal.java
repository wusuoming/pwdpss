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
 * ��Ѽ��㹫ʽ version 1.0 create by ���ټ� 2008 .10 .10
 * 
 */

public class PowerFeeCal {

	public final static double zero = Double.parseDouble("0");

	// ����ܼ�
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
				- lastmeritoriousPointer);// ����
		BLLwPowerLineFacade blLwPowerLineFacade = new BLLwPowerLineFacade();
		PowerFeeCal powerFeeCal = new PowerFeeCal();
		double Rate = powerFeeCal.getRateCode(lineNo);
		sumPowerFee = (Integer.parseInt(meritoriousPointer) - lastmeritoriousPointer)
				* Rate;

		return (double) (Math.round((double) sumPowerFee * 10000) / 10000);
	}

	// ��õ�����µ���Ϣ
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

	// ��õ���ֵ
	public static double adjustmentValue(String meritoriousPointer,
			String unMeritoriousPointer, String PowerClass, String lineNo,
			String inputDAte) throws Exception {

		// -- ��������
		if (PowerClass.equals("1") || PowerClass.equals("2")) {
			PowerClass = "1";
		}
		LwRateCodeDto lwRateCodeDto = new LwRateCodeDto();
		Collection rateCodecollection = new ArrayList();
		BLLwRateCodeFacade blLwRateCodeFacade = new BLLwRateCodeFacade();

		// -- �õ���������
		double powerFactor = adjustrate(meritoriousPointer,
				unMeritoriousPointer, PowerClass, lineNo, inputDAte);

		// -- ���ҵ�����
		String sql = "1=1 and POWERFACTOR =" + powerFactor
				+ " and SUPPLETYPE='" + PowerClass + "'";
		rateCodecollection = blLwRateCodeFacade.findByConditions(sql);
		Iterator ratecode = rateCodecollection.iterator();
		while (ratecode.hasNext()) {
			lwRateCodeDto = (LwRateCodeDto) ratecode.next();
		}
		return Double.parseDouble(lwRateCodeDto.getAdjustRate());
	}

	// ��������
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
		String electrotherapy;// ����
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

	// �޸ĺ��ȡ�������� wangrongjia
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

	// �޸ĺ�Ļ�õ���ֵ wangrongjia
	public static double poweradjustmentValue(String workQuantity,
			String unworkQuantity, String PowerClass,String rateCode) throws Exception {

		// -- ��������
		if (PowerClass.equals("1") || PowerClass.equals("2")) {
			PowerClass = "1";
		}
		LwRateCodeDto lwRateCodeDto = new LwRateCodeDto();
		Collection rateCodecollection = new ArrayList();
		BLLwRateCodeFacade blLwRateCodeFacade = new BLLwRateCodeFacade();
		double ajust=0;
		// -- �õ���������
		//double powerFactor = poweradjustrate(workQuantity, unworkQuantity);
		double powerFactor=Double.parseDouble(rateCode)*100;
		if(powerFactor==0){
			ajust=0;
		}else{
		// -- ���ҵ�����
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
	//���۱�׼���
	public static LwWholeSalePurePriceDto getPurWholeSalePrice(String comcode,String KV)throws Exception{
		LwWholeSalePurePriceDto lwWholeSalePurePriceDto=new LwWholeSalePurePriceDto();
		BLLwWholeSalePurePriceFacade blLwWholeSalePurePriceFacade=new BLLwWholeSalePurePriceFacade();
		lwWholeSalePurePriceDto=blLwWholeSalePurePriceFacade.findByPrimaryKey(KV, comcode);
		return lwWholeSalePurePriceDto;
	}
	public static double  poweradjustmentCorporationValue(String workQuantity,
			String unworkQuantity, String PowerClass) throws Exception {

		// -- ��������
		if (PowerClass.equals("1") || PowerClass.equals("2")) {
			PowerClass = "1";
		}
		LwRateCodeDto lwRateCodeDto = new LwRateCodeDto();
		Collection rateCodecollection = new ArrayList();
		BLLwRateCodeFacade blLwRateCodeFacade = new BLLwRateCodeFacade();
		double ajust=0;
		// -- �õ���������
		double powerFactor = poweradjustrate(workQuantity, unworkQuantity);
		
		if(powerFactor==0){
			ajust=0;
		}else{
		// -- ���ҵ�����
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
	// ������۵ı�����̯
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
	 * �й�ָ��
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

	// ��ҵȡ�������
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

	// ���޹������ļ��㹫ʽ

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
				//- lastunMeritoriousPointer;// ����
		return 0;
	}

	// ��Ͽ��
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
	 * //��ҵ�й����� public static double factoryWorkPower(String LastWorkNum,String
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

	// ȡ��ҵ��ֱ�����ĵĵ�۵�����
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
	//��ҵͳ��
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
	

	// ��ñ���
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
	//ȡ��ҵ�������
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
//	ȡ��ҵ�����
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
//	ȡ��ҵ���
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
	// ȡ���۵ı�׼��۵�����
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

	// ȡ��ҵ��۸�
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
		}// 35-110KV����
		else if (VoltLevel==3) {
			VoltLevel=110;
		}// 110-220KV����
		else if (VoltLevel==4) {
			VoltLevel=220;
		}// 220������
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
		}// 35-110KV����
		else if (VoltLevel==3) {
			VoltLevel=110;
		}// 110-220KV����
		else if (VoltLevel==4) {
			VoltLevel=220;
		}// 220������
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

	// ȡ��ҵ�Ǿ����������

	// ȡ�������
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

	// ȡ�������
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
	 * ֱ�����ܵ�Ѽ��㹫ʽ 2008-10-16 add by qiaoyouliang
	 * 
	 * @param workNum
	 *            �����й�ָ��
	 * @param rateCode
	 *            ����
	 * @param lwProrateDto
	 *            ����������̯
	 * @param salePriceList
	 *            ��̯���
	 * @param adjustRate
	 *            ��������
	 * @param adjustValue
	 *            ����ֵ
	 * @return
	 */
	public static LwTownPriceSummaryDto townSumPowerFeeFormular(
			double sumQuantity, double rateCode, LwProrateDto lwProrateDto,
			SalePriceDto salePriceDto, double adjustRate, double adjustValue,
			String lineCode, String userNo, String statMonth) {

		/***********************************************************************
		 * ��0 -- ����������
		 **********************************************************************/
		// ũ�����
		double farmUseScale = 0.0;
		// ũ����
		double farmUsePrice = 0.0;
		/** ũ����� */
		double farmUseQuantity = 0.0;
		// ũ����
		double farmUseFee = 0.0;

		// ��������
		double productScale = 0.0;
		// �������
		double productPrice = 0.0;
		// ��������
		double productQuantity = 0.0;
		// �������
		double productFee = 0.0;

		// �������
		double peopleUseScale = 0.0;
		// ������
		double peopleUsePrice = 0.0;
		// �������
		double peopleUseQuantity = 0.0;
		// ������
		double peopleUseFee = 0.0;

		// �Ǿ������
		double notPeopleUseScale = 0.0;
		// �Ǿ�����
		double notPeopleUsePrice = 0.0;
		// �Ǿ������
		double notPeopleUseQuantity = 0.0;
		// �Ǿ�����
		double notPeopleUseFee = 0.0;

		// �ǹ�ҵ����
		double industryScale = 0.0;
		// �ǹ�ҵ���
		double industryPrice = 0.0;
		// �ǹ�ҵ����
		double industryQuantity = 0.0;
		// �ǹ�ҵ���
		double industryFee = 0.0;

		// ��ҵ����
		double bizScale = 0.0;
		// ��ҵ���
		double bizPrice = 0.0;
		// ��ҵ����
		double bizQuantity = 0.0;
		// ��ҵ���
		double bizFee = 0.0;
		// ��̯���
		double price = 0.0;
		// ��۷���
		String powerClass = "";
		// �ܵ���
		double sumPower = 0.0;
		// ���
		double sumDianJin = 0.0;
		// ��Ͽ
		double sumSanXia = 0.0;
		// ����
		double sumJiJin = 0.0;
		// ��������
		double sumKuQu = 0.0;
		// ��Ѻϼ�
		double sumFee = 0.0;
		// �ܵ��
		double electricityFee = 0.0;

		// �����Ѻϼ�
		double sumPeopleFee = 0.0;
		// �Ǿ����Ѻϼ�
		double sunNotPeopleFee = 0.0;
		// ũ���Ѻϼ�
		double sumFarmFee = 0.0;
		// ũҵ������Ѻϼ�
		double sumProduceFee = 0.0;
		// ��ҵ��Ѻϼ�
		double sumBizFee = 0.0;
		// �ǹ�ҵ��Ѻϼ�
		double sumIndustryFee = 0.0;
		// ��� DTO
		LwSalePriceDto lwSalePriceDto = null;

		/***********************************************************************
		 * ��1 -- ȡ�ñ�����̯�ĵ�ۺͷ�̯������
		 **********************************************************************/

		// ����������
		peopleUsePrice = salePriceDto.getPeoplePrice();
		peopleUseScale = lwProrateDto.getResident();

		// �Ǿ����������
		notPeopleUsePrice = salePriceDto.getNotPeople();
		notPeopleUseScale = lwProrateDto.getIndecisive();

		// ��ҵ���
		bizPrice = salePriceDto.getBusinessPrice();
		bizScale = lwProrateDto.getBusiness();

		// �ǹ�ҵ����ͨ���
		industryPrice = salePriceDto.getIndustryPrice();
		industryScale = lwProrateDto.getIndustry();

		// ũҵ�����õ�
		productPrice = salePriceDto.getProducePrice();
		productScale = lwProrateDto.getProduce();

		// ƶ����ũҵ�Ź��õ�
		farmUsePrice = salePriceDto.getFarmPrice();
		farmUseScale = lwProrateDto.getAgricultural();

		/***********************************************************************
		 * ��2 -- �����ܵ��������ʵ�ѡ�
		 **********************************************************************/
		// �ܵ���
		sumPower = sumQuantity;
		/***********************************************************************
		 * ��3 -- ���������̯��ѡ�������̯��ۡ�
		 **********************************************************************/
		// ũ����� = �ܵ��� * ũ��ı���
		farmUseQuantity = sumPower * farmUseScale;
		// ũ���� = ũ����� �� ũ����
		farmUseFee = farmUseQuantity * farmUsePrice;

		// �������� = �ܵ��� �� ��������
		productQuantity = sumPower * productScale;
		// ������� = �������� �� �������
		productFee = productQuantity * productPrice;
		// ������� = �ܵ��� �� �������
		peopleUseQuantity = sumPower * peopleUseScale;
		// ������ = ������� �� ������
		peopleUseFee = peopleUseQuantity * peopleUsePrice;

		// �Ǿ������ = �ܵ��� �� �Ǿ������
		notPeopleUseQuantity = sumPower * notPeopleUseScale;
		// �Ǿ����� = �Ǿ������ �� �Ǿ�����
		notPeopleUseFee = notPeopleUseQuantity * notPeopleUsePrice;

		// �ǹ�ҵ���� = �ܵ��� �� �ǹ�ҵ����
		industryQuantity = sumPower * industryScale;
		// �ǹ�ҵ��� = �ǹ�ҵ���� �� �ǹ�ҵ���
		industryFee = industryQuantity * industryPrice;

		// ��ҵ���� = �ܵ��� �� ��ҵ����
		bizQuantity = sumPower * bizScale;
		// ��ҵ��� = ��ҵ���� �� ��ҵ���
		bizFee = bizQuantity * bizPrice;

		bizQuantity = sumQuantity
				- (farmUseQuantity + productQuantity + peopleUseQuantity
						+ notPeopleUseQuantity + industryQuantity);
		// ��Ѻϼ� = ũ�� + ���� + ���� + �Ǿ��� + ���չ�ҵ + ��ҵ
		sumFee = farmUseFee + productFee + peopleUseFee + notPeopleUseFee
				+ industryFee + bizFee;

		/***********************************************************************
		 * ��5 -- ��ֱ֯�����Ѽ����ܱ�
		 **********************************************************************/
		LwTownPriceSummaryDto lwTownPriceSummaryDto = new LwTownPriceSummaryDto();
		// -- ����ֵ
		lwTownPriceSummaryDto.setAdjustValue(adjustValue);
		// -- ������Ϣά��
		lwTownPriceSummaryDto.setSumQuantity(PowerFeeCal.getValue(sumPower, AppConst.ZERO_DOT_FLAG));
		lwTownPriceSummaryDto.setLineCode(lineCode);
		lwTownPriceSummaryDto.setRateCode(rateCode);
		lwTownPriceSummaryDto.setRateFee(zero);
		lwTownPriceSummaryDto.setStatMonth(statMonth);
		// ��Ѻϼ�
		lwTownPriceSummaryDto.setSumFee(PowerFeeCal.getValue(sumFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setUserNo(userNo);
		lwTownPriceSummaryDto.setValidStatus("1");
		// -- ��֯��ҵ�õ�ĵ�ѡ���ۡ�����������
		lwTownPriceSummaryDto.setBizFee(PowerFeeCal.getValue(bizFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setBizPrice(bizPrice);
		lwTownPriceSummaryDto.setBizQuantity(PowerFeeCal.getValue(bizQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setBizScale(bizScale);
		// -- ��֯ũ���õ�ĵ�ѡ���ۡ�����������
		double tt = PowerFeeCal.getValue(farmUseFee, AppConst.FOUR_DOT_FLAG);
		lwTownPriceSummaryDto.setFarmFee(PowerFeeCal.getValue(farmUseFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setFarmPrice(farmUsePrice);
		lwTownPriceSummaryDto.setFarmQuantity(PowerFeeCal.getValue(farmUseQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setFarmScale(farmUseScale);
		// -- �ǹ�ҵ����ͨ��ҵ�õ�ĵ�ѡ���ۡ�����������
		lwTownPriceSummaryDto.setIndustryFee(PowerFeeCal.getValue(industryFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setIndustryPrice(industryPrice);
		lwTownPriceSummaryDto.setIndustryQuantity(PowerFeeCal.getValue(industryQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setIndustryScale(industryScale);
		// -- �Ǿ����õ�ĵ�ѡ���ۡ�����������
		lwTownPriceSummaryDto.setNotPeopleFee(PowerFeeCal.getValue(notPeopleUseFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setNotPeoplePrice(notPeopleUsePrice);
		lwTownPriceSummaryDto.setNotPeopleQuantity(PowerFeeCal.getValue(notPeopleUseQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setNotPeopleScale(notPeopleUseScale);
		// -- �����õ�ĵ�ѡ���ۡ�����������
		lwTownPriceSummaryDto.setPeopleFee(PowerFeeCal.getValue(peopleUseFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setPeoplePrice(peopleUsePrice);
		lwTownPriceSummaryDto.setPeopleQuantity(PowerFeeCal.getValue(peopleUseQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setPeopleScale(peopleUseScale);
		// -- ũҵ�����õ�ĵ�ѡ���ۡ�����������
		lwTownPriceSummaryDto.setProduceFee(PowerFeeCal.getValue(productFee, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setProducePrice(productPrice);
		lwTownPriceSummaryDto.setProduceQuantity(PowerFeeCal.getValue(productQuantity, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setProduceScale(productScale);

		/***********************************************************************
		 * ��5 -- �����Ľ���֯DTO��ũҵ�����ʽ���Ͽ�����ʽ𡢿�������Դ���ӷѡ���������
		 **********************************************************************/
		// ũҵ�����ʽ�
		sumDianJin = getTowndianJin(lwTownPriceSummaryDto, 0.02, 0.88);
		// ��Ͽ�����ʽ�
		sumSanXia = getTownsanXia(lwTownPriceSummaryDto, 0.004, 0.88);
		// ��������Դ���ӷ�
		sumJiJin = getTownjiJin(lwTownPriceSummaryDto, 0.002, 0.001,0.88);
		// ��������
		sumKuQu = getTownkuQu(lwTownPriceSummaryDto, 0.0031, 0.88);
		// �ܻ���
		lwTownPriceSummaryDto.setRemark(new Double(PowerFeeCal.getValue(sumJiJin+sumKuQu, AppConst.FOUR_DOT_FLAG)).toString());
		// -- ΪDTO ��ֵ
		lwTownPriceSummaryDto.setSumDianJin(PowerFeeCal.getValue(sumDianJin, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setSumSanXia(PowerFeeCal.getValue(sumSanXia, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setSumJiJin(PowerFeeCal.getValue(sumJiJin+sumKuQu, AppConst.FOUR_DOT_FLAG));
		lwTownPriceSummaryDto.setSumKuQu(PowerFeeCal.getValue(sumKuQu, AppConst.FOUR_DOT_FLAG));

		// �ܵ�� = ��Ѻϼ�+���ϼ�+��Ͽ+����ϼ�+�����ϼ�
		electricityFee = sumFee + sumDianJin + sumSanXia + sumJiJin + sumKuQu;
	//	lwTownPriceSummaryDto.setElectricFee(electricityFee);
		lwTownPriceSummaryDto.setElectricFee(PowerFeeCal.getValue(electricityFee, AppConst.FOUR_DOT_FLAG));
		/***********************************************************************
		 * ��6 -- ����ũҵ�����ʽ���Ͽ�����ʽ𡢿�������Դ���ӷѡ���������ı�����ֵ̯��
		 **********************************************************************/
		// ������̯���= �ܵ����������
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

		// ������̯��Ͽ= ����Ͽ���������
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

		// ������̯����= �ܻ�����������
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

		// ������̯����= �ܿ������������
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
		 * ��7 -- ���������̯��Ѻϼ���Ϣ��
		 **********************************************************************/
		// �����Ѻϼ� = ������+������+������Ͽ+�������+�������
		sumPeopleFee = peopleUseFee + peopleDianJin + peopleSanXia
				+ peopleJiJin + peopleKuQu;
		// �Ǿ����Ѻϼ� = �Ǿ�����+�Ǿ�����+�Ǿ�����Ͽ+�Ǿ������+�Ǿ������
		sunNotPeopleFee = notPeopleUseFee + notPeopleDianJin + notPeopleSanXia
				+ notPeopleJiJin + notPeopleKuQu;
		// ũ���Ѻϼ� = ũ����+ũ����+ũ����Ͽ+ũ�����+ũ�����
		sumFarmFee = farmUseFee + farmDianJin + farmSanXia + farmJiJin
				+ farmKuQu;
		// ũҵ������Ѻϼ� = ũҵ�������+ũҵ�������+ũҵ������Ͽ+ũҵ��������+ũҵ��������
		sumProduceFee = productFee + produceDianJin + produceSanXia
				+ produceJiJin + produceKuQu;
		// ��ҵ��Ѻϼ� = ��ҵ���+��ҵ���+��ҵ��Ͽ+��ҵ����+��ҵ����
		sumBizFee = bizFee + bizDianJin + bizSanXia + bizJiJin + bizKuQu;
		// �ǹ�ҵ��Ѻϼ� = �ǹ�ҵ���+�ǹ�ҵ���+�ǹ�ҵ��Ͽ+�ǹ�ҵ����+�ǹ�ҵ����
		sumIndustryFee = industryFee + industryDianJin + industrySanXia
				+ industryJiJin + industryKuQu;
		/***********************************************************************
		 * ��8 -- ��֯�ϼƵ�ѵ�DTO��
		 **********************************************************************/
		// ����
		lwTownPriceSummaryDto.setPeopleDianJin(peopleDianJin);
		lwTownPriceSummaryDto.setPeopleFeeSanXia(peopleSanXia);
		lwTownPriceSummaryDto.setPeopleJiJin(peopleJiJin);
		lwTownPriceSummaryDto.setPeopleKuQu(peopleKuQu);
		lwTownPriceSummaryDto.setSumPeopleFee(PowerFeeCal.getValue(peopleUseFee, AppConst.FOUR_DOT_FLAG));

		// �Ǿ���
		lwTownPriceSummaryDto.setNotPeopleDianJin(notPeopleDianJin);
		lwTownPriceSummaryDto.setNotPeopleFeeSanXia(notPeopleSanXia);
		lwTownPriceSummaryDto.setNotPeopleJiJin(notPeopleJiJin);
		lwTownPriceSummaryDto.setNotPeopleKuQu(notPeopleKuQu);
		lwTownPriceSummaryDto.setSumNotPeopleFee(PowerFeeCal.getValue(notPeopleUseFee, AppConst.FOUR_DOT_FLAG));

		// ũҵ����
		lwTownPriceSummaryDto.setProduceDianJin(produceDianJin);
		lwTownPriceSummaryDto.setProduceSanXia(produceSanXia);
		lwTownPriceSummaryDto.setProduceJiJin(produceJiJin);
		lwTownPriceSummaryDto.setProduceKuQu(produceKuQu);
		lwTownPriceSummaryDto.setSumProduceFee(PowerFeeCal.getValue(productFee, AppConst.FOUR_DOT_FLAG));

		// ũ��
		lwTownPriceSummaryDto.setFarmDianJin(farmDianJin);
		lwTownPriceSummaryDto.setFarmSanXia(farmSanXia);
		lwTownPriceSummaryDto.setFarmJiJin(farmJiJin);
		lwTownPriceSummaryDto.setFarmKuQu(farmKuQu);
		lwTownPriceSummaryDto.setSumFarmFee(PowerFeeCal.getValue(farmUseFee, AppConst.FOUR_DOT_FLAG));

		// ��ҵ
		lwTownPriceSummaryDto.setBizDianJin(bizDianJin);
		lwTownPriceSummaryDto.setBizSanXia(bizSanXia);
		lwTownPriceSummaryDto.setBizJiJin(bizJiJin);
		lwTownPriceSummaryDto.setBizKuQu(bizKuQu);
		lwTownPriceSummaryDto.setSumBizFee(PowerFeeCal.getValue(bizFee, AppConst.FOUR_DOT_FLAG));

		// ���չ�ҵ
		lwTownPriceSummaryDto.setIndustryDianJin(industryDianJin);
		lwTownPriceSummaryDto.setIndustrySanXia(industrySanXia);
		lwTownPriceSummaryDto.setIndustryJiJin(industryJiJin);
		lwTownPriceSummaryDto.setIndustryKuQu(industryKuQu);
		lwTownPriceSummaryDto.setSumIndustryFee(PowerFeeCal.getValue(industryFee, AppConst.FOUR_DOT_FLAG));

		return lwTownPriceSummaryDto;
	}
	/**
	 * ֱ������׷�յ�Ѽ��㹫ʽ 2008-12-17 add by qiaoyouliang
	 * 
	 * @param appendQuantity
	 *            ׷�ռ������
	 * @param lwProrateDto
	 *            ������̯
	 * @param oldPriceDto
	 *            ��ʷ���
	 * @param newPriceDto
	 *            �µ��
	 * @param userNo
	 *            �û�����
	 * @param statMonth
	 *            ͳ������
	 * @param appendMonth
	 *            ׷������
	 * @return
	 */
	public static LwTownPriceSummaryAppendDto townFeeAppendFormular(
			double appendQuantity, LwProrateDto lwProrateDto,
			SalePriceDto oldPriceDto, SalePriceDto newPriceDto, String userNo,
			String statMonth,String appendMonth) {

		/***********************************************************************
		 * ��0 -- ����������
		 **********************************************************************/
		// ũ�����
		double farmUseScale = 0.0;
		// ũ����ʷ���
		double oldFarmPrice = 0.0;
		// ũ���µ��
		double newFarmPrice = 0.0;
		/** ũ��׷�յ��� */
		double appendFarmQuantity = 0.0;
		// ũ����
		double appendFarmFee = 0.0;

		// ��������
		double productScale = 0.0;
		// ������ʷ���
		double oldProducePrice = 0.0;
		// �����µ��
		double newProducePrice = 0.0;
		// ����׷�յ���
		double appendProductQuantity = 0.0;
		// ����׷�յ��
		double appendProductFee = 0.0;

		// �������
		double peopleUseScale = 0.0;
		// ������ʷ���
		double oldPeoplePrice = 0.0;
		// �����µ��
		double newPeoplePrice = 0.0;
		// ����׷�ӵ���
		double appendPeopleUseQuantity = 0.0;
		// ������
		double appendPeopleFee = 0.0;

		// �Ǿ������
		double notPeopleUseScale = 0.0;
		// �Ǿ�����ʷ���
		double oldNotPeoplePrice = 0.0;
		// �Ǿ����µ��
		double newNotPeoplePrice = 0.0;
		// �Ǿ���׷�ӵ���
		double notPeopleUseQuantity = 0.0;
		// �Ǿ�����
		double appendNotPeopleFee = 0.0;

		// �ǹ�ҵ����
		double industryScale = 0.0;
		// �ǹ�ҵ��ʷ���
		double oldIndustryPrice = 0.0;
		// �ǹ�ҵ�µ��
		double newIndustryPrice = 0.0;
		// �ǹ�ҵ׷�յ���
		double appendIndustryQuantity = 0.0;
		// ���չ�ҵ���
		double appendIndustryFee = 0.0;

		// ��ҵ����
		double bizScale = 0.0;
		// ��ҵ��ʷ���
		double oldBizPrice = 0.0;
		// ��ҵ�µ��
		double newBizPrice = 0.0;
		// ��ҵ׷�յ���
		double appendBizQuantity = 0.0;
		// ��ҵ���
		double appendBizFee = 0.0;

		// ���
		double sumDianJin = 0.0;
		// ��Ͽ
		double sumSanXia = 0.0;
		// ����
		double sumJiJin = 0.0;
		// ��������
		double sumKuQu = 0.0;
		// ��Ѻϼ�
		double appendPowerFee = 0.0;
		// �ܵ��
		double electricityFee = 0.0;

		// ��� DTO
		LwSalePriceDto lwSalePriceDto = null;

		/***********************************************************************
		 * ��1 -- ȡ�ñ�����̯�ĵ�ۺͷ�̯������
		 **********************************************************************/

		// ���������ۡ�����
		oldPeoplePrice = oldPriceDto.getPeoplePrice();
		newPeoplePrice = newPriceDto.getPeoplePrice();
		peopleUseScale = lwProrateDto.getResident();

		// �Ǿ���������ۡ�����
		oldNotPeoplePrice = oldPriceDto.getNotPeople();
		newNotPeoplePrice = newPriceDto.getNotPeople();
		notPeopleUseScale = lwProrateDto.getIndecisive();

		// ��ҵ��ۡ�����
		oldBizPrice = oldPriceDto.getBusinessPrice();
		newBizPrice = newPriceDto.getBusinessPrice();
		bizScale = lwProrateDto.getBusiness();

		// �ǹ�ҵ����ͨ��ۡ�����
		oldIndustryPrice = oldPriceDto.getIndustryPrice();
		newIndustryPrice = newPriceDto.getIndustryPrice();
		industryScale = lwProrateDto.getIndustry();

		// ũҵ�����õ硢����
		oldProducePrice = oldPriceDto.getProducePrice();
		newProducePrice = newPriceDto.getProducePrice();
		productScale = lwProrateDto.getProduce();

		// ƶ����ũҵ�Ź��õ硢����
		oldFarmPrice = oldPriceDto.getFarmPrice();
		newFarmPrice = newPriceDto.getFarmPrice();
		farmUseScale = lwProrateDto.getAgricultural();

	
		/***********************************************************************
		 * ��3 -- ���ձ�����̯����׷�յ�ѵļ��㡿
		 **********************************************************************/
		// ũ��׷�յ��� = �ܵ��� * ũ��ı���
		appendFarmQuantity = appendQuantity * farmUseScale;
		// ũ��׷�յ�� = ũ��׷�յ��� �� ũ����
		appendFarmFee = appendFarmQuantity * (newFarmPrice - oldFarmPrice);

		// �������� = �ܵ��� �� ��������
		appendProductQuantity = appendQuantity * productScale;
		// ����׷�յ�� = �������� �� �������
		appendProductFee = appendProductQuantity * (newProducePrice - oldProducePrice);
		
		// ����׷�ӵ��� = �ܵ��� �� �������
		appendPeopleUseQuantity = appendQuantity * peopleUseScale;
		// ����׷�յ�� = ����׷�ӵ��� �� ������
		appendPeopleFee = appendPeopleUseQuantity * (oldPeoplePrice - oldPeoplePrice);

		// �Ǿ���׷�ӵ��� = �ܵ��� �� �Ǿ������
		notPeopleUseQuantity = appendQuantity * notPeopleUseScale;
		// �Ǿ���׷�յ�� = �Ǿ���׷�ӵ��� �� �Ǿ�����
		appendNotPeopleFee = notPeopleUseQuantity * (newNotPeoplePrice - oldNotPeoplePrice);;

		// �ǹ�ҵ׷�յ��� = �ܵ��� �� �ǹ�ҵ����
		appendIndustryQuantity = appendQuantity * industryScale;
		// ���չ�ҵ��� = �ǹ�ҵ׷�յ��� �� �ǹ�ҵ���
		appendIndustryFee = appendIndustryQuantity * (newIndustryPrice - oldIndustryPrice);;

		// ��ҵ׷�յ��� = �ܵ��� �� ��ҵ����
		appendBizQuantity = appendQuantity * bizScale;
		// ��ҵ׷�յ�� = ��ҵ׷�յ��� �� ��ҵ���
		appendBizFee = appendBizQuantity * (newBizPrice - oldBizPrice);;

		appendBizQuantity = appendQuantity
				- (appendFarmQuantity + appendProductQuantity + appendPeopleUseQuantity
						+ notPeopleUseQuantity + appendIndustryQuantity);
		// ��Ѻϼ� = ũ�� + ���� + ���� + �Ǿ��� + ���չ�ҵ + ��ҵ
		appendPowerFee = appendFarmFee + appendProductFee + appendPeopleFee + appendNotPeopleFee
				+ appendIndustryFee + appendBizFee;

		/***********************************************************************
		 * ��5 -- ��ֱ֯�����Ѽ����ܱ�
		 **********************************************************************/
		LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto = new LwTownPriceSummaryAppendDto();

		// -- ������Ϣά��
		lwTownPriceSummaryAppendDto.setAppendCalQuantity(appendQuantity);
		lwTownPriceSummaryAppendDto.setStatMonth(statMonth);
		lwTownPriceSummaryAppendDto.setUserNo(userNo);

		// ��Ѻϼ�
		lwTownPriceSummaryAppendDto.setAppendCalPowerFee(appendPowerFee);
		lwTownPriceSummaryAppendDto.setValidStatus("1");

		return lwTownPriceSummaryAppendDto;
	}

	/**
	 * ���������·�ĵ�ѹ�ȼ�����֯����
	 * 
	 * @param voltLevel
	 * @return
	 */
	public static String getSalePowerCondition(double level) {

		StringBuffer buffer = new StringBuffer();
		// ����1KV
		if (level < 1) {
			buffer.append(" and VoltageEnd='1' ");
		}// 1-10KV
		else if ((level <= 10 && level >= 1)) {
			buffer.append(" and VoltageEnd='10' ");
		}// 35-110KV����
		else if ((level < 110 && level >= 35)) {
			buffer.append(" and VoltageEnd='110' ");
		}// 110-220KV����
		else if ((level < 220 && level >= 110)) {
			buffer.append(" and VoltageEnd='220' ");
		}// 220������
		else {
			buffer.append(" and VoltageBegin='220' ");
		}

		return buffer.toString();
	}

	/**
	 * ���������·�������룬��֯����
	 * 
	 * @param voltLevel
	 * @return
	 */
	public static String getSalePowerCondition(String saleVoltCode) {

		StringBuffer buffer = new StringBuffer();
		// ����1KV
		if ("1".equals(saleVoltCode)) {
			buffer.append(" and VoltageEnd='1' ");
		}// 1-10KV
		else if ("2".equals(saleVoltCode)) {
			buffer.append(" and VoltageEnd='10' ");
		}// 35-110KV����
		else if ("3".equals(saleVoltCode)) {
			buffer.append(" and VoltageEnd='110' ");
		}// 110-220KV����
		else if ("4".equals(saleVoltCode)) {
			buffer.append(" and VoltageEnd='220' ");
		}// 220������
		else {
			buffer.append(" and VoltageBegin='220' ");
		}

		return buffer.toString();
	}

	/**
	 * ����ֱ����ũҵ�����ʽ�ʽ�����
	 * 
	 * @param lwTownPriceSummaryDto
	 *            ��Ѽ���DTO
	 * @param price
	 *            �۸�
	 * @param loss
	 *            ��ʧ
	 * @return ֱ������
	 */

	public static double getTowndianJin(
			LwTownPriceSummaryDto lwTownPriceSummaryDto, double price,
			double loss) {

		double sumPower = 0.0;
		double farmUseQuantity = 0.0;
		if (lwTownPriceSummaryDto != null) {
			// �ܵ���
			sumPower = lwTownPriceSummaryDto.getSumQuantity();
			// ũ�����
			farmUseQuantity = lwTownPriceSummaryDto.getFarmQuantity();
		}
		// ֱ������ = ���ܵ��� - ũ�ࣩ�� 0.02 �� 0.88
		return (sumPower - farmUseQuantity) * price * loss;
	}

	/**
	 * ����ֱ������Ͽ�����ʽ�ʽ����Ͽ��
	 * 
	 * @param lwTownPriceSummaryDto
	 *            ��Ѽ���DTO
	 * @param price
	 *            �۸�
	 * @param loss
	 *            ��ʧ
	 * @return ��Ͽ
	 */
	public static double getTownsanXia(
			LwTownPriceSummaryDto lwTownPriceSummaryDto, double price,
			double loss) {

		double sumPower = 0.0;
		if (lwTownPriceSummaryDto != null) {
			// �ܵ���
			sumPower = lwTownPriceSummaryDto.getSumQuantity();
		}
		// ֱ������ = �ܵ��� �� 0.004 �� 0.88
		return sumPower * price * loss;
	}

	/**
	 * ����ֱ�����������Դ���ӷ�
	 * 
	 * @param lwTownPriceSummaryDto
	 *            ��Ѽ���DTO
	 * @param price
	 *            �۸�
	 * @param loss
	 *            ��ʧ
	 * @return ����
	 */
	public static double getTownjiJin(
			LwTownPriceSummaryDto lwTownPriceSummaryDto, double jijinPrice,double peoplePrice,
			double loss) {
		// ����
		double peopleQuantity = 0.0;
		// ��ҵ
		double bizQuantity = 0.0;
		// ���չ�ҵ
		double industryQuantity = 0.0;
		// �Ǿ���
		double notPeopleQuantity = 0.0;
		
		double peopleDianjin = 0.0;
		double otherDianjin = 0.0;
		if (lwTownPriceSummaryDto != null) {
			peopleQuantity = lwTownPriceSummaryDto.getPeopleQuantity();
			bizQuantity = lwTownPriceSummaryDto.getBizQuantity();
			industryQuantity = lwTownPriceSummaryDto.getIndustryQuantity();
			notPeopleQuantity = lwTownPriceSummaryDto.getNotPeopleQuantity();

		}
		// ֱ�����������Դ���ӷ� = ����ҵ + �Ǿ��� + ���գ� �� 0.002 �� 0.88 + ���� �� 0.01 �� 0.88
		peopleDianjin = peopleQuantity * peoplePrice * loss;
		otherDianjin = (bizQuantity + industryQuantity +notPeopleQuantity )*jijinPrice * loss;
		
		return peopleDianjin+otherDianjin;
	}

	/**
	 * ����ֱ�����������
	 * 
	 * @author qiaoyouliang 2008-10-15 add
	 * @param lwTownPriceSummaryDto
	 *            ��Ѽ���DTO
	 * @param price
	 *            �۸�
	 * @param loss
	 *            ��ʧ
	 * @return ����
	 */
	public static double getTownkuQu(
			LwTownPriceSummaryDto lwTownPriceSummaryDto, double price,
			double loss) {
		// �ܵ���
		double sumPower = 0.0;
		// ũ��
		double farmUseQuantity = 0.0;
		// ũҵ����
		double produceQuantity = 0.0;
		if (lwTownPriceSummaryDto != null) {

			sumPower = lwTownPriceSummaryDto.getSumQuantity();
			farmUseQuantity = lwTownPriceSummaryDto.getFarmQuantity();
			produceQuantity = lwTownPriceSummaryDto.getProduceQuantity();

		}
		// �������� = ���ܵ��� - ũ�� - ũҵ������ �� 0.0031 �� 0.88
		return (sumPower - farmUseQuantity - produceQuantity) * price * loss;
	}

	/**
	 * ������ָ��
	 */
	public static void saveIndicator(LwAmmeterIndicatorDto dto) {
		// ���
		String ammetorNo = dto.getAmmeterNo();
		// ��ǰָ��
		int currentNum = dto.getCurrentNum();
		// ��������
		String readDate = dto.getReadAmmeterDate();
		// �ϱ�����
		String operateDate = dto.getOperateDate();
		// �ϱ�ָ��
		int startNum = dto.getStartNum();

		DateTime dateTime = new DateTime(readDate, DateTime.YEAR_TO_MONTH);

	}



	/**
	 * �õ�������
	 * 
	 * @return
	 */
	public static String getCurrentBillMonth() {
		String statMonth = new DateTime(new java.util.Date(),
				DateTime.YEAR_TO_MONTH).toString();
		return statMonth;
	}

	
	/**
	 * �õ��ϸ�������
	 * 
	 * @return
	 */
	public static String getLastBillMonth() {
		String statMonth = new DateTime(new java.util.Date(),
				DateTime.YEAR_TO_MONTH).addMonth(-1).toString();
		return statMonth;
	}

	/**
	 * �����Ƿ񻻱�
	 * ������ص�DtoΪnull����˵��û�л�������˵������������ȡ���ϱ��й�ָ�롢�ϱ��޹�ָ�롢�����й������������޹�����
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
		
		// ���½����գ����£�
		String statMonth = getCurrentBillMonth();
		// �����������ϱ�ʱ�併���ţ����µ��ɵ�˳��
		buffer.append(" userNo = '").append(userNo).append("' order by installDate desc");
		// ���Ҹ��û������е��
		allUserAmmeter =  blLwAmmeterChangeFacade.findByConditions(buffer.toString());
		
		// �ѵ��������ĵ���������
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
		// ���л����ж�
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
		
		// ���½����գ����£�
		String statMonth = getCurrentBillMonth();
		// �����������ϱ�ʱ�併���ţ����µ��ɵ�˳��
		buffer.append(" userNo = '").append(userNo).append("' and AMMETERNO ='"+a+"' order by installDate desc");
		// ���Ҹ��û������е��
		allUserAmmeter =  blLwAmmeterChangeFacade.findByConditions(buffer.toString());
		
		// �ѵ��������ĵ���������
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
		// ���л����ж�
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
		// ���½����գ����£�
		String statMonth = getCurrentBillMonth();
		// ���½����գ����£�
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
		// �����й�����
	    double chgWorkQuantity = 0D;
		// �����޹�����
	    double chgIdleQuantity = 0D;
		
		// ���л����ж�
		
		// -- ����������ϱ��Ҹ��û����õ����>1��˵�����û������л���
		if(thisMonthAmmeter.size()<=allUserAmmeter.size()){
			changeAmmeterDto = new ChangeAmmeterDto();
			for (Iterator iterator = thisMonthAmmeter.iterator(); iterator
					.hasNext();) {
				LwAmmeterChangeDto lwAmmeterChangeDto = (LwAmmeterChangeDto) iterator
						.next();
				installDate = lwAmmeterChangeDto.getInstallDate();
				
				// ��ʷ���򽫻�����й��޹�����������
					if(lastFlag<1){
						chgWorkQuantity +=lwAmmeterChangeDto.getChgWorkNum();
						chgIdleQuantity +=lwAmmeterChangeDto.getChgIdleQuantity();
						// �����ʷ���ڵ��°�װ����ֻ�������Ļ����й����޹�����
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
	 * ����������
	 * 
	 * @param P0
	 *            �������
	 * @param T
	 *            ��������ʱ��
	 * @param t
	 *            �õ�ʱ��
	 * @param Pk
	 *            ��·����
	 * @param Se
	 *            �����
	 * @param AP
	 *            �����й�����
	 * @param AQ
	 *            �����޹�����
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
	 * ��������
	 * 
	 * @param R
	 *            ��·����ֵ
	 * @param L
	 *            ��·����
	 * @param Ve
	 *            ���ѹ
	 * @param t
	 *            �õ�ʱ��
	 * @param AP
	 *            �����й�����
	 * @param AQ
	 *            �����޹�����
	 * @return
	 */
	public static double calLineLoss(double R, double L, double Ve, double t,
			double AP, double AQ) {
		double P = R * L * (AP * AP + AQ * AQ) / (1000 * Ve * Ve * t);
		return P;
	}
	
	/**
	 * ����ָ���ĸ�ʽ����ȷС��
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
	 * ��֯ȡ�õ�۷����������
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
	 * �õ���ʷ�µĵ��
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
	//���ڱȽ�
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
			// �ܵ���
			double sumPower = 0.0;
			// �ܵ��
			double sumPowerFee = 0.0;
			// ���
			double powerFee = 0.0;
			// �ܵ��
			double sumDianJin = 0.0;
			// ����Ͽ
			double sumSanXia = 0.0;
			// �ܻ���
			double sumJiJin = 0.0;
			// �ܿ���
			double sumKuQu = 0.0;

			

			// �����
			double pureDianJin = 0.0;
			// ���˰
			double dianJinTax = 0.0;
			// ����Ͽ
			double pureSanXia = 0.0;
			// ��Ͽ˰
			double sanXiaTax = 0.0;
			// ������
			double pureJiJin = 0.0;
			// ����˰
			double jiJinTax = 0.0;
			// �����
			double purePowerFee = 0D;
			// ���˰
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
				townSataDto2.setCompanyName("�����ࡢ������");
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
	

