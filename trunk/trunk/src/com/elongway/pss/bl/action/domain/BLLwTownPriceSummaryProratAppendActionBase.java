package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummaryProratAppend;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownPriceSummaryProrateAppend-ֱ����׷�ӵ�Ѽ����ܱ��ҵ���߼�������<br>
 */
public class BLLwTownPriceSummaryProratAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryProratAppendActionBase.class);

    /**
     * ���캯��
     */
    public BLLwTownPriceSummaryProratAppendActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto)
            throws Exception{
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        //�����¼
        dbLwTownPriceSummaryProratAppend.insert(lwTownPriceSummaryProratAppendDto);
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
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        //ɾ����¼
        dbLwTownPriceSummaryProratAppend.delete(userNo, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        //������ɾ����¼
        dbLwTownPriceSummaryProratAppend.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto)
            throws Exception{
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        //���¼�¼
        dbLwTownPriceSummaryProratAppend.update(lwTownPriceSummaryProratAppendDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ͳ������
     * @return lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public LwTownPriceSummaryProratAppendDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        //����DTO
        LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto = null;
        //��ѯ����,��ֵ��DTO
        lwTownPriceSummaryProratAppendDto = dbLwTownPriceSummaryProratAppend.findByPrimaryKey(userNo, statMonth);
        return lwTownPriceSummaryProratAppendDto;
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
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummaryProratAppend.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownPriceSummaryProratAppend.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwTownPriceSummaryProratAppendDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownPriceSummaryProratAppend.findByConditions(conditions);
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
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummaryProratAppend.getCount(conditions);
        return count;
    }
}
