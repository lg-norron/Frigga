
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

import com.southwind.frigga.consts.AdSpreadConst;
import com.southwind.frigga.dal.mybatis.mapper.AdSpreadDayMapper;
import com.southwind.frigga.dal.mybatis.mapper.AdSpreadMapper;
import com.southwind.frigga.dal.mybatis.model.AdSpread;
import com.southwind.frigga.dal.mybatis.model.AdSpreadDay;
import com.southwind.frigga.dal.mybatis.model.AdSpreadDayExample;
import com.southwind.frigga.dal.mybatis.model.AdSpreadDayExample.Criteria;
import com.southwind.frigga.json.model.AdSpreadDaySearchParam;


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
	@Resource
	private AdSpreadMapper adSpreadMapper;
	
	public void adSpreadDayAdd(AdSpreadDay adSpreadDay){
		adSpreadDayMapper.insertSelective(adSpreadDay);
	}
	
	public void adSpreadUpdate(AdSpreadDay adSpreadDay){
		adSpreadDayMapper.updateByPrimaryKeySelective(adSpreadDay);
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
	
	public List<AdSpreadDay> adSpreadList(AdSpreadDaySearchParam adSpreadDaySearchParam) {
		int start = adSpreadDaySearchParam.getStart();
		int length = adSpreadDaySearchParam.getLength();
		long spreadId = adSpreadDaySearchParam.getSpreadId();
		long qdid = adSpreadDaySearchParam.getQdId();
		AdSpreadDayExample example = new AdSpreadDayExample();
		Criteria criteria = example.createCriteria();
		if(spreadId!=0){
			criteria.andSpreadIdEqualTo(spreadId);
		}
		example.setOrderByClause("spread_date desc");
		List<AdSpreadDay> adSpreadDayList = adSpreadDayMapper.selectByExample(example,qdid,start,length);
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
		//获取标识
		Long id = adSpreadDay.getId();
		Long spreadId = adSpreadDay.getSpreadId();
		long activeRevenue = adSpreadDay.getActiveRevenue();
		AdSpread adSpread = adSpreadMapper.selectByPrimaryKey(spreadId);
		//当前收入量
		long activeRevenueSum = adSpreadDayMapper.selectSumBySpreadId(spreadId);
		int rebateProp= adSpread.getRebateProp();
		int rsf = adSpread.getRebateSinceFlag();
		if(rsf==0){
			//总量未超过起量值
			int rebateSince = adSpread.getRebateSince();
			
			if(id!=null&&id!=0){
				//更新原有记录
				AdSpreadDay adSpreadDayOld = adSpreadDayMapper.selectByPrimaryKey(id);
				long activeRevenueOld = adSpreadDayOld.getActiveRevenue();
				long offset = activeRevenueSum+activeRevenue - activeRevenueOld - rebateSince;
				if(offset<0){
					//未超过
					adSpreadDay.setActiveExpenses(activeRevenue);
				}else{
					//已超过
					long activeExpenses = activeRevenue-offset+offset*rebateProp/100;
					adSpreadDay.setActiveExpenses(activeExpenses);
					
					adSpread.setRebateSinceFlag(AdSpreadConst.REBATE_SINCE_FLAG_FINISHED);
					adSpreadMapper.updateByPrimaryKey(adSpread);
				}
				adSpreadDayMapper.updateByPrimaryKey(adSpreadDay);
			}else{
				//添加新增记录
				long offset = activeRevenueSum+activeRevenue - rebateSince;
				if(offset<0){
					//未超过
					adSpreadDay.setActiveExpenses(activeRevenue);
				}else{
					//已超过
					long activeExpenses = activeRevenue-offset+offset*rebateProp/100;
					adSpreadDay.setActiveExpenses(activeExpenses);
					
					adSpread.setRebateSinceFlag(AdSpreadConst.REBATE_SINCE_FLAG_FINISHED);
					adSpreadMapper.updateByPrimaryKey(adSpread);
				}
				adSpreadDayMapper.insert(adSpreadDay);
			}
		}else{
			//总量超过起量值
			if(id!=null&&id!=0){
				//更新原有记录
				long activeExpenses = activeRevenue*rebateProp/100;
				adSpreadDay.setActiveExpenses(activeExpenses);
				adSpreadDayMapper.updateByPrimaryKey(adSpreadDay);
			}else{
				//添加新增记录
				long activeExpenses = activeRevenue*rebateProp/100;
				adSpreadDay.setActiveExpenses(activeExpenses);
				adSpreadDayMapper.insert(adSpreadDay);
			}
		}
		
	}

	
	/**
	 * @param id
	 * @return 
	 * @exception 
	 * @since  1.0.0
	 */
	
	public AdSpreadDay getById(Long id) {
		// TODO Auto-generated method stub
		AdSpreadDay adSpreadDay = adSpreadDayMapper.selectByPrimaryKey(id);
		return adSpreadDay;
	}
}
