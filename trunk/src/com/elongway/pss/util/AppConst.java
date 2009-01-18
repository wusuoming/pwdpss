package com.elongway.pss.util;

/**
 * 常量信息：
 * RequestType、JNDI名称、日志记录、操作模式、Session名称、Forward名称、代码信息、文本信息。
 *  
 * @author 乔有良(整理)
 * @version 1.0 2008-10-18
 */
public class AppConst implements IFlag, IJndiNameConst,
		ILogAppenderConst, IOperationModeConst, ISessionConst, IForwardConst,
		ICodeConst, ITextConst ,IDtdConst, IPropertyKey,IValue{
	
	/** 构造函数。 */
	public AppConst() {
		
	}
}

/**
 * RequestType，后缀"_FLAG"。
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-11-12
 */
interface IFlag {
	/** 当前使用的电表	 */
	public static final String CURRENT_AMMETER_FLAG = "1";
	/** 不被使用的电表	 */
	public static final String NOTUSE_AMMETER_FLAG = "0";
	/** 直供乡	 */
	public static final String TOWN_SALE_FLAG = "1";
	/** 趸售	 */
	public static final String WHOLE_SALE_FLAG = "2";	
	/** 大工业	 */
	public static final String FACTORY_SALE_FLAG = "3";
	/** 居民电表	 */
	public static final String PEOPLE_AMMETER_FLAG = "1";	
	/** 大工业表	 */
	public static final String FACTORY_AMMETER_FLAG = "0";	
	
	/** 小数点后两位	 */
	public static final String TWO_DOT_FLAG = "#.##";	
	/** 保留整数	 */
	public static final String ZERO_DOT_FLAG = "#";	
	/** 小数点后四位	 */
	public static final String FOUR_DOT_FLAG = "#.####";	
	
	
}
/**
 * RequestType，后缀"_Value"。
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-11-12
 */
interface IValue {
	/** 0.0	 */
	public static final String ZERO_VALUE = "0.0";
	
	/** 大工业电价分类	 */
	public static final String INDUSTRY_PRICE_CODE = "7";
	/** 大工业电价分类	 */
	public static final String METERIALS_TYPE_CODE = "7";
	
	
}


/**
 * JNDI名称，后缀"_JNDI"。
 * 内容：大小写。
 * @author MagicLee
 * @version 1.0 2006-09-14
 */
interface IJndiNameConst {
	/** 数据库源默认值：pssDataSource */
	public static final String DATASOURCE_JNDI = "pssDataSource";

}

/**
 * 日志记录，后缀"_LOG"。
 * 内容：	全小写。
 * @author MagicLee
 * @version 1.0 2006-09-14
 */
interface ILogAppenderConst {
	

	// 5、前端UI页面信息	
	/** 查询修改：maintenance */
	public static final String MAINTENANCE_LOG = "maintenance";

	/** 数据跟踪：datatrack */
	public static final String DATA_TRACK_LOG = "datatrack";

	/** 统计分析：statistics */
	public static final String STATISTICS_LOG = "statistics";

	/** 用户权限：syspower */
	public static final String SYS_POWER_LOG = "syspower";

	/** 系统参数：sysconfig */
	public static final String SYS_CONFIG_LOG = "sysconfig";

	/** 交易日志：bizlog */
	public static final String BIZ_LOG_LOG = "bizlog";

	/** 用户日志：userlog */
	public static final String USER_LOG_LOG = "userlog";

	/** 通用功能：commonpub */
	public static final String COMMON_PUB_LOG = "commonpub";

	// 6、系统级别
	/** 系统日志：system */
	public static final String SYSTEM_LOG = "system";

	/** 错误日志：error */
	public static final String ERROR_LOG = "error";

	/** 服务日志：server */
	public static final String SERVER_LOG = "server";
	
	/** 业务信息：bizinf */
	public static final String BIZINF_LOG = "bizinf";

}

/**
 * 操作模式，后缀"_MODE"。
 * 内容：大小写。
 * @author MagicLee
 * @version 2006-09-14
 */
interface IOperationModeConst {

	/** 查看模式：View */
	public static final String VIEW_MODE = "View";

	/** 删除模式：Delete */
	public static final String DELETE_MODE = "Delete";

	/** 编辑模式：Edit */
	public static final String EDIT_MODE = "Edit";

	/** 修改模式：Modify */
	public static final String MODIFY_MODE = "Modify";

	/** 创建模式：Create */
	public static final String CREATE_MODE = "Create";

