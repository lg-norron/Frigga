/**
 * 包名：com.southwind.frigga.api
 * 文件名：AdSpreadController.java
 * 版本信息：
 * 日期：2014年8月25日-下午8:06:20
 * 
 */

package com.southwind.frigga.api.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.southwind.common.DateUtil;
import com.southwind.common.PropertiesUtil;
import com.southwind.frigga.biz.service.AdInfoService;
import com.southwind.frigga.biz.service.AdSpreadService;
import com.southwind.frigga.biz.service.ChannelUserService;
import com.southwind.frigga.consts.AdSpreadConst;
import com.southwind.frigga.dal.mybatis.model.AdInfo;
import com.southwind.frigga.dal.mybatis.model.AdSpread;
import com.southwind.frigga.dal.mybatis.model.ChannelUser;
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
@RequestMapping("/adspread")
public class AdSpreadController {

	private static final Logger logger = LoggerFactory.getLogger(AdSpreadController.class);

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

	@RequestMapping(value = "/list")
	public @ResponseBody
	InfoList<AdSpread> adSpreadList(SearchParam searchParam) {

		InfoList<AdSpread> list = new InfoList<AdSpread>();
		List<AdSpread> AdSpreadList = adSpreadService.adSpreadList(searchParam);

		list.setData(AdSpreadList);
		return list;
	}

	@RequestMapping(value = "/addUI")
	public ModelAndView adSpreadAddUI(AdSpread AdSpread) {
		List<AdInfo> adInfoList = adInfoService.adInfoList(new SearchParam());
		List<ChannelUser> channelUserList = channelUserService
				.channelUserList(new SearchParam());
		ModelAndView mav = new ModelAndView();
		mav.setViewName(pageAdd);
		mav.addObject("adInfoList", adInfoList);
		mav.addObject("channelUserList", channelUserList);
		return mav;
	}

	@RequestMapping(value = "/add")
	public String adSpreadAdd(AdSpread adSpread,
			@RequestParam("uploadfile") MultipartFile file) {
		try {
			String uploadfileFolder = PropertiesUtil.getValue("uploadfile_folder");
			/** 构建文件保存的目录* */
			String uploadPathDir = uploadfileFolder + DateUtil.getCurrentDate("yyyy/MM/dd/HH/mm/ss/");
			/** 得到文件保存目录的真实路径* */
			String uploadRealPathDir = request.getSession().getServletContext().getRealPath(uploadPathDir);
			/** 根据真实路径创建目录* */
			File uploadSaveFile = new File(uploadRealPathDir);
			if (!uploadSaveFile.exists()){
				uploadSaveFile.mkdirs();
			}
			String filename =  file.getOriginalFilename();
			FileOutputStream fileOS = new FileOutputStream(uploadRealPathDir+"/"+filename);
			fileOS.write(file.getBytes());
			fileOS.close();
			logger.info("推广包保存路径为：{}",uploadRealPathDir+filename);
			
			adSpread.setDownloadUrl(uploadPathDir+filename);
			adSpread.setRebateSinceFlag(AdSpreadConst.REBATE_SINCE_FLAG_UNFINISHED);
			adSpreadService.adSpreadAdd(adSpread);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pageList;
	}

	@RequestMapping(value = "/updateUI")
	public ModelAndView updateUI(long id) {

		AdSpread adSpread = adSpreadService.getById(id);

		ModelAndView mav = new ModelAndView();
		mav.setViewName(pageUpdate);
		mav.addObject(adSpread);

		return mav;
	}

	@RequestMapping(value = "/update")
	public String update(AdSpread AdSpread) {
		adSpreadService.adSpreadUpdate(AdSpread);
		return pageList;
	}

	@RequestMapping(value = "/delete")
	public String update(long id) {
		adSpreadService.adSpreadDelete(id);
		return pageList;
	}
}
