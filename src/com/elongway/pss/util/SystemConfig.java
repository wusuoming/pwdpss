package com.elongway.pss.util;

import java.util.*;

import com.elongway.pss.bl.facade.BLIADsysConfigFacade;
import com.elongway.pss.dto.domain.IADsysConfigDto;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.log.Logger;

/**
 * 系统参数配置公共类：
 * 用ParameterCode、ParameterType、CompanyCode联合做为键，对应的dto做为值放入HashTable。
 * 
 * @author wangwx
 * @version 1.0.0 项目组
 * @version 1.1.0 2007-01-23 李子扬 添加常量代码，以便在程序中调用；同时，改用 Hashtable<String,
 *          String>提高性能。
 * @version 2.0.0 2007-05-17 李子扬 添加开关状态常量(80~94行), 同时提醒请大家注意 CheckReInsure
 *          含义的变化.
 * @version 2.0.1 2007-05-29 李子扬 添加常量RATE_FLOAT_OPTION。
 * @version 2.1.0 2007-06-15 李子扬 添加常RATE_FLOAT_START_DATE。
 * @version 2.1.0 2007-06-16 李子扬 添加常量 InsureBeforeDays - 允许起保日期在当前日期之前的天数，默认为30
 *          InsureAfterDays - 允许起保日期在当前日期之后的天数，默认为30。
 * @version 2.1.0 2007-07-05 李子扬 添加对AreaCode的获取。
 */
public class SystemConfig {

	/** PARAMETER_TYPE_ALL: 00 */
	public static final String PARAMETER_TYPE_ALL = "00";

	/** COMPANY_CODE_ALL: ALL */
	public static final String COMPANY_CODE_ALL = "ALL";
	
	/** AREA_CODE： AreaCode */
	public static final String AREA_CODE = "AreaCode";
	
	/** FILE_PATH： FilePath */
	public static final String FILE_PATH = "FilePath";
	
	/** FILE_SIZE： FileSize */
	public static final String FILE_SIZE = "FileSize";
	
	/** PROVINCES： Provinces */
	public static final String PROVINCES = "Provinces";
	
	/** SWITCH_ON: 1 */
	public static final String SWITCH_ON = "1";

	/** SWITCH_OFF: 0 */
	public static final String SWITCH_OFF = "0";

	/** BOOLEAN_YES: 1 */
	public static final String BOOLEAN_YES = "1";

	/** BOOLEAN_NO: 0 */
	public static final String BOOLEAN_NO = "0";

	// 私有变量
	private static Hashtable<String, String> hashSysConfig = null;

	// 是否初始化
	private static boolean isInited = false;

	// 调试日志
	private static Logger bugLogger = Logger.getLogger(SystemConfig.class);

	// 连接符
	private static final String HYPHEN = ".";

	/** 构造函数 */
	public SystemConfig() {
		// Do Nothing.
	}

	/** 判断是否初始化 */
	public static boolean isInited() {
		return isInited;
	}

	/** 初始化一次得到所有参数配置信息，并置标志位为已经初始化。 */
	public static synchronized void init() throws Exception {
		if (!isInited) {
			initSysConfig(false);
		}
	}

	/** 可以强制初始化。 */
	public static synchronized void init(boolean flag) throws Exception {
		if (flag) {
			initSysConfig(true);
		}
	}

	/**
	 * 初始化时调用该方法获得所有参数配置信息。 flag - 是否强制刷新。
	 * 
	 * @param flag
	 * @throws Exception
	 */
	private static synchronized void initSysConfig(boolean flag)
			throws Exception {

		bugLogger.debug("-----SystemConfig.init()------start-----");

		try {
			// 初始化
			hashSysConfig = new Hashtable<String, String>();

			// 获得所有配置信息，不传条件。
			Collection collection = new BLIADsysConfigFacade()
					.findByConditions("");			

			if (collection != null && !collection.isEmpty()) {
				IADsysConfigDto iaDsysConfigDto = null;

				for (Iterator i = collection.iterator(); i.hasNext();) {
					iaDsysConfigDto = (IADsysConfigDto) i.next();
					String key = getKey(iaDsysConfigDto.getParameterCode(),
							iaDsysConfigDto.getParameterType(), iaDsysConfigDto
									.getCompanyCode());					
					// LZY改为放String。
					hashSysConfig.put(key, iaDsysConfigDto.getParameterValue());
				}
			} else {
				bugLogger.debug("没有任何配置项，请配置系统参数！");
			}

			isInited = true;

		} catch (Exception e) {
			isInited = false; // LZY
			e.printStackTrace();
		}

		bugLogger.debug("-----SystemConfig.init()------end-----");
	}

	/**
	 * 得到配置项的值
	 * 
	 * @param iParameterCode -
	 *            用户登录后，iParameterCode和iCompanyCode可确定。
	 * @param iParameterType -
	 *            可根据需要固定传入"00"或者具体功能。
	 * @param iCompanyCode -
	 *            内部修改，屏蔽个性保险公司，得到所有公司的配置项。
	 * @return
	 * @throws Exception
	 */
	public static String getParameterValue(String iParameterCode,
			String iParameterType, String iCompanyCode) throws Exception {

		if (!isInited) {
			initSysConfig(true);
			if (!isInited) {
				throw new UserException(-98, -996, "SystemConfig",
						"SystemConfig类没有初始化!");
			}
		}

		if (iParameterCode == null || iParameterType == null
				|| iCompanyCode == null) {
			throw new UserException(-98, -996, "SystemConfig",
					"getParameterValue()参数不允许为NULL。");
		}

		if (iParameterCode.trim().length() == 0
				|| iParameterType.trim().length() == 0
				|| iCompanyCode.trim().length() == 0) {
			throw new UserException(-98, -996, "SystemConfig",
					"getParameterValue()参数值不允许为空。");
		}

		// 得到所有公司的配置项。
		iCompanyCode = COMPANY_CODE_ALL;

		String keyCode = getKey(iParameterCode, iParameterType, iCompanyCode);
		String value = hashSysConfig.get(keyCode);

		if (value == null) {
			throw new UserException(-98, -996, "SystemConfig",
					"getParameterValue()没有配置项:" + iParameterCode);
		}

		// 返回信息
		return value;
	}

	/** 得到配置项的值，李子扬添加，简化调用 
	 * @throws Exception */
	public static String getParameterValue(String iParameterCode)
			throws Exception {
		return getParameterValue(iParameterCode, PARAMETER_TYPE_ALL,
				COMPANY_CODE_ALL);
	}

	public static Hashtable<String, String> getHashSysConfig() {
		return hashSysConfig;
	}

	public static String getKey(String parameterCode, String parameterType,
			String companyCode) {
		return parameterCode + HYPHEN + parameterType + HYPHEN + companyCode;
	}
}
