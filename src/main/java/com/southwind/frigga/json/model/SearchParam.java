
/**
 * 包名：com.southwind.frigga.json.model
 * 文件名：SearchParam.java
 * 版本信息：
 * 日期：2014年8月30日-下午4:03:44
 * 
 */
 
package com.southwind.frigga.json.model;


 /**
 * 
 * 类名称：SearchParam
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年8月30日 下午4:03:44
 * 修改备注：
 * @version 1.0.0
 * 
 */

public class SearchParam {

	private int start;
	private int length;
	/**
	 * start
	 *
	 * @return  the start
	 * @since   1.0.0
	 */
	
	public int getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	
	public void setStart(int start) {
		this.start = start;
	}
	/**
	 * length
	 *
	 * @return  the length
	 * @since   1.0.0
	 */
	
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	
	public void setLength(int length) {
		this.length = length;
	}
	
	
}
