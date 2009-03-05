package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwShouShuTableDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwShouShuTable-������ñ�����ݷ��ʶ������<br>
 */
public class DBLwShouShuTableBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwShouShuTableBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwShouShuTableBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public void insert(LwShouShuTableDto lwShouShuTableDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwShouShuTable (");
        buffer.append("Month,");
        buffer.append("FeeType,");
        buffer.append("Extends3,");
        buffer.append("Extends2,");
        buffer.append("Power,");
        buffer.append("ChunDianFei,");
        buffer.append("DianFeiTax,");
        buffer.append("SumDianFee,");
        buffer.append("DiffrentFei,");
        buffer.append("DiffrentFeiTax,");
        buffer.append("DianJin,");
        buffer.append("DianJinTax,");
        buffer.append("Jijin,");
        buffer.append("JinjinTax,");
        buffer.append("SanXia,");
        buffer.append("SanXiaTax,");
        buffer.append("SumFee,");
        buffer.append("Extends1 ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwShouShuTableDto.getMonth()).append("',");
            debugBuffer.append("'").append(lwShouShuTableDto.getFeeType()).append("',");
            debugBuffer.append("").append(lwShouShuTableDto.getExtends3()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getExtends2()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getPower()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getChunDianFei()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getDianFeiTax()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getSumDianFee()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getDiffrentFei()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getDiffrentFeiTax()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getDianJin()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getDianJinTax()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getJijin()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getJinjinTax()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getSanXia()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getSanXiaTax()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getSumFee()).append(",");
            debugBuffer.append("").append(lwShouShuTableDto.getExtends1()).append(")");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwShouShuTableDto.getMonth());
        dbManager.setString(2,lwShouShuTableDto.getFeeType());
        dbManager.setDouble(3,lwShouShuTableDto.getExtends3());
        dbManager.setDouble(4,lwShouShuTableDto.getExtends2());
        dbManager.setDouble(5,lwShouShuTableDto.getPower());
        dbManager.setDouble(6,lwShouShuTableDto.getChunDianFei());
        dbManager.setDouble(7,lwShouShuTableDto.getDianFeiTax());
        dbManager.setDouble(8,lwShouShuTableDto.getSumDianFee());
        dbManager.setDouble(9,lwShouShuTableDto.getDiffrentFei());
        dbManager.setDouble(10,lwShouShuTableDto.getDiffrentFeiTax());
        dbManager.setDouble(11,lwShouShuTableDto.getDianJin());
        dbManager.setDouble(12,lwShouShuTableDto.getDianJinTax());
        dbManager.setDouble(13,lwShouShuTableDto.getJijin());
        dbManager.setDouble(14,lwShouShuTableDto.getJinjinTax());
        dbManager.setDouble(15,lwShouShuTableDto.getSanXia());
        dbManager.setDouble(16,lwShouShuTableDto.getSanXiaTax());
        dbManager.setDouble(17,lwShouShuTableDto.getSumFee());
        dbManager.setDouble(18,lwShouShuTableDto.getExtends1());
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
        buffer.append("INSERT INTO LwShouShuTable (");
        buffer.append("Month,");
        buffer.append("FeeType,");
        buffer.append("Extends3,");
        buffer.append("Extends2,");
        buffer.append("Power,");
        buffer.append("ChunDianFei,");
        buffer.append("DianFeiTax,");
        buffer.append("SumDianFee,");
        buffer.append("DiffrentFei,");
        buffer.append("DiffrentFeiTax,");
        buffer.append("DianJin,");
        buffer.append("DianJinTax,");
        buffer.append("Jijin,");
        buffer.append("JinjinTax,");
        buffer.append("SanXia,");
        buffer.append("SanXiaTax,");
        buffer.append("SumFee,");
        buffer.append("Extends1 ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwShouShuTableDto lwShouShuTableDto = (LwShouShuTableDto)i.next();
            dbManager.setString(1,lwShouShuTableDto.getMonth());
            dbManager.setString(2,lwShouShuTableDto.getFeeType());
            dbManager.setDouble(3,lwShouShuTableDto.getExtends3());
            dbManager.setDouble(4,lwShouShuTableDto.getExtends2());
            dbManager.setDouble(5,lwShouShuTableDto.getPower());
            dbManager.setDouble(6,lwShouShuTableDto.getChunDianFei());
            dbManager.setDouble(7,lwShouShuTableDto.getDianFeiTax());
            dbManager.setDouble(8,lwShouShuTableDto.getSumDianFee());
            dbManager.setDouble(9,lwShouShuTableDto.getDiffrentFei());
            dbManager.setDouble(10,lwShouShuTableDto.getDiffrentFeiTax());
            dbManager.setDouble(11,lwShouShuTableDto.getDianJin());
            dbManager.setDouble(12,lwShouShuTableDto.getDianJinTax());
            dbManager.setDouble(13,lwShouShuTableDto.getJijin());
            dbManager.setDouble(14,lwShouShuTableDto.getJinjinTax());
            dbManager.setDouble(15,lwShouShuTableDto.getSanXia());
            dbManager.setDouble(16,lwShouShuTableDto.getSanXiaTax());
            dbManager.setDouble(17,lwShouShuTableDto.getSumFee());
            dbManager.setDouble(18,lwShouShuTableDto.getExtends1());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param month �·�
     * @param feeType �������
     * @throws Exception
     */
    public void delete(String month,String feeType)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwShouShuTable ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("Month=").append("'").append(month).append("' AND ");
            debugBuffer.append("FeeType=").append("'").append(feeType).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Month = ? And ");
        buffer.append("FeeType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,month);
        dbManager.setString(2,feeType);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public void update(LwShouShuTableDto lwShouShuTableDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwShouShuTable SET ");
        buffer.append("Extends3 = ?, ");
        buffer.append("Extends2 = ?, ");
        buffer.append("Power = ?, ");
        buffer.append("ChunDianFei = ?, ");
        buffer.append("DianFeiTax = ?, ");
        buffer.append("SumDianFee = ?, ");
        buffer.append("DiffrentFei = ?, ");
        buffer.append("DiffrentFeiTax = ?, ");
        buffer.append("DianJin = ?, ");
        buffer.append("DianJinTax = ?, ");
        buffer.append("Jijin = ?, ");
        buffer.append("JinjinTax = ?, ");
        buffer.append("SanXia = ?, ");
        buffer.append("SanXiaTax = ?, ");
        buffer.append("SumFee = ?, ");
        buffer.append("Extends1 = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwShouShuTable SET ");
            debugBuffer.append("Extends3 = " + lwShouShuTableDto.getExtends3() + ", ");
            debugBuffer.append("Extends2 = " + lwShouShuTableDto.getExtends2() + ", ");
            debugBuffer.append("Power = " + lwShouShuTableDto.getPower() + ", ");
            debugBuffer.append("ChunDianFei = " + lwShouShuTableDto.getChunDianFei() + ", ");
            debugBuffer.append("DianFeiTax = " + lwShouShuTableDto.getDianFeiTax() + ", ");
            debugBuffer.append("SumDianFee = " + lwShouShuTableDto.getSumDianFee() + ", ");
            debugBuffer.append("DiffrentFei = " + lwShouShuTableDto.getDiffrentFei() + ", ");
            debugBuffer.append("DiffrentFeiTax = " + lwShouShuTableDto.getDiffrentFeiTax() + ", ");
            debugBuffer.append("DianJin = " + lwShouShuTableDto.getDianJin() + ", ");
            debugBuffer.append("DianJinTax = " + lwShouShuTableDto.getDianJinTax() + ", ");
            debugBuffer.append("Jijin = " + lwShouShuTableDto.getJijin() + ", ");
            debugBuffer.append("JinjinTax = " + lwShouShuTableDto.getJinjinTax() + ", ");
            debugBuffer.append("SanXia = " + lwShouShuTableDto.getSanXia() + ", ");
            debugBuffer.append("SanXiaTax = " + lwShouShuTableDto.getSanXiaTax() + ", ");
            debugBuffer.append("SumFee = " + lwShouShuTableDto.getSumFee() + ", ");
            debugBuffer.append("Extends1 = " + lwShouShuTableDto.getExtends1() + " ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("Month=").append("'").append(lwShouShuTableDto.getMonth()).append("' AND ");
            debugBuffer.append("FeeType=").append("'").append(lwShouShuTableDto.getFeeType()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Month = ? And ");
        buffer.append("FeeType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setDouble(1,lwShouShuTableDto.getExtends3());
        dbManager.setDouble(2,lwShouShuTableDto.getExtends2());
        dbManager.setDouble(3,lwShouShuTableDto.getPower());
        dbManager.setDouble(4,lwShouShuTableDto.getChunDianFei());
        dbManager.setDouble(5,lwShouShuTableDto.getDianFeiTax());
        dbManager.setDouble(6,lwShouShuTableDto.getSumDianFee());
        dbManager.setDouble(7,lwShouShuTableDto.getDiffrentFei());
        dbManager.setDouble(8,lwShouShuTableDto.getDiffrentFeiTax());
        dbManager.setDouble(9,lwShouShuTableDto.getDianJin());
        dbManager.setDouble(10,lwShouShuTableDto.getDianJinTax());
        dbManager.setDouble(11,lwShouShuTableDto.getJijin());
        dbManager.setDouble(12,lwShouShuTableDto.getJinjinTax());
        dbManager.setDouble(13,lwShouShuTableDto.getSanXia());
        dbManager.setDouble(14,lwShouShuTableDto.getSanXiaTax());
        dbManager.setDouble(15,lwShouShuTableDto.getSumFee());
        dbManager.setDouble(16,lwShouShuTableDto.getExtends1());
        //���������ֶ�;
        dbManager.setString(17,lwShouShuTableDto.getMonth());
        dbManager.setString(18,lwShouShuTableDto.getFeeType());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param month �·�
     * @param feeType �������
     * @return LwShouShuTableDto
     * @throws Exception
     */
    public LwShouShuTableDto findByPrimaryKey(String month,String feeType)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("Month,");
        buffer.append("FeeType,");
        buffer.append("Extends3,");
        buffer.append("Extends2,");
        buffer.append("Power,");
        buffer.append("ChunDianFei,");
        buffer.append("DianFeiTax,");
        buffer.append("SumDianFee,");
        buffer.append("DiffrentFei,");
        buffer.append("DiffrentFeiTax,");
        buffer.append("DianJin,");
        buffer.append("DianJinTax,");
        buffer.append("Jijin,");
        buffer.append("JinjinTax,");
        buffer.append("SanXia,");
        buffer.append("SanXiaTax,");
        buffer.append("SumFee,");
        buffer.append("Extends1 ");
        buffer.append("FROM LwShouShuTable ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("Month=").append("'").append(month).append("' AND ");
            debugBuffer.append("FeeType=").append("'").append(feeType).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Month = ? And ");
        buffer.append("FeeType = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,month);
        dbManager.setString(2,feeType);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwShouShuTableDto lwShouShuTableDto = null;
        if(resultSet.next()){
            lwShouShuTableDto = new LwShouShuTableDto();
            lwShouShuTableDto.setMonth(dbManager.getString(resultSet,1));
            lwShouShuTableDto.setFeeType(dbManager.getString(resultSet,2));
            lwShouShuTableDto.setExtends3(dbManager.getDouble(resultSet,3));
            lwShouShuTableDto.setExtends2(dbManager.getDouble(resultSet,4));
            lwShouShuTableDto.setPower(dbManager.getDouble(resultSet,5));
            lwShouShuTableDto.setChunDianFei(dbManager.getDouble(resultSet,6));
            lwShouShuTableDto.setDianFeiTax(dbManager.getDouble(resultSet,7));
            lwShouShuTableDto.setSumDianFee(dbManager.getDouble(resultSet,8));
            lwShouShuTableDto.setDiffrentFei(dbManager.getDouble(resultSet,9));
            lwShouShuTableDto.setDiffrentFeiTax(dbManager.getDouble(resultSet,10));
            lwShouShuTableDto.setDianJin(dbManager.getDouble(resultSet,11));
            lwShouShuTableDto.setDianJinTax(dbManager.getDouble(resultSet,12));
            lwShouShuTableDto.setJijin(dbManager.getDouble(resultSet,13));
            lwShouShuTableDto.setJinjinTax(dbManager.getDouble(resultSet,14));
            lwShouShuTableDto.setSanXia(dbManager.getDouble(resultSet,15));
            lwShouShuTableDto.setSanXiaTax(dbManager.getDouble(resultSet,16));
            lwShouShuTableDto.setSumFee(dbManager.getDouble(resultSet,17));
            lwShouShuTableDto.setExtends1(dbManager.getDouble(resultSet,18));
        }
        resultSet.close();
        return lwShouShuTableDto;
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
        buffer.append("Month,");
        buffer.append("FeeType,");
        buffer.append("Extends3,");
        buffer.append("Extends2,");
        buffer.append("Power,");
        buffer.append("ChunDianFei,");
        buffer.append("DianFeiTax,");
        buffer.append("SumDianFee,");
        buffer.append("DiffrentFei,");
        buffer.append("DiffrentFeiTax,");
        buffer.append("DianJin,");
        buffer.append("DianJinTax,");
        buffer.append("Jijin,");
        buffer.append("JinjinTax,");
        buffer.append("SanXia,");
        buffer.append("SanXiaTax,");
        buffer.append("SumFee,");
        buffer.append("Extends1 ");
        buffer.append("FROM LwShouShuTable WHERE ");
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
        LwShouShuTableDto lwShouShuTableDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwShouShuTableDto = new LwShouShuTableDto();
            lwShouShuTableDto.setMonth(dbManager.getString(resultSet,"Month"));
            lwShouShuTableDto.setFeeType(dbManager.getString(resultSet,"FeeType"));
            lwShouShuTableDto.setExtends3(dbManager.getDouble(resultSet,"Extends3"));
            lwShouShuTableDto.setExtends2(dbManager.getDouble(resultSet,"Extends2"));
            lwShouShuTableDto.setPower(dbManager.getDouble(resultSet,"Power"));
            lwShouShuTableDto.setChunDianFei(dbManager.getDouble(resultSet,"ChunDianFei"));
            lwShouShuTableDto.setDianFeiTax(dbManager.getDouble(resultSet,"DianFeiTax"));
            lwShouShuTableDto.setSumDianFee(dbManager.getDouble(resultSet,"SumDianFee"));
            lwShouShuTableDto.setDiffrentFei(dbManager.getDouble(resultSet,"DiffrentFei"));
            lwShouShuTableDto.setDiffrentFeiTax(dbManager.getDouble(resultSet,"DiffrentFeiTax"));
            lwShouShuTableDto.setDianJin(dbManager.getDouble(resultSet,"DianJin"));
            lwShouShuTableDto.setDianJinTax(dbManager.getDouble(resultSet,"DianJinTax"));
            lwShouShuTableDto.setJijin(dbManager.getDouble(resultSet,"Jijin"));
            lwShouShuTableDto.setJinjinTax(dbManager.getDouble(resultSet,"JinjinTax"));
            lwShouShuTableDto.setSanXia(dbManager.getDouble(resultSet,"SanXia"));
            lwShouShuTableDto.setSanXiaTax(dbManager.getDouble(resultSet,"SanXiaTax"));
            lwShouShuTableDto.setSumFee(dbManager.getDouble(resultSet,"SumFee"));
            lwShouShuTableDto.setExtends1(dbManager.getDouble(resultSet,"Extends1"));
            collection.add(lwShouShuTableDto);
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
        buffer.append("DELETE FROM LwShouShuTable WHERE ");
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
        buffer.append("SELECT count(*) FROM LwShouShuTable WHERE ");
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
