package com.elongway.pss.dto.custom;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/**
 * 通用数据传输对象.
 * 
 * @author qiaoyouliang
 * @version 2009-04-01
 */
public class CommonDto implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 8-bit */
	private Byte byteObject = null;

	/** 16-bit */
	private Short shortObject = null;
	
	/** 32-bit */
	private Integer integerObject = null;

	/** 64-bit */
	private Long longObject = null;

	/** 单精 */
	private Float floatObject = null;

	/** 双精 */
	private Double doubleObject = null;

	/** 文字 */
	private String stringObject = null;

	/** 集合 */
	private Collection collectionObject = null;
	
	/** 图 */
	private Map mapObject = null;
	
	/** 对象 */
	private Object objectObject = null;
	
	public Byte getByte() {
		return byteObject;
	}

	public void setByte(Byte byteObject) {
		this.byteObject = byteObject;
	}

	public Collection getCollection() {
		return collectionObject;
	}

	public void setCollection(Collection collectionObject) {
		this.collectionObject = collectionObject;
	}

	public Double getDouble() {
		return doubleObject;
	}

	public void setDouble(Double doubleObject) {
		this.doubleObject = doubleObject;
	}

	public Float getFloat() {
		return floatObject;
	}

	public void setFloat(Float floatObject) {
		this.floatObject = floatObject;
	}

	public Integer getInteger() {
		return integerObject;
	}

	public void setInteger(Integer integerObject) {
		this.integerObject = integerObject;
	}

	public Long getLong() {
		return longObject;
	}

	public void setLong(Long longObject) {
		this.longObject = longObject;
	}

	public Map getMap() {
		return mapObject;
	}

	public void setMap(Map mapObject) {
		this.mapObject = mapObject;
	}
	
	public Short getShort() {
		return shortObject;
	}

	public void setShort(Short shortObject) {
		this.shortObject = shortObject;
	}

	public String getString() {
		return stringObject;
	}

	public void setString(String stringObject) {
		this.stringObject = stringObject;
	}
	
	public Object getObject() {
		return objectObject;
	}

	public void setObject(Object objectObject) {
		this.objectObject = objectObject;
	}
}
