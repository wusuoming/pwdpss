package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwNewFactoryIndicatorBak;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWNewFactoryIndicatorBak-��ҵ�µ��ָ�뱸�ݱ��ҵ���߼�������<br>
 */
public class BLLwNewFactoryIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwNewFactoryIndicatorBakActionBase.class);

    /**
     * ���캯��
     */
    public BLLwNewFactoryIndicatorBakActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto)
            throws Exception{
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        //�����¼
        dbLwNewFactoryIndicatorBak.insert(lwNewFactoryIndicatorBakDto);
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
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        //ɾ����¼
        dbLwNewFactoryIndicatorBak.delete(userNo, statMonth, ammeterNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        //������ɾ����¼
        dbLwNewFactoryIndicatorBak.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto)
            throws Exception{
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        //���¼�¼
        dbLwNewFactoryIndicatorBak.update(lwNewFactoryIndicatorBakDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @param ammeterNo ���
     * @return lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public LwNewFactoryIndicatorBakDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth,String ammeterNo)
            throws Exception{
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        //����DTO
        LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto = null;
        //��ѯ����,��ֵ��DTO
        lwNewFactoryIndicatorBakDto = dbLwNewFactoryIndicatorBak.findByPrimaryKey(userNo, statMonth, ammeterNo);
        return lwNewFactoryIndicatorBakDto;
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
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwNewFactoryIndicatorBak.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwNewFactoryIndicatorBak.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwNewFactoryIndicatorBakDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwNewFactoryIndicatorBak.findByConditions(conditions);
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
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwNewFactoryIndicatorBak.getCount(conditions);
        return count;
    }
}
