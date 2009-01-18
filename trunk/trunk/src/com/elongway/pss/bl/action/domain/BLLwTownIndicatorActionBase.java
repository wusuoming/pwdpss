package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicator;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownIndicator-ֱ������ָ���¼���ҵ���߼�������<br>
 */
public class BLLwTownIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorActionBase.class);

    /**
     * ���캯��
     */
    public BLLwTownIndicatorActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownIndicatorDto lwTownIndicatorDto)
            throws Exception{
        DBLwTownIndicator dbLwTownIndicator = new DBLwTownIndicator(dbManager);
        //�����¼
        dbLwTownIndicator.insert(lwTownIndicatorDto);
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
        DBLwTownIndicator dbLwTownIndicator = new DBLwTownIndicator(dbManager);
        //ɾ����¼
        dbLwTownIndicator.delete(userNo, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownIndicator dbLwTownIndicator = new DBLwTownIndicator(dbManager);
        //������ɾ����¼
        dbLwTownIndicator.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownIndicatorDto lwTownIndicatorDto)
            throws Exception{
        DBLwTownIndicator dbLwTownIndicator = new DBLwTownIndicator(dbManager);
        //���¼�¼
        dbLwTownIndicator.update(lwTownIndicatorDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @return lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public LwTownIndicatorDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownIndicator dbLwTownIndicator = new DBLwTownIndicator(dbManager);
        //����DTO
        LwTownIndicatorDto lwTownIndicatorDto = null;
        //��ѯ����,��ֵ��DTO
        lwTownIndicatorDto = dbLwTownIndicator.findByPrimaryKey(userNo, statMonth);
        return lwTownIndicatorDto;
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
        DBLwTownIndicator dbLwTownIndicator = new DBLwTownIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownIndicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownIndicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwTownIndicatorDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownIndicator dbLwTownIndicator = new DBLwTownIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownIndicator.findByConditions(conditions);
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
        DBLwTownIndicator dbLwTownIndicator = new DBLwTownIndicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownIndicator.getCount(conditions);
        return count;
    }
}
