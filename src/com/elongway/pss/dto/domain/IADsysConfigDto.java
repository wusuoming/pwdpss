package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * ����IADsysConfig�����ݴ��������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IADsysConfigDto extends IADsysConfigDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�IADsysConfigDto����
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
