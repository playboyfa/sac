package com.yang.sac.style.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StyleFormAction
{
	@RequestMapping(value="/style/form/standard.do")
	public String formStandard()
	{
		return "/style/form/standard";
	}
}
