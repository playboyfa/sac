package com.yang.sac.user.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yang.sac.commons.SpringUtils;
import com.yang.sac.tools.SecurityTools;
import com.yang.sac.user.constants.Constants;
import com.yang.sac.user.domain.User;
import com.yang.sac.user.service.UserService;
import com.yang.sac.user.service.impl.UserServiceImpl;

@Controller
public class LoginAction
{
	@RequestMapping(value="/index.do")
	public String loginPage()
	{
		return "index";
	}
	
	@RequestMapping(value="/loginout.do")
	public void loginoutPage(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String account = (String) request.getSession(true).getAttribute("account");
		
		request.getSession(true).invalidate();		
		request.getSession(true).setAttribute("account", account);		
		response.sendRedirect("index.do");
	}
	
	@RequestMapping(value="/main.do")
	public String mainPage()
	{
		return "main";
	}
	
	@RequestMapping(value="/checkLogin.do")
	public void checkLogin(HttpServletRequest request, HttpServletResponse response, @RequestParam("account") String account, @RequestParam("password") String password) throws IOException
	{
		UserService userService = SpringUtils.getBean(UserServiceImpl.class);;
		
		//检查用户名和密码
		User user = userService.getUserByUserName(account);
		
		if (null == user || !StringUtils.equals(user.getUserPassword(), SecurityTools.digestSHA256(password)))
		{
			request.getSession(true).setAttribute("msg", Constants.ERR_USER_PASSWORD);
			request.getSession(true).setAttribute("account", account);
			
			response.sendRedirect("index.do");
			return;
		}
		
		//刷新session
		request.getSession(true).invalidate();
		
		request.getSession(true).setAttribute("user", user);
		request.getSession(true).setAttribute("account", account);
		
		response.sendRedirect("main.do");
	}	
}
