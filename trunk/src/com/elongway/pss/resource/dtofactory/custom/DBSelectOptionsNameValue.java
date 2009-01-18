package com.elongway.pss.resource.dtofactory.custom;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.custom.SelectOptionsDto;
import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * 李子扬 修改，去掉多余代码。
 * yangfuqiang 修改部分代码
 * 定义AuLaw法律法规库表的DB类
 * <p>Title: PICCAUDIT</p>
 * <p>Description: PICC计算机辅助审计系统程序</p>
 * <p>@createdate 2004-02-12</p>
 * @author DBGenerator
 * @version 1.0 
 */
public class DBSelectOptionsNameValue{
    private DBManager dbManager = null; //资源管理类

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBSelectOptionsNameValue(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param auTableCode 		表名
     * @param auFieldCode 		字段代码
     * @param auFieldNameCode 	字段名称
     * @param conditions 		查询条件
     * @return Collection 		结果集
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
