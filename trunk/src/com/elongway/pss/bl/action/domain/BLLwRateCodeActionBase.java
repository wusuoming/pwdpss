package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwRateCodeDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwRateCode;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWRateCode-������ά�����ҵ���߼�������<br>
 */
public class BLLwRateCodeActionBase{
    private static Logger logger = Logger.getLogger(BLLwRateCodeActionBase.class);

    /**
     * ���캯��
     */
    public BLLwRateCodeActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwRateCodeDto lwRateCodeDto)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        //�����¼
        dbLwRateCode.insert(lwRateCodeDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param powerFactor ��������
     * @param suppleType �������ʹ���
     * @throws Exception
     */
    public void delete(DBManager dbManager,String powerFactor,String suppleType)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        //ɾ����¼
        dbLwRateCode.delete(powerFactor, suppleType);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        //������ɾ����¼
        dbLwRateCode.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwRateCodeDto lwRateCodeDto)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        //���¼�¼
        dbLwRateCode.update(lwRateCodeDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param powerFactor ��������
     * @param suppleType �������ʹ���
     * @return lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public LwRateCodeDto findByPrimaryKey(DBManager dbManager,String powerFactor,String suppleType)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        //����DTO
        LwRateCodeDto lwRateCodeDto = null;
        //��ѯ����,��ֵ��DTO
        lwRateCodeDto = dbLwRateCode.findByPrimaryKey(powerFactor, suppleType);
        return lwRateCodeDto;
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
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwRateCode.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwRateCode.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwRateCodeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwRateCode.findByConditions(conditions);
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
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwRateCode.getCount(conditions);
        return count;
    }
}
