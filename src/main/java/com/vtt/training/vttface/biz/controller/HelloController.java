package com.vtt.training.vttface.biz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Hello");
	}
}