package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwLineCTAction;
import com.elongway.pss.dto.domain.LwLineCTDto;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ������·�������������ձ��ҵ���߼�����Facade����<br>
 */
public class BLLwLineCTFacadeBase{
	private static Logger logger = Logger.getLogger(BLLwLineCTFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwLineCTFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwLineCTDto lwLineCTDto
     * @throws Exception
     */
    public void insert(LwLineCTDto lwLineCTDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwLineCTAction.insert(dbManager,lwLineCTDto);
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
     * @param ctModus ������������ʽ
     * @throws Exception
     */
    public void delete(String lineCode,String ctModus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwLineCTAction.delete(dbManager,lineCode, ctModus);
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
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwLineCTAction.deleteByConditions(dbManager,conditions);
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
     * @param lwLineCTDto lwLineCTDto
     * @throws Exception
     */
    public void update(LwLineCTDto lwLineCTDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwLineCTAction.update(dbManager,lwLineCTDto);
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
     * @param ctModus ������������ʽ
     * @return lwLineCTDto lwLineCTDto
     * @throws Exception
     */
    public LwLineCTDto findByPrimaryKey(String lineCode,String ctModus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        //����DTO
        LwLineCTDto lwLineCTDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwLineCTDto = blLwLineCTAction.findByPrimaryKey(dbManager,lineCode, ctModus);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwLineCTDto;
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
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwLineCTAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwLineCTDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwLineCTAction.findByConditions(dbManager,conditions);
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
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwLineCTAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
