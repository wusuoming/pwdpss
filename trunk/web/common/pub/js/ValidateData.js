/****************************************************************************
 * DESC       ������У������
 * AUTHOR     ��zhouxianli
 * CREATEDATE ��2003-05-04
 * MODIFYLIST ��   Name       Date            Reason/Contents
 *          ------------------------------------------------------
 *							������        2006-08-21			 ����IAPlatform�޸ġ�
 ****************************************************************************/

/**
 * ��������У��
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Sinosoft</p>
 * @author zhouxianli
 * @version 1.0
 */

 /**
    �ṹΪ �ֶ������ֶ����������ͣ��Ƿ�����Ϊ��
           4��Ǳ����
 */

var schemaColumns = new Array(); //�洢�ֶνṹ������

function schemaColumn(name,desc,dataType,allowNulls){
    this.name = name;
    this.desc = desc;
    this.dataType = dataType;
    this.allowNulls = allowNulls;
}


// ��������ӣ�Ϊ��û�б����ı���
function getSchemaTableColumn(tableName,  fieldName){
    for(var i=0;i<schemaColumns.length;i++){
        if((tableName + fieldName).toLowerCase()==schemaColumns[i].name.toLowerCase())
            return schemaColumns[i];
    }
    return null;
}

function getSchemaColumn(name){
    for(var i=0;i<schemaColumns.length;i++){
        if(name.toLower()==schemaColumns[i].name.toLower())
            return schemaColumns[i];
    }
    return null;
}

//��ʼ������
var columnIndex = 0;
schemaColumns[columnIndex++] = new schemaColumn("keyword","�ؼ���","text",false);
//schemaColumns[columnIndex++] = new schemaColumn("userCode","�û�����","varchar(10,10)",false);
//schemaColumns[columnIndex++] = new schemaColumn("password","�û�����","char(10)",true);
schemaColumns[columnIndex++] = new schemaColumn("cssStyle","��ʽ","varchar(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("projectNo","��Ŀ���","char(15)",true);

//Table Column ValidateData Start--Don't modify
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogUserCode","���׷����û�","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogBizType","�������ʹ���","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogIaBizIP","��������IP��ַ","CHAR(15)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogCompanyCode","���׷���˾����","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogBizCode","������","VARCHAR2(2)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogBizStartDate","���׷���ʱ��","DATE",false);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogText","������Ϣ","VARCHAR2(1000)",true);

schemaColumns[columnIndex++] = new schemaColumn("iacMainPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainCompanyCode","ѯ�۹�˾����","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPolicyNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPrintNo","���ձ�־����","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainBusinessNature","��������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainInputDate","Ͷ��ȷ��ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainOperateDate","ǩ������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainEngageText","�ر�Լ��","VARCHAR2(4000)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainHandlerName","������","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainOperatorName","����Ա","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainKindCode","���ִ���","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainAmount","���⳥�޶�","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainStartDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainEndDate","����ֹ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainSumPremium","�ܱ���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPremium","��׼����","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPeccancyCoeff","Υ������ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainClaimCoeff","�������ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainDriverCoeff","ָ����ʻԱ����ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainAreaCoeff","����ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainCommisionRate","���������ѱ���","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainBasePremium","��������","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainCurrency","�������","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPaidPremium","ʵ�ձ���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainChgReason","ʵ�ձ��ѱ仯ԭ��","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainChgDetail","ʵ�ձ��ѱ仯ԭ������","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainEndorseTimes","���Ĵ���","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainBizType","ҵ���ύ����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainBizStatus","��ǰҵ��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainUnderwriteReason","ֱ�ӳб�ԭ��","CHAR(1)",true);

schemaColumns[columnIndex++] = new schemaColumn("iacPreengagePreengageNo","ԤԼ��Ϣ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageCompanyCode","�б���˾����","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageIpAddress","�ϴ���ַ","VARCHAR2(60)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageFileName","���ձ�־����ԤԼ�ļ�����","VarChar2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageResult","������","CHAR(1)",true);

