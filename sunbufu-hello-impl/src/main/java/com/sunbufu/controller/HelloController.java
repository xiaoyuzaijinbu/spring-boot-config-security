package com.sunbufu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbufu.server.HelloServer;

@RestController
public class HelloController implements HelloServer {

	@Override
	@RequestMapping("/hello")
	public String hello(String name) {
		return "hello," + name;
	}

}
