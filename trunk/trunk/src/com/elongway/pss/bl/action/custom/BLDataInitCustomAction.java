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
 * ���ݳ�ʼ��Action
 * @author qiaoyouliang 2008-11-04
 *
 */
public class BLDataInitCustomAction {
	/**
	 * ֱ���������ݳ�ʼ��
	 * ��ÿ�¼�������Ľ�����֮ǰ��ִ�в�����
	 * @param statMonth ��������
	 * @throws Exception 
	 */
	public void initTownMonthData(String statMonth) throws Exception {
		// ��������
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
		
		// 0-�����ж��Ƿ���ִ�й���ʼ��
		Collection initList = blLwTownIndicatorFacade.findByConditions( " statMonth = '"+statMonth+"'");	
		
		if(initList==null ||initList.size()==0 ){

		// 1-ȡ������ָ����
		lastListTemp = blLwTownIndicatorFacade.findByConditions( " statMonth = '"+statMonth+"'");
		
		// 2-��ָ���¼��DTO��֯��ָ���¼���ݱ�DTO
		for (Iterator iterator = lastListTemp.iterator(); iterator.hasNext();) {
			lwTownIndicatorDto = (LwTownIndicatorDto) iterator
					.next();
			lwTownIndicatorBakDto = new LwTownIndicatorBakDto();
			DataUtils.copySimpleObject(lwTownIndicatorBakDto, lwTownIndicatorDto);
			lastList.add(lwTownIndicatorBakDto);
		}
		// 3-�ٴ�ȡ������ָ������������ѭ��֮�󣬼����Ϊ����ָ����
		lastBak = blLwTownIndicatorFacade.findByConditions( " statMonth = '"+statMonth+"'");

		// 4-ѭ������֮�󣬼�����������ݳ�ʼ����DTO����֯
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
		// 5-����ָ�����ƶ������ݱ���ʼ������ָ����
		this.townMonthDataMove(thisList, lastList);
		}else{
			throw new UserException(-6,-704,this.getClass().getName());
		}
		

	}
	/**
	 * ��ҵ�����ݳ�ʼ��
	 * ��ÿ�¼�������Ľ�����֮ǰ��ִ�в�����
	 * @param statMonth
	 *            ����
	 */
	public void initFactoryMonthData(String statMonth)throws Exception{
		// ��������
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
		
		// 0-�����ж��Ƿ���ִ�й���ʼ��
		Collection initList = blLwNewFactoryIndicatorFacade.findByConditions( " statMonth = '"+statMonth+"'");
		
		if(initList==null ||initList.size()==0 ){
		// 1-ȡ������ָ����
		lastListtemp = blLwNewFactoryIndicatorFacade.findByConditions( " ");
		// 2-��ָ���¼��DTO��֯��ָ���¼���ݱ�DTO
		for (Iterator iterator = lastListtemp.iterator(); iterator.hasNext();) {
			lwNewFactoryIndicatorDto = (LwNewFactoryIndicatorDto) iterator
					.next();
			lwNewFactoryIndicatorBakDto = new LwNewFactoryIndicatorBakDto();
			DataUtils.copySimpleObject(lwNewFactoryIndicatorBakDto, lwNewFactoryIndicatorDto);
			lastList.add(lwNewFactoryIndicatorBakDto);
		}
		// 3-�ٴ�ȡ������ָ������������ѭ��֮�󣬼����Ϊ����ָ����
		lastBak = blLwNewFactoryIndicatorFacade.findByConditions( " ");

		// 4-ѭ������֮�󣬼�����������ݳ�ʼ����DTO����֯
		for (Iterator iterator = lastBak.iterator(); iterator.hasNext();) {
			LwNewFactoryIndicatorDto dto = (LwNewFactoryIndicatorDto) iterator.next();
			lastWorkIndicator = dto.getThisWorkNum();
			lastIdleIndicator = dto.getThisIdleNum();
			
			lwNewFactoryIndicatorDto = new LwNewFactoryIndicatorDto();
			// ������ָ���¼�ı����й�ָ�븳ֵΪ����ָ���¼�ĵ����й�ָ��
			lwNewFactoryIndicatorDto.setThisWorkNum(lastWorkIndicator);
			// ������ָ���¼�ı����޹�ָ�븳ֵΪ����ָ���¼�ĵ����޹�ָ��
			lwNewFactoryIndicatorDto.setThisIdleNum(lastIdleIndicator);
            // ����ָ���¼�������޹�ָ�븳ֵΪ����ָ���¼�ĵ����޹�ָ��
			lwNewFactoryIndicatorDto.setLastIdleNum(lastIdleIndicator);
			// ����ָ���¼�������й�ָ�븳ֵΪ����ָ���¼�ĵ����й�ָ��
			lwNewFactoryIndicatorDto.setLastWorkNum(lastWorkIndicator);
			//������
			lwNewFactoryIndicatorDto.setAmmeterStyle(dto.getAmmeterStyle());
			//���
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

		// 5-����ָ�����ƶ������ݱ���ʼ������ָ����
		this.factoryMonthDataMove(thisList, lastList);
		}else{
			throw new UserException(-6,-704,this.getClass().getName());
		}
	}
	/**
	 * ���������ݳ�ʼ�� 
	 * ��ÿ�¼�������Ľ�����֮ǰ��ִ�в�����
	 * @param statMonth ����
	 */
	public void initWholeSaleMonthData(String statMonth)throws Exception{
		// ��������
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

		// 0-�����ж��Ƿ���ִ�й���ʼ��
		Collection initList = blLwWholeSaleIndicatorFacade.findByConditions( " statMonth = '"+statMonth+"'");
		if(initList==null ||initList.size()==0 ){
		// 1-ȡ������ָ����
		lastListtemp = blLwWholeSaleIndicatorFacade.findByConditions( "");
		// 2-��ָ���¼��DTO��֯��ָ���¼���ݱ�DTO
		for (Iterator iterator = lastListtemp.iterator(); iterator.hasNext();) {
			lwWholeSaleIndicatorDto = (LwWholeSaleIndicatorDto) iterator
					.next();
			lwWholeSaleIndicatorBakDto = new LwWholeSaleIndicatorBakDto();
			DataUtils.copySimpleObject(lwWholeSaleIndicatorBakDto, lwWholeSaleIndicatorDto);
			lastList.add(lwWholeSaleIndicatorBakDto);
		}
		// 3-�ٴ�ȡ������ָ������������ѭ��֮�󣬼����Ϊ����ָ����
		lastBak = blLwWholeSaleIndicatorFacade.findByConditions("");

		// 4-ѭ������֮�󣬼�����������ݳ�ʼ����DTO����֯
		for (Iterator iterator = lastBak.iterator(); iterator.hasNext();) {
			LwWholeSaleIndicatorDto dto = (LwWholeSaleIndicatorDto) iterator.next();
			lastWorkIndicator = dto.getThisWorkNum();
			lastIdleIndicator = dto.getThisIdleNum();
			
			lwWholeSaleIndicatorDto = new LwWholeSaleIndicatorDto();
			// ������ָ���¼�ı����й�ָ�븳ֵΪ����ָ���¼�ĵ����й�ָ��
			lwWholeSaleIndicatorDto.setThisWorkNum(lastWorkIndicator);
			// ������ָ���¼�ı����޹�ָ�븳ֵΪ����ָ���¼�ĵ����޹�ָ��
			lwWholeSaleIndicatorDto.setThisIdleNum(lastIdleIndicator);
            // ����ָ���¼�������޹�ָ�븳ֵΪ����ָ���¼�ĵ����޹�ָ��
			lwWholeSaleIndicatorDto.setLastIdleNum(lastIdleIndicator);
			//�Ƿ���ѱ�־
			lwWholeSaleIndicatorDto.setIfCal(dto.getIfCal());
			//������˾
			lwWholeSaleIndicatorDto.setFlag(dto.getFlag());
			//
			// ����ָ���¼�������й�ָ�븳ֵΪ����ָ���¼���й�ָ��
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

		// 5-����ָ�����ƶ������ݱ���ʼ������ָ����
		this.wholeSaleMonthDataMove(thisList, lastList);
		}else{
			throw new UserException(-6,-704,this.getClass().getName());
		}
	}
	/**
	 * ֱ����������Ǩ��
	 * @param thisList ���³����¼��
	 * @param lastList ���³����¼��
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
			// ���в�����һ��������ִ��
			// 1-�����µ�ָ��������ָ���¼���ݱ���
			blLwTownIndicatorBakAction.insertAll(dbManager, lastList);
			// 2-�����µ�ָ������ָ���¼����ɾ��
			blLwTownIndicatorAction.deleteByConditions(dbManager, " 1=1 ");
			// 3-�����µ�ָ��������ָ���¼����
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
	 * ��ҵ������Ǩ��
	 * @param thisList ���³����¼��
	 * @param lastList ���³����¼��
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
			// ���в�����һ��������ִ��
			// 1-�����µ�ָ��������ָ���¼���ݱ���
			blLwFactoryIndicatorBakAction.insertAll(dbManager, lastList);
			// 2-�����µ�ָ������ָ���¼����ɾ��
			blLwFactoryIndicatorAction.deleteByConditions(dbManager, " 1=1 ");
			// 3-�����µ�ָ��������ָ���¼����
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
	 * ����������Ǩ��
	 * @param thisList ���³����¼��
	 * @param lastList ���³����¼��
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
			// ���в�����һ��������ִ��
			// 1-�����µ�ָ��������ָ���¼���ݱ���
			blLwWholeSaleIndicatorBakAction.insertAll(dbManager, lastList);
			// 2-�����µ�ָ������ָ���¼����ɾ��
			blLwWholeSaleIndicatorAction.deleteByConditions(dbManager, " 1=1 ");
			// 3-�����µ�ָ��������ָ���¼����
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

