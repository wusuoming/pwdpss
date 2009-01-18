package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwUserLine;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWUserLine-�û���·���ձ��ҵ���߼�������<br>
 */
public class BLLwUserLineActionBase{
    private static Logger logger = Logger.getLogger(BLLwUserLineActionBase.class);

    /**
     * ���캯��
     */
    public BLLwUserLineActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwUserLineDto lwUserLineDto)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        //�����¼
        dbLwUserLine.insert(lwUserLineDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param lineCode ��·����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String lineCode)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        //ɾ����¼
        dbLwUserLine.delete(userNo, lineCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        //������ɾ����¼
        dbLwUserLine.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwUserLineDto lwUserLineDto)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        //���¼�¼
        dbLwUserLine.update(lwUserLineDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @param lineCode ��·����
     * @return lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public LwUserLineDto findByPrimaryKey(DBManager dbManager,String userNo,String lineCode)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        //����DTO
        LwUserLineDto lwUserLineDto = null;
        //��ѯ����,��ֵ��DTO
        lwUserLineDto = dbLwUserLine.findByPrimaryKey(userNo, lineCode);
        return lwUserLineDto;
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
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwUserLine.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwUserLine.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwUserLineDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwUserLine.findByConditions(conditions);
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
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwUserLine.getCount(conditions);
        return count;
    }
}
