package com.vtt.training.vttface.biz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> loginOk(@RequestParam("access_token") String accesstoken) {
		return ResponseEntity.ok("Hello");
	}
}