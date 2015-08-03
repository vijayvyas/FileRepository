package com.vijay.common.controller;

import java.io.File;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.common.model.AbstractFile;
import com.vijay.common.model.FileInfo;

@RestController
@RequestMapping("/fileinfo")
public class FileController {

	@Autowired
    ApplicationContext context;
	
	private static final Logger logger = LogManager.getLogger(FileController.class);
	
	
	@RequestMapping(method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody  AbstractFile getFile(@RequestParam(value="filepath") String path) {
		File file = new File("C:\\Temp\\ClientTrace.svclog");
		AbstractFile ft = context.getBean(FileInfo.class);
		if(file.isFile())
		{
			ft = ft.getMeteData().loadMetaData(file);
		}
		
		ft.getMeteData().setName(file.getName());
		ft.getMeteData().setSize(file.length());
		
		logger.debug("getting File information!");
//		return "hi"+name;
		
		return ft;

	}
}