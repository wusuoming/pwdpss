package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwFactoryIndicator;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWFactoryIndicator-��ҵ���ָ���¼���ҵ���߼�������<br>
 */
public class BLLwFactoryIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwFactoryIndicatorActionBase.class);

    /**
     * ���캯��
     */
    public BLLwFactoryIndicatorActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwFactoryIndicatorDto lwFactoryIndicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwFactoryIndicatorDto lwFactoryIndicatorDto)
            throws Exception{
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        //�����¼
        dbLwFactoryIndicator.insert(lwFactoryIndicatorDto);
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
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        //ɾ����¼
        dbLwFactoryIndicator.delete(userNo, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        //������ɾ����¼
        dbLwFactoryIndicator.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwFactoryIndicatorDto lwFactoryIndicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwFactoryIndicatorDto lwFactoryIndicatorDto)
            throws Exception{
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        //���¼�¼
        dbLwFactoryIndicator.update(lwFactoryIndicatorDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @return lwFactoryIndicatorDto lwFactoryIndicatorDto
     * @throws Exception
     */
    public LwFactoryIndicatorDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        //����DTO
        LwFactoryIndicatorDto lwFactoryIndicatorDto = null;
        //��ѯ����,��ֵ��DTO
        lwFactoryIndicatorDto = dbLwFactoryIndicator.findByPrimaryKey(userNo, statMonth);
        return lwFactoryIndicatorDto;
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
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwFactoryIndicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwFactoryIndicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwFactoryIndicatorDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwFactoryIndicator.findByConditions(conditions);
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
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwFactoryIndicator.getCount(conditions);
        return count;
    }
}
