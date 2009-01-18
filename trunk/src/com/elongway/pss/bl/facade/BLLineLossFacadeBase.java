package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LineLossDto;
import com.elongway.pss.bl.action.domain.BLLineLossAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LineLoss-������Ϣ���ҵ���߼�����Facade����<br>
 */
public class BLLineLossFacadeBase{
    private static Logger logger = Logger.getLogger(BLLineLossFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLineLossFacadeBase(){
    }

    /**
     * ����һ������
     * @param lineLossDto lineLossDto
     * @throws Exception
     */
    public void insert(LineLossDto lineLossDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLineLossAction blLineLossAction = new BLLineLossAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLineLossAction.insert(dbManager,lineLossDto);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ������ɾ��һ������
     * @param lineCode ��·����
     * @throws Exception
     */
    public void delete(String lineCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLineLossAction blLineLossAction = new BLLineLossAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLineLossAction.delete(dbManager,lineCode);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ������ɾ������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(String conditions)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLineLossAction blLineLossAction = new BLLineLossAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLineLossAction.deleteByConditions(dbManager,conditions);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ����������һ������(���������޷����)
     * @param lineLossDto lineLossDto
     * @throws Exception
     */
    public void update(LineLossDto lineLossDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLineLossAction blLineLossAction = new BLLineLossAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLineLossAction.update(dbManager,lineLossDto);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ����������һ������
     * @param lineCode ��·����
     * @return lineLossDto lineLossDto
     * @throws Exception
     */
    public LineLossDto findByPrimaryKey(String lineCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLineLossAction blLineLossAction = new BLLineLossAction();
        //����DTO
        LineLossDto lineLossDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lineLossDto = blLineLossAction.findByPrimaryKey(dbManager,lineCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lineLossDto;
    }

    /**
     * ��������ѯ��������
     * @param conditions ��ѯ����
     * @param pageNo ҳ��
     * @param rowsPerPage ÿҳ������
     * @return PageRecord ��ѯ��һҳ�Ľ��
     * @throws Exception
     */
    public PageRecord findByConditions(String conditions,int pageNo,int rowsPerPage)
        throws Exception{
        PageRecord pageRecord = new PageRecord(0,pageNo,1,rowsPerPage,new ArrayList());

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLineLossAction blLineLossAction = new BLLineLossAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLineLossAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param conditions ��ѯ����
     * @return Collection ����lineLossDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLineLossAction blLineLossAction = new BLLineLossAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLineLossAction.findByConditions(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return collection;
    }

    /**
     * ��ѯ����ģ����ѯ�����ļ�¼��
     * @param conditions conditions
     * @return ����ģ����ѯ�����ļ�¼��
     * @throws Exception
     */
    public int getCount(String conditions) 
        throws Exception{
        int rowCount=0;
        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLineLossAction blLineLossAction = new BLLineLossAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLineLossAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
