package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwAllWholeFee-趸售总费用表的数据访问对象基类<br>
 */
public class DBLwAllWholeFeeBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwAllWholeFeeBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwAllWholeFeeBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public void insert(LwAllWholeFeeDto lwAllWholeFeeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwAllWholeFee (");
        buffer.append("Company,");
        buffer.append("Inputdate,");
        buffer.append("Power1,");
        buffer.append("Dianfei,");
        buffer.append("Sanxia,");
        buffer.append("Dianjin,");
        buffer.append("Jijin,");
        buffer.append("Dianfeitax,");
        buffer.append("Sanxiatax,");
        buffer.append("Dianjintax,");
        buffer.append("Sumfee,");
        buffer.append("Haiminglu,");
        buffer.append("Duobian,");
        buffer.append("Zhuijia,");
        buffer.append("Fujia1,");
        buffer.append("Fujia2,");
        buffer.append("Fujia3 ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getCompany()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getInputdate()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getPower1()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getDianfei()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getSanxia()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getDianjin()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getJijin()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getDianfeitax()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getSanxiatax()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getDianjintax()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getSumfee()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getHaiminglu()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getDuobian()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getZhuijia()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getFujia1()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getFujia2()).append("',");
            debugBuffer.append("'").append(lwAllWholeFeeDto.getFujia3()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwAllWholeFeeDto.getCompany());
        dbManager.setString(2,lwAllWholeFeeDto.getInputdate());
        dbManager.setString(3,lwAllWholeFeeDto.getPower1());
        dbManager.setString(4,lwAllWholeFeeDto.getDianfei());
        dbManager.setString(5,lwAllWholeFeeDto.getSanxia());
        dbManager.setString(6,lwAllWholeFeeDto.getDianjin());
        dbManager.setString(7,lwAllWholeFeeDto.getJijin());
        dbManager.setString(8,lwAllWholeFeeDto.getDianfeitax());
        dbManager.setString(9,lwAllWholeFeeDto.getSanxiatax());
        dbManager.setString(10,lwAllWholeFeeDto.getDianjintax());
        dbManager.setString(11,lwAllWholeFeeDto.getSumfee());
        dbManager.setString(12,lwAllWholeFeeDto.getHaiminglu());
        dbManager.setString(13,lwAllWholeFeeDto.getDuobian());
        dbManager.setString(14,lwAllWholeFeeDto.getZhuijia());
        dbManager.setString(15,lwAllWholeFeeDto.getFujia1());
        dbManager.setString(16,lwAllWholeFeeDto.getFujia2());
        dbManager.setString(17,lwAllWholeFeeDto.getFujia3());
        dbManager.executePreparedUpdate();

    }

    /**
     * 采用批方式插入多条数据
     * @param collection collection
     * @throws Exception
     */
    public void insertAll(Collection collection)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwAllWholeFee (");
        buffer.append("Company,");
        buffer.append("Inputdate,");
        buffer.append("Power1,");
        buffer.append("Dianfei,");
        buffer.append("Sanxia,");
        buffer.append("Dianjin,");
        buffer.append("Jijin,");
        buffer.append("Dianfeitax,");
        buffer.append("Sanxiatax,");
        buffer.append("Dianjintax,");
        buffer.append("Sumfee,");
        buffer.append("Haiminglu,");
        buffer.append("Duobian,");
        buffer.append("Zhuijia,");
        buffer.append("Fujia1,");
        buffer.append("Fujia2,");
        buffer.append("Fujia3 ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwAllWholeFeeDto lwAllWholeFeeDto = (LwAllWholeFeeDto)i.next();
            dbManager.setString(1,lwAllWholeFeeDto.getCompany());
            dbManager.setString(2,lwAllWholeFeeDto.getInputdate());
            dbManager.setString(3,lwAllWholeFeeDto.getPower1());
            dbManager.setString(4,lwAllWholeFeeDto.getDianfei());
            dbManager.setString(5,lwAllWholeFeeDto.getSanxia());
            dbManager.setString(6,lwAllWholeFeeDto.getDianjin());
            dbManager.setString(7,lwAllWholeFeeDto.getJijin());
            dbManager.setString(8,lwAllWholeFeeDto.getDianfeitax());
            dbManager.setString(9,lwAllWholeFeeDto.getSanxiatax());
            dbManager.setString(10,lwAllWholeFeeDto.getDianjintax());
            dbManager.setString(11,lwAllWholeFeeDto.getSumfee());
            dbManager.setString(12,lwAllWholeFeeDto.getHaiminglu());
            dbManager.setString(13,lwAllWholeFeeDto.getDuobian());
            dbManager.setString(14,lwAllWholeFeeDto.getZhuijia());
            dbManager.setString(15,lwAllWholeFeeDto.getFujia1());
            dbManager.setString(16,lwAllWholeFeeDto.getFujia2());
            dbManager.setString(17,lwAllWholeFeeDto.getFujia3());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param company 趸售公司
     * @param inputdate 年月
     * @throws Exception
     */
    public void delete(String company,String inputdate)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwAllWholeFee ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("Company=").append("'").append(company).append("' AND ");
            debugBuffer.append("Inputdate=").append("'").append(inputdate).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Company = ? And ");
        buffer.append("Inputdate = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,company);
        dbManager.setString(2,inputdate);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public void update(LwAllWholeFeeDto lwAllWholeFeeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwAllWholeFee SET ");
        buffer.append("Power1 = ?, ");
        buffer.append("Dianfei = ?, ");
        buffer.append("Sanxia = ?, ");
        buffer.append("Dianjin = ?, ");
        buffer.append("Jijin = ?, ");
        buffer.append("Dianfeitax = ?, ");
        buffer.append("Sanxiatax = ?, ");
        buffer.append("Dianjintax = ?, ");
        buffer.append("Sumfee = ?, ");
        buffer.append("Haiminglu = ?, ");
        buffer.append("Duobian = ?, ");
        buffer.append("Zhuijia = ?, ");
        buffer.append("Fujia1 = ?, ");
        buffer.append("Fujia2 = ?, ");
        buffer.append("Fujia3 = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwAllWholeFee SET ");
            debugBuffer.append("Power1 = '" + lwAllWholeFeeDto.getPower1() + "', ");
            debugBuffer.append("Dianfei = '" + lwAllWholeFeeDto.getDianfei() + "', ");
            debugBuffer.append("Sanxia = '" + lwAllWholeFeeDto.getSanxia() + "', ");
            debugBuffer.append("Dianjin = '" + lwAllWholeFeeDto.getDianjin() + "', ");
            debugBuffer.append("Jijin = '" + lwAllWholeFeeDto.getJijin() + "', ");
            debugBuffer.append("Dianfeitax = '" + lwAllWholeFeeDto.getDianfeitax() + "', ");
            debugBuffer.append("Sanxiatax = '" + lwAllWholeFeeDto.getSanxiatax() + "', ");
            debugBuffer.append("Dianjintax = '" + lwAllWholeFeeDto.getDianjintax() + "', ");
            debugBuffer.append("Sumfee = '" + lwAllWholeFeeDto.getSumfee() + "', ");
            debugBuffer.append("Haiminglu = '" + lwAllWholeFeeDto.getHaiminglu() + "', ");
            debugBuffer.append("Duobian = '" + lwAllWholeFeeDto.getDuobian() + "', ");
            debugBuffer.append("Zhuijia = '" + lwAllWholeFeeDto.getZhuijia() + "', ");
            debugBuffer.append("Fujia1 = '" + lwAllWholeFeeDto.getFujia1() + "', ");
            debugBuffer.append("Fujia2 = '" + lwAllWholeFeeDto.getFujia2() + "', ");
            debugBuffer.append("Fujia3 = '" + lwAllWholeFeeDto.getFujia3() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("Company=").append("'").append(lwAllWholeFeeDto.getCompany()).append("' AND ");
            debugBuffer.append("Inputdate=").append("'").append(lwAllWholeFeeDto.getInputdate()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Company = ? And ");
        buffer.append("Inputdate = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwAllWholeFeeDto.getPower1());
        dbManager.setString(2,lwAllWholeFeeDto.getDianfei());
        dbManager.setString(3,lwAllWholeFeeDto.getSanxia());
        dbManager.setString(4,lwAllWholeFeeDto.getDianjin());
        dbManager.setString(5,lwAllWholeFeeDto.getJijin());
        dbManager.setString(6,lwAllWholeFeeDto.getDianfeitax());
        dbManager.setString(7,lwAllWholeFeeDto.getSanxiatax());
        dbManager.setString(8,lwAllWholeFeeDto.getDianjintax());
        dbManager.setString(9,lwAllWholeFeeDto.getSumfee());
        dbManager.setString(10,lwAllWholeFeeDto.getHaiminglu());
        dbManager.setString(11,lwAllWholeFeeDto.getDuobian());
        dbManager.setString(12,lwAllWholeFeeDto.getZhuijia());
        dbManager.setString(13,lwAllWholeFeeDto.getFujia1());
        dbManager.setString(14,lwAllWholeFeeDto.getFujia2());
        dbManager.setString(15,lwAllWholeFeeDto.getFujia3());
        //设置条件字段;
        dbManager.setString(16,lwAllWholeFeeDto.getCompany());
        dbManager.setString(17,lwAllWholeFeeDto.getInputdate());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param company 趸售公司
     * @param inputdate 年月
     * @return LwAllWholeFeeDto
     * @throws Exception
     */
    public LwAllWholeFeeDto findByPrimaryKey(String company,String inputdate)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("Company,");
        buffer.append("Inputdate,");
        buffer.append("Power1,");
        buffer.append("Dianfei,");
        buffer.append("Sanxia,");
        buffer.append("Dianjin,");
        buffer.append("Jijin,");
        buffer.append("Dianfeitax,");
        buffer.append("Sanxiatax,");
        buffer.append("Dianjintax,");
        buffer.append("Sumfee,");
        buffer.append("Haiminglu,");
        buffer.append("Duobian,");
        buffer.append("Zhuijia,");
        buffer.append("Fujia1,");
        buffer.append("Fujia2,");
        buffer.append("Fujia3 ");
        buffer.append("FROM LwAllWholeFee ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("Company=").append("'").append(company).append("' AND ");
            debugBuffer.append("Inputdate=").append("'").append(inputdate).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Company = ? And ");
        buffer.append("Inputdate = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,company);
        dbManager.setString(2,inputdate);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwAllWholeFeeDto lwAllWholeFeeDto = null;
        if(resultSet.next()){
            lwAllWholeFeeDto = new LwAllWholeFeeDto();
            lwAllWholeFeeDto.setCompany(dbManager.getString(resultSet,1));
            lwAllWholeFeeDto.setInputdate(dbManager.getString(resultSet,2));
            lwAllWholeFeeDto.setPower1(dbManager.getString(resultSet,3));
            lwAllWholeFeeDto.setDianfei(dbManager.getString(resultSet,4));
            lwAllWholeFeeDto.setSanxia(dbManager.getString(resultSet,5));
            lwAllWholeFeeDto.setDianjin(dbManager.getString(resultSet,6));
            lwAllWholeFeeDto.setJijin(dbManager.getString(resultSet,7));
            lwAllWholeFeeDto.setDianfeitax(dbManager.getString(resultSet,8));
            lwAllWholeFeeDto.setSanxiatax(dbManager.getString(resultSet,9));
            lwAllWholeFeeDto.setDianjintax(dbManager.getString(resultSet,10));
            lwAllWholeFeeDto.setSumfee(dbManager.getString(resultSet,11));
            lwAllWholeFeeDto.setHaiminglu(dbManager.getString(resultSet,12));
            lwAllWholeFeeDto.setDuobian(dbManager.getString(resultSet,13));
            lwAllWholeFeeDto.setZhuijia(dbManager.getString(resultSet,14));
            lwAllWholeFeeDto.setFujia1(dbManager.getString(resultSet,15));
            lwAllWholeFeeDto.setFujia2(dbManager.getString(resultSet,16));
            lwAllWholeFeeDto.setFujia3(dbManager.getString(resultSet,17));
        }
        resultSet.close();
        return lwAllWholeFeeDto;
    }

    /**
     * 按条件查询多条数据
     * @param conditions 查询条件
     * @param pageNo 页号
     * @param rowsPerPage 每页的行数
     * @return Collection
     * @throws Exception
     */
    public Collection findByConditions(String conditions,int pageNo,int rowsPerPage)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("Company,");
        buffer.append("Inputdate,");
        buffer.append("Power1,");
        buffer.append("Dianfei,");
        buffer.append("Sanxia,");
        buffer.append("Dianjin,");
        buffer.append("Jijin,");
        buffer.append("Dianfeitax,");
        buffer.append("Sanxiatax,");
        buffer.append("Dianjintax,");
        buffer.append("Sumfee,");
        buffer.append("Haiminglu,");
        buffer.append("Duobian,");
        buffer.append("Zhuijia,");
        buffer.append("Fujia1,");
        buffer.append("Fujia2,");
        buffer.append("Fujia3 ");
        buffer.append("FROM LwAllWholeFee WHERE ");
        buffer.append(conditions);
        boolean supportPaging = false;//数据库是否支持分页
        if (pageNo > 0){
            //对Oracle优化
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

        //定义返回结果集合
        Collection collection = new ArrayList(rowsPerPage);
        LwAllWholeFeeDto lwAllWholeFeeDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwAllWholeFeeDto = new LwAllWholeFeeDto();
            lwAllWholeFeeDto.setCompany(dbManager.getString(resultSet,"Company"));
            lwAllWholeFeeDto.setInputdate(dbManager.getString(resultSet,"Inputdate"));
            lwAllWholeFeeDto.setPower1(dbManager.getString(resultSet,"Power1"));
            lwAllWholeFeeDto.setDianfei(dbManager.getString(resultSet,"Dianfei"));
            lwAllWholeFeeDto.setSanxia(dbManager.getString(resultSet,"Sanxia"));
            lwAllWholeFeeDto.setDianjin(dbManager.getString(resultSet,"Dianjin"));
            lwAllWholeFeeDto.setJijin(dbManager.getString(resultSet,"Jijin"));
            lwAllWholeFeeDto.setDianfeitax(dbManager.getString(resultSet,"Dianfeitax"));
            lwAllWholeFeeDto.setSanxiatax(dbManager.getString(resultSet,"Sanxiatax"));
            lwAllWholeFeeDto.setDianjintax(dbManager.getString(resultSet,"Dianjintax"));
            lwAllWholeFeeDto.setSumfee(dbManager.getString(resultSet,"Sumfee"));
            lwAllWholeFeeDto.setHaiminglu(dbManager.getString(resultSet,"Haiminglu"));
            lwAllWholeFeeDto.setDuobian(dbManager.getString(resultSet,"Duobian"));
            lwAllWholeFeeDto.setZhuijia(dbManager.getString(resultSet,"Zhuijia"));
            lwAllWholeFeeDto.setFujia1(dbManager.getString(resultSet,"Fujia1"));
            lwAllWholeFeeDto.setFujia2(dbManager.getString(resultSet,"Fujia2"));
            lwAllWholeFeeDto.setFujia3(dbManager.getString(resultSet,"Fujia3"));
            collection.add(lwAllWholeFeeDto);
        }
        resultSet.close();
        return collection;
    }

    /**
     * 按条件查询多条数据
     * @param conditions 查询条件
     * @return Collection
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
            throws Exception{
        return findByConditions(conditions,0,0);
    }

    /**
     * 按条件删除数据
     * @param conditions 查询条件
     * @return 删除的行数
     * @throws Exception
     */
    public int deleteByConditions(String conditions)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwAllWholeFee WHERE ");
        buffer.append(conditions);
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        int count = dbManager.executeUpdate(buffer.toString());
        return count;
    }

    /**
     * 查询满足模糊查询条件的记录数
     * @param conditions conditions
     * @return 满足模糊查询条件的记录数
     * @throws Exception
     */
    public int getCount(String conditions) 
        throws Exception{
        int count = -1;
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("SELECT count(*) FROM LwAllWholeFee WHERE ");
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
