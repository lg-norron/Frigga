
/**
 * 包名：com.southwind.frigga.api
 * 文件名：ChannelUserController.java
 * 版本信息：
 * 日期：2014年8月25日-下午8:06:20
 * 
 */
 
package com.southwind.frigga.api.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.southwind.frigga.biz.service.ChannelUserService;
import com.southwind.frigga.dal.mybatis.model.ChannelUser;
import com.southwind.frigga.json.model.InfoList;
import com.southwind.frigga.json.model.SearchParam;


 /**
 * 
 * 类名称：ChannelUserController
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年8月25日 下午8:06:20
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Controller
@RequestMapping("/channeluser")
public class ChannelUserController {
	
	//private static final Logger logger = LoggerFactory.getLogger(ChannelUserController.class);
	
	private String pageList = "channeluser/list";
	//private String pageAdd = "channeluser/add";
	private String pageUpdate = "channeluser/update";
	
	@Resource
	private ChannelUserService channelUserService;

	@RequestMapping(value="/list")
	public  @ResponseBody InfoList<ChannelUser> ChannelUserList(SearchParam searchParam){

		InfoList<ChannelUser> list = new InfoList<ChannelUser>();
		List<ChannelUser> channelUserList = channelUserService.channelUserList(searchParam);

		list.setData(channelUserList);
		return list;
	}
	
	@RequestMapping(value="/add")
	public String ChannelUserAdd(ChannelUser channelUser){
		channelUserService.ChannelUserAdd(channelUser);
		return pageList;
	}
	
	@RequestMapping(value="/updateUI")
	public ModelAndView updateUI(long id){
		
		ChannelUser channelUser = channelUserService.getById(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(pageUpdate);
		mav.addObject(channelUser);
		
		return mav;
	}
	
	@RequestMapping(value="/update")
	public String update(ChannelUser channelUser){
		channelUserService.ChannelUserUpdate(channelUser);
		return pageList;
	}
	
	
	@RequestMapping(value="/delete")
	public String update(long id){
		channelUserService.ChannelUserDelete(id);
		return pageList;
	}
}
