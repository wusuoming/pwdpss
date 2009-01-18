package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerUserDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerUser-�õ��û���Ϣ������ݷ��ʶ������<br>
 */
public class DBLwPowerUserBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwPowerUserBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwPowerUserBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public void insert(LwPowerUserDto lwPowerUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwPowerUser (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Address,");
        buffer.append("TownCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("SuperClass,");
        buffer.append("FactoryStyle,");
        buffer.append("WholeSaleStyle,");
        buffer.append("SaleVoltLevel,");
        buffer.append("LineCode ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwPowerUserDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwPowerUserDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwPowerUserDto.getAddress()).append("',");
            debugBuffer.append("'").append(lwPowerUserDto.getTownCode()).append("',");
            debugBuffer.append("'").append(lwPowerUserDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwPowerUserDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwPowerUserDto.getSuperClass()).append("',");
            debugBuffer.append("'").append(lwPowerUserDto.getFactoryStyle()).append("',");
            debugBuffer.append("'").append(lwPowerUserDto.getWholeSaleStyle()).append("',");
            debugBuffer.append("'").append(lwPowerUserDto.getSaleVoltLevel()).append("',");
            debugBuffer.append("'").append(lwPowerUserDto.getLineCode()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwPowerUserDto.getUserNo());
        dbManager.setString(2,lwPowerUserDto.getUserName());
        dbManager.setString(3,lwPowerUserDto.getAddress());
        dbManager.setString(4,lwPowerUserDto.getTownCode());
        dbManager.setString(5,lwPowerUserDto.getValidStatus());
        dbManager.setString(6,lwPowerUserDto.getFlag());
        dbManager.setString(7,lwPowerUserDto.getSuperClass());
        dbManager.setString(8,lwPowerUserDto.getFactoryStyle());
        dbManager.setString(9,lwPowerUserDto.getWholeSaleStyle());
        dbManager.setString(10,lwPowerUserDto.getSaleVoltLevel());
        dbManager.setString(11,lwPowerUserDto.getLineCode());
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
        buffer.append("INSERT INTO LwPowerUser (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Address,");
        buffer.append("TownCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("SuperClass,");
        buffer.append("FactoryStyle,");
        buffer.append("WholeSaleStyle,");
        buffer.append("SaleVoltLevel,");
        buffer.append("LineCode ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwPowerUserDto lwPowerUserDto = (LwPowerUserDto)i.next();
            dbManager.setString(1,lwPowerUserDto.getUserNo());
            dbManager.setString(2,lwPowerUserDto.getUserName());
            dbManager.setString(3,lwPowerUserDto.getAddress());
            dbManager.setString(4,lwPowerUserDto.getTownCode());
            dbManager.setString(5,lwPowerUserDto.getValidStatus());
            dbManager.setString(6,lwPowerUserDto.getFlag());
            dbManager.setString(7,lwPowerUserDto.getSuperClass());
            dbManager.setString(8,lwPowerUserDto.getFactoryStyle());
            dbManager.setString(9,lwPowerUserDto.getWholeSaleStyle());
            dbManager.setString(10,lwPowerUserDto.getSaleVoltLevel());
            dbManager.setString(11,lwPowerUserDto.getLineCode());
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
        buffer.append("DELETE FROM LwPowerUser ");
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
     * @param lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public void update(LwPowerUserDto lwPowerUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwPowerUser SET ");
        buffer.append("UserName = ?, ");
        buffer.append("Address = ?, ");
        buffer.append("TownCode = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("SuperClass = ?, ");
        buffer.append("FactoryStyle = ?, ");
        buffer.append("WholeSaleStyle = ?, ");
        buffer.append("SaleVoltLevel = ?, ");
        buffer.append("LineCode = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwPowerUser SET ");
            debugBuffer.append("UserName = '" + lwPowerUserDto.getUserName() + "', ");
            debugBuffer.append("Address = '" + lwPowerUserDto.getAddress() + "', ");
            debugBuffer.append("TownCode = '" + lwPowerUserDto.getTownCode() + "', ");
            debugBuffer.append("ValidStatus = '" + lwPowerUserDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwPowerUserDto.getFlag() + "', ");
            debugBuffer.append("SuperClass = '" + lwPowerUserDto.getSuperClass() + "', ");
            debugBuffer.append("FactoryStyle = '" + lwPowerUserDto.getFactoryStyle() + "', ");
            debugBuffer.append("WholeSaleStyle = '" + lwPowerUserDto.getWholeSaleStyle() + "', ");
            debugBuffer.append("SaleVoltLevel = '" + lwPowerUserDto.getSaleVoltLevel() + "', ");
            debugBuffer.append("LineCode = '" + lwPowerUserDto.getLineCode() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwPowerUserDto.getUserNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwPowerUserDto.getUserName());
        dbManager.setString(2,lwPowerUserDto.getAddress());
        dbManager.setString(3,lwPowerUserDto.getTownCode());
        dbManager.setString(4,lwPowerUserDto.getValidStatus());
        dbManager.setString(5,lwPowerUserDto.getFlag());
        dbManager.setString(6,lwPowerUserDto.getSuperClass());
        dbManager.setString(7,lwPowerUserDto.getFactoryStyle());
        dbManager.setString(8,lwPowerUserDto.getWholeSaleStyle());
        dbManager.setString(9,lwPowerUserDto.getSaleVoltLevel());
        dbManager.setString(10,lwPowerUserDto.getLineCode());
        //���������ֶ�;
        dbManager.setString(11,lwPowerUserDto.getUserNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param userNo ����
     * @return LwPowerUserDto
     * @throws Exception
     */
    public LwPowerUserDto findByPrimaryKey(String userNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Address,");
        buffer.append("TownCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("SuperClass,");
        buffer.append("FactoryStyle,");
        buffer.append("WholeSaleStyle,");
        buffer.append("SaleVoltLevel,");
        buffer.append("LineCode ");
        buffer.append("FROM LwPowerUser ");
        if(true){
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
        LwPowerUserDto lwPowerUserDto = null;
        if(resultSet.next()){
            lwPowerUserDto = new LwPowerUserDto();
            lwPowerUserDto.setUserNo(dbManager.getString(resultSet,1));
            lwPowerUserDto.setUserName(dbManager.getString(resultSet,2));
            lwPowerUserDto.setAddress(dbManager.getString(resultSet,3));
            lwPowerUserDto.setTownCode(dbManager.getString(resultSet,4));
            lwPowerUserDto.setValidStatus(dbManager.getString(resultSet,5));
            lwPowerUserDto.setFlag(dbManager.getString(resultSet,6));
            lwPowerUserDto.setSuperClass(dbManager.getString(resultSet,7));
            lwPowerUserDto.setFactoryStyle(dbManager.getString(resultSet,8));
            lwPowerUserDto.setWholeSaleStyle(dbManager.getString(resultSet,9));
            lwPowerUserDto.setSaleVoltLevel(dbManager.getString(resultSet,10));
            lwPowerUserDto.setLineCode(dbManager.getString(resultSet,11));
        }
        resultSet.close();
        return lwPowerUserDto;
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
        buffer.append("Address,");
        buffer.append("TownCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("SuperClass,");
        buffer.append("FactoryStyle,");
        buffer.append("WholeSaleStyle,");
        buffer.append("SaleVoltLevel,");
        buffer.append("LineCode ");
        buffer.append("FROM LwPowerUser WHERE ");
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
        if(true){
            logger.debug(buffer.toString());
        }
        ResultSet resultSet = dbManager.executeQuery(buffer.toString());
        int count=0;
        if(supportPaging==false && pageNo>1){
            dbManager.locate(resultSet,rowsPerPage * (pageNo - 1));
        }

        //���巵�ؽ������
        Collection collection = new ArrayList(rowsPerPage);
        LwPowerUserDto lwPowerUserDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwPowerUserDto = new LwPowerUserDto();
            lwPowerUserDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwPowerUserDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwPowerUserDto.setAddress(dbManager.getString(resultSet,"Address"));
            lwPowerUserDto.setTownCode(dbManager.getString(resultSet,"TownCode"));
            lwPowerUserDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwPowerUserDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwPowerUserDto.setSuperClass(dbManager.getString(resultSet,"SuperClass"));
            lwPowerUserDto.setFactoryStyle(dbManager.getString(resultSet,"FactoryStyle"));
            lwPowerUserDto.setWholeSaleStyle(dbManager.getString(resultSet,"WholeSaleStyle"));
            lwPowerUserDto.setSaleVoltLevel(dbManager.getString(resultSet,"SaleVoltLevel"));
            lwPowerUserDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            collection.add(lwPowerUserDto);
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
        buffer.append("DELETE FROM LwPowerUser WHERE ");
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
        buffer.append("SELECT count(*) FROM LwPowerUser WHERE ");
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
