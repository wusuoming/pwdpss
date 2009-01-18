package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwLineCTDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwLineCT;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ������·�������������ձ��ҵ���߼�������<br>
 */
public class BLLwLineCTActionBase{
	 private static Logger logger = Logger.getLogger(BLLwLineCTActionBase.class);

	    /**
	     * ���캯��
	     */
	    public BLLwLineCTActionBase(){
	    }

	    /**
	     * ����һ������
	     * @param dbManager DB������
	     * @param lwLineCTDto lwLineCTDto
	     * @throws Exception
	     */
	    public void insert(DBManager dbManager,LwLineCTDto lwLineCTDto)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        //�����¼
	        dbLwLineCT.insert(lwLineCTDto);
	    }

	    /**
	     * ������ɾ��һ������
	     * @param dbManager DB������
	     * @param lineCode ��·����
	     * @param ctModus ������������ʽ
	     * @throws Exception
	     */
	    public void delete(DBManager dbManager,String lineCode,String ctModus)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        //ɾ����¼
	        dbLwLineCT.delete(lineCode, ctModus);
	    }

	    /**
	     * ������ɾ������
	     * @param dbManager DB������
	     * @param conditions ɾ������
	     * @throws Exception
	     */
	    public void deleteByConditions(DBManager dbManager,String conditions)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        //������ɾ����¼
	        dbLwLineCT.deleteByConditions(conditions);
	    }

	    /**
	     * ����������һ������(���������޷����)
	     * @param dbManager DB������
	     * @param lwLineCTDto lwLineCTDto
	     * @throws Exception
	     */
	    public void update(DBManager dbManager,LwLineCTDto lwLineCTDto)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        //���¼�¼
	        dbLwLineCT.update(lwLineCTDto);
	    }

	    /**
	     * ����������һ������
	     * @param dbManager DB������
	     * @param lineCode ��·����
	     * @param ctModus ������������ʽ
	     * @return lwLineCTDto lwLineCTDto
	     * @throws Exception
	     */
	    public LwLineCTDto findByPrimaryKey(DBManager dbManager,String lineCode,String ctModus)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        //����DTO
	        LwLineCTDto lwLineCTDto = null;
	        //��ѯ����,��ֵ��DTO
	        lwLineCTDto = dbLwLineCT.findByPrimaryKey(lineCode, ctModus);
	        return lwLineCTDto;
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
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        Collection collection = new ArrayList();

	        if(conditions.trim().length()==0){
	            conditions = "1=1";
	        }

	        int count = dbLwLineCT.getCount(SqlUtils.getWherePartForGetCount(conditions));
	        collection = dbLwLineCT.findByConditions(conditions,pageNo,rowsPerPage);
	        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
	        return pageRecord;
	    }

	    /**
	     * ��������ѯ��������
	     * @param dbManager DB������
	     * @param conditions ��ѯ����
	     * @return Collection ����lwLineCTDto�ļ���
	     * @throws Exception
	     */
	    public Collection findByConditions(DBManager dbManager,String conditions)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        Collection collection = new ArrayList();

	        if(conditions.trim().length()==0){
	            conditions = "1=1";
	        }

	        collection = dbLwLineCT.findByConditions(conditions);
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
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);

	        if(conditions.trim().length()==0){
	            conditions = "1=1";
	        }

	        int count = dbLwLineCT.getCount(conditions);
	        return count;
	    }
}
