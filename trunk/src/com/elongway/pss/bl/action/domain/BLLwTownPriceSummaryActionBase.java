package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummary;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownPriceSummary-ֱ�����Ѽ����ܱ��ҵ���߼�������<br>
 */
public class BLLwTownPriceSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryActionBase.class);

    /**
     * ���캯��
     */
    public BLLwTownPriceSummaryActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownPriceSummaryDto lwTownPriceSummaryDto)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        //�����¼
        dbLwTownPriceSummary.insert(lwTownPriceSummaryDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param lineCode ��·����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String lineCode)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        //ɾ����¼
        dbLwTownPriceSummary.delete(userNo, lineCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        //������ɾ����¼
        dbLwTownPriceSummary.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownPriceSummaryDto lwTownPriceSummaryDto)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        //���¼�¼
        dbLwTownPriceSummary.update(lwTownPriceSummaryDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param lineCode ��·����
     * @return lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public LwTownPriceSummaryDto findByPrimaryKey(DBManager dbManager,String userNo,String lineCode)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        //����DTO
        LwTownPriceSummaryDto lwTownPriceSummaryDto = null;
        //��ѯ����,��ֵ��DTO
        lwTownPriceSummaryDto = dbLwTownPriceSummary.findByPrimaryKey(userNo, lineCode);
        return lwTownPriceSummaryDto;
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
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummary.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownPriceSummary.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwTownPriceSummaryDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownPriceSummary.findByConditions(conditions);
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
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummary.getCount(conditions);
        return count;
    }
}
