
/**
 * 包名：com.southwind.frigga.api
 * 文件名：AdSpreadController.java
 * 版本信息：
 * 日期：2014年8月25日-下午8:06:20
 * 
 */
 
package com.southwind.frigga.api.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.southwind.frigga.biz.service.AdInfoService;
import com.southwind.frigga.biz.service.AdSpreadService;
import com.southwind.frigga.biz.service.ChannelUserService;
import com.southwind.frigga.dal.mybatis.model.AdInfo;
import com.southwind.frigga.dal.mybatis.model.AdSpread;
import com.southwind.frigga.dal.mybatis.model.ChannelUser;
import com.southwind.frigga.json.model.InfoList;
import com.southwind.frigga.json.model.SearchParam;


 /**
 * 
 * 类名称：AdSpreadController
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年8月25日 下午8:06:20
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Controller
@RequestMapping("/adspread")
public class AdSpreadController {
	
	//private static final Logger logger = LoggerFactory.getLogger(AdSpreadController.class);
	
	private String pageList = "adspread/list";
	private String pageAdd = "adspread/add";
	private String pageUpdate = "adspread/update";
	
	@Autowired
	HttpServletRequest request;
	
	@Resource
	private AdSpreadService adSpreadService;
	@Resource
	private ChannelUserService channelUserService;
	@Resource
	private AdInfoService adInfoService;

	@RequestMapping(value="/list")
	public  @ResponseBody InfoList<AdSpread> AdSpreadList(SearchParam searchParam){

		InfoList<AdSpread> list = new InfoList<AdSpread>();
		List<AdSpread> AdSpreadList = adSpreadService.adSpreadList(searchParam);

		list.setData(AdSpreadList);
		return list;
	}
	
	@RequestMapping(value="/addUI")
	public ModelAndView adSpreadAddUI(AdSpread AdSpread){
		List<AdInfo> adInfoList = adInfoService.adInfoList(new SearchParam());
		List<ChannelUser> channelUserList = channelUserService.channelUserList(new SearchParam());
		ModelAndView mav = new ModelAndView();
		mav.setViewName(pageAdd);
		mav.addObject("adInfoList", adInfoList);
		mav.addObject("channelUserList", channelUserList);
		return mav;
	}
	
	@RequestMapping(value="/add")
	public String adSpreadAdd(AdSpread AdSpread){
		try {
			//创建一个通用的多部分解析器.  
			CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
			 //判断 request 是否有文件上传,即多部分请求... 
			if(multipartResolver.isMultipart(request))
			{
			     //判断 request 是否有文件上传,即多部分请求... 
			    MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)(request);
			     
			    Iterator<String> iter = multiRequest.getFileNames();
			    while(iter.hasNext()){
			        MultipartFile file = multiRequest.getFile(iter.next());
			        String fileName = "demoUpload" +file.getOriginalFilename();
			        String path ="F:/" +fileName;
			        File localFile = new File(path);
			        file.transferTo(localFile);
			         
			    }
			}
			adSpreadService.adSpreadAdd(AdSpread);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pageList;
	}
	
	@RequestMapping(value="/updateUI")
	public ModelAndView updateUI(long id){
		
		AdSpread adSpread = adSpreadService.getById(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(pageUpdate);
		mav.addObject(adSpread);
		
		return mav;
	}
	
	@RequestMapping(value="/update")
	public String update(AdSpread AdSpread){
		adSpreadService.adSpreadUpdate(AdSpread);
		return pageList;
	}
	
	
	@RequestMapping(value="/delete")
	public String update(long id){
		adSpreadService.adSpreadDelete(id);
		return pageList;
	}
}
