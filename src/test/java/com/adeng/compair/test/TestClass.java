package com.adeng.compair.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adeng.compair.service.InvokeService;
import com.adeng.compair.util.ApplicationContextUtils;

public class TestClass {

	@Test
	public void test() {
		new ClassPathXmlApplicationContext("spring-mvc.xml");  
        InvokeService service = (InvokeService) ApplicationContextUtils.getBean("invokeService");
        service.dealOrder(); 
	}
}
