package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPowerFeeFaxing;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerFeeFaxing-��ѵ������б��ҵ���߼�������<br>
 */
public class BLLwPowerFeeFaxingActionBase{
    private static Logger logger = Logger.getLogger(BLLwPowerFeeFaxingActionBase.class);

    /**
     * ���캯��
     */
    public BLLwPowerFeeFaxingActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwPowerFeeFaxingDto lwPowerFeeFaxingDto)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //�����¼
        dbLwPowerFeeFaxing.insert(lwPowerFeeFaxingDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ͳ������
     * @param statStyle ͳ�Ʒ�ʽ
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String statMonth,String statStyle)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //ɾ����¼
        dbLwPowerFeeFaxing.delete(userNo, statMonth, statStyle);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //������ɾ����¼
        dbLwPowerFeeFaxing.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwPowerFeeFaxingDto lwPowerFeeFaxingDto)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //���¼�¼
        dbLwPowerFeeFaxing.update(lwPowerFeeFaxingDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ͳ������
     * @param statStyle ͳ�Ʒ�ʽ
     * @return lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public LwPowerFeeFaxingDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth,String statStyle)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //����DTO
        LwPowerFeeFaxingDto lwPowerFeeFaxingDto = null;
        //��ѯ����,��ֵ��DTO
        lwPowerFeeFaxingDto = dbLwPowerFeeFaxing.findByPrimaryKey(userNo, statMonth, statStyle);
        return lwPowerFeeFaxingDto;
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
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerFeeFaxing.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwPowerFeeFaxing.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwPowerFeeFaxingDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwPowerFeeFaxing.findByConditions(conditions);
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
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerFeeFaxing.getCount(conditions);
        return count;
    }
}
