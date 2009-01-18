package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeterBook;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwAmmeterBook-����Ϣ���ҵ���߼�������<br>
 */
public class BLLwAmmeterBookActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterBookActionBase.class);

    /**
     * ���캯��
     */
    public BLLwAmmeterBookActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwAmmeterBookDto lwAmmeterBookDto)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        //�����¼
        dbLwAmmeterBook.insert(lwAmmeterBookDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param bookNo ����
     * @throws Exception
     */
    public void delete(DBManager dbManager,String bookNo)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        //ɾ����¼
        dbLwAmmeterBook.delete(bookNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        //������ɾ����¼
        dbLwAmmeterBook.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwAmmeterBookDto lwAmmeterBookDto)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        //���¼�¼
        dbLwAmmeterBook.update(lwAmmeterBookDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param bookNo ����
     * @return lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public LwAmmeterBookDto findByPrimaryKey(DBManager dbManager,String bookNo)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        //����DTO
        LwAmmeterBookDto lwAmmeterBookDto = null;
        //��ѯ����,��ֵ��DTO
        lwAmmeterBookDto = dbLwAmmeterBook.findByPrimaryKey(bookNo);
        return lwAmmeterBookDto;
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
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterBook.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwAmmeterBook.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwAmmeterBookDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwAmmeterBook.findByConditions(conditions);
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
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterBook.getCount(conditions);
        return count;
    }
}
