package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeterIndicator;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWAmmeterIndicator-�����¼���ҵ���߼�������<br>
 */
public class BLLwAmmeterIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterIndicatorActionBase.class);

    /**
     * ���캯��
     */
    public BLLwAmmeterIndicatorActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwAmmeterIndicatorDto lwAmmeterIndicatorDto)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        //�����¼
        dbLwAmmeterIndicator.insert(lwAmmeterIndicatorDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param serialNo ���
     * @throws Exception
     */
    public void delete(DBManager dbManager,String serialNo)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        //ɾ����¼
        dbLwAmmeterIndicator.delete(serialNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        //������ɾ����¼
        dbLwAmmeterIndicator.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwAmmeterIndicatorDto lwAmmeterIndicatorDto)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        //���¼�¼
        dbLwAmmeterIndicator.update(lwAmmeterIndicatorDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param serialNo ���
     * @return lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public LwAmmeterIndicatorDto findByPrimaryKey(DBManager dbManager,String serialNo)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        //����DTO
        LwAmmeterIndicatorDto lwAmmeterIndicatorDto = null;
        //��ѯ����,��ֵ��DTO
        lwAmmeterIndicatorDto = dbLwAmmeterIndicator.findByPrimaryKey(serialNo);
        return lwAmmeterIndicatorDto;
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
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterIndicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwAmmeterIndicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwAmmeterIndicatorDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwAmmeterIndicator.findByConditions(conditions);
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
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterIndicator.getCount(conditions);
        return count;
    }
}
