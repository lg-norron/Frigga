/**
 * 包名：com.southwind.frigga.api
 * 文件名：AdSpreadDayController.java
 * 版本信息：
 * 日期：2014年8月25日-下午8:06:20
 * 
 */

package com.southwind.frigga.api.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.southwind.common.DateUtil;
import com.southwind.frigga.biz.service.AdInfoService;
import com.southwind.frigga.biz.service.AdSpreadDayService;
import com.southwind.frigga.biz.service.AdSpreadService;
import com.southwind.frigga.biz.service.ChannelUserService;
import com.southwind.frigga.dal.mybatis.model.AdSpread;
import com.southwind.frigga.dal.mybatis.model.AdSpreadDay;
import com.southwind.frigga.json.model.InfoList;
import com.southwind.frigga.json.model.SearchParam;

/**
 * 
 * 类名称：AdSpreadController 类描述： 创建人：liugang 修改时间：2014年8月25日 下午8:06:20 修改备注：
 * 
 * @version 1.0.0
 * 
 */
@Controller
@RequestMapping("/adspreadday")
public class AdSpreadDayController {

	private static final Logger logger = LoggerFactory
			.getLogger(AdSpreadDayController.class);

	private String pageList = "adspreadday/list";
	private String pageAdd = "adspreadday/add";
	private String pageUpdate = "adspreaday/update";

	@Autowired
	HttpServletRequest request;

	@Resource
	private AdSpreadDayService adSpreadDayService;
	@Resource
	private AdSpreadService adSpreadService;
	@Resource
	private ChannelUserService channelUserService;
	@Resource
	private AdInfoService adInfoService;

	@RequestMapping(value = "/list")
	public @ResponseBody InfoList<AdSpreadDay> adSpreadList(SearchParam searchParam) {

		InfoList<AdSpreadDay> list = new InfoList<AdSpreadDay>();
		List<AdSpreadDay> adSpreadDayList = adSpreadDayService
				.adSpreadList(searchParam);

		list.setData(adSpreadDayList);
		return list;
	}

	@RequestMapping(value = "/recordUI")
	public ModelAndView adSpreadRecordUI(AdSpreadDay adSpreadDay) {
		//		List<AdInfo> adInfoList = adInfoService.adInfoList(new SearchParam());
		//		List<ChannelUser> channelUserList = channelUserService
		//				.channelUserList(new SearchParam());
		long spreadId = adSpreadDay.getSpreadId();
		Long activeRevenue = 0l;
		Long id = 0l;

		AdSpread adSpread = adSpreadService.getById(spreadId);
		String spreadDate = DateUtil.getCurrentDate("yyyy-MM-dd");
		logger.debug("录入推广量日期：{}", spreadDate);
		adSpreadDay = adSpreadDayService.getDataForDay(spreadId, spreadDate);

		if (adSpreadDay != null) {
			id = adSpreadDay.getId();
			activeRevenue = adSpreadDay.getActiveRevenue();
		}

		ModelAndView mav = new ModelAndView();
		mav.setViewName(pageAdd);
		mav.addObject("adSpread", adSpread);
		mav.addObject("spreadDate", spreadDate);
		mav.addObject("activeRevenue", activeRevenue);
		mav.addObject("id", id);
		//		mav.addObject("adInfoList", adInfoList);
		//		mav.addObject("channelUserList", channelUserList);
		return mav;
	}

	@RequestMapping(value = "/record")
	public String record(AdSpreadDay adSpreadDay) {
		adSpreadDayService.record(adSpreadDay);
		return pageList;
	}

	@RequestMapping(value = "/updateUI")
	public ModelAndView updateUI(long id) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName(pageUpdate);

		return mav;
	}

	@RequestMapping(value = "/update")
	public String update(AdSpreadDay adSpreadDay) {
		adSpreadDayService.adSpreadUpdate(adSpreadDay);
		return pageList;
	}

	@RequestMapping(value = "/delete")
	public String update(long id) {
		adSpreadDayService.adSpreadDelete(id);
		return pageList;
	}
}
