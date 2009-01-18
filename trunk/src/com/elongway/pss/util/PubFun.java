package com.elongway.pss.util;

import java.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;

/**
 * <p>Description:通用函数</p>
 * <p>Company: Sinosoft</p>
 * @author CHENQIANG
 */
 
public class PubFun {

	static int mSerialNo = 100;
	
    public PubFun() {
    }
    
    public static void main(String[] args) {
        System.out.println("This is PubFun!");
        PubFun pubFun = new PubFun();
        DateTime dateTime1 = new DateTime("2006-01-02");
        System.out.println(pubFun.dateConvertToString(dateTime1));
        DateTime dateTime2 = new DateTime("2006-01-02 10:12",DateTime.YEAR_TO_MINUTE);
        System.out.println(pubFun.dateConvertToString(dateTime2));
        DateTime dateTime3 = new DateTime("2006-01-02 10:12:12",DateTime.YEAR_TO_SECOND);
        System.out.println(pubFun.dateConvertToString(dateTime3));
        DateTime dateTime4 = new DateTime("2006-01-02 10:12:12 CST",DateTime.YEAR_TO_SECOND);
        System.out.println(pubFun.dateConvertToString(dateTime4));
        Date dateTime5 = new java.util.Date();
        System.out.println(dateTime5);
        DateTime dateTime6 = new DateTime();
        System.out.println("dateTime6:  "+pubFun.dateConvertToString(dateTime6));
    }
    
    
    /**
   * 功能：产生30位的流水号：2位请求类型+4位公司代码+4位地区代码+2位年份+2位预留（00）+15位流水号+1位校验码
   * @param requestType：请求类型
   * @param companyCode：公司代码
   * @param areaCode:	 地区代码
   * @return 返回产生的流水号码
   */    
    public String CreateMaxNo(String companyCode) {
 
    	String maxNo="";
    	long serialNo=0;

    	//今天当前时间
    	Calendar calendar = Calendar.getInstance();    	
    	synchronized(this) {
    		if (mSerialNo == 1000) mSerialNo = 100;
    		serialNo = (calendar.getTimeInMillis())*1000+mSerialNo;
    		mSerialNo++;
    	}

    	maxNo =	companyCode+serialNo;
        
    	return maxNo;
    }
    
    /**
     * 功能：将yyyymmddhhmm或yyyymmddhh格式的日期字符串格式化为yyyy-mm-dd hh:mm,将yyyymmdd格式的日期字符串格式化为yyyy-mm-dd
     * @param date：日期字符串
     * @return 返回格式化的日期字符串
     */
    public DateTime getConvertDate(String date){
    	
        String returnStr="";
        String tempDate=date;
        String year="";
        String month="";
        String day="";
        String hour="";
        String minute="";
        DateTime returnDate = new DateTime();

        if(tempDate==null || tempDate.equals("")) {
            return returnDate;
        }
        
        //暂时只考虑三种情况20060101、2006010103、200601010304
        if(tempDate.length()==8) {
        	year   = tempDate.substring(0,4);
            month  = tempDate.substring(4,6);
            day    = tempDate.substring(6,8);

            returnStr=year+"-"+month+"-"+day;
            returnDate = new DateTime(returnStr);
        }
        
        if(tempDate.length()==10) {
        	year   = tempDate.substring(0,4);
            month  = tempDate.substring(4,6);
            day    = tempDate.substring(6,8);
            hour   = tempDate.substring(8,10);
            minute = "00";
            
            returnStr=year+"-"+month+"-"+day+" "+hour+":"+minute;
            returnDate = new DateTime(returnStr,DateTime.YEAR_TO_MINUTE);
        }
        
        if(tempDate.length()==12) {
        	year   = tempDate.substring(0,4);
            month  = tempDate.substring(4,6);
            day    = tempDate.substring(6,8);
            hour   = tempDate.substring(8,10);
            minute = tempDate.substring(10,12);
            
            returnStr=year+"-"+month+"-"+day+" "+hour+":"+minute;
            returnDate = new DateTime(returnStr,DateTime.YEAR_TO_MINUTE);
        }

        return returnDate;
    }
    
