package com.adeng.compair.test;


import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.format.annotation.DateTimeFormat;

import com.adeng.compair.util.JedisPoolClient;

import redis.clients.jedis.Jedis;

public class TestClass {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
//		Iterator<String> i = list.iterator();
//		while(i.hasNext()) {
//			String item = i.next();
//			if("1".equals(item)) {
//				i.remove();
//			}
//		}
		Instant s = Instant.now();
//		DateTimeFormat dtf = 
		System.out.println(s);
//		for(String item : list) {
//			if("2".equals(item)) {
//				list.remove(item);
//			}
//		}
//		System.out.println(list.size());
	}
	
	@Test
	public void test() {
//		Jedis jedis = JedisPoolClient.getJedis();
//		jedis.set("ss", "1");
//		System.out.println(jedis.get("ss"));
//		JedisPoolClient.closeJedis(jedis);
//		System.out.println(jedis.get("ss"));
		String a = "a,b,c,,";
		String b = a.replace(",", "");
		String[] arr = a.split(",");
		System.out.println(arr.length);
		System.out.println(a);
		
	}
}
