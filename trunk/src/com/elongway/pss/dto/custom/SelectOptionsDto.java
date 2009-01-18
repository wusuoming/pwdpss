package com.elongway.pss.dto.custom;

import java.io.Serializable;

/**
 * 定义acnt04凭证主表的数据传输对象类
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>@createdate 2003-07-23</p>
 * @author DtoGenerator
 * @version 1.0
 */
public class SelectOptionsDto implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String optionValue;
    private String optionName;

    /**
     * 构造函数
     */
    public SelectOptionsDto(){
    }

    public void setOptionValue(String optionValue){
        this.optionValue = optionValue;
    }

    public String getOptionValue(){
        return optionValue;
    }

    public void setOptionName(String optionName){
        this.optionName = optionName;
    }

    public String getOptionName(){
        return optionName;
    }
}
