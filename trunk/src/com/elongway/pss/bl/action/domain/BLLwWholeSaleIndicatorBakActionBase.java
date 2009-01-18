package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleIndicatorBak;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleIndicatorBak-���۵��ָ���¼���ݱ��ҵ���߼�������<br>
 */
public class BLLwWholeSaleIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleIndicatorBakActionBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleIndicatorBakActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto)
            throws Exception{
        DBLwWholeSaleIndicatorBak dbLwWholeSaleIndicatorBak = new DBLwWholeSaleIndicatorBak(dbManager);
        //�����¼
        dbLwWholeSaleIndicatorBak.insert(lwWholeSaleIndicatorBakDto);
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
        DBLwWholeSaleIndicatorBak dbLwWholeSaleIndicatorBak = new DBLwWholeSaleIndicatorBak(dbManager);
        //ɾ����¼
        dbLwWholeSaleIndicatorBak.delete(userNo, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleIndicatorBak dbLwWholeSaleIndicatorBak = new DBLwWholeSaleIndicatorBak(dbManager);
        //������ɾ����¼
        dbLwWholeSaleIndicatorBak.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto)
            throws Exception{
        DBLwWholeSaleIndicatorBak dbLwWholeSaleIndicatorBak = new DBLwWholeSaleIndicatorBak(dbManager);
        //���¼�¼
        dbLwWholeSaleIndicatorBak.update(lwWholeSaleIndicatorBakDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @return lwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto
     * @throws Exception
     */
    public LwWholeSaleIndicatorBakDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwWholeSaleIndicatorBak dbLwWholeSaleIndicatorBak = new DBLwWholeSaleIndicatorBak(dbManager);
        //����DTO
        LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto = null;
        //��ѯ����,��ֵ��DTO
        lwWholeSaleIndicatorBakDto = dbLwWholeSaleIndicatorBak.findByPrimaryKey(userNo, statMonth);
        return lwWholeSaleIndicatorBakDto;
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
        DBLwWholeSaleIndicatorBak dbLwWholeSaleIndicatorBak = new DBLwWholeSaleIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleIndicatorBak.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleIndicatorBak.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwWholeSaleIndicatorBakDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleIndicatorBak dbLwWholeSaleIndicatorBak = new DBLwWholeSaleIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleIndicatorBak.findByConditions(conditions);
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
        DBLwWholeSaleIndicatorBak dbLwWholeSaleIndicatorBak = new DBLwWholeSaleIndicatorBak(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleIndicatorBak.getCount(conditions);
        return count;
    }
}
