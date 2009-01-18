package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwSysUser;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWSysUser-��¼�û����ҵ���߼�������<br>
 */
public class BLLwSysUserActionBase{
    private static Logger logger = Logger.getLogger(BLLwSysUserActionBase.class);

    /**
     * ���캯��
     */
    public BLLwSysUserActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwSysUserDto lwSysUserDto)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        //�����¼
        dbLwSysUser.insert(lwSysUserDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userCode �û�����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userCode)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        //ɾ����¼
        dbLwSysUser.delete(userCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        //������ɾ����¼
        dbLwSysUser.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwSysUserDto lwSysUserDto)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        //���¼�¼
        dbLwSysUser.update(lwSysUserDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userCode �û�����
     * @return lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public LwSysUserDto findByPrimaryKey(DBManager dbManager,String userCode)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        //����DTO
        LwSysUserDto lwSysUserDto = null;
        //��ѯ����,��ֵ��DTO
        lwSysUserDto = dbLwSysUser.findByPrimaryKey(userCode);
        return lwSysUserDto;
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
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwSysUser.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwSysUser.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwSysUserDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwSysUser.findByConditions(conditions);
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
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwSysUser.getCount(conditions);
        return count;
    }
}
