
/**
 * 包名：com.southwind.frigga.biz.service
 * 文件名：AdInfoService.java
 * 版本信息：
 * 日期：2014年8月25日-下午7:51:41
 * 
 */
 
package com.southwind.frigga.biz.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.southwind.frigga.dal.mybatis.mapper.AdInfoMapper;
import com.southwind.frigga.dal.mybatis.model.AdInfo;


 /**
 * 
 * 类名称：AdInfoService
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年8月25日 下午7:51:41
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Service
public class AdInfoService {

	@Resource
	private AdInfoMapper adInfoMapper;
	
	public void adInfoAdd(AdInfo adInfo){
		adInfoMapper.insert(adInfo);
	}
	
	public void adInfoUpdate(AdInfo adInfo){
		adInfoMapper.updateByPrimaryKey(adInfo);
	}
	
	public void adInfoDelete(Long id){
		adInfoMapper.deleteByPrimaryKey(id);
	}
}
