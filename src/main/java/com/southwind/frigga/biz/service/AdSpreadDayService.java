
/**
 * 包名：com.southwind.frigga.biz.service
 * 文件名：AdSpreadService.java
 * 版本信息：
 * 日期：2014年8月25日-下午7:51:41
 * 
 */
 
package com.southwind.frigga.biz.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.southwind.frigga.dal.mybatis.mapper.AdSpreadDayMapper;
import com.southwind.frigga.dal.mybatis.model.AdSpreadDay;
import com.southwind.frigga.dal.mybatis.model.AdSpreadDayExample;
import com.southwind.frigga.json.model.SearchParam;


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

	
	/**
	 * @param searchParam
	 * @return 
	 * @exception 
	 * @since  1.0.0
	 */
	
	public List<AdSpreadDay> adSpreadList(SearchParam searchParam) {
		int start = searchParam.getStart();
		int length = searchParam.getLength();
		AdSpreadDayExample example = new AdSpreadDayExample();
		example.setOrderByClause("spread_date desc");
		List<AdSpreadDay> adSpreadDayList = adSpreadDayMapper.selectByExample(example,start,length);
		return adSpreadDayList;
	}

	
	/**
	 * @param spreadId
	 * @param spreadDate
	 * @return 
	 * @exception 
	 * @since  1.0.0
	 */
	
	public AdSpreadDay getDataForDay(long spreadId, String spreadDate) {
		AdSpreadDay adSpreadDay = adSpreadDayMapper.getDataForDay(spreadId,spreadDate);
		return adSpreadDay;
	}

	
	/**
	 * @param adSpreadDay 
	 * @exception 
	 * @since  1.0.0
	 */
	
	public void record(AdSpreadDay adSpreadDay) {
		Long id = adSpreadDay.getId();
		if(id!=null&&id!=0){
			//更新原有记录
		}else{
			//添加新增记录
		}
	}
}
