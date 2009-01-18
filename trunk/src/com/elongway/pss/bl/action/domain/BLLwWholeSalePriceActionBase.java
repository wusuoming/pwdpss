package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSalePrice;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSalePrice-���ۼ۸���ҵ���߼�������<br>
 */
public class BLLwWholeSalePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSalePriceActionBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSalePriceActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSalePriceDto lwWholeSalePriceDto)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        //�����¼
        dbLwWholeSalePrice.insert(lwWholeSalePriceDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param saleArea ��������
     * @param voltageBegin ��ʼ��ѹ
     * @throws Exception
     */
    public void delete(DBManager dbManager,String saleArea,double voltageBegin)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        //ɾ����¼
        dbLwWholeSalePrice.delete(saleArea, voltageBegin);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        //������ɾ����¼
        dbLwWholeSalePrice.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSalePriceDto lwWholeSalePriceDto)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        //���¼�¼
        dbLwWholeSalePrice.update(lwWholeSalePriceDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param saleArea ��������
     * @param voltageBegin ��ʼ��ѹ
     * @return lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public LwWholeSalePriceDto findByPrimaryKey(DBManager dbManager,String saleArea,double voltageBegin)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        //����DTO
        LwWholeSalePriceDto lwWholeSalePriceDto = null;
        //��ѯ����,��ֵ��DTO
        lwWholeSalePriceDto = dbLwWholeSalePrice.findByPrimaryKey(saleArea, voltageBegin);
        return lwWholeSalePriceDto;
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
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSalePrice.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSalePrice.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwWholeSalePriceDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSalePrice.findByConditions(conditions);
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
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSalePrice.getCount(conditions);
        return count;
    }
}
