package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WhateverIWant {

	@RequestMapping("/hi/{name}")
	public @ResponseBody String hiThere(Map model, @PathVariable String name) {
		model.put("name", "asdada");
		return "hello";
	}
}
