package com.elongway.pss.util;

import java.util.*;

import com.elongway.pss.bl.facade.BLIADsysConfigFacade;
import com.elongway.pss.dto.domain.IADsysConfigDto;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.log.Logger;

/**
 * ϵͳ�������ù����ࣺ
 * ��ParameterCode��ParameterType��CompanyCode������Ϊ������Ӧ��dto��Ϊֵ����HashTable��
 * 
 * @author wangwx
 * @version 1.0.0 ��Ŀ��
 * @version 1.1.0 2007-01-23 ������ ��ӳ������룬�Ա��ڳ����е��ã�ͬʱ������ Hashtable<String,
 *          String>������ܡ�
 * @version 2.0.0 2007-05-17 ������ ��ӿ���״̬����(80~94��), ͬʱ��������ע�� CheckReInsure
 *          ����ı仯.
 * @version 2.0.1 2007-05-29 ������ ��ӳ���RATE_FLOAT_OPTION��
 * @version 2.1.0 2007-06-15 ������ ��ӳ�RATE_FLOAT_START_DATE��
 * @version 2.1.0 2007-06-16 ������ ��ӳ��� InsureBeforeDays - �����������ڵ�ǰ����֮ǰ��������Ĭ��Ϊ30
 *          InsureAfterDays - �����������ڵ�ǰ����֮���������Ĭ��Ϊ30��
 * @version 2.1.0 2007-07-05 ������ ��Ӷ�AreaCode�Ļ�ȡ��
 */
public class SystemConfig {

	/** PARAMETER_TYPE_ALL: 00 */
	public static final String PARAMETER_TYPE_ALL = "00";

	/** COMPANY_CODE_ALL: ALL */
	public static final String COMPANY_CODE_ALL = "ALL";
	
	/** AREA_CODE�� AreaCode */
	public static final String AREA_CODE = "AreaCode";
	
	/** FILE_PATH�� FilePath */
	public static final String FILE_PATH = "FilePath";
	
	/** FILE_SIZE�� FileSize */
	public static final String FILE_SIZE = "FileSize";
	
	/** PROVINCES�� Provinces */
	public static final String PROVINCES = "Provinces";
	
	/** SWITCH_ON: 1 */
	public static final String SWITCH_ON = "1";

	/** SWITCH_OFF: 0 */
	public static final String SWITCH_OFF = "0";

	/** BOOLEAN_YES: 1 */
	public static final String BOOLEAN_YES = "1";

	/** BOOLEAN_NO: 0 */
	public static final String BOOLEAN_NO = "0";

	// ˽�б���
	private static Hashtable<String, String> hashSysConfig = null;

	// �Ƿ��ʼ��
	private static boolean isInited = false;

	// ������־
	private static Logger bugLogger = Logger.getLogger(SystemConfig.class);

	// ���ӷ�
	private static final String HYPHEN = ".";

	/** ���캯�� */
	public SystemConfig() {
		// Do Nothing.
	}

	/** �ж��Ƿ��ʼ�� */
	public static boolean isInited() {
		return isInited;
	}

	/** ��ʼ��һ�εõ����в���������Ϣ�����ñ�־λΪ�Ѿ���ʼ���� */
	public static synchronized void init() throws Exception {
		if (!isInited) {
			initSysConfig(false);
		}
	}

	/** ����ǿ�Ƴ�ʼ���� */
	public static synchronized void init(boolean flag) throws Exception {
		if (flag) {
			initSysConfig(true);
		}
	}

	/**
	 * ��ʼ��ʱ���ø÷���������в���������Ϣ�� flag - �Ƿ�ǿ��ˢ�¡�
	 * 
	 * @param flag
	 * @throws Exception
	 */
	private static synchronized void initSysConfig(boolean flag)
			throws Exception {

		bugLogger.debug("-----SystemConfig.init()------start-----");

		try {
			// ��ʼ��
			hashSysConfig = new Hashtable<String, String>();

			// �������������Ϣ������������
			Collection collection = new BLIADsysConfigFacade()
					.findByConditions("");			

			if (collection != null && !collection.isEmpty()) {
				IADsysConfigDto iaDsysConfigDto = null;

				for (Iterator i = collection.iterator(); i.hasNext();) {
					iaDsysConfigDto = (IADsysConfigDto) i.next();
					String key = getKey(iaDsysConfigDto.getParameterCode(),
							iaDsysConfigDto.getParameterType(), iaDsysConfigDto
									.getCompanyCode());					
					// LZY��Ϊ��String��
					hashSysConfig.put(key, iaDsysConfigDto.getParameterValue());
				}
			} else {
				bugLogger.debug("û���κ������������ϵͳ������");
			}

			isInited = true;

		} catch (Exception e) {
			isInited = false; // LZY
			e.printStackTrace();
		}

		bugLogger.debug("-----SystemConfig.init()------end-----");
	}

	/**
	 * �õ��������ֵ
	 * 
	 * @param iParameterCode -
	 *            �û���¼��iParameterCode��iCompanyCode��ȷ����
	 * @param iParameterType -
	 *            �ɸ�����Ҫ�̶�����"00"���߾��幦�ܡ�
	 * @param iCompanyCode -
	 *            �ڲ��޸ģ����θ��Ա��չ�˾���õ����й�˾�������
	 * @return
	 * @throws Exception
	 */
	public static String getParameterValue(String iParameterCode,
			String iParameterType, String iCompanyCode) throws Exception {

		if (!isInited) {
			initSysConfig(true);
			if (!isInited) {
				throw new UserException(-98, -996, "SystemConfig",
						"SystemConfig��û�г�ʼ��!");
			}
		}

		if (iParameterCode == null || iParameterType == null
				|| iCompanyCode == null) {
			throw new UserException(-98, -996, "SystemConfig",
					"getParameterValue()����������ΪNULL��");
		}

		if (iParameterCode.trim().length() == 0
				|| iParameterType.trim().length() == 0
				|| iCompanyCode.trim().length() == 0) {
			throw new UserException(-98, -996, "SystemConfig",
					"getParameterValue()����ֵ������Ϊ�ա�");
		}

		// �õ����й�˾�������
		iCompanyCode = COMPANY_CODE_ALL;

		String keyCode = getKey(iParameterCode, iParameterType, iCompanyCode);
		String value = hashSysConfig.get(keyCode);

		if (value == null) {
			throw new UserException(-98, -996, "SystemConfig",
					"getParameterValue()û��������:" + iParameterCode);
		}

		// ������Ϣ
		return value;
	}

	/** �õ��������ֵ����������ӣ��򻯵��� 
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
