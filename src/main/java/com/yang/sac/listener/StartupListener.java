package com.yang.sac.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yang.sac.commons.SpringUtils;
import com.yang.sac.user.service.UserService;
import com.yang.sac.user.service.impl.UserServiceImpl;

public class StartupListener implements ServletContextListener 
{	
	public void contextDestroyed(ServletContextEvent arg0)
	{
		SpringUtils.clear();
	}

	public void contextInitialized(ServletContextEvent arg0)
	{		
		ServletContext context = arg0.getServletContext();
		
		WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(context);
		
		SpringUtils.setContext(applicationContext);
		
		UserService userService = SpringUtils.getBean(UserServiceImpl.class);
		userService.initAllRoleMenus();
	}
	
}
