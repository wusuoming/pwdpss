package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwNewFactoryIndicator;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWNewFactoryIndicator-��ҵ�µ��ָ���¼���ҵ���߼�������<br>
 */
public class BLLwNewFactoryIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwNewFactoryIndicatorActionBase.class);

    /**
     * ���캯��
     */
    public BLLwNewFactoryIndicatorActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        //�����¼
        dbLwNewFactoryIndicator.insert(lwNewFactoryIndicatorDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String statMonth,String ammeterNo)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        //ɾ����¼
        dbLwNewFactoryIndicator.delete(userNo, statMonth, ammeterNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        //������ɾ����¼
        dbLwNewFactoryIndicator.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        //���¼�¼
        dbLwNewFactoryIndicator.update(lwNewFactoryIndicatorDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @param ammeterNo ���
     * @return lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public LwNewFactoryIndicatorDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth,String ammeterNo)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        //����DTO
        LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = null;
        //��ѯ����,��ֵ��DTO
        lwNewFactoryIndicatorDto = dbLwNewFactoryIndicator.findByPrimaryKey(userNo, statMonth, ammeterNo);
        return lwNewFactoryIndicatorDto;
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
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwNewFactoryIndicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwNewFactoryIndicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwNewFactoryIndicatorDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwNewFactoryIndicator.findByConditions(conditions);
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
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwNewFactoryIndicator.getCount(conditions);
        return count;
    }
}
