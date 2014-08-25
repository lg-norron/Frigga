
/**
 * 包名：com.southwind.frigga.biz.service
 * 文件名：ChannelUserService.java
 * 版本信息：
 * 日期：2014年8月25日-下午7:51:41
 * 
 */
 
package com.southwind.frigga.biz.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.southwind.frigga.dal.mybatis.mapper.ChannelUserMapper;
import com.southwind.frigga.dal.mybatis.model.ChannelUser;


 /**
 * 
 * 类名称：ChannelUserService
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年8月25日 下午7:51:41
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Service
public class ChannelUserService {

	@Resource
	private ChannelUserMapper channelUserMapper;
	
	public void ChannelUserAdd(ChannelUser channelUser){
		channelUserMapper.insert(channelUser);
	}
	
	public void ChannelUserUpdate(ChannelUser channelUser){
		channelUserMapper.updateByPrimaryKey(channelUser);
	}
	
	public void ChannelUserDelete(Long id){
		channelUserMapper.deleteByPrimaryKey(id);
	}
}
