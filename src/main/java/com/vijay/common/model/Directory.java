package com.vijay.common.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Directory implements AbstractFile {
 List<AbstractFile> abstractFile  = new ArrayList<AbstractFile>();
 private IMetaData dirMetaData;
@Override
public boolean isDir() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public IMetaData getMeteData() {
	// TODO Auto-generated method stub
	return dirMetaData;
}

@Autowired(required = true)
@Qualifier(value="dirMetaData")
public void setMeteData(IMetaData metaData) {
	dirMetaData = metaData;
	
}
 
}
