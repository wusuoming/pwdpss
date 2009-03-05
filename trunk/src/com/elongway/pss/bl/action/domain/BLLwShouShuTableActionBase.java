package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwShouShuTableDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwShouShuTable;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwShouShuTable-������ñ��ҵ���߼�������<br>
 */
public class BLLwShouShuTableActionBase{
    private static Logger logger = Logger.getLogger(BLLwShouShuTableActionBase.class);

    /**
     * ���캯��
     */
    public BLLwShouShuTableActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwShouShuTableDto lwShouShuTableDto)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        //�����¼
        dbLwShouShuTable.insert(lwShouShuTableDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param month �·�
     * @param feeType �������
     * @throws Exception
     */
    public void delete(DBManager dbManager,String month,String feeType)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        //ɾ����¼
        dbLwShouShuTable.delete(month, feeType);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        //������ɾ����¼
        dbLwShouShuTable.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwShouShuTableDto lwShouShuTableDto)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        //���¼�¼
        dbLwShouShuTable.update(lwShouShuTableDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param month �·�
     * @param feeType �������
     * @return lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public LwShouShuTableDto findByPrimaryKey(DBManager dbManager,String month,String feeType)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        //����DTO
        LwShouShuTableDto lwShouShuTableDto = null;
        //��ѯ����,��ֵ��DTO
        lwShouShuTableDto = dbLwShouShuTable.findByPrimaryKey(month, feeType);
        return lwShouShuTableDto;
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
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwShouShuTable.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwShouShuTable.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwShouShuTableDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwShouShuTable.findByConditions(conditions);
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
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwShouShuTable.getCount(conditions);
        return count;
    }
}
