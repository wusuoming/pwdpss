package com.elongway.pss.util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.sinosoft.sysframework.common.util.FileUtils;
import com.sinosoft.sysframework.common.util.PlatformUtils;
import com.sinosoft.sysframework.common.util.SqlUtils;;

/**
 * Ӧ�ó���������ʼ���ࡣ<br>
 * 1����ʼ�� sysframework��<br>
 * 2�����ô���"/"��Ӧ��·������
 * 
 * @author Sinosoft
 * @version 1.0 061010 ������ ��ʼ����
 */
public class AppStart extends HttpServlet{

	private static final long serialVersionUID = 0L;
	
	/** ���ݿ����ͣ��� sysframework */
	protected int dbType = SqlUtils.ANSI_DB;
	
	/**
	 * @see javax.servlet.GenericServlet#init()
	 */
	public void init() throws ServletException{
		super.init();
		
		// 1����ʼ�� sysframework��
		dbType = Integer.parseInt( "0" + getInitParameter("dbType"));
		
		SqlUtils.setDbType(dbType);
		
		System.out.println("Success Set Startup Parms: dbType = " + dbType + ";");
		
		// 2�����ô���"/"��Ӧ��·����������ͨ�� System.getProperty(AppConst.WEB_APP_PATH)��ȡ��
		System.setProperty(AppConst.WEB_APP_PATH, getAppPath());

	}
	
	/** ���ش���"/"��Ӧ��·�������磺D:\webapps\sinoiaci\ */
	private String getAppPath(){
		String path = getServletContext().getRealPath("/");
		
		// ����·��
		if (path == null || path.trim().length() == 0) {
			String classPath = FileUtils.getRealPathName(AppStart.class);
			path = classPath.substring(0, classPath.lastIndexOf("/WEB-INF"));
		}
		
		// ��ӽ�β
		if (!path.endsWith(PlatformUtils.FILE_SEPARATOR)) {
			path += PlatformUtils.FILE_SEPARATOR;
		}
		
		// ��������
		return path;
	}
}
