package com.elongway.pss.resource.dtofactory.domain;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.elongway.pss.dto.domain.LwptDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ���ǵ�ѹ�����������ݷ��ʶ������<br>
 */
public class DBLwptBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwptBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwptBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwptDto lwptDto
     * @throws Exception
     */
    public void insert(LwptDto lwptDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO Lwpt (");
        buffer.append("Modus,");
        buffer.append("Pt,");
        buffer.append("FactoryName,");
        buffer.append("Exact,");
        buffer.append("PtRate,");
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
            debugBuffer.append("'").append(lwptDto.getModus()).append("',");
            debugBuffer.append("'").append(lwptDto.getPt()).append("',");
            debugBuffer.append("'").append(lwptDto.getFactoryName()).append("',");
            debugBuffer.append("").append(lwptDto.getExact()).append(",");
            debugBuffer.append("").append(lwptDto.getPtRate()).append(",");
            debugBuffer.append("'").append(lwptDto.getFctoryCodeA()).append("',");
            debugBuffer.append("'").append(lwptDto.getFctoryCodeB()).append("',");
            debugBuffer.append("'").append(lwptDto.getFctoryCodeC()).append("',");
            debugBuffer.append("'").append(lwptDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwptDto.getImportDate()).append("',");
            debugBuffer.append("'").append(lwptDto.getValidStatus()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwptDto.getModus());
        dbManager.setString(2,lwptDto.getPt());
        dbManager.setString(3,lwptDto.getFactoryName());
        dbManager.setDouble(4,lwptDto.getExact());
        dbManager.setDouble(5,lwptDto.getPtRate());
        dbManager.setString(6,lwptDto.getFctoryCodeA());
        dbManager.setString(7,lwptDto.getFctoryCodeB());
        dbManager.setString(8,lwptDto.getFctoryCodeC());
        dbManager.setString(9,lwptDto.getFlag());
        dbManager.setString(10,lwptDto.getImportDate());
        dbManager.setString(11,lwptDto.getValidStatus());
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
        buffer.append("INSERT INTO Lwpt (");
        buffer.append("Modus,");
        buffer.append("Pt,");
        buffer.append("FactoryName,");
        buffer.append("Exact,");
        buffer.append("PtRate,");
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
            LwptDto lwptDto = (LwptDto)i.next();
            dbManager.setString(1,lwptDto.getModus());
            dbManager.setString(2,lwptDto.getPt());
            dbManager.setString(3,lwptDto.getFactoryName());
            dbManager.setDouble(4,lwptDto.getExact());
            dbManager.setDouble(5,lwptDto.getPtRate());
            dbManager.setString(6,lwptDto.getFctoryCodeA());
            dbManager.setString(7,lwptDto.getFctoryCodeB());
            dbManager.setString(8,lwptDto.getFctoryCodeC());
            dbManager.setString(9,lwptDto.getFlag());
            dbManager.setString(10,lwptDto.getImportDate());
            dbManager.setString(11,lwptDto.getValidStatus());
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
        buffer.append("DELETE FROM Lwpt ");
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
     * @param lwptDto lwptDto
     * @throws Exception
     */
    public void update(LwptDto lwptDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE Lwpt SET ");
        buffer.append("Pt = ?, ");
        buffer.append("FactoryName = ?, ");
        buffer.append("Exact = ?, ");
        buffer.append("PtRate = ?, ");
        buffer.append("FctoryCodeA = ?, ");
        buffer.append("FctoryCodeB = ?, ");
        buffer.append("FctoryCodeC = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("ImportDate = ?, ");
        buffer.append("ValidStatus = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE Lwpt SET ");
            debugBuffer.append("Pt = '" + lwptDto.getPt() + "', ");
            debugBuffer.append("FactoryName = '" + lwptDto.getFactoryName() + "', ");
            debugBuffer.append("Exact = " + lwptDto.getExact() + ", ");
            debugBuffer.append("PtRate = " + lwptDto.getPtRate() + ", ");
            debugBuffer.append("FctoryCodeA = '" + lwptDto.getFctoryCodeA() + "', ");
            debugBuffer.append("FctoryCodeB = '" + lwptDto.getFctoryCodeB() + "', ");
            debugBuffer.append("FctoryCodeC = '" + lwptDto.getFctoryCodeC() + "', ");
            debugBuffer.append("Flag = '" + lwptDto.getFlag() + "', ");
            debugBuffer.append("ImportDate = '" + lwptDto.getImportDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwptDto.getValidStatus() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("Modus=").append("'").append(lwptDto.getModus()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Modus = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwptDto.getPt());
        dbManager.setString(2,lwptDto.getFactoryName());
        dbManager.setDouble(3,lwptDto.getExact());
        dbManager.setDouble(4,lwptDto.getPtRate());
        dbManager.setString(5,lwptDto.getFctoryCodeA());
        dbManager.setString(6,lwptDto.getFctoryCodeB());
        dbManager.setString(7,lwptDto.getFctoryCodeC());
        dbManager.setString(8,lwptDto.getFlag());
        dbManager.setString(9,lwptDto.getImportDate());
        dbManager.setString(10,lwptDto.getValidStatus());
        //���������ֶ�;
        dbManager.setString(11,lwptDto.getModus());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param modus ��ʽ
     * @return LwptDto
     * @throws Exception
     */
    public LwptDto findByPrimaryKey(String modus)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("Modus,");
        buffer.append("Pt,");
        buffer.append("FactoryName,");
        buffer.append("Exact,");
        buffer.append("PtRate,");
        buffer.append("FctoryCodeA,");
        buffer.append("FctoryCodeB,");
        buffer.append("FctoryCodeC,");
        buffer.append("Flag,");
        buffer.append("ImportDate,");
        buffer.append("ValidStatus ");
        buffer.append("FROM Lwpt ");
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
        LwptDto lwptDto = null;
        if(resultSet.next()){
            lwptDto = new LwptDto();
            lwptDto.setModus(dbManager.getString(resultSet,1));
            lwptDto.setPt(dbManager.getString(resultSet,2));
            lwptDto.setFactoryName(dbManager.getString(resultSet,3));
            lwptDto.setExact(dbManager.getDouble(resultSet,4));
            lwptDto.setPtRate(dbManager.getDouble(resultSet,5));
            lwptDto.setFctoryCodeA(dbManager.getString(resultSet,6));
            lwptDto.setFctoryCodeB(dbManager.getString(resultSet,7));
            lwptDto.setFctoryCodeC(dbManager.getString(resultSet,8));
            lwptDto.setFlag(dbManager.getString(resultSet,9));
            lwptDto.setImportDate(dbManager.getString(resultSet,10));
            lwptDto.setValidStatus(dbManager.getString(resultSet,11));
        }
        resultSet.close();
        return lwptDto;
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
        buffer.append("Pt,");
        buffer.append("FactoryName,");
        buffer.append("Exact,");
        buffer.append("PtRate,");
        buffer.append("FctoryCodeA,");
        buffer.append("FctoryCodeB,");
        buffer.append("FctoryCodeC,");
        buffer.append("Flag,");
        buffer.append("ImportDate,");
        buffer.append("ValidStatus ");
        buffer.append("FROM Lwpt WHERE ");
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
        LwptDto lwptDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwptDto = new LwptDto();
            lwptDto.setModus(dbManager.getString(resultSet,"Modus"));
            lwptDto.setPt(dbManager.getString(resultSet,"Pt"));
            lwptDto.setFactoryName(dbManager.getString(resultSet,"FactoryName"));
            lwptDto.setExact(dbManager.getDouble(resultSet,"Exact"));
            lwptDto.setPtRate(dbManager.getDouble(resultSet,"PtRate"));
            lwptDto.setFctoryCodeA(dbManager.getString(resultSet,"FctoryCodeA"));
            lwptDto.setFctoryCodeB(dbManager.getString(resultSet,"FctoryCodeB"));
            lwptDto.setFctoryCodeC(dbManager.getString(resultSet,"FctoryCodeC"));
            lwptDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwptDto.setImportDate(dbManager.getString(resultSet,"ImportDate"));
            lwptDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            collection.add(lwptDto);
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
        buffer.append("DELETE FROM Lwpt WHERE ");
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
        buffer.append("SELECT count(*) FROM Lwpt WHERE ");
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
