package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * ����LWWholeSaleProrate-���۱�����̯������ݴ��������<br>
 */
public class LwWholeSaleProrateDto extends LwWholeSaleProrateDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwWholeSaleProrateDto����
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
