package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwDcompanyDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwDcompany;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWDcompany-����������ҵ���߼�������<br>
 */
public class BLLwDcompanyActionBase{
    private static Logger logger = Logger.getLogger(BLLwDcompanyActionBase.class);

    /**
     * ���캯��
     */
    public BLLwDcompanyActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwDcompanyDto lwDcompanyDto)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        //�����¼
        dbLwDcompany.insert(lwDcompanyDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param comCode ��������
     * @throws Exception
     */
    public void delete(DBManager dbManager,String comCode)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        //ɾ����¼
        dbLwDcompany.delete(comCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        //������ɾ����¼
        dbLwDcompany.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwDcompanyDto lwDcompanyDto)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        //���¼�¼
        dbLwDcompany.update(lwDcompanyDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param comCode ��������
     * @return lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public LwDcompanyDto findByPrimaryKey(DBManager dbManager,String comCode)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        //����DTO
        LwDcompanyDto lwDcompanyDto = null;
        //��ѯ����,��ֵ��DTO
        lwDcompanyDto = dbLwDcompany.findByPrimaryKey(comCode);
        return lwDcompanyDto;
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
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwDcompany.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwDcompany.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwDcompanyDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwDcompany.findByConditions(conditions);
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
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwDcompany.getCount(conditions);
        return count;
    }
}
