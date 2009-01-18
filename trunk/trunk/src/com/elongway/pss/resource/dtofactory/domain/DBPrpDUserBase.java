package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.PrpDUserDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWDUser-����Ա���������ݷ��ʶ������<br>
 */
public class DBPrpDUserBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBPrpDUserBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBPrpDUserBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param prpDUserDto prpDUserDto
     * @throws Exception
     */
    public void insert(PrpDUserDto prpDUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO PrpDUser (");
        buffer.append("OperatorCode,");
        buffer.append("Password,");
        buffer.append("ComCode,");
        buffer.append("CustomerCName,");
        buffer.append("CustomerEName,");
        buffer.append("IdentifyType,");
        buffer.append("IdentifyNumber,");
        buffer.append("Sex,");
        buffer.append("Age,");
        buffer.append("PhoneNumber,");
        buffer.append("FaxNumber,");
        buffer.append("Mobile,");
        buffer.append("Email,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(prpDUserDto.getOperatorCode()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getPassword()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getComCode()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getCustomerCName()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getCustomerEName()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getIdentifyType()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getIdentifyNumber()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getSex()).append("',");
            debugBuffer.append("").append(prpDUserDto.getAge()).append(",");
            debugBuffer.append("'").append(prpDUserDto.getPhoneNumber()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getFaxNumber()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getMobile()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getEmail()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getFlag()).append("',");
            debugBuffer.append("'").append(prpDUserDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,prpDUserDto.getOperatorCode());
        dbManager.setString(2,prpDUserDto.getPassword());
        dbManager.setString(3,prpDUserDto.getComCode());
        dbManager.setString(4,prpDUserDto.getCustomerCName());
        dbManager.setString(5,prpDUserDto.getCustomerEName());
        dbManager.setString(6,prpDUserDto.getIdentifyType());
        dbManager.setString(7,prpDUserDto.getIdentifyNumber());
        dbManager.setString(8,prpDUserDto.getSex());
        dbManager.setLong(9,prpDUserDto.getAge());
        dbManager.setString(10,prpDUserDto.getPhoneNumber());
        dbManager.setString(11,prpDUserDto.getFaxNumber());
        dbManager.setString(12,prpDUserDto.getMobile());
        dbManager.setString(13,prpDUserDto.getEmail());
        dbManager.setString(14,prpDUserDto.getValidStatus());
        dbManager.setString(15,prpDUserDto.getFlag());
        dbManager.setString(16,prpDUserDto.getRemark());
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
        buffer.append("INSERT INTO PrpDUser (");
        buffer.append("OperatorCode,");
        buffer.append("Password,");
        buffer.append("ComCode,");
        buffer.append("CustomerCName,");
        buffer.append("CustomerEName,");
        buffer.append("IdentifyType,");
        buffer.append("IdentifyNumber,");
        buffer.append("Sex,");
        buffer.append("Age,");
        buffer.append("PhoneNumber,");
        buffer.append("FaxNumber,");
        buffer.append("Mobile,");
        buffer.append("Email,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            PrpDUserDto prpDUserDto = (PrpDUserDto)i.next();
            dbManager.setString(1,prpDUserDto.getOperatorCode());
            dbManager.setString(2,prpDUserDto.getPassword());
            dbManager.setString(3,prpDUserDto.getComCode());
            dbManager.setString(4,prpDUserDto.getCustomerCName());
            dbManager.setString(5,prpDUserDto.getCustomerEName());
            dbManager.setString(6,prpDUserDto.getIdentifyType());
            dbManager.setString(7,prpDUserDto.getIdentifyNumber());
            dbManager.setString(8,prpDUserDto.getSex());
            dbManager.setLong(9,prpDUserDto.getAge());
            dbManager.setString(10,prpDUserDto.getPhoneNumber());
            dbManager.setString(11,prpDUserDto.getFaxNumber());
            dbManager.setString(12,prpDUserDto.getMobile());
            dbManager.setString(13,prpDUserDto.getEmail());
            dbManager.setString(14,prpDUserDto.getValidStatus());
            dbManager.setString(15,prpDUserDto.getFlag());
            dbManager.setString(16,prpDUserDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param operatorCode ����Ա����
     * @throws Exception
     */
    public void delete(String operatorCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM PrpDUser ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("OperatorCode=").append("'").append(operatorCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("OperatorCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,operatorCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param prpDUserDto prpDUserDto
     * @throws Exception
     */
    public void update(PrpDUserDto prpDUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE PrpDUser SET ");
        buffer.append("Password = ?, ");
        buffer.append("ComCode = ?, ");
        buffer.append("CustomerCName = ?, ");
        buffer.append("CustomerEName = ?, ");
        buffer.append("IdentifyType = ?, ");
        buffer.append("IdentifyNumber = ?, ");
        buffer.append("Sex = ?, ");
        buffer.append("Age = ?, ");
        buffer.append("PhoneNumber = ?, ");
        buffer.append("FaxNumber = ?, ");
        buffer.append("Mobile = ?, ");
        buffer.append("Email = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE PrpDUser SET ");
            debugBuffer.append("Password = '" + prpDUserDto.getPassword() + "', ");
            debugBuffer.append("ComCode = '" + prpDUserDto.getComCode() + "', ");
            debugBuffer.append("CustomerCName = '" + prpDUserDto.getCustomerCName() + "', ");
            debugBuffer.append("CustomerEName = '" + prpDUserDto.getCustomerEName() + "', ");
            debugBuffer.append("IdentifyType = '" + prpDUserDto.getIdentifyType() + "', ");
            debugBuffer.append("IdentifyNumber = '" + prpDUserDto.getIdentifyNumber() + "', ");
            debugBuffer.append("Sex = '" + prpDUserDto.getSex() + "', ");
            debugBuffer.append("Age = " + prpDUserDto.getAge() + ", ");
            debugBuffer.append("PhoneNumber = '" + prpDUserDto.getPhoneNumber() + "', ");
            debugBuffer.append("FaxNumber = '" + prpDUserDto.getFaxNumber() + "', ");
            debugBuffer.append("Mobile = '" + prpDUserDto.getMobile() + "', ");
            debugBuffer.append("Email = '" + prpDUserDto.getEmail() + "', ");
            debugBuffer.append("ValidStatus = '" + prpDUserDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + prpDUserDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + prpDUserDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("OperatorCode=").append("'").append(prpDUserDto.getOperatorCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("OperatorCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,prpDUserDto.getPassword());
        dbManager.setString(2,prpDUserDto.getComCode());
        dbManager.setString(3,prpDUserDto.getCustomerCName());
        dbManager.setString(4,prpDUserDto.getCustomerEName());
        dbManager.setString(5,prpDUserDto.getIdentifyType());
        dbManager.setString(6,prpDUserDto.getIdentifyNumber());
        dbManager.setString(7,prpDUserDto.getSex());
        dbManager.setLong(8,prpDUserDto.getAge());
        dbManager.setString(9,prpDUserDto.getPhoneNumber());
        dbManager.setString(10,prpDUserDto.getFaxNumber());
        dbManager.setString(11,prpDUserDto.getMobile());
        dbManager.setString(12,prpDUserDto.getEmail());
        dbManager.setString(13,prpDUserDto.getValidStatus());
        dbManager.setString(14,prpDUserDto.getFlag());
        dbManager.setString(15,prpDUserDto.getRemark());
        //���������ֶ�;
        dbManager.setString(16,prpDUserDto.getOperatorCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param operatorCode ����Ա����
     * @return PrpDUserDto
     * @throws Exception
     */
    public PrpDUserDto findByPrimaryKey(String operatorCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("OperatorCode,");
        buffer.append("Password,");
        buffer.append("ComCode,");
        buffer.append("CustomerCName,");
        buffer.append("CustomerEName,");
        buffer.append("IdentifyType,");
        buffer.append("IdentifyNumber,");
        buffer.append("Sex,");
        buffer.append("Age,");
        buffer.append("PhoneNumber,");
        buffer.append("FaxNumber,");
        buffer.append("Mobile,");
        buffer.append("Email,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM PrpDUser ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("OperatorCode=").append("'").append(operatorCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("OperatorCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,operatorCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        PrpDUserDto prpDUserDto = null;
        if(resultSet.next()){
            prpDUserDto = new PrpDUserDto();
            prpDUserDto.setOperatorCode(dbManager.getString(resultSet,1));
            prpDUserDto.setPassword(dbManager.getString(resultSet,2));
            prpDUserDto.setComCode(dbManager.getString(resultSet,3));
            prpDUserDto.setCustomerCName(dbManager.getString(resultSet,4));
            prpDUserDto.setCustomerEName(dbManager.getString(resultSet,5));
            prpDUserDto.setIdentifyType(dbManager.getString(resultSet,6));
            prpDUserDto.setIdentifyNumber(dbManager.getString(resultSet,7));
            prpDUserDto.setSex(dbManager.getString(resultSet,8));
            prpDUserDto.setAge(dbManager.getLong(resultSet,9));
            prpDUserDto.setPhoneNumber(dbManager.getString(resultSet,10));
            prpDUserDto.setFaxNumber(dbManager.getString(resultSet,11));
            prpDUserDto.setMobile(dbManager.getString(resultSet,12));
            prpDUserDto.setEmail(dbManager.getString(resultSet,13));
            prpDUserDto.setValidStatus(dbManager.getString(resultSet,14));
            prpDUserDto.setFlag(dbManager.getString(resultSet,15));
            prpDUserDto.setRemark(dbManager.getString(resultSet,16));
        }
        resultSet.close();
        return prpDUserDto;
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
        buffer.append("OperatorCode,");
        buffer.append("Password,");
        buffer.append("ComCode,");
        buffer.append("CustomerCName,");
        buffer.append("CustomerEName,");
        buffer.append("IdentifyType,");
        buffer.append("IdentifyNumber,");
        buffer.append("Sex,");
        buffer.append("Age,");
        buffer.append("PhoneNumber,");
        buffer.append("FaxNumber,");
        buffer.append("Mobile,");
        buffer.append("Email,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM PrpDUser WHERE ");
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
        PrpDUserDto prpDUserDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            prpDUserDto = new PrpDUserDto();
            prpDUserDto.setOperatorCode(dbManager.getString(resultSet,"OperatorCode"));
            prpDUserDto.setPassword(dbManager.getString(resultSet,"Password"));
            prpDUserDto.setComCode(dbManager.getString(resultSet,"ComCode"));
            prpDUserDto.setCustomerCName(dbManager.getString(resultSet,"CustomerCName"));
            prpDUserDto.setCustomerEName(dbManager.getString(resultSet,"CustomerEName"));
            prpDUserDto.setIdentifyType(dbManager.getString(resultSet,"IdentifyType"));
            prpDUserDto.setIdentifyNumber(dbManager.getString(resultSet,"IdentifyNumber"));
            prpDUserDto.setSex(dbManager.getString(resultSet,"Sex"));
            prpDUserDto.setAge(dbManager.getLong(resultSet,"Age"));
            prpDUserDto.setPhoneNumber(dbManager.getString(resultSet,"PhoneNumber"));
            prpDUserDto.setFaxNumber(dbManager.getString(resultSet,"FaxNumber"));
            prpDUserDto.setMobile(dbManager.getString(resultSet,"Mobile"));
            prpDUserDto.setEmail(dbManager.getString(resultSet,"Email"));
            prpDUserDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            prpDUserDto.setFlag(dbManager.getString(resultSet,"Flag"));
            prpDUserDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(prpDUserDto);
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
        buffer.append("DELETE FROM PrpDUser WHERE ");
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
        buffer.append("SELECT count(*) FROM PrpDUser WHERE ");
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
