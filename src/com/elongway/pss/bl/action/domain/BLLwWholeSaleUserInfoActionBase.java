package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleUserInfo;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleUserInfo-�����û���Ϣ���ҵ���߼�������<br>
 */
public class BLLwWholeSaleUserInfoActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleUserInfoActionBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleUserInfoActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwWholeSaleUserInfoDto lwWholeSaleUserInfoDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto)
            throws Exception{
        DBLwWholeSaleUserInfo dbLwWholeSaleUserInfo = new DBLwWholeSaleUserInfo(dbManager);
        //�����¼
        dbLwWholeSaleUserInfo.insert(lwWholeSaleUserInfoDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo)
            throws Exception{
        DBLwWholeSaleUserInfo dbLwWholeSaleUserInfo = new DBLwWholeSaleUserInfo(dbManager);
        //ɾ����¼
        dbLwWholeSaleUserInfo.delete(userNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleUserInfo dbLwWholeSaleUserInfo = new DBLwWholeSaleUserInfo(dbManager);
        //������ɾ����¼
        dbLwWholeSaleUserInfo.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwWholeSaleUserInfoDto lwWholeSaleUserInfoDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto)
            throws Exception{
        DBLwWholeSaleUserInfo dbLwWholeSaleUserInfo = new DBLwWholeSaleUserInfo(dbManager);
        //���¼�¼
        dbLwWholeSaleUserInfo.update(lwWholeSaleUserInfoDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @return lwWholeSaleUserInfoDto lwWholeSaleUserInfoDto
     * @throws Exception
     */
    public LwWholeSaleUserInfoDto findByPrimaryKey(DBManager dbManager,String userNo)
            throws Exception{
        DBLwWholeSaleUserInfo dbLwWholeSaleUserInfo = new DBLwWholeSaleUserInfo(dbManager);
        //����DTO
        LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = null;
        //��ѯ����,��ֵ��DTO
        lwWholeSaleUserInfoDto = dbLwWholeSaleUserInfo.findByPrimaryKey(userNo);
        return lwWholeSaleUserInfoDto;
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
        DBLwWholeSaleUserInfo dbLwWholeSaleUserInfo = new DBLwWholeSaleUserInfo(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleUserInfo.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleUserInfo.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwWholeSaleUserInfoDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleUserInfo dbLwWholeSaleUserInfo = new DBLwWholeSaleUserInfo(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleUserInfo.findByConditions(conditions);
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
        DBLwWholeSaleUserInfo dbLwWholeSaleUserInfo = new DBLwWholeSaleUserInfo(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleUserInfo.getCount(conditions);
        return count;
    }
}
