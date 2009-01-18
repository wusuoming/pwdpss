package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeterChange;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWAmmeterChange-�������Ϣ��ҵ���߼�������<br>
 */
public class BLLwAmmeterChangeActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterChangeActionBase.class);

    /**
     * ���캯��
     */
    public BLLwAmmeterChangeActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwAmmeterChangeDto lwAmmeterChangeDto)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        //�����¼
        dbLwAmmeterChange.insert(lwAmmeterChangeDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param id ���
     * @throws Exception
     */
    public void delete(DBManager dbManager,String id)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        //ɾ����¼
        dbLwAmmeterChange.delete(id);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        //������ɾ����¼
        dbLwAmmeterChange.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwAmmeterChangeDto lwAmmeterChangeDto)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        //���¼�¼
        dbLwAmmeterChange.update(lwAmmeterChangeDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param id ���
     * @return lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public LwAmmeterChangeDto findByPrimaryKey(DBManager dbManager,String id)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        //����DTO
        LwAmmeterChangeDto lwAmmeterChangeDto = null;
        //��ѯ����,��ֵ��DTO
        lwAmmeterChangeDto = dbLwAmmeterChange.findByPrimaryKey(id);
        return lwAmmeterChangeDto;
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
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterChange.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwAmmeterChange.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwAmmeterChangeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwAmmeterChange.findByConditions(conditions);
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
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterChange.getCount(conditions);
        return count;
    }
}
