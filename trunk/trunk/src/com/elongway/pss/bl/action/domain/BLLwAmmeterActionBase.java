package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeter;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWAmmeter-�����Ϣ���ҵ���߼�������<br>
 */
public class BLLwAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterActionBase.class);

    /**
     * ���캯��
     */
    public BLLwAmmeterActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwAmmeterDto lwAmmeterDto)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        //�����¼
        dbLwAmmeter.insert(lwAmmeterDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(DBManager dbManager,String ammeterNo)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        //ɾ����¼
        dbLwAmmeter.delete(ammeterNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        //������ɾ����¼
        dbLwAmmeter.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwAmmeterDto lwAmmeterDto)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        //���¼�¼
        dbLwAmmeter.update(lwAmmeterDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param ammeterNo ���
     * @return lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public LwAmmeterDto findByPrimaryKey(DBManager dbManager,String ammeterNo)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        //����DTO
        LwAmmeterDto lwAmmeterDto = null;
        //��ѯ����,��ֵ��DTO
        lwAmmeterDto = dbLwAmmeter.findByPrimaryKey(ammeterNo);
        return lwAmmeterDto;
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
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeter.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwAmmeter.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwAmmeterDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwAmmeter.findByConditions(conditions);
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
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeter.getCount(conditions);
        return count;
    }
}
