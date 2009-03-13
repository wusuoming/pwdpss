package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownProrateAppendDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownProrateAppend-������̯׷�ӱ�����ݷ��ʶ������<br>
 */
public class DBLwTownProrateAppendBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwTownProrateAppendBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwTownProrateAppendBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public void insert(LwTownProrateAppendDto lwTownProrateAppendDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwTownProrateAppend (");
        buffer.append("UserNo,");
        buffer.append("Agricultural,");
        buffer.append("Produce,");
        buffer.append("Resident,");
        buffer.append("Indecisive,");
        buffer.append("Industry,");
        buffer.append("Business,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwTownProrateAppendDto.getUserNo()).append("',");
            debugBuffer.append("").append(lwTownProrateAppendDto.getAgricultural()).append(",");
            debugBuffer.append("").append(lwTownProrateAppendDto.getProduce()).append(",");
            debugBuffer.append("").append(lwTownProrateAppendDto.getResident()).append(",");
            debugBuffer.append("").append(lwTownProrateAppendDto.getIndecisive()).append(",");
            debugBuffer.append("").append(lwTownProrateAppendDto.getIndustry()).append(",");
            debugBuffer.append("").append(lwTownProrateAppendDto.getBusiness()).append(",");
            debugBuffer.append("'").append(lwTownProrateAppendDto.getInputDate()).append("',");
            debugBuffer.append("'").append(lwTownProrateAppendDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwTownProrateAppendDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwTownProrateAppendDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwTownProrateAppendDto.getUserNo());
        dbManager.setDouble(2,lwTownProrateAppendDto.getAgricultural());
        dbManager.setDouble(3,lwTownProrateAppendDto.getProduce());
        dbManager.setDouble(4,lwTownProrateAppendDto.getResident());
        dbManager.setDouble(5,lwTownProrateAppendDto.getIndecisive());
        dbManager.setDouble(6,lwTownProrateAppendDto.getIndustry());
        dbManager.setDouble(7,lwTownProrateAppendDto.getBusiness());
        dbManager.setString(8,lwTownProrateAppendDto.getInputDate());
        dbManager.setString(9,lwTownProrateAppendDto.getValidStatus());
        dbManager.setString(10,lwTownProrateAppendDto.getRemark());
        dbManager.setString(11,lwTownProrateAppendDto.getFlag());
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
        buffer.append("INSERT INTO LwTownProrateAppend (");
        buffer.append("UserNo,");
        buffer.append("Agricultural,");
        buffer.append("Produce,");
        buffer.append("Resident,");
        buffer.append("Indecisive,");
        buffer.append("Industry,");
        buffer.append("Business,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwTownProrateAppendDto lwTownProrateAppendDto = (LwTownProrateAppendDto)i.next();
            dbManager.setString(1,lwTownProrateAppendDto.getUserNo());
            dbManager.setDouble(2,lwTownProrateAppendDto.getAgricultural());
            dbManager.setDouble(3,lwTownProrateAppendDto.getProduce());
            dbManager.setDouble(4,lwTownProrateAppendDto.getResident());
            dbManager.setDouble(5,lwTownProrateAppendDto.getIndecisive());
            dbManager.setDouble(6,lwTownProrateAppendDto.getIndustry());
            dbManager.setDouble(7,lwTownProrateAppendDto.getBusiness());
            dbManager.setString(8,lwTownProrateAppendDto.getInputDate());
            dbManager.setString(9,lwTownProrateAppendDto.getValidStatus());
            dbManager.setString(10,lwTownProrateAppendDto.getRemark());
            dbManager.setString(11,lwTownProrateAppendDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param userNo ����
     * @param flag ��־
     * @throws Exception
     */
    public void delete(String userNo,String flag)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwTownProrateAppend ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("Flag=").append("'").append(flag).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("Flag = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,userNo);
        dbManager.setString(2,flag);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public void update(LwTownProrateAppendDto lwTownProrateAppendDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwTownProrateAppend SET ");
        buffer.append("Agricultural = ?, ");
        buffer.append("Produce = ?, ");
        buffer.append("Resident = ?, ");
        buffer.append("Indecisive = ?, ");
        buffer.append("Industry = ?, ");
        buffer.append("Business = ?, ");
        buffer.append("InputDate = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwTownProrateAppend SET ");
            debugBuffer.append("Agricultural = " + lwTownProrateAppendDto.getAgricultural() + ", ");
            debugBuffer.append("Produce = " + lwTownProrateAppendDto.getProduce() + ", ");
            debugBuffer.append("Resident = " + lwTownProrateAppendDto.getResident() + ", ");
            debugBuffer.append("Indecisive = " + lwTownProrateAppendDto.getIndecisive() + ", ");
            debugBuffer.append("Industry = " + lwTownProrateAppendDto.getIndustry() + ", ");
            debugBuffer.append("Business = " + lwTownProrateAppendDto.getBusiness() + ", ");
            debugBuffer.append("InputDate = '" + lwTownProrateAppendDto.getInputDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwTownProrateAppendDto.getValidStatus() + "', ");
            debugBuffer.append("Remark = '" + lwTownProrateAppendDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwTownProrateAppendDto.getUserNo()).append("' AND ");
            debugBuffer.append("Flag=").append("'").append(lwTownProrateAppendDto.getFlag()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("Flag = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setDouble(1,lwTownProrateAppendDto.getAgricultural());
        dbManager.setDouble(2,lwTownProrateAppendDto.getProduce());
        dbManager.setDouble(3,lwTownProrateAppendDto.getResident());
        dbManager.setDouble(4,lwTownProrateAppendDto.getIndecisive());
        dbManager.setDouble(5,lwTownProrateAppendDto.getIndustry());
        dbManager.setDouble(6,lwTownProrateAppendDto.getBusiness());
        dbManager.setString(7,lwTownProrateAppendDto.getInputDate());
        dbManager.setString(8,lwTownProrateAppendDto.getValidStatus());
        dbManager.setString(9,lwTownProrateAppendDto.getRemark());
        //���������ֶ�;
        dbManager.setString(10,lwTownProrateAppendDto.getUserNo());
        dbManager.setString(11,lwTownProrateAppendDto.getFlag());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param userNo ����
     * @param flag ��־
     * @return LwTownProrateAppendDto
     * @throws Exception
     */
    public LwTownProrateAppendDto findByPrimaryKey(String userNo,String flag)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("Agricultural,");
        buffer.append("Produce,");
        buffer.append("Resident,");
        buffer.append("Indecisive,");
        buffer.append("Industry,");
        buffer.append("Business,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append("FROM LwTownProrateAppend ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("Flag=").append("'").append(flag).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("Flag = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,userNo);
        dbManager.setString(2,flag);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwTownProrateAppendDto lwTownProrateAppendDto = null;
        if(resultSet.next()){
            lwTownProrateAppendDto = new LwTownProrateAppendDto();
            lwTownProrateAppendDto.setUserNo(dbManager.getString(resultSet,1));
            lwTownProrateAppendDto.setAgricultural(dbManager.getDouble(resultSet,2));
            lwTownProrateAppendDto.setProduce(dbManager.getDouble(resultSet,3));
            lwTownProrateAppendDto.setResident(dbManager.getDouble(resultSet,4));
            lwTownProrateAppendDto.setIndecisive(dbManager.getDouble(resultSet,5));
            lwTownProrateAppendDto.setIndustry(dbManager.getDouble(resultSet,6));
            lwTownProrateAppendDto.setBusiness(dbManager.getDouble(resultSet,7));
            lwTownProrateAppendDto.setInputDate(dbManager.getString(resultSet,8));
            lwTownProrateAppendDto.setValidStatus(dbManager.getString(resultSet,9));
            lwTownProrateAppendDto.setRemark(dbManager.getString(resultSet,10));
            lwTownProrateAppendDto.setFlag(dbManager.getString(resultSet,11));
        }
        resultSet.close();
        return lwTownProrateAppendDto;
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
        buffer.append("UserNo,");
        buffer.append("Agricultural,");
        buffer.append("Produce,");
        buffer.append("Resident,");
        buffer.append("Indecisive,");
        buffer.append("Industry,");
        buffer.append("Business,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append("FROM LwTownProrateAppend WHERE ");
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
        LwTownProrateAppendDto lwTownProrateAppendDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwTownProrateAppendDto = new LwTownProrateAppendDto();
            lwTownProrateAppendDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwTownProrateAppendDto.setAgricultural(dbManager.getDouble(resultSet,"Agricultural"));
            lwTownProrateAppendDto.setProduce(dbManager.getDouble(resultSet,"Produce"));
            lwTownProrateAppendDto.setResident(dbManager.getDouble(resultSet,"Resident"));
            lwTownProrateAppendDto.setIndecisive(dbManager.getDouble(resultSet,"Indecisive"));
            lwTownProrateAppendDto.setIndustry(dbManager.getDouble(resultSet,"Industry"));
            lwTownProrateAppendDto.setBusiness(dbManager.getDouble(resultSet,"Business"));
            lwTownProrateAppendDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwTownProrateAppendDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwTownProrateAppendDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwTownProrateAppendDto.setFlag(dbManager.getString(resultSet,"Flag"));
            collection.add(lwTownProrateAppendDto);
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
        buffer.append("DELETE FROM LwTownProrateAppend WHERE ");
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
        buffer.append("SELECT count(*) FROM LwTownProrateAppend WHERE ");
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
