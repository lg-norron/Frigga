
/**
 * 包名：com.southwind.frigga.json.model
 * 文件名：BootstrapValidationResponse.java
 * 版本信息：
 * 日期：2014年9月16日-下午10:30:55
 * 
 */
 
package com.southwind.frigga.json.model;


 /**
 * 
 * 类名称：BootstrapValidationResponse
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年9月16日 下午10:30:55
 * 修改备注：
 * @version 1.0.0
 * 
 */

public class BootstrapValidationResponse {
	
	private String value;
	private int valid;
	private String message;
	/**
	 * value
	 *
	 * @return  the value
	 * @since   1.0.0
	 */
	
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * valid
	 *
	 * @return  the valid
	 * @since   1.0.0
	 */
	
	public int getValid() {
		return valid;
	}
	/**
	 * @param valid the valid to set
	 */
	
	public void setValid(int valid) {
		this.valid = valid;
	}
	/**
	 * message
	 *
	 * @return  the message
	 * @since   1.0.0
	 */
	
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	
	public void setMessage(String message) {
		this.message = message;
	}

	
}
