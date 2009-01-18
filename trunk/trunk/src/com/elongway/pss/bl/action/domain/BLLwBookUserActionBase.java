package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwBookUser;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwBookUser-���û����ձ��ҵ���߼�������<br>
 */
public class BLLwBookUserActionBase{
    private static Logger logger = Logger.getLogger(BLLwBookUserActionBase.class);

    /**
     * ���캯��
     */
    public BLLwBookUserActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwBookUserDto lwBookUserDto)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        //�����¼
        dbLwBookUser.insert(lwBookUserDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param bookNo ����
     * @param userNo �û�����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String bookNo,String userNo)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        //ɾ����¼
        dbLwBookUser.delete(bookNo, userNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        //������ɾ����¼
        dbLwBookUser.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwBookUserDto lwBookUserDto)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        //���¼�¼
        dbLwBookUser.update(lwBookUserDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param bookNo ����
     * @param userNo �û�����
     * @return lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public LwBookUserDto findByPrimaryKey(DBManager dbManager,String bookNo,String userNo)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        //����DTO
        LwBookUserDto lwBookUserDto = null;
        //��ѯ����,��ֵ��DTO
        lwBookUserDto = dbLwBookUser.findByPrimaryKey(bookNo, userNo);
        return lwBookUserDto;
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
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwBookUser.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwBookUser.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwBookUserDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwBookUser.findByConditions(conditions);
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
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwBookUser.getCount(conditions);
        return count;
    }
}
