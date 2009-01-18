package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicatorAppend;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownIndicatorAppend-ֱ����׷�ӵ��ָ���¼���ҵ���߼�������<br>
 */
public class BLLwTownIndicatorAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorAppendActionBase.class);

    /**
     * ���캯��
     */
    public BLLwTownIndicatorAppendActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownIndicatorAppendDto lwTownIndicatorAppendDto)
            throws Exception{
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        //�����¼
        dbLwTownIndicatorAppend.insert(lwTownIndicatorAppendDto);
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
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        //ɾ����¼
        dbLwTownIndicatorAppend.delete(userNo, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        //������ɾ����¼
        dbLwTownIndicatorAppend.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownIndicatorAppendDto lwTownIndicatorAppendDto)
            throws Exception{
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        //���¼�¼
        dbLwTownIndicatorAppend.update(lwTownIndicatorAppendDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param statMonth ����
     * @return lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public LwTownIndicatorAppendDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        //����DTO
        LwTownIndicatorAppendDto lwTownIndicatorAppendDto = null;
        //��ѯ����,��ֵ��DTO
        lwTownIndicatorAppendDto = dbLwTownIndicatorAppend.findByPrimaryKey(userNo, statMonth);
        return lwTownIndicatorAppendDto;
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
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownIndicatorAppend.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownIndicatorAppend.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwTownIndicatorAppendDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownIndicatorAppend.findByConditions(conditions);
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
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownIndicatorAppend.getCount(conditions);
        return count;
    }
}
