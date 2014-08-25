
/**
 * 包名：com.southwind.frigga.biz.service
 * 文件名：AdSpreadService.java
 * 版本信息：
 * 日期：2014年8月25日-下午7:51:41
 * 
 */
 
package com.southwind.frigga.biz.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.southwind.frigga.dal.mybatis.mapper.AdSpreadDayMapper;
import com.southwind.frigga.dal.mybatis.model.AdSpreadDay;


 /**
 * 
 * 类名称：AdSpreadService
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年8月25日 下午7:51:41
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Service
public class AdSpreadDayService {

	@Resource
	private AdSpreadDayMapper adSpreadDayMapper;
	
	public void adSpreadDayAdd(AdSpreadDay adSpreadDay){
		adSpreadDayMapper.insert(adSpreadDay);
	}
	
	public void adSpreadUpdate(AdSpreadDay adSpreadDay){
		adSpreadDayMapper.updateByPrimaryKey(adSpreadDay);
	}
	
	public void adSpreadDelete(Long id){
		adSpreadDayMapper.deleteByPrimaryKey(id);
	}
}
