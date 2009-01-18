package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LineLossDto;
import com.elongway.pss.resource.dtofactory.domain.DBLineLoss;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LineLoss-������Ϣ���ҵ���߼�������<br>
 */
public class BLLineLossActionBase{
    private static Logger logger = Logger.getLogger(BLLineLossActionBase.class);

    /**
     * ���캯��
     */
    public BLLineLossActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lineLossDto lineLossDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LineLossDto lineLossDto)
            throws Exception{
        DBLineLoss dbLineLoss = new DBLineLoss(dbManager);
        //�����¼
        dbLineLoss.insert(lineLossDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode)
            throws Exception{
        DBLineLoss dbLineLoss = new DBLineLoss(dbManager);
        //ɾ����¼
        dbLineLoss.delete(lineCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLineLoss dbLineLoss = new DBLineLoss(dbManager);
        //������ɾ����¼
        dbLineLoss.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lineLossDto lineLossDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LineLossDto lineLossDto)
            throws Exception{
        DBLineLoss dbLineLoss = new DBLineLoss(dbManager);
        //���¼�¼
        dbLineLoss.update(lineLossDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @return lineLossDto lineLossDto
     * @throws Exception
     */
    public LineLossDto findByPrimaryKey(DBManager dbManager,String lineCode)
            throws Exception{
        DBLineLoss dbLineLoss = new DBLineLoss(dbManager);
        //����DTO
        LineLossDto lineLossDto = null;
        //��ѯ����,��ֵ��DTO
        lineLossDto = dbLineLoss.findByPrimaryKey(lineCode);
        return lineLossDto;
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
        DBLineLoss dbLineLoss = new DBLineLoss(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLineLoss.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLineLoss.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lineLossDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLineLoss dbLineLoss = new DBLineLoss(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLineLoss.findByConditions(conditions);
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
        DBLineLoss dbLineLoss = new DBLineLoss(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLineLoss.getCount(conditions);
        return count;
    }
}
