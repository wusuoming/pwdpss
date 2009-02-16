package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleDetail;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleDetail-���۷�����ϸ���ҵ���߼�������<br>
 */
public class BLLwWholeSaleDetailActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleDetailActionBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleDetailActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleDetailDto lwWholeSaleDetailDto)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        //�����¼
        dbLwWholeSaleDetail.insert(lwWholeSaleDetailDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param companyName ��˾����
     * @param inputDate ͳ������
     * @throws Exception
     */
    public void delete(DBManager dbManager,String companyName,String inputDate)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        //ɾ����¼
        dbLwWholeSaleDetail.delete(companyName, inputDate);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        //������ɾ����¼
        dbLwWholeSaleDetail.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleDetailDto lwWholeSaleDetailDto)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        //���¼�¼
        dbLwWholeSaleDetail.update(lwWholeSaleDetailDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param companyName ��˾����
     * @param inputDate ͳ������
     * @return lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public LwWholeSaleDetailDto findByPrimaryKey(DBManager dbManager,String companyName,String inputDate)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        //����DTO
        LwWholeSaleDetailDto lwWholeSaleDetailDto = null;
        //��ѯ����,��ֵ��DTO
        lwWholeSaleDetailDto = dbLwWholeSaleDetail.findByPrimaryKey(companyName, inputDate);
        return lwWholeSaleDetailDto;
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
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleDetail.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleDetail.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwWholeSaleDetailDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleDetail.findByConditions(conditions);
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
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleDetail.getCount(conditions);
        return count;
    }
}
