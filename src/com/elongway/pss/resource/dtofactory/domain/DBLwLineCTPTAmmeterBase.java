package com.elongway.pss.resource.dtofactory.domain;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ������·������ѹ����������ϵ������ݷ��ʶ������<br>
 */
public class DBLwLineCTPTAmmeterBase{
	  /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwLineCTPTAmmeterBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwLineCTPTAmmeterBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public void insert(LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwLineCTPTAmmeter (");
        buffer.append("LineCode,");
        buffer.append("CtModus,");
        buffer.append("PtModus,");
        buffer.append("AmmeterNo,");
        buffer.append("Flag,");
        buffer.append("ValidStatus,");
        buffer.append("InputDate ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwLineCTPTAmmeterDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwLineCTPTAmmeterDto.getCtModus()).append("',");
            debugBuffer.append("'").append(lwLineCTPTAmmeterDto.getPtModus()).append("',");
            debugBuffer.append("'").append(lwLineCTPTAmmeterDto.getAmmeterNo()).append("',");
            debugBuffer.append("'").append(lwLineCTPTAmmeterDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwLineCTPTAmmeterDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwLineCTPTAmmeterDto.getInputDate()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwLineCTPTAmmeterDto.getLineCode());
        dbManager.setString(2,lwLineCTPTAmmeterDto.getCtModus());
        dbManager.setString(3,lwLineCTPTAmmeterDto.getPtModus());
        dbManager.setString(4,lwLineCTPTAmmeterDto.getAmmeterNo());
        dbManager.setString(5,lwLineCTPTAmmeterDto.getFlag());
        dbManager.setString(6,lwLineCTPTAmmeterDto.getValidStatus());
        dbManager.setString(7,lwLineCTPTAmmeterDto.getInputDate());
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
        buffer.append("INSERT INTO LwLineCTPTAmmeter (");
        buffer.append("LineCode,");
        buffer.append("CtModus,");
        buffer.append("PtModus,");
        buffer.append("AmmeterNo,");
        buffer.append("Flag,");
        buffer.append("ValidStatus,");
        buffer.append("InputDate ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto = (LwLineCTPTAmmeterDto)i.next();
            dbManager.setString(1,lwLineCTPTAmmeterDto.getLineCode());
            dbManager.setString(2,lwLineCTPTAmmeterDto.getCtModus());
            dbManager.setString(3,lwLineCTPTAmmeterDto.getPtModus());
            dbManager.setString(4,lwLineCTPTAmmeterDto.getAmmeterNo());
            dbManager.setString(5,lwLineCTPTAmmeterDto.getFlag());
            dbManager.setString(6,lwLineCTPTAmmeterDto.getValidStatus());
            dbManager.setString(7,lwLineCTPTAmmeterDto.getInputDate());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param lineCode ��·����
     * @param ctModus ������������ʽ
     * @param ptModus ��ѹ��������ʽ
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(String lineCode,String ctModus,String ptModus,String ammeterNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwLineCTPTAmmeter ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("CtModus=").append("'").append(ctModus).append("' AND ");
            debugBuffer.append("PtModus=").append("'").append(ptModus).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(ammeterNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("CtModus = ? And ");
        buffer.append("PtModus = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,ctModus);
        dbManager.setString(3,ptModus);
        dbManager.setString(4,ammeterNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public void update(LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwLineCTPTAmmeter SET ");
        buffer.append("Flag = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("InputDate = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwLineCTPTAmmeter SET ");
            debugBuffer.append("Flag = '" + lwLineCTPTAmmeterDto.getFlag() + "', ");
            debugBuffer.append("ValidStatus = '" + lwLineCTPTAmmeterDto.getValidStatus() + "', ");
            debugBuffer.append("InputDate = '" + lwLineCTPTAmmeterDto.getInputDate() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lwLineCTPTAmmeterDto.getLineCode()).append("' AND ");
            debugBuffer.append("CtModus=").append("'").append(lwLineCTPTAmmeterDto.getCtModus()).append("' AND ");
            debugBuffer.append("PtModus=").append("'").append(lwLineCTPTAmmeterDto.getPtModus()).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(lwLineCTPTAmmeterDto.getAmmeterNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("CtModus = ? And ");
        buffer.append("PtModus = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwLineCTPTAmmeterDto.getFlag());
        dbManager.setString(2,lwLineCTPTAmmeterDto.getValidStatus());
        dbManager.setString(3,lwLineCTPTAmmeterDto.getInputDate());
        //���������ֶ�;
        dbManager.setString(4,lwLineCTPTAmmeterDto.getLineCode());
        dbManager.setString(5,lwLineCTPTAmmeterDto.getCtModus());
        dbManager.setString(6,lwLineCTPTAmmeterDto.getPtModus());
        dbManager.setString(7,lwLineCTPTAmmeterDto.getAmmeterNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param lineCode ��·����
     * @param ctModus ������������ʽ
     * @param ptModus ��ѹ��������ʽ
     * @param ammeterNo ���
     * @return LwLineCTPTAmmeterDto
     * @throws Exception
     */
    public LwLineCTPTAmmeterDto findByPrimaryKey(String lineCode,String ctModus,String ptModus,String ammeterNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("LineCode,");
        buffer.append("CtModus,");
        buffer.append("PtModus,");
        buffer.append("AmmeterNo,");
        buffer.append("Flag,");
        buffer.append("ValidStatus,");
        buffer.append("InputDate ");
        buffer.append("FROM LwLineCTPTAmmeter ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("CtModus=").append("'").append(ctModus).append("' AND ");
            debugBuffer.append("PtModus=").append("'").append(ptModus).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(ammeterNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("CtModus = ? And ");
        buffer.append("PtModus = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,ctModus);
        dbManager.setString(3,ptModus);
        dbManager.setString(4,ammeterNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto = null;
        if(resultSet.next()){
            lwLineCTPTAmmeterDto = new LwLineCTPTAmmeterDto();
            lwLineCTPTAmmeterDto.setLineCode(dbManager.getString(resultSet,1));
            lwLineCTPTAmmeterDto.setCtModus(dbManager.getString(resultSet,2));
            lwLineCTPTAmmeterDto.setPtModus(dbManager.getString(resultSet,3));
            lwLineCTPTAmmeterDto.setAmmeterNo(dbManager.getString(resultSet,4));
            lwLineCTPTAmmeterDto.setFlag(dbManager.getString(resultSet,5));
            lwLineCTPTAmmeterDto.setValidStatus(dbManager.getString(resultSet,6));
            lwLineCTPTAmmeterDto.setInputDate(dbManager.getString(resultSet,7));
        }
        resultSet.close();
        return lwLineCTPTAmmeterDto;
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
        buffer.append("CtModus,");
        buffer.append("PtModus,");
        buffer.append("AmmeterNo,");
        buffer.append("Flag,");
        buffer.append("ValidStatus,");
        buffer.append("InputDate ");
        buffer.append("FROM LwLineCTPTAmmeter WHERE ");
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
        LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwLineCTPTAmmeterDto = new LwLineCTPTAmmeterDto();
            lwLineCTPTAmmeterDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwLineCTPTAmmeterDto.setCtModus(dbManager.getString(resultSet,"CtModus"));
            lwLineCTPTAmmeterDto.setPtModus(dbManager.getString(resultSet,"PtModus"));
            lwLineCTPTAmmeterDto.setAmmeterNo(dbManager.getString(resultSet,"AmmeterNo"));
            lwLineCTPTAmmeterDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwLineCTPTAmmeterDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwLineCTPTAmmeterDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            collection.add(lwLineCTPTAmmeterDto);
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
        buffer.append("DELETE FROM LwLineCTPTAmmeter WHERE ");
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
        buffer.append("SELECT count(*) FROM LwLineCTPTAmmeter WHERE ");
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
