package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPriceSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPriceSummary;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPriceSummary-��Ѽ����ܱ��ҵ���߼�������<br>
 */
public class BLLwPriceSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwPriceSummaryActionBase.class);

    /**
     * ���캯��
     */
    public BLLwPriceSummaryActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwPriceSummaryDto lwPriceSummaryDto)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        //�����¼
        dbLwPriceSummary.insert(lwPriceSummaryDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        //ɾ����¼
        dbLwPriceSummary.delete(lineCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        //������ɾ����¼
        dbLwPriceSummary.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwPriceSummaryDto lwPriceSummaryDto)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        //���¼�¼
        dbLwPriceSummary.update(lwPriceSummaryDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @return lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public LwPriceSummaryDto findByPrimaryKey(DBManager dbManager,String lineCode)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        //����DTO
        LwPriceSummaryDto lwPriceSummaryDto = null;
        //��ѯ����,��ֵ��DTO
        lwPriceSummaryDto = dbLwPriceSummary.findByPrimaryKey(lineCode);
        return lwPriceSummaryDto;
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
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPriceSummary.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwPriceSummary.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwPriceSummaryDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwPriceSummary.findByConditions(conditions);
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
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPriceSummary.getCount(conditions);
        return count;
    }
}
