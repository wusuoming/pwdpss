package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * 这是LWTownIndicator-直供乡电表指针记录表的数据传输对象类<br>
 */
public class LwTownIndicatorDto extends LwTownIndicatorDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     *  默认构造方法,构造一个默认的LwTownIndicatorDto对象
     */
    public LwTownIndicatorDto(){
    }
    public String ammeterNo = "";
	public String getAmmeterNo() {
		return ammeterNo;
	}
	public void setAmmeterNo(String ammeterNo) {
		this.ammeterNo = ammeterNo;
	}
    
}
