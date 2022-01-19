package com.kt.swcamp.redistest;

import javax.annotation.Resource;

import org.springframework.data.redis.core.ListOperations;
import org.springframework.stereotype.Component;

@Component
public class Example {
	
	@Resource(name = "redisTemplate")
	private ListOperations<String, String> listOps;
	
	public void addLink(String userId, String userName) {
		listOps.leftPush(userId, userName);
	}

}
