package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * ����LWTownIndicator-ֱ������ָ���¼������ݴ��������<br>
 */
public class LwTownIndicatorDto extends LwTownIndicatorDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwTownIndicatorDto����
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
