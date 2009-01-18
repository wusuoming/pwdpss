package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwindicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwindicator;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWindicator-���ָ���¼���ҵ���߼�������<br>
 */
public class BLLwindicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwindicatorActionBase.class);

    /**
     * ���캯��
     */
    public BLLwindicatorActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwindicatorDto lwindicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwindicatorDto lwindicatorDto)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        //�����¼
        dbLwindicator.insert(lwindicatorDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param statMonth ͳ������
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode,String statMonth)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        //ɾ����¼
        dbLwindicator.delete(lineCode, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        //������ɾ����¼
        dbLwindicator.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwindicatorDto lwindicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwindicatorDto lwindicatorDto)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        //���¼�¼
        dbLwindicator.update(lwindicatorDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param statMonth ͳ������
     * @return lwindicatorDto lwindicatorDto
     * @throws Exception
     */
    public LwindicatorDto findByPrimaryKey(DBManager dbManager,String lineCode,String statMonth)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        //����DTO
        LwindicatorDto lwindicatorDto = null;
        //��ѯ����,��ֵ��DTO
        lwindicatorDto = dbLwindicator.findByPrimaryKey(lineCode, statMonth);
        return lwindicatorDto;
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
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwindicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwindicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwindicatorDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwindicator.findByConditions(conditions);
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
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwindicator.getCount(conditions);
        return count;
    }
}