    /**
     * 功能：校验日期格式的合法性
     * @param date：日期字符串
     * @return 返回校验结果
     */
    public String checkValidDate(String date) {
    	
    	String year="";
        String month="";
        String day="";
        String hour="";
        String minute="";
        String returnmsg="success";
    	String tempDate=date;
        String NUM="0123456789";
        DateTime dateTime = new DateTime();
        
        if(tempDate!=null && !tempDate.equals("")) {
        	
	    	if(tempDate.length()!=8 && tempDate.length()!=10 && tempDate.length()!=12) {
	    		returnmsg = "日期长度有误!";
	    		return returnmsg;
	        }
	        
	    	for(int i=0;i<tempDate.length();i++){
	    		if(NUM.indexOf(tempDate.charAt(i))<0){
	    			returnmsg = "日期组成有误!";
	    			return returnmsg;
	    		}
	    	}
	    	
	    	if(tempDate.length()==8) {
	    		year   = tempDate.substring(0,4);
	            month  = tempDate.substring(4,6);
	            day    = tempDate.substring(6,8);
	    		dateTime = new DateTime(year+"-"+month+"-"+day);
	    		
	    		if(dateTime.getYear()!=Integer.parseInt(year) || dateTime.getMonth()!=Integer.parseInt(month) 
	    			|| dateTime.getDay()!=Integer.parseInt(day)) {
	    			returnmsg = "日期格式有误!";
	    			return returnmsg;
	    		}
	    	}
    		else if(tempDate.length()==10) {
    			year   = tempDate.substring(0,4);
                month  = tempDate.substring(4,6);
                day    = tempDate.substring(6,8);
                hour   = tempDate.substring(8,10);
                minute = "00";
                
	    		dateTime = new DateTime(year+"-"+month+"-"+day+" "+hour+":"+minute,DateTime.YEAR_TO_MINUTE);
	    		if(dateTime.getYear()!=Integer.parseInt(year) || dateTime.getMonth()!=Integer.parseInt(month) 
	        		|| dateTime.getDay()!=Integer.parseInt(day) || dateTime.getHour()!=Integer.parseInt(hour)
	        		|| dateTime.getMinute()!=Integer.parseInt(minute)) {
	    			returnmsg = "日期格式有误!";
	    			return returnmsg;
	    		}
    		}
    		else if(tempDate.length()==12) {
    			year   = tempDate.substring(0,4);
                month  = tempDate.substring(4,6);
                day    = tempDate.substring(6,8);
                hour   = tempDate.substring(8,10);
                minute = tempDate.substring(10,12);
                
	    		dateTime = new DateTime(year+"-"+month+"-"+day+" "+hour+":"+minute,DateTime.YEAR_TO_MINUTE);
	    		if(dateTime.getYear()!=Integer.parseInt(year) || dateTime.getMonth()!=Integer.parseInt(month) 
	        		|| dateTime.getDay()!=Integer.parseInt(day) || dateTime.getHour()!=Integer.parseInt(hour)
	        		|| dateTime.getMinute()!=Integer.parseInt(minute)) {
	    			returnmsg = "日期格式有误!";
	    			return returnmsg;
	    		}
    		}
        }
        
    	return returnmsg;
    }
    
    /**
     * 功能：将yyyymmddhhmm格式的日期字符串格式化为yyyy-mm-dd hh:mm,将yyyymmdd格式的日期字符串格式化为yyyy-mm-dd
     * @param date：日期字符串
     * @return 返回格式化的日期字符串
     */
    public String dateConvertToString(DateTime dateTime){
    	
        String returnStr="";
        String tempDate=dateTime.toString();
        String year="";
        String month="";
        String day="";
        String hour="";
        String minute="";

        if(tempDate==null || tempDate.equals("")) {
            return returnStr;
        }
        
        if(tempDate.indexOf("-")<0 && tempDate.indexOf("/")<0) {
        	return tempDate;
        }
        
        //暂时只考虑三种情况2006-01-01、2006-01-01 03:04、2006-01-01 03:04:05 CST
        if(tempDate.length()==10) {
        	year   = tempDate.substring(0,4);
            month  = tempDate.substring(5,7);
            day    = tempDate.substring(8,10);

            returnStr=year+month+day;
        }
        
        if(tempDate.length()>10) {
        	tempDate = new DateTime(tempDate,DateTime.YEAR_TO_MINUTE).toString();

        	year   = tempDate.substring(0,4);
            month  = tempDate.substring(5,7);
            day    = tempDate.substring(8,10);
            hour   = tempDate.substring(11,13);
            minute = tempDate.substring(14,16);;
            
            returnStr=year+month+day+hour+minute;
            
        }
        
        return returnStr;
    }
    
	public static final String STRING_EMTPY = "";
	public static final String STRING_TEXT01 = " AND ( ";
	public static final String STRING_TEXT02 = " = '";
	public static final String STRING_TEXT03 = "') ";

	/**
	 * 【功能】<br>
	 * 代替PubFun.buildCondition()。<br>
	 * 【规则】<br>
	 * 1、如果name为null，或trim(name)的长度为0，返回empty。<br>
	 * 2、如果value为null，或value的长度为0，返回empty。 <br>
	 * 3、不处理value中包含“*、%、：”的转义。
	 * 
	 * @version 2.2.0 2007-08-29 乔有良、李子扬
	 */
	public static String buildCondition(String name, String value) {

		// 条件处理
		if (name == null || name.trim().length() == 0 || value == null || value.length()==0) {
			return STRING_EMTPY;
		}

		// 构造条件
		StringBuilder sb = new StringBuilder(64);
		
		sb.append(STRING_TEXT01);
		sb.append(name);
		sb.append(STRING_TEXT02);
		sb.append(value);
		sb.append(STRING_TEXT03);

		// 返回信息
		return sb.toString();
	}
}