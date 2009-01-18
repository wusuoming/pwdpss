package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.SubjoinFeeDto;
import com.elongway.pss.resource.dtofactory.domain.DBSubjoinFee;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����subjoinFee-���ӷ��ñ��ҵ���߼�������<br>
 */
public class BLSubjoinFeeActionBase{
    private static Logger logger = Logger.getLogger(BLSubjoinFeeActionBase.class);

    /**
     * ���캯��
     */
    public BLSubjoinFeeActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,SubjoinFeeDto subjoinFeeDto)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        //�����¼
        dbSubjoinFee.insert(subjoinFeeDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param powerType �õ����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String powerType)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        //ɾ����¼
        dbSubjoinFee.delete(powerType);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        //������ɾ����¼
        dbSubjoinFee.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,SubjoinFeeDto subjoinFeeDto)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        //���¼�¼
        dbSubjoinFee.update(subjoinFeeDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param powerType �õ����
     * @return subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public SubjoinFeeDto findByPrimaryKey(DBManager dbManager,String powerType)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        //����DTO
        SubjoinFeeDto subjoinFeeDto = null;
        //��ѯ����,��ֵ��DTO
        subjoinFeeDto = dbSubjoinFee.findByPrimaryKey(powerType);
        return subjoinFeeDto;
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
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbSubjoinFee.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbSubjoinFee.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����subjoinFeeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbSubjoinFee.findByConditions(conditions);
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
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbSubjoinFee.getCount(conditions);
        return count;
    }
}
