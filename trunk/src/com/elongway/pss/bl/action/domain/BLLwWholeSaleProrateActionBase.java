package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleProrate;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleProrate-���۱�����̯���ҵ���߼�������<br>
 */
public class BLLwWholeSaleProrateActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleProrateActionBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleProrateActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleProrateDto lwWholeSaleProrateDto)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        //�����¼
        dbLwWholeSaleProrate.insert(lwWholeSaleProrateDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param comCode ��������
     * @param voltLevel ��ѹ�ȼ�
     * @throws Exception
     */
    public void delete(DBManager dbManager,String comCode,String voltLevel)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        //ɾ����¼
        dbLwWholeSaleProrate.delete(comCode, voltLevel);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        //������ɾ����¼
        dbLwWholeSaleProrate.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleProrateDto lwWholeSaleProrateDto)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        //���¼�¼
        dbLwWholeSaleProrate.update(lwWholeSaleProrateDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param comCode ��������
     * @param voltLevel ��ѹ�ȼ�
     * @return lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public LwWholeSaleProrateDto findByPrimaryKey(DBManager dbManager,String comCode,String voltLevel)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        //����DTO
        LwWholeSaleProrateDto lwWholeSaleProrateDto = null;
        //��ѯ����,��ֵ��DTO
        lwWholeSaleProrateDto = dbLwWholeSaleProrate.findByPrimaryKey(comCode, voltLevel);
        return lwWholeSaleProrateDto;
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
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleProrate.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleProrate.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwWholeSaleProrateDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleProrate.findByConditions(conditions);
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
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleProrate.getCount(conditions);
        return count;
    }
}
