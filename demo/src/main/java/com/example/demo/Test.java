package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangmaozhuang
 *
 * 2018年9月18日 下午9:11:28
 */
@RestController
@RequestMapping("/11")
public class Test {
	@RequestMapping("/test")
	public String fun() {
		//123
		return "success";
	}

}
