
/**
 * 包名：com.southwind.frigga.json.model
 * 文件名：UserLogin.java
 * 版本信息：
 * 日期：2014年9月14日-下午3:16:49
 * 
 */
 
package com.southwind.frigga.json.model;


 /**
 * 
 * 类名称：UserLogin
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年9月14日 下午3:16:49
 * 修改备注：
 * @version 1.0.0
 * 
 */

public class UserLogin {

	private long userId;
	private String username;
	private String password;
	private String role;
	
	/**
	 * userId
	 *
	 * @return  the userId
	 * @since   1.0.0
	 */
	
	public long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/**
	 * username
	 *
	 * @return  the username
	 * @since   1.0.0
	 */
	
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * password
	 *
	 * @return  the password
	 * @since   1.0.0
	 */
	
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * role
	 *
	 * @return  the role
	 * @since   1.0.0
	 */
	
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
