package com.adeng.compair.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtils implements  ApplicationContextAware{

	private static ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		setContext(applicationContext);
	}
	
	public static ApplicationContext getContext() {
		return context;
	}

	public static void setContext(ApplicationContext context) {
		ApplicationContextUtils.context = context;
	}

	public static Object getBean(String beanName){
		return context.getBean(beanName);
		
	}
	
	
	public static <T> T getBean(String beanName , Class<T> clz){
		return context.getBean(beanName,clz);
		
	}
}
