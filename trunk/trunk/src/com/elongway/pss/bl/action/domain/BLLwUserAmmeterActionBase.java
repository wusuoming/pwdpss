package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwUserAmmeter;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWUserAmmeter-�û������ձ��ҵ���߼�������<br>
 */
public class BLLwUserAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwUserAmmeterActionBase.class);

    /**
     * ���캯��
     */
    public BLLwUserAmmeterActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwUserAmmeterDto lwUserAmmeterDto)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        //�����¼
        dbLwUserAmmeter.insert(lwUserAmmeterDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String ammeterNo)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        //ɾ����¼
        dbLwUserAmmeter.delete(userNo, ammeterNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        //������ɾ����¼
        dbLwUserAmmeter.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwUserAmmeterDto lwUserAmmeterDto)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        //���¼�¼
        dbLwUserAmmeter.update(lwUserAmmeterDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param ammeterNo ���
     * @return lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public LwUserAmmeterDto findByPrimaryKey(DBManager dbManager,String userNo,String ammeterNo)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        //����DTO
        LwUserAmmeterDto lwUserAmmeterDto = null;
        //��ѯ����,��ֵ��DTO
        lwUserAmmeterDto = dbLwUserAmmeter.findByPrimaryKey(userNo, ammeterNo);
        return lwUserAmmeterDto;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @param pageNo ҳ��
     * @param rowsPerPage ÿҳ������
     * @return PageRecord ��ѯ��һҳ�Ľ��
     * @throws Exception
     */
    public PageRecord findByConditions(DBManager dbManager,String conditions,int pageNo,int rowsPerPage)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwUserAmmeter.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwUserAmmeter.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwUserAmmeterDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwUserAmmeter.findByConditions(conditions);
        return collection;
    }

    /**
     * ��ѯ����ģ����ѯ�����ļ�¼��
     * @param dbManager DB������
     * @param conditions ģ����ѯ����
     * @return ����ģ����ѯ�����ļ�¼��
     * @throws Exception
     */
    public int getCount(DBManager dbManager,String conditions) 
        throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwUserAmmeter.getCount(conditions);
        return count;
    }
}
