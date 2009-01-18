package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPowerLine;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerLine-��·��Ϣ���ҵ���߼�������<br>
 */
public class BLLwPowerLineActionBase{
    private static Logger logger = Logger.getLogger(BLLwPowerLineActionBase.class);

    /**
     * ���캯��
     */
    public BLLwPowerLineActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwPowerLineDto lwPowerLineDto)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        //�����¼
        dbLwPowerLine.insert(lwPowerLineDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        //ɾ����¼
        dbLwPowerLine.delete(lineCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        //������ɾ����¼
        dbLwPowerLine.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwPowerLineDto lwPowerLineDto)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        //���¼�¼
        dbLwPowerLine.update(lwPowerLineDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @return lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public LwPowerLineDto findByPrimaryKey(DBManager dbManager,String lineCode)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        //����DTO
        LwPowerLineDto lwPowerLineDto = null;
        //��ѯ����,��ֵ��DTO
        lwPowerLineDto = dbLwPowerLine.findByPrimaryKey(lineCode);
        return lwPowerLineDto;
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
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerLine.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwPowerLine.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwPowerLineDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwPowerLine.findByConditions(conditions);
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
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerLine.getCount(conditions);
        return count;
    }
}
