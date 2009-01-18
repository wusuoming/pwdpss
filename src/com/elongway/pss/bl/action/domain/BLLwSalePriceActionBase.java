package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwSalePrice;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWSalePrice-���۵�۱��ҵ���߼�������<br>
 */
public class BLLwSalePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwSalePriceActionBase.class);

    /**
     * ���캯��
     */
    public BLLwSalePriceActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwSalePriceDto lwSalePriceDto)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        //�����¼
        dbLwSalePrice.insert(lwSalePriceDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param powerClass �õ����
     * @param priceCategory ��۷���
     * @param voltageBegin ��ʼ��ѹ
     * @param voltageEnd ��ֹ��ѹ
     * @param materialsType ԭ������
     * @throws Exception
     */
    public void delete(DBManager dbManager,String powerClass,String priceCategory,double voltageBegin,double voltageEnd,String materialsType)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        //ɾ����¼
        dbLwSalePrice.delete(powerClass, priceCategory, voltageBegin, voltageEnd, materialsType);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        //������ɾ����¼
        dbLwSalePrice.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwSalePriceDto lwSalePriceDto)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        //���¼�¼
        dbLwSalePrice.update(lwSalePriceDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param powerClass �õ����
     * @param priceCategory ��۷���
     * @param voltageBegin ��ʼ��ѹ
     * @param voltageEnd ��ֹ��ѹ
     * @param materialsType ԭ������
     * @return lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public LwSalePriceDto findByPrimaryKey(DBManager dbManager,String powerClass,String priceCategory,double voltageBegin,double voltageEnd,String materialsType)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        //����DTO
        LwSalePriceDto lwSalePriceDto = null;
        //��ѯ����,��ֵ��DTO
        lwSalePriceDto = dbLwSalePrice.findByPrimaryKey(powerClass, priceCategory, voltageBegin, voltageEnd, materialsType);
        return lwSalePriceDto;
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
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwSalePrice.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwSalePrice.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwSalePriceDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwSalePrice.findByConditions(conditions);
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
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwSalePrice.getCount(conditions);
        return count;
    }
}
