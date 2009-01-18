package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.elongway.pss.bl.action.domain.BLLwAmmeterAction;
import com.elongway.pss.bl.action.domain.BLLwAmmeterBookAction;
import com.elongway.pss.bl.action.domain.BLLwAmmeterChangeAction;
import com.elongway.pss.bl.action.domain.BLLwBookUserAction;
import com.elongway.pss.bl.action.domain.BLLwNewFactoryIndicatorAction;
import com.elongway.pss.bl.action.domain.BLLwPowerUserAction;
import com.elongway.pss.bl.action.domain.BLLwProrateAction;
import com.elongway.pss.bl.action.domain.BLLwUserAmmeterAction;
import com.elongway.pss.bl.action.domain.BLLwUserLineAction;
import com.elongway.pss.bl.action.domain.BLPrpDcompanyAction;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * 保存用户信息 Action <br>
 * 
 * @author 乔有良
 * @version 1.0 2008-10-15
 */
public class BLLWUserCustomFacade {
	/**
	 * 保存用户信息
	 * @param lwAmmeterDto 电表
	 * @param lwPowerUserDto 用电用户
	 * @param lwProrateDto 比例分摊
	 * @param lwUserLineDto 用户线路
	 * @param lwAmmeterChangeDto 换表
	 * @param lwAmmeterBookDto 表本
	 * @throws Exception
	 */
	public void saveUserInfo(LwPowerUserDto lwPowerUserDto,
			LwProrateDto lwProrateDto,
			LwAmmeterChangeDto lwAmmeterChangeDto, LwBookUserDto lwBookUserDto)
			throws Exception {
		DBManager dbManager = new DBManager();
		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			//插入记录
			new BLLwProrateAction().insert(dbManager, lwProrateDto);
			new BLLwPowerUserAction().insert(dbManager, lwPowerUserDto);
		//	new BLLwUserLineAction().insert(dbManager, lwUserLineDto);
			new BLLwAmmeterChangeAction().insert(dbManager, lwAmmeterChangeDto);
			//      new BLLwAmmeterAction().insert(dbManager,lwAmmeterDto);
			new BLLwBookUserAction().insert(dbManager, lwBookUserDto);

			dbManager.commitTransaction();
		} catch (Exception exception) {
			dbManager.rollbackTransaction();
			throw exception;
		} finally {
			dbManager.close();
		}
	}
	/**
	 * 新增趸售用户信息
	 * @param lwPowerUserDto 用户基本信息
	 * @param lwProrateDto 	 电表信息
	 * @param lwUserLineDto 用户线路

	 */
	public void savewholeSaleUserInfo(LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto,LwAmmeterChangeDto lwAmmeterChangeDto)
			throws Exception {
		DBManager dbManager = new DBManager();
		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			//插入记录
			new BLLwWholeSaleUserInfoFacade().insert(lwWholeSaleUserInfoDto);
			new BLLwAmmeterChangeFacade().insert(lwAmmeterChangeDto);
			dbManager.commitTransaction();
		} catch (Exception exception) {
			dbManager.rollbackTransaction();
			throw exception;
		} finally {
			dbManager.close();
		}
	}
	/**
	 * 新增大工业用户信息
	 * @param lwPowerUserDto 用户基本信息
	 * @param lwProrateDto 	 电表信息
	 

	 */
	/**
	 * 更新用户信息
	 * @param lwPowerUserDto 用户基本信息
	 * @param lwProrateDto 比例分摊
	 * @param lwUserLineDto 用户线路
	 * @param lwBookUserDto 表本用户配置信息
	 * @throws Exception
	 */
	public void updateUserInfo(LwPowerUserDto lwPowerUserDto,
			LwProrateDto lwProrateDto, 
			LwBookUserDto lwBookUserDto) throws Exception {
		DBManager dbManager = new DBManager();
		BLLwBookUserAction bLwBookUserAction = new BLLwBookUserAction();
		BLLwUserLineAction blLwUserLineAction = new BLLwUserLineAction();

		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			// 更新比例分摊
			new BLLwProrateAction().update(dbManager, lwProrateDto);
			// 更新用电用户
			new BLLwPowerUserAction().update(dbManager, lwPowerUserDto);
//			// 删除之前用户线路的配置，插入新的。
//			blLwUserLineAction.deleteByConditions(dbManager, " userNo = '"
//					+ lwUserLineDto.getUserNo() + "'");
//			blLwUserLineAction.insert(dbManager, lwUserLineDto);
			// 删除以前的表本配置，插入新的表本配置
			bLwBookUserAction.deleteByConditions(dbManager, "userNo = '"
					+ lwBookUserDto.getUserNo() + "'");
			bLwBookUserAction.insert(dbManager, lwBookUserDto);

			dbManager.commitTransaction();
		} catch (Exception exception) {
			dbManager.rollbackTransaction();
			throw exception;
		} finally {
			dbManager.close();
		}
	}

	/**
	 * 直供乡换表方法
	 * @param errorAmmeter
	 * @param newAmmeter
	 * @param lwTownIndicatorDto
	 * @throws Exception
	 */

	public void saveTownChangeAmmeter(LwAmmeterChangeDto errorAmmeter,
			LwAmmeterChangeDto newAmmeter, LwTownIndicatorDto lwTownIndicatorDto)
			throws Exception {
		DBManager dbManager = new DBManager();
		BLLwAmmeterChangeAction blLwAmmeterChangeAction = new BLLwAmmeterChangeAction();

		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			blLwAmmeterChangeAction.update(dbManager, errorAmmeter);
			blLwAmmeterChangeAction.insert(dbManager, newAmmeter);
			new BLLwTownIndicatorFacade().update(lwTownIndicatorDto);
			dbManager.commitTransaction();
		} catch (Exception exception) {
			dbManager.rollbackTransaction();
			throw exception;
		} finally {
			dbManager.close();
		}
	}

	/**
	 * 趸售换表方法
	 * @param errorAmmeter
	 * @param newAmmeter
	 * @param lwWholeSaleIndicatorDto
	 * @throws Exception
	 */

	public void saveWholeChangeAmmeter(LwAmmeterChangeDto errorAmmeter,
			LwAmmeterChangeDto newAmmeter,
			LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto) throws Exception {
		DBManager dbManager = new DBManager();
		BLLwAmmeterChangeAction blLwAmmeterChangeAction = new BLLwAmmeterChangeAction();

		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			blLwAmmeterChangeAction.update(dbManager, errorAmmeter);
			blLwAmmeterChangeAction.insert(dbManager, newAmmeter);
			new BLLwWholeSaleIndicatorFacade().update(lwWholeSaleIndicatorDto);
			dbManager.commitTransaction();
		} catch (Exception exception) {
			dbManager.rollbackTransaction();
			throw exception;
		} finally {
			dbManager.close();
		}
	}

	/**
	 * 大工业换表方法
	 * @param errorAmmeter 故障电表
	 * @param newAmmeter 新装电表
	 * @param lwFactoryIndicatorDto 大工业指针
	 * @throws Exception
	 */

	public void saveWholeChangeAmmeter(LwAmmeterChangeDto errorAmmeter,
			LwAmmeterChangeDto newAmmeter,
			LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto,LwNewFactoryIndicatorDto newlwNewFactoryIndicatorDto) throws Exception {
		DBManager dbManager = new DBManager();
		String conditions=" userno='"+lwNewFactoryIndicatorDto.getUserNo()+"'"+" and AmmeterNo='"+lwNewFactoryIndicatorDto.getAmmeterNo()+"'";
		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			new BLLwAmmeterChangeAction().update(dbManager, errorAmmeter);
			new BLLwAmmeterChangeAction().insert(dbManager, newAmmeter);
			new BLLwNewFactoryIndicatorAction().deleteByConditions(dbManager, conditions);
			new BLLwNewFactoryIndicatorAction().insert(dbManager, newlwNewFactoryIndicatorDto);
			
			dbManager.commitTransaction();
		} catch (Exception exception) {
			dbManager.rollbackTransaction();
			throw exception;
		} finally {
			dbManager.close();
		}
	}
	

}
