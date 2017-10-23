package com.ldeng;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {
	@RequestMapping("/hello")
	public String home() {
		return "welcome spring boot!";
	}
}
