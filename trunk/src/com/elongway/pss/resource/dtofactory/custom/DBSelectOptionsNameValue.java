package com.elongway.pss.resource.dtofactory.custom;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.custom.SelectOptionsDto;
import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * ������ �޸ģ�ȥ��������롣
 * yangfuqiang �޸Ĳ��ִ���
 * ����AuLaw���ɷ������DB��
 * <p>Title: PICCAUDIT</p>
 * <p>Description: PICC������������ϵͳ����</p>
 * <p>@createdate 2004-02-12</p>
 * @author DBGenerator
 * @version 1.0 
 */
public class DBSelectOptionsNameValue{
    private DBManager dbManager = null; //��Դ������

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBSelectOptionsNameValue(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param auTableCode 		����
     * @param auFieldCode 		�ֶδ���
     * @param auFieldNameCode 	�ֶ�����
     * @param conditions 		��ѯ����
     * @return Collection 		�����
     * @throws Exception
     */
    public Collection getSelectOptionsNameValue(String auTableCode,String auFieldCode,String auFieldNameCode,
                                                String conditions) throws Exception{
        Collection collection = new ArrayList();
        SelectOptionsDto selectOptionsDto = null;

        String statement = "Select distinct " + auFieldCode + ", " + auFieldNameCode + " From " + auTableCode +
                           " where " + conditions + "";

        ResultSet resultSet = dbManager.executeQuery(statement);
        
        while(resultSet.next()){
            selectOptionsDto = new SelectOptionsDto();
            selectOptionsDto.setOptionValue(StringUtils.rightTrim(resultSet.getString(1)));
            selectOptionsDto.setOptionName(StringUtils.rightTrim(resultSet.getString(2)));
            collection.add(selectOptionsDto);
        }
        resultSet.close();
        return collection;
    }
}
