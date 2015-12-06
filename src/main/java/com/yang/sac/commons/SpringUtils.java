package com.yang.sac.commons;

import org.springframework.context.ApplicationContext;

public class SpringUtils
{

	private static ApplicationContext context;

	
	public static ApplicationContext getContext()
	{
		return context;
	}

	public static void setContext(ApplicationContext context)
	{
		SpringUtils.context = context;
	}

	/**
	 * 方法用于获取业务对象。
	 *
	 * @param beanName
	 * @return
	 */
	public static Object getBusinessOjbect(String beanName)
	{
		return context.getBean(beanName);
	}
	
	public static <T> T getBean(Class<T> requiredType)
	{
		return context.getBean(requiredType);
	}
	
	/**
	 * 在应用程序关闭时，清空spring框架配置信息。
	 */
	public static void clear()
	{
		if (context != null)
		{
			context = null;
		}
	}
}