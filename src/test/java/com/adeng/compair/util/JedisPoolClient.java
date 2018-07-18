package com.adeng.compair.util;

import java.util.ResourceBundle;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolClient {

	private static JedisPool pool;
	
	static {
		if(pool == null) {
			ResourceBundle resource = ResourceBundle.getBundle("com.adeng.compair.util.jedis");
			
			JedisPoolConfig config = new JedisPoolConfig();
			//如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
			config.setMaxTotal(Integer.parseInt(resource.getString("jedis.maxTotal")));
			//控制一个pool最多有多少个状态为idle(空闲的)的jedis实例。
			config.setMaxIdle(Integer.parseInt(resource.getString("jedis.maxIdle")));
			config.setMinIdle(Integer.parseInt(resource.getString("jedis.minIdle")));
			//表示当borrow(引入)一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；单位毫秒
			//小于零:阻塞不确定的时间,  默认-1 
			config.setMaxWaitMillis(Long.valueOf(resource.getString("jedis.maxWaitMillis")));
			//在borrow(引入)一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
			config.setTestOnBorrow(Boolean.parseBoolean(resource.getString("jedis.testOnBorrow")));
			//return 一个jedis实例给pool时，是否检查连接可用性（ping()） 
			config.setTestOnReturn(Boolean.parseBoolean(resource.getString("jedis.testOnReturn")));
			
			pool = new JedisPool(config, resource.getString("jedis.ip"), Integer.parseInt(resource.getString("jedis.port")));
		}
	}
	
	/**
	 * 获取jedis实例
	 * @return
	 */
	public static Jedis getJedis() {
		return pool.getResource();
	}
	
	/**
	 * 关闭jedis,释放连接资源
	 * @param jedis
	 */
	public static void closeJedis(Jedis jedis) {
		if(jedis != null) {
			jedis.close();
		}
	}
}
