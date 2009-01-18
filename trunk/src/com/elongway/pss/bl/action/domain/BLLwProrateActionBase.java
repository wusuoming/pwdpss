package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwProrate;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWProrate-������̯���ҵ���߼�������<br>
 */
public class BLLwProrateActionBase{
  private static Logger logger = Logger.getLogger(BLLwProrateActionBase.class);

    /**
     * ���캯��
     */
    public BLLwProrateActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwProrateDto lwProrateDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwProrateDto lwProrateDto)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        //�����¼
        dbLwProrate.insert(lwProrateDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param userNo ����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        //ɾ����¼
        dbLwProrate.delete(userNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        //������ɾ����¼
        dbLwProrate.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwProrateDto lwProrateDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwProrateDto lwProrateDto)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        //���¼�¼
        dbLwProrate.update(lwProrateDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param userNo ����
     * @return lwProrateDto lwProrateDto
     * @throws Exception
     */
    public LwProrateDto findByPrimaryKey(DBManager dbManager,String userNo)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        //����DTO
        LwProrateDto lwProrateDto = null;
        //��ѯ����,��ֵ��DTO
        lwProrateDto = dbLwProrate.findByPrimaryKey(userNo);
        return lwProrateDto;
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
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwProrate.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwProrate.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwProrateDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwProrate.findByConditions(conditions);
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
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwProrate.getCount(conditions);
        return count;
    }

}
