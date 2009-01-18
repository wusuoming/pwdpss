package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * 这是LWTownPriceSummary-直供乡电费计算总表的数据传输对象类<br>
 */
public class LwTownPriceSummaryDto extends LwTownPriceSummaryDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     *  默认构造方法,构造一个默认的LwTownPriceSummaryDto对象
     */
    public LwTownPriceSummaryDto(){
    }
    /**
	 * 用户名
	 */
	public String userName = "";
	/**
	 * 密码
	 */
	public String address = "";
	/**
	 * 表号
	 */
	public String ammeterNo = "";
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAmmeterNo() {
		return ammeterNo;
	}
	public void setAmmeterNo(String ammeterNo) {
		this.ammeterNo = ammeterNo;
	}
	
}
