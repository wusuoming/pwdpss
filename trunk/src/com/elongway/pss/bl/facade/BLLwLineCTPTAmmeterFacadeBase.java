package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwLineCTPTAmmeterAction;
import com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ������·������ѹ����������ϵ���ҵ���߼�����Facade����<br>
 */
public class BLLwLineCTPTAmmeterFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwLineCTPTAmmeterFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwLineCTPTAmmeterFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public void insert(LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTPTAmmeterAction blLwLineCTPTAmmeterAction = new BLLwLineCTPTAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwLineCTPTAmmeterAction.insert(dbManager,lwLineCTPTAmmeterDto);
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
     * @param ptModus ��ѹ��������ʽ
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(String lineCode,String ctModus,String ptModus,String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTPTAmmeterAction blLwLineCTPTAmmeterAction = new BLLwLineCTPTAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwLineCTPTAmmeterAction.delete(dbManager,lineCode, ctModus, ptModus, ammeterNo);
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
        BLLwLineCTPTAmmeterAction blLwLineCTPTAmmeterAction = new BLLwLineCTPTAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwLineCTPTAmmeterAction.deleteByConditions(dbManager,conditions);
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
     * @param lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public void update(LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTPTAmmeterAction blLwLineCTPTAmmeterAction = new BLLwLineCTPTAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwLineCTPTAmmeterAction.update(dbManager,lwLineCTPTAmmeterDto);
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
     * @param ptModus ��ѹ��������ʽ
     * @param ammeterNo ���
     * @return lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public LwLineCTPTAmmeterDto findByPrimaryKey(String lineCode,String ctModus,String ptModus,String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTPTAmmeterAction blLwLineCTPTAmmeterAction = new BLLwLineCTPTAmmeterAction();
        //����DTO
        LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwLineCTPTAmmeterDto = blLwLineCTPTAmmeterAction.findByPrimaryKey(dbManager,lineCode, ctModus, ptModus, ammeterNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwLineCTPTAmmeterDto;
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
        BLLwLineCTPTAmmeterAction blLwLineCTPTAmmeterAction = new BLLwLineCTPTAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwLineCTPTAmmeterAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwLineCTPTAmmeterDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwLineCTPTAmmeterAction blLwLineCTPTAmmeterAction = new BLLwLineCTPTAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwLineCTPTAmmeterAction.findByConditions(dbManager,conditions);
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
        BLLwLineCTPTAmmeterAction blLwLineCTPTAmmeterAction = new BLLwLineCTPTAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwLineCTPTAmmeterAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
