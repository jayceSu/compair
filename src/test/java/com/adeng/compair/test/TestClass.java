package com.adeng.compair.test;


import org.junit.Test;

import com.adeng.compair.util.JedisPoolClient;

import redis.clients.jedis.Jedis;

public class TestClass {

	@Test
	public void test() {
		Jedis jedis = JedisPoolClient.getJedis();
		jedis.set("ss", "1");
		System.out.println(jedis.get("ss"));
		JedisPoolClient.closeJedis(jedis);
		System.out.println(jedis.get("ss"));
		
	}
}
