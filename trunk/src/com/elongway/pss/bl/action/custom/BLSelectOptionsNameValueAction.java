package com.elongway.pss.bl.action.custom;

import java.util.*;

import com.elongway.pss.resource.dtofactory.custom.DBSelectOptionsNameValue;
import com.sinosoft.sysframework.reference.DBManager;

/**
 *  李子扬 修改，去掉多余代码。
 *  yangfuqiang 修改部分代码
 * SelectOptions的BL类
 * <p>Title: PICCAUDIT</p>
 * <p>Description: PICC计算机辅助审计系统程序</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>@createdate: 2003-06-14</p>
 * @author renyiqun
 * @version 1.0.0
 */
public class BLSelectOptionsNameValueAction{
    public BLSelectOptionsNameValueAction(){
        ;
    }

    /**
     * 下拉框
     * @param auTableCode 表名
     * @param auFieldCode 代码字段名
     * @param auFieldNameCode 名称字段名
     * @param conditions 条件
     * @return Collection 结果集
     * @throws Exception
     */
    public Collection getSelectOptionsNameValue(String auTableCode,String auFieldCode,String auFieldNameCode,
                                                String conditions) throws Exception{
        DBManager dbManager = new DBManager();
        DBSelectOptionsNameValue dbSelectOptionsNameValue = new DBSelectOptionsNameValue(dbManager);
        
        if(conditions.trim().equals("")){
            conditions = "1=1";
        }
        
        Collection collection = new ArrayList();
        Collection selectOptions = new ArrayList();
        try{
            collection = dbSelectOptionsNameValue.getSelectOptionsNameValue(auTableCode,auFieldCode,auFieldNameCode,conditions);
            selectOptions = collection;
        }
        /*
        catch(Exception e){
        }
        */
        finally
        {
            dbManager.close();
        }
        return selectOptions;
    }
}