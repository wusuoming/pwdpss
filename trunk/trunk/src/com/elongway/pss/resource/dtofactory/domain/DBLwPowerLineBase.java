package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerLineDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerLine-��·��Ϣ������ݷ��ʶ������<br>
 */
public class DBLwPowerLineBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwPowerLineBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwPowerLineBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public void insert(LwPowerLineDto lwPowerLineDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwPowerLine (");
        buffer.append("LineCode,");
        buffer.append("LineCName,");
        buffer.append("LineEName,");
        buffer.append("ComCode,");
        buffer.append("TargetCode,");
        buffer.append("SupplyType,");
        buffer.append("Ct,");
        buffer.append("Pt,");
        buffer.append("VoltLevel,");
        buffer.append("SiFeLoss,");
        buffer.append("LossProp,");
        buffer.append("PriceCategory,");
        buffer.append("LossFlag,");
        buffer.append("Rate,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwPowerLineDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwPowerLineDto.getLineCName()).append("',");
            debugBuffer.append("'").append(lwPowerLineDto.getLineEName()).append("',");
            debugBuffer.append("'").append(lwPowerLineDto.getComCode()).append("',");
            debugBuffer.append("'").append(lwPowerLineDto.getTargetCode()).append("',");
            debugBuffer.append("'").append(lwPowerLineDto.getSupplyType()).append("',");
            debugBuffer.append("").append(lwPowerLineDto.getCt()).append(",");
            debugBuffer.append("").append(lwPowerLineDto.getPt()).append(",");
            debugBuffer.append("").append(lwPowerLineDto.getVoltLevel()).append(",");
            debugBuffer.append("").append(lwPowerLineDto.getSiFeLoss()).append(",");
            debugBuffer.append("").append(lwPowerLineDto.getLossProp()).append(",");
            debugBuffer.append("'").append(lwPowerLineDto.getPriceCategory()).append("',");
            debugBuffer.append("'").append(lwPowerLineDto.getLossFlag()).append("',");
            debugBuffer.append("").append(lwPowerLineDto.getRate()).append(",");
            debugBuffer.append("'").append(lwPowerLineDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwPowerLineDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwPowerLineDto.getLineCode());
        dbManager.setString(2,lwPowerLineDto.getLineCName());
        dbManager.setString(3,lwPowerLineDto.getLineEName());
        dbManager.setString(4,lwPowerLineDto.getComCode());
        dbManager.setString(5,lwPowerLineDto.getTargetCode());
        dbManager.setString(6,lwPowerLineDto.getSupplyType());
        dbManager.setDouble(7,lwPowerLineDto.getCt());
        dbManager.setDouble(8,lwPowerLineDto.getPt());
        dbManager.setDouble(9,lwPowerLineDto.getVoltLevel());
        dbManager.setDouble(10,lwPowerLineDto.getSiFeLoss());
        dbManager.setDouble(11,lwPowerLineDto.getLossProp());
        dbManager.setString(12,lwPowerLineDto.getPriceCategory());
        dbManager.setString(13,lwPowerLineDto.getLossFlag());
        dbManager.setDouble(14,lwPowerLineDto.getRate());
        dbManager.setString(15,lwPowerLineDto.getFlag());
        dbManager.setString(16,lwPowerLineDto.getRemark());
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
        buffer.append("INSERT INTO LwPowerLine (");
        buffer.append("LineCode,");
        buffer.append("LineCName,");
        buffer.append("LineEName,");
        buffer.append("ComCode,");
        buffer.append("TargetCode,");
        buffer.append("SupplyType,");
        buffer.append("Ct,");
        buffer.append("Pt,");
        buffer.append("VoltLevel,");
        buffer.append("SiFeLoss,");
        buffer.append("LossProp,");
        buffer.append("PriceCategory,");
        buffer.append("LossFlag,");
        buffer.append("Rate,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwPowerLineDto lwPowerLineDto = (LwPowerLineDto)i.next();
            dbManager.setString(1,lwPowerLineDto.getLineCode());
            dbManager.setString(2,lwPowerLineDto.getLineCName());
            dbManager.setString(3,lwPowerLineDto.getLineEName());
            dbManager.setString(4,lwPowerLineDto.getComCode());
            dbManager.setString(5,lwPowerLineDto.getTargetCode());
            dbManager.setString(6,lwPowerLineDto.getSupplyType());
            dbManager.setDouble(7,lwPowerLineDto.getCt());
            dbManager.setDouble(8,lwPowerLineDto.getPt());
            dbManager.setDouble(9,lwPowerLineDto.getVoltLevel());
            dbManager.setDouble(10,lwPowerLineDto.getSiFeLoss());
            dbManager.setDouble(11,lwPowerLineDto.getLossProp());
            dbManager.setString(12,lwPowerLineDto.getPriceCategory());
            dbManager.setString(13,lwPowerLineDto.getLossFlag());
            dbManager.setDouble(14,lwPowerLineDto.getRate());
            dbManager.setString(15,lwPowerLineDto.getFlag());
            dbManager.setString(16,lwPowerLineDto.getRemark());
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
        buffer.append("DELETE FROM LwPowerLine ");
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
     * @param lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public void update(LwPowerLineDto lwPowerLineDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwPowerLine SET ");
        buffer.append("LineCName = ?, ");
        buffer.append("LineEName = ?, ");
        buffer.append("ComCode = ?, ");
        buffer.append("TargetCode = ?, ");
        buffer.append("SupplyType = ?, ");
        buffer.append("Ct = ?, ");
        buffer.append("Pt = ?, ");
        buffer.append("VoltLevel = ?, ");
        buffer.append("SiFeLoss = ?, ");
        buffer.append("LossProp = ?, ");
        buffer.append("PriceCategory = ?, ");
        buffer.append("LossFlag = ?, ");
        buffer.append("Rate = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwPowerLine SET ");
            debugBuffer.append("LineCName = '" + lwPowerLineDto.getLineCName() + "', ");
            debugBuffer.append("LineEName = '" + lwPowerLineDto.getLineEName() + "', ");
            debugBuffer.append("ComCode = '" + lwPowerLineDto.getComCode() + "', ");
            debugBuffer.append("TargetCode = '" + lwPowerLineDto.getTargetCode() + "', ");
            debugBuffer.append("SupplyType = '" + lwPowerLineDto.getSupplyType() + "', ");
            debugBuffer.append("Ct = " + lwPowerLineDto.getCt() + ", ");
            debugBuffer.append("Pt = " + lwPowerLineDto.getPt() + ", ");
            debugBuffer.append("VoltLevel = " + lwPowerLineDto.getVoltLevel() + ", ");
            debugBuffer.append("SiFeLoss = " + lwPowerLineDto.getSiFeLoss() + ", ");
            debugBuffer.append("LossProp = " + lwPowerLineDto.getLossProp() + ", ");
            debugBuffer.append("PriceCategory = '" + lwPowerLineDto.getPriceCategory() + "', ");
            debugBuffer.append("LossFlag = '" + lwPowerLineDto.getLossFlag() + "', ");
            debugBuffer.append("Rate = " + lwPowerLineDto.getRate() + ", ");
            debugBuffer.append("Flag = '" + lwPowerLineDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwPowerLineDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lwPowerLineDto.getLineCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwPowerLineDto.getLineCName());
        dbManager.setString(2,lwPowerLineDto.getLineEName());
        dbManager.setString(3,lwPowerLineDto.getComCode());
        dbManager.setString(4,lwPowerLineDto.getTargetCode());
        dbManager.setString(5,lwPowerLineDto.getSupplyType());
        dbManager.setDouble(6,lwPowerLineDto.getCt());
        dbManager.setDouble(7,lwPowerLineDto.getPt());
        dbManager.setDouble(8,lwPowerLineDto.getVoltLevel());
        dbManager.setDouble(9,lwPowerLineDto.getSiFeLoss());
        dbManager.setDouble(10,lwPowerLineDto.getLossProp());
        dbManager.setString(11,lwPowerLineDto.getPriceCategory());
        dbManager.setString(12,lwPowerLineDto.getLossFlag());
        dbManager.setDouble(13,lwPowerLineDto.getRate());
        dbManager.setString(14,lwPowerLineDto.getFlag());
        dbManager.setString(15,lwPowerLineDto.getRemark());
        //���������ֶ�;
        dbManager.setString(16,lwPowerLineDto.getLineCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param lineCode ��·����
     * @return LwPowerLineDto
     * @throws Exception
     */
    public LwPowerLineDto findByPrimaryKey(String lineCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("LineCode,");
        buffer.append("LineCName,");
        buffer.append("LineEName,");
        buffer.append("ComCode,");
        buffer.append("TargetCode,");
        buffer.append("SupplyType,");
        buffer.append("Ct,");
        buffer.append("Pt,");
        buffer.append("VoltLevel,");
        buffer.append("SiFeLoss,");
        buffer.append("LossProp,");
        buffer.append("PriceCategory,");
        buffer.append("LossFlag,");
        buffer.append("Rate,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwPowerLine ");
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
        LwPowerLineDto lwPowerLineDto = null;
        if(resultSet.next()){
            lwPowerLineDto = new LwPowerLineDto();
            lwPowerLineDto.setLineCode(dbManager.getString(resultSet,1));
            lwPowerLineDto.setLineCName(dbManager.getString(resultSet,2));
            lwPowerLineDto.setLineEName(dbManager.getString(resultSet,3));
            lwPowerLineDto.setComCode(dbManager.getString(resultSet,4));
            lwPowerLineDto.setTargetCode(dbManager.getString(resultSet,5));
            lwPowerLineDto.setSupplyType(dbManager.getString(resultSet,6));
            lwPowerLineDto.setCt(dbManager.getDouble(resultSet,7));
            lwPowerLineDto.setPt(dbManager.getDouble(resultSet,8));
            lwPowerLineDto.setVoltLevel(dbManager.getDouble(resultSet,9));
            lwPowerLineDto.setSiFeLoss(dbManager.getDouble(resultSet,10));
            lwPowerLineDto.setLossProp(dbManager.getDouble(resultSet,11));
            lwPowerLineDto.setPriceCategory(dbManager.getString(resultSet,12));
            lwPowerLineDto.setLossFlag(dbManager.getString(resultSet,13));
            lwPowerLineDto.setRate(dbManager.getDouble(resultSet,14));
            lwPowerLineDto.setFlag(dbManager.getString(resultSet,15));
            lwPowerLineDto.setRemark(dbManager.getString(resultSet,16));
        }
        resultSet.close();
        return lwPowerLineDto;
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
        buffer.append("LineCName,");
        buffer.append("LineEName,");
        buffer.append("ComCode,");
        buffer.append("TargetCode,");
        buffer.append("SupplyType,");
        buffer.append("Ct,");
        buffer.append("Pt,");
        buffer.append("VoltLevel,");
        buffer.append("SiFeLoss,");
        buffer.append("LossProp,");
        buffer.append("PriceCategory,");
        buffer.append("LossFlag,");
        buffer.append("Rate,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwPowerLine WHERE ");
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
        LwPowerLineDto lwPowerLineDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwPowerLineDto = new LwPowerLineDto();
            lwPowerLineDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwPowerLineDto.setLineCName(dbManager.getString(resultSet,"LineCName"));
            lwPowerLineDto.setLineEName(dbManager.getString(resultSet,"LineEName"));
            lwPowerLineDto.setComCode(dbManager.getString(resultSet,"ComCode"));
            lwPowerLineDto.setTargetCode(dbManager.getString(resultSet,"TargetCode"));
            lwPowerLineDto.setSupplyType(dbManager.getString(resultSet,"SupplyType"));
            lwPowerLineDto.setCt(dbManager.getDouble(resultSet,"Ct"));
            lwPowerLineDto.setPt(dbManager.getDouble(resultSet,"Pt"));
            lwPowerLineDto.setVoltLevel(dbManager.getDouble(resultSet,"VoltLevel"));
            lwPowerLineDto.setSiFeLoss(dbManager.getDouble(resultSet,"SiFeLoss"));
            lwPowerLineDto.setLossProp(dbManager.getDouble(resultSet,"LossProp"));
            lwPowerLineDto.setPriceCategory(dbManager.getString(resultSet,"PriceCategory"));
            lwPowerLineDto.setLossFlag(dbManager.getString(resultSet,"LossFlag"));
            lwPowerLineDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwPowerLineDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwPowerLineDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwPowerLineDto);
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
        buffer.append("DELETE FROM LwPowerLine WHERE ");
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
        buffer.append("SELECT count(*) FROM LwPowerLine WHERE ");
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
