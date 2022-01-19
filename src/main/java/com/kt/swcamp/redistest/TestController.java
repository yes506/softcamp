package com.kt.swcamp.redistest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	Example example;
	
	@GetMapping("/")
	public void test() {
		example.addLink("redisKim", "DongHyeon");
	}

}
