package com.elongway.pss.ui.control.common.pub;

import java.util.Hashtable;

import com.elongway.pss.dto.domain.IASysUserDto;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * 个人用户信息，继承于IASysUserDto。
 * @author Yangfuqiang
 * @version 1.0 2006-08-26
 */
public class SysUser extends IASysUserDto {

	private static final long serialVersionUID = 1L;

	private String cssStyle;		//CSS样式文件。
	private Hashtable powerLevel; 	//存放 任务名称 - PowerLevel(0/1)
	
	public String getCssStyle() {
		return cssStyle;
	}

	public void setCssStyle(String cssStyle) {
		this.cssStyle = StringUtils.rightTrim(cssStyle);
	}

	public Hashtable getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(Hashtable powerLevel) {
		this.powerLevel = powerLevel;
	}
}
