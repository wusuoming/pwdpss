package com.elongway.pss.ui.control.iacontact;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.AppConfig;

/** 
 * UI通用信息类。
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
	 * 是否检查权限开关打开。
	 * @return
	 */
	public static boolean isPowerCheck(){
		return true; 
	}
	
	/**
	 * 查询最大条数。
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
	 * 调试。
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
	 * 调试。
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
	 * 格式化时间。
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
	 * 格式化时间。
	 * @return
	 */
	/** 格式化时间：输入dateTime。 */
	public static String getDateString(DateTime dateTime) {
		return getDateString(dateTime, "");
	}

	/** 格式化时间：输入dateTime。 */
	public static String getDateString(DateTime dateTime, String Format) {
	    
		// 条件
		if (dateTime == null || dateTime.toString().length() == 0)
			return "";

		// 分析
		Date date = (Date) dateTime.clone();
		SimpleDateFormat formatter;
		if(Format.equals("")){
		// 注意大小写。 yyyy-MM-dd HH:mm:ss
			 formatter = new SimpleDateFormat("yyyy-MM-dd");
		}else{
			 formatter = new SimpleDateFormat(Format);
			
		}
//		 返回
		return formatter.format(date);
	}
	
	
	
	
	
	
	
	
	
	
}
