package com.wawa.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/c")
	public String testPage(){
		return "test/test";
	}
	
	@RequestMapping("/music")
	public String testMusic(){
		return "test/music";
	}
}
