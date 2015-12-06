package com.yang.sac.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;

public class DoActionFilter implements Filter
{
	private static final String WHITE_LIST_DO_ACTION = "whiteListDoAction";
	
	private List<String> whiteDoActionList;
	
	@Override
	public void destroy()
	{
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException
	{
		HttpServletRequest servletRequest = (HttpServletRequest)request;
		HttpServletResponse servletResponse = (HttpServletResponse)response;
		
		HttpSession session = servletRequest.getSession(true);		
		
		String path = servletRequest.getServletPath();
		
		if (!whiteDoActionList.contains(StringUtils.trim(path)))
		{
			if (null == session.getAttribute("user"))
			{
				servletResponse.sendRedirect("index.do");
				return;
			}
		}
		
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException
	{
		String paramter = config.getInitParameter(WHITE_LIST_DO_ACTION);
		
		if (StringUtils.isEmpty(paramter))
		{
			return;
		}
				
		whiteDoActionList = new ArrayList<String>();
		
		for (String o : paramter.split(","))
		{			
			whiteDoActionList.add(StringUtils.trim(o));
		}
	}
}
