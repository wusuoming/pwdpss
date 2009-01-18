package com.elongway.pss.util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.sinosoft.sysframework.common.util.FileUtils;
import com.sinosoft.sysframework.common.util.PlatformUtils;
import com.sinosoft.sysframework.common.util.SqlUtils;;

/**
 * 应用程序启动初始化类。<br>
 * 1、初始化 sysframework。<br>
 * 2、设置带有"/"的应用路径名。
 * 
 * @author Sinosoft
 * @version 1.0 061010 李子扬 初始化。
 */
public class AppStart extends HttpServlet{

	private static final long serialVersionUID = 0L;
	
	/** 数据库类型，见 sysframework */
	protected int dbType = SqlUtils.ANSI_DB;
	
	/**
	 * @see javax.servlet.GenericServlet#init()
	 */
	public void init() throws ServletException{
		super.init();
		
		// 1、初始化 sysframework。
		dbType = Integer.parseInt( "0" + getInitParameter("dbType"));
		
		SqlUtils.setDbType(dbType);
		
		System.out.println("Success Set Startup Parms: dbType = " + dbType + ";");
		
		// 2、设置带有"/"的应用路径名。可以通过 System.getProperty(AppConst.WEB_APP_PATH)获取。
		System.setProperty(AppConst.WEB_APP_PATH, getAppPath());

	}
	
	/** 返回带有"/"的应用路径名。如：D:\webapps\sinoiaci\ */
	private String getAppPath(){
		String path = getServletContext().getRealPath("/");
		
		// 分析路径
		if (path == null || path.trim().length() == 0) {
			String classPath = FileUtils.getRealPathName(AppStart.class);
			path = classPath.substring(0, classPath.lastIndexOf("/WEB-INF"));
		}
		
		// 添加结尾
		if (!path.endsWith(PlatformUtils.FILE_SEPARATOR)) {
			path += PlatformUtils.FILE_SEPARATOR;
		}
		
		// 返回数据
		return path;
	}
}
