package com.hitech.skeleton;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Steven
 */
@Controller
public class MainController {

	@GetMapping("/main")
	public String main() {
		return "main";
	}

}
