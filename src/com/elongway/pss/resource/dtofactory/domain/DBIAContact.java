package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IAContactDto;

/**
 * 这是IAContact的数据访问对象类<br>
 * 创建于 2006-09-08 15:52:31.676<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIAContact extends DBIAContactBase{
    private static Logger logger = Logger.getLogger(DBIAContact.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBIAContact(DBManager dbManager){
        super(dbManager);
    }
    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void updateStatus(IAContactDto iAContactDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE IAContact SET ");       
        buffer.append("Status = ? ");       
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE IAContact SET ");          
            debugBuffer.append("Status = '" + iAContactDto.getStatus() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("ContactNo=").append("'").append(iAContactDto.getContactNo()).append("'");
            logger.debug(debugBuffer.toString());
        }
        buffer.append("WHERE ");
        buffer.append("ContactNo = ?");
        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;       
        dbManager.setString(1,iAContactDto.getStatus());       
        //设置条件字段;
        dbManager.setString(2,iAContactDto.getContactNo());
        dbManager.executePreparedUpdate();        
    }
}
