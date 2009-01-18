package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSalePurePrice;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSalePurePrice-���۴���۱��ҵ���߼�������<br>
 */
public class BLLwWholeSalePurePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSalePurePriceActionBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSalePurePriceActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSalePurePriceDto lwWholeSalePurePriceDto)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        //�����¼
        dbLwWholeSalePurePrice.insert(lwWholeSalePurePriceDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param voltLevel ��ѹ�ȼ�
     * @param comcode ��˾����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String voltLevel,String comcode)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        //ɾ����¼
        dbLwWholeSalePurePrice.delete(voltLevel, comcode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        //������ɾ����¼
        dbLwWholeSalePurePrice.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSalePurePriceDto lwWholeSalePurePriceDto)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        //���¼�¼
        dbLwWholeSalePurePrice.update(lwWholeSalePurePriceDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param voltLevel ��ѹ�ȼ�
     * @param comcode ��˾����
     * @return lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public LwWholeSalePurePriceDto findByPrimaryKey(DBManager dbManager,String voltLevel,String comcode)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        //����DTO
        LwWholeSalePurePriceDto lwWholeSalePurePriceDto = null;
        //��ѯ����,��ֵ��DTO
        lwWholeSalePurePriceDto = dbLwWholeSalePurePrice.findByPrimaryKey(voltLevel, comcode);
        return lwWholeSalePurePriceDto;
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
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSalePurePrice.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSalePurePrice.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwWholeSalePurePriceDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSalePurePrice.findByConditions(conditions);
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
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSalePurePrice.getCount(conditions);
        return count;
    }
}
