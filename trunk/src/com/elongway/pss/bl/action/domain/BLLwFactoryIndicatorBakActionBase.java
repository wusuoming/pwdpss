package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwFactoryIndicatorBak;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWFactoryIndicatorBak-��ҵ���ָ���¼���ݱ��ҵ���߼�������<br>
 */
public class BLLwFactoryIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwFactoryIndicatorBakActionBase.class);

    /**
     * ���캯��
     */
    public BLLwFactoryIndicatorBakActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto)
            throws Exception{
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        //�����¼
        dbLwFactoryIndicatorBak.insert(lwFactoryIndicatorBakDto);
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
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        //ɾ����¼
        dbLwFactoryIndicatorBak.delete(userNo, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        //������ɾ����¼
        dbLwFactoryIndicatorBak.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto)
            throws Exception{
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        //���¼�¼
        dbLwFactoryIndicatorBak.update(lwFactoryIndicatorBakDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @return lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public LwFactoryIndicatorBakDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        //����DTO
        LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto = null;
        //��ѯ����,��ֵ��DTO
        lwFactoryIndicatorBakDto = dbLwFactoryIndicatorBak.findByPrimaryKey(userNo, statMonth);
        return lwFactoryIndicatorBakDto;
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
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwFactoryIndicatorBak.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwFactoryIndicatorBak.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwFactoryIndicatorBakDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwFactoryIndicatorBak.findByConditions(conditions);
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
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwFactoryIndicatorBak.getCount(conditions);
        return count;
    }
}
