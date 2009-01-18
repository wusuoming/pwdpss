package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleSummary;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleSummary-���۵�Ѽ����ܱ��ҵ���߼�������<br>
 */
public class BLLwWholeSaleSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleSummaryActionBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleSummaryActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleSummaryDto lwWholeSaleSummaryDto)
            throws Exception{
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        //�����¼
        dbLwWholeSaleSummary.insert(lwWholeSaleSummaryDto);
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
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        //ɾ����¼
        dbLwWholeSaleSummary.delete(lineCode, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        //������ɾ����¼
        dbLwWholeSaleSummary.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleSummaryDto lwWholeSaleSummaryDto)
            throws Exception{
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        //���¼�¼
        dbLwWholeSaleSummary.update(lwWholeSaleSummaryDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param statMonth ͳ������
     * @return lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public LwWholeSaleSummaryDto findByPrimaryKey(DBManager dbManager,String lineCode,String statMonth)
            throws Exception{
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        //����DTO
        LwWholeSaleSummaryDto lwWholeSaleSummaryDto = null;
        //��ѯ����,��ֵ��DTO
        lwWholeSaleSummaryDto = dbLwWholeSaleSummary.findByPrimaryKey(lineCode, statMonth);
        return lwWholeSaleSummaryDto;
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
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleSummary.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleSummary.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwWholeSaleSummaryDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleSummary.findByConditions(conditions);
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
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleSummary.getCount(conditions);
        return count;
    }
}
