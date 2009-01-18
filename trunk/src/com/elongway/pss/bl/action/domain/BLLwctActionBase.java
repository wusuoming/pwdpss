package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwctDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwct;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ���ǵ�����������ҵ���߼�������<br>
 */
public class BLLwctActionBase{
    private static Logger logger = Logger.getLogger(BLLwctActionBase.class);

    /**
     * ���캯��
     */
    public BLLwctActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwctDto lwctDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwctDto lwctDto)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        //�����¼
        dbLwct.insert(lwctDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param modus ��ʽ
     * @throws Exception
     */
    public void delete(DBManager dbManager,String modus)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        //ɾ����¼
        dbLwct.delete(modus);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        //������ɾ����¼
        dbLwct.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwctDto lwctDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwctDto lwctDto)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        //���¼�¼
        dbLwct.update(lwctDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param modus ��ʽ
     * @return lwctDto lwctDto
     * @throws Exception
     */
    public LwctDto findByPrimaryKey(DBManager dbManager,String modus)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        //����DTO
        LwctDto lwctDto = null;
        //��ѯ����,��ֵ��DTO
        lwctDto = dbLwct.findByPrimaryKey(modus);
        return lwctDto;
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
        DBLwct dbLwct = new DBLwct(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwct.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwct.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwctDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwct.findByConditions(conditions);
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
        DBLwct dbLwct = new DBLwct(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwct.getCount(conditions);
        return count;
    }
}
