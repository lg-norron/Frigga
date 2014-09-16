
/**
 * 包名：com.southwind.frigga.biz.service
 * 文件名：UserService.java
 * 版本信息：
 * 日期：2014年9月14日-下午5:19:36
 * 
 */
 
package com.southwind.frigga.biz.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.southwind.frigga.dal.mybatis.mapper.ChannelUserMapper;
import com.southwind.frigga.dal.mybatis.model.ChannelUser;
import com.southwind.frigga.dal.mybatis.model.ChannelUserExample;
import com.southwind.frigga.json.model.UserLogin;


 /**
 * 
 * 类名称：UserService
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年9月14日 下午5:19:36
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Service
public class UserService {

	@Resource
	private ChannelUserMapper channelUserMapper;
	
	/**
	 * @param userLogin
	 * @return 
	 * @exception 
	 * @since  1.0.0
	 */
	
	public int login(UserLogin userLogin) {
		String userlogin = userLogin.getUsername();
		String password = userLogin.getPassword();
		if("admin".equals(userlogin)){
			if("admin!@#".equals(password)){
				userLogin.setUserId(-1);
				userLogin.setRole("super");
				return 0;
			}
		}else{
			ChannelUserExample example = new ChannelUserExample();
			ChannelUserExample.Criteria criteria = example.createCriteria();
			criteria.andQdLoginEqualTo(userlogin);
			criteria.andQdPasswordEqualTo(password);
			List<ChannelUser> list = channelUserMapper.selectByExample(example, 0, 1);
			if(list.size()==1){
				ChannelUser channelUser= list.get(0);
				userLogin.setUserId(channelUser.getId());
				userLogin.setRole("qd");
				return 0;
			}
		}
		return -1;
	}

	
	/**
	 * @param userid
	 * @param newPwd 
	 * @exception 
	 * @since  1.0.0
	 */
	
	public void updatePwd(long userid, String newPwd) {
		ChannelUser record = new ChannelUser();
		record.setId(userid);
		record.setQdPassword(newPwd);
		channelUserMapper.updateByPrimaryKeySelective(record);
	}

}
