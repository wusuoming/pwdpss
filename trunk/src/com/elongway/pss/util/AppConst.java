package com.elongway.pss.util;

/**
 * ������Ϣ��
 * RequestType��JNDI���ơ���־��¼������ģʽ��Session���ơ�Forward���ơ�������Ϣ���ı���Ϣ��
 *  
 * @author ������(����)
 * @version 1.0 2008-10-18
 */
public class AppConst implements IFlag, IJndiNameConst,
		ILogAppenderConst, IOperationModeConst, ISessionConst, IForwardConst,
		ICodeConst, ITextConst ,IDtdConst, IPropertyKey,IValue{
	
	/** ���캯���� */
	public AppConst() {
		
	}
}

/**
 * RequestType����׺"_FLAG"��
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-11-12
 */
interface IFlag {
	/** ��ǰʹ�õĵ��	 */
	public static final String CURRENT_AMMETER_FLAG = "1";
	/** ����ʹ�õĵ��	 */
	public static final String NOTUSE_AMMETER_FLAG = "0";
	/** ֱ����	 */
	public static final String TOWN_SALE_FLAG = "1";
	/** ����	 */
	public static final String WHOLE_SALE_FLAG = "2";	
	/** ��ҵ	 */
	public static final String FACTORY_SALE_FLAG = "3";
	/** ������	 */
	public static final String PEOPLE_AMMETER_FLAG = "1";	
	/** ��ҵ��	 */
	public static final String FACTORY_AMMETER_FLAG = "0";	
	
	/** С�������λ	 */
	public static final String TWO_DOT_FLAG = "#.##";	
	/** ��������	 */
	public static final String ZERO_DOT_FLAG = "#";	
	/** С�������λ	 */
	public static final String FOUR_DOT_FLAG = "#.####";	
	
	
}
/**
 * RequestType����׺"_Value"��
 * 
 * @author qiaoyouliang
 * @version 1.0 2008-11-12
 */
interface IValue {
	/** 0.0	 */
	public static final String ZERO_VALUE = "0.0";
	
	/** ��ҵ��۷���	 */
	public static final String INDUSTRY_PRICE_CODE = "7";
	/** ��ҵ��۷���	 */
	public static final String METERIALS_TYPE_CODE = "7";
	
	
}


/**
 * JNDI���ƣ���׺"_JNDI"��
 * ���ݣ���Сд��
 * @author MagicLee
 * @version 1.0 2006-09-14
 */
interface IJndiNameConst {
	/** ���ݿ�ԴĬ��ֵ��pssDataSource */
	public static final String DATASOURCE_JNDI = "pssDataSource";

}

/**
 * ��־��¼����׺"_LOG"��
 * ���ݣ�	ȫСд��
 * @author MagicLee
 * @version 1.0 2006-09-14
 */
interface ILogAppenderConst {
	

	// 5��ǰ��UIҳ����Ϣ	
	/** ��ѯ�޸ģ�maintenance */
	public static final String MAINTENANCE_LOG = "maintenance";

	/** ���ݸ��٣�datatrack */
	public static final String DATA_TRACK_LOG = "datatrack";

	/** ͳ�Ʒ�����statistics */
	public static final String STATISTICS_LOG = "statistics";

	/** �û�Ȩ�ޣ�syspower */
	public static final String SYS_POWER_LOG = "syspower";

	/** ϵͳ������sysconfig */
	public static final String SYS_CONFIG_LOG = "sysconfig";

	/** ������־��bizlog */
	public static final String BIZ_LOG_LOG = "bizlog";

	/** �û���־��userlog */
	public static final String USER_LOG_LOG = "userlog";

	/** ͨ�ù��ܣ�commonpub */
	public static final String COMMON_PUB_LOG = "commonpub";

	// 6��ϵͳ����
	/** ϵͳ��־��system */
	public static final String SYSTEM_LOG = "system";

	/** ������־��error */
	public static final String ERROR_LOG = "error";

	/** ������־��server */
	public static final String SERVER_LOG = "server";
	
	/** ҵ����Ϣ��bizinf */
	public static final String BIZINF_LOG = "bizinf";

}

/**
 * ����ģʽ����׺"_MODE"��
 * ���ݣ���Сд��
 * @author MagicLee
 * @version 2006-09-14
 */
interface IOperationModeConst {

	/** �鿴ģʽ��View */
	public static final String VIEW_MODE = "View";

	/** ɾ��ģʽ��Delete */
	public static final String DELETE_MODE = "Delete";

	/** �༭ģʽ��Edit */
	public static final String EDIT_MODE = "Edit";

	/** �޸�ģʽ��Modify */
	public static final String MODIFY_MODE = "Modify";

	/** ����ģʽ��Create */
	public static final String CREATE_MODE = "Create";

