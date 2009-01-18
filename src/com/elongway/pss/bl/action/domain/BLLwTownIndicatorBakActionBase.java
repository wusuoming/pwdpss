package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicatorBak;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownIndicatorBak-ֱ������ָ���¼���ݱ��ҵ���߼�������<br>
 */
public class BLLwTownIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorBakActionBase.class);

    /**
     * ���캯��
     */
    public BLLwTownIndicatorBakActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownIndicatorBakDto lwTownIndicatorBakDto)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //�����¼
        dbLwTownIndicatorBak.insert(lwTownIndicatorBakDto);
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
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //ɾ����¼
        dbLwTownIndicatorBak.delete(userNo, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //������ɾ����¼
        dbLwTownIndicatorBak.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownIndicatorBakDto lwTownIndicatorBakDto)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //���¼�¼
        dbLwTownIndicatorBak.update(lwTownIndicatorBakDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @return lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public LwTownIndicatorBakDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //����DTO
        LwTownIndicatorBakDto lwTownIndicatorBakDto = null;
        //��ѯ����,��ֵ��DTO
        lwTownIndicatorBakDto = dbLwTownIndicatorBak.findByPrimaryKey(userNo, statMonth);
        return lwTownIndicatorBakDto;
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
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownIndicatorBak.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownIndicatorBak.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwTownIndicatorBakDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownIndicatorBak.findByConditions(conditions);
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
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownIndicatorBak.getCount(conditions);
        return count;
    }
}
