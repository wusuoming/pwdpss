package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwRateCodeDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWRateCode-������ά��������ݷ��ʶ������<br>
 */
public class DBLwRateCodeBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwRateCodeBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwRateCodeBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public void insert(LwRateCodeDto lwRateCodeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwRateCode (");
        buffer.append("PowerFactor,");
        buffer.append("UpPowerRate,");
        buffer.append("SuppleType,");
        buffer.append("AdjustRate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("LowPowerRate ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwRateCodeDto.getPowerFactor()).append("',");
            debugBuffer.append("").append(lwRateCodeDto.getUpPowerRate()).append(",");
            debugBuffer.append("'").append(lwRateCodeDto.getSuppleType()).append("',");
            debugBuffer.append("'").append(lwRateCodeDto.getAdjustRate()).append("',");
            debugBuffer.append("'").append(lwRateCodeDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwRateCodeDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwRateCodeDto.getRemark()).append("',");
            debugBuffer.append("").append(lwRateCodeDto.getLowPowerRate()).append(")");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwRateCodeDto.getPowerFactor());
        dbManager.setDouble(2,lwRateCodeDto.getUpPowerRate());
        dbManager.setString(3,lwRateCodeDto.getSuppleType());
        dbManager.setString(4,lwRateCodeDto.getAdjustRate());
        dbManager.setString(5,lwRateCodeDto.getValidStatus());
        dbManager.setString(6,lwRateCodeDto.getFlag());
        dbManager.setString(7,lwRateCodeDto.getRemark());
        dbManager.setDouble(8,lwRateCodeDto.getLowPowerRate());
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
        buffer.append("INSERT INTO LwRateCode (");
        buffer.append("PowerFactor,");
        buffer.append("UpPowerRate,");
        buffer.append("SuppleType,");
        buffer.append("AdjustRate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("LowPowerRate ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwRateCodeDto lwRateCodeDto = (LwRateCodeDto)i.next();
            dbManager.setString(1,lwRateCodeDto.getPowerFactor());
            dbManager.setDouble(2,lwRateCodeDto.getUpPowerRate());
            dbManager.setString(3,lwRateCodeDto.getSuppleType());
            dbManager.setString(4,lwRateCodeDto.getAdjustRate());
            dbManager.setString(5,lwRateCodeDto.getValidStatus());
            dbManager.setString(6,lwRateCodeDto.getFlag());
            dbManager.setString(7,lwRateCodeDto.getRemark());
            dbManager.setDouble(8,lwRateCodeDto.getLowPowerRate());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param powerFactor ��������
     * @param suppleType �������ʹ���
     * @throws Exception
     */
    public void delete(String powerFactor,String suppleType)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwRateCode ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerFactor=").append("'").append(powerFactor).append("' AND ");
            debugBuffer.append("SuppleType=").append("'").append(suppleType).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerFactor = ? And ");
        buffer.append("SuppleType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,powerFactor);
        dbManager.setString(2,suppleType);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public void update(LwRateCodeDto lwRateCodeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwRateCode SET ");
        buffer.append("UpPowerRate = ?, ");
        buffer.append("AdjustRate = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("LowPowerRate = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwRateCode SET ");
            debugBuffer.append("UpPowerRate = " + lwRateCodeDto.getUpPowerRate() + ", ");
            debugBuffer.append("AdjustRate = '" + lwRateCodeDto.getAdjustRate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwRateCodeDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwRateCodeDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwRateCodeDto.getRemark() + "', ");
            debugBuffer.append("LowPowerRate = " + lwRateCodeDto.getLowPowerRate() + " ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerFactor=").append("'").append(lwRateCodeDto.getPowerFactor()).append("' AND ");
            debugBuffer.append("SuppleType=").append("'").append(lwRateCodeDto.getSuppleType()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerFactor = ? And ");
        buffer.append("SuppleType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setDouble(1,lwRateCodeDto.getUpPowerRate());
        dbManager.setString(2,lwRateCodeDto.getAdjustRate());
        dbManager.setString(3,lwRateCodeDto.getValidStatus());
        dbManager.setString(4,lwRateCodeDto.getFlag());
        dbManager.setString(5,lwRateCodeDto.getRemark());
        dbManager.setDouble(6,lwRateCodeDto.getLowPowerRate());
        //���������ֶ�;
        dbManager.setString(7,lwRateCodeDto.getPowerFactor());
        dbManager.setString(8,lwRateCodeDto.getSuppleType());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param powerFactor ��������
     * @param suppleType �������ʹ���
     * @return LwRateCodeDto
     * @throws Exception
     */
    public LwRateCodeDto findByPrimaryKey(String powerFactor,String suppleType)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("PowerFactor,");
        buffer.append("UpPowerRate,");
        buffer.append("SuppleType,");
        buffer.append("AdjustRate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("LowPowerRate ");
        buffer.append("FROM LwRateCode ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerFactor=").append("'").append(powerFactor).append("' AND ");
            debugBuffer.append("SuppleType=").append("'").append(suppleType).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerFactor = ? And ");
        buffer.append("SuppleType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,powerFactor);
        dbManager.setString(2,suppleType);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwRateCodeDto lwRateCodeDto = null;
        if(resultSet.next()){
            lwRateCodeDto = new LwRateCodeDto();
            lwRateCodeDto.setPowerFactor(dbManager.getString(resultSet,1));
            lwRateCodeDto.setUpPowerRate(dbManager.getDouble(resultSet,2));
            lwRateCodeDto.setSuppleType(dbManager.getString(resultSet,3));
            lwRateCodeDto.setAdjustRate(dbManager.getString(resultSet,4));
            lwRateCodeDto.setValidStatus(dbManager.getString(resultSet,5));
            lwRateCodeDto.setFlag(dbManager.getString(resultSet,6));
            lwRateCodeDto.setRemark(dbManager.getString(resultSet,7));
            lwRateCodeDto.setLowPowerRate(dbManager.getDouble(resultSet,8));
        }
        resultSet.close();
        return lwRateCodeDto;
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
        buffer.append("PowerFactor,");
        buffer.append("UpPowerRate,");
        buffer.append("SuppleType,");
        buffer.append("AdjustRate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("LowPowerRate ");
        buffer.append("FROM LwRateCode WHERE ");
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
        LwRateCodeDto lwRateCodeDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwRateCodeDto = new LwRateCodeDto();
            lwRateCodeDto.setPowerFactor(dbManager.getString(resultSet,"PowerFactor"));
            lwRateCodeDto.setUpPowerRate(dbManager.getDouble(resultSet,"UpPowerRate"));
            lwRateCodeDto.setSuppleType(dbManager.getString(resultSet,"SuppleType"));
            lwRateCodeDto.setAdjustRate(dbManager.getString(resultSet,"AdjustRate"));
            lwRateCodeDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwRateCodeDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwRateCodeDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwRateCodeDto.setLowPowerRate(dbManager.getDouble(resultSet,"LowPowerRate"));
            collection.add(lwRateCodeDto);
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
        buffer.append("DELETE FROM LwRateCode WHERE ");
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
        buffer.append("SELECT count(*) FROM LwRateCode WHERE ");
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
