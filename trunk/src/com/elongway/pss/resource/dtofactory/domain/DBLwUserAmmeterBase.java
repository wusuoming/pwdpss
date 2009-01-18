package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWUserAmmeter-�û������ձ�����ݷ��ʶ������<br>
 */
public class DBLwUserAmmeterBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwUserAmmeterBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwUserAmmeterBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public void insert(LwUserAmmeterDto lwUserAmmeterDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwUserAmmeter (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("AmmeterNo,");
        buffer.append("InstallDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwUserAmmeterDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwUserAmmeterDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwUserAmmeterDto.getAmmeterNo()).append("',");
            debugBuffer.append("'").append(lwUserAmmeterDto.getInstallDate()).append("',");
            debugBuffer.append("'").append(lwUserAmmeterDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwUserAmmeterDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwUserAmmeterDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwUserAmmeterDto.getUserNo());
        dbManager.setString(2,lwUserAmmeterDto.getUserName());
        dbManager.setString(3,lwUserAmmeterDto.getAmmeterNo());
        dbManager.setString(4,lwUserAmmeterDto.getInstallDate());
        dbManager.setString(5,lwUserAmmeterDto.getValidStatus());
        dbManager.setString(6,lwUserAmmeterDto.getFlag());
        dbManager.setString(7,lwUserAmmeterDto.getRemark());
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
        buffer.append("INSERT INTO LwUserAmmeter (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("AmmeterNo,");
        buffer.append("InstallDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwUserAmmeterDto lwUserAmmeterDto = (LwUserAmmeterDto)i.next();
            dbManager.setString(1,lwUserAmmeterDto.getUserNo());
            dbManager.setString(2,lwUserAmmeterDto.getUserName());
            dbManager.setString(3,lwUserAmmeterDto.getAmmeterNo());
            dbManager.setString(4,lwUserAmmeterDto.getInstallDate());
            dbManager.setString(5,lwUserAmmeterDto.getValidStatus());
            dbManager.setString(6,lwUserAmmeterDto.getFlag());
            dbManager.setString(7,lwUserAmmeterDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param userNo ����
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(String userNo,String ammeterNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwUserAmmeter ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(ammeterNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,userNo);
        dbManager.setString(2,ammeterNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public void update(LwUserAmmeterDto lwUserAmmeterDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwUserAmmeter SET ");
        buffer.append("UserName = ?, ");
        buffer.append("InstallDate = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwUserAmmeter SET ");
            debugBuffer.append("UserName = '" + lwUserAmmeterDto.getUserName() + "', ");
            debugBuffer.append("InstallDate = '" + lwUserAmmeterDto.getInstallDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwUserAmmeterDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwUserAmmeterDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwUserAmmeterDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwUserAmmeterDto.getUserNo()).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(lwUserAmmeterDto.getAmmeterNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwUserAmmeterDto.getUserName());
        dbManager.setString(2,lwUserAmmeterDto.getInstallDate());
        dbManager.setString(3,lwUserAmmeterDto.getValidStatus());
        dbManager.setString(4,lwUserAmmeterDto.getFlag());
        dbManager.setString(5,lwUserAmmeterDto.getRemark());
        //���������ֶ�;
        dbManager.setString(6,lwUserAmmeterDto.getUserNo());
        dbManager.setString(7,lwUserAmmeterDto.getAmmeterNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param userNo ����
     * @param ammeterNo ���
     * @return LwUserAmmeterDto
     * @throws Exception
     */
    public LwUserAmmeterDto findByPrimaryKey(String userNo,String ammeterNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("AmmeterNo,");
        buffer.append("InstallDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwUserAmmeter ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(ammeterNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,userNo);
        dbManager.setString(2,ammeterNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwUserAmmeterDto lwUserAmmeterDto = null;
        if(resultSet.next()){
            lwUserAmmeterDto = new LwUserAmmeterDto();
            lwUserAmmeterDto.setUserNo(dbManager.getString(resultSet,1));
            lwUserAmmeterDto.setUserName(dbManager.getString(resultSet,2));
            lwUserAmmeterDto.setAmmeterNo(dbManager.getString(resultSet,3));
            lwUserAmmeterDto.setInstallDate(dbManager.getString(resultSet,4));
            lwUserAmmeterDto.setValidStatus(dbManager.getString(resultSet,5));
            lwUserAmmeterDto.setFlag(dbManager.getString(resultSet,6));
            lwUserAmmeterDto.setRemark(dbManager.getString(resultSet,7));
        }
        resultSet.close();
        return lwUserAmmeterDto;
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
        buffer.append("AmmeterNo,");
        buffer.append("InstallDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwUserAmmeter WHERE ");
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
        LwUserAmmeterDto lwUserAmmeterDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwUserAmmeterDto = new LwUserAmmeterDto();
            lwUserAmmeterDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwUserAmmeterDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwUserAmmeterDto.setAmmeterNo(dbManager.getString(resultSet,"AmmeterNo"));
            lwUserAmmeterDto.setInstallDate(dbManager.getString(resultSet,"InstallDate"));
            lwUserAmmeterDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwUserAmmeterDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwUserAmmeterDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwUserAmmeterDto);
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
        buffer.append("DELETE FROM LwUserAmmeter WHERE ");
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
        buffer.append("SELECT count(*) FROM LwUserAmmeter WHERE ");
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
