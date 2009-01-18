package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleUserInfo-�����û���Ϣ������ݷ��ʶ������<br>
 */
public class DBLwWholeSaleUserInfoBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwWholeSaleUserInfoBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwWholeSaleUserInfoBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwWholeSaleUserInfoDto lwWholeSaleUserInfoDto
     * @throws Exception
     */
    public void insert(LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwWholeSaleUserInfo (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Voltage,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Company,");
        buffer.append("PhoneNo,");
        buffer.append("Wholesaletype,");
        buffer.append("LineCode,");
        buffer.append("IfCal ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwWholeSaleUserInfoDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwWholeSaleUserInfoDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwWholeSaleUserInfoDto.getVoltage()).append("',");
            debugBuffer.append("'").append(lwWholeSaleUserInfoDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwWholeSaleUserInfoDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwWholeSaleUserInfoDto.getCompany()).append("',");
            debugBuffer.append("'").append(lwWholeSaleUserInfoDto.getPhoneNo()).append("',");
            debugBuffer.append("'").append(lwWholeSaleUserInfoDto.getWholesaletype()).append("',");
            debugBuffer.append("'").append(lwWholeSaleUserInfoDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwWholeSaleUserInfoDto.getIfCal()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwWholeSaleUserInfoDto.getUserNo());
        dbManager.setString(2,lwWholeSaleUserInfoDto.getUserName());
        dbManager.setString(3,lwWholeSaleUserInfoDto.getVoltage());
        dbManager.setString(4,lwWholeSaleUserInfoDto.getValidStatus());
        dbManager.setString(5,lwWholeSaleUserInfoDto.getFlag());
        dbManager.setString(6,lwWholeSaleUserInfoDto.getCompany());
        dbManager.setString(7,lwWholeSaleUserInfoDto.getPhoneNo());
        dbManager.setString(8,lwWholeSaleUserInfoDto.getWholesaletype());
        dbManager.setString(9,lwWholeSaleUserInfoDto.getLineCode());
        dbManager.setString(10,lwWholeSaleUserInfoDto.getIfCal());
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
        buffer.append("INSERT INTO LwWholeSaleUserInfo (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Voltage,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Company,");
        buffer.append("PhoneNo,");
        buffer.append("Wholesaletype,");
        buffer.append("LineCode,");
        buffer.append("IfCal ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = (LwWholeSaleUserInfoDto)i.next();
            dbManager.setString(1,lwWholeSaleUserInfoDto.getUserNo());
            dbManager.setString(2,lwWholeSaleUserInfoDto.getUserName());
            dbManager.setString(3,lwWholeSaleUserInfoDto.getVoltage());
            dbManager.setString(4,lwWholeSaleUserInfoDto.getValidStatus());
            dbManager.setString(5,lwWholeSaleUserInfoDto.getFlag());
            dbManager.setString(6,lwWholeSaleUserInfoDto.getCompany());
            dbManager.setString(7,lwWholeSaleUserInfoDto.getPhoneNo());
            dbManager.setString(8,lwWholeSaleUserInfoDto.getWholesaletype());
            dbManager.setString(9,lwWholeSaleUserInfoDto.getLineCode());
            dbManager.setString(10,lwWholeSaleUserInfoDto.getIfCal());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param userNo ����
     * @throws Exception
     */
    public void delete(String userNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwWholeSaleUserInfo ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,userNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwWholeSaleUserInfoDto lwWholeSaleUserInfoDto
     * @throws Exception
     */
    public void update(LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwWholeSaleUserInfo SET ");
        buffer.append("UserName = ?, ");
        buffer.append("Voltage = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Company = ?, ");
        buffer.append("PhoneNo = ?, ");
        buffer.append("Wholesaletype = ?, ");
        buffer.append("LineCode = ?, ");
        buffer.append("IfCal = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwWholeSaleUserInfo SET ");
            debugBuffer.append("UserName = '" + lwWholeSaleUserInfoDto.getUserName() + "', ");
            debugBuffer.append("Voltage = '" + lwWholeSaleUserInfoDto.getVoltage() + "', ");
            debugBuffer.append("ValidStatus = '" + lwWholeSaleUserInfoDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwWholeSaleUserInfoDto.getFlag() + "', ");
            debugBuffer.append("Company = '" + lwWholeSaleUserInfoDto.getCompany() + "', ");
            debugBuffer.append("PhoneNo = '" + lwWholeSaleUserInfoDto.getPhoneNo() + "', ");
            debugBuffer.append("Wholesaletype = '" + lwWholeSaleUserInfoDto.getWholesaletype() + "', ");
            debugBuffer.append("LineCode = '" + lwWholeSaleUserInfoDto.getLineCode() + "', ");
            debugBuffer.append("IfCal = '" + lwWholeSaleUserInfoDto.getIfCal() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwWholeSaleUserInfoDto.getUserNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwWholeSaleUserInfoDto.getUserName());
        dbManager.setString(2,lwWholeSaleUserInfoDto.getVoltage());
        dbManager.setString(3,lwWholeSaleUserInfoDto.getValidStatus());
        dbManager.setString(4,lwWholeSaleUserInfoDto.getFlag());
        dbManager.setString(5,lwWholeSaleUserInfoDto.getCompany());
        dbManager.setString(6,lwWholeSaleUserInfoDto.getPhoneNo());
        dbManager.setString(7,lwWholeSaleUserInfoDto.getWholesaletype());
        dbManager.setString(8,lwWholeSaleUserInfoDto.getLineCode());
        dbManager.setString(9,lwWholeSaleUserInfoDto.getIfCal());
        //���������ֶ�;
        dbManager.setString(10,lwWholeSaleUserInfoDto.getUserNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param userNo ����
     * @return LwWholeSaleUserInfoDto
     * @throws Exception
     */
    public LwWholeSaleUserInfoDto findByPrimaryKey(String userNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Voltage,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Company,");
        buffer.append("PhoneNo,");
        buffer.append("Wholesaletype,");
        buffer.append("LineCode,");
        buffer.append("IfCal ");
        buffer.append("FROM LwWholeSaleUserInfo ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,userNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = null;
        if(resultSet.next()){
            lwWholeSaleUserInfoDto = new LwWholeSaleUserInfoDto();
            lwWholeSaleUserInfoDto.setUserNo(dbManager.getString(resultSet,1));
            lwWholeSaleUserInfoDto.setUserName(dbManager.getString(resultSet,2));
            lwWholeSaleUserInfoDto.setVoltage(dbManager.getString(resultSet,3));
            lwWholeSaleUserInfoDto.setValidStatus(dbManager.getString(resultSet,4));
            lwWholeSaleUserInfoDto.setFlag(dbManager.getString(resultSet,5));
            lwWholeSaleUserInfoDto.setCompany(dbManager.getString(resultSet,6));
            lwWholeSaleUserInfoDto.setPhoneNo(dbManager.getString(resultSet,7));
            lwWholeSaleUserInfoDto.setWholesaletype(dbManager.getString(resultSet,8));
            lwWholeSaleUserInfoDto.setLineCode(dbManager.getString(resultSet,9));
            lwWholeSaleUserInfoDto.setIfCal(dbManager.getString(resultSet,10));
        }
        resultSet.close();
        return lwWholeSaleUserInfoDto;
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
        buffer.append("Voltage,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Company,");
        buffer.append("PhoneNo,");
        buffer.append("Wholesaletype,");
        buffer.append("LineCode,");
        buffer.append("IfCal ");
        buffer.append("FROM LwWholeSaleUserInfo WHERE ");
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
        LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwWholeSaleUserInfoDto = new LwWholeSaleUserInfoDto();
            lwWholeSaleUserInfoDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwWholeSaleUserInfoDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwWholeSaleUserInfoDto.setVoltage(dbManager.getString(resultSet,"Voltage"));
            lwWholeSaleUserInfoDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwWholeSaleUserInfoDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwWholeSaleUserInfoDto.setCompany(dbManager.getString(resultSet,"Company"));
            lwWholeSaleUserInfoDto.setPhoneNo(dbManager.getString(resultSet,"PhoneNo"));
            lwWholeSaleUserInfoDto.setWholesaletype(dbManager.getString(resultSet,"Wholesaletype"));
            lwWholeSaleUserInfoDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwWholeSaleUserInfoDto.setIfCal(dbManager.getString(resultSet,"IfCal"));
            collection.add(lwWholeSaleUserInfoDto);
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
        buffer.append("DELETE FROM LwWholeSaleUserInfo WHERE ");
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
        buffer.append("SELECT count(*) FROM LwWholeSaleUserInfo WHERE ");
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
