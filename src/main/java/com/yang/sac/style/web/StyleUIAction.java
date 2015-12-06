package com.yang.sac.style.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StyleUIAction
{
	@RequestMapping(value="/style/ui/button.do")
	public String uiButton()
	{
		return "/style/ui/button";
	}
	
	@RequestMapping(value="/style/ui/dialog.do")
	public String uiDialog()
	{
		return "/style/ui/dialog";
	}
	
	@RequestMapping(value="/style/ui/alert.do")
	public String uiAlert()
	{
		return "/style/ui/alert";
	}
	
	@RequestMapping(value="/style/ui/calendar.do")
	public String uiCalendar()
	{
		return "/style/ui/calendar";
	}
	
	@RequestMapping(value="/style/ui/loader.do")
	public String uiLoader()
	{
		return "/style/ui/loader";
	}

	@RequestMapping(value="/style/ui/typography.do")
	public String uiTypography()
	{
		return "/style/ui/typography";
	}
	
	@RequestMapping(value="/style/ui/colors.do")
	public String uiColors()
	{
		return "/style/ui/colors";
	}
}
