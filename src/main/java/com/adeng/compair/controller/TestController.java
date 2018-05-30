package com.adeng.compair.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test.do")
	@ResponseBody
	public Object test(HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		return "水电费水电费";
	}
	
	
}
