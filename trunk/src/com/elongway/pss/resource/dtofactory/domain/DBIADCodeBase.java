package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCodeDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADCode�����ݷ��ʶ������<br>
 * ������ 2006-09-08 15:52:39.037<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADCodeBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBIADCodeBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBIADCodeBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param iADCodeDto iADCodeDto
     * @throws Exception
     */
    public void insert(IADCodeDto iADCodeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO IADCode (");
        buffer.append("CodeType,");
        buffer.append("CodeCode,");
        buffer.append("CodeCName,");
        buffer.append("CodeEName,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(iADCodeDto.getCodeType()).append("',");
            debugBuffer.append("'").append(iADCodeDto.getCodeCode()).append("',");
            debugBuffer.append("'").append(iADCodeDto.getCodeCName()).append("',");
            debugBuffer.append("'").append(iADCodeDto.getCodeEName()).append("',");
            debugBuffer.append("'").append(iADCodeDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(iADCodeDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,iADCodeDto.getCodeType());
        dbManager.setString(2,iADCodeDto.getCodeCode());
        dbManager.setString(3,iADCodeDto.getCodeCName());
        dbManager.setString(4,iADCodeDto.getCodeEName());
        dbManager.setString(5,iADCodeDto.getValidStatus());
        dbManager.setString(6,iADCodeDto.getFlag());
        dbManager.executePreparedUpdate();

    }

    /**
     * ��������ʽ�����������
     * @param collection collection
     * @throws Exception
     */
    public void insertAll(Collection collection)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO IADCode (");
        buffer.append("CodeType,");
        buffer.append("CodeCode,");
        buffer.append("CodeCName,");
        buffer.append("CodeEName,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            IADCodeDto iADCodeDto = (IADCodeDto)i.next();
            dbManager.setString(1,iADCodeDto.getCodeType());
            dbManager.setString(2,iADCodeDto.getCodeCode());
            dbManager.setString(3,iADCodeDto.getCodeCName());
            dbManager.setString(4,iADCodeDto.getCodeEName());
            dbManager.setString(5,iADCodeDto.getValidStatus());
            dbManager.setString(6,iADCodeDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param codeType CodeType
     * @param codeCode CodeCode
     * @throws Exception
     */
    public void delete(String codeType,String codeCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM IADCode ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("CodeType=").append("'").append(codeType).append("' AND ");
            debugBuffer.append("CodeCode=").append("'").append(codeCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CodeType = ? And ");
        buffer.append("CodeCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,codeType);
        dbManager.setString(2,codeCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param iADCodeDto iADCodeDto
     * @throws Exception
     */
    public void update(IADCodeDto iADCodeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE IADCode SET ");
        buffer.append("CodeCName = ?, ");
        buffer.append("CodeEName = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE IADCode SET ");
            debugBuffer.append("CodeCName = '" + iADCodeDto.getCodeCName() + "', ");
            debugBuffer.append("CodeEName = '" + iADCodeDto.getCodeEName() + "', ");
            debugBuffer.append("ValidStatus = '" + iADCodeDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + iADCodeDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("CodeType=").append("'").append(iADCodeDto.getCodeType()).append("' AND ");
            debugBuffer.append("CodeCode=").append("'").append(iADCodeDto.getCodeCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CodeType = ? And ");
        buffer.append("CodeCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,iADCodeDto.getCodeCName());
        dbManager.setString(2,iADCodeDto.getCodeEName());
        dbManager.setString(3,iADCodeDto.getValidStatus());
        dbManager.setString(4,iADCodeDto.getFlag());
        //���������ֶ�;
        dbManager.setString(5,iADCodeDto.getCodeType());
        dbManager.setString(6,iADCodeDto.getCodeCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param codeType CodeType
     * @param codeCode CodeCode
     * @return IADCodeDto
     * @throws Exception
     */
    public IADCodeDto findByPrimaryKey(String codeType,String codeCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("CodeType,");
        buffer.append("CodeCode,");
        buffer.append("CodeCName,");
        buffer.append("CodeEName,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM IADCode ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("CodeType=").append("'").append(codeType).append("' AND ");
            debugBuffer.append("CodeCode=").append("'").append(codeCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CodeType = ? And ");
        buffer.append("CodeCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,codeType);
        dbManager.setString(2,codeCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        IADCodeDto iADCodeDto = null;
        if(resultSet.next()){
            iADCodeDto = new IADCodeDto();
            iADCodeDto.setCodeType(dbManager.getString(resultSet,1));
            iADCodeDto.setCodeCode(dbManager.getString(resultSet,2));
            iADCodeDto.setCodeCName(dbManager.getString(resultSet,3));
            iADCodeDto.setCodeEName(dbManager.getString(resultSet,4));
            iADCodeDto.setValidStatus(dbManager.getString(resultSet,5));
            iADCodeDto.setFlag(dbManager.getString(resultSet,6));
        }
        resultSet.close();
        return iADCodeDto;
    }

    /**
     * ��������ѯ��������
     * @param conditions ��ѯ����
     * @param pageNo ҳ��
     * @param rowsPerPage ÿҳ������
     * @return Collection
     * @throws Exception
     */
    public Collection findByConditions(String conditions,int pageNo,int rowsPerPage)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("CodeType,");
        buffer.append("CodeCode,");
        buffer.append("CodeCName,");
        buffer.append("CodeEName,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM IADCode WHERE ");
        buffer.append(conditions);
        boolean supportPaging = false;//���ݿ��Ƿ�֧�ַ�ҳ
        if (pageNo > 0){
            //Ŀǰֻ��Oracle�Ż�
            if(dbManager.getConnection().getMetaData().getDatabaseProductName().equalsIgnoreCase("Oracle")){
                buffer.insert(0,"SELECT * FROM ( SELECT row_.*, rownum rownum_ FROM (");
                buffer.append(") row_ WHERE rownum <= "+rowsPerPage * pageNo+") WHERE rownum_ > "+rowsPerPage * (pageNo - 1));
                supportPaging=true;
            }
        }
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        ResultSet resultSet = dbManager.executeQuery(buffer.toString());
        int count=0;
        if(supportPaging==false && pageNo>1){
            dbManager.locate(resultSet,rowsPerPage * (pageNo - 1));
        }

        //���巵�ؽ������
        Collection collection = new ArrayList(rowsPerPage);
        IADCodeDto iADCodeDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            iADCodeDto = new IADCodeDto();
            iADCodeDto.setCodeType(dbManager.getString(resultSet,1));
            iADCodeDto.setCodeCode(dbManager.getString(resultSet,2));
            iADCodeDto.setCodeCName(dbManager.getString(resultSet,3));
            iADCodeDto.setCodeEName(dbManager.getString(resultSet,4));
            iADCodeDto.setValidStatus(dbManager.getString(resultSet,5));
            iADCodeDto.setFlag(dbManager.getString(resultSet,6));
            collection.add(iADCodeDto);
        }
        resultSet.close();
        return collection;
    }

    /**
     * ��������ѯ��������
     * @param conditions ��ѯ����
     * @return Collection
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
            throws Exception{
        return findByConditions(conditions,0,0);
    }

    /**
     * ������ɾ������
     * @param conditions ��ѯ����
     * @return ɾ��������
     * @throws Exception
     */
    public int deleteByConditions(String conditions)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM IADCode WHERE ");
        buffer.append(conditions);
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        int count = dbManager.executeUpdate(buffer.toString());
        return count;
    }

    /**
     * ��ѯ����ģ����ѯ�����ļ�¼��
     * @param conditions conditions
     * @return ����ģ����ѯ�����ļ�¼��
     * @throws Exception
     */
    public int getCount(String conditions) 
        throws Exception{
        int count = -1;
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("SELECT count(*) FROM IADCode WHERE ");
        buffer.append(conditions);
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        ResultSet resultSet = dbManager.executeQuery(buffer.toString());
        resultSet.next();
        count = dbManager.getInt(resultSet,1);
        resultSet.close();
        return count;
    }
}
