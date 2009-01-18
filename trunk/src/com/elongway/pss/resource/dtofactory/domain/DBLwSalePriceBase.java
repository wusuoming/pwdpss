package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSalePriceDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWSalePrice-���۵�۱�����ݷ��ʶ������<br>
 */
public class DBLwSalePriceBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwSalePriceBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwSalePriceBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public void insert(LwSalePriceDto lwSalePriceDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwSalePrice (");
        buffer.append("PowerClass,");
        buffer.append("PriceCategory,");
        buffer.append("VoltageBegin,");
        buffer.append("VoltageEnd,");
        buffer.append("MaterialsType,");
        buffer.append("Price,");
        buffer.append("ValidDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwSalePriceDto.getPowerClass()).append("',");
            debugBuffer.append("'").append(lwSalePriceDto.getPriceCategory()).append("',");
            debugBuffer.append("").append(lwSalePriceDto.getVoltageBegin()).append(",");
            debugBuffer.append("").append(lwSalePriceDto.getVoltageEnd()).append(",");
            debugBuffer.append("'").append(lwSalePriceDto.getMaterialsType()).append("',");
            debugBuffer.append("").append(lwSalePriceDto.getPrice()).append(",");
            debugBuffer.append("'").append(lwSalePriceDto.getValidDate()).append("',");
            debugBuffer.append("'").append(lwSalePriceDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwSalePriceDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwSalePriceDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwSalePriceDto.getPowerClass());
        dbManager.setString(2,lwSalePriceDto.getPriceCategory());
        dbManager.setDouble(3,lwSalePriceDto.getVoltageBegin());
        dbManager.setDouble(4,lwSalePriceDto.getVoltageEnd());
        dbManager.setString(5,lwSalePriceDto.getMaterialsType());
        dbManager.setDouble(6,lwSalePriceDto.getPrice());
        dbManager.setString(7,lwSalePriceDto.getValidDate());
        dbManager.setString(8,lwSalePriceDto.getValidStatus());
        dbManager.setString(9,lwSalePriceDto.getFlag());
        dbManager.setString(10,lwSalePriceDto.getRemark());
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
        buffer.append("INSERT INTO LwSalePrice (");
        buffer.append("PowerClass,");
        buffer.append("PriceCategory,");
        buffer.append("VoltageBegin,");
        buffer.append("VoltageEnd,");
        buffer.append("MaterialsType,");
        buffer.append("Price,");
        buffer.append("ValidDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwSalePriceDto lwSalePriceDto = (LwSalePriceDto)i.next();
            dbManager.setString(1,lwSalePriceDto.getPowerClass());
            dbManager.setString(2,lwSalePriceDto.getPriceCategory());
            dbManager.setDouble(3,lwSalePriceDto.getVoltageBegin());
            dbManager.setDouble(4,lwSalePriceDto.getVoltageEnd());
            dbManager.setString(5,lwSalePriceDto.getMaterialsType());
            dbManager.setDouble(6,lwSalePriceDto.getPrice());
            dbManager.setString(7,lwSalePriceDto.getValidDate());
            dbManager.setString(8,lwSalePriceDto.getValidStatus());
            dbManager.setString(9,lwSalePriceDto.getFlag());
            dbManager.setString(10,lwSalePriceDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param powerClass �õ����
     * @param priceCategory ��۷���
     * @param voltageBegin ��ʼ��ѹ
     * @param voltageEnd ��ֹ��ѹ
     * @param materialsType ԭ������
     * @throws Exception
     */
    public void delete(String powerClass,String priceCategory,double voltageBegin,double voltageEnd,String materialsType)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwSalePrice ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerClass=").append("'").append(powerClass).append("' AND ");
            debugBuffer.append("PriceCategory=").append("'").append(priceCategory).append("' AND ");
            debugBuffer.append("VoltageBegin=").append("").append(voltageBegin).append(" AND ");
            debugBuffer.append("VoltageEnd=").append("").append(voltageEnd).append(" AND ");
            debugBuffer.append("MaterialsType=").append("'").append(materialsType).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerClass = ? And ");
        buffer.append("PriceCategory = ? And ");
        buffer.append("VoltageBegin = ? And ");
        buffer.append("VoltageEnd = ? And ");
        buffer.append("MaterialsType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,powerClass);
        dbManager.setString(2,priceCategory);
        dbManager.setDouble(3,voltageBegin);
        dbManager.setDouble(4,voltageEnd);
        dbManager.setString(5,materialsType);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public void update(LwSalePriceDto lwSalePriceDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwSalePrice SET ");
        buffer.append("Price = ?, ");
        buffer.append("ValidDate = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwSalePrice SET ");
            debugBuffer.append("Price = " + lwSalePriceDto.getPrice() + ", ");
            debugBuffer.append("ValidDate = '" + lwSalePriceDto.getValidDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwSalePriceDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwSalePriceDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwSalePriceDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerClass=").append("'").append(lwSalePriceDto.getPowerClass()).append("' AND ");
            debugBuffer.append("PriceCategory=").append("'").append(lwSalePriceDto.getPriceCategory()).append("' AND ");
            debugBuffer.append("VoltageBegin=").append("").append(lwSalePriceDto.getVoltageBegin()).append(" AND ");
            debugBuffer.append("VoltageEnd=").append("").append(lwSalePriceDto.getVoltageEnd()).append(" AND ");
            debugBuffer.append("MaterialsType=").append("'").append(lwSalePriceDto.getMaterialsType()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerClass = ? And ");
        buffer.append("PriceCategory = ? And ");
        buffer.append("VoltageBegin = ? And ");
        buffer.append("VoltageEnd = ? And ");
        buffer.append("MaterialsType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setDouble(1,lwSalePriceDto.getPrice());
        dbManager.setString(2,lwSalePriceDto.getValidDate());
        dbManager.setString(3,lwSalePriceDto.getValidStatus());
        dbManager.setString(4,lwSalePriceDto.getFlag());
        dbManager.setString(5,lwSalePriceDto.getRemark());
        //���������ֶ�;
        dbManager.setString(6,lwSalePriceDto.getPowerClass());
        dbManager.setString(7,lwSalePriceDto.getPriceCategory());
        dbManager.setDouble(8,lwSalePriceDto.getVoltageBegin());
        dbManager.setDouble(9,lwSalePriceDto.getVoltageEnd());
        dbManager.setString(10,lwSalePriceDto.getMaterialsType());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param powerClass �õ����
     * @param priceCategory ��۷���
     * @param voltageBegin ��ʼ��ѹ
     * @param voltageEnd ��ֹ��ѹ
     * @param materialsType ԭ������
     * @return LwSalePriceDto
     * @throws Exception
     */
    public LwSalePriceDto findByPrimaryKey(String powerClass,String priceCategory,double voltageBegin,double voltageEnd,String materialsType)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("PowerClass,");
        buffer.append("PriceCategory,");
        buffer.append("VoltageBegin,");
        buffer.append("VoltageEnd,");
        buffer.append("MaterialsType,");
        buffer.append("Price,");
        buffer.append("ValidDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwSalePrice ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerClass=").append("'").append(powerClass).append("' AND ");
            debugBuffer.append("PriceCategory=").append("'").append(priceCategory).append("' AND ");
            debugBuffer.append("VoltageBegin=").append("").append(voltageBegin).append(" AND ");
            debugBuffer.append("VoltageEnd=").append("").append(voltageEnd).append(" AND ");
            debugBuffer.append("MaterialsType=").append("'").append(materialsType).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerClass = ? And ");
        buffer.append("PriceCategory = ? And ");
        buffer.append("VoltageBegin = ? And ");
        buffer.append("VoltageEnd = ? And ");
        buffer.append("MaterialsType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,powerClass);
        dbManager.setString(2,priceCategory);
        dbManager.setDouble(3,voltageBegin);
        dbManager.setDouble(4,voltageEnd);
        dbManager.setString(5,materialsType);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwSalePriceDto lwSalePriceDto = null;
        if(resultSet.next()){
            lwSalePriceDto = new LwSalePriceDto();
            lwSalePriceDto.setPowerClass(dbManager.getString(resultSet,1));
            lwSalePriceDto.setPriceCategory(dbManager.getString(resultSet,2));
            lwSalePriceDto.setVoltageBegin(dbManager.getDouble(resultSet,3));
            lwSalePriceDto.setVoltageEnd(dbManager.getDouble(resultSet,4));
            lwSalePriceDto.setMaterialsType(dbManager.getString(resultSet,5));
            lwSalePriceDto.setPrice(dbManager.getDouble(resultSet,6));
            lwSalePriceDto.setValidDate(dbManager.getString(resultSet,7));
            lwSalePriceDto.setValidStatus(dbManager.getString(resultSet,8));
            lwSalePriceDto.setFlag(dbManager.getString(resultSet,9));
            lwSalePriceDto.setRemark(dbManager.getString(resultSet,10));
        }
        resultSet.close();
        return lwSalePriceDto;
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
        buffer.append("PriceCategory,");
        buffer.append("VoltageBegin,");
        buffer.append("VoltageEnd,");
        buffer.append("MaterialsType,");
        buffer.append("Price,");
        buffer.append("ValidDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwSalePrice WHERE ");
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
        LwSalePriceDto lwSalePriceDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwSalePriceDto = new LwSalePriceDto();
            lwSalePriceDto.setPowerClass(dbManager.getString(resultSet,"PowerClass"));
            lwSalePriceDto.setPriceCategory(dbManager.getString(resultSet,"PriceCategory"));
            lwSalePriceDto.setVoltageBegin(dbManager.getDouble(resultSet,"VoltageBegin"));
            lwSalePriceDto.setVoltageEnd(dbManager.getDouble(resultSet,"VoltageEnd"));
            lwSalePriceDto.setMaterialsType(dbManager.getString(resultSet,"MaterialsType"));
            lwSalePriceDto.setPrice(dbManager.getDouble(resultSet,"Price"));
            lwSalePriceDto.setValidDate(dbManager.getString(resultSet,"ValidDate"));
            lwSalePriceDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwSalePriceDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwSalePriceDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwSalePriceDto);
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
        buffer.append("DELETE FROM LwSalePrice WHERE ");
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
        buffer.append("SELECT count(*) FROM LwSalePrice WHERE ");
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
