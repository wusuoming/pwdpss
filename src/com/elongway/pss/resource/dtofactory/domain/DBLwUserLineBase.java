package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserLineDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWUserLine-�û���·���ձ�����ݷ��ʶ������<br>
 */
public class DBLwUserLineBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwUserLineBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwUserLineBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public void insert(LwUserLineDto lwUserLineDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwUserLine (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("LineCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwUserLineDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwUserLineDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwUserLineDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwUserLineDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwUserLineDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwUserLineDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwUserLineDto.getUserNo());
        dbManager.setString(2,lwUserLineDto.getUserName());
        dbManager.setString(3,lwUserLineDto.getLineCode());
        dbManager.setString(4,lwUserLineDto.getValidStatus());
        dbManager.setString(5,lwUserLineDto.getFlag());
        dbManager.setString(6,lwUserLineDto.getRemark());
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
        buffer.append("INSERT INTO LwUserLine (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("LineCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwUserLineDto lwUserLineDto = (LwUserLineDto)i.next();
            dbManager.setString(1,lwUserLineDto.getUserNo());
            dbManager.setString(2,lwUserLineDto.getUserName());
            dbManager.setString(3,lwUserLineDto.getLineCode());
            dbManager.setString(4,lwUserLineDto.getValidStatus());
            dbManager.setString(5,lwUserLineDto.getFlag());
            dbManager.setString(6,lwUserLineDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param userNo ����
     * @param lineCode ��·����
     * @throws Exception
     */
    public void delete(String userNo,String lineCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwUserLine ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("LineCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,userNo);
        dbManager.setString(2,lineCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public void update(LwUserLineDto lwUserLineDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwUserLine SET ");
        buffer.append("UserName = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwUserLine SET ");
            debugBuffer.append("UserName = '" + lwUserLineDto.getUserName() + "', ");
            debugBuffer.append("ValidStatus = '" + lwUserLineDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwUserLineDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwUserLineDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwUserLineDto.getUserNo()).append("' AND ");
            debugBuffer.append("LineCode=").append("'").append(lwUserLineDto.getLineCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("LineCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwUserLineDto.getUserName());
        dbManager.setString(2,lwUserLineDto.getValidStatus());
        dbManager.setString(3,lwUserLineDto.getFlag());
        dbManager.setString(4,lwUserLineDto.getRemark());
        //���������ֶ�;
        dbManager.setString(5,lwUserLineDto.getUserNo());
        dbManager.setString(6,lwUserLineDto.getLineCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param userNo ����
     * @param lineCode ��·����
     * @return LwUserLineDto
     * @throws Exception
     */
    public LwUserLineDto findByPrimaryKey(String userNo,String lineCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("LineCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwUserLine ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("LineCode = ?");
        System.out.println(buffer.toString());
        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,userNo);
        dbManager.setString(2,lineCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwUserLineDto lwUserLineDto = null;
        if(resultSet.next()){
            lwUserLineDto = new LwUserLineDto();
            lwUserLineDto.setUserNo(dbManager.getString(resultSet,1));
            lwUserLineDto.setUserName(dbManager.getString(resultSet,2));
            lwUserLineDto.setLineCode(dbManager.getString(resultSet,3));
            lwUserLineDto.setValidStatus(dbManager.getString(resultSet,4));
            lwUserLineDto.setFlag(dbManager.getString(resultSet,5));
            lwUserLineDto.setRemark(dbManager.getString(resultSet,6));
        }
        resultSet.close();
        return lwUserLineDto;
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
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("LineCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwUserLine WHERE ");
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
        LwUserLineDto lwUserLineDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwUserLineDto = new LwUserLineDto();
            lwUserLineDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwUserLineDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwUserLineDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwUserLineDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwUserLineDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwUserLineDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwUserLineDto);
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
        buffer.append("DELETE FROM LwUserLine WHERE ");
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
        buffer.append("SELECT count(*) FROM LwUserLine WHERE ");
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
