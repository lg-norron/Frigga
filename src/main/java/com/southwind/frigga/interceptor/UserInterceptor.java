
/**
 * 包名：com.southwind.frigga.interceptor
 * 文件名：UserInterceptor.java
 * 版本信息：
 * 日期：2014年9月14日-下午2:59:22
 * 
 */
 
package com.southwind.frigga.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.southwind.frigga.consts.SystemConst;


 /**
 * 
 * 类名称：UserInterceptor
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年9月14日 下午2:59:22
 * 修改备注：
 * @version 1.0.0
 * 
 */

public class UserInterceptor implements HandlerInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(UserInterceptor.class);
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception exception)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj, ModelAndView mav) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		HttpSession session = request.getSession();
		Object user = session.getAttribute(SystemConst.LONGIN_USER);
		logger.debug("user:{}",user);
		if(user!=null){
			return true;
		}
		response.sendRedirect("/login.jsp");
		return false;
	}

}
