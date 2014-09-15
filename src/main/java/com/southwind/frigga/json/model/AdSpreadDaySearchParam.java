
/**
 * 包名：com.southwind.frigga.json.model
 * 文件名：AdSpreadDaySearchParam.java
 * 版本信息：
 * 日期：2014年9月11日-下午11:55:07
 * 
 */
 
package com.southwind.frigga.json.model;


 /**
 * 
 * 类名称：AdSpreadDaySearchParam
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年9月11日 下午11:55:07
 * 修改备注：
 * @version 1.0.0
 * 
 */

public class AdSpreadDaySearchParam extends SearchParam {

	private long spreadId;
	private long qdId;

	/**
	 * spreadId
	 *
	 * @return  the spreadId
	 * @since   1.0.0
	 */
	
	public long getSpreadId() {
		return spreadId;
	}

	/**
	 * @param spreadId the spreadId to set
	 */
	
	public void setSpreadId(long spreadId) {
		this.spreadId = spreadId;
	}

	/**
	 * qdId
	 *
	 * @return  the qdId
	 * @since   1.0.0
	 */
	
	public long getQdId() {
		return qdId;
	}

	/**
	 * @param qdId the qdId to set
	 */
	
	public void setQdId(long qdId) {
		this.qdId = qdId;
	}
	
	
}
