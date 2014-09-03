
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

import com.southwind.frigga.dal.mybatis.mapper.AdSpreadMapper;
import com.southwind.frigga.dal.mybatis.model.AdSpread;
import com.southwind.frigga.dal.mybatis.model.AdSpreadExample;
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
public class AdSpreadService {

	@Resource
	private AdSpreadMapper adSpreadMapper;
	
	public void adSpreadAdd(AdSpread adSpread){
		adSpreadMapper.insert(adSpread);
	}
	
	public void adSpreadUpdate(AdSpread adSpread){
		adSpreadMapper.updateByPrimaryKey(adSpread);
	}
	
	public void adSpreadDelete(Long id){
		adSpreadMapper.deleteByPrimaryKey(id);
	}
	
	public List<AdSpread> adSpreadList(SearchParam searchParam) {
		
		int start = searchParam.getStart();
		int length = searchParam.getLength();
		AdSpreadExample example = new AdSpreadExample();
		example.setOrderByClause("id");
		List<AdSpread> list = adSpreadMapper.selectByExample(example,start,length);

		return list;
	}
	
	public AdSpread getById(long id){
		AdSpread adSpread = adSpreadMapper.selectByPrimaryKey(id);
		return adSpread;
	}
}
