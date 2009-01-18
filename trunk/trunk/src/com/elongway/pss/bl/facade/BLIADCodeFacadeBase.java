package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCodeDto;
import com.elongway.pss.bl.action.domain.BLIADCodeAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADCode��ҵ���߼�����Facade����<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADCodeFacadeBase{
    private static Logger logger = Logger.getLogger(BLIADCodeFacadeBase.class);

    /**
     * ���캯��
     */
    public BLIADCodeFacadeBase(){
    }

    /**
     * ����һ������
     * @param iADCodeDto iADCodeDto
     * @throws Exception
     */
    public void insert(IADCodeDto iADCodeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADCodeAction blIADCodeAction = new BLIADCodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blIADCodeAction.insert(dbManager,iADCodeDto);
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
     * @param codeType CodeType
     * @param codeCode CodeCode
     * @throws Exception
     */
    public void delete(String codeType,String codeCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADCodeAction blIADCodeAction = new BLIADCodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blIADCodeAction.delete(dbManager,codeType, codeCode);
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
        BLIADCodeAction blIADCodeAction = new BLIADCodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blIADCodeAction.deleteByConditions(dbManager,conditions);
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
     * @param iADCodeDto iADCodeDto
     * @throws Exception
     */
    public void update(IADCodeDto iADCodeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADCodeAction blIADCodeAction = new BLIADCodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blIADCodeAction.update(dbManager,iADCodeDto);
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
     * @param codeType CodeType
     * @param codeCode CodeCode
     * @return iADCodeDto iADCodeDto
     * @throws Exception
     */
    public IADCodeDto findByPrimaryKey(String codeType,String codeCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADCodeAction blIADCodeAction = new BLIADCodeAction();
        //����DTO
        IADCodeDto iADCodeDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            iADCodeDto = blIADCodeAction.findByPrimaryKey(dbManager,codeType, codeCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return iADCodeDto;
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
        BLIADCodeAction blIADCodeAction = new BLIADCodeAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blIADCodeAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����iADCodeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIADCodeAction blIADCodeAction = new BLIADCodeAction();
        try{
            dbManager.open("pssDataSource");
            collection = blIADCodeAction.findByConditions(dbManager,conditions);
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
        BLIADCodeAction blIADCodeAction = new BLIADCodeAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blIADCodeAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
