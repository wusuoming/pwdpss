package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.TransforDto;
import com.elongway.pss.resource.dtofactory.domain.DBTransfor;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����Transfor-��ѹ����Ϣ��ҵ���߼�������<br>
 */
public class BLTransforActionBase{
    private static Logger logger = Logger.getLogger(BLTransforActionBase.class);

    /**
     * ���캯��
     */
    public BLTransforActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param transforDto transforDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,TransforDto transforDto)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        //�����¼
        dbTransfor.insert(transforDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param transforName ��ѹ������
     * @throws Exception
     */
    public void delete(DBManager dbManager,String transforName)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        //ɾ����¼
        dbTransfor.delete(transforName);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        //������ɾ����¼
        dbTransfor.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param transforDto transforDto
     * @throws Exception
     */
    public void update(DBManager dbManager,TransforDto transforDto)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        //���¼�¼
        dbTransfor.update(transforDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param transforName ��ѹ������
     * @return transforDto transforDto
     * @throws Exception
     */
    public TransforDto findByPrimaryKey(DBManager dbManager,String transforName)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        //����DTO
        TransforDto transforDto = null;
        //��ѯ����,��ֵ��DTO
        transforDto = dbTransfor.findByPrimaryKey(transforName);
        return transforDto;
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
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbTransfor.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbTransfor.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����transforDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbTransfor.findByConditions(conditions);
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
        DBTransfor dbTransfor = new DBTransfor(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbTransfor.getCount(conditions);
        return count;
    }
}
