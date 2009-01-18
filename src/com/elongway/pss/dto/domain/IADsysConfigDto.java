package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * 这是IADsysConfig的数据传输对象类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IADsysConfigDto extends IADsysConfigDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     *  默认构造方法,构造一个默认的IADsysConfigDto对象
     */
    public IADsysConfigDto(){
    }
    
    private String ParameterTypeCName = "";
    private String CompanyCName = "";
	public String getCompanyCName() {
		return CompanyCName;
	}
	public void setCompanyCName(String companyCName) {
		CompanyCName = companyCName;
	}
	public String getParameterTypeCName() {
		return ParameterTypeCName;
	}
	public void setParameterTypeCName(String parameterTypeCName) {
		ParameterTypeCName = parameterTypeCName;
	}
}