schemaColumns[columnIndex++] = new schemaColumn("iadCodeCodeType","��������","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCodeCodeCode","ҵ�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCodeCodeCName","ҵ��������ĺ���","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCodeCodeEName","ҵ�����Ӣ�ĺ���","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCodeValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCodeFlag","��־�ֶ�","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iadCompanyCompanyCode","��������","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyCompanyCName","������������","VARCHAR2(80)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyCompanyEName","����Ӣ������","VARCHAR2(80)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyAddressCName","��ַ��������","VARCHAR2(40)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyAddressEName","��ַӢ������","VARCHAR2(80)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyPostCode","�ʱ�","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyPhone","�绰","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyFax","����","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyUpperCompanyCode","�ϼ���������","VARCHAR2(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyInsurerName","�������չ�˾����","VARCHAR2(80)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyCompanyType","��������","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyRemark","��ע","VARCHAR2(40)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyFlag","��־�ֶ�","CHAR(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondComCode","���Ŵ���PK","VARCHAR2(8)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondRiskCode","���ִ���PK","VARCHAR2(4)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondFactorType","��������PK","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondKindCode","�ձ����PK","VARCHAR2(7)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondValidDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondRatePeriod","��������PK","NUMBER(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondFactorCode","�������Ӵ���PK","VARCHAR2(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondFactorName","������������","VARCHAR2(60)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondFlag","��־λ","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondValidStatus","�Ƿ���Ч��־","VARCHAR2(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRiskCode","���ִ���PK","VARCHAR2(4)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorType","��������PK","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorCode","�������Ӵ���PK","VARCHAR2(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorName","������������","VARCHAR2(60)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorTable","�����������ڱ���","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorColumn","�������������ֶ���","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorFlag","��������ȡֵ����","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValueTable","���������","VARCHAR2(18)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValueField1","�������������","VARCHAR2(18)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValueValue1","��������������","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValueField2","�������������2","VARCHAR2(18)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValueValue2","��������������2","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorValue","1-2000��,2-2003��","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRateType","ϵ����������","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRateGroupSegment","��prpdRateGroup�е�λ��","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRateUsualSegment","�ڷ��ʱ�prpdRateUsual�е�λ��","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRelationFactor","���ʹ�����Ϣ","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValidStatus","�Ƿ���Ч��־","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFlag","��־λ","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValidDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRatePeriod","��������PK","NUMBER(15)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupComCode","��������","CHAR(8)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupRateType","ϵ������","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupRiskCode","����","VARCHAR2(4)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupKindCode","�ձ�","VARCHAR2(7)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupRateGroupCode","������������","VARCHAR2(255)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupRateTypeValue","�������ֵ","VARCHAR2(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupFlag","��־λ","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupValidDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupRatePeriod","��������PK","NUMBER(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupValidStatus","�Ƿ���Ч��־","VARCHAR2(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualRiskCode","���ִ���","VARCHAR2(4)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualKindCode","�ձ����","VARCHAR2(7)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualRatePeriod","��������","NUMBER(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualValidDate","��Ч����","DATE",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualRateCode","���ʴ���","VARCHAR2(255)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualCurrency","�ұ�","VARCHAR2(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualBasePremium","��׼����","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualRate","��׼����","NUMBER(8,5)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualFlag","��־λ","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualValidStatus","�Ƿ���Ч��־","VARCHAR2(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigParameterCode","�������ƴ���","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigParameterType","[1,2]����������ϵͳ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigCompanyCode","������������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigParameterValue","�������ý��","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigAreaCode","��������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigParameterDesc","��������","VARCHAR2(255)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigFlag","��־�ֶ�","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaGradeGradeCode","��λ����","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeGradeName","��λ����","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeUserType","ʹ�����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeDescription","��λ����","VARCHAR2(160)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeFlag","��־�ֶ�","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskGradeCode","��λ����","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskTaskCode","�������","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskCompanyCode","�ɴ���Ļ�������","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskPowerLevel","Ȩ�޼���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskFlag","��־�ֶ�","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseClaimQueryNo","�������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseCompanyCode","�б���˾����(����ƽ̨����)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseAddTimes","׷�Ӵ���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseSerialno","���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseClaimType","�������ʹ���","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseCurrency","�ұ�","CHAR(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseAppendLoss","׷�ӽ��","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseInputDate","׷��ʱ��","Date",true);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseRemark","��ע","VARCHAR2(200)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialClaimClaimQueryNo","�������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimCompanyCode","�б���˾����(����ƽ̨����)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimEstimateLoss","������","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimClaimNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimClaimType","�������ʹ���","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimLicenseNo","���ճ������ƺ���","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimLicenseType","���ճ�����������","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimRegistTimesFlag","�Ƿ������մ���","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimDamageDate","����ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimInputDate","���ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimFlag","��־λ","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusClaimQueryNo","�������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusCompanyCode","�б���˾����(����ƽ̨����)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusPolicyNo","��������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusRegistNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusClaimNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusCaseNo","�ⰸ��","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusReportDate","����ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusClaimDate","����ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusEndCaseDate","�᰸ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusLicenseNo","���ճ������ƺ���","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusLicenseColorCode","���Ƶ�ɫ����","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusCarKindCode","�����������","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusLicenseType","���ճ�����������","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusClaimType","����״̬","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusKindCode","�永��������","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusInputDate","״̬ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusFlag","��־λ","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimQueryNo","�������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimConfirmNo","�ⰸ�᰸У����","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseCompanyCode","�б���˾����(����ƽ̨����)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCasePolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCasePolicyNo","��������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseRegistNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseCaseNo","�ⰸ��","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseReportDate","����ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimDate","����ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseEndCaseDate","�᰸ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseLicenseNo","���ճ������ƺ���","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseLicenseColorCode","���Ƶ�ɫ����","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseCarKindCode","�����������","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseLicenseType","���ճ�����������","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseDriverName","���ռ�ʻԱ����","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseIdentifyType","���ռ�ʻԱ֤������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseIdentifyNo","���ռ�ʻԱ֤������","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseRegistTimesFlag","�Ƿ������մ���","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseDamageDate","����ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseDamageAddress","���յص�","CHAR(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseFact","���վ���","VARCHAR2(1000)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseHandleDept","�¹ʴ�����","CHAR(60)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseIndemDuty","�¹���������","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseIndemnityDuty","�¹����λ���","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimFlag","�Ƿ����ڱ�������","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimType","��������","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseCurrency","�ұ�","CHAR(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseEstimateLoss","������","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseSumPaid","����ܽ��","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCasePrepaidReason","�渶ԭ��","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseCancelReason","����ԭ��","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseInputDate","���ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseValidStatus","��Ч״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseFlag","��־λ","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidClaimQueryNo","�������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidCompanyCode","�б���˾����(����ƽ̨����)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidClaimNo","������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidSerialNo","���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidRegistNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidPolicyNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidIndemnityDuty","�⳥���α���","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidLossType","��ʧ�⳥����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidRiskType","�⳥��������","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidKindCode","�⳥���ִ���","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidCurrency","�ұ�","CHAR(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidSumLoss","��ʧ���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidSumPaid","�⳥���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidAppendFeeFlag","�᰸׷�ӷ��ñ�־","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidFlag","��־λ","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailClaimQueryNo","�������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailCompanyCode","�б���˾����(����ƽ̨����)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailClaimNo","������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailSerialNo","��ʧ�⳥���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailDetailSerialNo","��ʧ��ϸ���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailClaimType","��ʧ�⳥����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailFeeType","��ʧ�⳥ϸ��","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailCurrency","�ұ�","CHAR(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailSumLoss","��ʧ���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailSumPaid","�⳥���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailIndemnityDuty","�⳥���α���","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailAppendFeeFlag","�᰸׷�ӷ��ñ�־","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailFlag","��־λ","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialRegistClaimQueryNo","�������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistCompanyCode","�б���˾����(����ƽ̨����)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistPolicyNo","��������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistRegistNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistDamageDate","����ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistLicenseNo","���ճб��������ƺ���","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistLicenseType","���ճб�������������","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistRegistTimesFlag","�Ƿ������մ���","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistReportDate","����ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistInputDate","���ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistFlag","��־λ","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyClaimQueryNo","�������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyCompanyCode","�б���˾����(����ƽ̨����)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyRegistNo","��������","VARCHAR2(22)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartySerialNo","���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyCaseNo","�ⰸ���","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyClaimNo","������","CHAR(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyLicenseNo","���ƺ�","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyLicenseType","��������","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyEngineNo","��������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyFrameNo","���ܺ�/VIN��","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyFlag","��־�ֶ�","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverEndorseQueryNo","���Ĳ�ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverSerialNo","ָ����ʻԱ���","INTEGER",false);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverEndorseNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverPolicyNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverIdentifyNo","�ƶ���ʻԱ���֤������","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverIdentifyType","ָ����ʻԱ֤������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverDriverProperty","ָ����ʻԱ����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverDriverName","��ʻԱ����","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverIdentifyArea","��Ͻ����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverSex","�Ա�","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverDrivingYears","����","NUMBER(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverAge","����","NUMBER(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverAgreedCarType","׼�ݳ���","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverColumn_17","Column_17","<Undefined>",true);

schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseQueryNo","���Ĳ�ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadUserCode","�����û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadCompanyCode","�б���˾����","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseConfirmNo","����ȷ����","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseType","��������","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseTimes","�������Ĵ���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseNo","��������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadPolicyNo","��������","VARCHAR2(22)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadValidDate","��Ч����","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorsePremium","����Ӧ�˲���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadFormula","���ļ��㹫ʽ","VARCHAR2(1000)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadCurrency","�ұ�","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadChgPremium","ʵ�ʱ��ѱ仯","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseReason","ʵ�ձ��ѱ仯ԭ��/�˱�ԭ��","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseDetail","ʵ�ձ��ѱ仯ԭ������","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadInputDate","��������(���Ĳ�ѯ����)","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadConfirmDate","����ȷ������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadCancelDate","���ĳ�������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadBizStatus","��ǰҵ��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadUnderwriteReason","ֱ������ԭ��","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadValidStatus","Ч��״̬","CHAR(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iapInsuredEndorseQueryNo","���Ĳ�ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredSerialNo","���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredEndorseNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPolicyNo","��������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredInsuredType","��ϵ������","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredInsuredName","��ϵ������","VARCHAR2(120)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredInsuredAddress","��ϵ�˵�ַ","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredInsuredNature","��ϵ������","VARCHAR2(12)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredIdentifytype","֤������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredIdentifyNo","������֯��������","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPostAddress","ͨѶ��ַ","VARCHAR2(40)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPostCode","��������","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPhone","�绰","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredBusinessSort","��λ���ʴ���","VARCHAR2(4)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredInsuredFlag","��ϵ�˱�־","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredFlag","��־�ֶ�","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapItemCarEndorseQueryNo","���Ĳ�ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarCompanyCode","�б���˾����(����ƽ̨����)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarEndorseNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarPolicyNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarLicenserCode","��������֤����","VARCHAR2(15)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarLicenseNo","���ƺ���","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarLicenseColorCode","���Ƶ�ɫ����","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarLicenseType","��������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarCarKindCode","�����������","VARCHAR2(2)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarUseNatureCode","����ʹ�����ʴ���","CHAR(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarEngineNo","��������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarFrameNo","���ܺ�/VIN��","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarUseYears","��ʹ������","NUMBER(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarRunMiles","����ʻ�����(����)","NUMBER(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarNewCarFlag","�³���־","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarEcdemicCarflag","��س���־","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarManufactory","���쳧����","VARCHAR2(168)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarBrandName","����Ʒ��","VARCHAR2(64)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarModelCode","�����ͺ�","VARCHAR2(64)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarAmendDriver","�Ƿ��޸ļ�ʻԱ��Ϣ","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarAgreedDriverCount","ָ����ʻԱ����","NUMBER(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarBizStatus","ҵ����״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarRemark","��ע","VARCHAR2(200)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapItemKindEndorseQueryNo","���Ĳ�ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindEndorseNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindPolicyNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindRiskType","�������","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindSerialNo","��������","INTEGER",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindKindCode","���ִ���","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindCurrency","�ұ�","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindAmount","���⳥�޶�","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindStartDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindEndDate","����ֹ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindPremium","ʵ�ձ���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindPeccancyCoeff","Υ������ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindClaimCoeff","�������ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindDriverCoeff","ָ����ʻԱ����ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindAreaCoeff","����ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindCommisionRate","���������ѱ���","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindBasePremium","��������","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindChgPremium","ʵ�ʱ��ѱ仯","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindRemark","��ע","VARCHAR2(200)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapMainCompanyCode","ѯ�۹�˾����","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainEndorseQueryNo","���Ĳ�ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainEndorseNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPolicyNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPrintNo","���ձ�־����","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainInputDate","Ͷ��ȷ��ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainBusinessNature","��������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainOperateDate","ǩ������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainEngageText","�ر�Լ��","VARCHAR2(4000)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainHandlerName","������","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainOperatorName","����Ա","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainKindCode","���ִ���","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainAmount","���⳥�޶�","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainStartDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainEndDate","����ֹ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainSumPremium","�ܱ���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPremium","��׼����","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPeccancyCoeff","Υ������ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainClaimCoeff","�������ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainDriverCoeff","ָ����ʻԱ����ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainAreaCoeff","����ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainCommisionRate","���������ѱ���","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainBasePremium","��������","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainCurrency","�������","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPaidPremium","ʵ�ձ���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainChgReason","ʵ�ձ��ѱ仯ԭ��","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainChgDetail","ʵ�ձ��ѱ仯ԭ������","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainEndorseTimes","���Ĵ���","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainBizType","ҵ���ύ����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainValidStatus","��Ч״̬��־","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainBizStatus","��ǰҵ��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainUnderwriteReason","ֱ�ӳб�ԭ��","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainChgPremium","�������ı��ѱ仯","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainRemark","��ע","VARCHAR2(200)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverLicenseNo","��ʻ֤��","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverDriverName","��ʻԱ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverIdentifyType","Υ����ʻԱ֤������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverIdentifyNo","���֤����","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverBirthday","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverSex","�Ա�","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverNationality","����","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverIdentifyArea","��Ͻ����","VARCHAR2(10)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverLicensedDate","������֤����","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverValidDate","��Ч����","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverCheckDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverDrivingCarType","׼�ݳ���","VARCHAR2(10)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverFlag","��־","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoLicenseNo","���ƺ���","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoLicenseType","��������","VARCHAR2(2)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoUseNatureCode","ʹ������","CHAR(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoCarSymbol","������ʶ����","VARCHAR2(25)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoEngineNo","��������","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoFrameNo","���ܺ�/VIN��","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoColorCode","������ɫ","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoFactoryDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoEnrollDate","���εǼ�����","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoValidEndDate","������Ч��ֹ","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoRejectEndDate","������ֹ","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoEndDate","�ձ�����","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoCarOwner","������������","VARCHAR2(60)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoManufactory","���쳧����","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoBrandName1","����Ʒ��1","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoBrandName2","����Ʒ��2","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoModelCode","�����ͺ�","VARCHAR2(64)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoCarKindCode","��������","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoCheckDate","�����������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoTonnage","�˶�������","NUMBER(10,3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoSeat","�˶��ؿ�","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoStatus","����״̬","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoHaulage","ǣ��������","VARCHAR2(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoFlag","��־�ֶ�","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyTicketNo","��������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyTicketType","���������","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyHandleDept","������ش���","VARCHAR2(10)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyIdentifyArea","��Ͻ����","VARCHAR2(10)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyDocumentNo","�������","VARCHAR2(12)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyDriverName","����","VARCHAR2(22)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyLicenseNo","���ƺ���","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyLicenseType","��������","VARCHAR2(2)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyEngineNo","��������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyFrameNo","���ܺ�/VIN��","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyTrafficType","��ͨ��ʽ","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyDate","Υ��ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyFineDate","����ʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyAddress","Υ�µص�","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyCode","Υ����Ϊ����","VARCHAR2(4)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyCoeff","Υ������ϵ��","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyType","Υ����Ϊ����","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyIdentifyType","ָ����ʻԱ֤������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyIdentifyNo","�ƶ���ʻԱ���֤������","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyDetail","Υ����Ϊ����","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyTypeDetail","Υ����Ϊ��������","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyFine","������","NUMBER(8,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyPoint","Υ�¼Ƿ���","NUMBER(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyRestrictPeriod","��֤����","NUMBER(4)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyFlag","��־�ֶ�","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaRouteUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteUserName","�û�����","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteHostName","��������","VARCHAR2(60)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteIpAddress","IP��ַ(�����˿ں�)","VARCHAR2(60)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteServerName","����������","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteCompanyCode","��������","VARCHAR2(8)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteCompanyName","��������","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteCompanyType","��������","CHAR (1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteUpperCompanyCode","�ϼ���������","VARCHAR2(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteInsurerName","�������չ�˾����","VARCHAR2(80)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteFlag","��־λ","VARCHAR2(8)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaSysUserUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserUserName","�û�����","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserPassword","�û�����","VARCHAR2(40)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserCompanyCode","����Э�����","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserPhoneNumber","��ϵ�绰","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserEmail","�����ʼ�","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserFax","����","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserUserGrade","��Ա����","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserFlag","��־�ֶ�","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaTaskTaskCode","�������","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaTaskTaskName","��������","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaTaskUserType","ʹ�����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaTaskDescription","��������","VARCHAR2(160)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaTaskValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaTaskFlag","��־�ֶ�","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverSerialNo","ָ����ʻԱ���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverPolicyConfirmNo","Ͷ��ȷ����(50λ)","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverPolicyNo","������(50λ)","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverIdentifyType","ָ����ʻԱ֤������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverIdentifyNo","ָ����ʻԱ֤������","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverDriverProperty","ָ����ʻԱ����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverDriverName","��ʻԱ����","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverIdentifyArea","��Ͻ����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverSex","�Ա�","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverDrivingYears","����","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverAge","����","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverAgreedCarType","׼�ݳ���","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredSerialNo","���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPolicyNo","��������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredInsuredType","��ϵ������","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredInsuredName","��ϵ������","VARCHAR2(120)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredInsuredAddress","��ϵ�˵�ַ","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredInsuredNature","��ϵ������","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredIdentifyType","֤������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredIdentifyNo","������֯��������","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPostAddress","ͨѶ��ַ","VARCHAR2(120)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPostCode","��������","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPhone","�绰","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredBusinessSort","��ҵ���ʴ���","VARCHAR2(4)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredInsuredFlag","��ϵ�˱�־","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredFlag","��־�ֶ�","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarPolicyNo","������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarCompanyCode","�б���˾����","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarLicenserCode","��������֤����","VARCHAR2(15)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarLicenseNo","���ƺ���","VARCHAR2(15)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarLicenseColorCode","���Ƶ�ɫ����","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarLicenseType","��������","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarCarKindCode","�����������","VARCHAR2(2)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarUseNatureCode","����ʹ�����ʴ���","CHAR(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarEngineNo","��������","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarFrameNo","���ܺ�/VIN��","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarUseYears","��ʹ������","NUMBER(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarRunMiles","����ʻ�����(����)","NUMBER(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarNewCarFlag","�³���־","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarEcdemicCarflag","��س���־","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarManufactory","���쳧����","VARCHAR2(168)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarBrandName","����Ʒ��","VARCHAR2(64)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarModelCode","�����ͺ�","VARCHAR2(64)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarAgreedDriverCount","ָ����ʻԱ����","NUMBER(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarBizStatus","ҵ����״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarRemark","��ע","VARCHAR2(200)",true);

schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindPolicyConfirmNo","Ͷ��ȷ����(50λ)","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindSerialNo","�������","INTEGER",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindPolicyNo","������(50λ)","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindRiskType","��������","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindKindCode","���ִ���","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindCurrency","�ұ�","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindAmount","���⳥�޶�","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindStartDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindEndDate","����ֹ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindPremium","��׼����","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindPeccancyCoeff","Υ������ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindClaimCoeff","�������ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindDriverCoeff","ָ����ʻԱ����ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindAreaCoeff","����ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindCommisionRate","���������ѱ���","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindBasePremium","��������","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindFlag","��־","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iatMainPolicyQueryNo","Ͷ����ѯ��","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatMainAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatMainPolicyConfirmNo","Ͷ��ȷ����","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainUserCode","��ѯ�û�","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatMainCompanyCode","ѯ�۹�˾����","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatMainInputDate","Ͷ����ѯʱ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainKindCode","���ִ���","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainAmount","���⳥�޶�","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainStartDate","��������","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainEndDate","����ֹ��","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainCurrency","�ұ�","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainSumPremium","�ܱ���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainPremium","ʵ�ձ���","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainPeccancyCoeff","Υ������ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainClaimCoeff","�������ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainDriverCoeff","ָ����ʻԱ����ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainAreaCoeff","����ϵ��","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainCommissionRate","���������ѱ���","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainBasePremium","��������","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainFlag","��־","VARCHAR2(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainValidStatus","Ч��״̬","CHAR(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaUserUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserUserName","�û�����","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserPassword","�û�����","VARCHAR2(40)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserCompanyCode","������������","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserCompanyType","��������","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserUserGrade","��ԱȨ��","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserValidStatus","Ч��״̬","CHAR(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeGradeCode","��λ����","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeUserType","ʹ�����","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeDescription","����","VARCHAR2(160)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeValidStatus","Ч��״̬","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeFlag","��־�ֶ�","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaUserIPUserCode","�û�����","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPSerialNo","���","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPAreaCode","�������","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPUserName","�û�����","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPIpAddress","�û�IP��ַ","VARCHAR2(60)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPUrl","URL","VARCHAR2(60)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPSystemUser","ϵͳ�û���","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPPassword","����","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPRemark","��ע","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPValidStatus","Ч��״̬","CHAR(1)",false);

//Table Column ValidateData End--Don't modify
