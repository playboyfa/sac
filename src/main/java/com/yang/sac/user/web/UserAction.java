package com.yang.sac.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAction
{
	@RequestMapping(value="/userManager.do")
	public String userManager()
	{
		return "/frames/user/userManager";
	}	
}