	/** 执行模式：Execute */
	public static final String EXECUTE_MODE = "Execute";

	/** 导出Excel模式：Excel */
	public static final String EXCEL_MODE = "Excel";

	/** 按默认条件查询模式：DefaultQuery */
	public static final String DEFAULTQUERY_MODE = "DefaultQuery";

	/** 按输入条件查询模式：Query */
	public static final String QUERY_MODE = "Query";

	/** 查询出所有的记录：0 */
	public static int FIND_ALL_MODE = 0;

	/** 是否显示调试信息，1显示/0不显示 */
	public static int DEBUG_MODE = 1;

	/** 一页列出所有的记录：Integer.MAX_VALUE */
	public static int ALL_ROWS_MODE = Integer.MAX_VALUE;

}

/**
 * Session，后缀"_SESSION"。
 * 内容：小大写。
 * @author MagicLee
 * @version 2006-09-14
 */
interface ISessionConst {
	/** session名称：sysUser */
	// 如：SysUser sysUser = (SysUser)(session.getAttribute(AppConst.SYSUSER_SESSION));
	public static final String SYSUSER_SESSION = "sysUser";

}

/**
 * struts global-forwards，后缀"_FORWARD"。
 * 内容：大小写。
 * @author MagicLee
 * @version 2006-09-14
 */
interface IForwardConst {
	/** 登录：Logon */
	public static final String LOGON_FORWARD = "Logon";

	/** 成功：Success */
	public static final String SUCCESS_FORWARD = "Success";

	/** 消息：Message */
	public static final String MESSAGE_FORWARD = "Message";

	/** 取消：Cancel */
	public static final String CANCEL_FORWARD = "Cancel";
	
	
	public static final String CREATE_SUCCESS_FORWARD = "CreateSuccess";
}

/**
 * 文本代码，后缀"_CODE"。
 * 内容：	全小写。
 * @author MagicLee
 * @version 2006-09-14
 * 
 * modify zyb 2006-09-18
 */
interface ICodeConst {
	/** 文本代码：success */
	public static final String SUCCESS_CODE = "success";

	/** 文本代码：error */
	public static final String ERROR_CODE = "error";
	
	/** 返回成功代码：1 */
	public static final String SUCCESS_TYPE_CODE = "1";//zyb insert
	
	/** 返回失败代码：0 */
	public static final String ERROR_TYPE_CODE = "0";// zyb insert
	
	/** 交强险险别代码：1 */
	public static final String RISK_TYPE_CODE = "1";// zyb insert  09-19
	
	/** 交强险险种代码：BZ	 */
	public static final String RISK_KIND_CODE = "BZ";// zyb insert  09-19
	
	/** 币别代码：CNY */
	public static final String CURRENCY_CODE = "CNY";// zyb insert  09-19

	/** 空值代码：NULL */
	public static final String NULL_CODE = "NULL";// insert,061008,李子扬
}

/**
 * 文本信息，后缀"_TEXT"。
 * 
 * @author MagicLee
 * @version 2006-09-14
 */
interface ITextConst {
	/** 文本信息：添加 */
	public static final String INSERT_TEXT = "添加";

	/** 文本信息：删除 */
	public static final String DELETE_TEXT = "删除";

	/** 文本信息：更新 */
	public static final String UPDATE_TEXT = "更新";

	/** 文本信息：保存 */
	public static final String SAVE_TEXT = "保存";

	/** 文本信息：查询 */
	public static final String FIND_TEXT = "查询";

	/** 文本信息：查看 */
	public static final String VIEW_TEXT = "查看";

	/** 文本信息：成功 */
	public static final String SUCCESS_TEXT = "成功";

	/** 文本信息：失败 */
	public static final String FAILURE_TEXT = "失败";

	/** 文本信息：错误 */
	public static final String ERROR_TEXT = "错误";

	/** 文本信息：引用 */
	public static final String REVOKE_TEXT = "引用";
	
}

/**
 * 发生错误的情况下,获取errormessage.dtd的"请求" 后缀"_DTD"
 * 
 * @author ZYB
 * @version 2006-09-18
 */	
interface IDtdConst {
	/**特殊的DTD请求: "00"*/
	public static final String ERROR_TYPE_DTD = "00";
}

interface IPropertyKey{
	public static final String WEB_APP_PATH = "webapp.path";
}
interface DataBase{
	public static final String PSS_DATASOURCE = "pssDataSource";
}

