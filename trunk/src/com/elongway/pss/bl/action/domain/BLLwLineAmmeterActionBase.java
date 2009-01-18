package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwLineAmmeter;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWLineAmmeter-��·�����ձ��ҵ���߼�������<br>
 */
public class BLLwLineAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwLineAmmeterActionBase.class);

    /**
     * ���캯��
     */
    public BLLwLineAmmeterActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwLineAmmeterDto lwLineAmmeterDto)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        //�����¼
        dbLwLineAmmeter.insert(lwLineAmmeterDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode,String ammeterNo)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        //ɾ����¼
        dbLwLineAmmeter.delete(lineCode, ammeterNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        //������ɾ����¼
        dbLwLineAmmeter.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwLineAmmeterDto lwLineAmmeterDto)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        //���¼�¼
        dbLwLineAmmeter.update(lwLineAmmeterDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param ammeterNo ���
     * @return lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public LwLineAmmeterDto findByPrimaryKey(DBManager dbManager,String lineCode,String ammeterNo)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        //����DTO
        LwLineAmmeterDto lwLineAmmeterDto = null;
        //��ѯ����,��ֵ��DTO
        lwLineAmmeterDto = dbLwLineAmmeter.findByPrimaryKey(lineCode, ammeterNo);
        return lwLineAmmeterDto;
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
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwLineAmmeter.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwLineAmmeter.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwLineAmmeterDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwLineAmmeter.findByConditions(conditions);
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
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwLineAmmeter.getCount(conditions);
        return count;
    }
}
