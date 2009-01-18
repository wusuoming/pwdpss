package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPriceSummaryDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPriceSummary-��Ѽ����ܱ�����ݷ��ʶ������<br>
 */
public class DBLwPriceSummaryBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwPriceSummaryBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwPriceSummaryBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public void insert(LwPriceSummaryDto lwPriceSummaryDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwPriceSummary (");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("ElectricFee,");
        buffer.append("Loan,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwPriceSummaryDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwPriceSummaryDto.getStatMonth()).append("',");
            debugBuffer.append("'").append(lwPriceSummaryDto.getPowerClass()).append("',");
            debugBuffer.append("").append(lwPriceSummaryDto.getElectricQuantity()).append(",");
            debugBuffer.append("").append(lwPriceSummaryDto.getElectricFee()).append(",");
            debugBuffer.append("").append(lwPriceSummaryDto.getLoan()).append(",");
            debugBuffer.append("").append(lwPriceSummaryDto.getSanXiaFee()).append(",");
            debugBuffer.append("").append(lwPriceSummaryDto.getSurcharge()).append(",");
            debugBuffer.append("").append(lwPriceSummaryDto.getSumFee()).append(",");
            debugBuffer.append("'").append(lwPriceSummaryDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwPriceSummaryDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwPriceSummaryDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwPriceSummaryDto.getLineCode());
        dbManager.setString(2,lwPriceSummaryDto.getStatMonth());
        dbManager.setString(3,lwPriceSummaryDto.getPowerClass());
        dbManager.setDouble(4,lwPriceSummaryDto.getElectricQuantity());
        dbManager.setDouble(5,lwPriceSummaryDto.getElectricFee());
        dbManager.setDouble(6,lwPriceSummaryDto.getLoan());
        dbManager.setDouble(7,lwPriceSummaryDto.getSanXiaFee());
        dbManager.setDouble(8,lwPriceSummaryDto.getSurcharge());
        dbManager.setDouble(9,lwPriceSummaryDto.getSumFee());
        dbManager.setString(10,lwPriceSummaryDto.getValidStatus());
        dbManager.setString(11,lwPriceSummaryDto.getFlag());
        dbManager.setString(12,lwPriceSummaryDto.getRemark());
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
        buffer.append("INSERT INTO LwPriceSummary (");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("ElectricFee,");
        buffer.append("Loan,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("SumFee,");
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
            LwPriceSummaryDto lwPriceSummaryDto = (LwPriceSummaryDto)i.next();
            dbManager.setString(1,lwPriceSummaryDto.getLineCode());
            dbManager.setString(2,lwPriceSummaryDto.getStatMonth());
            dbManager.setString(3,lwPriceSummaryDto.getPowerClass());
            dbManager.setDouble(4,lwPriceSummaryDto.getElectricQuantity());
            dbManager.setDouble(5,lwPriceSummaryDto.getElectricFee());
            dbManager.setDouble(6,lwPriceSummaryDto.getLoan());
            dbManager.setDouble(7,lwPriceSummaryDto.getSanXiaFee());
            dbManager.setDouble(8,lwPriceSummaryDto.getSurcharge());
            dbManager.setDouble(9,lwPriceSummaryDto.getSumFee());
            dbManager.setString(10,lwPriceSummaryDto.getValidStatus());
            dbManager.setString(11,lwPriceSummaryDto.getFlag());
            dbManager.setString(12,lwPriceSummaryDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param lineCode ��·����
     * @throws Exception
     */
    public void delete(String lineCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwPriceSummary ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,lineCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public void update(LwPriceSummaryDto lwPriceSummaryDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwPriceSummary SET ");
        buffer.append("StatMonth = ?, ");
        buffer.append("PowerClass = ?, ");
        buffer.append("ElectricQuantity = ?, ");
        buffer.append("ElectricFee = ?, ");
        buffer.append("Loan = ?, ");
        buffer.append("SanXiaFee = ?, ");
        buffer.append("Surcharge = ?, ");
        buffer.append("SumFee = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwPriceSummary SET ");
            debugBuffer.append("StatMonth = '" + lwPriceSummaryDto.getStatMonth() + "', ");
            debugBuffer.append("PowerClass = '" + lwPriceSummaryDto.getPowerClass() + "', ");
            debugBuffer.append("ElectricQuantity = " + lwPriceSummaryDto.getElectricQuantity() + ", ");
            debugBuffer.append("ElectricFee = " + lwPriceSummaryDto.getElectricFee() + ", ");
            debugBuffer.append("Loan = " + lwPriceSummaryDto.getLoan() + ", ");
            debugBuffer.append("SanXiaFee = " + lwPriceSummaryDto.getSanXiaFee() + ", ");
            debugBuffer.append("Surcharge = " + lwPriceSummaryDto.getSurcharge() + ", ");
            debugBuffer.append("SumFee = " + lwPriceSummaryDto.getSumFee() + ", ");
            debugBuffer.append("ValidStatus = '" + lwPriceSummaryDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwPriceSummaryDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwPriceSummaryDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lwPriceSummaryDto.getLineCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwPriceSummaryDto.getStatMonth());
        dbManager.setString(2,lwPriceSummaryDto.getPowerClass());
        dbManager.setDouble(3,lwPriceSummaryDto.getElectricQuantity());
        dbManager.setDouble(4,lwPriceSummaryDto.getElectricFee());
        dbManager.setDouble(5,lwPriceSummaryDto.getLoan());
        dbManager.setDouble(6,lwPriceSummaryDto.getSanXiaFee());
        dbManager.setDouble(7,lwPriceSummaryDto.getSurcharge());
        dbManager.setDouble(8,lwPriceSummaryDto.getSumFee());
        dbManager.setString(9,lwPriceSummaryDto.getValidStatus());
        dbManager.setString(10,lwPriceSummaryDto.getFlag());
        dbManager.setString(11,lwPriceSummaryDto.getRemark());
        //���������ֶ�;
        dbManager.setString(12,lwPriceSummaryDto.getLineCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param lineCode ��·����
     * @return LwPriceSummaryDto
     * @throws Exception
     */
    public LwPriceSummaryDto findByPrimaryKey(String lineCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("ElectricFee,");
        buffer.append("Loan,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwPriceSummary ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,lineCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwPriceSummaryDto lwPriceSummaryDto = null;
        if(resultSet.next()){
            lwPriceSummaryDto = new LwPriceSummaryDto();
            lwPriceSummaryDto.setLineCode(dbManager.getString(resultSet,1));
            lwPriceSummaryDto.setStatMonth(dbManager.getString(resultSet,2));
            lwPriceSummaryDto.setPowerClass(dbManager.getString(resultSet,3));
            lwPriceSummaryDto.setElectricQuantity(dbManager.getDouble(resultSet,4));
            lwPriceSummaryDto.setElectricFee(dbManager.getDouble(resultSet,5));
            lwPriceSummaryDto.setLoan(dbManager.getDouble(resultSet,6));
            lwPriceSummaryDto.setSanXiaFee(dbManager.getDouble(resultSet,7));
            lwPriceSummaryDto.setSurcharge(dbManager.getDouble(resultSet,8));
            lwPriceSummaryDto.setSumFee(dbManager.getDouble(resultSet,9));
            lwPriceSummaryDto.setValidStatus(dbManager.getString(resultSet,10));
            lwPriceSummaryDto.setFlag(dbManager.getString(resultSet,11));
            lwPriceSummaryDto.setRemark(dbManager.getString(resultSet,12));
        }
        resultSet.close();
        return lwPriceSummaryDto;
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
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("ElectricFee,");
        buffer.append("Loan,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwPriceSummary WHERE ");
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
        LwPriceSummaryDto lwPriceSummaryDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwPriceSummaryDto = new LwPriceSummaryDto();
            lwPriceSummaryDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwPriceSummaryDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwPriceSummaryDto.setPowerClass(dbManager.getString(resultSet,"PowerClass"));
            lwPriceSummaryDto.setElectricQuantity(dbManager.getDouble(resultSet,"ElectricQuantity"));
            lwPriceSummaryDto.setElectricFee(dbManager.getDouble(resultSet,"ElectricFee"));
            lwPriceSummaryDto.setLoan(dbManager.getDouble(resultSet,"Loan"));
            lwPriceSummaryDto.setSanXiaFee(dbManager.getDouble(resultSet,"SanXiaFee"));
            lwPriceSummaryDto.setSurcharge(dbManager.getDouble(resultSet,"Surcharge"));
            lwPriceSummaryDto.setSumFee(dbManager.getDouble(resultSet,"SumFee"));
            lwPriceSummaryDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwPriceSummaryDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwPriceSummaryDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwPriceSummaryDto);
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
        buffer.append("DELETE FROM LwPriceSummary WHERE ");
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
        buffer.append("SELECT count(*) FROM LwPriceSummary WHERE ");
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
