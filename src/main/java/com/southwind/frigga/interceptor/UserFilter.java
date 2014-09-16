
/**
 * 包名：com.southwind.frigga.interceptor
 * 文件名：UserFilter.java
 * 版本信息：
 * 日期：2014年9月14日-下午4:47:37
 * 
 */
 
package com.southwind.frigga.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.southwind.frigga.consts.SystemConst;


 /**
 * 
 * 类名称：UserFilter
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年9月14日 下午4:47:37
 * 修改备注：
 * @version 1.0.0
 * 
 */

public class UserFilter implements Filter {
	private static final Logger logger = LoggerFactory.getLogger(UserFilter.class);
	/** 
	* 需要排除的页面 
	*/  
	private String excludedPage; 
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse)response;
		String requestPath = req.getServletPath();
		
		logger.debug("requestPath:{}",requestPath);
		if(!requestPath.equals(excludedPage)){
			HttpSession session = req.getSession();
			Object user = session.getAttribute(SystemConst.LONGIN_USER);
			if(user==null){
				res.sendRedirect(req.getContextPath()+"/login.jsp");
				return ;
			}
		}
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.excludedPage = filterConfig.getInitParameter("excludedPage");
	}

}
