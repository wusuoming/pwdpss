package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.PrpDcompanyDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWDcompany-�������������ݷ��ʶ������<br>
 */
public class DBPrpDcompanyBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBPrpDcompanyBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBPrpDcompanyBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param prpDcompanyDto prpDcompanyDto
     * @throws Exception
     */
    public void insert(PrpDcompanyDto prpDcompanyDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO PrpDcompany (");
        buffer.append("ComCode,");
        buffer.append("ComCName,");
        buffer.append("ComEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("PhoneNumber,");
        buffer.append("TaxNumber,");
        buffer.append("UpperComCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(prpDcompanyDto.getComCode()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getComCName()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getComEName()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getAddressCName()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getAddressEName()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getPostCode()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getPhoneNumber()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getTaxNumber()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getUpperComCode()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getFlag()).append("',");
            debugBuffer.append("'").append(prpDcompanyDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,prpDcompanyDto.getComCode());
        dbManager.setString(2,prpDcompanyDto.getComCName());
        dbManager.setString(3,prpDcompanyDto.getComEName());
        dbManager.setString(4,prpDcompanyDto.getAddressCName());
        dbManager.setString(5,prpDcompanyDto.getAddressEName());
        dbManager.setString(6,prpDcompanyDto.getPostCode());
        dbManager.setString(7,prpDcompanyDto.getPhoneNumber());
        dbManager.setString(8,prpDcompanyDto.getTaxNumber());
        dbManager.setString(9,prpDcompanyDto.getUpperComCode());
        dbManager.setString(10,prpDcompanyDto.getValidStatus());
        dbManager.setString(11,prpDcompanyDto.getFlag());
        dbManager.setString(12,prpDcompanyDto.getRemark());
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
        buffer.append("INSERT INTO PrpDcompany (");
        buffer.append("ComCode,");
        buffer.append("ComCName,");
        buffer.append("ComEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("PhoneNumber,");
        buffer.append("TaxNumber,");
        buffer.append("UpperComCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            PrpDcompanyDto prpDcompanyDto = (PrpDcompanyDto)i.next();
            dbManager.setString(1,prpDcompanyDto.getComCode());
            dbManager.setString(2,prpDcompanyDto.getComCName());
            dbManager.setString(3,prpDcompanyDto.getComEName());
            dbManager.setString(4,prpDcompanyDto.getAddressCName());
            dbManager.setString(5,prpDcompanyDto.getAddressEName());
            dbManager.setString(6,prpDcompanyDto.getPostCode());
            dbManager.setString(7,prpDcompanyDto.getPhoneNumber());
            dbManager.setString(8,prpDcompanyDto.getTaxNumber());
            dbManager.setString(9,prpDcompanyDto.getUpperComCode());
            dbManager.setString(10,prpDcompanyDto.getValidStatus());
            dbManager.setString(11,prpDcompanyDto.getFlag());
            dbManager.setString(12,prpDcompanyDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param comCode ��������
     * @throws Exception
     */
    public void delete(String comCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM PrpDcompany ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ComCode=").append("'").append(comCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ComCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,comCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param prpDcompanyDto prpDcompanyDto
     * @throws Exception
     */
    public void update(PrpDcompanyDto prpDcompanyDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE PrpDcompany SET ");
        buffer.append("ComCName = ?, ");
        buffer.append("ComEName = ?, ");
        buffer.append("AddressCName = ?, ");
        buffer.append("AddressEName = ?, ");
        buffer.append("PostCode = ?, ");
        buffer.append("PhoneNumber = ?, ");
        buffer.append("TaxNumber = ?, ");
        buffer.append("UpperComCode = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE PrpDcompany SET ");
            debugBuffer.append("ComCName = '" + prpDcompanyDto.getComCName() + "', ");
            debugBuffer.append("ComEName = '" + prpDcompanyDto.getComEName() + "', ");
            debugBuffer.append("AddressCName = '" + prpDcompanyDto.getAddressCName() + "', ");
            debugBuffer.append("AddressEName = '" + prpDcompanyDto.getAddressEName() + "', ");
            debugBuffer.append("PostCode = '" + prpDcompanyDto.getPostCode() + "', ");
            debugBuffer.append("PhoneNumber = '" + prpDcompanyDto.getPhoneNumber() + "', ");
            debugBuffer.append("TaxNumber = '" + prpDcompanyDto.getTaxNumber() + "', ");
            debugBuffer.append("UpperComCode = '" + prpDcompanyDto.getUpperComCode() + "', ");
            debugBuffer.append("ValidStatus = '" + prpDcompanyDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + prpDcompanyDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + prpDcompanyDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("ComCode=").append("'").append(prpDcompanyDto.getComCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ComCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,prpDcompanyDto.getComCName());
        dbManager.setString(2,prpDcompanyDto.getComEName());
        dbManager.setString(3,prpDcompanyDto.getAddressCName());
        dbManager.setString(4,prpDcompanyDto.getAddressEName());
        dbManager.setString(5,prpDcompanyDto.getPostCode());
        dbManager.setString(6,prpDcompanyDto.getPhoneNumber());
        dbManager.setString(7,prpDcompanyDto.getTaxNumber());
        dbManager.setString(8,prpDcompanyDto.getUpperComCode());
        dbManager.setString(9,prpDcompanyDto.getValidStatus());
        dbManager.setString(10,prpDcompanyDto.getFlag());
        dbManager.setString(11,prpDcompanyDto.getRemark());
        //���������ֶ�;
        dbManager.setString(12,prpDcompanyDto.getComCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param comCode ��������
     * @return PrpDcompanyDto
     * @throws Exception
     */
    public PrpDcompanyDto findByPrimaryKey(String comCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("ComCode,");
        buffer.append("ComCName,");
        buffer.append("ComEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("PhoneNumber,");
        buffer.append("TaxNumber,");
        buffer.append("UpperComCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM PrpDcompany ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ComCode=").append("'").append(comCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ComCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,comCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        PrpDcompanyDto prpDcompanyDto = null;
        if(resultSet.next()){
            prpDcompanyDto = new PrpDcompanyDto();
            prpDcompanyDto.setComCode(dbManager.getString(resultSet,1));
            prpDcompanyDto.setComCName(dbManager.getString(resultSet,2));
            prpDcompanyDto.setComEName(dbManager.getString(resultSet,3));
            prpDcompanyDto.setAddressCName(dbManager.getString(resultSet,4));
            prpDcompanyDto.setAddressEName(dbManager.getString(resultSet,5));
            prpDcompanyDto.setPostCode(dbManager.getString(resultSet,6));
            prpDcompanyDto.setPhoneNumber(dbManager.getString(resultSet,7));
            prpDcompanyDto.setTaxNumber(dbManager.getString(resultSet,8));
            prpDcompanyDto.setUpperComCode(dbManager.getString(resultSet,9));
            prpDcompanyDto.setValidStatus(dbManager.getString(resultSet,10));
            prpDcompanyDto.setFlag(dbManager.getString(resultSet,11));
            prpDcompanyDto.setRemark(dbManager.getString(resultSet,12));
        }
        resultSet.close();
        return prpDcompanyDto;
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
        buffer.append("ComCode,");
        buffer.append("ComCName,");
        buffer.append("ComEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("PhoneNumber,");
        buffer.append("TaxNumber,");
        buffer.append("UpperComCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM PrpDcompany WHERE ");
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
        PrpDcompanyDto prpDcompanyDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            prpDcompanyDto = new PrpDcompanyDto();
            prpDcompanyDto.setComCode(dbManager.getString(resultSet,"ComCode"));
            prpDcompanyDto.setComCName(dbManager.getString(resultSet,"ComCName"));
            prpDcompanyDto.setComEName(dbManager.getString(resultSet,"ComEName"));
            prpDcompanyDto.setAddressCName(dbManager.getString(resultSet,"AddressCName"));
            prpDcompanyDto.setAddressEName(dbManager.getString(resultSet,"AddressEName"));
            prpDcompanyDto.setPostCode(dbManager.getString(resultSet,"PostCode"));
            prpDcompanyDto.setPhoneNumber(dbManager.getString(resultSet,"PhoneNumber"));
            prpDcompanyDto.setTaxNumber(dbManager.getString(resultSet,"TaxNumber"));
            prpDcompanyDto.setUpperComCode(dbManager.getString(resultSet,"UpperComCode"));
            prpDcompanyDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            prpDcompanyDto.setFlag(dbManager.getString(resultSet,"Flag"));
            prpDcompanyDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(prpDcompanyDto);
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
        buffer.append("DELETE FROM PrpDcompany WHERE ");
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
        buffer.append("SELECT count(*) FROM PrpDcompany WHERE ");
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
