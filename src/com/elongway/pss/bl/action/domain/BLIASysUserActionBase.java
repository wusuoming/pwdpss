package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IASysUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBIASysUser;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IASysUser��ҵ���߼�������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIASysUserActionBase{
    private static Logger logger = Logger.getLogger(BLIASysUserActionBase.class);

    /**
     * ���캯��
     */
    public BLIASysUserActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IASysUserDto iASysUserDto)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        //�����¼
        dbIASysUser.insert(iASysUserDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userCode,String areaCode)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        //ɾ����¼
        dbIASysUser.delete(userCode, areaCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        //������ɾ����¼
        dbIASysUser.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IASysUserDto iASysUserDto)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        //���¼�¼
        dbIASysUser.update(iASysUserDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @return iASysUserDto iASysUserDto
     * @throws Exception
     */
    public IASysUserDto findByPrimaryKey(DBManager dbManager,String userCode,String areaCode)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        //����DTO
        IASysUserDto iASysUserDto = null;
        //��ѯ����,��ֵ��DTO
        iASysUserDto = dbIASysUser.findByPrimaryKey(userCode, areaCode);
        return iASysUserDto;
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
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIASysUser.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIASysUser.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����iASysUserDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIASysUser.findByConditions(conditions);
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
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIASysUser.getCount(conditions);
        return count;
    }
}
