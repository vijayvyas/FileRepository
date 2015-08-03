package com.vijay.common.model;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FileInfo implements AbstractFile {

	 private IMetaData fileMetaData;
	private File file;

	public FileInfo() {
		// TODO Auto-generated constructor stub
	}



	public FileInfo(File file) {
		this.file=file;
	}

	@Override
	public boolean isDir() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IMetaData getMeteData() {
		// TODO Auto-generated method stub
		return fileMetaData;
	}

	@Autowired(required = true)
	@Qualifier(value="fileIMetaData")
	public void setMeteData(IMetaData metaData) {
		fileMetaData = metaData;		
	}

}
