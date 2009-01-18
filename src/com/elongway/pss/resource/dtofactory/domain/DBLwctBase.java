package com.elongway.pss.resource.dtofactory.domain;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.elongway.pss.dto.domain.LwctDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ���ǵ��������������ݷ��ʶ������<br>
 */
public class DBLwctBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwctBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwctBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwctDto lwctDto
     * @throws Exception
     */
    public void insert(LwctDto lwctDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO Lwct (");
        buffer.append("Modus,");
        buffer.append("Ct,");
        buffer.append("FactoryName,");
        buffer.append("Exact,");
        buffer.append("CtRate,");
        buffer.append("FctoryCodeA,");
        buffer.append("FctoryCodeB,");
        buffer.append("FctoryCodeC,");
        buffer.append("Flag,");
        buffer.append("ImportDate,");
        buffer.append("ValidStatus ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwctDto.getModus()).append("',");
            debugBuffer.append("'").append(lwctDto.getCt()).append("',");
            debugBuffer.append("'").append(lwctDto.getFactoryName()).append("',");
            debugBuffer.append("").append(lwctDto.getExact()).append(",");
            debugBuffer.append("").append(lwctDto.getCtRate()).append(",");
            debugBuffer.append("'").append(lwctDto.getFctoryCodeA()).append("',");
            debugBuffer.append("'").append(lwctDto.getFctoryCodeB()).append("',");
            debugBuffer.append("'").append(lwctDto.getFctoryCodeC()).append("',");
            debugBuffer.append("'").append(lwctDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwctDto.getImportDate()).append("',");
            debugBuffer.append("'").append(lwctDto.getValidStatus()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwctDto.getModus());
        dbManager.setString(2,lwctDto.getCt());
        dbManager.setString(3,lwctDto.getFactoryName());
        dbManager.setDouble(4,lwctDto.getExact());
        dbManager.setDouble(5,lwctDto.getCtRate());
        dbManager.setString(6,lwctDto.getFctoryCodeA());
        dbManager.setString(7,lwctDto.getFctoryCodeB());
        dbManager.setString(8,lwctDto.getFctoryCodeC());
        dbManager.setString(9,lwctDto.getFlag());
        dbManager.setString(10,lwctDto.getImportDate());
        dbManager.setString(11,lwctDto.getValidStatus());
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
        buffer.append("INSERT INTO Lwct (");
        buffer.append("Modus,");
        buffer.append("Ct,");
        buffer.append("FactoryName,");
        buffer.append("Exact,");
        buffer.append("CtRate,");
        buffer.append("FctoryCodeA,");
        buffer.append("FctoryCodeB,");
        buffer.append("FctoryCodeC,");
        buffer.append("Flag,");
        buffer.append("ImportDate,");
        buffer.append("ValidStatus ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwctDto lwctDto = (LwctDto)i.next();
            dbManager.setString(1,lwctDto.getModus());
            dbManager.setString(2,lwctDto.getCt());
            dbManager.setString(3,lwctDto.getFactoryName());
            dbManager.setDouble(4,lwctDto.getExact());
            dbManager.setDouble(5,lwctDto.getCtRate());
            dbManager.setString(6,lwctDto.getFctoryCodeA());
            dbManager.setString(7,lwctDto.getFctoryCodeB());
            dbManager.setString(8,lwctDto.getFctoryCodeC());
            dbManager.setString(9,lwctDto.getFlag());
            dbManager.setString(10,lwctDto.getImportDate());
            dbManager.setString(11,lwctDto.getValidStatus());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param modus ��ʽ
     * @throws Exception
     */
    public void delete(String modus)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM Lwct ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("Modus=").append("'").append(modus).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Modus = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,modus);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwctDto lwctDto
     * @throws Exception
     */
    public void update(LwctDto lwctDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE Lwct SET ");
        buffer.append("Ct = ?, ");
        buffer.append("FactoryName = ?, ");
        buffer.append("Exact = ?, ");
        buffer.append("CtRate = ?, ");
        buffer.append("FctoryCodeA = ?, ");
        buffer.append("FctoryCodeB = ?, ");
        buffer.append("FctoryCodeC = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("ImportDate = ?, ");
        buffer.append("ValidStatus = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE Lwct SET ");
            debugBuffer.append("Ct = '" + lwctDto.getCt() + "', ");
            debugBuffer.append("FactoryName = '" + lwctDto.getFactoryName() + "', ");
            debugBuffer.append("Exact = " + lwctDto.getExact() + ", ");
            debugBuffer.append("CtRate = " + lwctDto.getCtRate() + ", ");
            debugBuffer.append("FctoryCodeA = '" + lwctDto.getFctoryCodeA() + "', ");
            debugBuffer.append("FctoryCodeB = '" + lwctDto.getFctoryCodeB() + "', ");
            debugBuffer.append("FctoryCodeC = '" + lwctDto.getFctoryCodeC() + "', ");
            debugBuffer.append("Flag = '" + lwctDto.getFlag() + "', ");
            debugBuffer.append("ImportDate = '" + lwctDto.getImportDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwctDto.getValidStatus() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("Modus=").append("'").append(lwctDto.getModus()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Modus = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwctDto.getCt());
        dbManager.setString(2,lwctDto.getFactoryName());
        dbManager.setDouble(3,lwctDto.getExact());
        dbManager.setDouble(4,lwctDto.getCtRate());
        dbManager.setString(5,lwctDto.getFctoryCodeA());
        dbManager.setString(6,lwctDto.getFctoryCodeB());
        dbManager.setString(7,lwctDto.getFctoryCodeC());
        dbManager.setString(8,lwctDto.getFlag());
        dbManager.setString(9,lwctDto.getImportDate());
        dbManager.setString(10,lwctDto.getValidStatus());
        //���������ֶ�;
        dbManager.setString(11,lwctDto.getModus());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param modus ��ʽ
     * @return LwctDto
     * @throws Exception
     */
    public LwctDto findByPrimaryKey(String modus)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("Modus,");
        buffer.append("Ct,");
        buffer.append("FactoryName,");
        buffer.append("Exact,");
        buffer.append("CtRate,");
        buffer.append("FctoryCodeA,");
        buffer.append("FctoryCodeB,");
        buffer.append("FctoryCodeC,");
        buffer.append("Flag,");
        buffer.append("ImportDate,");
        buffer.append("ValidStatus ");
        buffer.append("FROM Lwct ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("Modus=").append("'").append(modus).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Modus = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,modus);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwctDto lwctDto = null;
        if(resultSet.next()){
            lwctDto = new LwctDto();
            lwctDto.setModus(dbManager.getString(resultSet,1));
            lwctDto.setCt(dbManager.getString(resultSet,2));
            lwctDto.setFactoryName(dbManager.getString(resultSet,3));
            lwctDto.setExact(dbManager.getDouble(resultSet,4));
            lwctDto.setCtRate(dbManager.getDouble(resultSet,5));
            lwctDto.setFctoryCodeA(dbManager.getString(resultSet,6));
            lwctDto.setFctoryCodeB(dbManager.getString(resultSet,7));
            lwctDto.setFctoryCodeC(dbManager.getString(resultSet,8));
            lwctDto.setFlag(dbManager.getString(resultSet,9));
            lwctDto.setImportDate(dbManager.getString(resultSet,10));
            lwctDto.setValidStatus(dbManager.getString(resultSet,11));
        }
        resultSet.close();
        return lwctDto;
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
        buffer.append("Modus,");
        buffer.append("Ct,");
        buffer.append("FactoryName,");
        buffer.append("Exact,");
        buffer.append("CtRate,");
        buffer.append("FctoryCodeA,");
        buffer.append("FctoryCodeB,");
        buffer.append("FctoryCodeC,");
        buffer.append("Flag,");
        buffer.append("ImportDate,");
        buffer.append("ValidStatus ");
        buffer.append("FROM Lwct WHERE ");
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
        LwctDto lwctDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwctDto = new LwctDto();
            lwctDto.setModus(dbManager.getString(resultSet,"Modus"));
            lwctDto.setCt(dbManager.getString(resultSet,"Ct"));
            lwctDto.setFactoryName(dbManager.getString(resultSet,"FactoryName"));
            lwctDto.setExact(dbManager.getDouble(resultSet,"Exact"));
            lwctDto.setCtRate(dbManager.getDouble(resultSet,"CtRate"));
            lwctDto.setFctoryCodeA(dbManager.getString(resultSet,"FctoryCodeA"));
            lwctDto.setFctoryCodeB(dbManager.getString(resultSet,"FctoryCodeB"));
            lwctDto.setFctoryCodeC(dbManager.getString(resultSet,"FctoryCodeC"));
            lwctDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwctDto.setImportDate(dbManager.getString(resultSet,"ImportDate"));
            lwctDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            collection.add(lwctDto);
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
        buffer.append("DELETE FROM Lwct WHERE ");
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
        buffer.append("SELECT count(*) FROM Lwct WHERE ");
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
