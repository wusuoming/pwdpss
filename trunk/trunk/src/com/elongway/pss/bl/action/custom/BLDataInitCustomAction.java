package com.elongway.pss.bl.action.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.elongway.pss.bl.action.domain.BLLwFactoryIndicatorAction;
import com.elongway.pss.bl.action.domain.BLLwFactoryIndicatorBakAction;
import com.elongway.pss.bl.action.domain.BLLwNewFactoryIndicatorAction;
import com.elongway.pss.bl.action.domain.BLLwTownIndicatorAction;
import com.elongway.pss.bl.action.domain.BLLwTownIndicatorBakAction;
import com.elongway.pss.bl.action.domain.BLLwWholeSaleIndicatorAction;
import com.elongway.pss.bl.action.domain.BLLwWholeSaleIndicatorBakAction;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwPowerUserFacade;
import com.elongway.pss.bl.facade.BLLwTownIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorBakDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwTownIndicatorBakDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorBakDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.DataUtils;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * 数据初始化Action
 * @author qiaoyouliang 2008-11-04
 *
 */
public class BLDataInitCustomAction {
	/**
	 * 直供乡月数据初始化
	 * 在每月即将核算的结帐日之前，执行操作。
	 * @param statMonth 本月帐期
	 * @throws Exception 
	 */
	public void initTownMonthData(String statMonth) throws Exception {
		// 声明变量
		BLLwTownIndicatorFacade blLwTownIndicatorFacade = new BLLwTownIndicatorFacade();
		Collection<LwTownIndicatorBakDto> lastList = new ArrayList<LwTownIndicatorBakDto>();
		Collection<LwTownIndicatorDto> thisList = new ArrayList<LwTownIndicatorDto>();
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		Collection<LwTownIndicatorDto> lastListTemp = null;
		Collection<LwTownIndicatorDto> lastBak = null;
		LwTownIndicatorBakDto lwTownIndicatorBakDto = null;
		LwTownIndicatorDto lwTownIndicatorDto = null;
		LwPowerUserDto lwPowerUserDto = null;
		Collection ammeterList = null;
		double lastIndicator = 0;
		
		// 0-首先判断是否当月执行过初始化
		Collection initList = blLwTownIndicatorFacade.findByConditions( " statMonth = '"+statMonth+"'");	
		
		if(initList==null ||initList.size()==0 ){

		// 1-取出上月指针数
		lastListTemp = blLwTownIndicatorFacade.findByConditions( " statMonth = '"+statMonth+"'");
		
		// 2-将指针记录表DTO组织成指针记录备份表DTO
		for (Iterator iterator = lastListTemp.iterator(); iterator.hasNext();) {
			lwTownIndicatorDto = (LwTownIndicatorDto) iterator
					.next();
			lwTownIndicatorBakDto = new LwTownIndicatorBakDto();
			DataUtils.copySimpleObject(lwTownIndicatorBakDto, lwTownIndicatorDto);
			lastList.add(lwTownIndicatorBakDto);
		}
		// 3-再次取出上月指针数，但是在循环之后，即变成为本月指针数
		lastBak = blLwTownIndicatorFacade.findByConditions( " statMonth = '"+statMonth+"'");

		// 4-循环结束之后，即可完成月数据初始化的DTO的组织
		for (Iterator iterator = lastBak.iterator(); iterator.hasNext();) {
			LwTownIndicatorDto dto = (LwTownIndicatorDto) iterator.next();
			lastIndicator = dto.getThisWorkNum();
			lwTownIndicatorDto = new LwTownIndicatorDto();
			lwTownIndicatorDto.setThisWorkNum(lastIndicator);
			lwTownIndicatorDto.setLastWorkNum(lastIndicator);
			lwTownIndicatorDto.setStatMonth(statMonth);
			lwTownIndicatorDto.setUserNo(dto.getUserNo());
			ammeterList = new BLLwAmmeterChangeFacade().findByConditions(" 1=1 and userNo = '"+dto.getUserNo()+"' and flag = '1'");
			if(ammeterList!=null&&ammeterList.size()!=0){
				Iterator it = ammeterList.iterator();
				LwAmmeterChangeDto o = (LwAmmeterChangeDto)it.next();
				lwTownIndicatorDto.setRate(Double.parseDouble(o.getRate()));				
			}
			
			thisList.add(lwTownIndicatorDto);
			
		}
		// 5-上月指针数移动到备份表，初始化本月指针数
		this.townMonthDataMove(thisList, lastList);
		}else{
			throw new UserException(-6,-704,this.getClass().getName());
		}
		

	}
	/**
	 * 大工业月数据初始化
	 * 在每月即将核算的结帐日之前，执行操作。
	 * @param statMonth
	 *            帐期
	 */
	public void initFactoryMonthData(String statMonth)throws Exception{
		// 声明变量
		BLLwNewFactoryIndicatorFacade blLwNewFactoryIndicatorFacade = new BLLwNewFactoryIndicatorFacade();
		Collection<LwNewFactoryIndicatorBakDto> lastList = new ArrayList<LwNewFactoryIndicatorBakDto>();
		Collection<LwNewFactoryIndicatorDto> thisList = new ArrayList<LwNewFactoryIndicatorDto>();
		Collection<LwNewFactoryIndicatorDto> lastListtemp = null;
		Collection<LwNewFactoryIndicatorDto> lastBak = null;
		LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto = null;
		LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = new LwNewFactoryIndicatorDto();
		Collection ammeterList = null;
		double lastWorkIndicator = 0;
		double lastIdleIndicator = 0;
		double lastPeopleworkIndicator = 0;
		double lastPeopleIdleIndicator = 0;
		
		// 0-首先判断是否当月执行过初始化
		Collection initList = blLwNewFactoryIndicatorFacade.findByConditions( " statMonth = '"+statMonth+"'");
		
		if(initList==null ||initList.size()==0 ){
		// 1-取出上月指针数
		lastListtemp = blLwNewFactoryIndicatorFacade.findByConditions( " ");
		// 2-将指针记录表DTO组织成指针记录备份表DTO
		for (Iterator iterator = lastListtemp.iterator(); iterator.hasNext();) {
			lwNewFactoryIndicatorDto = (LwNewFactoryIndicatorDto) iterator
					.next();
			lwNewFactoryIndicatorBakDto = new LwNewFactoryIndicatorBakDto();
			DataUtils.copySimpleObject(lwNewFactoryIndicatorBakDto, lwNewFactoryIndicatorDto);
			lastList.add(lwNewFactoryIndicatorBakDto);
		}
		// 3-再次取出上月指针数，但是在循环之后，即变成为本月指针数
		lastBak = blLwNewFactoryIndicatorFacade.findByConditions( " ");

		// 4-循环结束之后，即可完成月数据初始化的DTO的组织
		for (Iterator iterator = lastBak.iterator(); iterator.hasNext();) {
			LwNewFactoryIndicatorDto dto = (LwNewFactoryIndicatorDto) iterator.next();
			lastWorkIndicator = dto.getThisWorkNum();
			lastIdleIndicator = dto.getThisIdleNum();
			
			lwNewFactoryIndicatorDto = new LwNewFactoryIndicatorDto();
			// 将本月指针记录的本月有功指针赋值为上月指针记录的当月有功指针
			lwNewFactoryIndicatorDto.setThisWorkNum(lastWorkIndicator);
			// 将本月指针记录的本月无功指针赋值为上月指针记录的当月无功指针
			lwNewFactoryIndicatorDto.setThisIdleNum(lastIdleIndicator);
            // 本月指针记录的上月无功指针赋值为上月指针记录的当月无功指针
			lwNewFactoryIndicatorDto.setLastIdleNum(lastIdleIndicator);
			// 本月指针记录的上月有功指针赋值为上月指针记录的当月有功指针
			lwNewFactoryIndicatorDto.setLastWorkNum(lastWorkIndicator);
			//电表类别
			lwNewFactoryIndicatorDto.setAmmeterStyle(dto.getAmmeterStyle());
			//表号
			lwNewFactoryIndicatorDto.setAmmeterNo(dto.getAmmeterNo());
			
			
			lwNewFactoryIndicatorDto.setStatMonth(statMonth);
			lwNewFactoryIndicatorDto.setUserNo(dto.getUserNo());
			lwNewFactoryIndicatorDto.setUsername(dto.getUsername());
			ammeterList = new BLLwAmmeterChangeFacade().findByConditions(" 1=1 and userNo = '"+dto.getUserNo()+"' and flag = '1'"+" and AMMETERNO='"+dto.getAmmeterNo()+"'");
			if(ammeterList!=null&&ammeterList.size()!=0){
				Iterator it = ammeterList.iterator();
				LwAmmeterChangeDto o = (LwAmmeterChangeDto)it.next();
				lwNewFactoryIndicatorDto.setRate(Double.parseDouble(o.getRate()));
			
			}
			//lwFactoryIndicatorDto.setRate(dto.getRate());
			//lwNewFactoryIndicatorDto.setPeopleRate(dto.getPeopleRate());
			lwNewFactoryIndicatorDto.setInputDate(new DateTime(new java.util.Date(),DateTime.YEAR_TO_DAY).toString());
			thisList.add(lwNewFactoryIndicatorDto);
		}

		// 5-上月指针数移动到备份表，初始化本月指针数
		this.factoryMonthDataMove(thisList, lastList);
		}else{
			throw new UserException(-6,-704,this.getClass().getName());
		}
	}
	/**
	 * 趸售月数据初始化 
	 * 在每月即将核算的结帐日之前，执行操作。
	 * @param statMonth 帐期
	 */
	public void initWholeSaleMonthData(String statMonth)throws Exception{
		// 声明变量
		BLLwWholeSaleIndicatorFacade blLwWholeSaleIndicatorFacade = new BLLwWholeSaleIndicatorFacade();
		Collection<LwWholeSaleIndicatorBakDto> lastList = new ArrayList<LwWholeSaleIndicatorBakDto>();
		Collection<LwWholeSaleIndicatorDto> thisList = new ArrayList<LwWholeSaleIndicatorDto>();
		Collection<LwWholeSaleIndicatorDto> lastListtemp = null;
		Collection<LwWholeSaleIndicatorDto> lastBak = null;
		LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto = null;
		LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = null;
		double lastWorkIndicator = 0;
		double lastIdleIndicator = 0;
		Collection ammeterList = null;

		// 0-首先判断是否当月执行过初始化
		Collection initList = blLwWholeSaleIndicatorFacade.findByConditions( " statMonth = '"+statMonth+"'");
		if(initList==null ||initList.size()==0 ){
		// 1-取出上月指针数
		lastListtemp = blLwWholeSaleIndicatorFacade.findByConditions( "");
		// 2-将指针记录表DTO组织成指针记录备份表DTO
		for (Iterator iterator = lastListtemp.iterator(); iterator.hasNext();) {
			lwWholeSaleIndicatorDto = (LwWholeSaleIndicatorDto) iterator
					.next();
			lwWholeSaleIndicatorBakDto = new LwWholeSaleIndicatorBakDto();
			DataUtils.copySimpleObject(lwWholeSaleIndicatorBakDto, lwWholeSaleIndicatorDto);
			lastList.add(lwWholeSaleIndicatorBakDto);
		}
		// 3-再次取出上月指针数，但是在循环之后，即变成为本月指针数
		lastBak = blLwWholeSaleIndicatorFacade.findByConditions("");

		// 4-循环结束之后，即可完成月数据初始化的DTO的组织
		for (Iterator iterator = lastBak.iterator(); iterator.hasNext();) {
			LwWholeSaleIndicatorDto dto = (LwWholeSaleIndicatorDto) iterator.next();
			lastWorkIndicator = dto.getThisWorkNum();
			lastIdleIndicator = dto.getThisIdleNum();
			
			lwWholeSaleIndicatorDto = new LwWholeSaleIndicatorDto();
			// 将本月指针记录的本月有功指针赋值为上月指针记录的当月有功指针
			lwWholeSaleIndicatorDto.setThisWorkNum(lastWorkIndicator);
			// 将本月指针记录的本月无功指针赋值为上月指针记录的当月无功指针
			lwWholeSaleIndicatorDto.setThisIdleNum(lastIdleIndicator);
            // 本月指针记录的上月无功指针赋值为上月指针记录的当月无功指针
			lwWholeSaleIndicatorDto.setLastIdleNum(lastIdleIndicator);
			//是否算费标志
			lwWholeSaleIndicatorDto.setIfCal(dto.getIfCal());
			//所属公司
			lwWholeSaleIndicatorDto.setFlag(dto.getFlag());
			//
			// 本月指针记录的上月有功指针赋值为上月指针记录的有功指针
			lwWholeSaleIndicatorDto.setLastWorkNum(lastWorkIndicator);
			lwWholeSaleIndicatorDto.setStatMonth(statMonth);
			lwWholeSaleIndicatorDto.setUserNo(dto.getUserNo());
			ammeterList = new BLLwAmmeterChangeFacade().findByConditions(" 1=1 and userNo = '"+dto.getUserNo()+"' and flag = '1'");
			if(ammeterList!=null&&ammeterList.size()!=0){
				Iterator it = ammeterList.iterator();
				LwAmmeterChangeDto o = (LwAmmeterChangeDto)it.next();
				lwWholeSaleIndicatorDto.setRate(Double.parseDouble(o.getRate()));	
				
			}
			lwWholeSaleIndicatorDto.setFlag(dto.getFlag());
			thisList.add(lwWholeSaleIndicatorDto);
		}

		// 5-上月指针数移动到备份表，初始化本月指针数
		this.wholeSaleMonthDataMove(thisList, lastList);
		}else{
			throw new UserException(-6,-704,this.getClass().getName());
		}
	}
	/**
	 * 直供乡月数据迁移
	 * @param thisList 本月抄表记录数
	 * @param lastList 上月抄表记录数
	 * @throws Exception
	 */
	public void townMonthDataMove(Collection thisList, Collection lastList)
			throws Exception {
		BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
		BLLwTownIndicatorBakAction blLwTownIndicatorBakAction = new BLLwTownIndicatorBakAction();
		DBManager dbManager = new DBManager();
		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			// 所有操作在一个事物中执行
			// 1-将上月的指针数插入指针记录备份表中
			blLwTownIndicatorBakAction.insertAll(dbManager, lastList);
			// 2-将上月的指针数从指针记录表中删除
			blLwTownIndicatorAction.deleteByConditions(dbManager, " 1=1 ");
			// 3-将本月的指针数插入指针记录表中
			blLwTownIndicatorAction.insertAll(dbManager, thisList);
			dbManager.commitTransaction();
		} catch (Exception exception) {
			dbManager.rollbackTransaction();
			throw exception;
		} finally {
			dbManager.close();
		}
	}
	/**
	 * 大工业月数据迁移
	 * @param thisList 本月抄表记录数
	 * @param lastList 上月抄表记录数
	 * @throws Exception
	 */
	public void factoryMonthDataMove(Collection thisList, Collection lastList)
			throws Exception {
		BLLwNewFactoryIndicatorAction blLwFactoryIndicatorAction = new BLLwNewFactoryIndicatorAction();
		BLLwFactoryIndicatorBakAction blLwFactoryIndicatorBakAction = new BLLwFactoryIndicatorBakAction();
		DBManager dbManager = new DBManager();
		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			// 所有操作在一个事物中执行
			// 1-将上月的指针数插入指针记录备份表中
			blLwFactoryIndicatorBakAction.insertAll(dbManager, lastList);
			// 2-将上月的指针数从指针记录表中删除
			blLwFactoryIndicatorAction.deleteByConditions(dbManager, " 1=1 ");
			// 3-将本月的指针数插入指针记录表中
			blLwFactoryIndicatorAction.insertAll(dbManager, thisList);
			dbManager.commitTransaction();
		} catch (Exception exception) {
			dbManager.rollbackTransaction();
			throw exception;
		} finally {
			dbManager.close();
		}
	}
	
	/**
	 * 趸售月数据迁移
	 * @param thisList 本月抄表记录数
	 * @param lastList 上月抄表记录数
	 * @throws Exception
	 */
	public void wholeSaleMonthDataMove(Collection thisList, Collection lastList)
			throws Exception {
		BLLwWholeSaleIndicatorAction blLwWholeSaleIndicatorAction = new BLLwWholeSaleIndicatorAction();
		BLLwWholeSaleIndicatorBakAction blLwWholeSaleIndicatorBakAction = new BLLwWholeSaleIndicatorBakAction();
		DBManager dbManager = new DBManager();
		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			// 所有操作在一个事物中执行
			// 1-将上月的指针数插入指针记录备份表中
			blLwWholeSaleIndicatorBakAction.insertAll(dbManager, lastList);
			// 2-将上月的指针数从指针记录表中删除
			blLwWholeSaleIndicatorAction.deleteByConditions(dbManager, " 1=1 ");
			// 3-将本月的指针数插入指针记录表中
			blLwWholeSaleIndicatorAction.insertAll(dbManager, thisList);
			dbManager.commitTransaction();
		} catch (Exception exception) {
			dbManager.rollbackTransaction();
			throw exception;
		} finally {
			dbManager.close();
		}
	}
	
}

