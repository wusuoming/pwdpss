package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwptDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwpt;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ���ǵ�ѹ��������ҵ���߼�������<br>
 */
public class BLLwptActionBase{
    private static Logger logger = Logger.getLogger(BLLwptActionBase.class);

    /**
     * ���캯��
     */
    public BLLwptActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwptDto lwptDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwptDto lwptDto)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        //�����¼
        dbLwpt.insert(lwptDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param modus ��ʽ
     * @throws Exception
     */
    public void delete(DBManager dbManager,String modus)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        //ɾ����¼
        dbLwpt.delete(modus);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        //������ɾ����¼
        dbLwpt.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwptDto lwptDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwptDto lwptDto)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        //���¼�¼
        dbLwpt.update(lwptDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param modus ��ʽ
     * @return lwptDto lwptDto
     * @throws Exception
     */
    public LwptDto findByPrimaryKey(DBManager dbManager,String modus)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        //����DTO
        LwptDto lwptDto = null;
        //��ѯ����,��ֵ��DTO
        lwptDto = dbLwpt.findByPrimaryKey(modus);
        return lwptDto;
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
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwpt.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwpt.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwptDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwpt.findByConditions(conditions);
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
        DBLwpt dbLwpt = new DBLwpt(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwpt.getCount(conditions);
        return count;
    }
}
