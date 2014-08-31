
/**
 * 包名：com.southwind.frigga.api
 * 文件名：AdInfoController.java
 * 版本信息：
 * 日期：2014年8月25日-下午8:06:20
 * 
 */
 
package com.southwind.frigga.api;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.southwind.common.DateUtil;
import com.southwind.frigga.biz.service.AdInfoService;
import com.southwind.frigga.dal.mybatis.model.AdInfo;
import com.southwind.frigga.json.model.InfoList;
import com.southwind.frigga.json.model.SearchParam;


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

	@RequestMapping(value="/list")
	public  @ResponseBody InfoList<AdInfo> adinfoList(SearchParam searchParam){

		InfoList<AdInfo> list = new InfoList<AdInfo>();
		List<AdInfo> adinfoList = adInfoService.adInfoList(searchParam);

		list.setData(adinfoList);
		return list;
	}
	
	@RequestMapping(value="/add")
	public String adinfoAdd(AdInfo adInfo){
		adInfoService.adInfoAdd(adInfo);
		return "adinfo/list";
	}
	
	@RequestMapping(value="/updateUI")
	public ModelAndView updateUI(long id){
		
		AdInfo adinfo = adInfoService.getById(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("adinfo/update");
		mav.addObject(adinfo);
		
		return mav;
	}
	
	@RequestMapping(value="/update")
	public String update(AdInfo adinfo){
		adInfoService.adInfoUpdate(adinfo);
		return "adinfo/list";
	}
	
	@RequestMapping(value="/shelves")
	public String shelves(long id){
		AdInfo adinfo = new AdInfo();
		adinfo.setId(id);
		adinfo.setShelvesTime(DateUtil.getCurrentDate("yyyy-MM-dd HH:mm:ss"));
		adInfoService.adInfoUpdate(adinfo);
		return "adinfo/list";
	}
	
	@RequestMapping(value="/offShelves")
	public String offShelves(long id){
		AdInfo adinfo = new AdInfo();
		adinfo.setId(id);
		adinfo.setOffShelvesTime(DateUtil.getCurrentDate("yyyy-MM-dd HH:mm:ss"));
		adInfoService.adInfoUpdate(adinfo);
		return "adinfo/list";
	}
	
	@RequestMapping(value="/delete")
	public String update(long id){
		adInfoService.adInfoDelete(id);
		return "adinfo/list";
	}
}
