package com.kt.swcamp.redistest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class LettuceConfig {
	
	@Bean
	public LettuceConnectionFactory redisConnectionFactory() {
		
		return new LettuceConnectionFactory(new RedisStandaloneConfiguration());
		
	}
	
	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(redisConnectionFactory());
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		return redisTemplate;
		
	}

}
