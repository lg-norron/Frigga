
/**
 * 包名：com.southwind.frigga.biz.loader
 * 文件名：ConfigLoaderService.java
 * 版本信息：
 * 日期：2014年9月4日-下午9:38:17
 * 
 */
 
package com.southwind.frigga.biz.loader;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.southwind.common.PropertiesUtil;


 /**
 * 
 * 类名称：ConfigLoaderService
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年9月4日 下午9:38:17
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Service
public class ConfigLoaderService {
	private static final Logger logger = LoggerFactory.getLogger(ConfigLoaderService.class);
	@PostConstruct
	public void init(){
		String fileName = "config/config.properties";
		PropertiesUtil.loadProp(fileName);
		String uploadfileFolder = PropertiesUtil.getValue("uploadfile_folder");
		logger.info("uploadfileFolder:{}",uploadfileFolder);
	}
	
}