	/** ִ��ģʽ��Execute */
	public static final String EXECUTE_MODE = "Execute";

	/** ����Excelģʽ��Excel */
	public static final String EXCEL_MODE = "Excel";

	/** ��Ĭ��������ѯģʽ��DefaultQuery */
	public static final String DEFAULTQUERY_MODE = "DefaultQuery";

	/** ������������ѯģʽ��Query */
	public static final String QUERY_MODE = "Query";

	/** ��ѯ�����еļ�¼��0 */
	public static int FIND_ALL_MODE = 0;

	/** �Ƿ���ʾ������Ϣ��1��ʾ/0����ʾ */
	public static int DEBUG_MODE = 1;

	/** һҳ�г����еļ�¼��Integer.MAX_VALUE */
	public static int ALL_ROWS_MODE = Integer.MAX_VALUE;

}

/**
 * Session����׺"_SESSION"��
 * ���ݣ�С��д��
 * @author MagicLee
 * @version 2006-09-14
 */
interface ISessionConst {
	/** session���ƣ�sysUser */
	// �磺SysUser sysUser = (SysUser)(session.getAttribute(AppConst.SYSUSER_SESSION));
	public static final String SYSUSER_SESSION = "sysUser";

}

/**
 * struts global-forwards����׺"_FORWARD"��
 * ���ݣ���Сд��
 * @author MagicLee
 * @version 2006-09-14
 */
interface IForwardConst {
	/** ��¼��Logon */
	public static final String LOGON_FORWARD = "Logon";

	/** �ɹ���Success */
	public static final String SUCCESS_FORWARD = "Success";

	/** ��Ϣ��Message */
	public static final String MESSAGE_FORWARD = "Message";

	/** ȡ����Cancel */
	public static final String CANCEL_FORWARD = "Cancel";
	
	
	public static final String CREATE_SUCCESS_FORWARD = "CreateSuccess";
}

/**
 * �ı����룬��׺"_CODE"��
 * ���ݣ�	ȫСд��
 * @author MagicLee
 * @version 2006-09-14
 * 
 * modify zyb 2006-09-18
 */
interface ICodeConst {
	/** �ı����룺success */
	public static final String SUCCESS_CODE = "success";

	/** �ı����룺error */
	public static final String ERROR_CODE = "error";
	
	/** ���سɹ����룺1 */
	public static final String SUCCESS_TYPE_CODE = "1";//zyb insert
	
	/** ����ʧ�ܴ��룺0 */
	public static final String ERROR_TYPE_CODE = "0";// zyb insert
	
	/** ��ǿ���ձ���룺1 */
	public static final String RISK_TYPE_CODE = "1";// zyb insert  09-19
	
	/** ��ǿ�����ִ��룺BZ	 */
	public static final String RISK_KIND_CODE = "BZ";// zyb insert  09-19
	
	/** �ұ���룺CNY */
	public static final String CURRENCY_CODE = "CNY";// zyb insert  09-19

	/** ��ֵ���룺NULL */
	public static final String NULL_CODE = "NULL";// insert,061008,������
}

/**
 * �ı���Ϣ����׺"_TEXT"��
 * 
 * @author MagicLee
 * @version 2006-09-14
 */
interface ITextConst {
	/** �ı���Ϣ����� */
	public static final String INSERT_TEXT = "���";

	/** �ı���Ϣ��ɾ�� */
	public static final String DELETE_TEXT = "ɾ��";

	/** �ı���Ϣ������ */
	public static final String UPDATE_TEXT = "����";

	/** �ı���Ϣ������ */
	public static final String SAVE_TEXT = "����";

	/** �ı���Ϣ����ѯ */
	public static final String FIND_TEXT = "��ѯ";

	/** �ı���Ϣ���鿴 */
	public static final String VIEW_TEXT = "�鿴";

	/** �ı���Ϣ���ɹ� */
	public static final String SUCCESS_TEXT = "�ɹ�";

	/** �ı���Ϣ��ʧ�� */
	public static final String FAILURE_TEXT = "ʧ��";

	/** �ı���Ϣ������ */
	public static final String ERROR_TEXT = "����";

	/** �ı���Ϣ������ */
	public static final String REVOKE_TEXT = "����";
	
}

/**
 * ��������������,��ȡerrormessage.dtd��"����" ��׺"_DTD"
 * 
 * @author ZYB
 * @version 2006-09-18
 */	
interface IDtdConst {
	/**�����DTD����: "00"*/
	public static final String ERROR_TYPE_DTD = "00";
}

interface IPropertyKey{
	public static final String WEB_APP_PATH = "webapp.path";
}
interface DataBase{
	public static final String PSS_DATASOURCE = "pssDataSource";
}

