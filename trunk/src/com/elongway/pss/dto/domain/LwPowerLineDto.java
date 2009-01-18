package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * 这是LWPowerLine-线路信息表的数据传输对象类<br>
 */
public class LwPowerLineDto extends LwPowerLineDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     *  默认构造方法,构造一个默认的LwPowerLineDto对象
     */
    public LwPowerLineDto(){
    	// 构造函数
    }
    private double lineLong = 9.116;
    private double R = 0.46;
    private double volt = 35;
    private double t = 720;
	public double getLineLong() {
		return lineLong;
	}
	public void setLineLong(double lineLong) {
		this.lineLong = lineLong;
	}
	public double getR() {
		return R;
	}
	public void setR(double r) {
		R = r;
	}
	public double getVolt() {
		return volt;
	}
	public void setVolt(double volt) {
		this.volt = volt;
	}
	public double getT() {
		return t;
	}
	public void setT(double t) {
		this.t = t;
	}
}
