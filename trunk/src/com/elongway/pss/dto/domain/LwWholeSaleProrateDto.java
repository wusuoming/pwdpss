package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * 这是LWWholeSaleProrate-趸售比例分摊表的数据传输对象类<br>
 */
public class LwWholeSaleProrateDto extends LwWholeSaleProrateDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     *  默认构造方法,构造一个默认的LwWholeSaleProrateDto对象
     */
    public LwWholeSaleProrateDto(){
    }
    private String voltName =  "";
	public String getVoltName() {
		return voltName;
	}
	public void setVoltName(String voltName) {
		this.voltName = voltName;
	}
    
}
