package com.steelgt.gavin.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToHtmlController {
	/**
	 * 本地访问内容地址 ：http://localhost:8080/hello
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/picUpload")
	public String helloHtml(HashMap<String, Object> map, Model model) {
		model.addAttribute("say", "欢迎欢迎,热烈欢迎");
		map.put("hello", "欢迎进入HTML页面");
		return "picUpload";
	}
}
