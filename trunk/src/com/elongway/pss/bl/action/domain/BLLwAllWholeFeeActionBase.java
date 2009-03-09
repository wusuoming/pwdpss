package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAllWholeFee;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwAllWholeFee-�����ܷ��ñ��ҵ���߼�������<br>
 */
public class BLLwAllWholeFeeActionBase{
    private static Logger logger = Logger.getLogger(BLLwAllWholeFeeActionBase.class);

    /**
     * ���캯��
     */
    public BLLwAllWholeFeeActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwAllWholeFeeDto lwAllWholeFeeDto)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        //�����¼
        dbLwAllWholeFee.insert(lwAllWholeFeeDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param company ���۹�˾
     * @param inputdate ����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String company,String inputdate)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        //ɾ����¼
        dbLwAllWholeFee.delete(company, inputdate);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        //������ɾ����¼
        dbLwAllWholeFee.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwAllWholeFeeDto lwAllWholeFeeDto)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        //���¼�¼
        dbLwAllWholeFee.update(lwAllWholeFeeDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param company ���۹�˾
     * @param inputdate ����
     * @return lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public LwAllWholeFeeDto findByPrimaryKey(DBManager dbManager,String company,String inputdate)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        //����DTO
        LwAllWholeFeeDto lwAllWholeFeeDto = null;
        //��ѯ����,��ֵ��DTO
        lwAllWholeFeeDto = dbLwAllWholeFee.findByPrimaryKey(company, inputdate);
        return lwAllWholeFeeDto;
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
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAllWholeFee.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwAllWholeFee.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwAllWholeFeeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwAllWholeFee.findByConditions(conditions);
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
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAllWholeFee.getCount(conditions);
        return count;
    }
}
