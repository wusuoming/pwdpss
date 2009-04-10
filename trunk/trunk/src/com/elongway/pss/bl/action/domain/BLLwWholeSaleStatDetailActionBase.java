package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleStatDetailDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleStatDetail;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleStatDetail-���۰����ͳ�Ƶ�ҵ���߼�������<br>
 */
public class BLLwWholeSaleStatDetailActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleStatDetailActionBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleStatDetailActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        //�����¼
        dbLwWholeSaleStatDetail.insert(lwWholeSaleStatDetailDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param companyName ��˾����
     * @param statStyle ͳ�Ʊ�־
     * @param inputDate ͳ������
     * @throws Exception
     */
    public void delete(DBManager dbManager,String companyName,String statStyle,String inputDate)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        //ɾ����¼
        dbLwWholeSaleStatDetail.delete(companyName, statStyle, inputDate);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        //������ɾ����¼
        dbLwWholeSaleStatDetail.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        //���¼�¼
        dbLwWholeSaleStatDetail.update(lwWholeSaleStatDetailDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param companyName ��˾����
     * @param statStyle ͳ�Ʊ�־
     * @param inputDate ͳ������
     * @return lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public LwWholeSaleStatDetailDto findByPrimaryKey(DBManager dbManager,String companyName,String statStyle,String inputDate)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        //����DTO
        LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto = null;
        //��ѯ����,��ֵ��DTO
        lwWholeSaleStatDetailDto = dbLwWholeSaleStatDetail.findByPrimaryKey(companyName, statStyle, inputDate);
        return lwWholeSaleStatDetailDto;
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
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleStatDetail.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleStatDetail.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwWholeSaleStatDetailDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleStatDetail.findByConditions(conditions);
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
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleStatDetail.getCount(conditions);
        return count;
    }
}
