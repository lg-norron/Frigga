
/**
 * 包名：com.southwind.frigga.api
 * 文件名：AdInfoController.java
 * 版本信息：
 * 日期：2014年8月25日-下午8:06:20
 * 
 */
 
package com.southwind.frigga.api;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.southwind.frigga.biz.service.AdInfoService;
import com.southwind.frigga.dal.mybatis.model.AdInfo;


 /**
 * 
 * 类名称：AdInfoController
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年8月25日 下午8:06:20
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Controller
@RequestMapping("/adinfo")
public class AdInfoController {
	
	@Resource
	private AdInfoService adInfoService;

	@RequestMapping("/list")
	public  @ResponseBody List<AdInfo> adinfoList(){
		List<AdInfo> list = new ArrayList<AdInfo>();
		AdInfo adInfo = new AdInfo();
		adInfo.setId(1l);
		adInfo.setAdName("360安全卫士");
		adInfo.setAdType("app");
		adInfo.setAdvertiser("奇虎360");
		adInfo.setUnitPrice(1.2);
		list.add(adInfo);
		
		adInfo.setId(2l);
		adInfo.setAdName("361安全卫士");
		adInfo.setAdType("app");
		adInfo.setAdvertiser("奇虎360");
		adInfo.setUnitPrice(1.2);
		list.add(adInfo);
		return list;
	}
}
