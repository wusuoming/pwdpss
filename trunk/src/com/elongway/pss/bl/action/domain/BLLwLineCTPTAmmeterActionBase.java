package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwLineCTPTAmmeter;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ������·������ѹ����������ϵ���ҵ���߼�������<br>
 */
public class BLLwLineCTPTAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwLineCTPTAmmeterActionBase.class);

    /**
     * ���캯��
     */
    public BLLwLineCTPTAmmeterActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        //�����¼
        dbLwLineCTPTAmmeter.insert(lwLineCTPTAmmeterDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param ctModus ������������ʽ
     * @param ptModus ��ѹ��������ʽ
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode,String ctModus,String ptModus,String ammeterNo)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        //ɾ����¼
        dbLwLineCTPTAmmeter.delete(lineCode, ctModus, ptModus, ammeterNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        //������ɾ����¼
        dbLwLineCTPTAmmeter.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        //���¼�¼
        dbLwLineCTPTAmmeter.update(lwLineCTPTAmmeterDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param lineCode ��·����
     * @param ctModus ������������ʽ
     * @param ptModus ��ѹ��������ʽ
     * @param ammeterNo ���
     * @return lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public LwLineCTPTAmmeterDto findByPrimaryKey(DBManager dbManager,String lineCode,String ctModus,String ptModus,String ammeterNo)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        //����DTO
        LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto = null;
        //��ѯ����,��ֵ��DTO
        lwLineCTPTAmmeterDto = dbLwLineCTPTAmmeter.findByPrimaryKey(lineCode, ctModus, ptModus, ammeterNo);
        return lwLineCTPTAmmeterDto;
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
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwLineCTPTAmmeter.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwLineCTPTAmmeter.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwLineCTPTAmmeterDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwLineCTPTAmmeter.findByConditions(conditions);
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
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwLineCTPTAmmeter.getCount(conditions);
        return count;
    }
}
