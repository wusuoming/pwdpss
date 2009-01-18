package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADFileDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADFile;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADFile��ҵ���߼�������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADFileActionBase{
    private static Logger logger = Logger.getLogger(BLIADFileActionBase.class);

    /**
     * ���캯��
     */
    public BLIADFileActionBase(){
    }
    
    /**
     * ����һ������
     * @param dbManager DB������
     * @param iADFileDto iADFileDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IADFileDto iADFileDto)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        //�����¼
        dbIADFile.insert(iADFileDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param contactNo ContactNo
     * @param fileUuid FileUuid
     * @throws Exception
     */
    public void delete(DBManager dbManager,String contactNo,String fileUuid)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        //ɾ����¼
        dbIADFile.delete(contactNo, fileUuid);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        //������ɾ����¼
        dbIADFile.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param iADFileDto iADFileDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IADFileDto iADFileDto)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        //���¼�¼
        dbIADFile.update(iADFileDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param contactNo ContactNo
     * @param fileUuid FileUuid
     * @return iADFileDto iADFileDto
     * @throws Exception
     */
    public IADFileDto findByPrimaryKey(DBManager dbManager,String contactNo,String fileUuid)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        //����DTO
        IADFileDto iADFileDto = null;
        //��ѯ����,��ֵ��DTO
        iADFileDto = dbIADFile.findByPrimaryKey(contactNo, fileUuid);
        return iADFileDto;
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
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADFile.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIADFile.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����iADFileDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIADFile.findByConditions(conditions);
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
        DBIADFile dbIADFile = new DBIADFile(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADFile.getCount(conditions);
        return count;
    }
}
