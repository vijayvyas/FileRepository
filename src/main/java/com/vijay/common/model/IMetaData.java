package com.vijay.common.model;

import java.io.File;
import java.sql.Timestamp;

public abstract class IMetaData {
	String name;
    long size;
    Timestamp createTime;
    String type;
    String uri;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public AbstractFile loadMetaData(File file) {
		// TODO Auto-generated method stub
		return null;
	}
}
