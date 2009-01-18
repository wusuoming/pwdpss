package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.SubjoinFeeDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����subjoinFee-���ӷ��ñ�����ݷ��ʶ������<br>
 */
public class DBSubjoinFeeBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBSubjoinFeeBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBSubjoinFeeBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public void insert(SubjoinFeeDto subjoinFeeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO SubjoinFee (");
        buffer.append("PowerType,");
        buffer.append("Name,");
        buffer.append("NongwanghuanDai,");
        buffer.append("SanXia,");
        buffer.append("Kuquyimin,");
        buffer.append("Kezaishengnengyuan ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(subjoinFeeDto.getPowerType()).append("',");
            debugBuffer.append("'").append(subjoinFeeDto.getName()).append("',");
            debugBuffer.append("").append(subjoinFeeDto.getNongwanghuanDai()).append(",");
            debugBuffer.append("").append(subjoinFeeDto.getSanXia()).append(",");
            debugBuffer.append("").append(subjoinFeeDto.getKuquyimin()).append(",");
            debugBuffer.append("").append(subjoinFeeDto.getKezaishengnengyuan()).append(")");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,subjoinFeeDto.getPowerType());
        dbManager.setString(2,subjoinFeeDto.getName());
        dbManager.setDouble(3,subjoinFeeDto.getNongwanghuanDai());
        dbManager.setDouble(4,subjoinFeeDto.getSanXia());
        dbManager.setDouble(5,subjoinFeeDto.getKuquyimin());
        dbManager.setDouble(6,subjoinFeeDto.getKezaishengnengyuan());
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
        buffer.append("INSERT INTO SubjoinFee (");
        buffer.append("PowerType,");
        buffer.append("Name,");
        buffer.append("NongwanghuanDai,");
        buffer.append("SanXia,");
        buffer.append("Kuquyimin,");
        buffer.append("Kezaishengnengyuan ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            SubjoinFeeDto subjoinFeeDto = (SubjoinFeeDto)i.next();
            dbManager.setString(1,subjoinFeeDto.getPowerType());
            dbManager.setString(2,subjoinFeeDto.getName());
            dbManager.setDouble(3,subjoinFeeDto.getNongwanghuanDai());
            dbManager.setDouble(4,subjoinFeeDto.getSanXia());
            dbManager.setDouble(5,subjoinFeeDto.getKuquyimin());
            dbManager.setDouble(6,subjoinFeeDto.getKezaishengnengyuan());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param powerType �õ����
     * @throws Exception
     */
    public void delete(String powerType)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM SubjoinFee ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerType=").append("'").append(powerType).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,powerType);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public void update(SubjoinFeeDto subjoinFeeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE SubjoinFee SET ");
        buffer.append("Name = ?, ");
        buffer.append("NongwanghuanDai = ?, ");
        buffer.append("SanXia = ?, ");
        buffer.append("Kuquyimin = ?, ");
        buffer.append("Kezaishengnengyuan = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE SubjoinFee SET ");
            debugBuffer.append("Name = '" + subjoinFeeDto.getName() + "', ");
            debugBuffer.append("NongwanghuanDai = " + subjoinFeeDto.getNongwanghuanDai() + ", ");
            debugBuffer.append("SanXia = " + subjoinFeeDto.getSanXia() + ", ");
            debugBuffer.append("Kuquyimin = " + subjoinFeeDto.getKuquyimin() + ", ");
            debugBuffer.append("Kezaishengnengyuan = " + subjoinFeeDto.getKezaishengnengyuan() + " ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerType=").append("'").append(subjoinFeeDto.getPowerType()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,subjoinFeeDto.getName());
        dbManager.setDouble(2,subjoinFeeDto.getNongwanghuanDai());
        dbManager.setDouble(3,subjoinFeeDto.getSanXia());
        dbManager.setDouble(4,subjoinFeeDto.getKuquyimin());
        dbManager.setDouble(5,subjoinFeeDto.getKezaishengnengyuan());
        //���������ֶ�;
        dbManager.setString(6,subjoinFeeDto.getPowerType());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param powerType �õ����
     * @return SubjoinFeeDto
     * @throws Exception
     */
    public SubjoinFeeDto findByPrimaryKey(String powerType)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("PowerType,");
        buffer.append("Name,");
        buffer.append("NongwanghuanDai,");
        buffer.append("SanXia,");
        buffer.append("Kuquyimin,");
        buffer.append("Kezaishengnengyuan ");
        buffer.append("FROM SubjoinFee ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerType=").append("'").append(powerType).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,powerType);
        ResultSet resultSet = dbManager.executePreparedQuery();
        SubjoinFeeDto subjoinFeeDto = null;
        if(resultSet.next()){
            subjoinFeeDto = new SubjoinFeeDto();
            subjoinFeeDto.setPowerType(dbManager.getString(resultSet,1));
            subjoinFeeDto.setName(dbManager.getString(resultSet,2));
            subjoinFeeDto.setNongwanghuanDai(dbManager.getDouble(resultSet,3));
            subjoinFeeDto.setSanXia(dbManager.getDouble(resultSet,4));
            subjoinFeeDto.setKuquyimin(dbManager.getDouble(resultSet,5));
            subjoinFeeDto.setKezaishengnengyuan(dbManager.getDouble(resultSet,6));
        }
        resultSet.close();
        return subjoinFeeDto;
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
        buffer.append("PowerType,");
        buffer.append("Name,");
        buffer.append("NongwanghuanDai,");
        buffer.append("SanXia,");
        buffer.append("Kuquyimin,");
        buffer.append("Kezaishengnengyuan ");
        buffer.append("FROM SubjoinFee WHERE ");
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
        SubjoinFeeDto subjoinFeeDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            subjoinFeeDto = new SubjoinFeeDto();
            subjoinFeeDto.setPowerType(dbManager.getString(resultSet,"PowerType"));
            subjoinFeeDto.setName(dbManager.getString(resultSet,"Name"));
            subjoinFeeDto.setNongwanghuanDai(dbManager.getDouble(resultSet,"NongwanghuanDai"));
            subjoinFeeDto.setSanXia(dbManager.getDouble(resultSet,"SanXia"));
            subjoinFeeDto.setKuquyimin(dbManager.getDouble(resultSet,"Kuquyimin"));
            subjoinFeeDto.setKezaishengnengyuan(dbManager.getDouble(resultSet,"Kezaishengnengyuan"));
            collection.add(subjoinFeeDto);
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
        buffer.append("DELETE FROM SubjoinFee WHERE ");
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
        buffer.append("SELECT count(*) FROM SubjoinFee WHERE ");
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
