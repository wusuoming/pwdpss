package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummaryAppend;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownPriceSummaryAppend-ֱ����׷�ӵ�Ѽ����ܱ��ҵ���߼�������<br>
 */
public class BLLwTownPriceSummaryAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryAppendActionBase.class);

    /**
     * ���캯��
     */
    public BLLwTownPriceSummaryAppendActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        //�����¼
        dbLwTownPriceSummaryAppend.insert(lwTownPriceSummaryAppendDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ͳ������
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        //ɾ����¼
        dbLwTownPriceSummaryAppend.delete(userNo, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        //������ɾ����¼
        dbLwTownPriceSummaryAppend.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        //���¼�¼
        dbLwTownPriceSummaryAppend.update(lwTownPriceSummaryAppendDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ͳ������
     * @return lwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto
     * @throws Exception
     */
    public LwTownPriceSummaryAppendDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        //����DTO
        LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto = null;
        //��ѯ����,��ֵ��DTO
        lwTownPriceSummaryAppendDto = dbLwTownPriceSummaryAppend.findByPrimaryKey(userNo, statMonth);
        return lwTownPriceSummaryAppendDto;
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
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummaryAppend.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownPriceSummaryAppend.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwTownPriceSummaryAppendDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownPriceSummaryAppend.findByConditions(conditions);
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
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummaryAppend.getCount(conditions);
        return count;
    }
}
