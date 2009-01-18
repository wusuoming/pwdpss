package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwAmmeterBook-����Ϣ������ݷ��ʶ������<br>
 */
public class DBLwAmmeterBookBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwAmmeterBookBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwAmmeterBookBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public void insert(LwAmmeterBookDto lwAmmeterBookDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwAmmeterBook (");
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("BookType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwAmmeterBookDto.getBookNo()).append("',");
            debugBuffer.append("'").append(lwAmmeterBookDto.getBookName()).append("',");
            debugBuffer.append("'").append(lwAmmeterBookDto.getBookType()).append("',");
            debugBuffer.append("'").append(lwAmmeterBookDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwAmmeterBookDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwAmmeterBookDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwAmmeterBookDto.getBookNo());
        dbManager.setString(2,lwAmmeterBookDto.getBookName());
        dbManager.setString(3,lwAmmeterBookDto.getBookType());
        dbManager.setString(4,lwAmmeterBookDto.getRemark());
        dbManager.setString(5,lwAmmeterBookDto.getValidStatus());
        dbManager.setString(6,lwAmmeterBookDto.getFlag());
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
        buffer.append("INSERT INTO LwAmmeterBook (");
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("BookType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwAmmeterBookDto lwAmmeterBookDto = (LwAmmeterBookDto)i.next();
            dbManager.setString(1,lwAmmeterBookDto.getBookNo());
            dbManager.setString(2,lwAmmeterBookDto.getBookName());
            dbManager.setString(3,lwAmmeterBookDto.getBookType());
            dbManager.setString(4,lwAmmeterBookDto.getRemark());
            dbManager.setString(5,lwAmmeterBookDto.getValidStatus());
            dbManager.setString(6,lwAmmeterBookDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param bookNo ����
     * @throws Exception
     */
    public void delete(String bookNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwAmmeterBook ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("BookNo=").append("'").append(bookNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("BookNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,bookNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public void update(LwAmmeterBookDto lwAmmeterBookDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwAmmeterBook SET ");
        buffer.append("BookName = ?, ");
        buffer.append("BookType = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwAmmeterBook SET ");
            debugBuffer.append("BookName = '" + lwAmmeterBookDto.getBookName() + "', ");
            debugBuffer.append("BookType = '" + lwAmmeterBookDto.getBookType() + "', ");
            debugBuffer.append("Remark = '" + lwAmmeterBookDto.getRemark() + "', ");
            debugBuffer.append("ValidStatus = '" + lwAmmeterBookDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwAmmeterBookDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("BookNo=").append("'").append(lwAmmeterBookDto.getBookNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("BookNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,lwAmmeterBookDto.getBookName());
        dbManager.setString(2,lwAmmeterBookDto.getBookType());
        dbManager.setString(3,lwAmmeterBookDto.getRemark());
        dbManager.setString(4,lwAmmeterBookDto.getValidStatus());
        dbManager.setString(5,lwAmmeterBookDto.getFlag());
        //���������ֶ�;
        dbManager.setString(6,lwAmmeterBookDto.getBookNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param bookNo ����
     * @return LwAmmeterBookDto
     * @throws Exception
     */
    public LwAmmeterBookDto findByPrimaryKey(String bookNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("BookType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM LwAmmeterBook ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("BookNo=").append("'").append(bookNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("BookNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,bookNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwAmmeterBookDto lwAmmeterBookDto = null;
        if(resultSet.next()){
            lwAmmeterBookDto = new LwAmmeterBookDto();
            lwAmmeterBookDto.setBookNo(dbManager.getString(resultSet,1));
            lwAmmeterBookDto.setBookName(dbManager.getString(resultSet,2));
            lwAmmeterBookDto.setBookType(dbManager.getString(resultSet,3));
            lwAmmeterBookDto.setRemark(dbManager.getString(resultSet,4));
            lwAmmeterBookDto.setValidStatus(dbManager.getString(resultSet,5));
            lwAmmeterBookDto.setFlag(dbManager.getString(resultSet,6));
        }
        resultSet.close();
        return lwAmmeterBookDto;
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
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("BookType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM LwAmmeterBook WHERE ");
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
        LwAmmeterBookDto lwAmmeterBookDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwAmmeterBookDto = new LwAmmeterBookDto();
            lwAmmeterBookDto.setBookNo(dbManager.getString(resultSet,"BookNo"));
            lwAmmeterBookDto.setBookName(dbManager.getString(resultSet,"BookName"));
            lwAmmeterBookDto.setBookType(dbManager.getString(resultSet,"BookType"));
            lwAmmeterBookDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwAmmeterBookDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwAmmeterBookDto.setFlag(dbManager.getString(resultSet,"Flag"));
            collection.add(lwAmmeterBookDto);
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
        buffer.append("DELETE FROM LwAmmeterBook WHERE ");
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
        buffer.append("SELECT count(*) FROM LwAmmeterBook WHERE ");
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
