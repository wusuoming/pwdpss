package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwDcodeDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwDcode-�������������ݷ��ʶ������<br>
 */
public class DBLwDcodeBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwDcodeBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwDcodeBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public void insert(LwDcodeDto lwDcodeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwDcode (");
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
            debugBuffer.append("'").append(lwDcodeDto.getCodeType()).append("',");
            debugBuffer.append("'").append(lwDcodeDto.getCodeCode()).append("',");
            debugBuffer.append("'").append(lwDcodeDto.getCodeCName()).append("',");
            debugBuffer.append("'").append(lwDcodeDto.getCodeEName()).append("',");
            debugBuffer.append("'").append(lwDcodeDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwDcodeDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwDcodeDto.getCodeType());
        dbManager.setString(2,lwDcodeDto.getCodeCode());
        dbManager.setString(3,lwDcodeDto.getCodeCName());
        dbManager.setString(4,lwDcodeDto.getCodeEName());
        dbManager.setString(5,lwDcodeDto.getValidStatus());
        dbManager.setString(6,lwDcodeDto.getFlag());
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
        buffer.append("INSERT INTO LwDcode (");
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
            LwDcodeDto lwDcodeDto = (LwDcodeDto)i.next();
            dbManager.setString(1,lwDcodeDto.getCodeType());
            dbManager.setString(2,lwDcodeDto.getCodeCode());
            dbManager.setString(3,lwDcodeDto.getCodeCName());
            dbManager.setString(4,lwDcodeDto.getCodeEName());
            dbManager.setString(5,lwDcodeDto.getValidStatus());
            dbManager.setString(6,lwDcodeDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param codeType �ӿڴ�������
     * @param codeCode ����
     * @throws Exception
     */
    public void delete(String codeType,String codeCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwDcode ");
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
     * @param lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public void update(LwDcodeDto lwDcodeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwDcode SET ");
        buffer.append("CodeCName = ?, ");
        buffer.append("CodeEName = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwDcode SET ");
            debugBuffer.append("CodeCName = '" + lwDcodeDto.getCodeCName() + "', ");
            debugBuffer.append("CodeEName = '" + lwDcodeDto.getCodeEName() + "', ");
            debugBuffer.append("ValidStatus = '" + lwDcodeDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwDcodeDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("CodeType=").append("'").append(lwDcodeDto.getCodeType()).append("' AND ");
            debugBuffer.append("CodeCode=").append("'").append(lwDcodeDto.getCodeCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CodeType = ? And ");
        buffer.append("CodeCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwDcodeDto.getCodeCName());
        dbManager.setString(2,lwDcodeDto.getCodeEName());
        dbManager.setString(3,lwDcodeDto.getValidStatus());
        dbManager.setString(4,lwDcodeDto.getFlag());
        //���������ֶ�;
        dbManager.setString(5,lwDcodeDto.getCodeType());
        dbManager.setString(6,lwDcodeDto.getCodeCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param codeType �ӿڴ�������
     * @param codeCode ����
     * @return LwDcodeDto
     * @throws Exception
     */
    public LwDcodeDto findByPrimaryKey(String codeType,String codeCode)
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
        buffer.append("FROM LwDcode ");
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
        LwDcodeDto lwDcodeDto = null;
        if(resultSet.next()){
            lwDcodeDto = new LwDcodeDto();
            lwDcodeDto.setCodeType(dbManager.getString(resultSet,1));
            lwDcodeDto.setCodeCode(dbManager.getString(resultSet,2));
            lwDcodeDto.setCodeCName(dbManager.getString(resultSet,3));
            lwDcodeDto.setCodeEName(dbManager.getString(resultSet,4));
            lwDcodeDto.setValidStatus(dbManager.getString(resultSet,5));
            lwDcodeDto.setFlag(dbManager.getString(resultSet,6));
        }
        resultSet.close();
        return lwDcodeDto;
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
        buffer.append("FROM LwDcode WHERE ");
        buffer.append(conditions);
        boolean supportPaging = false;//���ݿ��Ƿ�֧�ַ�ҳ
        if (pageNo > 0){
            //��Oracle�Ż�
            if(dbManager.getConnection().getMetaData().getDatabaseProductName().equalsIgnoreCase("Oracle")){
                buffer.insert(0,"SELECT * FROM ( SELECT row_.*, rownum rownum_ FROM (");
                buffer.append(") row_ WHERE rownum <= "+rowsPerPage * pageNo+") WHERE rownum_ > "+rowsPerPage * (pageNo - 1));
                supportPaging=true;
            }
            else if(dbManager.getConnection().getMetaData().getDatabaseProductName().equalsIgnoreCase("DB2")){
                String sql = buffer.toString();
                buffer.setLength(0);
                buffer.append("select * from ( select rownumber() over(");
                int orderByIndex = sql.toLowerCase().indexOf("order by");
                if ( orderByIndex>0 ) {
                   buffer.append( sql.substring(orderByIndex) );
                }
                buffer.append(") as rownumber_,");
                buffer.append(sql.substring( 6 ));
                buffer.append(" ) as temp_ where rownumber_");
                buffer.append(" between "+ (rowsPerPage * (pageNo - 1) + 1) +" and "+rowsPerPage * pageNo);
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
        LwDcodeDto lwDcodeDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwDcodeDto = new LwDcodeDto();
            lwDcodeDto.setCodeType(dbManager.getString(resultSet,"CodeType"));
            lwDcodeDto.setCodeCode(dbManager.getString(resultSet,"CodeCode"));
            lwDcodeDto.setCodeCName(dbManager.getString(resultSet,"CodeCName"));
            lwDcodeDto.setCodeEName(dbManager.getString(resultSet,"CodeEName"));
            lwDcodeDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwDcodeDto.setFlag(dbManager.getString(resultSet,"Flag"));
            collection.add(lwDcodeDto);
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
        buffer.append("DELETE FROM LwDcode WHERE ");
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
        buffer.append("SELECT count(*) FROM LwDcode WHERE ");
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
