package com.yang.sac.style.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StyleTableAction
{
	@RequestMapping(value="/style/table/standard.do")
	public String formStandard()
	{
		return "/style/table/standard";
	}
}
