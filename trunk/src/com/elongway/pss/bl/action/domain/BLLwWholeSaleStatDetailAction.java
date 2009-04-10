package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleStatDetailDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleStatDetail;

/**
 * ����LWWholeSaleStatDetail-���۰����ͳ�Ƶ�ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSaleStatDetailAction extends BLLwWholeSaleStatDetailActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleStatDetailAction.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleStatDetailAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto,String mode)
            throws Exception{
    }
    
    
    /**
     * �����������
     * @param lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public void insertAll(Collection<LwWholeSaleStatDetailDto> collection)
        throws Exception{
        DBManager dbManager = new DBManager();
        
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            DBLwWholeSaleStatDetail dbWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
            dbWholeSaleStatDetail.insertAll(collection);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }
    
}
