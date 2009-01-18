package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IASysUserDto;
import com.elongway.pss.bl.action.domain.BLIASysUserAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IASysUser��ҵ���߼�����Facade����<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIASysUserFacadeBase{
    private static Logger logger = Logger.getLogger(BLIASysUserFacadeBase.class);

    /**
     * ���캯��
     */
    public BLIASysUserFacadeBase(){
    }

    /**
     * ����һ������
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void insert(IASysUserDto iASysUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blIASysUserAction.insert(dbManager,iASysUserDto);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ������ɾ��һ������
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @throws Exception
     */
    public void delete(String userCode,String areaCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blIASysUserAction.delete(dbManager,userCode, areaCode);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ������ɾ������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(String conditions)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blIASysUserAction.deleteByConditions(dbManager,conditions);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ����������һ������(���������޷����)
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void update(IASysUserDto iASysUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blIASysUserAction.update(dbManager,iASysUserDto);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ����������һ������
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @return iASysUserDto iASysUserDto
     * @throws Exception
     */
    public IASysUserDto findByPrimaryKey(String userCode,String areaCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        //����DTO
        IASysUserDto iASysUserDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            iASysUserDto = blIASysUserAction.findByPrimaryKey(dbManager,userCode, areaCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return iASysUserDto;
    }

    /**
     * ��������ѯ��������
     * @param conditions ��ѯ����
     * @param pageNo ҳ��
     * @param rowsPerPage ÿҳ������
     * @return PageRecord ��ѯ��һҳ�Ľ��
     * @throws Exception
     */
    public PageRecord findByConditions(String conditions,int pageNo,int rowsPerPage)
        throws Exception{
        PageRecord pageRecord = new PageRecord(0,pageNo,1,rowsPerPage,new ArrayList());

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blIASysUserAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param conditions ��ѯ����
     * @return Collection ����iASysUserDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            collection = blIASysUserAction.findByConditions(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return collection;
    }

    /**
     * ��ѯ����ģ����ѯ�����ļ�¼��
     * @param conditions conditions
     * @return ����ģ����ѯ�����ļ�¼��
     * @throws Exception
     */
    public int getCount(String conditions) 
        throws Exception{
        int rowCount=0;
        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blIASysUserAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
