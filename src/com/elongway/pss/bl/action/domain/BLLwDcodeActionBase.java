package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwDcode;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwDcode-����������ҵ���߼�������<br>
 */
public class BLLwDcodeActionBase{
    private static Logger logger = Logger.getLogger(BLLwDcodeActionBase.class);

    /**
     * ���캯��
     */
    public BLLwDcodeActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwDcodeDto lwDcodeDto)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        //�����¼
        dbLwDcode.insert(lwDcodeDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param codeType �ӿڴ�������
     * @param codeCode ����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String codeType,String codeCode)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        //ɾ����¼
        dbLwDcode.delete(codeType, codeCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        //������ɾ����¼
        dbLwDcode.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwDcodeDto lwDcodeDto)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        //���¼�¼
        dbLwDcode.update(lwDcodeDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param codeType �ӿڴ�������
     * @param codeCode ����
     * @return lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public LwDcodeDto findByPrimaryKey(DBManager dbManager,String codeType,String codeCode)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        //����DTO
        LwDcodeDto lwDcodeDto = null;
        //��ѯ����,��ֵ��DTO
        lwDcodeDto = dbLwDcode.findByPrimaryKey(codeType, codeCode);
        return lwDcodeDto;
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
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwDcode.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwDcode.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwDcodeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwDcode.findByConditions(conditions);
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
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwDcode.getCount(conditions);
        return count;
    }
}
