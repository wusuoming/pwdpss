package com.elongway.pss.util;

import java.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;

/**
 * <p>Description:ͨ�ú���</p>
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
   * ���ܣ�����30λ����ˮ�ţ�2λ��������+4λ��˾����+4λ��������+2λ���+2λԤ����00��+15λ��ˮ��+1λУ����
   * @param requestType����������
   * @param companyCode����˾����
   * @param areaCode:	 ��������
   * @return ���ز�������ˮ����
   */    
    public String CreateMaxNo(String companyCode) {
 
    	String maxNo="";
    	long serialNo=0;

    	//���쵱ǰʱ��
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
     * ���ܣ���yyyymmddhhmm��yyyymmddhh��ʽ�������ַ�����ʽ��Ϊyyyy-mm-dd hh:mm,��yyyymmdd��ʽ�������ַ�����ʽ��Ϊyyyy-mm-dd
     * @param date�������ַ���
     * @return ���ظ�ʽ���������ַ���
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
        
        //��ʱֻ�����������20060101��2006010103��200601010304
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
     * ���ܣ�У�����ڸ�ʽ�ĺϷ���
     * @param date�������ַ���
     * @return ����У����
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
	    		returnmsg = "���ڳ�������!";
	    		return returnmsg;
	        }
	        
	    	for(int i=0;i<tempDate.length();i++){
	    		if(NUM.indexOf(tempDate.charAt(i))<0){
	    			returnmsg = "�����������!";
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
	    			returnmsg = "���ڸ�ʽ����!";
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
	    			returnmsg = "���ڸ�ʽ����!";
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
	    			returnmsg = "���ڸ�ʽ����!";
	    			return returnmsg;
	    		}
    		}
        }
        
    	return returnmsg;
    }
    
    /**
     * ���ܣ���yyyymmddhhmm��ʽ�������ַ�����ʽ��Ϊyyyy-mm-dd hh:mm,��yyyymmdd��ʽ�������ַ�����ʽ��Ϊyyyy-mm-dd
     * @param date�������ַ���
     * @return ���ظ�ʽ���������ַ���
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
        
        //��ʱֻ�����������2006-01-01��2006-01-01 03:04��2006-01-01 03:04:05 CST
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
	 * �����ܡ�<br>
	 * ����PubFun.buildCondition()��<br>
	 * ������<br>
	 * 1�����nameΪnull����trim(name)�ĳ���Ϊ0������empty��<br>
	 * 2�����valueΪnull����value�ĳ���Ϊ0������empty�� <br>
	 * 3��������value�а�����*��%��������ת�塣
	 * 
	 * @version 2.2.0 2007-08-29 ��������������
	 */
	public static String buildCondition(String name, String value) {

		// ��������
		if (name == null || name.trim().length() == 0 || value == null || value.length()==0) {
			return STRING_EMTPY;
		}

		// ��������
		StringBuilder sb = new StringBuilder(64);
		
		sb.append(STRING_TEXT01);
		sb.append(name);
		sb.append(STRING_TEXT02);
		sb.append(value);
		sb.append(STRING_TEXT03);

		// ������Ϣ
		return sb.toString();
	}
}