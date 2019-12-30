package com.example.configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "configClient")
@RestController
public class ConfigClientController {

	@Value("${msg:Config Server is not working. Please check...}")
	private String msg;
	
	
	@GetMapping("/msg")
	public String getMsg() {
		return this.msg;
	}
}
