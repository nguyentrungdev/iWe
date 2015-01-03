package com.github.nguyentrungdev.iwe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/helloworld")
	public String helloWorld(Model model) {
		model.addAttribute("name", "WeMe");
		return "hello.jsp";
	}
}
