package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleIndicator;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleIndicator-���۵��ָ���¼���ҵ���߼�������<br>
 */
public class BLLwWholeSaleIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleIndicatorActionBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleIndicatorActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //�����¼
        dbLwWholeSaleIndicator.insert(lwWholeSaleIndicatorDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //ɾ����¼
        dbLwWholeSaleIndicator.delete(userNo, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //������ɾ����¼
        dbLwWholeSaleIndicator.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //���¼�¼
        dbLwWholeSaleIndicator.update(lwWholeSaleIndicatorDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @return lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public LwWholeSaleIndicatorDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //����DTO
        LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = null;
        //��ѯ����,��ֵ��DTO
        lwWholeSaleIndicatorDto = dbLwWholeSaleIndicator.findByPrimaryKey(userNo, statMonth);
        return lwWholeSaleIndicatorDto;
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
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleIndicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleIndicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwWholeSaleIndicatorDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleIndicator.findByConditions(conditions);
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
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleIndicator.getCount(conditions);
        return count;
    }
}
