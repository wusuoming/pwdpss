package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwLinePTDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwLinePT;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ������·��ѹ���������ձ��ҵ���߼�������<br>
 */
public class BLLwLinePTActionBase{
    private static Logger logger = Logger.getLogger(BLLwLinePTActionBase.class);

    /**
     * ���캯��
     */
    public BLLwLinePTActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwLinePTDto lwLinePTDto)
            throws Exception{
        DBLwLinePT dbLwLinePT = new DBLwLinePT(dbManager);
        //�����¼
        dbLwLinePT.insert(lwLinePTDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param ptModus ��ѹ��������ʽ
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode,String ptModus)
            throws Exception{
        DBLwLinePT dbLwLinePT = new DBLwLinePT(dbManager);
        //ɾ����¼
        dbLwLinePT.delete(lineCode, ptModus);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwLinePT dbLwLinePT = new DBLwLinePT(dbManager);
        //������ɾ����¼
        dbLwLinePT.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwLinePTDto lwLinePTDto)
            throws Exception{
        DBLwLinePT dbLwLinePT = new DBLwLinePT(dbManager);
        //���¼�¼
        dbLwLinePT.update(lwLinePTDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param ptModus ��ѹ��������ʽ
     * @return lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public LwLinePTDto findByPrimaryKey(DBManager dbManager,String lineCode,String ptModus)
            throws Exception{
        DBLwLinePT dbLwLinePT = new DBLwLinePT(dbManager);
        //����DTO
        LwLinePTDto lwLinePTDto = null;
        //��ѯ����,��ֵ��DTO
        lwLinePTDto = dbLwLinePT.findByPrimaryKey(lineCode, ptModus);
        return lwLinePTDto;
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
        DBLwLinePT dbLwLinePT = new DBLwLinePT(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwLinePT.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwLinePT.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwLinePTDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwLinePT dbLwLinePT = new DBLwLinePT(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwLinePT.findByConditions(conditions);
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
        DBLwLinePT dbLwLinePT = new DBLwLinePT(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwLinePT.getCount(conditions);
        return count;
    }
}
