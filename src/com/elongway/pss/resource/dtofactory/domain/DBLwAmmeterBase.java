package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWAmmeter-�����Ϣ������ݷ��ʶ������<br>
 */
public class DBLwAmmeterBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwAmmeterBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwAmmeterBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public void insert(LwAmmeterDto lwAmmeterDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwAmmeter (");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterX,");
        buffer.append("AmmeterV,");
        buffer.append("AmmeterA,");
        buffer.append("AmmeterType,");
        buffer.append("FactoryName,");
        buffer.append("Coust,");
        buffer.append("Precision1,");
        buffer.append("Rate,");
        buffer.append("Maxnum,");
        buffer.append("AllowYear,");
        buffer.append("AllowDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwAmmeterDto.getAmmeterNo()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getAmmeterX()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getAmmeterV()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getAmmeterA()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getAmmeterType()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getFactoryName()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getCoust()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getPrecision()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getRate()).append("',");
            debugBuffer.append("").append(lwAmmeterDto.getMaxnum()).append(",");
            debugBuffer.append("'").append(lwAmmeterDto.getAllowYear()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getAllowDate()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwAmmeterDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwAmmeterDto.getAmmeterNo());
        dbManager.setString(2,lwAmmeterDto.getAmmeterX());
        dbManager.setString(3,lwAmmeterDto.getAmmeterV());
        dbManager.setString(4,lwAmmeterDto.getAmmeterA());
        dbManager.setString(5,lwAmmeterDto.getAmmeterType());
        dbManager.setString(6,lwAmmeterDto.getFactoryName());
        dbManager.setString(7,lwAmmeterDto.getCoust());
        dbManager.setString(8,lwAmmeterDto.getPrecision());
        dbManager.setString(9,lwAmmeterDto.getRate());
        dbManager.setInt(10,lwAmmeterDto.getMaxnum());
        dbManager.setString(11,lwAmmeterDto.getAllowYear());
        dbManager.setString(12,lwAmmeterDto.getAllowDate());
        dbManager.setString(13,lwAmmeterDto.getValidStatus());
        dbManager.setString(14,lwAmmeterDto.getFlag());
        dbManager.setString(15,lwAmmeterDto.getRemark());
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
        buffer.append("INSERT INTO LwAmmeter (");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterX,");
        buffer.append("AmmeterV,");
        buffer.append("AmmeterA,");
        buffer.append("AmmeterType,");
        buffer.append("FactoryName,");
        buffer.append("Coust,");
        buffer.append("Precision1,");
        buffer.append("Rate,");
        buffer.append("Maxnum,");
        buffer.append("AllowYear,");
        buffer.append("AllowDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwAmmeterDto lwAmmeterDto = (LwAmmeterDto)i.next();
            dbManager.setString(1,lwAmmeterDto.getAmmeterNo());
            dbManager.setString(2,lwAmmeterDto.getAmmeterX());
            dbManager.setString(3,lwAmmeterDto.getAmmeterV());
            dbManager.setString(4,lwAmmeterDto.getAmmeterA());
            dbManager.setString(5,lwAmmeterDto.getAmmeterType());
            dbManager.setString(6,lwAmmeterDto.getFactoryName());
            dbManager.setString(7,lwAmmeterDto.getCoust());
            dbManager.setString(8,lwAmmeterDto.getPrecision());
            dbManager.setString(9,lwAmmeterDto.getRate());
            dbManager.setInt(10,lwAmmeterDto.getMaxnum());
            dbManager.setString(11,lwAmmeterDto.getAllowYear());
            dbManager.setString(12,lwAmmeterDto.getAllowDate());
            dbManager.setString(13,lwAmmeterDto.getValidStatus());
            dbManager.setString(14,lwAmmeterDto.getFlag());
            dbManager.setString(15,lwAmmeterDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(String ammeterNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwAmmeter ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("AmmeterNo=").append("'").append(ammeterNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,ammeterNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public void update(LwAmmeterDto lwAmmeterDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwAmmeter SET ");
        buffer.append("AmmeterX = ?, ");
        buffer.append("AmmeterV = ?, ");
        buffer.append("AmmeterA = ?, ");
        buffer.append("AmmeterType = ?, ");
        buffer.append("FactoryName = ?, ");
        buffer.append("Coust = ?, ");
        buffer.append("Precision1 = ?, ");
        buffer.append("Rate = ?, ");
        buffer.append("Maxnum = ?, ");
        buffer.append("AllowYear = ?, ");
        buffer.append("AllowDate = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwAmmeter SET ");
            debugBuffer.append("AmmeterX = '" + lwAmmeterDto.getAmmeterX() + "', ");
            debugBuffer.append("AmmeterV = '" + lwAmmeterDto.getAmmeterV() + "', ");
            debugBuffer.append("AmmeterA = '" + lwAmmeterDto.getAmmeterA() + "', ");
            debugBuffer.append("AmmeterType = '" + lwAmmeterDto.getAmmeterType() + "', ");
            debugBuffer.append("FactoryName = '" + lwAmmeterDto.getFactoryName() + "', ");
            debugBuffer.append("Coust = '" + lwAmmeterDto.getCoust() + "', ");
            debugBuffer.append("Precision1 = '" + lwAmmeterDto.getPrecision() + "', ");
            debugBuffer.append("Rate = '" + lwAmmeterDto.getRate() + "', ");
            debugBuffer.append("Maxnum = " + lwAmmeterDto.getMaxnum() + ", ");
            debugBuffer.append("AllowYear = '" + lwAmmeterDto.getAllowYear() + "', ");
            debugBuffer.append("AllowDate = '" + lwAmmeterDto.getAllowDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwAmmeterDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwAmmeterDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwAmmeterDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("AmmeterNo=").append("'").append(lwAmmeterDto.getAmmeterNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwAmmeterDto.getAmmeterX());
        dbManager.setString(2,lwAmmeterDto.getAmmeterV());
        dbManager.setString(3,lwAmmeterDto.getAmmeterA());
        dbManager.setString(4,lwAmmeterDto.getAmmeterType());
        dbManager.setString(5,lwAmmeterDto.getFactoryName());
        dbManager.setString(6,lwAmmeterDto.getCoust());
        dbManager.setString(7,lwAmmeterDto.getPrecision());
        dbManager.setString(8,lwAmmeterDto.getRate());
        dbManager.setInt(9,lwAmmeterDto.getMaxnum());
        dbManager.setString(10,lwAmmeterDto.getAllowYear());
        dbManager.setString(11,lwAmmeterDto.getAllowDate());
        dbManager.setString(12,lwAmmeterDto.getValidStatus());
        dbManager.setString(13,lwAmmeterDto.getFlag());
        dbManager.setString(14,lwAmmeterDto.getRemark());
        //���������ֶ�;
        dbManager.setString(15,lwAmmeterDto.getAmmeterNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param ammeterNo ���
     * @return LwAmmeterDto
     * @throws Exception
     */
    public LwAmmeterDto findByPrimaryKey(String ammeterNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterX,");
        buffer.append("AmmeterV,");
        buffer.append("AmmeterA,");
        buffer.append("AmmeterType,");
        buffer.append("FactoryName,");
        buffer.append("Coust,");
        buffer.append("Precision1,");
        buffer.append("Rate,");
        buffer.append("Maxnum,");
        buffer.append("AllowYear,");
        buffer.append("AllowDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwAmmeter ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("AmmeterNo=").append("'").append(ammeterNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,ammeterNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwAmmeterDto lwAmmeterDto = null;
        if(resultSet.next()){
            lwAmmeterDto = new LwAmmeterDto();
            lwAmmeterDto.setAmmeterNo(dbManager.getString(resultSet,1));
            lwAmmeterDto.setAmmeterX(dbManager.getString(resultSet,2));
            lwAmmeterDto.setAmmeterV(dbManager.getString(resultSet,3));
            lwAmmeterDto.setAmmeterA(dbManager.getString(resultSet,4));
            lwAmmeterDto.setAmmeterType(dbManager.getString(resultSet,5));
            lwAmmeterDto.setFactoryName(dbManager.getString(resultSet,6));
            lwAmmeterDto.setCoust(dbManager.getString(resultSet,7));
            lwAmmeterDto.setPrecision(dbManager.getString(resultSet,8));
            lwAmmeterDto.setRate(dbManager.getString(resultSet,9));
            lwAmmeterDto.setMaxnum(dbManager.getInt(resultSet,10));
            lwAmmeterDto.setAllowYear(dbManager.getString(resultSet,11));
            lwAmmeterDto.setAllowDate(dbManager.getString(resultSet,12));
            lwAmmeterDto.setValidStatus(dbManager.getString(resultSet,13));
            lwAmmeterDto.setFlag(dbManager.getString(resultSet,14));
            lwAmmeterDto.setRemark(dbManager.getString(resultSet,15));
        }
        resultSet.close();
        return lwAmmeterDto;
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
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterX,");
        buffer.append("AmmeterV,");
        buffer.append("AmmeterA,");
        buffer.append("AmmeterType,");
        buffer.append("FactoryName,");
        buffer.append("Coust,");
        buffer.append("Precision1,");
        buffer.append("Rate,");
        buffer.append("Maxnum,");
        buffer.append("AllowYear,");
        buffer.append("AllowDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwAmmeter WHERE ");
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
        LwAmmeterDto lwAmmeterDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwAmmeterDto = new LwAmmeterDto();
            lwAmmeterDto.setAmmeterNo(dbManager.getString(resultSet,"AmmeterNo"));
            lwAmmeterDto.setAmmeterX(dbManager.getString(resultSet,"AmmeterX"));
            lwAmmeterDto.setAmmeterV(dbManager.getString(resultSet,"AmmeterV"));
            lwAmmeterDto.setAmmeterA(dbManager.getString(resultSet,"AmmeterA"));
            lwAmmeterDto.setAmmeterType(dbManager.getString(resultSet,"AmmeterType"));
            lwAmmeterDto.setFactoryName(dbManager.getString(resultSet,"FactoryName"));
            lwAmmeterDto.setCoust(dbManager.getString(resultSet,"Coust"));
            lwAmmeterDto.setPrecision(dbManager.getString(resultSet,"Precision1"));
            lwAmmeterDto.setRate(dbManager.getString(resultSet,"Rate"));
            lwAmmeterDto.setMaxnum(dbManager.getInt(resultSet,"Maxnum"));
            lwAmmeterDto.setAllowYear(dbManager.getString(resultSet,"AllowYear"));
            lwAmmeterDto.setAllowDate(dbManager.getString(resultSet,"AllowDate"));
            lwAmmeterDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwAmmeterDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwAmmeterDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwAmmeterDto);
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
        buffer.append("DELETE FROM LwAmmeter WHERE ");
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
        buffer.append("SELECT count(*) FROM LwAmmeter WHERE ");
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
