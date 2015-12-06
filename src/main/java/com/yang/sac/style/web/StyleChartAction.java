package com.yang.sac.style.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StyleChartAction
{
	@RequestMapping(value="/style/chart/standard.do")
	public String formStandard()
	{
		return "/style/chart/standard";
	}
}
