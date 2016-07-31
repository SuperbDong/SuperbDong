package com.superbdong.jelly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OperatorController {

	@RequestMapping(value = "/superbdong")
	public String getmodel() {
		System.out.println("aaaa");
		return "index";
	}

}
