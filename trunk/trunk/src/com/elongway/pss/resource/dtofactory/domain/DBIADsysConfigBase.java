package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;

import com.elongway.pss.dto.domain.IADsysConfigDto;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADsysConfig�����ݷ��ʶ������<br>
 * ������ 2006-08-10 21:55:02.187<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADsysConfigBase{
    /**
     * ��Դ�������ʵ�����������ݿ����.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBIADsysConfigBase.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBIADsysConfigBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * ����һ������
     * @param iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public void insert(IADsysConfigDto iADsysConfigDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO IADsysConfig (");
        buffer.append("ParameterCode,");
        buffer.append("ParameterType,");
        buffer.append("CompanyCode,");
        buffer.append("ParameterValue,");
        buffer.append("AreaCode,");
        buffer.append("ValidStatus,");
        buffer.append("ParameterDesc,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(iADsysConfigDto.getParameterCode()).append("',");
            debugBuffer.append("'").append(iADsysConfigDto.getParameterType()).append("',");
            debugBuffer.append("'").append(iADsysConfigDto.getCompanyCode()).append("',");
            debugBuffer.append("'").append(iADsysConfigDto.getParameterValue()).append("',");
            debugBuffer.append("'").append(iADsysConfigDto.getAreaCode()).append("',");
            debugBuffer.append("'").append(iADsysConfigDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(iADsysConfigDto.getParameterDesc()).append("',");
            debugBuffer.append("'").append(iADsysConfigDto.getRemark()).append("',");
            debugBuffer.append("'").append(iADsysConfigDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,iADsysConfigDto.getParameterCode());
        dbManager.setString(2,iADsysConfigDto.getParameterType());
        dbManager.setString(3,iADsysConfigDto.getCompanyCode());
        dbManager.setString(4,iADsysConfigDto.getParameterValue());
        dbManager.setString(5,iADsysConfigDto.getAreaCode());
        dbManager.setString(6,iADsysConfigDto.getValidStatus());
        dbManager.setString(7,iADsysConfigDto.getParameterDesc());
        dbManager.setString(8,iADsysConfigDto.getRemark());
        dbManager.setString(9,iADsysConfigDto.getFlag());
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
        buffer.append("INSERT INTO IADsysConfig (");
        buffer.append("ParameterCode,");
        buffer.append("ParameterType,");
        buffer.append("CompanyCode,");
        buffer.append("ParameterValue,");
        buffer.append("AreaCode,");
        buffer.append("ValidStatus,");
        buffer.append("ParameterDesc,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            IADsysConfigDto iADsysConfigDto = (IADsysConfigDto)i.next();
            dbManager.setString(1,iADsysConfigDto.getParameterCode());
            dbManager.setString(2,iADsysConfigDto.getParameterType());
            dbManager.setString(3,iADsysConfigDto.getCompanyCode());
            dbManager.setString(4,iADsysConfigDto.getParameterValue());
            dbManager.setString(5,iADsysConfigDto.getAreaCode());
            dbManager.setString(6,iADsysConfigDto.getValidStatus());
            dbManager.setString(7,iADsysConfigDto.getParameterDesc());
            dbManager.setString(8,iADsysConfigDto.getRemark());
            dbManager.setString(9,iADsysConfigDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * ������ɾ��һ������
     * @param parameterCode ParameterCode
     * @param parameterType ParameterType
     * @param companyCode CompanyCode
     * @throws Exception
     */
    public void delete(String parameterCode,String parameterType,String companyCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM IADsysConfig ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ParameterCode=").append("'").append(parameterCode).append("' AND ");
            debugBuffer.append("ParameterType=").append("'").append(parameterType).append("' AND ");
            debugBuffer.append("CompanyCode=").append("'").append(companyCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ParameterCode = ? And ");
        buffer.append("ParameterType = ? And ");
        buffer.append("CompanyCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,parameterCode);
        dbManager.setString(2,parameterType);
        dbManager.setString(3,companyCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * ����������һ������(���������޷����)
     * @param iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public void update(IADsysConfigDto iADsysConfigDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE IADsysConfig SET ");
        buffer.append("ParameterValue = ?, ");
        buffer.append("AreaCode = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("ParameterDesc = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE IADsysConfig SET ");
            debugBuffer.append("ParameterValue = '" + iADsysConfigDto.getParameterValue() + "', ");
            debugBuffer.append("AreaCode = '" + iADsysConfigDto.getAreaCode() + "', ");
            debugBuffer.append("ValidStatus = '" + iADsysConfigDto.getValidStatus() + "', ");
            debugBuffer.append("ParameterDesc = '" + iADsysConfigDto.getParameterDesc() + "', ");
            debugBuffer.append("Remark = '" + iADsysConfigDto.getRemark() + "', ");
            debugBuffer.append("Flag = '" + iADsysConfigDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("ParameterCode=").append("'").append(iADsysConfigDto.getParameterCode()).append("' AND ");
            debugBuffer.append("ParameterType=").append("'").append(iADsysConfigDto.getParameterType()).append("' AND ");
            debugBuffer.append("CompanyCode=").append("'").append(iADsysConfigDto.getCompanyCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ParameterCode = ? And ");
        buffer.append("ParameterType = ? And ");
        buffer.append("CompanyCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���ø����ֶ�;
        dbManager.setString(1,iADsysConfigDto.getParameterValue());
        dbManager.setString(2,iADsysConfigDto.getAreaCode());
        dbManager.setString(3,iADsysConfigDto.getValidStatus());
        dbManager.setString(4,iADsysConfigDto.getParameterDesc());
        dbManager.setString(5,iADsysConfigDto.getRemark());
        dbManager.setString(6,iADsysConfigDto.getFlag());
        //���������ֶ�;
        dbManager.setString(7,iADsysConfigDto.getParameterCode());
        dbManager.setString(8,iADsysConfigDto.getParameterType());
        dbManager.setString(9,iADsysConfigDto.getCompanyCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * ����������һ������
     * @param parameterCode ParameterCode
     * @param parameterType ParameterType
     * @param companyCode CompanyCode
     * @return IADsysConfigDto
     * @throws Exception
     */
    public IADsysConfigDto findByPrimaryKey(String parameterCode,String parameterType,String companyCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //ƴSQL���
        buffer.append("SELECT ");
        buffer.append("ParameterCode,");
        buffer.append("ParameterType,");
        buffer.append("CompanyCode,");
        buffer.append("ParameterValue,");
        buffer.append("AreaCode,");
        buffer.append("ValidStatus,");
        buffer.append("ParameterDesc,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append("FROM IADsysConfig ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ParameterCode=").append("'").append(parameterCode).append("' AND ");
            debugBuffer.append("ParameterType=").append("'").append(parameterType).append("' AND ");
            debugBuffer.append("CompanyCode=").append("'").append(companyCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ParameterCode = ? And ");
        buffer.append("ParameterType = ? And ");
        buffer.append("CompanyCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //���������ֶ�;
        dbManager.setString(1,parameterCode);
        dbManager.setString(2,parameterType);
        dbManager.setString(3,companyCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        IADsysConfigDto iADsysConfigDto = null;
        if(resultSet.next()){
            iADsysConfigDto = new IADsysConfigDto();
            iADsysConfigDto.setParameterCode(dbManager.getString(resultSet,1));
            iADsysConfigDto.setParameterType(dbManager.getString(resultSet,2));
            iADsysConfigDto.setCompanyCode(dbManager.getString(resultSet,3));
            iADsysConfigDto.setParameterValue(dbManager.getString(resultSet,4));
            iADsysConfigDto.setAreaCode(dbManager.getString(resultSet,5));
            iADsysConfigDto.setValidStatus(dbManager.getString(resultSet,6));
            iADsysConfigDto.setParameterDesc(dbManager.getString(resultSet,7));
            iADsysConfigDto.setRemark(dbManager.getString(resultSet,8));
            iADsysConfigDto.setFlag(dbManager.getString(resultSet,9));
        }
        resultSet.close();
        return iADsysConfigDto;
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
        buffer.append("ParameterCode,");
        buffer.append("ParameterType,");
        buffer.append("CompanyCode,");
        buffer.append("ParameterValue,");
        buffer.append("AreaCode,");
        buffer.append("ValidStatus,");
        buffer.append("ParameterDesc,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append("FROM IADsysConfig WHERE ");
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
        IADsysConfigDto iADsysConfigDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            iADsysConfigDto = new IADsysConfigDto();
            iADsysConfigDto.setParameterCode(dbManager.getString(resultSet,1));
            iADsysConfigDto.setParameterType(dbManager.getString(resultSet,2));
            iADsysConfigDto.setCompanyCode(dbManager.getString(resultSet,3));
            iADsysConfigDto.setParameterValue(dbManager.getString(resultSet,4));
            iADsysConfigDto.setAreaCode(dbManager.getString(resultSet,5));
            iADsysConfigDto.setValidStatus(dbManager.getString(resultSet,6));
            iADsysConfigDto.setParameterDesc(dbManager.getString(resultSet,7));
            iADsysConfigDto.setRemark(dbManager.getString(resultSet,8));
            iADsysConfigDto.setFlag(dbManager.getString(resultSet,9));
            collection.add(iADsysConfigDto);
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
        buffer.append("DELETE FROM IADsysConfig WHERE ");
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
        buffer.append("SELECT count(*) FROM IADsysConfig WHERE ");
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
