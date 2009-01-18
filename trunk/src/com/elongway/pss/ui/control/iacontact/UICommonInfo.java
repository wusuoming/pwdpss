package com.elongway.pss.ui.control.iacontact;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.AppConfig;

/** 
 * UIͨ����Ϣ�ࡣ
 * 
 * @author yangfuqiang
 * @version 1.0 2006-08-15
 */
public class UICommonInfo {
	public static String YEAR_DAY = "yyyy-MM-dd";

	public static String YEAR_HOUR = "yyyy-MM-dd HH";

	public static String YEAR_MINITE = "yyyy-MM-dd HH:mm";
	
	public static String YEAR_SECOND = "yyyy-MM-dd HH:mm:ss";
	
	private static boolean isDebugging = false;
	
	/**
	 * �Ƿ���Ȩ�޿��ش򿪡�
	 * @return
	 */
	public static boolean isPowerCheck(){
		return true; 
	}
	
	/**
	 * ��ѯ���������
	 * @return
	 */
	public static int getQueryMaxRows() throws Exception {
		int rows = 0;
		
		try{
			rows = Integer.parseInt(AppConfig.get("SysConfig.QUERY_MAXROWS"));
		}catch (Exception exception){
			System.out.println("[UICommonInfo] Error: get SysConst QUERY_MAXROWS err.");
			rows = 200;
		}
		
		return rows;
	}

	/**
	 * ���ԡ�
	 * @return
	 */
	public static void debug(Object obj) {
		
		if (! isDebugging ) return;
		
		if (obj == null) {
			System.out.println("[Debug] null!!!");
		} else {
			System.out.println("[Debug] " + obj.toString());
		}

	}

	/**
	 * ���ԡ�
	 * @return
	 */
	public static void debug(Object objClass, Object objInfo) {
		
		if (! isDebugging ) return;
		
		if (objClass == null) {
			System.out.println("[Debug] null class!!!");
		} else {
			System.out.println("[Debug] " + objClass.toString());
		}
		
		if (objInfo == null) {
			System.out.println("[Value] null value!!!");
		} else {
			System.out.println("[Value] " + objInfo.toString());
		}
	}
	
	/**
	 * ��ʽ��ʱ�䡣
	 * @return
	 */
	public static DateTime getDateTime(String text){
		if (text == null || text.trim().length() == 0 ){
			return new DateTime((String) null);
		}else{
			return new DateTime(text, DateTime.YEAR_TO_DAY);
		}
	}

	
	
	/**
	 * ��ʽ��ʱ�䡣
	 * @return
	 */
	/** ��ʽ��ʱ�䣺����dateTime�� */
	public static String getDateString(DateTime dateTime) {
		return getDateString(dateTime, "");
	}

	/** ��ʽ��ʱ�䣺����dateTime�� */
	public static String getDateString(DateTime dateTime, String Format) {
	    
		// ����
		if (dateTime == null || dateTime.toString().length() == 0)
			return "";

		// ����
		Date date = (Date) dateTime.clone();
		SimpleDateFormat formatter;
		if(Format.equals("")){
		// ע���Сд�� yyyy-MM-dd HH:mm:ss
			 formatter = new SimpleDateFormat("yyyy-MM-dd");
		}else{
			 formatter = new SimpleDateFormat(Format);
			
		}
//		 ����
		return formatter.format(date);
	}
	
	
	
	
	
	
	
	
	
	
}
