package com.hitech.skeleton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

	@GetMapping("/")
	public String index() {
		return "redirect:main";
	}

	@GetMapping("/main")
	public String main() {
		return "main";
	}

}
