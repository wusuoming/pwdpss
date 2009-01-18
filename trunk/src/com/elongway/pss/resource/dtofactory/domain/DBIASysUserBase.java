package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IASysUserDto;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IASysUser�����ݷ��ʶ������<br>
 * ������ 2006-09-08 15:52:53.577<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIASysUserBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBIASysUserBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBIASysUserBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void insert(IASysUserDto iASysUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO IASysUser (");
        buffer.append("UserCode,");
        buffer.append("AreaCode,");
        buffer.append("UserName,");
        buffer.append("Password,");
        buffer.append("CompanyCode,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("Fax,");
        buffer.append("UserGrade,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(iASysUserDto.getUserCode()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getAreaCode()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getUserName()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getPassword()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getCompanyCode()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getPhoneNumber()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getEmail()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getFax()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getUserGrade()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,iASysUserDto.getUserCode());
        dbManager.setString(2,iASysUserDto.getAreaCode());
        dbManager.setString(3,iASysUserDto.getUserName());
        dbManager.setString(4,iASysUserDto.getPassword());
        dbManager.setString(5,iASysUserDto.getCompanyCode());
        dbManager.setString(6,iASysUserDto.getPhoneNumber());
        dbManager.setString(7,iASysUserDto.getEmail());
        dbManager.setString(8,iASysUserDto.getFax());
        dbManager.setString(9,iASysUserDto.getUserGrade());
        dbManager.setString(10,iASysUserDto.getValidStatus());
        dbManager.setString(11,iASysUserDto.getFlag());
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
        buffer.append("INSERT INTO IASysUser (");
        buffer.append("UserCode,");
        buffer.append("AreaCode,");
        buffer.append("UserName,");
        buffer.append("Password,");
        buffer.append("CompanyCode,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("Fax,");
        buffer.append("UserGrade,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            IASysUserDto iASysUserDto = (IASysUserDto)i.next();
            dbManager.setString(1,iASysUserDto.getUserCode());
            dbManager.setString(2,iASysUserDto.getAreaCode());
            dbManager.setString(3,iASysUserDto.getUserName());
            dbManager.setString(4,iASysUserDto.getPassword());
            dbManager.setString(5,iASysUserDto.getCompanyCode());
            dbManager.setString(6,iASysUserDto.getPhoneNumber());
            dbManager.setString(7,iASysUserDto.getEmail());
            dbManager.setString(8,iASysUserDto.getFax());
            dbManager.setString(9,iASysUserDto.getUserGrade());
            dbManager.setString(10,iASysUserDto.getValidStatus());
            dbManager.setString(11,iASysUserDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @throws Exception
     */
    public void delete(String userCode,String areaCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM IASysUser ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserCode=").append("'").append(userCode).append("' AND ");
            debugBuffer.append("AreaCode=").append("'").append(areaCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserCode = ? And ");
        buffer.append("AreaCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,userCode);
        dbManager.setString(2,areaCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void update(IASysUserDto iASysUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE IASysUser SET ");
        buffer.append("UserName = ?, ");
        buffer.append("Password = ?, ");
        buffer.append("CompanyCode = ?, ");
        buffer.append("PhoneNumber = ?, ");
        buffer.append("Email = ?, ");
        buffer.append("Fax = ?, ");
        buffer.append("UserGrade = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE IASysUser SET ");
            debugBuffer.append("UserName = '" + iASysUserDto.getUserName() + "', ");
            debugBuffer.append("Password = '" + iASysUserDto.getPassword() + "', ");
            debugBuffer.append("CompanyCode = '" + iASysUserDto.getCompanyCode() + "', ");
            debugBuffer.append("PhoneNumber = '" + iASysUserDto.getPhoneNumber() + "', ");
            debugBuffer.append("Email = '" + iASysUserDto.getEmail() + "', ");
            debugBuffer.append("Fax = '" + iASysUserDto.getFax() + "', ");
            debugBuffer.append("UserGrade = '" + iASysUserDto.getUserGrade() + "', ");
            debugBuffer.append("ValidStatus = '" + iASysUserDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + iASysUserDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserCode=").append("'").append(iASysUserDto.getUserCode()).append("' AND ");
            debugBuffer.append("AreaCode=").append("'").append(iASysUserDto.getAreaCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserCode = ? And ");
        buffer.append("AreaCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,iASysUserDto.getUserName());
        dbManager.setString(2,iASysUserDto.getPassword());
        dbManager.setString(3,iASysUserDto.getCompanyCode());
        dbManager.setString(4,iASysUserDto.getPhoneNumber());
        dbManager.setString(5,iASysUserDto.getEmail());
        dbManager.setString(6,iASysUserDto.getFax());
        dbManager.setString(7,iASysUserDto.getUserGrade());
        dbManager.setString(8,iASysUserDto.getValidStatus());
        dbManager.setString(9,iASysUserDto.getFlag());
        //���������ֶ�;
        dbManager.setString(10,iASysUserDto.getUserCode());
        dbManager.setString(11,iASysUserDto.getAreaCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @return IASysUserDto
     * @throws Exception
     */
    public IASysUserDto findByPrimaryKey(String userCode,String areaCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("UserCode,");
        buffer.append("AreaCode,");
        buffer.append("UserName,");
        buffer.append("Password,");
        buffer.append("CompanyCode,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("Fax,");
        buffer.append("UserGrade,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM IASysUser ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserCode=").append("'").append(userCode).append("' AND ");
            debugBuffer.append("AreaCode=").append("'").append(areaCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserCode = ? And ");
        buffer.append("AreaCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,userCode);
        dbManager.setString(2,areaCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        IASysUserDto iASysUserDto = null;
        if(resultSet.next()){
            iASysUserDto = new IASysUserDto();
            iASysUserDto.setUserCode(dbManager.getString(resultSet,1));
            iASysUserDto.setAreaCode(dbManager.getString(resultSet,2));
            iASysUserDto.setUserName(dbManager.getString(resultSet,3));
            iASysUserDto.setPassword(dbManager.getString(resultSet,4));
            iASysUserDto.setCompanyCode(dbManager.getString(resultSet,5));
            iASysUserDto.setPhoneNumber(dbManager.getString(resultSet,6));
            iASysUserDto.setEmail(dbManager.getString(resultSet,7));
            iASysUserDto.setFax(dbManager.getString(resultSet,8));
            iASysUserDto.setUserGrade(dbManager.getString(resultSet,9));
            iASysUserDto.setValidStatus(dbManager.getString(resultSet,10));
            iASysUserDto.setFlag(dbManager.getString(resultSet,11));
        }
        resultSet.close();
        return iASysUserDto;
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
        buffer.append("UserCode,");
        buffer.append("AreaCode,");
        buffer.append("UserName,");
        buffer.append("Password,");
        buffer.append("CompanyCode,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("Fax,");
        buffer.append("UserGrade,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM IASysUser WHERE ");
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
        IASysUserDto iASysUserDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            iASysUserDto = new IASysUserDto();
            iASysUserDto.setUserCode(dbManager.getString(resultSet,1));
            iASysUserDto.setAreaCode(dbManager.getString(resultSet,2));
            iASysUserDto.setUserName(dbManager.getString(resultSet,3));
            iASysUserDto.setPassword(dbManager.getString(resultSet,4));
            iASysUserDto.setCompanyCode(dbManager.getString(resultSet,5));
            iASysUserDto.setPhoneNumber(dbManager.getString(resultSet,6));
            iASysUserDto.setEmail(dbManager.getString(resultSet,7));
            iASysUserDto.setFax(dbManager.getString(resultSet,8));
            iASysUserDto.setUserGrade(dbManager.getString(resultSet,9));
            iASysUserDto.setValidStatus(dbManager.getString(resultSet,10));
            iASysUserDto.setFlag(dbManager.getString(resultSet,11));
            collection.add(iASysUserDto);
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
        buffer.append("DELETE FROM IASysUser WHERE ");
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
        buffer.append("SELECT count(*) FROM IASysUser WHERE ");
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
