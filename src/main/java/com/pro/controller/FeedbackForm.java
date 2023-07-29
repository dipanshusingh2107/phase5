package com.pro.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FeedbackForm {
	@GetMapping(path="/")
	public ModelAndView getFeedbackForm() {
		ModelAndView view = new ModelAndView("feedbackForm");
		return view;
	}
	
	
	@PostMapping(path="/")
	public String postFeedbackForm(@RequestParam Map<String, String>req) {
		System.out.println(req);
		return "submitted";
	}

}
