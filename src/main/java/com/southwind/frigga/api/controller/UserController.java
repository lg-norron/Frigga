
/**
 * 包名：com.southwind.frigga.api.controller
 * 文件名：UserController.java
 * 版本信息：
 * 日期：2014年9月14日-下午3:11:11
 * 
 */
 
package com.southwind.frigga.api.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.southwind.frigga.biz.service.UserService;
import com.southwind.frigga.consts.SystemConst;
import com.southwind.frigga.json.model.BootstrapValidation;
import com.southwind.frigga.json.model.BootstrapValidationResponse;
import com.southwind.frigga.json.model.UserLogin;


 /**
 * 
 * 类名称：UserController
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年9月14日 下午3:11:11
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController {

	private String index = "redirect:/index.jsp";
	private String login = "redirect:/login.jsp";
	
	@Autowired
	private HttpServletRequest request;
	
	@Resource
	private UserService userService;
	
	
	@RequestMapping(value="/login")
	public String userLogin(UserLogin userLogin){
		int flag = userService.login(userLogin);
		if(flag==0){
			request.getSession().setAttribute(SystemConst.LONGIN_USER, userLogin);
		}
		return index;
	}
	
	@RequestMapping(value="/logout")
	public String userLogout(){
		HttpSession session = request.getSession();
		session.invalidate();
		return login;
	}
	
	@RequestMapping(value="/validator/pwd")
	public  @ResponseBody BootstrapValidationResponse validatorPwd(BootstrapValidation bootstrapValidation){
		
		UserLogin userLogin = (UserLogin) request.getSession().getAttribute(SystemConst.LONGIN_USER);
		
		String pwd = bootstrapValidation.getValue();

		BootstrapValidationResponse bvr = new BootstrapValidationResponse();
		bvr.setValue(pwd);
		bvr.setMessage("原密码与输入不匹配");
		if(userLogin!=null){
			String password = userLogin.getPassword();
			if(password.equals(pwd)){
				bvr.setValid(1);
				bvr.setMessage("原密码输入正确");
			}
		}
		
		return bvr;
	}
	
	@RequestMapping(value="/pwdupdate")
	public String pwdupdate(String newPwd){
		UserLogin userLogin = (UserLogin) request.getSession().getAttribute(SystemConst.LONGIN_USER);
		long userid = userLogin.getUserId();
		userService.updatePwd(userid,newPwd);
		userLogin.setPassword(newPwd);
		return "index";
	}
}
