package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPowerUser;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerUser-�õ��û���Ϣ���ҵ���߼�������<br>
 */
public class BLLwPowerUserActionBase{
    private static Logger logger = Logger.getLogger(BLLwPowerUserActionBase.class);

    /**
     * ���캯��
     */
    public BLLwPowerUserActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwPowerUserDto lwPowerUserDto)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        //�����¼
        dbLwPowerUser.insert(lwPowerUserDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        //ɾ����¼
        dbLwPowerUser.delete(userNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        //������ɾ����¼
        dbLwPowerUser.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwPowerUserDto lwPowerUserDto)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        //���¼�¼
        dbLwPowerUser.update(lwPowerUserDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @return lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public LwPowerUserDto findByPrimaryKey(DBManager dbManager,String userNo)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        //����DTO
        LwPowerUserDto lwPowerUserDto = null;
        //��ѯ����,��ֵ��DTO
        lwPowerUserDto = dbLwPowerUser.findByPrimaryKey(userNo);
        return lwPowerUserDto;
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
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerUser.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwPowerUser.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwPowerUserDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwPowerUser.findByConditions(conditions);
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
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerUser.getCount(conditions);
        return count;
    }
}
