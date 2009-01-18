package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * 这是LWPowerUser-用电用户信息表的数据传输对象类<br>
 */
public class LwPowerUserDto extends LwPowerUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     *  默认构造方法,构造一个默认的LwPowerUserDto对象
     */
    public LwPowerUserDto(){
    }
    private String townName = "";
    private String company = "";
    private int serialNo = 0;
	
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
