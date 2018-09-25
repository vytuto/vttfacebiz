package com.vtt.training.vttface.biz.controller;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;
import com.restfb.types.User;
import com.vtt.training.vttface.biz.model.VttUser;

@RestController
@RequestMapping("/loginOk")
public class VttFaceController {
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> loginOk(@RequestParam("access_token") String accesstoken) {
		if (accesstoken == null) {
			return createResponse(new VttUser("name", "email", "birthday"));
		}
		return createResponse(getName(accesstoken));
	}

	private VttUser getName(String accesstoken) {
		FacebookClient facebookClient = new DefaultFacebookClient(accesstoken, Version.LATEST);
		User user = facebookClient.fetchObject("me", User.class);
		System.out.println("User name: " + user.getName());
		return new VttUser(user.getName(), user.getEmail(), user.getBirthday());

	}

	private ResponseEntity<String> createResponse(VttUser user) {
		return ResponseEntity.ok(new JSONObject(user).toString());
	}
}