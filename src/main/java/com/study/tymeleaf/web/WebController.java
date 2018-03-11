package com.study.tymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	/**
	 * sample
	 * @param model
	 */
	@GetMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("message", "Hello Thymeleaf!!");
        return "hello";
    }

	/**
	 *
	 * Thymeleaf 記法
	 * @param model
	 */
	@GetMapping("/study")
    public String study(Model model) {

		model.addAttribute("title", "Thymeleaf 記法");

		/*
		 *  変数式 ${...}
		 */
		model.addAttribute("subTitleA", "１．変数式 : ${...}");
		model.addAttribute("contentsA", "①インライン表示も可能 : [[${...}]]");
		model.addAttribute("user", new User());


        return "study";
    }

	public static class User {
		public String msg = "②オブジェクトからの取得";
		public String name = "sho";
		public int age = 24;
    }
}
