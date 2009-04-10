package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleStatDetailDto;
import com.elongway.pss.bl.action.domain.BLLwWholeSaleStatDetailAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleStatDetail-���۰����ͳ�Ƶ�ҵ���߼�����Facade����<br>
 */
public class BLLwWholeSaleStatDetailFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleStatDetailFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleStatDetailFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public void insert(LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleStatDetailAction blLwWholeSaleStatDetailAction = new BLLwWholeSaleStatDetailAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwWholeSaleStatDetailAction.insert(dbManager,lwWholeSaleStatDetailDto);
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
     * @param companyName ��˾����
     * @param statStyle ͳ�Ʊ�־
     * @param inputDate ͳ������
     * @throws Exception
     */
    public void delete(String companyName,String statStyle,String inputDate)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleStatDetailAction blLwWholeSaleStatDetailAction = new BLLwWholeSaleStatDetailAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwWholeSaleStatDetailAction.delete(dbManager,companyName, statStyle, inputDate);
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
        BLLwWholeSaleStatDetailAction blLwWholeSaleStatDetailAction = new BLLwWholeSaleStatDetailAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwWholeSaleStatDetailAction.deleteByConditions(dbManager,conditions);
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
     * @param lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public void update(LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleStatDetailAction blLwWholeSaleStatDetailAction = new BLLwWholeSaleStatDetailAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwWholeSaleStatDetailAction.update(dbManager,lwWholeSaleStatDetailDto);
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
     * @param companyName ��˾����
     * @param statStyle ͳ�Ʊ�־
     * @param inputDate ͳ������
     * @return lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public LwWholeSaleStatDetailDto findByPrimaryKey(String companyName,String statStyle,String inputDate)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleStatDetailAction blLwWholeSaleStatDetailAction = new BLLwWholeSaleStatDetailAction();
        //����DTO
        LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwWholeSaleStatDetailDto = blLwWholeSaleStatDetailAction.findByPrimaryKey(dbManager,companyName, statStyle, inputDate);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwWholeSaleStatDetailDto;
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
        BLLwWholeSaleStatDetailAction blLwWholeSaleStatDetailAction = new BLLwWholeSaleStatDetailAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwWholeSaleStatDetailAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwWholeSaleStatDetailDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwWholeSaleStatDetailAction blLwWholeSaleStatDetailAction = new BLLwWholeSaleStatDetailAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwWholeSaleStatDetailAction.findByConditions(dbManager,conditions);
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
        BLLwWholeSaleStatDetailAction blLwWholeSaleStatDetailAction = new BLLwWholeSaleStatDetailAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwWholeSaleStatDetailAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
