package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * ����LWTownPriceSummary-ֱ�����Ѽ����ܱ�����ݴ��������<br>
 */
public class LwTownPriceSummaryDto extends LwTownPriceSummaryDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwTownPriceSummaryDto����
     */
    public LwTownPriceSummaryDto(){
    }
    /**
	 * �û���
	 */
	public String userName = "";
	/**
	 * ����
	 */
	public String address = "";
	/**
	 * ���
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
