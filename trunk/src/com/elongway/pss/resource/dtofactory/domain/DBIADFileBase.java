package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADFileDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADFile�����ݷ��ʶ������<br>
 * ������ 2007-12-10 14:28:39.015<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADFileBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBIADFileBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBIADFileBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param iADFileDto iADFileDto
     * @throws Exception
     */
    public void insert(IADFileDto iADFileDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO IADFile (");
        buffer.append("ContactNo,");
        buffer.append("FileName,");
        buffer.append("FileUuid,");
        buffer.append("UpLoadDate,");
        buffer.append("CompanyCode ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(iADFileDto.getContactNo()).append("',");
            debugBuffer.append("'").append(iADFileDto.getFileName()).append("',");
            debugBuffer.append("'").append(iADFileDto.getFileUuid()).append("',");
            debugBuffer.append("'").append(iADFileDto.getUpLoadDate()).append("',");
            debugBuffer.append("'").append(iADFileDto.getCompanyCode()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,iADFileDto.getContactNo());
        dbManager.setString(2,iADFileDto.getFileName());
        dbManager.setString(3,iADFileDto.getFileUuid());
        dbManager.setDateTime(4,iADFileDto.getUpLoadDate());
        dbManager.setString(5,iADFileDto.getCompanyCode());
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
        buffer.append("INSERT INTO IADFile (");
        buffer.append("ContactNo,");
        buffer.append("FileName,");
        buffer.append("FileUuid,");
        buffer.append("UpLoadDate,");
        buffer.append("CompanyCode ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            IADFileDto iADFileDto = (IADFileDto)i.next();
            dbManager.setString(1,iADFileDto.getContactNo());
            dbManager.setString(2,iADFileDto.getFileName());
            dbManager.setString(3,iADFileDto.getFileUuid());
            dbManager.setDateTime(4,iADFileDto.getUpLoadDate());
            dbManager.setString(5,iADFileDto.getCompanyCode());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param contactNo ContactNo
     * @param fileUuid FileUuid
     * @throws Exception
     */
    public void delete(String contactNo,String fileUuid)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM IADFile ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ContactNo=").append("'").append(contactNo).append("' AND ");
            debugBuffer.append("FileUuid=").append("'").append(fileUuid).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ContactNo = ? And ");
        buffer.append("FileUuid = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,contactNo);
        dbManager.setString(2,fileUuid);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param iADFileDto iADFileDto
     * @throws Exception
     */
    public void update(IADFileDto iADFileDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE IADFile SET ");
        buffer.append("FileName = ?, ");
        buffer.append("UpLoadDate = ?, ");
        buffer.append("CompanyCode = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE IADFile SET ");
            debugBuffer.append("FileName = '" + iADFileDto.getFileName() + "', ");
            debugBuffer.append("UpLoadDate = '" + iADFileDto.getUpLoadDate() + "', ");
            debugBuffer.append("CompanyCode = '" + iADFileDto.getCompanyCode() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("ContactNo=").append("'").append(iADFileDto.getContactNo()).append("' AND ");
            debugBuffer.append("FileUuid=").append("'").append(iADFileDto.getFileUuid()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ContactNo = ? And ");
        buffer.append("FileUuid = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,iADFileDto.getFileName());
        dbManager.setDateTime(2,iADFileDto.getUpLoadDate());
        dbManager.setString(3,iADFileDto.getCompanyCode());
        //���������ֶ�;
        dbManager.setString(4,iADFileDto.getContactNo());
        dbManager.setString(5,iADFileDto.getFileUuid());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param contactNo ContactNo
     * @param fileUuid FileUuid
     * @return IADFileDto
     * @throws Exception
     */
    public IADFileDto findByPrimaryKey(String contactNo,String fileUuid)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("ContactNo,");
        buffer.append("FileName,");
        buffer.append("FileUuid,");
        buffer.append("UpLoadDate,");
        buffer.append("CompanyCode ");
        buffer.append("FROM IADFile ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ContactNo=").append("'").append(contactNo).append("' AND ");
            debugBuffer.append("FileUuid=").append("'").append(fileUuid).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ContactNo = ? And ");
        buffer.append("FileUuid = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,contactNo);
        dbManager.setString(2,fileUuid);
        ResultSet resultSet = dbManager.executePreparedQuery();
        IADFileDto iADFileDto = null;
        if(resultSet.next()){
            iADFileDto = new IADFileDto();
            iADFileDto.setContactNo(dbManager.getString(resultSet,1));
            iADFileDto.setFileName(dbManager.getString(resultSet,2));
            iADFileDto.setFileUuid(dbManager.getString(resultSet,3));
            iADFileDto.setUpLoadDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_SECOND,4));
            iADFileDto.setCompanyCode(dbManager.getString(resultSet,5));
        }
        resultSet.close();
        return iADFileDto;
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
        buffer.append("ContactNo,");
        buffer.append("FileName,");
        buffer.append("FileUuid,");
        buffer.append("UpLoadDate,");
        buffer.append("CompanyCode ");
        buffer.append("FROM IADFile WHERE ");
        buffer.append(conditions);
        boolean supportPaging = false;//���ݿ��Ƿ�֧�ַ�ҳ
        if (pageNo > 0){
            //Ŀǰֻ��Oracle�Ż�
            if(dbManager.getConnection().getMetaData().getDatabaseProductName().equalsIgnoreCase("Oracle")){
                buffer.insert(0,"SELECT * FROM ( SELECT row_.*, rownum rownum_ FROM (");
                buffer.append(") row_ WHERE rownum <= "+rowsPerPage * pageNo+") WHERE rownum_ > "+rowsPerPage * (pageNo - 1));
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
        IADFileDto iADFileDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            iADFileDto = new IADFileDto();
            iADFileDto.setContactNo(dbManager.getString(resultSet,1));
            iADFileDto.setFileName(dbManager.getString(resultSet,2));
            iADFileDto.setFileUuid(dbManager.getString(resultSet,3));
            iADFileDto.setUpLoadDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_SECOND,4));
            iADFileDto.setCompanyCode(dbManager.getString(resultSet,5));
            collection.add(iADFileDto);
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
        buffer.append("DELETE FROM IADFile WHERE ");
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
        buffer.append("SELECT count(*) FROM IADFile WHERE ");
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
