package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwCorporationSummary;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWCorporationSummary-��ҵ���ۼ����ܱ��ҵ���߼�������<br>
 */
public class BLLwCorporationSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwCorporationSummaryActionBase.class);

    /**
     * ���캯��
     */
    public BLLwCorporationSummaryActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwCorporationSummaryDto lwCorporationSummaryDto)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        //�����¼
        dbLwCorporationSummary.insert(lwCorporationSummaryDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param statMonth ͳ������
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode,String statMonth)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        //ɾ����¼
        dbLwCorporationSummary.delete(lineCode, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        //������ɾ����¼
        dbLwCorporationSummary.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwCorporationSummaryDto lwCorporationSummaryDto)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        //���¼�¼
        dbLwCorporationSummary.update(lwCorporationSummaryDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param statMonth ͳ������
     * @return lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public LwCorporationSummaryDto findByPrimaryKey(DBManager dbManager,String lineCode,String statMonth)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        //����DTO
        LwCorporationSummaryDto lwCorporationSummaryDto = null;
        //��ѯ����,��ֵ��DTO
        lwCorporationSummaryDto = dbLwCorporationSummary.findByPrimaryKey(lineCode, statMonth);
        return lwCorporationSummaryDto;
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
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwCorporationSummary.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwCorporationSummary.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwCorporationSummaryDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwCorporationSummary.findByConditions(conditions);
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
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwCorporationSummary.getCount(conditions);
        return count;
    }
}
