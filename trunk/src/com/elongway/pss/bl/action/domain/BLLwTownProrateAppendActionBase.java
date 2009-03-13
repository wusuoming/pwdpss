package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownProrateAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownProrateAppend;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownProrateAppend-������̯׷�ӱ��ҵ���߼�������<br>
 */
public class BLLwTownProrateAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownProrateAppendActionBase.class);

    /**
     * ���캯��
     */
    public BLLwTownProrateAppendActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownProrateAppendDto lwTownProrateAppendDto)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        //�����¼
        dbLwTownProrateAppend.insert(lwTownProrateAppendDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param flag ��־
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String flag)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        //ɾ����¼
        dbLwTownProrateAppend.delete(userNo, flag);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        //������ɾ����¼
        dbLwTownProrateAppend.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownProrateAppendDto lwTownProrateAppendDto)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        //���¼�¼
        dbLwTownProrateAppend.update(lwTownProrateAppendDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param flag ��־
     * @return lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public LwTownProrateAppendDto findByPrimaryKey(DBManager dbManager,String userNo,String flag)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        //����DTO
        LwTownProrateAppendDto lwTownProrateAppendDto = null;
        //��ѯ����,��ֵ��DTO
        lwTownProrateAppendDto = dbLwTownProrateAppend.findByPrimaryKey(userNo, flag);
        return lwTownProrateAppendDto;
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
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownProrateAppend.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownProrateAppend.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwTownProrateAppendDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownProrateAppend.findByConditions(conditions);
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
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownProrateAppend.getCount(conditions);
        return count;
    }
}
