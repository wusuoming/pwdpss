package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSalePrice-���ۼ۸������ݷ��ʶ������<br>
 */
public class DBLwWholeSalePriceBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwWholeSalePriceBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwWholeSalePriceBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public void insert(LwWholeSalePriceDto lwWholeSalePriceDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwWholeSalePrice (");
        buffer.append("PowerClass,");
        buffer.append("SaleArea,");
        buffer.append("VoltageBegin,");
        buffer.append("VoltageEnd,");
        buffer.append("Price,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwWholeSalePriceDto.getPowerClass()).append("',");
            debugBuffer.append("'").append(lwWholeSalePriceDto.getSaleArea()).append("',");
            debugBuffer.append("").append(lwWholeSalePriceDto.getVoltageBegin()).append(",");
            debugBuffer.append("").append(lwWholeSalePriceDto.getVoltageEnd()).append(",");
            debugBuffer.append("").append(lwWholeSalePriceDto.getPrice()).append(",");
            debugBuffer.append("'").append(lwWholeSalePriceDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwWholeSalePriceDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwWholeSalePriceDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwWholeSalePriceDto.getPowerClass());
        dbManager.setString(2,lwWholeSalePriceDto.getSaleArea());
        dbManager.setDouble(3,lwWholeSalePriceDto.getVoltageBegin());
        dbManager.setDouble(4,lwWholeSalePriceDto.getVoltageEnd());
        dbManager.setDouble(5,lwWholeSalePriceDto.getPrice());
        dbManager.setString(6,lwWholeSalePriceDto.getValidStatus());
        dbManager.setString(7,lwWholeSalePriceDto.getFlag());
        dbManager.setString(8,lwWholeSalePriceDto.getRemark());
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
        buffer.append("INSERT INTO LwWholeSalePrice (");
        buffer.append("PowerClass,");
        buffer.append("SaleArea,");
        buffer.append("VoltageBegin,");
        buffer.append("VoltageEnd,");
        buffer.append("Price,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwWholeSalePriceDto lwWholeSalePriceDto = (LwWholeSalePriceDto)i.next();
            dbManager.setString(1,lwWholeSalePriceDto.getPowerClass());
            dbManager.setString(2,lwWholeSalePriceDto.getSaleArea());
            dbManager.setDouble(3,lwWholeSalePriceDto.getVoltageBegin());
            dbManager.setDouble(4,lwWholeSalePriceDto.getVoltageEnd());
            dbManager.setDouble(5,lwWholeSalePriceDto.getPrice());
            dbManager.setString(6,lwWholeSalePriceDto.getValidStatus());
            dbManager.setString(7,lwWholeSalePriceDto.getFlag());
            dbManager.setString(8,lwWholeSalePriceDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param saleArea ��������
     * @param voltageBegin ��ʼ��ѹ
     * @throws Exception
     */
    public void delete(String saleArea,double voltageBegin)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwWholeSalePrice ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("SaleArea=").append("'").append(saleArea).append("' AND ");
            debugBuffer.append("VoltageBegin=").append("").append(voltageBegin).append("");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("SaleArea = ? And ");
        buffer.append("VoltageBegin = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,saleArea);
        dbManager.setDouble(2,voltageBegin);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public void update(LwWholeSalePriceDto lwWholeSalePriceDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwWholeSalePrice SET ");
        buffer.append("PowerClass = ?, ");
        buffer.append("VoltageEnd = ?, ");
        buffer.append("Price = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwWholeSalePrice SET ");
            debugBuffer.append("PowerClass = '" + lwWholeSalePriceDto.getPowerClass() + "', ");
            debugBuffer.append("VoltageEnd = " + lwWholeSalePriceDto.getVoltageEnd() + ", ");
            debugBuffer.append("Price = " + lwWholeSalePriceDto.getPrice() + ", ");
            debugBuffer.append("ValidStatus = '" + lwWholeSalePriceDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwWholeSalePriceDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwWholeSalePriceDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("SaleArea=").append("'").append(lwWholeSalePriceDto.getSaleArea()).append("' AND ");
            debugBuffer.append("VoltageBegin=").append("").append(lwWholeSalePriceDto.getVoltageBegin()).append("");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("SaleArea = ? And ");
        buffer.append("VoltageBegin = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwWholeSalePriceDto.getPowerClass());
        dbManager.setDouble(2,lwWholeSalePriceDto.getVoltageEnd());
        dbManager.setDouble(3,lwWholeSalePriceDto.getPrice());
        dbManager.setString(4,lwWholeSalePriceDto.getValidStatus());
        dbManager.setString(5,lwWholeSalePriceDto.getFlag());
        dbManager.setString(6,lwWholeSalePriceDto.getRemark());
        //���������ֶ�;
        dbManager.setString(7,lwWholeSalePriceDto.getSaleArea());
        dbManager.setDouble(8,lwWholeSalePriceDto.getVoltageBegin());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param saleArea ��������
     * @param voltageBegin ��ʼ��ѹ
     * @return LwWholeSalePriceDto
     * @throws Exception
     */
    public LwWholeSalePriceDto findByPrimaryKey(String saleArea,double voltageBegin)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("PowerClass,");
        buffer.append("SaleArea,");
        buffer.append("VoltageBegin,");
        buffer.append("VoltageEnd,");
        buffer.append("Price,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwWholeSalePrice ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("SaleArea=").append("'").append(saleArea).append("' AND ");
            debugBuffer.append("VoltageBegin=").append("").append(voltageBegin).append("");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("SaleArea = ? And ");
        buffer.append("VoltageBegin = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,saleArea);
        dbManager.setDouble(2,voltageBegin);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwWholeSalePriceDto lwWholeSalePriceDto = null;
        if(resultSet.next()){
            lwWholeSalePriceDto = new LwWholeSalePriceDto();
            lwWholeSalePriceDto.setPowerClass(dbManager.getString(resultSet,1));
            lwWholeSalePriceDto.setSaleArea(dbManager.getString(resultSet,2));
            lwWholeSalePriceDto.setVoltageBegin(dbManager.getDouble(resultSet,3));
            lwWholeSalePriceDto.setVoltageEnd(dbManager.getDouble(resultSet,4));
            lwWholeSalePriceDto.setPrice(dbManager.getDouble(resultSet,5));
            lwWholeSalePriceDto.setValidStatus(dbManager.getString(resultSet,6));
            lwWholeSalePriceDto.setFlag(dbManager.getString(resultSet,7));
            lwWholeSalePriceDto.setRemark(dbManager.getString(resultSet,8));
        }
        resultSet.close();
        return lwWholeSalePriceDto;
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
        buffer.append("PowerClass,");
        buffer.append("SaleArea,");
        buffer.append("VoltageBegin,");
        buffer.append("VoltageEnd,");
        buffer.append("Price,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwWholeSalePrice WHERE ");
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
        LwWholeSalePriceDto lwWholeSalePriceDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwWholeSalePriceDto = new LwWholeSalePriceDto();
            lwWholeSalePriceDto.setPowerClass(dbManager.getString(resultSet,"PowerClass"));
            lwWholeSalePriceDto.setSaleArea(dbManager.getString(resultSet,"SaleArea"));
            lwWholeSalePriceDto.setVoltageBegin(dbManager.getDouble(resultSet,"VoltageBegin"));
            lwWholeSalePriceDto.setVoltageEnd(dbManager.getDouble(resultSet,"VoltageEnd"));
            lwWholeSalePriceDto.setPrice(dbManager.getDouble(resultSet,"Price"));
            lwWholeSalePriceDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwWholeSalePriceDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwWholeSalePriceDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwWholeSalePriceDto);
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
        buffer.append("DELETE FROM LwWholeSalePrice WHERE ");
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
        buffer.append("SELECT count(*) FROM LwWholeSalePrice WHERE ");
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
