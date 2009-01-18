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
 * �����û���Ϣ Action <br>
 * 
 * @author ������
 * @version 1.0 2008-10-15
 */
public class BLLWUserCustomFacade {
	/**
	 * �����û���Ϣ
	 * @param lwAmmeterDto ���
	 * @param lwPowerUserDto �õ��û�
	 * @param lwProrateDto ������̯
	 * @param lwUserLineDto �û���·
	 * @param lwAmmeterChangeDto ����
	 * @param lwAmmeterBookDto ��
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
			//�����¼
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
	 * ���������û���Ϣ
	 * @param lwPowerUserDto �û�������Ϣ
	 * @param lwProrateDto 	 �����Ϣ
	 * @param lwUserLineDto �û���·

	 */
	public void savewholeSaleUserInfo(LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto,LwAmmeterChangeDto lwAmmeterChangeDto)
			throws Exception {
		DBManager dbManager = new DBManager();
		try {
			dbManager.open("pssDataSource");
			dbManager.beginTransaction();
			//�����¼
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
	 * ������ҵ�û���Ϣ
	 * @param lwPowerUserDto �û�������Ϣ
	 * @param lwProrateDto 	 �����Ϣ
	 

	 */
	/**
	 * �����û���Ϣ
	 * @param lwPowerUserDto �û�������Ϣ
	 * @param lwProrateDto ������̯
	 * @param lwUserLineDto �û���·
	 * @param lwBookUserDto ���û�������Ϣ
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
			// ���±�����̯
			new BLLwProrateAction().update(dbManager, lwProrateDto);
			// �����õ��û�
			new BLLwPowerUserAction().update(dbManager, lwPowerUserDto);
//			// ɾ��֮ǰ�û���·�����ã������µġ�
//			blLwUserLineAction.deleteByConditions(dbManager, " userNo = '"
//					+ lwUserLineDto.getUserNo() + "'");
//			blLwUserLineAction.insert(dbManager, lwUserLineDto);
			// ɾ����ǰ�ı����ã������µı�����
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
	 * ֱ���绻����
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
	 * ���ۻ�����
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
	 * ��ҵ������
	 * @param errorAmmeter ���ϵ��
	 * @param newAmmeter ��װ���
	 * @param lwFactoryIndicatorDto ��ҵָ��
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
