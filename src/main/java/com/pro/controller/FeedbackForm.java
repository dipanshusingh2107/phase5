package com.pro.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FeedbackForm {
	@GetMapping(path = "/")
	public ModelAndView getFeedbackForm() {
		ModelAndView view = new ModelAndView("feedbackForm");
		return view;
	}

	@PostMapping(path = "/")
	public String postFeedbackForm(@RequestParam Map<String, String> req) {
		System.out.println(req);
		JSONObject data = new JSONObject(req);

		try {
			HttpClient client = HttpClient.newHttpClient();
			
			HttpRequest request = HttpRequest.newBuilder()
					  .POST(BodyPublishers.ofString(data.toString()))
				      .uri(URI.create("http://logstash:5110"))
				      .header("Content-Type", "application/json")
				      .build();
			
			client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
			// handle response here...
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			return "submitted";
		}

	}

}
