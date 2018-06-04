package com.adeng.compair.test;

import java.util.List;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestClass {

	@Test
	public void test() {
		Jedis jedis = new Jedis("192.168.15.128");
//		jedis.auth("123456");
//		jedis.lpush("城市1", "上海");
//		jedis.lpush("城市1", "南京");
		jedis.del("name");
		
	}
}
