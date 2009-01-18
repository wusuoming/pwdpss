package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwLinePTAction;
import com.elongway.pss.dto.domain.LwLinePTDto;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ������·��ѹ���������ձ��ҵ���߼�����Facade����<br>
 */
public class BLLwLinePTFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwLinePTFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwLinePTFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public void insert(LwLinePTDto lwLinePTDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwLinePTAction.insert(dbManager,lwLinePTDto);
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
     * @param ptModus ��ѹ��������ʽ
     * @throws Exception
     */
    public void delete(String lineCode,String ptModus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwLinePTAction.delete(dbManager,lineCode, ptModus);
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
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwLinePTAction.deleteByConditions(dbManager,conditions);
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
     * @param lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public void update(LwLinePTDto lwLinePTDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwLinePTAction.update(dbManager,lwLinePTDto);
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
     * @param ptModus ��ѹ��������ʽ
     * @return lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public LwLinePTDto findByPrimaryKey(String lineCode,String ptModus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        //����DTO
        LwLinePTDto lwLinePTDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwLinePTDto = blLwLinePTAction.findByPrimaryKey(dbManager,lineCode, ptModus);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwLinePTDto;
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
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwLinePTAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwLinePTDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwLinePTAction.findByConditions(dbManager,conditions);
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
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwLinePTAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
