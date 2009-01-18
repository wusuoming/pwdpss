package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwCoporationUserInfo;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWCoporationUserInfo-��ҵ�û���Ϣ���ҵ���߼�������<br>
 */
public class BLLwCoporationUserInfoActionBase{
    private static Logger logger = Logger.getLogger(BLLwCoporationUserInfoActionBase.class);

    /**
     * ���캯��
     */
    public BLLwCoporationUserInfoActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwCoporationUserInfoDto lwCoporationUserInfoDto)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        //�����¼
        dbLwCoporationUserInfo.insert(lwCoporationUserInfoDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        //ɾ����¼
        dbLwCoporationUserInfo.delete(userNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        //������ɾ����¼
        dbLwCoporationUserInfo.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwCoporationUserInfoDto lwCoporationUserInfoDto)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        //���¼�¼
        dbLwCoporationUserInfo.update(lwCoporationUserInfoDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @return lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public LwCoporationUserInfoDto findByPrimaryKey(DBManager dbManager,String userNo)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        //����DTO
        LwCoporationUserInfoDto lwCoporationUserInfoDto = null;
        //��ѯ����,��ֵ��DTO
        lwCoporationUserInfoDto = dbLwCoporationUserInfo.findByPrimaryKey(userNo);
        return lwCoporationUserInfoDto;
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
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwCoporationUserInfo.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwCoporationUserInfo.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwCoporationUserInfoDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwCoporationUserInfo.findByConditions(conditions);
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
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwCoporationUserInfo.getCount(conditions);
        return count;
    }
}
