/****************************************************************************
 * DESC       ：基本校验数据
 * AUTHOR     ：zhouxianli
 * CREATEDATE ：2003-05-04
 * MODIFYLIST ：   Name       Date            Reason/Contents
 *          ------------------------------------------------------
 *							李子扬        2006-08-21			 根据IAPlatform修改。
 ****************************************************************************/

/**
 * 基本数据校验
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Sinosoft</p>
 * @author zhouxianli
 * @version 1.0
 */

 /**
    结构为 字段名，字段描述，类型，是否允许为空
           4项都是必需的
 */

var schemaColumns = new Array(); //存储字段结构的数组

function schemaColumn(name,desc,dataType,allowNulls){
    this.name = name;
    this.desc = desc;
    this.dataType = dataType;
    this.allowNulls = allowNulls;
}


// 李子扬添加：为了没有表名的表单。
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

//初始化数组
var columnIndex = 0;
schemaColumns[columnIndex++] = new schemaColumn("keyword","关键字","text",false);
//schemaColumns[columnIndex++] = new schemaColumn("userCode","用户代码","varchar(10,10)",false);
//schemaColumns[columnIndex++] = new schemaColumn("password","用户密码","char(10)",true);
schemaColumns[columnIndex++] = new schemaColumn("cssStyle","样式","varchar(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("projectNo","项目编号","char(15)",true);

//Table Column ValidateData Start--Don't modify
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogUserCode","交易发起用户","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogBizType","交易类型代码","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogIaBizIP","交易请求IP地址","CHAR(15)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogCompanyCode","交易发起公司代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogBizCode","交易码","VARCHAR2(2)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogBizStartDate","交易发起时间","DATE",false);
schemaColumns[columnIndex++] = new schemaColumn("iaBizLogText","描述信息","VARCHAR2(1000)",true);

schemaColumns[columnIndex++] = new schemaColumn("iacMainPolicyQueryNo","投保查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPolicyConfirmNo","投保确认码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainCompanyCode","询价公司代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPolicyNo","保单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPrintNo","保险标志号码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainBusinessNature","销售渠道","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainInputDate","投保确认时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainOperateDate","签单日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainEngageText","特别约定","VARCHAR2(4000)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainHandlerName","经办人","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainOperatorName","操作员","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainKindCode","险种代码","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainAmount","总赔偿限额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainStartDate","保险起期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainEndDate","保险止期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainSumPremium","总保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPremium","标准保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPeccancyCoeff","违法调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainClaimCoeff","理赔调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainDriverCoeff","指定驾驶员调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainAreaCoeff","地区系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainCommisionRate","附加手续费比例","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainBasePremium","基础保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainCurrency","币种类别","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainPaidPremium","实收保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainChgReason","实收保费变化原因","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainChgDetail","实收保费变化原因描述","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainEndorseTimes","批改次数","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainBizType","业务提交类型","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iacMainValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainBizStatus","当前业务状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacMainUnderwriteReason","直接承保原因","CHAR(1)",true);

schemaColumns[columnIndex++] = new schemaColumn("iacPreengagePreengageNo","预约信息码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageCompanyCode","承保公司代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageIpAddress","上传地址","VARCHAR2(60)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageFileName","保险标志批量预约文件名称","VarChar2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iacPreengageResult","处理结果","CHAR(1)",true);

schemaColumns[columnIndex++] = new schemaColumn("iadCodeCodeType","代码类型","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCodeCodeCode","业务代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCodeCodeCName","业务代码中文含义","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCodeCodeEName","业务代码英文含义","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCodeValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCodeFlag","标志字段","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iadCompanyCompanyCode","机构代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyCompanyCName","机构中文名称","VARCHAR2(80)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyCompanyEName","机构英文名称","VARCHAR2(80)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyAddressCName","地址中文名称","VARCHAR2(40)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyAddressEName","地址英文名称","VARCHAR2(80)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyPostCode","邮编","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyPhone","电话","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyFax","传真","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyUpperCompanyCode","上级机构代码","VARCHAR2(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyInsurerName","归属保险公司名称","VARCHAR2(80)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyCompanyType","机构类型","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyRemark","备注","VARCHAR2(40)",true);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iadCompanyFlag","标志字段","CHAR(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondComCode","部门代码PK","VARCHAR2(8)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondRiskCode","险种代码PK","VARCHAR2(4)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondFactorType","因子类型PK","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondKindCode","险别代码PK","VARCHAR2(7)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondValidDate","启用日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondRatePeriod","费率期数PK","NUMBER(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondFactorCode","费率因子代码PK","VARCHAR2(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondFactorName","费率因子名称","VARCHAR2(60)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondFlag","标志位","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateCondValidStatus","是否有效标志","VARCHAR2(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRiskCode","险种代码PK","VARCHAR2(4)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorType","因子类型PK","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorCode","费率因子代码PK","VARCHAR2(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorName","费率因子名称","VARCHAR2(60)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorTable","费率因子所在表名","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorColumn","费率因子所在字段名","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorFlag","费率因子取值类型","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValueTable","代码表名称","VARCHAR2(18)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValueField1","代码表主键名称","VARCHAR2(18)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValueValue1","代码表代码类名称","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValueField2","代码表主键名称2","VARCHAR2(18)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValueValue2","代码表代码类名称2","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFactorValue","1-2000版,2-2003版","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRateType","系数分组类型","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRateGroupSegment","在prpdRateGroup中的位置","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRateUsualSegment","在费率表prpdRateUsual中的位置","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRelationFactor","费率关联信息","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValidStatus","是否有效标志","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorFlag","标志位","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorValidDate","启用日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateFactorRatePeriod","费率期数PK","NUMBER(15)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupComCode","地区代码","CHAR(8)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupRateType","系数类型","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupRiskCode","险种","VARCHAR2(4)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupKindCode","险别","VARCHAR2(7)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupRateGroupCode","费率条件代码","VARCHAR2(255)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupRateTypeValue","费率类别值","VARCHAR2(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupFlag","标志位","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupValidDate","启用日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupRatePeriod","费率期数PK","NUMBER(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateGroupValidStatus","是否有效标志","VARCHAR2(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualRiskCode","险种代码","VARCHAR2(4)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualKindCode","险别代码","VARCHAR2(7)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualRatePeriod","费率期数","NUMBER(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualValidDate","生效日期","DATE",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualRateCode","费率代码","VARCHAR2(255)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualCurrency","币别","VARCHAR2(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualBasePremium","基准保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualRate","基准费率","NUMBER(8,5)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualFlag","标志位","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDrateUsualValidStatus","是否有效标志","VARCHAR2(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigParameterCode","参数名称代码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigParameterType","[1,2]参数归属的系统代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigCompanyCode","归属机构代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigParameterValue","参数配置结果","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigAreaCode","地区代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigParameterDesc","配置描述","VARCHAR2(255)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaDsysConfigFlag","标志字段","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaGradeGradeCode","岗位代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeGradeName","岗位名称","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeUserType","使用类别","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeDescription","岗位描述","VARCHAR2(160)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeFlag","标志字段","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskGradeCode","岗位代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskTaskCode","任务代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskCompanyCode","可处理的机构代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskPowerLevel","权限级别","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaGradeTaskFlag","标志字段","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseClaimQueryNo","理赔编码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseCompanyCode","承保公司代码(采用平台编码)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseAddTimes","追加次数","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseSerialno","序号","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseClaimType","理赔类型代码","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseCurrency","币别","CHAR(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseAppendLoss","追加金额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseInputDate","追加时间","Date",true);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialAppendCaseRemark","备注","VARCHAR2(200)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialClaimClaimQueryNo","理赔编码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimCompanyCode","承保公司代码(采用平台编码)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimPolicyConfirmNo","投保确认码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimEstimateLoss","估损金额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimClaimNo","立案号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimClaimType","理赔类型代码","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimLicenseNo","出险车辆号牌号码","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimLicenseType","出险车辆号牌种类","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimRegistTimesFlag","是否计入出险次数","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimDamageDate","出险时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimInputDate","入库时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimFlag","标志位","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusClaimQueryNo","理赔编码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusCompanyCode","承保公司代码(采用平台编码)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusPolicyConfirmNo","投保确认码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusPolicyNo","保单号码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusRegistNo","报案号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusClaimNo","立案号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusCaseNo","赔案号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusReportDate","报案时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusClaimDate","立案时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusEndCaseDate","结案时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusLicenseNo","出险车辆号牌号码","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusLicenseColorCode","车牌底色代码","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusCarKindCode","车辆种类代码","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusLicenseType","出险车辆号牌种类","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusClaimType","案件状态","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusKindCode","涉案险种类型","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusInputDate","状态时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialClaimStatusFlag","标志位","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimQueryNo","理赔编码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimConfirmNo","赔案结案校验码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseCompanyCode","承保公司代码(采用平台编码)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCasePolicyConfirmNo","投保确认码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCasePolicyNo","保单号码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseRegistNo","报案号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimNo","立案号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseCaseNo","赔案号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseReportDate","报案时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimDate","立案时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseEndCaseDate","结案时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseLicenseNo","出险车辆号牌号码","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseLicenseColorCode","车牌底色代码","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseCarKindCode","车辆种类代码","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseLicenseType","出险车辆号牌种类","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseDriverName","出险驾驶员姓名","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseIdentifyType","出险驾驶员证件类型","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseIdentifyNo","出险驾驶员证件号码","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseRegistTimesFlag","是否计入出险次数","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseDamageDate","出险时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseDamageAddress","出险地点","CHAR(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseFact","出险经过","VARCHAR2(1000)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseHandleDept","事故处理部门","CHAR(60)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseIndemDuty","事故责任类型","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseIndemnityDuty","事故责任划分","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimFlag","是否属于保险责任","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseClaimType","理赔类型","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseCurrency","币别","CHAR(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseEstimateLoss","估损金额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseSumPaid","赔款总金额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCasePrepaidReason","垫付原因","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseCancelReason","拒赔原因","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseInputDate","入库时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseValidStatus","有效状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialEndCaseFlag","标志位","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidClaimQueryNo","理赔编码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidCompanyCode","承保公司代码(采用平台编码)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidClaimNo","立案号","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidSerialNo","序号","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidRegistNo","报案号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidPolicyNo","保单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidIndemnityDuty","赔偿责任比例","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidLossType","损失赔偿类型","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidRiskType","赔偿险种类型","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidKindCode","赔偿险种代码","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidCurrency","币别","CHAR(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidSumLoss","损失金额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidSumPaid","赔偿金额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidAppendFeeFlag","结案追加费用标志","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidFlag","标志位","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailClaimQueryNo","理赔编码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailCompanyCode","承保公司代码(采用平台编码)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailClaimNo","立案号","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailSerialNo","损失赔偿序号","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailDetailSerialNo","损失明细序号","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailClaimType","损失赔偿类型","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailFeeType","损失赔偿细分","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailCurrency","币别","CHAR(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailSumLoss","损失金额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailSumPaid","赔偿金额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailIndemnityDuty","赔偿责任比例","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailAppendFeeFlag","结案追加费用标志","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialLossPaidDetailFlag","标志位","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialRegistClaimQueryNo","理赔编码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistCompanyCode","承保公司代码(采用平台编码)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistPolicyConfirmNo","投保确认码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistPolicyNo","保单号码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistRegistNo","报案号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistDamageDate","出险时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistLicenseNo","出险承保车辆号牌号码","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistLicenseType","出险承保车辆号牌种类","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistRegistTimesFlag","是否计入出险次数","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistReportDate","报案时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistInputDate","入库时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialRegistFlag","标志位","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyClaimQueryNo","理赔编码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyCompanyCode","承保公司代码(采用平台编码)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyRegistNo","报案号码","VARCHAR2(22)",false);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartySerialNo","序号","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyCaseNo","赔案编号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyClaimNo","立案号","CHAR(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyLicenseNo","车牌号","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyLicenseType","车牌种类","CHAR(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyEngineNo","发动机号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyFrameNo","车架号/VIN码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("ialThirdPartyFlag","标志字段","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverEndorseQueryNo","批改查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverSerialNo","指定驾驶员序号","INTEGER",false);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverEndorseNo","批单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverPolicyQueryNo","投保查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverPolicyConfirmNo","投保确认码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverPolicyNo","保单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverIdentifyNo","制定驾驶员身份证明号码","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverIdentifyType","指定驾驶员证件类型","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverDriverProperty","指定驾驶员属性","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverDriverName","驾驶员名称","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverIdentifyArea","管辖区县","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverSex","性别","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverDrivingYears","驾龄","NUMBER(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverAge","年龄","NUMBER(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverAgreedCarType","准驾车型","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapCarDriverColumn_17","Column_17","<Undefined>",true);

schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseQueryNo","批改查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadUserCode","批改用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadCompanyCode","承保公司代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadPolicyConfirmNo","投保确认码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseConfirmNo","批改确认码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseType","批改类型","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseTimes","保单批改次数","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseNo","批单号码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadPolicyNo","保单号码","VARCHAR2(22)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseDate","批改日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadValidDate","生效日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorsePremium","批改应退补费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadFormula","批改计算公式","VARCHAR2(1000)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadCurrency","币别","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadChgPremium","实际保费变化","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseReason","实收保费变化原因/退保原因","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadEndorseDetail","实收保费变化原因描述","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadInputDate","保存日期(批改查询日期)","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadConfirmDate","批改确认日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadCancelDate","批改撤销日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadBizStatus","当前业务状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadUnderwriteReason","直接批改原因","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapHeadValidStatus","效力状态","CHAR(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iapInsuredEndorseQueryNo","批改查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredSerialNo","序号","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredEndorseNo","批单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPolicyNo","保单号码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPolicyQueryNo","投保查询码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPolicyConfirmNo","投保确认码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredInsuredType","关系人类型","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredInsuredName","关系人名称","VARCHAR2(120)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredInsuredAddress","关系人地址","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredInsuredNature","关系人性质","VARCHAR2(12)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredIdentifytype","证件类型","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredIdentifyNo","法人组织机构代码","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPostAddress","通讯地址","VARCHAR2(40)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPostCode","邮政编码","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredPhone","电话","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredBusinessSort","单位性质代码","VARCHAR2(4)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredInsuredFlag","关系人标志","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapInsuredFlag","标志字段","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapItemCarEndorseQueryNo","批改查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarCompanyCode","承保公司代码(采用平台编码)","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarEndorseNo","批单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarPolicyQueryNo","投保查询码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarPolicyConfirmNo","投保确认码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarPolicyNo","保单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarLicenserCode","机动车发证机关","VARCHAR2(15)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarLicenseNo","号牌号码","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarLicenseColorCode","车牌底色代码","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarLicenseType","车牌种类","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarCarKindCode","车辆种类代码","VARCHAR2(2)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarUseNatureCode","车辆使用性质代码","CHAR(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarEngineNo","发动机号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarFrameNo","车架号/VIN码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarUseYears","已使用年限","NUMBER(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarRunMiles","已行驶总里程(公里)","NUMBER(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarNewCarFlag","新车标志","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarEcdemicCarflag","外地车标志","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarManufactory","制造厂名称","VARCHAR2(168)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarBrandName","车辆品牌","VARCHAR2(64)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarModelCode","车辆型号","VARCHAR2(64)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarAmendDriver","是否修改驾驶员信息","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarAgreedDriverCount","指定驾驶员数量","NUMBER(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarBizStatus","业务处理状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemCarRemark","备注","VARCHAR2(200)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapItemKindEndorseQueryNo","批改查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindEndorseNo","批单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindPolicyQueryNo","投保查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindPolicyConfirmNo","投保确认码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindPolicyNo","保单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindRiskType","险种序号","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindSerialNo","险种类型","INTEGER",false);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindKindCode","险种代码","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindCurrency","币别","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindAmount","总赔偿限额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindStartDate","保险起期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindEndDate","保险止期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindPremium","实收保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindPeccancyCoeff","违法调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindClaimCoeff","理赔调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindDriverCoeff","指定驾驶员调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindAreaCoeff","地区系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindCommisionRate","附加手续费比例","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindBasePremium","基础保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindChgPremium","实际保费变化","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapItemKindRemark","备注","VARCHAR2(200)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapMainCompanyCode","询价公司代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainEndorseQueryNo","批改查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainEndorseNo","批单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPolicyNo","保单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPolicyQueryNo","投保查询码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPolicyConfirmNo","投保确认码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPrintNo","保险标志号码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainInputDate","投保确认时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainBusinessNature","销售渠道","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainOperateDate","签单日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainEngageText","特别约定","VARCHAR2(4000)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainHandlerName","经办人","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainOperatorName","操作员","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainKindCode","险种代码","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainAmount","总赔偿限额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainStartDate","保险起期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainEndDate","保险止期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainSumPremium","总保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPremium","标准保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPeccancyCoeff","违法调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainClaimCoeff","理赔调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainDriverCoeff","指定驾驶员调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainAreaCoeff","地区系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainCommisionRate","附加手续费比例","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainBasePremium","基础保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainCurrency","币种类别","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainPaidPremium","实收保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainChgReason","实收保费变化原因","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainChgDetail","实收保费变化原因描述","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainEndorseTimes","批改次数","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainBizType","业务提交类型","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainValidStatus","有效状态标志","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainBizStatus","当前业务状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapMainUnderwriteReason","直接承保原因","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainChgPremium","本次批改保费变化","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapMainRemark","备注","VARCHAR2(200)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverLicenseNo","驾驶证号","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverDriverName","驾驶员姓名","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverIdentifyType","违法驾驶员证件类型","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverIdentifyNo","身份证号码","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverBirthday","出生日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverSex","性别","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverNationality","国籍","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverIdentifyArea","管辖区域","VARCHAR2(10)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverLicensedDate","初次领证日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverValidDate","有效日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverCheckDate","审验日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverDrivingCarType","准驾车型","VARCHAR2(10)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarDriverFlag","标志","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoLicenseNo","号牌号码","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoLicenseType","车牌种类","VARCHAR2(2)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoUseNatureCode","使用性质","CHAR(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoCarSymbol","车辆标识代号","VARCHAR2(25)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoEngineNo","发动机号","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoFrameNo","车架号/VIN码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoColorCode","车身颜色","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoFactoryDate","出厂日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoEnrollDate","初次登记日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoValidEndDate","检验有效期止","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoRejectEndDate","报废期止","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoEndDate","终保日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoCarOwner","机动车所有人","VARCHAR2(60)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoManufactory","制造厂名称","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoBrandName1","车辆品牌1","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoBrandName2","车辆品牌2","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoModelCode","车辆型号","VARCHAR2(64)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoCarKindCode","车辆类型","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoCheckDate","最近定检日期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoTonnage","核定载质量","NUMBER(10,3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoSeat","核定载客","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoStatus","车辆状态","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoHaulage","牵引总质量","VARCHAR2(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmCarInfoFlag","标志字段","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyTicketNo","决定书编号","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyTicketType","决定书类别","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyHandleDept","处理机关代码","VARCHAR2(10)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyIdentifyArea","管辖区县","VARCHAR2(10)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyDocumentNo","档案编号","VARCHAR2(12)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyDriverName","姓名","VARCHAR2(22)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyLicenseNo","号牌号码","VARCHAR2(15)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyLicenseType","车牌种类","VARCHAR2(2)",false);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyEngineNo","发动机号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyFrameNo","车架号/VIN码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyTrafficType","交通方式","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyDate","违章时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyFineDate","处理时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyAddress","违章地点","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyCode","违章行为代码","VARCHAR2(4)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyCoeff","违法调整系数","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyType","违法行为分类","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyIdentifyType","指定驾驶员证件类型","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyIdentifyNo","制定驾驶员身份证明号码","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyDetail","违法行为描述","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyTypeDetail","违法行为分类描述","VARCHAR2(100)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyFine","罚款金额","NUMBER(8,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyPeccancyPoint","违章记分数","NUMBER(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyRestrictPeriod","扣证天数","NUMBER(4)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iapmPeccancyFlag","标志字段","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaRouteUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteUserName","用户名称","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteHostName","主机名称","VARCHAR2(60)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteIpAddress","IP地址(包括端口号)","VARCHAR2(60)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteServerName","服务器名称","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteCompanyCode","机构代码","VARCHAR2(8)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteCompanyName","机构名称","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteCompanyType","机构类型","CHAR (1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteUpperCompanyCode","上级机构代码","VARCHAR2(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteInsurerName","归属保险公司名称","VARCHAR2(80)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaRouteFlag","标志位","VARCHAR2(8)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaSysUserUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserUserName","用户名称","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserPassword","用户密码","VARCHAR2(40)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserCompanyCode","归属协会代码","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserPhoneNumber","联系电话","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserEmail","电子邮件","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserFax","传真","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserUserGrade","人员级别","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaSysUserFlag","标志字段","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaTaskTaskCode","任务代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaTaskTaskName","任务名称","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaTaskUserType","使用类别","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaTaskDescription","任务描述","VARCHAR2(160)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaTaskValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaTaskFlag","标志字段","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverPolicyQueryNo","投保查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverSerialNo","指定驾驶员序号","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverPolicyConfirmNo","投保确认码(50位)","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverPolicyNo","保单号(50位)","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverIdentifyType","指定驾驶员证件类型","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverIdentifyNo","指定驾驶员证件号码","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverDriverProperty","指定驾驶员属性","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverDriverName","驾驶员名称","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverIdentifyArea","管辖区县","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverSex","性别","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverDrivingYears","驾龄","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverAge","年龄","SMALLINT",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcCarDriverAgreedCarType","准驾车型","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPolicyConfirmNo","投保确认码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredSerialNo","序号","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPolicyNo","保单号码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPolicyQueryNo","投保查询码","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredInsuredType","关系人类型","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredInsuredName","关系人名称","VARCHAR2(120)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredInsuredAddress","关系人地址","VARCHAR2(255)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredInsuredNature","关系人性质","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredIdentifyType","证件类型","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredIdentifyNo","法人组织机构代码","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPostAddress","通讯地址","VARCHAR2(120)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPostCode","邮政编码","VARCHAR2(6)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredPhone","电话","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredBusinessSort","企业性质代码","VARCHAR2(4)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredInsuredFlag","关系人标志","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcInsuredFlag","标志字段","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarPolicyQueryNo","投保查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarPolicyConfirmNo","投保确认码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarPolicyNo","保单号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarCompanyCode","承保公司代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarLicenserCode","机动车发证机关","VARCHAR2(15)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarLicenseNo","号牌号码","VARCHAR2(15)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarLicenseColorCode","车牌底色代码","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarLicenseType","车牌种类","VARCHAR2(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarCarKindCode","车辆种类代码","VARCHAR2(2)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarUseNatureCode","车辆使用性质代码","CHAR(3)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarEngineNo","发动机号","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarFrameNo","车架号/VIN码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarUseYears","已使用年限","NUMBER(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarRunMiles","已行驶总里程(公里)","NUMBER(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarNewCarFlag","新车标志","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarEcdemicCarflag","外地车标志","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarManufactory","制造厂名称","VARCHAR2(168)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarBrandName","车辆品牌","VARCHAR2(64)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarModelCode","车辆型号","VARCHAR2(64)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarAgreedDriverCount","指定驾驶员数量","NUMBER(2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarBizStatus","业务处理状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemCarRemark","备注","VARCHAR2(200)",true);

schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindPolicyQueryNo","投保查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindPolicyConfirmNo","投保确认码(50位)","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindSerialNo","险种序号","INTEGER",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindPolicyNo","保单号(50位)","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindRiskType","险种类型","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindKindCode","险种代码","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindCurrency","币别","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindAmount","总赔偿限额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindStartDate","保险起期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindEndDate","保险止期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindPremium","标准保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindPeccancyCoeff","违法调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindClaimCoeff","理赔调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindDriverCoeff","指定驾驶员调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindAreaCoeff","地区系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindCommisionRate","附加手续费比例","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindBasePremium","基础保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatcItemKindFlag","标志","VARCHAR2(2)",true);

schemaColumns[columnIndex++] = new schemaColumn("iatMainPolicyQueryNo","投保查询码","VARCHAR2(50)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatMainAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatMainPolicyConfirmNo","投保确认码","VARCHAR2(50)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainUserCode","查询用户","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatMainCompanyCode","询价公司代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iatMainInputDate","投保查询时间","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainKindCode","险种代码","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainAmount","总赔偿限额","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainStartDate","保险起期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainEndDate","保险止期","DATE",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainCurrency","币别","VARCHAR2(3)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainSumPremium","总保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainPremium","实收保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainPeccancyCoeff","违法调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainClaimCoeff","理赔调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainDriverCoeff","指定驾驶员调整系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainAreaCoeff","地区系数","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainCommissionRate","附加手续费比例","NUMBER(3,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainBasePremium","基础保费","NUMBER(14,2)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainFlag","标志","VARCHAR2(8)",true);
schemaColumns[columnIndex++] = new schemaColumn("iatMainValidStatus","效力状态","CHAR(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaUserUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserUserName","用户名称","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserPassword","用户密码","VARCHAR2(40)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserCompanyCode","归属机构代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserCompanyType","机构类型","VARCHAR2(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserUserGrade","人员权限","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserValidStatus","效力状态","CHAR(1)",false);

schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeGradeCode","岗位代码","VARCHAR2(20)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeUserType","使用类别","CHAR(1)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeDescription","描述","VARCHAR2(160)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeValidStatus","效力状态","CHAR(1)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserGradeFlag","标志字段","VARCHAR2(10)",true);

schemaColumns[columnIndex++] = new schemaColumn("iaUserIPUserCode","用户代码","VARCHAR2(30)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPSerialNo","序号","SMALLINT",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPAreaCode","区域代码","VARCHAR2(10)",false);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPUserName","用户名称","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPIpAddress","用户IP地址","VARCHAR2(60)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPUrl","URL","VARCHAR2(60)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPSystemUser","系统用户名","VARCHAR2(30)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPPassword","密码","VARCHAR2(20)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPRemark","备注","VARCHAR2(200)",true);
schemaColumns[columnIndex++] = new schemaColumn("iaUserIPValidStatus","效力状态","CHAR(1)",false);

//Table Column ValidateData End--Don't modify
