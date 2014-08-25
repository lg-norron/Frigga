
/**
 * 包名：com.southwind.frigga.biz.service
 * 文件名：RevenueService.java
 * 版本信息：
 * 日期：2014年8月25日-下午7:51:41
 * 
 */
 
package com.southwind.frigga.biz.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.southwind.frigga.dal.mybatis.mapper.RevenueMapper;
import com.southwind.frigga.dal.mybatis.model.Revenue;


 /**
 * 
 * 类名称：RevenueService
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年8月25日 下午7:51:41
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Service
public class RevenueService {

	@Resource
	private RevenueMapper revenueMapper;
	
	public void RevenueAdd(Revenue revenue){
		revenueMapper.insert(revenue);
	}
	
	public void RevenueUpdate(Revenue revenue){
		revenueMapper.updateByPrimaryKey(revenue);
	}
	
	public void RevenueDelete(Long id){
		revenueMapper.deleteByPrimaryKey(id);
	}
}
