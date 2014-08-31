
/**
 * 包名：com.southwind.frigga.json.model
 * 文件名：AdinfoList.java
 * 版本信息：
 * 日期：2014年8月30日-上午9:14:35
 * 
 */
 
package com.southwind.frigga.json.model;

import java.util.List;



 /**
 * 
 * 类名称：AdinfoList
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年8月30日 上午9:14:35
 * 修改备注：
 * @version 1.0.0
 * @param <T>
 * 
 */

public class InfoList<T> {

	private int draw;
	private int recordsTotal;
	private int recordsFiltered;
	private List<T> data;
	/**
	 * draw
	 *
	 * @return  the draw
	 * @since   1.0.0
	 */
	
	public int getDraw() {
		return draw;
	}
	/**
	 * @param draw the draw to set
	 */
	
	public void setDraw(int draw) {
		this.draw = draw;
	}
	/**
	 * recordsTotal
	 *
	 * @return  the recordsTotal
	 * @since   1.0.0
	 */
	
	public int getRecordsTotal() {
		return recordsTotal;
	}
	/**
	 * @param recordsTotal the recordsTotal to set
	 */
	
	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	/**
	 * recordsFiltered
	 *
	 * @return  the recordsFiltered
	 * @since   1.0.0
	 */
	
	public int getRecordsFiltered() {
		return recordsFiltered;
	}
	/**
	 * @param recordsFiltered the recordsFiltered to set
	 */
	
	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	/**
	 * data
	 *
	 * @return  the data
	 * @since   1.0.0
	 */
	
	public List<T> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	
	public void setData(List<T> data) {
		this.data = data;
	}

	
}
