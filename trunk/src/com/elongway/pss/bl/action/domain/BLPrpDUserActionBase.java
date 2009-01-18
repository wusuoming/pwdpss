package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.PrpDUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBPrpDUser;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWDUser-����Ա������ҵ���߼�������<br>
 */
public class BLPrpDUserActionBase{
    private static Logger logger = Logger.getLogger(BLPrpDUserActionBase.class);

    /**
     * ���캯��
     */
    public BLPrpDUserActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param prpDUserDto prpDUserDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,PrpDUserDto prpDUserDto)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        //�����¼
        dbPrpDUser.insert(prpDUserDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param operatorCode ����Ա����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String operatorCode)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        //ɾ����¼
        dbPrpDUser.delete(operatorCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        //������ɾ����¼
        dbPrpDUser.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param prpDUserDto prpDUserDto
     * @throws Exception
     */
    public void update(DBManager dbManager,PrpDUserDto prpDUserDto)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        //���¼�¼
        dbPrpDUser.update(prpDUserDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param operatorCode ����Ա����
     * @return prpDUserDto prpDUserDto
     * @throws Exception
     */
    public PrpDUserDto findByPrimaryKey(DBManager dbManager,String operatorCode)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        //����DTO
        PrpDUserDto prpDUserDto = null;
        //��ѯ����,��ֵ��DTO
        prpDUserDto = dbPrpDUser.findByPrimaryKey(operatorCode);
        return prpDUserDto;
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
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbPrpDUser.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbPrpDUser.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����prpDUserDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbPrpDUser.findByConditions(conditions);
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
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbPrpDUser.getCount(conditions);
        return count;
    }
}
