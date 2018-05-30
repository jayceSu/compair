package com.adeng.compair.service;

public class WebServiceImpl implements WebService{

	@Override
	public String sayHello(String name) {
		System.out.println("你好：" + name);
		return "你好：" + name;
	}

}
